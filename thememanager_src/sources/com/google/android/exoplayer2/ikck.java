package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.C3707i;
import java.util.List;

/* JADX INFO: compiled from: ForwardingPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public class ikck implements gc3c {

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    private final gc3c f64800qkj8;

    /* JADX INFO: compiled from: ForwardingPlayer.java */
    private static class toq implements gc3c.InterfaceC3434g {

        /* JADX INFO: renamed from: k */
        private final ikck f20558k;

        /* JADX INFO: renamed from: q */
        private final gc3c.InterfaceC3434g f20559q;

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void a98o(long j2) {
            this.f20559q.a98o(j2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: e */
        public void mo11364e() {
            this.f20559q.mo11364e();
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            if (this.f20558k.equals(toqVar.f20558k)) {
                return this.f20559q.equals(toqVar.f20559q);
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: f */
        public void mo12096f(C3707i c3707i) {
            this.f20559q.mo12096f(c3707i);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fn3e(boolean z2) {
            this.f20559q.fn3e(z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fu4(gc3c gc3cVar, gc3c.f7l8 f7l8Var) {
            this.f20559q.fu4(this.f20558k, f7l8Var);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: g */
        public void mo11365g(int i2) {
            this.f20559q.mo11365g(i2);
        }

        public int hashCode() {
            return (this.f20558k.hashCode() * 31) + this.f20559q.hashCode();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void jk(boolean z2) {
            this.f20559q.fn3e(z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ki(@zy.dd yqrt yqrtVar) {
            this.f20559q.ki(yqrtVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void kja0(long j2) {
            this.f20559q.kja0(j2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ld6(int i2) {
            this.f20559q.ld6(i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: m */
        public void mo6500m(boolean z2, int i2) {
            this.f20559q.mo6500m(z2, i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void mcp(boolean z2) {
            this.f20559q.mcp(z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: n */
        public void mo11370n(gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
            this.f20559q.mo11370n(x2Var, x2Var2, i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void n5r1(C3629x c3629x, com.google.android.exoplayer2.trackselection.kja0 kja0Var) {
            this.f20559q.n5r1(c3629x, kja0Var);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ni7(yqrt yqrtVar) {
            this.f20559q.ni7(yqrtVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void o1t(@zy.dd tfm tfmVar, int i2) {
            this.f20559q.o1t(tfmVar, i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void onRepeatModeChanged(int i2) {
            this.f20559q.onRepeatModeChanged(i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: p */
        public void mo11372p(pc pcVar, int i2) {
            this.f20559q.mo11372p(pcVar, i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: q */
        public void mo11373q(se seVar) {
            this.f20559q.mo11373q(seVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void qrj(boolean z2) {
            this.f20559q.qrj(z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: s */
        public void mo11374s(gc3c.zy zyVar) {
            this.f20559q.mo11374s(zyVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: t */
        public void mo11375t(was wasVar) {
            this.f20559q.mo11375t(wasVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void uv6(int i2) {
            this.f20559q.uv6(i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void wvg(boolean z2, int i2) {
            this.f20559q.wvg(z2, i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void x2(was wasVar) {
            this.f20559q.x2(wasVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: y */
        public void mo11377y(pjz9 pjz9Var) {
            this.f20559q.mo11377y(pjz9Var);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: z */
        public void mo11378z(long j2) {
            this.f20559q.mo11378z(j2);
        }

        private toq(ikck ikckVar, gc3c.InterfaceC3434g interfaceC3434g) {
            this.f20558k = ikckVar;
            this.f20559q = interfaceC3434g;
        }
    }

    /* JADX INFO: compiled from: ForwardingPlayer.java */
    private static final class zy extends toq implements gc3c.InterfaceC3440y {

        /* JADX INFO: renamed from: n */
        private final gc3c.InterfaceC3440y f20560n;

        public zy(ikck ikckVar, gc3c.InterfaceC3440y interfaceC3440y) {
            super(interfaceC3440y);
            this.f20560n = interfaceC3440y;
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: c */
        public void mo11363c(int i2, int i3) {
            this.f20560n.mo11363c(i2, i3);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void cdj(com.google.android.exoplayer2.video.wvg wvgVar) {
            this.f20560n.cdj(wvgVar);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void d2ok(C3443h c3443h) {
            this.f20560n.d2ok(c3443h);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void ek5k(C3248g c3248g) {
            this.f20560n.ek5k(c3248g);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: h */
        public void mo12098h(List<com.google.android.exoplayer2.text.toq> list) {
            this.f20560n.mo12098h(list);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void hb(float f2) {
            this.f20560n.hb(f2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.audio.fn3e
        /* JADX INFO: renamed from: k */
        public void mo11368k(boolean z2) {
            this.f20560n.mo11368k(z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void lvui(int i2, boolean z2) {
            this.f20560n.lvui(i2, z2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void n7h(Metadata metadata) {
            this.f20560n.n7h(metadata);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        public void oc(int i2) {
            this.f20560n.oc(i2);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: r */
        public void mo6501r() {
            this.f20560n.mo6501r();
        }
    }

    public ikck(gc3c gc3cVar) {
        this.f64800qkj8 = gc3cVar;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void a9(@zy.dd TextureView textureView) {
        this.f64800qkj8.a9(textureView);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: b */
    public void mo12078b(int i2) {
        this.f64800qkj8.mo12078b(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void b3e(tfm tfmVar) {
        this.f64800qkj8.b3e(tfmVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void b8(int i2, int i3, int i4) {
        this.f64800qkj8.b8(i2, i3, i4);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean b9ub() {
        return this.f64800qkj8.b9ub();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public int bap7() {
        return this.f64800qkj8.bap7();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int bf2() {
        return this.f64800qkj8.bf2();
    }

    public gc3c bih() {
        return this.f64800qkj8;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void bo() {
        this.f64800qkj8.bo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void bwp(boolean z2) {
        this.f64800qkj8.bwp(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long bz2() {
        return this.f64800qkj8.bz2();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: c */
    public int mo12079c() {
        return this.f64800qkj8.mo12079c();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void cfr(int i2, long j2) {
        this.f64800qkj8.cfr(i2, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ch() {
        this.f64800qkj8.ch();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void cnbm(int i2, int i3) {
        this.f64800qkj8.cnbm(i2, i3);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean cv06() {
        return this.f64800qkj8.cv06();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: d */
    public boolean mo12080d(int i2) {
        return this.f64800qkj8.mo12080d(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void d3() {
        this.f64800qkj8.d3();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pc d8wk() {
        return this.f64800qkj8.d8wk();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean dd() {
        return this.f64800qkj8.dd();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    /* JADX INFO: renamed from: do */
    public boolean mo28264do() {
        return this.f64800qkj8.mo28264do();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean dr() {
        return this.f64800qkj8.dr();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: e */
    public void mo12081e(gc3c.InterfaceC3440y interfaceC3440y) {
        this.f64800qkj8.mo12081e(new zy(this, interfaceC3440y));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was e5() {
        return this.f64800qkj8.e5();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ebn(List<tfm> list, int i2, long j2) {
        this.f64800qkj8.ebn(list, i2, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void ek5k() {
        this.f64800qkj8.ek5k();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean eqxt() {
        return this.f64800qkj8.eqxt();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public se f7l8() {
        return this.f64800qkj8.f7l8();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean fnq8() {
        return this.f64800qkj8.fnq8();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.video.wvg fti() {
        return this.f64800qkj8.fti();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void fu4(@zy.dd SurfaceHolder surfaceHolder) {
        this.f64800qkj8.fu4(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public Looper g1() {
        return this.f64800qkj8.g1();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ga(C3707i c3707i) {
        this.f64800qkj8.ga(c3707i);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3707i gbni() {
        return this.f64800qkj8.gbni();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public int gcp() {
        return this.f64800qkj8.gcp();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getCurrentPosition() {
        return this.f64800qkj8.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getDuration() {
        return this.f64800qkj8.getDuration();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getPlaybackState() {
        return this.f64800qkj8.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getRepeatMode() {
        return this.f64800qkj8.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3443h gvn7() {
        return this.f64800qkj8.gvn7();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: h */
    public void mo12082h(@zy.dd SurfaceView surfaceView) {
        this.f64800qkj8.mo12082h(surfaceView);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long h4b() {
        return this.f64800qkj8.h4b();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int h7am() {
        return this.f64800qkj8.h7am();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean hasNext() {
        return this.f64800qkj8.hasNext();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean hasPrevious() {
        return this.f64800qkj8.hasPrevious();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void hb() {
        this.f64800qkj8.hb();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: i */
    public void mo12083i(boolean z2) {
        this.f64800qkj8.mo12083i(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long ij() {
        return this.f64800qkj8.ij();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean isPlaying() {
        return this.f64800qkj8.isPlaying();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean ix() {
        return this.f64800qkj8.ix();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: j */
    public void mo12084j(List<tfm> list, boolean z2) {
        this.f64800qkj8.mo12084j(list, z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public float jp0y() {
        return this.f64800qkj8.jp0y();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long jz5() {
        return this.f64800qkj8.jz5();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: k */
    public boolean mo12085k() {
        return this.f64800qkj8.mo12085k();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kcsr(boolean z2) {
        this.f64800qkj8.kcsr(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public List<com.google.android.exoplayer2.text.toq> ki() {
        return this.f64800qkj8.ki();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long kiv() {
        return this.f64800qkj8.kiv();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kja0() {
        this.f64800qkj8.kja0();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int ktq() {
        return this.f64800qkj8.ktq();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: l */
    public tfm mo12086l() {
        return this.f64800qkj8.mo12086l();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ld6(se seVar) {
        this.f64800qkj8.ld6(seVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lh(int i2, List<tfm> list) {
        this.f64800qkj8.lh(i2, list);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int lrht() {
        return this.f64800qkj8.lrht();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lvui(int i2) {
        this.f64800qkj8.lvui(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int lw() {
        return this.f64800qkj8.lw();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void m2t() {
        this.f64800qkj8.m2t();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: n */
    public yqrt mo12087n() {
        return this.f64800qkj8.mo12087n();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long n2t() {
        return this.f64800qkj8.n2t();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void n7h(@zy.dd Surface surface) {
        this.f64800qkj8.n7h(surface);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ncyb() {
        this.f64800qkj8.ncyb();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void next() {
        this.f64800qkj8.next();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void ngy(gc3c.InterfaceC3440y interfaceC3440y) {
        this.f64800qkj8.ngy(new zy(this, interfaceC3440y));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ni7(@zy.dd TextureView textureView) {
        this.f64800qkj8.ni7(textureView);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nmn5(boolean z2) {
        this.f64800qkj8.nmn5(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nn86() {
        this.f64800qkj8.nn86();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nnh(int i2, tfm tfmVar) {
        this.f64800qkj8.nnh(i2, tfmVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nsb(was wasVar) {
        this.f64800qkj8.nsb(wasVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void oc(@zy.dd SurfaceView surfaceView) {
        this.f64800qkj8.oc(surfaceView);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void pause() {
        this.f64800qkj8.pause();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void pc(int i2) {
        this.f64800qkj8.pc(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void play() {
        this.f64800qkj8.play();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void prepare() {
        this.f64800qkj8.prepare();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void previous() {
        this.f64800qkj8.previous();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ps() {
        this.f64800qkj8.ps();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.trackselection.kja0 py() {
        return this.f64800qkj8.py();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int qo() {
        return this.f64800qkj8.qo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void qrj(@zy.dd Surface surface) {
        this.f64800qkj8.qrj(surface);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: r */
    public boolean mo12088r() {
        return this.f64800qkj8.mo12088r();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void r25n(List<tfm> list) {
        this.f64800qkj8.r25n(list);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was ra() {
        return this.f64800qkj8.ra();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void release() {
        this.f64800qkj8.release();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: s */
    public C3248g mo12089s() {
        return this.f64800qkj8.mo12089s();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void seekTo(long j2) {
        this.f64800qkj8.seekTo(j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void setPlaybackSpeed(float f2) {
        this.f64800qkj8.setPlaybackSpeed(f2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void setRepeatMode(int i2) {
        this.f64800qkj8.setRepeatMode(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long sok() {
        return this.f64800qkj8.sok();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void stop() {
        this.f64800qkj8.stop();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void t8iq() {
        this.f64800qkj8.t8iq();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pjz9 tfm() {
        return this.f64800qkj8.tfm();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void toq(float f2) {
        this.f64800qkj8.toq(f2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: u */
    public Object mo12090u() {
        return this.f64800qkj8.mo12090u();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void uf(List<tfm> list) {
        this.f64800qkj8.uf(list);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean uv6() {
        return this.f64800qkj8.uv6();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: v */
    public int mo12091v() {
        return this.f64800qkj8.mo12091v();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void vep5(tfm tfmVar, long j2) {
        this.f64800qkj8.vep5(tfmVar, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: w */
    public long mo12092w() {
        return this.f64800qkj8.mo12092w();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public gc3c.zy w831() {
        return this.f64800qkj8.w831();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean wlev() {
        return this.f64800qkj8.wlev();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3629x wo() {
        return this.f64800qkj8.wo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int wvg() {
        return this.f64800qkj8.wvg();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    /* JADX INFO: renamed from: x */
    public int mo12093x() {
        return this.f64800qkj8.mo12093x();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long x9kr() {
        return this.f64800qkj8.x9kr();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int xwq3() {
        return this.f64800qkj8.xwq3();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean y9n() {
        return this.f64800qkj8.y9n();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void yl(tfm tfmVar, boolean z2) {
        this.f64800qkj8.yl(tfmVar, z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean yqrt() {
        return this.f64800qkj8.yqrt();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public boolean yz() {
        return this.f64800qkj8.yz();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void z4(tfm tfmVar) {
        this.f64800qkj8.z4(tfmVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean z4t() {
        return this.f64800qkj8.z4t();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public tfm zkd(int i2) {
        return this.f64800qkj8.zkd(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zp(int i2, int i3) {
        this.f64800qkj8.zp(i2, i3);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zsr0() {
        this.f64800qkj8.zsr0();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zurt() {
        this.f64800qkj8.zurt();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zy(@zy.dd SurfaceHolder surfaceHolder) {
        this.f64800qkj8.zy(surfaceHolder);
    }
}
