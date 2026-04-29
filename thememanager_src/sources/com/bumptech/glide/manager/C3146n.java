package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.zy;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.manager.n */
/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3146n implements zy {

    /* JADX INFO: renamed from: k */
    private final Context f18901k;

    /* JADX INFO: renamed from: q */
    final zy.InterfaceC3152k f18902q;

    C3146n(@lvui Context context, @lvui zy.InterfaceC3152k interfaceC3152k) {
        this.f18901k = context.getApplicationContext();
        this.f18902q = interfaceC3152k;
    }

    /* JADX INFO: renamed from: q */
    private void m11104q() {
        C3144i.m11093k(this.f18901k).m11095g(this.f18902q);
    }

    private void zy() {
        C3144i.m11093k(this.f18901k).m11096q(this.f18902q);
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
        zy();
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onStop() {
        m11104q();
    }
}
