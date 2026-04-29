package com.miui.clock.module;

import com.miui.clock.C5049g;

/* JADX INFO: compiled from: MiuiDualClockInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class mcp extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected String f71925dd;

    public mcp(ClockBean clockBean) {
        d2ok(clockBean);
    }

    private void d2ok(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        gvn7(clockBean.getPrimaryColor());
        jk(clockBean.getInfoAreaColor());
        this.f71925dd = clockBean.getDualClockLocalCity();
    }

    public String eqxt() {
        return this.f71925dd;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public String kja0() {
        return AbstractC5074q.f71952lvui;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    /* JADX INFO: renamed from: y */
    public int mo17647y() {
        return C5049g.f7l8.f70927d3;
    }
}
