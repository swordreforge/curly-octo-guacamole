package com.android.thememanager.controller.online;

import android.net.Uri;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.z */
/* JADX INFO: compiled from: ThemeConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1945z {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f57976kja0 = 20000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f57977n7h = 20000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f57978f7l8;

    /* JADX INFO: renamed from: k */
    private URL f11044k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private OutputStream f57979ld6;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private toq f57980qrj;

    /* JADX INFO: renamed from: s */
    private String f11048s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57981toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f57982x2;

    /* JADX INFO: renamed from: y */
    private int f11049y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f57983zy = false;

    /* JADX INFO: renamed from: q */
    private String f11047q = "";

    /* JADX INFO: renamed from: n */
    private Map<String, String> f11045n = null;

    /* JADX INFO: renamed from: g */
    private boolean f11043g = false;

    /* JADX INFO: renamed from: p */
    private boolean f11046p = false;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.z$k */
    /* JADX INFO: compiled from: ThemeConnection.java */
    class k implements HostnameVerifier {
        k() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String hostname, SSLSession session) {
            if (TextUtils.isEmpty(hostname)) {
                return false;
            }
            Uri uri = Uri.parse(hostname);
            if (com.android.thememanager.basemodule.utils.mcp.m7140q(uri) || com.android.thememanager.basemodule.utils.mcp.m7137g(uri)) {
                return true;
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(hostname, session);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.z$toq */
    /* JADX INFO: compiled from: ThemeConnection.java */
    interface toq {
        InputStream wrap(InputStream is);
    }

    C1945z() {
    }

    private void f7l8() throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) this.f11044k.openConnection();
            try {
                httpURLConnection.setConnectTimeout(com.android.thememanager.lockscreen.lock.wallpaper.kja0.f60389kja0);
                httpURLConnection.setReadTimeout(com.android.thememanager.lockscreen.lock.wallpaper.kja0.f60389kja0);
                if (!TextUtils.isEmpty(this.f57981toq) && !TextUtils.equals(this.f57981toq, this.f11044k.getHost()) && (httpURLConnection instanceof HttpsURLConnection)) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                    httpsURLConnection.setRequestProperty(com.google.common.net.zy.f68570zurt, this.f57981toq);
                    httpsURLConnection.setHostnameVerifier(new k());
                }
                if (this.f57983zy) {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                } else {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoOutput(false);
                }
                Map<String, String> map = this.f11045n;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, this.f11045n.get(str));
                    }
                }
                if (this.f11043g) {
                    httpURLConnection.setRequestProperty(com.google.common.net.zy.f68571zy, "application/gzip");
                    httpURLConnection.setRequestProperty(com.google.common.net.zy.f68552uv6, "gzip");
                }
                httpURLConnection.connect();
                if (this.f57983zy && !TextUtils.isEmpty(this.f11047q)) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(this.f11047q.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
                m7650g(httpURLConnection);
                httpURLConnection.disconnect();
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7650g(java.net.HttpURLConnection r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r6.getResponseCode()
            r5.f57978f7l8 = r0
            java.lang.String r0 = r6.getResponseMessage()
            r5.f11048s = r0
            int r0 = r6.getContentLength()
            r5.f11049y = r0
            int r0 = r5.f57978f7l8
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r0 == 0) goto L3b
            com.android.thememanager.controller.online.z$toq r6 = r5.f57980qrj     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            if (r6 == 0) goto L3b
            java.io.InputStream r3 = r6.wrap(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L3b
            goto L3b
        L33:
            r6 = move-exception
            r0 = r2
            r2 = r3
            goto L69
        L37:
            r6 = move-exception
            r0 = r2
            goto L69
        L3a:
            r3 = r2
        L3b:
            if (r3 == 0) goto L74
            if (r0 == 0) goto L44
            java.io.OutputStream r6 = r5.f57979ld6     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L44
            goto L49
        L44:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L33
            r6.<init>()     // Catch: java.lang.Throwable -> L33
        L49:
            r2 = r6
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r6]     // Catch: java.lang.Throwable -> L33
        L4e:
            int r4 = r3.read(r0, r1, r6)     // Catch: java.lang.Throwable -> L33
            if (r4 <= 0) goto L58
            r2.write(r0, r1, r4)     // Catch: java.lang.Throwable -> L33
            goto L4e
        L58:
            r2.flush()     // Catch: java.lang.Throwable -> L33
            java.io.OutputStream r6 = r5.f57979ld6     // Catch: java.lang.Throwable -> L33
            if (r2 == r6) goto L74
            r6 = r2
            java.io.ByteArrayOutputStream r6 = (java.io.ByteArrayOutputStream) r6     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L33
            r5.f57982x2 = r6     // Catch: java.lang.Throwable -> L33
            goto L74
        L69:
            com.android.thememanager.basemodule.utils.y9n.m7246g(r2)
            java.io.OutputStream r1 = r5.f57979ld6
            if (r0 == r1) goto L73
            com.android.thememanager.basemodule.utils.y9n.m7246g(r0)
        L73:
            throw r6
        L74:
            com.android.thememanager.basemodule.utils.y9n.m7246g(r3)
            java.io.OutputStream r6 = r5.f57979ld6
            if (r2 == r6) goto L7e
            com.android.thememanager.basemodule.utils.y9n.m7246g(r2)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.online.C1945z.m7650g(java.net.HttpURLConnection):void");
    }

    /* JADX INFO: renamed from: k */
    int m7651k() throws Throwable {
        m7656y();
        return this.f57978f7l8;
    }

    void kja0(boolean usePost) {
        this.f57983zy = usePost;
    }

    void ld6(OutputStream os) {
        this.f57979ld6 = os;
    }

    /* JADX INFO: renamed from: n */
    String m7652n() {
        return this.f11044k.toString();
    }

    void n7h(String urlString) {
        try {
            this.f11044k = new URL(urlString);
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException(" invalid url error: " + urlString);
        }
    }

    /* JADX INFO: renamed from: p */
    void m7653p(String hostName) {
        this.f57981toq = hostName;
    }

    /* JADX INFO: renamed from: q */
    String m7654q() throws Throwable {
        m7656y();
        return this.f11048s;
    }

    void qrj(toq w2) {
        this.f57980qrj = w2;
    }

    /* JADX INFO: renamed from: s */
    void m7655s(Map<String, String> header) {
        this.f11045n = header;
    }

    String toq() throws Throwable {
        m7656y();
        String str = this.f57982x2;
        return str != null ? str : "";
    }

    void x2(String postBody) {
        this.f11047q = postBody;
    }

    /* JADX INFO: renamed from: y */
    void m7656y() throws Throwable {
        if (this.f11046p) {
            return;
        }
        this.f11046p = true;
        f7l8();
    }

    int zy() throws Throwable {
        m7656y();
        return this.f11049y;
    }

    C1945z(String urlString) {
        n7h(urlString);
    }
}
