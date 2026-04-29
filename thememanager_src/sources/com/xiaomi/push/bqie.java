package com.xiaomi.push;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class bqie implements Cloneable {

    /* JADX INFO: renamed from: h */
    public static String f32740h = "wcc-ml-test10.bj";

    /* JADX INFO: renamed from: i */
    public static String f32741i;

    /* JADX INFO: renamed from: k */
    private String f32743k;

    /* JADX INFO: renamed from: n */
    private int f32744n;

    /* JADX INFO: renamed from: p */
    private ob f32745p;

    /* JADX INFO: renamed from: q */
    private String f32746q;

    /* JADX INFO: renamed from: s */
    private String f32747s;

    /* JADX INFO: renamed from: g */
    private boolean f32742g = imd.f73367t8r;

    /* JADX INFO: renamed from: y */
    private boolean f32748y = true;

    public bqie(Map<String, Integer> map, int i2, String str, ob obVar) {
        m20658g(map, i2, str, obVar);
    }

    /* JADX INFO: renamed from: g */
    private void m20658g(Map<String, Integer> map, int i2, String str, ob obVar) {
        this.f32744n = i2;
        this.f32743k = str;
        this.f32745p = obVar;
    }

    /* JADX INFO: renamed from: n */
    public static final void m20659n(String str) {
        if (xouc.m22025q()) {
            return;
        }
        f32741i = str;
    }

    /* JADX INFO: renamed from: q */
    public static final String m20660q() {
        String str = f32741i;
        return str != null ? str : xouc.zy() ? "sandbox.xmpush.xiaomi.com" : xouc.m22025q() ? "10.38.162.35" : "app.chat.xiaomi.net";
    }

    public String cdj() {
        if (this.f32746q == null) {
            this.f32746q = m20660q();
        }
        return this.f32746q;
    }

    /* JADX INFO: renamed from: k */
    public int m20661k() {
        return this.f32744n;
    }

    public void ki(String str) {
        this.f32746q = str;
    }

    public void kja0(String str) {
        this.f32747s = str;
    }

    public String n7h() {
        return this.f32747s;
    }

    public byte[] qrj() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m20662s() {
        return this.f32742g;
    }

    /* JADX INFO: renamed from: y */
    public void m20663y(boolean z2) {
        this.f32742g = z2;
    }
}
