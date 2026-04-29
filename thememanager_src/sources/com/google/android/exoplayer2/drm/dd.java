package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.google.android.exoplayer2.drm.C3329y;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.Map;
import java.util.UUID;
import zy.hyr;

/* JADX INFO: compiled from: OfflineLicenseHelper.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
public final class dd {

    /* JADX INFO: renamed from: n */
    private static final xwq3 f19637n = new xwq3.toq().lvui(new DrmInitData(new DrmInitData.SchemeData[0])).a9();

    /* JADX INFO: renamed from: k */
    private final ConditionVariable f19638k;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3312i.k f19639q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3329y f63590toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final HandlerThread f63591zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.dd$k */
    /* JADX INFO: compiled from: OfflineLicenseHelper.java */
    class C3302k implements InterfaceC3312i {
        C3302k() {
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        /* JADX INFO: renamed from: b */
        public void mo11362b(int i2, @zy.dd fti.C3596k c3596k) {
            dd.this.f19638k.open();
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void d3(int i2, @zy.dd fti.C3596k c3596k) {
            dd.this.f19638k.open();
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void nn86(int i2, @zy.dd fti.C3596k c3596k, Exception exc) {
            dd.this.f19638k.open();
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void t8iq(int i2, @zy.dd fti.C3596k c3596k) {
            dd.this.f19638k.open();
        }
    }

    @Deprecated
    public dd(UUID uuid, wvg.f7l8 f7l8Var, lvui lvuiVar, @zy.dd Map<String, String> map, InterfaceC3312i.k kVar) {
        this(new C3329y.toq().m11671y(uuid, f7l8Var).toq(map).m11668k(lvuiVar), kVar);
    }

    public static dd f7l8(String str, boolean z2, jp0y.zy zyVar, @zy.dd Map<String, String> map, InterfaceC3312i.k kVar) {
        return new dd(new C3329y.toq().toq(map).m11668k(new oc(str, z2, zyVar)), kVar);
    }

    /* JADX INFO: renamed from: g */
    public static dd m11600g(String str, boolean z2, jp0y.zy zyVar, InterfaceC3312i.k kVar) {
        return f7l8(str, z2, zyVar, null, kVar);
    }

    /* JADX INFO: renamed from: n */
    public static dd m11602n(String str, jp0y.zy zyVar, InterfaceC3312i.k kVar) {
        return m11600g(str, false, zyVar, kVar);
    }

    private byte[] toq(int i2, @zy.dd byte[] bArr, xwq3 xwq3Var) throws qrj.C3318k {
        this.f63590toq.prepare();
        qrj qrjVarM11603y = m11603y(i2, bArr, xwq3Var);
        qrj.C3318k c3318kMo11610g = qrjVarM11603y.mo11610g();
        byte[] bArrMo11612n = qrjVarM11603y.mo11612n();
        qrjVarM11603y.toq(this.f19639q);
        this.f63590toq.release();
        if (c3318kMo11610g == null) {
            return (byte[]) C3844k.f7l8(bArrMo11612n);
        }
        throw c3318kMo11610g;
    }

    /* JADX INFO: renamed from: y */
    private qrj m11603y(int i2, @zy.dd byte[] bArr, xwq3 xwq3Var) {
        C3844k.f7l8(xwq3Var.f23667c);
        this.f63590toq.a9(i2, bArr);
        this.f19638k.close();
        qrj qrjVarMo11620k = this.f63590toq.mo11620k(this.f63591zy.getLooper(), this.f19639q, xwq3Var);
        this.f19638k.block();
        return (qrj) C3844k.f7l8(qrjVarMo11620k);
    }

    public synchronized byte[] ld6(byte[] bArr) throws qrj.C3318k {
        C3844k.f7l8(bArr);
        return toq(2, bArr, f19637n);
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m11604p(byte[] bArr) throws qrj.C3318k {
        C3844k.f7l8(bArr);
        toq(3, bArr, f19637n);
    }

    /* JADX INFO: renamed from: q */
    public synchronized Pair<Long, Long> m11605q(byte[] bArr) throws qrj.C3318k {
        C3844k.f7l8(bArr);
        this.f63590toq.prepare();
        qrj qrjVarM11603y = m11603y(1, bArr, f19637n);
        qrj.C3318k c3318kMo11610g = qrjVarM11603y.mo11610g();
        Pair<Long, Long> qVar = ncyb.toq(qrjVarM11603y);
        qrjVarM11603y.toq(this.f19639q);
        this.f63590toq.release();
        if (c3318kMo11610g == null) {
            return (Pair) C3844k.f7l8(qVar);
        }
        if (!(c3318kMo11610g.getCause() instanceof eqxt)) {
            throw c3318kMo11610g;
        }
        return Pair.create(0L, 0L);
    }

    /* JADX INFO: renamed from: s */
    public void m11606s() {
        this.f63591zy.quit();
    }

    public synchronized byte[] zy(xwq3 xwq3Var) throws qrj.C3318k {
        C3844k.m13629k(xwq3Var.f23667c != null);
        return toq(2, null, xwq3Var);
    }

    public dd(C3329y c3329y, InterfaceC3312i.k kVar) {
        this.f63590toq = c3329y;
        this.f19639q = kVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f63591zy = handlerThread;
        handlerThread.start();
        this.f19638k = new ConditionVariable();
        kVar.f7l8(new Handler(handlerThread.getLooper()), new C3302k());
    }
}
