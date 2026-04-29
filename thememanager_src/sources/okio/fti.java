package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
class fti implements nn86 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InputStream f43715k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C7560j f43716q;

    public fti(@InterfaceC7396q InputStream input, @InterfaceC7396q C7560j timeout) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        kotlin.jvm.internal.d2ok.m23075h(timeout, "timeout");
        this.f43715k = input;
        this.f43716q = timeout;
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43715k.close();
    }

    @InterfaceC7396q
    public String toString() {
        return "source(" + this.f43715k + ')';
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43716q;
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        try {
            this.f43716q.mo27760s();
            C7541c c7541cM58i = sink.m58i(1);
            int i2 = this.f43715k.read(c7541cM58i.f43687k, c7541cM58i.f94264zy, (int) Math.min(j2, 8192 - c7541cM58i.f94264zy));
            if (i2 != -1) {
                c7541cM58i.f94264zy += i2;
                long j3 = i2;
                sink.vy(sink.size() + j3);
                return j3;
            }
            if (c7541cM58i.f94263toq != c7541cM58i.f94264zy) {
                return -1L;
            }
            sink.f43846k = c7541cM58i.toq();
            lrht.m27786q(c7541cM58i);
            return -1L;
        } catch (AssertionError e2) {
            if (d2ok.x2(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }
}
