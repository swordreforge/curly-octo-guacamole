package com.xiaomi.onetrack.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.UserManager;
import android.os.storage.StorageManager;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.j */
/* JADX INFO: loaded from: classes3.dex */
public class C5777j {

    /* JADX INFO: renamed from: a */
    private static final String f32311a = "FbeUtil";

    private C5777j() {
    }

    /* JADX INFO: renamed from: a */
    public static Context m20257a(Context context) {
        if (m20263e(context)) {
            C5804p.m20342a(f32311a, "getSafeContext return origin ctx");
            return context;
        }
        C5804p.m20342a(f32311a, "getSafeContext , create the safe ctx");
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20260b(Context context) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (!m20259a() || keyguardManager == null) {
                return false;
            }
            return keyguardManager.isKeyguardSecure();
        } catch (Exception e2) {
            C5804p.m20342a(f32311a, "FBEDeviceAndSetedUpScreenLock Exception: " + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20261c(Context context) {
        return m20260b(context) && !m20263e(context);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20262d(Context context) {
        return !m20263e(context);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m20263e(Context context) {
        try {
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                return userManager.isUserUnlocked();
            }
            return false;
        } catch (Exception e2) {
            C5804p.m20342a(f32311a, "isUserUnlocked Exception: " + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m20264f(Context context) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20259a() {
        try {
            return ((Boolean) StorageManager.class.getDeclaredMethod("isFileEncryptedNativeOrEmulated", new Class[0]).invoke(null, new Object[0]).getClass().getDeclaredMethod("isFileEncryptedNativeOrEmulated", Boolean.TYPE).invoke(null, new Object[0])).booleanValue();
        } catch (Exception e2) {
            C5804p.m20347b(f32311a, "*** " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20258a(PreferenceManager preferenceManager) {
        preferenceManager.setStorageDeviceProtected();
    }
}
