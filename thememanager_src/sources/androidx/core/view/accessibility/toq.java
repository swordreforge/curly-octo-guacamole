package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AccessibilityEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50732cdj = 8388608;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @Deprecated
    public static final int f50733f7l8 = 8192;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50734fn3e = 2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f50735fu4 = 16;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f3958g = 4096;

    /* JADX INFO: renamed from: h */
    public static final int f3959h = 4194304;

    /* JADX INFO: renamed from: i */
    public static final int f3960i = 1;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final int f3961k = 128;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50736ki = 16777216;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50737kja0 = 2097152;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50738ld6 = 131072;

    /* JADX INFO: renamed from: n */
    @Deprecated
    public static final int f3962n = 2048;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50739n7h = 1048576;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50740ni7 = 8;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f50741o1t = 64;

    /* JADX INFO: renamed from: p */
    public static final int f3963p = 65536;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f3964q = 1024;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50742qrj = 524288;

    /* JADX INFO: renamed from: s */
    public static final int f3965s = 32768;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50743t8r = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final int f50744toq = 256;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f50745wvg = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50746x2 = 262144;

    /* JADX INFO: renamed from: y */
    public static final int f3966y = 16384;

    /* JADX INFO: renamed from: z */
    public static final int f3967z = 32;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f50747zurt = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final int f50748zy = 512;

    /* JADX INFO: renamed from: androidx.core.view.accessibility.toq$k */
    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @hyr(16)
    static class C0664k {
        private C0664k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3097k(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3098q(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setMovementGranularity(i2);
        }

        @InterfaceC7830i
        static int toq(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @InterfaceC7830i
        static void zy(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setAction(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @hyr(19)
    static class C7871toq {
        private C7871toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3099k(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @InterfaceC7830i
        static void toq(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    private toq() {
    }

    @Deprecated
    public static int f7l8(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static C0654i m3090g(AccessibilityEvent accessibilityEvent, int i2) {
        return new C0654i(accessibilityEvent.getRecord(i2));
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m3091k(AccessibilityEvent accessibilityEvent, C0654i c0654i) {
        accessibilityEvent.appendRecord((AccessibilityRecord) c0654i.f7l8());
    }

    /* JADX INFO: renamed from: n */
    public static int m3092n(@lvui AccessibilityEvent accessibilityEvent) {
        return C0664k.toq(accessibilityEvent);
    }

    /* JADX INFO: renamed from: p */
    public static void m3093p(@lvui AccessibilityEvent accessibilityEvent, int i2) {
        C0664k.m3098q(accessibilityEvent, i2);
    }

    /* JADX INFO: renamed from: q */
    public static int m3094q(@lvui AccessibilityEvent accessibilityEvent) {
        return C7871toq.m3099k(accessibilityEvent);
    }

    /* JADX INFO: renamed from: s */
    public static void m3095s(@lvui AccessibilityEvent accessibilityEvent, int i2) {
        C7871toq.toq(accessibilityEvent, i2);
    }

    @Deprecated
    public static C0654i toq(AccessibilityEvent accessibilityEvent) {
        return new C0654i(accessibilityEvent);
    }

    /* JADX INFO: renamed from: y */
    public static void m3096y(@lvui AccessibilityEvent accessibilityEvent, int i2) {
        C0664k.zy(accessibilityEvent, i2);
    }

    public static int zy(@lvui AccessibilityEvent accessibilityEvent) {
        return C0664k.m3097k(accessibilityEvent);
    }
}
