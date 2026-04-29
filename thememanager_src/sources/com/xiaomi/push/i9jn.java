package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class i9jn implements kbj, qh4d {

    /* JADX INFO: renamed from: k */
    private Context f33022k;

    public i9jn(Context context) {
        this.f33022k = context;
    }

    @Override // com.xiaomi.push.kbj
    /* JADX INFO: renamed from: k */
    public void mo20972k(xtb7 xtb7Var) {
        yqrt.m22058k(this.f33022k);
    }

    @Override // com.xiaomi.push.qh4d
    /* JADX INFO: renamed from: k */
    public boolean mo20973k(xtb7 xtb7Var) {
        return true;
    }

    @Override // com.xiaomi.push.kbj
    public void toq(o5 o5Var) {
        if (o5Var != null && o5Var.m21348k() == 0 && "PING".equals(o5Var.m21349n())) {
            yqrt.m22062y(this.f33022k);
        } else {
            yqrt.m22058k(this.f33022k);
        }
    }
}
