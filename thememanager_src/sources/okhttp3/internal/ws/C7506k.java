package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okio.ki;
import okio.kja0;
import okio.vyq;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.ws.k */
/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7506k implements Closeable {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ki f43402g;

    /* JADX INFO: renamed from: k */
    private final boolean f43403k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Deflater f43404n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final x2 f43405q;

    public C7506k(boolean z2) {
        this.f43403k = z2;
        x2 x2Var = new x2();
        this.f43405q = x2Var;
        Deflater deflater = new Deflater(-1, true);
        this.f43404n = deflater;
        this.f43402g = new ki((vyq) x2Var, deflater);
    }

    private final boolean zy(x2 x2Var, kja0 kja0Var) {
        return x2Var.vyq(x2Var.size() - ((long) kja0Var.size()), kja0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f43402g.close();
    }

    /* JADX INFO: renamed from: k */
    public final void m27279k(@InterfaceC7396q x2 buffer) throws IOException {
        d2ok.m23075h(buffer, "buffer");
        if (!(this.f43405q.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f43403k) {
            this.f43404n.reset();
        }
        this.f43402g.mo26936j(buffer, buffer.size());
        this.f43402g.flush();
        if (zy(this.f43405q, toq.f43441k)) {
            long size = this.f43405q.size() - ((long) 4);
            x2.C7577k c7577kNgy = x2.ngy(this.f43405q, null, 1, null);
            try {
                c7577kNgy.m27877y(size);
                kotlin.io.zy.m23032k(c7577kNgy, null);
            } finally {
            }
        } else {
            this.f43405q.writeByte(0);
        }
        x2 x2Var = this.f43405q;
        buffer.mo26936j(x2Var, x2Var.size());
    }
}
