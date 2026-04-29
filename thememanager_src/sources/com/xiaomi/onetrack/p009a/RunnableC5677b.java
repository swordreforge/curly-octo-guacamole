package com.xiaomi.onetrack.p009a;

import com.xiaomi.onetrack.p009a.p011b.C5678a;
import com.xiaomi.onetrack.p009a.p011b.C5679b;
import com.xiaomi.onetrack.p009a.p012c.C5682b;
import com.xiaomi.onetrack.p017f.C5757b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.b */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5677b implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5757b f31595a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5675a f31596b;

    RunnableC5677b(C5675a c5675a, C5757b c5757b) {
        this.f31596b = c5675a;
        this.f31595a = c5757b;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<C5678a> listM19679a;
        C5757b c5757b = this.f31595a;
        if ((c5757b instanceof C5679b) && (listM19679a = ((C5679b) c5757b).m19679a()) != null && listM19679a.size() > 0) {
            Iterator<C5678a> it = listM19679a.iterator();
            while (it.hasNext()) {
                this.f31596b.m19647a(it.next());
            }
        }
        C5682b.m19681a().m19683b();
    }
}
