package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1448y;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: ShapePathParser.java */
/* JADX INFO: loaded from: classes.dex */
class eqxt {

    /* JADX INFO: renamed from: k */
    static zy.C1492k f8141k = zy.C1492k.m6178k("nm", "ind", "ks", "hd");

    private eqxt() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.cdj m6142k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        int iKi = 0;
        String strWvg = null;
        C1448y c1448yLd6 = null;
        boolean zX2 = false;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8141k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                iKi = zyVar.ki();
            } else if (iMo6170f == 2) {
                c1448yLd6 = C1495q.ld6(zyVar, ld6Var);
            } else if (iMo6170f != 3) {
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        return new com.airbnb.lottie.model.content.cdj(strWvg, iKi, c1448yLd6, zX2);
    }
}
