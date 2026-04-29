package kotlin.ranges;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.n */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6348n implements InterfaceC6342g<Float> {

    /* JADX INFO: renamed from: k */
    private final float f36520k;

    /* JADX INFO: renamed from: q */
    private final float f36521q;

    public C6348n(float f2, float f3) {
        this.f36520k = f2;
        this.f36521q = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.InterfaceC6342g, kotlin.ranges.f7l8
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m23347q(((Number) comparable).floatValue());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6348n) {
            if (isEmpty() && ((C6348n) obj).isEmpty()) {
                return true;
            }
            C6348n c6348n = (C6348n) obj;
            if (this.f36520k == c6348n.f36520k) {
                if (this.f36521q == c6348n.f36521q) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f7l8(float f2, float f3) {
        return f2 <= f3;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float mo2951k() {
        return Float.valueOf(this.f36520k);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f36520k) * 31) + Float.hashCode(this.f36521q);
    }

    @Override // kotlin.ranges.InterfaceC6342g, kotlin.ranges.f7l8
    public boolean isEmpty() {
        return this.f36520k > this.f36521q;
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float zy() {
        return Float.valueOf(this.f36521q);
    }

    /* JADX INFO: renamed from: q */
    public boolean m23347q(float f2) {
        return f2 >= this.f36520k && f2 <= this.f36521q;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f36520k + ".." + this.f36521q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.InterfaceC6342g
    public /* bridge */ /* synthetic */ boolean toq(Comparable comparable, Comparable comparable2) {
        return f7l8(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }
}
