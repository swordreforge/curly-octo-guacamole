package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Rectangle.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    public int f2076k;

    /* JADX INFO: renamed from: q */
    public int f2077q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f47956toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f47957zy;

    /* JADX INFO: renamed from: g */
    public void m1345g(int i2, int i3, int i4, int i5) {
        this.f2076k = i2;
        this.f47956toq = i3;
        this.f47957zy = i4;
        this.f2077q = i5;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1346k(int i2, int i3) {
        int i4;
        int i5 = this.f2076k;
        return i2 >= i5 && i2 < i5 + this.f47957zy && i3 >= (i4 = this.f47956toq) && i3 < i4 + this.f2077q;
    }

    /* JADX INFO: renamed from: n */
    boolean m1347n(qrj qrjVar) {
        int i2;
        int i3;
        int i4 = this.f2076k;
        int i5 = qrjVar.f2076k;
        return i4 >= i5 && i4 < i5 + qrjVar.f47957zy && (i2 = this.f47956toq) >= (i3 = qrjVar.f47956toq) && i2 < i3 + qrjVar.f2077q;
    }

    /* JADX INFO: renamed from: q */
    void m1348q(int i2, int i3) {
        this.f2076k -= i2;
        this.f47956toq -= i3;
        this.f47957zy += i2 * 2;
        this.f2077q += i3 * 2;
    }

    public int toq() {
        return (this.f2076k + this.f47957zy) / 2;
    }

    public int zy() {
        return (this.f47956toq + this.f2077q) / 2;
    }
}
