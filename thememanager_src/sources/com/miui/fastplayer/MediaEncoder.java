package com.miui.fastplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import com.xiaomi.onetrack.p014c.C5729c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class MediaEncoder {
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "MediaEncoder";
    private static final long TIMEBASE = 1000000;
    private MediaCodec mAudioEncoder;
    private String mAudioMime;
    private MediaCodec mEncoder;
    private long mFrameDuration;
    private int mFrameRate;
    private Exception mInitException;
    private MediaMuxer mMediaMuxer;
    private String mOutMp4Path;
    private ByteBuffer mSilenceBuffer;
    private int mTrackIndex = -1;
    private Surface mSurface = null;
    private int mWidth = 1080;
    private int mHeight = 1080;
    private final int mDegree = 0;
    private long mLastPts = -1;
    private long mNewPts = -1;

    private class CustomCallback extends MediaCodec.Callback {
        private CustomCallback() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            Log.d(MediaEncoder.TAG, "onError", codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
            Log.d(MediaEncoder.TAG, "onInputBufferAvailable");
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
            try {
                ByteBuffer outputBuffer = MediaEncoder.this.mEncoder.getOutputBuffer(i2);
                if (bufferInfo.size != 0) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (MediaEncoder.this.mLastPts == -1) {
                        MediaEncoder.this.mNewPts = 0L;
                    } else {
                        MediaEncoder mediaEncoder = MediaEncoder.this;
                        mediaEncoder.mNewPts = mediaEncoder.mLastPts + MediaEncoder.this.mFrameDuration;
                    }
                    bufferInfo.presentationTimeUs = MediaEncoder.this.mNewPts;
                    MediaEncoder mediaEncoder2 = MediaEncoder.this;
                    mediaEncoder2.mLastPts = mediaEncoder2.mNewPts;
                    if (bufferInfo.flags != 2) {
                        try {
                            MediaEncoder.this.mMediaMuxer.writeSampleData(MediaEncoder.this.mTrackIndex, outputBuffer, bufferInfo);
                        } catch (Exception e2) {
                            Log.i(MediaEncoder.TAG, "Too many frames", e2);
                            Log.i(MediaEncoder.TAG, "stop ");
                            MediaEncoder.this.stop();
                        }
                        MediaEncoder.this.mEncoder.releaseOutputBuffer(i2, false);
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        Log.i(MediaEncoder.TAG, "end of stream reached");
                    }
                }
            } catch (Exception e3) {
                Log.d(MediaEncoder.TAG, "onOutputBufferAvailable exception", e3);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            Log.d(MediaEncoder.TAG, "onOutputFormatChanged" + mediaFormat.toString());
            try {
                MediaFormat outputFormat = MediaEncoder.this.mEncoder.getOutputFormat();
                MediaEncoder mediaEncoder = MediaEncoder.this;
                mediaEncoder.mTrackIndex = mediaEncoder.mMediaMuxer.addTrack(outputFormat);
                MediaEncoder.this.mMediaMuxer.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public Surface configure() throws IOException {
        Log.d(TAG, "configure");
        try {
            this.mEncoder = MediaCodec.createEncoderByType("video/avc");
        } catch (Exception unused) {
            this.mEncoder = MediaCodec.createEncoderByType("video/avc");
            Log.d(TAG, "switch encoder to  video/avc");
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mWidth, this.mHeight);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.mWidth * this.mHeight * 5);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", 1.0f);
        try {
            this.mEncoder.setCallback(new CustomCallback());
            mediaFormatCreateVideoFormat.setInteger(C5729c.a.f32003g, 1);
            this.mEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            MediaMuxer mediaMuxer = new MediaMuxer(this.mOutMp4Path, 0);
            this.mMediaMuxer = mediaMuxer;
            mediaMuxer.setOrientationHint(this.mDegree);
            this.mSurface = this.mEncoder.createInputSurface();
        } catch (Exception e2) {
            Log.d(TAG, "configure Exception");
            this.mInitException = e2;
        }
        return this.mSurface;
    }

    public void release() {
        Log.d(TAG, "release: stop muxer, release audio extractor.");
        try {
            MediaCodec mediaCodec = this.mEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mEncoder.release();
                this.mEncoder = null;
            }
        } catch (IllegalStateException e2) {
            Log.d(TAG, "catch release Exception:" + e2);
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
            } catch (Exception unused) {
            }
            this.mMediaMuxer.release();
            this.mMediaMuxer = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
    }

    public void setFilePath(String str) {
        this.mOutMp4Path = str;
    }

    public void setMediaInfo(float f2, int i2, int i3) {
        int iRint = (int) Math.rint(f2);
        this.mFrameRate = iRint;
        this.mHeight = i2;
        this.mWidth = i3;
        this.mFrameDuration = 1000000 / ((long) iRint);
        Log.d(TAG, "mFrameRate : " + this.mFrameRate + ", FrameDuration: " + this.mFrameDuration + ",height: " + this.mHeight + ",width: " + this.mWidth);
    }

    public void start() throws Exception {
        Exception exc = this.mInitException;
        if (exc != null) {
            throw exc;
        }
        Log.d(TAG, "start");
        this.mEncoder.start();
    }

    public void stop() {
        try {
            this.mEncoder.stop();
        } catch (IllegalStateException e2) {
            Log.d(TAG, "catch stop exception: " + e2);
        }
    }

    public void configure(Surface surface) throws IOException {
        Log.d(TAG, "configure");
        try {
            this.mEncoder = MediaCodec.createEncoderByType("video/avc");
        } catch (Exception unused) {
            this.mEncoder = MediaCodec.createEncoderByType("video/avc");
            Log.d(TAG, "switch encoder to  video/avc");
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mWidth, this.mHeight);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.mWidth * this.mHeight * 5);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", 1.0f);
        try {
            this.mEncoder.setCallback(new CustomCallback());
            mediaFormatCreateVideoFormat.setInteger(C5729c.a.f32003g, 1);
            this.mEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            MediaMuxer mediaMuxer = new MediaMuxer(this.mOutMp4Path, 0);
            this.mMediaMuxer = mediaMuxer;
            mediaMuxer.setOrientationHint(this.mDegree);
            this.mEncoder.setInputSurface(surface);
        } catch (Exception e2) {
            Log.d(TAG, "configure Exception");
            this.mInitException = e2;
        }
    }
}
