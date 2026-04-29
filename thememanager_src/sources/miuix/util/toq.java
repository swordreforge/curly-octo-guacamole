package miuix.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationAttributes;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import miui.util.HapticFeedbackUtil;
import miuix.core.util.SystemProperties;
import miuix.view.HapticCompat;
import miuix.view.PlatformConstants;
import zy.hyr;
import zy.lrht;

/* JADX INFO: compiled from: HapticFeedbackCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f92219f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static boolean f42249g = false;

    /* JADX INFO: renamed from: h */
    private static final Executor f42250h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static boolean f92220kja0 = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static boolean f92221ld6 = false;

    /* JADX INFO: renamed from: n */
    private static boolean f42251n = false;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static boolean f92222n7h = false;

    /* JADX INFO: renamed from: p */
    private static final String f42252p = "USAGE_PHYSICAL_EMULATION";

    /* JADX INFO: renamed from: q */
    private static final int f42253q = 160;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static boolean f92223qrj = false;

    /* JADX INFO: renamed from: s */
    private static boolean f42254s = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f92224toq = "HapticFeedbackCompat";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static boolean f92225x2;

    /* JADX INFO: renamed from: y */
    private static boolean f42255y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f92226zy = 0;

    /* JADX INFO: renamed from: k */
    private HapticFeedbackUtil f42256k;

    /* JADX INFO: renamed from: miuix.util.toq$k */
    /* JADX INFO: compiled from: HapticFeedbackCompat.java */
    class RunnableC7378k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f42257k;

        RunnableC7378k(int i2) {
            this.f42257k = i2;
        }

        @Override // java.lang.Runnable
        @lrht("android.permission.VIBRATE")
        public void run() {
            toq.this.m26756h(this.f42257k);
        }
    }

    static {
        if (PlatformConstants.VERSION >= 1) {
            try {
                f42251n = HapticFeedbackUtil.isSupportLinearMotorVibrate();
            } catch (Throwable th) {
                Log.w(f92224toq, "MIUI Haptic Implementation is not available", th);
                f42251n = false;
            }
            if (f42251n) {
                try {
                    HapticFeedbackUtil.class.getMethod("performHapticFeedback", Integer.TYPE, Double.TYPE, String.class);
                    f42249g = true;
                } catch (Throwable th2) {
                    Log.w(f92224toq, "Not support haptic with reason", th2);
                    f42249g = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("isSupportExtHapticFeedback", Integer.TYPE);
                    f42255y = true;
                } catch (Throwable unused) {
                    f42255y = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", Integer.TYPE, Boolean.TYPE);
                    f42254s = true;
                } catch (Throwable unused2) {
                    f42254s = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("stop", new Class[0]);
                    f92221ld6 = true;
                } catch (Throwable unused3) {
                    f92221ld6 = false;
                }
                try {
                    HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", Integer.TYPE, Double.TYPE, String.class);
                    f92219f7l8 = true;
                } catch (Throwable th3) {
                    Log.w(f92224toq, "Not support ext haptic with reason", th3);
                    f92219f7l8 = false;
                }
            }
        }
        if (PlatformConstants.romHapticVersion < 1.2d || Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", VibrationAttributes.class, Integer.TYPE);
            f92225x2 = true;
        } catch (Exception unused4) {
        }
        try {
            HapticFeedbackUtil.class.getMethod("performExtHapticFeedback", VibrationAttributes.class, Integer.TYPE, Boolean.TYPE);
            f92223qrj = true;
        } catch (Exception unused5) {
        }
        try {
            Class cls = Integer.TYPE;
            HapticFeedbackUtil.class.getMethod("performHapticFeedback", VibrationAttributes.class, cls, Boolean.TYPE, cls);
            f92222n7h = true;
        } catch (Exception unused6) {
        }
        try {
            HapticFeedbackUtil.class.getMethod("performHapticFeedback", VibrationAttributes.class, Integer.TYPE, Double.TYPE, String.class);
            f92220kja0 = true;
        } catch (Exception unused7) {
        }
    }

    @Deprecated
    public toq(Context context, boolean z2) {
        if (PlatformConstants.VERSION < 1) {
            Log.w(f92224toq, "MiuiHapticFeedbackConstants not found or not compatible for LinearVibrator.");
        } else if (f42251n) {
            this.f42256k = new HapticFeedbackUtil(context, z2);
        } else {
            Log.w(f92224toq, "linear motor is not supported in this platform.");
        }
    }

    public boolean a9() {
        return f42249g;
    }

    @lrht("android.permission.VIBRATE")
    public boolean cdj(int i2, double d2, String str) {
        return zurt(null, i2, d2, str);
    }

    @lrht("android.permission.VIBRATE")
    public boolean f7l8(int i2, double d2, String str) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil == null || !f92219f7l8) {
            return false;
        }
        return hapticFeedbackUtil.performExtHapticFeedback(i2, d2, str);
    }

    @lrht("android.permission.VIBRATE")
    public boolean fn3e(VibrationAttributes vibrationAttributes, int i2) {
        return m26764z(vibrationAttributes, i2, false);
    }

    @lrht("android.permission.VIBRATE")
    public boolean fu4(VibrationAttributes vibrationAttributes, int i2, int i3, boolean z2) {
        int iM26768n;
        if (this.f42256k == null || (iM26768n = HapticCompat.m26768n(i2)) == -1) {
            return false;
        }
        try {
            return (PlatformConstants.romHapticVersion < 1.2d || !f92222n7h) ? this.f42256k.performHapticFeedback(iM26768n, z2, i3) : this.f42256k.performHapticFeedback(vibrationAttributes, i2, z2, i3);
        } catch (Exception e2) {
            Log.e(f92224toq, "Failed to perform haptic!", e2);
            return false;
        }
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean zy(int i2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return hapticFeedbackUtil.performExtHapticFeedback(i2);
        }
        return false;
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: h */
    public boolean m26756h(int i2) {
        return fn3e(null, i2);
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: i */
    public boolean m26757i(int i2, boolean z2) {
        return m26764z(null, i2, z2);
    }

    public boolean jk() {
        return f42251n;
    }

    @lrht("android.permission.VIBRATE")
    public boolean ki(int i2, int i3) {
        return ni7(null, i2, i3);
    }

    @lrht("android.permission.VIBRATE")
    public void kja0(final int i2) {
        if (this.f42256k == null) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f42250h.execute(new Runnable() { // from class: miuix.util.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42247k.zy(i2);
                }
            });
        } else {
            zy(i2);
        }
    }

    @lrht("android.permission.VIBRATE")
    public boolean ld6(Uri uri) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return hapticFeedbackUtil.performExtHapticFeedback(uri);
        }
        return false;
    }

    public boolean mcp() {
        return SystemProperties.getBoolean("sys.haptic.intensityforkeyboard", false);
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: n */
    public boolean m26758n(int i2, double d2) {
        return cdj(i2, d2, f42252p);
    }

    @lrht("android.permission.VIBRATE")
    @hyr(33)
    public boolean n7h(VibrationAttributes vibrationAttributes, int i2, boolean z2) {
        try {
            if (PlatformConstants.romHapticVersion < 1.2d || !f92223qrj) {
                return m26759p(i2, z2);
            }
            HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
            if (hapticFeedbackUtil != null) {
                return hapticFeedbackUtil.performExtHapticFeedback(vibrationAttributes, i2, z2);
            }
            return false;
        } catch (Exception e2) {
            Log.e(f92224toq, "Failed to perform ext haptic!", e2);
            return false;
        }
    }

    @lrht("android.permission.VIBRATE")
    public boolean ni7(VibrationAttributes vibrationAttributes, int i2, int i3) {
        int iM26768n;
        if (this.f42256k != null && (iM26768n = HapticCompat.m26768n(i2)) != -1) {
            try {
                return (PlatformConstants.romHapticVersion < 1.2d || !f92222n7h) ? this.f42256k.performHapticFeedback(iM26768n, false, i3) : this.f42256k.performHapticFeedback(vibrationAttributes, iM26768n, false, i3);
            } catch (Exception e2) {
                Log.e(f92224toq, "Failed to perform haptic!", e2);
            }
        }
        return false;
    }

    @lrht("android.permission.VIBRATE")
    public void o1t(int i2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f42250h.execute(new RunnableC7378k(i2));
        } else {
            m26756h(i2);
        }
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: p */
    public boolean m26759p(int i2, boolean z2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return (f42254s && z2) ? hapticFeedbackUtil.performExtHapticFeedback(i2, true) : hapticFeedbackUtil.performExtHapticFeedback(i2);
        }
        return false;
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: q */
    public boolean m26760q(int i2, double d2) {
        return f7l8(i2, d2, f42252p);
    }

    @lrht("android.permission.VIBRATE")
    @hyr(33)
    public boolean qrj(VibrationAttributes vibrationAttributes, int i2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil == null) {
            return false;
        }
        try {
            return (PlatformConstants.romHapticVersion < 1.2d || !f92225x2) ? hapticFeedbackUtil.performExtHapticFeedback(i2) : hapticFeedbackUtil.performExtHapticFeedback(vibrationAttributes, i2);
        } catch (Exception e2) {
            Log.e(f92224toq, "Failed to perform ext haptic!", e2);
            return false;
        }
    }

    @lrht("android.permission.VIBRATE")
    @hyr(31)
    /* JADX INFO: renamed from: s */
    public boolean m26761s(int i2, int i3, boolean z2) {
        if (PlatformConstants.romHapticVersion < 1.1d) {
            return m26759p(i3, z2);
        }
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return hapticFeedbackUtil.performExtHapticFeedback(i2, i3, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m26762t() {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            if (f92221ld6) {
                hapticFeedbackUtil.stop();
            } else {
                hapticFeedbackUtil.release();
            }
        }
    }

    @lrht("android.permission.VIBRATE")
    public boolean t8r(int i2, int i3, boolean z2) {
        return fu4(null, i2, i3, z2);
    }

    public boolean toq(int i2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return f42255y ? hapticFeedbackUtil.isSupportExtHapticFeedback(i2) : i2 >= 0 && i2 <= 160;
        }
        return false;
    }

    @Deprecated
    public void wvg() {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            hapticFeedbackUtil.release();
        }
    }

    @lrht("android.permission.VIBRATE")
    public boolean x2(Uri uri, boolean z2) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return (f42255y && z2) ? hapticFeedbackUtil.performExtHapticFeedback(uri, true) : hapticFeedbackUtil.performExtHapticFeedback(uri);
        }
        return false;
    }

    @lrht("android.permission.VIBRATE")
    @hyr(31)
    /* JADX INFO: renamed from: y */
    public boolean m26763y(int i2, int i3) {
        HapticFeedbackUtil hapticFeedbackUtil = this.f42256k;
        if (hapticFeedbackUtil != null) {
            return PlatformConstants.romHapticVersion >= 1.1d ? hapticFeedbackUtil.performExtHapticFeedback(i2, i3) : hapticFeedbackUtil.performExtHapticFeedback(i3);
        }
        return false;
    }

    @lrht("android.permission.VIBRATE")
    /* JADX INFO: renamed from: z */
    public boolean m26764z(VibrationAttributes vibrationAttributes, int i2, boolean z2) {
        int iM26768n;
        if (this.f42256k == null || (iM26768n = HapticCompat.m26768n(i2)) == -1) {
            return false;
        }
        try {
            return (PlatformConstants.romHapticVersion < 1.2d || !f92223qrj) ? this.f42256k.performHapticFeedback(iM26768n, z2) : this.f42256k.performHapticFeedback(vibrationAttributes, iM26768n, z2);
        } catch (Exception e2) {
            Log.e(f92224toq, "Failed to perform haptic!", e2);
            return false;
        }
    }

    @lrht("android.permission.VIBRATE")
    public boolean zurt(VibrationAttributes vibrationAttributes, int i2, double d2, String str) {
        int iM26768n;
        if (this.f42256k == null || !f42249g || (iM26768n = HapticCompat.m26768n(i2)) == -1) {
            return false;
        }
        try {
            return (PlatformConstants.romHapticVersion < 1.2d || !f92220kja0) ? this.f42256k.performHapticFeedback(iM26768n, d2, str) : this.f42256k.performHapticFeedback(vibrationAttributes, iM26768n, d2, str);
        } catch (Exception e2) {
            Log.e(f92224toq, "Failed to perform haptic!", e2);
            return false;
        }
    }

    public toq(Context context) {
        this(context, true);
    }
}
