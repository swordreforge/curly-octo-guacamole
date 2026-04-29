package com.miui.clock.magazine;

import android.graphics.Color;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import gcp.C6066y;

/* JADX INFO: renamed from: com.miui.clock.magazine.p */
/* JADX INFO: compiled from: MiuiMagazineCBaseInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5063p extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f71877dd = 5;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected int f71878ncyb;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected boolean f71879x9kr;

    public AbstractC5063p(ClockBean clockBean, int i2) {
        this.f71878ncyb = i2;
        m17697r(clockBean);
    }

    /* JADX INFO: renamed from: r */
    private void m17697r(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        if (this.f71878ncyb == 1) {
            gvn7(C6066y.m22346k(clockBean.getPrimaryColor()));
            d3(C6066y.m22346k(clockBean.getSecondaryColor()));
        } else {
            gvn7(clockBean.getPrimaryColor());
            d3(clockBean.getSecondaryColor());
        }
        dd(clockBean.getStyle());
        x9kr(clockBean.isEnableDiffusion());
        wvg(clockBean.isAutoSecondaryColor());
        o1t(clockBean.isAutoPrimaryColor());
        mcp(clockBean.isDisableContainerPassBlur());
    }

    public int d2ok() {
        return this.f71878ncyb;
    }

    public void dd(int i2) {
        this.f71877dd = i2;
    }

    public int eqxt() {
        return this.f71877dd;
    }

    public boolean lvui() {
        return this.f71879x9kr;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public int n7h() {
        return ni7() ? Color.parseColor("#757575") : super.n7h();
    }

    public void x9kr(boolean z2) {
        this.f71879x9kr = z2;
    }
}
