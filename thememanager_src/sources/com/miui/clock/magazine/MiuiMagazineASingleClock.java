package com.miui.clock.magazine;

import android.content.Context;
import android.util.AttributeSet;
import com.miui.clock.C5049g;
import gcp.C6062n;
import gcp.C6066y;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiMagazineASingleClock extends MiuiMagazineABase {
    public MiuiMagazineASingleClock(Context context) {
        super(context);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineABase, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
    }

    public int getNormalHeight() {
        return hb(C5049g.q.sj);
    }

    public int getNormalMarginOffset() {
        return hb(C5049g.q.iz);
    }

    @Override // com.miui.clock.magazine.MiuiMagazineABase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        AbstractC5064q abstractC5064q = this.bd;
        if (abstractC5064q == null || !abstractC5064q.cdj() || C6062n.x2(this.bl)) {
            return;
        }
        if (C6062n.m22317h(this.bl)) {
            AbstractC5064q abstractC5064q2 = this.bd;
            abstractC5064q2.gvn7(abstractC5064q2.toq());
        } else {
            this.bd.gvn7(C6066y.m22346k(this.bd.qrj()));
        }
        fti();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
        this.bq.setVisibility(8);
    }

    public MiuiMagazineASingleClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
