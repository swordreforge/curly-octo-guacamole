package com.xiaomi.push;

import com.xiaomi.push.C5889p;
import com.xiaomi.push.y2;

/* JADX INFO: loaded from: classes3.dex */
class c8jq extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ y2 f32767k;

    c8jq(y2 y2Var) {
        this.f32767k = y2Var;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "100957";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f32767k.f34190n) {
            if (this.f32767k.f34190n.size() > 0) {
                if (this.f32767k.f34190n.size() > 1) {
                    y2 y2Var = this.f32767k;
                    y2Var.m22040y(y2Var.f34190n);
                } else {
                    y2 y2Var2 = this.f32767k;
                    y2Var2.m22039s((y2.AbstractRunnableC5962k) y2Var2.f34190n.get(0));
                }
                this.f32767k.f34190n.clear();
                System.gc();
            }
        }
    }
}
