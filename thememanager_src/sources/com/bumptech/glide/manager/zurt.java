package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.InterfaceC3175h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import zy.lvui;

/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt implements qrj {

    /* JADX INFO: renamed from: k */
    private final Set<InterfaceC3175h<?>> f18909k = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: g */
    public void m11112g(@lvui InterfaceC3175h<?> interfaceC3175h) {
        this.f18909k.remove(interfaceC3175h);
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18909k).iterator();
        while (it.hasNext()) {
            ((InterfaceC3175h) it.next()).mo10580k();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11113n(@lvui InterfaceC3175h<?> interfaceC3175h) {
        this.f18909k.add(interfaceC3175h);
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onDestroy() {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18909k).iterator();
        while (it.hasNext()) {
            ((InterfaceC3175h) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onStop() {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18909k).iterator();
        while (it.hasNext()) {
            ((InterfaceC3175h) it.next()).onStop();
        }
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public List<InterfaceC3175h<?>> m11114q() {
        return com.bumptech.glide.util.kja0.ld6(this.f18909k);
    }

    public void zy() {
        this.f18909k.clear();
    }
}
