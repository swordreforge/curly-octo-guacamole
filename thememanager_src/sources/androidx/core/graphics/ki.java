package androidx.core.graphics;

import android.graphics.PointF;
import zy.lvui;

/* JADX INFO: compiled from: PathSegment.java */
/* JADX INFO: loaded from: classes.dex */
public final class ki {

    /* JADX INFO: renamed from: k */
    private final PointF f3572k;

    /* JADX INFO: renamed from: q */
    private final float f3573q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f50464toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final PointF f50465zy;

    public ki(@lvui PointF pointF, float f2, @lvui PointF pointF2, float f3) {
        this.f3572k = (PointF) androidx.core.util.n7h.qrj(pointF, "start == null");
        this.f50464toq = f2;
        this.f50465zy = (PointF) androidx.core.util.n7h.qrj(pointF2, "end == null");
        this.f3573q = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        return Float.compare(this.f50464toq, kiVar.f50464toq) == 0 && Float.compare(this.f3573q, kiVar.f3573q) == 0 && this.f3572k.equals(kiVar.f3572k) && this.f50465zy.equals(kiVar.f50465zy);
    }

    public int hashCode() {
        int iHashCode = this.f3572k.hashCode() * 31;
        float f2 = this.f50464toq;
        int iFloatToIntBits = (((iHashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f50465zy.hashCode()) * 31;
        float f3 = this.f3573q;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public PointF m2503k() {
        return this.f50465zy;
    }

    /* JADX INFO: renamed from: q */
    public float m2504q() {
        return this.f50464toq;
    }

    public String toString() {
        return "PathSegment{start=" + this.f3572k + ", startFraction=" + this.f50464toq + ", end=" + this.f50465zy + ", endFraction=" + this.f3573q + '}';
    }

    public float toq() {
        return this.f3573q;
    }

    @lvui
    public PointF zy() {
        return this.f3572k;
    }
}
