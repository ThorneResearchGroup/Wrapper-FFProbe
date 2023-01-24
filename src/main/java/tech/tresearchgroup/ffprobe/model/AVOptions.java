package tech.tresearchgroup.ffprobe.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class AVOptions {
    @CommandLine.Option(names = "-avioflags", description = "Default 0")
    private String avioFlags;

    @CommandLine.Option(names = "-probesize", description = "Set probing size (from 32 to I64_MAX) (default 5000000)")
    private String probeSize;

    @CommandLine.Option(names = "-formatprobesize", description = "Number of bytes to probe file format (from 0 to 2.14748e+09) (default 1048576)")
    private String formatProbeSize;

    @CommandLine.Option(names = "-fflags", description = "Default autobsf")
    private String fFlags;

    @CommandLine.Option(names = "-seek2any", description = "Allow seeking to non-keyframes on demuxer level when supported (default false)")
    private boolean seekToAny;

    @CommandLine.Option(names = "-analyzeduration", description = "Specify how many microseconds are analyzed to probe the input (from 0 to I64_MAX) (default 0)")
    private String analyzeDuration;

    @CommandLine.Option(names = "-cryptokey", description = "Decryption key")
    private String cryptoKey;

    @CommandLine.Option(names = "-indexmem", description = "Max memory used for timestamp index (per stream) (from 0 to INT_MAX) (default 1048576)")
    private String indexMem;

    @CommandLine.Option(names = "-rtbufsize", description = "Max memory used for buffering real-time frames (from 0 to INT_MAX) (default 3041280)")
    private String rtBufSize;

    @CommandLine.Option(names = "-fdebug", description = "Print specific debug info (default 0)")
    private String fDebug;

    @CommandLine.Option(names = "-max_delay", description = "Maximum muxing or demuxing delay in microseconds (from -1 to INT_MAX) (default -1)")
    private String maxDelay;

    @CommandLine.Option(names = "-fpsprobesize", description = "Number of frames used to probe fps (from -1 to 2.14748e+09) (default -1)")
    private String fpsProbeSize;

    @CommandLine.Option(names = "-f_err_detect", description = "Set error detection flags (deprecated; use err_detect, save via avconv) (default crccheck)")
    private String fErrDetect;

    @CommandLine.Option(names = "-err_detect", description = "Set error detection flags (default crccheck)")
    private String errDetect;

    @CommandLine.Option(names = "-use_wallclock_as_timestamps", description = "Use wallclock as timestamps (default false)")
    private boolean useWallClockASTimeStamps;

    @CommandLine.Option(names = "-skip_initial_bytes", description = "Set number of bytes to skip before reading header and frames (from 0 to I64_MAX) (default 0)")
    private String skipInitialBytes;

    @CommandLine.Option(names = "-correct_ts_overflow", description = "Correct single timestamp overflows (default true)")
    private boolean correctTsOverflow;

    @CommandLine.Option(names = "-f_strict", description = "How strictly to follow the standards (deprecated; use strict, save via avconv) (from INT_MIN to INT_MAX) (default normal)")
    private String fStrict;

    @CommandLine.Option(names = "-strict", description = "How strictly to follow the standards (from INT_MIN to INT_MAX) (default normal)")
    private String strict;

    @CommandLine.Option(names = "-max_ts_probe", description = "Maximum number of packets to read while waiting for the first timestamp (from 0 to INT_MAX) (default 50)")
    private String maxTsProbe;

    @CommandLine.Option(names = "-dump_separator", description = "Set information dump field separator (default \", \")")
    private String dumpSeparator;

    @CommandLine.Option(names = "-codec_whitelist", description = "List of decoders that are allowed to be used")
    private String codecWhitelist;

    @CommandLine.Option(names = "-format_whitelist", description = "List of demuxers that are allowed to be used")
    private String formatWhitelist;

    @CommandLine.Option(names = "-protocol_whitelist", description = "List of protocols that are allowed to be used")
    private String protocolWhitelist;

    @CommandLine.Option(names = "-protocol_blacklist", description = "List of protocols that are not allowed to be used")
    private String protocolBlacklist;

    @CommandLine.Option(names = "-max_streams", description = "Maximum number of streams (from 0 to INT_MAX) (default 1000)")
    private String maxStreams;

    @CommandLine.Option(names = "-skip_estimate_duration_from_pts", description = "Skip duration calculation in estimate_timings_from_pts (default false)")
    private boolean skipEstimateDurationFromPts;

    @CommandLine.Option(names = "-max_probe_packets", description = "Maximum number of packets to probe a codec (from 0 to INT_MAX) (default 2500)")
    private String maxProbePackets;

    @CommandLine.Option(names = "-rw_timeout", description = "Timeout for IO operations (in microseconds) (from 0 to I64_MAX) (default 0)")
    private String rwTimeout;

    @CommandLine.Option(names = "-playlist", description = "(from -1 to 99999) (default -1)")
    private String playlist;

    @CommandLine.Option(names = "-angle", description = "(from 0 to 254) (default 0)")
    private String angle;

    @CommandLine.Option(names = "-chapter", description = "(from 1 to 65534) (default 1)")
    private String chapter;

    @CommandLine.Option(names = "-read_ahead_limit", description = "Amount in bytes that may be read ahead when seeking isn't supported, -1 for unlimited (from -1 to INT_MAX) (default 65536)")
    private String readAheadLimit;

    @CommandLine.Option(names = "-key", description = "AES encryption/decryption key")
    private String key;

    @CommandLine.Option(names = "-iv", description = "AES encryption/decryption initialization vector")
    private String iv;

    @CommandLine.Option(names = "-decryption_key", description = "AES decryption key")
    private String decryptionKey;

    @CommandLine.Option(names = "-decryption_iv", description = "AES decryption initialization vector")
    private String decryptionIv;

    @CommandLine.Option(names = "-ffrtmpcrypt_tunneling", description = "Use a HTTP tunneling connection (RTMPTE). (from 0 to 1) (default 0")
    private String ffrtmpcryptTunneling;

    @CommandLine.Option(names = "-ffrtmphttp_tls", description = "Use a HTTPS tunneling connection (RTMPTS). (default false)")
    private String ffrtmphttpTls;

    @CommandLine.Option(names = "-follow", description = "Follow a file as it is being written (from 0 to 1) (default 0)")
    private String follow;

    @CommandLine.Option(names = "-seekable", description = "Sets if the file is seekable (from -1 to 0) (default -1)")
    private String seekable;

    @CommandLine.Option(names = "-timeout", description = "Set timeout of socket I/O operations (from -1 to INT_MAX) (default -1)")
    private String timeout;

    @CommandLine.Option(names = "-ftp-anonymous-password", description = "Password for anonymous login. E-mail address should be used.")
    private String ftpAnonymousPassword;

    @CommandLine.Option(names = "-ftp-user", description = "User for FTP login. Overridden by whatever is in the URL")
    private String ftpUser;

    @CommandLine.Option(names = "-ftp-password", description = "Password for FTP login. Overridden by whatever is in the URL")
    private String ftpPassword;

    @CommandLine.Option(names = "-http_proxy", description = "Set HTTP proxy to tunnel through")
    private String httpProxy;

    @CommandLine.Option(names = "-headers", description = "Set custom HTTP headers, can override built in default headers")
    private String headers;

    @CommandLine.Option(names = "-content_type", description = "Set a specific content type for the POST messages")
    private String contentType;

    @CommandLine.Option(names = "-user_agent", description = "Override User-Agent header (default \"Lavf/59.17.103\")")
    private String userAgent;

    @CommandLine.Option(names = "-referer", description = "Override referer header")
    private String referer;

    @CommandLine.Option(names = "-multiple_requests", description = "Use persistent connections (default false)")
    private boolean multipleRequests;

    @CommandLine.Option(names = "-post_data", description = "Set custom HTTP post data")
    private String postData;

    @CommandLine.Option(names = "-cookies", description = "Set cookies to be sent in applicable future requests, use newline delimited Set-Cookie HTTP field value syntax")
    private String cookies;

    @CommandLine.Option(names = "-icy", description = "Request ICY metadata (default true)")
    private boolean icy;

    @CommandLine.Option(names = "-auth_type", description = "HTTP authentication type (from 0 to 1) (default none)")
    private String authType;

    @CommandLine.Option(names = "-location", description = "The actual location of the data received")
    private String location;

    @CommandLine.Option(names = "-offset", description = "Initial byte offset (from 0 to I64_MAX) (default 0)")
    private String offset;

    @CommandLine.Option(names = "-end_offset", description = "Try to limit the request to bytes preceding this offset (from 0 to I64_MAX) (default 0)")
    private String endOffset;

    @CommandLine.Option(names = "-method", description = "Override the HTTP method or set the expected HTTP method from a client")
    private String method;

    @CommandLine.Option(names = "-reconnect", description = "Auto reconnect after disconnect before EOF (default false)")
    private boolean reconnect;

    @CommandLine.Option(names = "-reconnect_at_eof", description = "Auto reconnect at EOF (default false)")
    private boolean reconnectAtEof;

    @CommandLine.Option(names = "-reconnect_on_network_error", description = "Auto reconnect in case of tcp/tls error during connect (default false)")
    private boolean reconnectOnNetworkError;

    @CommandLine.Option(names = "-reconnect_on_http_error", description = "List of http status codes to reconnect on")
    private String reconnectOnHttpError;

    @CommandLine.Option(names = "-reconnect_streamed", description = "Auto reconnect streamed / non seekable streams (default false)")
    private boolean reconnectStreamed;

    @CommandLine.Option(names = "-reconnect_delay_max", description = "Max reconnect delay in seconds after which to give up (from 0 to 4294) (default 120)")
    private String reconnectDelayMax;

    @CommandLine.Option(names = "-listen", description = "Listen on HTTP (from 0 to 2) (default 0)")
    private String listen;

    @CommandLine.Option(names = "-short_seek_size", description = "Threshold to favor readahead over seek. (from 0 to INT_MAX) (default 0)")
    private String shortSeekSize;

    @CommandLine.Option(names = "-rtmp_app", description = "Name of application to connect to on the RTMP server")
    private String rtmpApp;

    @CommandLine.Option(names = "-rtmp_buffer", description = "Set buffer time in milliseconds. The default is 3000. (from 0 to INT_MAX) (default 3000)")
    private String rtmpBuffer;

    @CommandLine.Option(names = "-rtmp_conn", description = "Append arbitrary AMF data to the Connect message")
    private String rtmpConn;

    @CommandLine.Option(names = "-rtmp_flashver", description = "Version of the Flash plugin used to run the SWF player")
    private String rtmpFlashver;

    @CommandLine.Option(names = "-rtmp_live", description = "Specify that the media is a live stream. (from INT_MIN to INT_MAX) (default any)")
    private String rtmpLive;

    @CommandLine.Option(names = "-rtmp_pageurl", description = "URL of the web page in which the media was embedded. By default no value will be sent")
    private String rtmpPageurl;

    @CommandLine.Option(names = "-rtmp_playpath", description = "Stream identifier to play or to publish")
    private String rtmpPlaypath;

    @CommandLine.Option(names = "-rtmp_subscribe", description = "Name of live stream to subscribe to. Defaults to rtmp_playpath")
    private String rtmpSubscribe;

    @CommandLine.Option(names = "-rtmp_swfhash", description = "SHA256 hash of the decompressed SWF file (32 bytes)")
    private String rtmpSwfhash;

    @CommandLine.Option(names = "-rtmp_swfsize", description = "Size of the decompressed SWF file, required for SWFVerification")
    private String rtmpSwfsize;

    @CommandLine.Option(names = "-rtmp_swfurl", description = "URL of the SWF player. By default no value will be sent")
    private String rtmpSwfurl;

    @CommandLine.Option(names = "-rtmp_swfverify", description = "URL to player swf file, compute hash/size automatically")
    private String rtmpSwfverify;

    @CommandLine.Option(names = "-rtmp_tcurl", description = "URL of the target stream. Defaults to proto://host[:port]/app")
    private String rtmpTcurl;

    @CommandLine.Option(names = "-rtmp_listen", description = "Listen for incoming rtmp connections (from INT_MIN to INT_MAX) (default 0)")
    private String rtmpListen;

    @CommandLine.Option(names = "-tcp_nodelay", description = "Use TCP_NODELAY to disable Nagle's algorithm (from 0 to 1) (default 0)")
    private String tcpNodelay;

    @CommandLine.Option(names = "-ttl", description = "Time to live (multicast only) (from -1 to 255) (default -1)")
    private String ttl;

    @CommandLine.Option(names = "-buffer_size", description = "Send/Receive buffer size (in bytes) (from -1 to INT_MAX) (default -1)")
    private String bufferSize;

    @CommandLine.Option(names = "-rtcp_port", description = "Custom rtcp port (from -1 to INT_MAX) (default -1)")
    private String rtcpPort;

    @CommandLine.Option(names = "-local_rtpport", description = "Local rtp port (from -1 to INT_MAX) (default -1)")
    private String localRtpport;

    @CommandLine.Option(names = "-local_rtcpport", description = "Local rtcp port (from -1 to INT_MAX) (default -1)")
    private String localRtcpport;

    @CommandLine.Option(names = "-connect", description = "Connect socket (default false)")
    private boolean connect;

    @CommandLine.Option(names = "-write_to_source", description = "Send packets to the source address of the latest received packet (default false)")
    private boolean writeToSource;

    @CommandLine.Option(names = "-pkt_size", description = "Maximum packet size (from -1 to INT_MAX) (default -1)")
    private String pktSize;

    @CommandLine.Option(names = "-dscp", description = "DSCP class (from -1 to INT_MAX) (default -1)")
    private String dscp;

    @CommandLine.Option(names = "-sources", description = "Source list")
    private String sources;

    @CommandLine.Option(names = "-block", description = "Block list")
    private String block;

    @CommandLine.Option(names = "-localaddr", description = "Local address")
    private String localaddr;

    @CommandLine.Option(names = "-srtp_in_suite")
    private String srtpInSuite;

    @CommandLine.Option(names = "-srtp_in_params")
    private String srtpInParams;

    @CommandLine.Option(names = "-start", description = "Start offset (from 0 to I64_MAX) (default 0)")
    private String start;

    @CommandLine.Option(names = "-end", description = "End offset (from 0 to I64_MAX) (default 0)")
    private String end;

    @CommandLine.Option(names = "-listen_timeout", description = "Connection awaiting timeout (in milliseconds) (from -1 to INT_MAX) (default -1)")
    private String listenTimeout;

    @CommandLine.Option(names = "-send_buffer_size", description = "Socket send buffer size (in bytes) (from -1 to INT_MAX) (default -1)")
    private String sendBufferSize;

    @CommandLine.Option(names = "-recv_buffer_size", description = "Socket receive buffer size (in bytes) (from -1 to INT_MAX) (default -1)")
    private String recvBufferSize;

    @CommandLine.Option(names = {"-ca_file", "-cafile"}, description = "Certificate Authority database file")
    private String caFile;

    @CommandLine.Option(names = "-tls_verify", description = "Verify the peer certificate (from 0 to 1) (default 0)")
    private String tlsVerify;

    @CommandLine.Option(names = "-cert_file", description = "Certificate file")
    private String certFile;

    @CommandLine.Option(names = "-key_file", description = "Private key file")
    private String keyFile;

    @CommandLine.Option(names = "-verifyhost", description = "Verify against a specific hostname")
    private String verifyhost;

    @CommandLine.Option(names = {"-localport", "-local_port"}, description = "Local port (from -1 to INT_MAX) (default -1)")
    private String localport;

    @CommandLine.Option(names = "-udplite_coverage", description = "Choose UDPLite head size which should be validated by checksum (from 0 to INT_MAX) (default 0)")
    private String udpliteCoverage;

    @CommandLine.Option(names = {"-reuse", "-reuse_socket"}, description = "Explicitly allow reusing UDP sockets (default auto)")
    private boolean reuse;

    @CommandLine.Option(names = "-fifo_size", description = "Set the UDP receiving circular buffer size, expressed as a number of packets with size of 188 bytes (from 0 to INT_MAX) (default 28672)")
    private String fifoSize;

    @CommandLine.Option(names = "-overrun_nonfatal", description = "Show license")
    private boolean overrunNonfatal;

    @CommandLine.Option(names = "-rist_profile", description = "Set profile (from 0 to 2) (default main)")
    private String ristProfile;

    @CommandLine.Option(names = "-log_level", description = "Set loglevel (from -1 to INT_MAX) (default 6)")
    private String logLevel;

    @CommandLine.Option(names = "-secret", description = "Set encryption secret")
    private String secret;

    @CommandLine.Option(names = "-encryption", description = "Set encryption type (from 0 to INT_MAX) (default 0)")
    private String encryption;

    @CommandLine.Option(names = "-payload_size", description = "Maximum SRT packet size (from -1 to 1456) (default -1)")
    private String payloadSize;

    @CommandLine.Option(names = "-maxbw", description = "Maximum bandwidth (bytes per second) that the connection can use (from -1 to I64_MAX) (default -1)")
    private String maxbw;

    @CommandLine.Option(names = "-pbkeylen", description = "Crypto key len in bytes {16,24,32} Default: 16 (128-bit) (from -1 to 32) (default -1)")
    private String pbkeylen;

    @CommandLine.Option(names = "-passphrase", description = "Crypto PBKDF2 Passphrase size[0,10..64] 0:disable crypto")
    private String passphrase;

    @CommandLine.Option(names = "-enforced_encryption", description = "Enforces that both connection parties have the same passphrase set (default auto)")
    private boolean enforcedEncryption;

    @CommandLine.Option(names = "-kmrefreshrate", description = "The number of packets to be transmitted after which the encryption key is switched to a new key (from -1 to INT_MAX) (default -1)")
    private String kmrefreshrate;

    @CommandLine.Option(names = "-snddropdelay", description = "The sender's extra delay(in microseconds) before dropping packets (from -2 to I64_MAX) (default -2)")
    private String snddropdelay;

    @CommandLine.Option(names = "-mss", description = "The Maximum Segment Size (from -1 to 1500) (default -1)")
    private String mss;

    @CommandLine.Option(names = "-ffs", description = "Flight flag size (window size) (in bytes) (from -1 to INT_MAX) (default -1)")
    private String ffs;

    @CommandLine.Option(names = "-ipttl", description = "IP Time To Live (from -1 to 255) (default -1)")
    private String ipttl;

    @CommandLine.Option(names = "-iptos", description = "IP Type of Service (from -1 to 255) (default -1)")
    private String iptos;

    @CommandLine.Option(names = "-inputbw", description = "Estimated input stream rate (from -1 to I64_MAX) (default -1)")
    private String inputbw;

    @CommandLine.Option(names = "-oheadbw", description = "MaxBW ceiling based on % over input stream rate (from -1 to 100)")
    private String oheadbw;

    @CommandLine.Option(names = "-latency", description = "Receiver delay (in microseconds) to absorb bursts of missed packet retransmissions (from -1 to I64_MAX) (default -1)")
    private String latency;

    @Deprecated
    @CommandLine.Option(names = "-tsbpddelay", description = "Deprecated, same effect as latency option (from -1 to I64_MAX) (default -1)")
    private String tsbpddelay;

    @CommandLine.Option(names = "-rcvlatency", description = "Receive latency (in microseconds) (from -1 to I64_MAX) (default -1)")
    private String rcvlatency;

    @CommandLine.Option(names = "-peerlatency", description = "Peer latency (in microseconds) (from -1 to I64_MAX) (default -1)")
    private String peerlatency;

    @CommandLine.Option(names = "-tlpktdrop", description = "Enable too-late pkt drop (default auto)")
    private boolean tlpktdrop;

    @CommandLine.Option(names = "-nakreport", description = "Enable receiver to send periodic NAK reports (default auto)")
    private boolean nakreport;

    @CommandLine.Option(names = "-connect_timeout", description = "Connect timeout(in milliseconds). Caller default: 3000, rendezvous (x 10) (from -1 to I64_MAX) (default -1)")
    private String connectTimeout;

    @CommandLine.Option(names = "-mode", description = "Connection mode (caller, listener, rendezvous) (from 0 to 2) (default caller)")
    private String mode;

    @CommandLine.Option(names = "-sndbuf", description = "Send buffer size (in bytes) (from -1 to INT_MAX) (default -1)")
    private String sndbuf;

    @CommandLine.Option(names = "-rcvbuf", description = "Receive buffer size (in bytes) (from -1 to INT_MAX) (default -1)")
    private String rcvbuf;

    @CommandLine.Option(names = "-lossmaxttl", description = "Maximum possible packet reorder tolerance (from -1 to INT_MAX) (default -1)")
    private String lossmaxttl;

    @CommandLine.Option(names = "-minversion", description = "The minimum SRT version that is required from the peer (from -1 to INT_MAX) (default -1)")
    private String minversion;

    @CommandLine.Option(names = {"-streamid", "srt_streamid"}, description = "A string of up to 512 characters that an Initiator can pass to a Responder")
    private String streamid;

    @CommandLine.Option(names = "-smoother", description = "The type of Smoother used for the transmission for that socket")
    private String smoother;

    @CommandLine.Option(names = "-messageapi", description = "Enable message API (default auto)")
    private String messageapi;

    @CommandLine.Option(names = "-transtype", description = "The transmission type for the socket (from 0 to 2) (default 2)")
    private String transtype;

    @CommandLine.Option(names = "-linger", description = "Number of seconds that the socket waits for unsent data when closing (from -1 to INT_MAX) (default -1)")
    private String linger;

    @CommandLine.Option(names = "-tsbpd", description = "Timestamp-based packet delivery (default auto)")
    private String tsbpd;

    @CommandLine.Option(names = "-private_key", description = "Set path to private key")
    private String privateKey;

    @CommandLine.Option(names = "-initial_pause", description = "Do not start playing the stream immediately (default false)")
    private String initialPause;

    @CommandLine.Option(names = "-rtsp_transport", description = "Set RTSP transport protocols (default 0)")
    private String rtspTransport;

    @CommandLine.Option(names = "-rtsp_flags", description = "Set RTSP flags (default 0)")
    private String rtspFlags;

    @CommandLine.Option(names = "-allowed_media_types", description = "Set media types to accept from the server (default video+audio+data+subtitle)")
    private String allowedMediaTypes;

    @CommandLine.Option(names = "-min_port", description = "Set minimum local UDP port (from 0 to 65535) (default 5000)")
    private String minPort;

    @CommandLine.Option(names = "-max_port", description = "Set maximum local UDP port (from 0 to 65535) (default 65000)")
    private String maxPort;

    @CommandLine.Option(names = "-reorder_queue_size", description = "Set number of packets to buffer for handling of reordered packets (from -1 to INT_MAX) (default -1)")
    private String reorderQueueSize;

    @CommandLine.Option(names = "-aa_fixed_key", description = "Fixed key used for handling Audible AA files")
    private String aaFixedKey;

    @CommandLine.Option(names = "-raw_packet_size", description = "(from 1 to INT_MAX) (default 1024)")
    private String rawPacketSize;

    @CommandLine.Option(names = "-linespeed", description = "Set simulated line speed (bytes per second) (from 1 to INT_MAX) (default 6000)")
    private String linespeed;

    @CommandLine.Option(names = "-video_size", description = "Set video size, such as 640x480 or hd720")
    private String videoSize;

    @CommandLine.Option(names = "-framerate", description = "Set framerate (frames per second) (default \"25\")")
    private String framerate;

    @CommandLine.Option(names = "-ignore_loop", description = "Ignore loop setting (default true)")
    private String ignoreLoop;

    @CommandLine.Option(names = "-max_fps", description = "Maximum framerate (0 is no limit) (from 0 to INT_MAX) (default 0)")
    private String maxFps;

    @CommandLine.Option(names = "-default_fps", description = "Default framerate (0 is as fast as possible) (from 0 to INT_MAX) (default 15)")
    private String defaultFps;

    @CommandLine.Option(names = "-sample_rate", description = "(from 0 to INT_MAX) (default 48000)")
    private String sampleRate;

    @CommandLine.Option(names = "-subfps", description = "Set the movie frame rate (from 0 to INT_MAX) (default 25/1)")
    private String subfps;

    @CommandLine.Option(names = "-no_resync_search", description = "Don't try to resynchronize by looking for a certain optional start code (default false)")
    private boolean noResyncSearch;

    @CommandLine.Option(names = "-export_xmp", description = "Export full XMP metadata (default false)")
    private boolean exportXmp;

    @CommandLine.Option(names = "-use_odml", description = "Use odml index (default true)")
    private String useOdml;

    @CommandLine.Option(names = "-pixel_format", description = "Set pixel format (default \"yuv420p\")")
    private String pixelFormat;

    @CommandLine.Option(names = "-frames_per_packet", description = "Number of frames to read at a time. Higher = faster decoding, lower granularity (from 1 to INT_MAX) (default 1)")
    private String framesPerPacket;

    @CommandLine.Option(names = "-safe", description = "Enable safe mode (default true)")
    private String safe;

    @CommandLine.Option(names = "-auto_convert", description = "Automatically convert bitstream format (default true)")
    private String autoConvert;

    @CommandLine.Option(names = "-segment_time_metadata", description = "Output file segment start time and duration as packet metadata (default false)")
    private String segmentTimeMetadata;

    @CommandLine.Option(names = "-allowed_extensions", description = "List of file extensions that dash is allowed to access (default \"aac,m4a,m4s,m4v,mov,mp4,webm,ts\")")
    private String allowedExtensions;

    @CommandLine.Option(names = "-flv_metadata", description = "Allocate streams according to the onMetaData array (default false)")
    private boolean flvMetadata;

    @CommandLine.Option(names = "-flv_full_metadata", description = "Dump full metadata of the onMetadata (default false)")
    private boolean flvFullMetadata;

    @CommandLine.Option(names = "-flv_ignore_prevtag", description = "Ignore the Size of previous tag (default false)")
    private boolean flvIgnorePrevtag;

    @CommandLine.Option(names = "-missing_streams", description = "(from 0 to 255) (default 0)")
    private String missingStreams;

    @CommandLine.Option(names = "-code_size", description = "Bits per G.726 code (from 2 to 5) (default 4)")
    private String codeSize;

    @CommandLine.Option(names = "-bit_rate", description = "(from 0 to INT_MAX) (default 8000)")
    private String bitRate;

    @CommandLine.Option(names = "-min_delay", description = "Minimum valid delay between frames (in hundredths of second) (from 0 to 6000) (default 2)")
    private String minDelay;

    @CommandLine.Option(names = "-max_gif_delay", description = "Maximum valid delay between frames (in hundredths of seconds) (from 0 to 65535) (default 65535)")
    private String maxGifDelay;

    @CommandLine.Option(names = "-default_delay", description = "Default delay between frames (in hundredths of second) (from 0 to 6000) (default 10)")
    private String defaultDelay;

    @CommandLine.Option(names = "-live_start_index", description = "Segment index to start live streams at (negative values are from the end) (from INT_MIN to INT_MAX) (default -3)")
    private String liveStartIndex;

    @CommandLine.Option(names = "-max_reload", description = "Maximum number of times a insufficient list is attempted to be reloaded (from 0 to INT_MAX) (default 1000)")
    private String maxReload;

    @CommandLine.Option(names = "-m3u8_hold_counters", description = "The maximum number of times to load m3u8 when it refreshes without new segments (from 0 to INT_MAX) (default 1000)")
    private String m3u8HoldCounters;

    @CommandLine.Option(names = "-http_persistent", description = "Use persistent HTTP connections (default true)")
    private boolean httpPersistent;

    @CommandLine.Option(names = "-http_multiple", description = "Use multiple HTTP connections for fetching segments (default auto)")
    private boolean httpMultiple;

    @CommandLine.Option(names = "-http_seekable", description = "Use HTTP partial requests, 0 = disable, 1 = enable, -1 = auto (default auto)")
    private boolean httpSeekable;

    @CommandLine.Option(names = "-seg_format_options", description = "Set options for segment demuxer")
    private String segFormatOptions;

    @CommandLine.Option(names = "-pattern_type", description = "set pattern type (from 0 to INT_MAX) (default 4)")
    private String patternType;

    @CommandLine.Option(names = "-start_number", description = "Set first number in the sequence (from INT_MIN to INT_MAX) (default 0)")
    private String startNumber;

    @CommandLine.Option(names = "-start_number_range", description = "Set range for looking at the first sequence number (from 1 to INT_MAX) (default 5)")
    private String startNumberRange;

    @CommandLine.Option(names = "-ts_from_file", description = "Set frame timestamp from file's one (from 0 to 2) (default none)")
    private String tsFromFile;

    @CommandLine.Option(names = "-export_path_metadata", description = "Enable metadata containing input path information (default false)")
    private String exportPathMetadata;

    @CommandLine.Option(names = "-assetmaps", description = "Comma-separated paths to ASSETMAP files.If not specified, the `ASSETMAP.xml` file in the same directory as the CPL is used")
    private String assetmaps;

    @CommandLine.Option(names = "-use_absolute_path", description = "Allow using absolute path when opening alias, this is a possible security issue (default false)")
    private boolean useAbsolutePath;

    @CommandLine.Option(names = "-seek_streams_individually", description = "Seek each stream individually to the closest point (default true)")
    private boolean seekStreamsIndividually;

    @CommandLine.Option(names = "-ignore_editlist", description = "Ignore the edit list atom. (default false)")
    private boolean ignoreEditlist;

    @CommandLine.Option(names = "-advanced_editlist", description = "Modify the AVIndex according to the editlists. Use this option to decode in the order specified by the edits. (default true)")
    private boolean advancedEditlist;

    @CommandLine.Option(names = "-ignore_chapters", description = "(default false)")
    private boolean ignoreChapters;

    @CommandLine.Option(names = "-use_mfra_for", description = "Use mfra for fragment timestamps (from -1 to 2) (default auto)")
    private boolean useMfraFor;

    @CommandLine.Option(names = "-use_tfdt", description = "Use tfdt for fragment timestamps (default true)")
    private boolean useTfdt;

    @CommandLine.Option(names = "-export_all", description = "Export unrecognized metadata entries (default false)")
    private boolean exportAll;

    @CommandLine.Option(names = "-activation_bytes", description = "Secret bytes for Audible AAX files")
    private String activationBytes;

    @CommandLine.Option(names = "-audible_key", description = "AES-128 Key for Audible AAXC files")
    private String audibleKey;

    @CommandLine.Option(names = "-audible_iv", description = "AES-128 IV for Audible AAXC files")
    private String audibleIv;

    @CommandLine.Option(names = "-audible_fixed_key", description = "Fixed key used for handling Audible AAX files")
    private String audibleFixedKey;

    @CommandLine.Option(names = "-enable_drefs", description = "Enable external track support. (default false)")
    private boolean enableDrefs;

    @CommandLine.Option(names = "-max_stts_delta", description = "Treat offsets above this value as invalid (from 0 to UINT32_MAX) (default 4294487295)")
    private String maxSttsDelta;

    @CommandLine.Option(names = "-usetoc", description = "Use table of contents (default false)")
    private boolean usetoc;

    @CommandLine.Option(names = "-resync_size", description = "Set size limit for looking up a new synchronization (from 0 to INT_MAX) (default 65536)")
    private String resyncSize;

    @CommandLine.Option(names = "-fix_teletext_pts", description = "Try to fix pts values of dvb teletext streams (default true)")
    private boolean fixTeletextPts;

    @CommandLine.Option(names = "-ts_packetsize", description = "output option carrying the raw packet size (from 0 to 0) (default 0)")
    private String tsPacketsize;

    @CommandLine.Option(names = "-scan_all_pmts", description = "Scan and combine all PMTs (default auto)")
    private boolean scanAllPmts;

    @CommandLine.Option(names = "-skip_unknown_pmt", description = "Skip PMTs for programs not advertised in the PAT (default false)")
    private boolean skipUnknownPmt;

    @CommandLine.Option(names = "-merge_pmt_versions", description = "Re-use streams when PMT's version/pids change (default false)")
    private boolean mergePmtVersions;

    @CommandLine.Option(names = "-max_packet_size", description = "Maximum size of emitted packet (from 1 to 1.07374e+09) (default 204800)")
    private String maxPacketSize;

    @CommandLine.Option(names = "-compute_pcr", description = "Compute exact PCR for each transport stream packet (default false)")
    private boolean computePcr;

    @CommandLine.Option(names = "-strict_mime_boundary", description = "Require MIME boundaries match (default false)")
    private String strictMimeBoundary;

    @CommandLine.Option(names = "-eia608_extract", description = "Extract eia 608 captions from s436m track (default false)")
    private String eia608Extract;

    @CommandLine.Option(names = "-rtp_flags", description = "Set RTP flags (default 0)")
    private String rtpFlags;

    @CommandLine.Option(names = "-ignore_length", description = "Ignore length (default false)")
    private String ignoreLength;

    @CommandLine.Option(names = "-kind", description = "Set kind of WebVTT track (from 0 to INT_MAX) (default subtitles)")
    private String kind;

    @CommandLine.Option(names = "-track_index", description = "Set track that should be played (from 0 to INT_MAX) (default 0)")
    private String trackIndex;

    @CommandLine.Option(names = "-noise_reduction", description = "Enable noise reduction 0(off)-1(on) (from 0 to 1) (default 0)")
    private String noiseReduction;

    @CommandLine.Option(names = "-reverb_depth", description = "Reverb level 0(quiet)-100(loud) (from 0 to 100) (default 0)")
    private String reverbDepth;

    @CommandLine.Option(names = "-reverb_delay", description = "Reverb delay in ms, usually 40-200ms (from 0 to INT_MAX) (default 0)")
    private String reverbDelay;

    @CommandLine.Option(names = "-bass_amount", description = "XBass level 0(quiet)-100(loud) (from 0 to 100) (default 0)")
    private String bassAmount;

    @CommandLine.Option(names = "-bass_range", description = "XBass cutoff in Hz 10-100 (from 0 to 100) (default 0)")
    private String bassRange;

    @CommandLine.Option(names = "-surround_depth", description = "Surround level 0(quiet)-100(heavy) (from 0 to 100) (default 0)")
    private String surroundDepth;

    @CommandLine.Option(names = "-surround_delay", description = "Surround delay in ms, usually 5-40ms (from 0 to INT_MAX) (default 0)")
    private String surroundDelay;

    @CommandLine.Option(names = "-max_size", description = "Max file size supported (in bytes). Default is 5MB. Set to 0 for no limit (not recommended) (from 0 to 1.04858e+08) (default 5242880)")
    private String maxSize;

    @CommandLine.Option(names = "-video_stream_expr", description = "Color formula")
    private String videoStreamExpr;

    @CommandLine.Option(names = "-video_stream", description = "Make demuxer output a video stream (from 0 to 1) (default 0)")
    private String videoStream;

    @CommandLine.Option(names = "-video_stream_w", description = "Video stream width in char (one char = 8x8px) (from 20 to 512) (default 30)")
    private String videoStreamW;

    @CommandLine.Option(names = "-video_stream_h", description = "Video stream height in char (one char = 8x8px) (from 20 to 512) (default 30)")
    private String videoStreamH;

    @CommandLine.Option(names = "-video_stream_ptxt", description = "Print speed, tempo, order, ... in video stream (from 0 to 1) (default 1)")
    private String videoStreamPtxt;

    @CommandLine.Option(names = "-subsong", description = "Set subsong (from -2 to INT_MAX) (default auto)")
    private String subsong;

    @CommandLine.Option(names = "-channels", description = "Set number of audio channels, such as 1 or 2 (from 0 to INT_MAX) (default 0)")
    private String channels;

    @CommandLine.Option(names = "-audio_buffer_size", description = "Set audio device buffer latency size in milliseconds (default is the device's default) (from 0 to INT_MAX) (default 0)")
    private String audioBufferSize;

    @CommandLine.Option(names = "-list_devices", description = "List available devices (default false)")
    private boolean listDevices;

    @CommandLine.Option(names = "-list_options", description = "List available options for specified device (default false)")
    private boolean listOptions;

    @CommandLine.Option(names = "-video_device_number", description = "Set video device number for devices with same name (starts at 0) (from 0 to INT_MAX) (default 0)")
    private String videoDeviceNumber;

    @CommandLine.Option(names = "-audio_device_number", description = "Set audio device number for devices with same name (starts at 0) (from 0 to INT_MAX) (default 0)")
    private String audioDeviceNumber;

    @CommandLine.Option(names = "-crossbar_video_input_pin_number", description = "Set video input pin number for crossbar device (from -1 to INT_MAX) (default -1)")
    private String crossbarVideoInputPinNumber;

    @CommandLine.Option(names = "-crossbar_audio_input_pin_number", description = "Set audio input pin number for crossbar device (from -1 to INT_MAX) (default -1)")
    private String crossbarAudioInputPinNumber;

    @CommandLine.Option(names = "-show_video_device_dialog", description = "Display property dialog for video capture device (default false)")
    private boolean showVideoDeviceDialog;

    @CommandLine.Option(names = "-show_audio_device_dialog", description = "Display property dialog for audio capture device (default false)")
    private boolean showAudioDeviceDialog;

    @CommandLine.Option(names = "-show_video_crossbar_connection_dialog", description = "Display property dialog for crossbar connecting pins filter on video device (default false)")
    private boolean showVideoCrossbarConnectionDialog;

    @CommandLine.Option(names = "-show_audio_crossbar_connection_dialog", description = "Display property dialog for crossbar connecting pins filter on audio device (default false)")
    private boolean showAudioCrossbarConnectionDialog;

    @CommandLine.Option(names = "-show_analog_tv_tuner_dialog", description = "Display property dialog for analog tuner filter (default false)")
    private boolean showAnalogTvTunerDialog;

    @CommandLine.Option(names = "-show_analog_tv_tuner_audio_dialog", description = "Display property dialog for analog tuner audio filter (default false)")
    private boolean showAnalogTvTunerAudioDialog;

    @CommandLine.Option(names = "-audio_device_load", description = "Load audio capture filter device (and properties) from file")
    private String audioDeviceLoad;

    @CommandLine.Option(names = "-audio_device_save", description = "Save audio capture filter device (and properties) to file")
    private String audioDeviceSave;

    @CommandLine.Option(names = "-video_device_load", description = "Load video capture filter device (and properties) from file")
    private String videoDeviceLoad;

    @CommandLine.Option(names = "-video_device_save", description = "Save video capture filter device (and properties) to file")
    private String videoDeviceSave;

    @CommandLine.Option(names = "-use_video_device_timestamps", description = "Use device instead of wallclock timestamps for video frames (default true)")
    private boolean useVideoDeviceTimestamps;

    @CommandLine.Option(names = "-draw_mouse", description = "Draw the mouse pointer (from 0 to 1) (default 1)")
    private String drawMouse;

    @CommandLine.Option(names = "-show_region", description = "Draw border around capture area (from 0 to 1) (default 0)")
    private String showRegion;

    @CommandLine.Option(names = "-offset_x", description = "Capture area x offset (from INT_MIN to INT_MAX) (default 0)")
    private String offsetX;

    @CommandLine.Option(names = "-offset_y", description = "Capture area y offset (from INT_MIN to INT_MAX) (default 0)")
    private String offsetY;

    @CommandLine.Option(names = "-graph", description = "Set libavfilter graph")
    private String graph;

    @CommandLine.Option(names = "-graph_file", description = "Set libavfilter graph filename")
    private String graphFile;

    @CommandLine.Option(names = "-dumpgraph", description = "Dump graph to stderr")
    private String dumpgraph;

    @CommandLine.Option(names = "-speed", description = "Set drive reading speed (from 0 to INT_MAX) (default 0)")
    private String speed;

    @CommandLine.Option(names = "-paranoia_mode", description = "Set error recovery mode (default 0)")
    private String paranoiaMode;

    @CommandLine.Option(names = "-flags", description = "(default 0)")
    private String flags;

    @CommandLine.Option(names = "-flags2", description = "(default 0)")
    private String flags2;

    @CommandLine.Option(names = "-export_side_data", description = "Export metadata as side data (default 0)")
    private String exportSideData;

    @CommandLine.Option(names = "-ar", description = "Set audio sampling rate (in Hz) (from 0 to INT_MAX) (default 0)")
    private String ar;

    @CommandLine.Option(names = "-ac", description = "set number of audio channels (from 0 to INT_MAX) (default 0)")
    private String ac;

    @CommandLine.Option(names = "-bug", description = "Work around not autodetected encoder bugs (default autodetect)")
    private String bug;

    @CommandLine.Option(names = "-ec", description = "Set error concealment strategy (default guess_mvs+deblock)")
    private String ec;

    @CommandLine.Option(names = "-debug", description = "Print specific debug info (default 0)")
    private String debug;

    @CommandLine.Option(names = "-threads", description = "Set the number of threads (from 0 to INT_MAX) (default 1)")
    private String threads;

    @CommandLine.Option(names = "-skip_top", description = "Number of macroblock rows at the top which are skipped (from INT_MIN to INT_MAX) (default 0)")
    private String skipTop;

    @CommandLine.Option(names = "-skip_bottom", description = "Number of macroblock rows at the bottom which are skipped (from INT_MIN to INT_MAX) (default 0)")
    private String skipBottom;

    @CommandLine.Option(names = "-lowres", description = "Decode at 1= 1/2, 2=1/4, 3=1/8 resolutions (from 0 to INT_MAX) (default 0)")
    private String lowres;

    @CommandLine.Option(names = "-skip_loop_filter", description = "Skip loop filtering process for the selected frames (from INT_MIN to INT_MAX) (default default)")
    private String skipLoopFilter;

    @CommandLine.Option(names = "-skip_idct", description = "Skip IDCT/dequantization for the selected frames (from INT_MIN to INT_MAX) (default default)")
    private String skipIdct;

    @CommandLine.Option(names = "-skip_frame", description = "Skip decoding for the selected frames (from INT_MIN to INT_MAX) (default default)")
    private String skipFrame;

    @CommandLine.Option(names = "-channel_layout", description = "(default 0x0)")
    private String channelLayout;

    @CommandLine.Option(names = "-request_channel_layout", description = "(default 0x0)")
    private String requestChannelLayout;

    @CommandLine.Option(names = "-ticks_per_frame", description = "(from 1 to INT_MAX) (default 1)")
    private String ticksPerFrame;

    @CommandLine.Option(names = "-color_primaries", description = "Color primaries (from 1 to INT_MAX) (default unknown)")
    private String colorPrimaries;

    @CommandLine.Option(names = "-color_trc", description = "Color transfer characteristics (from 1 to INT_MAX) (default unknown)")
    private String colorTrc;

    @CommandLine.Option(names = "-colorspace", description = "Color space (from 0 to INT_MAX) (default unknown)")
    private String colorspace;

    @CommandLine.Option(names = "-color_range", description = "Color range (from 0 to INT_MAX) (default unknown)")
    private String colorRange;

    @CommandLine.Option(names = "-chroma_sample_location", description = "Chroma sample location (from 0 to INT_MAX) (default unknown)")
    private String chromaSampleLocation;

    @CommandLine.Option(names = "-thread_type", description = "Select multithreading type (default slice+frame)")
    private String threadType;

    @CommandLine.Option(names = "-request_sample_fmt", description = "Sample format audio decoders should prefer (default none)")
    private String requestSampleFmt;

    @CommandLine.Option(names = "-sub_charenc", description = "set input text subtitles character encoding")
    private String subCharenc;

    @CommandLine.Option(names = "-sub_charenc_mode", description = "Set input text subtitles character encoding mode (default 0)")
    private String subCharencMode;

    @Deprecated
    @CommandLine.Option(names = "-sub_text_format", description = "Deprecated, does nothing (from 0 to 1) (default ass)")
    private String subTextFormat;

    @CommandLine.Option(names = "-apply_cropping", description = "(default true)")
    private String applyCropping;

    @CommandLine.Option(names = "-skip_alpha", description = "Skip processing alpha (default false)")
    private String skipAlpha;

    @CommandLine.Option(names = "-field_order", description = "Field order (from 0 to 5) (default 0)")
    private String fieldOrder;

    @CommandLine.Option(names = "-hwaccel_flags", description = "(default ignore_level)")
    private String hwaccelFlags;

    @CommandLine.Option(names = "-extra_hw_frames", description = "Number of extra hardware frames to allocate for the user (from -1 to INT_MAX) (default -1)")
    private String extraHwFrames;

    @CommandLine.Option(names = "-discard_damaged_percentage", description = "Percentage of damaged samples to discard a frame (from 0 to 100) (default 95)")
    private String discardDamagedPercentage;

    @CommandLine.Option(names = "-layer", description = "Set the decoding layer (default \"\")")
    private String layer;

    @CommandLine.Option(names = "-part", description = "Set the decoding part (from 0 to INT_MAX) (default 0)")
    private String part;

    @CommandLine.Option(names = "-gamma", description = "Set the float gamma value when decoding (from 0.001 to FLT_MAX) (default 1)")
    private String gamma;

    @CommandLine.Option(names = "-apply_trc", description = "Color transfer characteristics to apply to EXR linear input (from 1 to 18) (default gamma)")
    private String applyTrc;

    @CommandLine.Option(names = "-skip_cursor", description = "Skip the cursor (default false)")
    private String skipCursor;

    @CommandLine.Option(names = "-blank_value", description = "Value that is used to replace BLANK pixels in data array (from 0 to 65535) (default 0)")
    private String blankValue;

    @CommandLine.Option(names = "-change_field_order", description = "Change field order (default false)")
    private String changeFieldOrder;

    @CommandLine.Option(names = "-trans_color", description = "Color value (ARGB) that is used instead of transparent color (from 0 to UINT32_MAX) (default 16777215)")
    private String transColor;

    @CommandLine.Option(names = "-is_avc", description = "Is avc (default false)")
    private String isAvc;

    @CommandLine.Option(names = "-nal_length_size", description = "Nal_length_size (from 0 to 4) (default 0)")
    private String nalLengthSize;

    @CommandLine.Option(names = "-enable_er", description = "Enable error resilience on damaged frames (unsafe) (default auto)")
    private String enableEr;

    @CommandLine.Option(names = "-x264_build", description = "Assume this x264 version if no x264 version found in any SEI (from -1 to INT_MAX) (default -1)")
    private String x264Build;

    @CommandLine.Option(names = "-async_depth", description = "Internal parallelization depth, the higher the value the higher the latency. (from 1 to INT_MAX) (default 4)")
    private String asyncDepth;

    @CommandLine.Option(names = "-gpu_copy", description = "A GPU-accelerated copy between video and system memory (from 0 to 2) (default default)")
    private String gpuCopy;

    @CommandLine.Option(names = "-apply_defdispwin", description = "Apply default display window from VUI (default false)")
    private String applyDefdispwin;

    @CommandLine.Option(names = "-strict-displaywin", description = "Strictly apply default display window size (default false)")
    private String strictDisplaywin;

    @CommandLine.Option(names = "-load_plugin", description = "A user plugin to load in an internal session (from 0 to 2) (default hevc_hw)")
    private String loadPlugin;

    @CommandLine.Option(names = "-load_plugins", description = "A :-separate list of hexadecimal plugin UIDs to load in an internal session (default \"\")")
    private String loadPlugins;

    @CommandLine.Option(names = "-extern_huff", description = "Use external huffman table. (default false)")
    private String externHuff;

    @CommandLine.Option(names = "-top", description = "Top field first (default auto)")
    private String top;

    @CommandLine.Option(names = "-non_pcm_mode", description = "Chooses what to do with NON-PCM (from 0 to 3) (default decode_drop)")
    private String nonPcmMode;

    @CommandLine.Option(names = "-subimage", description = "Decode subimage instead if available (default false)")
    private String subimage;

    @CommandLine.Option(names = "-thumbnail", description = "Decode embedded thumbnail subimage instead if available (default false)")
    private String thumbnail;

    @CommandLine.Option(names = "-page", description = "Page number of multi-page image to decode (starting from 1) (from 0 to 65535) (default 0)")
    private String page;

    @CommandLine.Option(names = "-custom_stride", description = "Custom V210 stride (from INT_MIN to INT_MAX) (default 0)")
    private String customStride;

    @CommandLine.Option(names = "-dual_mono_mode", description = "Select the channel to decode for dual mono (from -1 to 2) (default auto)")
    private String dualMonoMode;

    @CommandLine.Option(names = "-cons_noisegen", description = "Enable consistent noise generation (default false)")
    private String consNoisegen;

    @CommandLine.Option(names = "-drc_scale", description = "Percentage of dynamic range compression to apply (from 0 to 6) (default 1)")
    private String drcScale;

    @CommandLine.Option(names = "-heavy_compr", description = "Enable heavy dynamic range compression (default false)")
    private String heavyCompr;

    @CommandLine.Option(names = "-target_level", description = "Target level in -dBFS (0 not applied) (from -31 to 0) (default 0)")
    private String targetLevel;

    @CommandLine.Option(names = "-extra_bits_bug", description = "Force non-standard decoding process (default false)")
    private String extraBitsBug;

    @CommandLine.Option(names = "-max_samples", description = "Maximum number of samples decoded per call (from 1 to INT_MAX) (default 4608)")
    private String maxSamples;

    @CommandLine.Option(names = "-core_only", description = "Decode core only without extensions (default false)")
    private String coreOnly;

    @CommandLine.Option(names = "-postfilter", description = "Enable postfilter (default true)")
    private String postfilter;

    @CommandLine.Option(names = "-use_buggy_lpc", description = "Emulate old buggy lavc behavior (default false)")
    private String useBuggyLpc;

    @CommandLine.Option(names = "-apply_phase_inv", description = "Apply intensity stereo phase inversion (default true)")
    private String applyPhaseInv;

    @CommandLine.Option(names = "-password", description = "Set decoding password")
    private String password;

    @CommandLine.Option(names = "-bits_per_codeword", description = "Bits per G722 codeword (from 6 to 8) (default 8)")
    private String bitsPerCodeword;

    @CommandLine.Option(names = "-real_time", description = "Emit subtitle events as they are decoded for real-time display (default false)")
    private String realTime;

    @CommandLine.Option(names = "-real_time_latency_msec", description = "Minimum elapsed time between emitting real-time subtitle events (from 0 to 500) (default 200)")
    private String realTimeLatencyMsec;

    @CommandLine.Option(names = "-data_field", description = "Select data field (from -1 to 1) (default auto)")
    private String dataField;

    @CommandLine.Option(names = "-compute_edt", description = "Compute end of time using pts or timeout (default false)")
    private String computeEdt;

    @CommandLine.Option(names = "-compute_clut", description = "Compute clut when not available(-1) or only once (-2) or always(1) or never(0) (default auto)")
    private String computeClut;

    @CommandLine.Option(names = "-dvb_substream", description = "(from -1 to 63) (default -1)")
    private String dvbSubstream;

    @CommandLine.Option(names = "-palette", description = "Set the global palette")
    private String palette;

    @CommandLine.Option(names = "-ifo_palette", description = "Obtain the global palette from .IFO file")
    private String ifoPalette;

    @CommandLine.Option(names = "-forced_subs_only", description = "Only show forced subtitles (default false)")
    private String forcedSubsOnly;

    @CommandLine.Option(names = "-keep_ass_markup", description = "Set if ASS tags must be escaped (default false)")
    private String keepAssMarkup;

    @CommandLine.Option(names = "-tilethreads", description = "Tile threads (from 0 to 256) (default 0)")
    private String tilethreads;

    @CommandLine.Option(names = "-framethreads", description = "Frame threads (from 0 to 256) (default 0)")
    private String framethreads;

    @CommandLine.Option(names = "-filmgrain", description = "Apply Film Grain (default auto)")
    private boolean filmgrain;

    @CommandLine.Option(names = "-oppoint", description = "Select an operating point of the scalable bitstream (from -1 to 31) (default -1)")
    private String oppoint;

    @CommandLine.Option(names = "-alllayers", description = "Output all spatial layers (default false)")
    private String alllayers;

    @CommandLine.Option(names = "-enhance", description = "Enhance the decoded audio (adds delay) (from 0 to 1) (default 0)")
    private String enhance;

    @CommandLine.Option(names = "-lowqual", description = "Limit the number of layers used for decoding (from 0 to INT_MAX) (default 0)")
    private String lowqual;

    @CommandLine.Option(names = "-txt_page", description = "Page numbers to decode, subtitle for subtitles, * for all (default \"*\")")
    private String txtPage;

    @CommandLine.Option(names = "-txt_default_region", description = "Default G0 character set used for decoding (from -1 to 87) (default -1)")
    private String txtDefaultRegion;

    @CommandLine.Option(names = "-txt_chop_top", description = "Discards the top teletext line (from 0 to 1) (default 1)")
    private String txtChopTop;

    @CommandLine.Option(names = "-txt_format", description = "Format of the subtitles (bitmap or text or ass) (from 0 to 2) (default bitmap)")
    private String txtFormat;

    @CommandLine.Option(names = "-txt_left", description = "X offset of generated bitmaps (from 0 to 65535) (default 0)")
    private String txtLeft;

    @CommandLine.Option(names = "-txt_top", description = "Y offset of generated bitmaps (from 0 to 65535) (default 0)")
    private String txtTop;

    @CommandLine.Option(names = "-txt_chop_spaces", description = "Chops leading and trailing spaces from text (from 0 to 1) (default 1)")
    private String txtChopSpaces;

    @CommandLine.Option(names = "-txt_duration", description = "Display duration of teletext pages in msecs (from -1 to 8.64e+07) (default -1)")
    private String txtDuration;

    @CommandLine.Option(names = "-txt_transparent", description = "Force transparent background of the teletext (from 0 to 1) (default 0)")
    private String txtTransparent;

    @CommandLine.Option(names = "-txt_opacity", description = "Set opacity of the transparent background (from -1 to 255) (default -1)")
    private String txtOpacity;

    @CommandLine.Option(names = "-operating_point", description = "Select an operating point of the scalable bitstream (from 0 to 31) (default 0)")
    private String operatingPoint;

    @CommandLine.Option(names = "-deint", description = "Set deinterlacing mode (from 0 to 2) (default weave)")
    private String deint;

    @CommandLine.Option(names = "-gpu", description = "GPU to be used for decoding")
    private String gpu;

    @CommandLine.Option(names = "-surfaces", description = "Maximum surfaces to be used for decoding (from 0 to INT_MAX) (default 25)")
    private String surfaces;

    @CommandLine.Option(names = "-drop_second_field", description = "Drop second field when deinterlacing (default false)")
    private String dropSecondField;

    @CommandLine.Option(names = "-crop", description = "Crop (top)x(bottom)x(left)x(right)")
    private String crop;

    @CommandLine.Option(names = "-resize", description = "Resize (width)x(height)")
    private String resize;
}
