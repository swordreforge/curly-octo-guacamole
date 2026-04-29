package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.transition.t */
/* JADX INFO: compiled from: PatternPathMotion.java */
/* JADX INFO: loaded from: classes.dex */
public class C1246t extends o1t {

    /* JADX INFO: renamed from: k */
    private Path f6766k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f53531toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix f53532zy;

    public C1246t() {
        Path path = new Path();
        this.f53531toq = path;
        this.f53532zy = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f6766k = path;
    }

    private static float toq(float f2, float f3) {
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    @Override // androidx.transition.o1t
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Path mo5403k(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float qVar = toq(f6, f7);
        double dAtan2 = Math.atan2(f7, f6);
        this.f53532zy.setScale(qVar, qVar);
        this.f53532zy.postRotate((float) Math.toDegrees(dAtan2));
        this.f53532zy.postTranslate(f2, f3);
        Path path = new Path();
        this.f53531toq.transform(this.f53532zy, path);
        return path;
    }

    /* JADX INFO: renamed from: q */
    public void m5421q(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f2 = fArr[0];
        float f3 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        if (f4 == f2 && f5 == f3) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f53532zy.setTranslate(-f4, -f5);
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float qVar = 1.0f / toq(f6, f7);
        this.f53532zy.postScale(qVar, qVar);
        this.f53532zy.postRotate((float) Math.toDegrees(-Math.atan2(f7, f6)));
        path.transform(this.f53532zy, this.f53531toq);
        this.f6766k = path;
    }

    public Path zy() {
        return this.f6766k;
    }

    @SuppressLint({"RestrictedApi"})
    public C1246t(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        this.f53531toq = new Path();
        this.f53532zy = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f52474ld6);
        try {
            String strQrj = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strQrj != null) {
                m5421q(androidx.core.graphics.cdj.m2389n(strQrj));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C1246t(Path path) {
        this.f53531toq = new Path();
        this.f53532zy = new Matrix();
        m5421q(path);
    }
}
