package okio;

import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CipherSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class cdj implements nn86 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final x2 f43690g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final n7h f43691k;

    /* JADX INFO: renamed from: n */
    private final int f43692n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Cipher f43693q;

    /* JADX INFO: renamed from: s */
    private boolean f43694s;

    /* JADX INFO: renamed from: y */
    private boolean f43695y;

    public cdj(@InterfaceC7396q n7h source, @InterfaceC7396q Cipher cipher) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(cipher, "cipher");
        this.f43691k = source;
        this.f43693q = cipher;
        int blockSize = cipher.getBlockSize();
        this.f43692n = blockSize;
        this.f43690g = new x2();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    /* JADX INFO: renamed from: k */
    private final void m27585k() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.f43693q.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        C7541c c7541cM58i = this.f43690g.m58i(outputSize);
        int iDoFinal = this.f43693q.doFinal(c7541cM58i.f43687k, c7541cM58i.f94263toq);
        c7541cM58i.f94264zy += iDoFinal;
        x2 x2Var = this.f43690g;
        x2Var.vy(x2Var.size() + ((long) iDoFinal));
        if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
            this.f43690g.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m27586q() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        while (this.f43690g.size() == 0 && !this.f43695y) {
            if (this.f43691k.py()) {
                this.f43695y = true;
                m27585k();
                return;
            }
            m27587y();
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m27587y() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        C7541c c7541c = this.f43691k.mo27611g().f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94264zy - c7541c.f94263toq;
        int outputSize = this.f43693q.getOutputSize(i2);
        while (outputSize > 8192) {
            int i3 = this.f43692n;
            if (i2 <= i3) {
                this.f43695y = true;
                x2 x2Var = this.f43690g;
                byte[] bArrDoFinal = this.f43693q.doFinal(this.f43691k.gbni());
                kotlin.jvm.internal.d2ok.kja0(bArrDoFinal, "doFinal(...)");
                x2Var.write(bArrDoFinal);
                return;
            }
            i2 -= i3;
            outputSize = this.f43693q.getOutputSize(i2);
        }
        C7541c c7541cM58i = this.f43690g.m58i(outputSize);
        int iUpdate = this.f43693q.update(c7541c.f43687k, c7541c.f94263toq, i2, c7541cM58i.f43687k, c7541cM58i.f94263toq);
        this.f43691k.skip(i2);
        c7541cM58i.f94264zy += iUpdate;
        x2 x2Var2 = this.f43690g;
        x2Var2.vy(x2Var2.size() + ((long) iUpdate));
        if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
            this.f43690g.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
        }
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43694s = true;
        this.f43691k.close();
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43691k.toq();
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(true ^ this.f43694s)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        m27586q();
        return this.f43690g.wx16(sink, j2);
    }

    @InterfaceC7396q
    public final Cipher zy() {
        return this.f43693q;
    }
}
