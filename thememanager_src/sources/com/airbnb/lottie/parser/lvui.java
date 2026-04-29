package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.t8r;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import v5yj.C7704k;

/* JADX INFO: compiled from: ShapeTrimPathParser.java */
/* JADX INFO: loaded from: classes.dex */
class lvui {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8160k = zy.C1492k.m6178k(C7704k.y.toq.f44691k, "e", "o", "nm", "m", "hd");

    private lvui() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.t8r m6158k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        boolean zX2 = false;
        String strWvg = null;
        t8r.EnumC1458k enumC1458kForId = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g2 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g3 = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8160k);
            if (iMo6170f == 0) {
                toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, false);
            } else if (iMo6170f == 1) {
                toqVarM6190g2 = C1495q.m6190g(zyVar, ld6Var, false);
            } else if (iMo6170f == 2) {
                toqVarM6190g3 = C1495q.m6190g(zyVar, ld6Var, false);
            } else if (iMo6170f == 3) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 4) {
                enumC1458kForId = t8r.EnumC1458k.forId(zyVar.ki());
            } else if (iMo6170f != 5) {
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        return new com.airbnb.lottie.model.content.t8r(strWvg, enumC1458kForId, toqVarM6190g, toqVarM6190g2, toqVarM6190g3, zX2);
    }
}
