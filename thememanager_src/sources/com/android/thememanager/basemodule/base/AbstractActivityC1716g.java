package com.android.thememanager.basemodule.base;

import android.os.Bundle;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.base.InterfaceC1720q.k;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.base.g */
/* JADX INFO: compiled from: BaseMVPActivity.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1716g<P extends InterfaceC1720q.k> extends AbstractActivityC1717k implements InterfaceC1720q.toq<P> {

    /* JADX INFO: renamed from: r */
    private P f9856r;

    @dd
    protected P g1() {
        return this.f9856r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P pUv6 = uv6();
        this.f9856r = pUv6;
        pUv6.cdj(this);
        this.f9856r.o1t(getLifecycle());
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        this.f9856r.fu4();
        this.f9856r.ni7(getLifecycle());
        this.f9856r = null;
        super.onDestroy();
    }
}
