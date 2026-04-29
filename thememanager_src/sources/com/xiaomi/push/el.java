package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
class el extends Thread {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ zff0 f32845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    el(zff0 zff0Var, String str) {
        super(str);
        this.f32845k = zff0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f32845k.f73771a9.zy();
        } catch (Exception e2) {
            this.f32845k.ncyb(9, e2);
        }
    }
}
