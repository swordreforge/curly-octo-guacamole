package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import v5yj.C7704k;

/* JADX INFO: compiled from: RectangleShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
class jk {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8151k = zy.C1492k.m6178k("nm", "p", C7704k.y.toq.f44691k, "r", "hd");

    private jk() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.ld6 m6154k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        String strWvg = null;
        com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qVar = null;
        C1442g c1442gM6195s = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n = null;
        boolean zX2 = false;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8151k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                qVar = C1487k.toq(zyVar, ld6Var);
            } else if (iMo6170f == 2) {
                c1442gM6195s = C1495q.m6195s(zyVar, ld6Var);
            } else if (iMo6170f == 3) {
                toqVarM6192n = C1495q.m6192n(zyVar, ld6Var);
            } else if (iMo6170f != 4) {
                zyVar.y9n();
            } else {
                zX2 = zyVar.x2();
            }
        }
        return new com.airbnb.lottie.model.content.ld6(strWvg, qVar, c1442gM6195s, toqVarM6192n, zX2);
    }
}
