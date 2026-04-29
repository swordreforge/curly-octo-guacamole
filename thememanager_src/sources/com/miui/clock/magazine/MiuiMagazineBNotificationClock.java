package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;
import gcp.C6062n;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineBNotificationClock extends MiuiMagazineBBase {
    public MiuiMagazineBNotificationClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.d9i);
    }

    @Override // com.miui.clock.MiuiBaseClock2
    protected void yz() {
        super.yz();
        ViewGroup viewGroup = this.be;
        if (viewGroup != null) {
            ConstraintLayout.toq toqVar = (ConstraintLayout.toq) viewGroup.getLayoutParams();
            if (!C6062n.qrj() || C6062n.m22322s(this.bl)) {
                toqVar.setMarginStart(hb(C5049g.q.qexj));
                toqVar.setMarginEnd(hb(C5049g.q.b6));
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.d9i);
            } else {
                ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.ae4);
                toqVar.setMarginStart(hb(C5049g.q.cb));
                toqVar.setMarginEnd(hb(C5049g.q.ln));
            }
            ((ViewGroup.MarginLayoutParams) toqVar).height = hb(C5049g.q.ydj3);
            this.be.setLayoutParams(toqVar);
        }
    }

    public MiuiMagazineBNotificationClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
