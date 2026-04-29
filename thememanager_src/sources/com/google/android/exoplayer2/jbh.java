package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.C3552q;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.audio.C3271z;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.InterfaceC3508q;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.InterfaceC3626r;
import com.google.android.exoplayer2.t8r;
import com.google.android.exoplayer2.toq;
import com.google.android.exoplayer2.trackselection.C3707i;
import com.google.android.exoplayer2.uj2j;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3862y;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.video.InterfaceC3879p;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import com.google.android.exoplayer2.video.spherical.InterfaceC3885k;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.wx16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: SimpleExoPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class jbh extends AbstractC3518n implements t8r, t8r.InterfaceC3638k, t8r.InterfaceC3637g, t8r.InterfaceC3639n, t8r.InterfaceC3640q {

    /* JADX INFO: renamed from: ebn, reason: collision with root package name */
    private static final String f64801ebn = "SimpleExoPlayer";

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    private C3248g f64802b3e;

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    private float f64803bek6;

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    @zy.dd
    private TextureView f64804bwp;

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    private int f64805bz2;

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    @zy.dd
    private Object f64806cfr;

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    private boolean f64807cv06;

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private final zy f64808d8wk;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private C3443h f46210do;

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    @zy.dd
    private xwq3 f64809etdu;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    protected final bek6[] f64810fnq8;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private final C3448q f64811g1;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private final com.google.android.exoplayer2.analytics.zp f64812gbni;

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    private int f64813gc3c;

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    private List<com.google.android.exoplayer2.text.toq> f64814h7am;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private final wx16 f64815i9jn;

    /* JADX INFO: renamed from: ixz, reason: collision with root package name */
    private boolean f64816ixz;

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    private boolean f64817jbh;

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.decoder.f7l8 f64818jz5;

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    private boolean f64819kcsr;

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    private int f64820ktq;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private final ngy f64821ltg8;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private final long f64822m4;

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    @zy.dd
    private InterfaceC3885k f64823mbx;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private final C3552q f64824py;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private final C3862y f64825qo;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private final lh f64826r8s8;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private int f64827se;

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    @zy.dd
    private AudioTrack f64828sok;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private final Context f64829tfm;

    /* JADX INFO: renamed from: uc, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.util.oc f64830uc;

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.decoder.f7l8 f64831uj2j;

    /* JADX INFO: renamed from: ukdy, reason: collision with root package name */
    private com.google.android.exoplayer2.video.wvg f64832ukdy;

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    @zy.dd
    private xwq3 f64833v0af;

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.video.ld6 f64834vep5;

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    @zy.dd
    private Surface f64835w831;

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private final CopyOnWriteArraySet<gc3c.InterfaceC3440y> f64836was;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private final lv5 f64837wo;

    /* JADX INFO: renamed from: wx16, reason: collision with root package name */
    private boolean f64838wx16;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private boolean f64839yl;

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    @zy.dd
    private SphericalGLSurfaceView f64840yqrt;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    @zy.dd
    private SurfaceHolder f64841z4;

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    private int f64842zkd;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private final com.google.android.exoplayer2.toq f64843zsr0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.jbh$q */
    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    private static final class C3448q implements com.google.android.exoplayer2.video.ld6, InterfaceC3885k, uj2j.toq {

        /* JADX INFO: renamed from: p */
        public static final int f20563p = 10000;

        /* JADX INFO: renamed from: s */
        public static final int f20564s = 8;

        /* JADX INFO: renamed from: y */
        public static final int f20565y = 7;

        /* JADX INFO: renamed from: g */
        @zy.dd
        private InterfaceC3885k f20566g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        private com.google.android.exoplayer2.video.ld6 f20567k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        private com.google.android.exoplayer2.video.ld6 f20568n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private InterfaceC3885k f20569q;

        private C3448q() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.InterfaceC3885k
        public void f7l8() {
            InterfaceC3885k interfaceC3885k = this.f20566g;
            if (interfaceC3885k != null) {
                interfaceC3885k.f7l8();
            }
            InterfaceC3885k interfaceC3885k2 = this.f20569q;
            if (interfaceC3885k2 != null) {
                interfaceC3885k2.f7l8();
            }
        }

        @Override // com.google.android.exoplayer2.video.ld6
        /* JADX INFO: renamed from: k */
        public void mo12133k(long j2, long j3, xwq3 xwq3Var, @zy.dd MediaFormat mediaFormat) {
            com.google.android.exoplayer2.video.ld6 ld6Var = this.f20568n;
            if (ld6Var != null) {
                ld6Var.mo12133k(j2, j3, xwq3Var, mediaFormat);
            }
            com.google.android.exoplayer2.video.ld6 ld6Var2 = this.f20567k;
            if (ld6Var2 != null) {
                ld6Var2.mo12133k(j2, j3, xwq3Var, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.InterfaceC3885k
        public void toq(long j2, float[] fArr) {
            InterfaceC3885k interfaceC3885k = this.f20566g;
            if (interfaceC3885k != null) {
                interfaceC3885k.toq(j2, fArr);
            }
            InterfaceC3885k interfaceC3885k2 = this.f20569q;
            if (interfaceC3885k2 != null) {
                interfaceC3885k2.toq(j2, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.uj2j.toq
        public void x2(int i2, @zy.dd Object obj) {
            if (i2 == 7) {
                this.f20567k = (com.google.android.exoplayer2.video.ld6) obj;
                return;
            }
            if (i2 == 8) {
                this.f20569q = (InterfaceC3885k) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f20568n = null;
                this.f20566g = null;
            } else {
                this.f20568n = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f20566g = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    private final class zy implements InterfaceC3894z, com.google.android.exoplayer2.audio.fn3e, com.google.android.exoplayer2.text.n7h, InterfaceC3508q, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.toq, C3552q.zy, toq.InterfaceC7965toq, wx16.toq, gc3c.InterfaceC3434g, t8r.toq {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.toq
        public void a9(Surface surface) {
            jbh.this.f3f(null);
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void bf2(Exception exc) {
            jbh.this.f64812gbni.bf2(exc);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void cdj(com.google.android.exoplayer2.video.wvg wvgVar) {
            jbh.this.f64832ukdy = wvgVar;
            jbh.this.f64812gbni.cdj(wvgVar);
            Iterator it = jbh.this.f64836was.iterator();
            while (it.hasNext()) {
                ((gc3c.InterfaceC3440y) it.next()).cdj(wvgVar);
            }
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void ch(int i2, long j2, long j3) {
            jbh.this.f64812gbni.ch(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.wx16.toq
        public void d3(int i2, boolean z2) {
            Iterator it = jbh.this.f64836was.iterator();
            while (it.hasNext()) {
                ((gc3c.InterfaceC3440y) it.next()).lvui(i2, z2);
            }
        }

        @Override // com.google.android.exoplayer2.t8r.toq
        public void eqxt(boolean z2) {
            jbh.this.nyj();
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void f7l8(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            jbh.this.f64818jz5 = f7l8Var;
            jbh.this.f64812gbni.f7l8(f7l8Var);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fn3e(boolean z2) {
            if (jbh.this.f64830uc != null) {
                if (z2 && !jbh.this.f64838wx16) {
                    jbh.this.f64830uc.m13712k(0);
                    jbh.this.f64838wx16 = true;
                } else {
                    if (z2 || !jbh.this.f64838wx16) {
                        return;
                    }
                    jbh.this.f64830uc.m13713n(0);
                    jbh.this.f64838wx16 = false;
                }
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.toq
        public void fti(Surface surface) {
            jbh.this.f3f(surface);
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void gvn7(String str, long j2, long j3) {
            jbh.this.f64812gbni.gvn7(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.text.n7h
        /* JADX INFO: renamed from: h */
        public void mo12144h(List<com.google.android.exoplayer2.text.toq> list) {
            jbh.this.f64814h7am = list;
            Iterator it = jbh.this.f64836was.iterator();
            while (it.hasNext()) {
                ((gc3c.InterfaceC3440y) it.next()).mo12098h(list);
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void hyr(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            jbh.this.f64812gbni.hyr(f7l8Var);
            jbh.this.f64833v0af = null;
            jbh.this.f64831uj2j = null;
        }

        @Override // com.google.android.exoplayer2.wx16.toq
        /* JADX INFO: renamed from: i */
        public void mo12145i(int i2) {
            C3443h c3443hXtb7 = jbh.xtb7(jbh.this.f64815i9jn);
            if (c3443hXtb7.equals(jbh.this.f46210do)) {
                return;
            }
            jbh.this.f46210do = c3443hXtb7;
            Iterator it = jbh.this.f64836was.iterator();
            while (it.hasNext()) {
                ((gc3c.InterfaceC3440y) it.next()).d2ok(c3443hXtb7);
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        /* JADX INFO: renamed from: j */
        public void mo11367j(int i2, long j2) {
            jbh.this.f64812gbni.mo11367j(i2, j2);
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void jp0y(String str) {
            jbh.this.f64812gbni.jp0y(str);
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        /* JADX INFO: renamed from: k */
        public void mo11368k(boolean z2) {
            if (jbh.this.f64807cv06 == z2) {
                return;
            }
            jbh.this.f64807cv06 = z2;
            jbh.this.z617();
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        /* JADX INFO: renamed from: l */
        public void mo11369l(Exception exc) {
            jbh.this.f64812gbni.mo11369l(exc);
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ld6(int i2) {
            jbh.this.nyj();
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void lrht(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            jbh.this.f64812gbni.lrht(f7l8Var);
            jbh.this.f64809etdu = null;
            jbh.this.f64818jz5 = null;
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void lv5(long j2, int i2) {
            jbh.this.f64812gbni.lv5(j2, i2);
        }

        @Override // com.google.android.exoplayer2.metadata.InterfaceC3508q
        public void n7h(Metadata metadata) {
            jbh.this.f64812gbni.n7h(metadata);
            jbh.this.f64837wo.sb1e(metadata);
            Iterator it = jbh.this.f64836was.iterator();
            while (it.hasNext()) {
                ((gc3c.InterfaceC3440y) it.next()).n7h(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void ncyb(long j2) {
            jbh.this.f64812gbni.ncyb(j2);
        }

        @Override // com.google.android.exoplayer2.C3552q.zy
        public void nn86(int i2) {
            boolean zYqrt = jbh.this.yqrt();
            jbh.this.i3x9(zYqrt, i2, jbh.mi1u(zYqrt, i2));
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        /* JADX INFO: renamed from: o */
        public void mo11371o(xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            jbh.this.f64809etdu = xwq3Var;
            jbh.this.f64812gbni.mo11371o(xwq3Var, ld6Var);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            jbh.this.tjz5(surfaceTexture);
            jbh.this.lk(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            jbh.this.f3f(null);
            jbh.this.lk(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            jbh.this.lk(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            jbh.this.lk(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (jbh.this.f64819kcsr) {
                jbh.this.f3f(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (jbh.this.f64819kcsr) {
                jbh.this.f3f(null);
            }
            jbh.this.lk(0, 0);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void t8r(String str, long j2, long j3) {
            jbh.this.f64812gbni.t8r(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.fn3e
        public void toq(Exception exc) {
            jbh.this.f64812gbni.toq(exc);
        }

        @Override // com.google.android.exoplayer2.C3552q.zy
        public void vyq(float f2) {
            jbh.this.ab();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void wvg(boolean z2, int i2) {
            jbh.this.nyj();
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void x9kr(xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            jbh.this.f64833v0af = xwq3Var;
            jbh.this.f64812gbni.x9kr(xwq3Var, ld6Var);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void y9n(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            jbh.this.f64831uj2j = f7l8Var;
            jbh.this.f64812gbni.y9n(f7l8Var);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void yz(Object obj, long j2) {
            jbh.this.f64812gbni.yz(obj, j2);
            if (jbh.this.f64806cfr == obj) {
                Iterator it = jbh.this.f64836was.iterator();
                while (it.hasNext()) {
                    ((gc3c.InterfaceC3440y) it.next()).mo6501r();
                }
            }
        }

        @Override // com.google.android.exoplayer2.toq.InterfaceC7965toq
        public void zurt() {
            jbh.this.i3x9(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC3894z
        public void zy(String str) {
            jbh.this.f64812gbni.zy(str);
        }
    }

    @Deprecated
    protected jbh(Context context, vep5 vep5Var, com.google.android.exoplayer2.trackselection.zurt zurtVar, InterfaceC3626r interfaceC3626r, fnq8 fnq8Var, InterfaceC3808n interfaceC3808n, com.google.android.exoplayer2.analytics.zp zpVar, boolean z2, InterfaceC3850n interfaceC3850n, Looper looper) {
        this(new t8r.zy(context, vep5Var, interfaceC3626r, zurtVar, fnq8Var, interfaceC3808n, zpVar).nmn5(z2).nn86(interfaceC3850n).ek5k(looper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        wtop(1, 2, Float.valueOf(this.f64803bek6 * this.f64824py.m12521y()));
    }

    private void c25(SurfaceHolder surfaceHolder) {
        this.f64819kcsr = false;
        this.f64841z4 = surfaceHolder;
        surfaceHolder.addCallback(this.f64808d8wk);
        Surface surface = this.f64841z4.getSurface();
        if (surface == null || !surface.isValid()) {
            lk(0, 0);
        } else {
            Rect surfaceFrame = this.f64841z4.getSurfaceFrame();
            lk(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3f(@zy.dd Object obj) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        bek6[] bek6VarArr = this.f64810fnq8;
        int length = bek6VarArr.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                break;
            }
            bek6 bek6Var = bek6VarArr[i2];
            if (bek6Var.mo11551n() == 2) {
                arrayList.add(this.f64837wo.ew(bek6Var).fn3e(1).ki(obj).n7h());
            }
            i2++;
        }
        Object obj2 = this.f64806cfr;
        if (obj2 == null || obj2 == obj) {
            z2 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((uj2j) it.next()).toq(this.f64822m4);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z2 = false;
            Object obj3 = this.f64806cfr;
            Surface surface = this.f64835w831;
            if (obj3 == surface) {
                surface.release();
                this.f64835w831 = null;
            }
        }
        this.f64806cfr = obj;
        if (z2) {
            this.f64837wo.nc(false, ki.createForUnexpected(new gyi(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3x9(boolean z2, int i2, int i3) {
        int i4 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i4 = 1;
        }
        this.f64837wo.vg(z3, i4, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(int i2, int i3) {
        if (i2 == this.f64842zkd && i3 == this.f64805bz2) {
            return;
        }
        this.f64842zkd = i2;
        this.f64805bz2 = i3;
        this.f64812gbni.mo11363c(i2, i3);
        Iterator<gc3c.InterfaceC3440y> it = this.f64836was.iterator();
        while (it.hasNext()) {
            it.next().mo11363c(i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mi1u(boolean z2, int i2) {
        return (!z2 || i2 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nyj() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.f64821ltg8.toq(yqrt() && !a5id());
                this.f64826r8s8.toq(yqrt());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f64821ltg8.toq(false);
        this.f64826r8s8.toq(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tjz5(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        f3f(surface);
        this.f64835w831 = surface;
    }

    private void vss1() {
        this.f64825qo.zy();
        if (Thread.currentThread() != g1().getThread()) {
            String strGvn7 = com.google.android.exoplayer2.util.lrht.gvn7("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), g1().getThread().getName());
            if (this.f64817jbh) {
                throw new IllegalStateException(strGvn7);
            }
            com.google.android.exoplayer2.util.ni7.n7h(f64801ebn, strGvn7, this.f64839yl ? null : new IllegalStateException());
            this.f64839yl = true;
        }
    }

    private int vwb(int i2) {
        AudioTrack audioTrack = this.f64828sok;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i2) {
            this.f64828sok.release();
            this.f64828sok = null;
        }
        if (this.f64828sok == null) {
            this.f64828sok = new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
        }
        return this.f64828sok.getAudioSessionId();
    }

    private void wtop(int i2, int i3, @zy.dd Object obj) {
        for (bek6 bek6Var : this.f64810fnq8) {
            if (bek6Var.mo11551n() == i2) {
                this.f64837wo.ew(bek6Var).fn3e(i3).ki(obj).n7h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3443h xtb7(wx16 wx16Var) {
        return new C3443h(0, wx16Var.m13908n(), wx16Var.m13910q());
    }

    private void xzl() {
        if (this.f64840yqrt != null) {
            this.f64837wo.ew(this.f64811g1).fn3e(10000).ki(null).n7h();
            this.f64840yqrt.m13836s(this.f64808d8wk);
            this.f64840yqrt = null;
        }
        TextureView textureView = this.f64804bwp;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f64808d8wk) {
                com.google.android.exoplayer2.util.ni7.qrj(f64801ebn, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f64804bwp.setSurfaceTextureListener(null);
            }
            this.f64804bwp = null;
        }
        SurfaceHolder surfaceHolder = this.f64841z4;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f64808d8wk);
            this.f64841z4 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z617() {
        this.f64812gbni.mo11368k(this.f64807cv06);
        Iterator<gc3c.InterfaceC3440y> it = this.f64836was.iterator();
        while (it.hasNext()) {
            it.next().mo11368k(this.f64807cv06);
        }
    }

    @Override // com.google.android.exoplayer2.t8r
    /* JADX INFO: renamed from: a */
    public void mo12123a(List<com.google.android.exoplayer2.source.fti> list) {
        vss1();
        this.f64837wo.m12172a(list);
    }

    @Override // com.google.android.exoplayer2.t8r
    public boolean a5id() {
        vss1();
        return this.f64837wo.a5id();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void a9(@zy.dd TextureView textureView) {
        vss1();
        if (textureView == null || textureView != this.f64804bwp) {
            return;
        }
        d3();
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void a98o(gc3c.InterfaceC3434g interfaceC3434g) {
        this.f64837wo.zma(interfaceC3434g);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void b8(int i2, int i3, int i4) {
        vss1();
        this.f64837wo.b8(i2, i3, i4);
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void bek6(gc3c.InterfaceC3434g interfaceC3434g) {
        C3844k.f7l8(interfaceC3434g);
        this.f64837wo.hyow(interfaceC3434g);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public void bwp(boolean z2) {
        vss1();
        this.f64824py.cdj(yqrt(), 1);
        this.f64837wo.bwp(z2);
        this.f64814h7am = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long bz2() {
        vss1();
        return this.f64837wo.bz2();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void c8jq(List<com.google.android.exoplayer2.source.fti> list, boolean z2) {
        vss1();
        this.f64837wo.c8jq(list, z2);
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public int cdj() {
        return this.f64813gc3c;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void cfr(int i2, long j2) {
        vss1();
        this.f64812gbni.f3f();
        this.f64837wo.cfr(i2, j2);
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public int d2ok() {
        return this.f64827se;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void d3() {
        vss1();
        xzl();
        f3f(null);
        lk(0, 0);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pc d8wk() {
        vss1();
        return this.f64837wo.d8wk();
    }

    @Override // com.google.android.exoplayer2.t8r
    public Looper dxef() {
        return this.f64837wo.dxef();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: e */
    public void mo12081e(gc3c.InterfaceC3440y interfaceC3440y) {
        C3844k.f7l8(interfaceC3440y);
        this.f64836was.remove(interfaceC3440y);
        a98o(interfaceC3440y);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was e5() {
        return this.f64837wo.e5();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ebn(List<tfm> list, int i2, long j2) {
        vss1();
        this.f64837wo.ebn(list, i2, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean eqxt() {
        vss1();
        return this.f64815i9jn.m13909p();
    }

    @Override // com.google.android.exoplayer2.t8r
    public boolean etdu() {
        vss1();
        return this.f64837wo.etdu();
    }

    @Override // com.google.android.exoplayer2.t8r
    public uj2j ew(uj2j.toq toqVar) {
        vss1();
        return this.f64837wo.ew(toqVar);
    }

    @Override // com.google.android.exoplayer2.t8r
    /* JADX INFO: renamed from: f */
    public void mo12124f(com.google.android.exoplayer2.source.fti ftiVar) {
        vss1();
        this.f64837wo.m12173f(ftiVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public se f7l8() {
        vss1();
        return this.f64837wo.f7l8();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public void fn3e(int i2) {
        vss1();
        if (this.f64813gc3c == i2) {
            return;
        }
        this.f64813gc3c = i2;
        wtop(2, 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.video.wvg fti() {
        return this.f64832ukdy;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void fu4(@zy.dd SurfaceHolder surfaceHolder) {
        vss1();
        if (surfaceHolder == null || surfaceHolder != this.f64841z4) {
            return;
        }
        d3();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    /* JADX INFO: renamed from: g */
    public void mo12125g(int i2) {
        vss1();
        this.f64827se = i2;
        wtop(2, 4, Integer.valueOf(i2));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public Looper g1() {
        return this.f64837wo.g1();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ga(C3707i c3707i) {
        vss1();
        this.f64837wo.ga(c3707i);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3707i gbni() {
        vss1();
        return this.f64837wo.gbni();
    }

    @Override // com.google.android.exoplayer2.t8r
    public int gc3c() {
        vss1();
        return this.f64837wo.gc3c();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    public int getAudioSessionId() {
        return this.f64820ktq;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getCurrentPosition() {
        vss1();
        return this.f64837wo.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long getDuration() {
        vss1();
        return this.f64837wo.getDuration();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getPlaybackState() {
        vss1();
        return this.f64837wo.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int getRepeatMode() {
        vss1();
        return this.f64837wo.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3443h gvn7() {
        vss1();
        return this.f46210do;
    }

    @Override // com.google.android.exoplayer2.t8r
    public void gyi(boolean z2) {
        vss1();
        this.f64837wo.gyi(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: h */
    public void mo12082h(@zy.dd SurfaceView surfaceView) {
        vss1();
        if (surfaceView instanceof InterfaceC3879p) {
            xzl();
            f3f(surfaceView);
            c25(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                zy(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            xzl();
            this.f64840yqrt = (SphericalGLSurfaceView) surfaceView;
            this.f64837wo.ew(this.f64811g1).fn3e(10000).ki(this.f64840yqrt).n7h();
            this.f64840yqrt.m13835q(this.f64808d8wk);
            f3f(this.f64840yqrt.getVideoSurface());
            c25(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long h4b() {
        vss1();
        return this.f64837wo.h4b();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int h7am() {
        vss1();
        return this.f64837wo.h7am();
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public com.google.android.exoplayer2.trackselection.zurt hyr() {
        vss1();
        return this.f64837wo.hyr();
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: i */
    public void mo12083i(boolean z2) {
        vss1();
        this.f64815i9jn.x2(z2);
    }

    @Override // com.google.android.exoplayer2.t8r
    public void i1(t8r.toq toqVar) {
        this.f64837wo.i1(toqVar);
    }

    @Override // com.google.android.exoplayer2.t8r
    public int i9jn(int i2) {
        vss1();
        return this.f64837wo.i9jn(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long ij() {
        vss1();
        return this.f64837wo.ij();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void ikck(boolean z2) {
        vss1();
        if (this.f64816ixz) {
            return;
        }
        this.f64843zsr0.toq(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean ix() {
        vss1();
        return this.f64837wo.ix();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void ixz(t8r.toq toqVar) {
        this.f64837wo.ixz(toqVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: j */
    public void mo12084j(List<tfm> list, boolean z2) {
        vss1();
        this.f64837wo.mo12084j(list, z2);
    }

    @Override // com.google.android.exoplayer2.t8r
    public void jbh(InterfaceC3239x interfaceC3239x) {
        this.f64812gbni.vss1(interfaceC3239x);
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public void jk(InterfaceC3885k interfaceC3885k) {
        vss1();
        if (this.f64823mbx != interfaceC3885k) {
            return;
        }
        this.f64837wo.ew(this.f64811g1).fn3e(8).ki(null).n7h();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public float jp0y() {
        return this.f64803bek6;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: k */
    public boolean mo12085k() {
        vss1();
        return this.f64837wo.mo12085k();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kcsr(boolean z2) {
        vss1();
        this.f64837wo.kcsr(z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public List<com.google.android.exoplayer2.text.toq> ki() {
        vss1();
        return this.f64814h7am;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long kiv() {
        vss1();
        return this.f64837wo.kiv();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void kja0() {
        vss1();
        this.f64815i9jn.zy();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int ktq() {
        vss1();
        return this.f64837wo.ktq();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void kx3(InterfaceC3239x interfaceC3239x) {
        C3844k.f7l8(interfaceC3239x);
        this.f64812gbni.bap7(interfaceC3239x);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ld6(se seVar) {
        vss1();
        this.f64837wo.ld6(seVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lh(int i2, List<tfm> list) {
        vss1();
        this.f64837wo.lh(i2, list);
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public t8r.InterfaceC3639n ltg8() {
        return this;
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public t8r.InterfaceC3637g lv5() {
        return this;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void lvui(int i2) {
        vss1();
        this.f64815i9jn.n7h(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int lw() {
        vss1();
        return this.f64837wo.lw();
    }

    @Override // com.google.android.exoplayer2.t8r
    /* JADX INFO: renamed from: m */
    public void mo12126m(int i2, com.google.android.exoplayer2.source.fti ftiVar) {
        vss1();
        this.f64837wo.m12174m(i2, ftiVar);
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void m4(com.google.android.exoplayer2.source.fti ftiVar, boolean z2, boolean z3) {
        vss1();
        c8jq(Collections.singletonList(ftiVar), z2);
        prepare();
    }

    @Override // com.google.android.exoplayer2.t8r
    public mbx m58i() {
        vss1();
        return this.f64837wo.m58i();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void mbx(List<com.google.android.exoplayer2.source.fti> list) {
        vss1();
        this.f64837wo.mbx(list);
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public void mcp(com.google.android.exoplayer2.video.ld6 ld6Var) {
        vss1();
        this.f64834vep5 = ld6Var;
        this.f64837wo.ew(this.f64811g1).fn3e(7).ki(ld6Var).n7h();
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void mu(com.google.android.exoplayer2.source.fti ftiVar) {
        m4(ftiVar, true, true);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long n2t() {
        vss1();
        return this.f64837wo.n2t();
    }

    @Override // com.google.android.exoplayer2.t8r
    public InterfaceC3850n n5r1() {
        return this.f64837wo.n5r1();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void n7h(@zy.dd Surface surface) {
        vss1();
        if (surface == null || surface != this.f64806cfr) {
            return;
        }
        d3();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ngy(gc3c.InterfaceC3440y interfaceC3440y) {
        C3844k.f7l8(interfaceC3440y);
        this.f64836was.add(interfaceC3440y);
        bek6(interfaceC3440y);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void ni7(@zy.dd TextureView textureView) {
        vss1();
        if (textureView == null) {
            d3();
            return;
        }
        xzl();
        this.f64804bwp = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.google.android.exoplayer2.util.ni7.qrj(f64801ebn, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f64808d8wk);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            f3f(null);
            lk(0, 0);
        } else {
            tjz5(surfaceTexture);
            lk(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.t8r
    public com.google.android.exoplayer2.analytics.zp nme() {
        return this.f64812gbni;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nmn5(boolean z2) {
        vss1();
        int iCdj = this.f64824py.cdj(z2, getPlaybackState());
        i3x9(z2, iCdj, mi1u(z2, iCdj));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void nsb(was wasVar) {
        this.f64837wo.nsb(wasVar);
    }

    @Override // com.google.android.exoplayer2.t8r
    /* JADX INFO: renamed from: o */
    public void mo12127o(boolean z2) {
        vss1();
        this.f64837wo.m12175o(z2);
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void o05(boolean z2) {
        this.f64817jbh = z2;
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    public void o1t(C3248g c3248g, boolean z2) {
        vss1();
        if (this.f64816ixz) {
            return;
        }
        if (!com.google.android.exoplayer2.util.lrht.zy(this.f64802b3e, c3248g)) {
            this.f64802b3e = c3248g;
            wtop(1, 3, c3248g);
            this.f64815i9jn.qrj(com.google.android.exoplayer2.util.lrht.nmn5(c3248g.f19341n));
            this.f64812gbni.ek5k(c3248g);
            Iterator<gc3c.InterfaceC3440y> it = this.f64836was.iterator();
            while (it.hasNext()) {
                it.next().ek5k(c3248g);
            }
        }
        C3552q c3552q = this.f64824py;
        if (!z2) {
            c3248g = null;
        }
        c3552q.n7h(c3248g);
        boolean zYqrt = yqrt();
        int iCdj = this.f64824py.cdj(zYqrt, getPlaybackState());
        i3x9(zYqrt, iCdj, mi1u(zYqrt, iCdj));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void oc(@zy.dd SurfaceView surfaceView) {
        vss1();
        fu4(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.t8r
    public void oki(int i2) {
        vss1();
        if (i2 == 0) {
            this.f64821ltg8.m12358k(false);
            this.f64826r8s8.m12170k(false);
        } else if (i2 == 1) {
            this.f64821ltg8.m12358k(true);
            this.f64826r8s8.m12170k(false);
        } else {
            if (i2 != 2) {
                return;
            }
            this.f64821ltg8.m12358k(true);
            this.f64826r8s8.m12170k(true);
        }
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    /* JADX INFO: renamed from: p */
    public boolean mo12128p() {
        return this.f64807cv06;
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public xwq3 pjz9() {
        return this.f64809etdu;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void prepare() {
        vss1();
        boolean zYqrt = yqrt();
        int iCdj = this.f64824py.cdj(zYqrt, 2);
        i3x9(zYqrt, iCdj, mi1u(zYqrt, iCdj));
        this.f64837wo.prepare();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public com.google.android.exoplayer2.trackselection.kja0 py() {
        vss1();
        return this.f64837wo.py();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    /* JADX INFO: renamed from: q */
    public void mo12129q(int i2) {
        vss1();
        if (this.f64820ktq == i2) {
            return;
        }
        if (i2 == 0) {
            i2 = com.google.android.exoplayer2.util.lrht.f23230k < 21 ? vwb(0) : com.google.android.exoplayer2.util.lrht.eqxt(this.f64829tfm);
        } else if (com.google.android.exoplayer2.util.lrht.f23230k < 21) {
            vwb(i2);
        }
        this.f64820ktq = i2;
        wtop(1, 10, Integer.valueOf(i2));
        wtop(2, 10, Integer.valueOf(i2));
        this.f64812gbni.oc(i2);
        Iterator<gc3c.InterfaceC3440y> it = this.f64836was.iterator();
        while (it.hasNext()) {
            it.next().oc(i2);
        }
    }

    @Override // com.google.android.exoplayer2.t8r
    public void qkj8(List<com.google.android.exoplayer2.source.fti> list, int i2, long j2) {
        vss1();
        this.f64837wo.qkj8(list, i2, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int qo() {
        vss1();
        return this.f64837wo.qo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void qrj(@zy.dd Surface surface) {
        vss1();
        xzl();
        f3f(surface);
        int i2 = surface == null ? 0 : -1;
        lk(i2, i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: r */
    public boolean mo12088r() {
        vss1();
        return this.f64837wo.mo12088r();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void r8s8(com.google.android.exoplayer2.source.fti ftiVar, long j2) {
        vss1();
        this.f64837wo.r8s8(ftiVar, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public was ra() {
        return this.f64837wo.ra();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void release() {
        AudioTrack audioTrack;
        vss1();
        if (com.google.android.exoplayer2.util.lrht.f23230k < 21 && (audioTrack = this.f64828sok) != null) {
            audioTrack.release();
            this.f64828sok = null;
        }
        this.f64843zsr0.toq(false);
        this.f64815i9jn.ld6();
        this.f64821ltg8.toq(false);
        this.f64826r8s8.toq(false);
        this.f64824py.m12520p();
        this.f64837wo.release();
        this.f64812gbni.i3x9();
        xzl();
        Surface surface = this.f64835w831;
        if (surface != null) {
            surface.release();
            this.f64835w831 = null;
        }
        if (this.f64838wx16) {
            ((com.google.android.exoplayer2.util.oc) C3844k.f7l8(this.f64830uc)).m13713n(0);
            this.f64838wx16 = false;
        }
        this.f64814h7am = Collections.emptyList();
        this.f64816ixz = true;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: s */
    public C3248g mo12089s() {
        return this.f64802b3e;
    }

    @Override // com.google.android.exoplayer2.t8r
    public void se(@zy.dd mbx mbxVar) {
        vss1();
        this.f64837wo.se(mbxVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void setRepeatMode(int i2) {
        vss1();
        this.f64837wo.setRepeatMode(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void stop() {
        bwp(false);
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    /* JADX INFO: renamed from: t */
    public void mo12130t(InterfaceC3885k interfaceC3885k) {
        vss1();
        this.f64823mbx = interfaceC3885k;
        this.f64837wo.ew(this.f64811g1).fn3e(8).ki(interfaceC3885k).n7h();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3637g
    public void t8r(com.google.android.exoplayer2.video.ld6 ld6Var) {
        vss1();
        if (this.f64834vep5 != ld6Var) {
            return;
        }
        this.f64837wo.ew(this.f64811g1).fn3e(7).ki(null).n7h();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public pjz9 tfm() {
        vss1();
        return this.f64837wo.tfm();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void toq(float f2) {
        vss1();
        float fKi = com.google.android.exoplayer2.util.lrht.ki(f2, 0.0f, 1.0f);
        if (this.f64803bek6 == fKi) {
            return;
        }
        this.f64803bek6 = fKi;
        ab();
        this.f64812gbni.hb(fKi);
        Iterator<gc3c.InterfaceC3440y> it = this.f64836was.iterator();
        while (it.hasNext()) {
            it.next().hb(fKi);
        }
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public com.google.android.exoplayer2.decoder.f7l8 u38j() {
        return this.f64818jz5;
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public t8r.InterfaceC3640q uc() {
        return this;
    }

    @Override // com.google.android.exoplayer2.t8r
    public void uj2j(int i2, List<com.google.android.exoplayer2.source.fti> list) {
        vss1();
        this.f64837wo.uj2j(i2, list);
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public t8r.InterfaceC3638k ukdy() {
        return this;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: v */
    public int mo12091v() {
        vss1();
        return this.f64837wo.mo12091v();
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void v0af() {
        vss1();
        prepare();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void v5yj(com.google.android.exoplayer2.source.fti ftiVar, boolean z2) {
        vss1();
        this.f64837wo.v5yj(ftiVar, z2);
    }

    @Override // com.google.android.exoplayer2.t8r
    public void vq(boolean z2) {
        vss1();
        this.f64837wo.vq(z2);
    }

    @Override // com.google.android.exoplayer2.t8r
    public void vy(InterfaceC3612m interfaceC3612m) {
        vss1();
        this.f64837wo.vy(interfaceC3612m);
    }

    @Override // com.google.android.exoplayer2.t8r
    public void vyq(com.google.android.exoplayer2.source.fti ftiVar) {
        vss1();
        this.f64837wo.vyq(ftiVar);
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: w */
    public long mo12092w() {
        vss1();
        return this.f64837wo.mo12092w();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public gc3c.zy w831() {
        vss1();
        return this.f64837wo.w831();
    }

    @Override // com.google.android.exoplayer2.t8r
    @Deprecated
    public void was(boolean z2) {
        oki(z2 ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public C3629x wo() {
        vss1();
        return this.f64837wo.wo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public int wvg() {
        vss1();
        return this.f64815i9jn.f7l8();
    }

    @Override // com.google.android.exoplayer2.t8r
    public void wx16(@zy.dd com.google.android.exoplayer2.util.oc ocVar) {
        vss1();
        if (com.google.android.exoplayer2.util.lrht.zy(this.f64830uc, ocVar)) {
            return;
        }
        if (this.f64838wx16) {
            ((com.google.android.exoplayer2.util.oc) C3844k.f7l8(this.f64830uc)).m13713n(0);
        }
        if (ocVar == null || !mo12085k()) {
            this.f64838wx16 = false;
        } else {
            ocVar.m13712k(0);
            this.f64838wx16 = true;
        }
        this.f64830uc = ocVar;
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    public void x2(boolean z2) {
        vss1();
        if (this.f64807cv06 == z2) {
            return;
        }
        this.f64807cv06 = z2;
        wtop(1, 9, Boolean.valueOf(z2));
        z617();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public long x9kr() {
        vss1();
        return this.f64837wo.x9kr();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    /* JADX INFO: renamed from: y */
    public void mo12131y(C3271z c3271z) {
        vss1();
        wtop(1, 6, c3271z);
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public xwq3 y2() {
        return this.f64833v0af;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public boolean yqrt() {
        vss1();
        return this.f64837wo.yqrt();
    }

    @Override // com.google.android.exoplayer2.t8r, com.google.android.exoplayer2.t8r.InterfaceC3638k
    /* JADX INFO: renamed from: z */
    public void mo12132z() {
        mo12131y(new C3271z(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zp(int i2, int i3) {
        vss1();
        this.f64837wo.zp(i2, i3);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zurt() {
        vss1();
        this.f64815i9jn.m13911s();
    }

    @Override // com.google.android.exoplayer2.t8r
    @zy.dd
    public com.google.android.exoplayer2.decoder.f7l8 zwy() {
        return this.f64831uj2j;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public void zy(@zy.dd SurfaceHolder surfaceHolder) {
        vss1();
        if (surfaceHolder == null) {
            d3();
            return;
        }
        xzl();
        this.f64819kcsr = true;
        this.f64841z4 = surfaceHolder;
        surfaceHolder.addCallback(this.f64808d8wk);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            f3f(null);
            lk(0, 0);
        } else {
            f3f(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            lk(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: compiled from: SimpleExoPlayer.java */
    @Deprecated
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final t8r.zy f20570k;

        @Deprecated
        public toq(Context context) {
            this.f20570k = new t8r.zy(context);
        }

        @Deprecated
        public toq cdj(@zy.a9(from = 1) long j2) {
            this.f20570k.a98o(j2);
            return this;
        }

        @Deprecated
        @zy.yz
        public toq f7l8(InterfaceC3850n interfaceC3850n) {
            this.f20570k.nn86(interfaceC3850n);
            return this;
        }

        @Deprecated
        public toq fn3e(com.google.android.exoplayer2.trackselection.zurt zurtVar) {
            this.f20570k.ch(zurtVar);
            return this;
        }

        @Deprecated
        public toq fu4(int i2) {
            this.f20570k.t8iq(i2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: g */
        public toq m12135g(InterfaceC3808n interfaceC3808n) {
            this.f20570k.m12851e(interfaceC3808n);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: h */
        public toq m12136h(long j2) {
            this.f20570k.bf2(j2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: i */
        public toq m12137i(boolean z2) {
            this.f20570k.m12856x(z2);
            return this;
        }

        @Deprecated
        public toq ki(@zy.a9(from = 1) long j2) {
            this.f20570k.m12849a(j2);
            return this;
        }

        @Deprecated
        public toq kja0(@zy.dd com.google.android.exoplayer2.util.oc ocVar) {
            this.f20570k.m12850b(ocVar);
            return this;
        }

        @Deprecated
        public toq ld6(fnq8 fnq8Var) {
            this.f20570k.m12853m(fnq8Var);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: n */
        public toq m12138n(C3248g c3248g, boolean z2) {
            this.f20570k.vyq(c3248g, z2);
            return this;
        }

        @Deprecated
        public toq n7h(boolean z2) {
            this.f20570k.y9n(z2);
            return this;
        }

        @Deprecated
        public toq ni7(int i2) {
            this.f20570k.lv5(i2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: p */
        public toq m12139p(qkj8 qkj8Var) {
            this.f20570k.m12854o(qkj8Var);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public toq m12140q(com.google.android.exoplayer2.analytics.zp zpVar) {
            this.f20570k.uv6(zpVar);
            return this;
        }

        @Deprecated
        public toq qrj(InterfaceC3626r interfaceC3626r) {
            this.f20570k.yz(interfaceC3626r);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: s */
        public toq m12141s(boolean z2) {
            this.f20570k.m12852j(z2);
            return this;
        }

        @Deprecated
        public toq t8r(mbx mbxVar) {
            this.f20570k.zp(mbxVar);
            return this;
        }

        @Deprecated
        public jbh toq() {
            return this.f20570k.m12857z();
        }

        @Deprecated
        public toq x2(Looper looper) {
            this.f20570k.ek5k(looper);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public toq m12142y(long j2) {
            this.f20570k.hb(j2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: z */
        public toq m12143z(int i2) {
            this.f20570k.m12855u(i2);
            return this;
        }

        @Deprecated
        public toq zurt(boolean z2) {
            this.f20570k.nmn5(z2);
            return this;
        }

        @Deprecated
        public toq zy(long j2) {
            this.f20570k.o1t(j2);
            return this;
        }

        @Deprecated
        public toq(Context context, vep5 vep5Var) {
            this.f20570k = new t8r.zy(context, vep5Var);
        }

        @Deprecated
        public toq(Context context, com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            this.f20570k = new t8r.zy(context, new com.google.android.exoplayer2.source.n7h(context, kja0Var));
        }

        @Deprecated
        public toq(Context context, vep5 vep5Var, com.google.android.exoplayer2.extractor.kja0 kja0Var) {
            this.f20570k = new t8r.zy(context, vep5Var, new com.google.android.exoplayer2.source.n7h(context, kja0Var));
        }

        @Deprecated
        public toq(Context context, vep5 vep5Var, com.google.android.exoplayer2.trackselection.zurt zurtVar, InterfaceC3626r interfaceC3626r, fnq8 fnq8Var, InterfaceC3808n interfaceC3808n, com.google.android.exoplayer2.analytics.zp zpVar) {
            this.f20570k = new t8r.zy(context, vep5Var, interfaceC3626r, zurtVar, fnq8Var, interfaceC3808n, zpVar);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: n */
    public ki mo12087n() {
        vss1();
        return this.f64837wo.mo12087n();
    }

    protected jbh(toq toqVar) {
        this(toqVar.f20570k);
    }

    jbh(t8r.zy zyVar) throws Throwable {
        jbh jbhVar;
        C3862y c3862y = new C3862y();
        this.f64825qo = c3862y;
        try {
            Context applicationContext = zyVar.f21778k.getApplicationContext();
            this.f64829tfm = applicationContext;
            com.google.android.exoplayer2.analytics.zp zpVar = zyVar.f21782s.get();
            this.f64812gbni = zpVar;
            this.f64830uc = zyVar.f65482ld6;
            this.f64802b3e = zyVar.f65490x2;
            this.f64827se = zyVar.f65476cdj;
            this.f64813gc3c = zyVar.f65480ki;
            this.f64807cv06 = zyVar.f21776h;
            this.f64822m4 = zyVar.f21784z;
            zy zyVar2 = new zy();
            this.f64808d8wk = zyVar2;
            C3448q c3448q = new C3448q();
            this.f64811g1 = c3448q;
            this.f64836was = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(zyVar.f21780p);
            bek6[] bek6VarArrMo12352k = zyVar.f21781q.get().mo12352k(handler, zyVar2, zyVar2, zyVar2, zyVar2);
            this.f64810fnq8 = bek6VarArrMo12352k;
            this.f64803bek6 = 1.0f;
            if (com.google.android.exoplayer2.util.lrht.f23230k < 21) {
                this.f64820ktq = vwb(0);
            } else {
                this.f64820ktq = com.google.android.exoplayer2.util.lrht.eqxt(applicationContext);
            }
            this.f64814h7am = Collections.emptyList();
            this.f64817jbh = true;
            gc3c.zy.C3441k c3441k = new gc3c.zy.C3441k();
            int[] iArr = new int[8];
            iArr[0] = 21;
            iArr[1] = 22;
            iArr[2] = 23;
            try {
                iArr[3] = 24;
                iArr[4] = 25;
                iArr[5] = 26;
                iArr[6] = 27;
                iArr[7] = 28;
                lv5 lv5Var = new lv5(bek6VarArrMo12352k, zyVar.f21775g.get(), zyVar.f21779n.get(), zyVar.f65477f7l8.get(), zyVar.f21783y.get(), zpVar, zyVar.f65487t8r, zyVar.f21777i, zyVar.f65478fn3e, zyVar.f65491zurt, zyVar.f65484ni7, zyVar.f65479fu4, zyVar.f65485o1t, zyVar.f65488toq, zyVar.f21780p, this, c3441k.zy(iArr).m12104g());
                jbhVar = this;
                try {
                    jbhVar.f64837wo = lv5Var;
                    lv5Var.hyow(zyVar2);
                    lv5Var.i1(zyVar2);
                    long j2 = zyVar.f65492zy;
                    if (j2 > 0) {
                        lv5Var.lk(j2);
                    }
                    com.google.android.exoplayer2.toq toqVar = new com.google.android.exoplayer2.toq(zyVar.f21778k, handler, zyVar2);
                    jbhVar.f64843zsr0 = toqVar;
                    toqVar.toq(zyVar.f65481kja0);
                    C3552q c3552q = new C3552q(zyVar.f21778k, handler, zyVar2);
                    jbhVar.f64824py = c3552q;
                    c3552q.n7h(zyVar.f65486qrj ? jbhVar.f64802b3e : null);
                    wx16 wx16Var = new wx16(zyVar.f21778k, handler, zyVar2);
                    jbhVar.f64815i9jn = wx16Var;
                    wx16Var.qrj(com.google.android.exoplayer2.util.lrht.nmn5(jbhVar.f64802b3e.f19341n));
                    ngy ngyVar = new ngy(zyVar.f21778k);
                    jbhVar.f64821ltg8 = ngyVar;
                    ngyVar.m12358k(zyVar.f65483n7h != 0);
                    lh lhVar = new lh(zyVar.f21778k);
                    jbhVar.f64826r8s8 = lhVar;
                    lhVar.m12170k(zyVar.f65483n7h == 2);
                    jbhVar.f46210do = xtb7(wx16Var);
                    jbhVar.f64832ukdy = com.google.android.exoplayer2.video.wvg.f23568i;
                    jbhVar.wtop(1, 10, Integer.valueOf(jbhVar.f64820ktq));
                    jbhVar.wtop(2, 10, Integer.valueOf(jbhVar.f64820ktq));
                    jbhVar.wtop(1, 3, jbhVar.f64802b3e);
                    jbhVar.wtop(2, 4, Integer.valueOf(jbhVar.f64827se));
                    jbhVar.wtop(2, 5, Integer.valueOf(jbhVar.f64813gc3c));
                    jbhVar.wtop(1, 9, Boolean.valueOf(jbhVar.f64807cv06));
                    jbhVar.wtop(2, 7, c3448q);
                    jbhVar.wtop(6, 8, c3448q);
                    c3862y.m13762g();
                } catch (Throwable th) {
                    th = th;
                    jbhVar.f64825qo.m13762g();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                jbhVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            jbhVar = this;
        }
    }
}
