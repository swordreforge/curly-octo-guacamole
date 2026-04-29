package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.h7am;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.trackselection.C3707i;
import com.google.android.exoplayer2.trackselection.C3708k;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.trackselection.cdj;
import com.google.android.exoplayer2.trackselection.ld6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.kx3;
import com.google.common.collect.oc;
import com.google.common.collect.se;
import com.google.common.primitives.C4746s;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g */
/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3705g extends ld6 {

    /* JADX INFO: renamed from: g */
    private static final float f22233g = 0.98f;

    /* JADX INFO: renamed from: n */
    private final AtomicReference<q> f22236n;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3715s.toq f22237q;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f66000f7l8 = new int[0];

    /* JADX INFO: renamed from: y */
    private static final kx3<Integer> f22235y = kx3.from(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C3705g.oc((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: s */
    private static final kx3<Integer> f22234s = kx3.from(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C3705g.eqxt((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$f7l8 */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    protected static final class f7l8 implements Comparable<f7l8> {

        /* JADX INFO: renamed from: g */
        private final boolean f22238g;

        /* JADX INFO: renamed from: h */
        private final int f22239h;

        /* JADX INFO: renamed from: i */
        private final boolean f22240i;

        /* JADX INFO: renamed from: k */
        public final boolean f22241k;

        /* JADX INFO: renamed from: n */
        private final boolean f22242n;

        /* JADX INFO: renamed from: p */
        private final int f22243p;

        /* JADX INFO: renamed from: q */
        private final boolean f22244q;

        /* JADX INFO: renamed from: s */
        private final int f22245s;

        /* JADX INFO: renamed from: y */
        private final int f22246y;

        public f7l8(xwq3 xwq3Var, q qVar, int i2, @dd String str) {
            int iO1t;
            boolean z2 = false;
            this.f22244q = C3705g.jp0y(i2, false);
            int i3 = xwq3Var.f23671g & (~qVar.bd);
            this.f22242n = (i3 & 1) != 0;
            this.f22238g = (i3 & 2) != 0;
            int i4 = Integer.MAX_VALUE;
            se<String> seVarOf = qVar.f22296o.isEmpty() ? se.of("") : qVar.f22296o;
            int i5 = 0;
            while (true) {
                if (i5 >= seVarOf.size()) {
                    iO1t = 0;
                    break;
                }
                iO1t = C3705g.o1t(xwq3Var, seVarOf.get(i5), qVar.f22284b);
                if (iO1t > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f22246y = i4;
            this.f22245s = iO1t;
            int iBitCount = Integer.bitCount(xwq3Var.f23689y & qVar.f22294m);
            this.f22243p = iBitCount;
            this.f22240i = (xwq3Var.f23689y & 1088) != 0;
            int iO1t2 = C3705g.o1t(xwq3Var, str, C3705g.m13086r(str) == null);
            this.f22239h = iO1t2;
            if (iO1t > 0 || ((qVar.f22296o.isEmpty() && iBitCount > 0) || this.f22242n || (this.f22238g && iO1t2 > 0))) {
                z2 = true;
            }
            this.f22241k = z2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(f7l8 f7l8Var) {
            oc ocVarMo15923g = oc.n7h().ld6(this.f22244q, f7l8Var.f22244q).mo15925p(Integer.valueOf(this.f22246y), Integer.valueOf(f7l8Var.f22246y), kx3.natural().reverse()).mo15923g(this.f22245s, f7l8Var.f22245s).mo15923g(this.f22243p, f7l8Var.f22243p).ld6(this.f22242n, f7l8Var.f22242n).mo15925p(Boolean.valueOf(this.f22238g), Boolean.valueOf(f7l8Var.f22238g), this.f22245s == 0 ? kx3.natural() : kx3.natural().reverse()).mo15923g(this.f22239h, f7l8Var.f22239h);
            if (this.f22243p == 0) {
                ocVarMo15923g = ocVarMo15923g.x2(this.f22240i, f7l8Var.f22240i);
            }
            return ocVarMo15923g.qrj();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$g */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class g implements InterfaceC3555s {

        /* JADX INFO: renamed from: h */
        public static final InterfaceC3555s.k<g> f22247h = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.trackselection.y
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return C3705g.g.m13096q(bundle);
            }
        };

        /* JADX INFO: renamed from: p */
        private static final int f22248p = 2;

        /* JADX INFO: renamed from: s */
        private static final int f22249s = 1;

        /* JADX INFO: renamed from: y */
        private static final int f22250y = 0;

        /* JADX INFO: renamed from: g */
        public final int f22251g;

        /* JADX INFO: renamed from: k */
        public final int f22252k;

        /* JADX INFO: renamed from: n */
        public final int f22253n;

        /* JADX INFO: renamed from: q */
        public final int[] f22254q;

        public g(int i2, int... iArr) {
            this(i2, iArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ g m13096q(Bundle bundle) {
            boolean z2 = false;
            int i2 = bundle.getInt(zy(0), -1);
            int[] intArray = bundle.getIntArray(zy(1));
            int i3 = bundle.getInt(zy(2), -1);
            if (i2 >= 0 && i3 >= 0) {
                z2 = true;
            }
            C3844k.m13629k(z2);
            C3844k.f7l8(intArray);
            return new g(i2, intArray, i3);
        }

        private static String zy(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return this.f22252k == gVar.f22252k && Arrays.equals(this.f22254q, gVar.f22254q) && this.f22251g == gVar.f22251g;
        }

        public int hashCode() {
            return (((this.f22252k * 31) + Arrays.hashCode(this.f22254q)) * 31) + this.f22251g;
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(zy(0), this.f22252k);
            bundle.putIntArray(zy(1), this.f22254q);
            bundle.putInt(zy(2), this.f22251g);
            return bundle;
        }

        public boolean toq(int i2) {
            for (int i3 : this.f22254q) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public g(int i2, int[] iArr, int i3) {
            this.f22252k = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f22254q = iArrCopyOf;
            this.f22253n = iArr.length;
            this.f22251g = i3;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$q */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class q extends C3707i implements InterfaceC3555s {

        @Deprecated
        public static final q cw14;
        private static final int d1cy = 1004;
        private static final int ei = 1007;
        public static final q hp;
        private static final int ls9 = 1014;
        private static final int ndjo = 1003;
        private static final int q7k9 = 1002;
        public static final InterfaceC3555s.k<q> qns;
        private static final int th6 = 1001;
        private static final int ut = 1012;
        private static final int wh6 = 1013;
        private static final int wra = 1008;
        private static final int xhv = 1010;
        private static final int xqx = 1005;
        private static final int xy8 = 1000;
        private static final int zm = 1011;
        private static final int zr5t = 1006;
        private static final int zsl = 1009;
        public final int bd;
        public final boolean dy;
        public final boolean k6e;
        private final SparseBooleanArray mjvl;
        private final SparseArray<Map<C3629x, g>> s8y;
        public final boolean sk1t;
        public final boolean tgs;
        public final boolean tlhn;
        public final boolean vb6;
        public final boolean w97r;
        public final boolean xk5;
        public final boolean yl25;
        public final boolean zmmu;

        static {
            q qVarMo13111z = new n().mo13111z();
            hp = qVarMo13111z;
            cw14 = qVarMo13111z;
            qns = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.trackselection.f7l8
                @Override // com.google.android.exoplayer2.InterfaceC3555s.k
                /* JADX INFO: renamed from: k */
                public final InterfaceC3555s mo11492k(Bundle bundle) {
                    return C3705g.q.m13113i(bundle);
                }
            };
        }

        private static void fn3e(Bundle bundle, SparseArray<Map<C3629x, g>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                for (Map.Entry<C3629x, g> entry : sparseArray.valueAt(i2).entrySet()) {
                    g value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(m13114n(1011), C4746s.m16720t(arrayList));
                bundle.putParcelableArrayList(m13114n(1012), C3853q.f7l8(arrayList2));
                bundle.putSparseParcelableArray(m13114n(1013), C3853q.m13721s(sparseArray2));
            }
        }

        /* JADX INFO: renamed from: h */
        private static int[] m13112h(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                iArr[i2] = sparseBooleanArray.keyAt(i2);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ q m13113i(Bundle bundle) {
            return new n(bundle).mo13111z();
        }

        public static q kja0(Context context) {
            return new n(context).mo13111z();
        }

        private static boolean ld6(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static String m13114n(int i2) {
            return Integer.toString(i2, 36);
        }

        private static boolean qrj(Map<C3629x, g> map, Map<C3629x, g> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C3629x, g> entry : map.entrySet()) {
                C3629x key = entry.getKey();
                if (!map2.containsKey(key) || !lrht.zy(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean x2(SparseArray<Map<C3629x, g>> sparseArray, SparseArray<Map<C3629x, g>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !qrj(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean cdj(int i2) {
            return this.mjvl.get(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i
        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || q.class != obj.getClass()) {
                return false;
            }
            q qVar = (q) obj;
            return super.equals(qVar) && this.tlhn == qVar.tlhn && this.w97r == qVar.w97r && this.tgs == qVar.tgs && this.yl25 == qVar.yl25 && this.zmmu == qVar.zmmu && this.sk1t == qVar.sk1t && this.dy == qVar.dy && this.bd == qVar.bd && this.vb6 == qVar.vb6 && this.k6e == qVar.k6e && this.xk5 == qVar.xk5 && ld6(this.mjvl, qVar.mjvl) && x2(this.s8y, qVar.s8y);
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.tlhn ? 1 : 0)) * 31) + (this.w97r ? 1 : 0)) * 31) + (this.tgs ? 1 : 0)) * 31) + (this.yl25 ? 1 : 0)) * 31) + (this.zmmu ? 1 : 0)) * 31) + (this.sk1t ? 1 : 0)) * 31) + (this.dy ? 1 : 0)) * 31) + this.bd) * 31) + (this.vb6 ? 1 : 0)) * 31) + (this.k6e ? 1 : 0)) * 31) + (this.xk5 ? 1 : 0);
        }

        @Deprecated
        @dd
        public final g ki(int i2, C3629x c3629x) {
            Map<C3629x, g> map = this.s8y.get(i2);
            if (map != null) {
                return map.get(c3629x);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public n zy() {
            return new n(this);
        }

        @Deprecated
        public final boolean t8r(int i2, C3629x c3629x) {
            Map<C3629x, g> map = this.s8y.get(i2);
            return map != null && map.containsKey(c3629x);
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i, com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(m13114n(1000), this.tlhn);
            bundle.putBoolean(m13114n(1001), this.w97r);
            bundle.putBoolean(m13114n(1002), this.tgs);
            bundle.putBoolean(m13114n(1003), this.yl25);
            bundle.putBoolean(m13114n(1004), this.zmmu);
            bundle.putBoolean(m13114n(1005), this.sk1t);
            bundle.putBoolean(m13114n(1006), this.dy);
            bundle.putInt(m13114n(1007), this.bd);
            bundle.putBoolean(m13114n(1008), this.vb6);
            bundle.putBoolean(m13114n(1009), this.k6e);
            bundle.putBoolean(m13114n(1010), this.xk5);
            fn3e(bundle, this.s8y);
            bundle.putIntArray(m13114n(1014), m13112h(this.mjvl));
            return bundle;
        }

        private q(n nVar) {
            super(nVar);
            this.tlhn = nVar.f22256z;
            this.w97r = nVar.f66009o1t;
            this.tgs = nVar.f66011wvg;
            this.yl25 = nVar.f22255t;
            this.zmmu = nVar.f66008mcp;
            this.sk1t = nVar.f66006jk;
            this.dy = nVar.f66001a9;
            this.bd = nVar.f66004fti;
            this.vb6 = nVar.f66007jp0y;
            this.k6e = nVar.f66005gvn7;
            this.xk5 = nVar.f66002d3;
            this.s8y = nVar.f66010oc;
            this.mjvl = nVar.f66003eqxt;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$toq */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    protected static final class toq implements Comparable<toq> {

        /* JADX INFO: renamed from: f */
        private final int f22257f;

        /* JADX INFO: renamed from: g */
        private final boolean f22258g;

        /* JADX INFO: renamed from: h */
        private final int f22259h;

        /* JADX INFO: renamed from: i */
        private final int f22260i;

        /* JADX INFO: renamed from: k */
        public final boolean f22261k;

        /* JADX INFO: renamed from: l */
        private final int f22262l;

        /* JADX INFO: renamed from: n */
        private final q f22263n;

        /* JADX INFO: renamed from: p */
        private final int f22264p;

        /* JADX INFO: renamed from: q */
        @dd
        private final String f22265q;

        /* JADX INFO: renamed from: r */
        private final int f22266r;

        /* JADX INFO: renamed from: s */
        private final int f22267s;

        /* JADX INFO: renamed from: t */
        private final int f22268t;

        /* JADX INFO: renamed from: y */
        private final int f22269y;

        /* JADX INFO: renamed from: z */
        private final boolean f22270z;

        public toq(xwq3 xwq3Var, q qVar, int i2) {
            int i3;
            int iO1t;
            int iO1t2;
            this.f22263n = qVar;
            this.f22265q = C3705g.m13086r(xwq3Var.f23678n);
            int i4 = 0;
            this.f22258g = C3705g.jp0y(i2, false);
            int i5 = 0;
            while (true) {
                i3 = Integer.MAX_VALUE;
                if (i5 >= qVar.f22293l.size()) {
                    iO1t = 0;
                    i5 = Integer.MAX_VALUE;
                    break;
                } else {
                    iO1t = C3705g.o1t(xwq3Var, qVar.f22293l.get(i5), false);
                    if (iO1t > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f22267s = i5;
            this.f22269y = iO1t;
            this.f22264p = Integer.bitCount(xwq3Var.f23689y & qVar.f22287f);
            boolean z2 = true;
            this.f22270z = (xwq3Var.f23671g & 1) != 0;
            int i6 = xwq3Var.f23686v;
            this.f22268t = i6;
            this.f22266r = xwq3Var.f23668d;
            int i7 = xwq3Var.f23672h;
            this.f22262l = i7;
            if ((i7 != -1 && i7 > qVar.f22286e) || (i6 != -1 && i6 > qVar.f22285c)) {
                z2 = false;
            }
            this.f22261k = z2;
            String[] strArrT8iq = lrht.t8iq();
            int i8 = 0;
            while (true) {
                if (i8 >= strArrT8iq.length) {
                    iO1t2 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iO1t2 = C3705g.o1t(xwq3Var, strArrT8iq[i8], false);
                    if (iO1t2 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f22259h = i8;
            this.f22260i = iO1t2;
            while (true) {
                if (i4 < qVar.f22291j.size()) {
                    String str = xwq3Var.f23682r;
                    if (str != null && str.equals(qVar.f22291j.get(i4))) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            this.f22257f = i3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(toq toqVar) {
            kx3 kx3VarReverse = (this.f22261k && this.f22258g) ? C3705g.f22235y : C3705g.f22235y.reverse();
            oc ocVarMo15925p = oc.n7h().ld6(this.f22258g, toqVar.f22258g).mo15925p(Integer.valueOf(this.f22267s), Integer.valueOf(toqVar.f22267s), kx3.natural().reverse()).mo15923g(this.f22269y, toqVar.f22269y).mo15923g(this.f22264p, toqVar.f22264p).ld6(this.f22261k, toqVar.f22261k).mo15925p(Integer.valueOf(this.f22257f), Integer.valueOf(toqVar.f22257f), kx3.natural().reverse()).mo15925p(Integer.valueOf(this.f22262l), Integer.valueOf(toqVar.f22262l), this.f22263n.f22283a ? C3705g.f22235y.reverse() : C3705g.f22234s).ld6(this.f22270z, toqVar.f22270z).mo15925p(Integer.valueOf(this.f22259h), Integer.valueOf(toqVar.f22259h), kx3.natural().reverse()).mo15923g(this.f22260i, toqVar.f22260i).mo15925p(Integer.valueOf(this.f22268t), Integer.valueOf(toqVar.f22268t), kx3VarReverse).mo15925p(Integer.valueOf(this.f22266r), Integer.valueOf(toqVar.f22266r), kx3VarReverse);
            Integer numValueOf = Integer.valueOf(this.f22262l);
            Integer numValueOf2 = Integer.valueOf(toqVar.f22262l);
            if (!lrht.zy(this.f22265q, toqVar.f22265q)) {
                kx3VarReverse = C3705g.f22234s;
            }
            return ocVarMo15925p.mo15925p(numValueOf, numValueOf2, kx3VarReverse).qrj();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$y */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    protected static final class y implements Comparable<y> {

        /* JADX INFO: renamed from: g */
        private final boolean f22271g;

        /* JADX INFO: renamed from: k */
        public final boolean f22272k;

        /* JADX INFO: renamed from: n */
        private final boolean f22273n;

        /* JADX INFO: renamed from: p */
        private final int f22274p;

        /* JADX INFO: renamed from: q */
        private final q f22275q;

        /* JADX INFO: renamed from: s */
        private final int f22276s;

        /* JADX INFO: renamed from: y */
        private final int f22277y;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public y(com.google.android.exoplayer2.xwq3 r7, com.google.android.exoplayer2.trackselection.C3705g.q r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f22275q = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f23674j
                if (r4 == r3) goto L14
                int r5 = r8.f22292k
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f23679o
                if (r4 == r3) goto L1c
                int r5 = r8.f22298q
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f23677m
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f22295n
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f23672h
                if (r4 == r3) goto L31
                int r5 = r8.f22288g
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f22272k = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f23674j
                if (r10 == r3) goto L40
                int r4 = r8.f22304y
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f23679o
                if (r10 == r3) goto L48
                int r4 = r8.f22300s
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f23677m
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f22297p
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f23672h
                if (r10 == r3) goto L5f
                int r0 = r8.f22289h
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f22273n = r1
                boolean r9 = com.google.android.exoplayer2.trackselection.C3705g.jp0y(r9, r2)
                r6.f22271g = r9
                int r9 = r7.f23672h
                r6.f22277y = r9
                int r9 = r7.zurt()
                r6.f22276s = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L74:
                com.google.common.collect.se<java.lang.String> r10 = r8.f22299r
                int r10 = r10.size()
                if (r2 >= r10) goto L91
                java.lang.String r10 = r7.f23682r
                if (r10 == 0) goto L8e
                com.google.common.collect.se<java.lang.String> r0 = r8.f22299r
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L8e
                r9 = r2
                goto L91
            L8e:
                int r2 = r2 + 1
                goto L74
            L91:
                r6.f22274p = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C3705g.y.<init>(com.google.android.exoplayer2.xwq3, com.google.android.exoplayer2.trackselection.g$q, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(y yVar) {
            kx3 kx3VarReverse = (this.f22272k && this.f22271g) ? C3705g.f22235y : C3705g.f22235y.reverse();
            return oc.n7h().ld6(this.f22271g, yVar.f22271g).ld6(this.f22272k, yVar.f22272k).ld6(this.f22273n, yVar.f22273n).mo15925p(Integer.valueOf(this.f22274p), Integer.valueOf(yVar.f22274p), kx3.natural().reverse()).mo15925p(Integer.valueOf(this.f22277y), Integer.valueOf(yVar.f22277y), this.f22275q.f22283a ? C3705g.f22235y.reverse() : C3705g.f22234s).mo15925p(Integer.valueOf(this.f22276s), Integer.valueOf(yVar.f22276s), kx3VarReverse).mo15925p(Integer.valueOf(this.f22277y), Integer.valueOf(yVar.f22277y), kx3VarReverse).qrj();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$zy */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    protected static final class zy implements Comparable<zy> {

        /* JADX INFO: renamed from: k */
        private final boolean f22278k;

        /* JADX INFO: renamed from: q */
        private final boolean f22279q;

        public zy(xwq3 xwq3Var, int i2) {
            this.f22278k = (xwq3Var.f23671g & 1) != 0;
            this.f22279q = C3705g.jp0y(i2, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(zy zyVar) {
            return oc.n7h().ld6(this.f22279q, zyVar.f22279q).ld6(this.f22278k, zyVar.f22278k).qrj();
        }
    }

    @Deprecated
    public C3705g() {
        this(q.hp, new C3708k.toq());
    }

    private boolean a9(ld6.C3709k c3709k, q qVar, int i2) {
        return qVar.t8r(i2, c3709k.f7l8(i2));
    }

    private static void d2ok(ld6.C3709k c3709k, int[][][] iArr, h7am[] h7amVarArr, InterfaceC3715s[] interfaceC3715sArr) {
        boolean z2;
        boolean z3 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < c3709k.zy(); i4++) {
            int iM13141g = c3709k.m13141g(i4);
            InterfaceC3715s interfaceC3715s = interfaceC3715sArr[i4];
            if ((iM13141g == 1 || iM13141g == 2) && interfaceC3715s != null && dd(iArr[i4], c3709k.f7l8(i4), interfaceC3715s)) {
                if (iM13141g == 1) {
                    if (i3 != -1) {
                        z2 = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z2 = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z2 = true;
        if (i3 != -1 && i2 != -1) {
            z3 = true;
        }
        if (z2 && z3) {
            h7am h7amVar = new h7am(true);
            h7amVarArr[i3] = h7amVar;
            h7amVarArr[i2] = h7amVar;
        }
    }

    private static boolean d3(xwq3 xwq3Var, @dd String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        if ((xwq3Var.f23689y & 16384) != 0 || !jp0y(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !lrht.zy(xwq3Var.f23682r, str)) {
            return false;
        }
        int i13 = xwq3Var.f23674j;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        int i14 = xwq3Var.f23679o;
        if (i14 != -1 && (i9 > i14 || i14 > i5)) {
            return false;
        }
        float f2 = xwq3Var.f23677m;
        return (f2 == -1.0f || (((float) i10) <= f2 && f2 <= ((float) i6))) && (i12 = xwq3Var.f23672h) != -1 && i11 <= i12 && i12 <= i7;
    }

    private static boolean dd(int[][] iArr, C3629x c3629x, InterfaceC3715s interfaceC3715s) {
        if (interfaceC3715s == null) {
            return false;
        }
        int iZy = c3629x.zy(interfaceC3715s.qrj());
        for (int i2 = 0; i2 < interfaceC3715s.length(); i2++) {
            if (cv06.toq(iArr[iZy][interfaceC3715s.mo13148y(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int eqxt(Integer num, Integer num2) {
        return 0;
    }

    private static void fn3e(C3564a c3564a, int[] iArr, int i2, @dd String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!d3(c3564a.toq(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                list.remove(size);
            }
        }
    }

    private boolean fti(ld6.C3709k c3709k, q qVar, int i2) {
        return qVar.cdj(i2) || qVar.f66013bo.contains(Integer.valueOf(c3709k.m13141g(i2)));
    }

    private static int[] fu4(C3564a c3564a, int[] iArr, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z3) {
        String str;
        int i13;
        int i14;
        HashSet hashSet;
        if (c3564a.f21222k < 2) {
            return f66000f7l8;
        }
        List<Integer> listJk = jk(c3564a, i11, i12, z3);
        if (listJk.size() < 2) {
            return f66000f7l8;
        }
        if (z2) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i15 = 0;
            int i16 = 0;
            while (i16 < listJk.size()) {
                String str3 = c3564a.toq(listJk.get(i16).intValue()).f23682r;
                if (hashSet2.add(str3)) {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                    int iNi7 = ni7(c3564a, iArr, i2, str3, i3, i4, i5, i6, i7, i8, i9, i10, listJk);
                    if (iNi7 > i13) {
                        i15 = iNi7;
                        str2 = str3;
                    }
                    i16 = i14 + 1;
                    hashSet2 = hashSet;
                } else {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                }
                i15 = i13;
                i16 = i14 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        fn3e(c3564a, iArr, i2, str, i3, i4, i5, i6, i7, i8, i9, i10, listJk);
        return listJk.size() < 2 ? f66000f7l8 : C4746s.m16720t(listJk);
    }

    private static boolean gvn7(xwq3 xwq3Var, int i2, xwq3 xwq3Var2, int i3, boolean z2, boolean z3, boolean z5) {
        int i4;
        int i5;
        String str;
        int i6;
        if (!jp0y(i2, false) || (i4 = xwq3Var.f23672h) == -1 || i4 > i3) {
            return false;
        }
        if (!z5 && ((i6 = xwq3Var.f23686v) == -1 || i6 != xwq3Var2.f23686v)) {
            return false;
        }
        if (z2 || ((str = xwq3Var.f23682r) != null && TextUtils.equals(str, xwq3Var2.f23682r))) {
            return z3 || ((i5 = xwq3Var.f23668d) != -1 && i5 == xwq3Var2.f23668d);
        }
        return false;
    }

    private static List<Integer> jk(C3564a c3564a, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList = new ArrayList(c3564a.f21222k);
        for (int i5 = 0; i5 < c3564a.f21222k; i5++) {
            arrayList.add(Integer.valueOf(i5));
        }
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < c3564a.f21222k; i7++) {
                xwq3 qVar = c3564a.toq(i7);
                int i8 = qVar.f23674j;
                if (i8 > 0 && (i4 = qVar.f23679o) > 0) {
                    Point pointM13087t = m13087t(z2, i2, i3, i8, i4);
                    int i9 = qVar.f23674j;
                    int i10 = qVar.f23679o;
                    int i11 = i9 * i10;
                    if (i9 >= ((int) (pointM13087t.x * f22233g)) && i10 >= ((int) (pointM13087t.y * f22233g)) && i11 < i6) {
                        i6 = i11;
                    }
                }
            }
            if (i6 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iZurt = c3564a.toq(((Integer) arrayList.get(size)).intValue()).zurt();
                    if (iZurt == -1 || iZurt > i6) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean jp0y(int i2, boolean z2) {
        int iWvg = cv06.wvg(i2);
        return iWvg == 4 || (z2 && iWvg == 3);
    }

    private void lvui(SparseArray<Pair<cdj.zy, Integer>> sparseArray, @dd cdj.zy zyVar, int i2) {
        if (zyVar == null) {
            return;
        }
        int qVar = zyVar.toq();
        Pair<cdj.zy, Integer> pair = sparseArray.get(qVar);
        if (pair == null || ((cdj.zy) pair.first).f22232q.isEmpty()) {
            sparseArray.put(qVar, Pair.create(zyVar, Integer.valueOf(i2)));
        }
    }

    @dd
    private static InterfaceC3715s.k n5r1(C3629x c3629x, int[][] iArr, q qVar) {
        int i2 = -1;
        C3564a c3564a = null;
        y yVar = null;
        for (int i3 = 0; i3 < c3629x.f21701k; i3++) {
            C3564a qVar2 = c3629x.toq(i3);
            List<Integer> listJk = jk(qVar2, qVar.f22290i, qVar.f22305z, qVar.f22301t);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < qVar2.f21222k; i4++) {
                xwq3 qVar3 = qVar2.toq(i4);
                if ((qVar3.f23689y & 16384) == 0 && jp0y(iArr2[i4], qVar.vb6)) {
                    y yVar2 = new y(qVar3, qVar, iArr2[i4], listJk.contains(Integer.valueOf(i4)));
                    if ((yVar2.f22272k || qVar.tlhn) && (yVar == null || yVar2.compareTo(yVar) > 0)) {
                        c3564a = qVar2;
                        i2 = i4;
                        yVar = yVar2;
                    }
                }
            }
        }
        if (c3564a == null) {
            return null;
        }
        return new InterfaceC3715s.k(c3564a, i2);
    }

    private static int ni7(C3564a c3564a, int[] iArr, int i2, @dd String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List<Integer> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue = list.get(i12).intValue();
            if (d3(c3564a.toq(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                i11++;
            }
        }
        return i11;
    }

    protected static int o1t(xwq3 xwq3Var, @dd String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(xwq3Var.f23678n)) {
            return 4;
        }
        String strM13086r = m13086r(str);
        String strM13086r2 = m13086r(xwq3Var.f23678n);
        if (strM13086r2 == null || strM13086r == null) {
            return (z2 && strM13086r2 == null) ? 1 : 0;
        }
        if (strM13086r2.startsWith(strM13086r) || strM13086r.startsWith(strM13086r2)) {
            return 3;
        }
        return lrht.jbh(strM13086r2, C5658n.f73185t8r)[0].equals(lrht.jbh(strM13086r, C5658n.f73185t8r)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int oc(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @dd
    /* JADX INFO: renamed from: r */
    protected static String m13086r(@dd String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C3548p.f65138bwp)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point m13087t(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.util.lrht.qrj(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.util.lrht.qrj(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C3705g.m13087t(boolean, int, int, int, int):android.graphics.Point");
    }

    private void t8r(ld6.C3709k c3709k, InterfaceC3715s.k[] kVarArr, int i2, cdj.zy zyVar, int i3) {
        for (int i4 = 0; i4 < kVarArr.length; i4++) {
            if (i3 == i4) {
                kVarArr[i4] = new InterfaceC3715s.k(zyVar.f22231k, C4746s.m16720t(zyVar.f22232q));
            } else if (c3709k.m13141g(i4) == i2) {
                kVarArr[i4] = null;
            }
        }
    }

    private void uv6(q qVar) {
        C3844k.f7l8(qVar);
        if (this.f22236n.getAndSet(qVar).equals(qVar)) {
            return;
        }
        m13154q();
    }

    private InterfaceC3715s.k wvg(ld6.C3709k c3709k, q qVar, int i2) {
        C3629x c3629xF7l8 = c3709k.f7l8(i2);
        g gVarKi = qVar.ki(i2, c3629xF7l8);
        if (gVarKi == null) {
            return null;
        }
        return new InterfaceC3715s.k(c3629xF7l8.toq(gVarKi.f22252k), gVarKi.f22254q, gVarKi.f22251g);
    }

    @dd
    private static InterfaceC3715s.k x9kr(C3629x c3629x, int[][] iArr, int i2, q qVar) {
        C3629x c3629x2 = c3629x;
        q qVar2 = qVar;
        int i3 = qVar2.tgs ? 24 : 16;
        boolean z2 = qVar2.w97r && (i2 & i3) != 0;
        int i4 = 0;
        while (i4 < c3629x2.f21701k) {
            C3564a qVar3 = c3629x2.toq(i4);
            int i5 = i4;
            int[] iArrFu4 = fu4(qVar3, iArr[i4], z2, i3, qVar2.f22292k, qVar2.f22298q, qVar2.f22295n, qVar2.f22288g, qVar2.f22304y, qVar2.f22300s, qVar2.f22297p, qVar2.f22289h, qVar2.f22290i, qVar2.f22305z, qVar2.f22301t);
            if (iArrFu4.length > 0) {
                return new InterfaceC3715s.k(qVar3, iArrFu4);
            }
            i4 = i5 + 1;
            c3629x2 = c3629x;
            qVar2 = qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private SparseArray<Pair<cdj.zy, Integer>> m13088z(ld6.C3709k c3709k, q qVar) {
        SparseArray<Pair<cdj.zy, Integer>> sparseArray = new SparseArray<>();
        int iZy = c3709k.zy();
        for (int i2 = 0; i2 < iZy; i2++) {
            C3629x c3629xF7l8 = c3709k.f7l8(i2);
            for (int i3 = 0; i3 < c3629xF7l8.f21701k; i3++) {
                lvui(sparseArray, qVar.f22302u.m13077q(c3629xF7l8.toq(i3)), i2);
            }
        }
        C3629x c3629xM13144p = c3709k.m13144p();
        for (int i4 = 0; i4 < c3629xM13144p.f21701k; i4++) {
            lvui(sparseArray, qVar.f22302u.m13077q(c3629xM13144p.toq(i4)), -1);
        }
        return sparseArray;
    }

    private static int[] zurt(C3564a c3564a, int[] iArr, int i2, int i3, boolean z2, boolean z3, boolean z5) {
        xwq3 qVar = c3564a.toq(i2);
        int[] iArr2 = new int[c3564a.f21222k];
        int i4 = 0;
        for (int i5 = 0; i5 < c3564a.f21222k; i5++) {
            if (i5 == i2 || gvn7(c3564a.toq(i5), iArr[i5], qVar, i3, z2, z3, z5)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    @dd
    /* JADX INFO: renamed from: c */
    protected InterfaceC3715s.k m13089c(C3629x c3629x, int[][] iArr, int i2, q qVar, boolean z2) throws com.google.android.exoplayer2.ki {
        InterfaceC3715s.k kVarX9kr = (qVar.f22303x || qVar.f22283a || !z2) ? null : x9kr(c3629x, iArr, i2, qVar);
        return kVarX9kr == null ? n5r1(c3629x, iArr, qVar) : kVarX9kr;
    }

    @dd
    /* JADX INFO: renamed from: f */
    protected Pair<InterfaceC3715s.k, f7l8> m13090f(C3629x c3629x, int[][] iArr, q qVar, @dd String str) throws com.google.android.exoplayer2.ki {
        int i2 = -1;
        C3564a c3564a = null;
        f7l8 f7l8Var = null;
        for (int i3 = 0; i3 < c3629x.f21701k; i3++) {
            C3564a qVar2 = c3629x.toq(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < qVar2.f21222k; i4++) {
                if (jp0y(iArr2[i4], qVar.vb6)) {
                    f7l8 f7l8Var2 = new f7l8(qVar2.toq(i4), qVar, iArr2[i4], str);
                    if (f7l8Var2.f22241k && (f7l8Var == null || f7l8Var2.compareTo(f7l8Var) > 0)) {
                        c3564a = qVar2;
                        i2 = i4;
                        f7l8Var = f7l8Var2;
                    }
                }
            }
        }
        if (c3564a == null) {
            return null;
        }
        return Pair.create(new InterfaceC3715s.k(c3564a, i2), (f7l8) C3844k.f7l8(f7l8Var));
    }

    @dd
    protected InterfaceC3715s.k hyr(int i2, C3629x c3629x, int[][] iArr, q qVar) throws com.google.android.exoplayer2.ki {
        C3564a c3564a = null;
        zy zyVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < c3629x.f21701k; i4++) {
            C3564a qVar2 = c3629x.toq(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < qVar2.f21222k; i5++) {
                if (jp0y(iArr2[i5], qVar.vb6)) {
                    zy zyVar2 = new zy(qVar2.toq(i5), iArr2[i5]);
                    if (zyVar == null || zyVar2.compareTo(zyVar) > 0) {
                        c3564a = qVar2;
                        i3 = i5;
                        zyVar = zyVar2;
                    }
                }
            }
        }
        if (c3564a == null) {
            return null;
        }
        return new InterfaceC3715s.k(c3564a, i3);
    }

    /* JADX INFO: renamed from: i */
    public n m13091i() {
        return toq().zy();
    }

    @dd
    /* JADX INFO: renamed from: l */
    protected Pair<InterfaceC3715s.k, toq> m13092l(C3629x c3629x, int[][] iArr, int i2, q qVar, boolean z2) throws com.google.android.exoplayer2.ki {
        InterfaceC3715s.k kVar = null;
        toq toqVar = null;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < c3629x.f21701k; i5++) {
            C3564a qVar2 = c3629x.toq(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < qVar2.f21222k; i6++) {
                if (jp0y(iArr2[i6], qVar.vb6)) {
                    toq toqVar2 = new toq(qVar2.toq(i6), qVar, iArr2[i6]);
                    if ((toqVar2.f22261k || qVar.yl25) && (toqVar == null || toqVar2.compareTo(toqVar) > 0)) {
                        i3 = i5;
                        i4 = i6;
                        toqVar = toqVar2;
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        C3564a qVar3 = c3629x.toq(i3);
        if (!qVar.f22303x && !qVar.f22283a && z2) {
            int[] iArrZurt = zurt(qVar3, iArr[i3], i4, qVar.f22286e, qVar.zmmu, qVar.sk1t, qVar.dy);
            if (iArrZurt.length > 1) {
                kVar = new InterfaceC3715s.k(qVar3, iArrZurt);
            }
        }
        if (kVar == null) {
            kVar = new InterfaceC3715s.k(qVar3, i4);
        }
        return Pair.create(kVar, (toq) C3844k.f7l8(toqVar));
    }

    public void lrht(n nVar) {
        uv6(nVar.mo13111z());
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt
    /* JADX INFO: renamed from: mcp, reason: merged with bridge method [inline-methods] */
    public q toq() {
        return this.f22236n.get();
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo13093n() {
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ld6
    protected final Pair<h7am[], InterfaceC3715s[]> n7h(ld6.C3709k c3709k, int[][][] iArr, int[] iArr2, fti.C3596k c3596k, pc pcVar) throws com.google.android.exoplayer2.ki {
        q qVar = this.f22236n.get();
        int iZy = c3709k.zy();
        InterfaceC3715s.k[] kVarArrNcyb = ncyb(c3709k, iArr, iArr2, qVar);
        SparseArray<Pair<cdj.zy, Integer>> sparseArrayM13088z = m13088z(c3709k, qVar);
        for (int i2 = 0; i2 < sparseArrayM13088z.size(); i2++) {
            Pair<cdj.zy, Integer> pairValueAt = sparseArrayM13088z.valueAt(i2);
            t8r(c3709k, kVarArrNcyb, sparseArrayM13088z.keyAt(i2), (cdj.zy) pairValueAt.first, ((Integer) pairValueAt.second).intValue());
        }
        for (int i3 = 0; i3 < iZy; i3++) {
            if (a9(c3709k, qVar, i3)) {
                kVarArrNcyb[i3] = wvg(c3709k, qVar, i3);
            }
        }
        for (int i4 = 0; i4 < iZy; i4++) {
            if (fti(c3709k, qVar, i4)) {
                kVarArrNcyb[i4] = null;
            }
        }
        InterfaceC3715s[] interfaceC3715sArrMo12416k = this.f22237q.mo12416k(kVarArrNcyb, m13153k(), c3596k, pcVar);
        h7am[] h7amVarArr = new h7am[iZy];
        for (int i5 = 0; i5 < iZy; i5++) {
            boolean z2 = true;
            if ((qVar.cdj(i5) || qVar.f66013bo.contains(Integer.valueOf(c3709k.m13141g(i5)))) || (c3709k.m13141g(i5) != -2 && interfaceC3715sArrMo12416k[i5] == null)) {
                z2 = false;
            }
            h7amVarArr[i5] = z2 ? h7am.f64789toq : null;
        }
        if (qVar.k6e) {
            d2ok(c3709k, iArr, h7amVarArr, interfaceC3715sArrMo12416k);
        }
        return Pair.create(h7amVarArr, interfaceC3715sArrMo12416k);
    }

    protected InterfaceC3715s.k[] ncyb(ld6.C3709k c3709k, int[][][] iArr, int[] iArr2, q qVar) throws com.google.android.exoplayer2.ki {
        boolean z2;
        String str;
        int i2;
        toq toqVar;
        String str2;
        int i3;
        int iZy = c3709k.zy();
        InterfaceC3715s.k[] kVarArr = new InterfaceC3715s.k[iZy];
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean z5 = false;
        while (true) {
            if (i5 >= iZy) {
                break;
            }
            if (2 == c3709k.m13141g(i5)) {
                if (!z3) {
                    InterfaceC3715s.k kVarM13089c = m13089c(c3709k.f7l8(i5), iArr[i5], iArr2[i5], qVar, true);
                    kVarArr[i5] = kVarM13089c;
                    z3 = kVarM13089c != null;
                }
                z5 |= c3709k.f7l8(i5).f21701k > 0;
            }
            i5++;
        }
        int i6 = 0;
        int i7 = -1;
        toq toqVar2 = null;
        String str3 = null;
        while (i6 < iZy) {
            if (z2 == c3709k.m13141g(i6)) {
                boolean z6 = (qVar.xk5 || !z5) ? z2 : false;
                i2 = i7;
                toqVar = toqVar2;
                str2 = str3;
                i3 = i6;
                Pair<InterfaceC3715s.k, toq> pairM13092l = m13092l(c3709k.f7l8(i6), iArr[i6], iArr2[i6], qVar, z6);
                if (pairM13092l != null && (toqVar == null || ((toq) pairM13092l.second).compareTo(toqVar) > 0)) {
                    if (i2 != -1) {
                        kVarArr[i2] = null;
                    }
                    InterfaceC3715s.k kVar = (InterfaceC3715s.k) pairM13092l.first;
                    kVarArr[i3] = kVar;
                    str3 = kVar.f22341k.toq(kVar.f66064toq[0]).f23678n;
                    toqVar2 = (toq) pairM13092l.second;
                    i7 = i3;
                }
                i6 = i3 + 1;
                z2 = true;
            } else {
                i2 = i7;
                toqVar = toqVar2;
                str2 = str3;
                i3 = i6;
            }
            i7 = i2;
            toqVar2 = toqVar;
            str3 = str2;
            i6 = i3 + 1;
            z2 = true;
        }
        String str4 = str3;
        int i8 = -1;
        f7l8 f7l8Var = null;
        while (i4 < iZy) {
            int iM13141g = c3709k.m13141g(i4);
            if (iM13141g == 1) {
                str = str4;
            } else if (iM13141g == 2) {
                str = str4;
            } else if (iM13141g != 3) {
                kVarArr[i4] = hyr(iM13141g, c3709k.f7l8(i4), iArr[i4], qVar);
                str = str4;
            } else {
                str = str4;
                Pair<InterfaceC3715s.k, f7l8> pairM13090f = m13090f(c3709k.f7l8(i4), iArr[i4], qVar, str);
                if (pairM13090f != null && (f7l8Var == null || ((f7l8) pairM13090f.second).compareTo(f7l8Var) > 0)) {
                    if (i8 != -1) {
                        kVarArr[i8] = null;
                    }
                    kVarArr[i4] = (InterfaceC3715s.k) pairM13090f.first;
                    f7l8Var = (f7l8) pairM13090f.second;
                    i8 = i4;
                }
            }
            i4++;
            str4 = str;
        }
        return kVarArr;
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt
    /* JADX INFO: renamed from: y */
    public void mo13094y(C3707i c3707i) {
        if (c3707i instanceof q) {
            uv6((q) c3707i);
        }
        uv6(new n(this.f22236n.get()).jk(c3707i).mo13111z());
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.g$n */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class n extends C3707i.k {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private boolean f66001a9;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private boolean f66002d3;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private final SparseBooleanArray f66003eqxt;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private int f66004fti;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private boolean f66005gvn7;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private boolean f66006jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private boolean f66007jp0y;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private boolean f66008mcp;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private boolean f66009o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private final SparseArray<Map<C3629x, g>> f66010oc;

        /* JADX INFO: renamed from: t */
        private boolean f22255t;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private boolean f66011wvg;

        /* JADX INFO: renamed from: z */
        private boolean f22256z;

        private void h7am(Bundle bundle) {
            int[] intArray = bundle.getIntArray(q.m13114n(1011));
            List listZy = C3853q.zy(C3629x.f21699s, bundle.getParcelableArrayList(q.m13114n(1012)), se.of());
            SparseArray sparseArrayM13720q = C3853q.m13720q(g.f22247h, bundle.getSparseParcelableArray(q.m13114n(1013)), new SparseArray());
            if (intArray == null || intArray.length != listZy.size()) {
                return;
            }
            for (int i2 = 0; i2 < intArray.length; i2++) {
                cv06(intArray[i2], (C3629x) listZy.get(i2), (g) sparseArrayM13720q.get(i2));
            }
        }

        private SparseBooleanArray ikck(@dd int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i2 : iArr) {
                sparseBooleanArray.append(i2, true);
            }
            return sparseBooleanArray;
        }

        /* JADX INFO: renamed from: v */
        private void m13099v() {
            this.f22256z = true;
            this.f66009o1t = false;
            this.f66011wvg = true;
            this.f22255t = true;
            this.f66008mcp = false;
            this.f66006jk = false;
            this.f66001a9 = false;
            this.f66004fti = 0;
            this.f66007jp0y = true;
            this.f66005gvn7 = false;
            this.f66002d3 = true;
        }

        private static SparseArray<Map<C3629x, g>> xwq3(SparseArray<Map<C3629x, g>> sparseArray) {
            SparseArray<Map<C3629x, g>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
            }
            return sparseArray2;
        }

        public final n b3e(int i2, boolean z2) {
            if (this.f66003eqxt.get(i2) == z2) {
                return this;
            }
            if (z2) {
                this.f66003eqxt.put(i2, true);
            } else {
                this.f66003eqxt.delete(i2);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: bek6, reason: merged with bridge method [inline-methods] */
        public n mo13105j(boolean z2) {
            super.mo13105j(z2);
            return this;
        }

        @Deprecated
        public final n bo(int i2, C3629x c3629x) {
            Map<C3629x, g> map = this.f66010oc.get(i2);
            if (map != null && map.containsKey(c3629x)) {
                map.remove(c3629x);
                if (map.isEmpty()) {
                    this.f66010oc.remove(i2);
                }
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: bwp, reason: merged with bridge method [inline-methods] */
        public n hyr(String... strArr) {
            super.hyr(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: bz2, reason: merged with bridge method [inline-methods] */
        public n vyq(String... strArr) {
            super.vyq(strArr);
            return this;
        }

        @Deprecated
        public final n c8jq(int i2) {
            Map<C3629x, g> map = this.f66010oc.get(i2);
            if (map != null && !map.isEmpty()) {
                this.f66010oc.remove(i2);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: cfr, reason: merged with bridge method [inline-methods] */
        public n dd(int i2) {
            super.dd(i2);
            return this;
        }

        @Deprecated
        public final n cv06(int i2, C3629x c3629x, @dd g gVar) {
            Map<C3629x, g> map = this.f66010oc.get(i2);
            if (map == null) {
                map = new HashMap<>();
                this.f66010oc.put(i2, map);
            }
            if (map.containsKey(c3629x) && lrht.zy(map.get(c3629x), gVar)) {
                return this;
            }
            map.put(c3629x, gVar);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n jk(C3707i c3707i) {
            super.jk(c3707i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: d8wk, reason: merged with bridge method [inline-methods] */
        public n a9(Set<Integer> set) {
            super.a9(set);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: dr, reason: merged with bridge method [inline-methods] */
        public n wvg() {
            super.wvg();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: etdu, reason: merged with bridge method [inline-methods] */
        public n lvui() {
            super.lvui();
            return this;
        }

        public n fnq8(boolean z2) {
            this.f66002d3 = z2;
            return this;
        }

        public n g1(boolean z2) {
            this.f22255t = z2;
            return this;
        }

        public n gbni(boolean z2) {
            this.f22256z = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: gc3c, reason: merged with bridge method [inline-methods] */
        public n mo13101c(@dd String str) {
            super.mo13101c(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: gyi, reason: merged with bridge method [inline-methods] */
        public n o1t() {
            super.o1t();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: i9jn, reason: merged with bridge method [inline-methods] */
        public n gvn7(int i2) {
            super.gvn7(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: jbh, reason: merged with bridge method [inline-methods] */
        public n mo13107m(int i2, int i3, boolean z2) {
            super.mo13107m(i2, i3, z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: jz5, reason: merged with bridge method [inline-methods] */
        public n nn86(@dd String str) {
            super.nn86(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: kcsr, reason: merged with bridge method [inline-methods] */
        public n n5r1(@dd String str) {
            super.n5r1(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: ktq, reason: merged with bridge method [inline-methods] */
        public n hb(String... strArr) {
            super.hb(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: ltg8, reason: merged with bridge method [inline-methods] */
        public n d3(int i2) {
            super.d3(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
        public n eqxt(int i2) {
            super.eqxt(i2);
            return this;
        }

        public n mbx(boolean z2) {
            this.f66005gvn7 = z2;
            return this;
        }

        public n mu(boolean z2) {
            this.f66001a9 = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: py, reason: merged with bridge method [inline-methods] */
        public n jp0y(boolean z2) {
            super.jp0y(z2);
            return this;
        }

        public n qkj8(boolean z2) {
            this.f66006jk = z2;
            return this;
        }

        public n qo(boolean z2) {
            this.f66009o1t = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: r8s8, reason: merged with bridge method [inline-methods] */
        public n oc(int i2) {
            super.oc(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: se, reason: merged with bridge method [inline-methods] */
        public n mo13104f(int i2) {
            super.mo13104f(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: sok, reason: merged with bridge method [inline-methods] */
        public n mo13109r(int i2) {
            super.mo13109r(i2);
            return this;
        }

        public n tfm(boolean z2) {
            this.f66011wvg = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public q mo13111z() {
            return new q(this);
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: uj2j, reason: merged with bridge method [inline-methods] */
        public n mo13103e(int i2) {
            super.mo13103e(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: v0af, reason: merged with bridge method [inline-methods] */
        public n d2ok(int i2, int i3) {
            super.d2ok(i2, i3);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: vep5, reason: merged with bridge method [inline-methods] */
        public n mo13108o(cdj cdjVar) {
            super.mo13108o(cdjVar);
            return this;
        }

        public n vq(boolean z2) {
            this.f66008mcp = z2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: w831, reason: merged with bridge method [inline-methods] */
        public n x9kr(int i2, int i3) {
            super.x9kr(i2, i3);
            return this;
        }

        public n was(boolean z2) {
            this.f66007jp0y = z2;
            return this;
        }

        public n wo(int i2) {
            this.f66004fti = i2;
            return this;
        }

        @Deprecated
        public final n y2() {
            if (this.f66010oc.size() == 0) {
                return this;
            }
            this.f66010oc.clear();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: yl, reason: merged with bridge method [inline-methods] */
        public n ek5k(Context context, boolean z2) {
            super.ek5k(context, z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: yqrt, reason: merged with bridge method [inline-methods] */
        public n mo13106l(String... strArr) {
            super.mo13106l(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
        public n ncyb(@dd String str) {
            super.ncyb(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: zkd, reason: merged with bridge method [inline-methods] */
        public n lrht(Context context) {
            super.lrht(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.C3707i.k
        /* JADX INFO: renamed from: zsr0, reason: merged with bridge method [inline-methods] */
        public n fti(boolean z2) {
            super.fti(z2);
            return this;
        }

        @Deprecated
        public n() {
            this.f66010oc = new SparseArray<>();
            this.f66003eqxt = new SparseBooleanArray();
            m13099v();
        }

        public n(Context context) {
            super(context);
            this.f66010oc = new SparseArray<>();
            this.f66003eqxt = new SparseBooleanArray();
            m13099v();
        }

        private n(q qVar) {
            super(qVar);
            this.f66004fti = qVar.bd;
            this.f22256z = qVar.tlhn;
            this.f66009o1t = qVar.w97r;
            this.f66011wvg = qVar.tgs;
            this.f22255t = qVar.yl25;
            this.f66008mcp = qVar.zmmu;
            this.f66006jk = qVar.sk1t;
            this.f66001a9 = qVar.dy;
            this.f66007jp0y = qVar.vb6;
            this.f66005gvn7 = qVar.k6e;
            this.f66002d3 = qVar.xk5;
            this.f66010oc = xwq3(qVar.s8y);
            this.f66003eqxt = qVar.mjvl.clone();
        }

        private n(Bundle bundle) {
            super(bundle);
            q qVar = q.hp;
            gbni(bundle.getBoolean(q.m13114n(1000), qVar.tlhn));
            qo(bundle.getBoolean(q.m13114n(1001), qVar.w97r));
            tfm(bundle.getBoolean(q.m13114n(1002), qVar.tgs));
            g1(bundle.getBoolean(q.m13114n(1003), qVar.yl25));
            vq(bundle.getBoolean(q.m13114n(1004), qVar.zmmu));
            qkj8(bundle.getBoolean(q.m13114n(1005), qVar.sk1t));
            mu(bundle.getBoolean(q.m13114n(1006), qVar.dy));
            wo(bundle.getInt(q.m13114n(1007), qVar.bd));
            was(bundle.getBoolean(q.m13114n(1008), qVar.vb6));
            mbx(bundle.getBoolean(q.m13114n(1009), qVar.k6e));
            fnq8(bundle.getBoolean(q.m13114n(1010), qVar.xk5));
            this.f66010oc = new SparseArray<>();
            h7am(bundle);
            this.f66003eqxt = ikck(bundle.getIntArray(q.m13114n(1014)));
        }
    }

    @Deprecated
    public C3705g(InterfaceC3715s.toq toqVar) {
        this(q.hp, toqVar);
    }

    public C3705g(Context context) {
        this(context, new C3708k.toq());
    }

    public C3705g(Context context, InterfaceC3715s.toq toqVar) {
        this(q.kja0(context), toqVar);
    }

    public C3705g(q qVar, InterfaceC3715s.toq toqVar) {
        this.f22237q = toqVar;
        this.f22236n = new AtomicReference<>(qVar);
    }
}
