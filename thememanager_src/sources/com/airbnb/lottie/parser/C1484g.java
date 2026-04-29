package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import t8iq.C7672k;
import v5yj.C7704k;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.g */
/* JADX INFO: compiled from: CircleShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1484g {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8145k = zy.C1492k.m6178k("nm", "p", C7704k.y.toq.f44691k, "hd", C7672k.f94880zy);

    private C1484g() {
    }

    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.toq m6147k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, int i2) throws IOException {
        boolean z2 = i2 == 3;
        boolean zX2 = false;
        String strWvg = null;
        com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qVar = null;
        C1442g c1442gM6195s = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8145k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 1) {
                qVar = C1487k.toq(zyVar, ld6Var);
            } else if (iMo6170f == 2) {
                c1442gM6195s = C1495q.m6195s(zyVar, ld6Var);
            } else if (iMo6170f == 3) {
                zX2 = zyVar.x2();
            } else if (iMo6170f != 4) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                z2 = zyVar.ki() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.toq(strWvg, qVar, c1442gM6195s, z2, zX2);
    }
}
