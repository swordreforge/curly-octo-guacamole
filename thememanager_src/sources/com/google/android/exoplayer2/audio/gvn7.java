package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.audio.fu4;
import com.google.android.exoplayer2.audio.zurt;
import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultAudioSink.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gvn7 implements zurt {

    /* JADX INFO: renamed from: a */
    public static final int f19346a = 2;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final int f63369a98o = 1;

    /* JADX INFO: renamed from: b */
    public static final float f19347b = 8.0f;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final boolean f63370bf2 = false;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final long f63371bo = 50000000;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final int f63372c8jq = 2;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final int f63373ch = 1;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private static final int f63374dr = 100;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final float f63375ek5k = 0.1f;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private static final int f63376gyi = -32;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f63377i1 = 0;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final long f63378lv5 = 250000;

    /* JADX INFO: renamed from: m */
    public static final float f19348m = 1.0f;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final int f63379nmn5 = 2;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final long f63380t8iq = 750000;

    /* JADX INFO: renamed from: u */
    private static final long f19349u = 250000;

    /* JADX INFO: renamed from: v */
    public static boolean f19350v = false;

    /* JADX INFO: renamed from: x */
    private static final int f19351x = 0;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    private static final String f63381xwq3 = "DefaultAudioSink";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f63382y2 = 4;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final float f63383y9n = 0.1f;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final float f63384yz = 8.0f;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final int f63385zp = 3;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private long f63386a9;

    /* JADX INFO: renamed from: c */
    private boolean f19352c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private C3252p f63387cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private float f63388d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f63389d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    @zy.dd
    private ByteBuffer f63390dd;

    /* JADX INFO: renamed from: e */
    private C3271z f19353e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private long f63391eqxt;

    /* JADX INFO: renamed from: f */
    private boolean f19354f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f63392f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @zy.dd
    private zy f63393fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private long f63394fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private C3248g f63395fu4;

    /* JADX INFO: renamed from: g */
    private final toq f19355g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private int f63396gvn7;

    /* JADX INFO: renamed from: h */
    private final int f19356h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private long f63397hb;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private int f63398hyr;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private zurt.zy f19357i;

    /* JADX INFO: renamed from: j */
    private boolean f19358j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private long f63399jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private long f63400jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final C3255y<zurt.toq> f63401ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final boolean f63402kja0;

    /* JADX INFO: renamed from: l */
    private byte[] f19359l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final InterfaceC3262p[] f63403ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private boolean f63404lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private InterfaceC3262p[] f63405lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private int f63406mcp;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final C3270y f19360n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f63407n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final ArrayDeque<C3249g> f63408n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    @zy.dd
    private ByteBuffer f63409ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @zy.dd
    private AudioTrack f63410ni7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private boolean f63411nn86;

    /* JADX INFO: renamed from: o */
    private boolean f19361o;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private C3249g f63412o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f63413oc;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3262p[] f19362p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final fu4 f63414qrj;

    /* JADX INFO: renamed from: r */
    private ByteBuffer[] f19363r;

    /* JADX INFO: renamed from: s */
    private final lrht f19364s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private ByteBuffer f19365t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final C3255y<zurt.C3272g> f63415t8r;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private boolean f63416uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private int f63417vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private se f63418wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final ConditionVariable f63419x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private int f63420x9kr;

    /* JADX INFO: renamed from: y */
    private final wvg f19366y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private C3249g f19367z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private zy f63421zurt;

    /* JADX INFO: compiled from: DefaultAudioSink.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$g */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    private static final class C3249g {

        /* JADX INFO: renamed from: k */
        public final se f19368k;

        /* JADX INFO: renamed from: q */
        public final long f19369q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f63422toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f63423zy;

        /* synthetic */ C3249g(se seVar, boolean z2, long j2, long j3, C3250k c3250k) {
            this(seVar, z2, j2, j3);
        }

        private C3249g(se seVar, boolean z2, long j2, long j3) {
            this.f19368k = seVar;
            this.f63422toq = z2;
            this.f63423zy = j2;
            this.f19369q = j3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$k */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    class C3250k extends Thread {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AudioTrack f19370k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3250k(String str, AudioTrack audioTrack) {
            super(str);
            this.f19370k = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f19370k.flush();
                this.f19370k.release();
            } finally {
                gvn7.this.f63419x2.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$n */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static final class C3251n extends RuntimeException {
        /* synthetic */ C3251n(String str, C3250k c3250k) {
            this(str);
        }

        private C3251n(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$p */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    @zy.hyr(29)
    private final class C3252p {

        /* JADX INFO: renamed from: k */
        private final Handler f19372k = new Handler();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f63424toq;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$p$k */
        /* JADX INFO: compiled from: DefaultAudioSink.java */
        class k extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ gvn7 f19373k;

            k(gvn7 gvn7Var) {
                this.f19373k = gvn7Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i2) {
                C3844k.m13633s(audioTrack == gvn7.this.f63410ni7);
                if (gvn7.this.f19357i == null || !gvn7.this.f63404lrht) {
                    return;
                }
                gvn7.this.f19357i.f7l8();
            }

            public void onTearDown(AudioTrack audioTrack) {
                C3844k.m13633s(audioTrack == gvn7.this.f63410ni7);
                if (gvn7.this.f19357i == null || !gvn7.this.f63404lrht) {
                    return;
                }
                gvn7.this.f19357i.f7l8();
            }
        }

        public C3252p() {
            this.f63424toq = new k(gvn7.this);
        }

        /* JADX INFO: renamed from: k */
        public void m11464k(AudioTrack audioTrack) {
            Handler handler = this.f19372k;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.toq(handler), this.f63424toq);
        }

        public void toq(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f63424toq);
            this.f19372k.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$q */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public static class C3253q implements toq {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3262p[] f19374k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final n5r1 f63427toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C3245f f63428zy;

        public C3253q(InterfaceC3262p... interfaceC3262pArr) {
            this(interfaceC3262pArr, new n5r1(), new C3245f());
        }

        @Override // com.google.android.exoplayer2.audio.gvn7.toq
        /* JADX INFO: renamed from: k */
        public long mo11465k(long j2) {
            return this.f63428zy.m11406g(j2);
        }

        @Override // com.google.android.exoplayer2.audio.gvn7.toq
        /* JADX INFO: renamed from: n */
        public boolean mo11466n(boolean z2) {
            this.f63427toq.fn3e(z2);
            return z2;
        }

        @Override // com.google.android.exoplayer2.audio.gvn7.toq
        /* JADX INFO: renamed from: q */
        public long mo11467q() {
            return this.f63427toq.kja0();
        }

        @Override // com.google.android.exoplayer2.audio.gvn7.toq
        public InterfaceC3262p[] toq() {
            return this.f19374k;
        }

        @Override // com.google.android.exoplayer2.audio.gvn7.toq
        public se zy(se seVar) {
            this.f63428zy.m11410s(seVar.f21216k);
            this.f63428zy.m11411y(seVar.f21218q);
            return seVar;
        }

        public C3253q(InterfaceC3262p[] interfaceC3262pArr, n5r1 n5r1Var, C3245f c3245f) {
            InterfaceC3262p[] interfaceC3262pArr2 = new InterfaceC3262p[interfaceC3262pArr.length + 2];
            this.f19374k = interfaceC3262pArr2;
            System.arraycopy(interfaceC3262pArr, 0, interfaceC3262pArr2, 0, interfaceC3262pArr.length);
            this.f63427toq = n5r1Var;
            this.f63428zy = c3245f;
            interfaceC3262pArr2[interfaceC3262pArr.length] = n5r1Var;
            interfaceC3262pArr2[interfaceC3262pArr.length + 1] = c3245f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$s */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    private final class C3254s implements fu4.InterfaceC3247k {
        private C3254s() {
        }

        @Override // com.google.android.exoplayer2.audio.fu4.InterfaceC3247k
        /* JADX INFO: renamed from: k */
        public void mo11434k(int i2, long j2) {
            if (gvn7.this.f19357i != null) {
                gvn7.this.f19357i.mo11403n(i2, j2, SystemClock.elapsedRealtime() - gvn7.this.f63397hb);
            }
        }

        @Override // com.google.android.exoplayer2.audio.fu4.InterfaceC3247k
        /* JADX INFO: renamed from: n */
        public void mo11435n(long j2, long j3, long j4, long j5) {
            long jHyr = gvn7.this.hyr();
            long jM11446f = gvn7.this.m11446f();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(jHyr);
            sb.append(", ");
            sb.append(jM11446f);
            String string = sb.toString();
            if (gvn7.f19350v) {
                throw new C3251n(string, null);
            }
            com.google.android.exoplayer2.util.ni7.qrj(gvn7.f63381xwq3, string);
        }

        @Override // com.google.android.exoplayer2.audio.fu4.InterfaceC3247k
        /* JADX INFO: renamed from: q */
        public void mo11436q(long j2, long j3, long j4, long j5) {
            long jHyr = gvn7.this.hyr();
            long jM11446f = gvn7.this.m11446f();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(jHyr);
            sb.append(", ");
            sb.append(jM11446f);
            String string = sb.toString();
            if (gvn7.f19350v) {
                throw new C3251n(string, null);
            }
            com.google.android.exoplayer2.util.ni7.qrj(gvn7.f63381xwq3, string);
        }

        @Override // com.google.android.exoplayer2.audio.fu4.InterfaceC3247k
        public void toq(long j2) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j2);
            com.google.android.exoplayer2.util.ni7.qrj(gvn7.f63381xwq3, sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.fu4.InterfaceC3247k
        public void zy(long j2) {
            if (gvn7.this.f19357i != null) {
                gvn7.this.f19357i.zy(j2);
            }
        }

        /* synthetic */ C3254s(gvn7 gvn7Var, C3250k c3250k) {
            this();
        }
    }

    /* JADX INFO: compiled from: DefaultAudioSink.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        long mo11465k(long j2);

        /* JADX INFO: renamed from: n */
        boolean mo11466n(boolean z2);

        /* JADX INFO: renamed from: q */
        long mo11467q();

        InterfaceC3262p[] toq();

        se zy(se seVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.gvn7$y */
    /* JADX INFO: compiled from: DefaultAudioSink.java */
    private static final class C3255y<T extends Exception> {

        /* JADX INFO: renamed from: k */
        private final long f19376k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private T f63429toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f63430zy;

        public C3255y(long j2) {
            this.f19376k = j2;
        }

        /* JADX INFO: renamed from: k */
        public void m11468k() {
            this.f63429toq = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void toq(T t2) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f63429toq == null) {
                this.f63429toq = t2;
                this.f63430zy = this.f19376k + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f63430zy) {
                T t3 = this.f63429toq;
                if (t3 != t2) {
                    t3.addSuppressed(t2);
                }
                T t4 = this.f63429toq;
                m11468k();
                throw t4;
            }
        }
    }

    /* JADX INFO: compiled from: DefaultAudioSink.java */
    private static final class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f63431f7l8;

        /* JADX INFO: renamed from: g */
        public final int f19377g;

        /* JADX INFO: renamed from: k */
        public final xwq3 f19378k;

        /* JADX INFO: renamed from: n */
        public final int f19379n;

        /* JADX INFO: renamed from: q */
        public final int f19380q;

        /* JADX INFO: renamed from: s */
        public final InterfaceC3262p[] f19381s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63432toq;

        /* JADX INFO: renamed from: y */
        public final int f19382y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63433zy;

        public zy(xwq3 xwq3Var, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, InterfaceC3262p[] interfaceC3262pArr) {
            this.f19378k = xwq3Var;
            this.f63432toq = i2;
            this.f63433zy = i3;
            this.f19380q = i4;
            this.f19379n = i5;
            this.f19377g = i6;
            this.f63431f7l8 = i7;
            this.f19381s = interfaceC3262pArr;
            this.f19382y = zy(i8, z2);
        }

        private AudioTrack f7l8(C3248g c3248g, int i2) {
            int iNmn5 = com.google.android.exoplayer2.util.lrht.nmn5(c3248g.f19341n);
            return i2 == 0 ? new AudioTrack(iNmn5, this.f19379n, this.f19377g, this.f63431f7l8, this.f19382y, 1) : new AudioTrack(iNmn5, this.f19379n, this.f19377g, this.f63431f7l8, this.f19382y, 1, i2);
        }

        @zy.hyr(29)
        /* JADX INFO: renamed from: g */
        private AudioTrack m11469g(boolean z2, C3248g c3248g, int i2) {
            return new AudioTrack.Builder().setAudioAttributes(m11471p(c3248g, z2)).setAudioFormat(gvn7.eqxt(this.f19379n, this.f19377g, this.f63431f7l8)).setTransferMode(1).setBufferSizeInBytes(this.f19382y).setSessionId(i2).setOffloadedPlayback(this.f63433zy == 1).build();
        }

        @zy.hyr(21)
        private static AudioAttributes ld6() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        @zy.hyr(21)
        /* JADX INFO: renamed from: n */
        private AudioTrack m11470n(boolean z2, C3248g c3248g, int i2) {
            return new AudioTrack(m11471p(c3248g, z2), gvn7.eqxt(this.f19379n, this.f19377g, this.f63431f7l8), this.f19382y, 1, i2);
        }

        @zy.hyr(21)
        /* JADX INFO: renamed from: p */
        private static AudioAttributes m11471p(C3248g c3248g, boolean z2) {
            return z2 ? ld6() : c3248g.toq();
        }

        /* JADX INFO: renamed from: q */
        private AudioTrack m11472q(boolean z2, C3248g c3248g, int i2) {
            int i3 = com.google.android.exoplayer2.util.lrht.f23230k;
            return i3 >= 29 ? m11469g(z2, c3248g, i2) : i3 >= 21 ? m11470n(z2, c3248g, i2) : f7l8(c3248g, i2);
        }

        private int qrj(float f2) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f19379n, this.f19377g, this.f63431f7l8);
            C3844k.m13633s(minBufferSize != -2);
            int iT8r = com.google.android.exoplayer2.util.lrht.t8r(minBufferSize * 4, ((int) m11475y(250000L)) * this.f19380q, Math.max(minBufferSize, ((int) m11475y(gvn7.f63380t8iq)) * this.f19380q));
            return f2 != 1.0f ? Math.round(iT8r * f2) : iT8r;
        }

        private int x2(long j2) {
            int iNcyb = gvn7.ncyb(this.f63431f7l8);
            if (this.f63431f7l8 == 5) {
                iNcyb *= 2;
            }
            return (int) ((j2 * ((long) iNcyb)) / 1000000);
        }

        private int zy(int i2, boolean z2) {
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.f63433zy;
            if (i3 == 0) {
                return qrj(z2 ? 8.0f : 1.0f);
            }
            if (i3 == 1) {
                return x2(gvn7.f63371bo);
            }
            if (i3 == 2) {
                return x2(250000L);
            }
            throw new IllegalStateException();
        }

        /* JADX INFO: renamed from: k */
        public AudioTrack m11473k(boolean z2, C3248g c3248g, int i2) throws zurt.toq {
            try {
                AudioTrack audioTrackM11472q = m11472q(z2, c3248g, i2);
                int state = audioTrackM11472q.getState();
                if (state == 1) {
                    return audioTrackM11472q;
                }
                try {
                    audioTrackM11472q.release();
                } catch (Exception unused) {
                }
                throw new zurt.toq(state, this.f19379n, this.f19377g, this.f19382y, this.f19378k, kja0(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new zurt.toq(0, this.f19379n, this.f19377g, this.f19382y, this.f19378k, kja0(), e2);
            }
        }

        public boolean kja0() {
            return this.f63433zy == 1;
        }

        public long n7h(long j2) {
            return (j2 * 1000000) / ((long) this.f19378k.f23668d);
        }

        /* JADX INFO: renamed from: s */
        public long m11474s(long j2) {
            return (j2 * 1000000) / ((long) this.f19379n);
        }

        public boolean toq(zy zyVar) {
            return zyVar.f63433zy == this.f63433zy && zyVar.f63431f7l8 == this.f63431f7l8 && zyVar.f19379n == this.f19379n && zyVar.f19377g == this.f19377g && zyVar.f19380q == this.f19380q;
        }

        /* JADX INFO: renamed from: y */
        public long m11475y(long j2) {
            return (j2 * ((long) this.f19379n)) / 1000000;
        }
    }

    public gvn7(@zy.dd C3270y c3270y, InterfaceC3262p[] interfaceC3262pArr) {
        this(c3270y, interfaceC3262pArr, false);
    }

    /* JADX INFO: renamed from: a */
    private boolean m11442a(int i2) {
        return this.f63392f7l8 && com.google.android.exoplayer2.util.lrht.fnq8(i2);
    }

    private void a9(long j2) {
        se seVarZy = a98o() ? this.f19355g.zy(d2ok()) : se.f21212g;
        boolean zMo11466n = a98o() ? this.f19355g.mo11466n(mo11460p()) : false;
        this.f63408n7h.add(new C3249g(seVarZy, zMo11466n, Math.max(0L, j2), this.f63421zurt.m11474s(m11446f()), null));
        i1();
        zurt.zy zyVar = this.f19357i;
        if (zyVar != null) {
            zyVar.mo11402k(zMo11466n);
        }
    }

    private boolean a98o() {
        return (this.f63411nn86 || !com.google.android.exoplayer2.util.wvg.f67095d3.equals(this.f63421zurt.f19378k.f23682r) || m11442a(this.f63421zurt.f19378k.f23687w)) ? false : true;
    }

    @zy.hyr(21)
    /* JADX INFO: renamed from: b */
    private static void m11443b(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void bf2(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX INFO: renamed from: c */
    private void m11444c() throws zurt.toq {
        this.f63419x2.block();
        AudioTrack audioTrackGvn7 = gvn7();
        this.f63410ni7 = audioTrackGvn7;
        if (vyq(audioTrackGvn7)) {
            m11450o(this.f63410ni7);
            if (this.f19356h != 3) {
                AudioTrack audioTrack = this.f63410ni7;
                xwq3 xwq3Var = this.f63421zurt.f19378k;
                audioTrack.setOffloadDelayPadding(xwq3Var.f67273ab, xwq3Var.bb);
            }
        }
        this.f63417vyq = this.f63410ni7.getAudioSessionId();
        fu4 fu4Var = this.f63414qrj;
        AudioTrack audioTrack2 = this.f63410ni7;
        zy zyVar = this.f63421zurt;
        fu4Var.m11428i(audioTrack2, zyVar.f63433zy == 2, zyVar.f63431f7l8, zyVar.f19380q, zyVar.f19382y);
        y9n();
        int i2 = this.f19353e.f19514k;
        if (i2 != 0) {
            this.f63410ni7.attachAuxEffect(i2);
            this.f63410ni7.setAuxEffectSendLevel(this.f19353e.f63534toq);
        }
        this.f63413oc = true;
    }

    @zy.hyr(21)
    private static int ch(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private se d2ok() {
        return m11448l().f19368k;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d3() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.f63398hyr
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f63398hyr = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.f63398hyr
            com.google.android.exoplayer2.audio.p[] r5 = r9.f63405lvui
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo11408n()
        L1f:
            r9.m11447j(r7)
            boolean r0 = r4.zy()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f63398hyr
            int r0 = r0 + r2
            r9.f63398hyr = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f63409ncyb
            if (r0 == 0) goto L3b
            r9.m11453x(r0, r7)
            java.nio.ByteBuffer r0 = r9.f63409ncyb
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f63398hyr = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.gvn7.d3():boolean");
    }

    private static int dd(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return com.google.android.exoplayer2.audio.toq.m11524q(byteBuffer);
            case 7:
            case 8:
                return d2ok.m11396n(byteBuffer);
            case 9:
                int iQrj = x9kr.qrj(com.google.android.exoplayer2.util.lrht.x9kr(byteBuffer, byteBuffer.position()));
                if (iQrj != -1) {
                    return iQrj;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unexpected audio encoding: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            case 14:
                int iM11522k = com.google.android.exoplayer2.audio.toq.m11522k(byteBuffer);
                if (iM11522k == -1) {
                    return 0;
                }
                return com.google.android.exoplayer2.audio.toq.m11526y(byteBuffer, iM11522k) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.google.android.exoplayer2.audio.zy.zy(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m11445e(xwq3 xwq3Var, @zy.dd C3270y c3270y) {
        return m11451r(xwq3Var, c3270y) != null;
    }

    private void ek5k(se seVar, boolean z2) {
        C3249g c3249gM11448l = m11448l();
        if (seVar.equals(c3249gM11448l.f19368k) && z2 == c3249gM11448l.f63422toq) {
            return;
        }
        C3249g c3249g = new C3249g(seVar, z2, C3548p.f65257toq, C3548p.f65257toq, null);
        if (uv6()) {
            this.f19367z = c3249g;
        } else {
            this.f63412o1t = c3249g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zy.hyr(21)
    public static AudioFormat eqxt(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public long m11446f() {
        zy zyVar = this.f63421zurt;
        return zyVar.f63433zy == 0 ? this.f63394fti / ((long) zyVar.f19380q) : this.f63400jp0y;
    }

    private long fti(long j2) {
        while (!this.f63408n7h.isEmpty() && j2 >= this.f63408n7h.getFirst().f19369q) {
            this.f63412o1t = this.f63408n7h.remove();
        }
        C3249g c3249g = this.f63412o1t;
        long j3 = j2 - c3249g.f19369q;
        if (c3249g.f19368k.equals(se.f21212g)) {
            return this.f63412o1t.f63423zy + j3;
        }
        if (this.f63408n7h.isEmpty()) {
            return this.f63412o1t.f63423zy + this.f19355g.mo11465k(j3);
        }
        C3249g first = this.f63408n7h.getFirst();
        return first.f63423zy - com.google.android.exoplayer2.util.lrht.i1(first.f19369q - j2, this.f63412o1t.f19368k.f21216k);
    }

    private AudioTrack gvn7() throws zurt.toq {
        try {
            return ((zy) C3844k.f7l8(this.f63421zurt)).m11473k(this.f63411nn86, this.f63395fu4, this.f63417vyq);
        } catch (zurt.toq e2) {
            nn86();
            zurt.zy zyVar = this.f19357i;
            if (zyVar != null) {
                zyVar.toq(e2);
            }
            throw e2;
        }
    }

    private void hb() {
        if (this.f19352c) {
            return;
        }
        this.f19352c = true;
        this.f63414qrj.m11433y(m11446f());
        this.f63410ni7.stop();
        this.f63406mcp = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long hyr() {
        zy zyVar = this.f63421zurt;
        return zyVar.f63433zy == 0 ? this.f63399jk / ((long) zyVar.f63432toq) : this.f63386a9;
    }

    private void i1() {
        InterfaceC3262p[] interfaceC3262pArr = this.f63421zurt.f19381s;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3262p interfaceC3262p : interfaceC3262pArr) {
            if (interfaceC3262p.isActive()) {
                arrayList.add(interfaceC3262p);
            } else {
                interfaceC3262p.flush();
            }
        }
        int size = arrayList.size();
        this.f63405lvui = (InterfaceC3262p[]) arrayList.toArray(new InterfaceC3262p[size]);
        this.f19363r = new ByteBuffer[size];
        oc();
    }

    /* JADX INFO: renamed from: j */
    private void m11447j(long j2) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f63405lvui.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f19363r[i2 - 1];
            } else {
                byteBuffer = this.f63390dd;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC3262p.f19442k;
                }
            }
            if (i2 == length) {
                m11453x(byteBuffer, j2);
            } else {
                InterfaceC3262p interfaceC3262p = this.f63405lvui[i2];
                if (i2 > this.f63398hyr) {
                    interfaceC3262p.toq(byteBuffer);
                }
                ByteBuffer byteBufferMo11407k = interfaceC3262p.mo11407k();
                this.f19363r[i2] = byteBufferMo11407k;
                if (byteBufferMo11407k.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private long jp0y(long j2) {
        return j2 + this.f63421zurt.m11474s(this.f19355g.mo11467q());
    }

    /* JADX INFO: renamed from: l */
    private C3249g m11448l() {
        C3249g c3249g = this.f19367z;
        return c3249g != null ? c3249g : !this.f63408n7h.isEmpty() ? this.f63408n7h.getLast() : this.f63412o1t;
    }

    private static boolean lrht(int i2) {
        return (com.google.android.exoplayer2.util.lrht.f23230k >= 24 && i2 == -6) || i2 == f63376gyi;
    }

    private static int lvui(int i2) {
        int i3 = com.google.android.exoplayer2.util.lrht.f23230k;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(com.google.android.exoplayer2.util.lrht.f67040toq) && i2 == 1) {
            i2 = 2;
        }
        return com.google.android.exoplayer2.util.lrht.m13669r(i2);
    }

    /* JADX INFO: renamed from: m */
    private void m11449m() {
        this.f63399jk = 0L;
        this.f63386a9 = 0L;
        this.f63394fti = 0L;
        this.f63400jp0y = 0L;
        this.f19361o = false;
        this.f63396gvn7 = 0;
        this.f63412o1t = new C3249g(d2ok(), mo11460p(), 0L, 0L, null);
        this.f63391eqxt = 0L;
        this.f19367z = null;
        this.f63408n7h.clear();
        this.f63390dd = null;
        this.f63420x9kr = 0;
        this.f63409ncyb = null;
        this.f19352c = false;
        this.f19354f = false;
        this.f63398hyr = -1;
        this.f19365t = null;
        this.f63406mcp = 0;
        this.f19364s.qrj();
        oc();
    }

    @zy.hyr(29)
    @SuppressLint({"WrongConstant"})
    private int n5r1(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i2 = com.google.android.exoplayer2.util.lrht.f23230k;
        if (i2 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i2 == 30 && com.google.android.exoplayer2.util.lrht.f23233q.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ncyb(int i2) {
        switch (i2) {
            case 5:
                return com.google.android.exoplayer2.audio.toq.f19473k;
            case 6:
            case 18:
                return com.google.android.exoplayer2.audio.toq.f63510toq;
            case 7:
                return d2ok.f19306k;
            case 8:
                return d2ok.f63322toq;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return C3258k.f63451f7l8;
            case 12:
                return C3258k.f19407y;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return com.google.android.exoplayer2.audio.toq.f63512zy;
            case 15:
                return 8000;
            case 16:
                return C3258k.f19406s;
            case 17:
                return com.google.android.exoplayer2.audio.zy.f63539zy;
        }
    }

    @zy.hyr(21)
    private int nmn5(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.f19365t == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f19365t = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f19365t.putInt(1431633921);
        }
        if (this.f63406mcp == 0) {
            this.f19365t.putInt(4, i2);
            this.f19365t.putLong(8, j2 * 1000);
            this.f19365t.position(0);
            this.f63406mcp = i2;
        }
        int iRemaining = this.f19365t.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f19365t, iRemaining, 1);
            if (iWrite < 0) {
                this.f63406mcp = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iCh = ch(audioTrack, byteBuffer, i2);
        if (iCh < 0) {
            this.f63406mcp = 0;
            return iCh;
        }
        this.f63406mcp -= iCh;
        return iCh;
    }

    private void nn86() {
        if (this.f63421zurt.kja0()) {
            this.f19358j = true;
        }
    }

    @zy.hyr(29)
    /* JADX INFO: renamed from: o */
    private void m11450o(AudioTrack audioTrack) {
        if (this.f63387cdj == null) {
            this.f63387cdj = new C3252p();
        }
        this.f63387cdj.m11464k(audioTrack);
    }

    private void oc() {
        int i2 = 0;
        while (true) {
            InterfaceC3262p[] interfaceC3262pArr = this.f63405lvui;
            if (i2 >= interfaceC3262pArr.length) {
                return;
            }
            InterfaceC3262p interfaceC3262p = interfaceC3262pArr[i2];
            interfaceC3262p.flush();
            this.f19363r[i2] = interfaceC3262p.mo11407k();
            i2++;
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: r */
    private static Pair<Integer, Integer> m11451r(xwq3 xwq3Var, @zy.dd C3270y c3270y) {
        if (c3270y == null) {
            return null;
        }
        int iM13743g = com.google.android.exoplayer2.util.wvg.m13743g((String) C3844k.f7l8(xwq3Var.f23682r), xwq3Var.f23673i);
        int iX9kr = 6;
        if (!(iM13743g == 5 || iM13743g == 6 || iM13743g == 18 || iM13743g == 17 || iM13743g == 7 || iM13743g == 8 || iM13743g == 14)) {
            return null;
        }
        if (iM13743g == 18 && !c3270y.f7l8(18)) {
            iM13743g = 6;
        } else if (iM13743g == 8 && !c3270y.f7l8(8)) {
            iM13743g = 7;
        }
        if (!c3270y.f7l8(iM13743g)) {
            return null;
        }
        if (iM13743g != 18) {
            iX9kr = xwq3Var.f23686v;
            if (iX9kr > c3270y.m11539g()) {
                return null;
            }
        } else if (com.google.android.exoplayer2.util.lrht.f23230k >= 29 && (iX9kr = x9kr(18, xwq3Var.f23668d)) == 0) {
            com.google.android.exoplayer2.util.ni7.qrj(f63381xwq3, "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iLvui = lvui(iX9kr);
        if (iLvui == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM13743g), Integer.valueOf(iLvui));
    }

    private boolean uv6() {
        return this.f63410ni7 != null;
    }

    private static boolean vyq(AudioTrack audioTrack) {
        return com.google.android.exoplayer2.util.lrht.f23230k >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: x */
    private void m11453x(ByteBuffer byteBuffer, long j2) throws Exception {
        int iCh;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f63409ncyb;
            if (byteBuffer2 != null) {
                C3844k.m13629k(byteBuffer2 == byteBuffer);
            } else {
                this.f63409ncyb = byteBuffer;
                if (com.google.android.exoplayer2.util.lrht.f23230k < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f19359l;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f19359l = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f19359l, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f63407n5r1 = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (com.google.android.exoplayer2.util.lrht.f23230k < 21) {
                int iZy = this.f63414qrj.zy(this.f63394fti);
                if (iZy > 0) {
                    iCh = this.f63410ni7.write(this.f19359l, this.f63407n5r1, Math.min(iRemaining2, iZy));
                    if (iCh > 0) {
                        this.f63407n5r1 += iCh;
                        byteBuffer.position(byteBuffer.position() + iCh);
                    }
                } else {
                    iCh = 0;
                }
            } else if (this.f63411nn86) {
                C3844k.m13633s(j2 != C3548p.f65257toq);
                iCh = nmn5(this.f63410ni7, byteBuffer, iRemaining2, j2);
            } else {
                iCh = ch(this.f63410ni7, byteBuffer, iRemaining2);
            }
            this.f63397hb = SystemClock.elapsedRealtime();
            if (iCh < 0) {
                boolean zLrht = lrht(iCh);
                if (zLrht) {
                    nn86();
                }
                zurt.C3272g c3272g = new zurt.C3272g(iCh, this.f63421zurt.f19378k, zLrht);
                zurt.zy zyVar = this.f19357i;
                if (zyVar != null) {
                    zyVar.toq(c3272g);
                }
                if (c3272g.isRecoverable) {
                    throw c3272g;
                }
                this.f63415t8r.toq(c3272g);
                return;
            }
            this.f63415t8r.m11468k();
            if (vyq(this.f63410ni7)) {
                long j3 = this.f63400jp0y;
                if (j3 > 0) {
                    this.f19361o = false;
                }
                if (this.f63404lrht && this.f19357i != null && iCh < iRemaining2 && !this.f19361o) {
                    this.f19357i.mo11404q(this.f63414qrj.m11429n(j3));
                }
            }
            int i2 = this.f63421zurt.f63433zy;
            if (i2 == 0) {
                this.f63394fti += (long) iCh;
            }
            if (iCh == iRemaining2) {
                if (i2 != 0) {
                    C3844k.m13633s(byteBuffer == this.f63390dd);
                    this.f63400jp0y += (long) (this.f63396gvn7 * this.f63420x9kr);
                }
                this.f63409ncyb = null;
            }
        }
    }

    @zy.hyr(29)
    private static int x9kr(int i2, int i3) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(com.google.android.exoplayer2.util.lrht.m13669r(i4)).build(), audioAttributesBuild)) {
                return i4;
            }
        }
        return 0;
    }

    private void y9n() {
        if (uv6()) {
            if (com.google.android.exoplayer2.util.lrht.f23230k >= 21) {
                m11443b(this.f63410ni7, this.f63388d2ok);
            } else {
                bf2(this.f63410ni7, this.f63388d2ok);
            }
        }
    }

    @zy.hyr(23)
    private void yz(se seVar) {
        if (uv6()) {
            try {
                this.f63410ni7.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(seVar.f21216k).setPitch(seVar.f21218q).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                com.google.android.exoplayer2.util.ni7.n7h(f63381xwq3, "Failed to set playback params", e2);
            }
            seVar = new se(this.f63410ni7.getPlaybackParams().getSpeed(), this.f63410ni7.getPlaybackParams().getPitch());
            this.f63414qrj.fn3e(seVar.f21216k);
        }
        this.f63418wvg = seVar;
    }

    private boolean zp(xwq3 xwq3Var, C3248g c3248g) {
        int iM13743g;
        int iM13669r;
        int iN5r1;
        if (com.google.android.exoplayer2.util.lrht.f23230k < 29 || this.f19356h == 0 || (iM13743g = com.google.android.exoplayer2.util.wvg.m13743g((String) C3844k.f7l8(xwq3Var.f23682r), xwq3Var.f23673i)) == 0 || (iM13669r = com.google.android.exoplayer2.util.lrht.m13669r(xwq3Var.f23686v)) == 0 || (iN5r1 = n5r1(eqxt(xwq3Var.f23668d, iM13669r, iM13743g), c3248g.toq())) == 0) {
            return false;
        }
        if (iN5r1 == 1) {
            return ((xwq3Var.f67273ab != 0 || xwq3Var.bb != 0) && (this.f19356h == 1)) ? false : true;
        }
        if (iN5r1 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void cdj() throws zurt.C3272g {
        if (!this.f19354f && uv6() && d3()) {
            hb();
            this.f19354f = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public se f7l8() {
        return this.f63402kja0 ? this.f63418wvg : d2ok();
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void flush() {
        if (uv6()) {
            m11449m();
            if (this.f63414qrj.m11430p()) {
                this.f63410ni7.pause();
            }
            if (vyq(this.f63410ni7)) {
                ((C3252p) C3844k.f7l8(this.f63387cdj)).toq(this.f63410ni7);
            }
            AudioTrack audioTrack = this.f63410ni7;
            this.f63410ni7 = null;
            if (com.google.android.exoplayer2.util.lrht.f23230k < 21 && !this.f63416uv6) {
                this.f63417vyq = 0;
            }
            zy zyVar = this.f63393fn3e;
            if (zyVar != null) {
                this.f63421zurt = zyVar;
                this.f63393fn3e = null;
            }
            this.f63414qrj.ki();
            this.f63419x2.close();
            new C3250k("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f63415t8r.m11468k();
        this.f63401ki.m11468k();
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void fn3e(xwq3 xwq3Var, int i2, @zy.dd int[] iArr) throws zurt.C3273k {
        InterfaceC3262p[] interfaceC3262pArr;
        int iM13674x;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        int iM13674x2;
        int[] iArr2;
        if (com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r)) {
            C3844k.m13629k(com.google.android.exoplayer2.util.lrht.qo(xwq3Var.f23687w));
            iM13674x = com.google.android.exoplayer2.util.lrht.m13674x(xwq3Var.f23687w, xwq3Var.f23686v);
            InterfaceC3262p[] interfaceC3262pArr2 = m11442a(xwq3Var.f23687w) ? this.f63403ld6 : this.f19362p;
            this.f19364s.n7h(xwq3Var.f67273ab, xwq3Var.bb);
            if (com.google.android.exoplayer2.util.lrht.f23230k < 21 && xwq3Var.f23686v == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.f19366y.x2(iArr2);
            InterfaceC3262p.k kVar = new InterfaceC3262p.k(xwq3Var.f23668d, xwq3Var.f23686v, xwq3Var.f23687w);
            for (InterfaceC3262p interfaceC3262p : interfaceC3262pArr2) {
                try {
                    InterfaceC3262p.k kVarMo11409q = interfaceC3262p.mo11409q(kVar);
                    if (interfaceC3262p.isActive()) {
                        kVar = kVarMo11409q;
                    }
                } catch (InterfaceC3262p.toq e2) {
                    throw new zurt.C3273k(e2, xwq3Var);
                }
            }
            int i6 = kVar.f63499zy;
            i3 = kVar.f19444k;
            iIntValue2 = com.google.android.exoplayer2.util.lrht.m13669r(kVar.f63498toq);
            interfaceC3262pArr = interfaceC3262pArr2;
            iIntValue = i6;
            iM13674x2 = com.google.android.exoplayer2.util.lrht.m13674x(i6, kVar.f63498toq);
            i4 = 0;
        } else {
            InterfaceC3262p[] interfaceC3262pArr3 = new InterfaceC3262p[0];
            int i7 = xwq3Var.f23668d;
            if (zp(xwq3Var, this.f63395fu4)) {
                interfaceC3262pArr = interfaceC3262pArr3;
                iM13674x = -1;
                iIntValue = com.google.android.exoplayer2.util.wvg.m13743g((String) C3844k.f7l8(xwq3Var.f23682r), xwq3Var.f23673i);
                iM13674x2 = -1;
                i3 = i7;
                i4 = 1;
                iIntValue2 = com.google.android.exoplayer2.util.lrht.m13669r(xwq3Var.f23686v);
            } else {
                Pair<Integer, Integer> pairM11451r = m11451r(xwq3Var, this.f19360n);
                if (pairM11451r == null) {
                    String strValueOf = String.valueOf(xwq3Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new zurt.C3273k(sb.toString(), xwq3Var);
                }
                interfaceC3262pArr = interfaceC3262pArr3;
                iM13674x = -1;
                iIntValue = ((Integer) pairM11451r.first).intValue();
                iIntValue2 = ((Integer) pairM11451r.second).intValue();
                i3 = i7;
                i4 = 2;
                iM13674x2 = -1;
            }
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(xwq3Var);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i4);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new zurt.C3273k(sb2.toString(), xwq3Var);
        }
        if (iIntValue2 != 0) {
            this.f19358j = false;
            zy zyVar = new zy(xwq3Var, iM13674x, i4, iM13674x2, i3, iIntValue2, iIntValue, i2, this.f63402kja0, interfaceC3262pArr);
            if (uv6()) {
                this.f63393fn3e = zyVar;
                return;
            } else {
                this.f63421zurt = zyVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(xwq3Var);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i4);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new zurt.C3273k(sb3.toString(), xwq3Var);
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: g */
    public void mo11455g() {
        if (this.f63411nn86) {
            this.f63411nn86 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: h */
    public void mo11456h() {
        if (com.google.android.exoplayer2.util.lrht.f23230k < 25) {
            flush();
            return;
        }
        this.f63415t8r.m11468k();
        this.f63401ki.m11468k();
        if (uv6()) {
            m11449m();
            if (this.f63414qrj.m11430p()) {
                this.f63410ni7.pause();
            }
            this.f63410ni7.flush();
            this.f63414qrj.ki();
            fu4 fu4Var = this.f63414qrj;
            AudioTrack audioTrack = this.f63410ni7;
            zy zyVar = this.f63421zurt;
            fu4Var.m11428i(audioTrack, zyVar.f63433zy == 2, zyVar.f63431f7l8, zyVar.f19380q, zyVar.f19382y);
            this.f63413oc = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: i */
    public void mo11457i() {
        C3844k.m13633s(com.google.android.exoplayer2.util.lrht.f23230k >= 21);
        C3844k.m13633s(this.f63416uv6);
        if (this.f63411nn86) {
            return;
        }
        this.f63411nn86 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: k */
    public boolean mo11458k(xwq3 xwq3Var) {
        return kja0(xwq3Var) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public long ki(boolean z2) {
        if (!uv6() || this.f63413oc) {
            return Long.MIN_VALUE;
        }
        return jp0y(fti(Math.min(this.f63414qrj.m11431q(z2), this.f63421zurt.m11474s(m11446f()))));
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public int kja0(xwq3 xwq3Var) {
        if (!com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r)) {
            return ((this.f19358j || !zp(xwq3Var, this.f63395fu4)) && !m11445e(xwq3Var, this.f19360n)) ? 0 : 2;
        }
        if (com.google.android.exoplayer2.util.lrht.qo(xwq3Var.f23687w)) {
            int i2 = xwq3Var.f23687w;
            return (i2 == 2 || (this.f63392f7l8 && i2 == 4)) ? 2 : 1;
        }
        int i3 = xwq3Var.f23687w;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i3);
        com.google.android.exoplayer2.util.ni7.qrj(f63381xwq3, sb.toString());
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void ld6(se seVar) {
        se seVar2 = new se(com.google.android.exoplayer2.util.lrht.ki(seVar.f21216k, 0.1f, 8.0f), com.google.android.exoplayer2.util.lrht.ki(seVar.f21218q, 0.1f, 8.0f));
        if (!this.f63402kja0 || com.google.android.exoplayer2.util.lrht.f23230k < 23) {
            ek5k(seVar2, mo11460p());
        } else {
            yz(seVar2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo11459n() {
        return uv6() && this.f63414qrj.m11432s(m11446f());
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void n7h(zurt.zy zyVar) {
        this.f19357i = zyVar;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: p */
    public boolean mo11460p() {
        return m11448l().f63422toq;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void pause() {
        this.f63404lrht = false;
        if (uv6() && this.f63414qrj.cdj()) {
            this.f63410ni7.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void play() {
        this.f63404lrht = true;
        if (uv6()) {
            this.f63414qrj.zurt();
            this.f63410ni7.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: q */
    public void mo11461q(int i2) {
        if (this.f63417vyq != i2) {
            this.f63417vyq = i2;
            this.f63416uv6 = i2 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public boolean qrj(ByteBuffer byteBuffer, long j2, int i2) throws Exception {
        ByteBuffer byteBuffer2 = this.f63390dd;
        C3844k.m13629k(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f63393fn3e != null) {
            if (!d3()) {
                return false;
            }
            if (this.f63393fn3e.toq(this.f63421zurt)) {
                this.f63421zurt = this.f63393fn3e;
                this.f63393fn3e = null;
                if (vyq(this.f63410ni7) && this.f19356h != 3) {
                    this.f63410ni7.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f63410ni7;
                    xwq3 xwq3Var = this.f63421zurt.f19378k;
                    audioTrack.setOffloadDelayPadding(xwq3Var.f67273ab, xwq3Var.bb);
                    this.f19361o = true;
                }
            } else {
                hb();
                if (mo11459n()) {
                    return false;
                }
                flush();
            }
            a9(j2);
        }
        if (!uv6()) {
            try {
                m11444c();
            } catch (zurt.toq e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.f63401ki.toq(e2);
                return false;
            }
        }
        this.f63401ki.m11468k();
        if (this.f63413oc) {
            this.f63391eqxt = Math.max(0L, j2);
            this.f63389d3 = false;
            this.f63413oc = false;
            if (this.f63402kja0 && com.google.android.exoplayer2.util.lrht.f23230k >= 23) {
                yz(this.f63418wvg);
            }
            a9(j2);
            if (this.f63404lrht) {
                play();
            }
        }
        if (!this.f63414qrj.x2(m11446f())) {
            return false;
        }
        if (this.f63390dd == null) {
            C3844k.m13629k(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zy zyVar = this.f63421zurt;
            if (zyVar.f63433zy != 0 && this.f63396gvn7 == 0) {
                int iDd = dd(zyVar.f63431f7l8, byteBuffer);
                this.f63396gvn7 = iDd;
                if (iDd == 0) {
                    return true;
                }
            }
            if (this.f19367z != null) {
                if (!d3()) {
                    return false;
                }
                a9(j2);
                this.f19367z = null;
            }
            long jN7h = this.f63391eqxt + this.f63421zurt.n7h(hyr() - this.f19364s.x2());
            if (!this.f63389d3 && Math.abs(jN7h - j2) > 200000) {
                this.f19357i.toq(new zurt.C3274n(j2, jN7h));
                this.f63389d3 = true;
            }
            if (this.f63389d3) {
                if (!d3()) {
                    return false;
                }
                long j3 = j2 - jN7h;
                this.f63391eqxt += j3;
                this.f63389d3 = false;
                a9(j2);
                zurt.zy zyVar2 = this.f19357i;
                if (zyVar2 != null && j3 != 0) {
                    zyVar2.mo11401g();
                }
            }
            if (this.f63421zurt.f63433zy == 0) {
                this.f63399jk += (long) byteBuffer.remaining();
            } else {
                this.f63386a9 += (long) (this.f63396gvn7 * i2);
            }
            this.f63390dd = byteBuffer;
            this.f63420x9kr = i2;
        }
        m11447j(j2);
        if (!this.f63390dd.hasRemaining()) {
            this.f63390dd = null;
            this.f63420x9kr = 0;
            return true;
        }
        if (!this.f63414qrj.ld6(m11446f())) {
            return false;
        }
        com.google.android.exoplayer2.util.ni7.qrj(f63381xwq3, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void reset() {
        flush();
        for (InterfaceC3262p interfaceC3262p : this.f19362p) {
            interfaceC3262p.reset();
        }
        for (InterfaceC3262p interfaceC3262p2 : this.f63403ld6) {
            interfaceC3262p2.reset();
        }
        this.f63404lrht = false;
        this.f19358j = false;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: s */
    public void mo11462s(C3248g c3248g) {
        if (this.f63395fu4.equals(c3248g)) {
            return;
        }
        this.f63395fu4 = c3248g;
        if (this.f63411nn86) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void t8r() {
        this.f63389d3 = true;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void toq(float f2) {
        if (this.f63388d2ok != f2) {
            this.f63388d2ok = f2;
            y9n();
        }
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public void x2(boolean z2) {
        ek5k(d2ok(), z2);
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    /* JADX INFO: renamed from: y */
    public void mo11463y(C3271z c3271z) {
        if (this.f19353e.equals(c3271z)) {
            return;
        }
        int i2 = c3271z.f19514k;
        float f2 = c3271z.f63534toq;
        AudioTrack audioTrack = this.f63410ni7;
        if (audioTrack != null) {
            if (this.f19353e.f19514k != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.f63410ni7.setAuxEffectSendLevel(f2);
            }
        }
        this.f19353e = c3271z;
    }

    @Override // com.google.android.exoplayer2.audio.zurt
    public boolean zy() {
        return !uv6() || (this.f19354f && !mo11459n());
    }

    public gvn7(@zy.dd C3270y c3270y, InterfaceC3262p[] interfaceC3262pArr, boolean z2) {
        this(c3270y, new C3253q(interfaceC3262pArr), z2, false, 0);
    }

    public gvn7(@zy.dd C3270y c3270y, toq toqVar, boolean z2, boolean z3, int i2) {
        this.f19360n = c3270y;
        this.f19355g = (toq) C3844k.f7l8(toqVar);
        int i3 = com.google.android.exoplayer2.util.lrht.f23230k;
        this.f63392f7l8 = i3 >= 21 && z2;
        this.f63402kja0 = i3 >= 23 && z3;
        this.f19356h = i3 < 29 ? 0 : i2;
        this.f63419x2 = new ConditionVariable(true);
        this.f63414qrj = new fu4(new C3254s(this, null));
        wvg wvgVar = new wvg();
        this.f19366y = wvgVar;
        lrht lrhtVar = new lrht();
        this.f19364s = lrhtVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C3259l(), wvgVar, lrhtVar);
        Collections.addAll(arrayList, toqVar.toq());
        this.f19362p = (InterfaceC3262p[]) arrayList.toArray(new InterfaceC3262p[0]);
        this.f63403ld6 = new InterfaceC3262p[]{new lvui()};
        this.f63388d2ok = 1.0f;
        this.f63395fu4 = C3248g.f19336s;
        this.f63417vyq = 0;
        this.f19353e = new C3271z(0, 0.0f);
        se seVar = se.f21212g;
        this.f63412o1t = new C3249g(seVar, false, 0L, 0L, null);
        this.f63418wvg = seVar;
        this.f63398hyr = -1;
        this.f63405lvui = new InterfaceC3262p[0];
        this.f19363r = new ByteBuffer[0];
        this.f63408n7h = new ArrayDeque<>();
        this.f63401ki = new C3255y<>(100L);
        this.f63415t8r = new C3255y<>(100L);
    }
}
