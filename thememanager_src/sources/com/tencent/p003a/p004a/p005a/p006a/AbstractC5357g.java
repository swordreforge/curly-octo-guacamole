package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;

/* JADX INFO: renamed from: com.tencent.a.a.a.a.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5357g {

    /* JADX INFO: renamed from: k */
    protected Context f29894k;

    protected AbstractC5357g(Context context) {
        this.f29894k = context;
    }

    /* JADX INFO: renamed from: k */
    public final void m18227k(zy zyVar) {
        if (zyVar == null) {
            return;
        }
        String string = zyVar.toString();
        if (zy()) {
            toq(C5361y.m18235s(string));
        }
    }

    /* JADX INFO: renamed from: n */
    public final zy m18228n() {
        String strM18236y = zy() ? C5361y.m18236y(mo18229q()) : null;
        if (strM18236y != null) {
            return zy.toq(strM18236y);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    protected abstract String mo18229q();

    protected abstract void toq(String str);

    protected abstract boolean zy();
}
