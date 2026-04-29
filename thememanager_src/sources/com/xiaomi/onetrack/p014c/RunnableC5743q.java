package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.q */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5743q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f32059a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ HandlerC5742p f32060b;

    RunnableC5743q(HandlerC5742p handlerC5742p, boolean z2) {
        this.f32060b = handlerC5742p;
        this.f32059a = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32060b.m19981a();
        try {
            if (this.f32059a) {
                int[] iArr = {0, 1, 2};
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    int iM19931a = C5726n.m19931a(i3);
                    if (!this.f32060b.hasMessages(i3)) {
                        this.f32060b.sendEmptyMessageDelayed(i3, iM19931a);
                    }
                }
            }
        } catch (Exception e2) {
            C5804p.m20342a("UploadTimer", "netReceiver error: " + e2);
        }
    }
}
