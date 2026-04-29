package com.miui.clock.graffiti;

import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;

/* JADX INFO: renamed from: com.miui.clock.graffiti.q */
/* JADX INFO: compiled from: MiuiGraffitiClockInfoBase.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5051q extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    int f71855dd = 1;

    public C5051q(ClockBean clockBean) {
        d2ok(clockBean);
    }

    private void d2ok(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        gvn7(clockBean.getPrimaryColor());
        o1t(clockBean.isAutoPrimaryColor());
        lvui(clockBean.getStyle());
    }

    public int eqxt() {
        return this.f71855dd;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public String kja0() {
        return "doodle";
    }

    public void lvui(int i2) {
        this.f71855dd = i2;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    /* JADX INFO: renamed from: y */
    public int mo17647y() {
        return C5049g.f7l8.f70953t8r;
    }
}
