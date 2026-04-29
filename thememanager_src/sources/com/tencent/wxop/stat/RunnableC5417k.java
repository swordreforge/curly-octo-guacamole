package com.tencent.wxop.stat;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.wxop.stat.k */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5417k implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f30227a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC5414h f30228b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5415i f30229c;

    RunnableC5417k(C5415i c5415i, List list, InterfaceC5414h interfaceC5414h) {
        this.f30229c = c5415i;
        this.f30227a = list;
        this.f30228b = interfaceC5414h;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30229c.m18503a(this.f30227a, this.f30228b);
    }
}
