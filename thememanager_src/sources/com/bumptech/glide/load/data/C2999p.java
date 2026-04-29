package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3086n;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.util.C3208s;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.p */
/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2999p implements InterfaceC3000q<InputStream> {

    /* JADX INFO: renamed from: h */
    private static final int f18233h = 5;

    /* JADX INFO: renamed from: i */
    @yz
    static final String f18234i = "Location";

    /* JADX INFO: renamed from: p */
    private static final String f18235p = "HttpUrlFetcher";

    /* JADX INFO: renamed from: t */
    @yz
    static final int f18236t = -1;

    /* JADX INFO: renamed from: z */
    @yz
    static final toq f18237z = new k();

    /* JADX INFO: renamed from: g */
    private HttpURLConnection f18238g;

    /* JADX INFO: renamed from: k */
    private final C3084y f18239k;

    /* JADX INFO: renamed from: n */
    private final toq f18240n;

    /* JADX INFO: renamed from: q */
    private final int f18241q;

    /* JADX INFO: renamed from: s */
    private volatile boolean f18242s;

    /* JADX INFO: renamed from: y */
    private InputStream f18243y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.p$k */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    private static class k implements toq {
        k() {
        }

        @Override // com.bumptech.glide.load.data.C2999p.toq
        /* JADX INFO: renamed from: k */
        public HttpURLConnection mo10656k(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.p$toq */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    interface toq {
        /* JADX INFO: renamed from: k */
        HttpURLConnection mo10656k(URL url) throws IOException;
    }

    public C2999p(C3084y c3084y, int i2) {
        this(c3084y, i2, f18237z);
    }

    private InputStream f7l8(HttpURLConnection httpURLConnection) throws C3086n {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f18243y = com.bumptech.glide.util.zy.zy(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f18235p, 3)) {
                    Log.d(f18235p, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f18243y = httpURLConnection.getInputStream();
            }
            return this.f18243y;
        } catch (IOException e2) {
            throw new C3086n("Failed to obtain InputStream", m10653q(httpURLConnection), e2);
        }
    }

    /* JADX INFO: renamed from: p */
    private InputStream m10652p(URL url, int i2, URL url2, Map<String, String> map) throws C3086n {
        if (i2 >= 5) {
            throw new C3086n("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C3086n("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionZy = zy(url, map);
        this.f18238g = httpURLConnectionZy;
        try {
            httpURLConnectionZy.connect();
            this.f18243y = this.f18238g.getInputStream();
            if (this.f18242s) {
                return null;
            }
            int iM10653q = m10653q(this.f18238g);
            if (m10655y(iM10653q)) {
                return f7l8(this.f18238g);
            }
            if (!m10654s(iM10653q)) {
                if (iM10653q == -1) {
                    throw new C3086n(iM10653q);
                }
                try {
                    throw new C3086n(this.f18238g.getResponseMessage(), iM10653q);
                } catch (IOException e2) {
                    throw new C3086n("Failed to get a response message", iM10653q, e2);
                }
            }
            String headerField = this.f18238g.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new C3086n("Received empty or null redirect url", iM10653q);
            }
            try {
                URL url3 = new URL(url, headerField);
                toq();
                return m10652p(url3, i2 + 1, url, map);
            } catch (MalformedURLException e3) {
                throw new C3086n("Bad redirect url: " + headerField, iM10653q, e3);
            }
        } catch (IOException e4) {
            throw new C3086n("Failed to connect or obtain data", m10653q(this.f18238g), e4);
        }
    }

    /* JADX INFO: renamed from: q */
    private static int m10653q(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable(f18235p, 3)) {
                return -1;
            }
            Log.d(f18235p, "Failed to get a response code", e2);
            return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    private static boolean m10654s(int i2) {
        return i2 / 100 == 3;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m10655y(int i2) {
        return i2 / 100 == 2;
    }

    private HttpURLConnection zy(URL url, Map<String, String> map) throws C3086n {
        try {
            HttpURLConnection httpURLConnectionMo10656k = this.f18240n.mo10656k(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionMo10656k.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionMo10656k.setConnectTimeout(this.f18241q);
            httpURLConnectionMo10656k.setReadTimeout(this.f18241q);
            httpURLConnectionMo10656k.setUseCaches(false);
            httpURLConnectionMo10656k.setDoInput(true);
            httpURLConnectionMo10656k.setInstanceFollowRedirects(false);
            return httpURLConnectionMo10656k;
        } catch (IOException e2) {
            throw new C3086n("URL.openConnection threw", 0, e2);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void cancel() {
        this.f18242s = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    /* JADX INFO: renamed from: g */
    public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super InputStream> kVar) {
        StringBuilder sb;
        long qVar = C3208s.toq();
        try {
            try {
                kVar.mo10657q(m10652p(this.f18239k.m10922s(), 0, null, this.f18239k.m10921n()));
            } catch (IOException e2) {
                if (Log.isLoggable(f18235p, 3)) {
                    Log.d(f18235p, "Failed to load data for url", e2);
                }
                kVar.zy(e2);
                if (!Log.isLoggable(f18235p, 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable(f18235p, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C3208s.m11263k(qVar));
                Log.v(f18235p, sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f18235p, 2)) {
                Log.v(f18235p, "Finished http url fetcher fetch in " + C3208s.m11263k(qVar));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<InputStream> mo10634k() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: n */
    public EnumC3050k mo10648n() {
        return EnumC3050k.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void toq() {
        InputStream inputStream = this.f18243y;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f18238g;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f18238g = null;
    }

    @yz
    C2999p(C3084y c3084y, int i2, toq toqVar) {
        this.f18239k = c3084y;
        this.f18241q = i2;
        this.f18240n = toqVar;
    }
}
