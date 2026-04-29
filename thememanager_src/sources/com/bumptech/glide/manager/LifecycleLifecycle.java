package com.bumptech.glide.manager;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fu4;
import androidx.lifecycle.gvn7;
import androidx.lifecycle.kja0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleLifecycle implements x2, fu4 {

    /* JADX INFO: renamed from: k */
    @lvui
    private final Set<qrj> f18842k = new HashSet();

    /* JADX INFO: renamed from: q */
    @lvui
    private final androidx.lifecycle.kja0 f18843q;

    LifecycleLifecycle(androidx.lifecycle.kja0 kja0Var) {
        this.f18843q = kja0Var;
        kja0Var.mo4451k(this);
    }

    @Override // com.bumptech.glide.manager.x2
    /* JADX INFO: renamed from: k */
    public void mo11072k(@lvui qrj qrjVar) {
        this.f18842k.remove(qrjVar);
    }

    @gvn7(kja0.toq.ON_DESTROY)
    public void onDestroy(@lvui InterfaceC0954z interfaceC0954z) {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18842k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).onDestroy();
        }
        interfaceC0954z.getLifecycle().zy(this);
    }

    @gvn7(kja0.toq.ON_START)
    public void onStart(@lvui InterfaceC0954z interfaceC0954z) {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18842k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).mo10580k();
        }
    }

    @gvn7(kja0.toq.ON_STOP)
    public void onStop(@lvui InterfaceC0954z interfaceC0954z) {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18842k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.x2
    public void toq(@lvui qrj qrjVar) {
        this.f18842k.add(qrjVar);
        if (this.f18843q.toq() == kja0.zy.DESTROYED) {
            qrjVar.onDestroy();
        } else if (this.f18843q.toq().isAtLeast(kja0.zy.STARTED)) {
            qrjVar.mo10580k();
        } else {
            qrjVar.onStop();
        }
    }
}
