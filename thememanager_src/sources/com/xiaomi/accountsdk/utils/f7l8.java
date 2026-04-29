package com.xiaomi.accountsdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: ActivityExportSafetyGuardian.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final f7l8 f31017k = new f7l8();

    /* JADX INFO: renamed from: q */
    private static final String f31018q = "PassportNotificationGuardian";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72959toq = "UUID";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72960zy = "UUID_";

    /* JADX INFO: renamed from: q */
    private String m19068q(String str) {
        return f72960zy + str;
    }

    public static f7l8 toq() {
        return f31017k;
    }

    private SharedPreferences zy(Context context) {
        return context.getSharedPreferences(f31018q, 0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m19069k(Context context, Intent intent) {
        if (context != null && intent != null) {
            String stringExtra = intent.getStringExtra(f72959toq);
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            SharedPreferences sharedPreferencesZy = zy(context);
            String strM19068q = m19068q(stringExtra);
            if (sharedPreferencesZy.getBoolean(strM19068q, false)) {
                sharedPreferencesZy.edit().remove(strM19068q).commit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m19070n(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String string = UUID.randomUUID().toString();
        intent.putExtra(f72959toq, string);
        zy(context).edit().putBoolean(m19068q(string), true).commit();
    }
}
