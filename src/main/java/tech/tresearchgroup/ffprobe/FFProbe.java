package tech.tresearchgroup.ffprobe;

import picocli.CommandLine;
import tech.tresearchgroup.ffprobe.controller.AVController;
import tech.tresearchgroup.ffprobe.controller.MainController;
import tech.tresearchgroup.ffprobe.model.AVOptions;
import tech.tresearchgroup.ffprobe.model.MainOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "ffprobe",
        version = "1.0",
        mixinStandardHelpOptions = true,
        description = "TRG FFProbe wrapper")
public class FFProbe implements Callable<Integer> {
    @CommandLine.Parameters(index = "0")
    private String file;

    @CommandLine.ArgGroup
    private MainOptions mainOptions;

    @CommandLine.ArgGroup
    private AVOptions avOptions;

    @Override
    public Integer call() {
        List<String> options = new ArrayList<>();
        options.add("ffprobe");
        options.addAll(MainController.getOptions(mainOptions));
        options.addAll(AVController.getOptions(avOptions));
        options.add(file);
        return execute(options);
    }

    public static int execute(List<String> options) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(options);
        System.out.println(options);
        try {
            Process process = processBuilder.start();
            String line;
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
             */
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }
            errorReader.close();
            return process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
