package com.miui.clock.magazine;

import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;

/* JADX INFO: renamed from: com.miui.clock.magazine.q */
/* JADX INFO: compiled from: MiuiMagazineAInfoBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5064q extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f71880dd = 1;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected int f71881x9kr;

    public AbstractC5064q(ClockBean clockBean) {
        lvui(clockBean);
    }

    private void lvui(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        gvn7(clockBean.getPrimaryColor());
        jk(clockBean.getInfoAreaColor());
        m17698r(clockBean.getStyle());
        o1t(clockBean.isAutoPrimaryColor());
        mcp(clockBean.isDisableContainerPassBlur());
    }

    public int d2ok() {
        return this.f71881x9kr;
    }

    public int eqxt() {
        return this.f71880dd;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public String kja0() {
        return "magazine_a";
    }

    /* JADX INFO: renamed from: r */
    public void m17698r(int i2) {
        this.f71880dd = i2;
    }
}
