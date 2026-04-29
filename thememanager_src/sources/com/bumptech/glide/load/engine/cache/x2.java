package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.android.thememanager.clockmessage.model.C1873k;
import zy.yz;

/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f62739f7l8 = 2;

    /* JADX INFO: renamed from: g */
    @yz
    static final int f18310g = 4;

    /* JADX INFO: renamed from: n */
    private static final String f18311n = "MemorySizeCalculator";

    /* JADX INFO: renamed from: k */
    private final int f18312k;

    /* JADX INFO: renamed from: q */
    private final int f18313q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f62740toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Context f62741zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.x2$k */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class C3023k {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        static final float f62742ld6 = 0.4f;

        /* JADX INFO: renamed from: p */
        static final int f18314p = 1;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        static final int f62743qrj = 4194304;

        /* JADX INFO: renamed from: s */
        @yz
        static final int f18315s = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        static final float f62744x2 = 0.33f;

        /* JADX INFO: renamed from: k */
        final Context f18317k;

        /* JADX INFO: renamed from: n */
        float f18318n;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ActivityManager f62746toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        zy f62747zy;

        /* JADX INFO: renamed from: q */
        float f18319q = 2.0f;

        /* JADX INFO: renamed from: g */
        float f18316g = f62742ld6;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        float f62745f7l8 = f62744x2;

        /* JADX INFO: renamed from: y */
        int f18320y = 4194304;

        public C3023k(Context context) {
            this.f18318n = f18314p;
            this.f18317k = context;
            this.f62746toq = (ActivityManager) context.getSystemService(C1873k.f10652g);
            this.f62747zy = new toq(context.getResources().getDisplayMetrics());
            if (x2.m10726n(this.f62746toq)) {
                this.f18318n = 0.0f;
            }
        }

        public C3023k f7l8(float f2) {
            com.bumptech.glide.util.qrj.m11260k(f2 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f18319q = f2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3023k m10729g(float f2) {
            com.bumptech.glide.util.qrj.m11260k(f2 >= 0.0f && f2 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f18316g = f2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public x2 m10730k() {
            return new x2(this);
        }

        /* JADX INFO: renamed from: n */
        public C3023k m10731n(float f2) {
            com.bumptech.glide.util.qrj.m11260k(f2 >= 0.0f && f2 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f62745f7l8 = f2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3023k m10732q(float f2) {
            com.bumptech.glide.util.qrj.m11260k(f2 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f18318n = f2;
            return this;
        }

        @yz
        C3023k toq(ActivityManager activityManager) {
            this.f62746toq = activityManager;
            return this;
        }

        @yz
        /* JADX INFO: renamed from: y */
        C3023k m10733y(zy zyVar) {
            this.f62747zy = zyVar;
            return this;
        }

        public C3023k zy(int i2) {
            this.f18320y = i2;
            return this;
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    private static final class toq implements zy {

        /* JADX INFO: renamed from: k */
        private final DisplayMetrics f18321k;

        toq(DisplayMetrics displayMetrics) {
            this.f18321k = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.x2.zy
        /* JADX INFO: renamed from: k */
        public int mo10734k() {
            return this.f18321k.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.x2.zy
        public int toq() {
            return this.f18321k.widthPixels;
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    interface zy {
        /* JADX INFO: renamed from: k */
        int mo10734k();

        int toq();
    }

    x2(C3023k c3023k) {
        this.f62741zy = c3023k.f18317k;
        int i2 = m10726n(c3023k.f62746toq) ? c3023k.f18320y / 2 : c3023k.f18320y;
        this.f18313q = i2;
        int iZy = zy(c3023k.f62746toq, c3023k.f18316g, c3023k.f62745f7l8);
        float qVar = c3023k.f62747zy.toq() * c3023k.f62747zy.mo10734k() * 4;
        int iRound = Math.round(c3023k.f18318n * qVar);
        int iRound2 = Math.round(qVar * c3023k.f18319q);
        int i3 = iZy - i2;
        int i4 = iRound2 + iRound;
        if (i4 <= i3) {
            this.f62740toq = iRound2;
            this.f18312k = iRound;
        } else {
            float f2 = i3;
            float f3 = c3023k.f18318n;
            float f4 = c3023k.f18319q;
            float f5 = f2 / (f3 + f4);
            this.f62740toq = Math.round(f4 * f5);
            this.f18312k = Math.round(f5 * c3023k.f18318n);
        }
        if (Log.isLoggable(f18311n, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m10725g(this.f62740toq));
            sb.append(", pool size: ");
            sb.append(m10725g(this.f18312k));
            sb.append(", byte array size: ");
            sb.append(m10725g(i2));
            sb.append(", memory class limited? ");
            sb.append(i4 > iZy);
            sb.append(", max size: ");
            sb.append(m10725g(iZy));
            sb.append(", memoryClass: ");
            sb.append(c3023k.f62746toq.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m10726n(c3023k.f62746toq));
            Log.d(f18311n, sb.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    private String m10725g(int i2) {
        return Formatter.formatFileSize(this.f62741zy, i2);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: n */
    static boolean m10726n(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private static int zy(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m10726n(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    /* JADX INFO: renamed from: k */
    public int m10727k() {
        return this.f18313q;
    }

    /* JADX INFO: renamed from: q */
    public int m10728q() {
        return this.f62740toq;
    }

    public int toq() {
        return this.f18312k;
    }
}
