package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
public final class a9 implements nn86 {

    /* JADX INFO: renamed from: g */
    private boolean f43679g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final n7h f43680k;

    /* JADX INFO: renamed from: n */
    private int f43681n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Inflater f43682q;

    public a9(@InterfaceC7396q n7h source, @InterfaceC7396q Inflater inflater) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
        this.f43680k = source;
        this.f43682q = inflater;
    }

    /* JADX INFO: renamed from: q */
    private final void m27579q() throws IOException {
        int i2 = this.f43681n;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f43682q.getRemaining();
        this.f43681n -= remaining;
        this.f43680k.skip(remaining);
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f43679g) {
            return;
        }
        this.f43682q.end();
        this.f43679g = true;
        this.f43680k.close();
    }

    /* JADX INFO: renamed from: k */
    public final long m27580k(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f43679g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            C7541c c7541cM58i = sink.m58i(1);
            int iMin = (int) Math.min(j2, 8192 - c7541cM58i.f94264zy);
            zy();
            int iInflate = this.f43682q.inflate(c7541cM58i.f43687k, c7541cM58i.f94264zy, iMin);
            m27579q();
            if (iInflate > 0) {
                c7541cM58i.f94264zy += iInflate;
                long j3 = iInflate;
                sink.vy(sink.size() + j3);
                return j3;
            }
            if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
                sink.f43846k = c7541cM58i.toq();
                lrht.m27786q(c7541cM58i);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return this.f43680k.toq();
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        do {
            long jM27580k = m27580k(sink, j2);
            if (jM27580k > 0) {
                return jM27580k;
            }
            if (this.f43682q.finished() || this.f43682q.needsDictionary()) {
                return -1L;
            }
        } while (!this.f43680k.py());
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean zy() throws IOException {
        if (!this.f43682q.needsInput()) {
            return false;
        }
        if (this.f43680k.py()) {
            return true;
        }
        C7541c c7541c = this.f43680k.mo27611g().f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94264zy;
        int i3 = c7541c.f94263toq;
        int i4 = i2 - i3;
        this.f43681n = i4;
        this.f43682q.setInput(c7541c.f43687k, i3, i4);
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a9(@InterfaceC7396q nn86 source, @InterfaceC7396q Inflater inflater) {
        this(d2ok.m27592n(source), inflater);
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
    }
}
