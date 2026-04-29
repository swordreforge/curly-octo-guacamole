package com.xiaomi.accountsdk.account.data;

import java.util.Calendar;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.z */
/* JADX INFO: compiled from: XiaomiUserProfile.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5493z {

    /* JADX INFO: renamed from: k */
    private String f30708k;

    /* JADX INFO: renamed from: q */
    private Calendar f30709q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f72714toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private EnumC5492y f72715zy;

    public C5493z(String str) {
        this(str, null, null, null);
    }

    public void f7l8(String str) {
        this.f72714toq = str;
    }

    /* JADX INFO: renamed from: g */
    public void m18743g(EnumC5492y enumC5492y) {
        this.f72715zy = enumC5492y;
    }

    /* JADX INFO: renamed from: k */
    public Calendar m18744k() {
        return this.f30709q;
    }

    /* JADX INFO: renamed from: n */
    public void m18745n(Calendar calendar) {
        this.f30709q = calendar;
    }

    /* JADX INFO: renamed from: q */
    public String m18746q() {
        return this.f72714toq;
    }

    public EnumC5492y toq() {
        return this.f72715zy;
    }

    public String zy() {
        return this.f30708k;
    }

    public C5493z(String str, ni7 ni7Var) {
        this.f30708k = str;
        if (ni7Var != null) {
            this.f72714toq = ni7Var.f72672toq;
            this.f72715zy = ni7Var.f30645s;
            this.f30709q = ni7Var.f30643p;
        }
    }

    public C5493z(String str, String str2, Calendar calendar, EnumC5492y enumC5492y) {
        this.f30708k = str;
        this.f72714toq = str2;
        this.f72715zy = enumC5492y;
        this.f30709q = calendar;
    }
}
