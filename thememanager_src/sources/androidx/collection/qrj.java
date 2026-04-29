package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: SimpleArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj<K, V> {

    /* JADX INFO: renamed from: g */
    private static final boolean f1352g = false;

    /* JADX INFO: renamed from: h */
    private static final int f1353h = 10;

    /* JADX INFO: renamed from: i */
    @dd
    static Object[] f1354i = null;

    /* JADX INFO: renamed from: p */
    private static final int f1355p = 4;

    /* JADX INFO: renamed from: r */
    static int f1356r = 0;

    /* JADX INFO: renamed from: s */
    private static final boolean f1357s = true;

    /* JADX INFO: renamed from: t */
    @dd
    static Object[] f1358t = null;

    /* JADX INFO: renamed from: y */
    private static final String f1359y = "ArrayMap";

    /* JADX INFO: renamed from: z */
    static int f1360z;

    /* JADX INFO: renamed from: k */
    int[] f1361k;

    /* JADX INFO: renamed from: n */
    int f1362n;

    /* JADX INFO: renamed from: q */
    Object[] f1363q;

    public qrj() {
        this.f1361k = f7l8.f1317k;
        this.f1363q = f7l8.f47030zy;
        this.f1362n = 0;
    }

    /* JADX INFO: renamed from: k */
    private void m870k(int i2) {
        if (i2 == 8) {
            synchronized (qrj.class) {
                Object[] objArr = f1358t;
                if (objArr != null) {
                    this.f1363q = objArr;
                    f1358t = (Object[]) objArr[0];
                    this.f1361k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1356r--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (qrj.class) {
                Object[] objArr2 = f1354i;
                if (objArr2 != null) {
                    this.f1363q = objArr2;
                    f1354i = (Object[]) objArr2[0];
                    this.f1361k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1360z--;
                    return;
                }
            }
        }
        this.f1361k = new int[i2];
        this.f1363q = new Object[i2 << 1];
    }

    /* JADX INFO: renamed from: q */
    private static void m871q(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (qrj.class) {
                if (f1356r < 10) {
                    objArr[0] = f1358t;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1358t = objArr;
                    f1356r++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (qrj.class) {
                if (f1360z < 10) {
                    objArr[0] = f1354i;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1354i = objArr;
                    f1360z++;
                }
            }
        }
    }

    private static int toq(int[] iArr, int i2, int i3) {
        try {
            return f7l8.m814k(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f1362n;
        if (i2 > 0) {
            int[] iArr = this.f1361k;
            Object[] objArr = this.f1363q;
            this.f1361k = f7l8.f1317k;
            this.f1363q = f7l8.f47030zy;
            this.f1362n = 0;
            m871q(iArr, objArr, i2);
        }
        if (this.f1362n > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@dd Object obj) {
        return f7l8(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m874p(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qrj) {
            qrj qrjVar = (qrj) obj;
            if (size() != qrjVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1362n; i2++) {
                K kLd6 = ld6(i2);
                V vM873h = m873h(i2);
                Object obj2 = qrjVar.get(kLd6);
                if (vM873h == null) {
                    if (obj2 != null || !qrjVar.containsKey(kLd6)) {
                        return false;
                    }
                } else if (!vM873h.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1362n; i3++) {
                K kLd62 = ld6(i3);
                V vM873h2 = m873h(i3);
                Object obj3 = map.get(kLd62);
                if (vM873h2 == null) {
                    if (obj3 != null || !map.containsKey(kLd62)) {
                        return false;
                    }
                } else if (!vM873h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int f7l8(@dd Object obj) {
        return obj == null ? m875y() : m872g(obj, obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    int m872g(Object obj, int i2) {
        int i3 = this.f1362n;
        if (i3 == 0) {
            return -1;
        }
        int qVar = toq(this.f1361k, i3, i2);
        if (qVar < 0 || obj.equals(this.f1363q[qVar << 1])) {
            return qVar;
        }
        int i4 = qVar + 1;
        while (i4 < i3 && this.f1361k[i4] == i2) {
            if (obj.equals(this.f1363q[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = qVar - 1; i5 >= 0 && this.f1361k[i5] == i2; i5--) {
            if (obj.equals(this.f1363q[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    @dd
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int iF7l8 = f7l8(obj);
        return iF7l8 >= 0 ? (V) this.f1363q[(iF7l8 << 1) + 1] : v2;
    }

    /* JADX INFO: renamed from: h */
    public V m873h(int i2) {
        return (V) this.f1363q[(i2 << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.f1361k;
        Object[] objArr = this.f1363q;
        int i2 = this.f1362n;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f1362n <= 0;
    }

    public V kja0(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1363q;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public K ld6(int i2) {
        return (K) this.f1363q[i2 << 1];
    }

    public V n7h(int i2) {
        Object[] objArr = this.f1363q;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this.f1362n;
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f1361k;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    int i7 = i5 - i2;
                    System.arraycopy(iArr, i6, iArr, i2, i7);
                    Object[] objArr2 = this.f1363q;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i3, i7 << 1);
                }
                Object[] objArr3 = this.f1363q;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m870k(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f1362n) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1361k, 0, i2);
                    System.arraycopy(objArr, 0, this.f1363q, 0, i3);
                }
                if (i2 < i5) {
                    int i9 = i2 + 1;
                    int i10 = i5 - i2;
                    System.arraycopy(iArr, i9, this.f1361k, i2, i10);
                    System.arraycopy(objArr, i9 << 1, this.f1363q, i3, i10 << 1);
                }
            }
            if (i4 != this.f1362n) {
                throw new ConcurrentModificationException();
            }
            this.f1362n = i5;
        }
        return v2;
    }

    /* JADX INFO: renamed from: p */
    int m874p(Object obj) {
        int i2 = this.f1362n * 2;
        Object[] objArr = this.f1363q;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    @dd
    public V put(K k2, V v2) {
        int i2;
        int iM872g;
        int i3 = this.f1362n;
        if (k2 == null) {
            iM872g = m875y();
            i2 = 0;
        } else {
            int iHashCode = k2.hashCode();
            i2 = iHashCode;
            iM872g = m872g(k2, iHashCode);
        }
        if (iM872g >= 0) {
            int i4 = (iM872g << 1) + 1;
            Object[] objArr = this.f1363q;
            V v3 = (V) objArr[i4];
            objArr[i4] = v2;
            return v3;
        }
        int i5 = ~iM872g;
        int[] iArr = this.f1361k;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f1363q;
            m870k(i6);
            if (i3 != this.f1362n) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1361k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1363q, 0, objArr2.length);
            }
            m871q(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1361k;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f1363q;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f1362n - i5) << 1);
        }
        int i8 = this.f1362n;
        if (i3 == i8) {
            int[] iArr4 = this.f1361k;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f1363q;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v2;
                this.f1362n = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @dd
    public V putIfAbsent(K k2, V v2) {
        V v3 = get(k2);
        return v3 == null ? put(k2, v2) : v3;
    }

    @dd
    public V remove(Object obj) {
        int iF7l8 = f7l8(obj);
        if (iF7l8 >= 0) {
            return n7h(iF7l8);
        }
        return null;
    }

    @dd
    public V replace(K k2, V v2) {
        int iF7l8 = f7l8(k2);
        if (iF7l8 >= 0) {
            return kja0(iF7l8, v2);
        }
        return null;
    }

    public int size() {
        return this.f1362n;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1362n * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1362n; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kLd6 = ld6(i2);
            if (kLd6 != this) {
                sb.append(kLd6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM873h = m873h(i2);
            if (vM873h != this) {
                sb.append(vM873h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void x2(@lvui qrj<? extends K, ? extends V> qrjVar) {
        int i2 = qrjVar.f1362n;
        zy(this.f1362n + i2);
        if (this.f1362n != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(qrjVar.ld6(i3), qrjVar.m873h(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(qrjVar.f1361k, 0, this.f1361k, 0, i2);
            System.arraycopy(qrjVar.f1363q, 0, this.f1363q, 0, i2 << 1);
            this.f1362n = i2;
        }
    }

    /* JADX INFO: renamed from: y */
    int m875y() {
        int i2 = this.f1362n;
        if (i2 == 0) {
            return -1;
        }
        int qVar = toq(this.f1361k, i2, 0);
        if (qVar < 0 || this.f1363q[qVar << 1] == null) {
            return qVar;
        }
        int i3 = qVar + 1;
        while (i3 < i2 && this.f1361k[i3] == 0) {
            if (this.f1363q[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = qVar - 1; i4 >= 0 && this.f1361k[i4] == 0; i4--) {
            if (this.f1363q[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public void zy(int i2) {
        int i3 = this.f1362n;
        int[] iArr = this.f1361k;
        if (iArr.length < i2) {
            Object[] objArr = this.f1363q;
            m870k(i2);
            if (this.f1362n > 0) {
                System.arraycopy(iArr, 0, this.f1361k, 0, i3);
                System.arraycopy(objArr, 0, this.f1363q, 0, i3 << 1);
            }
            m871q(iArr, objArr, i3);
        }
        if (this.f1362n != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean remove(Object obj, Object obj2) {
        int iF7l8 = f7l8(obj);
        if (iF7l8 < 0) {
            return false;
        }
        V vM873h = m873h(iF7l8);
        if (obj2 != vM873h && (obj2 == null || !obj2.equals(vM873h))) {
            return false;
        }
        n7h(iF7l8);
        return true;
    }

    public boolean replace(K k2, V v2, V v3) {
        int iF7l8 = f7l8(k2);
        if (iF7l8 < 0) {
            return false;
        }
        V vM873h = m873h(iF7l8);
        if (vM873h != v2 && (v2 == null || !v2.equals(vM873h))) {
            return false;
        }
        kja0(iF7l8, v3);
        return true;
    }

    public qrj(int i2) {
        if (i2 == 0) {
            this.f1361k = f7l8.f1317k;
            this.f1363q = f7l8.f47030zy;
        } else {
            m870k(i2);
        }
        this.f1362n = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qrj(qrj<K, V> qrjVar) {
        this();
        if (qrjVar != 0) {
            x2(qrjVar);
        }
    }
}
