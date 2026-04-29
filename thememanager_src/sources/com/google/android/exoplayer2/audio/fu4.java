package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3844k;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes2.dex */
final class fu4 {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final long f63337d2ok = 1000000;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f63338d3 = 3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f63339dd = 30000;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final long f63340eqxt = 5000000;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f63341gvn7 = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f63342jp0y = 1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final long f63343lvui = 200;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final long f63344oc = 5000000;

    /* JADX INFO: renamed from: r */
    private static final int f19321r = 10;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f63345x9kr = 500000;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private long f63346a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f63347cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63348f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private long f63349fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private long f63350fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private long f63351fu4;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private ni7 f19322g;

    /* JADX INFO: renamed from: h */
    private boolean f19323h;

    /* JADX INFO: renamed from: i */
    private long f19324i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f63352jk;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3247k f19325k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private long f63353ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f63354kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f63355ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private long f63356mcp;

    /* JADX INFO: renamed from: n */
    private int f19326n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @zy.dd
    private Method f63357n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f63358ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private long f63359o1t;

    /* JADX INFO: renamed from: p */
    private float f19327p;

    /* JADX INFO: renamed from: q */
    private int f19328q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f63360qrj;

    /* JADX INFO: renamed from: s */
    private long f19329s;

    /* JADX INFO: renamed from: t */
    private long f19330t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f63361t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long[] f63362toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private long f63363wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f63364x2;

    /* JADX INFO: renamed from: y */
    private boolean f19331y;

    /* JADX INFO: renamed from: z */
    private long f19332z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f63365zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private AudioTrack f63366zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.fu4$k */
    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface InterfaceC3247k {
        /* JADX INFO: renamed from: k */
        void mo11434k(int i2, long j2);

        /* JADX INFO: renamed from: n */
        void mo11435n(long j2, long j3, long j4, long j5);

        /* JADX INFO: renamed from: q */
        void mo11436q(long j2, long j3, long j4, long j5);

        void toq(long j2);

        void zy(long j2);
    }

    public fu4(InterfaceC3247k interfaceC3247k) {
        this.f19325k = (InterfaceC3247k) C3844k.f7l8(interfaceC3247k);
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 18) {
            try {
                this.f63357n7h = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f63362toq = new long[10];
    }

    private long f7l8() {
        return toq(m11425g());
    }

    /* JADX INFO: renamed from: g */
    private long m11425g() {
        AudioTrack audioTrack = (AudioTrack) C3844k.f7l8(this.f63366zy);
        if (this.f63351fu4 != C3548p.f65257toq) {
            return Math.min(this.f63363wvg, this.f63359o1t + ((((SystemClock.elapsedRealtime() * 1000) - this.f63351fu4) * ((long) this.f63348f7l8)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f19331y) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f63349fn3e = this.f63361t8r;
            }
            playbackHeadPosition += this.f63349fn3e;
        }
        if (com.google.android.exoplayer2.util.lrht.f23230k <= 29) {
            if (playbackHeadPosition == 0 && this.f63361t8r > 0 && playState == 3) {
                if (this.f19332z == C3548p.f65257toq) {
                    this.f19332z = SystemClock.elapsedRealtime();
                }
                return this.f63361t8r;
            }
            this.f19332z = C3548p.f65257toq;
        }
        if (this.f63361t8r > playbackHeadPosition) {
            this.f19324i++;
        }
        this.f63361t8r = playbackHeadPosition;
        return playbackHeadPosition + (this.f19324i << 32);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m11426h(int i2) {
        return com.google.android.exoplayer2.util.lrht.f23230k < 23 && (i2 == 5 || i2 == 6);
    }

    /* JADX INFO: renamed from: k */
    private boolean m11427k() {
        return this.f19331y && ((AudioTrack) C3844k.f7l8(this.f63366zy)).getPlayState() == 2 && m11425g() == 0;
    }

    private void kja0(long j2) {
        Method method;
        if (!this.f63347cdj || (method = this.f63357n7h) == null || j2 - this.f63353ki < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) com.google.android.exoplayer2.util.lrht.ld6((Integer) method.invoke(C3844k.f7l8(this.f63366zy), new Object[0]))).intValue()) * 1000) - this.f19329s;
            this.f63354kja0 = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f63354kja0 = jMax;
            if (jMax > 5000000) {
                this.f19325k.toq(jMax);
                this.f63354kja0 = 0L;
            }
        } catch (Exception unused) {
            this.f63357n7h = null;
        }
        this.f63353ki = j2;
    }

    private void n7h() {
        long jF7l8 = f7l8();
        if (jF7l8 == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f63360qrj >= 30000) {
            long[] jArr = this.f63362toq;
            int i2 = this.f63365zurt;
            jArr[i2] = jF7l8 - jNanoTime;
            this.f63365zurt = (i2 + 1) % 10;
            int i3 = this.f63358ni7;
            if (i3 < 10) {
                this.f63358ni7 = i3 + 1;
            }
            this.f63360qrj = jNanoTime;
            this.f63364x2 = 0L;
            int i4 = 0;
            while (true) {
                int i5 = this.f63358ni7;
                if (i4 >= i5) {
                    break;
                }
                this.f63364x2 += this.f63362toq[i4] / ((long) i5);
                i4++;
            }
        }
        if (this.f19331y) {
            return;
        }
        qrj(jNanoTime, jF7l8);
        kja0(jNanoTime);
    }

    private void qrj(long j2, long j3) {
        ni7 ni7Var = (ni7) C3844k.f7l8(this.f19322g);
        if (ni7Var.m11499g(j2)) {
            long jZy = ni7Var.zy();
            long qVar = ni7Var.toq();
            if (Math.abs(jZy - j2) > 5000000) {
                this.f19325k.mo11435n(qVar, jZy, j2, j3);
                ni7Var.f7l8();
            } else if (Math.abs(toq(qVar) - j3) <= 5000000) {
                ni7Var.m11500k();
            } else {
                this.f19325k.mo11436q(qVar, jZy, j2, j3);
                ni7Var.f7l8();
            }
        }
    }

    private void t8r() {
        this.f63364x2 = 0L;
        this.f63358ni7 = 0;
        this.f63365zurt = 0;
        this.f63360qrj = 0L;
        this.f63356mcp = 0L;
        this.f63350fti = 0L;
        this.f63355ld6 = false;
    }

    private long toq(long j2) {
        return (j2 * 1000000) / ((long) this.f63348f7l8);
    }

    public boolean cdj() {
        t8r();
        if (this.f63351fu4 != C3548p.f65257toq) {
            return false;
        }
        ((ni7) C3844k.f7l8(this.f19322g)).m11503y();
        return true;
    }

    public void fn3e(float f2) {
        this.f19327p = f2;
        ni7 ni7Var = this.f19322g;
        if (ni7Var != null) {
            ni7Var.m11503y();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11428i(AudioTrack audioTrack, boolean z2, int i2, int i3, int i4) {
        this.f63366zy = audioTrack;
        this.f19328q = i3;
        this.f19326n = i4;
        this.f19322g = new ni7(audioTrack);
        this.f63348f7l8 = audioTrack.getSampleRate();
        this.f19331y = z2 && m11426h(i2);
        boolean zQo = com.google.android.exoplayer2.util.lrht.qo(i2);
        this.f63347cdj = zQo;
        this.f19329s = zQo ? toq(i4 / i3) : -9223372036854775807L;
        this.f63361t8r = 0L;
        this.f19324i = 0L;
        this.f63349fn3e = 0L;
        this.f19323h = false;
        this.f63351fu4 = C3548p.f65257toq;
        this.f19332z = C3548p.f65257toq;
        this.f63353ki = 0L;
        this.f63354kja0 = 0L;
        this.f19327p = 1.0f;
    }

    public void ki() {
        t8r();
        this.f63366zy = null;
        this.f19322g = null;
    }

    public boolean ld6(long j2) {
        return this.f19332z != C3548p.f65257toq && j2 > 0 && SystemClock.elapsedRealtime() - this.f19332z >= 200;
    }

    /* JADX INFO: renamed from: n */
    public long m11429n(long j2) {
        return com.google.android.exoplayer2.util.lrht.zwy(toq(j2 - m11425g()));
    }

    /* JADX INFO: renamed from: p */
    public boolean m11430p() {
        return ((AudioTrack) C3844k.f7l8(this.f63366zy)).getPlayState() == 3;
    }

    /* JADX INFO: renamed from: q */
    public long m11431q(boolean z2) {
        long jF7l8;
        if (((AudioTrack) C3844k.f7l8(this.f63366zy)).getPlayState() == 3) {
            n7h();
        }
        long jNanoTime = System.nanoTime() / 1000;
        ni7 ni7Var = (ni7) C3844k.f7l8(this.f19322g);
        boolean zM11502q = ni7Var.m11502q();
        if (zM11502q) {
            jF7l8 = toq(ni7Var.toq()) + com.google.android.exoplayer2.util.lrht.i1(jNanoTime - ni7Var.zy(), this.f19327p);
        } else {
            jF7l8 = this.f63358ni7 == 0 ? f7l8() : this.f63364x2 + jNanoTime;
            if (!z2) {
                jF7l8 = Math.max(0L, jF7l8 - this.f63354kja0);
            }
        }
        if (this.f63352jk != zM11502q) {
            this.f63350fti = this.f63356mcp;
            this.f63346a9 = this.f19330t;
        }
        long j2 = jNanoTime - this.f63350fti;
        if (j2 < 1000000) {
            long jI1 = this.f63346a9 + com.google.android.exoplayer2.util.lrht.i1(j2, this.f19327p);
            long j3 = (j2 * 1000) / 1000000;
            jF7l8 = ((jF7l8 * j3) + ((1000 - j3) * jI1)) / 1000;
        }
        if (!this.f63355ld6) {
            long j4 = this.f19330t;
            if (jF7l8 > j4) {
                this.f63355ld6 = true;
                this.f19325k.zy(System.currentTimeMillis() - com.google.android.exoplayer2.util.lrht.zwy(com.google.android.exoplayer2.util.lrht.ch(com.google.android.exoplayer2.util.lrht.zwy(jF7l8 - j4), this.f19327p)));
            }
        }
        this.f63356mcp = jNanoTime;
        this.f19330t = jF7l8;
        this.f63352jk = zM11502q;
        return jF7l8;
    }

    /* JADX INFO: renamed from: s */
    public boolean m11432s(long j2) {
        return j2 > m11425g() || m11427k();
    }

    public boolean x2(long j2) {
        int playState = ((AudioTrack) C3844k.f7l8(this.f63366zy)).getPlayState();
        if (this.f19331y) {
            if (playState == 2) {
                this.f19323h = false;
                return false;
            }
            if (playState == 1 && m11425g() == 0) {
                return false;
            }
        }
        boolean z2 = this.f19323h;
        boolean zM11432s = m11432s(j2);
        this.f19323h = zM11432s;
        if (z2 && !zM11432s && playState != 1) {
            this.f19325k.mo11434k(this.f19326n, com.google.android.exoplayer2.util.lrht.zwy(this.f19329s));
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m11433y(long j2) {
        this.f63359o1t = m11425g();
        this.f63351fu4 = SystemClock.elapsedRealtime() * 1000;
        this.f63363wvg = j2;
    }

    public void zurt() {
        ((ni7) C3844k.f7l8(this.f19322g)).m11503y();
    }

    public int zy(long j2) {
        return this.f19326n - ((int) (j2 - (m11425g() * ((long) this.f19328q))));
    }
}
