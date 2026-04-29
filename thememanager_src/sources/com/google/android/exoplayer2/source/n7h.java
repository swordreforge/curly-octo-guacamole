package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.C3577b;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.source.ads.InterfaceC3571q;
import com.google.android.exoplayer2.text.InterfaceC3657p;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.ni7;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;
import com.google.common.primitives.C4746s;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h implements InterfaceC3626r {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f65452qrj = "DefaultMediaSourceFactory";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f65453f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private com.google.android.exoplayer2.upstream.d3 f21643g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f65454ld6;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private com.google.android.exoplayer2.ui.toq f21644n;

    /* JADX INFO: renamed from: p */
    private float f21645p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private InterfaceC3620k f21646q;

    /* JADX INFO: renamed from: s */
    private long f21647s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0.InterfaceC3804k f65455toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f65456x2;

    /* JADX INFO: renamed from: y */
    private long f21648y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq f65457zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n7h$k */
    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public interface InterfaceC3620k {
        @zy.dd
        /* JADX INFO: renamed from: k */
        InterfaceC3571q m12798k(tfm.toq toqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @zy.dd
        private String f65458f7l8;

        /* JADX INFO: renamed from: g */
        @zy.dd
        private jp0y.zy f21649g;

        /* JADX INFO: renamed from: k */
        private final kja0.InterfaceC3804k f21650k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @zy.dd
        private List<StreamKey> f65459ld6;

        /* JADX INFO: renamed from: p */
        @zy.dd
        private com.google.android.exoplayer2.upstream.d3 f21652p;

        /* JADX INFO: renamed from: s */
        @zy.dd
        private com.google.android.exoplayer2.drm.ni7 f21654s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.kja0 f65460toq;

        /* JADX INFO: renamed from: y */
        @zy.dd
        private com.google.android.exoplayer2.drm.fn3e f21655y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Map<Integer, com.google.common.base.lvui<InterfaceC3626r>> f65461zy = new HashMap();

        /* JADX INFO: renamed from: q */
        private final Set<Integer> f21653q = new HashSet();

        /* JADX INFO: renamed from: n */
        private final Map<Integer, InterfaceC3626r> f21651n = new HashMap();

        public toq(kja0.InterfaceC3804k interfaceC3804k, com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            this.f21650k = interfaceC3804k;
            this.f65460toq = kja0Var;
        }

        /* JADX INFO: renamed from: g */
        private void m12799g() {
            n7h(0);
            n7h(1);
            n7h(2);
            n7h(3);
            n7h(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ InterfaceC3626r ld6(Class cls) {
            return n7h.ki(cls, this.f21650k);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
        @zy.dd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.google.common.base.lvui<com.google.android.exoplayer2.source.InterfaceC3626r> n7h(int r4) {
            /*
                r3 = this;
                java.lang.Class<com.google.android.exoplayer2.source.r> r0 = com.google.android.exoplayer2.source.InterfaceC3626r.class
                java.util.Map<java.lang.Integer, com.google.common.base.lvui<com.google.android.exoplayer2.source.r>> r1 = r3.f65461zy
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L1b
                java.util.Map<java.lang.Integer, com.google.common.base.lvui<com.google.android.exoplayer2.source.r>> r0 = r3.f65461zy
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r4 = r0.get(r4)
                com.google.common.base.lvui r4 = (com.google.common.base.lvui) r4
                return r4
            L1b:
                r1 = 0
                if (r4 == 0) goto L62
                r2 = 1
                if (r4 == r2) goto L52
                r2 = 2
                if (r4 == r2) goto L42
                r2 = 3
                if (r4 == r2) goto L32
                r0 = 4
                if (r4 == r0) goto L2b
                goto L72
            L2b:
                com.google.android.exoplayer2.source.t8r r0 = new com.google.android.exoplayer2.source.t8r     // Catch: java.lang.ClassNotFoundException -> L72
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
                r1 = r0
                goto L72
            L32:
                java.lang.String r2 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L72
                com.google.android.exoplayer2.source.ki r2 = new com.google.android.exoplayer2.source.ki     // Catch: java.lang.ClassNotFoundException -> L72
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
                goto L71
            L42:
                java.lang.String r2 = "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L72
                com.google.android.exoplayer2.source.cdj r2 = new com.google.android.exoplayer2.source.cdj     // Catch: java.lang.ClassNotFoundException -> L72
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
                goto L71
            L52:
                java.lang.String r2 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L72
                com.google.android.exoplayer2.source.h r2 = new com.google.android.exoplayer2.source.h     // Catch: java.lang.ClassNotFoundException -> L72
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
                goto L71
            L62:
                java.lang.String r2 = "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L72
                com.google.android.exoplayer2.source.kja0 r2 = new com.google.android.exoplayer2.source.kja0     // Catch: java.lang.ClassNotFoundException -> L72
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
            L71:
                r1 = r2
            L72:
                java.util.Map<java.lang.Integer, com.google.common.base.lvui<com.google.android.exoplayer2.source.r>> r0 = r3.f65461zy
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.put(r2, r1)
                if (r1 == 0) goto L86
                java.util.Set<java.lang.Integer> r0 = r3.f21653q
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.add(r4)
            L86:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.n7h.toq.n7h(int):com.google.common.base.lvui");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ InterfaceC3626r m12802p(Class cls) {
            return n7h.ki(cls, this.f21650k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ InterfaceC3626r qrj() {
            return new C3578c.toq(this.f21650k, this.f65460toq);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ InterfaceC3626r m12804s(Class cls) {
            return n7h.ki(cls, this.f21650k);
        }

        public void cdj(@zy.dd com.google.android.exoplayer2.drm.ni7 ni7Var) {
            this.f21654s = ni7Var;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().mo12636n(ni7Var);
            }
        }

        @zy.dd
        public InterfaceC3626r f7l8(int i2) {
            InterfaceC3626r interfaceC3626r = this.f21651n.get(Integer.valueOf(i2));
            if (interfaceC3626r != null) {
                return interfaceC3626r;
            }
            com.google.common.base.lvui<InterfaceC3626r> lvuiVarN7h = n7h(i2);
            if (lvuiVarN7h == null) {
                return null;
            }
            InterfaceC3626r interfaceC3626r2 = lvuiVarN7h.get();
            jp0y.zy zyVar = this.f21649g;
            if (zyVar != null) {
                interfaceC3626r2.mo12639y(zyVar);
            }
            String str = this.f65458f7l8;
            if (str != null) {
                interfaceC3626r2.mo12635k(str);
            }
            com.google.android.exoplayer2.drm.fn3e fn3eVar = this.f21655y;
            if (fn3eVar != null) {
                interfaceC3626r2.mo12638s(fn3eVar);
            }
            com.google.android.exoplayer2.drm.ni7 ni7Var = this.f21654s;
            if (ni7Var != null) {
                interfaceC3626r2.mo12636n(ni7Var);
            }
            com.google.android.exoplayer2.upstream.d3 d3Var = this.f21652p;
            if (d3Var != null) {
                interfaceC3626r2.f7l8(d3Var);
            }
            List<StreamKey> list = this.f65459ld6;
            if (list != null) {
                interfaceC3626r2.toq(list);
            }
            this.f21651n.put(Integer.valueOf(i2), interfaceC3626r2);
            return interfaceC3626r2;
        }

        /* JADX INFO: renamed from: h */
        public void m12805h(@zy.dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
            this.f21655y = fn3eVar;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().mo12638s(fn3eVar);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m12806i(@zy.dd List<StreamKey> list) {
            this.f65459ld6 = list;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().toq(list);
            }
        }

        public void ki(@zy.dd String str) {
            this.f65458f7l8 = str;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().mo12635k(str);
            }
        }

        public void kja0(@zy.dd jp0y.zy zyVar) {
            this.f21649g = zyVar;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().mo12639y(zyVar);
            }
        }

        public void t8r(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var) {
            this.f21652p = d3Var;
            Iterator<InterfaceC3626r> it = this.f21651n.values().iterator();
            while (it.hasNext()) {
                it.next().f7l8(d3Var);
            }
        }

        /* JADX INFO: renamed from: y */
        public int[] m12807y() {
            m12799g();
            return C4746s.m16720t(this.f21653q);
        }
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    private static final class zy implements InterfaceC3397p {

        /* JADX INFO: renamed from: q */
        private final xwq3 f21656q;

        public zy(xwq3 xwq3Var) {
            this.f21656q = xwq3Var;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
        /* JADX INFO: renamed from: k */
        public void mo11688k(long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
        /* JADX INFO: renamed from: q */
        public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
            InterfaceC3401t qVar = x2Var.toq(0, 3);
            x2Var.cdj(new o1t.toq(C3548p.f65257toq));
            x2Var.mo11753i();
            qVar.mo11931q(this.f21656q.toq().m13945m(com.google.android.exoplayer2.util.wvg.f23296b).d3(this.f21656q.f23682r).a9());
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
        public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
        public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
            return ld6Var.zy(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    public n7h(Context context) {
        this(new ni7.C3811k(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3626r cdj(Class<? extends InterfaceC3626r> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: h */
    private fti m12793h(tfm tfmVar, fti ftiVar) {
        C3844k.f7l8(tfmVar.f22150q);
        tfm.toq toqVar = tfmVar.f22150q.f22209q;
        if (toqVar == null) {
            return ftiVar;
        }
        InterfaceC3620k interfaceC3620k = this.f21646q;
        com.google.android.exoplayer2.ui.toq toqVar2 = this.f21644n;
        if (interfaceC3620k == null || toqVar2 == null) {
            com.google.android.exoplayer2.util.ni7.qrj(f65452qrj, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return ftiVar;
        }
        InterfaceC3571q interfaceC3571qM12798k = interfaceC3620k.m12798k(toqVar);
        if (interfaceC3571qM12798k == null) {
            com.google.android.exoplayer2.util.ni7.qrj(f65452qrj, "Playing media without ads, as no AdsLoader was provided.");
            return ftiVar;
        }
        com.google.android.exoplayer2.upstream.t8r t8rVar = new com.google.android.exoplayer2.upstream.t8r(toqVar.f22204k);
        Object obj = toqVar.f65988toq;
        return new com.google.android.exoplayer2.source.ads.f7l8(ftiVar, t8rVar, obj != null ? obj : se.of((Uri) tfmVar.f22147k, tfmVar.f22150q.f22207k, toqVar.f22204k), this, interfaceC3571qM12798k, toqVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3626r ki(Class<? extends InterfaceC3626r> cls, kja0.InterfaceC3804k interfaceC3804k) {
        try {
            return cls.getConstructor(kja0.InterfaceC3804k.class).newInstance(interfaceC3804k);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static fti kja0(tfm tfmVar, fti ftiVar) {
        tfm.C3698q c3698q = tfmVar.f22151s;
        long j2 = c3698q.f22197k;
        if (j2 == 0 && c3698q.f22199q == Long.MIN_VALUE && !c3698q.f22196g) {
            return ftiVar;
        }
        long jV0af = com.google.android.exoplayer2.util.lrht.v0af(j2);
        long jV0af2 = com.google.android.exoplayer2.util.lrht.v0af(tfmVar.f22151s.f22199q);
        tfm.C3698q c3698q2 = tfmVar.f22151s;
        return new C3619n(ftiVar, jV0af, jV0af2, !c3698q2.f22200y, c3698q2.f22198n, c3698q2.f22196g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InterfaceC3626r ld6(Class cls) {
        return cdj(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] n7h(xwq3 xwq3Var) {
        InterfaceC3397p[] interfaceC3397pArr = new InterfaceC3397p[1];
        InterfaceC3657p interfaceC3657p = InterfaceC3657p.f21929k;
        interfaceC3397pArr[0] = interfaceC3657p.mo12914k(xwq3Var) ? new com.google.android.exoplayer2.text.ld6(interfaceC3657p.toq(xwq3Var), xwq3Var) : new zy(xwq3Var);
        return interfaceC3397pArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    @Deprecated
    /* JADX INFO: renamed from: a9, reason: merged with bridge method [inline-methods] */
    public n7h toq(@zy.dd List<StreamKey> list) {
        this.f65457zy.m12806i(list);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    @Deprecated
    /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
    public n7h mo12639y(@zy.dd jp0y.zy zyVar) {
        this.f65457zy.kja0(zyVar);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    @Deprecated
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public n7h mo12635k(@zy.dd String str) {
        this.f65457zy.ki(str);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public n7h m12795i(@zy.dd InterfaceC3620k interfaceC3620k) {
        this.f21646q = interfaceC3620k;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    /* JADX INFO: renamed from: jk, reason: merged with bridge method [inline-methods] */
    public n7h f7l8(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var) {
        this.f21643g = d3Var;
        this.f65457zy.t8r(d3Var);
        return this;
    }

    public n7h mcp(long j2) {
        this.f65453f7l8 = j2;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public n7h mo12636n(@zy.dd com.google.android.exoplayer2.drm.ni7 ni7Var) {
        this.f65457zy.cdj(ni7Var);
        return this;
    }

    public n7h o1t(float f2) {
        this.f65454ld6 = f2;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    /* JADX INFO: renamed from: q */
    public int[] mo12637q() {
        return this.f65457zy.m12807y();
    }

    public n7h qrj(boolean z2) {
        this.f65456x2 = z2;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public n7h m12796t(float f2) {
        this.f21645p = f2;
        return this;
    }

    public n7h t8r(@zy.dd com.google.android.exoplayer2.ui.toq toqVar) {
        this.f21644n = toqVar;
        return this;
    }

    public n7h wvg(long j2) {
        this.f21648y = j2;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public n7h m12797z(long j2) {
        this.f21647s = j2;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    @Deprecated
    /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
    public n7h mo12638s(@zy.dd com.google.android.exoplayer2.drm.fn3e fn3eVar) {
        this.f65457zy.m12805h(fn3eVar);
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3626r
    public fti zy(tfm tfmVar) {
        C3844k.f7l8(tfmVar.f22150q);
        tfm.C3701y c3701y = tfmVar.f22150q;
        int iMu = com.google.android.exoplayer2.util.lrht.mu(c3701y.f22207k, c3701y.f65991toq);
        InterfaceC3626r interfaceC3626rF7l8 = this.f65457zy.f7l8(iMu);
        StringBuilder sb = new StringBuilder(68);
        sb.append("No suitable media source factory found for content type: ");
        sb.append(iMu);
        C3844k.x2(interfaceC3626rF7l8, sb.toString());
        tfm.f7l8.C3692k qVar = tfmVar.f22146g.toq();
        if (tfmVar.f22146g.f22161k == C3548p.f65257toq) {
            qVar.ld6(this.f65453f7l8);
        }
        if (tfmVar.f22146g.f22160g == -3.4028235E38f) {
            qVar.m13028p(this.f21645p);
        }
        if (tfmVar.f22146g.f22164y == -3.4028235E38f) {
            qVar.m13030y(this.f65454ld6);
        }
        if (tfmVar.f22146g.f22163q == C3548p.f65257toq) {
            qVar.m13029s(this.f21648y);
        }
        if (tfmVar.f22146g.f22162n == C3548p.f65257toq) {
            qVar.f7l8(this.f21647s);
        }
        tfm.f7l8 f7l8VarM13027g = qVar.m13027g();
        if (!f7l8VarM13027g.equals(tfmVar.f22146g)) {
            tfmVar = tfmVar.toq().fu4(f7l8VarM13027g).m13065k();
        }
        fti ftiVarZy = interfaceC3626rF7l8.zy(tfmVar);
        se<tfm.ld6> seVar = ((tfm.C3701y) com.google.android.exoplayer2.util.lrht.ld6(tfmVar.f22150q)).f65990f7l8;
        if (!seVar.isEmpty()) {
            fti[] ftiVarArr = new fti[seVar.size() + 1];
            ftiVarArr[0] = ftiVarZy;
            for (int i2 = 0; i2 < seVar.size(); i2++) {
                if (this.f65456x2) {
                    final xwq3 xwq3VarA9 = new xwq3.toq().m13945m(seVar.get(i2).f65982toq).m13940c(seVar.get(i2).f65983zy).yz(seVar.get(i2).f22183q).m13943j(seVar.get(i2).f22182n).m13942f(seVar.get(i2).f22180g).a9();
                    ftiVarArr[i2 + 1] = new C3578c.toq(this.f65455toq, new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.source.qrj
                        @Override // com.google.android.exoplayer2.extractor.kja0
                        public final InterfaceC3397p[] zy() {
                            return n7h.n7h(xwq3VarA9);
                        }
                    }).zy(tfm.m13020n(seVar.get(i2).f22181k.toString()));
                } else {
                    ftiVarArr[i2 + 1] = new C3577b.toq(this.f65455toq).toq(this.f21643g).m12628k(seVar.get(i2), C3548p.f65257toq);
                }
            }
            ftiVarZy = new x9kr(ftiVarArr);
        }
        return m12793h(tfmVar, kja0(tfmVar, ftiVarZy));
    }

    public n7h(Context context, com.google.android.exoplayer2.extractor.kja0 kja0Var) {
        this(new ni7.C3811k(context), kja0Var);
    }

    public n7h(kja0.InterfaceC3804k interfaceC3804k) {
        this(interfaceC3804k, new com.google.android.exoplayer2.extractor.f7l8());
    }

    public n7h(kja0.InterfaceC3804k interfaceC3804k, com.google.android.exoplayer2.extractor.kja0 kja0Var) {
        this.f65455toq = interfaceC3804k;
        this.f65457zy = new toq(interfaceC3804k, kja0Var);
        this.f65453f7l8 = C3548p.f65257toq;
        this.f21648y = C3548p.f65257toq;
        this.f21647s = C3548p.f65257toq;
        this.f21645p = -3.4028235E38f;
        this.f65454ld6 = -3.4028235E38f;
    }
}
