package com.miui.maml.util;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaDataSource;
import android.os.AsyncTask;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.android.thememanager.clockmessage.model.C1873k;
import com.miui.maml.ResourceManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 23)
public class MamlMediaDataSource extends MediaDataSource {
    private static final int MAX_VIDEO_SIZE = 52428800;
    private static final int MEMORY_THRESHOLD = 104857600;
    private static final String TAG = "MamlMediaDataSource";
    private Context mContext;
    private long mCurrentPosition;
    private MemoryFile mFile;
    private ResourceManager mManager;
    private String mPath;
    private long mSize;
    private InputStream mStream;
    private boolean mSupportMark;
    private final Object mLock = new Object();
    private ComponentCallbacks2 mComponentCallback = new ComponentCallbacks2() { // from class: com.miui.maml.util.MamlMediaDataSource.1
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@lvui Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            MamlMediaDataSource.this.releaseMemoryFile();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
            if (i2 >= 10) {
                MamlMediaDataSource.this.releaseMemoryFile();
            }
        }
    };

    private static class MemoryFileAsyncTask extends AsyncTask<Void, Void, Void> {
        private String mFilePath;
        private ResourceManager mManager;
        private MamlMediaDataSource mSource;

        public MemoryFileAsyncTask(String str, ResourceManager resourceManager, MamlMediaDataSource mamlMediaDataSource) {
            this.mFilePath = str;
            this.mManager = resourceManager;
            this.mSource = mamlMediaDataSource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            MamlMediaDataSource mamlMediaDataSource;
            ResourceManager resourceManager = this.mManager;
            if (resourceManager == null || (mamlMediaDataSource = this.mSource) == null) {
                return null;
            }
            mamlMediaDataSource.setMemoryFile(resourceManager.getFile(this.mFilePath));
            return null;
        }
    }

    public MamlMediaDataSource(Context context, ResourceManager resourceManager, String str) {
        this.mContext = context;
        this.mManager = resourceManager;
        this.mPath = str;
        init();
        try {
            this.mContext.registerComponentCallbacks(this.mComponentCallback);
        } catch (Exception unused) {
        }
    }

    private void closeStream() {
        synchronized (this.mLock) {
            InputStream inputStream = this.mStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                this.mStream = null;
            }
        }
    }

    private void generateMemoryFile() {
        if (this.mFile != null) {
            return;
        }
        new MemoryFileAsyncTask(this.mPath, this.mManager, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void init() {
        if (TextUtils.isEmpty(this.mPath)) {
            return;
        }
        synchronized (this.mLock) {
            long[] jArr = new long[1];
            InputStream inputStream = this.mManager.getInputStream(this.mPath, jArr);
            this.mStream = inputStream;
            this.mSize = jArr[0];
            if (inputStream != null) {
                boolean zMarkSupported = inputStream.markSupported();
                this.mSupportMark = zMarkSupported;
                if (zMarkSupported) {
                    this.mStream.mark(Integer.MAX_VALUE);
                }
                tryToGenerateMemoryFile();
            }
        }
    }

    private boolean isFileSizeValid() {
        return this.mSize < 52428800;
    }

    private boolean isMemoryEnough() {
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService(C1873k.f10652g);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return !memoryInfo.lowMemory && memoryInfo.availMem - memoryInfo.threshold > 104857600;
    }

    private boolean resetStream() {
        InputStream inputStream = this.mStream;
        if (inputStream == null) {
            return false;
        }
        if (this.mSupportMark) {
            try {
                inputStream.reset();
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            try {
                inputStream.close();
                this.mStream = this.mManager.getInputStream(this.mPath, new long[1]);
            } catch (IOException e3) {
                e3.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryFile(MemoryFile memoryFile) {
        synchronized (this.mLock) {
            this.mFile = memoryFile;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeStream();
        releaseMemoryFile();
        try {
            this.mContext.unregisterComponentCallbacks(this.mComponentCallback);
        } catch (Exception unused) {
        }
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public String getPath() {
        return this.mPath;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.mSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    @Override // android.media.MediaDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readAt(long r8, byte[] r10, int r11, int r12) {
        /*
            r7 = this;
            android.os.MemoryFile r0 = r7.mFile
            if (r0 != 0) goto Lb
            java.io.InputStream r0 = r7.mStream
            if (r0 != 0) goto Lb
            r7.init()
        Lb:
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            android.os.MemoryFile r1 = r7.mFile     // Catch: java.lang.Throwable -> L80
            r2 = 0
            if (r1 == 0) goto L4c
            long r3 = (long) r12
            long r3 = r3 + r8
            long r5 = r7.mSize     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L34
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 >= 0) goto L2b
            java.lang.String r12 = "MamlMediaDataSource"
            java.lang.String r1 = "readAt: position+size is larger than file size, read left data"
            com.miui.maml.util.MamlLog.m17854w(r12, r1)     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            long r3 = r7.mSize     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            long r3 = r3 - r8
            int r12 = (int) r3     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            goto L34
        L2b:
            java.lang.String r8 = "MamlMediaDataSource"
            java.lang.String r9 = "readAt: position is larger than file size, return 0"
            com.miui.maml.util.MamlLog.m17854w(r8, r9)     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r2
        L34:
            android.os.MemoryFile r1 = r7.mFile     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            int r3 = (int) r8     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            int r2 = r1.readBytes(r10, r3, r11, r12)     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> L4a java.lang.Throwable -> L80
            goto L78
        L3c:
            r8 = move-exception
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L80
            android.os.MemoryFile r8 = r7.mFile     // Catch: java.lang.Throwable -> L80
            r8.close()     // Catch: java.lang.Throwable -> L80
            r8 = 0
            r7.mFile = r8     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r2
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r2
        L4c:
            java.io.InputStream r1 = r7.mStream     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L78
            long r3 = r7.mCurrentPosition     // Catch: java.lang.Throwable -> L80
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 <= 0) goto L60
            boolean r1 = r7.resetStream()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L5e
            r3 = r8
            goto L62
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r2
        L60:
            long r3 = r8 - r3
        L62:
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6d
            java.io.InputStream r1 = r7.mStream     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r1.skip(r3)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
        L6d:
            java.io.InputStream r1 = r7.mStream     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            int r2 = r1.read(r10, r11, r12)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            goto L78
        L74:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L80
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            if (r2 <= 0) goto L7f
            long r10 = (long) r2
            long r8 = r8 + r10
            r7.mCurrentPosition = r8
        L7f:
            return r2
        L80:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.util.MamlMediaDataSource.readAt(long, byte[], int, int):int");
    }

    public void releaseMemoryFile() {
        synchronized (this.mLock) {
            MemoryFile memoryFile = this.mFile;
            if (memoryFile != null) {
                memoryFile.close();
                this.mFile = null;
            }
        }
    }

    public void tryToGenerateMemoryFile() {
        if (this.mFile == null && (this.mStream instanceof InflaterInputStream) && isMemoryEnough() && isFileSizeValid()) {
            generateMemoryFile();
        }
    }
}
