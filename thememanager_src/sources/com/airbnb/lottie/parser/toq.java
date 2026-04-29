package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: AnimatableTextPropertiesParser.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8229k = zy.C1492k.m6178k("a");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56179toq = zy.C1492k.m6178k("fc", "sc", "sw", "t");

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static com.airbnb.lottie.model.animatable.ld6 m6202k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        zyVar.mo6173q();
        com.airbnb.lottie.model.animatable.ld6 qVar = null;
        while (zyVar.ld6()) {
            if (zyVar.mo6170f(f8229k) != 0) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                qVar = toq(zyVar, ld6Var);
            }
        }
        zyVar.mo6172p();
        return qVar == null ? new com.airbnb.lottie.model.animatable.ld6(null, null, null, null) : qVar;
    }

    private static com.airbnb.lottie.model.animatable.ld6 toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        zyVar.mo6173q();
        C1443k c1443kZy = null;
        C1443k c1443kZy2 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n2 = null;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f56179toq);
            if (iMo6170f == 0) {
                c1443kZy = C1495q.zy(zyVar, ld6Var);
            } else if (iMo6170f == 1) {
                c1443kZy2 = C1495q.zy(zyVar, ld6Var);
            } else if (iMo6170f == 2) {
                toqVarM6192n = C1495q.m6192n(zyVar, ld6Var);
            } else if (iMo6170f != 3) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                toqVarM6192n2 = C1495q.m6192n(zyVar, ld6Var);
            }
        }
        zyVar.mo6172p();
        return new com.airbnb.lottie.model.animatable.ld6(c1443kZy, c1443kZy2, toqVarM6192n, toqVarM6192n2);
    }
}
