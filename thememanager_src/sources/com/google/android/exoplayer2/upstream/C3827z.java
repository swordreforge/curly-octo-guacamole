package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.g0ad;
import com.google.common.collect.xwq3;
import com.google.common.collect.zkd;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.z */
/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3827z extends AbstractC3795g implements jp0y {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f66929fn3e = 8000;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f66930fu4 = 20;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f66931ni7 = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f66932o1t = 308;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final long f66933wvg = 2048;

    /* JADX INFO: renamed from: z */
    private static final int f23126z = 307;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f66934zurt = 8000;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f66935cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f66936f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f23127g;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private InputStream f23128h;

    /* JADX INFO: renamed from: i */
    private long f23129i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f66937ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @zy.dd
    private HttpURLConnection f66938kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final jp0y.f7l8 f66939ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @zy.dd
    private t8r f66940n7h;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final jp0y.f7l8 f23130p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.dd
    private com.google.common.base.a9<String> f66941qrj;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final String f23131s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f66942t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final boolean f66943x2;

    /* JADX INFO: renamed from: y */
    private final int f23132y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.z$toq */
    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class toq implements jp0y.zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f66944f7l8;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private String f23136q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private uv6 f66945toq;

        /* JADX INFO: renamed from: y */
        private boolean f23137y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private com.google.common.base.a9<String> f66946zy;

        /* JADX INFO: renamed from: k */
        private final jp0y.f7l8 f23134k = new jp0y.f7l8();

        /* JADX INFO: renamed from: n */
        private int f23135n = 8000;

        /* JADX INFO: renamed from: g */
        private int f23133g = 8000;

        @Override // com.google.android.exoplayer2.upstream.jp0y.zy
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public final toq toq(Map<String, String> map) {
            this.f23134k.toq(map);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m13529g(@zy.dd com.google.common.base.a9<String> a9Var) {
            this.f66946zy = a9Var;
            return this;
        }

        public toq ld6(@zy.dd String str) {
            this.f23136q = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m13530n(int i2) {
            this.f23135n = i2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m13531p(@zy.dd uv6 uv6Var) {
            this.f66945toq = uv6Var;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m13532q(boolean z2) {
            this.f66944f7l8 = z2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m13533s(int i2) {
            this.f23133g = i2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m13534y(boolean z2) {
            this.f23137y = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.jp0y.zy, com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public C3827z mo7265k() {
            C3827z c3827z = new C3827z(this.f23136q, this.f23135n, this.f23133g, this.f66944f7l8, this.f23134k, this.f66946zy, this.f23137y);
            uv6 uv6Var = this.f66945toq;
            if (uv6Var != null) {
                c3827z.mo7271n(uv6Var);
            }
            return c3827z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.z$zy */
    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    static class zy extends xwq3<String, List<String>> {

        /* JADX INFO: renamed from: k */
        private final Map<String, List<String>> f23138k;

        public zy(Map<String, List<String>> map) {
            this.f23138k = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ boolean m13535h(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean kja0(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public boolean containsKey(@zy.dd Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public boolean containsValue(@zy.dd Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return g0ad.m15697s(super.entrySet(), new com.google.common.base.a9() { // from class: com.google.android.exoplayer2.upstream.wvg
                @Override // com.google.common.base.a9
                public final boolean apply(Object obj) {
                    return C3827z.zy.kja0((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public boolean equals(@zy.dd Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public Set<String> keySet() {
            return g0ad.m15697s(super.keySet(), new com.google.common.base.a9() { // from class: com.google.android.exoplayer2.upstream.o1t
                @Override // com.google.common.base.a9
                public final boolean apply(Object obj) {
                    return C3827z.zy.m13535h((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
        public Map<String, List<String>> delegate() {
            return this.f23138k;
        }

        @Override // com.google.common.collect.xwq3, java.util.Map
        @zy.dd
        public List<String> get(@zy.dd Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private static void a9(@zy.dd HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection == null || (i2 = com.google.android.exoplayer2.util.lrht.f23230k) < 19 || i2 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j2 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j2 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) C3844k.f7l8(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private void d3(long j2, t8r t8rVar) throws IOException {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j2 > 0) {
            int i2 = ((InputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23128h)).read(bArr, 0, (int) Math.min(j2, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new jp0y.C3802q(new InterruptedIOException(), t8rVar, 2000, 1);
            }
            if (i2 == -1) {
                throw new jp0y.C3802q(t8rVar, 2008, 1);
            }
            j2 -= (long) i2;
            zurt(i2);
        }
    }

    private HttpURLConnection jk(URL url, int i2, @zy.dd byte[] bArr, long j2, long j3, boolean z2, boolean z3, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionFti = fti(url);
        httpURLConnectionFti.setConnectTimeout(this.f66936f7l8);
        httpURLConnectionFti.setReadTimeout(this.f23132y);
        HashMap map2 = new HashMap();
        jp0y.f7l8 f7l8Var = this.f23130p;
        if (f7l8Var != null) {
            map2.putAll(f7l8Var.zy());
        }
        map2.putAll(this.f66939ld6.zy());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionFti.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM13464k = gvn7.m13464k(j2, j3);
        if (strM13464k != null) {
            httpURLConnectionFti.setRequestProperty(com.google.common.net.zy.f68521jp0y, strM13464k);
        }
        String str = this.f23131s;
        if (str != null) {
            httpURLConnectionFti.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionFti.setRequestProperty(com.google.common.net.zy.f27259p, z2 ? "gzip" : "identity");
        httpURLConnectionFti.setInstanceFollowRedirects(z3);
        httpURLConnectionFti.setDoOutput(bArr != null);
        httpURLConnectionFti.setRequestMethod(t8r.zy(i2));
        if (bArr != null) {
            httpURLConnectionFti.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionFti.connect();
            OutputStream outputStream = httpURLConnectionFti.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionFti.connect();
        }
        return httpURLConnectionFti;
    }

    private int jp0y(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f66942t8r;
        if (j2 != -1) {
            long j3 = j2 - this.f23129i;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j3);
        }
        int i4 = ((InputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23128h)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.f23129i += (long) i4;
        zurt(i4);
        return i4;
    }

    private HttpURLConnection mcp(t8r t8rVar) throws IOException {
        HttpURLConnection httpURLConnectionJk;
        URL url = new URL(t8rVar.f23103k.toString());
        int i2 = t8rVar.f66914zy;
        byte[] bArr = t8rVar.f23106q;
        long j2 = t8rVar.f66911f7l8;
        long j3 = t8rVar.f23108y;
        boolean zM13515q = t8rVar.m13515q(1);
        if (!this.f23127g && !this.f66943x2) {
            return jk(url, i2, bArr, j2, j3, zM13515q, true, t8rVar.f23104n);
        }
        URL urlWvg = url;
        int i3 = i2;
        byte[] bArr2 = bArr;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 > 20) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Too many redirects: ");
                sb.append(i5);
                throw new jp0y.C3802q(new NoRouteToHostException(sb.toString()), t8rVar, 2001, 1);
            }
            long j4 = j2;
            long j5 = j2;
            int i6 = i3;
            URL url2 = urlWvg;
            long j6 = j3;
            httpURLConnectionJk = jk(urlWvg, i3, bArr2, j4, j3, zM13515q, false, t8rVar.f23104n);
            int responseCode = httpURLConnectionJk.getResponseCode();
            String headerField = httpURLConnectionJk.getHeaderField("Location");
            if ((i6 == 1 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionJk.disconnect();
                urlWvg = wvg(url2, headerField, t8rVar);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionJk.disconnect();
                if (this.f66943x2 && responseCode == 302) {
                    i3 = i6;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlWvg = wvg(url2, headerField, t8rVar);
            }
            i4 = i5;
            j2 = j5;
            j3 = j6;
        }
        return httpURLConnectionJk;
    }

    private void o1t() {
        HttpURLConnection httpURLConnection = this.f66938kja0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(f66931ni7, "Unexpected error while disconnecting", e2);
            }
            this.f66938kja0 = null;
        }
    }

    /* JADX INFO: renamed from: t */
    private static boolean m13528t(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.zy.f68552uv6));
    }

    private URL wvg(URL url, @zy.dd String str, t8r t8rVar) throws jp0y.C3802q {
        if (str == null) {
            throw new jp0y.C3802q("Null location redirect", t8rVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String strValueOf = String.valueOf(protocol);
                throw new jp0y.C3802q(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "), t8rVar, 2001, 1);
            }
            if (this.f23127g || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new jp0y.C3802q(sb.toString(), t8rVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new jp0y.C3802q(e2, t8rVar, 2001, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws jp0y.C3802q {
        try {
            InputStream inputStream = this.f23128h;
            if (inputStream != null) {
                long j2 = this.f66942t8r;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = j2 - this.f23129i;
                }
                a9(this.f66938kja0, j3);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new jp0y.C3802q(e2, (t8r) com.google.android.exoplayer2.util.lrht.ld6(this.f66940n7h), 2000, 3);
                }
            }
        } finally {
            this.f23128h = null;
            o1t();
            if (this.f66935cdj) {
                this.f66935cdj = false;
                ni7();
            }
        }
    }

    @yz
    HttpURLConnection fti(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f66938kja0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Deprecated
    public void gvn7(@zy.dd com.google.common.base.a9<String> a9Var) {
        this.f66941qrj = a9Var;
    }

    @Override // com.google.android.exoplayer2.upstream.jp0y
    /* JADX INFO: renamed from: i */
    public void mo13477i(String str) {
        C3844k.f7l8(str);
        this.f66939ld6.m13482q(str);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws jp0y.C3802q {
        byte[] bArrM28265do;
        this.f66940n7h = t8rVar;
        long j2 = 0;
        this.f23129i = 0L;
        this.f66942t8r = 0L;
        fu4(t8rVar);
        try {
            HttpURLConnection httpURLConnectionMcp = mcp(t8rVar);
            this.f66938kja0 = httpURLConnectionMcp;
            this.f66937ki = httpURLConnectionMcp.getResponseCode();
            String responseMessage = httpURLConnectionMcp.getResponseMessage();
            int i2 = this.f66937ki;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionMcp.getHeaderFields();
                if (this.f66937ki == 416) {
                    if (t8rVar.f66911f7l8 == gvn7.zy(httpURLConnectionMcp.getHeaderField(com.google.common.net.zy.f68515hb))) {
                        this.f66935cdj = true;
                        m13463z(t8rVar);
                        long j3 = t8rVar.f23108y;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionMcp.getErrorStream();
                try {
                    bArrM28265do = errorStream != null ? com.google.android.exoplayer2.util.lrht.m28265do(errorStream) : com.google.android.exoplayer2.util.lrht.f23228g;
                } catch (IOException unused) {
                    bArrM28265do = com.google.android.exoplayer2.util.lrht.f23228g;
                }
                byte[] bArr = bArrM28265do;
                o1t();
                throw new jp0y.C3799g(this.f66937ki, responseMessage, this.f66937ki == 416 ? new C3796h(2008) : null, headerFields, t8rVar, bArr);
            }
            String contentType = httpURLConnectionMcp.getContentType();
            com.google.common.base.a9<String> a9Var = this.f66941qrj;
            if (a9Var != null && !a9Var.apply(contentType)) {
                o1t();
                throw new jp0y.C3801n(contentType, t8rVar);
            }
            if (this.f66937ki == 200) {
                long j4 = t8rVar.f66911f7l8;
                if (j4 != 0) {
                    j2 = j4;
                }
            }
            boolean zM13528t = m13528t(httpURLConnectionMcp);
            if (zM13528t) {
                this.f66942t8r = t8rVar.f23108y;
            } else {
                long j5 = t8rVar.f23108y;
                if (j5 != -1) {
                    this.f66942t8r = j5;
                } else {
                    long qVar = gvn7.toq(httpURLConnectionMcp.getHeaderField(com.google.common.net.zy.f68551toq), httpURLConnectionMcp.getHeaderField(com.google.common.net.zy.f68515hb));
                    this.f66942t8r = qVar != -1 ? qVar - j2 : -1L;
                }
            }
            try {
                this.f23128h = httpURLConnectionMcp.getInputStream();
                if (zM13528t) {
                    this.f23128h = new GZIPInputStream(this.f23128h);
                }
                this.f66935cdj = true;
                m13463z(t8rVar);
                try {
                    d3(j2, t8rVar);
                    return this.f66942t8r;
                } catch (IOException e2) {
                    o1t();
                    if (e2 instanceof jp0y.C3802q) {
                        throw ((jp0y.C3802q) e2);
                    }
                    throw new jp0y.C3802q(e2, t8rVar, 2000, 1);
                }
            } catch (IOException e3) {
                o1t();
                throw new jp0y.C3802q(e3, t8rVar, 2000, 1);
            }
        } catch (IOException e4) {
            o1t();
            throw jp0y.C3802q.createForIOException(e4, t8rVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.jp0y
    public void ki() {
        this.f66939ld6.m13480k();
    }

    @Override // com.google.android.exoplayer2.upstream.jp0y
    public int n7h() {
        int i2;
        if (this.f66938kja0 == null || (i2 = this.f66937ki) <= 0) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.upstream.jp0y
    /* JADX INFO: renamed from: q */
    public void mo13478q(String str, String str2) {
        C3844k.f7l8(str);
        C3844k.f7l8(str2);
        this.f66939ld6.m13481n(str, str2);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws jp0y.C3802q {
        try {
            return jp0y(bArr, i2, i3);
        } catch (IOException e2) {
            throw jp0y.C3802q.createForIOException(e2, (t8r) com.google.android.exoplayer2.util.lrht.ld6(this.f66940n7h), 2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        HttpURLConnection httpURLConnection = this.f66938kja0;
        return httpURLConnection == null ? zkd.of() : new zy(httpURLConnection.getHeaderFields());
    }

    @Deprecated
    public C3827z() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public C3827z(@zy.dd String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public C3827z(@zy.dd String str, int i2, int i3) {
        this(str, i2, i3, false, null);
    }

    @Deprecated
    public C3827z(@zy.dd String str, int i2, int i3, boolean z2, @zy.dd jp0y.f7l8 f7l8Var) {
        this(str, i2, i3, z2, f7l8Var, null, false);
    }

    private C3827z(@zy.dd String str, int i2, int i3, boolean z2, @zy.dd jp0y.f7l8 f7l8Var, @zy.dd com.google.common.base.a9<String> a9Var, boolean z3) {
        super(true);
        this.f23131s = str;
        this.f66936f7l8 = i2;
        this.f23132y = i3;
        this.f23127g = z2;
        this.f23130p = f7l8Var;
        this.f66941qrj = a9Var;
        this.f66939ld6 = new jp0y.f7l8();
        this.f66943x2 = z3;
    }
}
