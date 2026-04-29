package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.text.n */
/* JADX INFO: compiled from: ICUCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0617n {

    /* JADX INFO: renamed from: k */
    private static final String f3827k = "ICUCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50595toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Method f50596zy;

    /* JADX INFO: renamed from: androidx.core.text.n$k */
    /* JADX INFO: compiled from: ICUCompat.java */
    @hyr(21)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2879k(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.n$toq */
    /* JADX INFO: compiled from: ICUCompat.java */
    @hyr(24)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ULocale m2880k(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @InterfaceC7830i
        static ULocale toq(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @InterfaceC7830i
        static String zy(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private C0617n() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: k */
    private static String m2878k(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f50596zy;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e2) {
            Log.w(f3827k, e2);
        } catch (InvocationTargetException e3) {
            Log.w(f3827k, e3);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String toq(String str) {
        try {
            Method method = f50595toq;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e2) {
            Log.w(f3827k, e2);
        } catch (InvocationTargetException e3) {
            Log.w(f3827k, e3);
        }
        return null;
    }

    @dd
    public static String zy(@lvui Locale locale) {
        return toq.zy(toq.m2880k(toq.toq(locale)));
    }
}
