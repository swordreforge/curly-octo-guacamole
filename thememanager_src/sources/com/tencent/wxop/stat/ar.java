package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
class ar implements InterfaceC5414h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aq f30042a;

    ar(aq aqVar) {
        this.f30042a = aqVar;
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: a */
    public void mo18333a() {
        StatServiceImpl.m18294c();
        if (au.m18349b().m18362a() >= StatConfig.getMaxBatchReportCount()) {
            au.m18349b().m18363a(StatConfig.getMaxBatchReportCount());
        }
    }

    @Override // com.tencent.wxop.stat.InterfaceC5414h
    /* JADX INFO: renamed from: b */
    public void mo18334b() {
        StatServiceImpl.m18295d();
    }
}
