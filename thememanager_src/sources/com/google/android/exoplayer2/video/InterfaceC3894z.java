package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.z */
/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3894z {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.z$k */
    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        @dd
        private final Handler f23581k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private final InterfaceC3894z f67225toq;

        public k(@dd Handler handler, @dd InterfaceC3894z interfaceC3894z) {
            this.f23581k = interfaceC3894z != null ? (Handler) C3844k.f7l8(handler) : null;
            this.f67225toq = interfaceC3894z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cdj(String str, long j2, long j3) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).t8r(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).y9n(f7l8Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fu4(long j2, int i2) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).lv5(j2, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m13865i(int i2, long j2) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).mo11367j(i2, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ki(String str) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).zy(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ni7(Object obj, long j2) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).yz(obj, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o1t(wvg wvgVar) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).cdj(wvgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t8r(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            f7l8Var.zy();
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).hyr(f7l8Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m13872z(Exception exc) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).mo11369l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zurt(xwq3 xwq3Var, com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).dd(xwq3Var);
            ((InterfaceC3894z) lrht.ld6(this.f67225toq)).x9kr(xwq3Var, ld6Var);
        }

        /* JADX INFO: renamed from: h */
        public void m13873h(final xwq3 xwq3Var, @dd final com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23417k.zurt(xwq3Var, ld6Var);
                    }
                });
            }
        }

        public void jk(final wvg wvgVar) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.ki
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23424k.o1t(wvgVar);
                    }
                });
            }
        }

        public void kja0(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23415k.fn3e(f7l8Var);
                    }
                });
            }
        }

        public void ld6(final String str, final long j2, final long j3) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.fu4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23402k.cdj(str, j2, j3);
                    }
                });
            }
        }

        public void mcp(final Exception exc) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.fn3e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23399k.m13872z(exc);
                    }
                });
            }
        }

        public void n7h(final int i2, final long j2) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.ni7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23451k.m13865i(i2, j2);
                    }
                });
            }
        }

        public void qrj(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            f7l8Var.zy();
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.kja0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23426k.t8r(f7l8Var);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m13874t(final long j2, final int i2) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.t8r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23563k.fu4(j2, i2);
                    }
                });
            }
        }

        public void wvg(final Object obj) {
            if (this.f23581k != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f23581k.post(new Runnable() { // from class: com.google.android.exoplayer2.video.zurt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23582k.ni7(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void x2(final String str) {
            Handler handler = this.f23581k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.video.cdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23393k.ki(str);
                    }
                });
            }
        }
    }

    default void cdj(wvg wvgVar) {
    }

    @Deprecated
    default void dd(xwq3 xwq3Var) {
    }

    default void hyr(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    /* JADX INFO: renamed from: j */
    default void mo11367j(int i2, long j2) {
    }

    /* JADX INFO: renamed from: l */
    default void mo11369l(Exception exc) {
    }

    default void lv5(long j2, int i2) {
    }

    default void t8r(String str, long j2, long j3) {
    }

    default void x9kr(xwq3 xwq3Var, @dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
    }

    default void y9n(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    default void yz(Object obj, long j2) {
    }

    default void zy(String str) {
    }
}
