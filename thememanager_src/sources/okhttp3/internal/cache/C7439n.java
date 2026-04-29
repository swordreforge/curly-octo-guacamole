package okhttp3.internal.cache;

import cyoe.x2;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import okio.fu4;
import okio.vyq;

/* JADX INFO: renamed from: okhttp3.internal.cache.n */
/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes4.dex */
public class C7439n extends fu4 {

    /* JADX INFO: renamed from: n */
    private boolean f42971n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final x2<IOException, was> f42972q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7439n(@InterfaceC7396q vyq delegate, @InterfaceC7396q x2<? super IOException, was> onException) {
        super(delegate);
        d2ok.m23075h(delegate, "delegate");
        d2ok.m23075h(onException, "onException");
        this.f42972q = onException;
    }

    @Override // okio.fu4, okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42971n) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.f42971n = true;
            this.f42972q.invoke(e2);
        }
    }

    @Override // okio.fu4, okio.vyq, java.io.Flushable
    public void flush() {
        if (this.f42971n) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.f42971n = true;
            this.f42972q.invoke(e2);
        }
    }

    @Override // okio.fu4, okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q okio.x2 source, long j2) throws EOFException {
        d2ok.m23075h(source, "source");
        if (this.f42971n) {
            source.skip(j2);
            return;
        }
        try {
            super.mo26936j(source, j2);
        } catch (IOException e2) {
            this.f42971n = true;
            this.f42972q.invoke(e2);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final x2<IOException, was> m26937q() {
        return this.f42972q;
    }
}
