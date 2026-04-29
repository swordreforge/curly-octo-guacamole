package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.push.b7;
import com.xiaomi.push.erbd;
import com.xiaomi.push.f26p;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.kq;
import com.xiaomi.push.qla;
import com.xiaomi.push.wu;
import gyi.C6068k;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class ek5k {

    /* JADX INFO: renamed from: k */
    private static AtomicLong f33756k = new AtomicLong(0);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static SimpleDateFormat f73590toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f73591zy;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f73590toq = simpleDateFormat;
        f73591zy = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m21577g(String str) {
        return !wu.m21971s() || C5658n.f31405i.equals(str);
    }

    /* JADX INFO: renamed from: k */
    private static erbd m21578k(String str, String str2, b7 b7Var) {
        return new erbd(C6068k.f35060p, false).m20803d(str).m20795b(str2).m20786a(f26p.m20833y(qla.m21397g(b7Var))).m20799c(kq.UploadTinyData.f33227a);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21579n(kl7m kl7mVar, boolean z2) {
        if (kl7mVar == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z2 && TextUtils.isEmpty(kl7mVar.f33163a)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(kl7mVar.f33170d)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(kl7mVar.f33169c)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.n5r1.m21306s(kl7mVar.f33170d)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.n5r1.m21306s(kl7mVar.f33169c)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = kl7mVar.f33168b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("item.data is too large(" + kl7mVar.f33168b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static void m21580q(Context context, String str, String str2, long j2, String str3) {
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d(str);
        kl7mVar.m21122c(str2);
        kl7mVar.m21106a(j2);
        kl7mVar.m21118b(str3);
        kl7mVar.m21107a("push_sdk_channel");
        kl7mVar.m21134g(context.getPackageName());
        kl7mVar.m21129e(context.getPackageName());
        kl7mVar.m21109a(true);
        kl7mVar.m21117b(System.currentTimeMillis());
        kl7mVar.m21132f(toq());
        yz.m21802k(context, kl7mVar);
    }

    public static synchronized String toq() {
        String str;
        str = f73590toq.format(Long.valueOf(System.currentTimeMillis()));
        if (!TextUtils.equals(f73591zy, str)) {
            f33756k.set(0L);
            f73591zy = str;
        }
        return str + C5658n.f73185t8r + f33756k.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.xiaomi.push.erbd> zy(java.util.List<com.xiaomi.push.kl7m> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L9
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.zy.jk(r11)
            return r0
        L9:
            int r1 = r11.size()
            if (r1 != 0) goto L15
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.zy.jk(r11)
            return r0
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.b7 r2 = new com.xiaomi.push.b7
            r2.<init>()
            r3 = 0
            r4 = r3
            r5 = r4
        L22:
            int r6 = r11.size()
            if (r4 >= r6) goto Lad
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.kl7m r6 = (com.xiaomi.push.kl7m) r6
            if (r6 != 0) goto L32
            goto La9
        L32:
            java.util.Map r7 = r6.m21111a()
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m21111a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m21111a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L59
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r7 = r3
        L5a:
            java.util.Map r9 = r6.m21111a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L69
            r6.m21108a(r0)
            goto L72
        L69:
            java.util.Map r9 = r6.m21111a()
            r9.remove(r8)
            goto L72
        L71:
            r7 = r3
        L72:
            if (r7 > 0) goto L79
            byte[] r7 = com.xiaomi.push.qla.m21397g(r6)
            int r7 = r7.length
        L79:
            if (r7 <= r14) goto L94
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.append(r8)
            java.lang.String r6 = r6.m21127d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.zy.jk(r6)
            goto La9
        L94:
            int r8 = r5 + r7
            if (r8 <= r14) goto La5
            com.xiaomi.push.erbd r2 = m21578k(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.b7 r2 = new com.xiaomi.push.b7
            r2.<init>()
            r5 = r3
        La5:
            r2.m20638a(r6)
            int r5 = r5 + r7
        La9:
            int r4 = r4 + 1
            goto L22
        Lad:
            int r11 = r2.m20635a()
            if (r11 == 0) goto Lba
            com.xiaomi.push.erbd r11 = m21578k(r12, r13, r2)
            r1.add(r11)
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ek5k.zy(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }
}
