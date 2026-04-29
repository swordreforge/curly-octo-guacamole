package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.analytics.lv5;
import com.google.android.exoplayer2.analytics.t8iq;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.u */
/* JADX INFO: compiled from: PlaybackStatsListener.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3238u implements InterfaceC3239x, lv5.InterfaceC3227k {

    /* JADX INFO: renamed from: a */
    private t8iq f19225a;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private final pc.toq f63208a98o;

    /* JADX INFO: renamed from: b */
    private final Map<String, InterfaceC3239x.toq> f19226b;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    @zy.dd
    private final k f63209bf2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @zy.dd
    private xwq3 f63210bo;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private com.google.android.exoplayer2.video.wvg f63211c8jq;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private int f63212ch;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private final boolean f63213i1;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    @zy.dd
    private Exception f63214lv5;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private int f63215nmn5;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private long f63216t8iq;

    /* JADX INFO: renamed from: u */
    private long f19227u;

    /* JADX INFO: renamed from: x */
    private long f19228x;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @zy.dd
    private xwq3 f63217y2;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private final Map<String, toq> f63218y9n;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private final lv5 f63219yz;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    @zy.dd
    private String f63220zp;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.u$k */
    /* JADX INFO: compiled from: PlaybackStatsListener.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void m11327k(InterfaceC3239x.toq toqVar, t8iq t8iqVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.u$toq */
    /* JADX INFO: compiled from: PlaybackStatsListener.java */
    private static final class toq {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private long f63221a9;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private int f63222cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        private boolean f63223d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private long f63224d3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private long f63225dd;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private boolean f63226eqxt;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final List<t8iq.C3237k> f63227f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private long f63228fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private int f63229fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private long f63230fu4;

        /* JADX INFO: renamed from: g */
        private final List<t8iq.toq> f19229g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private int f63231gvn7;

        /* JADX INFO: renamed from: h */
        private int f19230h;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        private float f63232hyr;

        /* JADX INFO: renamed from: i */
        private long f19231i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private long f63233jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private int f63234jp0y;

        /* JADX INFO: renamed from: k */
        private final boolean f19232k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private long f63235ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f63236kja0;

        /* JADX INFO: renamed from: l */
        private long f19233l;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f63237ld6;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private boolean f63238lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private long f63239mcp;

        /* JADX INFO: renamed from: n */
        private final List<t8iq.toq> f19234n;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        private long f63240n5r1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private int f63241n7h;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        @zy.dd
        private xwq3 f63242ncyb;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private long f63243ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private long f63244o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private boolean f63245oc;

        /* JADX INFO: renamed from: p */
        private long f19235p;

        /* JADX INFO: renamed from: q */
        private final List<long[]> f19236q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f63246qrj;

        /* JADX INFO: renamed from: r */
        private boolean f19237r;

        /* JADX INFO: renamed from: s */
        private final boolean f19238s;

        /* JADX INFO: renamed from: t */
        private long f19239t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private int f63247t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long[] f63248toq = new long[16];

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private long f63249wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f63250x2;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        @zy.dd
        private xwq3 f63251x9kr;

        /* JADX INFO: renamed from: y */
        private final List<t8iq.C3237k> f19240y;

        /* JADX INFO: renamed from: z */
        private long f19241z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private long f63252zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final List<t8iq.zy> f63253zy;

        public toq(boolean z2, InterfaceC3239x.toq toqVar) {
            this.f19232k = z2;
            this.f63253zy = z2 ? new ArrayList<>() : Collections.emptyList();
            this.f19236q = z2 ? new ArrayList<>() : Collections.emptyList();
            this.f19234n = z2 ? new ArrayList<>() : Collections.emptyList();
            this.f19229g = z2 ? new ArrayList<>() : Collections.emptyList();
            this.f63227f7l8 = z2 ? new ArrayList<>() : Collections.emptyList();
            this.f19240y = z2 ? new ArrayList<>() : Collections.emptyList();
            boolean z3 = false;
            this.f63231gvn7 = 0;
            this.f63224d3 = toqVar.f19265k;
            this.f19235p = C3548p.f65257toq;
            this.f63235ki = C3548p.f65257toq;
            fti.C3596k c3596k = toqVar.f19268q;
            if (c3596k != null && c3596k.zy()) {
                z3 = true;
            }
            this.f19238s = z3;
            this.f63228fn3e = -1L;
            this.f19231i = -1L;
            this.f63247t8r = -1;
            this.f63232hyr = 1.0f;
        }

        private int cdj(gc3c gc3cVar) {
            int playbackState = gc3cVar.getPlaybackState();
            if (this.f63245oc && this.f63226eqxt) {
                return 5;
            }
            if (this.f63238lvui) {
                return 13;
            }
            if (!this.f63226eqxt) {
                return this.f19237r ? 1 : 0;
            }
            if (this.f63223d2ok) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (gc3cVar.yqrt()) {
                        return gc3cVar.qo() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.f63231gvn7 == 0) {
                    return this.f63231gvn7;
                }
                return 12;
            }
            int i2 = this.f63231gvn7;
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 14) {
                return 2;
            }
            if (gc3cVar.yqrt()) {
                return gc3cVar.qo() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void f7l8(long j2) {
            xwq3 xwq3Var;
            int i2;
            if (this.f63231gvn7 == 3 && (xwq3Var = this.f63242ncyb) != null && (i2 = xwq3Var.f23672h) != -1) {
                long j3 = (long) ((j2 - this.f63240n5r1) * this.f63232hyr);
                this.f63244o1t += j3;
                this.f63249wvg += j3 * ((long) i2);
            }
            this.f63240n5r1 = j2;
        }

        /* JADX INFO: renamed from: g */
        private static boolean m11328g(int i2) {
            return i2 == 6 || i2 == 7 || i2 == 10;
        }

        private void ki(int i2, InterfaceC3239x.toq toqVar) {
            C3844k.m13629k(toqVar.f19265k >= this.f63224d3);
            long j2 = toqVar.f19265k;
            long j3 = j2 - this.f63224d3;
            long[] jArr = this.f63248toq;
            int i3 = this.f63231gvn7;
            jArr[i3] = jArr[i3] + j3;
            if (this.f19235p == C3548p.f65257toq) {
                this.f19235p = j2;
            }
            this.f63246qrj |= zy(i3, i2);
            this.f63237ld6 |= m11329n(i2);
            this.f63250x2 |= i2 == 11;
            if (!m11331q(this.f63231gvn7) && m11331q(i2)) {
                this.f63241n7h++;
            }
            if (i2 == 5) {
                this.f19230h++;
            }
            if (!m11328g(this.f63231gvn7) && m11328g(i2)) {
                this.f63222cdj++;
                this.f63225dd = toqVar.f19265k;
            }
            if (m11328g(this.f63231gvn7) && this.f63231gvn7 != 7 && i2 == 7) {
                this.f63236kja0++;
            }
            m11330p(toqVar.f19265k);
            this.f63231gvn7 = i2;
            this.f63224d3 = toqVar.f19265k;
            if (this.f19232k) {
                this.f63253zy.add(new t8iq.zy(toqVar, i2));
            }
        }

        private void ld6(long j2, long j3) {
            if (this.f19232k) {
                if (this.f63231gvn7 != 3) {
                    if (j3 == C3548p.f65257toq) {
                        return;
                    }
                    if (!this.f19236q.isEmpty()) {
                        List<long[]> list = this.f19236q;
                        long j4 = list.get(list.size() - 1)[1];
                        if (j4 != j3) {
                            this.f19236q.add(new long[]{j2, j4});
                        }
                    }
                }
                if (j3 != C3548p.f65257toq) {
                    this.f19236q.add(new long[]{j2, j3});
                } else {
                    if (this.f19236q.isEmpty()) {
                        return;
                    }
                    this.f19236q.add(toq(j2));
                }
            }
        }

        /* JADX INFO: renamed from: n */
        private static boolean m11329n(int i2) {
            return i2 == 3 || i2 == 4 || i2 == 9;
        }

        /* JADX INFO: renamed from: p */
        private void m11330p(long j2) {
            if (m11328g(this.f63231gvn7)) {
                long j3 = j2 - this.f63225dd;
                long j4 = this.f63235ki;
                if (j4 == C3548p.f65257toq || j3 > j4) {
                    this.f63235ki = j3;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        private static boolean m11331q(int i2) {
            return i2 == 4 || i2 == 7;
        }

        /* JADX INFO: renamed from: s */
        private void m11332s(InterfaceC3239x.toq toqVar, @zy.dd xwq3 xwq3Var) {
            int i2;
            if (com.google.android.exoplayer2.util.lrht.zy(this.f63242ncyb, xwq3Var)) {
                return;
            }
            f7l8(toqVar.f19265k);
            if (xwq3Var != null && this.f63228fn3e == -1 && (i2 = xwq3Var.f23672h) != -1) {
                this.f63228fn3e = i2;
            }
            this.f63242ncyb = xwq3Var;
            if (this.f19232k) {
                this.f19229g.add(new t8iq.toq(toqVar, xwq3Var));
            }
        }

        private long[] toq(long j2) {
            List<long[]> list = this.f19236q;
            return new long[]{j2, list.get(list.size() - 1)[1] + ((long) ((j2 - r0[0]) * this.f63232hyr))};
        }

        private void x2(InterfaceC3239x.toq toqVar, @zy.dd xwq3 xwq3Var) {
            int i2;
            int i3;
            if (com.google.android.exoplayer2.util.lrht.zy(this.f63251x9kr, xwq3Var)) {
                return;
            }
            m11333y(toqVar.f19265k);
            if (xwq3Var != null) {
                if (this.f63247t8r == -1 && (i3 = xwq3Var.f23679o) != -1) {
                    this.f63247t8r = i3;
                }
                if (this.f19231i == -1 && (i2 = xwq3Var.f23672h) != -1) {
                    this.f19231i = i2;
                }
            }
            this.f63251x9kr = xwq3Var;
            if (this.f19232k) {
                this.f19234n.add(new t8iq.toq(toqVar, xwq3Var));
            }
        }

        /* JADX INFO: renamed from: y */
        private void m11333y(long j2) {
            xwq3 xwq3Var;
            if (this.f63231gvn7 == 3 && (xwq3Var = this.f63251x9kr) != null) {
                long j3 = (long) ((j2 - this.f19233l) * this.f63232hyr);
                int i2 = xwq3Var.f23679o;
                if (i2 != -1) {
                    this.f63252zurt += j3;
                    this.f63243ni7 += ((long) i2) * j3;
                }
                int i3 = xwq3Var.f23672h;
                if (i3 != -1) {
                    this.f63230fu4 += j3;
                    this.f19241z += j3 * ((long) i3);
                }
            }
            this.f19233l = j2;
        }

        private static boolean zy(int i2, int i3) {
            return ((i2 != 1 && i2 != 2 && i2 != 14) || i3 == 1 || i3 == 2 || i3 == 14 || i3 == 3 || i3 == 4 || i3 == 9 || i3 == 11) ? false : true;
        }

        /* JADX INFO: renamed from: h */
        public void m11334h() {
            this.f63223d2ok = true;
            this.f63245oc = false;
        }

        /* JADX INFO: renamed from: k */
        public t8iq m11335k(boolean z2) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.f63248toq;
            List<long[]> list2 = this.f19236q;
            if (z2) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f63248toq, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.f63224d3);
                int i2 = this.f63231gvn7;
                jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
                m11330p(jElapsedRealtime);
                m11333y(jElapsedRealtime);
                f7l8(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f19236q);
                if (this.f19232k && this.f63231gvn7 == 3) {
                    arrayList.add(toq(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i3 = (this.f63246qrj || !this.f63237ld6) ? 1 : 0;
            long j2 = i3 != 0 ? C3548p.f65257toq : jArr[2];
            int i4 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z2 ? this.f19234n : new ArrayList(this.f19234n);
            List arrayList3 = z2 ? this.f19229g : new ArrayList(this.f19229g);
            List arrayList4 = z2 ? this.f63253zy : new ArrayList(this.f63253zy);
            long j3 = this.f19235p;
            boolean z3 = this.f63226eqxt;
            int i5 = !this.f63237ld6 ? 1 : 0;
            boolean z5 = this.f63250x2;
            int i6 = i3 ^ 1;
            int i7 = this.f63241n7h;
            int i8 = this.f63236kja0;
            int i9 = this.f19230h;
            int i10 = this.f63222cdj;
            long j4 = this.f63235ki;
            boolean z6 = this.f19238s;
            long[] jArr3 = jArr;
            long j5 = this.f63252zurt;
            long j6 = this.f63243ni7;
            long j7 = this.f63230fu4;
            long j8 = this.f19241z;
            long j9 = this.f63244o1t;
            long j10 = this.f63249wvg;
            int i11 = this.f63247t8r;
            int i12 = i11 == -1 ? 0 : 1;
            long j11 = this.f19231i;
            int i13 = j11 == -1 ? 0 : 1;
            long j12 = this.f63228fn3e;
            int i14 = j12 == -1 ? 0 : 1;
            long j13 = this.f19239t;
            long j14 = this.f63239mcp;
            long j15 = this.f63233jk;
            long j16 = this.f63221a9;
            int i15 = this.f63229fti;
            return new t8iq(1, jArr3, arrayList4, list, j3, z3 ? 1 : 0, i5, z5 ? 1 : 0, i4, j2, i6, i7, i8, i9, i10, j4, z6 ? 1 : 0, arrayList2, arrayList3, j5, j6, j7, j8, j9, j10, i12, i13, i11, j11, i14, j12, j13, j14, j15, j16, i15 > 0 ? 1 : 0, i15, this.f63234jp0y, this.f63227f7l8, this.f19240y);
        }

        public void kja0() {
            this.f63226eqxt = true;
        }

        public void n7h(InterfaceC3239x.toq toqVar, boolean z2, long j2) {
            int i2 = 11;
            if (this.f63231gvn7 != 11 && !z2) {
                i2 = 15;
            }
            ld6(toqVar.f19265k, j2);
            m11333y(toqVar.f19265k);
            f7l8(toqVar.f19265k);
            ki(i2, toqVar);
        }

        public void qrj(gc3c gc3cVar, InterfaceC3239x.toq toqVar, boolean z2, long j2, boolean z3, int i2, boolean z5, boolean z6, @zy.dd yqrt yqrtVar, @zy.dd Exception exc, long j3, long j4, @zy.dd xwq3 xwq3Var, @zy.dd xwq3 xwq3Var2, @zy.dd com.google.android.exoplayer2.video.wvg wvgVar) {
            long j5 = C3548p.f65257toq;
            if (j2 != C3548p.f65257toq) {
                ld6(toqVar.f19265k, j2);
                this.f63245oc = true;
            }
            if (gc3cVar.getPlaybackState() != 2) {
                this.f63245oc = false;
            }
            int playbackState = gc3cVar.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z3) {
                this.f63223d2ok = false;
            }
            if (yqrtVar != null) {
                this.f63238lvui = true;
                this.f63229fti++;
                if (this.f19232k) {
                    this.f63227f7l8.add(new t8iq.C3237k(toqVar, yqrtVar));
                }
            } else if (gc3cVar.mo12087n() == null) {
                this.f63238lvui = false;
            }
            if (this.f63226eqxt && !this.f63223d2ok) {
                pjz9 pjz9VarTfm = gc3cVar.tfm();
                if (!pjz9VarTfm.zy(2)) {
                    x2(toqVar, null);
                }
                if (!pjz9VarTfm.zy(1)) {
                    m11332s(toqVar, null);
                }
            }
            if (xwq3Var != null) {
                x2(toqVar, xwq3Var);
            }
            if (xwq3Var2 != null) {
                m11332s(toqVar, xwq3Var2);
            }
            xwq3 xwq3Var3 = this.f63251x9kr;
            if (xwq3Var3 != null && xwq3Var3.f23679o == -1 && wvgVar != null) {
                x2(toqVar, xwq3Var3.toq().bf2(wvgVar.f23577k).ncyb(wvgVar.f23579q).a9());
            }
            if (z6) {
                this.f19237r = true;
            }
            if (z5) {
                this.f63221a9++;
            }
            this.f63233jk += (long) i2;
            this.f19239t += j3;
            this.f63239mcp += j4;
            if (exc != null) {
                this.f63234jp0y++;
                if (this.f19232k) {
                    this.f19240y.add(new t8iq.C3237k(toqVar, exc));
                }
            }
            int iCdj = cdj(gc3cVar);
            float f2 = gc3cVar.f7l8().f21216k;
            if (this.f63231gvn7 != iCdj || this.f63232hyr != f2) {
                long j6 = toqVar.f19265k;
                if (z2) {
                    j5 = toqVar.f19266n;
                }
                ld6(j6, j5);
                m11333y(toqVar.f19265k);
                f7l8(toqVar.f19265k);
            }
            this.f63232hyr = f2;
            if (this.f63231gvn7 != iCdj) {
                ki(iCdj, toqVar);
            }
        }
    }

    public C3238u(boolean z2, @zy.dd k kVar) {
        this.f63209bf2 = kVar;
        this.f63213i1 = z2;
        nmn5 nmn5Var = new nmn5();
        this.f63219yz = nmn5Var;
        this.f63218y9n = new HashMap();
        this.f19226b = new HashMap();
        this.f19225a = t8iq.f19206m;
        this.f63208a98o = new pc.toq();
        this.f63211c8jq = com.google.android.exoplayer2.video.wvg.f23568i;
        nmn5Var.toq(this);
    }

    private Pair<InterfaceC3239x.toq, Boolean> ikck(InterfaceC3239x.zy zyVar, String str) {
        fti.C3596k c3596k;
        InterfaceC3239x.toq toqVar = null;
        boolean zMo11293n = false;
        for (int i2 = 0; i2 < zyVar.m11355n(); i2++) {
            InterfaceC3239x.toq toqVarM11356q = zyVar.m11356q(zyVar.zy(i2));
            boolean zMo11293n2 = this.f63219yz.mo11293n(toqVarM11356q, str);
            if (toqVar == null || ((zMo11293n2 && !zMo11293n) || (zMo11293n2 == zMo11293n && toqVarM11356q.f19265k > toqVar.f19265k))) {
                toqVar = toqVarM11356q;
                zMo11293n = zMo11293n2;
            }
        }
        C3844k.f7l8(toqVar);
        if (!zMo11293n && (c3596k = toqVar.f19268q) != null && c3596k.zy()) {
            long jM12501s = toqVar.f63297toq.x2(toqVar.f19268q.f21225k, this.f63208a98o).m12501s(toqVar.f19268q.f65325toq);
            if (jM12501s == Long.MIN_VALUE) {
                jM12501s = this.f63208a98o.f21149g;
            }
            long jKi = jM12501s + this.f63208a98o.ki();
            long j2 = toqVar.f19265k;
            pc pcVar = toqVar.f63297toq;
            int i3 = toqVar.f63298zy;
            fti.C3596k c3596k2 = toqVar.f19268q;
            InterfaceC3239x.toq toqVar2 = new InterfaceC3239x.toq(j2, pcVar, i3, new fti.C3596k(c3596k2.f21225k, c3596k2.f21227q, c3596k2.f65325toq), com.google.android.exoplayer2.util.lrht.zwy(jKi), toqVar.f63297toq, toqVar.f63296f7l8, toqVar.f19270y, toqVar.f19269s, toqVar.f19267p);
            zMo11293n = this.f63219yz.mo11293n(toqVar2, str);
            toqVar = toqVar2;
        }
        return Pair.create(toqVar, Boolean.valueOf(zMo11293n));
    }

    private void qkj8(InterfaceC3239x.zy zyVar) {
        for (int i2 = 0; i2 < zyVar.m11355n(); i2++) {
            int iZy = zyVar.zy(i2);
            InterfaceC3239x.toq toqVarM11356q = zyVar.m11356q(iZy);
            if (iZy == 0) {
                this.f63219yz.f7l8(toqVarM11356q);
            } else if (iZy == 11) {
                this.f63219yz.mo11291g(toqVarM11356q, this.f63212ch);
            } else {
                this.f63219yz.mo11294q(toqVarM11356q);
            }
        }
    }

    private boolean vq(InterfaceC3239x.zy zyVar, String str, int i2) {
        return zyVar.m11354k(i2) && this.f63219yz.mo11293n(zyVar.m11356q(i2), str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: a */
    public void mo11322a(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.wvg wvgVar) {
        int i2 = wvgVar.f65467toq;
        if (i2 == 2 || i2 == 0) {
            this.f63210bo = wvgVar.f65468zy;
        } else if (i2 == 1) {
            this.f63217y2 = wvgVar.f65468zy;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void ch(InterfaceC3239x.toq toqVar, gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
        if (this.f63220zp == null) {
            this.f63220zp = this.f63219yz.mo11292k();
            this.f19228x = x2Var.f20526p;
        }
        this.f63212ch = i2;
    }

    /* JADX INFO: renamed from: d */
    public t8iq m11323d() {
        int i2 = 1;
        t8iq[] t8iqVarArr = new t8iq[this.f63218y9n.size() + 1];
        t8iqVarArr[0] = this.f19225a;
        Iterator<toq> it = this.f63218y9n.values().iterator();
        while (it.hasNext()) {
            t8iqVarArr[i2] = it.next().m11335k(false);
            i2++;
        }
        return t8iq.lrht(t8iqVarArr);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void d2ok(InterfaceC3239x.toq toqVar, int i2, long j2, long j3) {
        this.f63216t8iq = i2;
        this.f19227u = j2;
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: j */
    public void mo11324j(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.video.wvg wvgVar) {
        this.f63211c8jq = wvgVar;
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void kja0(gc3c gc3cVar, InterfaceC3239x.zy zyVar) {
        if (zyVar.m11355n() == 0) {
            return;
        }
        qkj8(zyVar);
        for (String str : this.f63218y9n.keySet()) {
            Pair<InterfaceC3239x.toq, Boolean> pairIkck = ikck(zyVar, str);
            toq toqVar = this.f63218y9n.get(str);
            boolean zVq = vq(zyVar, str, 11);
            boolean zVq2 = vq(zyVar, str, InterfaceC3239x.f63281ncyb);
            boolean zVq3 = vq(zyVar, str, 1012);
            boolean zVq4 = vq(zyVar, str, 1000);
            boolean zVq5 = vq(zyVar, str, 10);
            boolean z2 = vq(zyVar, str, 1003) || vq(zyVar, str, InterfaceC3239x.f19246e);
            boolean zVq6 = vq(zyVar, str, 1006);
            boolean zVq7 = vq(zyVar, str, 1004);
            toqVar.qrj(gc3cVar, (InterfaceC3239x.toq) pairIkck.first, ((Boolean) pairIkck.second).booleanValue(), str.equals(this.f63220zp) ? this.f19228x : C3548p.f65257toq, zVq, zVq2 ? this.f63215nmn5 : 0, zVq3, zVq4, zVq5 ? gc3cVar.mo12087n() : null, z2 ? this.f63214lv5 : null, zVq6 ? this.f63216t8iq : 0L, zVq6 ? this.f19227u : 0L, zVq7 ? this.f63210bo : null, zVq7 ? this.f63217y2 : null, vq(zyVar, str, InterfaceC3239x.f19245c) ? this.f63211c8jq : null);
        }
        this.f63210bo = null;
        this.f63217y2 = null;
        this.f63220zp = null;
        if (zyVar.m11354k(InterfaceC3239x.f19256o)) {
            this.f63219yz.zy(zyVar.m11356q(InterfaceC3239x.f19256o));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.lv5.InterfaceC3227k
    public void lv5(InterfaceC3239x.toq toqVar, String str) {
        this.f63218y9n.put(str, new toq(this.f63213i1, toqVar));
        this.f19226b.put(str, toqVar);
    }

    @Override // com.google.android.exoplayer2.analytics.lv5.InterfaceC3227k
    /* JADX INFO: renamed from: m */
    public void mo11296m(InterfaceC3239x.toq toqVar, String str) {
        ((toq) C3844k.f7l8(this.f63218y9n.get(str))).kja0();
    }

    @zy.dd
    public t8iq mu() {
        String strMo11292k = this.f63219yz.mo11292k();
        toq toqVar = strMo11292k == null ? null : this.f63218y9n.get(strMo11292k);
        if (toqVar == null) {
            return null;
        }
        return toqVar.m11335k(false);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void ni7(InterfaceC3239x.toq toqVar, int i2, long j2) {
        this.f63215nmn5 = i2;
    }

    @Override // com.google.android.exoplayer2.analytics.lv5.InterfaceC3227k
    /* JADX INFO: renamed from: o */
    public void mo11297o(InterfaceC3239x.toq toqVar, String str, boolean z2) {
        toq toqVar2 = (toq) C3844k.f7l8(this.f63218y9n.remove(str));
        InterfaceC3239x.toq toqVar3 = (InterfaceC3239x.toq) C3844k.f7l8(this.f19226b.remove(str));
        toqVar2.n7h(toqVar, z2, str.equals(this.f63220zp) ? this.f19228x : C3548p.f65257toq);
        t8iq t8iqVarM11335k = toqVar2.m11335k(true);
        this.f19225a = t8iq.lrht(this.f19225a, t8iqVarM11335k);
        k kVar = this.f63209bf2;
        if (kVar != null) {
            kVar.m11327k(toqVar3, t8iqVarM11335k);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: p */
    public void mo11325p(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar, IOException iOException, boolean z2) {
        this.f63214lv5 = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: q */
    public void mo11326q(InterfaceC3239x.toq toqVar, Exception exc) {
        this.f63214lv5 = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.lv5.InterfaceC3227k
    public void xwq3(InterfaceC3239x.toq toqVar, String str, String str2) {
        ((toq) C3844k.f7l8(this.f63218y9n.get(str))).m11334h();
    }
}
