package com.android.thememanager.library.base.arch.cache;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.thememanager.library.util.app.C2088k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.library.base.arch.cache.q */
/* JADX INFO: compiled from: SPCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2086q implements com.android.thememanager.library.base.arch.cache.toq {

    /* JADX INFO: renamed from: k */
    private SharedPreferences f12322k;

    /* JADX INFO: renamed from: com.android.thememanager.library.base.arch.cache.q$toq */
    /* JADX INFO: compiled from: SPCache.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static C2086q f12323k = new C2086q();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static C2086q m8015g(String fileName) {
        return new C2086q(fileName);
    }

    public static C2086q toq() {
        return toq.f12323k;
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public void clear() {
        this.f12322k.edit().clear().apply();
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public boolean contains(@lvui String key) {
        return this.f12322k.contains(key);
    }

    public SharedPreferences f7l8() {
        return this.f12322k;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8016k(String key, boolean defValue) {
        return this.f12322k.getBoolean(key, defValue);
    }

    public void ld6(String key, int value) {
        this.f12322k.edit().putInt(key, value).apply();
    }

    /* JADX INFO: renamed from: n */
    public long m8017n(String key, long defValue) {
        return this.f12322k.getLong(key, defValue);
    }

    /* JADX INFO: renamed from: p */
    public void m8018p(String key, float value) {
        this.f12322k.edit().putFloat(key, value).apply();
    }

    /* JADX INFO: renamed from: q */
    public int m8019q(String key, int defValue) {
        return this.f12322k.getInt(key, defValue);
    }

    public void qrj(String key, String value) {
        if (value == null) {
            this.f12322k.edit().remove(key).apply();
        } else {
            this.f12322k.edit().putString(key, value).apply();
        }
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public void remove(@lvui String key) {
        this.f12322k.edit().remove(key).apply();
    }

    /* JADX INFO: renamed from: s */
    public void m8020s(String key, boolean value) {
        this.f12322k.edit().putBoolean(key, value).apply();
    }

    public void x2(String key, long value) {
        this.f12322k.edit().putLong(key, value).apply();
    }

    /* JADX INFO: renamed from: y */
    public String m8021y(String key, String defValue) {
        return this.f12322k.getString(key, defValue);
    }

    public float zy(String key, float defValue) {
        return this.f12322k.getFloat(key, defValue);
    }

    private C2086q() {
        this.f12322k = PreferenceManager.getDefaultSharedPreferences(C2088k.m8026k());
    }

    private C2086q(String fileName) {
        this.f12322k = C2088k.m8026k().getSharedPreferences(fileName, 0);
    }
}
