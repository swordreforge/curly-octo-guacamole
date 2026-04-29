package okhttp3.internal.http;

import b7.C1359g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.d2ok;
import kotlin.text.ki;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.a9;
import okhttp3.fti;
import okhttp3.gvn7;
import okhttp3.internal.connection.C7448g;
import okhttp3.internal.connection.C7450n;
import okhttp3.internal.connection.C7453s;
import okhttp3.internal.http2.C7472k;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.ni7;
import okhttp3.zurt;

/* JADX INFO: renamed from: okhttp3.internal.http.p */
/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7460p implements ni7 {

    /* JADX INFO: renamed from: n */
    private static final int f43145n = 20;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f43146q = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7529t f43147k;

    /* JADX INFO: renamed from: okhttp3.internal.http.p$k */
    /* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public C7460p(@InterfaceC7396q C7529t client) {
        d2ok.m23075h(client, "client");
        this.f43147k = client;
    }

    private final int f7l8(fti ftiVar, int i2) {
        String strG1 = fti.g1(ftiVar, com.google.common.net.zy.f68548t8iq, null, 2, null);
        if (strG1 == null) {
            return i2;
        }
        if (!new ki("\\d+").matches(strG1)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strG1);
        d2ok.kja0(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: g */
    private final boolean m27084g(IOException iOException, jk jkVar) {
        a9 a9VarM27305g = jkVar.m27305g();
        return (a9VarM27305g != null && a9VarM27305g.cdj()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m27085n(IOException iOException, C7450n c7450n, jk jkVar, boolean z2) {
        if (this.f43147k.m27426a()) {
            return !(z2 && m27084g(iOException, jkVar)) && m27086q(iOException, z2) && c7450n.jk();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m27086q(IOException iOException, boolean z2) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z2 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final jk toq(fti ftiVar, String str) {
        String strG1;
        zurt zurtVarLrht;
        if (!this.f43147k.vyq() || (strG1 = fti.g1(ftiVar, "Location", null, 2, null)) == null || (zurtVarLrht = ftiVar.wlev().cdj().lrht(strG1)) == null) {
            return null;
        }
        if (!d2ok.f7l8(zurtVarLrht.uv6(), ftiVar.wlev().cdj().uv6()) && !this.f43147k.m27429e()) {
            return null;
        }
        jk.C7511k c7511kN7h = ftiVar.wlev().n7h();
        if (C7456g.toq(str)) {
            int iI1 = ftiVar.i1();
            C7456g c7456g = C7456g.f43137k;
            boolean z2 = c7456g.m27076q(str) || iI1 == 308 || iI1 == 307;
            if (!c7456g.zy(str) || iI1 == 308 || iI1 == 307) {
                c7511kN7h.m27314h(str, z2 ? ftiVar.wlev().m27305g() : null);
            } else {
                c7511kN7h.m27314h("GET", null);
            }
            if (!z2) {
                c7511kN7h.m27315i(com.google.common.net.zy.f27247d);
                c7511kN7h.m27315i(com.google.common.net.zy.f68551toq);
                c7511kN7h.m27315i(com.google.common.net.zy.f68571zy);
            }
        }
        if (!C1359g.x2(ftiVar.wlev().cdj(), zurtVarLrht)) {
            c7511kN7h.m27315i(com.google.common.net.zy.f68534n7h);
        }
        return c7511kN7h.jk(zurtVarLrht).toq();
    }

    private final jk zy(fti ftiVar, okhttp3.internal.connection.zy zyVar) throws IOException {
        C7448g c7448gM27063y;
        gvn7 qVar = (zyVar == null || (c7448gM27063y = zyVar.m27063y()) == null) ? null : c7448gM27063y.toq();
        int iI1 = ftiVar.i1();
        String strQrj = ftiVar.wlev().qrj();
        if (iI1 != 307 && iI1 != 308) {
            if (iI1 == 401) {
                return this.f43147k.lvui().mo22402k(qVar, ftiVar);
            }
            if (iI1 == 421) {
                a9 a9VarM27305g = ftiVar.wlev().m27305g();
                if ((a9VarM27305g != null && a9VarM27305g.cdj()) || zyVar == null || !zyVar.x2()) {
                    return null;
                }
                zyVar.m27063y().jk();
                return ftiVar.wlev();
            }
            if (iI1 == 503) {
                fti ftiVarNgy = ftiVar.ngy();
                if ((ftiVarNgy == null || ftiVarNgy.i1() != 503) && f7l8(ftiVar, Integer.MAX_VALUE) == 0) {
                    return ftiVar.wlev();
                }
                return null;
            }
            if (iI1 == 407) {
                d2ok.qrj(qVar);
                if (qVar.m26912n().type() == Proxy.Type.HTTP) {
                    return this.f43147k.bf2().mo22402k(qVar, ftiVar);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iI1 == 408) {
                if (!this.f43147k.m27426a()) {
                    return null;
                }
                a9 a9VarM27305g2 = ftiVar.wlev().m27305g();
                if (a9VarM27305g2 != null && a9VarM27305g2.cdj()) {
                    return null;
                }
                fti ftiVarNgy2 = ftiVar.ngy();
                if ((ftiVarNgy2 == null || ftiVarNgy2.i1() != 408) && f7l8(ftiVar, 0) <= 0) {
                    return ftiVar.wlev();
                }
                return null;
            }
            switch (iI1) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return toq(ftiVar, strQrj);
    }

    @Override // okhttp3.ni7
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) throws IOException {
        okhttp3.internal.connection.zy zyVarZurt;
        jk jkVarZy;
        d2ok.m23075h(chain, "chain");
        f7l8 f7l8Var = (f7l8) chain;
        jk jkVarM27067h = f7l8Var.m27067h();
        C7450n c7450nX2 = f7l8Var.x2();
        List listA9 = kotlin.collections.ni7.a9();
        fti ftiVar = null;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            c7450nX2.n7h(jkVarM27067h, z2);
            try {
                if (c7450nX2.x2()) {
                    throw new IOException("Canceled");
                }
                try {
                    fti ftiVarMo27071q = f7l8Var.mo27071q(jkVarM27067h);
                    if (ftiVar != null) {
                        ftiVarMo27071q = ftiVarMo27071q.ij().wvg(ftiVar.ij().toq(null).zy()).zy();
                    }
                    ftiVar = ftiVarMo27071q;
                    zyVarZurt = c7450nX2.zurt();
                    jkVarZy = zy(ftiVar, zyVarZurt);
                } catch (IOException e2) {
                    if (!m27085n(e2, c7450nX2, jkVarM27067h, !(e2 instanceof C7472k))) {
                        throw C1359g.m5767x(e2, listA9);
                    }
                    listA9 = kotlin.collections.a9.mla(listA9, e2);
                    c7450nX2.kja0(true);
                    z2 = false;
                } catch (C7453s e3) {
                    if (!m27085n(e3.getLastConnectException(), c7450nX2, jkVarM27067h, false)) {
                        throw C1359g.m5767x(e3.getFirstConnectException(), listA9);
                    }
                    listA9 = kotlin.collections.a9.mla(listA9, e3.getFirstConnectException());
                    c7450nX2.kja0(true);
                    z2 = false;
                }
                if (jkVarZy == null) {
                    if (zyVarZurt != null && zyVarZurt.qrj()) {
                        c7450nX2.jp0y();
                    }
                    c7450nX2.kja0(false);
                    return ftiVar;
                }
                a9 a9VarM27305g = jkVarZy.m27305g();
                if (a9VarM27305g != null && a9VarM27305g.cdj()) {
                    c7450nX2.kja0(false);
                    return ftiVar;
                }
                jp0y jp0yVarHyr = ftiVar.hyr();
                if (jp0yVarHyr != null) {
                    C1359g.kja0(jp0yVarHyr);
                }
                i2++;
                if (i2 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i2);
                }
                c7450nX2.kja0(true);
                jkVarM27067h = jkVarZy;
                z2 = true;
            } catch (Throwable th) {
                c7450nX2.kja0(true);
                throw th;
            }
        }
    }
}
