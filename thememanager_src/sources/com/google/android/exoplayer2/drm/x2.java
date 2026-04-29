package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.android.thememanager.util.yz;
import com.google.android.exoplayer2.drm.C3329y;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.collect.ab;
import com.google.common.primitives.C4746s;
import java.util.Map;
import zy.hyr;

/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements ni7 {

    /* JADX INFO: renamed from: k */
    private final Object f19703k = new Object();

    /* JADX INFO: renamed from: n */
    @zy.dd
    private String f19704n;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private jp0y.zy f19705q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    private tfm.C3693g f63636toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    private fn3e f63637zy;

    @hyr(18)
    private fn3e toq(tfm.C3693g c3693g) {
        jp0y.zy zyVarLd6 = this.f19705q;
        if (zyVarLd6 == null) {
            zyVarLd6 = new C3827z.toq().ld6(this.f19704n);
        }
        Uri uri = c3693g.f65978zy;
        oc ocVar = new oc(uri == null ? null : uri.toString(), c3693g.f22174y, zyVarLd6);
        ab<Map.Entry<String, String>> it = c3693g.f22170n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            ocVar.f7l8(next.getKey(), next.getValue());
        }
        C3329y c3329yM11668k = new C3329y.toq().m11671y(c3693g.f22169k, d3.f63585ld6).m11670q(c3693g.f22168g).m11669n(c3693g.f65975f7l8).f7l8(C4746s.m16720t(c3693g.f22171p)).m11668k(ocVar);
        c3329yM11668k.a9(0, c3693g.zy());
        return c3329yM11668k;
    }

    @Override // com.google.android.exoplayer2.drm.ni7
    /* JADX INFO: renamed from: k */
    public fn3e mo11642k(tfm tfmVar) {
        fn3e fn3eVar;
        C3844k.f7l8(tfmVar.f22150q);
        tfm.C3693g c3693g = tfmVar.f22150q.f65992zy;
        if (c3693g == null || lrht.f23230k < 18) {
            return fn3e.f19654k;
        }
        synchronized (this.f19703k) {
            if (!lrht.zy(c3693g, this.f63636toq)) {
                this.f63636toq = c3693g;
                this.f63637zy = toq(c3693g);
            }
            fn3eVar = (fn3e) C3844k.f7l8(this.f63637zy);
        }
        return fn3eVar;
    }

    /* JADX INFO: renamed from: q */
    public void m11653q(@zy.dd String str) {
        this.f19704n = str;
    }

    public void zy(@zy.dd jp0y.zy zyVar) {
        this.f19705q = zyVar;
    }
}
