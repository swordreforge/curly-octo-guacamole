package okio;

import java.io.IOException;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.z */
/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7579z implements nn86 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final nn86 f43859k;

    public AbstractC7579z(@InterfaceC7396q nn86 delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f43859k = delegate;
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43859k.close();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "delegate", imports = {}))
    @InterfaceC6769y(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: k */
    public final nn86 m27879k() {
        return this.f43859k;
    }

    @InterfaceC7396q
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f43859k + ')';
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43859k.toq();
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return this.f43859k.wx16(sink, j2);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "delegate")
    public final nn86 zy() {
        return this.f43859k;
    }
}
