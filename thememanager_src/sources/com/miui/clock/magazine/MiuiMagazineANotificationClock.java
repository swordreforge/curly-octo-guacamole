package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.C5049g;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineANotificationClock extends MiuiMagazineABase {
    public MiuiMagazineANotificationClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineABase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.be.getLayoutParams();
        if (this.bd != null) {
            ((ViewGroup.MarginLayoutParams) toqVar).topMargin = hb(C5049g.q.vh);
            this.be.setLayoutParams(toqVar);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        return (hb(C5049g.q.vh) + hb(C5049g.q.sj)) - hb(C5049g.q.bf5);
    }

    public MiuiMagazineANotificationClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
