package com.miui.clock.module;

/* JADX INFO: compiled from: MiuiClassicClockInfoBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fu4 extends AbstractC5074q {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected int f71899dd;

    /* JADX INFO: renamed from: l */
    protected boolean f29167l;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    protected int f71900n5r1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected int f71901ncyb;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected int f71902x9kr;

    public fu4(ClockBean clockBean) {
        eqxt(clockBean);
    }

    public int d2ok() {
        return this.f71899dd;
    }

    public int dd() {
        return this.f71900n5r1;
    }

    public void eqxt(ClockBean clockBean) {
        if (clockBean == null) {
            return;
        }
        m17706l(clockBean.getClassicLine1());
        n5r1(clockBean.getClassicLine2());
        gvn7(clockBean.getPrimaryColor());
        d3(clockBean.getSecondaryColor());
        jk(clockBean.getInfoAreaColor());
        m17705f(clockBean.getStyle());
        hyr(clockBean.isEnableDiffusion());
        o1t(clockBean.isAutoPrimaryColor());
        wvg(clockBean.isAutoSecondaryColor());
        mcp(clockBean.isDisableContainerPassBlur());
    }

    /* JADX INFO: renamed from: f */
    public void m17705f(int i2) {
        this.f71901ncyb = i2;
    }

    public void hyr(boolean z2) {
        this.f29167l = z2;
    }

    /* JADX INFO: renamed from: l */
    public void m17706l(int i2) {
        this.f71899dd = i2;
    }

    public int lvui() {
        return this.f71902x9kr;
    }

    public void n5r1(int i2) {
        this.f71902x9kr = i2;
    }

    public boolean ncyb() {
        return this.f29167l;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public int qrj() {
        if (ni7()) {
            return -1;
        }
        return AbstractC5074q.m17719h(dd()) ? m17725q() : super.qrj();
    }

    /* JADX INFO: renamed from: r */
    public int m17707r() {
        if (ni7()) {
            return -1;
        }
        return ki() ? qrj() : n7h() != 0 ? AbstractC5074q.m17719h(dd()) ? m17723n() : n7h() : qrj();
    }

    public int x9kr() {
        if (this.f71901ncyb == 0) {
            this.f71901ncyb = 21;
        }
        return this.f71901ncyb;
    }

    public fu4() {
    }
}
