package com.android.thememanager.basemodule.base;

import androidx.lifecycle.kja0;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.base.q */
/* JADX INFO: compiled from: BaseContract.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1720q {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.base.q$k */
    /* JADX INFO: compiled from: BaseContract.java */
    public interface k<V extends toq> {
        void cdj(V view);

        void fu4();

        void ni7(kja0 lifecycle);

        void o1t(kja0 lifecycle);

        @dd
        V zy();
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.base.q$toq */
    /* JADX INFO: compiled from: BaseContract.java */
    public interface toq<P extends k> {
        @lvui
        P uv6();
    }
}
