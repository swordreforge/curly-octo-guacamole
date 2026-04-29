package com.android.thememanager.basemodule.base;

import android.os.Bundle;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.base.InterfaceC1720q.k;
import zy.dd;

/* JADX INFO: compiled from: BaseMVPFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f7l8<P extends InterfaceC1720q.k> extends toq implements InterfaceC1720q.toq<P> {

    /* JADX INFO: renamed from: t */
    private P f9855t;

    /* JADX INFO: Access modifiers changed from: protected */
    public P kiv() {
        return this.f9855t;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        z4t();
        P pUv6 = uv6();
        this.f9855t = pUv6;
        pUv6.cdj(this);
        this.f9855t.o1t(getLifecycle());
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f9855t.fu4();
        this.f9855t.ni7(getLifecycle());
        this.f9855t = null;
        super.onDestroy();
    }

    protected void z4t() {
    }
}
