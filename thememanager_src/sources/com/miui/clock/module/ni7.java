package com.miui.clock.module;

import com.miui.clock.C5049g;

/* JADX INFO: compiled from: MiuiClassicClockInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 extends fu4 {

    /* JADX INFO: renamed from: c */
    private int f29188c;

    /* JADX INFO: renamed from: e */
    private boolean f29189e;

    /* JADX INFO: renamed from: f */
    private int f29190f;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private int f71931hyr;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private String f71932lrht;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private ClockBean f71933nn86;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private String f71934uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private String f71935vyq;

    public ni7(ClockBean clockBean) {
        super(clockBean);
        this.f71933nn86 = clockBean;
    }

    /* JADX INFO: renamed from: b */
    public void m17713b(boolean z2) {
        this.f29189e = z2;
    }

    public void bf2(String str) {
        this.f71935vyq = str;
    }

    /* JADX INFO: renamed from: c */
    public int m17714c() {
        return this.f71931hyr;
    }

    /* JADX INFO: renamed from: e */
    public String m17715e() {
        return this.f71934uv6;
    }

    public void ek5k(int i2) {
        this.f29188c = i2;
    }

    @Override // com.miui.clock.module.fu4
    public void eqxt(ClockBean clockBean) {
        super.eqxt(clockBean);
        m17718o(clockBean.getClassicLine3());
        m17717m(clockBean.getClassicLine4());
        ek5k(clockBean.getClassicLine5());
        y9n(clockBean.getClassicSignature());
        yz(clockBean.getPresetHealthJson());
        bf2(clockBean.getPresetWeatherJson());
        m17713b(clockBean.isUnablePresetData());
    }

    public String hb() {
        return this.f71935vyq;
    }

    /* JADX INFO: renamed from: j */
    public boolean m17716j() {
        return this.f29189e;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    public String kja0() {
        return "classic";
    }

    public int lrht() {
        return this.f29190f;
    }

    /* JADX INFO: renamed from: m */
    public void m17717m(int i2) {
        this.f29190f = i2;
    }

    public String nn86() {
        return this.f71932lrht;
    }

    /* JADX INFO: renamed from: o */
    public void m17718o(int i2) {
        this.f71931hyr = i2;
    }

    public int uv6() {
        return this.f29188c;
    }

    public ClockBean vyq() {
        return this.f71933nn86;
    }

    @Override // com.miui.clock.module.AbstractC5074q
    /* JADX INFO: renamed from: y */
    public int mo17647y() {
        return C5049g.f7l8.f70946n7h;
    }

    public void y9n(String str) {
        this.f71932lrht = str;
    }

    public void yz(String str) {
        this.f71934uv6 = str;
    }

    public ni7(ClockBean clockBean, int i2) {
        super(clockBean);
        this.f71933nn86 = clockBean;
        this.f71900n5r1 = i2;
    }

    public ni7() {
    }
}
