package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.g */
/* JADX INFO: compiled from: CircularIntArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0246g {

    /* JADX INFO: renamed from: k */
    private int[] f1318k;

    /* JADX INFO: renamed from: q */
    private int f1319q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47031toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47032zy;

    public C0246g() {
        this(8);
    }

    /* JADX INFO: renamed from: q */
    private void m817q() {
        int[] iArr = this.f1318k;
        int length = iArr.length;
        int i2 = this.f47031toq;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.f1318k, 0, iArr2, i3, this.f47031toq);
        this.f1318k = iArr2;
        this.f47031toq = 0;
        this.f47032zy = length;
        this.f1319q = i4 - 1;
    }

    public int f7l8() {
        int i2 = this.f47031toq;
        int i3 = this.f47032zy;
        if (i2 != i3) {
            return this.f1318k[(i3 - 1) & this.f1319q];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: g */
    public int m818g() {
        int i2 = this.f47031toq;
        if (i2 != this.f47032zy) {
            return this.f1318k[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: k */
    public void m819k(int i2) {
        int i3 = (this.f47031toq - 1) & this.f1319q;
        this.f47031toq = i3;
        this.f1318k[i3] = i2;
        if (i3 == this.f47032zy) {
            m817q();
        }
    }

    public void ld6(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f47032zy = this.f1319q & (this.f47032zy - i2);
    }

    /* JADX INFO: renamed from: n */
    public int m820n(int i2) {
        if (i2 < 0 || i2 >= qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1318k[this.f1319q & (this.f47031toq + i2)];
    }

    /* JADX INFO: renamed from: p */
    public int m821p() {
        int i2 = this.f47031toq;
        int i3 = this.f47032zy;
        if (i2 == i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f1319q & (i3 - 1);
        int i5 = this.f1318k[i4];
        this.f47032zy = i4;
        return i5;
    }

    public int qrj() {
        return (this.f47032zy - this.f47031toq) & this.f1319q;
    }

    /* JADX INFO: renamed from: s */
    public int m822s() {
        int i2 = this.f47031toq;
        if (i2 == this.f47032zy) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f1318k[i2];
        this.f47031toq = (i2 + 1) & this.f1319q;
        return i3;
    }

    public void toq(int i2) {
        int[] iArr = this.f1318k;
        int i3 = this.f47032zy;
        iArr[i3] = i2;
        int i4 = this.f1319q & (i3 + 1);
        this.f47032zy = i4;
        if (i4 == this.f47031toq) {
            m817q();
        }
    }

    public void x2(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > qrj()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f47031toq = this.f1319q & (this.f47031toq + i2);
    }

    /* JADX INFO: renamed from: y */
    public boolean m823y() {
        return this.f47031toq == this.f47032zy;
    }

    public void zy() {
        this.f47032zy = this.f47031toq;
    }

    public C0246g(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.f1319q = i2 - 1;
        this.f1318k = new int[i2];
    }
}
