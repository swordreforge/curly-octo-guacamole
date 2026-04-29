package com.tencent.mm.opensdk.diffdev.p008a;

import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5366c implements Runnable {
    final /* synthetic */ C5365b ac;

    RunnableC5366c(C5365b c5365b) {
        this.ac = c5365b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.ac.f72525ab.f29899Y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OAuthListener) it.next()).onQrcodeScanned();
        }
    }
}
