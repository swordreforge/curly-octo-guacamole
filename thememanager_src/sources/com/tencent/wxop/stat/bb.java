package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
class bb implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f30080a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ au f30081b;

    bb(au auVar, int i2) {
        this.f30081b = auVar;
        this.f30080a = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30081b.m18350b(this.f30080a, true);
        this.f30081b.m18350b(this.f30080a, false);
    }
}
