package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.manager.k */
/* JADX INFO: compiled from: ActivityFragmentLifecycle.java */
/* JADX INFO: loaded from: classes2.dex */
class C3145k implements x2 {

    /* JADX INFO: renamed from: k */
    private final Set<qrj> f18898k = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: n */
    private boolean f18899n;

    /* JADX INFO: renamed from: q */
    private boolean f18900q;

    C3145k() {
    }

    @Override // com.bumptech.glide.manager.x2
    /* JADX INFO: renamed from: k */
    public void mo11072k(@lvui qrj qrjVar) {
        this.f18898k.remove(qrjVar);
    }

    /* JADX INFO: renamed from: n */
    void m11102n() {
        this.f18900q = false;
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18898k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).onStop();
        }
    }

    /* JADX INFO: renamed from: q */
    void m11103q() {
        this.f18900q = true;
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18898k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).mo10580k();
        }
    }

    @Override // com.bumptech.glide.manager.x2
    public void toq(@lvui qrj qrjVar) {
        this.f18898k.add(qrjVar);
        if (this.f18899n) {
            qrjVar.onDestroy();
        } else if (this.f18900q) {
            qrjVar.mo10580k();
        } else {
            qrjVar.onStop();
        }
    }

    void zy() {
        this.f18899n = true;
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18898k).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).onDestroy();
        }
    }
}
