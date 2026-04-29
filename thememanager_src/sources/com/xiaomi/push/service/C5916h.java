package com.xiaomi.push.service;

import com.xiaomi.push.C5889p;

/* JADX INFO: renamed from: com.xiaomi.push.service.h */
/* JADX INFO: loaded from: classes3.dex */
class C5916h extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f33789k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ int f33790n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ wvg f33791q;

    C5916h(String str, wvg wvgVar, int i2) {
        this.f33789k = str;
        this.f33791q = wvgVar;
        this.f33790n = i2;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return this.f33789k;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33791q.qrj(this.f33790n);
    }
}
