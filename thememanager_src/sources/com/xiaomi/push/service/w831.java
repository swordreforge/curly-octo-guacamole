package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.y3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w831 {

    /* JADX INFO: renamed from: k */
    private static final Map<String, byte[]> f33923k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f73674toq = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public static void m21774g(String str, byte[] bArr) {
        synchronized (f73674toq) {
            f73674toq.add(new Pair<>(str, bArr));
            if (f73674toq.size() > 50) {
                f73674toq.remove(0);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21775k(Context context, int i2, String str) {
        Map<String, byte[]> map = f33923k;
        synchronized (map) {
            for (String str2 : map.keySet()) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("notify registration error. " + str2);
                toq(context, str2, f33923k.get(str2), i2, str);
            }
            f33923k.clear();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m21776n(String str, byte[] bArr) {
        Map<String, byte[]> map = f33923k;
        synchronized (map) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m21777q(XMPushService xMPushService, boolean z2) {
        try {
            Map<String, byte[]> map = f33923k;
            synchronized (map) {
                for (String str : map.keySet()) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("processing pending registration request. " + str);
                    x2.x2(xMPushService, str, f33923k.get(str));
                    if (z2 && !y3.zy()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f33923k.clear();
            }
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("fail to deal with pending register request. " + e2);
            xMPushService.m21527a(10, e2);
        }
    }

    public static void toq(Context context, String str, byte[] bArr, int i2, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i2);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, x2.f7l8(str));
    }

    public static void zy(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f73674toq) {
                arrayList = f73674toq;
                f73674toq = new ArrayList<>();
            }
            boolean zZy = y3.zy();
            for (Pair<String, byte[]> pair : arrayList) {
                x2.x2(xMPushService, (String) pair.first, (byte[]) pair.second);
                if (!zZy) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (ovdh e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("meet error when process pending message. " + e2);
            xMPushService.m21527a(10, e2);
        }
    }
}
