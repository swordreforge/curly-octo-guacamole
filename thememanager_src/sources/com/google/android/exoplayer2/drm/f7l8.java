package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.upstream.d3;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3852p;
import com.google.android.exoplayer2.util.InterfaceC3855s;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.hyr;

/* JADX INFO: compiled from: DefaultDrmSession.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
class f7l8 implements qrj {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f63592a9 = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f63593fti = 60;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f63594jk = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f63595mcp = "DefaultDrmSession";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    final UUID f63596cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final wvg f63597f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @zy.dd
    private HandlerThread f63598fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @zy.dd
    private qrj.C3318k f63599fu4;

    /* JADX INFO: renamed from: g */
    @zy.dd
    public final List<DrmInitData.SchemeData> f19641g;

    /* JADX INFO: renamed from: h */
    final lvui f19642h;

    /* JADX INFO: renamed from: i */
    private int f19643i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    final HandlerC3305n f63600ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.d3 f63601kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final boolean f63602ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final C3852p<InterfaceC3312i.k> f63603n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.decoder.zy f63604ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private byte[] f63605o1t;

    /* JADX INFO: renamed from: p */
    private final int f19644p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final HashMap<String, String> f63606qrj;

    /* JADX INFO: renamed from: s */
    private final toq f19645s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private wvg.C3327y f19646t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f63607t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @zy.dd
    private wvg.toq f63608wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final boolean f63609x2;

    /* JADX INFO: renamed from: y */
    private final InterfaceC3304k f19647y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private byte[] f19648z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @zy.dd
    private zy f63610zurt;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f7l8$g */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public static final class C3303g extends IOException {
        public C3303g(@zy.dd Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f7l8$k */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public interface InterfaceC3304k {
        /* JADX INFO: renamed from: k */
        void mo11617k(Exception exc, boolean z2);

        void toq(f7l8 f7l8Var);

        void zy();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f7l8$n */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    private class HandlerC3305n extends Handler {
        public HandlerC3305n(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                f7l8.this.jk(obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                f7l8.this.fu4(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f7l8$q */
    /* JADX INFO: compiled from: DefaultDrmSession.java */
    private static final class C3306q {

        /* JADX INFO: renamed from: k */
        public final long f19650k;

        /* JADX INFO: renamed from: n */
        public int f19651n;

        /* JADX INFO: renamed from: q */
        public final Object f19652q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f63611toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f63612zy;

        public C3306q(long j2, boolean z2, long j3, Object obj) {
            this.f19650k = j2;
            this.f63611toq = z2;
            this.f63612zy = j3;
            this.f19652q = obj;
        }
    }

    /* JADX INFO: compiled from: DefaultDrmSession.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo11618k(f7l8 f7l8Var, int i2);

        void toq(f7l8 f7l8Var, int i2);
    }

    /* JADX INFO: compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    private class zy extends Handler {

        /* JADX INFO: renamed from: k */
        @zy.o1t("this")
        private boolean f19653k;

        public zy(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: k */
        private boolean m11619k(Message message, C3319r c3319r) {
            C3306q c3306q = (C3306q) message.obj;
            if (!c3306q.f63611toq) {
                return false;
            }
            int i2 = c3306q.f19651n + 1;
            c3306q.f19651n = i2;
            if (i2 > f7l8.this.f63601kja0.toq(3)) {
                return false;
            }
            long jMo13457k = f7l8.this.f63601kja0.mo13457k(new d3.C3791q(new com.google.android.exoplayer2.source.ni7(c3306q.f19650k, c3319r.dataSpec, c3319r.uriAfterRedirects, c3319r.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c3306q.f63612zy, c3319r.bytesLoaded), new com.google.android.exoplayer2.source.wvg(3), c3319r.getCause() instanceof IOException ? (IOException) c3319r.getCause() : new C3303g(c3319r.getCause()), c3306q.f19651n));
            if (jMo13457k == C3548p.f65257toq) {
                return false;
            }
            synchronized (this) {
                if (this.f19653k) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMo13457k);
                return true;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objMo11587k;
            C3306q c3306q = (C3306q) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    f7l8 f7l8Var = f7l8.this;
                    objMo11587k = f7l8Var.f19642h.mo11587k(f7l8Var.f63596cdj, (wvg.C3327y) c3306q.f19652q);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    f7l8 f7l8Var2 = f7l8.this;
                    objMo11587k = f7l8Var2.f19642h.toq(f7l8Var2.f63596cdj, (wvg.toq) c3306q.f19652q);
                }
            } catch (C3319r e2) {
                boolean zM11619k = m11619k(message, e2);
                objMo11587k = e2;
                if (zM11619k) {
                    return;
                }
            } catch (Exception e3) {
                com.google.android.exoplayer2.util.ni7.n7h(f7l8.f63595mcp, "Key/provisioning request produced an unexpected exception. Not retrying.", e3);
                objMo11587k = e3;
            }
            f7l8.this.f63601kja0.m13458q(c3306q.f19650k);
            synchronized (this) {
                if (!this.f19653k) {
                    f7l8.this.f63600ki.obtainMessage(message.what, Pair.create(c3306q.f19652q, objMo11587k)).sendToTarget();
                }
            }
        }

        void toq(int i2, Object obj, boolean z2) {
            obtainMessage(i2, new C3306q(com.google.android.exoplayer2.source.ni7.m12808k(), z2, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void zy() {
            removeCallbacksAndMessages(null);
            this.f19653k = true;
        }
    }

    public f7l8(UUID uuid, wvg wvgVar, InterfaceC3304k interfaceC3304k, toq toqVar, @zy.dd List<DrmInitData.SchemeData> list, int i2, boolean z2, boolean z3, @zy.dd byte[] bArr, HashMap<String, String> map, lvui lvuiVar, Looper looper, com.google.android.exoplayer2.upstream.d3 d3Var) {
        if (i2 == 1 || i2 == 3) {
            C3844k.f7l8(bArr);
        }
        this.f63596cdj = uuid;
        this.f19647y = interfaceC3304k;
        this.f19645s = toqVar;
        this.f63597f7l8 = wvgVar;
        this.f19644p = i2;
        this.f63602ld6 = z2;
        this.f63609x2 = z3;
        if (bArr != null) {
            this.f63605o1t = bArr;
            this.f19641g = null;
        } else {
            this.f19641g = Collections.unmodifiableList((List) C3844k.f7l8(list));
        }
        this.f63606qrj = map;
        this.f19642h = lvuiVar;
        this.f63603n7h = new C3852p<>();
        this.f63601kja0 = d3Var;
        this.f63607t8r = 2;
        this.f63600ki = new HandlerC3305n(looper);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean a9() {
        if (m11608i()) {
            return true;
        }
        try {
            byte[] bArrMo11594n = this.f63597f7l8.mo11594n();
            this.f19648z = bArrMo11594n;
            this.f63604ni7 = this.f63597f7l8.n7h(bArrMo11594n);
            final int i2 = 3;
            this.f63607t8r = 3;
            m11607h(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.drm.q
                @Override // com.google.android.exoplayer2.util.InterfaceC3855s
                public final void accept(Object obj) {
                    ((InterfaceC3312i.k) obj).ld6(i2);
                }
            });
            C3844k.f7l8(this.f19648z);
            return true;
        } catch (NotProvisionedException unused) {
            this.f19647y.toq(this);
            return false;
        } catch (Exception e2) {
            ni7(e2, 1);
            return false;
        }
    }

    @RequiresNonNull({"sessionId"})
    private void cdj(boolean z2) {
        if (this.f63609x2) {
            return;
        }
        byte[] bArr = (byte[]) lrht.ld6(this.f19648z);
        int i2 = this.f19644p;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.f63605o1t == null || gvn7()) {
                    fti(bArr, 2, z2);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            C3844k.f7l8(this.f63605o1t);
            C3844k.f7l8(this.f19648z);
            fti(this.f63605o1t, 3, z2);
            return;
        }
        if (this.f63605o1t == null) {
            fti(bArr, 1, z2);
            return;
        }
        if (this.f63607t8r == 4 || gvn7()) {
            long jKi = ki();
            if (this.f19644p != 0 || jKi > 60) {
                if (jKi <= 0) {
                    ni7(new eqxt(), 2);
                    return;
                } else {
                    this.f63607t8r = 4;
                    m11607h(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.drm.g
                        @Override // com.google.android.exoplayer2.util.InterfaceC3855s
                        public final void accept(Object obj) {
                            ((InterfaceC3312i.k) obj).m11635p();
                        }
                    });
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb.append(jKi);
            com.google.android.exoplayer2.util.ni7.toq(f63595mcp, sb.toString());
            fti(bArr, 2, z2);
        }
    }

    private void fti(byte[] bArr, int i2, boolean z2) {
        try {
            this.f63608wvg = this.f63597f7l8.t8r(bArr, this.f19641g, i2, this.f63606qrj);
            ((zy) lrht.ld6(this.f63610zurt)).toq(1, C3844k.f7l8(this.f63608wvg), z2);
        } catch (Exception e2) {
            m11609z(e2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fu4(Object obj, Object obj2) {
        if (obj == this.f63608wvg && m11608i()) {
            this.f63608wvg = null;
            if (obj2 instanceof Exception) {
                m11609z((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f19644p == 3) {
                    this.f63597f7l8.ki((byte[]) lrht.ld6(this.f63605o1t), bArr);
                    m11607h(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.drm.toq
                        @Override // com.google.android.exoplayer2.util.InterfaceC3855s
                        public final void accept(Object obj3) {
                            ((InterfaceC3312i.k) obj3).m11636s();
                        }
                    });
                    return;
                }
                byte[] bArrKi = this.f63597f7l8.ki(this.f19648z, bArr);
                int i2 = this.f19644p;
                if ((i2 == 2 || (i2 == 0 && this.f63605o1t != null)) && bArrKi != null && bArrKi.length != 0) {
                    this.f63605o1t = bArrKi;
                }
                this.f63607t8r = 4;
                m11607h(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.drm.zy
                    @Override // com.google.android.exoplayer2.util.InterfaceC3855s
                    public final void accept(Object obj3) {
                        ((InterfaceC3312i.k) obj3).m11637y();
                    }
                });
            } catch (Exception e2) {
                m11609z(e2, true);
            }
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean gvn7() {
        try {
            this.f63597f7l8.mo11590g(this.f19648z, this.f63605o1t);
            return true;
        } catch (Exception e2) {
            ni7(e2, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m11607h(InterfaceC3855s<InterfaceC3312i.k> interfaceC3855s) {
        Iterator<InterfaceC3312i.k> it = this.f63603n7h.elementSet().iterator();
        while (it.hasNext()) {
            interfaceC3855s.accept(it.next());
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: i */
    private boolean m11608i() {
        int i2 = this.f63607t8r;
        return i2 == 3 || i2 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk(Object obj, Object obj2) {
        if (obj == this.f19646t) {
            if (this.f63607t8r == 2 || m11608i()) {
                this.f19646t = null;
                if (obj2 instanceof Exception) {
                    this.f19647y.mo11617k((Exception) obj2, false);
                    return;
                }
                try {
                    this.f63597f7l8.mo11595p((byte[]) obj2);
                    this.f19647y.zy();
                } catch (Exception e2) {
                    this.f19647y.mo11617k(e2, true);
                }
            }
        }
    }

    private long ki() {
        if (!C3548p.f65247r25n.equals(this.f63596cdj)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C3844k.f7l8(ncyb.toq(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void ni7(final Exception exc, int i2) {
        this.f63599fu4 = new qrj.C3318k(exc, fu4.m11624k(exc, i2));
        com.google.android.exoplayer2.util.ni7.m13700n(f63595mcp, "DRM session error", exc);
        m11607h(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.drm.n
            @Override // com.google.android.exoplayer2.util.InterfaceC3855s
            public final void accept(Object obj) {
                ((InterfaceC3312i.k) obj).x2(exc);
            }
        });
        if (this.f63607t8r != 4) {
            this.f63607t8r = 1;
        }
    }

    private void o1t() {
        if (this.f19644p == 0 && this.f63607t8r == 4) {
            lrht.ld6(this.f19648z);
            cdj(false);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m11609z(Exception exc, boolean z2) {
        if (exc instanceof NotProvisionedException) {
            this.f19647y.toq(this);
        } else {
            ni7(exc, z2 ? 1 : 2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    public final com.google.android.exoplayer2.decoder.zy f7l8() {
        return this.f63604ni7;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: g */
    public final qrj.C3318k mo11610g() {
        if (this.f63607t8r == 1) {
            return this.f63599fu4;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public final int getState() {
        return this.f63607t8r;
    }

    public void jp0y() {
        this.f19646t = this.f63597f7l8.zy();
        ((zy) lrht.ld6(this.f63610zurt)).toq(0, C3844k.f7l8(this.f19646t), true);
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: k */
    public void mo11611k(@zy.dd InterfaceC3312i.k kVar) {
        int i2 = this.f19643i;
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Session reference count less than zero: ");
            sb.append(i2);
            com.google.android.exoplayer2.util.ni7.m13702q(f63595mcp, sb.toString());
            this.f19643i = 0;
        }
        if (kVar != null) {
            this.f63603n7h.m13715k(kVar);
        }
        int i3 = this.f19643i + 1;
        this.f19643i = i3;
        if (i3 == 1) {
            C3844k.m13633s(this.f63607t8r == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f63598fn3e = handlerThread;
            handlerThread.start();
            this.f63610zurt = new zy(this.f63598fn3e.getLooper());
            if (a9()) {
                cdj(true);
            }
        } else if (kVar != null && m11608i() && this.f63603n7h.count(kVar) == 1) {
            kVar.ld6(this.f63607t8r);
        }
        this.f19645s.mo11618k(this, this.f19643i);
    }

    public void mcp(Exception exc, boolean z2) {
        ni7(exc, z2 ? 1 : 3);
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: n */
    public byte[] mo11612n() {
        return this.f63605o1t;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: p */
    public boolean mo11613p(String str) {
        return this.f63597f7l8.kja0((byte[]) C3844k.ld6(this.f19648z), str);
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: q */
    public boolean mo11614q() {
        return this.f63602ld6;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: s */
    public Map<String, String> mo11615s() {
        byte[] bArr = this.f19648z;
        if (bArr == null) {
            return null;
        }
        return this.f63597f7l8.toq(bArr);
    }

    /* JADX INFO: renamed from: t */
    public void m11616t() {
        if (a9()) {
            cdj(true);
        }
    }

    public boolean t8r(byte[] bArr) {
        return Arrays.equals(this.f19648z, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public void toq(@zy.dd InterfaceC3312i.k kVar) {
        int i2 = this.f19643i;
        if (i2 <= 0) {
            com.google.android.exoplayer2.util.ni7.m13702q(f63595mcp, "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f19643i = i3;
        if (i3 == 0) {
            this.f63607t8r = 0;
            ((HandlerC3305n) lrht.ld6(this.f63600ki)).removeCallbacksAndMessages(null);
            ((zy) lrht.ld6(this.f63610zurt)).zy();
            this.f63610zurt = null;
            ((HandlerThread) lrht.ld6(this.f63598fn3e)).quit();
            this.f63598fn3e = null;
            this.f63604ni7 = null;
            this.f63599fu4 = null;
            this.f63608wvg = null;
            this.f19646t = null;
            byte[] bArr = this.f19648z;
            if (bArr != null) {
                this.f63597f7l8.mo11591h(bArr);
                this.f19648z = null;
            }
        }
        if (kVar != null) {
            this.f63603n7h.toq(kVar);
            if (this.f63603n7h.count(kVar) == 0) {
                kVar.qrj();
            }
        }
        this.f19645s.toq(this, this.f19643i);
    }

    public void wvg(int i2) {
        if (i2 != 2) {
            return;
        }
        o1t();
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public final UUID zy() {
        return this.f63596cdj;
    }
}
