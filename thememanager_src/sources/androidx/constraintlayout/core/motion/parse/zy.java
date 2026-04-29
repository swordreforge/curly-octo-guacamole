package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.fn3e;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.core.parser.C0299g;
import androidx.constraintlayout.core.parser.C0303q;
import androidx.constraintlayout.core.parser.C0305y;
import androidx.constraintlayout.core.parser.f7l8;

/* JADX INFO: compiled from: KeyParser.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.parse.zy$k */
    /* JADX INFO: compiled from: KeyParser.java */
    interface InterfaceC0273k {
        int get(int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: KeyParser.java */
    interface toq {
        /* JADX INFO: renamed from: q */
        int mo967q(String str);
    }

    /* JADX INFO: renamed from: k */
    public static void m968k(String[] strArr) {
        zy("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static fn3e toq(String str, toq toqVar, InterfaceC0273k interfaceC0273k) {
        fn3e fn3eVar = new fn3e();
        try {
            C0299g c0299gM1133q = f7l8.m1133q(str);
            int size = c0299gM1133q.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0303q c0303q = (C0303q) c0299gM1133q.ni7(i2);
                String qVar = c0303q.toq();
                androidx.constraintlayout.core.parser.zy zyVarVyq = c0303q.vyq();
                int iMo967q = toqVar.mo967q(qVar);
                if (iMo967q == -1) {
                    System.err.println("unknown type " + qVar);
                } else {
                    int i3 = interfaceC0273k.get(iMo967q);
                    if (i3 == 1) {
                        fn3eVar.m991q(iMo967q, c0299gM1133q.m1142t(i2));
                    } else if (i3 == 2) {
                        fn3eVar.toq(iMo967q, zyVarVyq.mo1135y());
                        System.out.println("parse " + qVar + " INT_MASK > " + zyVarVyq.mo1135y());
                    } else if (i3 == 4) {
                        fn3eVar.m989k(iMo967q, zyVarVyq.f7l8());
                        System.out.println("parse " + qVar + " FLOAT_MASK > " + zyVarVyq.f7l8());
                    } else if (i3 == 8) {
                        fn3eVar.zy(iMo967q, zyVarVyq.toq());
                        System.out.println("parse " + qVar + " STRING_MASK > " + zyVarVyq.toq());
                    }
                }
            }
        } catch (C0305y e2) {
            e2.printStackTrace();
        }
        return fn3eVar;
    }

    public static fn3e zy(String str) {
        return toq(str, new toq() { // from class: androidx.constraintlayout.core.motion.parse.k
            @Override // androidx.constraintlayout.core.motion.parse.zy.toq
            /* JADX INFO: renamed from: q */
            public final int mo967q(String str2) {
                return zurt.InterfaceC0290k.m1087k(str2);
            }
        }, new InterfaceC0273k() { // from class: androidx.constraintlayout.core.motion.parse.toq
            @Override // androidx.constraintlayout.core.motion.parse.zy.InterfaceC0273k
            public final int get(int i2) {
                return zurt.InterfaceC0290k.getType(i2);
            }
        });
    }
}
