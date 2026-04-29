package okhttp3.internal.cache;

import b7.C1359g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.InterfaceC7519n;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.cache.zy;
import okhttp3.internal.connection.C7450n;
import okhttp3.internal.http.C7456g;
import okhttp3.internal.http.C7459n;
import okhttp3.internal.http.C7463y;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.ki;
import okhttp3.mcp;
import okhttp3.ni7;
import okio.C7560j;
import okio.n7h;
import okio.nn86;
import okio.qrj;
import okio.vyq;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.cache.k */
/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7438k implements ni7 {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f42965q = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final okhttp3.zy f42966k;

    /* JADX INFO: renamed from: okhttp3.internal.cache.k$k */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final fti m26932g(fti ftiVar) {
            return (ftiVar != null ? ftiVar.hyr() : null) != null ? ftiVar.ij().toq(null).zy() : ftiVar;
        }

        /* JADX INFO: renamed from: n */
        private final boolean m26934n(String str) {
            return (a9.e5(com.google.common.net.zy.f68524kja0, str, true) || a9.e5("Keep-Alive", str, true) || a9.e5(com.google.common.net.zy.f68496ch, str, true) || a9.e5(com.google.common.net.zy.f68508fti, str, true) || a9.e5(com.google.common.net.zy.f68503eqxt, str, true) || a9.e5("Trailers", str, true) || a9.e5(com.google.common.net.zy.f27247d, str, true) || a9.e5(com.google.common.net.zy.f68497d2ok, str, true)) ? false : true;
        }

        /* JADX INFO: renamed from: q */
        private final boolean m26935q(String str) {
            return a9.e5(com.google.common.net.zy.f68551toq, str, true) || a9.e5(com.google.common.net.zy.f68552uv6, str, true) || a9.e5(com.google.common.net.zy.f68571zy, str, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final fn3e zy(fn3e fn3eVar, fn3e fn3eVar2) {
            fn3e.C7432k c7432k = new fn3e.C7432k();
            int size = fn3eVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strM26864y = fn3eVar.m26864y(i2);
                String strN7h = fn3eVar.n7h(i2);
                if ((!a9.e5(com.google.common.net.zy.f68505f7l8, strM26864y, true) || !a9.r6ty(strN7h, "1", false, 2, null)) && (m26935q(strM26864y) || !m26934n(strM26864y) || fn3eVar2.zy(strM26864y) == null)) {
                    c7432k.f7l8(strM26864y, strN7h);
                }
            }
            int size2 = fn3eVar2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String strM26864y2 = fn3eVar2.m26864y(i3);
                if (!m26935q(strM26864y2) && m26934n(strM26864y2)) {
                    c7432k.f7l8(strM26864y2, fn3eVar2.n7h(i3));
                }
            }
            return c7432k.m26870s();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.k$toq */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class toq implements nn86 {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ qrj f42967g;

        /* JADX INFO: renamed from: k */
        private boolean f42968k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ okhttp3.internal.cache.toq f42969n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ n7h f42970q;

        toq(n7h n7hVar, okhttp3.internal.cache.toq toqVar, qrj qrjVar) {
            this.f42970q = n7hVar;
            this.f42969n = toqVar;
            this.f42967g = qrjVar;
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f42968k && !C1359g.ni7(this, 100, TimeUnit.MILLISECONDS)) {
                this.f42968k = true;
                this.f42969n.abort();
            }
            this.f42970q.close();
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return this.f42970q.toq();
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            d2ok.m23075h(sink, "sink");
            try {
                long jWx16 = this.f42970q.wx16(sink, j2);
                if (jWx16 != -1) {
                    sink.yz(this.f42967g.mo27638g(), sink.size() - jWx16, jWx16);
                    this.f42967g.eqxt();
                    return jWx16;
                }
                if (!this.f42968k) {
                    this.f42968k = true;
                    this.f42967g.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.f42968k) {
                    this.f42968k = true;
                    this.f42969n.abort();
                }
                throw e2;
            }
        }
    }

    public C7438k(@InterfaceC7395n okhttp3.zy zyVar) {
        this.f42966k = zyVar;
    }

    private final fti toq(okhttp3.internal.cache.toq toqVar, fti ftiVar) throws IOException {
        if (toqVar == null) {
            return ftiVar;
        }
        vyq vyqVarMo26963k = toqVar.mo26963k();
        jp0y jp0yVarHyr = ftiVar.hyr();
        d2ok.qrj(jp0yVarHyr);
        toq toqVar2 = new toq(jp0yVarHyr.y9n(), toqVar, okio.d2ok.m27594q(vyqVarMo26963k));
        return ftiVar.ij().toq(new C7463y(fti.g1(ftiVar, com.google.common.net.zy.f68571zy, null, 2, null), ftiVar.hyr().x2(), okio.d2ok.m27592n(toqVar2))).zy();
    }

    @Override // okhttp3.ni7
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) throws IOException {
        ki kiVarM27032i;
        jp0y jp0yVarHyr;
        jp0y jp0yVarHyr2;
        d2ok.m23075h(chain, "chain");
        InterfaceC7519n interfaceC7519nCall = chain.call();
        okhttp3.zy zyVar = this.f42966k;
        fti ftiVarLd6 = zyVar != null ? zyVar.ld6(chain.zy()) : null;
        zy qVar = new zy.toq(System.currentTimeMillis(), chain.zy(), ftiVarLd6).toq();
        jk qVar2 = qVar.toq();
        fti ftiVarM26964k = qVar.m26964k();
        okhttp3.zy zyVar2 = this.f42966k;
        if (zyVar2 != null) {
            zyVar2.nmn5(qVar);
        }
        C7450n c7450n = interfaceC7519nCall instanceof C7450n ? (C7450n) interfaceC7519nCall : null;
        if (c7450n == null || (kiVarM27032i = c7450n.m27032i()) == null) {
            kiVarM27032i = ki.f94065toq;
        }
        if (ftiVarLd6 != null && ftiVarM26964k == null && (jp0yVarHyr2 = ftiVarLd6.hyr()) != null) {
            C1359g.kja0(jp0yVarHyr2);
        }
        if (qVar2 == null && ftiVarM26964k == null) {
            fti ftiVarZy = new fti.C7433k().a9(chain.zy()).m26898t(mcp.HTTP_1_1).f7l8(504).m26900z("Unsatisfiable Request (only-if-cached)").toq(C1359g.f53993zy).fti(-1L).mcp(System.currentTimeMillis()).zy();
            kiVarM27032i.wvg(interfaceC7519nCall, ftiVarZy);
            return ftiVarZy;
        }
        if (qVar2 == null) {
            d2ok.qrj(ftiVarM26964k);
            fti ftiVarZy2 = ftiVarM26964k.ij().m26895q(f42965q.m26932g(ftiVarM26964k)).zy();
            kiVarM27032i.toq(interfaceC7519nCall, ftiVarZy2);
            return ftiVarZy2;
        }
        if (ftiVarM26964k != null) {
            kiVarM27032i.mo27349k(interfaceC7519nCall, ftiVarM26964k);
        } else if (this.f42966k != null) {
            kiVarM27032i.zy(interfaceC7519nCall);
        }
        try {
            fti ftiVarMo27071q = chain.mo27071q(qVar2);
            if (ftiVarMo27071q == null && ftiVarLd6 != null && jp0yVarHyr != null) {
            }
            if (ftiVarM26964k != null) {
                boolean z2 = false;
                if (ftiVarMo27071q != null && ftiVarMo27071q.i1() == 304) {
                    z2 = true;
                }
                if (z2) {
                    fti.C7433k c7433kIj = ftiVarM26964k.ij();
                    k kVar = f42965q;
                    fti ftiVarZy3 = c7433kIj.ni7(kVar.zy(ftiVarM26964k.ltg8(), ftiVarMo27071q.ltg8())).fti(ftiVarMo27071q.ga()).mcp(ftiVarMo27071q.h4b()).m26895q(kVar.m26932g(ftiVarM26964k)).o1t(kVar.m26932g(ftiVarMo27071q)).zy();
                    jp0y jp0yVarHyr3 = ftiVarMo27071q.hyr();
                    d2ok.qrj(jp0yVarHyr3);
                    jp0yVarHyr3.close();
                    okhttp3.zy zyVar3 = this.f42966k;
                    d2ok.qrj(zyVar3);
                    zyVar3.m27559x();
                    this.f42966k.t8iq(ftiVarM26964k, ftiVarZy3);
                    kiVarM27032i.toq(interfaceC7519nCall, ftiVarZy3);
                    return ftiVarZy3;
                }
                jp0y jp0yVarHyr4 = ftiVarM26964k.hyr();
                if (jp0yVarHyr4 != null) {
                    C1359g.kja0(jp0yVarHyr4);
                }
            }
            d2ok.qrj(ftiVarMo27071q);
            fti.C7433k c7433kIj2 = ftiVarMo27071q.ij();
            k kVar2 = f42965q;
            fti ftiVarZy4 = c7433kIj2.m26895q(kVar2.m26932g(ftiVarM26964k)).o1t(kVar2.m26932g(ftiVarMo27071q)).zy();
            if (this.f42966k != null) {
                if (C7459n.zy(ftiVarZy4) && zy.f93844zy.m26965k(ftiVarZy4, qVar2)) {
                    fti qVar3 = toq(this.f42966k.m27554f(ftiVarZy4), ftiVarZy4);
                    if (ftiVarM26964k != null) {
                        kiVarM27032i.zy(interfaceC7519nCall);
                    }
                    return qVar3;
                }
                if (C7456g.f43137k.m27075k(qVar2.qrj())) {
                    try {
                        this.f42966k.yz(qVar2);
                    } catch (IOException unused) {
                    }
                }
            }
            return ftiVarZy4;
        } finally {
            if (ftiVarLd6 != null && (jp0yVarHyr = ftiVarLd6.hyr()) != null) {
                C1359g.kja0(jp0yVarHyr);
            }
        }
    }

    @InterfaceC7395n
    public final okhttp3.zy zy() {
        return this.f42966k;
    }
}
