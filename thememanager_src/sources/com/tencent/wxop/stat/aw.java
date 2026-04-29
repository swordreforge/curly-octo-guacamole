package com.tencent.wxop.stat;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class aw implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f30064a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f30065b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f30066c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ au f30067d;

    aw(au auVar, List list, boolean z2, boolean z3) {
        this.f30067d = auVar;
        this.f30064a = list;
        this.f30065b = z2;
        this.f30066c = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30067d.m18346a((List<bd>) this.f30064a, this.f30065b);
        if (this.f30066c) {
            this.f30064a.clear();
        }
    }
}
