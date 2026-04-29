package a98o;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: FloatPoint.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements Serializable {
    public float enlarge;

    /* JADX INFO: renamed from: x */
    public float f1x;

    /* JADX INFO: renamed from: y */
    public float f2y;

    public toq() {
        this.f1x = 0.0f;
        this.f2y = 0.0f;
        this.enlarge = 0.0f;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        toq toqVar = (toq) o2;
        return Float.compare(toqVar.f1x, this.f1x) == 0 && Float.compare(toqVar.f2y, this.f2y) == 0 && Float.compare(toqVar.enlarge, this.enlarge) == 0;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f1x), Float.valueOf(this.f2y), Float.valueOf(this.enlarge));
    }

    public String toString() {
        return "FloatPoint{x=" + this.f1x + ", y=" + this.f2y + '}';
    }

    public toq(float mx, float my) {
        this.f1x = mx;
        this.f2y = my;
    }

    public toq(float mx, float my, float mf) {
        this(mx, my);
        this.enlarge = mf;
    }
}
