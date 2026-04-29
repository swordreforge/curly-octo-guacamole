package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
public final class wvg implements vyq {

    /* JADX INFO: renamed from: g */
    private boolean f43841g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final hyr f43842k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ki f43843n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Deflater f43844q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final CRC32 f43845y;

    public wvg(@InterfaceC7396q vyq sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        hyr hyrVar = new hyr(sink);
        this.f43842k = hyrVar;
        Deflater deflater = new Deflater(-1, true);
        this.f43844q = deflater;
        this.f43843n = new ki((qrj) hyrVar, deflater);
        this.f43845y = new CRC32();
        x2 x2Var = hyrVar.f43730q;
        x2Var.writeShort(8075);
        x2Var.writeByte(8);
        x2Var.writeByte(0);
        x2Var.writeInt(0);
        x2Var.writeByte(0);
        x2Var.writeByte(0);
    }

    /* JADX INFO: renamed from: q */
    private final void m27864q(x2 x2Var, long j2) {
        C7541c c7541c = x2Var.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            this.f43845y.update(c7541c.f43687k, c7541c.f94263toq, iMin);
            j2 -= (long) iMin;
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m27865y() {
        this.f43842k.zsr0((int) this.f43845y.getValue());
        this.f43842k.zsr0((int) this.f43844q.getBytesRead());
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f43841g) {
            return;
        }
        Throwable th = null;
        try {
            this.f43843n.zy();
            m27865y();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f43844q.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f43842k.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f43841g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        this.f43843n.flush();
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return;
        }
        m27864q(source, j2);
        this.f43843n.mo26936j(source, j2);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "deflater", imports = {}))
    @InterfaceC6769y(name = "-deprecated_deflater")
    /* JADX INFO: renamed from: k */
    public final Deflater m27866k() {
        return this.f43844q;
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43842k.toq();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "deflater")
    public final Deflater zy() {
        return this.f43844q;
    }
}
