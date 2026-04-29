package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class xblq extends xtb7 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final Map<String, String> f73728cdj;

    /* JADX INFO: renamed from: h */
    private C5960k f34172h;

    /* JADX INFO: renamed from: com.xiaomi.push.xblq$k */
    public static class C5960k {

        /* JADX INFO: renamed from: k */
        private String f34176k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final C5960k f73729toq = new C5960k("get");

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final C5960k f73730zy = new C5960k("set");

        /* JADX INFO: renamed from: q */
        public static final C5960k f34175q = new C5960k("result");

        /* JADX INFO: renamed from: n */
        public static final C5960k f34174n = new C5960k("error");

        /* JADX INFO: renamed from: g */
        public static final C5960k f34173g = new C5960k("command");

        private C5960k(String str) {
            this.f34176k = str;
        }

        /* JADX INFO: renamed from: k */
        public static C5960k m22023k(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            C5960k c5960k = f73729toq;
            if (c5960k.toString().equals(lowerCase)) {
                return c5960k;
            }
            C5960k c5960k2 = f73730zy;
            if (c5960k2.toString().equals(lowerCase)) {
                return c5960k2;
            }
            C5960k c5960k3 = f34174n;
            if (c5960k3.toString().equals(lowerCase)) {
                return c5960k3;
            }
            C5960k c5960k4 = f34175q;
            if (c5960k4.toString().equals(lowerCase)) {
                return c5960k4;
            }
            C5960k c5960k5 = f34173g;
            if (c5960k5.toString().equals(lowerCase)) {
                return c5960k5;
            }
            return null;
        }

        public String toString() {
            return this.f34176k;
        }
    }

    public xblq() {
        this.f34172h = C5960k.f73729toq;
        this.f73728cdj = new HashMap();
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: g */
    public String mo21382g() {
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (x2() != null) {
            sb.append("id=\"" + x2() + "\" ");
        }
        if (kja0() != null) {
            sb.append("to=\"");
            sb.append(i3x9.toq(kja0()));
            sb.append("\" ");
        }
        if (cdj() != null) {
            sb.append("from=\"");
            sb.append(i3x9.toq(cdj()));
            sb.append("\" ");
        }
        if (qrj() != null) {
            sb.append("chid=\"");
            sb.append(i3x9.toq(qrj()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f73728cdj.entrySet()) {
            sb.append(i3x9.toq(entry.getKey()));
            sb.append("=\"");
            sb.append(i3x9.toq(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f34172h == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"");
            sb.append(m22022z());
            sb.append("\">");
        }
        String strMo20834t = mo20834t();
        if (strMo20834t != null) {
            sb.append(strMo20834t);
        }
        sb.append(fn3e());
        z617 z617VarM22030q = m22030q();
        if (z617VarM22030q != null) {
            sb.append(z617VarM22030q.toq());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    @Override // com.xiaomi.push.xtb7
    /* JADX INFO: renamed from: k */
    public Bundle mo21383k() {
        Bundle bundleMo21383k = super.mo21383k();
        C5960k c5960k = this.f34172h;
        if (c5960k != null) {
            bundleMo21383k.putString("ext_iq_type", c5960k.toString());
        }
        return bundleMo21383k;
    }

    public void o1t(C5960k c5960k) {
        if (c5960k == null) {
            this.f34172h = C5960k.f73729toq;
        } else {
            this.f34172h = c5960k;
        }
    }

    /* JADX INFO: renamed from: t */
    public String mo20834t() {
        return null;
    }

    public synchronized void wvg(Map<String, String> map) {
        this.f73728cdj.putAll(map);
    }

    /* JADX INFO: renamed from: z */
    public C5960k m22022z() {
        return this.f34172h;
    }

    public xblq(Bundle bundle) {
        super(bundle);
        this.f34172h = C5960k.f73729toq;
        this.f73728cdj = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f34172h = C5960k.m22023k(bundle.getString("ext_iq_type"));
        }
    }
}
