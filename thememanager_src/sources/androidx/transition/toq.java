package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: ArcMotion.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final float f53535f7l8 = 0.0f;

    /* JADX INFO: renamed from: s */
    private static final float f6789s = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: y */
    private static final float f6790y = 70.0f;

    /* JADX INFO: renamed from: g */
    private float f6791g;

    /* JADX INFO: renamed from: k */
    private float f6792k;

    /* JADX INFO: renamed from: n */
    private float f6793n;

    /* JADX INFO: renamed from: q */
    private float f6794q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f53536toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f53537zy;

    public toq() {
        this.f6792k = 0.0f;
        this.f53536toq = 0.0f;
        this.f53537zy = f6790y;
        this.f6794q = 0.0f;
        this.f6793n = 0.0f;
        this.f6791g = f6789s;
    }

    /* JADX INFO: renamed from: y */
    private static float m5426y(float f2) {
        if (f2 < 0.0f || f2 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f2 / 2.0f));
    }

    public void f7l8(float f2) {
        this.f53536toq = f2;
        this.f6793n = m5426y(f2);
    }

    /* JADX INFO: renamed from: g */
    public void m5427g(float f2) {
        this.f6792k = f2;
        this.f6794q = m5426y(f2);
    }

    @Override // androidx.transition.o1t
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Path mo5403k(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f9 = f4 - f2;
        float f10 = f5 - f3;
        float f11 = (f9 * f9) + (f10 * f10);
        float f12 = (f2 + f4) / 2.0f;
        float f13 = (f3 + f5) / 2.0f;
        float f14 = 0.25f * f11;
        boolean z2 = f3 > f5;
        if (Math.abs(f9) < Math.abs(f10)) {
            float fAbs = Math.abs(f11 / (f10 * 2.0f));
            if (z2) {
                f7 = fAbs + f5;
                f6 = f4;
            } else {
                f7 = fAbs + f3;
                f6 = f2;
            }
            f8 = this.f6793n;
        } else {
            float f15 = f11 / (f9 * 2.0f);
            if (z2) {
                f7 = f3;
                f6 = f15 + f2;
            } else {
                f6 = f4 - f15;
                f7 = f5;
            }
            f8 = this.f6794q;
        }
        float f16 = f14 * f8 * f8;
        float f17 = f12 - f6;
        float f18 = f13 - f7;
        float f19 = (f17 * f17) + (f18 * f18);
        float f20 = this.f6791g;
        float f21 = f14 * f20 * f20;
        if (f19 >= f16) {
            f16 = f19 > f21 ? f21 : 0.0f;
        }
        if (f16 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f16 / f19);
            f6 = ((f6 - f12) * fSqrt) + f12;
            f7 = f13 + (fSqrt * (f7 - f13));
        }
        path.cubicTo((f2 + f6) / 2.0f, (f3 + f7) / 2.0f, (f6 + f4) / 2.0f, (f7 + f5) / 2.0f, f4, f5);
        return path;
    }

    /* JADX INFO: renamed from: n */
    public void m5428n(float f2) {
        this.f53537zy = f2;
        this.f6791g = m5426y(f2);
    }

    /* JADX INFO: renamed from: q */
    public float m5429q() {
        return this.f53536toq;
    }

    public float toq() {
        return this.f53537zy;
    }

    public float zy() {
        return this.f6792k;
    }

    @SuppressLint({"RestrictedApi"})
    public toq(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6792k = 0.0f;
        this.f53536toq = 0.0f;
        this.f53537zy = f6790y;
        this.f6794q = 0.0f;
        this.f6793n = 0.0f;
        this.f6791g = f6789s;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6378p);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        f7l8(androidx.core.content.res.kja0.m2305p(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m5427g(androidx.core.content.res.kja0.m2305p(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m5428n(androidx.core.content.res.kja0.m2305p(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, f6790y));
        typedArrayObtainStyledAttributes.recycle();
    }
}
