package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: RoundedCornersParser.java */
/* JADX INFO: loaded from: classes.dex */
public class fti {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8144k = zy.C1492k.m6178k("nm", "r", "hd");

    private fti() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.qrj m6145k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        boolean zX2 = false;
        String strWvg = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8144k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, true);
            } else if (iMo6170f != 2) {
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        if (zX2) {
            return null;
        }
        return new com.airbnb.lottie.model.content.qrj(strWvg, toqVarM6190g);
    }
}
