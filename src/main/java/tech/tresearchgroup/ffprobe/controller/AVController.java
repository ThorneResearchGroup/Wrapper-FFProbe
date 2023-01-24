package tech.tresearchgroup.ffprobe.controller;

import tech.tresearchgroup.ffprobe.model.AVOptions;
import tech.tresearchgroup.ffprobe.model.MainOptions;

import java.util.ArrayList;
import java.util.List;

public class AVController {
    public static List<String> getOptions(AVOptions avOptions) {
        List<String> optionsList = new ArrayList<>();
        if(avOptions.getAvioFlags() != null) {
            optionsList.add("-avioflags");
            optionsList.add(avOptions.getAvioFlags());
        }
        if(avOptions.getProbeSize() != null) {
            optionsList.add("-probesize");
            optionsList.add(avOptions.getProbeSize());
        }
        if(avOptions.getFormatProbeSize() != null) {
            optionsList.add("-formatprobesize");
            optionsList.add(avOptions.getFormatProbeSize());
        }
        if(avOptions.getFFlags() != null) {
            optionsList.add("-fflags");
            optionsList.add(avOptions.getFFlags());
        }
        if(avOptions.isSeekToAny()) {
            optionsList.add("-seek2any");
        }
        if(avOptions.getAnalyzeDuration() != null) {
            optionsList.add("-analyzeduration");
            optionsList.add(avOptions.getAnalyzeDuration());
        }
        if(avOptions.getCryptoKey() != null) {
            optionsList.add("-cryptokey");
            optionsList.add(avOptions.getCryptoKey());
        }
        if(avOptions.getIndexMem() != null) {
            optionsList.add("-indexmem");
            optionsList.add(avOptions.getIndexMem());
        }
        if(avOptions.getRtBufSize() != null) {
            optionsList.add("-rtbufsize");
            optionsList.add(avOptions.getRtBufSize());
        }
        if(avOptions.getFDebug() != null) {
            optionsList.add("-fdebug");
            optionsList.add(avOptions.getFDebug());
        }
        if(avOptions.getMaxDelay() != null) {
            optionsList.add("-max_delay");
            optionsList.add(avOptions.getMaxDelay());
        }
        if(avOptions.getFpsProbeSize() != null) {
            optionsList.add("-fpsprobesize");
            optionsList.add(avOptions.getFpsProbeSize());
        }
        if(avOptions.getFErrDetect() != null) {
            optionsList.add("-f_err_detect");
            optionsList.add(avOptions.getFErrDetect());
        }
        if(avOptions.getErrDetect() != null) {
            optionsList.add("-err_detect");
            optionsList.add(avOptions.getErrDetect());
        }
        if(avOptions.isUseWallClockASTimeStamps()) {
            optionsList.add("-use_wallclock_ass_timestamps");
        }
        if(avOptions.getSkipInitialBytes() != null) {
            optionsList.add("-skip_initial_bytes");
            optionsList.add(avOptions.getSkipInitialBytes());
        }
        if(avOptions.isCorrectTsOverflow()) {
            optionsList.add("-correct_ts_overflow");
        }
        if(avOptions.getFStrict() != null) {
            optionsList.add("-f_strict");
            optionsList.add(avOptions.getFStrict());
        }
        if(avOptions.getStrict() != null) {
            optionsList.add("-strict");
            optionsList.add(avOptions.getStrict());
        }
        if(avOptions.getMaxTsProbe() != null) {
            optionsList.add("-max_ts_probe");
            optionsList.add(avOptions.getMaxTsProbe());
        }
        if(avOptions.getDumpSeparator() != null) {
            optionsList.add("-dump_separator");
            optionsList.add(avOptions.getDumpSeparator());
        }
        if(avOptions.getCodecWhitelist() != null) {
            optionsList.add("-codec_whitelist");
            optionsList.add(avOptions.getCodecWhitelist());
        }
        if(avOptions.getFormatWhitelist() != null) {
            optionsList.add("-format_whitelist");
            optionsList.add(avOptions.getFormatWhitelist());
        }
        if(avOptions.getProtocolWhitelist() != null) {
            optionsList.add("-protocol_whitelist");
            optionsList.add(avOptions.getProtocolWhitelist());
        }
        if(avOptions.getProtocolBlacklist() != null) {
            optionsList.add("-protocol_blacklist");
            optionsList.add(avOptions.getProtocolBlacklist());
        }
        if(avOptions.getMaxStreams() != null) {
            optionsList.add("-max_streams");
            optionsList.add(avOptions.getMaxStreams());
        }
        if(avOptions.isSkipEstimateDurationFromPts()) {
            optionsList.add("-skip_estimate_duration_from_pts");
        }
        if(avOptions.getMaxProbePackets() != null) {
            optionsList.add("-max_probe_packets");
            optionsList.add(avOptions.getMaxProbePackets());
        }
        if(avOptions.getRwTimeout() != null) {
            optionsList.add("-rw_timeout");
            optionsList.add(avOptions.getRwTimeout());
        }
        if(avOptions.getPlaylist() != null) {
            optionsList.add("-playlist");
            optionsList.add(avOptions.getPlaylist());
        }
        if(avOptions.getAngle() != null) {
            optionsList.add("-angle");
            optionsList.add(avOptions.getAngle());
        }
        if(avOptions.getChapter() != null) {
            optionsList.add("-chapter");
            optionsList.add(avOptions.getChapter());
        }
        if(avOptions.getReadAheadLimit() != null) {
            optionsList.add("-read_ahead_limit");
            optionsList.add(avOptions.getReadAheadLimit());
        }
        if(avOptions.getKey() != null) {
            optionsList.add("-key");
            optionsList.add(avOptions.getKey());
        }
        if(avOptions.getIv() != null) {
            optionsList.add("-iv");
            optionsList.add(avOptions.getIv());
        }
        if(avOptions.getDecryptionKey() != null) {
            optionsList.add("-decryption_key");
            optionsList.add(avOptions.getDecryptionKey());
        }
        if(avOptions.getDecryptionIv() != null) {
            optionsList.add("-decryption_iv");
            optionsList.add(avOptions.getDecryptionIv());
        }
        if(avOptions.getFfrtmpcryptTunneling() != null) {
            optionsList.add("-ffrtmpcrypt_tunnelingg");
            optionsList.add(avOptions.getFfrtmpcryptTunneling());
        }
        if(avOptions.getFfrtmphttpTls() != null) {
            optionsList.add("-ffrtmphttp_tls");
            optionsList.add(avOptions.getFfrtmphttpTls());
        }
        if(avOptions.getFollow() != null) {
            optionsList.add("-follow");
            optionsList.add(avOptions.getFollow());
        }
        if(avOptions.getSeekable() != null) {
            optionsList.add("-seekable");
            optionsList.add(avOptions.getSeekable());
        }
        if(avOptions.getTimeout() != null) {
            optionsList.add("-timeout");
            optionsList.add(avOptions.getTimeout());
        }
        if(avOptions.getFtpAnonymousPassword() != null) {
            optionsList.add("-ftp-anonymous-password");
            optionsList.add(avOptions.getFtpAnonymousPassword());
        }
        if(avOptions.getFtpUser() != null) {
            optionsList.add("-ftp-user");
            optionsList.add(avOptions.getFtpUser());
        }
        if(avOptions.getFtpPassword() != null) {
            optionsList.add("-ftp-password");
            optionsList.add(avOptions.getFtpPassword());
        }
        if(avOptions.getHttpProxy() != null) {
            optionsList.add("-http_proxy");
            optionsList.add(avOptions.getHttpProxy());
        }
        if(avOptions.getHeaders() != null) {
            optionsList.add("-headers");
            optionsList.add(avOptions.getHeaders());
        }
        if(avOptions.getContentType() != null) {
            optionsList.add("-content_type");
            optionsList.add(avOptions.getContentType());
        }
        if(avOptions.getContentType() != null) {
            optionsList.add("-content_type");
            optionsList.add(avOptions.getContentType());
        }
        if(avOptions.getUserAgent() != null) {
            optionsList.add("-user_agent");
            optionsList.add(avOptions.getUserAgent());
        }
        if(avOptions.getReferer() != null) {
            optionsList.add("-referer");
            optionsList.add(avOptions.getReferer());
        }
        if(avOptions.isMultipleRequests()) {
            optionsList.add("-multiple_requests");
        }
        if(avOptions.getPostData() != null) {
            optionsList.add("-post_data");
            optionsList.add(avOptions.getPostData());
        }
        if(avOptions.getCookies() != null) {
            optionsList.add("-cookies");
            optionsList.add(avOptions.getCookies());
        }
        if(avOptions.isIcy()) {
            optionsList.add("-icy");
        }
        if(avOptions.getAuthType() != null) {
            optionsList.add("-auth_type");
            optionsList.add(avOptions.getAuthType());
        }
        if(avOptions.getLocation() != null) {
            optionsList.add("-location");
            optionsList.add(avOptions.getLocation());
        }
        if(avOptions.getOffset() != null) {
            optionsList.add("-offset");
            optionsList.add(avOptions.getOffset());
        }
        if(avOptions.getEndOffset() != null) {
            optionsList.add("-end_offset");
            optionsList.add(avOptions.getEndOffset());
        }
        if(avOptions.getMethod() != null) {
            optionsList.add("-method");
            optionsList.add(avOptions.getMethod());
        }
        if(avOptions.isReconnect()) {
            optionsList.add("-reconnect");
        }
        if(avOptions.isReconnectAtEof()) {
            optionsList.add("-reconnect_at_eof");
        }
        if(avOptions.getReconnectOnHttpError() != null) {
            optionsList.add("-reconnect_on_http_error");
            optionsList.add(avOptions.getReconnectOnHttpError());
        }
        if(avOptions.isReconnectStreamed()) {
            optionsList.add("-reconnect_streamed");
        }
        if(avOptions.getReconnectDelayMax() != null) {
            optionsList.add("-reconnect_delay_max");
            optionsList.add(avOptions.getReconnectDelayMax());
        }
        if(avOptions.getListen() != null) {
            optionsList.add("-listen");
            optionsList.add(avOptions.getListen());
        }
        if(avOptions.getShortSeekSize() != null) {
            optionsList.add("-short_seek_size");
            optionsList.add(avOptions.getShortSeekSize());
        }
        if(avOptions.getRtmpApp() != null) {
            optionsList.add("-rtmp_app");
            optionsList.add(avOptions.getRtmpApp());
        }
        if(avOptions.getRtmpBuffer() != null) {
            optionsList.add("-rtmp_buffer");
            optionsList.add(avOptions.getRtmpBuffer());
        }
        if(avOptions.getRtmpConn() != null) {
            optionsList.add("-rtmp_conn");
            optionsList.add(avOptions.getRtmpConn());
        }
        if(avOptions.getRtmpFlashver() != null) {
            optionsList.add("-rtmp_flashver");
            optionsList.add(avOptions.getRtmpFlashver());
        }
        if(avOptions.getRtmpLive() != null) {
            optionsList.add("-rtmp_live");
            optionsList.add(avOptions.getRtmpLive());
        }
        if(avOptions.getRtmpPageurl() != null) {
            optionsList.add("-rtmp_pageurl");
            optionsList.add(avOptions.getRtmpPageurl());
        }
        if(avOptions.getRtmpPlaypath() != null) {
            optionsList.add("-rtmp_playpath");
            optionsList.add(avOptions.getRtmpPlaypath());
        }
        if(avOptions.getRtmpSubscribe() != null) {
            optionsList.add("-rtmp_subscribe");
            optionsList.add(avOptions.getRtmpSubscribe());
        }
        if(avOptions.getRtmpSwfhash() != null) {
            optionsList.add("-rtmp_swfhash");
            optionsList.add(avOptions.getRtmpSwfhash());
        }
        if(avOptions.getRtmpSwfsize() != null) {
            optionsList.add("-rtmp_swfsize");
            optionsList.add(avOptions.getRtmpSwfsize());
        }
        if(avOptions.getRtmpSwfurl() != null) {
            optionsList.add("-rtmp_swfurl");
            optionsList.add(avOptions.getRtmpSwfurl());
        }
        if(avOptions.getRtmpSwfverify() != null) {
            optionsList.add("-rtmp_swfverify");
            optionsList.add(avOptions.getRtmpSwfverify());
        }
        if(avOptions.getRtmpTcurl() != null) {
            optionsList.add("-rtmp_tcurl");
            optionsList.add(avOptions.getRtmpTcurl());
        }
        if(avOptions.getRtmpListen() != null) {
            optionsList.add("-rtmp_listen");
            optionsList.add(avOptions.getRtmpListen());
        }
        if(avOptions.getTcpNodelay() != null) {
            optionsList.add("-tcp_nodelay");
            optionsList.add(avOptions.getTcpNodelay());
        }
        if(avOptions.getTtl() != null) {
            optionsList.add("-ttl");
            optionsList.add(avOptions.getTtl());
        }
        if(avOptions.getBufferSize() != null) {
            optionsList.add("-buffer_size");
            optionsList.add(avOptions.getBufferSize());
        }
        if(avOptions.getRtcpPort() != null) {
            optionsList.add("-rtcp_port");
            optionsList.add(avOptions.getRtcpPort());
        }
        if(avOptions.getLocalRtpport() != null) {
            optionsList.add("-local_rtpport");
            optionsList.add(avOptions.getLocalRtpport());
        }
        if(avOptions.getLocalRtcpport() != null) {
            optionsList.add("-local_rtcpport");
            optionsList.add(avOptions.getLocalRtcpport());
        }
        if(avOptions.isConnect()) {
            optionsList.add("-connect");
        }
        if(avOptions.isWriteToSource()) {
            optionsList.add("-writeToSource");
        }
        if(avOptions.getPktSize() != null) {
            optionsList.add("-pkt_size");
            optionsList.add(avOptions.getPktSize());
        }
        if(avOptions.getDscp() != null) {
            optionsList.add("-dscp");
            optionsList.add(avOptions.getDscp());
        }
        if(avOptions.getSources() != null) {
            optionsList.add("-sources");
            optionsList.add(avOptions.getSources());
        }
        if(avOptions.getBlock() != null) {
            optionsList.add("-block");
            optionsList.add(avOptions.getBlock());
        }
        if(avOptions.getLocaladdr() != null) {
            optionsList.add("-localaddr");
            optionsList.add(avOptions.getLocaladdr());
        }
        if(avOptions.getSrtpInSuite() != null) {
            optionsList.add("-srtp_in_suite");
            optionsList.add(avOptions.getSrtpInSuite());
        }
        if(avOptions.getSrtpInParams() != null) {
            optionsList.add("-srtp_in_params");
            optionsList.add(avOptions.getSrtpInParams());
        }
        if(avOptions.getStart() != null) {
            optionsList.add("-start");
            optionsList.add(avOptions.getStart());
        }
        if(avOptions.getEnd() != null) {
            optionsList.add("-start");
            optionsList.add(avOptions.getEnd());
        }
        if(avOptions.getListenTimeout() != null) {
            optionsList.add("-listen_timeout");
            optionsList.add(avOptions.getListenTimeout());
        }
        if(avOptions.getSendBufferSize() != null) {
            optionsList.add("-end_buffer_size");
            optionsList.add(avOptions.getSendBufferSize());
        }
        if(avOptions.getRecvBufferSize() != null) {
            optionsList.add("-recv_buffer_size");
            optionsList.add(avOptions.getRecvBufferSize());
        }
        if(avOptions.getCaFile() != null) {
            optionsList.add("-ca_file");
            optionsList.add(avOptions.getCaFile());
        }
        if(avOptions.getTlsVerify() != null) {
            optionsList.add("-tls_verify");
            optionsList.add(avOptions.getTlsVerify());
        }
        if(avOptions.getCertFile() != null) {
            optionsList.add("-cert_file");
            optionsList.add(avOptions.getCertFile());
        }
        if(avOptions.getKeyFile() != null) {
            optionsList.add("-key_file");
            optionsList.add(avOptions.getKeyFile());
        }
        if(avOptions.getVerifyhost() != null) {
            optionsList.add("-verifyhost");
            optionsList.add(avOptions.getVerifyhost());
        }
        if(avOptions.getLocalport() != null) {
            optionsList.add("-localport");
            optionsList.add(avOptions.getLocalport());
        }
        if(avOptions.getUdpliteCoverage() != null) {
            optionsList.add("-udplite_coverage");
            optionsList.add(avOptions.getUdpliteCoverage());
        }
        if(avOptions.isReuse()) {
            optionsList.add("-reuse");
        }
        if(avOptions.getFifoSize() != null) {
            optionsList.add("-fifo_size");
            optionsList.add(avOptions.getFifoSize());
        }
        if(avOptions.isOverrunNonfatal()) {
            optionsList.add("-overrun_nonfatal");
        }
        if(avOptions.getRistProfile() != null) {
            optionsList.add("-rist_profile");
            optionsList.add(avOptions.getRistProfile());
        }
        if(avOptions.getLogLevel() != null) {
            optionsList.add("-log_level");
            optionsList.add(avOptions.getLogLevel());
        }
        if(avOptions.getSecret() != null) {
            optionsList.add("-secret");
            optionsList.add(avOptions.getSecret());
        }
        if(avOptions.getEncryption() != null) {
            optionsList.add("-encryption");
            optionsList.add(avOptions.getEncryption());
        }
        if(avOptions.getPayloadSize() != null) {
            optionsList.add("-payload_size");
            optionsList.add(avOptions.getPayloadSize());
        }
        if(avOptions.getMaxbw() != null) {
            optionsList.add("-maxbw");
            optionsList.add(avOptions.getMaxbw());
        }
        if(avOptions.getPbkeylen() != null) {
            optionsList.add("-pbkeylen");
            optionsList.add(avOptions.getPbkeylen());
        }
        if(avOptions.getPassphrase() != null) {
            optionsList.add("-passphrase");
            optionsList.add(avOptions.getPassphrase());
        }
        if(avOptions.isEnforcedEncryption()) {
            optionsList.add("-enforced_encryption");
        }
        if(avOptions.getKmrefreshrate() != null) {
            optionsList.add("-kmrefreshrate");
            optionsList.add(avOptions.getKmrefreshrate());
        }
        if(avOptions.getSnddropdelay() != null) {
            optionsList.add("-snddropdelay");
            optionsList.add(avOptions.getSnddropdelay());
        }
        if(avOptions.getMss() != null) {
            optionsList.add("-mss");
            optionsList.add(avOptions.getMss());
        }
        if(avOptions.getFfs() != null) {
            optionsList.add("-ffs");
            optionsList.add(avOptions.getFfs());
        }
        if(avOptions.getIpttl() != null) {
            optionsList.add("-ipttl");
            optionsList.add(avOptions.getIpttl());
        }
        if(avOptions.getIptos() != null) {
            optionsList.add("-iptos");
            optionsList.add(avOptions.getIptos());
        }
        if(avOptions.getInputbw() != null) {
            optionsList.add("-inputbw");
            optionsList.add(avOptions.getInputbw());
        }
        if(avOptions.getOheadbw() != null) {
            optionsList.add("-oheadbw");
            optionsList.add(avOptions.getOheadbw());
        }
        if(avOptions.getLatency() != null) {
            optionsList.add("-latency");
            optionsList.add(avOptions.getLatency());
        }
        if(avOptions.getTsbpddelay() != null) {
            optionsList.add("-tsbpddelay");
            optionsList.add(avOptions.getTsbpddelay());
        }
        if(avOptions.getRcvlatency() != null) {
            optionsList.add("-rcvlatency");
            optionsList.add(avOptions.getRcvlatency());
        }
        if(avOptions.getPeerlatency() != null) {
            optionsList.add("-peerlatency");
            optionsList.add(avOptions.getPeerlatency());
        }
        if(avOptions.isTlpktdrop()) {
            optionsList.add("-tlpktdrop");
        }
        if(avOptions.isNakreport()) {
            optionsList.add("-nakreport");
        }
        if(avOptions.getConnectTimeout() != null) {
            optionsList.add("-connect_timeout");
            optionsList.add(avOptions.getConnectTimeout());
        }
        if(avOptions.getMode() != null) {
            optionsList.add("-mode");
            optionsList.add(avOptions.getMode());
        }
        if(avOptions.getSndbuf() != null) {
            optionsList.add("-sndbuf");
            optionsList.add(avOptions.getSndbuf());
        }
        if(avOptions.getRcvbuf() != null) {
            optionsList.add("-rcvbuf");
            optionsList.add(avOptions.getRcvbuf());
        }
        if(avOptions.getLossmaxttl() != null) {
            optionsList.add("-lossmaxttl");
            optionsList.add(avOptions.getLossmaxttl());
        }
        if(avOptions.getMinversion() != null) {
            optionsList.add("-minversion");
            optionsList.add(avOptions.getMinversion());
        }
        if(avOptions.getStreamid() != null) {
            optionsList.add("-streamid");
            optionsList.add(avOptions.getStreamid());
        }
        if(avOptions.getSmoother() != null) {
            optionsList.add("-smoother");
            optionsList.add(avOptions.getSmoother());
        }
        if(avOptions.getMessageapi() != null) {
            optionsList.add("-messageapi");
            optionsList.add(avOptions.getMessageapi());
        }
        if(avOptions.getTranstype() != null) {
            optionsList.add("-transtype");
            optionsList.add(avOptions.getTranstype());
        }
        if(avOptions.getLinger() != null) {
            optionsList.add("-linger");
            optionsList.add(avOptions.getLinger());
        }
        if(avOptions.getTsbpd() != null) {
            optionsList.add("-tsbpd");
            optionsList.add(avOptions.getTsbpd());
        }
        if(avOptions.getPrivateKey() != null) {
            optionsList.add("-private_key");
            optionsList.add(avOptions.getPrivateKey());
        }
        if(avOptions.getInitialPause() != null) {
            optionsList.add("-initial_pause");
            optionsList.add(avOptions.getInitialPause());
        }
        if(avOptions.getRtspTransport() != null) {
            optionsList.add("-rtsp_transport");
            optionsList.add(avOptions.getRtspTransport());
        }
        if(avOptions.getRtspFlags() != null) {
            optionsList.add("-rtsp_flags");
            optionsList.add(avOptions.getRtspFlags());
        }
        if(avOptions.getAllowedMediaTypes() != null) {
            optionsList.add("-allowed_media_types");
            optionsList.add(avOptions.getAllowedMediaTypes());
        }
        if(avOptions.getMinPort() != null) {
            optionsList.add("-min_port");
            optionsList.add(avOptions.getMinPort());
        }
        if(avOptions.getMaxPort() != null) {
            optionsList.add("-max_port");
            optionsList.add(avOptions.getMaxPort());
        }
        if(avOptions.getReorderQueueSize() != null) {
            optionsList.add("-reorder_queue_size");
            optionsList.add(avOptions.getReorderQueueSize());
        }
        if(avOptions.getAaFixedKey() != null) {
            optionsList.add("-aa_fixed_key");
            optionsList.add(avOptions.getAaFixedKey());
        }
        if(avOptions.getRawPacketSize() != null) {
            optionsList.add("-raw_packet_size");
            optionsList.add(avOptions.getRawPacketSize());
        }
        if(avOptions.getLinespeed() != null) {
            optionsList.add("-linespeed");
            optionsList.add(avOptions.getLinespeed());
        }
        if(avOptions.getVideoSize() != null) {
            optionsList.add("-video_size");
            optionsList.add(avOptions.getVideoSize());
        }
        if(avOptions.getFramerate() != null) {
            optionsList.add("-framerate");
            optionsList.add(avOptions.getFramerate());
        }
        if(avOptions.getIgnoreLoop() != null) {
            optionsList.add("-ignore_loop");
            optionsList.add(avOptions.getIgnoreLoop());
        }
        if(avOptions.getMaxFps() != null) {
            optionsList.add("-max_fps");
            optionsList.add(avOptions.getMaxFps());
        }
        if(avOptions.getDefaultFps() != null) {
            optionsList.add("-default_fps");
            optionsList.add(avOptions.getDefaultFps());
        }
        if(avOptions.getSampleRate() != null) {
            optionsList.add("-sample_rate");
            optionsList.add(avOptions.getSampleRate());
        }
        if(avOptions.getSubfps() != null) {
            optionsList.add("-subfps");
            optionsList.add(avOptions.getSubfps());
        }
        if(avOptions.isNoResyncSearch()) {
            optionsList.add("-no_resync_search");
        }
        if(avOptions.isExportXmp()) {
            optionsList.add("-export_xmp");
        }
        if(avOptions.getUseOdml() != null) {
            optionsList.add("-use_odml");
            optionsList.add(avOptions.getUseOdml());
        }
        if(avOptions.getPixelFormat() != null) {
            optionsList.add("-pixel_format");
            optionsList.add(avOptions.getPixelFormat());
        }
        if(avOptions.getFramesPerPacket() != null) {
            optionsList.add("-frames_per_packet");
            optionsList.add(avOptions.getFramesPerPacket());
        }
        if(avOptions.getSafe() != null) {
            optionsList.add("-safe");
            optionsList.add(avOptions.getSafe());
        }
        if(avOptions.getAutoConvert() != null) {
            optionsList.add("-auto_convert");
            optionsList.add(avOptions.getAutoConvert());
        }
        if(avOptions.getSegmentTimeMetadata() != null) {
            optionsList.add("-segment_time_metadata");
            optionsList.add(avOptions.getSegmentTimeMetadata());
        }
        if(avOptions.getAllowedExtensions() != null) {
            optionsList.add("-allowed_extensions");
            optionsList.add(avOptions.getAllowedExtensions());
        }
        if(avOptions.isFlvMetadata()) {
            optionsList.add("-flv_metadata");
        }
        if(avOptions.isFlvFullMetadata()) {
            optionsList.add("-flv_full_metadata");
        }
        if(avOptions.isFlvIgnorePrevtag()) {
            optionsList.add("-flv_ignore_prevtag");
        }
        if(avOptions.getMissingStreams() != null) {
            optionsList.add("-missing_streams");
            optionsList.add(avOptions.getMissingStreams());
        }
        if(avOptions.getCodeSize() != null) {
            optionsList.add("-code_size");
            optionsList.add(avOptions.getCodeSize());
        }
        if(avOptions.getBitRate() != null) {
            optionsList.add("-bit_rate");
            optionsList.add(avOptions.getBitRate());
        }
        if(avOptions.getMinDelay() != null) {
            optionsList.add("-min_delay");
            optionsList.add(avOptions.getMinDelay());
        }
        if(avOptions.getMaxGifDelay() != null) {
            optionsList.add("-max_gif_delay");
            optionsList.add(avOptions.getMaxGifDelay());
        }
        if(avOptions.getDefaultDelay() != null) {
            optionsList.add("-default_delay");
            optionsList.add(avOptions.getDefaultDelay());
        }
        if(avOptions.getLiveStartIndex() != null) {
            optionsList.add("-live_start_index");
            optionsList.add(avOptions.getLiveStartIndex());
        }
        if(avOptions.getMaxReload() != null) {
            optionsList.add("-max_reload");
            optionsList.add(avOptions.getMaxReload());
        }
        if(avOptions.getM3u8HoldCounters() != null) {
            optionsList.add("-m3u8_hold_counters");
            optionsList.add(avOptions.getM3u8HoldCounters());
        }
        if(avOptions.isHttpPersistent()) {
            optionsList.add("-http_persistent");
        }
        if(avOptions.isHttpMultiple()) {
            optionsList.add("-http_multiple");
        }
        if(avOptions.isHttpSeekable()) {
            optionsList.add("-http_seekable");
        }
        if(avOptions.getSegFormatOptions() != null) {
            optionsList.add("-seg_format_options");
            optionsList.add(avOptions.getSegFormatOptions());
        }
        if(avOptions.getPatternType() != null) {
            optionsList.add("-pattern_type");
            optionsList.add(avOptions.getPatternType());
        }
        if(avOptions.getStartNumber() != null) {
            optionsList.add("-start_number");
            optionsList.add(avOptions.getStartNumber());
        }
        if(avOptions.getStartNumberRange() != null) {
            optionsList.add("-start_number_range");
            optionsList.add(avOptions.getStartNumberRange());
        }
        if(avOptions.getTsFromFile() != null) {
            optionsList.add("-ts_from_file");
            optionsList.add(avOptions.getTsFromFile());
        }
        if(avOptions.getExportPathMetadata() != null) {
            optionsList.add("-export_path_metadata");
            optionsList.add(avOptions.getExportPathMetadata());
        }
        if(avOptions.getAssetmaps() != null) {
            optionsList.add("-assetmaps");
            optionsList.add(avOptions.getAssetmaps());
        }
        if(avOptions.isUseAbsolutePath()) {
            optionsList.add("-use_absolute_path");
        }
        if(avOptions.isSeekStreamsIndividually()) {
            optionsList.add("-seek_streams_individually");
        }
        if(avOptions.isIgnoreEditlist()) {
            optionsList.add("-ignore_editlist");
        }
        if(avOptions.isAdvancedEditlist()) {
            optionsList.add("-advanced_editlist");
        }
        if(avOptions.isIgnoreChapters()) {
            optionsList.add("-ignore_chapters");
        }
        if(avOptions.isUseMfraFor()) {
            optionsList.add("-use_mfra_for");
        }
        if(avOptions.isUseTfdt()) {
            optionsList.add("-use_tfdt");
        }
        if(avOptions.isExportAll()) {
            optionsList.add("-export_all");
        }
        if(avOptions.getActivationBytes() != null) {
            optionsList.add("-activation_bytes");
            optionsList.add(avOptions.getActivationBytes());
        }
        if(avOptions.getAudibleKey() != null) {
            optionsList.add("-audible_key");
            optionsList.add(avOptions.getAudibleKey());
        }
        if(avOptions.getAudibleIv() != null) {
            optionsList.add("-audible_iv");
            optionsList.add(avOptions.getAudibleIv());
        }
        if(avOptions.getAudibleFixedKey() != null) {
            optionsList.add("-audible_fixed_key");
            optionsList.add(avOptions.getAudibleFixedKey());
        }
        if(avOptions.isEnableDrefs()) {
            optionsList.add("-enable_drefs");
        }
        if(avOptions.getMaxSttsDelta() != null) {
            optionsList.add("-max_stts_delta");
            optionsList.add(avOptions.getMaxSttsDelta());
        }
        if(avOptions.isUsetoc()) {
            optionsList.add("-usetoc");
        }
        if(avOptions.getResyncSize() != null) {
            optionsList.add("-resync_size");
            optionsList.add(avOptions.getResyncSize());
        }
        if(avOptions.isFixTeletextPts()) {
            optionsList.add("-fix_teletext_pts");
        }
        if(avOptions.getTsPacketsize() != null) {
            optionsList.add("-ts_packetsize");
            optionsList.add(avOptions.getTsPacketsize());
        }
        if(avOptions.isScanAllPmts()) {
            optionsList.add("-scan_all_pmts");
        }
        if(avOptions.isSkipUnknownPmt()) {
            optionsList.add("-skip_unknown_pmt");
        }
        if(avOptions.isMergePmtVersions()) {
            optionsList.add("-merge_pmt_versions");
        }
        if(avOptions.getMaxPacketSize() != null) {
            optionsList.add("-max_packet_size");
            optionsList.add(avOptions.getMaxPacketSize());
        }
        if(avOptions.isComputePcr()) {
            optionsList.add("-copute_pcr");
        }
        if(avOptions.getStrictMimeBoundary() != null) {
            optionsList.add("-strict_mime_boundary");
            optionsList.add(avOptions.getStrictMimeBoundary());
        }
        if(avOptions.getEia608Extract() != null) {
            optionsList.add("-eia608_extract");
            optionsList.add(avOptions.getEia608Extract());
        }
        if(avOptions.getRtpFlags() != null) {
            optionsList.add("-rtp_flags");
            optionsList.add(avOptions.getRtpFlags());
        }
        if(avOptions.getIgnoreLength() != null) {
            optionsList.add("-ignore_length");
            optionsList.add(avOptions.getIgnoreLength());
        }
        if(avOptions.getKind() != null) {
            optionsList.add("-kind");
            optionsList.add(avOptions.getKind());
        }
        if(avOptions.getTrackIndex() != null) {
            optionsList.add("-track_index");
            optionsList.add(avOptions.getTrackIndex());
        }
        if(avOptions.getNoiseReduction() != null) {
            optionsList.add("-noise_reduction");
            optionsList.add(avOptions.getNoiseReduction());
        }
        if(avOptions.getReverbDepth() != null) {
            optionsList.add("-reverb_depth");
            optionsList.add(avOptions.getReverbDepth());
        }
        if(avOptions.getBassAmount() != null) {
            optionsList.add("-bass_amount");
            optionsList.add(avOptions.getBassAmount());
        }
        if(avOptions.getBassRange() != null) {
            optionsList.add("-bass_range");
            optionsList.add(avOptions.getBassRange());
        }
        if(avOptions.getSurroundDepth() != null) {
            optionsList.add("-surround_depth");
            optionsList.add(avOptions.getSurroundDepth());
        }
        if(avOptions.getMaxSize() != null) {
            optionsList.add("-max_size");
            optionsList.add(avOptions.getMaxSize());
        }
        if(avOptions.getVideoStreamExpr() != null) {
            optionsList.add("-video_stream_expr");
            optionsList.add(avOptions.getVideoStreamExpr());
        }
        if(avOptions.getVideoStreamW() != null) {
            optionsList.add("-video_stream_w");
            optionsList.add(avOptions.getVideoStreamW());
        }
        if(avOptions.getVideoStreamH() != null) {
            optionsList.add("-video_stream_h");
            optionsList.add(avOptions.getVideoStreamH());
        }
        if(avOptions.getVideoStreamPtxt() != null) {
            optionsList.add("-video_stream_ptxt");
            optionsList.add(avOptions.getVideoStreamPtxt());
        }
        if(avOptions.getSubsong() != null) {
            optionsList.add("-subsong");
            optionsList.add(avOptions.getSubsong());
        }
        if(avOptions.getChannels() != null) {
            optionsList.add("-channels");
            optionsList.add(avOptions.getChannels());
        }
        if(avOptions.getAudioBufferSize() != null) {
            optionsList.add("-audio_buffer_size");
            optionsList.add(avOptions.getAudioBufferSize());
        }
        if(avOptions.isListDevices()) {
            optionsList.add("-list_devices");
        }
        if(avOptions.isListOptions()) {
            optionsList.add("-list_options");
        }
        if(avOptions.getVideoDeviceNumber() != null) {
            optionsList.add("-video_device_number");
            optionsList.add(avOptions.getVideoDeviceNumber());
        }
        if(avOptions.getAudioDeviceNumber() != null) {
            optionsList.add("-audio_device_number");
            optionsList.add(avOptions.getAudioDeviceNumber());
        }
        if(avOptions.getCrossbarVideoInputPinNumber() != null) {
            optionsList.add("-crossbar_video_input_pin_number");
            optionsList.add(avOptions.getCrossbarVideoInputPinNumber());
        }
        if(avOptions.getCrossbarAudioInputPinNumber() != null) {
            optionsList.add("-crossbar_audio_input_pin_number");
            optionsList.add(avOptions.getCrossbarAudioInputPinNumber());
        }
        if(avOptions.isShowVideoDeviceDialog()) {
            optionsList.add("-show_video_device_dialog");
        }
        if(avOptions.isShowAudioDeviceDialog()) {
            optionsList.add("-show_audio_deivce_dialog");
        }
        if(avOptions.isShowVideoCrossbarConnectionDialog()) {
            optionsList.add("-show_video_crossbar_connection_dialog");
        }
        if(avOptions.isShowAudioCrossbarConnectionDialog()) {
            optionsList.add("-show_audio_crossbar_connection_dialog");
        }
        if(avOptions.isShowAnalogTvTunerDialog()) {
            optionsList.add("-show_analog_tv_tuner_dialog");
        }
        if(avOptions.isShowAnalogTvTunerAudioDialog()) {
            optionsList.add("-show_analog_tv_tuner_audio_dialog");
        }
        if(avOptions.getAudioDeviceLoad() != null) {
            optionsList.add("-audio_device_load");
            optionsList.add(avOptions.getAudioDeviceLoad());
        }
        if(avOptions.getAudioDeviceSave() != null) {
            optionsList.add("-audio_device_save");
            optionsList.add(avOptions.getAudioDeviceSave());
        }
        if(avOptions.getVideoDeviceLoad() != null) {
            optionsList.add("-video_device_load");
            optionsList.add(avOptions.getVideoDeviceLoad());
        }
        if(avOptions.getVideoDeviceSave() != null) {
            optionsList.add("-video_device_save");
            optionsList.add(avOptions.getVideoDeviceSave());
        }
        if(avOptions.isUseVideoDeviceTimestamps()) {
            optionsList.add("-use_video_device_timestamps");
        }
        if(avOptions.getDrawMouse() != null) {
            optionsList.add("-draw_mouse");
            optionsList.add(avOptions.getDrawMouse());
        }
        if(avOptions.getShowRegion() != null) {
            optionsList.add("-show_region");
            optionsList.add(avOptions.getShowRegion());
        }
        if(avOptions.getOffsetX() != null) {
            optionsList.add("-offset_x");
            optionsList.add(avOptions.getOffsetX());
        }
        if(avOptions.getOffsetY() != null) {
            optionsList.add("-offset_y");
            optionsList.add(avOptions.getOffsetY());
        }
        if(avOptions.getGraph() != null) {
            optionsList.add("-graph");
            optionsList.add(avOptions.getGraph());
        }
        if(avOptions.getGraphFile() != null) {
            optionsList.add("-graph_file");
            optionsList.add(avOptions.getGraphFile());
        }
        if(avOptions.getDumpgraph() != null) {
            optionsList.add("-dumpgrah");
            optionsList.add(avOptions.getDumpgraph());
        }
        if(avOptions.getSpeed() != null) {
            optionsList.add("-speed");
            optionsList.add(avOptions.getSpeed());
        }
        if(avOptions.getParanoiaMode() != null) {
            optionsList.add("-paranoia_mode");
            optionsList.add(avOptions.getParanoiaMode());
        }
        if(avOptions.getFlags() != null) {
            optionsList.add("-flags");
            optionsList.add(avOptions.getFlags());
        }
        if(avOptions.getFlags2() != null) {
            optionsList.add("-flags2");
            optionsList.add(avOptions.getFlags2());
        }
        if(avOptions.getExportSideData() != null) {
            optionsList.add("-export_side_data");
            optionsList.add(avOptions.getExportSideData());
        }
        if(avOptions.getAr() != null) {
            optionsList.add("-ar");
            optionsList.add(avOptions.getAr());
        }
        if(avOptions.getAc() != null) {
            optionsList.add("-ac");
            optionsList.add(avOptions.getAc());
        }
        if(avOptions.getBug() != null) {
            optionsList.add("-bug");
            optionsList.add(avOptions.getBug());
        }
        if(avOptions.getEc() != null) {
            optionsList.add("-ec");
            optionsList.add(avOptions.getEc());
        }
        if(avOptions.getDebug() != null) {
            optionsList.add("-debug");
            optionsList.add(avOptions.getDebug());
        }
        if(avOptions.getThreads() != null) {
            optionsList.add("-threads");
            optionsList.add(avOptions.getThreads());
        }
        if(avOptions.getSkipTop() != null) {
            optionsList.add("-skip_top");
            optionsList.add(avOptions.getSkipTop());
        }
        if(avOptions.getSkipBottom() != null) {
            optionsList.add("-skip_bottom");
            optionsList.add(avOptions.getSkipBottom());
        }
        if(avOptions.getLowres() != null) {
            optionsList.add("-lowres");
            optionsList.add(avOptions.getLowres());
        }
        if(avOptions.getSkipLoopFilter() != null) {
            optionsList.add("-skip_loop_filter");
            optionsList.add(avOptions.getSkipLoopFilter());
        }
        if(avOptions.getSkipIdct() != null) {
            optionsList.add("-skip_idct");
            optionsList.add(avOptions.getSkipIdct());
        }
        if(avOptions.getSkipFrame() != null) {
            optionsList.add("-skip_frame");
            optionsList.add(avOptions.getSkipFrame());
        }
        if(avOptions.getChannelLayout() != null) {
            optionsList.add("-channel_layout");
            optionsList.add(avOptions.getChannelLayout());
        }
        if(avOptions.getRequestChannelLayout() != null) {
            optionsList.add("-request_channel_layout");
            optionsList.add(avOptions.getRequestChannelLayout());
        }
        if(avOptions.getTicksPerFrame() != null) {
            optionsList.add("-ticks_per_frame");
            optionsList.add(avOptions.getTicksPerFrame());
        }
        if(avOptions.getColorPrimaries() != null) {
            optionsList.add("-color_primaries");
            optionsList.add(avOptions.getColorPrimaries());
        }
        if(avOptions.getColorTrc() != null) {
            optionsList.add("-color_trc");
            optionsList.add(avOptions.getColorTrc());
        }
        if(avOptions.getColorspace() != null) {
            optionsList.add("-colorspace");
            optionsList.add(avOptions.getColorspace());
        }
        if(avOptions.getColorRange() != null) {
            optionsList.add("-color_range");
            optionsList.add(avOptions.getColorRange());
        }
        if(avOptions.getChromaSampleLocation() != null) {
            optionsList.add("-chroma_sample_location");
            optionsList.add(avOptions.getChromaSampleLocation());
        }
        if(avOptions.getThreadType() != null) {
            optionsList.add("-thread_type");
            optionsList.add(avOptions.getThreadType());
        }
        if(avOptions.getRequestSampleFmt() != null) {
            optionsList.add("-request_sample_fmt");
            optionsList.add(avOptions.getRequestSampleFmt());
        }
        if(avOptions.getSubCharenc() != null) {
            optionsList.add("-sub_charenc");
            optionsList.add(avOptions.getSubCharenc());
        }
        if(avOptions.getSubCharencMode() != null) {
            optionsList.add("-sub_charnec_mode");
            optionsList.add(avOptions.getSubCharencMode());
        }
        if(avOptions.getSubTextFormat() != null) {
            optionsList.add("-sub_text_format");
            optionsList.add(avOptions.getSubTextFormat());
        }
        if(avOptions.getApplyCropping() != null) {
            optionsList.add("-apply_cropping");
            optionsList.add(avOptions.getApplyCropping());
        }
        if(avOptions.getSkipAlpha() != null) {
            optionsList.add("-skip_alpha");
            optionsList.add(avOptions.getSkipAlpha());
        }
        if(avOptions.getFieldOrder() != null) {
            optionsList.add("-field_order");
            optionsList.add(avOptions.getFieldOrder());
        }
        if(avOptions.getHwaccelFlags() != null) {
            optionsList.add("-hwaccel_flags");
            optionsList.add(avOptions.getHwaccelFlags());
        }
        if(avOptions.getExtraHwFrames() != null) {
            optionsList.add("-extra_hw_frames");
            optionsList.add(avOptions.getExtraHwFrames());
        }
        if(avOptions.getDiscardDamagedPercentage() != null) {
            optionsList.add("-discard_damaged_percentage");
            optionsList.add(avOptions.getDiscardDamagedPercentage());
        }
        if(avOptions.getLayer() != null) {
            optionsList.add("-layer");
            optionsList.add(avOptions.getLayer());
        }
        if(avOptions.getPart() != null) {
            optionsList.add("-part");
            optionsList.add(avOptions.getPart());
        }
        if(avOptions.getGamma() != null) {
            optionsList.add("-gamma");
            optionsList.add(avOptions.getGamma());
        }
        if(avOptions.getApplyTrc() != null) {
            optionsList.add("-apply_trc");
            optionsList.add(avOptions.getApplyTrc());
        }
        if(avOptions.getSkipCursor() != null) {
            optionsList.add("-skip_cursor");
            optionsList.add(avOptions.getSkipCursor());
        }
        if(avOptions.getBlankValue() != null) {
            optionsList.add("-blank_value");
            optionsList.add(avOptions.getBlankValue());
        }
        if(avOptions.getChangeFieldOrder() != null) {
            optionsList.add("-change_field_order");
            optionsList.add(avOptions.getChangeFieldOrder());
        }
        if(avOptions.getTransColor() != null) {
            optionsList.add("-trans_color");
            optionsList.add(avOptions.getTransColor());
        }
        if(avOptions.getIsAvc() != null) {
            optionsList.add("-is_avc");
            optionsList.add(avOptions.getIsAvc());
        }
        if(avOptions.getNalLengthSize() != null) {
            optionsList.add("-nal_length_size");
            optionsList.add(avOptions.getNalLengthSize());
        }
        if(avOptions.getEnableEr() != null) {
            optionsList.add("-enable_er");
            optionsList.add(avOptions.getEnableEr());
        }
        if(avOptions.getX264Build() != null) {
            optionsList.add("-x264_build");
            optionsList.add(avOptions.getX264Build());
        }
        if(avOptions.getAsyncDepth() != null) {
            optionsList.add("-async_depth");
            optionsList.add(avOptions.getAsyncDepth());
        }
        if(avOptions.getGpuCopy() != null) {
            optionsList.add("-gpu_copy");
            optionsList.add(avOptions.getGpuCopy());
        }
        if(avOptions.getApplyDefdispwin() != null) {
            optionsList.add("-apply_defdispwin");
            optionsList.add(avOptions.getApplyDefdispwin());
        }
        if(avOptions.getStrictDisplaywin() != null) {
            optionsList.add("-strict-displaywin");
            optionsList.add(avOptions.getStrictDisplaywin());
        }
        if(avOptions.getLoadPlugin() != null) {
            optionsList.add("-load_plugin");
            optionsList.add(avOptions.getLoadPlugin());
        }
        if(avOptions.getLoadPlugins() != null) {
            optionsList.add("-load_plugins");
            optionsList.add(avOptions.getLoadPlugins());
        }
        if(avOptions.getExternHuff() != null) {
            optionsList.add("-extern_huff");
            optionsList.add(avOptions.getExternHuff());
        }
        if(avOptions.getTop() != null) {
            optionsList.add("-top");
            optionsList.add(avOptions.getTop());
        }
        if(avOptions.getNonPcmMode() != null) {
            optionsList.add("-non_pcm_mode");
            optionsList.add(avOptions.getNonPcmMode());
        }
        if(avOptions.getSubimage() != null) {
            optionsList.add("-subimage");
            optionsList.add(avOptions.getSubimage());
        }
        if(avOptions.getThumbnail() != null) {
            optionsList.add("-thumbnail");
            optionsList.add(avOptions.getThumbnail());
        }
        if(avOptions.getPage() != null) {
            optionsList.add("-page");
            optionsList.add(avOptions.getPage());
        }
        if(avOptions.getCustomStride() != null) {
            optionsList.add("-custom_stride");
            optionsList.add(avOptions.getCustomStride());
        }
        if(avOptions.getDualMonoMode() != null) {
            optionsList.add("-dual_mono_mode");
            optionsList.add(avOptions.getDualMonoMode());
        }
        if(avOptions.getConsNoisegen() != null) {
            optionsList.add("-cons_noisegen");
            optionsList.add(avOptions.getConsNoisegen());
        }
        if(avOptions.getDrcScale() != null) {
            optionsList.add("-drc_scale");
            optionsList.add(avOptions.getDrcScale());
        }
        if(avOptions.getHeavyCompr() != null) {
            optionsList.add("-heavy_compr");
            optionsList.add(avOptions.getHeavyCompr());
        }
        if(avOptions.getTargetLevel() != null) {
            optionsList.add("-target_level");
            optionsList.add(avOptions.getTargetLevel());
        }
        if(avOptions.getExtraBitsBug() != null) {
            optionsList.add("-extra_bits_bug");
            optionsList.add(avOptions.getExtraBitsBug());
        }
        if(avOptions.getMaxSamples() != null) {
            optionsList.add("-max_samples");
            optionsList.add(avOptions.getMaxSamples());
        }
        if(avOptions.getCoreOnly() != null) {
            optionsList.add("-core_only");
            optionsList.add(avOptions.getCoreOnly());
        }
        if(avOptions.getPostfilter() != null) {
            optionsList.add("-postfilter");
            optionsList.add(avOptions.getPostfilter());
        }
        if(avOptions.getUseBuggyLpc() != null) {
            optionsList.add("-use_buggy_lpc");
            optionsList.add(avOptions.getUseBuggyLpc());
        }
        if(avOptions.getApplyPhaseInv() != null) {
            optionsList.add("-apply_phase_inv");
            optionsList.add(avOptions.getApplyPhaseInv());
        }
        if(avOptions.getPassword() != null) {
            optionsList.add("-password");
            optionsList.add(avOptions.getPassword());
        }
        if(avOptions.getBitsPerCodeword() != null) {
            optionsList.add("-bits_per_codeword");
            optionsList.add(avOptions.getBitsPerCodeword());
        }
        if(avOptions.getRealTime() != null) {
            optionsList.add("-real_time");
            optionsList.add(avOptions.getRealTime());
        }
        if(avOptions.getRealTimeLatencyMsec() != null) {
            optionsList.add("-real_time_latency_msec");
            optionsList.add(avOptions.getRealTimeLatencyMsec());
        }
        if(avOptions.getDataField() != null) {
            optionsList.add("-data_field");
            optionsList.add(avOptions.getDataField());
        }
        if(avOptions.getComputeEdt() != null) {
            optionsList.add("-compute_edt");
            optionsList.add(avOptions.getComputeEdt());
        }
        if(avOptions.getComputeClut() != null) {
            optionsList.add("-compute_clut");
            optionsList.add(avOptions.getComputeClut());
        }
        if(avOptions.getDvbSubstream() != null) {
            optionsList.add("-dvb_substream");
            optionsList.add(avOptions.getDvbSubstream());
        }
        if(avOptions.getPalette() != null) {
            optionsList.add("-palette");
            optionsList.add(avOptions.getPalette());
        }
        if(avOptions.getIfoPalette() != null) {
            optionsList.add("-ifo_palette");
            optionsList.add(avOptions.getIfoPalette());
        }
        if(avOptions.getForcedSubsOnly() != null) {
            optionsList.add("-forced_subs_only");
            optionsList.add(avOptions.getForcedSubsOnly());
        }
        if(avOptions.getKeepAssMarkup() != null) {
            optionsList.add("-keep_ass_markup");
            optionsList.add(avOptions.getKeepAssMarkup());
        }
        if(avOptions.getTilethreads() != null) {
            optionsList.add("-tilethreads");
            optionsList.add(avOptions.getTilethreads());
        }
        if(avOptions.getFramethreads() != null) {
            optionsList.add("-framethreads");
            optionsList.add(avOptions.getFramethreads());
        }
        if(avOptions.isFilmgrain()) {
            optionsList.add("-filmgrain");
        }
        if(avOptions.getOppoint() != null) {
            optionsList.add("-oppoint");
            optionsList.add(avOptions.getOppoint());
        }
        if(avOptions.getAlllayers() != null) {
            optionsList.add("-alllayers");
            optionsList.add(avOptions.getAlllayers());
        }
        if(avOptions.getEnhance() != null) {
            optionsList.add("-enhance");
            optionsList.add(avOptions.getEnhance());
        }
        if(avOptions.getLowqual() != null) {
            optionsList.add("-lowqual");
            optionsList.add(avOptions.getLowqual());
        }
        if(avOptions.getTxtPage() != null) {
            optionsList.add("-txt_page");
            optionsList.add(avOptions.getTxtPage());
        }
        if(avOptions.getTxtDefaultRegion() != null) {
            optionsList.add("-txt_default_region");
            optionsList.add(avOptions.getTxtDefaultRegion());
        }
        if(avOptions.getTxtChopTop() != null) {
            optionsList.add("-txt_chop_top");
            optionsList.add(avOptions.getTxtChopTop());
        }
        if(avOptions.getTxtFormat() != null) {
            optionsList.add("-txt_format");
            optionsList.add(avOptions.getTxtFormat());
        }
        if(avOptions.getTxtLeft() != null) {
            optionsList.add("-txt_left");
            optionsList.add(avOptions.getTxtLeft());
        }
        if(avOptions.getTxtTop() != null) {
            optionsList.add("-txt_top");
            optionsList.add(avOptions.getTxtTop());
        }
        if(avOptions.getTxtChopSpaces() != null) {
            optionsList.add("-txt_chop_spaces");
            optionsList.add(avOptions.getTxtChopSpaces());
        }
        if(avOptions.getTxtDuration() != null) {
            optionsList.add("-txt_duration");
            optionsList.add(avOptions.getTxtDuration());
        }
        if(avOptions.getTxtTransparent() != null) {
            optionsList.add("-txt_transparent");
            optionsList.add(avOptions.getTxtTransparent());
        }
        if(avOptions.getTxtOpacity() != null) {
            optionsList.add("-txt_opacity");
            optionsList.add(avOptions.getTxtOpacity());
        }
        if(avOptions.getOperatingPoint() != null) {
            optionsList.add("-operating_point");
            optionsList.add(avOptions.getOperatingPoint());
        }
        if(avOptions.getDeint() != null) {
            optionsList.add("-deint");
            optionsList.add(avOptions.getDeint());
        }
        if(avOptions.getGpu() != null) {
            optionsList.add("-gpu");
            optionsList.add(avOptions.getGpu());
        }
        if(avOptions.getSurfaces() != null) {
            optionsList.add("-surfaces");
            optionsList.add(avOptions.getSurfaces());
        }
        if(avOptions.getDropSecondField() != null) {
            optionsList.add("-drop_second_field");
            optionsList.add(avOptions.getDropSecondField());
        }
        if(avOptions.getCrop() != null) {
            optionsList.add("-crop");
            optionsList.add(avOptions.getCrop());
        }
        if(avOptions.getResize() != null) {
            optionsList.add("-resize");
            optionsList.add(avOptions.getResize());
        }
        return optionsList;
    }
}
