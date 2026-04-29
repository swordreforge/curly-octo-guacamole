package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0318k;
import androidx.constraintlayout.core.state.C0324y;
import java.util.Iterator;

/* JADX INFO: compiled from: HorizontalChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends C0315q {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.f7l8$k */
    /* JADX INFO: compiled from: HorizontalChainReference.java */
    static /* synthetic */ class C0311k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1894k;

        static {
            int[] iArr = new int[C0324y.toq.values().length];
            f1894k = iArr;
            try {
                iArr[C0324y.toq.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1894k[C0324y.toq.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1894k[C0324y.toq.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f7l8(C0324y c0324y) {
        super(c0324y, C0324y.n.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.zy, androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        Iterator<Object> it = this.f47686a98o.iterator();
        while (it.hasNext()) {
            this.f47687bf2.m1239n(it.next()).fn3e();
        }
        Iterator<Object> it2 = this.f47686a98o.iterator();
        C0318k c0318k = null;
        C0318k c0318k2 = null;
        while (it2.hasNext()) {
            C0318k c0318kM1239n = this.f47687bf2.m1239n(it2.next());
            if (c0318k2 == null) {
                Object obj = this.f47626dd;
                if (obj != null) {
                    c0318kM1239n.m1210v(obj).hb(this.f47651qrj).m1205o(this.f47652t8r);
                } else {
                    Object obj2 = this.f47658x9kr;
                    if (obj2 != null) {
                        c0318kM1239n.xwq3(obj2).hb(this.f47651qrj).m1205o(this.f47652t8r);
                    } else {
                        Object obj3 = this.f47628eqxt;
                        if (obj3 != null) {
                            c0318kM1239n.m1210v(obj3).hb(this.f47640ld6).m1205o(this.f47623cdj);
                        } else {
                            Object obj4 = this.f47624d2ok;
                            if (obj4 != null) {
                                c0318kM1239n.xwq3(obj4).hb(this.f47640ld6).m1205o(this.f47623cdj);
                            } else {
                                c0318kM1239n.m1210v(C0324y.f1943p);
                            }
                        }
                    }
                }
                c0318k2 = c0318kM1239n;
            }
            if (c0318k != null) {
                c0318k.wvg(c0318kM1239n.getKey());
                c0318kM1239n.xwq3(c0318k.getKey());
            }
            c0318k = c0318kM1239n;
        }
        if (c0318k != null) {
            Object obj5 = this.f47646ncyb;
            if (obj5 != null) {
                c0318k.wvg(obj5).hb(this.f47645n7h).m1205o(this.f1909i);
            } else {
                Object obj6 = this.f1912l;
                if (obj6 != null) {
                    c0318k.o1t(obj6).hb(this.f47645n7h).m1205o(this.f1909i);
                } else {
                    Object obj7 = this.f47642lvui;
                    if (obj7 != null) {
                        c0318k.wvg(obj7).hb(this.f47657x2).m1205o(this.f47638ki);
                    } else {
                        Object obj8 = this.f1918r;
                        if (obj8 != null) {
                            c0318k.o1t(obj8).hb(this.f47657x2).m1205o(this.f47638ki);
                        } else {
                            c0318k.o1t(C0324y.f1943p);
                        }
                    }
                }
            }
        }
        if (c0318k2 == null) {
            return;
        }
        float f2 = this.f47618zp;
        if (f2 != 0.5f) {
            c0318k2.uv6(f2);
        }
        int i2 = C0311k.f1894k[this.f1899x.ordinal()];
        if (i2 == 1) {
            c0318k2.lv5(0);
        } else if (i2 == 2) {
            c0318k2.lv5(1);
        } else {
            if (i2 != 3) {
                return;
            }
            c0318k2.lv5(2);
        }
    }
}
