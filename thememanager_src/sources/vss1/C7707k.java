package vss1;

import android.app.Activity;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import miuix.recyclerview.widget.RecyclerView;
import zy.hyr;

/* JADX INFO: renamed from: vss1.k */
/* JADX INFO: compiled from: GetSpeedForDynamicRefreshRate.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(api = 30)
public class C7707k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f95593cdj = 3;

    /* JADX INFO: renamed from: h */
    private static int f44708h = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static int[] f95594kja0 = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static int[] f95595n7h = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static boolean f95596qrj = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f95597x2 = "DynamicRefreshRate recy";

    /* JADX INFO: renamed from: k */
    private final boolean f44710k;

    /* JADX INFO: renamed from: q */
    private final Window f44713q;

    /* JADX INFO: renamed from: y */
    private int f44715y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Display f95601zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile boolean f95600toq = false;

    /* JADX INFO: renamed from: n */
    private boolean f44711n = false;

    /* JADX INFO: renamed from: g */
    private int f44709g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f95598f7l8 = -1;

    /* JADX INFO: renamed from: s */
    private long f44714s = 0;

    /* JADX INFO: renamed from: p */
    private boolean f44712p = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f95599ld6 = 0;

    public C7707k(RecyclerView recyclerView) {
        Display display = recyclerView.getContext() instanceof Activity ? recyclerView.getContext().getDisplay() : null;
        this.f95601zy = display;
        Window window = recyclerView.getContext() instanceof Activity ? ((Activity) recyclerView.getContext()).getWindow() : null;
        this.f44713q = window;
        boolean z2 = (!zy() || display == null || window == null) ? false : true;
        this.f44710k = z2;
        if (z2) {
            this.f44715y = f95595n7h[0];
        } else {
            Log.e(f95597x2, "dynamic is not enable");
        }
    }

    /* JADX INFO: renamed from: g */
    private void m28114g(int i2, boolean z2) {
        Display.Mode[] supportedModes = this.f95601zy.getSupportedModes();
        WindowManager.LayoutParams attributes = this.f44713q.getAttributes();
        int i3 = attributes.preferredDisplayModeId;
        try {
            if (i3 <= supportedModes.length && i3 >= 0) {
                if (z2 || i3 == 0 || Math.abs(supportedModes[i3 - 1].getRefreshRate() - i2) >= 1.0f) {
                    for (Display.Mode mode : supportedModes) {
                        if (Math.abs(mode.getRefreshRate() - i2) <= 1.0f) {
                            if (z2 || i3 == 0 || hashCode() == f44708h || mode.getRefreshRate() > supportedModes[i3 - 1].getRefreshRate()) {
                                f44708h = hashCode();
                                Log.e(f95597x2, f44708h + " set Refresh rate to: " + i2 + ", mode is: " + mode.getModeId());
                                attributes.preferredDisplayModeId = mode.getModeId();
                                this.f44713q.setAttributes(attributes);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            Log.e(f95597x2, "out of bound exception! mode length " + supportedModes.length + ", mode id " + i3);
        }
    }

    /* JADX INFO: renamed from: k */
    private int m28115k(int i2) {
        int i3 = f95595n7h[r0.length - 1];
        if (!this.f44711n || this.f44712p) {
            return -1;
        }
        if (i2 == 0) {
            return i3;
        }
        if (this.f44709g == 0) {
            this.f44714s = 0L;
            this.f95598f7l8 = System.currentTimeMillis();
        }
        int i4 = this.f44709g + 1;
        this.f44709g = i4;
        this.f44714s += (long) i2;
        if (i4 < 3) {
            return -1;
        }
        int iAbs = Math.abs(Math.round(this.f44714s / ((System.currentTimeMillis() - this.f95598f7l8) / 1000.0f)));
        this.f44709g = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = f95594kja0;
            if (i5 >= iArr.length) {
                break;
            }
            if (iAbs > iArr[i5]) {
                i3 = f95595n7h[i5];
                break;
            }
            i5++;
        }
        int i6 = this.f44715y;
        if (i3 >= i6) {
            int[] iArr2 = f95595n7h;
            if (i6 != iArr2[iArr2.length - 1] || i3 != iArr2[0]) {
                return -1;
            }
        }
        this.f44715y = i3;
        return i3;
    }

    private static boolean zy() {
        boolean z2 = false;
        if (f95596qrj) {
            return (f95595n7h == null || f95594kja0 == null) ? false : true;
        }
        try {
            try {
                String str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.vendor.display.dynamic_refresh_rate");
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("dynamic params is ");
                    sb.append((f95595n7h == null || f95594kja0 == null) ? false : true);
                    Log.e(f95597x2, sb.toString());
                    f95596qrj = true;
                    return false;
                }
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("dynamic params is ");
                    sb2.append((f95595n7h == null || f95594kja0 == null) ? false : true);
                    Log.e(f95597x2, sb2.toString());
                    f95596qrj = true;
                    return false;
                }
                String[] strArrSplit2 = strArrSplit[0].split(",");
                String[] strArrSplit3 = strArrSplit[1].split(",");
                if (strArrSplit3.length != strArrSplit2.length - 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("dynamic params is ");
                    sb3.append((f95595n7h == null || f95594kja0 == null) ? false : true);
                    Log.e(f95597x2, sb3.toString());
                    f95596qrj = true;
                    return false;
                }
                f95595n7h = new int[strArrSplit2.length];
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    f95595n7h[i2] = Integer.parseInt(strArrSplit2[i2]);
                }
                f95594kja0 = new int[strArrSplit3.length];
                for (int i3 = 0; i3 < strArrSplit3.length; i3++) {
                    f95594kja0[i3] = Integer.parseInt(strArrSplit3[i3]);
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("dynamic params is ");
                sb4.append((f95595n7h == null || f95594kja0 == null) ? false : true);
                Log.e(f95597x2, sb4.toString());
                f95596qrj = true;
                f95595n7h = null;
                f95594kja0 = null;
                return false;
            }
        } finally {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("dynamic params is ");
            if (f95595n7h != null) {
                z2 = true;
            }
            sb5.append(z2);
            Log.e(f95597x2, sb5.toString());
            f95596qrj = true;
        }
        StringBuilder sb52 = new StringBuilder();
        sb52.append("dynamic params is ");
        if (f95595n7h != null && f95594kja0 != null) {
            z2 = true;
        }
        sb52.append(z2);
        Log.e(f95597x2, sb52.toString());
        f95596qrj = true;
    }

    public void f7l8(MotionEvent motionEvent) {
        if (this.f44710k) {
            if (motionEvent.getActionMasked() != 0) {
                if (motionEvent.getActionMasked() == 1) {
                    this.f95600toq = false;
                    return;
                }
                return;
            }
            this.f95600toq = true;
            int i2 = f95595n7h[0];
            this.f44715y = i2;
            this.f44709g = 0;
            m28114g(i2, true);
            this.f44711n = true;
            this.f44712p = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m28116n(RecyclerView recyclerView, int i2) {
        if (this.f44710k) {
            if (this.f44712p || this.f95600toq || this.f95599ld6 != 2) {
                this.f95599ld6 = i2;
                return;
            }
            this.f95599ld6 = i2;
            if ((recyclerView.canScrollVertically(-1) && recyclerView.canScrollVertically(1)) || (recyclerView.canScrollHorizontally(-1) && recyclerView.canScrollVertically(1))) {
                int[] iArr = f95595n7h;
                m28114g(iArr[iArr.length - 1], false);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m28117q(boolean z2) {
        if (this.f44710k) {
            this.f44711n = z2;
            this.f44712p = true;
            m28114g(f95595n7h[0], false);
        }
    }

    public void toq(int i2, int i3) {
        int iM28115k;
        if (this.f44710k) {
            if ((i2 == 0 && i3 == 0) || this.f95600toq || (iM28115k = m28115k(Math.max(Math.abs(i2), Math.abs(i3)))) == -1) {
                return;
            }
            m28114g(iM28115k, false);
        }
    }
}
