package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.C1452k;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.n */
/* JADX INFO: compiled from: BlurEffectParser.java */
/* JADX INFO: loaded from: classes.dex */
class C1493n {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8216k = zy.C1492k.m6178k("ef");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56172toq = zy.C1492k.m6178k("ty", "v");

    C1493n() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    private static C1452k m6179k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        zyVar.mo6173q();
        C1452k c1452k = null;
        while (true) {
            boolean z2 = false;
            while (zyVar.ld6()) {
                int iMo6170f = zyVar.mo6170f(f56172toq);
                if (iMo6170f != 0) {
                    if (iMo6170f != 1) {
                        zyVar.yz();
                        zyVar.y9n();
                    } else if (z2) {
                        c1452k = new C1452k(C1495q.m6192n(zyVar, ld6Var));
                    } else {
                        zyVar.y9n();
                    }
                } else if (zyVar.ki() == 0) {
                    z2 = true;
                }
            }
            zyVar.mo6172p();
            return c1452k;
        }
    }

    @zy.dd
    static C1452k toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        C1452k c1452k = null;
        while (zyVar.ld6()) {
            if (zyVar.mo6170f(f8216k) != 0) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                zyVar.zy();
                while (zyVar.ld6()) {
                    C1452k c1452kM6179k = m6179k(zyVar, ld6Var);
                    if (c1452kM6179k != null) {
                        c1452k = c1452kM6179k;
                    }
                }
                zyVar.mo6174y();
            }
        }
        return c1452k;
    }
}
