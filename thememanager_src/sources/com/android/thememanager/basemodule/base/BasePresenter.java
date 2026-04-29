package com.android.thememanager.basemodule.base;

import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.base.InterfaceC1720q.toq;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePresenter<V extends InterfaceC1720q.toq> implements InterfaceC0928g, InterfaceC1720q.k<V> {

    /* JADX INFO: renamed from: k */
    private WeakReference<V> f9843k;

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.k
    public void cdj(V view) {
        this.f9843k = new WeakReference<>(view);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.k
    public void fu4() {
        WeakReference<V> weakReference = this.f9843k;
        if (weakReference != null) {
            weakReference.clear();
            this.f9843k = null;
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.k
    public void ni7(kja0 lifecycle) {
        lifecycle.zy(this);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.k
    public void o1t(kja0 lifecycle) {
        lifecycle.mo4451k(this);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.k
    @dd
    public V zy() {
        WeakReference<V> weakReference = this.f9843k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
