package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Sink.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface vyq extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    /* JADX INFO: renamed from: j */
    void mo26936j(@InterfaceC7396q x2 x2Var, long j2) throws IOException;

    @InterfaceC7396q
    C7560j toq();
}
