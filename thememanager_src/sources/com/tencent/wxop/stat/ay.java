package com.tencent.wxop.stat;

import com.tencent.wxop.stat.event.AbstractC5405e;

/* JADX INFO: loaded from: classes3.dex */
class ay implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC5405e f30069a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC5414h f30070b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f30071c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f30072d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ au f30073e;

    ay(au auVar, AbstractC5405e abstractC5405e, InterfaceC5414h interfaceC5414h, boolean z2, boolean z3) {
        this.f30073e = auVar;
        this.f30069a = abstractC5405e;
        this.f30070b = interfaceC5414h;
        this.f30071c = z2;
        this.f30072d = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30073e.m18351b(this.f30069a, this.f30070b, this.f30071c, this.f30072d);
    }
}
