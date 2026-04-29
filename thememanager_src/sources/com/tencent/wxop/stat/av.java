package com.tencent.wxop.stat;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class av implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f30059a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f30060b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f30061c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f30062d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ au f30063e;

    av(au auVar, List list, int i2, boolean z2, boolean z3) {
        this.f30063e = auVar;
        this.f30059a = list;
        this.f30060b = i2;
        this.f30061c = z2;
        this.f30062d = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30063e.m18345a((List<bd>) this.f30059a, this.f30060b, this.f30061c);
        if (this.f30062d) {
            this.f30059a.clear();
        }
    }
}
