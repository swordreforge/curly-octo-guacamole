package com.android.thememanager.basemodule.utils;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.function.BiConsumer;
import miui.app.constants.ResourceBrowserConstants;
import miui.content.res.ThemeResources;

/* JADX INFO: compiled from: Workaround.java */
/* JADX INFO: loaded from: classes.dex */
public class ch {

    /* JADX INFO: renamed from: k */
    private static final String f10291k = "Workaround";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Boolean f57729toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57730zy = "RingtoneReset";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f7l8() {
        for (int i2 = 3; i2 < 14; i2++) {
            ld6.toq(1 << i2);
        }
    }

    @zy.hyr(29)
    /* JADX INFO: renamed from: g */
    private static boolean m7021g() {
        Boolean bool = f57729toq;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            PackageManager packageManager = bf2.toq.toq().getPackageManager();
            if (packageManager != null) {
                Bundle bundle = packageManager.getApplicationInfo("com.android.server.telecom", 128).metaData;
                if (bundle != null) {
                    f57729toq = Boolean.valueOf(bundle.getBoolean("telecom.supportPrivateRinger"));
                } else {
                    f57729toq = Boolean.FALSE;
                }
            } else {
                Log.w(f10291k, "supportTelephonyContentUri: Fail to getPackageManager");
            }
            Log.i(f10291k, "support: " + f57729toq);
            return f57729toq.booleanValue();
        } catch (Exception e2) {
            Log.e(f10291k, "SupportTelephonyContentUri: " + e2);
            return false;
        }
    }

    public static void ld6() {
        int iZy = miuix.os.f7l8.zy("ro.product.first_api_level", 0);
        if (Build.VERSION.SDK_INT != 33 || iZy >= 33) {
            return;
        }
        final HashMap map = new HashMap();
        map.put(1, "ringtone.mp3");
        map.put(2, "notification.mp3");
        map.put(4, "alarm.mp3");
        map.put(4096, "calendar.mp3");
        map.put(8192, "notes.mp3");
        map.put(8, "sms_delivered_sound.mp3");
        map.put(16, "sms_received_sound.mp3");
        map.put(64, "ringtone_slot_1.mp3");
        map.put(128, "ringtone_slot_2.mp3");
        map.put(1024, "sms_received_slot_1.mp3");
        map.put(2048, "sms_received_slot_2.mp3");
        map.put(256, "sms_delivered_slot_1.mp3");
        map.put(512, "sms_delivered_slot_2.mp3");
        C6002g.ld6().execute(new Runnable() { // from class: com.android.thememanager.basemodule.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                ch.m7026s(map);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m7023n() {
        if (Build.VERSION.SDK_INT != 33) {
            return;
        }
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.utils.x
            @Override // java.lang.Runnable
            public final void run() {
                ch.f7l8();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7024p(String pkg) {
        int iM7000y = a9.m7000y(bf2.toq.toq(), "com.android.contacts");
        Log.i(f10291k, "contactsVersion = " + iM7000y);
        return Build.VERSION.SDK_INT == 30 && "com.android.contacts".equals(pkg) && (!m7021g() || iM7000y < 366);
    }

    @zy.hyr(29)
    /* JADX INFO: renamed from: q */
    public static String m7025q(String originPath) {
        String str = (ResourceBrowserConstants.MIUI_PATH + C1788k.f10172h) + C1821p.ld6(originPath);
        Log.i(f10291k, "create File. " + C1821p.m7191y(str));
        try {
            Files.copy(Paths.get(originPath, new String[0]), Paths.get(str, new String[0]), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e2) {
            Log.e(f10291k, "copy fail " + e2);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m7026s(HashMap map) {
        SharedPreferences sharedPreferencesM4689q = androidx.preference.ki.m4689q(bf2.toq.toq());
        if (sharedPreferencesM4689q.getBoolean(f57730zy, false)) {
            Log.d(f10291k, "Ringtone has already reset when S to T.");
        } else {
            map.forEach(new BiConsumer() { // from class: com.android.thememanager.basemodule.utils.zp
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ch.m7027y((Integer) obj, (String) obj2);
                }
            });
            sharedPreferencesM4689q.edit().putBoolean(f57730zy, true).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7027y(Integer num, String str) {
        Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(bf2.toq.toq(), num.intValue());
        if (actualDefaultRingtoneUri == null || !actualDefaultRingtoneUri.toString().contains("com.android.thememanager")) {
            return;
        }
        String qVar = ek5k.toq(actualDefaultRingtoneUri);
        if (!new File(qVar).exists()) {
            for (String str2 : actualDefaultRingtoneUri.toString().split("/")) {
                if (!p029m.zy.toq(str2) && str2.contains(com.android.thememanager.basemodule.resource.constants.toq.pm14)) {
                    String strSubstring = str2.substring(0, str2.indexOf(com.android.thememanager.basemodule.resource.constants.toq.pm14) + 4);
                    try {
                        String strDecode = URLDecoder.decode(strSubstring.replaceAll("%(?![0-9a-fA-F]{2})", "%25").replaceAll("\\+", "%2B"), com.xiaomi.accountsdk.request.wvg.f72949toq);
                        String str3 = ThemeResources.THEME_MAGIC_PATH + "ringtones/" + str;
                        String str4 = C1788k.f10182r + strDecode;
                        if (!new File(str4).exists()) {
                            Log.d(f10291k, "copy = " + C1821p.m7183g(new File(str3), new File(str4)));
                        }
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    } catch (Exception e3) {
                        Log.e(f10291k, "resetRingtoneS2T: Url decode error: url=" + strSubstring, e3);
                    }
                }
            }
        }
        if (!new File(qVar).exists()) {
            Log.w(f10291k, "file not exist. path = " + qVar);
            return;
        }
        RingtoneManager.setActualDefaultRingtoneUri(bf2.toq.toq(), num.intValue(), actualDefaultRingtoneUri);
        Log.i(f10291k, "setActualDefaultRingtoneUri " + num + ", uri " + actualDefaultRingtoneUri);
    }
}
