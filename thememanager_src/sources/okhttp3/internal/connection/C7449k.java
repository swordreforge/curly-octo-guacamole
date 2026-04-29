package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okhttp3.fti;
import okhttp3.ni7;

/* JADX INFO: renamed from: okhttp3.internal.connection.k */
/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7449k implements ni7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7449k f43075k = new C7449k();

    private C7449k() {
    }

    @Override // okhttp3.ni7
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) throws IOException {
        d2ok.m23075h(chain, "chain");
        okhttp3.internal.http.f7l8 f7l8Var = (okhttp3.internal.http.f7l8) chain;
        return okhttp3.internal.http.f7l8.ld6(f7l8Var, 0, f7l8Var.x2().m27036z(f7l8Var), null, 0, 0, 0, 61, null).mo27071q(f7l8Var.m27067h());
    }
}
