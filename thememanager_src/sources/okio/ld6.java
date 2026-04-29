package okio;

import java.io.EOFException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes4.dex */
final class ld6 implements vyq {
    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() {
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        source.skip(j2);
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return C7560j.f43770n;
    }
}
