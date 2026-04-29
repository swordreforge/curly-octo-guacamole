package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: StreamResetException.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n7h extends IOException {

    @InterfaceC7396q
    @InterfaceC6765n
    public final toq errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7h(@InterfaceC7396q toq errorCode) {
        super("stream was reset: " + errorCode);
        d2ok.m23075h(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
