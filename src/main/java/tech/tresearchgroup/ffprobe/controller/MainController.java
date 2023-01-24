package tech.tresearchgroup.ffprobe.controller;

import tech.tresearchgroup.ffprobe.model.MainOptions;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    public static List<String> getOptions(MainOptions mainOptions) {
        List<String> optionsList = new ArrayList<>();
        if(mainOptions.isShowLicense()) {
            optionsList.add("-L");
        }
        if(mainOptions.getShowHelpFor() != null) {
            optionsList.add("-h");
            optionsList.add(mainOptions.getShowHelpFor());
        }
        if(mainOptions.isShowVersion()) {
            optionsList.add("-version");
        }
        if(mainOptions.isShowConfiguration()) {
            optionsList.add("-buildconf");
        }
        if(mainOptions.isShowFormats()) {
            optionsList.add("-formats");
        }
        if(mainOptions.isShowMuxers()) {
            optionsList.add("-muxers");
        }
        if(mainOptions.isShowDemuxers()) {
            optionsList.add("-demuxers");
        }
        if(mainOptions.isShowDevices()) {
            optionsList.add("-devices");
        }
        if(mainOptions.isShowCodecs()) {
            optionsList.add("-codecs");
        }
        if(mainOptions.isShowDecoders()) {
            optionsList.add("-decoders");
        }
        if(mainOptions.isShowEncoders()) {
            optionsList.add("-encoders");
        }
        if(mainOptions.isShowBitStreamFilters()) {
            optionsList.add("-bsfs");
        }
        if(mainOptions.isShowProtocols()) {
            optionsList.add("-protocols");
        }
        if(mainOptions.isShowFilters()) {
            optionsList.add("-filters");
        }
        if(mainOptions.isShowPixelFormats()) {
            optionsList.add("-pix_fmts");
        }
        if(mainOptions.isShowLayouts()) {
            optionsList.add("-layouts");
        }
        if(mainOptions.isShowSampleFormats()) {
            optionsList.add("-sample_fmts");
        }
        if(mainOptions.isShowDispositions()) {
            optionsList.add("-dispositions");
        }
        if(mainOptions.isShowColors()) {
            optionsList.add("-colors");
        }
        if(mainOptions.getLogLevel() != null) {
            optionsList.add("-loglevel");
            optionsList.add(mainOptions.getLogLevel());
        }
        if(mainOptions.isGenerateReport()) {
            optionsList.add("-report");
        }
        if(mainOptions.getMaxAlloc() != null) {
            optionsList.add("-max_alloc");
            optionsList.add(mainOptions.getMaxAlloc());
        }
        if(mainOptions.getCpuFlags() != null) {
            optionsList.add("-cpuflags");
            optionsList.add(mainOptions.getCpuFlags());
        }
        if(mainOptions.getCpuCount() != null) {
            optionsList.add("-cpucount");
            optionsList.add(mainOptions.getCpuCount());
        }
        if(mainOptions.getHideBanner() != null) {
            optionsList.add("-hide_banner");
            optionsList.add(mainOptions.getHideBanner());
        }
        if(mainOptions.getSources() != null) {
            optionsList.add("-sources");
            optionsList.add(mainOptions.getSources());
        }
        if(mainOptions.getSinks() != null) {
            optionsList.add("-sinks");
            optionsList.add(mainOptions.getSinks());
        }
        if(mainOptions.getFormat() != null) {
            optionsList.add("-f");
            optionsList.add(mainOptions.getFormat());
        }
        if(mainOptions.isShowUnit()) {
            optionsList.add("-unit");
        }
        if(mainOptions.isShowPrefix()) {
            optionsList.add("-prefix");
        }
        if(mainOptions.isUseByteBinaryPrefix()) {
            optionsList.add("-byte_binary_prefix");
        }
        if(mainOptions.isUseSexagesimalFormat()) {
            optionsList.add("-sexagesimal");
        }
        if(mainOptions.isPrettyPrint()) {
            optionsList.add("-pretty");
        }
        if(mainOptions.getPrintFormat() != null) {
            optionsList.add("-print_format");
            optionsList.add(mainOptions.getPrintFormat());
        }
        if(mainOptions.getSelectStreams() != null) {
            optionsList.add("-select_streams");
            optionsList.add(mainOptions.getSelectStreams());
        }
        if(mainOptions.isShowSections()) {
            optionsList.add("-sections");
        }
        if(mainOptions.isShowData()) {
            optionsList.add("-show_data");
        }
        if(mainOptions.isShowDataHash()) {
            optionsList.add("-show_data_hash");
        }
        if(mainOptions.isShowProbingError()) {
            optionsList.add("-show_error");
        }
        if(mainOptions.isShowFormat()) {
            optionsList.add("-show_format");
        }
        if(mainOptions.isShowFrames()) {
            optionsList.add("-show_frames");
        }
        if(mainOptions.getShowFormatEntry() != null) {
            optionsList.add("-show_format_entry");
            optionsList.add(mainOptions.getShowFormatEntry());
        }
        if(mainOptions.getShowEntries() != null) {
            optionsList.add("-show_format_entry");
            optionsList.add(mainOptions.getShowFormatEntry());
        }
        if(mainOptions.getShowEntries() != null) {
            optionsList.add("-show_entries");
            optionsList.add(mainOptions.getShowEntries());
        }
        if(mainOptions.isShowLog()) {
            optionsList.add("-show_log");
        }
        if(mainOptions.isShowPackets()) {
            optionsList.add("-show_packets");
        }
        if(mainOptions.isShowPrograms()) {
            optionsList.add("-show_programs");
        }
        if(mainOptions.isShowStreams()) {
            optionsList.add("-show_streams");
        }
        if(mainOptions.isShowLog()) {
            optionsList.add("-show_entires");
        }
        if(mainOptions.isShowPackets()) {
            optionsList.add("-show_packets");
        }
        if(mainOptions.isShowPrograms()) {
            optionsList.add("-show_programs");
        }
        if(mainOptions.isShowStreams()) {
            optionsList.add("-show_streams");
        }
        if(mainOptions.isShowChapters()) {
            optionsList.add("-show_chapters");
        }
        if(mainOptions.isCountFrames()) {
            optionsList.add("-count_frames");
        }
        if(mainOptions.isCountPackets()) {
            optionsList.add("-count_packets");
        }
        if(mainOptions.isShowProgramVersion()) {
            optionsList.add("-show_program_version");
        }
        if(mainOptions.isShowLibraryVersions()) {
            optionsList.add("-show_library_versions");
        }
        if(mainOptions.isShowVersions()) {
            optionsList.add("-show_verisons");
        }
        if(mainOptions.isShowPixelFormats()) {
            optionsList.add("-show_pixel_formats");
        }
        if(mainOptions.isShowOptionalFields()) {
            optionsList.add("-show_optional_fields");
        }
        if(mainOptions.isShowPrivateData()) {
            optionsList.add("-show_private_data");
        }
        if(mainOptions.isBitExact()) {
            optionsList.add("-bitexact");
        }
        if(mainOptions.getReadIntervals() != null) {
            optionsList.add("-read_intervals");
            optionsList.add(mainOptions.getReadIntervals());
        }
        if(mainOptions.isDefaultCatchAll()) {
            optionsList.add("-default");
        }
        if(mainOptions.getInputFile() != null) {
            optionsList.add("-i");
            optionsList.add(mainOptions.getInputFile());
        }
        if(mainOptions.getPrintFilename() != null) {
            optionsList.add("-print_filename");
            optionsList.add(mainOptions.getPrintFilename());
        }
        if(mainOptions.isFindStreamInfo()) {
            optionsList.add("-find_stream_info");
        }
        return optionsList;
    }
}
