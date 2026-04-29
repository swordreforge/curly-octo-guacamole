package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.qrj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class kz28 extends qrj.toq {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33287k;

    kz28(Context context) {
        this.f33287k = context;
    }

    @Override // com.xiaomi.push.qrj.toq
    public void toq() {
        ArrayList arrayList;
        synchronized (z4j7.f34225q) {
            arrayList = new ArrayList(z4j7.f34224n);
            z4j7.f34224n.clear();
        }
        z4j7.kja0(this.f33287k, arrayList);
    }
}
