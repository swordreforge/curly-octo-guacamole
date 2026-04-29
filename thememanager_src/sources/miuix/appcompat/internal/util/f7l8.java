package miuix.appcompat.internal.util;

import android.content.Context;
import gb.toq;

/* JADX INFO: compiled from: LayoutUIUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    public static final int f39342k = 0;

    /* JADX INFO: renamed from: q */
    public static final int f39343q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f86980toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f86981zy = 2;

    /* JADX INFO: renamed from: k */
    public static int m25238k(Context context, int i2) {
        if (i2 == 1) {
            return context.getResources().getDimensionPixelSize(toq.f7l8.wq);
        }
        if (i2 == 2) {
            return context.getResources().getDimensionPixelSize(toq.f7l8.r3w);
        }
        if (i2 != 3) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(toq.f7l8.qb8);
    }

    public static boolean toq(int i2) {
        return i2 >= 0 && i2 <= 3;
    }
}
