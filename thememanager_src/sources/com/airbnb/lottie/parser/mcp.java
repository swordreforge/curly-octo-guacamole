package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.C1455p;
import com.airbnb.lottie.parser.moshi.zy;
import com.market.sdk.utils.C5019y;
import java.io.IOException;
import t8iq.C7672k;

/* JADX INFO: compiled from: PolystarShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
class mcp {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8161k = zy.C1492k.m6178k("nm", "sy", "pt", "p", "r", "or", C5019y.f69023cdj, "ir", "is", "hd", C7672k.f94880zy);

    private mcp() {
    }

    /* JADX INFO: renamed from: k */
    static C1455p m6159k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, int i2) throws IOException {
        boolean zX2 = false;
        boolean z2 = i2 == 3;
        String strWvg = null;
        C1455p.k kVarForValue = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qVar = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g2 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n2 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g3 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g4 = null;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8161k)) {
                case 0:
                    strWvg = zyVar.wvg();
                    break;
                case 1:
                    kVarForValue = C1455p.k.forValue(zyVar.ki());
                    break;
                case 2:
                    toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, false);
                    break;
                case 3:
                    qVar = C1487k.toq(zyVar, ld6Var);
                    break;
                case 4:
                    toqVarM6190g2 = C1495q.m6190g(zyVar, ld6Var, false);
                    break;
                case 5:
                    toqVarM6192n2 = C1495q.m6192n(zyVar, ld6Var);
                    break;
                case 6:
                    toqVarM6190g4 = C1495q.m6190g(zyVar, ld6Var, false);
                    break;
                case 7:
                    toqVarM6192n = C1495q.m6192n(zyVar, ld6Var);
                    break;
                case 8:
                    toqVarM6190g3 = C1495q.m6190g(zyVar, ld6Var, false);
                    break;
                case 9:
                    zX2 = zyVar.x2();
                    break;
                case 10:
                    z2 = zyVar.ki() == 3;
                    break;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    break;
            }
        }
        return new C1455p(strWvg, kVarForValue, toqVarM6190g, qVar, toqVarM6190g2, toqVarM6192n, toqVarM6192n2, toqVarM6190g3, toqVarM6190g4, zX2, z2);
    }
}
