package kotlin.ranges;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.h */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6343h implements ki<Double> {

    /* JADX INFO: renamed from: k */
    private final double f36508k;

    /* JADX INFO: renamed from: q */
    private final double f36509q;

    public C6343h(double d2, double d4) {
        this.f36508k = d2;
        this.f36509q = d4;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m23314n(double d2, double d4) {
        return d2 <= d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ki
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return toq(((Number) comparable).doubleValue());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6343h) {
            if (isEmpty() && ((C6343h) obj).isEmpty()) {
                return true;
            }
            C6343h c6343h = (C6343h) obj;
            if (this.f36508k == c6343h.f36508k) {
                if (this.f36509q == c6343h.f36509q) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f36508k) * 31) + Double.hashCode(this.f36509q);
    }

    @Override // kotlin.ranges.ki
    public boolean isEmpty() {
        return this.f36508k >= this.f36509q;
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double mo23288k() {
        return Double.valueOf(this.f36508k);
    }

    @InterfaceC7396q
    public String toString() {
        return this.f36508k + "..<" + this.f36509q;
    }

    public boolean toq(double d2) {
        return d2 >= this.f36508k && d2 < this.f36509q;
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public Double mo23287g() {
        return Double.valueOf(this.f36509q);
    }
}
