package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class cr3 {

    /* JADX INFO: renamed from: q */
    private static volatile cr3 f32778q;

    /* JADX INFO: renamed from: k */
    private Context f32779k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Handler f73293toq = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Map<String, Map<String, String>> f73294zy = new HashMap();

    private cr3(Context context) {
        this.f32779k = context;
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m20695g(String str, String str2, String str3) {
        if (this.f73294zy == null) {
            this.f73294zy = new HashMap();
        }
        Map<String, String> map = this.f73294zy.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.f73294zy.put(str, map);
    }

    public static cr3 toq(Context context) {
        if (f32778q == null) {
            synchronized (cr3.class) {
                if (f32778q == null) {
                    f32778q = new cr3(context);
                }
            }
        }
        return f32778q;
    }

    private synchronized String zy(String str, String str2) {
        if (this.f73294zy != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.f73294zy.get(str);
                    if (map == null) {
                        return "";
                    }
                    return map.get(str2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m20697n(String str, String str2, String str3) {
        m20695g(str, str2, str3);
        this.f73293toq.post(new bf5(this, str, str2, str3));
    }

    /* JADX INFO: renamed from: q */
    public synchronized String m20698q(String str, String str2, String str3) {
        String strZy = zy(str, str2);
        if (!TextUtils.isEmpty(strZy)) {
            return strZy;
        }
        return this.f32779k.getSharedPreferences(str, 4).getString(str2, str3);
    }
}
