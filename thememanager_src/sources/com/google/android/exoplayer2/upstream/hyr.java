package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.hyr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes2.dex */
public class hyr {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f66851ld6 = 0;

    /* JADX INFO: renamed from: p */
    private static final int f23014p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f66852qrj = 5;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f66853x2 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f66854f7l8;

    /* JADX INFO: renamed from: g */
    private int f23017g;

    /* JADX INFO: renamed from: k */
    private final int f23018k;

    /* JADX INFO: renamed from: n */
    private int f23019n;

    /* JADX INFO: renamed from: y */
    private static final Comparator<toq> f23016y = new Comparator() { // from class: com.google.android.exoplayer2.upstream.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return hyr.f7l8((hyr.toq) obj, (hyr.toq) obj2);
        }
    };

    /* JADX INFO: renamed from: s */
    private static final Comparator<toq> f23015s = new Comparator() { // from class: com.google.android.exoplayer2.upstream.n5r1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return hyr.m13468y((hyr.toq) obj, (hyr.toq) obj2);
        }
    };

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq[] f66856zy = new toq[5];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<toq> f66855toq = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private int f23020q = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SlidingPercentile.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        public int f23021k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f66857toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public float f66858zy;

        private toq() {
        }
    }

    public hyr(int i2) {
        this.f23018k = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f7l8(toq toqVar, toq toqVar2) {
        return toqVar.f23021k - toqVar2.f23021k;
    }

    /* JADX INFO: renamed from: n */
    private void m13466n() {
        if (this.f23020q != 0) {
            Collections.sort(this.f66855toq, f23015s);
            this.f23020q = 0;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m13467q() {
        if (this.f23020q != 1) {
            Collections.sort(this.f66855toq, f23016y);
            this.f23020q = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m13468y(toq toqVar, toq toqVar2) {
        return Float.compare(toqVar.f66858zy, toqVar2.f66858zy);
    }

    /* JADX INFO: renamed from: g */
    public float m13469g(float f2) {
        m13466n();
        float f3 = f2 * this.f23017g;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f66855toq.size(); i3++) {
            toq toqVar = this.f66855toq.get(i3);
            i2 += toqVar.f66857toq;
            if (i2 >= f3) {
                return toqVar.f66858zy;
            }
        }
        if (this.f66855toq.isEmpty()) {
            return Float.NaN;
        }
        return this.f66855toq.get(r5.size() - 1).f66858zy;
    }

    /* JADX INFO: renamed from: s */
    public void m13470s() {
        this.f66855toq.clear();
        this.f23020q = -1;
        this.f23019n = 0;
        this.f23017g = 0;
    }

    public void zy(int i2, float f2) {
        toq toqVar;
        m13467q();
        int i3 = this.f66854f7l8;
        if (i3 > 0) {
            toq[] toqVarArr = this.f66856zy;
            int i4 = i3 - 1;
            this.f66854f7l8 = i4;
            toqVar = toqVarArr[i4];
        } else {
            toqVar = new toq();
        }
        int i5 = this.f23019n;
        this.f23019n = i5 + 1;
        toqVar.f23021k = i5;
        toqVar.f66857toq = i2;
        toqVar.f66858zy = f2;
        this.f66855toq.add(toqVar);
        this.f23017g += i2;
        while (true) {
            int i6 = this.f23017g;
            int i7 = this.f23018k;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            toq toqVar2 = this.f66855toq.get(0);
            int i9 = toqVar2.f66857toq;
            if (i9 <= i8) {
                this.f23017g -= i9;
                this.f66855toq.remove(0);
                int i10 = this.f66854f7l8;
                if (i10 < 5) {
                    toq[] toqVarArr2 = this.f66856zy;
                    this.f66854f7l8 = i10 + 1;
                    toqVarArr2[i10] = toqVar2;
                }
            } else {
                toqVar2.f66857toq = i9 - i8;
                this.f23017g -= i8;
            }
        }
    }
}
