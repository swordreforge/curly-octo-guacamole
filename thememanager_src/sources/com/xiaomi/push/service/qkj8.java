package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.nc;
import com.xiaomi.push.service.C5939t;
import com.xiaomi.push.wu;
import com.xiaomi.push.y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class qkj8 {

    /* JADX INFO: renamed from: k */
    private static final int[] f33885k = {1, 2, 4, 8, 16};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final SparseArray<C5939t.k<String, String, String>> f73660toq = new fnq8(5);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final SparseArray<Integer> f73661zy = new qo(5);

    static void f7l8(Context context, String str) {
        List<NotificationChannel> listX2;
        if (!nc.m21313p(context) || TextUtils.isEmpty(str) || (listX2 = wvg.m21784n(context, str).x2()) == null) {
            return;
        }
        synchronized (qkj8.class) {
            SharedPreferences sharedPreferencesM21741n = m21741n(context);
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = listX2.iterator();
            while (it.hasNext()) {
                String str2 = (String) C5892r.m21413q(it.next(), "mId");
                if (!TextUtils.isEmpty(str2) && sharedPreferencesM21741n.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                x2(sharedPreferencesM21741n, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m21738g(String str, String str2) {
        return C5939t.m21764q(wu.toq(), str, str2);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m21739h(String str, String str2, int i2) {
        boolean z2 = C5939t.zy(wu.toq(), str, str2, f73660toq.get(i2)) == 1;
        com.xiaomi.channel.commonutils.logger.zy.kja0("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i2 + "=" + z2 + ">");
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m21740k(android.content.Context r5, java.lang.String r6, android.app.NotificationChannel r7) {
        /*
            r0 = 0
            if (r5 == 0) goto La4
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto La4
            if (r7 == 0) goto La4
            int r5 = r7.getImportance()
            r1 = 1
            if (r5 == 0) goto L14
            r5 = r1
            goto L15
        L14:
            r5 = 2
        L15:
            r5 = r5 | r0
            boolean r0 = com.xiaomi.push.service.C5939t.m21759h()
            r2 = 16
            r3 = 4
            r4 = 8
            if (r0 == 0) goto L63
            java.lang.String r0 = r7.getId()
            android.os.Bundle r6 = m21738g(r6, r0)
            com.xiaomi.push.service.t$k<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.C5939t.f33907y
            T r1 = r0.f73669zy
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r6.containsKey(r1)
            if (r1 == 0) goto L48
            T r0 = r0.f73669zy
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.getBoolean(r0)
            if (r0 == 0) goto L46
            int r0 = r7.getImportance()
            if (r0 < r3) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            r5 = r5 | r3
        L48:
            com.xiaomi.push.service.t$k<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.C5939t.f73664f7l8
            T r1 = r0.f73669zy
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r6.containsKey(r1)
            if (r1 == 0) goto L8b
            T r0 = r0.f73669zy
            java.lang.String r0 = (java.lang.String) r0
            boolean r6 = r6.getBoolean(r0)
            if (r6 == 0) goto L5f
            goto L61
        L5f:
            r2 = 32
        L61:
            r5 = r5 | r2
            goto L8b
        L63:
            java.lang.String r0 = r7.getId()
            int r0 = m21743q(r6, r0, r4)
            if (r0 != r1) goto L76
            int r0 = r7.getImportance()
            if (r0 < r3) goto L78
            r5 = r5 | 4
            goto L7a
        L76:
            if (r0 != 0) goto L7a
        L78:
            r5 = r5 | 8
        L7a:
            java.lang.String r0 = r7.getId()
            int r6 = m21743q(r6, r0, r2)
            if (r6 != r1) goto L87
            r5 = r5 | 16
            goto L8b
        L87:
            if (r6 != 0) goto L8b
            r5 = r5 | 32
        L8b:
            android.net.Uri r6 = r7.getSound()
            if (r6 == 0) goto L94
            r5 = r5 | 64
            goto L96
        L94:
            r5 = r5 | 128(0x80, float:1.8E-43)
        L96:
            boolean r6 = r7.shouldVibrate()
            if (r6 == 0) goto L9f
            r6 = 256(0x100, float:3.59E-43)
            goto La1
        L9f:
            r6 = 512(0x200, float:7.17E-43)
        La1:
            r0 = r5 | r6
            goto La9
        La4:
            java.lang.String r5 = "context|packageName|channel must not be null "
            com.xiaomi.channel.commonutils.logger.zy.kja0(r5)
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.qkj8.m21740k(android.content.Context, java.lang.String, android.app.NotificationChannel):int");
    }

    private static boolean kja0(int i2, int i3) {
        return i2 >= 4 || (i3 & 2) > 0 || (i3 & 1) > 0 || (i3 & 8) > 0 || (i3 & 16) > 0;
    }

    private static void ld6(SharedPreferences sharedPreferences, String str) {
        x2(sharedPreferences, new tfm(str));
    }

    /* JADX INFO: renamed from: n */
    private static SharedPreferences m21741n(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    private static void n7h(String str, String str2, int i2, boolean z2) {
        com.xiaomi.channel.commonutils.logger.zy.kja0("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i2 + "=" + z2 + "> :" + C5939t.t8r(wu.toq(), str, str2, f73660toq.get(i2), z2));
    }

    /* JADX INFO: renamed from: p */
    private static void m21742p(SharedPreferences sharedPreferences, int i2, String str, String str2, int i3) {
        if (sharedPreferences.getInt(str2, 0) != i2) {
            qrj(str, str2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m21743q(String str, String str2, int i2) {
        return C5939t.zy(wu.toq(), str, str2, f73660toq.get(i2));
    }

    static void qrj(String str, String str2, int i2, int i3) {
        for (int i4 : f33885k) {
            if ((f73661zy.get(i4).intValue() & i3) == 0) {
                n7h(str, str2, i4, (i2 & i4) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.zy.kja0("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i4 + "> :stoped by userLock");
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m21744s(SharedPreferences sharedPreferences, int i2, String str) {
        sharedPreferences.edit().putInt(str, i2).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int toq(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r3 == 0) goto L61
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L61
            com.xiaomi.push.service.wvg r3 = com.xiaomi.push.service.wvg.m21784n(r3, r4)
            if (r3 == 0) goto L5b
            java.lang.String r5 = r3.m21788s(r5)
            android.app.NotificationChannel r3 = r3.toq(r5)
            if (r3 == 0) goto L55
            int r5 = r3.getImportance()
            r1 = 1
            if (r5 == 0) goto L22
            r5 = r1
            goto L23
        L22:
            r5 = 2
        L23:
            r5 = r5 | r0
            java.lang.String r0 = r3.getId()
            r2 = 8
            int r0 = m21743q(r4, r0, r2)
            if (r0 != r1) goto L3a
            int r0 = r3.getImportance()
            r2 = 4
            if (r0 < r2) goto L3c
            r5 = r5 | 4
            goto L3e
        L3a:
            if (r0 != 0) goto L3e
        L3c:
            r5 = r5 | 8
        L3e:
            java.lang.String r3 = r3.getId()
            r0 = 16
            int r3 = m21743q(r4, r3, r0)
            if (r3 != r1) goto L4e
            r3 = r5 | 16
        L4c:
            r0 = r3
            goto L66
        L4e:
            if (r3 != 0) goto L53
            r3 = r5 | 32
            goto L4c
        L53:
            r0 = r5
            goto L66
        L55:
            java.lang.String r3 = "Channel must not be null"
            com.xiaomi.channel.commonutils.logger.zy.kja0(r3)
            goto L66
        L5b:
            java.lang.String r3 = "create NMHelper error"
            com.xiaomi.channel.commonutils.logger.zy.kja0(r3)
            goto L66
        L61:
            java.lang.String r3 = "Must greater than or equal android O and context|packageName not be null"
            com.xiaomi.channel.commonutils.logger.zy.kja0(r3)
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.qkj8.toq(android.content.Context, java.lang.String, java.lang.String):int");
    }

    private static void x2(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: y */
    static void m21745y(Context context, String str, String str2, int i2, String str3, boolean z2, int i3) {
        if (!nc.m21313p(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (nc.m21313p(context)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int iM22047k = y3.m22047k(str3, 0);
        boolean zKja0 = kja0(i2, iM22047k);
        if (z2) {
            qrj(str, str2, iM22047k, i3);
            if (zKja0) {
                synchronized (qkj8.class) {
                    m21744s(m21741n(context), iM22047k, str2);
                }
                return;
            }
            return;
        }
        synchronized (qkj8.class) {
            SharedPreferences sharedPreferencesM21741n = m21741n(context);
            if (zKja0 || sharedPreferencesM21741n.contains(str2)) {
                m21742p(sharedPreferencesM21741n, iM22047k, str, str2, i3);
                if (zKja0) {
                    m21744s(sharedPreferencesM21741n, iM22047k, str2);
                } else {
                    ld6(sharedPreferencesM21741n, str2);
                }
            }
        }
    }

    static int zy(String str, String str2) {
        int i2 = m21739h(str, str2, 8) ? 8 : 0;
        if (m21739h(str, str2, 16)) {
            i2 |= 16;
        }
        if (m21739h(str, str2, 1)) {
            i2 |= 1;
        }
        if (m21739h(str, str2, 2)) {
            i2 |= 2;
        }
        return m21739h(str, str2, 4) ? i2 | 4 : i2;
    }
}
