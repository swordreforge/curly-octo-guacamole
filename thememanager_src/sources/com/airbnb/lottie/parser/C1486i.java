package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1515k;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.lang.ref.WeakReference;
import v5yj.C7704k;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.i */
/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1486i {

    /* JADX INFO: renamed from: k */
    private static final float f8148k = 100.0f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static androidx.collection.n7h<WeakReference<Interpolator>> f56160zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Interpolator f56159toq = new LinearInterpolator();

    /* JADX INFO: renamed from: q */
    static zy.C1492k f8150q = zy.C1492k.m6178k("t", C7704k.y.toq.f44691k, "e", "o", "i", AnimatedProperty.PROPERTY_NAME_H, "to", "ti");

    /* JADX INFO: renamed from: n */
    static zy.C1492k f8149n = zy.C1492k.m6178k(AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y);

    C1486i() {
    }

    private static androidx.collection.n7h<WeakReference<Interpolator>> f7l8() {
        if (f56160zy == null) {
            f56160zy = new androidx.collection.n7h<>();
        }
        return f56160zy;
    }

    /* JADX INFO: renamed from: g */
    private static <T> C1515k<T> m6149g(com.airbnb.lottie.parser.moshi.zy zyVar, float f2, InterfaceC1496r<T> interfaceC1496r) throws IOException {
        return new C1515k<>(interfaceC1496r.mo6143k(zyVar, f2));
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    private static WeakReference<Interpolator> m6150k(int i2) {
        WeakReference<Interpolator> weakReferenceN7h;
        synchronized (C1486i.class) {
            weakReferenceN7h = f7l8().n7h(i2);
        }
        return weakReferenceN7h;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.airbnb.lottie.value.C1515k<T> m6151n(com.airbnb.lottie.ld6 r21, com.airbnb.lottie.parser.moshi.zy r22, float r23, com.airbnb.lottie.parser.InterfaceC1496r<T> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C1486i.m6151n(com.airbnb.lottie.ld6, com.airbnb.lottie.parser.moshi.zy, float, com.airbnb.lottie.parser.r):com.airbnb.lottie.value.k");
    }

    /* JADX INFO: renamed from: q */
    private static <T> C1515k<T> m6152q(com.airbnb.lottie.ld6 ld6Var, com.airbnb.lottie.parser.moshi.zy zyVar, float f2, InterfaceC1496r<T> interfaceC1496r) throws IOException {
        Interpolator qVar;
        T t2;
        zyVar.mo6173q();
        PointF pointFM6200n = null;
        boolean z2 = false;
        T tMo6143k = null;
        T tMo6143k2 = null;
        PointF pointFM6200n2 = null;
        PointF pointFM6200n3 = null;
        float fMo6171h = 0.0f;
        PointF pointFM6200n4 = null;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8150q)) {
                case 0:
                    fMo6171h = (float) zyVar.mo6171h();
                    break;
                case 1:
                    tMo6143k2 = interfaceC1496r.mo6143k(zyVar, f2);
                    break;
                case 2:
                    tMo6143k = interfaceC1496r.mo6143k(zyVar, f2);
                    break;
                case 3:
                    pointFM6200n = t8r.m6200n(zyVar, 1.0f);
                    break;
                case 4:
                    pointFM6200n4 = t8r.m6200n(zyVar, 1.0f);
                    break;
                case 5:
                    z2 = zyVar.ki() == 1;
                    break;
                case 6:
                    pointFM6200n2 = t8r.m6200n(zyVar, f2);
                    break;
                case 7:
                    pointFM6200n3 = t8r.m6200n(zyVar, f2);
                    break;
                default:
                    zyVar.y9n();
                    break;
            }
        }
        zyVar.mo6172p();
        if (z2) {
            qVar = f56159toq;
            t2 = tMo6143k2;
        } else {
            qVar = (pointFM6200n == null || pointFM6200n4 == null) ? f56159toq : toq(pointFM6200n, pointFM6200n4);
            t2 = tMo6143k;
        }
        C1515k<T> c1515k = new C1515k<>(ld6Var, tMo6143k2, t2, qVar, fMo6171h, null);
        c1515k.f56194kja0 = pointFM6200n2;
        c1515k.f8300h = pointFM6200n3;
        return c1515k;
    }

    private static Interpolator toq(PointF pointF, PointF pointF2) {
        Interpolator qVar;
        pointF.x = com.airbnb.lottie.utils.f7l8.zy(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.f7l8.zy(pointF.y, -100.0f, f8148k);
        pointF2.x = com.airbnb.lottie.utils.f7l8.zy(pointF2.x, -1.0f, 1.0f);
        float fZy = com.airbnb.lottie.utils.f7l8.zy(pointF2.y, -100.0f, f8148k);
        pointF2.y = fZy;
        int iM6263s = C1512y.m6263s(pointF.x, pointF.y, pointF2.x, fZy);
        WeakReference<Interpolator> weakReferenceM6150k = m6150k(iM6263s);
        Interpolator interpolator = weakReferenceM6150k != null ? weakReferenceM6150k.get() : null;
        if (weakReferenceM6150k == null || interpolator == null) {
            try {
                qVar = androidx.core.view.animation.toq.toq(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                qVar = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? androidx.core.view.animation.toq.toq(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = qVar;
            try {
                m6153y(iM6263s, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: renamed from: y */
    private static void m6153y(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (C1486i.class) {
            f56160zy.fn3e(i2, weakReference);
        }
    }

    static <T> C1515k<T> zy(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, float f2, InterfaceC1496r<T> interfaceC1496r, boolean z2, boolean z3) throws IOException {
        return (z2 && z3) ? m6151n(ld6Var, zyVar, f2, interfaceC1496r) : z2 ? m6152q(ld6Var, zyVar, f2, interfaceC1496r) : m6149g(zyVar, f2, interfaceC1496r);
    }
}
