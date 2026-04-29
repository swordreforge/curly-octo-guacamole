package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.ui.hyr;
import com.google.android.exoplayer2.util.C3844k;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.InterfaceC7830i;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {
    private static final int sk1t = 1000;
    public static final int tgs = 0;
    public static final int w97r = 5000;
    public static final int yl25 = 200;
    public static final int zmmu = 100;

    /* JADX INFO: renamed from: a */
    private final Drawable f22399a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final Drawable f66071ab;
    private boolean ac;
    private boolean ad;
    private long aj;
    private boolean am;
    private final String an;
    private long[] ar;
    private boolean as;
    private int ax;
    private boolean ay;
    private boolean az;

    /* JADX INFO: renamed from: b */
    private final Runnable f22400b;
    private int ba;
    private final float bb;
    private boolean[] bc;
    private long bd;
    private boolean be;
    private boolean bg;
    private boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final String f66072bo;
    private final float bp;
    private int bq;
    private long[] bs;
    private long bu;
    private final String bv;

    /* JADX INFO: renamed from: c */
    private final StringBuilder f22401c;

    /* JADX INFO: renamed from: d */
    private final String f22402d;

    /* JADX INFO: renamed from: e */
    private final Formatter f22403e;

    /* JADX INFO: renamed from: f */
    @zy.dd
    private final hyr f22404f;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final View f22405g;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private final View f22406h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private final ImageView f22407i;

    @zy.dd
    private gc3c id;

    @zy.dd
    private InterfaceC3723q in;

    /* JADX INFO: renamed from: j */
    private final pc.toq f22408j;

    /* JADX INFO: renamed from: k */
    private final zy f22409k;
    private boolean[] k0;

    /* JADX INFO: renamed from: l */
    @zy.dd
    private final TextView f22410l;

    /* JADX INFO: renamed from: m */
    private final Runnable f22411m;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final View f22412n;

    /* JADX INFO: renamed from: o */
    private final pc.C3550q f22413o;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final View f22414p;

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArrayList<InterfaceC3722n> f22415q;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private final TextView f22416r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final View f22417s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private final View f22418t;
    private long tlhn;

    /* JADX INFO: renamed from: u */
    private final Drawable f22419u;

    /* JADX INFO: renamed from: v */
    private final String f22420v;

    /* JADX INFO: renamed from: w */
    private final Drawable f22421w;

    /* JADX INFO: renamed from: x */
    private final Drawable f22422x;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private final View f22423y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private final ImageView f22424z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$n */
    public interface InterfaceC3722n {
        void toq(int i2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerControlView$q */
    public interface InterfaceC3723q {
        /* JADX INFO: renamed from: k */
        void m13187k(long j2, long j3);
    }

    @zy.hyr(21)
    private static final class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static boolean m13188k(View view) {
            return view.isAccessibilityFocused();
        }
    }

    private final class zy implements gc3c.InterfaceC3440y, hyr.InterfaceC3749k, View.OnClickListener {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void f7l8(hyr hyrVar, long j2) {
            PlayerControlView.this.az = true;
            if (PlayerControlView.this.f22410l != null) {
                PlayerControlView.this.f22410l.setText(com.google.android.exoplayer2.util.lrht.lv5(PlayerControlView.this.f22401c, PlayerControlView.this.f22403e, j2));
            }
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fu4(gc3c gc3cVar, gc3c.f7l8 f7l8Var) {
            if (f7l8Var.toq(4, 5)) {
                PlayerControlView.this.hyr();
            }
            if (f7l8Var.toq(4, 5, 7)) {
                PlayerControlView.this.m13173f();
            }
            if (f7l8Var.m12094k(8)) {
                PlayerControlView.this.m13172c();
            }
            if (f7l8Var.m12094k(9)) {
                PlayerControlView.this.lrht();
            }
            if (f7l8Var.toq(8, 9, 11, 0, 13)) {
                PlayerControlView.this.n5r1();
            }
            if (f7l8Var.toq(11, 0)) {
                PlayerControlView.this.uv6();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gc3c gc3cVar = PlayerControlView.this.id;
            if (gc3cVar == null) {
                return;
            }
            if (PlayerControlView.this.f22405g == view) {
                gc3cVar.zsr0();
                return;
            }
            if (PlayerControlView.this.f22412n == view) {
                gc3cVar.ch();
                return;
            }
            if (PlayerControlView.this.f22414p == view) {
                if (gc3cVar.getPlaybackState() != 4) {
                    gc3cVar.m2t();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f22406h == view) {
                gc3cVar.ps();
                return;
            }
            if (PlayerControlView.this.f22423y == view) {
                PlayerControlView.this.mcp(gc3cVar);
                return;
            }
            if (PlayerControlView.this.f22417s == view) {
                PlayerControlView.this.m13184t(gc3cVar);
            } else if (PlayerControlView.this.f22407i == view) {
                gc3cVar.setRepeatMode(com.google.android.exoplayer2.util.eqxt.m13576k(gc3cVar.getRepeatMode(), PlayerControlView.this.bq));
            } else if (PlayerControlView.this.f22424z == view) {
                gc3cVar.kcsr(!gc3cVar.ix());
            }
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void toq(hyr hyrVar, long j2) {
            if (PlayerControlView.this.f22410l != null) {
                PlayerControlView.this.f22410l.setText(com.google.android.exoplayer2.util.lrht.lv5(PlayerControlView.this.f22401c, PlayerControlView.this.f22403e, j2));
            }
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void zy(hyr hyrVar, long j2, boolean z2) {
            PlayerControlView.this.az = false;
            if (z2 || PlayerControlView.this.id == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.m13182r(playerControlView.id, j2);
        }
    }

    static {
        c8jq.m11556k("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    private static int a9(TypedArray typedArray, int i2) {
        return typedArray.getInt(C3748h.qrj.f66503t8iq, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m13172c() {
        ImageView imageView;
        if (d3() && this.bl && (imageView = this.f22407i) != null) {
            if (this.bq == 0) {
                m13178l(false, false, imageView);
                return;
            }
            gc3c gc3cVar = this.id;
            if (gc3cVar == null) {
                m13178l(true, false, imageView);
                this.f22407i.setImageDrawable(this.f22399a);
                this.f22407i.setContentDescription(this.f66072bo);
                return;
            }
            m13178l(true, true, imageView);
            int repeatMode = gc3cVar.getRepeatMode();
            if (repeatMode == 0) {
                this.f22407i.setImageDrawable(this.f22399a);
                this.f22407i.setContentDescription(this.f66072bo);
            } else if (repeatMode == 1) {
                this.f22407i.setImageDrawable(this.f22422x);
                this.f22407i.setContentDescription(this.f22420v);
            } else if (repeatMode == 2) {
                this.f22407i.setImageDrawable(this.f22419u);
                this.f22407i.setContentDescription(this.f22402d);
            }
            this.f22407i.setVisibility(0);
        }
    }

    private void d2ok() {
        View view;
        View view2;
        boolean zDd = dd();
        if (!zDd && (view2 = this.f22423y) != null) {
            view2.requestFocus();
        } else {
            if (!zDd || (view = this.f22417s) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private boolean dd() {
        gc3c gc3cVar = this.id;
        return (gc3cVar == null || gc3cVar.getPlaybackState() == 4 || this.id.getPlaybackState() == 1 || !this.id.yqrt()) ? false : true;
    }

    private void eqxt() {
        View view;
        View view2;
        boolean zDd = dd();
        if (!zDd && (view2 = this.f22423y) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zDd || (view = this.f22417s) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m13173f() {
        long jMo12092w;
        if (d3() && this.bl) {
            gc3c gc3cVar = this.id;
            long jN2t = 0;
            if (gc3cVar != null) {
                jN2t = this.bu + gc3cVar.n2t();
                jMo12092w = this.bu + gc3cVar.mo12092w();
            } else {
                jMo12092w = 0;
            }
            boolean z2 = jN2t != this.bd;
            boolean z3 = jMo12092w != this.tlhn;
            this.bd = jN2t;
            this.tlhn = jMo12092w;
            TextView textView = this.f22410l;
            if (textView != null && !this.az && z2) {
                textView.setText(com.google.android.exoplayer2.util.lrht.lv5(this.f22401c, this.f22403e, jN2t));
            }
            hyr hyrVar = this.f22404f;
            if (hyrVar != null) {
                hyrVar.setPosition(jN2t);
                this.f22404f.setBufferedPosition(jMo12092w);
            }
            InterfaceC3723q interfaceC3723q = this.in;
            if (interfaceC3723q != null && (z2 || z3)) {
                interfaceC3723q.m13187k(jN2t, jMo12092w);
            }
            removeCallbacks(this.f22411m);
            int playbackState = gc3cVar == null ? 1 : gc3cVar.getPlaybackState();
            if (gc3cVar == null || !gc3cVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f22411m, 1000L);
                return;
            }
            hyr hyrVar2 = this.f22404f;
            long jMin = Math.min(hyrVar2 != null ? hyrVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jN2t % 1000));
            float f2 = gc3cVar.f7l8().f21216k;
            postDelayed(this.f22411m, com.google.android.exoplayer2.util.lrht.m13660i(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.ax, 1000L));
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean gvn7(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hyr() {
        boolean z2;
        boolean z3;
        if (d3() && this.bl) {
            boolean zDd = dd();
            View view = this.f22423y;
            boolean z5 = true;
            if (view != null) {
                z2 = (zDd && view.isFocused()) | false;
                z3 = (com.google.android.exoplayer2.util.lrht.f23230k < 21 ? z2 : zDd && toq.m13188k(this.f22423y)) | false;
                this.f22423y.setVisibility(zDd ? 8 : 0);
            } else {
                z2 = false;
                z3 = false;
            }
            View view2 = this.f22417s;
            if (view2 != null) {
                z2 |= !zDd && view2.isFocused();
                if (com.google.android.exoplayer2.util.lrht.f23230k < 21) {
                    z5 = z2;
                } else if (zDd || !toq.m13188k(this.f22417s)) {
                    z5 = false;
                }
                z3 |= z5;
                this.f22417s.setVisibility(zDd ? 0 : 8);
            }
            if (z2) {
                d2ok();
            }
            if (z3) {
                eqxt();
            }
        }
    }

    private void jk(gc3c gc3cVar) {
        int playbackState = gc3cVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !gc3cVar.yqrt()) {
            mcp(gc3cVar);
        } else {
            m13184t(gc3cVar);
        }
    }

    private void jp0y() {
        removeCallbacks(this.f22400b);
        if (this.ba <= 0) {
            this.aj = C3548p.f65257toq;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.ba;
        this.aj = jUptimeMillis + ((long) i2);
        if (this.bl) {
            postDelayed(this.f22400b, i2);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m13178l(boolean z2, boolean z3, @zy.dd View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z3);
        view.setAlpha(z3 ? this.bb : this.bp);
        view.setVisibility(z2 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lrht() {
        ImageView imageView;
        if (d3() && this.bl && (imageView = this.f22424z) != null) {
            gc3c gc3cVar = this.id;
            if (!this.be) {
                m13178l(false, false, imageView);
                return;
            }
            if (gc3cVar == null) {
                m13178l(true, false, imageView);
                this.f22424z.setImageDrawable(this.f66071ab);
                this.f22424z.setContentDescription(this.an);
            } else {
                m13178l(true, true, imageView);
                this.f22424z.setImageDrawable(gc3cVar.ix() ? this.f22421w : this.f66071ab);
                this.f22424z.setContentDescription(gc3cVar.ix() ? this.bv : this.an);
            }
        }
    }

    private void lvui(gc3c gc3cVar, int i2, long j2) {
        gc3cVar.cfr(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mcp(gc3c gc3cVar) {
        int playbackState = gc3cVar.getPlaybackState();
        if (playbackState == 1) {
            gc3cVar.prepare();
        } else if (playbackState == 4) {
            lvui(gc3cVar, gc3cVar.lw(), C3548p.f65257toq);
        }
        gc3cVar.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1() {
        boolean zMo12080d;
        boolean z2;
        boolean zMo12080d2;
        boolean zMo12080d3;
        if (d3() && this.bl) {
            gc3c gc3cVar = this.id;
            boolean z3 = false;
            if (gc3cVar != null) {
                boolean zMo12080d4 = gc3cVar.mo12080d(5);
                boolean zMo12080d5 = gc3cVar.mo12080d(7);
                zMo12080d2 = gc3cVar.mo12080d(11);
                zMo12080d3 = gc3cVar.mo12080d(12);
                zMo12080d = gc3cVar.mo12080d(9);
                z2 = zMo12080d4;
                z3 = zMo12080d5;
            } else {
                zMo12080d = false;
                z2 = false;
                zMo12080d2 = false;
                zMo12080d3 = false;
            }
            m13178l(this.am, z3, this.f22412n);
            m13178l(this.ac, zMo12080d2, this.f22406h);
            m13178l(this.ad, zMo12080d3, this.f22414p);
            m13178l(this.ay, zMo12080d, this.f22405g);
            hyr hyrVar = this.f22404f;
            if (hyrVar != null) {
                hyrVar.setEnabled(z2);
            }
        }
    }

    private void ncyb() {
        hyr();
        n5r1();
        m13172c();
        lrht();
        uv6();
    }

    private static boolean o1t(pc pcVar, pc.C3550q c3550q) {
        if (pcVar.zurt() > 100) {
            return false;
        }
        int iZurt = pcVar.zurt();
        for (int i2 = 0; i2 < iZurt; i2++) {
            if (pcVar.m12484i(i2, c3550q).f21128f == C3548p.f65257toq) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m13182r(gc3c gc3cVar, long j2) {
        int iLw;
        pc pcVarD8wk = gc3cVar.d8wk();
        if (this.bg && !pcVarD8wk.ni7()) {
            int iZurt = pcVarD8wk.zurt();
            iLw = 0;
            while (true) {
                long jF7l8 = pcVarD8wk.m12484i(iLw, this.f22413o).f7l8();
                if (j2 < jF7l8) {
                    break;
                }
                if (iLw == iZurt - 1) {
                    j2 = jF7l8;
                    break;
                } else {
                    j2 -= jF7l8;
                    iLw++;
                }
            }
        } else {
            iLw = gc3cVar.lw();
        }
        lvui(gc3cVar, iLw, j2);
        m13173f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m13184t(gc3c gc3cVar) {
        gc3cVar.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uv6() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.uv6():void");
    }

    public boolean d3() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return wvg(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f22400b);
        } else if (motionEvent.getAction() == 1) {
            jp0y();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fti() {
        if (d3()) {
            setVisibility(8);
            Iterator<InterfaceC3722n> it = this.f22415q.iterator();
            while (it.hasNext()) {
                it.next().toq(getVisibility());
            }
            removeCallbacks(this.f22411m);
            removeCallbacks(this.f22400b);
            this.aj = C3548p.f65257toq;
        }
    }

    @zy.dd
    public gc3c getPlayer() {
        return this.id;
    }

    public int getRepeatToggleModes() {
        return this.bq;
    }

    public boolean getShowShuffleButton() {
        return this.be;
    }

    public int getShowTimeoutMs() {
        return this.ba;
    }

    public boolean getShowVrButton() {
        View view = this.f22418t;
        return view != null && view.getVisibility() == 0;
    }

    public void oc(InterfaceC3722n interfaceC3722n) {
        this.f22415q.remove(interfaceC3722n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bl = true;
        long j2 = this.aj;
        if (j2 != C3548p.f65257toq) {
            long jUptimeMillis = j2 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                fti();
            } else {
                postDelayed(this.f22400b, jUptimeMillis);
            }
        } else if (d3()) {
            jp0y();
        }
        ncyb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bl = false;
        removeCallbacks(this.f22411m);
        removeCallbacks(this.f22400b);
    }

    public void setExtraAdGroupMarkers(@zy.dd long[] jArr, @zy.dd boolean[] zArr) {
        if (jArr == null) {
            this.ar = new long[0];
            this.bc = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C3844k.f7l8(zArr);
            C3844k.m13629k(jArr.length == zArr2.length);
            this.ar = jArr;
            this.bc = zArr2;
        }
        uv6();
    }

    public void setPlayer(@zy.dd gc3c gc3cVar) {
        boolean z2 = true;
        C3844k.m13633s(Looper.myLooper() == Looper.getMainLooper());
        if (gc3cVar != null && gc3cVar.g1() != Looper.getMainLooper()) {
            z2 = false;
        }
        C3844k.m13629k(z2);
        gc3c gc3cVar2 = this.id;
        if (gc3cVar2 == gc3cVar) {
            return;
        }
        if (gc3cVar2 != null) {
            gc3cVar2.mo12081e(this.f22409k);
        }
        this.id = gc3cVar;
        if (gc3cVar != null) {
            gc3cVar.ngy(this.f22409k);
        }
        ncyb();
    }

    public void setProgressUpdateListener(@zy.dd InterfaceC3723q interfaceC3723q) {
        this.in = interfaceC3723q;
    }

    public void setRepeatToggleModes(int i2) {
        this.bq = i2;
        gc3c gc3cVar = this.id;
        if (gc3cVar != null) {
            int repeatMode = gc3cVar.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.id.setRepeatMode(0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.id.setRepeatMode(1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.id.setRepeatMode(2);
            }
        }
        m13172c();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.ad = z2;
        n5r1();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.as = z2;
        uv6();
    }

    public void setShowNextButton(boolean z2) {
        this.ay = z2;
        n5r1();
    }

    public void setShowPreviousButton(boolean z2) {
        this.am = z2;
        n5r1();
    }

    public void setShowRewindButton(boolean z2) {
        this.ac = z2;
        n5r1();
    }

    public void setShowShuffleButton(boolean z2) {
        this.be = z2;
        lrht();
    }

    public void setShowTimeoutMs(int i2) {
        this.ba = i2;
        if (d3()) {
            jp0y();
        }
    }

    public void setShowVrButton(boolean z2) {
        View view = this.f22418t;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.ax = com.google.android.exoplayer2.util.lrht.t8r(i2, 16, 1000);
    }

    public void setVrButtonListener(@zy.dd View.OnClickListener onClickListener) {
        View view = this.f22418t;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m13178l(getShowVrButton(), onClickListener != null, this.f22418t);
        }
    }

    public boolean wvg(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gc3c gc3cVar = this.id;
        if (gc3cVar == null || !gvn7(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (gc3cVar.getPlaybackState() == 4) {
                return true;
            }
            gc3cVar.m2t();
            return true;
        }
        if (keyCode == 89) {
            gc3cVar.ps();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            jk(gc3cVar);
            return true;
        }
        if (keyCode == 87) {
            gc3cVar.zsr0();
            return true;
        }
        if (keyCode == 88) {
            gc3cVar.ch();
            return true;
        }
        if (keyCode == 126) {
            mcp(gc3cVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        m13184t(gc3cVar);
        return true;
    }

    public void x9kr() {
        if (!d3()) {
            setVisibility(0);
            Iterator<InterfaceC3722n> it = this.f22415q.iterator();
            while (it.hasNext()) {
                it.next().toq(getVisibility());
            }
            ncyb();
            d2ok();
            eqxt();
        }
        jp0y();
    }

    /* JADX INFO: renamed from: z */
    public void m13186z(InterfaceC3722n interfaceC3722n) {
        C3844k.f7l8(interfaceC3722n);
        this.f22415q.add(interfaceC3722n);
    }

    public PlayerControlView(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @zy.dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    public PlayerControlView(Context context, @zy.dd AttributeSet attributeSet, int i2, @zy.dd AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        int resourceId = C3748h.s.f66563zy;
        this.ba = 5000;
        this.bq = 0;
        this.ax = 200;
        this.aj = C3548p.f65257toq;
        this.ac = true;
        this.ad = true;
        this.am = true;
        this.ay = true;
        this.be = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3748h.qrj.f66391bf2, i2, 0);
            try {
                this.ba = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66471mu, this.ba);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66401ch, resourceId);
                this.bq = a9(typedArrayObtainStyledAttributes, this.bq);
                this.ac = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66441ikck, this.ac);
                this.ad = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66409dr, this.ad);
                this.am = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f22726v, this.am);
                this.ay = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66530xwq3, this.ay);
                this.be = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f22708d, this.be);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66517vq, this.ax));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f22415q = new CopyOnWriteArrayList<>();
        this.f22408j = new pc.toq();
        this.f22413o = new pc.C3550q();
        StringBuilder sb = new StringBuilder();
        this.f22401c = sb;
        this.f22403e = new Formatter(sb, Locale.getDefault());
        this.bs = new long[0];
        this.k0 = new boolean[0];
        this.ar = new long[0];
        this.bc = new boolean[0];
        zy zyVar = new zy();
        this.f22409k = zyVar;
        this.f22411m = new Runnable() { // from class: com.google.android.exoplayer2.ui.x2
            @Override // java.lang.Runnable
            public final void run() {
                this.f22856k.m13173f();
            }
        };
        this.f22400b = new Runnable() { // from class: com.google.android.exoplayer2.ui.qrj
            @Override // java.lang.Runnable
            public final void run() {
                this.f22841k.fti();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i3 = C3748h.f7l8.f66178mu;
        hyr hyrVar = (hyr) findViewById(i3);
        View viewFindViewById = findViewById(C3748h.f7l8.f66210vq);
        if (hyrVar != null) {
            this.f22404f = hyrVar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f22404f = defaultTimeBar;
        } else {
            this.f22404f = null;
        }
        this.f22416r = (TextView) findViewById(C3748h.f7l8.f22616b);
        this.f22410l = (TextView) findViewById(C3748h.f7l8.f66158ikck);
        hyr hyrVar2 = this.f22404f;
        if (hyrVar2 != null) {
            hyrVar2.toq(zyVar);
        }
        View viewFindViewById2 = findViewById(C3748h.f7l8.f66132dr);
        this.f22423y = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(zyVar);
        }
        View viewFindViewById3 = findViewById(C3748h.f7l8.f66150gyi);
        this.f22417s = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(zyVar);
        }
        View viewFindViewById4 = findViewById(C3748h.f7l8.f22618d);
        this.f22412n = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(zyVar);
        }
        View viewFindViewById5 = findViewById(C3748h.f7l8.f22635u);
        this.f22405g = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(zyVar);
        }
        View viewFindViewById6 = findViewById(C3748h.f7l8.f66141fnq8);
        this.f22406h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(zyVar);
        }
        View viewFindViewById7 = findViewById(C3748h.f7l8.f22615a);
        this.f22414p = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(zyVar);
        }
        ImageView imageView = (ImageView) findViewById(C3748h.f7l8.f66194qkj8);
        this.f22407i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(zyVar);
        }
        ImageView imageView2 = (ImageView) findViewById(C3748h.f7l8.f66130d8wk);
        this.f22424z = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(zyVar);
        }
        View viewFindViewById8 = findViewById(C3748h.f7l8.f66197r8s8);
        this.f22418t = viewFindViewById8;
        setShowVrButton(false);
        m13178l(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.bb = resources.getInteger(C3748h.y.f66642zy) / 100.0f;
        this.bp = resources.getInteger(C3748h.y.f66641toq) / 100.0f;
        this.f22399a = resources.getDrawable(C3748h.n.f22677s);
        this.f22422x = resources.getDrawable(C3748h.n.f22674p);
        this.f22419u = resources.getDrawable(C3748h.n.f22682y);
        this.f22421w = resources.getDrawable(C3748h.n.f66319qrj);
        this.f66071ab = resources.getDrawable(C3748h.n.f66330x2);
        this.f66072bo = resources.getString(C3748h.ld6.f66236cdj);
        this.f22420v = resources.getString(C3748h.ld6.f66250ki);
        this.f22402d = resources.getString(C3748h.ld6.f22646h);
        this.bv = resources.getString(C3748h.ld6.f66244fu4);
        this.an = resources.getString(C3748h.ld6.f66259ni7);
        this.bd = C3548p.f65257toq;
        this.tlhn = C3548p.f65257toq;
    }
}
