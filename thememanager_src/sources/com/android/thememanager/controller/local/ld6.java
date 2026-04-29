package com.android.thememanager.controller.local;

import com.android.thememanager.fu4;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ld6 implements Runnable {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f10901k;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ fu4 f10902q;

    public /* synthetic */ ld6(List list, fu4 fu4Var) {
        this.f10901k = list;
        this.f10902q = fu4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        x2.m7537q(this.f10901k, this.f10902q);
    }
}
