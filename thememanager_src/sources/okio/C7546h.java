package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.h */
/* JADX INFO: compiled from: CipherSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class C7546h implements vyq {

    /* JADX INFO: renamed from: g */
    private boolean f43718g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj f43719k;

    /* JADX INFO: renamed from: n */
    private final int f43720n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Cipher f43721q;

    public C7546h(@InterfaceC7396q qrj sink, @InterfaceC7396q Cipher cipher) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(cipher, "cipher");
        this.f43719k = sink;
        this.f43721q = cipher;
        int blockSize = cipher.getBlockSize();
        this.f43720n = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    /* JADX INFO: renamed from: k */
    private final Throwable m27628k() {
        int outputSize = this.f43721q.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                qrj qrjVar = this.f43719k;
                byte[] bArrDoFinal = this.f43721q.doFinal();
                kotlin.jvm.internal.d2ok.kja0(bArrDoFinal, "doFinal(...)");
                qrjVar.write(bArrDoFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }
        x2 x2VarMo27638g = this.f43719k.mo27638g();
        C7541c c7541cM58i = x2VarMo27638g.m58i(outputSize);
        try {
            int iDoFinal = this.f43721q.doFinal(c7541cM58i.f43687k, c7541cM58i.f94264zy);
            c7541cM58i.f94264zy += iDoFinal;
            x2VarMo27638g.vy(x2VarMo27638g.size() + ((long) iDoFinal));
        } catch (Throwable th3) {
            th = th3;
        }
        if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
            x2VarMo27638g.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
        }
        return th;
    }

    /* JADX INFO: renamed from: q */
    private final int m27629q(x2 x2Var, long j2) throws IOException, ShortBufferException {
        C7541c c7541c = x2Var.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
        x2 x2VarMo27638g = this.f43719k.mo27638g();
        int outputSize = this.f43721q.getOutputSize(iMin);
        while (outputSize > 8192) {
            int i2 = this.f43720n;
            if (iMin <= i2) {
                qrj qrjVar = this.f43719k;
                byte[] bArrUpdate = this.f43721q.update(x2Var.lv5(j2));
                kotlin.jvm.internal.d2ok.kja0(bArrUpdate, "update(...)");
                qrjVar.write(bArrUpdate);
                return (int) j2;
            }
            iMin -= i2;
            outputSize = this.f43721q.getOutputSize(iMin);
        }
        C7541c c7541cM58i = x2VarMo27638g.m58i(outputSize);
        int iUpdate = this.f43721q.update(c7541c.f43687k, c7541c.f94263toq, iMin, c7541cM58i.f43687k, c7541cM58i.f94264zy);
        c7541cM58i.f94264zy += iUpdate;
        x2VarMo27638g.vy(x2VarMo27638g.size() + ((long) iUpdate));
        if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
            x2VarMo27638g.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
        }
        this.f43719k.eqxt();
        x2Var.vy(x2Var.size() - ((long) iMin));
        int i3 = c7541c.f94263toq + iMin;
        c7541c.f94263toq = i3;
        if (i3 == c7541c.f94264zy) {
            x2Var.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return iMin;
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f43718g) {
            return;
        }
        this.f43718g = true;
        Throwable thM27628k = m27628k();
        try {
            this.f43719k.close();
        } catch (Throwable th) {
            if (thM27628k == null) {
                thM27628k = th;
            }
        }
        if (thM27628k != null) {
            throw thM27628k;
        }
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        this.f43719k.flush();
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        C7575s.m27855n(source.size(), 0L, j2);
        if (!(!this.f43718g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            j2 -= (long) m27629q(source, j2);
        }
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43719k.toq();
    }

    @InterfaceC7396q
    public final Cipher zy() {
        return this.f43721q;
    }
}
