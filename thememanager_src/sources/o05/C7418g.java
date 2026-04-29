package o05;

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: o05.g */
/* JADX INFO: loaded from: classes3.dex */
public class C7418g {
    public static void f7l8(View view, int i2) {
        com.miui.lockscreeninfo.toq.zy(View.class, view, "setMiViewBlurMode", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26811g(View view, boolean z2) {
        Class cls = Boolean.TYPE;
        return ((Boolean) com.miui.lockscreeninfo.toq.toq(View.class, view, "setPassWindowBlurEnabled", cls, Boolean.FALSE, new Class[]{cls}, Boolean.valueOf(z2))).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m26812k(View view) {
        zy(view, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m26813n(View view, int i2) {
        com.miui.lockscreeninfo.toq.zy(View.class, view, "setMiBackgroundBlurRadius", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: q */
    public static void m26814q(View view, boolean z2) {
        com.miui.lockscreeninfo.toq.zy(View.class, view, "disableMiBackgroundContainBelow", Void.TYPE, new Class[]{Boolean.TYPE}, Boolean.valueOf(z2));
    }

    public static void toq(View view, int i2) {
        com.miui.lockscreeninfo.toq.zy(View.class, view, "setMiBackgroundBlurMode", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    public static void zy(View view, ArrayList<Point> arrayList) {
        com.miui.lockscreeninfo.toq.zy(View.class, view, "setMiBackgroundBlendColors", Void.TYPE, new Class[]{ArrayList.class}, arrayList);
    }
}
