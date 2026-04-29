package com.miui.fastplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class FastPlayer {
    public static final int BLUR_EFFECT = 8;
    public static final int BRIGHTNESS_EFFECT = 7;
    public static final int EVENT_END_PLAYER = 6;
    public static final int EVENT_END_STREAM = 5;
    public static final int EVENT_FIRST_FRAME = 2;
    public static final int EVENT_OPENDECODER_FAIL = 9;
    public static final int EVENT_PAUSE = 4;
    public static final int EVENT_READY = 1;
    public static final int EVENT_RUN = 3;
    public static final int EVENT_SOFTDECODER = 7;
    public static final int EVENT_UNDEFINED = 0;
    public static final int EVENT_UNSUPPORT = 8;
    public static final int METADATA_KEY_ALBUM = 1;
    public static final int METADATA_KEY_ALBUMARTIST = 13;
    public static final int METADATA_KEY_ARTIST = 2;
    public static final int METADATA_KEY_AUTHOR = 3;
    public static final int METADATA_KEY_BITRATE = 20;
    public static final int METADATA_KEY_CAPTURE_FRAMERATE = 25;
    public static final int METADATA_KEY_CAPTURE_ORIGIN_TRACK = 26;
    public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
    public static final int METADATA_KEY_CHANNELS = 101;
    public static final int METADATA_KEY_CODEC_NAME = 103;
    public static final int METADATA_KEY_COMPILATION = 15;
    public static final int METADATA_KEY_COMPOSER = 4;
    public static final int METADATA_KEY_COM_ANDROID_MANUFACTURER = 56;
    public static final int METADATA_KEY_COM_ANDROID_MODEL = 57;
    public static final int METADATA_KEY_COM_ANDROID_VERSION = 55;
    public static final int METADATA_KEY_DATE = 5;
    public static final int METADATA_KEY_DISC_NUMBER = 14;
    public static final int METADATA_KEY_DURATION = 9;
    public static final int METADATA_KEY_EXIST_MI_RECORD_LOG = 58;
    public static final int METADATA_KEY_EXIST_MI_RECORD_MIMOVIE = 59;
    public static final int METADATA_KEY_EXIST_MI_SUBTITLE = 53;
    public static final int METADATA_KEY_EXIST_MI_VIDEO_TAGS = 54;
    public static final int METADATA_KEY_GENRE = 6;
    public static final int METADATA_KEY_HAS_AUDIO = 16;
    public static final int METADATA_KEY_HAS_VIDEO = 17;
    public static final int METADATA_KEY_IS_DRM = 22;
    public static final int METADATA_KEY_LANGUAGE = 102;
    public static final int METADATA_KEY_LOCATION = 23;
    public static final int METADATA_KEY_MIMETYPE = 12;
    public static final int METADATA_KEY_NUM_AUDIO_TRACKS = 61;
    public static final int METADATA_KEY_NUM_TRACKS = 10;
    public static final int METADATA_KEY_NUM_VIDEO_TRACKS = 51;
    public static final int METADATA_KEY_PROFILE = 104;
    public static final int METADATA_KEY_REAL_8K_VIDEO = 62;
    public static final int METADATA_KEY_REAL_FRAMERATE = 50;
    public static final int METADATA_KEY_SAMPLERATE = 100;
    public static final int METADATA_KEY_TIMED_TEXT_LANGUAGES = 21;
    public static final int METADATA_KEY_TITLE = 7;
    public static final int METADATA_KEY_VIDEO_DURATION = 60;
    public static final int METADATA_KEY_VIDEO_HDR = 52;
    public static final int METADATA_KEY_VIDEO_HEIGHT = 19;
    public static final int METADATA_KEY_VIDEO_ROTATION = 24;
    public static final int METADATA_KEY_VIDEO_WIDTH = 18;
    public static final int METADATA_KEY_WRITER = 11;
    public static final int METADATA_KEY_YEAR = 8;
    public static final int MORUGLASS_EFFECT = 5;
    public static final int MORU_COMGLASS_EFFECT = 11;
    public static final int MORU_PRISMGLASS_EFFECT = 10;
    public static final int PLAYER_END = 4;
    public static final int PLAYER_PAUSE = 3;
    public static final int PLAYER_READY = 1;
    public static final int PLAYER_RUN = 2;
    public static final int PLAYER_UNDEFINED = 0;
    public static final int POOR_BLUR_EFFECT = 9;
    public static final int RECTGLASS_EFFECT = 6;
    private static final String TAG = "FastPlayer";
    public static final int TARGET_SIZE_MICRO_THUMBNAIL = 96;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    private Condition mCondition;
    private boolean mIsPlay;
    private long mLastRenderTime;
    private ReentrantLock mLock;
    private long mMaxFpsTime;
    private long mNativeContext;
    private boolean mNeedPauseRender;
    private String mOutputPath;
    private boolean mPauseRender;
    private boolean mRenderPic;
    private Thread mRenderThread;
    private float[] mSTMatrix;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private boolean mRelease = false;
    private MediaEncoder mMediaEncoder = null;
    private float mFrameRate = 0.0f;
    private int mHeight = 0;
    private int mWidth = 0;
    private int mDataSourceId = -1;
    private Surface mSurfaceInput = null;
    private int mRenderMode = 0;
    private Bitmap mBitmap = null;

    public interface FastPlayerListener {
        int playerModeChange(int i2, int i3);
    }

    static {
        try {
            System.loadLibrary("miffmpeg");
            System.loadLibrary("fastplayer");
            native_init();
        } catch (Throwable th) {
            Log.w(TAG, "Unable to load the library: " + th);
        }
    }

    public FastPlayer() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mLock = reentrantLock;
        this.mCondition = reentrantLock.newCondition();
        this.mIsPlay = false;
        this.mOutputPath = null;
        this.mPauseRender = false;
        this.mRenderPic = false;
        this.mLastRenderTime = -1L;
        this.mMaxFpsTime = 0L;
        this.mNeedPauseRender = false;
        this.mRenderThread = null;
        this.mSurfaceTexture = null;
        this.mSurface = null;
        this.mSTMatrix = new float[16];
        try {
            native_setup();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void HandleDataThread() {
        Thread thread = new Thread(new Runnable() { // from class: com.miui.fastplayer.FastPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = true;
                while (!FastPlayer.this.mRelease) {
                    if (z2) {
                        try {
                            if (FastPlayer.this.mIsPlay) {
                                FastPlayer fastPlayer = FastPlayer.this;
                                fastPlayer.setOpenGLSurface(fastPlayer.mSurfaceInput, FastPlayer.this.mBitmap, FastPlayer.this.mRenderMode);
                                int i2 = FastPlayer.this.gettextureid();
                                Log.e(FastPlayer.TAG, "setSurface textureid: " + i2);
                                FastPlayer.this.mSurfaceTexture = new SurfaceTexture(i2);
                                FastPlayer.this.mSurfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.miui.fastplayer.FastPlayer.1.1
                                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
                                        ReentrantLock reentrantLock;
                                        try {
                                            try {
                                                FastPlayer.this.mLock.lock();
                                                FastPlayer.this.mRenderPic = true;
                                                FastPlayer.this.mCondition.signal();
                                                reentrantLock = FastPlayer.this.mLock;
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                                reentrantLock = FastPlayer.this.mLock;
                                            }
                                            reentrantLock.unlock();
                                        } catch (Throwable th) {
                                            FastPlayer.this.mLock.unlock();
                                            throw th;
                                        }
                                    }
                                });
                                FastPlayer.this.mSurface = new Surface(FastPlayer.this.mSurfaceTexture);
                                FastPlayer fastPlayer2 = FastPlayer.this;
                                fastPlayer2.setSurface(fastPlayer2.mSurface);
                            } else {
                                FastPlayer fastPlayer3 = FastPlayer.this;
                                fastPlayer3.mFrameRate = Float.parseFloat(fastPlayer3.extractMetadata(50, fastPlayer3.mDataSourceId));
                                FastPlayer fastPlayer4 = FastPlayer.this;
                                fastPlayer4.mHeight = Integer.parseInt(fastPlayer4.extractMetadata(19, fastPlayer4.mDataSourceId));
                                FastPlayer fastPlayer5 = FastPlayer.this;
                                fastPlayer5.mWidth = Integer.parseInt(fastPlayer5.extractMetadata(18, fastPlayer5.mDataSourceId));
                                FastPlayer.this.setWaitMode2Player(true);
                                FastPlayer.this.mMediaEncoder = new MediaEncoder();
                                FastPlayer.this.mMediaEncoder.setMediaInfo(FastPlayer.this.mFrameRate, FastPlayer.this.mHeight, FastPlayer.this.mWidth);
                                FastPlayer.this.mMediaEncoder.setFilePath(FastPlayer.this.mOutputPath);
                                Surface surfaceConfigure = FastPlayer.this.mMediaEncoder.configure();
                                FastPlayer fastPlayer6 = FastPlayer.this;
                                fastPlayer6.setOpenGLSurface(surfaceConfigure, fastPlayer6.mBitmap, FastPlayer.this.mRenderMode);
                                int i3 = FastPlayer.this.gettextureid();
                                Log.w(FastPlayer.TAG, "settranscodePath textureid: " + i3);
                                FastPlayer.this.mSurfaceTexture = new SurfaceTexture(i3);
                                FastPlayer.this.mSurfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.miui.fastplayer.FastPlayer.1.2
                                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
                                        FastPlayer.this.mRenderPic = true;
                                    }
                                });
                                FastPlayer.this.mSurface = new Surface(FastPlayer.this.mSurfaceTexture);
                                FastPlayer fastPlayer7 = FastPlayer.this;
                                fastPlayer7.setSurface(fastPlayer7.mSurface);
                                FastPlayer.this.mMediaEncoder.start();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        z2 = false;
                    }
                    try {
                        if (FastPlayer.this.mIsPlay) {
                            FastPlayer.this.mLock.lock();
                            if (FastPlayer.this.mPauseRender && !FastPlayer.this.mRenderPic) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - FastPlayer.this.mLastRenderTime > FastPlayer.this.mMaxFpsTime) {
                                    FastPlayer.this.mLastRenderTime = jCurrentTimeMillis;
                                    FastPlayer fastPlayer8 = FastPlayer.this;
                                    fastPlayer8.renderPicture(fastPlayer8.mSTMatrix);
                                }
                                FastPlayer.this.mPauseRender = false;
                            }
                            if (FastPlayer.this.mRenderPic) {
                                FastPlayer.this.mSurfaceTexture.updateTexImage();
                                FastPlayer.this.mSurfaceTexture.getTransformMatrix(FastPlayer.this.mSTMatrix);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                if (jCurrentTimeMillis2 - FastPlayer.this.mLastRenderTime > FastPlayer.this.mMaxFpsTime) {
                                    FastPlayer.this.mLastRenderTime = jCurrentTimeMillis2;
                                    FastPlayer fastPlayer9 = FastPlayer.this;
                                    fastPlayer9.renderPicture(fastPlayer9.mSTMatrix);
                                }
                                FastPlayer.this.mRenderPic = false;
                            }
                            if (!FastPlayer.this.mRelease) {
                                FastPlayer.this.mCondition.await();
                            }
                            FastPlayer.this.mLock.unlock();
                        } else {
                            if (FastPlayer.this.mPauseRender) {
                                FastPlayer fastPlayer10 = FastPlayer.this;
                                fastPlayer10.renderPicture(fastPlayer10.mSTMatrix);
                                FastPlayer.this.mPauseRender = false;
                            }
                            if (FastPlayer.this.mRenderPic) {
                                FastPlayer.this.mRenderPic = false;
                                FastPlayer.this.mSurfaceTexture.updateTexImage();
                                FastPlayer.this.mSurfaceTexture.getTransformMatrix(FastPlayer.this.mSTMatrix);
                                FastPlayer fastPlayer11 = FastPlayer.this;
                                fastPlayer11.renderPicture(fastPlayer11.mSTMatrix);
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                Log.w(FastPlayer.TAG, "Thread finished");
            }
        });
        this.mRenderThread = thread;
        thread.start();
    }

    private native void _addDataSource(FileDescriptor fileDescriptor, long j2, long j3, int i2, boolean z2) throws IllegalStateException, IOException, IllegalArgumentException;

    private native void _addDataSource(String str, int i2) throws IllegalArgumentException;

    private native void _addDataSource(String str, Map<String, String> map, int i2) throws IllegalArgumentException;

    private native void _addShaderBitmap(Bitmap bitmap, int i2);

    private native void _addShaderSource(String str, int i2) throws IllegalArgumentException;

    private native void _disableShader(boolean z2) throws IllegalArgumentException;

    private native String _extractMetadata(int i2, int i3);

    private native String _extractMetadata(int i2, int i3, int i4);

    private native int _getPlayerMode();

    private final native void _native_finalize();

    private native int _pause();

    private native void _removeDataSource(int i2);

    private native int _seekto(float f2, long j2, int i2);

    private native void _setBlurEffectUniform(float[] fArr, float[] fArr2);

    private native void _setBrightnessEffect(boolean z2) throws IllegalArgumentException;

    private native void _setBrightnessEffectUniform(float[] fArr, float f2, int i2, int i3);

    private native int _setDecoderMode(int i2);

    private native void _setHue(float f2);

    private native int _setLoop(boolean z2, int i2);

    private native void _setMoruGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19);

    private native void _setMoruPrismGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20);

    private native int _setOpenGLSurface(Surface surface, Bitmap bitmap, int i2);

    private native int _setPlayTime(long j2);

    private native int _setPlayerSpeed(float f2, int i2);

    private native void _setPoorBlurEffectUniform(float[] fArr, float f2, int i2, int i3);

    private native void _setRectGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    private native void _setState(float f2);

    private native int _setSurface(Surface surface) throws IllegalStateException;

    private native int _setUseMatrix(float[] fArr);

    private native void _setVideoClipping(long j2, long j3, int i2);

    private native void _setVideoScalingMode(int i2, int i3, int i4);

    private native void _set_callback(FastPlayerListener fastPlayerListener);

    private native int _start();

    /* JADX INFO: Access modifiers changed from: private */
    public native int gettextureid();

    private static native void native_init();

    private native void native_setup();

    private native void nativerelease();

    /* JADX INFO: Access modifiers changed from: private */
    public native int renderPicture(float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void setWaitMode2Player(boolean z2);

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addDataSource(android.content.Context r12, android.net.Uri r13, int r14) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r11 = this;
            java.lang.String r0 = "open fd failed, finally!"
            java.lang.String r1 = "FastPlayer"
            if (r13 == 0) goto L80
            r2 = 0
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r2 = r12.openAssetFileDescriptor(r13, r3)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            if (r2 != 0) goto L21
            java.lang.String r12 = "open fd failed, fd is NULL!"
            android.util.Log.d(r1, r12)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L20
            r2.close()
        L20:
            return
        L21:
            long r3 = r2.getDeclaredLength()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            r5 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 >= 0) goto L3a
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            r5 = 0
            r7 = -1
            r10 = 1
            r3 = r11
            r9 = r14
            r3._addDataSource(r4, r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            goto L4c
        L3a:
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            long r5 = r2.getStartOffset()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            long r7 = r2.getDeclaredLength()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
            r10 = 1
            r3 = r11
            r9 = r14
            r3._addDataSource(r4, r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.lang.SecurityException -> L60
        L4c:
            android.util.Log.d(r1, r0)
            r2.close()
            return
        L53:
            r12 = move-exception
            goto L77
        L55:
            java.lang.String r12 = "open fd failed, IOException!"
            android.util.Log.d(r1, r12)     // Catch: java.lang.Throwable -> L53
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L6d
            goto L6a
        L60:
            java.lang.String r12 = "open fd failed, SecurityException!"
            android.util.Log.d(r1, r12)     // Catch: java.lang.Throwable -> L53
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L6d
        L6a:
            r2.close()
        L6d:
            java.lang.String r12 = r13.toString()
            r11.addDataSource(r12, r14)
            r11.mDataSourceId = r14
            return
        L77:
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L7f
            r2.close()
        L7f:
            throw r12
        L80:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.fastplayer.FastPlayer.addDataSource(android.content.Context, android.net.Uri, int):void");
    }

    public int addShaderBitmap(Context context, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i2, options);
        if (bitmapDecodeResource == null) {
            Log.i(TAG, "decode bitmap failed");
            return -1;
        }
        addShaderBitmap(bitmapDecodeResource, i3);
        bitmapDecodeResource.recycle();
        return 0;
    }

    public void addShaderSource(Context context, int i2, int i3) throws IOException, SecurityException {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i3);
            if (inputStreamOpenRawResource == null) {
                throw new SecurityException("can not get InputStream");
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "UTF-8"));
            String str = "";
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str = (str + line) + "\n";
                } catch (IOException unused) {
                    throw new IOException("IOException occurred");
                }
            }
            if (str == null) {
                throw new SecurityException("read shader source failed");
            }
            addShaderSource(str, i2);
        } catch (UnsupportedEncodingException unused2) {
            throw new UnsupportedEncodingException("UnsupportedEncodingException occrred");
        }
    }

    public void disableShader(boolean z2) {
        _disableShader(z2);
    }

    public String extractMetadata(int i2, int i3) {
        try {
            return _extractMetadata(i2, i3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public int getPlayerMode() {
        try {
            return _getPlayerMode();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void native_finalize() {
        _native_finalize();
    }

    public int pause() {
        try {
            return _pause();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void pauseRenderFrame() {
        if (!this.mRelease && this.mNeedPauseRender) {
            this.mPauseRender = true;
            try {
                try {
                    this.mLock.lock();
                    this.mCondition.signal();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void release() {
        this.mRelease = true;
        try {
            try {
                this.mLock.lock();
                this.mCondition.signal();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.mLock.unlock();
            Thread thread = this.mRenderThread;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                this.mRenderThread = null;
            }
            nativerelease();
            MediaEncoder mediaEncoder = this.mMediaEncoder;
            if (mediaEncoder != null) {
                mediaEncoder.stop();
                this.mMediaEncoder.release();
            }
            Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void removeDataSource(int i2) {
        try {
            _removeDataSource(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int seekto(float f2, long j2, int i2) {
        try {
            return _seekto(f2, j2, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void setBlurEffectUniform(float[] fArr, float[] fArr2) {
        try {
            _setBlurEffectUniform(fArr, fArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBrightnessEffect(boolean z2) {
        try {
            _setBrightnessEffect(z2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBrightnessEffectUniform(float[] fArr, float f2, int i2, int i3) {
        try {
            _setBrightnessEffectUniform(fArr, f2, i2, i3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCallback(FastPlayerListener fastPlayerListener) {
        set_callback(fastPlayerListener);
    }

    public int setDecoderMode(int i2) {
        try {
            return _setDecoderMode(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void setHue(float f2) {
        try {
            _setHue(f2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int setLoop(boolean z2, int i2) {
        try {
            return _setLoop(z2, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void setMaxFps(int i2) {
        if (i2 > 0) {
            this.mNeedPauseRender = true;
            this.mMaxFpsTime = 1000 / i2;
        } else {
            this.mNeedPauseRender = false;
            this.mMaxFpsTime = 0L;
        }
    }

    public void setMoruComGlassEffectUniform(float f2, float f3, float f4, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        if (fArr.length != 4 || fArr2.length != 4 || fArr3.length != 4 || fArr4.length != 2 || fArr5.length != 2) {
            Log.e(TAG, "sMoruPrismGlass, Array input error, please check it");
            return;
        }
        try {
            setMoruPrismGlassEffectUniform(f2, f3, f4, fArr[0], fArr[1], fArr[2], fArr[3], fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr4[0], fArr4[1], fArr5[0], fArr5[1]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setMoruGlassEffectUniform(float f2, float f3, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        if (fArr.length != 4 || fArr2.length != 4 || fArr3.length != 4 || fArr4.length != 2 || fArr5.length != 2) {
            Log.e(TAG, " Array input error, please check it");
            return;
        }
        try {
            setMoruGlassEffectUniform(f2, f3, fArr[0], fArr[1], fArr[2], fArr[3], fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr4[0], fArr4[1], fArr5[0], fArr5[1]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setMoruPrismGlassEffectUniform(float f2, float f3, float f4, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        if (fArr.length != 4 || fArr2.length != 4 || fArr3.length != 4 || fArr4.length != 2 || fArr5.length != 2) {
            Log.e(TAG, "sMoruPrismGlass, Array input error, please check it");
            return;
        }
        try {
            setMoruPrismGlassEffectUniform(f2, f3, f4, fArr[0], fArr[1], fArr[2], fArr[3], fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr4[0], fArr4[1], fArr5[0], fArr5[1]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int setOpenGLSurface(Surface surface, Bitmap bitmap, int i2) {
        try {
            _setOpenGLSurface(surface, bitmap, i2);
            return -1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public int setPlayTime(long j2) {
        try {
            return _setPlayTime(j2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public int setPlayerSpeed(float f2, int i2) {
        try {
            return _setPlayerSpeed(f2, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void setPoorBlurEffectUniform(float[] fArr, float f2, int i2, int i3) {
        try {
            _setPoorBlurEffectUniform(fArr, f2, i2, i3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setRectGlassEffectUniform(float[] fArr, float[] fArr2) {
        if (fArr.length != 4 || fArr2.length != 4) {
            Log.e(TAG, " Array input error, please check it");
            return;
        }
        try {
            _setRectGlassEffectUniform(fArr[0], fArr[1], fArr[2], fArr[3], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setState(float f2) {
        try {
            _setState(f2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setSurface(Surface surface, int i2) {
        try {
            setSurface(surface, i2, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setTranscodePath(String str, int i2, Bitmap bitmap) {
        this.mOutputPath = str;
        this.mRenderMode = i2;
        this.mBitmap = bitmap;
        HandleDataThread();
    }

    public void setUseMatrix(float[] fArr) {
        _setUseMatrix(fArr);
    }

    public void setVideoClipping(long j2, long j3, int i2) {
        _setVideoClipping(j2, j3, i2);
    }

    public void setVideoScalingMode(int i2) {
        try {
            int i3 = Integer.parseInt(extractMetadata(24, 0));
            int i4 = Integer.parseInt(extractMetadata(18, 0));
            int i5 = Integer.parseInt(extractMetadata(19, 0));
            Log.d(TAG, "setVideoScalingMode, mode: " + i2 + ", rotation: " + i3 + ", width: " + i4 + ", height: " + i5);
            if (i3 == 90 || i3 == 270) {
                _setVideoScalingMode(i2, i5, i4);
            } else {
                _setVideoScalingMode(i2, i4, i5);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void set_callback(FastPlayerListener fastPlayerListener) {
        try {
            _set_callback(fastPlayerListener);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int start() {
        try {
            this.mPauseRender = false;
            return _start();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public String extractMetadata(int i2, int i3, int i4) {
        try {
            return _extractMetadata(i2, i3, i4);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public void setSurface(Surface surface, int i2, Bitmap bitmap) {
        if (surface == null) {
            return;
        }
        this.mSurfaceInput = surface;
        this.mRenderMode = i2;
        this.mBitmap = bitmap;
        this.mIsPlay = true;
        HandleDataThread();
    }

    private void setMoruPrismGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        try {
            _setMoruPrismGlassEffectUniform(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setMoruGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        try {
            _setMoruGlassEffectUniform(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setRectGlassEffectUniform(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        try {
            _setRectGlassEffectUniform(f2, f3, f4, f5, f6, f7, f8, f9);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void addShaderBitmap(Bitmap bitmap, int i2) {
        try {
            _addShaderBitmap(bitmap, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int setSurface(Surface surface) {
        if (surface == null) {
            return -1;
        }
        try {
            return _setSurface(surface);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public void addShaderSource(String str, int i2) {
        try {
            _addShaderSource(str, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void addDataSource(FileDescriptor fileDescriptor, int i2) throws IllegalStateException, IOException, IllegalArgumentException {
        addDataSource(fileDescriptor, 0L, -1L, i2);
        this.mDataSourceId = i2;
    }

    public void addDataSource(FileDescriptor fileDescriptor, long j2, long j3, int i2) throws IllegalStateException, IOException, IllegalArgumentException {
        _addDataSource(fileDescriptor, j2, j3, i2, false);
        this.mDataSourceId = i2;
    }

    public void addDataSource(String str, Map<String, String> map, int i2) throws IllegalArgumentException {
        _addDataSource(str, map, i2);
        this.mDataSourceId = i2;
    }

    public void addDataSource(String str, int i2) {
        try {
            _addDataSource(str, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
