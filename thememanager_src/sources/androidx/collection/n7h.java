package androidx.collection;

import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: SparseArrayCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h<E> implements Cloneable {

    /* JADX INFO: renamed from: y */
    private static final Object f1343y = new Object();

    /* JADX INFO: renamed from: g */
    private int f1344g;

    /* JADX INFO: renamed from: k */
    private boolean f1345k;

    /* JADX INFO: renamed from: n */
    private Object[] f1346n;

    /* JADX INFO: renamed from: q */
    private int[] f1347q;

    public n7h() {
        this(10);
    }

    private void qrj() {
        int i2 = this.f1344g;
        int[] iArr = this.f1347q;
        Object[] objArr = this.f1346n;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1343y) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1345k = false;
        this.f1344g = i3;
    }

    public int a9() {
        if (this.f1345k) {
            qrj();
        }
        return this.f1344g;
    }

    public int cdj(int i2) {
        if (this.f1345k) {
            qrj();
        }
        return f7l8.m814k(this.f1347q, this.f1344g, i2);
    }

    public void fn3e(int i2, E e2) {
        int iM814k = f7l8.m814k(this.f1347q, this.f1344g, i2);
        if (iM814k >= 0) {
            this.f1346n[iM814k] = e2;
            return;
        }
        int i3 = ~iM814k;
        int i4 = this.f1344g;
        if (i3 < i4) {
            Object[] objArr = this.f1346n;
            if (objArr[i3] == f1343y) {
                this.f1347q[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f1345k && i4 >= this.f1347q.length) {
            qrj();
            i3 = ~f7l8.m814k(this.f1347q, this.f1344g, i2);
        }
        int i5 = this.f1344g;
        if (i5 >= this.f1347q.length) {
            int iM815n = f7l8.m815n(i5 + 1);
            int[] iArr = new int[iM815n];
            Object[] objArr2 = new Object[iM815n];
            int[] iArr2 = this.f1347q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1346n;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1347q = iArr;
            this.f1346n = objArr2;
        }
        int i6 = this.f1344g;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f1347q;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f1346n;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f1344g - i3);
        }
        this.f1347q[i3] = i2;
        this.f1346n[i3] = e2;
        this.f1344g++;
    }

    public E fti(int i2) {
        if (this.f1345k) {
            qrj();
        }
        return (E) this.f1346n[i2];
    }

    public void fu4(int i2) {
        int iM814k = f7l8.m814k(this.f1347q, this.f1344g, i2);
        if (iM814k >= 0) {
            Object[] objArr = this.f1346n;
            Object obj = objArr[iM814k];
            Object obj2 = f1343y;
            if (obj != obj2) {
                objArr[iM814k] = obj2;
                this.f1345k = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m851g(int i2) {
        return cdj(i2) >= 0;
    }

    /* JADX INFO: renamed from: i */
    public int m852i(int i2) {
        if (this.f1345k) {
            qrj();
        }
        return this.f1347q[i2];
    }

    public void jk(int i2, E e2) {
        if (this.f1345k) {
            qrj();
        }
        this.f1346n[i2] = e2;
    }

    /* JADX INFO: renamed from: k */
    public void m853k(int i2, E e2) {
        int i3 = this.f1344g;
        if (i3 != 0 && i2 <= this.f1347q[i3 - 1]) {
            fn3e(i2, e2);
            return;
        }
        if (this.f1345k && i3 >= this.f1347q.length) {
            qrj();
        }
        int i4 = this.f1344g;
        if (i4 >= this.f1347q.length) {
            int iM815n = f7l8.m815n(i4 + 1);
            int[] iArr = new int[iM815n];
            Object[] objArr = new Object[iM815n];
            int[] iArr2 = this.f1347q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1346n;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1347q = iArr;
            this.f1346n = objArr;
        }
        this.f1347q[i4] = i2;
        this.f1346n[i4] = e2;
        this.f1344g = i4 + 1;
    }

    public int ki(E e2) {
        if (this.f1345k) {
            qrj();
        }
        for (int i2 = 0; i2 < this.f1344g; i2++) {
            if (this.f1346n[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public E kja0(int i2, E e2) {
        E e3;
        int iM814k = f7l8.m814k(this.f1347q, this.f1344g, i2);
        return (iM814k < 0 || (e3 = (E) this.f1346n[iM814k]) == f1343y) ? e2 : e3;
    }

    public boolean mcp(int i2, E e2, E e3) {
        int iCdj = cdj(i2);
        if (iCdj < 0) {
            return false;
        }
        Object obj = this.f1346n[iCdj];
        if (obj != e2 && (e2 == null || !e2.equals(obj))) {
            return false;
        }
        this.f1346n[iCdj] = e3;
        return true;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public n7h<E> clone() {
        try {
            n7h<E> n7hVar = (n7h) super.clone();
            n7hVar.f1347q = (int[]) this.f1347q.clone();
            n7hVar.f1346n = (Object[]) this.f1346n.clone();
            return n7hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @dd
    public E n7h(int i2) {
        return kja0(i2, null);
    }

    @dd
    public E ni7(int i2, E e2) {
        E eN7h = n7h(i2);
        if (eN7h == null) {
            fn3e(i2, e2);
        }
        return eN7h;
    }

    public void o1t(int i2) {
        Object[] objArr = this.f1346n;
        Object obj = objArr[i2];
        Object obj2 = f1343y;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1345k = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m855q() {
        int i2 = this.f1344g;
        Object[] objArr = this.f1346n;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1344g = 0;
        this.f1345k = false;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public void m856s(int i2) {
        fu4(i2);
    }

    @dd
    /* JADX INFO: renamed from: t */
    public E m857t(int i2, E e2) {
        int iCdj = cdj(i2);
        if (iCdj < 0) {
            return null;
        }
        Object[] objArr = this.f1346n;
        E e3 = (E) objArr[iCdj];
        objArr[iCdj] = e2;
        return e3;
    }

    public boolean t8r() {
        return a9() == 0;
    }

    public String toString() {
        if (a9() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1344g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1344g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m852i(i2));
            sb.append('=');
            E eFti = fti(i2);
            if (eFti != this) {
                sb.append(eFti);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void wvg(int i2, int i3) {
        int iMin = Math.min(this.f1344g, i3 + i2);
        while (i2 < iMin) {
            o1t(i2);
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m858y(E e2) {
        return ki(e2) >= 0;
    }

    /* JADX INFO: renamed from: z */
    public boolean m859z(int i2, Object obj) {
        int iCdj = cdj(i2);
        if (iCdj < 0) {
            return false;
        }
        E eFti = fti(iCdj);
        if (obj != eFti && (obj == null || !obj.equals(eFti))) {
            return false;
        }
        o1t(iCdj);
        return true;
    }

    public void zurt(@lvui n7h<? extends E> n7hVar) {
        int iA9 = n7hVar.a9();
        for (int i2 = 0; i2 < iA9; i2++) {
            fn3e(n7hVar.m852i(i2), n7hVar.fti(i2));
        }
    }

    public n7h(int i2) {
        this.f1345k = false;
        if (i2 == 0) {
            this.f1347q = f7l8.f1317k;
            this.f1346n = f7l8.f47030zy;
        } else {
            int iM815n = f7l8.m815n(i2);
            this.f1347q = new int[iM815n];
            this.f1346n = new Object[iM815n];
        }
    }
}
