package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;
import zy.InterfaceC7825c;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.os.k */
/* JADX INFO: compiled from: BuildCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0582k {

    /* JADX INFO: renamed from: androidx.core.os.k$k */
    /* JADX INFO: compiled from: BuildCompat.java */
    @InterfaceC7825c
    public @interface k {
    }

    private C0582k() {
    }

    @zy.ld6(api = 29)
    @Deprecated
    public static boolean f7l8() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @uv6({uv6.EnumC7844k.TESTS})
    /* JADX INFO: renamed from: g */
    protected static boolean m2725g(@lvui String str, @lvui String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @zy.ld6(api = 24)
    @Deprecated
    /* JADX INFO: renamed from: k */
    public static boolean m2726k() {
        return true;
    }

    @zy.ld6(api = 33, codename = "Tiramisu")
    @k
    public static boolean ld6() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 33 || (i2 >= 32 && m2725g("Tiramisu", Build.VERSION.CODENAME));
    }

    @zy.ld6(api = 28)
    @Deprecated
    /* JADX INFO: renamed from: n */
    public static boolean m2727n() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @zy.ld6(api = 32, codename = "Sv2")
    @k
    @Deprecated
    /* JADX INFO: renamed from: p */
    public static boolean m2728p() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 32 || (i2 >= 31 && m2725g("Sv2", Build.VERSION.CODENAME));
    }

    @zy.ld6(api = 27)
    @Deprecated
    /* JADX INFO: renamed from: q */
    public static boolean m2729q() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @zy.ld6(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static boolean m2730s() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 31 || (i2 >= 30 && m2725g("S", Build.VERSION.CODENAME));
    }

    @zy.ld6(api = 25)
    @Deprecated
    public static boolean toq() {
        return true;
    }

    @zy.ld6(codename = "UpsideDownCake")
    @k
    public static boolean x2() {
        return Build.VERSION.SDK_INT >= 33 && m2725g("UpsideDownCake", Build.VERSION.CODENAME);
    }

    @zy.ld6(api = 30)
    @Deprecated
    /* JADX INFO: renamed from: y */
    public static boolean m2731y() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @zy.ld6(api = 26)
    @Deprecated
    public static boolean zy() {
        return true;
    }
}
