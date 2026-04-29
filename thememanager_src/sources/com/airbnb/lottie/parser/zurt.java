package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.animatable.C1445p;
import com.airbnb.lottie.model.content.C1452k;
import com.airbnb.lottie.model.layer.C1464n;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1515k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import t8iq.C7672k;

/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class zurt {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8234k = zy.C1492k.m6178k("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", C3678q.f65832n7h, "masksProperties", "shapes", "t", "ef", "sr", "st", AnimatedProperty.PROPERTY_NAME_W, AnimatedProperty.PROPERTY_NAME_H, "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56180toq = zy.C1492k.m6178k(C7672k.f94880zy, "a");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final zy.C1492k f56181zy = zy.C1492k.m6178k("ty", "nm");

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.zurt$k */
    /* JADX INFO: compiled from: LayerParser.java */
    static /* synthetic */ class C1502k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8235k;

        static {
            int[] iArr = new int[C1464n.toq.values().length];
            f8235k = iArr;
            try {
                iArr[C1464n.toq.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8235k[C1464n.toq.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private zurt() {
    }

    /* JADX INFO: renamed from: k */
    public static C1464n m6205k(com.airbnb.lottie.ld6 ld6Var) {
        Rect qVar = ld6Var.toq();
        return new C1464n(Collections.emptyList(), ld6Var, "__container", -1L, C1464n.k.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.x2(), 0, 0, 0, 0.0f, 0.0f, qVar.width(), qVar.height(), null, null, Collections.emptyList(), C1464n.toq.NONE, null, false, null, null);
    }

    public static C1464n toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f2;
        C1464n.toq toqVar = C1464n.toq.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        zyVar.mo6173q();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        C1464n.toq toqVar2 = toqVar;
        float fMo6171h = 1.0f;
        int iKi = 0;
        int iKi2 = 0;
        int color = 0;
        int iKi3 = 0;
        int iKi4 = 0;
        boolean zX2 = false;
        C1464n.k kVar = null;
        String strWvg = null;
        com.airbnb.lottie.model.animatable.x2 x2VarF7l8 = null;
        C1445p c1445pM6194q = null;
        com.airbnb.lottie.model.animatable.ld6 ld6VarM6202k = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        C1452k qVar = null;
        C1494p qVar2 = null;
        float fMo6171h2 = 0.0f;
        float fMo6171h3 = 0.0f;
        float fM5971g = 0.0f;
        long jKi = -1;
        long jKi2 = 0;
        String strWvg2 = null;
        String strWvg3 = "UNSET";
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8234k)) {
                case 0:
                    strWvg3 = zyVar.wvg();
                    break;
                case 1:
                    jKi2 = zyVar.ki();
                    break;
                case 2:
                    strWvg = zyVar.wvg();
                    break;
                case 3:
                    int iKi5 = zyVar.ki();
                    kVar = C1464n.k.UNKNOWN;
                    if (iKi5 < kVar.ordinal()) {
                        kVar = C1464n.k.values()[iKi5];
                    }
                    break;
                case 4:
                    jKi = zyVar.ki();
                    break;
                case 5:
                    iKi = (int) (zyVar.ki() * C1512y.m6260n());
                    break;
                case 6:
                    iKi2 = (int) (zyVar.ki() * C1512y.m6260n());
                    break;
                case 7:
                    color = Color.parseColor(zyVar.wvg());
                    break;
                case 8:
                    x2VarF7l8 = zy.f7l8(zyVar, ld6Var);
                    break;
                case 9:
                    int iKi6 = zyVar.ki();
                    if (iKi6 < C1464n.toq.values().length) {
                        toqVar2 = C1464n.toq.values()[iKi6];
                        int i2 = C1502k.f8235k[toqVar2.ordinal()];
                        if (i2 == 1) {
                            ld6Var.m5974k("Unsupported matte type: Luma");
                        } else if (i2 == 2) {
                            ld6Var.m5974k("Unsupported matte type: Luma Inverted");
                        }
                        ld6Var.zurt(1);
                    } else {
                        ld6Var.m5974k("Unsupported matte type: " + iKi6);
                    }
                    break;
                case 10:
                    zyVar.zy();
                    while (zyVar.ld6()) {
                        arrayList3.add(fu4.m6146k(zyVar, ld6Var));
                    }
                    ld6Var.zurt(arrayList3.size());
                    zyVar.mo6174y();
                    break;
                case 11:
                    zyVar.zy();
                    while (zyVar.ld6()) {
                        com.airbnb.lottie.model.content.zy zyVarM6203k = C1500y.m6203k(zyVar, ld6Var);
                        if (zyVarM6203k != null) {
                            arrayList4.add(zyVarM6203k);
                        }
                    }
                    zyVar.mo6174y();
                    break;
                case 12:
                    zyVar.mo6173q();
                    while (zyVar.ld6()) {
                        int iMo6170f = zyVar.mo6170f(f56180toq);
                        if (iMo6170f == 0) {
                            c1445pM6194q = C1495q.m6194q(zyVar, ld6Var);
                        } else if (iMo6170f != 1) {
                            zyVar.yz();
                            zyVar.y9n();
                        } else {
                            zyVar.zy();
                            if (zyVar.ld6()) {
                                ld6VarM6202k = toq.m6202k(zyVar, ld6Var);
                            }
                            while (zyVar.ld6()) {
                                zyVar.y9n();
                            }
                            zyVar.mo6174y();
                        }
                    }
                    zyVar.mo6172p();
                    break;
                case 13:
                    zyVar.zy();
                    ArrayList arrayList5 = new ArrayList();
                    while (zyVar.ld6()) {
                        zyVar.mo6173q();
                        while (zyVar.ld6()) {
                            int iMo6170f2 = zyVar.mo6170f(f56181zy);
                            if (iMo6170f2 == 0) {
                                int iKi7 = zyVar.ki();
                                if (iKi7 == 29) {
                                    qVar = C1493n.toq(zyVar, ld6Var);
                                } else if (iKi7 == 25) {
                                    qVar2 = new ld6().toq(zyVar, ld6Var);
                                }
                            } else if (iMo6170f2 != 1) {
                                zyVar.yz();
                                zyVar.y9n();
                            } else {
                                arrayList5.add(zyVar.wvg());
                            }
                        }
                        zyVar.mo6172p();
                    }
                    zyVar.mo6174y();
                    ld6Var.m5974k("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    fMo6171h = (float) zyVar.mo6171h();
                    break;
                case 15:
                    fMo6171h3 = (float) zyVar.mo6171h();
                    break;
                case 16:
                    iKi3 = (int) (zyVar.ki() * C1512y.m6260n());
                    break;
                case 17:
                    iKi4 = (int) (zyVar.ki() * C1512y.m6260n());
                    break;
                case 18:
                    fMo6171h2 = (float) zyVar.mo6171h();
                    break;
                case 19:
                    fM5971g = (float) zyVar.mo6171h();
                    break;
                case 20:
                    toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, false);
                    break;
                case 21:
                    strWvg2 = zyVar.wvg();
                    break;
                case 22:
                    zX2 = zyVar.x2();
                    break;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    break;
            }
        }
        zyVar.mo6172p();
        ArrayList arrayList6 = new ArrayList();
        if (fMo6171h2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C1515k(ld6Var, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fMo6171h2)));
            f2 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f2 = 0.0f;
        }
        if (fM5971g <= f2) {
            fM5971g = ld6Var.m5971g();
        }
        arrayList2.add(new C1515k(ld6Var, fValueOf, fValueOf, null, fMo6171h2, Float.valueOf(fM5971g)));
        arrayList2.add(new C1515k(ld6Var, fValueOf2, fValueOf2, null, fM5971g, Float.valueOf(Float.MAX_VALUE)));
        if (strWvg3.endsWith(".ai") || "ai".equals(strWvg2)) {
            ld6Var.m5974k("Convert your Illustrator layers to shape layers.");
        }
        return new C1464n(arrayList4, ld6Var, strWvg3, jKi2, kVar, jKi, strWvg, arrayList, x2VarF7l8, iKi, iKi2, color, fMo6171h, fMo6171h3, iKi3, iKi4, c1445pM6194q, ld6VarM6202k, arrayList2, toqVar2, toqVarM6190g, zX2, qVar, qVar2);
    }
}
