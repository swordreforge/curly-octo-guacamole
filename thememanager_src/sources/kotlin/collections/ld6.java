package kotlin.collections;

import cyoe.InterfaceC5979h;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {kotlin.ki.class})
@kotlin.jvm.internal.lv5({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
@kotlin.yz(version = "1.4")
public final class ld6<E> extends AbstractC6143g<E> {

    /* JADX INFO: renamed from: p */
    private static final int f36173p = 10;

    /* JADX INFO: renamed from: s */
    private static final int f36174s = 2147483639;

    /* JADX INFO: renamed from: k */
    private int f36176k;

    /* JADX INFO: renamed from: n */
    private int f36177n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private Object[] f36178q;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C6154k f36172g = new C6154k(null);

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final Object[] f36175y = new Object[0];

    /* JADX INFO: renamed from: kotlin.collections.ld6$k */
    /* JADX INFO: compiled from: ArrayDeque.kt */
    public static final class C6154k {
        private C6154k() {
        }

        public /* synthetic */ C6154k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final int m22550k(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - ld6.f36174s <= 0) {
                return i4;
            }
            if (i3 > ld6.f36174s) {
                return Integer.MAX_VALUE;
            }
            return ld6.f36174s;
        }
    }

    public ld6(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = f36175y;
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i2);
            }
            objArr = new Object[i2];
        }
        this.f36178q = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean f7l8(cyoe.x2<? super E, Boolean> x2Var) {
        int iKja0;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if ((this.f36178q.length == 0) == false) {
                int iKja02 = kja0(this.f36176k + size());
                int i2 = this.f36176k;
                if (i2 < iKja02) {
                    iKja0 = i2;
                    while (i2 < iKja02) {
                        Object obj = this.f36178q[i2];
                        if (x2Var.invoke(obj).booleanValue()) {
                            this.f36178q[iKja0] = obj;
                            iKja0++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    kja0.vy(this.f36178q, null, iKja0, iKja02);
                } else {
                    int length = this.f36178q.length;
                    boolean z3 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr = this.f36178q;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (x2Var.invoke(obj2).booleanValue()) {
                            this.f36178q[i3] = obj2;
                            i3++;
                        } else {
                            z3 = true;
                        }
                        i2++;
                    }
                    iKja0 = kja0(i3);
                    for (int i4 = 0; i4 < iKja02; i4++) {
                        Object[] objArr2 = this.f36178q;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (x2Var.invoke(obj3).booleanValue()) {
                            this.f36178q[iKja0] = obj3;
                            iKja0 = m22546s(iKja0);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.f36177n = n7h(iKja0 - this.f36176k);
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: g */
    private final void m22543g(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f36178q;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f36175y) {
            this.f36178q = new Object[kotlin.ranges.fn3e.fn3e(i2, 10)];
        } else {
            toq(f36172g.m22550k(objArr.length, i2));
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m22544k(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f36178q.length;
        while (i2 < length && it.hasNext()) {
            this.f36178q[i2] = it.next();
            i2++;
        }
        int i3 = this.f36176k;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f36178q[i4] = it.next();
        }
        this.f36177n = size() + collection.size();
    }

    private final int kja0(int i2) {
        Object[] objArr = this.f36178q;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @InterfaceC6234g
    private final int ld6(int i2) {
        return kja0(this.f36176k + i2);
    }

    private final int n7h(int i2) {
        return i2 < 0 ? i2 + this.f36178q.length : i2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private final E m22545p(int i2) {
        return (E) this.f36178q[i2];
    }

    /* JADX INFO: renamed from: s */
    private final int m22546s(int i2) {
        if (i2 == C6144h.gjp(this.f36178q)) {
            return 0;
        }
        return i2 + 1;
    }

    private final void toq(int i2) {
        Object[] objArr = new Object[i2];
        Object[] objArr2 = this.f36178q;
        kja0.ikck(objArr2, objArr, 0, this.f36176k, objArr2.length);
        Object[] objArr3 = this.f36178q;
        int length = objArr3.length;
        int i3 = this.f36176k;
        kja0.ikck(objArr3, objArr, length - i3, 0, i3);
        this.f36176k = 0;
        this.f36178q = objArr;
    }

    private final int zy(int i2) {
        return i2 == 0 ? C6144h.gjp(this.f36178q) : i2 - 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@InterfaceC7396q Collection<? extends E> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m22543g(size() + elements.size());
        m22544k(kja0(this.f36176k + size()), elements);
        return true;
    }

    public final void addFirst(E e2) {
        m22543g(size() + 1);
        int iZy = zy(this.f36176k);
        this.f36176k = iZy;
        this.f36178q[iZy] = e2;
        this.f36177n = size() + 1;
    }

    public final void addLast(E e2) {
        m22543g(size() + 1);
        this.f36178q[kja0(this.f36176k + size())] = e2;
        this.f36177n = size() + 1;
    }

    @InterfaceC7395n
    public final E cdj() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iKja0 = kja0(this.f36176k + size());
        int i2 = this.f36176k;
        if (i2 < iKja0) {
            kja0.vy(this.f36178q, null, i2, iKja0);
        } else if (!isEmpty()) {
            Object[] objArr = this.f36178q;
            kja0.vy(objArr, null, this.f36176k, objArr.length);
            kja0.vy(this.f36178q, null, 0, iKja0);
        }
        this.f36176k = 0;
        this.f36177n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f36178q[this.f36176k];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        zy.Companion.toq(i2, size());
        return (E) this.f36178q[kja0(this.f36176k + i2)];
    }

    @Override // kotlin.collections.AbstractC6143g
    public int getSize() {
        return this.f36177n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    public final E m22547h() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final <T> T[] m22548i(@InterfaceC7396q T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i2;
        int iKja0 = kja0(this.f36176k + size());
        int length = this.f36176k;
        if (length < iKja0) {
            while (length < iKja0) {
                if (kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[length])) {
                    i2 = this.f36176k;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iKja0) {
            return -1;
        }
        int length2 = this.f36178q.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iKja0; i3++) {
                    if (kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[i3])) {
                        length = i3 + this.f36178q.length;
                        i2 = this.f36176k;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[length])) {
                i2 = this.f36176k;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f36178q[kja0(this.f36176k + ni7.jp0y(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iGjp;
        int i2;
        int iKja0 = kja0(this.f36176k + size());
        int i3 = this.f36176k;
        if (i3 < iKja0) {
            iGjp = iKja0 - 1;
            if (i3 <= iGjp) {
                while (!kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[iGjp])) {
                    if (iGjp != i3) {
                        iGjp--;
                    }
                }
                i2 = this.f36176k;
                return iGjp - i2;
            }
            return -1;
        }
        if (i3 > iKja0) {
            int i4 = iKja0 - 1;
            while (true) {
                if (-1 >= i4) {
                    iGjp = C6144h.gjp(this.f36178q);
                    int i5 = this.f36176k;
                    if (i5 <= iGjp) {
                        while (!kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[iGjp])) {
                            if (iGjp != i5) {
                                iGjp--;
                            }
                        }
                        i2 = this.f36176k;
                    }
                } else {
                    if (kotlin.jvm.internal.d2ok.f7l8(obj, this.f36178q[i4])) {
                        iGjp = i4 + this.f36178q.length;
                        i2 = this.f36176k;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @InterfaceC7395n
    public final E qrj() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f36178q[kja0(this.f36176k + ni7.jp0y(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        int iKja0;
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if ((this.f36178q.length == 0) == false) {
                int iKja02 = kja0(this.f36176k + size());
                int i2 = this.f36176k;
                if (i2 < iKja02) {
                    iKja0 = i2;
                    while (i2 < iKja02) {
                        Object obj = this.f36178q[i2];
                        if (!elements.contains(obj)) {
                            this.f36178q[iKja0] = obj;
                            iKja0++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    kja0.vy(this.f36178q, null, iKja0, iKja02);
                } else {
                    int length = this.f36178q.length;
                    boolean z3 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr = this.f36178q;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (!elements.contains(obj2)) {
                            this.f36178q[i3] = obj2;
                            i3++;
                        } else {
                            z3 = true;
                        }
                        i2++;
                    }
                    iKja0 = kja0(i3);
                    for (int i4 = 0; i4 < iKja02; i4++) {
                        Object[] objArr2 = this.f36178q;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (!elements.contains(obj3)) {
                            this.f36178q[iKja0] = obj3;
                            iKja0 = m22546s(iKja0);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.f36177n = n7h(iKja0 - this.f36176k);
                }
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractC6143g
    public E removeAt(int i2) {
        zy.Companion.toq(i2, size());
        if (i2 == ni7.jp0y(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int iKja0 = kja0(this.f36176k + i2);
        E e2 = (E) this.f36178q[iKja0];
        if (i2 < (size() >> 1)) {
            int i3 = this.f36176k;
            if (iKja0 >= i3) {
                Object[] objArr = this.f36178q;
                kja0.ikck(objArr, objArr, i3 + 1, i3, iKja0);
            } else {
                Object[] objArr2 = this.f36178q;
                kja0.ikck(objArr2, objArr2, 1, 0, iKja0);
                Object[] objArr3 = this.f36178q;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f36176k;
                kja0.ikck(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f36178q;
            int i5 = this.f36176k;
            objArr4[i5] = null;
            this.f36176k = m22546s(i5);
        } else {
            int iKja02 = kja0(this.f36176k + ni7.jp0y(this));
            if (iKja0 <= iKja02) {
                Object[] objArr5 = this.f36178q;
                kja0.ikck(objArr5, objArr5, iKja0, iKja0 + 1, iKja02 + 1);
            } else {
                Object[] objArr6 = this.f36178q;
                kja0.ikck(objArr6, objArr6, iKja0, iKja0 + 1, objArr6.length);
                Object[] objArr7 = this.f36178q;
                objArr7[objArr7.length - 1] = objArr7[0];
                kja0.ikck(objArr7, objArr7, 0, 1, iKja02 + 1);
            }
            this.f36178q[iKja02] = null;
        }
        this.f36177n = size() - 1;
        return e2;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f36178q;
        int i2 = this.f36176k;
        E e2 = (E) objArr[i2];
        objArr[i2] = null;
        this.f36176k = m22546s(i2);
        this.f36177n = size() - 1;
        return e2;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iKja0 = kja0(this.f36176k + ni7.jp0y(this));
        Object[] objArr = this.f36178q;
        E e2 = (E) objArr[iKja0];
        objArr[iKja0] = null;
        this.f36177n = size() - 1;
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        int iKja0;
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty()) {
            if ((this.f36178q.length == 0) == false) {
                int iKja02 = kja0(this.f36176k + size());
                int i2 = this.f36176k;
                if (i2 < iKja02) {
                    iKja0 = i2;
                    while (i2 < iKja02) {
                        Object obj = this.f36178q[i2];
                        if (elements.contains(obj)) {
                            this.f36178q[iKja0] = obj;
                            iKja0++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    kja0.vy(this.f36178q, null, iKja0, iKja02);
                } else {
                    int length = this.f36178q.length;
                    boolean z3 = false;
                    int i3 = i2;
                    while (i2 < length) {
                        Object[] objArr = this.f36178q;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (elements.contains(obj2)) {
                            this.f36178q[i3] = obj2;
                            i3++;
                        } else {
                            z3 = true;
                        }
                        i2++;
                    }
                    iKja0 = kja0(i3);
                    for (int i4 = 0; i4 < iKja02; i4++) {
                        Object[] objArr2 = this.f36178q;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (elements.contains(obj3)) {
                            this.f36178q[iKja0] = obj3;
                            iKja0 = m22546s(iKja0);
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    this.f36177n = n7h(iKja0 - this.f36176k);
                }
            }
        }
        return z2;
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        zy.Companion.toq(i2, size());
        int iKja0 = kja0(this.f36176k + i2);
        Object[] objArr = this.f36178q;
        E e3 = (E) objArr[iKja0];
        objArr[iKja0] = e2;
        return e3;
    }

    @InterfaceC7396q
    public final Object[] t8r() {
        return toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC7396q
    public <T> T[] toArray(@InterfaceC7396q T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        if (array.length < size()) {
            array = (T[]) qrj.m22602k(array, size());
        }
        int iKja0 = kja0(this.f36176k + size());
        int i2 = this.f36176k;
        if (i2 < iKja0) {
            kja0.d8wk(this.f36178q, array, 0, i2, iKja0, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f36178q;
            kja0.ikck(objArr, array, 0, this.f36176k, objArr.length);
            Object[] objArr2 = this.f36178q;
            kja0.ikck(objArr2, array, objArr2.length - this.f36176k, 0, iKja0);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public final void x2(@InterfaceC7396q InterfaceC5979h<? super Integer, ? super Object[], was> structure) {
        int i2;
        kotlin.jvm.internal.d2ok.m23075h(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i2 = this.f36176k) < kja0(this.f36176k + size())) ? this.f36176k : i2 - this.f36178q.length), toArray());
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final E m22549y() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f36178q[this.f36176k];
    }

    @Override // kotlin.collections.AbstractC6143g, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        zy.Companion.zy(i2, size());
        if (i2 == size()) {
            addLast(e2);
            return;
        }
        if (i2 == 0) {
            addFirst(e2);
            return;
        }
        m22543g(size() + 1);
        int iKja0 = kja0(this.f36176k + i2);
        if (i2 < ((size() + 1) >> 1)) {
            int iZy = zy(iKja0);
            int iZy2 = zy(this.f36176k);
            int i3 = this.f36176k;
            if (iZy >= i3) {
                Object[] objArr = this.f36178q;
                objArr[iZy2] = objArr[i3];
                kja0.ikck(objArr, objArr, i3, i3 + 1, iZy + 1);
            } else {
                Object[] objArr2 = this.f36178q;
                kja0.ikck(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.f36178q;
                objArr3[objArr3.length - 1] = objArr3[0];
                kja0.ikck(objArr3, objArr3, 0, 1, iZy + 1);
            }
            this.f36178q[iZy] = e2;
            this.f36176k = iZy2;
        } else {
            int iKja02 = kja0(this.f36176k + size());
            if (iKja0 < iKja02) {
                Object[] objArr4 = this.f36178q;
                kja0.ikck(objArr4, objArr4, iKja0 + 1, iKja0, iKja02);
            } else {
                Object[] objArr5 = this.f36178q;
                kja0.ikck(objArr5, objArr5, 1, 0, iKja02);
                Object[] objArr6 = this.f36178q;
                objArr6[0] = objArr6[objArr6.length - 1];
                kja0.ikck(objArr6, objArr6, iKja0 + 1, iKja0, objArr6.length - 1);
            }
            this.f36178q[iKja0] = e2;
        }
        this.f36177n = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, @InterfaceC7396q Collection<? extends E> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        zy.Companion.zy(i2, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(elements);
        }
        m22543g(size() + elements.size());
        int iKja0 = kja0(this.f36176k + size());
        int iKja02 = kja0(this.f36176k + i2);
        int size = elements.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.f36176k;
            int length = i3 - size;
            if (iKja02 < i3) {
                Object[] objArr = this.f36178q;
                kja0.ikck(objArr, objArr, length, i3, objArr.length);
                if (size >= iKja02) {
                    Object[] objArr2 = this.f36178q;
                    kja0.ikck(objArr2, objArr2, objArr2.length - size, 0, iKja02);
                } else {
                    Object[] objArr3 = this.f36178q;
                    kja0.ikck(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f36178q;
                    kja0.ikck(objArr4, objArr4, 0, size, iKja02);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f36178q;
                kja0.ikck(objArr5, objArr5, length, i3, iKja02);
            } else {
                Object[] objArr6 = this.f36178q;
                length += objArr6.length;
                int i4 = iKja02 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    kja0.ikck(objArr6, objArr6, length, i3, iKja02);
                } else {
                    kja0.ikck(objArr6, objArr6, length, i3, i3 + length2);
                    Object[] objArr7 = this.f36178q;
                    kja0.ikck(objArr7, objArr7, 0, this.f36176k + length2, iKja02);
                }
            }
            this.f36176k = length;
            m22544k(n7h(iKja02 - size), elements);
        } else {
            int i5 = iKja02 + size;
            if (iKja02 < iKja0) {
                int i6 = size + iKja0;
                Object[] objArr8 = this.f36178q;
                if (i6 <= objArr8.length) {
                    kja0.ikck(objArr8, objArr8, i5, iKja02, iKja0);
                } else if (i5 >= objArr8.length) {
                    kja0.ikck(objArr8, objArr8, i5 - objArr8.length, iKja02, iKja0);
                } else {
                    int length3 = iKja0 - (i6 - objArr8.length);
                    kja0.ikck(objArr8, objArr8, 0, length3, iKja0);
                    Object[] objArr9 = this.f36178q;
                    kja0.ikck(objArr9, objArr9, i5, iKja02, length3);
                }
            } else {
                Object[] objArr10 = this.f36178q;
                kja0.ikck(objArr10, objArr10, size, 0, iKja0);
                Object[] objArr11 = this.f36178q;
                if (i5 >= objArr11.length) {
                    kja0.ikck(objArr11, objArr11, i5 - objArr11.length, iKja02, objArr11.length);
                } else {
                    kja0.ikck(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f36178q;
                    kja0.ikck(objArr12, objArr12, i5, iKja02, objArr12.length - size);
                }
            }
            m22544k(iKja02, elements);
        }
        return true;
    }

    public ld6() {
        this.f36178q = f36175y;
    }

    public ld6(@InterfaceC7396q Collection<? extends E> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f36178q = array;
        this.f36177n = array.length;
        if (array.length == 0) {
            this.f36178q = f36175y;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC7396q
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
