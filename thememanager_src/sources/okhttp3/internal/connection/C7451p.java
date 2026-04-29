package okhttp3.internal.connection;

import b7.C1359g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C6163t;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;
import okhttp3.C7514k;
import okhttp3.InterfaceC7519n;
import okhttp3.gvn7;
import okhttp3.ki;
import okhttp3.zurt;

/* JADX INFO: renamed from: okhttp3.internal.connection.p */
/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7451p {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final k f43099s = new k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private List<? extends InetSocketAddress> f93881f7l8;

    /* JADX INFO: renamed from: g */
    private int f43100g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7514k f43101k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private List<? extends Proxy> f43102n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ki f43103q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C7454y f93882toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final List<gvn7> f43104y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final InterfaceC7519n f93883zy;

    /* JADX INFO: renamed from: okhttp3.internal.connection.p$k */
    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final String m27046k(@InterfaceC7396q InetSocketAddress inetSocketAddress) {
            d2ok.m23075h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                d2ok.kja0(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            d2ok.kja0(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.p$toq */
    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final List<gvn7> f43105k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f93884toq;

        public toq(@InterfaceC7396q List<gvn7> routes) {
            d2ok.m23075h(routes, "routes");
            this.f43105k = routes;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final List<gvn7> m27047k() {
            return this.f43105k;
        }

        public final boolean toq() {
            return this.f93884toq < this.f43105k.size();
        }

        @InterfaceC7396q
        public final gvn7 zy() {
            if (!toq()) {
                throw new NoSuchElementException();
            }
            List<gvn7> list = this.f43105k;
            int i2 = this.f93884toq;
            this.f93884toq = i2 + 1;
            return list.get(i2);
        }
    }

    public C7451p(@InterfaceC7396q C7514k address, @InterfaceC7396q C7454y routeDatabase, @InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q ki eventListener) {
        d2ok.m23075h(address, "address");
        d2ok.m23075h(routeDatabase, "routeDatabase");
        d2ok.m23075h(call, "call");
        d2ok.m23075h(eventListener, "eventListener");
        this.f43101k = address;
        this.f93882toq = routeDatabase;
        this.f93883zy = call;
        this.f43103q = eventListener;
        this.f43102n = kotlin.collections.ni7.a9();
        this.f93881f7l8 = kotlin.collections.ni7.a9();
        this.f43104y = new ArrayList();
        m27042g(address.ni7(), address.ki());
    }

    private static final List<Proxy> f7l8(Proxy proxy, zurt zurtVar, C7451p c7451p) {
        if (proxy != null) {
            return kotlin.collections.zurt.ld6(proxy);
        }
        URI uriM27511e = zurtVar.m27511e();
        if (uriM27511e.getHost() == null) {
            return C1359g.mcp(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = c7451p.f43101k.m27339i().select(uriM27511e);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return C1359g.mcp(Proxy.NO_PROXY);
        }
        d2ok.kja0(proxiesOrNull, "proxiesOrNull");
        return C1359g.y9n(proxiesOrNull);
    }

    /* JADX INFO: renamed from: g */
    private final void m27042g(zurt zurtVar, Proxy proxy) {
        this.f43103q.mo27347h(this.f93883zy, zurtVar);
        List<Proxy> listF7l8 = f7l8(proxy, zurtVar, this);
        this.f43102n = listF7l8;
        this.f43100g = 0;
        this.f43103q.kja0(this.f93883zy, zurtVar, listF7l8);
    }

    /* JADX INFO: renamed from: n */
    private final void m27043n(Proxy proxy) throws IOException {
        String strFti;
        int iM27520r;
        List<InetAddress> listMo26842k;
        ArrayList arrayList = new ArrayList();
        this.f93881f7l8 = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strFti = this.f43101k.ni7().fti();
            iM27520r = this.f43101k.ni7().m27520r();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            k kVar = f43099s;
            d2ok.kja0(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strFti = kVar.m27046k(inetSocketAddress);
            iM27520r = inetSocketAddress.getPort();
        }
        boolean z2 = false;
        if (1 <= iM27520r && iM27520r < 65536) {
            z2 = true;
        }
        if (!z2) {
            throw new SocketException("No route to " + strFti + ':' + iM27520r + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strFti, iM27520r));
            return;
        }
        if (C1359g.ld6(strFti)) {
            listMo26842k = kotlin.collections.zurt.ld6(InetAddress.getByName(strFti));
        } else {
            this.f43103q.n7h(this.f93883zy, strFti);
            listMo26842k = this.f43101k.n7h().mo26842k(strFti);
            if (listMo26842k.isEmpty()) {
                throw new UnknownHostException(this.f43101k.n7h() + " returned no addresses for " + strFti);
            }
            this.f43103q.qrj(this.f93883zy, strFti, listMo26842k);
        }
        Iterator<InetAddress> it = listMo26842k.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iM27520r));
        }
    }

    /* JADX INFO: renamed from: q */
    private final Proxy m27044q() throws IOException {
        if (toq()) {
            List<? extends Proxy> list = this.f43102n;
            int i2 = this.f43100g;
            this.f43100g = i2 + 1;
            Proxy proxy = list.get(i2);
            m27043n(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f43101k.ni7().fti() + "; exhausted proxy configurations: " + this.f43102n);
    }

    private final boolean toq() {
        return this.f43100g < this.f43102n.size();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27045k() {
        return toq() || (this.f43104y.isEmpty() ^ true);
    }

    @InterfaceC7396q
    public final toq zy() throws IOException {
        if (!m27045k()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (toq()) {
            Proxy proxyM27044q = m27044q();
            Iterator<? extends InetSocketAddress> it = this.f93881f7l8.iterator();
            while (it.hasNext()) {
                gvn7 gvn7Var = new gvn7(this.f43101k, proxyM27044q, it.next());
                if (this.f93882toq.zy(gvn7Var)) {
                    this.f43104y.add(gvn7Var);
                } else {
                    arrayList.add(gvn7Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C6163t.zp(arrayList, this.f43104y);
            this.f43104y.clear();
        }
        return new toq(arrayList);
    }
}
