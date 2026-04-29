package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
class at implements InterfaceC5414h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aq f30044a;

    at(aq aqVar) {
        this.f30044a = aqVar;
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: a */
    public void mo18333a() {
        StatServiceImpl.m18294c();
        if (au.m18349b().f30048a > 0) {
            StatServiceImpl.commitEvents(this.f30044a.f30040d, -1);
        }
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: b */
    public void mo18334b() {
        au.m18349b().m18364a(this.f30044a.f30037a, (InterfaceC5414h) null, this.f30044a.f30039c, true);
        StatServiceImpl.m18295d();
    }
}
