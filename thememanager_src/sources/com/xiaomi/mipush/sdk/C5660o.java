package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ge;
import com.xiaomi.push.ixz;
import com.xiaomi.push.wwp;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.o */
/* JADX INFO: loaded from: classes3.dex */
public class C5660o implements ixz {

    /* JADX INFO: renamed from: k */
    private Context f31421k;

    public C5660o(Context context) {
        this.f31421k = context;
    }

    @Override // com.xiaomi.push.ixz
    /* JADX INFO: renamed from: a */
    public String mo19531a() {
        return C5656l.m19500q(this.f31421k).ni7();
    }

    @Override // com.xiaomi.push.ixz
    /* JADX INFO: renamed from: k */
    public void mo19532k(erbd erbdVar, wwp wwpVar, ge geVar) {
        d3.m19429y(this.f31421k).ni7(erbdVar, wwpVar, geVar);
    }
}
