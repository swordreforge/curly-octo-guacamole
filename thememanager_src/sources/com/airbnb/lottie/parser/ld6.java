package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: DropShadowEffectParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private C1443k f8157k;

    /* JADX INFO: renamed from: n */
    private com.airbnb.lottie.model.animatable.toq f8158n;

    /* JADX INFO: renamed from: q */
    private com.airbnb.lottie.model.animatable.toq f8159q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.toq f56162toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.toq f56163zy;

    /* JADX INFO: renamed from: g */
    private static final zy.C1492k f8156g = zy.C1492k.m6178k("ef");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final zy.C1492k f56161f7l8 = zy.C1492k.m6178k("nm", "v");

    /* JADX INFO: renamed from: k */
    private void m6157k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        zyVar.mo6173q();
        String strWvg = "";
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f56161f7l8);
            if (iMo6170f != 0) {
                if (iMo6170f == 1) {
                    strWvg.hashCode();
                    switch (strWvg) {
                        case "Distance":
                            this.f8159q = C1495q.m6192n(zyVar, ld6Var);
                            break;
                        case "Opacity":
                            this.f56162toq = C1495q.m6190g(zyVar, ld6Var, false);
                            break;
                        case "Direction":
                            this.f56163zy = C1495q.m6190g(zyVar, ld6Var, false);
                            break;
                        case "Shadow Color":
                            this.f8157k = C1495q.zy(zyVar, ld6Var);
                            break;
                        case "Softness":
                            this.f8158n = C1495q.m6192n(zyVar, ld6Var);
                            break;
                        default:
                            zyVar.y9n();
                            break;
                    }
                } else {
                    zyVar.yz();
                    zyVar.y9n();
                }
            } else {
                strWvg = zyVar.wvg();
            }
        }
        zyVar.mo6172p();
    }

    @zy.dd
    C1494p toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        com.airbnb.lottie.model.animatable.toq toqVar;
        com.airbnb.lottie.model.animatable.toq toqVar2;
        com.airbnb.lottie.model.animatable.toq toqVar3;
        com.airbnb.lottie.model.animatable.toq toqVar4;
        while (zyVar.ld6()) {
            if (zyVar.mo6170f(f8156g) != 0) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zyVar.zy();
                while (zyVar.ld6()) {
                    m6157k(zyVar, ld6Var);
                }
                zyVar.mo6174y();
            }
        }
        C1443k c1443k = this.f8157k;
        if (c1443k == null || (toqVar = this.f56162toq) == null || (toqVar2 = this.f56163zy) == null || (toqVar3 = this.f8159q) == null || (toqVar4 = this.f8158n) == null) {
            return null;
        }
        return new C1494p(c1443k, toqVar, toqVar2, toqVar3, toqVar4);
    }
}
