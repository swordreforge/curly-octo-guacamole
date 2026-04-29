package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.value.C1515k;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: ShapeFillParser.java */
/* JADX INFO: loaded from: classes.dex */
class d3 {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8140k = zy.C1492k.m6178k("nm", "c", "o", "fillEnabled", "r", "hd");

    private d3() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.kja0 m6141k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        C1446q c1446qM6196y = null;
        boolean zX2 = false;
        boolean zX22 = false;
        int iKi = 1;
        String strWvg = null;
        C1443k c1443kZy = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8140k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                c1443kZy = C1495q.zy(zyVar, ld6Var);
            } else if (iMo6170f == 2) {
                c1446qM6196y = C1495q.m6196y(zyVar, ld6Var);
            } else if (iMo6170f == 3) {
                zX2 = zyVar.x2();
            } else if (iMo6170f == 4) {
                iKi = zyVar.ki();
            } else if (iMo6170f != 5) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zX22 = zyVar.x2();
            }
        }
        return new com.airbnb.lottie.model.content.kja0(strWvg, zX2, iKi == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c1443kZy, c1446qM6196y == null ? new C1446q(Collections.singletonList(new C1515k(100))) : c1446qM6196y, zX22);
    }
}
