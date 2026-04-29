package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.e */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes4.dex */
final class C7543e extends C7572p {

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final Socket f43700h;

    public C7543e(@InterfaceC7396q Socket socket) {
        kotlin.jvm.internal.d2ok.m23075h(socket, "socket");
        this.f43700h = socket;
    }

    @Override // okio.C7572p
    protected void fti() {
        try {
            this.f43700h.close();
        } catch (AssertionError e2) {
            if (!d2ok.x2(e2)) {
                throw e2;
            }
            lvui.f43792k.log(Level.WARNING, "Failed to close timed out socket " + this.f43700h, (Throwable) e2);
        } catch (Exception e3) {
            lvui.f43792k.log(Level.WARNING, "Failed to close timed out socket " + this.f43700h, (Throwable) e3);
        }
    }

    @Override // okio.C7572p
    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    protected IOException mo27180t(@InterfaceC7395n IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
