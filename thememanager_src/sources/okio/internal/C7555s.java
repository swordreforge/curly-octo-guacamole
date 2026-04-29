package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okio.AbstractC7579z;
import okio.nn86;

/* JADX INFO: renamed from: okio.internal.s */
/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7555s extends AbstractC7579z {

    /* JADX INFO: renamed from: g */
    private long f43758g;

    /* JADX INFO: renamed from: n */
    private final boolean f43759n;

    /* JADX INFO: renamed from: q */
    private final long f43760q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7555s(@InterfaceC7396q nn86 delegate, long j2, boolean z2) {
        super(delegate);
        d2ok.m23075h(delegate, "delegate");
        this.f43760q = j2;
        this.f43759n = z2;
    }

    /* JADX INFO: renamed from: q */
    private final void m27730q(okio.x2 x2Var, long j2) throws IOException {
        okio.x2 x2Var2 = new okio.x2();
        x2Var2.ek5k(x2Var);
        x2Var.mo26936j(x2Var2, j2);
        x2Var2.m27873y();
    }

    @Override // okio.AbstractC7579z, okio.nn86
    public long wx16(@InterfaceC7396q okio.x2 sink, long j2) throws IOException {
        d2ok.m23075h(sink, "sink");
        long j3 = this.f43758g;
        long j4 = this.f43760q;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.f43759n) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j5);
        }
        long jWx16 = super.wx16(sink, j2);
        if (jWx16 != -1) {
            this.f43758g += jWx16;
        }
        long j6 = this.f43758g;
        long j7 = this.f43760q;
        if ((j6 >= j7 || jWx16 != -1) && j6 <= j7) {
            return jWx16;
        }
        if (jWx16 > 0 && j6 > j7) {
            m27730q(sink, sink.size() - (this.f43758g - this.f43760q));
        }
        throw new IOException("expected " + this.f43760q + " bytes but got " + this.f43758g);
    }
}
