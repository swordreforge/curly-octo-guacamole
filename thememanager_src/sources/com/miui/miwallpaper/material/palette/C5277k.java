package com.miui.miwallpaper.material.palette;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.C0541p;
import com.miui.miwallpaper.material.palette.toq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.k */
/* JADX INFO: compiled from: ColorCutQuantizer.java */
/* JADX INFO: loaded from: classes3.dex */
final class C5277k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72152f7l8 = "ColorCutQuantizer";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final int f72153ld6 = -1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final Comparator<toq> f72154n7h = new k();

    /* JADX INFO: renamed from: p */
    static final int f29509p = -2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f72155qrj = 31;

    /* JADX INFO: renamed from: s */
    static final int f29510s = -3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f72156x2 = 5;

    /* JADX INFO: renamed from: y */
    private static final boolean f29511y = false;

    /* JADX INFO: renamed from: k */
    final int[] f29513k;

    /* JADX INFO: renamed from: n */
    final toq.zy[] f29514n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final int[] f72157toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final List<toq.C5279n> f72158zy;

    /* JADX INFO: renamed from: g */
    private final float[] f29512g = new float[3];

    /* JADX INFO: renamed from: q */
    final TimingLogger f29515q = null;

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.k$k */
    /* JADX INFO: compiled from: ColorCutQuantizer.java */
    class k implements Comparator<toq> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(toq toqVar, toq toqVar2) {
            return toqVar2.f7l8() - toqVar.f7l8();
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.k$toq */
    /* JADX INFO: compiled from: ColorCutQuantizer.java */
    private class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f72159f7l8;

        /* JADX INFO: renamed from: g */
        private int f29516g;

        /* JADX INFO: renamed from: k */
        private int f29517k;

        /* JADX INFO: renamed from: n */
        private int f29518n;

        /* JADX INFO: renamed from: q */
        private int f29520q;

        /* JADX INFO: renamed from: s */
        private int f29521s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f72160toq;

        /* JADX INFO: renamed from: y */
        private int f29522y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f72161zy;

        toq(int i2, int i3) {
            this.f29517k = i2;
            this.f72160toq = i3;
            zy();
        }

        final int f7l8() {
            return ((this.f29518n - this.f29520q) + 1) * ((this.f72159f7l8 - this.f29516g) + 1) * ((this.f29521s - this.f29522y) + 1);
        }

        /* JADX INFO: renamed from: g */
        final int m17907g() {
            int i2 = this.f29518n - this.f29520q;
            int i3 = this.f72159f7l8 - this.f29516g;
            int i4 = this.f29521s - this.f29522y;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        /* JADX INFO: renamed from: k */
        final boolean m17908k() {
            return m17909n() > 1;
        }

        /* JADX INFO: renamed from: n */
        final int m17909n() {
            return (this.f72160toq + 1) - this.f29517k;
        }

        /* JADX INFO: renamed from: q */
        final toq.C5279n m17910q() {
            C5277k c5277k = C5277k.this;
            int[] iArr = c5277k.f29513k;
            int[] iArr2 = c5277k.f72157toq;
            int iLd6 = 0;
            int i2 = 0;
            int iM17902p = 0;
            int iM17903s = 0;
            for (int i3 = this.f29517k; i3 <= this.f72160toq; i3++) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                i2 += i5;
                iLd6 += C5277k.ld6(i4) * i5;
                iM17902p += C5277k.m17902p(i4) * i5;
                iM17903s += i5 * C5277k.m17903s(i4);
            }
            float f2 = i2;
            return new toq.C5279n(C5277k.toq(Math.round(iLd6 / f2), Math.round(iM17902p / f2), Math.round(iM17903s / f2)), i2);
        }

        final int toq() {
            int iM17907g = m17907g();
            C5277k c5277k = C5277k.this;
            int[] iArr = c5277k.f29513k;
            int[] iArr2 = c5277k.f72157toq;
            C5277k.m17901n(iArr, iM17907g, this.f29517k, this.f72160toq);
            Arrays.sort(iArr, this.f29517k, this.f72160toq + 1);
            C5277k.m17901n(iArr, iM17907g, this.f29517k, this.f72160toq);
            int i2 = this.f72161zy / 2;
            int i3 = this.f29517k;
            int i4 = 0;
            while (true) {
                int i5 = this.f72160toq;
                if (i3 > i5) {
                    return this.f29517k;
                }
                i4 += iArr2[iArr[i3]];
                if (i4 >= i2) {
                    return Math.min(i5 - 1, i3);
                }
                i3++;
            }
        }

        /* JADX INFO: renamed from: y */
        final toq m17911y() {
            if (!m17908k()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int qVar = toq();
            toq toqVar = C5277k.this.new toq(qVar + 1, this.f72160toq);
            this.f72160toq = qVar;
            zy();
            return toqVar;
        }

        final void zy() {
            C5277k c5277k = C5277k.this;
            int[] iArr = c5277k.f29513k;
            int[] iArr2 = c5277k.f72157toq;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = this.f29517k; i9 <= this.f72160toq; i9++) {
                int i10 = iArr[i9];
                i6 += iArr2[i10];
                int iLd6 = C5277k.ld6(i10);
                int iM17902p = C5277k.m17902p(i10);
                int iM17903s = C5277k.m17903s(i10);
                if (iLd6 > i3) {
                    i3 = iLd6;
                }
                if (iLd6 < i2) {
                    i2 = iLd6;
                }
                if (iM17902p > i4) {
                    i4 = iM17902p;
                }
                if (iM17902p < i7) {
                    i7 = iM17902p;
                }
                if (iM17903s > i5) {
                    i5 = iM17903s;
                }
                if (iM17903s < i8) {
                    i8 = iM17903s;
                }
            }
            this.f29520q = i2;
            this.f29518n = i3;
            this.f29516g = i7;
            this.f72159f7l8 = i4;
            this.f29522y = i8;
            this.f29521s = i5;
            this.f72161zy = i6;
        }
    }

    C5277k(int[] iArr, int i2, toq.zy[] zyVarArr) {
        this.f29514n = zyVarArr;
        int[] iArr2 = new int[32768];
        this.f72157toq = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int iF7l8 = f7l8(iArr[i3]);
            iArr[i3] = iF7l8;
            iArr2[iF7l8] = iArr2[iF7l8] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0 && x2(i5)) {
                iArr2[i5] = 0;
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f29513k = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > i2) {
            this.f72158zy = m17904y(i2);
            return;
        }
        this.f72158zy = new ArrayList();
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = iArr3[i8];
            this.f72158zy.add(new toq.C5279n(m17900k(i9), iArr2[i9]));
        }
    }

    private static int f7l8(int i2) {
        return m17899g(Color.blue(i2), 8, 5) | (m17899g(Color.red(i2), 8, 5) << 10) | (m17899g(Color.green(i2), 8, 5) << 5);
    }

    /* JADX INFO: renamed from: g */
    private static int m17899g(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    /* JADX INFO: renamed from: k */
    private static int m17900k(int i2) {
        return toq(ld6(i2), m17902p(i2), m17903s(i2));
    }

    private void kja0(PriorityQueue<toq> priorityQueue, int i2) {
        toq toqVarPoll;
        while (priorityQueue.size() < i2 && (toqVarPoll = priorityQueue.poll()) != null && toqVarPoll.m17908k()) {
            priorityQueue.offer(toqVarPoll.m17911y());
            priorityQueue.offer(toqVarPoll);
        }
    }

    static int ld6(int i2) {
        return (i2 >> 10) & 31;
    }

    /* JADX INFO: renamed from: n */
    static void m17901n(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = m17903s(i5) | (m17902p(i5) << 10) | (ld6(i5) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = ld6(i6) | (m17903s(i6) << 10) | (m17902p(i6) << 5);
            i3++;
        }
    }

    private boolean n7h(toq.C5279n c5279n) {
        return qrj(c5279n.m17927n(), c5279n.zy());
    }

    /* JADX INFO: renamed from: p */
    static int m17902p(int i2) {
        return (i2 >> 5) & 31;
    }

    private boolean qrj(int i2, float[] fArr) {
        toq.zy[] zyVarArr = this.f29514n;
        if (zyVarArr != null && zyVarArr.length > 0) {
            int length = zyVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (!this.f29514n[i3].mo17924k(i2, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    static int m17903s(int i2) {
        return i2 & 31;
    }

    static int toq(int i2, int i3, int i4) {
        return Color.rgb(m17899g(i2, 5, 8), m17899g(i3, 5, 8), m17899g(i4, 5, 8));
    }

    private boolean x2(int i2) {
        int iM17900k = m17900k(i2);
        C0541p.m2535h(iM17900k, this.f29512g);
        return qrj(iM17900k, this.f29512g);
    }

    /* JADX INFO: renamed from: y */
    private List<toq.C5279n> m17904y(int i2) {
        PriorityQueue<toq> priorityQueue = new PriorityQueue<>(i2, f72154n7h);
        priorityQueue.offer(new toq(0, this.f29513k.length - 1));
        kja0(priorityQueue, i2);
        return zy(priorityQueue);
    }

    private List<toq.C5279n> zy(Collection<toq> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<toq> it = collection.iterator();
        while (it.hasNext()) {
            toq.C5279n c5279nM17910q = it.next().m17910q();
            if (!n7h(c5279nM17910q)) {
                arrayList.add(c5279nM17910q);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    List<toq.C5279n> m17905q() {
        return this.f72158zy;
    }
}
