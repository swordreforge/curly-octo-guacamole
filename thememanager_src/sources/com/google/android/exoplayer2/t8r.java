package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.audio.C3271z;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.ld6;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.InterfaceC3626r;
import com.google.android.exoplayer2.t8r;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.uj2j;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.video.spherical.InterfaceC3885k;
import java.util.List;

/* JADX INFO: compiled from: ExoPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface t8r extends gc3c {

    /* JADX INFO: renamed from: k */
    public static final long f21774k = 500;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final long f65475toq = 2000;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t8r$g */
    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface InterfaceC3637g {
        @Deprecated
        void a9(@zy.dd TextureView textureView);

        @Deprecated
        int cdj();

        @Deprecated
        int d2ok();

        @Deprecated
        void d3();

        @Deprecated
        void fn3e(int i2);

        @Deprecated
        com.google.android.exoplayer2.video.wvg fti();

        @Deprecated
        void fu4(@zy.dd SurfaceHolder surfaceHolder);

        @Deprecated
        /* JADX INFO: renamed from: g */
        void mo12125g(int i2);

        @Deprecated
        /* JADX INFO: renamed from: h */
        void m12831h(@zy.dd SurfaceView surfaceView);

        @Deprecated
        void jk(InterfaceC3885k interfaceC3885k);

        @Deprecated
        void mcp(com.google.android.exoplayer2.video.ld6 ld6Var);

        @Deprecated
        void n7h(@zy.dd Surface surface);

        @Deprecated
        void ni7(@zy.dd TextureView textureView);

        @Deprecated
        void oc(@zy.dd SurfaceView surfaceView);

        @Deprecated
        void qrj(@zy.dd Surface surface);

        @Deprecated
        /* JADX INFO: renamed from: t */
        void mo12130t(InterfaceC3885k interfaceC3885k);

        @Deprecated
        void t8r(com.google.android.exoplayer2.video.ld6 ld6Var);

        @Deprecated
        void zy(@zy.dd SurfaceHolder surfaceHolder);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t8r$k */
    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface InterfaceC3638k {
        @Deprecated
        int getAudioSessionId();

        @Deprecated
        float jp0y();

        @Deprecated
        void o1t(C3248g c3248g, boolean z2);

        @Deprecated
        /* JADX INFO: renamed from: p */
        boolean mo12128p();

        @Deprecated
        /* JADX INFO: renamed from: q */
        void mo12129q(int i2);

        @Deprecated
        /* JADX INFO: renamed from: s */
        C3248g m12832s();

        @Deprecated
        void toq(float f2);

        @Deprecated
        void x2(boolean z2);

        @Deprecated
        /* JADX INFO: renamed from: y */
        void mo12131y(C3271z c3271z);

        @Deprecated
        /* JADX INFO: renamed from: z */
        void mo12132z();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t8r$n */
    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface InterfaceC3639n {
        @Deprecated
        List<com.google.android.exoplayer2.text.toq> ki();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t8r$q */
    /* JADX INFO: compiled from: ExoPlayer.java */
    @Deprecated
    public interface InterfaceC3640q {
        @Deprecated
        boolean eqxt();

        @Deprecated
        C3443h gvn7();

        @Deprecated
        /* JADX INFO: renamed from: i */
        void m12833i(boolean z2);

        @Deprecated
        void kja0();

        @Deprecated
        void lvui(int i2);

        @Deprecated
        int wvg();

        @Deprecated
        void zurt();
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    public interface toq {
        /* JADX INFO: renamed from: b */
        default void m12834b(boolean z2) {
        }

        default void eqxt(boolean z2) {
        }
    }

    /* JADX INFO: compiled from: ExoPlayer.java */
    public static final class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        int f65476cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        com.google.common.base.lvui<fnq8> f65477f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        long f65478fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        long f65479fu4;

        /* JADX INFO: renamed from: g */
        com.google.common.base.lvui<com.google.android.exoplayer2.trackselection.zurt> f21775g;

        /* JADX INFO: renamed from: h */
        boolean f21776h;

        /* JADX INFO: renamed from: i */
        mbx f21777i;

        /* JADX INFO: renamed from: k */
        final Context f21778k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        int f65480ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        boolean f65481kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @zy.dd
        com.google.android.exoplayer2.util.oc f65482ld6;

        /* JADX INFO: renamed from: n */
        com.google.common.base.lvui<InterfaceC3626r> f21779n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        int f65483n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        qkj8 f65484ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        boolean f65485o1t;

        /* JADX INFO: renamed from: p */
        Looper f21780p;

        /* JADX INFO: renamed from: q */
        com.google.common.base.lvui<vep5> f21781q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f65486qrj;

        /* JADX INFO: renamed from: s */
        com.google.common.base.lvui<com.google.android.exoplayer2.analytics.zp> f21782s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        boolean f65487t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        InterfaceC3850n f65488toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        boolean f65489wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        C3248g f65490x2;

        /* JADX INFO: renamed from: y */
        com.google.common.base.lvui<InterfaceC3808n> f21783y;

        /* JADX INFO: renamed from: z */
        long f21784z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        long f65491zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f65492zy;

        public zy(final Context context) {
            this(context, (com.google.common.base.lvui<vep5>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.mcp
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.wvg(context);
                }
            }, (com.google.common.base.lvui<InterfaceC3626r>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.jk
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.m12847t(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3808n a9(InterfaceC3808n interfaceC3808n) {
            return interfaceC3808n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ vep5 m12835c(vep5 vep5Var) {
            return vep5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vep5 d2ok(Context context) {
            return new n7h(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.android.exoplayer2.analytics.zp d3() {
            return new com.google.android.exoplayer2.analytics.zp((InterfaceC3850n) C3844k.f7l8(this.f65488toq));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3626r dd(InterfaceC3626r interfaceC3626r) {
            return interfaceC3626r;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3626r eqxt(Context context) {
            return new com.google.android.exoplayer2.source.n7h(context, new com.google.android.exoplayer2.extractor.f7l8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ InterfaceC3626r m12836f(InterfaceC3626r interfaceC3626r) {
            return interfaceC3626r;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.analytics.zp fti(com.google.android.exoplayer2.analytics.zp zpVar) {
            return zpVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ fnq8 hyr(fnq8 fnq8Var) {
            return fnq8Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ fnq8 jk(fnq8 fnq8Var) {
            return fnq8Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.zurt jp0y(Context context) {
            return new C3705g(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static /* synthetic */ com.google.android.exoplayer2.analytics.zp m12841l(com.google.android.exoplayer2.analytics.zp zpVar) {
            return zpVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.zurt lrht(com.google.android.exoplayer2.trackselection.zurt zurtVar) {
            return zurtVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3626r lvui(InterfaceC3626r interfaceC3626r) {
            return interfaceC3626r;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.android.exoplayer2.trackselection.zurt mcp(com.google.android.exoplayer2.trackselection.zurt zurtVar) {
            return zurtVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3808n n5r1(InterfaceC3808n interfaceC3808n) {
            return interfaceC3808n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InterfaceC3626r ncyb(InterfaceC3626r interfaceC3626r) {
            return interfaceC3626r;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vep5 oc(vep5 vep5Var) {
            return vep5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ vep5 m12845r(vep5 vep5Var) {
            return vep5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static /* synthetic */ InterfaceC3626r m12847t(Context context) {
            return new com.google.android.exoplayer2.source.n7h(context, new com.google.android.exoplayer2.extractor.f7l8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vep5 wvg(Context context) {
            return new n7h(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vep5 x9kr(vep5 vep5Var) {
            return vep5Var;
        }

        /* JADX INFO: renamed from: a */
        public zy m12849a(@zy.a9(from = 1) long j2) {
            C3844k.m13629k(j2 > 0);
            C3844k.m13633s(!this.f65489wvg);
            this.f65491zurt = j2;
            return this;
        }

        public zy a98o(@zy.a9(from = 1) long j2) {
            C3844k.m13629k(j2 > 0);
            C3844k.m13633s(!this.f65489wvg);
            this.f65478fn3e = j2;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public zy m12850b(@zy.dd com.google.android.exoplayer2.util.oc ocVar) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65482ld6 = ocVar;
            return this;
        }

        public zy bf2(long j2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65479fu4 = j2;
            return this;
        }

        public zy ch(final com.google.android.exoplayer2.trackselection.zurt zurtVar) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21775g = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.a9
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.lrht(zurtVar);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: e */
        public zy m12851e(final InterfaceC3808n interfaceC3808n) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21783y = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.eqxt
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.n5r1(interfaceC3808n);
                }
            };
            return this;
        }

        public zy ek5k(Looper looper) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21780p = looper;
            return this;
        }

        public t8r fu4() {
            return m12857z();
        }

        public zy hb(long j2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21784z = j2;
            return this;
        }

        public zy i1(final vep5 vep5Var) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21781q = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.fti
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.m12835c(vep5Var);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: j */
        public zy m12852j(boolean z2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65481kja0 = z2;
            return this;
        }

        public zy lv5(int i2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65480ki = i2;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public zy m12853m(final fnq8 fnq8Var) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65477f7l8 = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.d2ok
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.hyr(fnq8Var);
                }
            };
            return this;
        }

        public zy nmn5(boolean z2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65487t8r = z2;
            return this;
        }

        @zy.yz
        public zy nn86(InterfaceC3850n interfaceC3850n) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65488toq = interfaceC3850n;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public zy m12854o(qkj8 qkj8Var) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65484ni7 = qkj8Var;
            return this;
        }

        public zy o1t(long j2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65492zy = j2;
            return this;
        }

        public zy t8iq(int i2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65476cdj = i2;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public zy m12855u(int i2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65483n7h = i2;
            return this;
        }

        public zy uv6(final com.google.android.exoplayer2.analytics.zp zpVar) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21782s = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.oc
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.m12841l(zpVar);
                }
            };
            return this;
        }

        public zy vyq(C3248g c3248g, boolean z2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65490x2 = c3248g;
            this.f65486qrj = z2;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public zy m12856x(boolean z2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21776h = z2;
            return this;
        }

        public zy y9n(boolean z2) {
            C3844k.m13633s(!this.f65489wvg);
            this.f65485o1t = z2;
            return this;
        }

        public zy yz(final InterfaceC3626r interfaceC3626r) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21779n = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.d3
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.m12836f(interfaceC3626r);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: z */
        jbh m12857z() {
            C3844k.m13633s(!this.f65489wvg);
            this.f65489wvg = true;
            return new jbh(this);
        }

        public zy zp(mbx mbxVar) {
            C3844k.m13633s(!this.f65489wvg);
            this.f21777i = mbxVar;
            return this;
        }

        public zy(final Context context, final vep5 vep5Var) {
            this(context, (com.google.common.base.lvui<vep5>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.jp0y
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.oc(vep5Var);
                }
            }, (com.google.common.base.lvui<InterfaceC3626r>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.gvn7
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.eqxt(context);
                }
            });
        }

        public zy(final Context context, final InterfaceC3626r interfaceC3626r) {
            this(context, (com.google.common.base.lvui<vep5>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.z
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.d2ok(context);
                }
            }, (com.google.common.base.lvui<InterfaceC3626r>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.o1t
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.lvui(interfaceC3626r);
                }
            });
        }

        public zy(Context context, final vep5 vep5Var, final InterfaceC3626r interfaceC3626r) {
            this(context, (com.google.common.base.lvui<vep5>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.wvg
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.m12845r(vep5Var);
                }
            }, (com.google.common.base.lvui<InterfaceC3626r>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.t
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.dd(interfaceC3626r);
                }
            });
        }

        public zy(Context context, final vep5 vep5Var, final InterfaceC3626r interfaceC3626r, final com.google.android.exoplayer2.trackselection.zurt zurtVar, final fnq8 fnq8Var, final InterfaceC3808n interfaceC3808n, final com.google.android.exoplayer2.analytics.zp zpVar) {
            this(context, (com.google.common.base.lvui<vep5>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.x9kr
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.x9kr(vep5Var);
                }
            }, (com.google.common.base.lvui<InterfaceC3626r>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.ncyb
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.ncyb(interfaceC3626r);
                }
            }, (com.google.common.base.lvui<com.google.android.exoplayer2.trackselection.zurt>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.fn3e
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.mcp(zurtVar);
                }
            }, (com.google.common.base.lvui<fnq8>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.zurt
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.jk(fnq8Var);
                }
            }, (com.google.common.base.lvui<InterfaceC3808n>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.ni7
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.a9(interfaceC3808n);
                }
            }, (com.google.common.base.lvui<com.google.android.exoplayer2.analytics.zp>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.fu4
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.fti(zpVar);
                }
            });
        }

        private zy(final Context context, com.google.common.base.lvui<vep5> lvuiVar, com.google.common.base.lvui<InterfaceC3626r> lvuiVar2) {
            this(context, lvuiVar, lvuiVar2, (com.google.common.base.lvui<com.google.android.exoplayer2.trackselection.zurt>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.lvui
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return t8r.zy.jp0y(context);
                }
            }, (com.google.common.base.lvui<fnq8>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.r
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return new x2();
                }
            }, (com.google.common.base.lvui<InterfaceC3808n>) new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.dd
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return com.google.android.exoplayer2.upstream.zurt.n7h(context);
                }
            }, (com.google.common.base.lvui<com.google.android.exoplayer2.analytics.zp>) null);
        }

        private zy(Context context, com.google.common.base.lvui<vep5> lvuiVar, com.google.common.base.lvui<InterfaceC3626r> lvuiVar2, com.google.common.base.lvui<com.google.android.exoplayer2.trackselection.zurt> lvuiVar3, com.google.common.base.lvui<fnq8> lvuiVar4, com.google.common.base.lvui<InterfaceC3808n> lvuiVar5, @zy.dd com.google.common.base.lvui<com.google.android.exoplayer2.analytics.zp> lvuiVar6) {
            this.f21778k = context;
            this.f21781q = lvuiVar;
            this.f21779n = lvuiVar2;
            this.f21775g = lvuiVar3;
            this.f65477f7l8 = lvuiVar4;
            this.f21783y = lvuiVar5;
            this.f21782s = lvuiVar6 == null ? new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return this.f20549k.d3();
                }
            } : lvuiVar6;
            this.f21780p = com.google.android.exoplayer2.util.lrht.uv6();
            this.f65490x2 = C3248g.f19336s;
            this.f65483n7h = 0;
            this.f65476cdj = 1;
            this.f65480ki = 0;
            this.f65487t8r = true;
            this.f21777i = mbx.f64925f7l8;
            this.f65478fn3e = 5000L;
            this.f65491zurt = C3548p.f65211lw;
            this.f65484ni7 = new ld6.toq().m12166k();
            this.f65488toq = InterfaceC3850n.f23248k;
            this.f65479fu4 = 500L;
            this.f21784z = t8r.f65475toq;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo12123a(List<com.google.android.exoplayer2.source.fti> list);

    boolean a5id();

    @Deprecated
    void a98o(gc3c.InterfaceC3434g interfaceC3434g);

    @Deprecated
    void bek6(gc3c.InterfaceC3434g interfaceC3434g);

    void c8jq(List<com.google.android.exoplayer2.source.fti> list, boolean z2);

    int cdj();

    int d2ok();

    Looper dxef();

    boolean etdu();

    uj2j ew(uj2j.toq toqVar);

    /* JADX INFO: renamed from: f */
    void mo12124f(com.google.android.exoplayer2.source.fti ftiVar);

    void fn3e(int i2);

    /* JADX INFO: renamed from: g */
    void mo12125g(int i2);

    int gc3c();

    int getAudioSessionId();

    void gyi(boolean z2);

    @zy.dd
    com.google.android.exoplayer2.trackselection.zurt hyr();

    void i1(toq toqVar);

    int i9jn(int i2);

    void ikck(boolean z2);

    void ixz(toq toqVar);

    void jbh(InterfaceC3239x interfaceC3239x);

    void jk(InterfaceC3885k interfaceC3885k);

    void kx3(InterfaceC3239x interfaceC3239x);

    @Deprecated
    @zy.dd
    InterfaceC3639n ltg8();

    @Deprecated
    @zy.dd
    InterfaceC3637g lv5();

    /* JADX INFO: renamed from: m */
    void mo12126m(int i2, com.google.android.exoplayer2.source.fti ftiVar);

    @Deprecated
    void m4(com.google.android.exoplayer2.source.fti ftiVar, boolean z2, boolean z3);

    mbx m58i();

    void mbx(List<com.google.android.exoplayer2.source.fti> list);

    void mcp(com.google.android.exoplayer2.video.ld6 ld6Var);

    @Deprecated
    void mu(com.google.android.exoplayer2.source.fti ftiVar);

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: n */
    ki mo12087n();

    InterfaceC3850n n5r1();

    com.google.android.exoplayer2.analytics.zp nme();

    /* JADX INFO: renamed from: o */
    void mo12127o(boolean z2);

    @Deprecated
    void o05(boolean z2);

    void o1t(C3248g c3248g, boolean z2);

    void oki(int i2);

    /* JADX INFO: renamed from: p */
    boolean mo12128p();

    @zy.dd
    xwq3 pjz9();

    /* JADX INFO: renamed from: q */
    void mo12129q(int i2);

    void qkj8(List<com.google.android.exoplayer2.source.fti> list, int i2, long j2);

    void r8s8(com.google.android.exoplayer2.source.fti ftiVar, long j2);

    void se(@zy.dd mbx mbxVar);

    /* JADX INFO: renamed from: t */
    void mo12130t(InterfaceC3885k interfaceC3885k);

    void t8r(com.google.android.exoplayer2.video.ld6 ld6Var);

    @zy.dd
    com.google.android.exoplayer2.decoder.f7l8 u38j();

    @Deprecated
    @zy.dd
    InterfaceC3640q uc();

    void uj2j(int i2, List<com.google.android.exoplayer2.source.fti> list);

    @Deprecated
    @zy.dd
    InterfaceC3638k ukdy();

    @Deprecated
    void v0af();

    void v5yj(com.google.android.exoplayer2.source.fti ftiVar, boolean z2);

    void vq(boolean z2);

    void vy(InterfaceC3612m interfaceC3612m);

    void vyq(com.google.android.exoplayer2.source.fti ftiVar);

    @Deprecated
    void was(boolean z2);

    void wx16(@zy.dd com.google.android.exoplayer2.util.oc ocVar);

    void x2(boolean z2);

    /* JADX INFO: renamed from: y */
    void mo12131y(C3271z c3271z);

    @zy.dd
    xwq3 y2();

    /* JADX INFO: renamed from: z */
    void mo12132z();

    @zy.dd
    com.google.android.exoplayer2.decoder.f7l8 zwy();
}
