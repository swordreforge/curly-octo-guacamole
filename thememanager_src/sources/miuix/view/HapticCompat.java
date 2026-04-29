package miuix.view;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miuix.core.util.SystemProperties;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class HapticCompat {

    /* JADX INFO: renamed from: k */
    static final String f42260k = "HapticCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static String f92227toq = SystemProperties.get("sys.haptic.version", "1.0");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static List<ld6> f92228zy = new ArrayList();

    /* JADX INFO: renamed from: q */
    private static final Executor f42261q = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: miuix.view.HapticCompat$k */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7379k {

        /* JADX INFO: renamed from: b */
        public static final String f42262b = "2.0";

        /* JADX INFO: renamed from: y9n, reason: collision with root package name */
        public static final String f92229y9n = "1.0";
    }

    private static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        private final WeakReference<View> f42263k;

        /* JADX INFO: renamed from: q */
        private final int f42264q;

        public toq(View view, int i2) {
            this.f42263k = new WeakReference<>(view);
            this.f42264q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f42263k.get();
            if (view == null || !view.isAttachedToWindow()) {
                return;
            }
            try {
                HapticCompat.performHapticFeedback(view, this.f42264q);
            } catch (Exception unused) {
            }
        }
    }

    static {
        m26769q("miuix.view.LinearVibrator", "miuix.view.ExtendedVibrator");
    }

    public static boolean f7l8(int i2) {
        if (i2 < 268435456) {
            Log.i(f42260k, String.format("perform haptic: 0x%08x", Integer.valueOf(i2)));
            return false;
        }
        int i3 = C7385p.f42277q;
        if (i2 > i3) {
            Log.w(f42260k, String.format("illegal feedback constant, should be in range [0x%08x..0x%08x]", 268435456, Integer.valueOf(i3)));
            return false;
        }
        for (ld6 ld6Var : f92228zy) {
            if ((ld6Var instanceof LinearVibrator) && ((LinearVibrator) ld6Var).supportLinearMotor(i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26766g(@lvui View view, int i2, int i3) {
        if (zy(InterfaceC7379k.f42262b)) {
            if (toq(i2)) {
                return performHapticFeedback(view, i2);
            }
            return false;
        }
        if (zy("1.0")) {
            if (m26767k(i3)) {
                return performHapticFeedback(view, i3);
            }
            return false;
        }
        Log.e(f42260k, "Unexpected haptic version: " + f92227toq);
        return false;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m26767k(int i2) {
        int i3 = C7385p.f42275n;
        if (i2 >= i3 && i2 <= C7385p.f42271g) {
            return true;
        }
        Log.e(f42260k, String.format("Illegal haptic version 1 feedback constant, should be in range [0x%08x..0x%08x]", Integer.valueOf(i3), Integer.valueOf(C7385p.f42271g)));
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static int m26768n(int i2) {
        for (ld6 ld6Var : f92228zy) {
            if (ld6Var instanceof LinearVibrator) {
                return ((LinearVibrator) ld6Var).obtainFeedBack(i2);
            }
        }
        return -1;
    }

    @Keep
    public static boolean performHapticFeedback(@lvui View view, int i2) {
        if (view == null) {
            Log.e(f42260k, "performHapticFeedback: view is null!");
            return false;
        }
        if (i2 < 268435456) {
            Log.i(f42260k, String.format("perform haptic: 0x%08x", Integer.valueOf(i2)));
            return view.performHapticFeedback(i2);
        }
        int i3 = C7385p.f42277q;
        if (i2 > i3) {
            Log.w(f42260k, String.format("illegal feedback constant, should be in range [0x%08x..0x%08x]", 268435456, Integer.valueOf(i3)));
            return false;
        }
        Iterator<ld6> it = f92228zy.iterator();
        while (it.hasNext()) {
            if (it.next().performHapticFeedback(view, i2)) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void performHapticFeedbackAsync(@lvui View view, int i2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f42261q.execute(new toq(view, i2));
        } else {
            performHapticFeedback(view, i2);
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m26769q(String... strArr) {
        for (String str : strArr) {
            Log.i(f42260k, "loading provider: " + str);
            try {
                Class.forName(str, true, HapticCompat.class.getClassLoader());
            } catch (ClassNotFoundException e2) {
                Log.w(f42260k, String.format("load provider %s failed.", str), e2);
            }
        }
    }

    @Keep
    static void registerProvider(ld6 ld6Var) {
        f92228zy.add(ld6Var);
    }

    private static boolean toq(int i2) {
        int i3 = C7385p.f92254wvg;
        if (i2 >= i3 && i2 <= C7385p.f42279t) {
            return true;
        }
        Log.e(f42260k, String.format("Illegal haptic version 2 feedback constant, should be in range [0x%08x..0x%08x]", Integer.valueOf(i3), Integer.valueOf(C7385p.f42279t)));
        return false;
    }

    public static boolean zy(String str) {
        return f92227toq.equals(str);
    }

    @Keep
    public static void performHapticFeedbackAsync(@lvui View view, int i2, int i3) {
        if (zy(InterfaceC7379k.f42262b)) {
            if (toq(i2)) {
                performHapticFeedbackAsync(view, i2);
            }
        } else if (zy("1.0")) {
            if (m26767k(i3)) {
                performHapticFeedbackAsync(view, i3);
            }
        } else {
            Log.e(f42260k, "Unexpected haptic version: " + f92227toq);
        }
    }
}
