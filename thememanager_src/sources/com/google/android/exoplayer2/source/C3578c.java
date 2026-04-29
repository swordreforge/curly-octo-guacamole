package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.source.C3594f;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.ncyb;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.upstream.C3821t;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.c */
/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3578c extends AbstractC3605k implements C3594f.toq {

    /* JADX INFO: renamed from: m */
    public static final int f21334m = 1048576;

    /* JADX INFO: renamed from: c */
    private long f21335c;

    /* JADX INFO: renamed from: e */
    private boolean f21336e;

    /* JADX INFO: renamed from: f */
    private boolean f21337f;

    /* JADX INFO: renamed from: h */
    private final tfm.C3701y f21338h;

    /* JADX INFO: renamed from: i */
    private final kja0.InterfaceC3804k f21339i;

    /* JADX INFO: renamed from: j */
    private boolean f21340j;

    /* JADX INFO: renamed from: l */
    private final int f21341l;

    /* JADX INFO: renamed from: o */
    @zy.dd
    private com.google.android.exoplayer2.upstream.uv6 f21342o;

    /* JADX INFO: renamed from: p */
    private final tfm f21343p;

    /* JADX INFO: renamed from: r */
    private final com.google.android.exoplayer2.upstream.d3 f21344r;

    /* JADX INFO: renamed from: t */
    private final com.google.android.exoplayer2.drm.fn3e f21345t;

    /* JADX INFO: renamed from: z */
    private final ncyb.InterfaceC3621k f21346z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$k */
    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    class k extends fn3e {
        k(C3578c c3578c, pc pcVar) {
            super(pcVar);
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
            super.fn3e(i2, c3550q, j2);
            c3550q.f21138r = true;
            return c3550q;
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            super.ld6(i2, toqVar, z2);
            toqVar.f21154s = true;
            return toqVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$toq */
    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class toq implements InterfaceC3626r {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f65334f7l8;

        /* JADX INFO: renamed from: g */
        private com.google.android.exoplayer2.upstream.d3 f21347g;

        /* JADX INFO: renamed from: n */
        private com.google.android.exoplayer2.drm.ni7 f21348n;

        /* JADX INFO: renamed from: q */
        private boolean f21349q;

        /* JADX INFO: renamed from: s */
        @zy.dd
        private Object f21350s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final kja0.InterfaceC3804k f65335toq;

        /* JADX INFO: renamed from: y */
        @zy.dd
        private String f21351y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ncyb.InterfaceC3621k f65336zy;

        public toq(kja0.InterfaceC3804k interfaceC3804k) {
            this(interfaceC3804k, new com.google.android.exoplayer2.extractor.f7l8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ncyb cdj(com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            if (kja0Var == null) {
                kja0Var = new com.google.android.exoplayer2.extractor.f7l8();
            }
            return new zy(kja0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ com.google.android.exoplayer2.drm.fn3e m12631h(com.google.android.exoplayer2.drm.fn3e fn3eVar, tfm tfmVar) {
            return fn3eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ncyb kja0(com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            return new zy(kja0Var);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public toq mo12638s(@zy.dd final com.google.android.exoplayer2.drm.fn3e fn3eVar) {
            if (fn3eVar == null) {
                mo12636n(null);
            } else {
                mo12636n(new com.google.android.exoplayer2.drm.ni7() { // from class: com.google.android.exoplayer2.source.uv6
                    @Override // com.google.android.exoplayer2.drm.ni7
                    /* JADX INFO: renamed from: k */
                    public final com.google.android.exoplayer2.drm.fn3e mo11642k(tfm tfmVar) {
                        return C3578c.toq.m12631h(fn3eVar, tfmVar);
                    }
                });
            }
            return this;
        }

        @Deprecated
        public toq fu4(@zy.dd final com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            this.f65336zy = new ncyb.InterfaceC3621k() { // from class: com.google.android.exoplayer2.source.vyq
                @Override // com.google.android.exoplayer2.source.ncyb.InterfaceC3621k
                /* JADX INFO: renamed from: k */
                public final ncyb mo12754k() {
                    return C3578c.toq.cdj(kja0Var);
                }
            };
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public toq mo12639y(@zy.dd jp0y.zy zyVar) {
            if (!this.f21349q) {
                ((com.google.android.exoplayer2.drm.x2) this.f21348n).zy(zyVar);
            }
            return this;
        }

        public toq ki(int i2) {
            this.f65334f7l8 = i2;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C3578c zy(tfm tfmVar) {
            C3844k.f7l8(tfmVar.f22150q);
            tfm.C3701y c3701y = tfmVar.f22150q;
            boolean z2 = c3701y.f22210s == null && this.f21350s != null;
            boolean z3 = c3701y.f22206g == null && this.f21351y != null;
            if (z2 && z3) {
                tfmVar = tfmVar.toq().oc(this.f21350s).x2(this.f21351y).m13065k();
            } else if (z2) {
                tfmVar = tfmVar.toq().oc(this.f21350s).m13065k();
            } else if (z3) {
                tfmVar = tfmVar.toq().x2(this.f21351y).m13065k();
            }
            tfm tfmVar2 = tfmVar;
            return new C3578c(tfmVar2, this.f65335toq, this.f65336zy, this.f21348n.mo11642k(tfmVar2), this.f21347g, this.f65334f7l8, null);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public toq mo12635k(@zy.dd String str) {
            if (!this.f21349q) {
                ((com.google.android.exoplayer2.drm.x2) this.f21348n).m11653q(str);
            }
            return this;
        }

        @Deprecated
        public toq o1t(@zy.dd Object obj) {
            this.f21350s = obj;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: q */
        public int[] mo12637q() {
            return new int[]{4};
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        @Deprecated
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public C3578c mo12633g(Uri uri) {
            return zy(new tfm.zy().eqxt(uri).m13065k());
        }

        @Deprecated
        public toq t8r(@zy.dd String str) {
            this.f21351y = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public toq f7l8(@zy.dd com.google.android.exoplayer2.upstream.d3 d3Var) {
            if (d3Var == null) {
                d3Var = new C3821t();
            }
            this.f21347g = d3Var;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3626r
        /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
        public toq mo12636n(@zy.dd com.google.android.exoplayer2.drm.ni7 ni7Var) {
            if (ni7Var != null) {
                this.f21348n = ni7Var;
                this.f21349q = true;
            } else {
                this.f21348n = new com.google.android.exoplayer2.drm.x2();
                this.f21349q = false;
            }
            return this;
        }

        public toq(kja0.InterfaceC3804k interfaceC3804k, final com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            this(interfaceC3804k, new ncyb.InterfaceC3621k() { // from class: com.google.android.exoplayer2.source.lrht
                @Override // com.google.android.exoplayer2.source.ncyb.InterfaceC3621k
                /* JADX INFO: renamed from: k */
                public final ncyb mo12754k() {
                    return C3578c.toq.kja0(kja0Var);
                }
            });
        }

        public toq(kja0.InterfaceC3804k interfaceC3804k, ncyb.InterfaceC3621k interfaceC3621k) {
            this.f65335toq = interfaceC3804k;
            this.f65336zy = interfaceC3621k;
            this.f21348n = new com.google.android.exoplayer2.drm.x2();
            this.f21347g = new C3821t();
            this.f65334f7l8 = 1048576;
        }
    }

    /* synthetic */ C3578c(tfm tfmVar, kja0.InterfaceC3804k interfaceC3804k, ncyb.InterfaceC3621k interfaceC3621k, com.google.android.exoplayer2.drm.fn3e fn3eVar, com.google.android.exoplayer2.upstream.d3 d3Var, int i2, k kVar) {
        this(tfmVar, interfaceC3804k, interfaceC3621k, fn3eVar, d3Var, i2);
    }

    private void jk() {
        pc yzVar = new yz(this.f21335c, this.f21336e, false, this.f21340j, (Object) null, this.f21343p);
        if (this.f21337f) {
            yzVar = new k(this, yzVar);
        }
        m12741t(yzVar);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        ((C3594f) jkVar).m12703o();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        com.google.android.exoplayer2.upstream.kja0 kja0VarMo7265k = this.f21339i.mo7265k();
        com.google.android.exoplayer2.upstream.uv6 uv6Var = this.f21342o;
        if (uv6Var != null) {
            kja0VarMo7265k.mo7271n(uv6Var);
        }
        return new C3594f(this.f21338h.f22207k, kja0VarMo7265k, this.f21346z.mo12754k(), this.f21345t, ki(c3596k), this.f21344r, fn3e(c3596k), this, toqVar, this.f21338h.f22206g, this.f21341l);
    }

    @Override // com.google.android.exoplayer2.source.C3594f.toq
    public void ld6(long j2, boolean z2, boolean z3) {
        if (j2 == C3548p.f65257toq) {
            j2 = this.f21335c;
        }
        if (!this.f21337f && this.f21335c == j2 && this.f21336e == z2 && this.f21340j == z3) {
            return;
        }
        this.f21335c = j2;
        this.f21336e = z2;
        this.f21340j = z3;
        this.f21337f = false;
        jk();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
        this.f21345t.release();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return this.f21343p;
    }

    @Override // com.google.android.exoplayer2.source.fti
    public void n7h() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        this.f21342o = uv6Var;
        this.f21345t.prepare();
        jk();
    }

    private C3578c(tfm tfmVar, kja0.InterfaceC3804k interfaceC3804k, ncyb.InterfaceC3621k interfaceC3621k, com.google.android.exoplayer2.drm.fn3e fn3eVar, com.google.android.exoplayer2.upstream.d3 d3Var, int i2) {
        this.f21338h = (tfm.C3701y) C3844k.f7l8(tfmVar.f22150q);
        this.f21343p = tfmVar;
        this.f21339i = interfaceC3804k;
        this.f21346z = interfaceC3621k;
        this.f21345t = fn3eVar;
        this.f21344r = d3Var;
        this.f21341l = i2;
        this.f21337f = true;
        this.f21335c = C3548p.f65257toq;
    }
}
