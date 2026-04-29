package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0318k;
import androidx.constraintlayout.core.state.C0324y;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.y */
/* JADX INFO: compiled from: VerticalChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class C0316y extends C0315q {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.y$k */
    /* JADX INFO: compiled from: VerticalChainReference.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1900k;

        static {
            int[] iArr = new int[C0324y.toq.values().length];
            f1900k = iArr;
            try {
                iArr[C0324y.toq.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1900k[C0324y.toq.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1900k[C0324y.toq.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0316y(C0324y c0324y) {
        super(c0324y, C0324y.n.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.zy, androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        Iterator<Object> it = this.f47686a98o.iterator();
        while (it.hasNext()) {
            this.f47687bf2.m1239n(it.next()).zurt();
        }
        Iterator<Object> it2 = this.f47686a98o.iterator();
        C0318k c0318k = null;
        C0318k c0318k2 = null;
        while (it2.hasNext()) {
            C0318k c0318kM1239n = this.f47687bf2.m1239n(it2.next());
            if (c0318k2 == null) {
                Object obj = this.f47644n5r1;
                if (obj != null) {
                    c0318kM1239n.mu(obj).hb(this.f47639kja0).m1205o(this.f47630fn3e);
                } else {
                    Object obj2 = this.f47635hyr;
                    if (obj2 != null) {
                        c0318kM1239n.m1196d(obj2).hb(this.f47639kja0).m1205o(this.f47630fn3e);
                    } else {
                        c0318kM1239n.mu(C0324y.f1943p);
                    }
                }
                c0318k2 = c0318kM1239n;
            }
            if (c0318k != null) {
                c0318k.m1200h(c0318kM1239n.getKey());
                c0318kM1239n.m1196d(c0318k.getKey());
            }
            c0318k = c0318kM1239n;
        }
        if (c0318k != null) {
            Object obj3 = this.f1906f;
            if (obj3 != null) {
                c0318k.m1200h(obj3).hb(this.f1908h).m1205o(this.f47661zurt);
            } else {
                Object obj4 = this.f1904c;
                if (obj4 != null) {
                    c0318k.kja0(obj4).hb(this.f1908h).m1205o(this.f47661zurt);
                } else {
                    c0318k.kja0(C0324y.f1943p);
                }
            }
        }
        if (c0318k2 == null) {
            return;
        }
        float f2 = this.f47618zp;
        if (f2 != 0.5f) {
            c0318k2.tfm(f2);
        }
        int i2 = k.f1900k[this.f1899x.ordinal()];
        if (i2 == 1) {
            c0318k2.bo(0);
        } else if (i2 == 2) {
            c0318k2.bo(1);
        } else {
            if (i2 != 3) {
                return;
            }
            c0318k2.bo(2);
        }
    }
}
