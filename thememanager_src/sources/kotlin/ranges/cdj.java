package kotlin.ranges;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
final class cdj implements ki<Float> {

    /* JADX INFO: renamed from: k */
    private final float f36504k;

    /* JADX INFO: renamed from: q */
    private final float f36505q;

    public cdj(float f2, float f3) {
        this.f36504k = f2;
        this.f36505q = f3;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m23286n(float f2, float f3) {
        return f2 <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ki
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return toq(((Number) comparable).floatValue());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof cdj) {
            if (isEmpty() && ((cdj) obj).isEmpty()) {
                return true;
            }
            cdj cdjVar = (cdj) obj;
            if (this.f36504k == cdjVar.f36504k) {
                if (this.f36505q == cdjVar.f36505q) {
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
        return (Float.hashCode(this.f36504k) * 31) + Float.hashCode(this.f36505q);
    }

    @Override // kotlin.ranges.ki
    public boolean isEmpty() {
        return this.f36504k >= this.f36505q;
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float mo23288k() {
        return Float.valueOf(this.f36504k);
    }

    @InterfaceC7396q
    public String toString() {
        return this.f36504k + "..<" + this.f36505q;
    }

    public boolean toq(float f2) {
        return f2 >= this.f36504k && f2 < this.f36505q;
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public Float mo23287g() {
        return Float.valueOf(this.f36505q);
    }
}
