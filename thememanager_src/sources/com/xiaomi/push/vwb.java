package com.xiaomi.push;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class vwb extends xtb7 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private String f73710cdj;

    /* JADX INFO: renamed from: h */
    private toq f34037h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f73711ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private EnumC5954k f73712t8r;

    /* JADX INFO: renamed from: com.xiaomi.push.vwb$k */
    public enum EnumC5954k {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum toq {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public vwb(toq toqVar) {
        this.f34037h = toq.available;
        this.f73710cdj = null;
        this.f73711ki = Integer.MIN_VALUE;
        this.f73712t8r = null;
        wvg(toqVar);
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: g */
    public String mo21382g() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (ni7() != null) {
            sb.append(" xmlns=\"");
            sb.append(ni7());
            sb.append("\"");
        }
        if (x2() != null) {
            sb.append(" id=\"");
            sb.append(x2());
            sb.append("\"");
        }
        if (kja0() != null) {
            sb.append(" to=\"");
            sb.append(i3x9.toq(kja0()));
            sb.append("\"");
        }
        if (cdj() != null) {
            sb.append(" from=\"");
            sb.append(i3x9.toq(cdj()));
            sb.append("\"");
        }
        if (qrj() != null) {
            sb.append(" chid=\"");
            sb.append(i3x9.toq(qrj()));
            sb.append("\"");
        }
        if (this.f34037h != null) {
            sb.append(" type=\"");
            sb.append(this.f34037h);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f73710cdj != null) {
            sb.append("<status>");
            sb.append(i3x9.toq(this.f73710cdj));
            sb.append("</status>");
        }
        if (this.f73711ki != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f73711ki);
            sb.append("</priority>");
        }
        EnumC5954k enumC5954k = this.f73712t8r;
        if (enumC5954k != null && enumC5954k != EnumC5954k.available) {
            sb.append("<show>");
            sb.append(this.f73712t8r);
            sb.append("</show>");
        }
        sb.append(fn3e());
        z617 z617VarM22030q = m22030q();
        if (z617VarM22030q != null) {
            sb.append(z617VarM22030q.toq());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: k */
    public Bundle mo21383k() {
        Bundle bundleMo21383k = super.mo21383k();
        toq toqVar = this.f34037h;
        if (toqVar != null) {
            bundleMo21383k.putString("ext_pres_type", toqVar.toString());
        }
        String str = this.f73710cdj;
        if (str != null) {
            bundleMo21383k.putString("ext_pres_status", str);
        }
        int i2 = this.f73711ki;
        if (i2 != Integer.MIN_VALUE) {
            bundleMo21383k.putInt("ext_pres_prio", i2);
        }
        EnumC5954k enumC5954k = this.f73712t8r;
        if (enumC5954k != null && enumC5954k != EnumC5954k.available) {
            bundleMo21383k.putString("ext_pres_mode", enumC5954k.toString());
        }
        return bundleMo21383k;
    }

    public void o1t(EnumC5954k enumC5954k) {
        this.f73712t8r = enumC5954k;
    }

    /* JADX INFO: renamed from: t */
    public void m21920t(String str) {
        this.f73710cdj = str;
    }

    public void wvg(toq toqVar) {
        if (toqVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.f34037h = toqVar;
    }

    /* JADX INFO: renamed from: z */
    public void m21921z(int i2) {
        if (i2 >= -128 && i2 <= 128) {
            this.f73711ki = i2;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i2 + " is not valid. Valid range is -128 through 128.");
    }

    public vwb(Bundle bundle) {
        super(bundle);
        this.f34037h = toq.available;
        this.f73710cdj = null;
        this.f73711ki = Integer.MIN_VALUE;
        this.f73712t8r = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f34037h = toq.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f73710cdj = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f73711ki = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f73712t8r = EnumC5954k.valueOf(bundle.getString("ext_pres_mode"));
        }
    }
}
