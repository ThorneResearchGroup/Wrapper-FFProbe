package tech.tresearchgroup.ffprobe.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class MainOptions {
    @CommandLine.Option(names = "-L", description = "Show license")
    private boolean showLicense;

    @CommandLine.Option(names = {"-h", "-?", "-help", "--help"}, description = "Show help")
    private String showHelpFor;

    @CommandLine.Option(names = "-version", description = "Show version")
    private boolean showVersion;

    @CommandLine.Option(names = "-buildconf", description = "Show build configuration")
    private boolean showConfiguration;

    @CommandLine.Option(names = "-formats", description = "Show available formats")
    private boolean showFormats;

    @CommandLine.Option(names = "-muxers", description = "Show available muxers")
    private boolean showMuxers;

    @CommandLine.Option(names = "-demuxers", description = "Show available demuxers")
    private boolean showDemuxers;

    @CommandLine.Option(names = "-devices", description = "Show available devices")
    private boolean showDevices;

    @CommandLine.Option(names = "-codecs", description = "Show available codecs")
    private boolean showCodecs;

    @CommandLine.Option(names = "-decoders", description = "Show available decoders")
    private boolean showDecoders;

    @CommandLine.Option(names = "-encoders", description = "Show available encoders")
    private boolean showEncoders;

    @CommandLine.Option(names = "-bsfs", description = "Show available bit stream filters")
    private boolean showBitStreamFilters;

    @CommandLine.Option(names = "-protocols", description = "Show available protocols")
    private boolean showProtocols;

    @CommandLine.Option(names = "-filters", description = "Show available filters")
    private boolean showFilters;

    @CommandLine.Option(names = "-pix_fmts", description = "Show available pixel formats")
    private boolean showPixelFormats;

    @CommandLine.Option(names = "-layouts", description = "Show standard channel layouts")
    private boolean showLayouts;

    @CommandLine.Option(names = "-sample_fmts", description = "Show available audio sample formats")
    private boolean showSampleFormats;

    @CommandLine.Option(names = "-dispositions", description = "Show available stream dispositions")
    private boolean showDispositions;

    @CommandLine.Option(names = "-colors", description = "Show available color names")
    private boolean showColors;

    @CommandLine.Option(names = {"-loglevel", "-v"}, description = "Set logging level")
    private String logLevel;

    @CommandLine.Option(names = "-report", description = "Generate a report")
    private boolean generateReport;

    @CommandLine.Option(names = "-max_alloc", description = "Set maximum size of a single allocated block")
    private String maxAlloc;

    @CommandLine.Option(names = "-cpuflags", description = "Force specific cpu flags")
    private String cpuFlags;

    @CommandLine.Option(names = "-cpucount", description = "Force specific cpu count")
    private String cpuCount;

    @CommandLine.Option(names = "-hide_banner", description = "Do not show program banner")
    private String hideBanner;

    @CommandLine.Option(names = "-sources", description = "List sources of the input device")
    private String sources;

    @CommandLine.Option(names = "-sinks", description = "List sinks of the output device")
    private String sinks;

    @CommandLine.Option(names = "-f", description = "Force format")
    private String format;

    @CommandLine.Option(names = "-unit", description = "Show unit of the displayed values")
    private boolean showUnit;

    @CommandLine.Option(names = "-prefix", description = "Use SI prefixes for the displayed values")
    private boolean showPrefix;

    @CommandLine.Option(names = "-byte_binary_prefix", description = "Use binary prefixes for byte units")
    private boolean useByteBinaryPrefix;

    @CommandLine.Option(names = "-sexagesimal", description = "Use sexagesimal format HOURS:MM:SS.MICROSECONDS for time units")
    private boolean useSexagesimalFormat;

    @CommandLine.Option(names = "-pretty", description = "Prettify the format of displayed values, make it more human readable")
    private boolean prettyPrint;

    @CommandLine.Option(names = {"-print_format", "-of"}, description = "Set the output printing format (available formats are: default, compact, csv, flat, ini, json, xml)")
    private String printFormat;

    @CommandLine.Option(names = "-select_streams", description = "Select the specified streams")
    private String selectStreams;

    @CommandLine.Option(names = "-sections", description = "Print sections structure and section information, and exit")
    private boolean showSections;

    @CommandLine.Option(names = "-show_data", description = "Show packets data")
    private boolean showData;

    @CommandLine.Option(names = "-show_data_hash", description = "Show packets data hash")
    private boolean showDataHash;

    @CommandLine.Option(names = "-show_error", description = "Show probing error")
    private boolean showProbingError;

    @CommandLine.Option(names = "-show_format", description = "Show format / container info")
    private boolean showFormat;

    @CommandLine.Option(names = "-show_frames", description = "Show frames info")
    private boolean showFrames;

    @CommandLine.Option(names = "-show_format_entry", description = "Show a particular entry from the format / container info")
    private String showFormatEntry;

    @CommandLine.Option(names = "-show_entries", description = "Show a set of specified entries")
    private String showEntries;

    @CommandLine.Option(names = "-show_log", description = "Show log")
    private boolean showLog;

    @CommandLine.Option(names = "-show_packets", description = "Show packets info")
    private boolean showPackets;

    @CommandLine.Option(names = "-show_programs", description = "Show programs info")
    private boolean showPrograms;

    @CommandLine.Option(names = "-show_streams", description = "Show streams info")
    private boolean showStreams;

    @CommandLine.Option(names = "-show_chapters", description = "Show chapters info")
    private boolean showChapters;

    @CommandLine.Option(names = "-count_frames", description = "Count the number of frames per stream")
    private boolean countFrames;

    @CommandLine.Option(names = "-count_packets", description = "Count the number of packets per stream")
    private boolean countPackets;

    @CommandLine.Option(names = "-show_program_version", description = "Show ffprobe version")
    private boolean showProgramVersion;

    @CommandLine.Option(names = "-show_library_versions", description = "Show library versions")
    private boolean showLibraryVersions;

    @CommandLine.Option(names = "-show_versions", description = "Show program and library versions")
    private boolean showVersions;

    @CommandLine.Option(names = "-show_pixel_formats", description = "Show pixel format descriptions")
    private boolean showPixelFormatDescriptions;

    @CommandLine.Option(names = "-show_optional_fields", description = "Show optional fields")
    private boolean showOptionalFields;

    @CommandLine.Option(names = {"-show_private_data", "-private"}, description = "Show private data")
    private boolean showPrivateData;

    @CommandLine.Option(names = "-bitexact", description = "Force bitexact output")
    private boolean bitExact;

    @CommandLine.Option(names = "-read_intervals", description = "Set read intervals")
    private String readIntervals;

    @CommandLine.Option(names = "-default", description = "Generic catch all option")
    private boolean defaultCatchAll;

    @CommandLine.Option(names = "-i", description = "Read specified file")
    private String inputFile;

    @CommandLine.Option(names = "-print_filename", description = "Override the printed input filename")
    private String printFilename;

    @CommandLine.Option(names = "-find_stream_info", description = "Read and decode the streams to fill missing information with heuristics")
    private boolean findStreamInfo;
}
