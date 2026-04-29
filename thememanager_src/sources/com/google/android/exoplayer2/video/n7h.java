package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final float f67183fn3e = 1.0f;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final long f67184fu4 = 20000000;

    /* JADX INFO: renamed from: i */
    private static final float f23429i = 0.02f;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f67185ki = "VideoFrameReleaseHelper";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final long f67186ni7 = 500;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final long f67187t8r = 5000000000L;

    /* JADX INFO: renamed from: z */
    private static final long f23430z = 80;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f67188zurt = 30;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f67189cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f67190f7l8;

    /* JADX INFO: renamed from: g */
    private float f23431g;

    /* JADX INFO: renamed from: h */
    private long f23432h;

    /* JADX INFO: renamed from: k */
    private final C3870g f23433k = new C3870g();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f67191kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f67192ld6;

    /* JADX INFO: renamed from: n */
    @dd
    private Surface f23434n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f67193n7h;

    /* JADX INFO: renamed from: p */
    private int f23435p;

    /* JADX INFO: renamed from: q */
    private boolean f23436q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f67194qrj;

    /* JADX INFO: renamed from: s */
    private float f23437s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final toq f67195toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f67196x2;

    /* JADX INFO: renamed from: y */
    private float f23438y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final ChoreographerFrameCallbackC3876n f67197zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.n7h$k */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @hyr(30)
    private static final class C3875k {
        private C3875k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static void m13808k(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(n7h.f67185ki, "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.n7h$n */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    private static final class ChoreographerFrameCallbackC3876n implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: h */
        private static final int f23439h = 2;

        /* JADX INFO: renamed from: i */
        private static final ChoreographerFrameCallbackC3876n f23440i = new ChoreographerFrameCallbackC3876n();

        /* JADX INFO: renamed from: p */
        private static final int f23441p = 1;

        /* JADX INFO: renamed from: s */
        private static final int f23442s = 0;

        /* JADX INFO: renamed from: g */
        private Choreographer f23443g;

        /* JADX INFO: renamed from: k */
        public volatile long f23444k = C3548p.f65257toq;

        /* JADX INFO: renamed from: n */
        private final HandlerThread f23445n;

        /* JADX INFO: renamed from: q */
        private final Handler f23446q;

        /* JADX INFO: renamed from: y */
        private int f23447y;

        private ChoreographerFrameCallbackC3876n() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f23445n = handlerThread;
            handlerThread.start();
            Handler handlerFu4 = lrht.fu4(handlerThread.getLooper(), this);
            this.f23446q = handlerFu4;
            handlerFu4.sendEmptyMessage(0);
        }

        /* JADX INFO: renamed from: g */
        private void m13809g() {
            int i2 = this.f23447y - 1;
            this.f23447y = i2;
            if (i2 == 0) {
                ((Choreographer) C3844k.f7l8(this.f23443g)).removeFrameCallback(this);
                this.f23444k = C3548p.f65257toq;
            }
        }

        /* JADX INFO: renamed from: q */
        public static ChoreographerFrameCallbackC3876n m13810q() {
            return f23440i;
        }

        private void toq() {
            int i2 = this.f23447y + 1;
            this.f23447y = i2;
            if (i2 == 1) {
                ((Choreographer) C3844k.f7l8(this.f23443g)).postFrameCallback(this);
            }
        }

        private void zy() {
            this.f23443g = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f23444k = j2;
            ((Choreographer) C3844k.f7l8(this.f23443g)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                zy();
                return true;
            }
            if (i2 == 1) {
                toq();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            m13809g();
            return true;
        }

        /* JADX INFO: renamed from: k */
        public void m13811k() {
            this.f23446q.sendEmptyMessage(1);
        }

        /* JADX INFO: renamed from: n */
        public void m13812n() {
            this.f23446q.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.n7h$q */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @hyr(17)
    private static final class C3877q implements toq, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: k */
        private final DisplayManager f23448k;

        /* JADX INFO: renamed from: q */
        @dd
        private toq.InterfaceC3878k f23449q;

        private C3877q(DisplayManager displayManager) {
            this.f23448k = displayManager;
        }

        @dd
        /* JADX INFO: renamed from: q */
        public static toq m13813q(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C3877q(displayManager);
            }
            return null;
        }

        private Display zy() {
            return this.f23448k.getDisplay(0);
        }

        @Override // com.google.android.exoplayer2.video.n7h.toq
        /* JADX INFO: renamed from: k */
        public void mo13814k() {
            this.f23448k.unregisterDisplayListener(this);
            this.f23449q = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            toq.InterfaceC3878k interfaceC3878k = this.f23449q;
            if (interfaceC3878k == null || i2 != 0) {
                return;
            }
            interfaceC3878k.mo13815k(zy());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        @Override // com.google.android.exoplayer2.video.n7h.toq
        public void toq(toq.InterfaceC3878k interfaceC3878k) {
            this.f23449q = interfaceC3878k;
            this.f23448k.registerDisplayListener(this, lrht.m13676z());
            interfaceC3878k.mo13815k(zy());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    interface toq {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.video.n7h$toq$k */
        /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
        public interface InterfaceC3878k {
            /* JADX INFO: renamed from: k */
            void mo13815k(@dd Display display);
        }

        /* JADX INFO: renamed from: k */
        void mo13814k();

        void toq(InterfaceC3878k interfaceC3878k);
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    private static final class zy implements toq {

        /* JADX INFO: renamed from: k */
        private final WindowManager f23450k;

        private zy(WindowManager windowManager) {
            this.f23450k = windowManager;
        }

        @dd
        public static toq zy(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new zy(windowManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.n7h.toq
        /* JADX INFO: renamed from: k */
        public void mo13814k() {
        }

        @Override // com.google.android.exoplayer2.video.n7h.toq
        public void toq(toq.InterfaceC3878k interfaceC3878k) {
            interfaceC3878k.mo13815k(this.f23450k.getDefaultDisplay());
        }
    }

    public n7h(@dd Context context) {
        toq toqVarM13799g = m13799g(context);
        this.f67195toq = toqVarM13799g;
        this.f67197zy = toqVarM13799g != null ? ChoreographerFrameCallbackC3876n.m13810q() : null;
        this.f67192ld6 = C3548p.f65257toq;
        this.f67196x2 = C3548p.f65257toq;
        this.f23431g = -1.0f;
        this.f23437s = 1.0f;
        this.f23435p = 0;
    }

    @dd
    /* JADX INFO: renamed from: g */
    private static toq m13799g(@dd Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        toq toqVarM13813q = lrht.f23230k >= 17 ? C3877q.m13813q(applicationContext) : null;
        return toqVarM13813q == null ? zy.zy(applicationContext) : toqVarM13813q;
    }

    /* JADX INFO: renamed from: h */
    private void m13800h() {
        this.f67194qrj = 0L;
        this.f23432h = -1L;
        this.f67193n7h = -1L;
    }

    /* JADX INFO: renamed from: i */
    private void m13801i(boolean z2) {
        Surface surface;
        if (lrht.f23230k < 30 || (surface = this.f23434n) == null || this.f23435p == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.f23436q) {
            float f3 = this.f67190f7l8;
            if (f3 != -1.0f) {
                f2 = this.f23437s * f3;
            }
        }
        if (z2 || this.f23438y != f2) {
            this.f23438y = f2;
            C3875k.m13808k(surface, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki(@dd Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f67192ld6 = refreshRate;
            this.f67196x2 = (refreshRate * f23430z) / 100;
        } else {
            com.google.android.exoplayer2.util.ni7.qrj(f67185ki, "Unable to query display refresh rate");
            this.f67192ld6 = C3548p.f65257toq;
            this.f67196x2 = C3548p.f65257toq;
        }
    }

    /* JADX INFO: renamed from: n */
    private static long m13803n(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            j6 = j4 + j6;
            j5 = j6;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    /* JADX INFO: renamed from: q */
    private void m13804q() {
        Surface surface;
        if (lrht.f23230k < 30 || (surface = this.f23434n) == null || this.f23435p == Integer.MIN_VALUE || this.f23438y == 0.0f) {
            return;
        }
        this.f23438y = 0.0f;
        C3875k.m13808k(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t8r() {
        /*
            r7 = this;
            int r0 = com.google.android.exoplayer2.util.lrht.f23230k
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f23434n
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            com.google.android.exoplayer2.video.g r0 = r7.f23433k
            boolean r0 = r0.m13791n()
            if (r0 == 0) goto L1b
            com.google.android.exoplayer2.video.g r0 = r7.f23433k
            float r0 = r0.toq()
            goto L1d
        L1b:
            float r0 = r7.f23431g
        L1d:
            float r2 = r7.f67190f7l8
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            com.google.android.exoplayer2.video.g r1 = r7.f23433k
            boolean r1 = r1.m13791n()
            if (r1 == 0) goto L49
            com.google.android.exoplayer2.video.g r1 = r7.f23433k
            long r1 = r1.m13792q()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f67190f7l8
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            com.google.android.exoplayer2.video.g r2 = r7.f23433k
            int r2 = r2.zy()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f67190f7l8 = r0
            r7.m13801i(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.n7h.t8r():void");
    }

    private static boolean zy(long j2, long j3) {
        return Math.abs(j2 - j3) <= f67184fu4;
    }

    public void cdj(int i2) {
        if (this.f23435p == i2) {
            return;
        }
        this.f23435p = i2;
        m13801i(true);
    }

    public void f7l8() {
        toq toqVar = this.f67195toq;
        if (toqVar != null) {
            toqVar.mo13814k();
            ((ChoreographerFrameCallbackC3876n) C3844k.f7l8(this.f67197zy)).m13812n();
        }
    }

    public void kja0(@dd Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.f23434n == surface) {
            return;
        }
        m13804q();
        this.f23434n = surface;
        m13801i(true);
    }

    public void ld6(float f2) {
        this.f23437s = f2;
        m13800h();
        m13801i(false);
    }

    public void n7h() {
        this.f23436q = false;
        m13804q();
    }

    /* JADX INFO: renamed from: p */
    public void m13805p(long j2) {
        long j3 = this.f67193n7h;
        if (j3 != -1) {
            this.f23432h = j3;
            this.f67189cdj = this.f67191kja0;
        }
        this.f67194qrj++;
        this.f23433k.m13789g(j2 * 1000);
        t8r();
    }

    public void qrj() {
        this.f23436q = true;
        m13800h();
        m13801i(false);
    }

    /* JADX INFO: renamed from: s */
    public void m13806s(float f2) {
        this.f23431g = f2;
        this.f23433k.f7l8();
        t8r();
    }

    public long toq(long j2) {
        long j3;
        if (this.f23432h == -1 || !this.f23433k.m13791n()) {
            j3 = j2;
        } else {
            long jM13790k = this.f67189cdj + ((long) ((this.f23433k.m13790k() * (this.f67194qrj - this.f23432h)) / this.f23437s));
            if (zy(j2, jM13790k)) {
                j3 = jM13790k;
            } else {
                m13800h();
                j3 = j2;
            }
        }
        this.f67193n7h = this.f67194qrj;
        this.f67191kja0 = j3;
        ChoreographerFrameCallbackC3876n choreographerFrameCallbackC3876n = this.f67197zy;
        if (choreographerFrameCallbackC3876n == null || this.f67192ld6 == C3548p.f65257toq) {
            return j3;
        }
        long j4 = choreographerFrameCallbackC3876n.f23444k;
        return j4 == C3548p.f65257toq ? j3 : m13803n(j3, j4, this.f67192ld6) - this.f67196x2;
    }

    public void x2() {
        m13800h();
    }

    /* JADX INFO: renamed from: y */
    public void m13807y() {
        if (this.f67195toq != null) {
            ((ChoreographerFrameCallbackC3876n) C3844k.f7l8(this.f67197zy)).m13811k();
            this.f67195toq.toq(new toq.InterfaceC3878k() { // from class: com.google.android.exoplayer2.video.x2
                @Override // com.google.android.exoplayer2.video.n7h.toq.InterfaceC3878k
                /* JADX INFO: renamed from: k */
                public final void mo13815k(Display display) {
                    this.f23580k.ki(display);
                }
            });
        }
    }
}
