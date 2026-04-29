package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.l7o;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.xiaomi.push.service.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5921j implements InterfaceC5917i {

    /* JADX INFO: renamed from: g */
    private static volatile C5921j f33815g;

    /* JADX INFO: renamed from: k */
    private SharedPreferences f33816k;

    /* JADX INFO: renamed from: n */
    Context f33817n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73623toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile boolean f73624zy = false;

    /* JADX INFO: renamed from: q */
    private ConcurrentHashMap<String, k> f33818q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.j$k */
    public static abstract class k implements Runnable {

        /* JADX INFO: renamed from: k */
        String f33819k;

        /* JADX INFO: renamed from: q */
        long f33820q;

        k(String str, long j2) {
            this.f33819k = str;
            this.f33820q = j2;
        }

        /* JADX INFO: renamed from: k */
        abstract void mo21645k(C5921j c5921j);

        @Override // java.lang.Runnable
        public void run() {
            if (C5921j.f33815g != null) {
                Context context = C5921j.f33815g.f33817n;
                if (com.xiaomi.push.oc.fu4(context)) {
                    if (System.currentTimeMillis() - C5921j.f33815g.f33816k.getLong(":ts-" + this.f33819k, 0L) > this.f33820q || com.xiaomi.push.f7l8.toq(context)) {
                        l7o.m21152k(C5921j.f33815g.f33816k.edit().putLong(":ts-" + this.f33819k, System.currentTimeMillis()));
                        mo21645k(C5921j.f33815g);
                    }
                }
            }
        }
    }

    private C5921j(Context context) {
        this.f33817n = context.getApplicationContext();
        this.f33816k = context.getSharedPreferences("sync", 0);
    }

    public static C5921j zy(Context context) {
        if (f33815g == null) {
            synchronized (C5921j.class) {
                if (f33815g == null) {
                    f33815g = new C5921j(context);
                }
            }
        }
        return f33815g;
    }

    @Override // com.xiaomi.push.service.InterfaceC5917i
    /* JADX INFO: renamed from: a */
    public void mo21619a() {
        if (this.f73624zy) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f73623toq < 3600000) {
            return;
        }
        this.f73623toq = jCurrentTimeMillis;
        this.f73624zy = true;
        C5889p.toq(this.f33817n).m21378y(new RunnableC5931o(this), (int) (Math.random() * 10.0d));
    }

    public void f7l8(String str, String str2, String str3) {
        l7o.m21152k(f33815g.f33816k.edit().putString(str + ":" + str2, str3));
    }

    /* JADX INFO: renamed from: g */
    public void m21643g(k kVar) {
        if (this.f33818q.putIfAbsent(kVar.f33819k, kVar) == null) {
            C5889p.toq(this.f33817n).m21378y(kVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    /* JADX INFO: renamed from: q */
    public String m21644q(String str, String str2) {
        return this.f33816k.getString(str + ":" + str2, "");
    }
}
