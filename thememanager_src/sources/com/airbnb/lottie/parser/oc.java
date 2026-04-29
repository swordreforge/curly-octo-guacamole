package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.C1450h;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShapeGroupParser.java */
/* JADX INFO: loaded from: classes.dex */
class oc {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8220k = zy.C1492k.m6178k("nm", "hd", "it");

    private oc() {
    }

    /* JADX INFO: renamed from: k */
    static C1450h m6186k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strWvg = null;
        boolean zX2 = false;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8220k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                zX2 = zyVar.x2();
            } else if (iMo6170f != 2) {
                zyVar.y9n();
            } else {
                zyVar.zy();
                while (zyVar.ld6()) {
                    com.airbnb.lottie.model.content.zy zyVarM6203k = C1500y.m6203k(zyVar, ld6Var);
                    if (zyVarM6203k != null) {
                        arrayList.add(zyVarM6203k);
                    }
                }
                zyVar.mo6174y();
            }
        }
        return new C1450h(strWvg, arrayList, zX2);
    }
}
