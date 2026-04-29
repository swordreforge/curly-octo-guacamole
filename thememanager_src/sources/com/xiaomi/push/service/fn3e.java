package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.m28;
import com.xiaomi.push.vy;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fn3e {
    /* JADX INFO: renamed from: k */
    abstract vy m21610k(Context context, int i2, String str, Map<String, String> map);

    /* JADX INFO: renamed from: n */
    abstract boolean m21611n(Map<String, String> map, int i2, Notification notification);

    /* JADX INFO: renamed from: q */
    abstract boolean m21612q(Context context, int i2, String str, Map<String, String> map);

    abstract void toq(m28 m28Var, Map<String, String> map, int i2, Notification notification);

    abstract void zy(String str);
}
