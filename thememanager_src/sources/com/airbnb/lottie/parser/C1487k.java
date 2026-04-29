package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.C1444n;
import com.airbnb.lottie.model.animatable.C1447s;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1515k;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.k */
/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C1487k {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8153k = zy.C1492k.m6178k("k", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y);

    private C1487k() {
    }

    /* JADX INFO: renamed from: k */
    public static C1444n m6155k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (zyVar.d2ok() == zy.toq.BEGIN_ARRAY) {
            zyVar.zy();
            while (zyVar.ld6()) {
                arrayList.add(o1t.m6185k(zyVar, ld6Var));
            }
            zyVar.mo6174y();
            fn3e.toq(arrayList);
        } else {
            arrayList.add(new C1515k(t8r.m6200n(zyVar, C1512y.m6260n())));
        }
        return new C1444n(arrayList);
    }

    static com.airbnb.lottie.model.animatable.qrj<PointF, PointF> toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        zyVar.mo6173q();
        C1444n c1444nM6155k = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n = null;
        boolean z2 = false;
        com.airbnb.lottie.model.animatable.toq toqVarM6192n2 = null;
        while (zyVar.d2ok() != zy.toq.END_OBJECT) {
            int iMo6170f = zyVar.mo6170f(f8153k);
            if (iMo6170f == 0) {
                c1444nM6155k = m6155k(zyVar, ld6Var);
            } else if (iMo6170f != 1) {
                if (iMo6170f != 2) {
                    zyVar.yz();
                    zyVar.y9n();
                } else if (zyVar.d2ok() == zy.toq.STRING) {
                    zyVar.y9n();
                    z2 = true;
                } else {
                    toqVarM6192n = C1495q.m6192n(zyVar, ld6Var);
                }
            } else if (zyVar.d2ok() == zy.toq.STRING) {
                zyVar.y9n();
                z2 = true;
            } else {
                toqVarM6192n2 = C1495q.m6192n(zyVar, ld6Var);
            }
        }
        zyVar.mo6172p();
        if (z2) {
            ld6Var.m5974k("Lottie doesn't support expressions.");
        }
        return c1444nM6155k != null ? c1444nM6155k : new C1447s(toqVarM6192n2, toqVarM6192n);
    }
}
