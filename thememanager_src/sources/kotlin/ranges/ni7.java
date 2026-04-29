package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.gyi;
import kotlin.yz;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
final class ni7 implements Iterator<gyi>, InterfaceC7625k {

    /* JADX INFO: renamed from: g */
    private int f36526g;

    /* JADX INFO: renamed from: k */
    private final int f36527k;

    /* JADX INFO: renamed from: n */
    private final int f36528n;

    /* JADX INFO: renamed from: q */
    private boolean f36529q;

    private ni7(int i2, int i3, int i4) {
        this.f36527k = i3;
        boolean z2 = true;
        int iCompareUnsigned = Integer.compareUnsigned(i2, i3);
        if (i4 <= 0 ? iCompareUnsigned < 0 : iCompareUnsigned > 0) {
            z2 = false;
        }
        this.f36529q = z2;
        this.f36528n = gyi.ld6(i4);
        this.f36526g = this.f36529q ? i2 : i3;
    }

    public /* synthetic */ ni7(int i2, int i3, int i4, kotlin.jvm.internal.ni7 ni7Var) {
        this(i2, i3, i4);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36529q;
    }

    /* JADX INFO: renamed from: k */
    public int m23349k() {
        int i2 = this.f36526g;
        if (i2 != this.f36527k) {
            this.f36526g = gyi.ld6(this.f36528n + i2);
        } else {
            if (!this.f36529q) {
                throw new NoSuchElementException();
            }
            this.f36529q = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ gyi next() {
        return gyi.zy(m23349k());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
