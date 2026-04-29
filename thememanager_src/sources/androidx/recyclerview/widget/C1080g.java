package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: compiled from: BatchingListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class C1080g implements zurt {

    /* JADX INFO: renamed from: h */
    private static final int f5868h = 2;

    /* JADX INFO: renamed from: i */
    private static final int f5869i = 3;

    /* JADX INFO: renamed from: p */
    private static final int f5870p = 1;

    /* JADX INFO: renamed from: s */
    private static final int f5871s = 0;

    /* JADX INFO: renamed from: k */
    final zurt f5873k;

    /* JADX INFO: renamed from: q */
    int f5875q = 0;

    /* JADX INFO: renamed from: n */
    int f5874n = -1;

    /* JADX INFO: renamed from: g */
    int f5872g = -1;

    /* JADX INFO: renamed from: y */
    Object f5876y = null;

    public C1080g(@zy.lvui zurt zurtVar) {
        this.f5873k = zurtVar;
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: k */
    public void mo4953k(int i2, int i3) {
        int i4;
        if (this.f5875q == 1 && i2 >= (i4 = this.f5874n)) {
            int i5 = this.f5872g;
            if (i2 <= i4 + i5) {
                this.f5872g = i5 + i3;
                this.f5874n = Math.min(i2, i4);
                return;
            }
        }
        m4986n();
        this.f5874n = i2;
        this.f5872g = i3;
        this.f5875q = 1;
    }

    /* JADX INFO: renamed from: n */
    public void m4986n() {
        int i2 = this.f5875q;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.f5873k.mo4953k(this.f5874n, this.f5872g);
        } else if (i2 == 2) {
            this.f5873k.toq(this.f5874n, this.f5872g);
        } else if (i2 == 3) {
            this.f5873k.zy(this.f5874n, this.f5872g, this.f5876y);
        }
        this.f5876y = null;
        this.f5875q = 0;
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: q */
    public void mo4955q(int i2, int i3) {
        m4986n();
        this.f5873k.mo4955q(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    public void toq(int i2, int i3) {
        int i4;
        if (this.f5875q == 2 && (i4 = this.f5874n) >= i2 && i4 <= i2 + i3) {
            this.f5872g += i3;
            this.f5874n = i2;
        } else {
            m4986n();
            this.f5874n = i2;
            this.f5872g = i3;
            this.f5875q = 2;
        }
    }

    @Override // androidx.recyclerview.widget.zurt
    public void zy(int i2, int i3, Object obj) {
        int i4;
        if (this.f5875q == 3) {
            int i5 = this.f5874n;
            int i6 = this.f5872g;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f5876y == obj) {
                this.f5874n = Math.min(i2, i5);
                this.f5872g = Math.max(i6 + i5, i4) - this.f5874n;
                return;
            }
        }
        m4986n();
        this.f5874n = i2;
        this.f5872g = i3;
        this.f5876y = obj;
        this.f5875q = 3;
    }
}
