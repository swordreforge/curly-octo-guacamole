package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: RepeaterParser.java */
/* JADX INFO: loaded from: classes.dex */
class a9 {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8137k = zy.C1492k.m6178k("nm", "c", "o", "tr", "hd");

    private a9() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.x2 m6138k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        boolean zX2 = false;
        String strWvg = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g2 = null;
        com.airbnb.lottie.model.animatable.x2 x2VarF7l8 = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8137k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, false);
            } else if (iMo6170f == 2) {
                toqVarM6190g2 = C1495q.m6190g(zyVar, ld6Var, false);
            } else if (iMo6170f == 3) {
                x2VarF7l8 = zy.f7l8(zyVar, ld6Var);
            } else if (iMo6170f != 4) {
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        return new com.airbnb.lottie.model.content.x2(strWvg, toqVarM6190g, toqVarM6190g2, x2VarF7l8, zX2);
    }
}
