package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DiffUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static final Comparator<C1095q> f5947k = new C1093k();

    /* JADX INFO: compiled from: DiffUtil.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        int f5948k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52190toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f52191zy;

        f7l8(int i2, int i3, boolean z2) {
            this.f5948k = i2;
            this.f52190toq = i3;
            this.f52191zy = z2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$g */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class AbstractC1092g<T> {
        /* JADX INFO: renamed from: k */
        public abstract boolean mo5028k(@zy.lvui T t2, @zy.lvui T t3);

        public abstract boolean toq(@zy.lvui T t2, @zy.lvui T t3);

        @zy.dd
        public Object zy(@zy.lvui T t2, @zy.lvui T t3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$k */
    /* JADX INFO: compiled from: DiffUtil.java */
    class C1093k implements Comparator<C1095q> {
        C1093k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C1095q c1095q, C1095q c1095q2) {
            return c1095q.f5956k - c1095q2.f5956k;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$n */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class C1094n {

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f52192kja0 = 15;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final int f52193ld6 = 4;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f52194n7h = 4;

        /* JADX INFO: renamed from: p */
        private static final int f5949p = 2;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f52195qrj = 12;

        /* JADX INFO: renamed from: s */
        private static final int f5950s = 1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final int f52196x2 = 8;

        /* JADX INFO: renamed from: y */
        public static final int f5951y = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final boolean f52197f7l8;

        /* JADX INFO: renamed from: g */
        private final int f5952g;

        /* JADX INFO: renamed from: k */
        private final List<C1095q> f5953k;

        /* JADX INFO: renamed from: n */
        private final int f5954n;

        /* JADX INFO: renamed from: q */
        private final toq f5955q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f52198toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f52199zy;

        C1094n(toq toqVar, List<C1095q> list, int[] iArr, int[] iArr2, boolean z2) {
            this.f5953k = list;
            this.f52198toq = iArr;
            this.f52199zy = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5955q = toqVar;
            this.f5954n = toqVar.mo4704n();
            this.f5952g = toqVar.mo4705q();
            this.f52197f7l8 = z2;
            m5031k();
            f7l8();
        }

        private void f7l8() {
            for (C1095q c1095q : this.f5953k) {
                for (int i2 = 0; i2 < c1095q.f52201zy; i2++) {
                    int i3 = c1095q.f5956k + i2;
                    int i4 = c1095q.f52200toq + i2;
                    int i5 = this.f5955q.mo4703k(i3, i4) ? 1 : 2;
                    this.f52198toq[i3] = (i4 << 4) | i5;
                    this.f52199zy[i4] = (i3 << 4) | i5;
                }
            }
            if (this.f52197f7l8) {
                m5033y();
            }
        }

        /* JADX INFO: renamed from: g */
        private void m5030g(int i2) {
            int size = this.f5953k.size();
            int qVar = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1095q c1095q = this.f5953k.get(i3);
                while (qVar < c1095q.f52200toq) {
                    if (this.f52199zy[qVar] == 0 && this.f5955q.toq(i2, qVar)) {
                        int i4 = this.f5955q.mo4703k(i2, qVar) ? 8 : 4;
                        this.f52198toq[i2] = (qVar << 4) | i4;
                        this.f52199zy[qVar] = (i2 << 4) | i4;
                        return;
                    }
                    qVar++;
                }
                qVar = c1095q.toq();
            }
        }

        /* JADX INFO: renamed from: k */
        private void m5031k() {
            C1095q c1095q = this.f5953k.isEmpty() ? null : this.f5953k.get(0);
            if (c1095q == null || c1095q.f5956k != 0 || c1095q.f52200toq != 0) {
                this.f5953k.add(0, new C1095q(0, 0, 0));
            }
            this.f5953k.add(new C1095q(this.f5954n, this.f5952g, 0));
        }

        @zy.dd
        /* JADX INFO: renamed from: s */
        private static f7l8 m5032s(Collection<f7l8> collection, int i2, boolean z2) {
            f7l8 next;
            Iterator<f7l8> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f5948k == i2 && next.f52191zy == z2) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f7l8 next2 = it.next();
                if (z2) {
                    next2.f52190toq--;
                } else {
                    next2.f52190toq++;
                }
            }
            return next;
        }

        /* JADX INFO: renamed from: y */
        private void m5033y() {
            int iM5036k = 0;
            for (C1095q c1095q : this.f5953k) {
                while (iM5036k < c1095q.f5956k) {
                    if (this.f52198toq[iM5036k] == 0) {
                        m5030g(iM5036k);
                    }
                    iM5036k++;
                }
                iM5036k = c1095q.m5036k();
            }
        }

        /* JADX INFO: renamed from: n */
        public void m5034n(@zy.lvui RecyclerView.AbstractC1060y abstractC1060y) {
            m5035q(new androidx.recyclerview.widget.toq(abstractC1060y));
        }

        /* JADX INFO: renamed from: q */
        public void m5035q(@zy.lvui zurt zurtVar) {
            int i2;
            C1080g c1080g = zurtVar instanceof C1080g ? (C1080g) zurtVar : new C1080g(zurtVar);
            int i3 = this.f5954n;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.f5954n;
            int i5 = this.f5952g;
            for (int size = this.f5953k.size() - 1; size >= 0; size--) {
                C1095q c1095q = this.f5953k.get(size);
                int iM5036k = c1095q.m5036k();
                int qVar = c1095q.toq();
                while (true) {
                    if (i4 <= iM5036k) {
                        break;
                    }
                    i4--;
                    int i6 = this.f52198toq[i4];
                    if ((i6 & 12) != 0) {
                        int i7 = i6 >> 4;
                        f7l8 f7l8VarM5032s = m5032s(arrayDeque, i7, false);
                        if (f7l8VarM5032s != null) {
                            int i8 = (i3 - f7l8VarM5032s.f52190toq) - 1;
                            c1080g.mo4955q(i4, i8);
                            if ((i6 & 4) != 0) {
                                c1080g.zy(i8, 1, this.f5955q.zy(i4, i7));
                            }
                        } else {
                            arrayDeque.add(new f7l8(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        c1080g.toq(i4, 1);
                        i3--;
                    }
                }
                while (i5 > qVar) {
                    i5--;
                    int i9 = this.f52199zy[i5];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        f7l8 f7l8VarM5032s2 = m5032s(arrayDeque, i10, true);
                        if (f7l8VarM5032s2 == null) {
                            arrayDeque.add(new f7l8(i5, i3 - i4, false));
                        } else {
                            c1080g.mo4955q((i3 - f7l8VarM5032s2.f52190toq) - 1, i4);
                            if ((i9 & 4) != 0) {
                                c1080g.zy(i4, 1, this.f5955q.zy(i10, i5));
                            }
                        }
                    } else {
                        c1080g.mo4953k(i4, 1);
                        i3++;
                    }
                }
                int i11 = c1095q.f5956k;
                int i12 = c1095q.f52200toq;
                for (i2 = 0; i2 < c1095q.f52201zy; i2++) {
                    if ((this.f52198toq[i11] & 15) == 2) {
                        c1080g.zy(i11, 1, this.f5955q.zy(i11, i12));
                    }
                    i11++;
                    i12++;
                }
                i4 = c1095q.f5956k;
                i5 = c1095q.f52200toq;
            }
            c1080g.m4986n();
        }

        public int toq(@zy.a9(from = 0) int i2) {
            if (i2 >= 0 && i2 < this.f5952g) {
                int i3 = this.f52199zy[i2];
                if ((i3 & 15) == 0) {
                    return -1;
                }
                return i3 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i2 + ", new list size = " + this.f5952g);
        }

        public int zy(@zy.a9(from = 0) int i2) {
            if (i2 >= 0 && i2 < this.f5954n) {
                int i3 = this.f52198toq[i2];
                if ((i3 & 15) == 0) {
                    return -1;
                }
                return i3 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i2 + ", old list size = " + this.f5954n);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$q */
    /* JADX INFO: compiled from: DiffUtil.java */
    static class C1095q {

        /* JADX INFO: renamed from: k */
        public final int f5956k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f52200toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f52201zy;

        C1095q(int i2, int i3, int i4) {
            this.f5956k = i2;
            this.f52200toq = i3;
            this.f52201zy = i4;
        }

        /* JADX INFO: renamed from: k */
        int m5036k() {
            return this.f5956k + this.f52201zy;
        }

        int toq() {
            return this.f52200toq + this.f52201zy;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$s */
    /* JADX INFO: compiled from: DiffUtil.java */
    static class C1096s {

        /* JADX INFO: renamed from: k */
        public int f5957k;

        /* JADX INFO: renamed from: n */
        public boolean f5958n;

        /* JADX INFO: renamed from: q */
        public int f5959q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f52202toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52203zy;

        C1096s() {
        }

        /* JADX INFO: renamed from: k */
        int m5037k() {
            return Math.min(this.f52203zy - this.f5957k, this.f5959q - this.f52202toq);
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        C1095q m5038q() {
            if (toq()) {
                return this.f5958n ? new C1095q(this.f5957k, this.f52202toq, m5037k()) : zy() ? new C1095q(this.f5957k, this.f52202toq + 1, m5037k()) : new C1095q(this.f5957k + 1, this.f52202toq, m5037k());
            }
            int i2 = this.f5957k;
            return new C1095q(i2, this.f52202toq, this.f52203zy - i2);
        }

        boolean toq() {
            return this.f5959q - this.f52202toq != this.f52203zy - this.f5957k;
        }

        boolean zy() {
            return this.f5959q - this.f52202toq > this.f52203zy - this.f5957k;
        }
    }

    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public abstract boolean mo4703k(int i2, int i3);

        /* JADX INFO: renamed from: n */
        public abstract int mo4704n();

        /* JADX INFO: renamed from: q */
        public abstract int mo4705q();

        public abstract boolean toq(int i2, int i3);

        @zy.dd
        public Object zy(int i2, int i3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ld6$y */
    /* JADX INFO: compiled from: DiffUtil.java */
    static class C1097y {

        /* JADX INFO: renamed from: k */
        int f5960k;

        /* JADX INFO: renamed from: q */
        int f5961q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52204toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52205zy;

        public C1097y() {
        }

        /* JADX INFO: renamed from: k */
        int m5039k() {
            return this.f5961q - this.f52205zy;
        }

        int toq() {
            return this.f52204toq - this.f5960k;
        }

        public C1097y(int i2, int i3, int i4, int i5) {
            this.f5960k = i2;
            this.f52204toq = i3;
            this.f52205zy = i4;
            this.f5961q = i5;
        }
    }

    /* JADX INFO: compiled from: DiffUtil.java */
    static class zy {

        /* JADX INFO: renamed from: k */
        private final int[] f5962k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f52206toq;

        zy(int i2) {
            int[] iArr = new int[i2];
            this.f5962k = iArr;
            this.f52206toq = iArr.length / 2;
        }

        /* JADX INFO: renamed from: k */
        int[] m5040k() {
            return this.f5962k;
        }

        /* JADX INFO: renamed from: q */
        void m5041q(int i2, int i3) {
            this.f5962k[i2 + this.f52206toq] = i3;
        }

        public void toq(int i2) {
            Arrays.fill(this.f5962k, i2);
        }

        int zy(int i2) {
            return this.f5962k[i2 + this.f52206toq];
        }
    }

    private ld6() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    private static C1096s m5025k(C1097y c1097y, toq toqVar, zy zyVar, zy zyVar2, int i2) {
        int iZy;
        int i3;
        int i4;
        boolean z2 = (c1097y.toq() - c1097y.m5039k()) % 2 == 0;
        int qVar = c1097y.toq() - c1097y.m5039k();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && zyVar2.zy(i6 + 1) < zyVar2.zy(i6 - 1))) {
                iZy = zyVar2.zy(i6 + 1);
                i3 = iZy;
            } else {
                iZy = zyVar2.zy(i6 - 1);
                i3 = iZy - 1;
            }
            int i7 = c1097y.f5961q - ((c1097y.f52204toq - i3) - i6);
            int i8 = (i2 == 0 || i3 != iZy) ? i7 : i7 + 1;
            while (i3 > c1097y.f5960k && i7 > c1097y.f52205zy && toqVar.toq(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            zyVar2.m5041q(i6, i3);
            if (z2 && (i4 = qVar - i6) >= i5 && i4 <= i2 && zyVar.zy(i4) >= i3) {
                C1096s c1096s = new C1096s();
                c1096s.f5957k = i3;
                c1096s.f52202toq = i7;
                c1096s.f52203zy = iZy;
                c1096s.f5959q = i8;
                c1096s.f5958n = true;
                return c1096s;
            }
        }
        return null;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    private static C1096s m5026n(C1097y c1097y, toq toqVar, zy zyVar, zy zyVar2) {
        if (c1097y.toq() >= 1 && c1097y.m5039k() >= 1) {
            int qVar = ((c1097y.toq() + c1097y.m5039k()) + 1) / 2;
            zyVar.m5041q(1, c1097y.f5960k);
            zyVar2.m5041q(1, c1097y.f52204toq);
            for (int i2 = 0; i2 < qVar; i2++) {
                C1096s c1096sM5027q = m5027q(c1097y, toqVar, zyVar, zyVar2, i2);
                if (c1096sM5027q != null) {
                    return c1096sM5027q;
                }
                C1096s c1096sM5025k = m5025k(c1097y, toqVar, zyVar, zyVar2, i2);
                if (c1096sM5025k != null) {
                    return c1096sM5025k;
                }
            }
        }
        return null;
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    private static C1096s m5027q(C1097y c1097y, toq toqVar, zy zyVar, zy zyVar2, int i2) {
        int iZy;
        int i3;
        int i4;
        boolean z2 = Math.abs(c1097y.toq() - c1097y.m5039k()) % 2 == 1;
        int qVar = c1097y.toq() - c1097y.m5039k();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && zyVar.zy(i6 + 1) > zyVar.zy(i6 - 1))) {
                iZy = zyVar.zy(i6 + 1);
                i3 = iZy;
            } else {
                iZy = zyVar.zy(i6 - 1);
                i3 = iZy + 1;
            }
            int i7 = (c1097y.f52205zy + (i3 - c1097y.f5960k)) - i6;
            int i8 = (i2 == 0 || i3 != iZy) ? i7 : i7 - 1;
            while (i3 < c1097y.f52204toq && i7 < c1097y.f5961q && toqVar.toq(i3, i7)) {
                i3++;
                i7++;
            }
            zyVar.m5041q(i6, i3);
            if (z2 && (i4 = qVar - i6) >= i5 + 1 && i4 <= i2 - 1 && zyVar2.zy(i4) <= i3) {
                C1096s c1096s = new C1096s();
                c1096s.f5957k = iZy;
                c1096s.f52202toq = i8;
                c1096s.f52203zy = i3;
                c1096s.f5959q = i7;
                c1096s.f5958n = false;
                return c1096s;
            }
        }
        return null;
    }

    @zy.lvui
    public static C1094n toq(@zy.lvui toq toqVar) {
        return zy(toqVar, true);
    }

    @zy.lvui
    public static C1094n zy(@zy.lvui toq toqVar, boolean z2) {
        int iMo4704n = toqVar.mo4704n();
        int iMo4705q = toqVar.mo4705q();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1097y(0, iMo4704n, 0, iMo4705q));
        int i2 = ((((iMo4704n + iMo4705q) + 1) / 2) * 2) + 1;
        zy zyVar = new zy(i2);
        zy zyVar2 = new zy(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1097y c1097y = (C1097y) arrayList2.remove(arrayList2.size() - 1);
            C1096s c1096sM5026n = m5026n(c1097y, toqVar, zyVar, zyVar2);
            if (c1096sM5026n != null) {
                if (c1096sM5026n.m5037k() > 0) {
                    arrayList.add(c1096sM5026n.m5038q());
                }
                C1097y c1097y2 = arrayList3.isEmpty() ? new C1097y() : (C1097y) arrayList3.remove(arrayList3.size() - 1);
                c1097y2.f5960k = c1097y.f5960k;
                c1097y2.f52205zy = c1097y.f52205zy;
                c1097y2.f52204toq = c1096sM5026n.f5957k;
                c1097y2.f5961q = c1096sM5026n.f52202toq;
                arrayList2.add(c1097y2);
                c1097y.f52204toq = c1097y.f52204toq;
                c1097y.f5961q = c1097y.f5961q;
                c1097y.f5960k = c1096sM5026n.f52203zy;
                c1097y.f52205zy = c1096sM5026n.f5959q;
                arrayList2.add(c1097y);
            } else {
                arrayList3.add(c1097y);
            }
        }
        Collections.sort(arrayList, f5947k);
        return new C1094n(toqVar, arrayList, zyVar.m5040k(), zyVar2.m5040k(), z2);
    }
}
