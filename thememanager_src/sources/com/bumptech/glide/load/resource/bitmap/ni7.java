package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.yz;

/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static volatile ni7 f62925cdj = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f62926f7l8 = "HardwareConfig";

    /* JADX INFO: renamed from: h */
    public static final int f18736h = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static volatile int f62927ki = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f62928kja0 = 20000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f62929ld6 = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f62930n7h = 700;

    /* JADX INFO: renamed from: p */
    @yz
    static final int f18737p = 128;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f62931qrj = 50;

    /* JADX INFO: renamed from: s */
    public static final boolean f18738s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final File f62932x2;

    /* JADX INFO: renamed from: y */
    public static final boolean f18739y;

    /* JADX INFO: renamed from: q */
    @zy.o1t("this")
    private int f18743q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f62933toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f62934zy;

    /* JADX INFO: renamed from: n */
    @zy.o1t("this")
    private boolean f18742n = true;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f18740g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final boolean f18741k = m10994y();

    static {
        f18739y = Build.VERSION.SDK_INT < 29;
        f18738s = true;
        f62932x2 = new File("/proc/self/fd");
        f62927ki = -1;
    }

    @yz
    ni7() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f62933toq = 20000;
            this.f62934zy = 0;
        } else {
            this.f62933toq = 700;
            this.f62934zy = 128;
        }
    }

    /* JADX INFO: renamed from: g */
    private synchronized boolean m10989g() {
        boolean z2 = true;
        int i2 = this.f18743q + 1;
        this.f18743q = i2;
        if (i2 >= 50) {
            this.f18743q = 0;
            int length = f62932x2.list().length;
            long jM10990n = m10990n();
            if (length >= jM10990n) {
                z2 = false;
            }
            this.f18742n = z2;
            if (!z2 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM10990n);
            }
        }
        return this.f18742n;
    }

    /* JADX INFO: renamed from: n */
    private int m10990n() {
        return f62927ki != -1 ? f62927ki : this.f62933toq;
    }

    /* JADX INFO: renamed from: p */
    private static boolean m10991p() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* JADX INFO: renamed from: q */
    public static ni7 m10992q() {
        if (f62925cdj == null) {
            synchronized (ni7.class) {
                if (f62925cdj == null) {
                    f62925cdj = new ni7();
                }
            }
        }
        return f62925cdj;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m10993s() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean toq() {
        return f18739y && !this.f18740g.get();
    }

    /* JADX INFO: renamed from: y */
    private static boolean m10994y() {
        return (m10993s() || m10991p()) ? false : true;
    }

    public boolean f7l8(int i2, int i3, boolean z2, boolean z3) {
        if (!z2) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f18741k) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f18738s) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (toq()) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z3) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i4 = this.f62934zy;
        if (i2 < i4) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i3 < i4) {
            if (Log.isLoggable(f62926f7l8, 2)) {
                Log.v(f62926f7l8, "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (m10989g()) {
            return true;
        }
        if (Log.isLoggable(f62926f7l8, 2)) {
            Log.v(f62926f7l8, "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m10995k() {
        com.bumptech.glide.util.kja0.toq();
        return !this.f18740g.get();
    }

    @TargetApi(26)
    boolean ld6(int i2, int i3, BitmapFactory.Options options, boolean z2, boolean z3) {
        boolean zF7l8 = f7l8(i2, i3, z2, z3);
        if (zF7l8) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF7l8;
    }

    public void x2() {
        com.bumptech.glide.util.kja0.toq();
        this.f18740g.set(true);
    }

    public void zy() {
        com.bumptech.glide.util.kja0.toq();
        this.f18740g.set(false);
    }
}
