package androidx.collection;

import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.collection.s */
/* JADX INFO: compiled from: LongSparseArray.java */
/* JADX INFO: loaded from: classes.dex */
public class C0252s<E> implements Cloneable {

    /* JADX INFO: renamed from: y */
    private static final Object f1364y = new Object();

    /* JADX INFO: renamed from: g */
    private int f1365g;

    /* JADX INFO: renamed from: k */
    private boolean f1366k;

    /* JADX INFO: renamed from: n */
    private Object[] f1367n;

    /* JADX INFO: renamed from: q */
    private long[] f1368q;

    public C0252s() {
        this(10);
    }

    private void qrj() {
        int i2 = this.f1365g;
        long[] jArr = this.f1368q;
        Object[] objArr = this.f1367n;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1364y) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1366k = false;
        this.f1365g = i3;
    }

    public E a9(int i2) {
        if (this.f1366k) {
            qrj();
        }
        return (E) this.f1367n[i2];
    }

    public int cdj(long j2) {
        if (this.f1366k) {
            qrj();
        }
        return f7l8.toq(this.f1368q, this.f1365g, j2);
    }

    public void fn3e(long j2, E e2) {
        int qVar = f7l8.toq(this.f1368q, this.f1365g, j2);
        if (qVar >= 0) {
            this.f1367n[qVar] = e2;
            return;
        }
        int i2 = ~qVar;
        int i3 = this.f1365g;
        if (i2 < i3) {
            Object[] objArr = this.f1367n;
            if (objArr[i2] == f1364y) {
                this.f1368q[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1366k && i3 >= this.f1368q.length) {
            qrj();
            i2 = ~f7l8.toq(this.f1368q, this.f1365g, j2);
        }
        int i4 = this.f1365g;
        if (i4 >= this.f1368q.length) {
            int iM813g = f7l8.m813g(i4 + 1);
            long[] jArr = new long[iM813g];
            Object[] objArr2 = new Object[iM813g];
            long[] jArr2 = this.f1368q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1367n;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1368q = jArr;
            this.f1367n = objArr2;
        }
        int i5 = this.f1365g;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1368q;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1367n;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1365g - i2);
        }
        this.f1368q[i2] = j2;
        this.f1367n[i2] = e2;
        this.f1365g++;
    }

    public void fu4(long j2) {
        int qVar = f7l8.toq(this.f1368q, this.f1365g, j2);
        if (qVar >= 0) {
            Object[] objArr = this.f1367n;
            Object obj = objArr[qVar];
            Object obj2 = f1364y;
            if (obj != obj2) {
                objArr[qVar] = obj2;
                this.f1366k = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m876g(long j2) {
        return cdj(j2) >= 0;
    }

    /* JADX INFO: renamed from: i */
    public long m877i(int i2) {
        if (this.f1366k) {
            qrj();
        }
        return this.f1368q[i2];
    }

    public int jk() {
        if (this.f1366k) {
            qrj();
        }
        return this.f1365g;
    }

    /* JADX INFO: renamed from: k */
    public void m878k(long j2, E e2) {
        int i2 = this.f1365g;
        if (i2 != 0 && j2 <= this.f1368q[i2 - 1]) {
            fn3e(j2, e2);
            return;
        }
        if (this.f1366k && i2 >= this.f1368q.length) {
            qrj();
        }
        int i3 = this.f1365g;
        if (i3 >= this.f1368q.length) {
            int iM813g = f7l8.m813g(i3 + 1);
            long[] jArr = new long[iM813g];
            Object[] objArr = new Object[iM813g];
            long[] jArr2 = this.f1368q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1367n;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1368q = jArr;
            this.f1367n = objArr;
        }
        this.f1368q[i3] = j2;
        this.f1367n[i3] = e2;
        this.f1365g = i3 + 1;
    }

    public int ki(E e2) {
        if (this.f1366k) {
            qrj();
        }
        for (int i2 = 0; i2 < this.f1365g; i2++) {
            if (this.f1367n[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public E kja0(long j2, E e2) {
        E e3;
        int qVar = f7l8.toq(this.f1368q, this.f1365g, j2);
        return (qVar < 0 || (e3 = (E) this.f1367n[qVar]) == f1364y) ? e2 : e3;
    }

    public void mcp(int i2, E e2) {
        if (this.f1366k) {
            qrj();
        }
        this.f1367n[i2] = e2;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0252s<E> clone() {
        try {
            C0252s<E> c0252s = (C0252s) super.clone();
            c0252s.f1368q = (long[]) this.f1368q.clone();
            c0252s.f1367n = (Object[]) this.f1367n.clone();
            return c0252s;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @dd
    public E n7h(long j2) {
        return kja0(j2, null);
    }

    @dd
    public E ni7(long j2, E e2) {
        E eN7h = n7h(j2);
        if (eN7h == null) {
            fn3e(j2, e2);
        }
        return eN7h;
    }

    public void o1t(int i2) {
        Object[] objArr = this.f1367n;
        Object obj = objArr[i2];
        Object obj2 = f1364y;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1366k = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m880q() {
        int i2 = this.f1365g;
        Object[] objArr = this.f1367n;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1365g = 0;
        this.f1366k = false;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public void m881s(long j2) {
        fu4(j2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m882t(long j2, E e2, E e3) {
        int iCdj = cdj(j2);
        if (iCdj < 0) {
            return false;
        }
        Object obj = this.f1367n[iCdj];
        if (obj != e2 && (e2 == null || !e2.equals(obj))) {
            return false;
        }
        this.f1367n[iCdj] = e3;
        return true;
    }

    public boolean t8r() {
        return jk() == 0;
    }

    public String toString() {
        if (jk() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1365g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1365g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m877i(i2));
            sb.append('=');
            E eA9 = a9(i2);
            if (eA9 != this) {
                sb.append(eA9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @dd
    public E wvg(long j2, E e2) {
        int iCdj = cdj(j2);
        if (iCdj < 0) {
            return null;
        }
        Object[] objArr = this.f1367n;
        E e3 = (E) objArr[iCdj];
        objArr[iCdj] = e2;
        return e3;
    }

    /* JADX INFO: renamed from: y */
    public boolean m883y(E e2) {
        return ki(e2) >= 0;
    }

    /* JADX INFO: renamed from: z */
    public boolean m884z(long j2, Object obj) {
        int iCdj = cdj(j2);
        if (iCdj < 0) {
            return false;
        }
        E eA9 = a9(iCdj);
        if (obj != eA9 && (obj == null || !obj.equals(eA9))) {
            return false;
        }
        o1t(iCdj);
        return true;
    }

    public void zurt(@lvui C0252s<? extends E> c0252s) {
        int iJk = c0252s.jk();
        for (int i2 = 0; i2 < iJk; i2++) {
            fn3e(c0252s.m877i(i2), c0252s.a9(i2));
        }
    }

    public C0252s(int i2) {
        this.f1366k = false;
        if (i2 == 0) {
            this.f1368q = f7l8.f47029toq;
            this.f1367n = f7l8.f47030zy;
        } else {
            int iM813g = f7l8.m813g(i2);
            this.f1368q = new long[iM813g];
            this.f1367n = new Object[iM813g];
        }
    }
}
