package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
class vyq {

    /* JADX INFO: renamed from: s */
    public static final int f1196s = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    private int f1198k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46964toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46965zy = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    private int f1200q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    private int f1199n = 0;

    /* JADX INFO: renamed from: g */
    private int f1197g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f46963f7l8 = false;

    /* JADX INFO: renamed from: y */
    private boolean f1201y = false;

    vyq() {
    }

    public void f7l8(int i2, int i3) {
        this.f46965zy = i2;
        this.f1200q = i3;
        this.f1201y = true;
        if (this.f46963f7l8) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1198k = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f46964toq = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1198k = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f46964toq = i3;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m730g(boolean z2) {
        if (z2 == this.f46963f7l8) {
            return;
        }
        this.f46963f7l8 = z2;
        if (!this.f1201y) {
            this.f1198k = this.f1199n;
            this.f46964toq = this.f1197g;
            return;
        }
        if (z2) {
            int i2 = this.f1200q;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f1199n;
            }
            this.f1198k = i2;
            int i3 = this.f46965zy;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f1197g;
            }
            this.f46964toq = i3;
            return;
        }
        int i4 = this.f46965zy;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f1199n;
        }
        this.f1198k = i4;
        int i5 = this.f1200q;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f1197g;
        }
        this.f46964toq = i5;
    }

    /* JADX INFO: renamed from: k */
    public int m731k() {
        return this.f46963f7l8 ? this.f1198k : this.f46964toq;
    }

    /* JADX INFO: renamed from: n */
    public void m732n(int i2, int i3) {
        this.f1201y = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1199n = i2;
            this.f1198k = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1197g = i3;
            this.f46964toq = i3;
        }
    }

    /* JADX INFO: renamed from: q */
    public int m733q() {
        return this.f46963f7l8 ? this.f46964toq : this.f1198k;
    }

    public int toq() {
        return this.f1198k;
    }

    public int zy() {
        return this.f46964toq;
    }
}
