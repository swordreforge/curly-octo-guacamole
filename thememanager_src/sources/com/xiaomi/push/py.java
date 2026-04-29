package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class py implements kbj, qh4d {

    /* JADX INFO: renamed from: k */
    private Context f33569k;

    public py(Context context) {
        this.f33569k = context;
    }

    @Override // com.xiaomi.push.kbj
    /* JADX INFO: renamed from: k */
    public void mo20972k(xtb7 xtb7Var) {
        yqrt.m22059n(this.f33569k);
    }

    @Override // com.xiaomi.push.qh4d
    /* JADX INFO: renamed from: k */
    public boolean mo20973k(xtb7 xtb7Var) {
        return true;
    }

    @Override // com.xiaomi.push.kbj
    public void toq(o5 o5Var) {
        if (o5Var != null && o5Var.m21348k() == 0 && "PING".equals(o5Var.m21349n())) {
            yqrt.m22061s(this.f33569k);
        } else {
            yqrt.m22059n(this.f33569k);
        }
    }
}
