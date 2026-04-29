package com.android.thememanager.util;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: VideoSplitor.java */
/* JADX INFO: loaded from: classes2.dex */
public class jz5 {

    /* JADX INFO: renamed from: k */
    private static final String f16578k = "jz5";

    /* JADX INFO: renamed from: q */
    private static final String f16579q = "audio";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f61322toq = 10485760;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61323zy = "video";

    /* JADX INFO: renamed from: k */
    private static void m9839k(MediaExtractor inExtractor, MediaMetadataRetriever inRetriever, int trackIndex, File outFile, boolean isVideo) throws IOException {
        int i2;
        int integer;
        inExtractor.selectTrack(trackIndex);
        MediaMuxer mediaMuxer = new MediaMuxer(outFile.getAbsolutePath(), 0);
        MediaFormat trackFormat = inExtractor.getTrackFormat(trackIndex);
        int iAddTrack = mediaMuxer.addTrack(trackFormat);
        boolean zContainsKey = trackFormat.containsKey("max-input-size");
        int i3 = f61322toq;
        if (zContainsKey && (integer = trackFormat.getInteger("max-input-size")) > f61322toq) {
            i3 = integer;
        }
        String strExtractMetadata = inRetriever.extractMetadata(24);
        if (strExtractMetadata != null && (i2 = Integer.parseInt(strExtractMetadata)) >= 0) {
            mediaMuxer.setOrientationHint(i2);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        mediaMuxer.start();
        while (true) {
            bufferInfo.offset = 0;
            int sampleData = inExtractor.readSampleData(byteBufferAllocate, 0);
            bufferInfo.size = sampleData;
            if (sampleData < 0) {
                Log.d(f16578k, "Saw input EOS.");
                bufferInfo.size = 0;
                mediaMuxer.stop();
                mediaMuxer.release();
                inExtractor.unselectTrack(trackIndex);
                return;
            }
            bufferInfo.presentationTimeUs = inExtractor.getSampleTime();
            bufferInfo.flags = inExtractor.getSampleFlags();
            mediaMuxer.writeSampleData(iAddTrack, byteBufferAllocate, bufferInfo);
            inExtractor.advance();
        }
    }

    @SuppressLint({"NewApi"})
    public static Pair<File, File> toq(File inFile, File outVideoFile, File outAudioFile) throws IOException {
        boolean z2;
        File file;
        File file2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(inFile.getAbsolutePath());
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(inFile.getAbsolutePath());
        HashMap map = new HashMap(2);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        int trackCount = mediaExtractor.getTrackCount();
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= trackCount) {
                break;
            }
            String string = mediaExtractor.getTrackFormat(i2).getString("mime");
            if (string.startsWith("video/") && !atomicBoolean.getAndSet(true)) {
                map.put("video", Integer.valueOf(i2));
            } else if (string.startsWith("audio/") && !atomicBoolean2.getAndSet(true)) {
                map.put("audio", Integer.valueOf(i2));
            }
            i2++;
        }
        File file3 = null;
        if (map.size() == 0) {
            file2 = null;
        } else if (map.size() != 1) {
            if (!outVideoFile.exists() || outVideoFile.length() == 0 || inFile.lastModified() > outVideoFile.lastModified()) {
                try {
                    file = outVideoFile;
                    try {
                        m9839k(mediaExtractor, mediaMetadataRetriever, ((Integer) map.get("video")).intValue(), file, true);
                    } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
                        if (outVideoFile.exists()) {
                            outVideoFile.delete();
                        }
                        file = null;
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException unused2) {
                }
            } else {
                file = outVideoFile;
            }
            if (outAudioFile.exists() && outAudioFile.length() != 0 && inFile.lastModified() <= outAudioFile.lastModified()) {
                z2 = false;
            }
            if (z2) {
                try {
                    file2 = outAudioFile;
                    try {
                        m9839k(mediaExtractor, mediaMetadataRetriever, ((Integer) map.get("audio")).intValue(), file2, false);
                    } catch (IOException | IllegalArgumentException | IllegalStateException unused3) {
                        if (outAudioFile.exists()) {
                            outAudioFile.delete();
                        }
                        file2 = null;
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException unused4) {
                }
            } else {
                file2 = outAudioFile;
            }
            file3 = file;
        } else if (map.containsKey("video")) {
            file2 = null;
            file3 = inFile;
        } else {
            file2 = inFile;
        }
        return new Pair<>(file3, file2);
    }
}
