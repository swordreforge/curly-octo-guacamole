package com.android.thememanager.h5.webcache;

import android.util.Log;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.controller.online.zurt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import miuix.core.util.f7l8;

/* JADX INFO: compiled from: WebContentDownloader.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final CopyOnWriteArraySet<String> f60319f7l8;

    /* JADX INFO: renamed from: g */
    public static final int f12264g;

    /* JADX INFO: renamed from: k */
    static final String f12265k = "WebContentDownloader";

    /* JADX INFO: renamed from: n */
    public static final int f12266n;

    /* JADX INFO: renamed from: q */
    static final long f12267q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final int f60320toq = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int f60321zy = 8192;

    /* JADX INFO: renamed from: com.android.thememanager.h5.webcache.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebContentDownloader.java */
    static class C7922toq {
        C7922toq() {
        }

        /* JADX INFO: renamed from: k */
        public static void m7979k(String tag, String format, Object... args) {
            if (bf2.toq.m5812n()) {
                Log.d(tag, String.format(format, args));
            }
        }

        public static void toq(String tag, String format, Object... args) {
            Log.e(tag, String.format(format, args));
        }

        public static void zy(String tag, String format, Object... args) {
            if (bf2.toq.m5812n()) {
                Log.w(tag, String.format(format, args));
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f12267q = timeUnit.toMillis(1L);
        f12266n = (int) timeUnit.toMillis(6L);
        f12264g = (int) timeUnit.toMillis(4L);
        f60319f7l8 = new CopyOnWriteArraySet<>();
    }

    /* JADX INFO: renamed from: k */
    public static InputStream m7977k(String strUrl, String path) {
        return new C2073k(strUrl, path);
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.webcache.toq$k */
    /* JADX INFO: compiled from: WebContentDownloader.java */
    static class C2073k extends InputStream {

        /* JADX INFO: renamed from: k */
        InputStream f12268k;

        /* JADX INFO: renamed from: n */
        String f12269n;

        /* JADX INFO: renamed from: q */
        String f12270q;

        public C2073k(final String url, String path) {
            this.f12270q = url;
            this.f12269n = path;
        }

        /* JADX INFO: renamed from: k */
        private void m7978k() {
            if (this.f12268k == null) {
                if (!new File(this.f12269n).exists()) {
                    new com.android.thememanager.controller.online.toq(this.f12269n).zy(zurt.EnumC1946k.FILE_PROXY, new PathEntry(this.f12269n, this.f12270q));
                }
                if (new File(this.f12269n).exists()) {
                    try {
                        this.f12268k = new FileInputStream(this.f12269n);
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            C7922toq.m7979k(toq.f12265k, "InputStreamProxy, close", new Object[0]);
            f7l8.toq(this.f12268k);
            this.f12268k = null;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m7978k();
            InputStream inputStream = this.f12268k;
            if (inputStream == null) {
                return -1;
            }
            try {
                return inputStream.read();
            } catch (Exception e2) {
                C7922toq.toq(toq.f12265k, "InputStreamProxy.read failed, url = %s, %s", this.f12270q, e2);
                return -1;
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] b2) throws IOException {
            m7978k();
            InputStream inputStream = this.f12268k;
            if (inputStream == null) {
                return -1;
            }
            try {
                return inputStream.read(b2);
            } catch (Exception e2) {
                C7922toq.toq(toq.f12265k, "InputStreamProxy.read buffer failed, url = %s, %s", this.f12270q, e2);
                return -1;
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
            m7978k();
            InputStream inputStream = this.f12268k;
            if (inputStream == null) {
                return -1;
            }
            try {
                return inputStream.read(buffer, byteOffset, byteCount);
            } catch (Exception e2) {
                C7922toq.toq(toq.f12265k, "InputStreamProxy.read buffer failed, url = %s, %s", this.f12270q, e2);
                return -1;
            }
        }
    }
}
