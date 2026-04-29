package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sok {

    /* JADX INFO: renamed from: n */
    private static sok f33898n;

    /* JADX INFO: renamed from: k */
    private Context f33899k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<String> f73662toq = new ArrayList();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<String> f73663zy = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final List<String> f33900q = new ArrayList();

    private sok(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33899k = applicationContext;
        if (applicationContext == null) {
            this.f33899k = context;
        }
        SharedPreferences sharedPreferences = this.f33899k.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f73662toq.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.f73663zy.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.f33900q.add(str3);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static sok m21751k(Context context) {
        if (f33898n == null) {
            f33898n = new sok(context);
        }
        return f33898n;
    }

    public boolean f7l8(String str) {
        boolean zContains;
        synchronized (this.f33900q) {
            zContains = this.f33900q.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: g */
    public void m21752g(String str) {
        synchronized (this.f33900q) {
            if (!this.f33900q.contains(str)) {
                this.f33900q.add(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.n5r1.m21305q(this.f33900q, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m21753n(String str) {
        boolean zContains;
        synchronized (this.f73663zy) {
            zContains = this.f73663zy.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: p */
    public void m21754p(String str) {
        synchronized (this.f33900q) {
            if (this.f33900q.contains(str)) {
                this.f33900q.remove(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.n5r1.m21305q(this.f33900q, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21755q(String str) {
        synchronized (this.f73663zy) {
            if (!this.f73663zy.contains(str)) {
                this.f73663zy.add(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.n5r1.m21305q(this.f73663zy, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m21756s(String str) {
        synchronized (this.f73663zy) {
            if (this.f73663zy.contains(str)) {
                this.f73663zy.remove(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.n5r1.m21305q(this.f73663zy, ",")).commit();
            }
        }
    }

    public void toq(String str) {
        synchronized (this.f73662toq) {
            if (!this.f73662toq.contains(str)) {
                this.f73662toq.add(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.n5r1.m21305q(this.f73662toq, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m21757y(String str) {
        synchronized (this.f73662toq) {
            if (this.f73662toq.contains(str)) {
                this.f73662toq.remove(str);
                this.f33899k.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.n5r1.m21305q(this.f73662toq, ",")).commit();
            }
        }
    }

    public boolean zy(String str) {
        boolean zContains;
        synchronized (this.f73662toq) {
            zContains = this.f73662toq.contains(str);
        }
        return zContains;
    }
}
