package miuix.overscroller.widget;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: OverScrollLogger.java */
/* JADX INFO: loaded from: classes3.dex */
class toq {

    /* JADX INFO: renamed from: k */
    private static final String f40771k = "OverScroll";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f87947toq = Log.isLoggable(f40771k, 3);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final boolean f87948zy = Log.isLoggable(f40771k, 2);

    toq() {
    }

    /* JADX INFO: renamed from: k */
    public static void m26258k(String str) {
        if (f87947toq) {
            Log.d(f40771k, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m26259q(String str, Object... objArr) {
        if (f87948zy) {
            Log.v(f40771k, String.format(Locale.US, str, objArr));
        }
    }

    public static void toq(String str, Object... objArr) {
        if (f87947toq) {
            Log.d(f40771k, String.format(Locale.US, str, objArr));
        }
    }

    public static void zy(String str) {
        if (f87948zy) {
            Log.v(f40771k, str);
        }
    }
}
