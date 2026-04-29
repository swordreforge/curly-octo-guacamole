package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class gvn7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7514k f42957k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Proxy f93830toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final InetSocketAddress f93831zy;

    public gvn7(@InterfaceC7396q C7514k address, @InterfaceC7396q Proxy proxy, @InterfaceC7396q InetSocketAddress socketAddress) {
        d2ok.m23075h(address, "address");
        d2ok.m23075h(proxy, "proxy");
        d2ok.m23075h(socketAddress, "socketAddress");
        this.f42957k = address;
        this.f93830toq = proxy;
        this.f93831zy = socketAddress;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof gvn7) {
            gvn7 gvn7Var = (gvn7) obj;
            if (d2ok.f7l8(gvn7Var.f42957k, this.f42957k) && d2ok.f7l8(gvn7Var.f93830toq, this.f93830toq) && d2ok.f7l8(gvn7Var.f93831zy, this.f93831zy)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "socketAddress")
    public final InetSocketAddress f7l8() {
        return this.f93831zy;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m26910g() {
        return this.f42957k.zurt() != null && this.f93830toq.type() == Proxy.Type.HTTP;
    }

    public int hashCode() {
        return ((((527 + this.f42957k.hashCode()) * 31) + this.f93830toq.hashCode()) * 31) + this.f93831zy.hashCode();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "address", imports = {}))
    @InterfaceC6769y(name = "-deprecated_address")
    /* JADX INFO: renamed from: k */
    public final C7514k m26911k() {
        return this.f42957k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "proxy")
    /* JADX INFO: renamed from: n */
    public final Proxy m26912n() {
        return this.f93830toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "address")
    /* JADX INFO: renamed from: q */
    public final C7514k m26913q() {
        return this.f42957k;
    }

    @InterfaceC7396q
    public String toString() {
        return "Route{" + this.f93831zy + '}';
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxy", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxy")
    public final Proxy toq() {
        return this.f93830toq;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "socketAddress", imports = {}))
    @InterfaceC6769y(name = "-deprecated_socketAddress")
    public final InetSocketAddress zy() {
        return this.f93831zy;
    }
}
