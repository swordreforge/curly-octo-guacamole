package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PathProperty.java */
/* JADX INFO: loaded from: classes.dex */
class wvg<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: g */
    private float f6796g;

    /* JADX INFO: renamed from: k */
    private final Property<T, PointF> f6797k;

    /* JADX INFO: renamed from: n */
    private final PointF f6798n;

    /* JADX INFO: renamed from: q */
    private final float[] f6799q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final PathMeasure f53540toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f53541zy;

    wvg(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f6799q = new float[2];
        this.f6798n = new PointF();
        this.f6797k = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f53540toq = pathMeasure;
        this.f53541zy = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(T t2) {
        return Float.valueOf(this.f6796g);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void set(T t2, Float f2) {
        this.f6796g = f2.floatValue();
        this.f53540toq.getPosTan(this.f53541zy * f2.floatValue(), this.f6799q, null);
        PointF pointF = this.f6798n;
        float[] fArr = this.f6799q;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6797k.set(t2, pointF);
    }
}
