package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
class bf2 {

    /* JADX INFO: renamed from: k */
    int f31314k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    String f73120toq = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bf2)) {
            return false;
        }
        bf2 bf2Var = (bf2) obj;
        return !TextUtils.isEmpty(bf2Var.f73120toq) && bf2Var.f73120toq.equals(this.f73120toq);
    }
}
