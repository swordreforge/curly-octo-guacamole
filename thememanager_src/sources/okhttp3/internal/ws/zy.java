package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okio.a9;
import okio.nn86;
import okio.x2;

/* JADX INFO: compiled from: MessageInflater.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy implements Closeable {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final a9 f43458g;

    /* JADX INFO: renamed from: k */
    private final boolean f43459k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Inflater f43460n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final x2 f43461q;

    public zy(boolean z2) {
        this.f43459k = z2;
        x2 x2Var = new x2();
        this.f43461q = x2Var;
        Inflater inflater = new Inflater(true);
        this.f43460n = inflater;
        this.f43458g = new a9((nn86) x2Var, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43458g.close();
    }

    /* JADX INFO: renamed from: k */
    public final void m27304k(@InterfaceC7396q x2 buffer) throws IOException {
        d2ok.m23075h(buffer, "buffer");
        if (!(this.f43461q.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f43459k) {
            this.f43460n.reset();
        }
        this.f43461q.ek5k(buffer);
        this.f43461q.writeInt(65535);
        long bytesRead = this.f43460n.getBytesRead() + this.f43461q.size();
        do {
            this.f43458g.m27580k(buffer, Long.MAX_VALUE);
        } while (this.f43460n.getBytesRead() < bytesRead);
    }
}
