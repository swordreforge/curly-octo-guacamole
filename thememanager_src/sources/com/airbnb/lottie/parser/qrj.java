package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.C1472q;
import com.airbnb.lottie.model.content.C1450h;
import com.airbnb.lottie.parser.moshi.zy;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontCharacterParser.java */
/* JADX INFO: loaded from: classes.dex */
class qrj {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8224k = zy.C1492k.m6178k("ch", "size", AnimatedProperty.PROPERTY_NAME_W, C3678q.f65814fn3e, "fFamily", "data");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56177toq = zy.C1492k.m6178k("shapes");

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    static C1472q m6197k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        zyVar.mo6173q();
        String strWvg = null;
        String strWvg2 = null;
        double dMo6171h = 0.0d;
        double dMo6171h2 = 0.0d;
        char cCharAt = 0;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f8224k);
            if (iMo6170f == 0) {
                cCharAt = zyVar.wvg().charAt(0);
            } else if (iMo6170f == 1) {
                dMo6171h = zyVar.mo6171h();
            } else if (iMo6170f == 2) {
                dMo6171h2 = zyVar.mo6171h();
            } else if (iMo6170f == 3) {
                strWvg = zyVar.wvg();
            } else if (iMo6170f == 4) {
                strWvg2 = zyVar.wvg();
            } else if (iMo6170f != 5) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zyVar.mo6173q();
                while (zyVar.ld6()) {
                    if (zyVar.mo6170f(f56177toq) != 0) {
                        zyVar.yz();
                        zyVar.y9n();
                    } else {
                        zyVar.zy();
                        while (zyVar.ld6()) {
                            arrayList.add((C1450h) C1500y.m6203k(zyVar, ld6Var));
                        }
                        zyVar.mo6174y();
                    }
                }
                zyVar.mo6172p();
            }
        }
        zyVar.mo6172p();
        return new C1472q(arrayList, cCharAt, dMo6171h, dMo6171h2, strWvg, strWvg2);
    }
}
