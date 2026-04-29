package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: compiled from: SortedList.java */
/* JADX INFO: loaded from: classes.dex */
public class d3<T> {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f52100kja0 = 4;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f52101ld6 = 10;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f52102n7h = 2;

    /* JADX INFO: renamed from: p */
    public static final int f5831p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f52103qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f52104x2 = 10;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private C1074k f52105f7l8;

    /* JADX INFO: renamed from: g */
    private toq f5832g;

    /* JADX INFO: renamed from: k */
    T[] f5833k;

    /* JADX INFO: renamed from: n */
    private int f5834n;

    /* JADX INFO: renamed from: q */
    private int f5835q;

    /* JADX INFO: renamed from: s */
    private final Class<T> f5836s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private T[] f52106toq;

    /* JADX INFO: renamed from: y */
    private int f5837y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f52107zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d3$k */
    /* JADX INFO: compiled from: SortedList.java */
    public static class C1074k<T2> extends toq<T2> {

        /* JADX INFO: renamed from: k */
        final toq<T2> f5838k;

        /* JADX INFO: renamed from: q */
        private final C1080g f5839q;

        public C1074k(toq<T2> toqVar) {
            this.f5838k = toqVar;
            this.f5839q = new C1080g(toqVar);
        }

        @Override // androidx.recyclerview.widget.d3.toq, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f5838k.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        @zy.dd
        public Object f7l8(T2 t2, T2 t22) {
            return this.f5838k.f7l8(t2, t22);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        /* JADX INFO: renamed from: g */
        public boolean mo4952g(T2 t2, T2 t22) {
            return this.f5838k.mo4952g(t2, t22);
        }

        @Override // androidx.recyclerview.widget.zurt
        /* JADX INFO: renamed from: k */
        public void mo4953k(int i2, int i3) {
            this.f5839q.mo4953k(i2, i3);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        /* JADX INFO: renamed from: n */
        public boolean mo4954n(T2 t2, T2 t22) {
            return this.f5838k.mo4954n(t2, t22);
        }

        @Override // androidx.recyclerview.widget.zurt
        /* JADX INFO: renamed from: q */
        public void mo4955q(int i2, int i3) {
            this.f5839q.mo4955q(i2, i3);
        }

        /* JADX INFO: renamed from: s */
        public void m4956s() {
            this.f5839q.m4986n();
        }

        @Override // androidx.recyclerview.widget.zurt
        public void toq(int i2, int i3) {
            this.f5839q.toq(i2, i3);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        /* JADX INFO: renamed from: y */
        public void mo4957y(int i2, int i3) {
            this.f5839q.zy(i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.d3.toq, androidx.recyclerview.widget.zurt
        public void zy(int i2, int i3, Object obj) {
            this.f5839q.zy(i2, i3, obj);
        }
    }

    /* JADX INFO: compiled from: SortedList.java */
    public static abstract class toq<T2> implements Comparator<T2>, zurt {
        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        @zy.dd
        public Object f7l8(T2 t2, T2 t22) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo4952g(T2 t2, T2 t22);

        /* JADX INFO: renamed from: n */
        public abstract boolean mo4954n(T2 t2, T2 t22);

        /* JADX INFO: renamed from: y */
        public abstract void mo4957y(int i2, int i3);

        public void zy(int i2, int i3, Object obj) {
            mo4957y(i2, i3);
        }
    }

    public d3(@zy.lvui Class<T> cls, @zy.lvui toq<T> toqVar) {
        this(cls, toqVar, 10);
    }

    private void a9() {
        if (this.f52106toq != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private void cdj(T[] tArr, int i2) {
        boolean z2 = !(this.f5832g instanceof C1074k);
        if (z2) {
            m4950y();
        }
        this.f52106toq = this.f5833k;
        int i3 = 0;
        this.f52107zy = 0;
        int i4 = this.f5837y;
        this.f5835q = i4;
        this.f5833k = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5836s, i4 + i2 + 10));
        this.f5834n = 0;
        while (true) {
            int i5 = this.f52107zy;
            int i6 = this.f5835q;
            if (i5 >= i6 && i3 >= i2) {
                break;
            }
            if (i5 == i6) {
                int i7 = i2 - i3;
                System.arraycopy(tArr, i3, this.f5833k, this.f5834n, i7);
                int i8 = this.f5834n + i7;
                this.f5834n = i8;
                this.f5837y += i7;
                this.f5832g.mo4953k(i8 - i7, i7);
                break;
            }
            if (i3 == i2) {
                int i9 = i6 - i5;
                System.arraycopy(this.f52106toq, i5, this.f5833k, this.f5834n, i9);
                this.f5834n += i9;
                break;
            }
            T t2 = this.f52106toq[i5];
            T t3 = tArr[i3];
            int iCompare = this.f5832g.compare(t2, t3);
            if (iCompare > 0) {
                T[] tArr2 = this.f5833k;
                int i10 = this.f5834n;
                int i11 = i10 + 1;
                this.f5834n = i11;
                tArr2[i10] = t3;
                this.f5837y++;
                i3++;
                this.f5832g.mo4953k(i11 - 1, 1);
            } else if (iCompare == 0 && this.f5832g.mo4952g(t2, t3)) {
                T[] tArr3 = this.f5833k;
                int i12 = this.f5834n;
                this.f5834n = i12 + 1;
                tArr3[i12] = t3;
                i3++;
                this.f52107zy++;
                if (!this.f5832g.mo4954n(t2, t3)) {
                    toq toqVar = this.f5832g;
                    toqVar.zy(this.f5834n - 1, 1, toqVar.f7l8(t2, t3));
                }
            } else {
                T[] tArr4 = this.f5833k;
                int i13 = this.f5834n;
                this.f5834n = i13 + 1;
                tArr4[i13] = t2;
                this.f52107zy++;
            }
        }
        this.f52106toq = null;
        if (z2) {
            ld6();
        }
    }

    private void f7l8(int i2, T t2) {
        int i3 = this.f5837y;
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("cannot add item to " + i2 + " because size is " + this.f5837y);
        }
        T[] tArr = this.f5833k;
        if (i3 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5836s, tArr.length + 10));
            System.arraycopy(this.f5833k, 0, tArr2, 0, i2);
            tArr2[i2] = t2;
            System.arraycopy(this.f5833k, i2, tArr2, i2 + 1, this.f5837y - i2);
            this.f5833k = tArr2;
        } else {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i3 - i2);
            this.f5833k[i2] = t2;
        }
        this.f5837y++;
    }

    /* JADX INFO: renamed from: g */
    private void m4941g(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iJk = jk(tArr);
        if (this.f5837y != 0) {
            cdj(tArr, iJk);
            return;
        }
        this.f5833k = tArr;
        this.f5837y = iJk;
        this.f5832g.mo4953k(0, iJk);
    }

    /* JADX INFO: renamed from: h */
    private int m4942h(T t2, int i2, int i3, int i4) {
        T t3;
        for (int i5 = i2 - 1; i5 >= i3; i5--) {
            T t4 = this.f5833k[i5];
            if (this.f5832g.compare(t4, t2) != 0) {
                break;
            }
            if (this.f5832g.mo4952g(t4, t2)) {
                return i5;
            }
        }
        do {
            i2++;
            if (i2 >= i4) {
                return -1;
            }
            t3 = this.f5833k[i2];
            if (this.f5832g.compare(t3, t2) != 0) {
                return -1;
            }
        } while (!this.f5832g.mo4952g(t3, t2));
        return i2;
    }

    /* JADX INFO: renamed from: i */
    private boolean m4943i(T t2, boolean z2) {
        int iX2 = x2(t2, this.f5833k, 0, this.f5837y, 2);
        if (iX2 == -1) {
            return false;
        }
        zurt(iX2, z2);
        return true;
    }

    private int jk(@zy.lvui T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f5832g);
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 1; i4 < tArr.length; i4++) {
            T t2 = tArr[i4];
            if (this.f5832g.compare(tArr[i2], t2) == 0) {
                int iQrj = qrj(t2, tArr, i2, i3);
                if (iQrj != -1) {
                    tArr[iQrj] = t2;
                } else {
                    if (i3 != i4) {
                        tArr[i3] = t2;
                    }
                    i3++;
                }
            } else {
                if (i3 != i4) {
                    tArr[i3] = t2;
                }
                i2 = i3;
                i3++;
            }
        }
        return i3;
    }

    private void o1t(T t2) {
        T[] tArr = this.f5833k;
        int i2 = this.f5834n;
        tArr[i2] = t2;
        int i3 = i2 + 1;
        this.f5834n = i3;
        this.f5837y++;
        this.f5832g.mo4953k(i3 - 1, 1);
    }

    /* JADX INFO: renamed from: p */
    private T[] m4944p(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5836s, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int qrj(T t2, T[] tArr, int i2, int i3) {
        while (i2 < i3) {
            if (this.f5832g.mo4952g(tArr[i2], t2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    private void m4945t() {
        this.f5837y--;
        this.f52107zy++;
        this.f5832g.toq(this.f5834n, 1);
    }

    private int toq(T t2, boolean z2) {
        int iX2 = x2(t2, this.f5833k, 0, this.f5837y, 1);
        if (iX2 == -1) {
            iX2 = 0;
        } else if (iX2 < this.f5837y) {
            T t3 = this.f5833k[iX2];
            if (this.f5832g.mo4952g(t3, t2)) {
                if (this.f5832g.mo4954n(t3, t2)) {
                    this.f5833k[iX2] = t2;
                    return iX2;
                }
                this.f5833k[iX2] = t2;
                toq toqVar = this.f5832g;
                toqVar.zy(iX2, 1, toqVar.f7l8(t3, t2));
                return iX2;
            }
        }
        f7l8(iX2, t2);
        if (z2) {
            this.f5832g.mo4953k(iX2, 1);
        }
        return iX2;
    }

    private void wvg(@zy.lvui T[] tArr) {
        boolean z2 = !(this.f5832g instanceof C1074k);
        if (z2) {
            m4950y();
        }
        this.f52107zy = 0;
        this.f5835q = this.f5837y;
        this.f52106toq = this.f5833k;
        this.f5834n = 0;
        int iJk = jk(tArr);
        this.f5833k = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5836s, iJk));
        while (true) {
            int i2 = this.f5834n;
            if (i2 >= iJk && this.f52107zy >= this.f5835q) {
                break;
            }
            int i3 = this.f52107zy;
            int i4 = this.f5835q;
            if (i3 >= i4) {
                int i5 = iJk - i2;
                System.arraycopy(tArr, i2, this.f5833k, i2, i5);
                this.f5834n += i5;
                this.f5837y += i5;
                this.f5832g.mo4953k(i2, i5);
                break;
            }
            if (i2 >= iJk) {
                int i6 = i4 - i3;
                this.f5837y -= i6;
                this.f5832g.toq(i2, i6);
                break;
            }
            T t2 = this.f52106toq[i3];
            T t3 = tArr[i2];
            int iCompare = this.f5832g.compare(t2, t3);
            if (iCompare < 0) {
                m4945t();
            } else if (iCompare > 0) {
                o1t(t3);
            } else if (this.f5832g.mo4952g(t2, t3)) {
                T[] tArr2 = this.f5833k;
                int i7 = this.f5834n;
                tArr2[i7] = t3;
                this.f52107zy++;
                this.f5834n = i7 + 1;
                if (!this.f5832g.mo4954n(t2, t3)) {
                    toq toqVar = this.f5832g;
                    toqVar.zy(this.f5834n - 1, 1, toqVar.f7l8(t2, t3));
                }
            } else {
                m4945t();
                o1t(t3);
            }
        }
        this.f52106toq = null;
        if (z2) {
            ld6();
        }
    }

    private int x2(T t2, T[] tArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int i5 = (i2 + i3) / 2;
            T t3 = tArr[i5];
            int iCompare = this.f5832g.compare(t3, t2);
            if (iCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iCompare == 0) {
                    if (this.f5832g.mo4952g(t3, t2)) {
                        return i5;
                    }
                    int iM4942h = m4942h(t2, i5, i2, i3);
                    return i4 == 1 ? iM4942h == -1 ? i5 : iM4942h : iM4942h;
                }
                i3 = i5;
            }
        }
        if (i4 == 1) {
            return i2;
        }
        return -1;
    }

    private void zurt(int i2, boolean z2) {
        T[] tArr = this.f5833k;
        System.arraycopy(tArr, i2 + 1, tArr, i2, (this.f5837y - i2) - 1);
        int i3 = this.f5837y - 1;
        this.f5837y = i3;
        this.f5833k[i3] = null;
        if (z2) {
            this.f5832g.toq(i2, 1);
        }
    }

    public T fn3e(int i2) {
        a9();
        T tN7h = n7h(i2);
        zurt(i2, true);
        return tN7h;
    }

    public void fti(int i2, T t2) {
        a9();
        T tN7h = n7h(i2);
        boolean z2 = tN7h == t2 || !this.f5832g.mo4954n(tN7h, t2);
        if (tN7h != t2 && this.f5832g.compare(tN7h, t2) == 0) {
            this.f5833k[i2] = t2;
            if (z2) {
                toq toqVar = this.f5832g;
                toqVar.zy(i2, 1, toqVar.f7l8(tN7h, t2));
                return;
            }
            return;
        }
        if (z2) {
            toq toqVar2 = this.f5832g;
            toqVar2.zy(i2, 1, toqVar2.f7l8(tN7h, t2));
        }
        zurt(i2, false);
        int qVar = toq(t2, false);
        if (i2 != qVar) {
            this.f5832g.mo4955q(i2, qVar);
        }
    }

    public void fu4(@zy.lvui T... tArr) {
        m4951z(tArr, false);
    }

    /* JADX INFO: renamed from: k */
    public int m4946k(T t2) {
        a9();
        return toq(t2, true);
    }

    public void ki(int i2) {
        a9();
        T tN7h = n7h(i2);
        zurt(i2, false);
        int qVar = toq(tN7h, false);
        if (i2 != qVar) {
            this.f5832g.mo4955q(i2, qVar);
        }
    }

    public int kja0(T t2) {
        if (this.f52106toq == null) {
            return x2(t2, this.f5833k, 0, this.f5837y, 4);
        }
        int iX2 = x2(t2, this.f5833k, 0, this.f5834n, 4);
        if (iX2 != -1) {
            return iX2;
        }
        int iX22 = x2(t2, this.f52106toq, this.f52107zy, this.f5835q, 4);
        if (iX22 != -1) {
            return (iX22 - this.f52107zy) + this.f5834n;
        }
        return -1;
    }

    public void ld6() {
        a9();
        toq toqVar = this.f5832g;
        if (toqVar instanceof C1074k) {
            ((C1074k) toqVar).m4956s();
        }
        toq toqVar2 = this.f5832g;
        C1074k c1074k = this.f52105f7l8;
        if (toqVar2 == c1074k) {
            this.f5832g = c1074k.f5838k;
        }
    }

    public int mcp() {
        return this.f5837y;
    }

    /* JADX INFO: renamed from: n */
    public void m4947n(@zy.lvui T[] tArr, boolean z2) {
        a9();
        if (tArr.length == 0) {
            return;
        }
        if (z2) {
            m4941g(tArr);
        } else {
            m4941g(m4944p(tArr));
        }
    }

    public T n7h(int i2) throws IndexOutOfBoundsException {
        int i3;
        if (i2 < this.f5837y && i2 >= 0) {
            T[] tArr = this.f52106toq;
            return (tArr == null || i2 < (i3 = this.f5834n)) ? this.f5833k[i2] : tArr[(i2 - i3) + this.f52107zy];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i2 + " but size is " + this.f5837y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ni7(@zy.lvui Collection<T> collection) {
        m4951z(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f5836s, collection.size())), true);
    }

    /* JADX INFO: renamed from: q */
    public void m4948q(@zy.lvui T... tArr) {
        m4947n(tArr, false);
    }

    /* JADX INFO: renamed from: s */
    public void m4949s() {
        a9();
        int i2 = this.f5837y;
        if (i2 == 0) {
            return;
        }
        Arrays.fill(this.f5833k, 0, i2, (Object) null);
        this.f5837y = 0;
        this.f5832g.toq(0, i2);
    }

    public boolean t8r(T t2) {
        a9();
        return m4943i(t2, true);
    }

    /* JADX INFO: renamed from: y */
    public void m4950y() {
        a9();
        toq toqVar = this.f5832g;
        if (toqVar instanceof C1074k) {
            return;
        }
        if (this.f52105f7l8 == null) {
            this.f52105f7l8 = new C1074k(toqVar);
        }
        this.f5832g = this.f52105f7l8;
    }

    /* JADX INFO: renamed from: z */
    public void m4951z(@zy.lvui T[] tArr, boolean z2) {
        a9();
        if (z2) {
            wvg(tArr);
        } else {
            wvg(m4944p(tArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zy(@zy.lvui Collection<T> collection) {
        m4947n(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f5836s, collection.size())), true);
    }

    public d3(@zy.lvui Class<T> cls, @zy.lvui toq<T> toqVar, int i2) {
        this.f5836s = cls;
        this.f5833k = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        this.f5832g = toqVar;
        this.f5837y = 0;
    }
}
