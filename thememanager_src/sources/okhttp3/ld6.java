package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okhttp3.internal.concurrent.C7445q;

/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final okhttp3.internal.connection.f7l8 f43487k;

    public ld6(@InterfaceC7396q okhttp3.internal.connection.f7l8 delegate) {
        d2ok.m23075h(delegate, "delegate");
        this.f43487k = delegate;
    }

    /* JADX INFO: renamed from: k */
    public final int m27358k() {
        return this.f43487k.m27012q();
    }

    /* JADX INFO: renamed from: q */
    public final int m27359q() {
        return this.f43487k.m27009g();
    }

    public final void toq() {
        this.f43487k.m27011n();
    }

    @InterfaceC7396q
    public final okhttp3.internal.connection.f7l8 zy() {
        return this.f43487k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ld6(int i2, long j2, @InterfaceC7396q TimeUnit timeUnit) {
        this(new okhttp3.internal.connection.f7l8(C7445q.f43045s, i2, j2, timeUnit));
        d2ok.m23075h(timeUnit, "timeUnit");
    }

    public ld6() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
