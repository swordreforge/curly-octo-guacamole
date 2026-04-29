package exv8;

import android.content.Context;
import android.graphics.Point;
import miuix.core.util.C7080i;
import miuix.core.util.t8r;
import zy.lvui;

/* JADX INFO: renamed from: exv8.k */
/* JADX INFO: compiled from: FreeFormModeHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6022k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f75142f7l8 = 8193;

    /* JADX INFO: renamed from: g */
    public static final int f34672g = 8192;

    /* JADX INFO: renamed from: k */
    public static final int f34673k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f34674n = 4;

    /* JADX INFO: renamed from: p */
    public static final int f34675p = 8196;

    /* JADX INFO: renamed from: q */
    public static final int f34676q = 3;

    /* JADX INFO: renamed from: s */
    public static final int f34677s = 8195;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f75143toq = 1;

    /* JADX INFO: renamed from: y */
    public static final int f34678y = 8194;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f75144zy = 2;

    @lvui
    /* JADX INFO: renamed from: k */
    private static t8r m22257k(t8r t8rVar, Context context, Point point) {
        if (!C7080i.fu4(context.getResources().getConfiguration(), point, t8rVar.f87381zy)) {
            t8rVar.f87379f7l8 &= -8193;
            return t8rVar;
        }
        int i2 = t8rVar.f87381zy.x;
        return zy(t8rVar, i2 != 0 ? (r3.y * 1.0f) / i2 : 0.0f);
    }

    @lvui
    public static t8r toq(t8r t8rVar, Context context, Point point) {
        return m22257k(t8rVar, context, point);
    }

    @lvui
    private static t8r zy(t8r t8rVar, float f2) {
        if (f2 <= 0.0f) {
            t8rVar.f87379f7l8 = 0;
        } else if (f2 >= 0.74f && f2 < 0.76f) {
            t8rVar.f87379f7l8 = 8195;
        } else if (f2 >= 1.32f && f2 < 1.34f) {
            t8rVar.f87379f7l8 = 8194;
        } else if (f2 < 1.76f || f2 >= 1.79f) {
            t8rVar.f87379f7l8 = 8196;
        } else {
            t8rVar.f87379f7l8 = 8193;
        }
        return t8rVar;
    }
}
