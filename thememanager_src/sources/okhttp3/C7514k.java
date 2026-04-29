package okhttp3;

import b7.C1359g;
import com.xiaomi.onetrack.api.C5693g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.zurt;

/* JADX INFO: renamed from: okhttp3.k */
/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7514k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private final Proxy f94061f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final toq f43478g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final cdj f43479k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private final List<x2> f94062ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final f7l8 f43480n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final List<mcp> f43481p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final HostnameVerifier f43482q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final zurt f43483s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final SocketFactory f94063toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final ProxySelector f43484y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final SSLSocketFactory f94064zy;

    public C7514k(@InterfaceC7396q String uriHost, int i2, @InterfaceC7396q cdj dns, @InterfaceC7396q SocketFactory socketFactory, @InterfaceC7395n SSLSocketFactory sSLSocketFactory, @InterfaceC7395n HostnameVerifier hostnameVerifier, @InterfaceC7395n f7l8 f7l8Var, @InterfaceC7396q toq proxyAuthenticator, @InterfaceC7395n Proxy proxy, @InterfaceC7396q List<? extends mcp> protocols, @InterfaceC7396q List<x2> connectionSpecs, @InterfaceC7396q ProxySelector proxySelector) {
        d2ok.m23075h(uriHost, "uriHost");
        d2ok.m23075h(dns, "dns");
        d2ok.m23075h(socketFactory, "socketFactory");
        d2ok.m23075h(proxyAuthenticator, "proxyAuthenticator");
        d2ok.m23075h(protocols, "protocols");
        d2ok.m23075h(connectionSpecs, "connectionSpecs");
        d2ok.m23075h(proxySelector, "proxySelector");
        this.f43479k = dns;
        this.f94063toq = socketFactory;
        this.f94064zy = sSLSocketFactory;
        this.f43482q = hostnameVerifier;
        this.f43480n = f7l8Var;
        this.f43478g = proxyAuthenticator;
        this.f94061f7l8 = proxy;
        this.f43484y = proxySelector;
        this.f43483s = new zurt.C7535k().lvui(sSLSocketFactory != null ? "https" : "http").fu4(uriHost).jk(i2).m27539y();
        this.f43481p = C1359g.y9n(protocols);
        this.f94062ld6 = C1359g.y9n(connectionSpecs);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "protocols")
    public final List<mcp> cdj() {
        return this.f43481p;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C7514k) {
            C7514k c7514k = (C7514k) obj;
            if (d2ok.f7l8(this.f43483s, c7514k.f43483s) && kja0(c7514k)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxyAuthenticator")
    public final toq f7l8() {
        return this.f43478g;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "socketFactory")
    public final SocketFactory fn3e() {
        return this.f94063toq;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxy", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxy")
    /* JADX INFO: renamed from: g */
    public final Proxy m27337g() {
        return this.f94061f7l8;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "hostnameVerifier")
    /* JADX INFO: renamed from: h */
    public final HostnameVerifier m27338h() {
        return this.f43482q;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f43483s.hashCode()) * 31) + this.f43479k.hashCode()) * 31) + this.f43478g.hashCode()) * 31) + this.f43481p.hashCode()) * 31) + this.f94062ld6.hashCode()) * 31) + this.f43484y.hashCode()) * 31) + Objects.hashCode(this.f94061f7l8)) * 31) + Objects.hashCode(this.f94064zy)) * 31) + Objects.hashCode(this.f43482q)) * 31) + Objects.hashCode(this.f43480n);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "proxySelector")
    /* JADX INFO: renamed from: i */
    public final ProxySelector m27339i() {
        return this.f43484y;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "certificatePinner", imports = {}))
    @InterfaceC6769y(name = "-deprecated_certificatePinner")
    /* JADX INFO: renamed from: k */
    public final f7l8 m27340k() {
        return this.f43480n;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "proxy")
    public final Proxy ki() {
        return this.f94061f7l8;
    }

    public final boolean kja0(@InterfaceC7396q C7514k that) {
        d2ok.m23075h(that, "that");
        return d2ok.f7l8(this.f43479k, that.f43479k) && d2ok.f7l8(this.f43478g, that.f43478g) && d2ok.f7l8(this.f43481p, that.f43481p) && d2ok.f7l8(this.f94062ld6, that.f94062ld6) && d2ok.f7l8(this.f43484y, that.f43484y) && d2ok.f7l8(this.f94061f7l8, that.f94061f7l8) && d2ok.f7l8(this.f94064zy, that.f94064zy) && d2ok.f7l8(this.f43482q, that.f43482q) && d2ok.f7l8(this.f43480n, that.f43480n) && this.f43483s.m27520r() == that.f43483s.m27520r();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "url", imports = {}))
    @InterfaceC6769y(name = "-deprecated_url")
    public final zurt ld6() {
        return this.f43483s;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "protocols", imports = {}))
    @InterfaceC6769y(name = "-deprecated_protocols")
    /* JADX INFO: renamed from: n */
    public final List<mcp> m27341n() {
        return this.f43481p;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = C5693g.f31773O)
    public final cdj n7h() {
        return this.f43479k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "url")
    public final zurt ni7() {
        return this.f43483s;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "sslSocketFactory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_sslSocketFactory")
    /* JADX INFO: renamed from: p */
    public final SSLSocketFactory m27342p() {
        return this.f94064zy;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "hostnameVerifier", imports = {}))
    @InterfaceC6769y(name = "-deprecated_hostnameVerifier")
    /* JADX INFO: renamed from: q */
    public final HostnameVerifier m27343q() {
        return this.f43482q;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "connectionSpecs")
    public final List<x2> qrj() {
        return this.f94062ld6;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "socketFactory", imports = {}))
    @InterfaceC6769y(name = "-deprecated_socketFactory")
    /* JADX INFO: renamed from: s */
    public final SocketFactory m27344s() {
        return this.f94063toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "proxyAuthenticator")
    public final toq t8r() {
        return this.f43478g;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f43483s.fti());
        sb2.append(':');
        sb2.append(this.f43483s.m27520r());
        sb2.append(", ");
        if (this.f94061f7l8 != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f94061f7l8;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f43484y;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "connectionSpecs", imports = {}))
    @InterfaceC6769y(name = "-deprecated_connectionSpecs")
    public final List<x2> toq() {
        return this.f94062ld6;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "certificatePinner")
    public final f7l8 x2() {
        return this.f43480n;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "proxySelector", imports = {}))
    @InterfaceC6769y(name = "-deprecated_proxySelector")
    /* JADX INFO: renamed from: y */
    public final ProxySelector m27345y() {
        return this.f43484y;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "sslSocketFactory")
    public final SSLSocketFactory zurt() {
        return this.f94064zy;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31773O, imports = {}))
    @InterfaceC6769y(name = "-deprecated_dns")
    public final cdj zy() {
        return this.f43479k;
    }
}
