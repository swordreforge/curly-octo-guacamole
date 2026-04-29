package com.xiaomi.onetrack.p009a.p011b;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.b.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5678a {

    /* JADX INFO: renamed from: a */
    public static final int f31597a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f31598b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f31599c = 2;

    /* JADX INFO: renamed from: d */
    private static final String f31600d = "AdMonitor";

    /* JADX INFO: renamed from: e */
    private int f31601e;

    /* JADX INFO: renamed from: f */
    private String f31602f;

    /* JADX INFO: renamed from: g */
    private long f31603g;

    /* JADX INFO: renamed from: h */
    private String f31604h = "";

    /* JADX INFO: renamed from: i */
    private String f31605i = "";

    /* JADX INFO: renamed from: j */
    private String f31606j = "";

    /* JADX INFO: renamed from: k */
    private int f31607k = 0;

    /* JADX INFO: renamed from: a */
    public String m19663a() {
        return this.f31606j;
    }

    /* JADX INFO: renamed from: b */
    public int m19667b() {
        return this.f31601e;
    }

    /* JADX INFO: renamed from: c */
    public String m19670c() {
        return this.f31602f;
    }

    /* JADX INFO: renamed from: d */
    public long m19672d() {
        return this.f31603g;
    }

    /* JADX INFO: renamed from: e */
    public String m19674e() {
        return this.f31604h;
    }

    /* JADX INFO: renamed from: f */
    public String m19675f() {
        return this.f31605i;
    }

    /* JADX INFO: renamed from: g */
    public int m19676g() {
        return this.f31607k;
    }

    /* JADX INFO: renamed from: h */
    public boolean m19677h() {
        try {
            if (TextUtils.isEmpty(this.f31602f) || TextUtils.isEmpty(this.f31604h)) {
                return false;
            }
            return !TextUtils.isEmpty(this.f31605i);
        } catch (Exception e2) {
            C5804p.m20342a(f31600d, "check AdMonitor isValid error:" + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19666a(String str) {
        this.f31606j = str;
    }

    /* JADX INFO: renamed from: b */
    public void m19669b(String str) {
        this.f31602f = str;
    }

    /* JADX INFO: renamed from: c */
    public void m19671c(String str) {
        this.f31604h = str;
    }

    /* JADX INFO: renamed from: d */
    public void m19673d(String str) {
        this.f31605i = str;
    }

    /* JADX INFO: renamed from: a */
    public void m19664a(int i2) {
        this.f31601e = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m19668b(int i2) {
        this.f31607k = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m19665a(long j2) {
        this.f31603g = j2;
    }
}
