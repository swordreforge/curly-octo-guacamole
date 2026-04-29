package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import zy.InterfaceC7830i;
import zy.InterfaceC7843t;

/* JADX INFO: compiled from: WindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ikck {

    /* JADX INFO: renamed from: k */
    public static final int f4035k = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50821toq = 9;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50822zy = 10;

    /* JADX INFO: renamed from: androidx.core.view.ikck$k */
    /* JADX INFO: compiled from: WindowCompat.java */
    @zy.hyr(16)
    static class C0692k {
        private C0692k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3316k(@zy.lvui Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    @zy.hyr(28)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static <T> T m3317k(Window window, int i2) {
            return (T) window.requireViewById(i2);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    @zy.hyr(30)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3318k(@zy.lvui Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    private ikck() {
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static sok m3315k(@zy.lvui Window window, @zy.lvui View view) {
        return new sok(window, view);
    }

    @zy.lvui
    public static <T extends View> T toq(@zy.lvui Window window, @InterfaceC7843t int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) toq.m3317k(window, i2);
        }
        T t2 = (T) window.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void zy(@zy.lvui Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            zy.m3318k(window, z2);
        } else {
            C0692k.m3316k(window, z2);
        }
    }
}
