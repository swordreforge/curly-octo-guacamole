package com.xiaomi.settingsdk.backup.data;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.settingsdk.backup.data.k */
/* JADX INFO: compiled from: PrefsBackupHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5975k {

    /* JADX INFO: renamed from: k */
    private static final String f34363k = "PrefsBackupHelper";

    /* JADX INFO: renamed from: com.xiaomi.settingsdk.backup.data.k$k */
    /* JADX INFO: compiled from: PrefsBackupHelper.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private String f34364k;

        /* JADX INFO: renamed from: q */
        private Object f34365q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73781toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Class<?> f73782zy;

        private k(String str, String str2, Class<?> cls, Object obj) {
            this.f34364k = str;
            this.f73781toq = str2;
            this.f73782zy = cls;
            this.f34365q = obj;
        }

        public static k f7l8(String str, String str2) {
            return new k(str, str2, String.class, null);
        }

        /* JADX INFO: renamed from: g */
        public static k m22215g(String str, String str2, long j2) {
            return new k(str, str2, Long.class, Long.valueOf(j2));
        }

        /* JADX INFO: renamed from: k */
        public static k m22216k(String str, String str2) {
            return new k(str, str2, Boolean.class, null);
        }

        /* JADX INFO: renamed from: n */
        public static k m22217n(String str, String str2) {
            return new k(str, str2, Long.class, null);
        }

        /* JADX INFO: renamed from: q */
        public static k m22218q(String str, String str2, int i2) {
            return new k(str, str2, Integer.class, Integer.valueOf(i2));
        }

        public static k toq(String str, String str2, boolean z2) {
            return new k(str, str2, Boolean.class, Boolean.valueOf(z2));
        }

        /* JADX INFO: renamed from: y */
        public static k m22219y(String str, String str2, String str3) {
            return new k(str, str2, String.class, str3);
        }

        public static k zy(String str, String str2) {
            return new k(str, str2, Integer.class, null);
        }

        public String ld6() {
            return this.f73781toq;
        }

        /* JADX INFO: renamed from: p */
        public Object m22220p() {
            return this.f34365q;
        }

        /* JADX INFO: renamed from: s */
        public String m22221s() {
            return this.f34364k;
        }

        public Class<?> x2() {
            return this.f73782zy;
        }
    }

    private C5975k() {
    }

    /* JADX INFO: renamed from: k */
    public static void m22214k(SharedPreferences sharedPreferences, DataPackage dataPackage, k[] kVarArr) {
        Map<String, ?> all = sharedPreferences.getAll();
        for (k kVar : kVarArr) {
            Object obj = all.get(kVar.ld6());
            if (obj != null) {
                if (obj.getClass() != kVar.x2()) {
                    throw new IllegalStateException("Preference type of " + kVar.ld6() + " mismatched. actual type = " + obj.getClass().getSimpleName() + ", expected type = " + kVar.x2().getSimpleName());
                }
                dataPackage.f7l8(kVar.m22221s(), obj.toString());
            } else if (kVar.m22220p() != null) {
                dataPackage.f7l8(kVar.m22221s(), kVar.m22220p().toString());
            }
        }
    }

    public static void toq(SharedPreferences sharedPreferences, DataPackage dataPackage, k[] kVarArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (k kVar : kVarArr) {
            try {
                KeyStringSettingItem keyStringSettingItem = (KeyStringSettingItem) dataPackage.ld6(kVar.m22221s());
                if (keyStringSettingItem != null) {
                    String value = keyStringSettingItem.getValue();
                    if (kVar.x2() == Integer.class) {
                        editorEdit.putInt(kVar.ld6(), Integer.parseInt(value));
                    } else if (kVar.x2() == Long.class) {
                        editorEdit.putLong(kVar.ld6(), Long.parseLong(value));
                    } else if (kVar.x2() == Boolean.class) {
                        editorEdit.putBoolean(kVar.ld6(), Boolean.parseBoolean(value));
                    } else if (kVar.x2() == String.class) {
                        editorEdit.putString(kVar.ld6(), value);
                    }
                } else {
                    editorEdit.remove(kVar.ld6());
                }
            } catch (ClassCastException unused) {
                Log.e(f34363k, "entry " + kVar.m22221s() + " is not KeyStringSettingItem");
            }
        }
        editorEdit.commit();
    }
}
