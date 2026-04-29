package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0318k;
import androidx.constraintlayout.core.state.C0324y;
import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0342p;

/* JADX INFO: compiled from: BarrierReference.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends androidx.constraintlayout.core.state.zy {

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private C0340k f47620ch;

    /* JADX INFO: renamed from: x */
    private int f1901x;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private C0324y.q f47621zp;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.zy$k */
    /* JADX INFO: compiled from: BarrierReference.java */
    static /* synthetic */ class C0317k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1902k;

        static {
            int[] iArr = new int[C0324y.q.values().length];
            f1902k = iArr;
            try {
                iArr[C0324y.q.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1902k[C0324y.q.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1902k[C0324y.q.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1902k[C0324y.q.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1902k[C0324y.q.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1902k[C0324y.q.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public zy(C0324y c0324y) {
        super(c0324y, C0324y.n.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.zy, androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        was();
        int i2 = C0317k.f1902k[this.f47621zp.ordinal()];
        int i3 = 3;
        if (i2 == 3 || i2 == 4) {
            i3 = 1;
        } else if (i2 == 5) {
            i3 = 2;
        } else if (i2 != 6) {
            i3 = 0;
        }
        this.f47620ch.zff0(i3);
        this.f47620ch.el(this.f1901x);
    }

    @Override // androidx.constraintlayout.core.state.C0318k
    public C0318k hb(int i2) {
        this.f1901x = i2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.C0318k
    /* JADX INFO: renamed from: j */
    public C0318k mo1190j(Object obj) {
        hb(this.f47687bf2.m1235g(obj));
        return this;
    }

    public void py(C0324y.q qVar) {
        this.f47621zp = qVar;
    }

    @Override // androidx.constraintlayout.core.state.zy
    public C0342p was() {
        if (this.f47620ch == null) {
            this.f47620ch = new C0340k();
        }
        return this.f47620ch;
    }
}
