package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import gcp.C6062n;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineBClock extends MiuiMagazineBBase {
    public MiuiMagazineBClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.x3b);
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        ViewGroup viewGroup = this.be;
        if (viewGroup != null) {
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) viewGroup.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.x3b);
                toqVar.setMarginStart(hb(C5049g.q.xouc));
                toqVar.setMarginEnd(hb(C5049g.q.f26p));
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.zt);
                toqVar.setMarginStart(hb(C5049g.q.jb9));
                toqVar.setMarginEnd(hb(C5049g.q.qppo));
            }
            ((ViewGroup.MarginLayoutParams) toqVar).height = hb(C5049g.q.ydj3);
            this.be.setLayoutParams(toqVar);
        }
    }

    public MiuiMagazineBClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
