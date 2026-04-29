package kl7m;

import com.google.common.net.zy;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7514k;
import okhttp3.C7533y;
import okhttp3.cdj;
import okhttp3.fti;
import okhttp3.gvn7;
import okhttp3.jk;
import okhttp3.kja0;
import okhttp3.toq;
import okhttp3.zurt;

/* JADX INFO: renamed from: kl7m.k */
/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C6122k implements toq {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final cdj f36102q;

    /* JADX INFO: renamed from: kl7m.k$k */
    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    public /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36103k;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36103k = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6122k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C6122k(@InterfaceC7396q cdj defaultDns) {
        d2ok.m23075h(defaultDns, "defaultDns");
        this.f36102q = defaultDns;
    }

    private final InetAddress toq(Proxy proxy, zurt zurtVar, cdj cdjVar) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : k.f36103k[type.ordinal()]) == 1) {
            return (InetAddress) a9.imd(cdjVar.mo26842k(zurtVar.fti()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        d2ok.n7h(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        d2ok.kja0(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.toq
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public jk mo22402k(@InterfaceC7395n gvn7 gvn7Var, @InterfaceC7396q fti response) throws IOException {
        Proxy proxy;
        cdj cdjVarN7h;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C7514k c7514kM26913q;
        d2ok.m23075h(response, "response");
        List<C7533y> listY9n = response.y9n();
        jk jkVarWlev = response.wlev();
        zurt zurtVarCdj = jkVarWlev.cdj();
        boolean z2 = response.i1() == 407;
        if (gvn7Var == null || (proxy = gvn7Var.m26912n()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C7533y c7533y : listY9n) {
            if (kotlin.text.a9.e5("Basic", c7533y.m27493y(), true)) {
                if (gvn7Var == null || (c7514kM26913q = gvn7Var.m26913q()) == null || (cdjVarN7h = c7514kM26913q.n7h()) == null) {
                    cdjVarN7h = this.f36102q;
                }
                if (z2) {
                    SocketAddress socketAddressAddress = proxy.address();
                    d2ok.n7h(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    d2ok.kja0(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, toq(proxy, zurtVarCdj, cdjVarN7h), inetSocketAddress.getPort(), zurtVarCdj.uv6(), c7533y.f7l8(), c7533y.m27493y(), zurtVarCdj.nn86(), Authenticator.RequestorType.PROXY);
                } else {
                    String strFti = zurtVarCdj.fti();
                    d2ok.kja0(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strFti, toq(proxy, zurtVarCdj, cdjVarN7h), zurtVarCdj.m27520r(), zurtVarCdj.uv6(), c7533y.f7l8(), c7533y.m27493y(), zurtVarCdj.nn86(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z2 ? zy.f68508fti : zy.f68534n7h;
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    d2ok.kja0(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    d2ok.kja0(password, "auth.password");
                    return jkVarWlev.n7h().n7h(str, kja0.toq(userName, new String(password), c7533y.m27488g())).toq();
                }
            }
        }
        return null;
    }

    public /* synthetic */ C6122k(cdj cdjVar, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? cdj.f93816toq : cdjVar);
    }
}
