package com.xiaomi.push;

import com.xiaomi.push.qrj;

/* JADX INFO: loaded from: classes3.dex */
class kja0 implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ qrj.toq f33126k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ qrj f33127q;

    kja0(qrj qrjVar, qrj.toq toqVar) {
        this.f33127q = qrjVar;
        this.f33126k = toqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33127q.m21406n(this.f33126k);
    }
}
