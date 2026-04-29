package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.util.C5782o;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: loaded from: classes3.dex */
class ab implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31639a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31640b;

    ab(C5699m c5699m, String str) {
        this.f31640b = c5699m;
        this.f31639a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C5782o.m20286a().m20291a(this.f31639a);
        } catch (Exception e2) {
            C5804p.m20347b("OneTrackImp", "setInstanceId error: " + e2.toString());
        }
    }
}
