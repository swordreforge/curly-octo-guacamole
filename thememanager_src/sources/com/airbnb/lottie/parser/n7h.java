package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: FontParser.java */
/* JADX INFO: loaded from: classes.dex */
class n7h {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8217k = zy.C1492k.m6178k("fFamily", "fName", "fStyle", "ascent");

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.zy m6180k(com.airbnb.lottie.parser.moshi.zy zyVar) throws IOException {
        zyVar.mo6173q();
        String strWvg = null;
        String strWvg2 = null;
        float fMo6171h = 0.0f;
        String strWvg3 = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8217k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                strWvg3 = zyVar.wvg();
            } else if (iMo6170f == 2) {
                strWvg2 = zyVar.wvg();
            } else if (iMo6170f != 3) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                fMo6171h = (float) zyVar.mo6171h();
            }
        }
        zyVar.mo6172p();
        return new com.airbnb.lottie.model.zy(strWvg, strWvg3, strWvg2, fMo6171h);
    }
}
