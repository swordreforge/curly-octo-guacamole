package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o1t {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile o1t f73193zy;

    /* JADX INFO: renamed from: k */
    private Context f31422k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<bf2> f73194toq = new ArrayList();

    private o1t(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f31422k = applicationContext;
        if (applicationContext == null) {
            this.f31422k = context;
        }
    }

    public static o1t toq(Context context) {
        if (f73193zy == null) {
            synchronized (o1t.class) {
                if (f73193zy == null) {
                    f73193zy = new o1t(context);
                }
            }
        }
        return f73193zy;
    }

    public void f7l8(String str) {
        synchronized (this.f73194toq) {
            bf2 bf2Var = new bf2();
            bf2Var.f73120toq = str;
            if (this.f73194toq.contains(bf2Var)) {
                Iterator<bf2> it = this.f73194toq.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bf2 next = it.next();
                    if (bf2Var.equals(next)) {
                        bf2Var = next;
                        break;
                    }
                }
            }
            bf2Var.f31314k++;
            this.f73194toq.remove(bf2Var);
            this.f73194toq.add(bf2Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m19533g(String str) {
        synchronized (this.f73194toq) {
            bf2 bf2Var = new bf2();
            bf2Var.f73120toq = str;
            return this.f73194toq.contains(bf2Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m19534k(String str) {
        synchronized (this.f73194toq) {
            bf2 bf2Var = new bf2();
            bf2Var.f73120toq = str;
            if (this.f73194toq.contains(bf2Var)) {
                for (bf2 bf2Var2 : this.f73194toq) {
                    if (bf2Var2.equals(bf2Var)) {
                        return bf2Var2.f31314k;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m19535n(String str) {
        synchronized (this.f73194toq) {
            bf2 bf2Var = new bf2();
            bf2Var.f31314k = 0;
            bf2Var.f73120toq = str;
            if (this.f73194toq.contains(bf2Var)) {
                this.f73194toq.remove(bf2Var);
            }
            this.f73194toq.add(bf2Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m19536q(dd ddVar, String str) {
        SharedPreferences sharedPreferences = this.f31422k.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(ddVar.name(), str).apply();
    }

    /* JADX INFO: renamed from: y */
    public void m19537y(String str) {
        synchronized (this.f73194toq) {
            bf2 bf2Var = new bf2();
            bf2Var.f73120toq = str;
            if (this.f73194toq.contains(bf2Var)) {
                this.f73194toq.remove(bf2Var);
            }
        }
    }

    public synchronized String zy(dd ddVar) {
        return this.f31422k.getSharedPreferences("mipush_extra", 0).getString(ddVar.name(), "");
    }
}
