package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C6144h;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface cdj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7428k f42920k = C7428k.f42921k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final cdj f93816toq = new C7428k.k();

    /* JADX INFO: renamed from: okhttp3.cdj$k */
    /* JADX INFO: compiled from: Dns.kt */
    public static final class C7428k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C7428k f42921k = new C7428k();

        /* JADX INFO: renamed from: okhttp3.cdj$k$k */
        /* JADX INFO: compiled from: Dns.kt */
        private static final class k implements cdj {
            @Override // okhttp3.cdj
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public List<InetAddress> mo26842k(@InterfaceC7396q String hostname) throws UnknownHostException {
                d2ok.m23075h(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    d2ok.kja0(allByName, "getAllByName(hostname)");
                    return C6144h.vyee(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            }
        }

        private C7428k() {
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    List<InetAddress> mo26842k(@InterfaceC7396q String str) throws UnknownHostException;
}
