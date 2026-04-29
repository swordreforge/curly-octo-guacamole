package com.android.thememanager.view;

import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ki implements Runnable {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t8r f17561k;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ List f17562q;

    public /* synthetic */ ki(t8r t8rVar, List list) {
        this.f17561k = t8rVar;
        this.f17562q = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f17561k.qrj(this.f17562q);
    }
}
