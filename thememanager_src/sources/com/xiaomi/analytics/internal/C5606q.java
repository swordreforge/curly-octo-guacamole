package com.xiaomi.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.analytics.Analytics;
import com.xiaomi.analytics.internal.util.C5609k;
import com.xiaomi.analytics.internal.util.C5610n;
import com.xiaomi.analytics.internal.util.C5611p;
import com.xiaomi.analytics.internal.util.C5614y;
import com.xiaomi.analytics.internal.util.f7l8;
import com.xiaomi.analytics.internal.util.kja0;
import com.xiaomi.analytics.internal.util.ld6;
import com.xiaomi.analytics.internal.util.n7h;
import com.xiaomi.analytics.internal.util.qrj;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Random;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.q */
/* JADX INFO: compiled from: UpdateManager.java */
/* JADX INFO: loaded from: classes3.dex */
class C5606q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f73036cdj = "cv";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f73037fn3e = "d";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f73038fu4 = "f";

    /* JADX INFO: renamed from: h */
    private static final String f31174h = "av";

    /* JADX INFO: renamed from: i */
    private static final String f31175i = "m";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f73039ki = "p";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f73040kja0 = "updateTime";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f73041ld6 = "https://sdkconfig.ad.intl.xiaomi.com/api/checkupdate/lastusefulversion2?";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f73042n7h = "analytics_updater";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f73043ni7 = "v";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f73044o1t = "nonce";

    /* JADX INFO: renamed from: p */
    private static final String f31176p = "https://sdkconfig.ad.xiaomi.com/api/checkupdate/lastusefulversion2?";

    /* JADX INFO: renamed from: s */
    private static final String f31177s = "UpdateManager";

    /* JADX INFO: renamed from: t */
    private static volatile C5606q f31178t = null;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f73046t8r = "r";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f73047wvg = "miui_sdkconfig_jafej!@#)(*e@!#";

    /* JADX INFO: renamed from: z */
    private static final String f31179z = "ts";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f73049zurt = "n";

    /* JADX INFO: renamed from: g */
    private q f31180g;

    /* JADX INFO: renamed from: k */
    private Context f31181k;

    /* JADX INFO: renamed from: n */
    private int f31182n;

    /* JADX INFO: renamed from: q */
    private String f31183q;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f73048x2 = n7h.f73062zy;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final long f73045qrj = ((long) n7h.f73061toq) * 30;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73051toq = "";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73052zy = "";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Runnable f73050f7l8 = new k();

    /* JADX INFO: renamed from: y */
    private Runnable f31184y = new zy();

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$k */
    /* JADX INFO: compiled from: UpdateManager.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UpdateManager.java */
        class C8034k implements HostnameVerifier {
            C8034k() {
            }

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                try {
                    URL url = new URL(C5606q.f31176p);
                    URL url2 = new URL(C5606q.f73041ld6);
                    if (!url.getHost().equals(str) && !url2.getHost().equals(str)) {
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                    }
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
        }

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C5605n c5605n;
            C5605n c5605n2;
            int i2;
            k kVar;
            String str2;
            String str3;
            HttpsURLConnection httpsURLConnection;
            String strOptString;
            long j2;
            long jCurrentTimeMillis;
            k kVar2 = this;
            String str4 = C5606q.f73043ni7;
            String str5 = C5606q.f31177s;
            C5605n c5605n3 = C5604k.f31167k;
            C5605n c5605nD2ok = com.xiaomi.analytics.internal.zy.fti(C5606q.this.f31181k).d2ok();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 2) {
                    return;
                }
                try {
                    String qVar = ld6.toq();
                    String strM19249q = ld6.m19249q();
                    String strZy = ld6.zy();
                    int iZy = C5611p.zy(C5606q.this.f31181k);
                    String strM19225i = C5606q.this.m19225i();
                    String packageName = C5606q.this.f31181k.getPackageName();
                    String strF7l8 = ld6.f7l8();
                    String strM19248n = ld6.m19248n();
                    i2 = i4;
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            String str6 = str5;
                            try {
                                sb2.append("av");
                                sb2.append(c5605n3);
                                sb.append(sb2.toString());
                                sb.append(C5606q.f73036cdj + c5605nD2ok);
                                sb.append("d" + qVar);
                                sb.append(C5606q.f73038fu4 + strM19249q);
                                sb.append(C5606q.f31175i + strZy);
                                sb.append(C5606q.f73049zurt + iZy);
                                sb.append(C5606q.f73044o1t + strM19225i);
                                sb.append("p" + packageName);
                                sb.append(C5606q.f73046t8r + strF7l8);
                                sb.append(C5606q.f31179z + jCurrentTimeMillis2);
                                sb.append(str4 + strM19248n);
                                sb.append(C5606q.f73047wvg);
                                String strM19245k = kja0.m19245k(sb.toString());
                                StringBuilder sb3 = new StringBuilder(C5614y.m19261q() ? C5606q.f73041ld6 : C5606q.f31176p);
                                StringBuilder sb4 = new StringBuilder();
                                str3 = str4;
                                try {
                                    sb4.append("av=");
                                    sb4.append(c5605n3);
                                    sb3.append(sb4.toString());
                                    sb3.append("&cv=" + c5605nD2ok);
                                    sb3.append("&d=" + qVar);
                                    sb3.append("&f=" + strM19249q);
                                    sb3.append("&m=" + strZy);
                                    sb3.append("&n=" + iZy);
                                    sb3.append("&nonce=" + strM19225i);
                                    sb3.append("&p=" + packageName);
                                    sb3.append("&r=" + strF7l8);
                                    sb3.append("&ts=" + jCurrentTimeMillis2);
                                    sb3.append("&v=" + strM19248n);
                                    sb3.append("&sign=" + strM19245k);
                                    str2 = str6;
                                    try {
                                        C5609k.toq(str2, sb3.toString());
                                        httpsURLConnection = (HttpsURLConnection) new URL(sb3.toString()).openConnection();
                                        kVar = this;
                                    } catch (Exception e2) {
                                        e = e2;
                                        kVar = this;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    kVar = this;
                                    str2 = str6;
                                    str = str3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str = str4;
                                c5605n2 = c5605nD2ok;
                                str2 = str6;
                                kVar = this;
                                c5605n = c5605n3;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = str4;
                            str2 = str5;
                            c5605n = c5605n3;
                            c5605n2 = c5605nD2ok;
                            kVar = this;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str = str4;
                        c5605n = c5605n3;
                        c5605n2 = c5605nD2ok;
                        kVar = kVar2;
                        str2 = str5;
                        C5606q.this.fu4(0L);
                        C5609k.m19241n(str2, "exception ", e);
                        str5 = str2;
                        kVar2 = kVar;
                        str4 = str;
                        i3 = i2;
                        c5605n3 = c5605n;
                        c5605nD2ok = c5605n2;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str = str4;
                    c5605n = c5605n3;
                    c5605n2 = c5605nD2ok;
                    i2 = i4;
                }
                try {
                    SSLSocketFactory sSLSocketFactoryCdj = C5606q.this.cdj();
                    if (sSLSocketFactoryCdj != null) {
                        httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryCdj);
                    }
                    httpsURLConnection.setHostnameVerifier(kVar.new C8034k());
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setConnectTimeout(C5604k.f73033f7l8);
                    httpsURLConnection.connect();
                    String str7 = new String(f7l8.toq(httpsURLConnection.getInputStream()));
                    C5609k.toq(str2, "result " + str7);
                    JSONObject jSONObject = new JSONObject(str7);
                    String strOptString2 = jSONObject.optString("url");
                    int iOptInt = jSONObject.optInt("code", 0);
                    str = str3;
                    try {
                        strOptString = jSONObject.optString(str);
                        C5606q.this.f31182n = jSONObject.optInt("force", 0);
                        long jOptInt = jSONObject.optInt("delay", 0);
                        if (jOptInt == 0) {
                            j2 = C5606q.f73048x2;
                        } else {
                            j2 = jOptInt * 1000;
                            if (j2 < C5606q.f73048x2) {
                                j2 = C5606q.f73048x2;
                            } else if (j2 > C5606q.f73045qrj) {
                                j2 = C5606q.f73045qrj;
                            }
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        c5605n = c5605n3;
                        c5605n2 = c5605nD2ok;
                    } catch (Exception e9) {
                        e = e9;
                        c5605n = c5605n3;
                        c5605n2 = c5605nD2ok;
                        C5606q.this.fu4(0L);
                        C5609k.m19241n(str2, "exception ", e);
                        str5 = str2;
                        kVar2 = kVar;
                        str4 = str;
                        i3 = i2;
                        c5605n3 = c5605n;
                        c5605nD2ok = c5605n2;
                    }
                    try {
                        C5606q.this.fu4(jCurrentTimeMillis + j2);
                        C5609k.toq(str2, "saved, now=" + jCurrentTimeMillis + ", nextCheckTimeDelay=" + j2);
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                            C5605n c5605n4 = new C5605n(strOptString);
                            if (C5614y.m19259k() || c5605n4.f31172n == 0) {
                                C5606q.this.f73052zy = jSONObject.optString(InterfaceC1925p.pstq);
                                C5606q.this.f73051toq = strOptString2;
                                qrj.m19254k(C5606q.this.f31184y);
                                return;
                            }
                            return;
                        }
                        if (iOptInt != -8) {
                            return;
                        } else {
                            jCurrentTimeMillis2 = C5606q.this.ni7(jSONObject.optString("failMsg"));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        C5606q.this.fu4(0L);
                        C5609k.m19241n(str2, "exception ", e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    c5605n = c5605n3;
                    str = str3;
                    c5605n2 = c5605nD2ok;
                    C5606q.this.fu4(0L);
                    C5609k.m19241n(str2, "exception ", e);
                    str5 = str2;
                    kVar2 = kVar;
                    str4 = str;
                    i3 = i2;
                    c5605n3 = c5605n;
                    c5605nD2ok = c5605n2;
                }
                str5 = str2;
                kVar2 = kVar;
                str4 = str;
                i3 = i2;
                c5605n3 = c5605n;
                c5605nD2ok = c5605n2;
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$q */
    /* JADX INFO: compiled from: UpdateManager.java */
    interface q {
        /* JADX INFO: renamed from: k */
        void mo19234k(String str, boolean z2);
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$toq */
    /* JADX INFO: compiled from: UpdateManager.java */
    class toq implements X509TrustManager {

        /* JADX INFO: renamed from: k */
        X509TrustManager f31187k;

        toq() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (this.f31187k == null) {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f31187k = (X509TrustManager) trustManager;
                        }
                    }
                } catch (KeyStoreException e2) {
                    e2.printStackTrace();
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                }
            }
            X509TrustManager x509TrustManager = this.f31187k;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$zy */
    /* JADX INFO: compiled from: UpdateManager.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: com.xiaomi.analytics.internal.q$zy$k */
        /* JADX INFO: compiled from: UpdateManager.java */
        class k implements HostnameVerifier {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ URL f31189k;

            k(URL url) {
                this.f31189k = url;
            }

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                if (this.f31189k.getHost().equals(str)) {
                    return true;
                }
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        }

        zy() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            FileOutputStream fileOutputStream;
            try {
                URL url = new URL(C5606q.this.f73051toq);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                SSLSocketFactory sSLSocketFactoryCdj = C5606q.this.cdj();
                if (sSLSocketFactoryCdj != null) {
                    httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryCdj);
                }
                httpsURLConnection.setHostnameVerifier(new k(url));
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setConnectTimeout(C5604k.f73033f7l8);
                httpsURLConnection.connect();
                if (httpsURLConnection.getResponseCode() == 200) {
                    byte[] qVar = f7l8.toq(httpsURLConnection.getInputStream());
                    FileOutputStream fileOutputStream2 = null;
                    if (!TextUtils.isEmpty(C5606q.this.f73052zy)) {
                        if (!C5606q.this.f73052zy.equalsIgnoreCase(kja0.toq(qVar))) {
                            qVar = null;
                        }
                    }
                    if (qVar != null) {
                        Log.d(C5609k.m19240k(C5606q.f31177s), "download apk success.");
                        File file = new File(C5606q.this.f31183q + ".tmp");
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            fileOutputStream.write(qVar);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            if (C5610n.toq(com.xiaomi.analytics.internal.util.toq.toq(C5606q.this.f31181k, file))) {
                                Log.d(C5609k.m19240k(C5606q.f31177s), "verify signature success");
                                file.renameTo(new File(C5606q.this.f31183q));
                                C5606q.this.zurt();
                            } else {
                                Log.e(C5609k.m19240k(C5606q.f31177s), "verify signature failed");
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileOutputStream2 = fileOutputStream;
                            Log.e(C5609k.m19240k(C5606q.f31177s), "mDownloader e", e);
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            f7l8.m19236k(fileOutputStream2);
                            throw th;
                        }
                        f7l8.m19236k(fileOutputStream2);
                    }
                }
            } catch (Exception e4) {
                Log.w(C5609k.m19240k(C5606q.f31177s), "mDownloader exception", e4);
            }
        }
    }

    private C5606q(Context context) {
        this.f31181k = com.xiaomi.analytics.internal.util.toq.m19255k(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SSLSocketFactory cdj() {
        TrustManager[] trustManagerArr = {new toq()};
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fu4(long j2) {
        SharedPreferences.Editor editorEdit = this.f31181k.getSharedPreferences(f73042n7h, 0).edit();
        editorEdit.putLong("updateTime", j2);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public String m19225i() {
        Random random = new Random(System.nanoTime());
        try {
            return kja0.m19245k(this.f31181k.getPackageName() + ":" + random.nextLong());
        } catch (Exception unused) {
            return kja0.m19245k(random.nextLong() + "");
        }
    }

    public static synchronized C5606q ki(Context context) {
        if (f31178t == null) {
            f31178t = new C5606q(context);
        }
        return f31178t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long ni7(String str) {
        try {
            return Long.parseLong(str.split(C5658n.f73185t8r)[1]);
        } catch (Exception unused) {
            return System.currentTimeMillis();
        }
    }

    private synchronized long t8r() {
        return this.f31181k.getSharedPreferences(f73042n7h, 0).getLong("updateTime", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zurt() {
        q qVar = this.f31180g;
        if (qVar != null) {
            qVar.mo19234k(this.f31183q, this.f31182n == 1);
        }
    }

    public boolean fn3e() {
        if (C5614y.f7l8(this.f31181k, f31177s)) {
            return false;
        }
        if (Analytics.isUpdateEnable()) {
            return System.currentTimeMillis() > t8r();
        }
        C5609k.toq(f31177s, "Updating is disabled.");
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m19232h(String str) {
        if (C5614y.f7l8(this.f31181k, f31177s)) {
            return;
        }
        C5609k.toq(f31177s, "checkUpdate ");
        this.f31183q = str;
        qrj.m19254k(this.f73050f7l8);
    }

    /* JADX INFO: renamed from: z */
    public void m19233z(q qVar) {
        this.f31180g = qVar;
    }
}
