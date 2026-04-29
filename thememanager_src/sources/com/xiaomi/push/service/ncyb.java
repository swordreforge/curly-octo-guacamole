package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import com.xiaomi.push.xouc;

/* JADX INFO: loaded from: classes3.dex */
public class ncyb {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static ncyb f73645zy;

    /* JADX INFO: renamed from: k */
    private Context f33861k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73646toq = 0;

    private ncyb(Context context) {
        this.f33861k = context.getApplicationContext();
    }

    public static ncyb zy(Context context) {
        if (f73645zy == null) {
            f73645zy = new ncyb(context);
        }
        return f73645zy;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: k */
    public int m21700k() {
        int i2 = this.f73646toq;
        if (i2 != 0) {
            return i2;
        }
        try {
            this.f73646toq = Settings.Global.getInt(this.f33861k.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f73646toq;
    }

    /* JADX INFO: renamed from: q */
    public boolean m21701q() {
        String str = xouc.f34180k;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains(miuix.core.util.x2.f87403zy);
    }

    @SuppressLint({"NewApi"})
    public Uri toq() {
        return Settings.Global.getUriFor("device_provisioned");
    }
}
