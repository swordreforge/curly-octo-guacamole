package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class pnt2 extends xtb7 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private String f73529cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private String f73530fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private String f73531fu4;

    /* JADX INFO: renamed from: h */
    private String f33564h;

    /* JADX INFO: renamed from: i */
    private String f33565i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private String f73532ki;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private String f73533ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private String f73534o1t;

    /* JADX INFO: renamed from: t */
    private boolean f33566t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private String f73535t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private String f73536wvg;

    /* JADX INFO: renamed from: z */
    private String f33567z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f73537zurt;

    public pnt2() {
        this.f33564h = null;
        this.f73529cdj = null;
        this.f73537zurt = false;
        this.f73531fu4 = "";
        this.f33567z = "";
        this.f73534o1t = "";
        this.f73536wvg = "";
        this.f33566t = false;
    }

    public String a9() {
        return this.f73533ni7;
    }

    public void d2ok(String str) {
        this.f33564h = str;
    }

    public String d3() {
        return this.f33567z;
    }

    public String dd() {
        return this.f73532ki;
    }

    @Override // com.xiaomi.push.xtb7
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pnt2 pnt2Var = (pnt2) obj;
        if (!super.equals(pnt2Var)) {
            return false;
        }
        String str = this.f33565i;
        if (str == null ? pnt2Var.f33565i != null : !str.equals(pnt2Var.f33565i)) {
            return false;
        }
        String str2 = this.f73532ki;
        if (str2 == null ? pnt2Var.f73532ki != null : !str2.equals(pnt2Var.f73532ki)) {
            return false;
        }
        String str3 = this.f73535t8r;
        if (str3 == null ? pnt2Var.f73535t8r != null : !str3.equals(pnt2Var.f73535t8r)) {
            return false;
        }
        String str4 = this.f73529cdj;
        if (str4 == null ? pnt2Var.f73529cdj == null : str4.equals(pnt2Var.f73529cdj)) {
            return this.f33564h == pnt2Var.f33564h;
        }
        return false;
    }

    public String eqxt() {
        return this.f73534o1t;
    }

    public void fti(String str) {
        this.f33567z = str;
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: g */
    public String mo21382g() {
        z617 z617VarM22030q;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (ni7() != null) {
            sb.append(" xmlns=\"");
            sb.append(ni7());
            sb.append("\"");
        }
        if (this.f73532ki != null) {
            sb.append(" xml:lang=\"");
            sb.append(dd());
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
        if (!TextUtils.isEmpty(jp0y())) {
            sb.append(" seq=\"");
            sb.append(jp0y());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(d3())) {
            sb.append(" mseq=\"");
            sb.append(d3());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(eqxt())) {
            sb.append(" fseq=\"");
            sb.append(eqxt());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(lvui())) {
            sb.append(" status=\"");
            sb.append(lvui());
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
        if (this.f73537zurt) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f73533ni7)) {
            sb.append(" appid=\"");
            sb.append(a9());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f33564h)) {
            sb.append(" type=\"");
            sb.append(this.f33564h);
            sb.append("\"");
        }
        if (this.f33566t) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f73535t8r != null) {
            sb.append("<subject>");
            sb.append(i3x9.toq(this.f73535t8r));
            sb.append("</subject>");
        }
        if (this.f33565i != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f73530fn3e)) {
                sb.append(" encode=\"");
                sb.append(this.f73530fn3e);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(i3x9.toq(this.f33565i));
            sb.append("</body>");
        }
        if (this.f73529cdj != null) {
            sb.append("<thread>");
            sb.append(this.f73529cdj);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f33564h) && (z617VarM22030q = m22030q()) != null) {
            sb.append(z617VarM22030q.toq());
        }
        sb.append(fn3e());
        sb.append("</message>");
        return sb.toString();
    }

    public void gvn7(String str) {
        this.f73534o1t = str;
    }

    @Override // com.xiaomi.push.xtb7
    public int hashCode() {
        String str = this.f33564h;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f33565i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73529cdj;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f73532ki;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f73535t8r;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void jk(boolean z2) {
        this.f33566t = z2;
    }

    public String jp0y() {
        return this.f73531fu4;
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: k */
    public Bundle mo21383k() {
        Bundle bundleMo21383k = super.mo21383k();
        if (!TextUtils.isEmpty(this.f33564h)) {
            bundleMo21383k.putString("ext_msg_type", this.f33564h);
        }
        String str = this.f73532ki;
        if (str != null) {
            bundleMo21383k.putString("ext_msg_lang", str);
        }
        String str2 = this.f73535t8r;
        if (str2 != null) {
            bundleMo21383k.putString("ext_msg_sub", str2);
        }
        String str3 = this.f33565i;
        if (str3 != null) {
            bundleMo21383k.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f73530fn3e)) {
            bundleMo21383k.putString("ext_body_encode", this.f73530fn3e);
        }
        String str4 = this.f73529cdj;
        if (str4 != null) {
            bundleMo21383k.putString("ext_msg_thread", str4);
        }
        String str5 = this.f73533ni7;
        if (str5 != null) {
            bundleMo21383k.putString("ext_msg_appid", str5);
        }
        if (this.f73537zurt) {
            bundleMo21383k.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f73531fu4)) {
            bundleMo21383k.putString("ext_msg_seq", this.f73531fu4);
        }
        if (!TextUtils.isEmpty(this.f33567z)) {
            bundleMo21383k.putString("ext_msg_mseq", this.f33567z);
        }
        if (!TextUtils.isEmpty(this.f73534o1t)) {
            bundleMo21383k.putString("ext_msg_fseq", this.f73534o1t);
        }
        if (this.f33566t) {
            bundleMo21383k.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f73536wvg)) {
            bundleMo21383k.putString("ext_msg_status", this.f73536wvg);
        }
        return bundleMo21383k;
    }

    /* JADX INFO: renamed from: l */
    public void m21384l(String str) {
        this.f73532ki = str;
    }

    public String lvui() {
        return this.f73536wvg;
    }

    public void mcp(String str) {
        this.f73531fu4 = str;
    }

    public void ncyb(String str) {
        this.f73529cdj = str;
    }

    public void o1t(String str, String str2) {
        this.f33565i = str;
        this.f73530fn3e = str2;
    }

    public void oc(String str) {
        this.f73536wvg = str;
    }

    /* JADX INFO: renamed from: r */
    public void m21385r(String str) {
        this.f73535t8r = str;
    }

    /* JADX INFO: renamed from: t */
    public String m21386t() {
        return this.f33564h;
    }

    public void wvg(boolean z2) {
        this.f73537zurt = z2;
    }

    public void x9kr(String str) {
        this.f33565i = str;
    }

    /* JADX INFO: renamed from: z */
    public void m21387z(String str) {
        this.f73533ni7 = str;
    }

    public pnt2(Bundle bundle) {
        super(bundle);
        this.f33564h = null;
        this.f73529cdj = null;
        this.f73537zurt = false;
        this.f73531fu4 = "";
        this.f33567z = "";
        this.f73534o1t = "";
        this.f73536wvg = "";
        this.f33566t = false;
        this.f33564h = bundle.getString("ext_msg_type");
        this.f73532ki = bundle.getString("ext_msg_lang");
        this.f73529cdj = bundle.getString("ext_msg_thread");
        this.f73535t8r = bundle.getString("ext_msg_sub");
        this.f33565i = bundle.getString("ext_msg_body");
        this.f73530fn3e = bundle.getString("ext_body_encode");
        this.f73533ni7 = bundle.getString("ext_msg_appid");
        this.f73537zurt = bundle.getBoolean("ext_msg_trans", false);
        this.f33566t = bundle.getBoolean("ext_msg_encrypt", false);
        this.f73531fu4 = bundle.getString("ext_msg_seq");
        this.f33567z = bundle.getString("ext_msg_mseq");
        this.f73534o1t = bundle.getString("ext_msg_fseq");
        this.f73536wvg = bundle.getString("ext_msg_status");
    }
}
