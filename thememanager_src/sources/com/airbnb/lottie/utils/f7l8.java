package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.ld6;
import com.airbnb.lottie.model.C1461k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.content.n7h;
import java.util.List;
import zy.zurt;

/* JADX INFO: compiled from: MiscUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final PointF f8274k = new PointF();

    static int f7l8(float f2, float f3) {
        return m6242y((int) f2, (int) f3);
    }

    /* JADX INFO: renamed from: g */
    private static int m6236g(int i2, int i3) {
        int i4 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i4 : i4 - 1;
    }

    /* JADX INFO: renamed from: k */
    public static PointF m6237k(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float ld6(float f2, float f3, @zurt(from = 0.0d, to = 1.0d) float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m6238n(float f2, float f3, float f4) {
        return f2 >= f3 && f2 <= f4;
    }

    /* JADX INFO: renamed from: p */
    public static double m6239p(double d2, double d4, @zurt(from = 0.0d, to = 1.0d) double d5) {
        return d2 + (d5 * (d4 - d2));
    }

    /* JADX INFO: renamed from: q */
    public static int m6240q(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    public static void qrj(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2, ld6 ld6Var) {
        if (c1471n.zy(ld6Var.getName(), i2)) {
            list.add(c1471n2.m6087k(ld6Var.getName()).m6089p(ld6Var));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m6241s(n7h n7hVar, Path path) {
        path.reset();
        PointF qVar = n7hVar.toq();
        path.moveTo(qVar.x, qVar.y);
        f8274k.set(qVar.x, qVar.y);
        for (int i2 = 0; i2 < n7hVar.m6034k().size(); i2++) {
            C1461k c1461k = n7hVar.m6034k().get(i2);
            PointF pointFM6061k = c1461k.m6061k();
            PointF qVar2 = c1461k.toq();
            PointF pointFZy = c1461k.zy();
            PointF pointF = f8274k;
            if (pointFM6061k.equals(pointF) && qVar2.equals(pointFZy)) {
                path.lineTo(pointFZy.x, pointFZy.y);
            } else {
                path.cubicTo(pointFM6061k.x, pointFM6061k.y, qVar2.x, qVar2.y, pointFZy.x, pointFZy.y);
            }
            pointF.set(pointFZy.x, pointFZy.y);
        }
        if (n7hVar.m6036q()) {
            path.close();
        }
    }

    public static double toq(double d2, double d4, double d5) {
        return Math.max(d4, Math.min(d5, d2));
    }

    public static int x2(int i2, int i3, @zurt(from = 0.0d, to = 1.0d) float f2) {
        return (int) (i2 + (f2 * (i3 - i2)));
    }

    /* JADX INFO: renamed from: y */
    private static int m6242y(int i2, int i3) {
        return i2 - (i3 * m6236g(i2, i3));
    }

    public static float zy(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }
}
