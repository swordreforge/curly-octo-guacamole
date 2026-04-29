package miuix.core.util;

import android.content.Context;
import android.graphics.Point;
import exv8.C6022k;

/* JADX INFO: renamed from: miuix.core.util.h */
/* JADX INFO: compiled from: ScreenModeHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7079h {

    /* JADX INFO: renamed from: k */
    private static final int f39861k = 61440;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f87342toq = 15;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final int f87343zy = 600;

    /* JADX INFO: renamed from: k */
    public static void m25548k(Context context, t8r t8rVar, Point point) {
        C6022k.toq(t8rVar, context, point);
        if (m25550q(t8rVar.f87379f7l8)) {
            return;
        }
        exv8.toq.m22258k(t8rVar, point);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25549n(int i2) {
        return (i2 & 4096) != 0;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m25550q(int i2) {
        return (i2 & 8192) != 0;
    }

    @Deprecated
    public static int toq(int i2) {
        return i2 & 15;
    }

    @Deprecated
    public static int zy(int i2) {
        return i2 & f39861k;
    }
}
