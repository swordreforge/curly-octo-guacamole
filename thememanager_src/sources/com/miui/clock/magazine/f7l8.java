package com.miui.clock.magazine;

import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import gcp.C6066y;

/* JADX INFO: compiled from: MiuiMagazineBBaseInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f7l8 extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected int f71874dd;

    public f7l8(ClockBean clockBean, int i2) {
        this.f71874dd = i2;
        d2ok(clockBean);
    }

    private void d2ok(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        if (this.f71874dd == 1) {
            gvn7(C6066y.m22346k(clockBean.getPrimaryColor()));
        } else {
            gvn7(clockBean.getPrimaryColor());
        }
        jk(clockBean.getInfoAreaColor());
        o1t(clockBean.isAutoPrimaryColor());
        mcp(clockBean.isDisableContainerPassBlur());
    }

    public int eqxt() {
        return this.f71874dd;
    }
}
