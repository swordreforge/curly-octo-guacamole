package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.n */
/* JADX INFO: compiled from: CircularArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0249n<E> {

    /* JADX INFO: renamed from: k */
    private E[] f1341k;

    /* JADX INFO: renamed from: q */
    private int f1342q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47036toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47037zy;

    public C0249n() {
        this(8);
    }

    /* JADX INFO: renamed from: q */
    private void m844q() {
        E[] eArr = this.f1341k;
        int length = eArr.length;
        int i2 = this.f47036toq;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i4];
        System.arraycopy(eArr, i2, eArr2, 0, i3);
        System.arraycopy(this.f1341k, 0, eArr2, i3, this.f47036toq);
        this.f1341k = eArr2;
        this.f47036toq = 0;
        this.f47037zy = length;
        this.f1342q = i4 - 1;
    }

    public E f7l8() {
        int i2 = this.f47036toq;
        int i3 = this.f47037zy;
        if (i2 != i3) {
            return this.f1341k[(i3 - 1) & this.f1342q];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: g */
    public E m845g() {
        int i2 = this.f47036toq;
        if (i2 != this.f47037zy) {
            return this.f1341k[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: k */
    public void m846k(E e2) {
        int i2 = (this.f47036toq - 1) & this.f1342q;
        this.f47036toq = i2;
        this.f1341k[i2] = e2;
        if (i2 == this.f47037zy) {
            m844q();
        }
    }

    public void ld6(int i2) {
        int i3;
        if (i2 <= 0) {
            return;
        }
        if (i2 > qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f47037zy;
        int i5 = i2 < i4 ? i4 - i2 : 0;
        int i6 = i5;
        while (true) {
            i3 = this.f47037zy;
            if (i6 >= i3) {
                break;
            }
            this.f1341k[i6] = null;
            i6++;
        }
        int i7 = i3 - i5;
        int i8 = i2 - i7;
        this.f47037zy = i3 - i7;
        if (i8 > 0) {
            int length = this.f1341k.length;
            this.f47037zy = length;
            int i9 = length - i8;
            for (int i10 = i9; i10 < this.f47037zy; i10++) {
                this.f1341k[i10] = null;
            }
            this.f47037zy = i9;
        }
    }

    /* JADX INFO: renamed from: n */
    public E m847n(int i2) {
        if (i2 < 0 || i2 >= qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1341k[this.f1342q & (this.f47036toq + i2)];
    }

    /* JADX INFO: renamed from: p */
    public E m848p() {
        int i2 = this.f47036toq;
        int i3 = this.f47037zy;
        if (i2 == i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f1342q & (i3 - 1);
        E[] eArr = this.f1341k;
        E e2 = eArr[i4];
        eArr[i4] = null;
        this.f47037zy = i4;
        return e2;
    }

    public int qrj() {
        return (this.f47037zy - this.f47036toq) & this.f1342q;
    }

    /* JADX INFO: renamed from: s */
    public E m849s() {
        int i2 = this.f47036toq;
        if (i2 == this.f47037zy) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f1341k;
        E e2 = eArr[i2];
        eArr[i2] = null;
        this.f47036toq = (i2 + 1) & this.f1342q;
        return e2;
    }

    public void toq(E e2) {
        E[] eArr = this.f1341k;
        int i2 = this.f47037zy;
        eArr[i2] = e2;
        int i3 = this.f1342q & (i2 + 1);
        this.f47037zy = i3;
        if (i3 == this.f47036toq) {
            m844q();
        }
    }

    public void x2(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f1341k.length;
        int i3 = this.f47036toq;
        if (i2 < length - i3) {
            length = i3 + i2;
        }
        while (i3 < length) {
            this.f1341k[i3] = null;
            i3++;
        }
        int i4 = this.f47036toq;
        int i5 = length - i4;
        int i6 = i2 - i5;
        this.f47036toq = this.f1342q & (i4 + i5);
        if (i6 > 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                this.f1341k[i7] = null;
            }
            this.f47036toq = i6;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m850y() {
        return this.f47036toq == this.f47037zy;
    }

    public void zy() {
        x2(qrj());
    }

    public C0249n(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.f1342q = i2 - 1;
        this.f1341k = (E[]) new Object[i2];
    }
}
