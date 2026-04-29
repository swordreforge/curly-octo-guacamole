package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.content.C1454n;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.value.C1515k;
import java.io.IOException;
import java.util.Collections;
import v5yj.C7704k;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.h */
/* JADX INFO: compiled from: GradientFillParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1485h {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8147k = zy.C1492k.m6178k("nm", C7704k.y.toq.f95579toq, "o", "t", C7704k.y.toq.f44691k, "e", "r", "hd");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56158toq = zy.C1492k.m6178k("p", "k");

    private C1485h() {
    }

    /* JADX INFO: renamed from: k */
    static C1454n m6148k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        C1446q c1446qM6196y = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strWvg = null;
        com.airbnb.lottie.model.content.f7l8 f7l8Var = null;
        com.airbnb.lottie.model.animatable.zy zyVarF7l8 = null;
        C1442g c1442gM6195s = null;
        C1442g c1442gM6195s2 = null;
        boolean zX2 = false;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8147k)) {
                case 0:
                    strWvg = zyVar.wvg();
                    break;
                case 1:
                    int iKi = -1;
                    zyVar.mo6173q();
                    while (zyVar.ld6()) {
                        int iMo6170f = zyVar.mo6170f(f56158toq);
                        if (iMo6170f == 0) {
                            iKi = zyVar.ki();
                        } else if (iMo6170f != 1) {
                            zyVar.yz();
                            zyVar.y9n();
                        } else {
                            zyVarF7l8 = C1495q.f7l8(zyVar, ld6Var, iKi);
                        }
                    }
                    zyVar.mo6172p();
                    break;
                case 2:
                    c1446qM6196y = C1495q.m6196y(zyVar, ld6Var);
                    break;
                case 3:
                    f7l8Var = zyVar.ki() == 1 ? com.airbnb.lottie.model.content.f7l8.LINEAR : com.airbnb.lottie.model.content.f7l8.RADIAL;
                    break;
                case 4:
                    c1442gM6195s = C1495q.m6195s(zyVar, ld6Var);
                    break;
                case 5:
                    c1442gM6195s2 = C1495q.m6195s(zyVar, ld6Var);
                    break;
                case 6:
                    fillType = zyVar.ki() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zX2 = zyVar.x2();
                    break;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    break;
            }
        }
        return new C1454n(strWvg, f7l8Var, fillType, zyVarF7l8, c1446qM6196y == null ? new C1446q(Collections.singletonList(new C1515k(100))) : c1446qM6196y, c1442gM6195s, c1442gM6195s2, null, null, zX2);
    }
}
