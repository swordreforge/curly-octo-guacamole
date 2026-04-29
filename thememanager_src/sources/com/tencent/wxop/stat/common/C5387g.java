package com.tencent.wxop.stat.common;

import android.content.Context;
import android.provider.Settings;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.g */
/* JADX INFO: loaded from: classes3.dex */
public class C5387g {

    /* JADX INFO: renamed from: c */
    private static volatile C5387g f30124c;

    /* JADX INFO: renamed from: a */
    private int f30125a = 10;

    /* JADX INFO: renamed from: b */
    private int f30126b;

    /* JADX INFO: renamed from: d */
    private Context f30127d;

    /* JADX INFO: renamed from: e */
    private boolean f30128e;

    private C5387g(Context context) {
        this.f30126b = 0;
        this.f30127d = null;
        this.f30128e = false;
        Context applicationContext = context.getApplicationContext();
        this.f30127d = applicationContext;
        try {
            boolean zM18467a = C5398r.m18467a(applicationContext, "android.permission.WRITE_SETTINGS");
            this.f30128e = zM18467a;
            if (zM18467a) {
                Method declaredMethod = Settings.System.class.getDeclaredMethod("canWrite", Context.class);
                declaredMethod.setAccessible(true);
                this.f30128e = ((Boolean) declaredMethod.invoke(null, this.f30127d)).booleanValue();
            }
        } catch (Throwable th) {
            int i2 = this.f30126b;
            this.f30126b = i2 + 1;
            if (i2 < this.f30125a) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5387g m18395a(Context context) {
        if (f30124c == null) {
            synchronized (C5387g.class) {
                if (f30124c == null) {
                    f30124c = new C5387g(context);
                }
            }
        }
        return f30124c;
    }

    /* JADX INFO: renamed from: a */
    public String m18396a(String str) {
        try {
            return Settings.System.getString(this.f30127d.getContentResolver(), str);
        } catch (Throwable th) {
            int i2 = this.f30126b;
            this.f30126b = i2 + 1;
            if (i2 >= this.f30125a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m18397a(String str, String str2) {
        if (!this.f30128e) {
            return false;
        }
        try {
            return Settings.System.putString(this.f30127d.getContentResolver(), str, str2);
        } catch (Throwable th) {
            int i2 = this.f30126b;
            this.f30126b = i2 + 1;
            if (i2 >= this.f30125a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }
}
