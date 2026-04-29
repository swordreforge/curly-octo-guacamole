package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: renamed from: com.xiaomi.push.z */
/* JADX INFO: loaded from: classes3.dex */
class C5966z {

    /* JADX INFO: renamed from: k */
    static int f34219k;

    /* JADX INFO: renamed from: k */
    public static InterfaceC5868i m22064k(Context context) {
        if (nc.m21315s()) {
            f34219k = 1;
            return new fu4(context);
        }
        if (cdj.f7l8(context)) {
            f34219k = 2;
            return new cdj(context);
        }
        if (wvg.m21976p(context)) {
            f34219k = 4;
            return new wvg(context);
        }
        if (fti.toq(context)) {
            f34219k = 5;
            return new fti(context);
        }
        if (ni7.toq(context)) {
            f34219k = 3;
            return new fn3e(context);
        }
        f34219k = 0;
        return new a9();
    }
}
