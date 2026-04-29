package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.f7l8;
import com.google.android.exoplayer2.drm.fn3e;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.upstream.C3821t;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.ab;
import com.google.common.collect.g0ad;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y */
/* JADX INFO: compiled from: DefaultDrmSessionManager.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
public class C3329y implements fn3e {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f63638a9 = 3;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final long f63639fti = 300000;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f63640jk = 3;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f63641jp0y = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f63642mcp = 2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f63643o1t = "PRCustomData";

    /* JADX INFO: renamed from: t */
    public static final int f19706t = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f63644wvg = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f63645cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f63646f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private Looper f63647fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @zy.dd
    private byte[] f63648fu4;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, String> f19707g;

    /* JADX INFO: renamed from: h */
    private final Set<com.google.android.exoplayer2.drm.f7l8> f19708h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private com.google.android.exoplayer2.drm.f7l8 f19709i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @zy.dd
    private wvg f63649ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final Set<f7l8> f63650kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.d3 f63651ld6;

    /* JADX INFO: renamed from: n */
    private final lvui f19710n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final List<com.google.android.exoplayer2.drm.f7l8> f63652n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f63653ni7;

    /* JADX INFO: renamed from: p */
    private final y f19711p;

    /* JADX INFO: renamed from: q */
    private final wvg.f7l8 f19712q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final long f63654qrj;

    /* JADX INFO: renamed from: s */
    private final boolean f19713s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.drm.f7l8 f63655t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final s f63656x2;

    /* JADX INFO: renamed from: y */
    private final int[] f19714y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    volatile q f19715z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private Handler f63657zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final UUID f63658zy;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$f7l8 */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    class f7l8 implements fn3e.toq {

        /* JADX INFO: renamed from: q */
        private boolean f19717q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private final InterfaceC3312i.k f63659toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private qrj f63660zy;

        public f7l8(@zy.dd InterfaceC3312i.k kVar) {
            this.f63659toq = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8() {
            if (this.f19717q) {
                return;
            }
            qrj qrjVar = this.f63660zy;
            if (qrjVar != null) {
                qrjVar.toq(this.f63659toq);
            }
            C3329y.this.f63650kja0.remove(this);
            this.f19717q = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m11663g(xwq3 xwq3Var) {
            if (C3329y.this.f63645cdj == 0 || this.f19717q) {
                return;
            }
            C3329y c3329y = C3329y.this;
            this.f63660zy = c3329y.t8r((Looper) C3844k.f7l8(c3329y.f63647fn3e), this.f63659toq, xwq3Var, false);
            C3329y.this.f63650kja0.add(this);
        }

        /* JADX INFO: renamed from: n */
        public void m11665n(final xwq3 xwq3Var) {
            ((Handler) C3844k.f7l8(C3329y.this.f63657zurt)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19679k.m11663g(xwq3Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.fn3e.toq
        public void release() {
            lrht.gc3c((Handler) C3844k.f7l8(C3329y.this.f63657zurt), new Runnable() { // from class: com.google.android.exoplayer2.drm.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19685k.f7l8();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$g */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$n */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public static final class n extends Exception {
        private n(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
            sb.append("Media does not support uuid: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$q */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    private class q extends Handler {
        public q(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.google.android.exoplayer2.drm.f7l8 f7l8Var : C3329y.this.f63652n7h) {
                if (f7l8Var.t8r(bArr)) {
                    f7l8Var.wvg(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$s */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    class s implements f7l8.toq {
        private s() {
        }

        @Override // com.google.android.exoplayer2.drm.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo11618k(com.google.android.exoplayer2.drm.f7l8 f7l8Var, int i2) {
            if (C3329y.this.f63654qrj != C3548p.f65257toq) {
                C3329y.this.f19708h.remove(f7l8Var);
                ((Handler) C3844k.f7l8(C3329y.this.f63657zurt)).removeCallbacksAndMessages(f7l8Var);
            }
        }

        @Override // com.google.android.exoplayer2.drm.f7l8.toq
        public void toq(final com.google.android.exoplayer2.drm.f7l8 f7l8Var, int i2) {
            if (i2 == 1 && C3329y.this.f63645cdj > 0 && C3329y.this.f63654qrj != C3548p.f65257toq) {
                C3329y.this.f19708h.add(f7l8Var);
                ((Handler) C3844k.f7l8(C3329y.this.f63657zurt)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.ld6
                    @Override // java.lang.Runnable
                    public final void run() {
                        f7l8Var.toq(null);
                    }
                }, f7l8Var, SystemClock.uptimeMillis() + C3329y.this.f63654qrj);
            } else if (i2 == 0) {
                C3329y.this.f63652n7h.remove(f7l8Var);
                if (C3329y.this.f63655t8r == f7l8Var) {
                    C3329y.this.f63655t8r = null;
                }
                if (C3329y.this.f19709i == f7l8Var) {
                    C3329y.this.f19709i = null;
                }
                C3329y.this.f19711p.m11672q(f7l8Var);
                if (C3329y.this.f63654qrj != C3548p.f65257toq) {
                    ((Handler) C3844k.f7l8(C3329y.this.f63657zurt)).removeCallbacksAndMessages(f7l8Var);
                    C3329y.this.f19708h.remove(f7l8Var);
                }
            }
            C3329y.this.m11660t();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$toq */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    public static final class toq {

        /* JADX INFO: renamed from: g */
        private boolean f19720g;

        /* JADX INFO: renamed from: q */
        private boolean f19723q;

        /* JADX INFO: renamed from: k */
        private final HashMap<String, String> f19721k = new HashMap<>();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private UUID f63662toq = C3548p.f65247r25n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private wvg.f7l8 f63663zy = d3.f63585ld6;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.d3 f63661f7l8 = new C3821t();

        /* JADX INFO: renamed from: n */
        private int[] f19722n = new int[0];

        /* JADX INFO: renamed from: y */
        private long f19724y = 300000;

        public toq f7l8(int... iArr) {
            for (int i2 : iArr) {
                boolean z2 = true;
                if (i2 != 2 && i2 != 1) {
                    z2 = false;
                }
                C3844k.m13629k(z2);
            }
            this.f19722n = (int[]) iArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m11667g(long j2) {
            C3844k.m13629k(j2 > 0 || j2 == C3548p.f65257toq);
            this.f19724y = j2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C3329y m11668k(lvui lvuiVar) {
            return new C3329y(this.f63662toq, this.f63663zy, lvuiVar, this.f19721k, this.f19723q, this.f19722n, this.f19720g, this.f63661f7l8, this.f19724y);
        }

        /* JADX INFO: renamed from: n */
        public toq m11669n(boolean z2) {
            this.f19720g = z2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m11670q(boolean z2) {
            this.f19723q = z2;
            return this;
        }

        public toq toq(@zy.dd Map<String, String> map) {
            this.f19721k.clear();
            if (map != null) {
                this.f19721k.putAll(map);
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m11671y(UUID uuid, wvg.f7l8 f7l8Var) {
            this.f63662toq = (UUID) C3844k.f7l8(uuid);
            this.f63663zy = (wvg.f7l8) C3844k.f7l8(f7l8Var);
            return this;
        }

        public toq zy(com.google.android.exoplayer2.upstream.d3 d3Var) {
            this.f63661f7l8 = (com.google.android.exoplayer2.upstream.d3) C3844k.f7l8(d3Var);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$y */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    private class y implements f7l8.InterfaceC3304k {

        /* JADX INFO: renamed from: k */
        private final Set<com.google.android.exoplayer2.drm.f7l8> f19725k = new HashSet();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private com.google.android.exoplayer2.drm.f7l8 f63664toq;

        public y(C3329y c3329y) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.f7l8.InterfaceC3304k
        /* JADX INFO: renamed from: k */
        public void mo11617k(Exception exc, boolean z2) {
            this.f63664toq = null;
            se seVarCopyOf = se.copyOf((Collection) this.f19725k);
            this.f19725k.clear();
            ab it = seVarCopyOf.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.f7l8) it.next()).mcp(exc, z2);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m11672q(com.google.android.exoplayer2.drm.f7l8 f7l8Var) {
            this.f19725k.remove(f7l8Var);
            if (this.f63664toq == f7l8Var) {
                this.f63664toq = null;
                if (this.f19725k.isEmpty()) {
                    return;
                }
                com.google.android.exoplayer2.drm.f7l8 next = this.f19725k.iterator().next();
                this.f63664toq = next;
                next.jp0y();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f7l8.InterfaceC3304k
        public void toq(com.google.android.exoplayer2.drm.f7l8 f7l8Var) {
            this.f19725k.add(f7l8Var);
            if (this.f63664toq != null) {
                return;
            }
            this.f63664toq = f7l8Var;
            f7l8Var.jp0y();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.f7l8.InterfaceC3304k
        public void zy() {
            this.f63664toq = null;
            se seVarCopyOf = se.copyOf((Collection) this.f19725k);
            this.f19725k.clear();
            ab it = seVarCopyOf.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.f7l8) it.next()).m11616t();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.y$zy */
    /* JADX INFO: compiled from: DefaultDrmSessionManager.java */
    private class zy implements wvg.InterfaceC3325q {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.drm.wvg.InterfaceC3325q
        /* JADX INFO: renamed from: k */
        public void mo11649k(wvg wvgVar, @zy.dd byte[] bArr, int i2, int i3, @zy.dd byte[] bArr2) {
            ((q) C3844k.f7l8(C3329y.this.f19715z)).obtainMessage(i2, bArr).sendToTarget();
        }
    }

    private boolean fn3e(DrmInitData drmInitData) {
        if (this.f63648fu4 != null) {
            return true;
        }
        if (fu4(drmInitData, this.f63658zy, true).isEmpty()) {
            if (drmInitData.f19621g != 1 || !drmInitData.f7l8(0).m11584g(C3548p.f65129b8)) {
                return false;
            }
            String strValueOf = String.valueOf(this.f63658zy);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(strValueOf);
            com.google.android.exoplayer2.util.ni7.qrj(f63641jp0y, sb.toString());
        }
        String str = drmInitData.f19623n;
        if (str == null || C3548p.f65236oki.equals(str)) {
            return true;
        }
        return C3548p.f65146cnbm.equals(str) ? lrht.f23230k >= 25 : (C3548p.f65231o05.equals(str) || C3548p.f65214m58i.equals(str)) ? false : true;
    }

    private void fti(qrj qrjVar, @zy.dd InterfaceC3312i.k kVar) {
        qrjVar.toq(kVar);
        if (this.f63654qrj != C3548p.f65257toq) {
            qrjVar.toq(null);
        }
    }

    private static List<DrmInitData.SchemeData> fu4(DrmInitData drmInitData, UUID uuid, boolean z2) {
        ArrayList arrayList = new ArrayList(drmInitData.f19621g);
        for (int i2 = 0; i2 < drmInitData.f19621g; i2++) {
            DrmInitData.SchemeData schemeDataF7l8 = drmInitData.f7l8(i2);
            if ((schemeDataF7l8.m11584g(uuid) || (C3548p.f65226nme.equals(uuid) && schemeDataF7l8.m11584g(C3548p.f65129b8))) && (schemeDataF7l8.f19629y != null || z2)) {
                arrayList.add(schemeDataF7l8);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m11656i(qrj qrjVar) {
        return qrjVar.getState() == 1 && (lrht.f23230k < 19 || (((qrj.C3318k) C3844k.f7l8(qrjVar.mo11610g())).getCause() instanceof ResourceBusyException));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void jk() {
        ab it = vep5.copyOf((Collection) this.f63650kja0).iterator();
        while (it.hasNext()) {
            ((f7l8) it.next()).release();
        }
    }

    private void mcp() {
        ab it = vep5.copyOf((Collection) this.f19708h).iterator();
        while (it.hasNext()) {
            ((qrj) it.next()).toq(null);
        }
    }

    private com.google.android.exoplayer2.drm.f7l8 ni7(@zy.dd List<DrmInitData.SchemeData> list, boolean z2, @zy.dd InterfaceC3312i.k kVar, boolean z3) {
        com.google.android.exoplayer2.drm.f7l8 f7l8VarZurt = zurt(list, z2, kVar);
        if (m11656i(f7l8VarZurt) && !this.f19708h.isEmpty()) {
            mcp();
            fti(f7l8VarZurt, kVar);
            f7l8VarZurt = zurt(list, z2, kVar);
        }
        if (!m11656i(f7l8VarZurt) || !z3 || this.f63650kja0.isEmpty()) {
            return f7l8VarZurt;
        }
        jk();
        if (!this.f19708h.isEmpty()) {
            mcp();
        }
        fti(f7l8VarZurt, kVar);
        return zurt(list, z2, kVar);
    }

    @zy.dd
    private qrj o1t(int i2, boolean z2) {
        wvg wvgVar = (wvg) C3844k.f7l8(this.f63649ki);
        if ((wvgVar.ld6() == 2 && C3321t.f19686q) || lrht.gbni(this.f19714y, i2) == -1 || wvgVar.ld6() == 1) {
            return null;
        }
        com.google.android.exoplayer2.drm.f7l8 f7l8Var = this.f63655t8r;
        if (f7l8Var == null) {
            com.google.android.exoplayer2.drm.f7l8 f7l8VarNi7 = ni7(se.of(), true, null, z2);
            this.f63652n7h.add(f7l8VarNi7);
            this.f63655t8r = f7l8VarNi7;
        } else {
            f7l8Var.mo11611k(null);
        }
        return this.f63655t8r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m11660t() {
        if (this.f63649ki != null && this.f63645cdj == 0 && this.f63652n7h.isEmpty() && this.f63650kja0.isEmpty()) {
            ((wvg) C3844k.f7l8(this.f63649ki)).release();
            this.f63649ki = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @zy.dd
    public qrj t8r(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var, boolean z2) {
        List<DrmInitData.SchemeData> listFu4;
        wvg(looper);
        DrmInitData drmInitData = xwq3Var.f23667c;
        if (drmInitData == null) {
            return o1t(com.google.android.exoplayer2.util.wvg.x2(xwq3Var.f23682r), z2);
        }
        com.google.android.exoplayer2.drm.f7l8 f7l8VarNi7 = null;
        Object[] objArr = 0;
        if (this.f63648fu4 == null) {
            listFu4 = fu4((DrmInitData) C3844k.f7l8(drmInitData), this.f63658zy, false);
            if (listFu4.isEmpty()) {
                n nVar = new n(this.f63658zy);
                com.google.android.exoplayer2.util.ni7.m13700n(f63641jp0y, "DRM error", nVar);
                if (kVar != null) {
                    kVar.x2(nVar);
                }
                return new o1t(new qrj.C3318k(nVar, 6003));
            }
        } else {
            listFu4 = null;
        }
        if (this.f63646f7l8) {
            Iterator<com.google.android.exoplayer2.drm.f7l8> it = this.f63652n7h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.f7l8 next = it.next();
                if (lrht.zy(next.f19641g, listFu4)) {
                    f7l8VarNi7 = next;
                    break;
                }
            }
        } else {
            f7l8VarNi7 = this.f19709i;
        }
        if (f7l8VarNi7 == null) {
            f7l8VarNi7 = ni7(listFu4, false, kVar, z2);
            if (!this.f63646f7l8) {
                this.f19709i = f7l8VarNi7;
            }
            this.f63652n7h.add(f7l8VarNi7);
        } else {
            f7l8VarNi7.mo11611k(kVar);
        }
        return f7l8VarNi7;
    }

    private void wvg(Looper looper) {
        if (this.f19715z == null) {
            this.f19715z = new q(looper);
        }
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* JADX INFO: renamed from: z */
    private synchronized void m11662z(Looper looper) {
        Looper looper2 = this.f63647fn3e;
        if (looper2 == null) {
            this.f63647fn3e = looper;
            this.f63657zurt = new Handler(looper);
        } else {
            C3844k.m13633s(looper2 == looper);
            C3844k.f7l8(this.f63657zurt);
        }
    }

    private com.google.android.exoplayer2.drm.f7l8 zurt(@zy.dd List<DrmInitData.SchemeData> list, boolean z2, @zy.dd InterfaceC3312i.k kVar) {
        C3844k.f7l8(this.f63649ki);
        com.google.android.exoplayer2.drm.f7l8 f7l8Var = new com.google.android.exoplayer2.drm.f7l8(this.f63658zy, this.f63649ki, this.f19711p, this.f63656x2, list, this.f63653ni7, this.f19713s | z2, z2, this.f63648fu4, this.f19707g, this.f19710n, (Looper) C3844k.f7l8(this.f63647fn3e), this.f63651ld6);
        f7l8Var.mo11611k(kVar);
        if (this.f63654qrj != C3548p.f65257toq) {
            f7l8Var.mo11611k(null);
        }
        return f7l8Var;
    }

    public void a9(int i2, @zy.dd byte[] bArr) {
        C3844k.m13633s(this.f63652n7h.isEmpty());
        if (i2 == 1 || i2 == 3) {
            C3844k.f7l8(bArr);
        }
        this.f63653ni7 = i2;
        this.f63648fu4 = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.fn3e
    @zy.dd
    /* JADX INFO: renamed from: k */
    public qrj mo11620k(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var) {
        C3844k.m13633s(this.f63645cdj > 0);
        m11662z(looper);
        return t8r(looper, kVar, xwq3Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.fn3e
    public final void prepare() {
        int i2 = this.f63645cdj;
        this.f63645cdj = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.f63649ki == null) {
            wvg wvgVarMo11623k = this.f19712q.mo11623k(this.f63658zy);
            this.f63649ki = wvgVarMo11623k;
            wvgVarMo11623k.mo11598y(new zy());
        } else if (this.f63654qrj != C3548p.f65257toq) {
            for (int i3 = 0; i3 < this.f63652n7h.size(); i3++) {
                this.f63652n7h.get(i3).mo11611k(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.fn3e
    /* JADX INFO: renamed from: q */
    public fn3e.toq mo11621q(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var) {
        C3844k.m13633s(this.f63645cdj > 0);
        m11662z(looper);
        f7l8 f7l8Var = new f7l8(kVar);
        f7l8Var.m11665n(xwq3Var);
        return f7l8Var;
    }

    @Override // com.google.android.exoplayer2.drm.fn3e
    public final void release() {
        int i2 = this.f63645cdj - 1;
        this.f63645cdj = i2;
        if (i2 != 0) {
            return;
        }
        if (this.f63654qrj != C3548p.f65257toq) {
            ArrayList arrayList = new ArrayList(this.f63652n7h);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((com.google.android.exoplayer2.drm.f7l8) arrayList.get(i3)).toq(null);
            }
        }
        jk();
        m11660t();
    }

    @Override // com.google.android.exoplayer2.drm.fn3e
    public int toq(xwq3 xwq3Var) {
        int iLd6 = ((wvg) C3844k.f7l8(this.f63649ki)).ld6();
        DrmInitData drmInitData = xwq3Var.f23667c;
        if (drmInitData != null) {
            if (fn3e(drmInitData)) {
                return iLd6;
            }
            return 1;
        }
        if (lrht.gbni(this.f19714y, com.google.android.exoplayer2.util.wvg.x2(xwq3Var.f23682r)) != -1) {
            return iLd6;
        }
        return 0;
    }

    @Deprecated
    public C3329y(UUID uuid, wvg wvgVar, lvui lvuiVar, @zy.dd HashMap<String, String> map) {
        this(uuid, wvgVar, lvuiVar, map == null ? new HashMap<>() : map, false, 3);
    }

    @Deprecated
    public C3329y(UUID uuid, wvg wvgVar, lvui lvuiVar, @zy.dd HashMap<String, String> map, boolean z2) {
        this(uuid, wvgVar, lvuiVar, map == null ? new HashMap<>() : map, z2, 3);
    }

    @Deprecated
    public C3329y(UUID uuid, wvg wvgVar, lvui lvuiVar, @zy.dd HashMap<String, String> map, boolean z2, int i2) {
        this(uuid, new wvg.C3323k(wvgVar), lvuiVar, map == null ? new HashMap<>() : map, z2, new int[0], false, new C3821t(i2), 300000L);
    }

    private C3329y(UUID uuid, wvg.f7l8 f7l8Var, lvui lvuiVar, HashMap<String, String> map, boolean z2, int[] iArr, boolean z3, com.google.android.exoplayer2.upstream.d3 d3Var, long j2) {
        C3844k.f7l8(uuid);
        C3844k.toq(!C3548p.f65129b8.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63658zy = uuid;
        this.f19712q = f7l8Var;
        this.f19710n = lvuiVar;
        this.f19707g = map;
        this.f63646f7l8 = z2;
        this.f19714y = iArr;
        this.f19713s = z3;
        this.f63651ld6 = d3Var;
        this.f19711p = new y(this);
        this.f63656x2 = new s();
        this.f63653ni7 = 0;
        this.f63652n7h = new ArrayList();
        this.f63650kja0 = g0ad.o1t();
        this.f19708h = g0ad.o1t();
        this.f63654qrj = j2;
    }
}
