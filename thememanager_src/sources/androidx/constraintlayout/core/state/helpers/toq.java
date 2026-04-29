package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C0318k;
import androidx.constraintlayout.core.state.C0324y;
import java.util.Iterator;

/* JADX INFO: compiled from: AlignVerticallyReference.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends androidx.constraintlayout.core.state.zy {

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private float f47619zp;

    public toq(C0324y c0324y) {
        super(c0324y, C0324y.n.ALIGN_VERTICALLY);
        this.f47619zp = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.zy, androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
        Iterator<Object> it = this.f47686a98o.iterator();
        while (it.hasNext()) {
            C0318k c0318kM1239n = this.f47687bf2.m1239n(it.next());
            c0318kM1239n.zurt();
            Object obj = this.f47644n5r1;
            if (obj != null) {
                c0318kM1239n.mu(obj);
            } else {
                Object obj2 = this.f47635hyr;
                if (obj2 != null) {
                    c0318kM1239n.m1196d(obj2);
                } else {
                    c0318kM1239n.mu(C0324y.f1943p);
                }
            }
            Object obj3 = this.f1906f;
            if (obj3 != null) {
                c0318kM1239n.m1200h(obj3);
            } else {
                Object obj4 = this.f1904c;
                if (obj4 != null) {
                    c0318kM1239n.kja0(obj4);
                } else {
                    c0318kM1239n.kja0(C0324y.f1943p);
                }
            }
            float f2 = this.f47619zp;
            if (f2 != 0.5f) {
                c0318kM1239n.tfm(f2);
            }
        }
    }
}
