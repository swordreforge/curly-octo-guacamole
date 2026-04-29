package com.xiaomi.push.service;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class gvn7 {

    /* JADX INFO: renamed from: k */
    private static long f33787k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73612toq = "";

    /* JADX INFO: renamed from: k */
    public static String m21617k() {
        if (TextUtils.isEmpty(f73612toq)) {
            f73612toq = com.xiaomi.push.n5r1.m21302k(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f73612toq);
        long j2 = f33787k;
        f33787k = 1 + j2;
        sb.append(j2);
        return sb.toString();
    }

    public static String toq(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("Exception occurred when filtering registration packet id for log. " + e2);
            return "UnexpectedId";
        }
    }

    public static String zy() {
        return com.xiaomi.push.n5r1.m21302k(32);
    }
}
