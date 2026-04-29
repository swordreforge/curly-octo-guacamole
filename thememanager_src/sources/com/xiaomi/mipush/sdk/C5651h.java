package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ga;
import com.xiaomi.push.service.a9;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.h */
/* JADX INFO: loaded from: classes3.dex */
class C5651h extends a9.AbstractRunnableC5906k {

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Context f31363n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5651h(int i2, String str, Context context) {
        super(i2, str);
        this.f31363n = context;
    }

    @Override // com.xiaomi.push.service.a9.AbstractRunnableC5906k
    /* JADX INFO: renamed from: k */
    protected void mo19383k() {
        ga.ld6(this.f31363n);
    }
}
