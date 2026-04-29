package com.android.thememanager.basemodule.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.r */
/* JADX INFO: compiled from: PreferenceManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1824r {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57809zy = bf2.toq.toq().getPackageName() + "_preferences";

    /* JADX INFO: renamed from: k */
    private SharedPreferences f10402k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private SharedPreferences.Editor f57810toq;

    private C1824r(String spName) {
        if (TextUtils.isEmpty(spName)) {
            this.f10402k = m7201g(f57809zy);
        } else {
            this.f10402k = m7201g(spName);
        }
        this.f57810toq = this.f10402k.edit();
    }

    /* JADX INFO: renamed from: g */
    private SharedPreferences m7201g(String spName) {
        return bf2.toq.toq().getSharedPreferences(spName, 0);
    }

    /* JADX INFO: renamed from: s */
    public static C1824r m7202s(String spName) {
        return new C1824r(spName);
    }

    /* JADX INFO: renamed from: y */
    public static C1824r m7203y() {
        return m7202s(f57809zy);
    }

    public String f7l8(String key, String def) {
        return this.f10402k.getString(key, def);
    }

    /* JADX INFO: renamed from: k */
    public void m7204k() {
        this.f57810toq.apply();
    }

    public C1824r ld6(String key, int value) {
        this.f57810toq.putInt(key, value);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public long m7205n(String key, long def) {
        return this.f10402k.getLong(key, def);
    }

    /* JADX INFO: renamed from: p */
    public C1824r m7206p(String key, boolean value) {
        this.f57810toq.putBoolean(key, value);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public int m7207q(String key, int def) {
        return this.f10402k.getInt(key, def);
    }

    public C1824r qrj(String key, String value) {
        this.f57810toq.putString(key, value);
        return this;
    }

    public void toq() {
        this.f57810toq.commit();
    }

    public C1824r x2(String key, long value) {
        this.f57810toq.putLong(key, value);
        return this;
    }

    public boolean zy(String key, boolean def) {
        return this.f10402k.getBoolean(key, def);
    }
}
