package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.C5625q;
import com.xiaomi.clientreport.manager.C5627k;

/* JADX INFO: loaded from: classes3.dex */
public class e5 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile e5 f73316toq;

    /* JADX INFO: renamed from: k */
    private Context f32843k;

    private e5(Context context) {
        this.f32843k = context;
    }

    /* JADX INFO: renamed from: k */
    public static e5 m20763k(Context context) {
        if (f73316toq == null) {
            synchronized (e5.class) {
                if (f73316toq == null) {
                    f73316toq = new e5(context);
                }
            }
        }
        return f73316toq;
    }

    private void toq(C5625q c5625q) {
        if (c5625q instanceof com.xiaomi.clientreport.data.zy) {
            C5627k.m19323n(this.f32843k, (com.xiaomi.clientreport.data.zy) c5625q);
        } else if (c5625q instanceof com.xiaomi.clientreport.data.toq) {
            C5627k.m19324q(this.f32843k, (com.xiaomi.clientreport.data.toq) c5625q);
        }
    }

    public void f7l8(String str, String str2, String str3, int i2, String str4) {
        m20764g(str, str2, str3, i2, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: g */
    public void m20764g(String str, String str2, String str3, int i2, long j2, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        com.xiaomi.clientreport.data.toq toqVarM20889q = ga.m20889q(this.f32843k, str2, str3, i2, j2, str4);
        toqVarM20889q.toq(str);
        toqVarM20889q.zy(C5872k.f33107g);
        toq(toqVarM20889q);
    }

    /* JADX INFO: renamed from: n */
    public void m20765n(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        m20764g(str, ga.m20888p(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: p */
    public void m20766p(String str, String str2, String str3, String str4) {
        m20764g(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: q */
    public void m20767q(String str, Intent intent, int i2, String str2) {
        if (intent == null) {
            return;
        }
        m20764g(str, ga.m20888p(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i2, System.currentTimeMillis(), str2);
    }

    /* JADX INFO: renamed from: s */
    public void m20768s(String str, String str2, String str3, String str4) {
        m20764g(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* JADX INFO: renamed from: y */
    public void m20769y(String str, String str2, String str3, String str4) {
        m20764g(str, str2, str3, com.google.android.exoplayer2.yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED, System.currentTimeMillis(), str4);
    }

    public void zy(String str, int i2, long j2, long j3) {
        if (i2 < 0 || j3 < 0 || j2 <= 0) {
            return;
        }
        com.xiaomi.clientreport.data.zy zyVarF7l8 = ga.f7l8(this.f32843k, i2, j2, j3);
        zyVarF7l8.toq(str);
        zyVarF7l8.zy(C5872k.f33107g);
        toq(zyVarF7l8);
    }
}
