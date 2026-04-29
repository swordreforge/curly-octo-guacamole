package miuix.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: renamed from: miuix.provider.k */
/* JADX INFO: compiled from: ExtraSettings.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7317k {

    /* JADX INFO: renamed from: miuix.provider.k$k */
    /* JADX INFO: compiled from: ExtraSettings.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        public static final String f41535k = "privacy_mode_enabled";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f90032toq = "upload_log_pref";

        protected k() throws InstantiationException {
            throw new InstantiationException("Cannot instantiate utility class");
        }

        public static long f7l8(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.Secure.getLong(contentResolver, str);
        }

        /* JADX INFO: renamed from: g */
        public static int m26504g(ContentResolver contentResolver, String str, int i2) {
            return Settings.Secure.getInt(contentResolver, str, i2);
        }

        /* JADX INFO: renamed from: h */
        public static boolean m26505h(ContentResolver contentResolver, String str, String str2) {
            return Settings.Secure.putString(contentResolver, str, str2);
        }

        /* JADX INFO: renamed from: k */
        public static boolean m26506k(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return m26507n(contentResolver, str) != 0;
        }

        public static boolean kja0(ContentResolver contentResolver, String str, long j2) {
            return Settings.Secure.putLong(contentResolver, str, j2);
        }

        public static Uri ld6(String str) {
            return Settings.Secure.getUriFor(str);
        }

        /* JADX INFO: renamed from: n */
        public static int m26507n(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.Secure.getInt(contentResolver, str);
        }

        public static boolean n7h(ContentResolver contentResolver, String str, int i2) {
            return Settings.Secure.putInt(contentResolver, str, i2);
        }

        /* JADX INFO: renamed from: p */
        public static String m26508p(ContentResolver contentResolver, String str, String str2) {
            String string = Settings.Secure.getString(contentResolver, str);
            return string == null ? str2 : string;
        }

        /* JADX INFO: renamed from: q */
        public static float m26509q(ContentResolver contentResolver, String str, float f2) {
            return Settings.Secure.getFloat(contentResolver, str, f2);
        }

        public static boolean qrj(ContentResolver contentResolver, String str, float f2) {
            return Settings.Secure.putFloat(contentResolver, str, f2);
        }

        /* JADX INFO: renamed from: s */
        public static String m26510s(ContentResolver contentResolver, String str) {
            return Settings.Secure.getString(contentResolver, str);
        }

        public static boolean toq(ContentResolver contentResolver, String str, boolean z2) {
            return m26504g(contentResolver, str, z2 ? 1 : 0) != 0;
        }

        public static boolean x2(ContentResolver contentResolver, String str, boolean z2) {
            return n7h(contentResolver, str, z2 ? 1 : 0);
        }

        /* JADX INFO: renamed from: y */
        public static long m26511y(ContentResolver contentResolver, String str, long j2) {
            return Settings.Secure.getLong(contentResolver, str, j2);
        }

        public static float zy(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.Secure.getFloat(contentResolver, str);
        }
    }

    /* JADX INFO: renamed from: miuix.provider.k$toq */
    /* JADX INFO: compiled from: ExtraSettings.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public static final String f41536k = "default_alarm_alert";

        protected toq() throws InstantiationException {
            throw new InstantiationException("Cannot instantiate utility class");
        }

        public static long f7l8(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.System.getLong(contentResolver, str);
        }

        /* JADX INFO: renamed from: g */
        public static int m26512g(ContentResolver contentResolver, String str, int i2) {
            return Settings.System.getInt(contentResolver, str, i2);
        }

        /* JADX INFO: renamed from: h */
        public static boolean m26513h(ContentResolver contentResolver, String str, String str2) {
            return Settings.System.putString(contentResolver, str, str2);
        }

        /* JADX INFO: renamed from: k */
        public static boolean m26514k(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return m26515n(contentResolver, str) != 0;
        }

        public static boolean kja0(ContentResolver contentResolver, String str, long j2) {
            return Settings.System.putLong(contentResolver, str, j2);
        }

        public static Uri ld6(String str) {
            return Settings.System.getUriFor(str);
        }

        /* JADX INFO: renamed from: n */
        public static int m26515n(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.System.getInt(contentResolver, str);
        }

        public static boolean n7h(ContentResolver contentResolver, String str, int i2) {
            return Settings.System.putInt(contentResolver, str, i2);
        }

        /* JADX INFO: renamed from: p */
        public static String m26516p(ContentResolver contentResolver, String str, String str2) {
            String string = Settings.System.getString(contentResolver, str);
            return string == null ? str2 : string;
        }

        /* JADX INFO: renamed from: q */
        public static float m26517q(ContentResolver contentResolver, String str, float f2) {
            return Settings.System.getFloat(contentResolver, str, f2);
        }

        public static boolean qrj(ContentResolver contentResolver, String str, float f2) {
            return Settings.System.putFloat(contentResolver, str, f2);
        }

        /* JADX INFO: renamed from: s */
        public static String m26518s(ContentResolver contentResolver, String str) {
            return Settings.System.getString(contentResolver, str);
        }

        public static boolean toq(ContentResolver contentResolver, String str, boolean z2) {
            return m26512g(contentResolver, str, z2 ? 1 : 0) != 0;
        }

        public static boolean x2(ContentResolver contentResolver, String str, boolean z2) {
            return n7h(contentResolver, str, z2 ? 1 : 0);
        }

        /* JADX INFO: renamed from: y */
        public static long m26519y(ContentResolver contentResolver, String str, long j2) {
            return Settings.System.getLong(contentResolver, str, j2);
        }

        public static float zy(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
            return Settings.System.getFloat(contentResolver, str);
        }
    }

    protected C7317k() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }
}
