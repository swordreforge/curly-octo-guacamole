package okio;

import java.io.IOException;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class fu4 implements vyq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final vyq f43717k;

    public fu4(@InterfaceC7396q vyq delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f43717k = delegate;
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43717k.close();
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        this.f43717k.flush();
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        this.f43717k.mo26936j(source, j2);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "delegate", imports = {}))
    @InterfaceC6769y(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: k */
    public final vyq m27622k() {
        return this.f43717k;
    }

    @InterfaceC7396q
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f43717k + ')';
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43717k.toq();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "delegate")
    public final vyq zy() {
        return this.f43717k;
    }
}
