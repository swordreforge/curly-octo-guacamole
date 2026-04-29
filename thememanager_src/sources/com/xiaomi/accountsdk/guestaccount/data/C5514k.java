package com.xiaomi.accountsdk.guestaccount.data;

import android.os.Bundle;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.data.k */
/* JADX INFO: compiled from: BundleWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
class C5514k {

    /* JADX INFO: renamed from: k */
    protected final Bundle f30846k;

    protected C5514k(Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("srcBundle == null");
        }
        Bundle bundle2 = new Bundle(bundle);
        this.f30846k = bundle2;
        bundle2.setClassLoader(getClass().getClassLoader());
    }

    /* JADX INFO: renamed from: k */
    public Bundle mo18858k() {
        return new Bundle(this.f30846k);
    }

    protected C5514k() {
        this.f30846k = new Bundle();
    }
}
