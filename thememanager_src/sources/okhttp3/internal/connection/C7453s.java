package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.C6231h;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.internal.connection.s */
/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7453s extends RuntimeException {

    @InterfaceC7396q
    private final IOException firstConnectException;

    @InterfaceC7396q
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7453s(@InterfaceC7396q IOException firstConnectException) {
        super(firstConnectException);
        d2ok.m23075h(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@InterfaceC7396q IOException e2) {
        d2ok.m23075h(e2, "e");
        C6231h.m22845k(this.firstConnectException, e2);
        this.lastConnectException = e2;
    }

    @InterfaceC7396q
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @InterfaceC7396q
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
