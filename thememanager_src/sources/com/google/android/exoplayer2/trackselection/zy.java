package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy implements InterfaceC3715s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final xwq3[] f66067f7l8;

    /* JADX INFO: renamed from: g */
    private final int f22344g;

    /* JADX INFO: renamed from: n */
    protected final int[] f22345n;

    /* JADX INFO: renamed from: q */
    protected final int f22346q;

    /* JADX INFO: renamed from: s */
    private int f22347s;

    /* JADX INFO: renamed from: y */
    private final long[] f22348y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final C3564a f66068zy;

    public zy(C3564a c3564a, int... iArr) {
        this(c3564a, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int fu4(xwq3 xwq3Var, xwq3 xwq3Var2) {
        return xwq3Var2.f23672h - xwq3Var.f23672h;
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final int cdj(xwq3 xwq3Var) {
        for (int i2 = 0; i2 < this.f22346q; i2++) {
            if (this.f66067f7l8[i2] == xwq3Var) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zy zyVar = (zy) obj;
        return this.f66068zy == zyVar.f66068zy && Arrays.equals(this.f22345n, zyVar.f22345n);
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final xwq3 f7l8(int i2) {
        return this.f66067f7l8[i2];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: h */
    public int mo13134h(long j2, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f22347s == 0) {
            this.f22347s = (System.identityHashCode(this.f66068zy) * 31) + Arrays.hashCode(this.f22345n);
        }
        return this.f22347s;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: i */
    public final xwq3 mo13151i() {
        return this.f66067f7l8[mo12414k()];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public void kja0() {
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final int length() {
        return this.f22345n.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: n */
    public boolean mo13152n(int i2, long j2) {
        return this.f22348y[i2] > j2;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: q */
    public void mo13135q() {
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final C3564a qrj() {
        return this.f66068zy;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: s */
    public void mo13136s(float f2) {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public final int t8r() {
        return this.f22345n[mo12414k()];
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final int toq() {
        return this.f22344g;
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    public final int x2(int i2) {
        for (int i3 = 0; i3 < this.f22346q; i3++) {
            if (this.f22345n[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.n7h
    /* JADX INFO: renamed from: y */
    public final int mo13148y(int i2) {
        return this.f22345n[i2];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public boolean zy(int i2, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo13152n = mo13152n(i2, jElapsedRealtime);
        int i3 = 0;
        while (i3 < this.f22346q && !zMo13152n) {
            zMo13152n = (i3 == i2 || mo13152n(i3, jElapsedRealtime)) ? false : true;
            i3++;
        }
        if (!zMo13152n) {
            return false;
        }
        long[] jArr = this.f22348y;
        jArr[i2] = Math.max(jArr[i2], lrht.toq(jElapsedRealtime, j2, Long.MAX_VALUE));
        return true;
    }

    public zy(C3564a c3564a, int[] iArr, int i2) {
        int i3 = 0;
        C3844k.m13633s(iArr.length > 0);
        this.f22344g = i2;
        this.f66068zy = (C3564a) C3844k.f7l8(c3564a);
        int length = iArr.length;
        this.f22346q = length;
        this.f66067f7l8 = new xwq3[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f66067f7l8[i4] = c3564a.toq(iArr[i4]);
        }
        Arrays.sort(this.f66067f7l8, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.toq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zy.fu4((xwq3) obj, (xwq3) obj2);
            }
        });
        this.f22345n = new int[this.f22346q];
        while (true) {
            int i5 = this.f22346q;
            if (i3 >= i5) {
                this.f22348y = new long[i5];
                return;
            } else {
                this.f22345n[i3] = c3564a.zy(this.f66067f7l8[i3]);
                i3++;
            }
        }
    }
}
