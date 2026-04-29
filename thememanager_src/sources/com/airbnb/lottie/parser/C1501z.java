package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.C1457s;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.z */
/* JADX INFO: compiled from: MergePathsParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1501z {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8233k = zy.C1492k.m6178k("nm", "mm", "hd");

    private C1501z() {
    }

    /* JADX INFO: renamed from: k */
    static C1457s m6204k(com.airbnb.lottie.parser.moshi.zy zyVar) throws IOException {
        String strWvg = null;
        boolean zX2 = false;
        C1457s.k kVarForId = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8233k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                kVarForId = C1457s.k.forId(zyVar.ki());
            } else if (iMo6170f != 2) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        return new C1457s(strWvg, kVarForId, zX2);
    }
}
