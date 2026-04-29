package b7;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.qrj;
import okhttp3.x2;
import okhttp3.zurt;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC6769y(name = "Internal")
public final class toq {
    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final qrj m5774g(long j2, @InterfaceC7396q zurt url, @InterfaceC7396q String setCookie) {
        d2ok.m23075h(url, "url");
        d2ok.m23075h(setCookie, "setCookie");
        return qrj.f43528p.m27417g(j2, url, setCookie);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final fn3e.C7432k m5775k(@InterfaceC7396q fn3e.C7432k builder, @InterfaceC7396q String line) {
        d2ok.m23075h(builder, "builder");
        d2ok.m23075h(line, "line");
        return builder.m26865g(line);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final String m5776n(@InterfaceC7396q qrj cookie, boolean z2) {
        d2ok.m23075h(cookie, "cookie");
        return cookie.m27404z(z2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final fti m5777q(@InterfaceC7396q okhttp3.zy cache, @InterfaceC7396q jk request) {
        d2ok.m23075h(cache, "cache");
        d2ok.m23075h(request, "request");
        return cache.ld6(request);
    }

    @InterfaceC7396q
    public static final fn3e.C7432k toq(@InterfaceC7396q fn3e.C7432k builder, @InterfaceC7396q String name, @InterfaceC7396q String value) {
        d2ok.m23075h(builder, "builder");
        d2ok.m23075h(name, "name");
        d2ok.m23075h(value, "value");
        return builder.f7l8(name, value);
    }

    public static final void zy(@InterfaceC7396q x2 connectionSpec, @InterfaceC7396q SSLSocket sslSocket, boolean z2) {
        d2ok.m23075h(connectionSpec, "connectionSpec");
        d2ok.m23075h(sslSocket, "sslSocket");
        connectionSpec.m27476g(sslSocket, z2);
    }
}
