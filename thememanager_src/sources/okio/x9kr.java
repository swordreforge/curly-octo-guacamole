package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
final class x9kr implements vyq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final OutputStream f43857k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C7560j f43858q;

    public x9kr(@InterfaceC7396q OutputStream out, @InterfaceC7396q C7560j timeout) {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        kotlin.jvm.internal.d2ok.m23075h(timeout, "timeout");
        this.f43857k = out;
        this.f43858q = timeout;
    }

    @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43857k.close();
    }

    @Override // okio.vyq, java.io.Flushable
    public void flush() throws IOException {
        this.f43857k.flush();
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        C7575s.m27855n(source.size(), 0L, j2);
        while (j2 > 0) {
            this.f43858q.mo27760s();
            C7541c c7541c = source.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            this.f43857k.write(c7541c.f43687k, c7541c.f94263toq, iMin);
            c7541c.f94263toq += iMin;
            long j3 = iMin;
            j2 -= j3;
            source.vy(source.size() - j3);
            if (c7541c.f94263toq == c7541c.f94264zy) {
                source.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            }
        }
    }

    @InterfaceC7396q
    public String toString() {
        return "sink(" + this.f43857k + ')';
    }

    @Override // okio.vyq
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43858q;
    }
}
