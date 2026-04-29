package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.kja0;
import androidx.core.graphics.cdj;
import org.xmlpull.v1.XmlPullParser;
import zy.uv6;

/* JADX INFO: compiled from: PathInterpolatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class f7l8 implements Interpolator {

    /* JADX INFO: renamed from: n */
    public static final double f6805n = 1.0E-5d;

    /* JADX INFO: renamed from: q */
    public static final int f6806q = 3000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final float f53543zy = 0.002f;

    /* JADX INFO: renamed from: k */
    private float[] f6807k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float[] f53544toq;

    public f7l8(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* JADX INFO: renamed from: k */
    private void m5443k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        toq(path);
    }

    /* JADX INFO: renamed from: q */
    private void m5444q(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (kja0.ki(xmlPullParser, "pathData")) {
            String strQrj = kja0.qrj(typedArray, xmlPullParser, "pathData", 4);
            Path pathM2389n = cdj.m2389n(strQrj);
            if (pathM2389n != null) {
                toq(pathM2389n);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strQrj);
        }
        if (!kja0.ki(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!kja0.ki(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fM2305p = kja0.m2305p(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fM2305p2 = kja0.m2305p(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zKi = kja0.ki(xmlPullParser, "controlX2");
        if (zKi != kja0.ki(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zKi) {
            m5443k(fM2305p, fM2305p2, kja0.m2305p(typedArray, xmlPullParser, "controlX2", 2, 0.0f), kja0.m2305p(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            zy(fM2305p, fM2305p2);
        }
    }

    private void toq(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(f6806q, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f6807k = new float[iMin];
        this.f53544toq = new float[iMin];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < iMin; i3++) {
            pathMeasure.getPosTan((i3 * length) / (iMin - 1), fArr, null);
            this.f6807k[i3] = fArr[0];
            this.f53544toq[i3] = fArr[1];
        }
        if (Math.abs(this.f6807k[0]) <= 1.0E-5d && Math.abs(this.f53544toq[0]) <= 1.0E-5d) {
            int i4 = iMin - 1;
            if (Math.abs(this.f6807k[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f53544toq[i4] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i5 = 0;
                while (i2 < iMin) {
                    float[] fArr2 = this.f6807k;
                    int i6 = i5 + 1;
                    float f3 = fArr2[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f6807k[0]);
        sb.append(",");
        sb.append(this.f53544toq[0]);
        sb.append(" end:");
        int i7 = iMin - 1;
        sb.append(this.f6807k[i7]);
        sb.append(",");
        sb.append(this.f53544toq[i7]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void zy(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        toq(path);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f6807k.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f6807k[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f6807k;
        float f3 = fArr[length];
        float f4 = fArr[i2];
        float f5 = f3 - f4;
        if (f5 == 0.0f) {
            return this.f53544toq[i2];
        }
        float[] fArr2 = this.f53544toq;
        float f6 = fArr2[i2];
        return f6 + (((f2 - f4) / f5) * (fArr2[length] - f6));
    }

    public f7l8(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53573lv5);
        m5444q(typedArrayT8r, xmlPullParser);
        typedArrayT8r.recycle();
    }
}
