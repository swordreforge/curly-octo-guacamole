package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
public final class ki implements vyq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final qrj f43778k;

    /* JADX INFO: renamed from: n */
    private boolean f43779n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Deflater f43780q;

    public ki(@InterfaceC7396q qrj sink, @InterfaceC7396q Deflater deflater) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(deflater, "deflater");
        this.f43778k = sink;
        this.f43780q = deflater;
    }

    /* JADX INFO: renamed from: k */
    private final void m27775k(boolean z2) throws IOException {
        C7541c c7541cM58i;
        int iDeflate;
        x2 x2VarMo27638g = this.f43778k.mo27638g();
        while (true) {
            c7541cM58i = x2VarMo27638g.m58i(1);
            if (z2) {
                try {
                    Deflater deflater = this.f43780q;
                    byte[] bArr = c7541cM58i.f43687k;
                    int i2 = c7541cM58i.f94264zy;
                    iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                Deflater deflater2 = this.f43780q;
                byte[] bArr2 = c7541cM58i.f43687k;
                int i3 = c7541cM58i.f94264zy;
                iDeflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                c7541cM58i.f94264zy += iDeflate;
                x2VarMo27638g.vy(x2VarMo27638g.size() + ((long) iDeflate));
                this.f43778k.eqxt();
            } else if (this.f43780q.needsInput()) {
                break;
            }
        }
        if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
            x2VarMo27638g.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
        }
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f43779n) {
            return;
        }
        Throwable th = null;
        try {
            zy();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f43780q.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f43778k.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f43779n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        m27775k(true);
        this.f43778k.flush();
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        C7575s.m27855n(source.size(), 0L, j2);
        while (j2 > 0) {
            C7541c c7541c = source.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            this.f43780q.setInput(c7541c.f43687k, c7541c.f94263toq, iMin);
            m27775k(false);
            long j3 = iMin;
            source.vy(source.size() - j3);
            int i2 = c7541c.f94263toq + iMin;
            c7541c.f94263toq = i2;
            if (i2 == c7541c.f94264zy) {
                source.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            }
            j2 -= j3;
        }
    }

    @InterfaceC7396q
    public String toString() {
        return "DeflaterSink(" + this.f43778k + ')';
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43778k.toq();
    }

    public final void zy() throws IOException {
        this.f43780q.finish();
        m27775k(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ki(@InterfaceC7396q vyq sink, @InterfaceC7396q Deflater deflater) {
        this(d2ok.m27594q(sink), deflater);
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(deflater, "deflater");
    }
}
