package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0318k;
import androidx.constraintlayout.core.state.C0324y;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.helpers.k */
/* JADX INFO: compiled from: AlignHorizontallyReference.java */
/* JADX INFO: loaded from: classes.dex */
public class C0313k extends androidx.constraintlayout.core.state.zy {

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private float f47617zp;

    public C0313k(C0324y c0324y) {
        super(c0324y, C0324y.n.ALIGN_VERTICALLY);
        this.f47617zp = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.zy, androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        Iterator<Object> it = this.f47686a98o.iterator();
        while (it.hasNext()) {
            C0318k c0318kM1239n = this.f47687bf2.m1239n(it.next());
            c0318kM1239n.fn3e();
            Object obj = this.f47626dd;
            if (obj != null) {
                c0318kM1239n.m1210v(obj);
            } else {
                Object obj2 = this.f47658x9kr;
                if (obj2 != null) {
                    c0318kM1239n.xwq3(obj2);
                } else {
                    c0318kM1239n.m1210v(C0324y.f1943p);
                }
            }
            Object obj3 = this.f47646ncyb;
            if (obj3 != null) {
                c0318kM1239n.wvg(obj3);
            } else {
                Object obj4 = this.f1912l;
                if (obj4 != null) {
                    c0318kM1239n.o1t(obj4);
                } else {
                    c0318kM1239n.o1t(C0324y.f1943p);
                }
            }
            float f2 = this.f47617zp;
            if (f2 != 0.5f) {
                c0318kM1239n.uv6(f2);
            }
        }
    }
}
