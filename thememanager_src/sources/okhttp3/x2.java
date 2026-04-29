package okhttp3;

import b7.C1359g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7528s[] f94216f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final C7528s[] f43611g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f94217ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final toq f43612n = new toq(null);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f43613p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f43614s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f43615y;

    /* JADX INFO: renamed from: k */
    private final boolean f43616k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final String[] f43617q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f94218toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final String[] f94219zy;

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    static {
        C7528s c7528s = C7528s.f94167vep5;
        C7528s c7528s2 = C7528s.f94141mbx;
        C7528s c7528s3 = C7528s.f94127jbh;
        C7528s c7528s4 = C7528s.f94180yqrt;
        C7528s c7528s5 = C7528s.f94118gc3c;
        C7528s c7528s6 = C7528s.f94131kcsr;
        C7528s c7528s7 = C7528s.f94183zkd;
        C7528s c7528s8 = C7528s.f94093bek6;
        C7528s c7528s9 = C7528s.f94092b3e;
        C7528s[] c7528sArr = {c7528s, c7528s2, c7528s3, c7528s4, c7528s5, c7528s6, c7528s7, c7528s8, c7528s9};
        f43611g = c7528sArr;
        C7528s[] c7528sArr2 = {c7528s, c7528s2, c7528s3, c7528s4, c7528s5, c7528s6, c7528s7, c7528s8, c7528s9, C7528s.f94116g1, C7528s.f94171was, C7528s.f94094bf2, C7528s.f94124i1, C7528s.f94119gvn7, C7528s.f94103d2ok, C7528s.f94174x2};
        f94216f7l8 = c7528sArr2;
        C7532k c7532kM27483n = new C7532k(true).m27483n((C7528s[]) Arrays.copyOf(c7528sArr, c7528sArr.length));
        d3 d3Var = d3.TLS_1_3;
        d3 d3Var2 = d3.TLS_1_2;
        f43615y = c7532kM27483n.m27481h(d3Var, d3Var2).n7h(true).zy();
        f43614s = new C7532k(true).m27483n((C7528s[]) Arrays.copyOf(c7528sArr2, c7528sArr2.length)).m27481h(d3Var, d3Var2).n7h(true).zy();
        f43613p = new C7532k(true).m27483n((C7528s[]) Arrays.copyOf(c7528sArr2, c7528sArr2.length)).m27481h(d3Var, d3Var2, d3.TLS_1_1, d3.TLS_1_0).n7h(true).zy();
        f94217ld6 = new C7532k(false).zy();
    }

    public x2(boolean z2, boolean z3, @InterfaceC7395n String[] strArr, @InterfaceC7395n String[] strArr2) {
        this.f43616k = z2;
        this.f94218toq = z3;
        this.f94219zy = strArr;
        this.f43617q = strArr2;
    }

    /* JADX INFO: renamed from: p */
    private final x2 m27474p(SSLSocket sSLSocket, boolean z2) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f94219zy != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            d2ok.kja0(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = C1359g.d2ok(enabledCipherSuites, this.f94219zy, C7528s.f94162toq.zy());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f43617q != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            d2ok.kja0(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = C1359g.d2ok(enabledProtocols, this.f43617q, kotlin.comparisons.f7l8.cdj());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        d2ok.kja0(supportedCipherSuites, "supportedCipherSuites");
        int iJk = C1359g.jk(supportedCipherSuites, "TLS_FALLBACK_SCSV", C7528s.f94162toq.zy());
        if (z2 && iJk != -1) {
            d2ok.kja0(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iJk];
            d2ok.kja0(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = C1359g.ki(cipherSuitesIntersection, str);
        }
        C7532k c7532k = new C7532k(this);
        d2ok.kja0(cipherSuitesIntersection, "cipherSuitesIntersection");
        C7532k c7532kM27485q = c7532k.m27485q((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        d2ok.kja0(tlsVersionsIntersection, "tlsVersionsIntersection");
        return c7532kM27485q.kja0((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).zy();
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (!(obj instanceof x2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z2 = this.f43616k;
        x2 x2Var = (x2) obj;
        if (z2 != x2Var.f43616k) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f94219zy, x2Var.f94219zy) && Arrays.equals(this.f43617q, x2Var.f43617q) && this.f94218toq == x2Var.f94218toq);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "cipherSuites")
    public final List<C7528s> f7l8() {
        String[] strArr = this.f94219zy;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C7528s.f94162toq.toq(str));
        }
        return kotlin.collections.a9.wr(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final void m27476g(@InterfaceC7396q SSLSocket sslSocket, boolean z2) {
        d2ok.m23075h(sslSocket, "sslSocket");
        x2 x2VarM27474p = m27474p(sslSocket, z2);
        if (x2VarM27474p.x2() != null) {
            sslSocket.setEnabledProtocols(x2VarM27474p.f43617q);
        }
        if (x2VarM27474p.f7l8() != null) {
            sslSocket.setEnabledCipherSuites(x2VarM27474p.f94219zy);
        }
    }

    public int hashCode() {
        if (!this.f43616k) {
            return 17;
        }
        String[] strArr = this.f94219zy;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f43617q;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f94218toq ? 1 : 0);
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cipherSuites", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cipherSuites")
    /* JADX INFO: renamed from: k */
    public final List<C7528s> m27477k() {
        return f7l8();
    }

    @InterfaceC6769y(name = "supportsTlsExtensions")
    public final boolean ld6() {
        return this.f94218toq;
    }

    @InterfaceC6769y(name = "isTls")
    /* JADX INFO: renamed from: s */
    public final boolean m27478s() {
        return this.f43616k;
    }

    @InterfaceC7396q
    public String toString() {
        if (!this.f43616k) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(f7l8(), "[all enabled]") + ", tlsVersions=" + Objects.toString(x2(), "[all enabled]") + ", supportsTlsExtensions=" + this.f94218toq + ')';
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "supportsTlsExtensions", imports = {}))
    @InterfaceC6769y(name = "-deprecated_supportsTlsExtensions")
    public final boolean toq() {
        return this.f94218toq;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "tlsVersions")
    public final List<d3> x2() {
        String[] strArr = this.f43617q;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(d3.Companion.m26843k(str));
        }
        return kotlin.collections.a9.wr(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m27479y(@InterfaceC7396q SSLSocket socket) {
        d2ok.m23075h(socket, "socket");
        if (!this.f43616k) {
            return false;
        }
        String[] strArr = this.f43617q;
        if (strArr != null && !C1359g.o1t(strArr, socket.getEnabledProtocols(), kotlin.comparisons.f7l8.cdj())) {
            return false;
        }
        String[] strArr2 = this.f94219zy;
        return strArr2 == null || C1359g.o1t(strArr2, socket.getEnabledCipherSuites(), C7528s.f94162toq.zy());
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "tlsVersions", imports = {}))
    @InterfaceC6769y(name = "-deprecated_tlsVersions")
    public final List<d3> zy() {
        return x2();
    }

    /* JADX INFO: renamed from: okhttp3.x2$k */
    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @lv5({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class C7532k {

        /* JADX INFO: renamed from: k */
        private boolean f43618k;

        /* JADX INFO: renamed from: q */
        private boolean f43619q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private String[] f94220toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private String[] f94221zy;

        public C7532k(boolean z2) {
            this.f43618k = z2;
        }

        public final boolean f7l8() {
            return this.f43619q;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final String[] m27480g() {
            return this.f94220toq;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: h */
        public final C7532k m27481h(@InterfaceC7396q d3... tlsVersions) {
            d2ok.m23075h(tlsVersions, "tlsVersions");
            if (!this.f43618k) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (d3 d3Var : tlsVersions) {
                arrayList.add(d3Var.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return kja0((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7532k m27482k() {
            if (!this.f43618k) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.f94220toq = null;
            return this;
        }

        @InterfaceC7396q
        public final C7532k kja0(@InterfaceC7396q String... tlsVersions) {
            d2ok.m23075h(tlsVersions, "tlsVersions");
            if (!this.f43618k) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f94221zy = (String[]) tlsVersions.clone();
            return this;
        }

        public final void ld6(boolean z2) {
            this.f43619q = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final C7532k m27483n(@InterfaceC7396q C7528s... cipherSuites) {
            d2ok.m23075h(cipherSuites, "cipherSuites");
            if (!this.f43618k) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C7528s c7528s : cipherSuites) {
                arrayList.add(c7528s.m27421n());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m27485q((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC7396q
        @kotlin.ld6(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final C7532k n7h(boolean z2) {
            if (!this.f43618k) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f43619q = z2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public final void m27484p(@InterfaceC7395n String[] strArr) {
            this.f94220toq = strArr;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7532k m27485q(@InterfaceC7396q String... cipherSuites) {
            d2ok.m23075h(cipherSuites, "cipherSuites");
            if (!this.f43618k) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f94220toq = (String[]) cipherSuites.clone();
            return this;
        }

        public final void qrj(@InterfaceC7395n String[] strArr) {
            this.f94221zy = strArr;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: s */
        public final String[] m27486s() {
            return this.f94221zy;
        }

        @InterfaceC7396q
        public final C7532k toq() {
            if (!this.f43618k) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.f94221zy = null;
            return this;
        }

        public final void x2(boolean z2) {
            this.f43618k = z2;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m27487y() {
            return this.f43618k;
        }

        @InterfaceC7396q
        public final x2 zy() {
            return new x2(this.f43618k, this.f43619q, this.f94220toq, this.f94221zy);
        }

        public C7532k(@InterfaceC7396q x2 connectionSpec) {
            d2ok.m23075h(connectionSpec, "connectionSpec");
            this.f43618k = connectionSpec.m27478s();
            this.f94220toq = connectionSpec.f94219zy;
            this.f94221zy = connectionSpec.f43617q;
            this.f43619q = connectionSpec.ld6();
        }
    }
}
