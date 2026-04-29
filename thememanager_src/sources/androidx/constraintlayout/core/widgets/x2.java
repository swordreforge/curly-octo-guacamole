package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.widgets.C0343q;

/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends n7h {
    @Override // androidx.constraintlayout.core.widgets.n7h
    public void el(int i2, int i3, int i4, int i5) {
        int iR6ty = r6ty() + yp31() + 0;
        int iZff0 = zff0() + cyoe() + 0;
        if (this.f47951zwy > 0) {
            iR6ty += this.f47950nsb[0].m1313a();
            iZff0 += this.f47950nsb[0].jk();
        }
        int iMax = Math.max(ncyb(), iR6ty);
        int iMax2 = Math.max(x9kr(), iZff0);
        if (i2 != 1073741824) {
            i3 = i2 == Integer.MIN_VALUE ? Math.min(iMax, i3) : i2 == 0 ? iMax : 0;
        }
        if (i4 != 1073741824) {
            i5 = i4 == Integer.MIN_VALUE ? Math.min(iMax2, i5) : i4 == 0 ? iMax2 : 0;
        }
        f1bi(i3, i5);
        m2t(i3);
        pc(i5);
        bqie(this.f47951zwy > 0);
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void f7l8(C0296n c0296n, boolean z2) {
        super.f7l8(c0296n, z2);
        if (this.f47951zwy > 0) {
            C0341n c0341n = this.f47950nsb[0];
            c0341n.r8s8();
            C0343q.toq toqVar = C0343q.toq.LEFT;
            c0341n.m1325p(toqVar, this, toqVar);
            C0343q.toq toqVar2 = C0343q.toq.RIGHT;
            c0341n.m1325p(toqVar2, this, toqVar2);
            C0343q.toq toqVar3 = C0343q.toq.TOP;
            c0341n.m1325p(toqVar3, this, toqVar3);
            C0343q.toq toqVar4 = C0343q.toq.BOTTOM;
            c0341n.m1325p(toqVar4, this, toqVar4);
        }
    }
}
