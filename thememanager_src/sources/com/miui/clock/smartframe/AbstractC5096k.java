package com.miui.clock.smartframe;

import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;

/* JADX INFO: renamed from: com.miui.clock.smartframe.k */
/* JADX INFO: compiled from: MiuiSmartFrameClockBaseInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5096k extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f72037dd = 1;

    public AbstractC5096k(ClockBean clockBean) {
        d2ok(clockBean);
    }

    private void d2ok(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        gvn7(clockBean.getPrimaryColor());
        lvui(clockBean.getStyle());
        o1t(clockBean.isAutoPrimaryColor());
        d3(clockBean.getSecondaryColor());
        wvg(clockBean.isAutoSecondaryColor());
    }

    public int eqxt() {
        return this.f72037dd;
    }

    public void lvui(int i2) {
        this.f72037dd = i2;
    }
}
