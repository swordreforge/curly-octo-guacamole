package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface fn3e {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.fn3e$k */
    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class C3246k {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private final Handler f19320k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private final fn3e f63336toq;

        public C3246k(@zy.dd Handler handler, @zy.dd fn3e fn3eVar) {
            this.f19320k = fn3eVar != null ? (Handler) C3844k.f7l8(handler) : null;
            this.f63336toq = fn3eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(String str) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).jp0y(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fu4(xwq3 xwq3Var, com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).i1(xwq3Var);
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).mo11371o(xwq3Var, ld6Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m11414i(String str, long j2, long j3) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).gvn7(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ki(Exception exc) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).bf2(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ni7(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).f7l8(f7l8Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o1t(boolean z2) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).mo11368k(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t8r(Exception exc) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).toq(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wvg(int i2, long j2, long j3) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).ch(i2, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m11421z(long j2) {
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).ncyb(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zurt(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            f7l8Var.zy();
            ((fn3e) com.google.android.exoplayer2.util.lrht.ld6(this.f63336toq)).lrht(f7l8Var);
        }

        public void cdj(final xwq3 xwq3Var, @zy.dd final com.google.android.exoplayer2.decoder.ld6 ld6Var) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19495k.fu4(xwq3Var, ld6Var);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: h */
        public void m11422h(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19383k.ni7(f7l8Var);
                    }
                });
            }
        }

        public void jk(final int i2, final long j2, final long j3) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.cdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19302k.wvg(i2, j2, j3);
                    }
                });
            }
        }

        public void kja0(final com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
            f7l8Var.zy();
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.kja0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19411k.zurt(f7l8Var);
                    }
                });
            }
        }

        public void ld6(final Exception exc) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.t8r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19470k.ki(exc);
                    }
                });
            }
        }

        public void mcp(final boolean z2) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.qrj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19446k.o1t(z2);
                    }
                });
            }
        }

        public void n7h(final String str) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.ld6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19413k.fn3e(str);
                    }
                });
            }
        }

        public void qrj(final String str, final long j2, final long j3) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19396k.m11414i(str, j2, j3);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m11423t(final long j2) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19425k.m11421z(j2);
                    }
                });
            }
        }

        public void x2(final Exception exc) {
            Handler handler = this.f19320k;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.ki
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19409k.t8r(exc);
                    }
                });
            }
        }
    }

    default void bf2(Exception exc) {
    }

    default void ch(int i2, long j2, long j3) {
    }

    default void f7l8(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    default void gvn7(String str, long j2, long j3) {
    }

    @Deprecated
    default void i1(xwq3 xwq3Var) {
    }

    default void jp0y(String str) {
    }

    /* JADX INFO: renamed from: k */
    default void mo11368k(boolean z2) {
    }

    default void lrht(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
    }

    default void ncyb(long j2) {
    }

    /* JADX INFO: renamed from: o */
    default void mo11371o(xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
    }

    default void toq(Exception exc) {
    }
}
