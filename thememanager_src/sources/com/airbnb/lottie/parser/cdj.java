package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.content.C1449g;
import com.airbnb.lottie.model.content.ki;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.value.C1515k;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5725m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import t8iq.C7672k;
import v5yj.C7704k;

/* JADX INFO: compiled from: GradientStrokeParser.java */
/* JADX INFO: loaded from: classes.dex */
class cdj {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8138k = zy.C1492k.m6178k("nm", C7704k.y.toq.f95579toq, "o", "t", C7704k.y.toq.f44691k, "e", AnimatedProperty.PROPERTY_NAME_W, "lc", "lj", C5725m.f31969g, "hd", C7672k.f94880zy);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56154toq = zy.C1492k.m6178k("p", "k");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final zy.C1492k f56155zy = zy.C1492k.m6178k("n", "v");

    private cdj() {
    }

    /* JADX INFO: renamed from: k */
    static C1449g m6139k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        com.airbnb.lottie.model.animatable.zy zyVar2;
        ArrayList arrayList = new ArrayList();
        float fMo6171h = 0.0f;
        String strWvg = null;
        com.airbnb.lottie.model.content.f7l8 f7l8Var = null;
        com.airbnb.lottie.model.animatable.zy zyVarF7l8 = null;
        C1442g c1442gM6195s = null;
        C1442g c1442gM6195s2 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n = null;
        ki.toq toqVar = null;
        ki.zy zyVar3 = null;
        com.airbnb.lottie.model.animatable.toq toqVar2 = null;
        boolean zX2 = false;
        C1446q c1446q = null;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8138k)) {
                case 0:
                    strWvg = zyVar.wvg();
                    break;
                case 1:
                    int iKi = -1;
                    zyVar.mo6173q();
                    while (zyVar.ld6()) {
                        int iMo6170f = zyVar.mo6170f(f56154toq);
                        if (iMo6170f != 0) {
                            zyVar2 = zyVarF7l8;
                            if (iMo6170f != 1) {
                                zyVar.yz();
                                zyVar.y9n();
                            } else {
                                zyVarF7l8 = C1495q.f7l8(zyVar, ld6Var, iKi);
                            }
                        } else {
                            zyVar2 = zyVarF7l8;
                            iKi = zyVar.ki();
                        }
                        zyVarF7l8 = zyVar2;
                    }
                    zyVar.mo6172p();
                    break;
                case 2:
                    c1446q = C1495q.m6196y(zyVar, ld6Var);
                    break;
                case 3:
                    f7l8Var = zyVar.ki() == 1 ? com.airbnb.lottie.model.content.f7l8.LINEAR : com.airbnb.lottie.model.content.f7l8.RADIAL;
                    break;
                case 4:
                    c1442gM6195s = C1495q.m6195s(zyVar, ld6Var);
                    break;
                case 5:
                    c1442gM6195s2 = C1495q.m6195s(zyVar, ld6Var);
                    break;
                case 6:
                    toqVarM6192n = C1495q.m6192n(zyVar, ld6Var);
                    break;
                case 7:
                    toqVar = ki.toq.values()[zyVar.ki() - 1];
                    break;
                case 8:
                    zyVar3 = ki.zy.values()[zyVar.ki() - 1];
                    break;
                case 9:
                    fMo6171h = (float) zyVar.mo6171h();
                    break;
                case 10:
                    zX2 = zyVar.x2();
                    break;
                case 11:
                    zyVar.zy();
                    while (zyVar.ld6()) {
                        zyVar.mo6173q();
                        String strWvg2 = null;
                        com.airbnb.lottie.model.animatable.toq toqVarM6192n2 = null;
                        while (zyVar.ld6()) {
                            int iMo6170f2 = zyVar.mo6170f(f56155zy);
                            if (iMo6170f2 != 0) {
                                com.airbnb.lottie.model.animatable.toq toqVar3 = toqVar2;
                                if (iMo6170f2 != 1) {
                                    zyVar.yz();
                                    zyVar.y9n();
                                } else {
                                    toqVarM6192n2 = C1495q.m6192n(zyVar, ld6Var);
                                }
                                toqVar2 = toqVar3;
                            } else {
                                strWvg2 = zyVar.wvg();
                            }
                        }
                        com.airbnb.lottie.model.animatable.toq toqVar4 = toqVar2;
                        zyVar.mo6172p();
                        if (strWvg2.equals("o")) {
                            toqVar2 = toqVarM6192n2;
                        } else {
                            if (strWvg2.equals(C7672k.f94880zy) || strWvg2.equals(C7704k.y.toq.f95579toq)) {
                                ld6Var.m5980z(true);
                                arrayList.add(toqVarM6192n2);
                            }
                            toqVar2 = toqVar4;
                        }
                    }
                    com.airbnb.lottie.model.animatable.toq toqVar5 = toqVar2;
                    zyVar.mo6174y();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.toq) arrayList.get(0));
                    }
                    toqVar2 = toqVar5;
                    break;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    break;
            }
        }
        if (c1446q == null) {
            c1446q = new C1446q(Collections.singletonList(new C1515k(100)));
        }
        return new C1449g(strWvg, f7l8Var, zyVarF7l8, c1446q, c1442gM6195s, c1442gM6195s2, toqVarM6192n, toqVar, zyVar3, fMo6171h, arrayList, toqVar2, zX2);
    }
}
