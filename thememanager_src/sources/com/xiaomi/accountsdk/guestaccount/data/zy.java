package com.xiaomi.accountsdk.guestaccount.data;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: GuestAccountResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy extends C5514k {

    /* JADX INFO: renamed from: n */
    private static final String f30850n = "intent";

    /* JADX INFO: renamed from: q */
    private static final String f30851q = "sdk_version";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72868toq = "error_code";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72869zy = "error_msg";

    public zy(Bundle bundle) {
        super(bundle);
    }

    public zy f7l8(String str) {
        this.f30846k.putString(f72869zy, str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public zy m18864g(int i2) {
        this.f30846k.putInt(f72868toq, i2);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public Intent m18865n() {
        return (Intent) this.f30846k.getParcelable("intent");
    }

    /* JADX INFO: renamed from: q */
    public GuestAccount m18866q() {
        return (GuestAccount) this.f30846k.getParcelable(f30851q);
    }

    /* JADX INFO: renamed from: s */
    public zy m18867s(Intent intent) {
        this.f30846k.putParcelable("intent", intent);
        return this;
    }

    public int toq() {
        return this.f30846k.getInt(f72868toq);
    }

    /* JADX INFO: renamed from: y */
    public zy m18868y(GuestAccount guestAccount) {
        this.f30846k.putParcelable(f30851q, guestAccount);
        return this;
    }

    public String zy() {
        return this.f30846k.getString(f72869zy);
    }

    public zy() {
    }
}
