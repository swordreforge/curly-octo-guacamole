package com.tencent.wxop.stat;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ba implements InterfaceC5414h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f30077a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f30078b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ au f30079c;

    ba(au auVar, List list, boolean z2) {
        this.f30079c = auVar;
        this.f30077a = list;
        this.f30078b = z2;
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: a */
    public void mo18333a() {
        StatServiceImpl.m18294c();
        this.f30079c.m18367a(this.f30077a, this.f30078b, true);
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: b */
    public void mo18334b() {
        StatServiceImpl.m18295d();
        this.f30079c.m18366a(this.f30077a, 1, this.f30078b, true);
    }
}
