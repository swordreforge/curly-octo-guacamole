package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.animatable.C1448y;
import com.airbnb.lottie.model.content.C1459y;
import com.airbnb.lottie.utils.C1510q;
import java.io.IOException;

/* JADX INFO: compiled from: MaskParser.java */
/* JADX INFO: loaded from: classes.dex */
class fu4 {
    private fu4() {
    }

    /* JADX INFO: renamed from: k */
    static C1459y m6146k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        String strFu4;
        zyVar.mo6173q();
        C1459y.k kVar = null;
        boolean zX2 = false;
        C1448y c1448yLd6 = null;
        C1446q c1446qM6196y = null;
        while (zyVar.ld6()) {
            strFu4 = zyVar.fu4();
            strFu4.hashCode();
            switch (strFu4) {
                case "o":
                    c1446qM6196y = C1495q.m6196y(zyVar, ld6Var);
                    break;
                case "pt":
                    c1448yLd6 = C1495q.ld6(zyVar, ld6Var);
                    break;
                case "inv":
                    zX2 = zyVar.x2();
                    break;
                case "mode":
                    String strWvg = zyVar.wvg();
                    strWvg.hashCode();
                    switch (strWvg) {
                        case "a":
                            kVar = C1459y.k.MASK_MODE_ADD;
                            break;
                        case "i":
                            ld6Var.m5974k("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            kVar = C1459y.k.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            kVar = C1459y.k.MASK_MODE_NONE;
                            break;
                        case "s":
                            kVar = C1459y.k.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            C1510q.m6255n("Unknown mask mode " + strFu4 + ". Defaulting to Add.");
                            kVar = C1459y.k.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    zyVar.y9n();
                    break;
            }
        }
        zyVar.mo6172p();
        return new C1459y(kVar, c1448yLd6, c1446qM6196y, zX2);
    }
}
