package com.xiaomi.accountsdk.guestaccount.data;

import android.os.Bundle;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.data.g */
/* JADX INFO: compiled from: ServiceArgument.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5513g extends C5514k {

    /* JADX INFO: renamed from: n */
    private static final String f30844n = "callback";

    /* JADX INFO: renamed from: q */
    private static final String f30845q = "sdk_version";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72866toq = "sid";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72867zy = "psid";

    public C5513g(Bundle bundle) {
        super(bundle);
    }

    public C5513g f7l8(String str) {
        this.f30846k.putString(f72867zy, str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C5513g m18857g(String str) {
        this.f30846k.putString(f30844n, str);
        return this;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.data.C5514k
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ Bundle mo18858k() {
        return super.mo18858k();
    }

    /* JADX INFO: renamed from: n */
    public String m18859n() {
        return this.f30846k.getString(f72866toq);
    }

    /* JADX INFO: renamed from: q */
    public String m18860q() {
        return this.f30846k.getString(f30845q);
    }

    /* JADX INFO: renamed from: s */
    public C5513g m18861s(String str) {
        this.f30846k.putString(f72866toq, str);
        return this;
    }

    public String toq() {
        return this.f30846k.getString(f30844n);
    }

    /* JADX INFO: renamed from: y */
    public C5513g m18862y(String str) {
        this.f30846k.putString(f30845q, str);
        return this;
    }

    public String zy() {
        return this.f30846k.getString(f72867zy);
    }

    public C5513g() {
    }
}
