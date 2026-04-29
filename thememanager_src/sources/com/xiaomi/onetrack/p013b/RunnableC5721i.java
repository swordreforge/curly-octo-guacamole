package com.xiaomi.onetrack.p013b;

import com.xiaomi.onetrack.util.C5804p;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.i */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5721i implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ArrayList f31952a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5720h f31953b;

    RunnableC5721i(C5720h c5720h, ArrayList arrayList) {
        this.f31953b = c5720h;
        this.f31952a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (C5804p.f32410a) {
            C5804p.m20342a("ConfigDbManager", "update: " + this.f31952a);
        }
        this.f31953b.m19913b((ArrayList<C5724l>) this.f31952a);
    }
}
