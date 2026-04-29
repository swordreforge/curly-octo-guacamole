package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ikck;
import kotlin.yz;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
final class o1t implements Iterator<ikck>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    private long f36530g;

    /* JADX INFO: renamed from: k */
    private final long f36531k;

    /* JADX INFO: renamed from: n */
    private final long f36532n;

    /* JADX INFO: renamed from: q */
    private boolean f36533q;

    private o1t(long j2, long j3, long j4) {
        this.f36531k = j3;
        boolean z2 = true;
        if (j4 <= 0 ? Long.compareUnsigned(j2, j3) < 0 : Long.compareUnsigned(j2, j3) > 0) {
            z2 = false;
        }
        this.f36533q = z2;
        this.f36532n = ikck.ld6(j4);
        this.f36530g = this.f36533q ? j2 : j3;
    }

    public /* synthetic */ o1t(long j2, long j3, long j4, kotlin.jvm.internal.ni7 ni7Var) {
        this(j2, j3, j4);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36533q;
    }

    /* JADX INFO: renamed from: k */
    public long m23350k() {
        long j2 = this.f36530g;
        if (j2 != this.f36531k) {
            this.f36530g = ikck.ld6(this.f36532n + j2);
        } else {
            if (!this.f36533q) {
                throw new NoSuchElementException();
            }
            this.f36533q = false;
        }
        return j2;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ikck next() {
        return ikck.zy(m23350k());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
