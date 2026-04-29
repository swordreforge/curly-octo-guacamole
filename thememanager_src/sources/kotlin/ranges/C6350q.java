package kotlin.ranges;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.q */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6350q implements InterfaceC6342g<Double> {

    /* JADX INFO: renamed from: k */
    private final double f36538k;

    /* JADX INFO: renamed from: q */
    private final double f36539q;

    public C6350q(double d2, double d4) {
        this.f36538k = d2;
        this.f36539q = d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.InterfaceC6342g, kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m23357q(((Number) comparable).doubleValue());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6350q) {
            if (isEmpty() && ((C6350q) obj).isEmpty()) {
                return true;
            }
            C6350q c6350q = (C6350q) obj;
            if (this.f36538k == c6350q.f36538k) {
                if (this.f36539q == c6350q.f36539q) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f7l8(double d2, double d4) {
        return d2 <= d4;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double mo2951k() {
        return Double.valueOf(this.f36538k);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f36538k) * 31) + Double.hashCode(this.f36539q);
    }

    @Override // kotlin.ranges.InterfaceC6342g, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return this.f36538k > this.f36539q;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double zy() {
        return Double.valueOf(this.f36539q);
    }

    /* JADX INFO: renamed from: q */
    public boolean m23357q(double d2) {
        return d2 >= this.f36538k && d2 <= this.f36539q;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f36538k + ".." + this.f36539q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.InterfaceC6342g
    public /* bridge */ /* synthetic */ boolean toq(Comparable comparable, Comparable comparable2) {
        return f7l8(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }
}
