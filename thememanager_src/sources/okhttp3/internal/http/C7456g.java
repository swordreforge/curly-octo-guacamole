package okhttp3.internal.http;

import kotlin.jvm.internal.d2ok;
import l05.qrj;
import mub.InterfaceC7396q;
import y9n.InterfaceC7782q;

/* JADX INFO: renamed from: okhttp3.internal.http.g */
/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7456g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7456g f43137k = new C7456g();

    private C7456g() {
    }

    @qrj
    /* JADX INFO: renamed from: n */
    public static final boolean m27074n(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return d2ok.f7l8(method, "POST") || d2ok.f7l8(method, "PUT") || d2ok.f7l8(method, "PATCH") || d2ok.f7l8(method, "PROPPATCH") || d2ok.f7l8(method, "REPORT");
    }

    @qrj
    public static final boolean toq(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return (d2ok.f7l8(method, "GET") || d2ok.f7l8(method, "HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27075k(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return d2ok.f7l8(method, "POST") || d2ok.f7l8(method, "PATCH") || d2ok.f7l8(method, "PUT") || d2ok.f7l8(method, InterfaceC7782q.f100601fu4) || d2ok.f7l8(method, "MOVE");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m27076q(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return d2ok.f7l8(method, "PROPFIND");
    }

    public final boolean zy(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return !d2ok.f7l8(method, "PROPFIND");
    }
}
