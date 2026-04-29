package miuix.internal.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

/* JADX INFO: compiled from: DisplayHelper.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class f7l8 {

    /* JADX INFO: renamed from: y */
    private static final String f40365y = "DisplayHelper";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f87758f7l8;

    /* JADX INFO: renamed from: g */
    private int f40366g;

    /* JADX INFO: renamed from: k */
    private DisplayMetrics f40367k;

    /* JADX INFO: renamed from: n */
    private int f40368n;

    /* JADX INFO: renamed from: q */
    private float f40369q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87759toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87760zy;

    public f7l8(Context context) {
        m25937k(context);
    }

    /* JADX INFO: renamed from: k */
    private void m25937k(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f40367k = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(this.f40367k);
        DisplayMetrics displayMetrics = this.f40367k;
        int i2 = displayMetrics.widthPixels;
        this.f87759toq = i2;
        int i3 = displayMetrics.heightPixels;
        this.f87760zy = i3;
        float f2 = displayMetrics.density;
        this.f40369q = f2;
        this.f40368n = displayMetrics.densityDpi;
        this.f40366g = (int) (i2 / f2);
        this.f87758f7l8 = (int) (i3 / f2);
    }

    public int f7l8() {
        return this.f40366g;
    }

    /* JADX INFO: renamed from: g */
    public int m25938g() {
        return this.f87760zy;
    }

    /* JADX INFO: renamed from: n */
    public int m25939n() {
        return this.f87758f7l8;
    }

    /* JADX INFO: renamed from: q */
    public DisplayMetrics m25940q() {
        return this.f40367k;
    }

    /* JADX INFO: renamed from: s */
    public void m25941s() {
        Log.d(f40365y, "屏幕宽度（像素）：" + this.f87759toq);
        Log.d(f40365y, "屏幕高度（像素）：" + this.f87760zy);
        Log.d(f40365y, "屏幕密度：" + this.f40369q);
        Log.d(f40365y, "屏幕密度（dpi）：" + this.f40368n);
        Log.d(f40365y, "屏幕宽度（dp）：" + this.f40366g);
        Log.d(f40365y, "屏幕高度（dp）：" + this.f87758f7l8);
    }

    public float toq() {
        return this.f40369q;
    }

    /* JADX INFO: renamed from: y */
    public int m25942y() {
        return this.f87759toq;
    }

    public int zy() {
        return this.f40368n;
    }
}
