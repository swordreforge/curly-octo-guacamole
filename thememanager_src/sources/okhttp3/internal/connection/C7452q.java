package okhttp3.internal.connection;

import b7.C1359g;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7514k;
import okhttp3.C7529t;
import okhttp3.gvn7;
import okhttp3.internal.connection.C7451p;
import okhttp3.internal.http.InterfaceC7461q;
import okhttp3.internal.http2.C7472k;
import okhttp3.internal.http2.n7h;
import okhttp3.ki;
import okhttp3.zurt;

/* JADX INFO: renamed from: okhttp3.internal.connection.q */
/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7452q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f93885f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private C7451p f43106g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final f7l8 f43107k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private C7451p.toq f43108n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private gvn7 f43109p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ki f43110q;

    /* JADX INFO: renamed from: s */
    private int f43111s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C7514k f93886toq;

    /* JADX INFO: renamed from: y */
    private int f43112y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C7450n f93887zy;

    public C7452q(@InterfaceC7396q f7l8 connectionPool, @InterfaceC7396q C7514k address, @InterfaceC7396q C7450n call, @InterfaceC7396q ki eventListener) {
        d2ok.m23075h(connectionPool, "connectionPool");
        d2ok.m23075h(address, "address");
        d2ok.m23075h(call, "call");
        d2ok.m23075h(eventListener, "eventListener");
        this.f43107k = connectionPool;
        this.f93886toq = address;
        this.f93887zy = call;
        this.f43110q = eventListener;
    }

    /* JADX INFO: renamed from: g */
    private final gvn7 m27048g() {
        C7448g c7448gKi;
        if (this.f93885f7l8 > 1 || this.f43112y > 1 || this.f43111s > 0 || (c7448gKi = this.f93887zy.ki()) == null) {
            return null;
        }
        synchronized (c7448gKi) {
            if (c7448gKi.ni7() != 0) {
                return null;
            }
            if (C1359g.x2(c7448gKi.toq().m26913q().ni7(), this.f93886toq.ni7())) {
                return c7448gKi.toq();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.connection.C7448g toq(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C7452q.toq(int, int, int, int, boolean):okhttp3.internal.connection.g");
    }

    private final C7448g zy(int i2, int i3, int i4, int i5, boolean z2, boolean z3) throws IOException {
        while (true) {
            C7448g qVar = toq(i2, i3, i4, i5, z2);
            if (qVar.o1t(z3)) {
                return qVar;
            }
            qVar.a9();
            if (this.f43109p == null) {
                C7451p.toq toqVar = this.f43108n;
                if (toqVar != null ? toqVar.toq() : true) {
                    continue;
                } else {
                    C7451p c7451p = this.f43106g;
                    if (!(c7451p != null ? c7451p.m27045k() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    public final boolean f7l8(@InterfaceC7396q zurt url) {
        d2ok.m23075h(url, "url");
        zurt zurtVarNi7 = this.f93886toq.ni7();
        return url.m27520r() == zurtVarNi7.m27520r() && d2ok.f7l8(url.fti(), zurtVarNi7.fti());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final InterfaceC7461q m27049k(@InterfaceC7396q C7529t client, @InterfaceC7396q okhttp3.internal.http.f7l8 chain) {
        d2ok.m23075h(client, "client");
        d2ok.m23075h(chain, "chain");
        try {
            return zy(chain.qrj(), chain.kja0(), chain.cdj(), client.yz(), client.m27426a(), !d2ok.f7l8(chain.m27067h().qrj(), "GET")).m27024t(client, chain);
        } catch (IOException e2) {
            m27052y(e2);
            throw new C7453s(e2);
        } catch (C7453s e3) {
            m27052y(e3.getLastConnectException());
            throw e3;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m27050n() {
        C7451p c7451p;
        boolean z2 = false;
        if (this.f93885f7l8 == 0 && this.f43112y == 0 && this.f43111s == 0) {
            return false;
        }
        if (this.f43109p != null) {
            return true;
        }
        gvn7 gvn7VarM27048g = m27048g();
        if (gvn7VarM27048g != null) {
            this.f43109p = gvn7VarM27048g;
            return true;
        }
        C7451p.toq toqVar = this.f43108n;
        if (toqVar != null && toqVar.toq()) {
            z2 = true;
        }
        if (z2 || (c7451p = this.f43106g) == null) {
            return true;
        }
        return c7451p.m27045k();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final C7514k m27051q() {
        return this.f93886toq;
    }

    /* JADX INFO: renamed from: y */
    public final void m27052y(@InterfaceC7396q IOException e2) {
        d2ok.m23075h(e2, "e");
        this.f43109p = null;
        if ((e2 instanceof n7h) && ((n7h) e2).errorCode == okhttp3.internal.http2.toq.REFUSED_STREAM) {
            this.f93885f7l8++;
        } else if (e2 instanceof C7472k) {
            this.f43112y++;
        } else {
            this.f43111s++;
        }
    }
}
