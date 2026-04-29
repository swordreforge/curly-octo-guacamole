package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z4j7 {

    /* JADX INFO: renamed from: k */
    private static qrj f34223k = new qrj(true);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile int f73750toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static long f73751zy = System.currentTimeMillis();

    /* JADX INFO: renamed from: q */
    private static final Object f34225q = new Object();

    /* JADX INFO: renamed from: n */
    private static List<C5967k> f34224n = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    private static String f34222g = "";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static nnh.toq f73749f7l8 = null;

    /* JADX INFO: renamed from: com.xiaomi.push.z4j7$k */
    static class C5967k {

        /* JADX INFO: renamed from: g */
        public long f34226g;

        /* JADX INFO: renamed from: k */
        public String f34227k;

        /* JADX INFO: renamed from: n */
        public String f34228n;

        /* JADX INFO: renamed from: q */
        public int f34229q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f73752toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f73753zy;

        public C5967k(String str, long j2, int i2, int i3, String str2, long j3) {
            this.f34227k = str;
            this.f73752toq = j2;
            this.f73753zy = i2;
            this.f34229q = i3;
            this.f34228n = str2;
            this.f34226g = j3;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22072k(C5967k c5967k) {
            return TextUtils.equals(c5967k.f34227k, this.f34227k) && TextUtils.equals(c5967k.f34228n, this.f34228n) && c5967k.f73753zy == this.f73753zy && c5967k.f34229q == this.f34229q && Math.abs(c5967k.f73752toq - this.f73752toq) <= 5000;
        }
    }

    private static nnh.toq f7l8(Context context) {
        nnh.toq toqVar = f73749f7l8;
        if (toqVar != null) {
            return toqVar;
        }
        nnh.toq toqVar2 = new nnh.toq(context);
        f73749f7l8 = toqVar2;
        return toqVar2;
    }

    /* JADX INFO: renamed from: k */
    public static int m22066k(Context context) {
        if (f73750toq == -1) {
            f73750toq = n7h(context);
        }
        return f73750toq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kja0(Context context, List<C5967k> list) {
        try {
            synchronized (nnh.toq.f42749q) {
                SQLiteDatabase writableDatabase = f7l8(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C5967k c5967k : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package_name", c5967k.f34227k);
                        contentValues.put("message_ts", Long.valueOf(c5967k.f73752toq));
                        contentValues.put("network_type", Integer.valueOf(c5967k.f73753zy));
                        contentValues.put("bytes", Long.valueOf(c5967k.f34226g));
                        contentValues.put("rcv", Integer.valueOf(c5967k.f34229q));
                        contentValues.put("imsi", c5967k.f34228n);
                        writableDatabase.insert("traffic", null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(th);
        }
    }

    /* JADX INFO: renamed from: n */
    private static synchronized String m22067n(Context context) {
        if (TextUtils.isEmpty(f34222g)) {
            return "";
        }
        return f34222g;
    }

    private static int n7h(Context context) {
        lvui lvuiVarM21359n = oc.m21359n();
        if (lvuiVarM21359n == null) {
            return -1;
        }
        return lvuiVarM21359n.m21210k();
    }

    /* JADX INFO: renamed from: p */
    public static void m22068p(Context context, String str, long j2, boolean z2, boolean z3, long j3) {
        m22070s(context, str, zy(m22066k(context), j2, z2, j3, z3), z2, j3);
    }

    public static synchronized void qrj(String str) {
        if (!nc.m21310i() && !TextUtils.isEmpty(str)) {
            f34222g = str;
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m22070s(Context context, String str, long j2, boolean z2, long j3) {
        int iM22066k;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (iM22066k = m22066k(context))) {
            return;
        }
        synchronized (f34225q) {
            zIsEmpty = f34224n.isEmpty();
            x2(new C5967k(str, j3, iM22066k, z2 ? 1 : 0, iM22066k == 0 ? m22067n(context) : "", j2));
        }
        if (zIsEmpty) {
            f34223k.m21405g(new kz28(context), 5000L);
        }
    }

    public static int toq(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    private static void x2(C5967k c5967k) {
        for (C5967k c5967k2 : f34224n) {
            if (c5967k2.m22072k(c5967k)) {
                c5967k2.f34226g += c5967k.f34226g;
                return;
            }
        }
        f34224n.add(c5967k);
    }

    /* JADX INFO: renamed from: y */
    public static void m22071y(Context context) {
        f73750toq = n7h(context);
    }

    private static long zy(int i2, long j2, boolean z2, long j3, boolean z3) {
        if (z2 && z3) {
            long j4 = f73751zy;
            f73751zy = j3;
            if (j3 - j4 > 30000 && j2 > 1024) {
                return j2 * 2;
            }
        }
        return (j2 * ((long) (i2 == 0 ? 13 : 11))) / 10;
    }
}
