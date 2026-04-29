package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.C0252s;
import com.airbnb.lottie.model.C1472q;
import com.airbnb.lottie.model.C1475y;
import com.airbnb.lottie.model.layer.C1464n;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.C1512y;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.util.C5814z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8218k = zy.C1492k.m6178k(AnimatedProperty.PROPERTY_NAME_W, AnimatedProperty.PROPERTY_NAME_H, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static zy.C1492k f56173toq = zy.C1492k.m6178k("id", "layers", AnimatedProperty.PROPERTY_NAME_W, AnimatedProperty.PROPERTY_NAME_H, "p", "u");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final zy.C1492k f56174zy = zy.C1492k.m6178k("list");

    /* JADX INFO: renamed from: q */
    private static final zy.C1492k f8219q = zy.C1492k.m6178k("cm", "tm", "dr");

    /* JADX INFO: renamed from: g */
    private static void m6181g(com.airbnb.lottie.parser.moshi.zy zyVar, List<C1475y> list) throws IOException {
        zyVar.zy();
        while (zyVar.ld6()) {
            String strWvg = null;
            zyVar.mo6173q();
            float fMo6171h = 0.0f;
            float fMo6171h2 = 0.0f;
            while (zyVar.ld6()) {
                int iMo6170f = zyVar.mo6170f(f8219q);
                if (iMo6170f == 0) {
                    strWvg = zyVar.wvg();
                } else if (iMo6170f == 1) {
                    fMo6171h = (float) zyVar.mo6171h();
                } else if (iMo6170f != 2) {
                    zyVar.yz();
                    zyVar.y9n();
                } else {
                    fMo6171h2 = (float) zyVar.mo6171h();
                }
            }
            zyVar.mo6172p();
            list.add(new C1475y(strWvg, fMo6171h, fMo6171h2));
        }
        zyVar.mo6174y();
    }

    /* JADX INFO: renamed from: k */
    public static com.airbnb.lottie.ld6 m6182k(com.airbnb.lottie.parser.moshi.zy zyVar) throws IOException {
        HashMap map;
        ArrayList arrayList;
        com.airbnb.lottie.parser.moshi.zy zyVar2 = zyVar;
        float fM6260n = C1512y.m6260n();
        C0252s<C1464n> c0252s = new C0252s<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        androidx.collection.n7h<C1472q> n7hVar = new androidx.collection.n7h<>();
        com.airbnb.lottie.ld6 ld6Var = new com.airbnb.lottie.ld6();
        zyVar.mo6173q();
        float fMo6171h = 0.0f;
        float fMo6171h2 = 0.0f;
        float fMo6171h3 = 0.0f;
        int iKi = 0;
        int iKi2 = 0;
        while (zyVar.ld6()) {
            switch (zyVar2.mo6170f(f8218k)) {
                case 0:
                    iKi = zyVar.ki();
                    break;
                case 1:
                    iKi2 = zyVar.ki();
                    break;
                case 2:
                    fMo6171h = (float) zyVar.mo6171h();
                    break;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fMo6171h2 = ((float) zyVar.mo6171h()) - 0.01f;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fMo6171h3 = (float) zyVar.mo6171h();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    String[] strArrSplit = zyVar.wvg().split(C5814z.f32495a);
                    if (!C1512y.m6261p(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        ld6Var.m5974k("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    m6183n(zyVar2, ld6Var, arrayList2, c0252s);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    toq(zyVar2, ld6Var, map2, map3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    m6184q(zyVar2, map4);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    zy(zyVar2, ld6Var, n7hVar);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    m6181g(zyVar2, arrayList3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
                default:
                    map = map4;
                    arrayList = arrayList3;
                    zyVar.yz();
                    zyVar.y9n();
                    map4 = map;
                    arrayList3 = arrayList;
                    break;
            }
            zyVar2 = zyVar;
        }
        ld6Var.ni7(new Rect(0, 0, (int) (iKi * fM6260n), (int) (iKi2 * fM6260n)), fMo6171h, fMo6171h2, fMo6171h3, arrayList2, c0252s, map2, map3, n7hVar, map4, arrayList3);
        return ld6Var;
    }

    /* JADX INFO: renamed from: n */
    private static void m6183n(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, List<C1464n> list, C0252s<C1464n> c0252s) throws IOException {
        zyVar.zy();
        int i2 = 0;
        while (zyVar.ld6()) {
            C1464n qVar = zurt.toq(zyVar, ld6Var);
            if (qVar.m6065g() == C1464n.k.IMAGE) {
                i2++;
            }
            list.add(qVar);
            c0252s.fn3e(qVar.m6071q(), qVar);
            if (i2 > 4) {
                C1510q.m6255n("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        zyVar.mo6174y();
    }

    /* JADX INFO: renamed from: q */
    private static void m6184q(com.airbnb.lottie.parser.moshi.zy zyVar, Map<String, com.airbnb.lottie.model.zy> map) throws IOException {
        zyVar.mo6173q();
        while (zyVar.ld6()) {
            if (zyVar.mo6170f(f56174zy) != 0) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zyVar.zy();
                while (zyVar.ld6()) {
                    com.airbnb.lottie.model.zy zyVarM6180k = n7h.m6180k(zyVar);
                    map.put(zyVarM6180k.zy(), zyVarM6180k);
                }
                zyVar.mo6174y();
            }
        }
        zyVar.mo6172p();
    }

    private static void toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, Map<String, List<C1464n>> map, Map<String, com.airbnb.lottie.dd> map2) throws IOException {
        zyVar.zy();
        while (zyVar.ld6()) {
            ArrayList arrayList = new ArrayList();
            C0252s c0252s = new C0252s();
            zyVar.mo6173q();
            int iKi = 0;
            int iKi2 = 0;
            String strWvg = null;
            String strWvg2 = null;
            String strWvg3 = null;
            while (zyVar.ld6()) {
                int iMo6170f = zyVar.mo6170f(f56173toq);
                if (iMo6170f == 0) {
                    strWvg = zyVar.wvg();
                } else if (iMo6170f == 1) {
                    zyVar.zy();
                    while (zyVar.ld6()) {
                        C1464n qVar = zurt.toq(zyVar, ld6Var);
                        c0252s.fn3e(qVar.m6071q(), qVar);
                        arrayList.add(qVar);
                    }
                    zyVar.mo6174y();
                } else if (iMo6170f == 2) {
                    iKi = zyVar.ki();
                } else if (iMo6170f == 3) {
                    iKi2 = zyVar.ki();
                } else if (iMo6170f == 4) {
                    strWvg2 = zyVar.wvg();
                } else if (iMo6170f != 5) {
                    zyVar.yz();
                    zyVar.y9n();
                } else {
                    strWvg3 = zyVar.wvg();
                }
            }
            zyVar.mo6172p();
            if (strWvg2 != null) {
                com.airbnb.lottie.dd ddVar = new com.airbnb.lottie.dd(iKi, iKi2, strWvg, strWvg2, strWvg3);
                map2.put(ddVar.m5956n(), ddVar);
            } else {
                map.put(strWvg, arrayList);
            }
        }
        zyVar.mo6174y();
    }

    private static void zy(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, androidx.collection.n7h<C1472q> n7hVar) throws IOException {
        zyVar.zy();
        while (zyVar.ld6()) {
            C1472q c1472qM6197k = qrj.m6197k(zyVar, ld6Var);
            n7hVar.fn3e(c1472qM6197k.hashCode(), c1472qM6197k);
        }
        zyVar.mo6174y();
    }
}
