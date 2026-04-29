package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ArraySet.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: g */
    private static final boolean f1374g = false;

    /* JADX INFO: renamed from: h */
    @dd
    private static Object[] f1375h = null;

    /* JADX INFO: renamed from: i */
    private static int f1376i = 0;

    /* JADX INFO: renamed from: p */
    private static final int f1378p = 10;

    /* JADX INFO: renamed from: s */
    private static final int f1380s = 4;

    /* JADX INFO: renamed from: t */
    private static int f1381t = 0;

    /* JADX INFO: renamed from: y */
    private static final String f1382y = "ArraySet";

    /* JADX INFO: renamed from: z */
    @dd
    private static Object[] f1383z;

    /* JADX INFO: renamed from: k */
    private int[] f1384k;

    /* JADX INFO: renamed from: n */
    int f1385n;

    /* JADX INFO: renamed from: q */
    Object[] f1386q;

    /* JADX INFO: renamed from: r */
    private static final Object f1379r = new Object();

    /* JADX INFO: renamed from: l */
    private static final Object f1377l = new Object();

    /* JADX INFO: renamed from: androidx.collection.zy$k */
    /* JADX INFO: compiled from: ArraySet.java */
    private class C0256k extends AbstractC0255y<E> {
        C0256k() {
            super(zy.this.f1385n);
        }

        @Override // androidx.collection.AbstractC0255y
        /* JADX INFO: renamed from: k */
        protected E mo825k(int i2) {
            return (E) zy.this.ld6(i2);
        }

        @Override // androidx.collection.AbstractC0255y
        protected void toq(int i2) {
            zy.this.m891p(i2);
        }
    }

    public zy() {
        this(0);
    }

    private int f7l8(Object obj, int i2) {
        int i3 = this.f1385n;
        if (i3 == 0) {
            return -1;
        }
        int iZy = zy(i2);
        if (iZy < 0 || obj.equals(this.f1386q[iZy])) {
            return iZy;
        }
        int i4 = iZy + 1;
        while (i4 < i3 && this.f1384k[i4] == i2) {
            if (obj.equals(this.f1386q[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iZy - 1; i5 >= 0 && this.f1384k[i5] == i2; i5--) {
            if (obj.equals(this.f1386q[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: g */
    private static void m887g(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (f1377l) {
                if (f1381t < 10) {
                    objArr[0] = f1383z;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1383z = objArr;
                    f1381t++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f1379r) {
                if (f1376i < 10) {
                    objArr[0] = f1375h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1375h = objArr;
                    f1376i++;
                }
            }
        }
    }

    private void toq(int i2) {
        if (i2 == 8) {
            synchronized (f1377l) {
                Object[] objArr = f1383z;
                if (objArr != null) {
                    try {
                        this.f1386q = objArr;
                        f1383z = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f1384k = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f1381t--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f1383z = null;
                    f1381t = 0;
                }
            }
        } else if (i2 == 4) {
            synchronized (f1379r) {
                Object[] objArr2 = f1375h;
                if (objArr2 != null) {
                    try {
                        this.f1386q = objArr2;
                        f1375h = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f1384k = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f1376i--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f1375h = null;
                    f1376i = 0;
                }
            }
        }
        this.f1384k = new int[i2];
        this.f1386q = new Object[i2];
    }

    /* JADX INFO: renamed from: y */
    private int m888y() {
        int i2 = this.f1385n;
        if (i2 == 0) {
            return -1;
        }
        int iZy = zy(0);
        if (iZy < 0 || this.f1386q[iZy] == null) {
            return iZy;
        }
        int i3 = iZy + 1;
        while (i3 < i2 && this.f1384k[i3] == 0) {
            if (this.f1386q[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iZy - 1; i4 >= 0 && this.f1384k[i4] == 0; i4--) {
            if (this.f1386q[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private int zy(int i2) {
        try {
            return f7l8.m814k(this.f1384k, this.f1385n, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@dd E e2) {
        int i2;
        int iF7l8;
        int i3 = this.f1385n;
        if (e2 == null) {
            iF7l8 = m888y();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iF7l8 = f7l8(e2, iHashCode);
        }
        if (iF7l8 >= 0) {
            return false;
        }
        int i4 = ~iF7l8;
        int[] iArr = this.f1384k;
        if (i3 >= iArr.length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1386q;
            toq(i5);
            if (i3 != this.f1385n) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1384k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1386q, 0, objArr.length);
            }
            m887g(iArr, objArr, i3);
        }
        if (i4 < i3) {
            int[] iArr3 = this.f1384k;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f1386q;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f1385n;
        if (i3 == i8) {
            int[] iArr4 = this.f1384k;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f1386q[i4] = e2;
                this.f1385n = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@lvui Collection<? extends E> collection) {
        m890n(this.f1385n + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1385n;
        if (i2 != 0) {
            int[] iArr = this.f1384k;
            Object[] objArr = this.f1386q;
            this.f1384k = f7l8.f1317k;
            this.f1386q = f7l8.f47030zy;
            this.f1385n = 0;
            m887g(iArr, objArr, i2);
        }
        if (this.f1385n != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@dd Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@lvui Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1385n; i2++) {
                try {
                    if (!set.contains(ld6(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1384k;
        int i2 = this.f1385n;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(@dd Object obj) {
        return obj == null ? m888y() : f7l8(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1385n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @lvui
    public Iterator<E> iterator() {
        return new C0256k();
    }

    /* JADX INFO: renamed from: k */
    public void m889k(@lvui zy<? extends E> zyVar) {
        int i2 = zyVar.f1385n;
        m890n(this.f1385n + i2);
        if (this.f1385n != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                add(zyVar.ld6(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(zyVar.f1384k, 0, this.f1384k, 0, i2);
            System.arraycopy(zyVar.f1386q, 0, this.f1386q, 0, i2);
            if (this.f1385n != 0) {
                throw new ConcurrentModificationException();
            }
            this.f1385n = i2;
        }
    }

    public E ld6(int i2) {
        return (E) this.f1386q[i2];
    }

    /* JADX INFO: renamed from: n */
    public void m890n(int i2) {
        int i3 = this.f1385n;
        int[] iArr = this.f1384k;
        if (iArr.length < i2) {
            Object[] objArr = this.f1386q;
            toq(i2);
            int i4 = this.f1385n;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f1384k, 0, i4);
                System.arraycopy(objArr, 0, this.f1386q, 0, this.f1385n);
            }
            m887g(iArr, objArr, this.f1385n);
        }
        if (this.f1385n != i3) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public E m891p(int i2) {
        int i3 = this.f1385n;
        Object[] objArr = this.f1386q;
        E e2 = (E) objArr[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f1384k;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    int i6 = i4 - i2;
                    System.arraycopy(iArr, i5, iArr, i2, i6);
                    Object[] objArr2 = this.f1386q;
                    System.arraycopy(objArr2, i5, objArr2, i2, i6);
                }
                this.f1386q[i4] = null;
            } else {
                toq(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1384k, 0, i2);
                    System.arraycopy(objArr, 0, this.f1386q, 0, i2);
                }
                if (i2 < i4) {
                    int i7 = i2 + 1;
                    int i8 = i4 - i2;
                    System.arraycopy(iArr, i7, this.f1384k, i2, i8);
                    System.arraycopy(objArr, i7, this.f1386q, i2, i8);
                }
            }
            if (i3 != this.f1385n) {
                throw new ConcurrentModificationException();
            }
            this.f1385n = i4;
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@dd Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m891p(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@lvui Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@lvui Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.f1385n - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1386q[i2])) {
                m891p(i2);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m892s(@lvui zy<? extends E> zyVar) {
        int i2 = zyVar.f1385n;
        int i3 = this.f1385n;
        for (int i4 = 0; i4 < i2; i4++) {
            remove(zyVar.ld6(i4));
        }
        return i3 != this.f1385n;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1385n;
    }

    @Override // java.util.Collection, java.util.Set
    @lvui
    public Object[] toArray() {
        int i2 = this.f1385n;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1386q, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1385n * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1385n; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eLd6 = ld6(i2);
            if (eLd6 != this) {
                sb.append(eLd6);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zy(int i2) {
        if (i2 == 0) {
            this.f1384k = f7l8.f1317k;
            this.f1386q = f7l8.f47030zy;
        } else {
            toq(i2);
        }
        this.f1385n = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @lvui
    public <T> T[] toArray(@lvui T[] tArr) {
        if (tArr.length < this.f1385n) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1385n));
        }
        System.arraycopy(this.f1386q, 0, tArr, 0, this.f1385n);
        int length = tArr.length;
        int i2 = this.f1385n;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zy(@dd zy<E> zyVar) {
        this();
        if (zyVar != 0) {
            m889k(zyVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zy(@dd Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    public zy(@dd E[] eArr) {
        this();
        if (eArr != null) {
            for (E e2 : eArr) {
                add(e2);
            }
        }
    }
}
