package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import gcp.C6062n;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineAClock extends MiuiMagazineABase {
    public MiuiMagazineAClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineABase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.be.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) toqVar).width = hb(C5049g.q.z1r);
        ((ViewGroup.MarginLayoutParams) toqVar).height = hb(C5049g.q.sj);
        if (this.bd != null) {
            int iHb = this.ac ? hb(C5049g.q.rf) : 0;
            if (C6062n.qrj()) {
                ((ViewGroup.MarginLayoutParams) toqVar).bottomMargin = hb(C5049g.q.anw) + iHb;
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).bottomMargin = hb(C5049g.q.iz) + iHb;
            }
            this.be.setLayoutParams(toqVar);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        if (z2) {
            return (hb(C5049g.q.vh) + hb(C5049g.q.sj)) - hb(C5049g.q.bf5);
        }
        return C6062n.f7l8(getContext()).height() - ((C6062n.qrj() ? hb(C5049g.q.anw) : hb(C5049g.q.iz)) + ((this.ac ? hb(C5049g.q.rf) : 0) + hb(C5049g.q.cr3)));
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
    }

    public MiuiMagazineAClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
