package com.android.thememanager.basemodule.base;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.base.n */
/* JADX INFO: compiled from: BaseListAdapterHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1718n {

    /* JADX INFO: renamed from: k */
    private final InterfaceC1719p f9869k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f57508toq;

    public C1718n(@lvui InterfaceC1719p viewContainer) {
        this.f9869k = viewContainer;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public Activity m6716k() {
        Object obj = this.f9869k;
        return obj instanceof Fragment ? ((Fragment) obj).getActivity() : (Activity) obj;
    }

    /* JADX INFO: renamed from: n */
    public void m6717n(boolean fromEditEntrance) {
        this.f57508toq = fromEditEntrance;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6718q() {
        return this.f57508toq;
    }

    @dd
    public Context toq() {
        return m6716k();
    }

    @lvui
    public InterfaceC1719p zy() {
        return this.f9869k;
    }
}
