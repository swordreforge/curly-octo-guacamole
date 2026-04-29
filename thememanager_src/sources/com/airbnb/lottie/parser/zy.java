package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.C1444n;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.animatable.C1447s;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.value.C1515k;
import java.io.IOException;
import v5yj.C7704k;

/* JADX INFO: compiled from: AnimatableTransformParser.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final zy.C1492k f8236k = zy.C1492k.m6178k("a", "p", C7704k.y.toq.f44691k, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56182toq = zy.C1492k.m6178k("k");

    private zy() {
    }

    public static com.airbnb.lottie.model.animatable.x2 f7l8(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        boolean z2;
        boolean z3 = false;
        boolean z5 = zyVar.d2ok() == zy.toq.BEGIN_OBJECT;
        if (z5) {
            zyVar.mo6173q();
        }
        com.airbnb.lottie.model.animatable.toq toqVar = null;
        C1444n c1444nM6155k = null;
        com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qVar = null;
        com.airbnb.lottie.model.animatable.f7l8 f7l8VarM6193p = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g2 = null;
        C1446q c1446qM6196y = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g3 = null;
        com.airbnb.lottie.model.animatable.toq toqVarM6190g4 = null;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f8236k)) {
                case 0:
                    boolean z6 = z3;
                    zyVar.mo6173q();
                    while (zyVar.ld6()) {
                        if (zyVar.mo6170f(f56182toq) != 0) {
                            zyVar.yz();
                            zyVar.y9n();
                        } else {
                            c1444nM6155k = C1487k.m6155k(zyVar, ld6Var);
                        }
                    }
                    zyVar.mo6172p();
                    z3 = z6;
                    continue;
                case 1:
                    qVar = C1487k.toq(zyVar, ld6Var);
                    continue;
                case 2:
                    f7l8VarM6193p = C1495q.m6193p(zyVar, ld6Var);
                    continue;
                case 3:
                    ld6Var.m5974k("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c1446qM6196y = C1495q.m6196y(zyVar, ld6Var);
                    continue;
                case 6:
                    toqVarM6190g3 = C1495q.m6190g(zyVar, ld6Var, z3);
                    continue;
                case 7:
                    toqVarM6190g4 = C1495q.m6190g(zyVar, ld6Var, z3);
                    continue;
                case 8:
                    toqVarM6190g = C1495q.m6190g(zyVar, ld6Var, z3);
                    continue;
                case 9:
                    toqVarM6190g2 = C1495q.m6190g(zyVar, ld6Var, z3);
                    continue;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    continue;
            }
            com.airbnb.lottie.model.animatable.toq toqVarM6190g5 = C1495q.m6190g(zyVar, ld6Var, z3);
            if (toqVarM6190g5.toq().isEmpty()) {
                toqVarM6190g5.toq().add(new C1515k(ld6Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ld6Var.m5971g())));
            } else {
                if (((C1515k) toqVarM6190g5.toq().get(0)).f56198toq == 0) {
                    z2 = false;
                    toqVarM6190g5.toq().set(0, new C1515k(ld6Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ld6Var.m5971g())));
                }
                z3 = z2;
                toqVar = toqVarM6190g5;
            }
            z2 = false;
            z3 = z2;
            toqVar = toqVarM6190g5;
        }
        if (z5) {
            zyVar.mo6172p();
        }
        C1444n c1444n = m6207k(c1444nM6155k) ? null : c1444nM6155k;
        com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar = toq(qVar) ? null : qVar;
        com.airbnb.lottie.model.animatable.toq toqVar2 = zy(toqVar) ? null : toqVar;
        if (m6209q(f7l8VarM6193p)) {
            f7l8VarM6193p = null;
        }
        return new com.airbnb.lottie.model.animatable.x2(c1444n, qrjVar, f7l8VarM6193p, toqVar2, c1446qM6196y, toqVarM6190g3, toqVarM6190g4, m6206g(toqVarM6190g) ? null : toqVarM6190g, m6208n(toqVarM6190g2) ? null : toqVarM6190g2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private static boolean m6206g(com.airbnb.lottie.model.animatable.toq toqVar) {
        return toqVar == null || (toqVar.zy() && ((Float) ((C1515k) toqVar.toq().get(0)).f56198toq).floatValue() == 0.0f);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m6207k(C1444n c1444n) {
        return c1444n == null || (c1444n.zy() && c1444n.toq().get(0).f56198toq.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    private static boolean m6208n(com.airbnb.lottie.model.animatable.toq toqVar) {
        return toqVar == null || (toqVar.zy() && ((Float) ((C1515k) toqVar.toq().get(0)).f56198toq).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private static boolean m6209q(com.airbnb.lottie.model.animatable.f7l8 f7l8Var) {
        return f7l8Var == null || (f7l8Var.zy() && ((com.airbnb.lottie.value.ld6) ((C1515k) f7l8Var.toq().get(0)).f56198toq).m6283k(1.0f, 1.0f));
    }

    private static boolean toq(com.airbnb.lottie.model.animatable.qrj<PointF, PointF> qrjVar) {
        return qrjVar == null || (!(qrjVar instanceof C1447s) && qrjVar.zy() && qrjVar.toq().get(0).f56198toq.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zy(com.airbnb.lottie.model.animatable.toq toqVar) {
        return toqVar == null || (toqVar.zy() && ((Float) ((C1515k) toqVar.toq().get(0)).f56198toq).floatValue() == 0.0f);
    }
}
