package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.xwq3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AudioSink.java */
/* JADX INFO: loaded from: classes2.dex */
public interface zurt {

    /* JADX INFO: renamed from: k */
    public static final int f19515k = 2;

    /* JADX INFO: renamed from: q */
    public static final long f19516q = Long.MIN_VALUE;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63535toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63536zy = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.zurt$g */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class C3272g extends Exception {
        public final int errorCode;
        public final xwq3 format;
        public final boolean isRecoverable;

        public C3272g(int i2, xwq3 xwq3Var, boolean z2) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("AudioTrack write failed: ");
            sb.append(i2);
            super(sb.toString());
            this.isRecoverable = z2;
            this.errorCode = i2;
            this.format = xwq3Var;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.zurt$n */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class C3274n extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public C3274n(long j2, long j3) {
            StringBuilder sb = new StringBuilder(103);
            sb.append("Unexpected audio track timestamp discontinuity: expected ");
            sb.append(j3);
            sb.append(", got ");
            sb.append(j2);
            super(sb.toString());
            this.actualPresentationTimeUs = j2;
            this.expectedPresentationTimeUs = j3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.zurt$q */
    /* JADX INFO: compiled from: AudioSink.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3275q {
    }

    /* JADX INFO: compiled from: AudioSink.java */
    public static final class toq extends Exception {
        public final int audioTrackState;
        public final xwq3 format;
        public final boolean isRecoverable;

        public toq(int i2, int i3, int i4, int i5, xwq3 xwq3Var, boolean z2, @zy.dd Exception exc) {
            String str = z2 ? " (recoverable)" : "";
            StringBuilder sb = new StringBuilder(str.length() + 80);
            sb.append("AudioTrack init failed ");
            sb.append(i2);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(", ");
            sb.append(i5);
            sb.append(")");
            sb.append(str);
            super(sb.toString(), exc);
            this.audioTrackState = i2;
            this.isRecoverable = z2;
            this.format = xwq3Var;
        }
    }

    /* JADX INFO: compiled from: AudioSink.java */
    public interface zy {
        default void f7l8() {
        }

        /* JADX INFO: renamed from: g */
        void mo11401g();

        /* JADX INFO: renamed from: k */
        void mo11402k(boolean z2);

        /* JADX INFO: renamed from: n */
        void mo11403n(int i2, long j2, long j3);

        /* JADX INFO: renamed from: q */
        default void mo11404q(long j2) {
        }

        default void toq(Exception exc) {
        }

        default void zy(long j2) {
        }
    }

    void cdj() throws C3272g;

    se f7l8();

    void flush();

    void fn3e(xwq3 xwq3Var, int i2, @zy.dd int[] iArr) throws C3273k;

    /* JADX INFO: renamed from: g */
    void mo11455g();

    /* JADX INFO: renamed from: h */
    void mo11456h();

    /* JADX INFO: renamed from: i */
    void mo11457i();

    /* JADX INFO: renamed from: k */
    boolean mo11458k(xwq3 xwq3Var);

    long ki(boolean z2);

    int kja0(xwq3 xwq3Var);

    void ld6(se seVar);

    /* JADX INFO: renamed from: n */
    boolean mo11459n();

    void n7h(zy zyVar);

    /* JADX INFO: renamed from: p */
    boolean mo11460p();

    void pause();

    void play();

    /* JADX INFO: renamed from: q */
    void mo11461q(int i2);

    boolean qrj(ByteBuffer byteBuffer, long j2, int i2) throws C3272g, toq;

    void reset();

    /* JADX INFO: renamed from: s */
    void mo11462s(C3248g c3248g);

    void t8r();

    void toq(float f2);

    void x2(boolean z2);

    /* JADX INFO: renamed from: y */
    void mo11463y(C3271z c3271z);

    boolean zy();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.zurt$k */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class C3273k extends Exception {
        public final xwq3 format;

        public C3273k(Throwable th, xwq3 xwq3Var) {
            super(th);
            this.format = xwq3Var;
        }

        public C3273k(String str, xwq3 xwq3Var) {
            super(str);
            this.format = xwq3Var;
        }
    }
}
