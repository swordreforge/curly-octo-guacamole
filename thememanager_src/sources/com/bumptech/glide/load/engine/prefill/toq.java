package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.engine.prefill.C3041q;
import com.bumptech.glide.util.kja0;
import java.util.HashMap;
import zy.yz;

/* JADX INFO: compiled from: BitmapPreFiller.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3018p f18458k;

    /* JADX INFO: renamed from: q */
    private RunnableC3040k f18459q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3008n f62804toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.load.toq f62805zy;

    public toq(InterfaceC3018p interfaceC3018p, InterfaceC3008n interfaceC3008n, com.bumptech.glide.load.toq toqVar) {
        this.f18458k = interfaceC3018p;
        this.f62804toq = interfaceC3008n;
        this.f62805zy = toqVar;
    }

    private static int toq(C3041q c3041q) {
        return kja0.f7l8(c3041q.m10804q(), c3041q.toq(), c3041q.m10803k());
    }

    @yz
    /* JADX INFO: renamed from: k */
    zy m10807k(C3041q... c3041qArr) {
        long jMo10715n = (this.f18458k.mo10715n() - this.f18458k.mo10716q()) + this.f62804toq.mo10668n();
        int iZy = 0;
        for (C3041q c3041q : c3041qArr) {
            iZy += c3041q.zy();
        }
        float f2 = jMo10715n / iZy;
        HashMap map = new HashMap();
        for (C3041q c3041q2 : c3041qArr) {
            map.put(c3041q2, Integer.valueOf(Math.round(c3041q2.zy() * f2) / toq(c3041q2)));
        }
        return new zy(map);
    }

    public void zy(C3041q.k... kVarArr) {
        RunnableC3040k runnableC3040k = this.f18459q;
        if (runnableC3040k != null) {
            runnableC3040k.toq();
        }
        C3041q[] c3041qArr = new C3041q[kVarArr.length];
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            C3041q.k kVar = kVarArr[i2];
            if (kVar.toq() == null) {
                kVar.zy(this.f62805zy == com.bumptech.glide.load.toq.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            c3041qArr[i2] = kVar.m10805k();
        }
        RunnableC3040k runnableC3040k2 = new RunnableC3040k(this.f62804toq, this.f18458k, m10807k(c3041qArr));
        this.f18459q = runnableC3040k2;
        kja0.fu4(runnableC3040k2);
    }
}
