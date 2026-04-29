package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.zy;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes.dex */
class t8r {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8227k = zy.C1492k.m6178k(AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y);

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.t8r$k */
    /* JADX INFO: compiled from: JsonUtils.java */
    static /* synthetic */ class C1499k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8228k;

        static {
            int[] iArr = new int[zy.toq.values().length];
            f8228k = iArr;
            try {
                iArr[zy.toq.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8228k[zy.toq.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8228k[zy.toq.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private t8r() {
    }

    static float f7l8(com.airbnb.lottie.parser.moshi.zy zyVar) throws IOException {
        zy.toq toqVarD2ok = zyVar.d2ok();
        int i2 = C1499k.f8228k[toqVarD2ok.ordinal()];
        if (i2 == 1) {
            return (float) zyVar.mo6171h();
        }
        if (i2 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + toqVarD2ok);
        }
        zyVar.zy();
        float fMo6171h = (float) zyVar.mo6171h();
        while (zyVar.ld6()) {
            zyVar.y9n();
        }
        zyVar.mo6174y();
        return fMo6171h;
    }

    /* JADX INFO: renamed from: g */
    static List<PointF> m6198g(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        zyVar.zy();
        while (zyVar.d2ok() == zy.toq.BEGIN_ARRAY) {
            zyVar.zy();
            arrayList.add(m6200n(zyVar, f2));
            zyVar.mo6174y();
        }
        zyVar.mo6174y();
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private static PointF m6199k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        zyVar.zy();
        float fMo6171h = (float) zyVar.mo6171h();
        float fMo6171h2 = (float) zyVar.mo6171h();
        while (zyVar.d2ok() != zy.toq.END_ARRAY) {
            zyVar.y9n();
        }
        zyVar.mo6174y();
        return new PointF(fMo6171h * f2, fMo6171h2 * f2);
    }

    /* JADX INFO: renamed from: n */
    static PointF m6200n(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        int i2 = C1499k.f8228k[zyVar.d2ok().ordinal()];
        if (i2 == 1) {
            return toq(zyVar, f2);
        }
        if (i2 == 2) {
            return m6199k(zyVar, f2);
        }
        if (i2 == 3) {
            return zy(zyVar, f2);
        }
        throw new IllegalArgumentException("Unknown point starts with " + zyVar.d2ok());
    }

    @zy.x2
    /* JADX INFO: renamed from: q */
    static int m6201q(com.airbnb.lottie.parser.moshi.zy zyVar) throws IOException {
        zyVar.zy();
        int iMo6171h = (int) (zyVar.mo6171h() * 255.0d);
        int iMo6171h2 = (int) (zyVar.mo6171h() * 255.0d);
        int iMo6171h3 = (int) (zyVar.mo6171h() * 255.0d);
        while (zyVar.ld6()) {
            zyVar.y9n();
        }
        zyVar.mo6174y();
        return Color.argb(255, iMo6171h, iMo6171h2, iMo6171h3);
    }

    private static PointF toq(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        float fMo6171h = (float) zyVar.mo6171h();
        float fMo6171h2 = (float) zyVar.mo6171h();
        while (zyVar.ld6()) {
            zyVar.y9n();
        }
        return new PointF(fMo6171h * f2, fMo6171h2 * f2);
    }

    private static PointF zy(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        zyVar.mo6173q();
        float fF7l8 = 0.0f;
        float fF7l82 = 0.0f;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8227k);
            if (iMo6170f == 0) {
                fF7l8 = f7l8(zyVar);
            } else if (iMo6170f != 1) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                fF7l82 = f7l8(zyVar);
            }
        }
        zyVar.mo6172p();
        return new PointF(fF7l8 * f2, fF7l82 * f2);
    }
}
