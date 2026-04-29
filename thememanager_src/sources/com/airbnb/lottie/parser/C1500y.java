package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.utils.C1510q;
import java.io.IOException;
import t8iq.C7672k;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.y */
/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1500y {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8232k = zy.C1492k.m6178k("ty", C7672k.f94880zy);

    private C1500y() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @zy.dd
    /* JADX INFO: renamed from: k */
    static com.airbnb.lottie.model.content.zy m6203k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        com.airbnb.lottie.model.content.zy zyVarM6147k;
        String strWvg;
        zyVar.mo6173q();
        byte b2 = 2;
        int iKi = 2;
        while (true) {
            zyVarM6147k = null;
            if (!zyVar.ld6()) {
                strWvg = null;
                break;
            }
            int iMo6170f = zyVar.mo6170f(f8232k);
            if (iMo6170f == 0) {
                strWvg = zyVar.wvg();
                break;
            }
            if (iMo6170f != 1) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                iKi = zyVar.ki();
            }
        }
        if (strWvg == null) {
            return null;
        }
        switch (strWvg.hashCode()) {
            case 3239:
                b2 = !strWvg.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b2 = !strWvg.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strWvg.equals("gf")) {
                    b2 = -1;
                }
                break;
            case 3307:
                b2 = !strWvg.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b2 = !strWvg.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b2 = !strWvg.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b2 = !strWvg.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b2 = !strWvg.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b2 = !strWvg.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b2 = !strWvg.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b2 = !strWvg.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b2 = !strWvg.equals("st") ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                break;
            case 3705:
                b2 = !strWvg.equals("tm") ? (byte) -1 : com.google.common.base.zy.f68128n7h;
                break;
            case 3710:
                b2 = !strWvg.equals("tr") ? (byte) -1 : com.google.common.base.zy.f68124kja0;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                zyVarM6147k = C1484g.m6147k(zyVar, ld6Var, iKi);
                break;
            case 1:
                zyVarM6147k = d3.m6141k(zyVar, ld6Var);
                break;
            case 2:
                zyVarM6147k = C1485h.m6148k(zyVar, ld6Var);
                break;
            case 3:
                zyVarM6147k = oc.m6186k(zyVar, ld6Var);
                break;
            case 4:
                zyVarM6147k = cdj.m6139k(zyVar, ld6Var);
                break;
            case 5:
                zyVarM6147k = C1501z.m6204k(zyVar);
                ld6Var.m5974k("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                zyVarM6147k = jk.m6154k(zyVar, ld6Var);
                break;
            case 7:
                zyVarM6147k = fti.m6145k(zyVar, ld6Var);
                break;
            case 8:
                zyVarM6147k = a9.m6138k(zyVar, ld6Var);
                break;
            case 9:
                zyVarM6147k = eqxt.m6142k(zyVar, ld6Var);
                break;
            case 10:
                zyVarM6147k = mcp.m6159k(zyVar, ld6Var, iKi);
                break;
            case 11:
                zyVarM6147k = d2ok.m6140k(zyVar, ld6Var);
                break;
            case 12:
                zyVarM6147k = lvui.m6158k(zyVar, ld6Var);
                break;
            case 13:
                zyVarM6147k = zy.f7l8(zyVar, ld6Var);
                break;
            default:
                C1510q.m6255n("Unknown shape type " + strWvg);
                break;
        }
        while (zyVar.ld6()) {
            zyVar.y9n();
        }
        zyVar.mo6172p();
        return zyVarM6147k;
    }
}
