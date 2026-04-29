package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z617 {

    /* JADX INFO: renamed from: g */
    private List<hyow> f34236g;

    /* JADX INFO: renamed from: k */
    private int f34237k;

    /* JADX INFO: renamed from: n */
    private String f34238n;

    /* JADX INFO: renamed from: q */
    private String f34239q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73754toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73755zy;

    /* JADX INFO: renamed from: com.xiaomi.push.z617$k */
    public static class C5968k {

        /* JADX INFO: renamed from: k */
        private String f34249k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final C5968k f73767toq = new C5968k("internal-server-error");

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final C5968k f73770zy = new C5968k("forbidden");

        /* JADX INFO: renamed from: q */
        public static final C5968k f34245q = new C5968k("bad-request");

        /* JADX INFO: renamed from: n */
        public static final C5968k f34243n = new C5968k("conflict");

        /* JADX INFO: renamed from: g */
        public static final C5968k f34240g = new C5968k("feature-not-implemented");

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final C5968k f73757f7l8 = new C5968k("gone");

        /* JADX INFO: renamed from: y */
        public static final C5968k f34247y = new C5968k("item-not-found");

        /* JADX INFO: renamed from: s */
        public static final C5968k f34246s = new C5968k("jid-malformed");

        /* JADX INFO: renamed from: p */
        public static final C5968k f34244p = new C5968k("not-acceptable");

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final C5968k f73762ld6 = new C5968k("not-allowed");

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final C5968k f73768x2 = new C5968k("not-authorized");

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final C5968k f73765qrj = new C5968k("payment-required");

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final C5968k f73763n7h = new C5968k("recipient-unavailable");

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final C5968k f73761kja0 = new C5968k("redirect");

        /* JADX INFO: renamed from: h */
        public static final C5968k f34241h = new C5968k("registration-required");

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final C5968k f73756cdj = new C5968k("remote-server-error");

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final C5968k f73760ki = new C5968k("remote-server-not-found");

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final C5968k f73766t8r = new C5968k("remote-server-timeout");

        /* JADX INFO: renamed from: i */
        public static final C5968k f34242i = new C5968k("resource-constraint");

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final C5968k f73758fn3e = new C5968k("service-unavailable");

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final C5968k f73769zurt = new C5968k("subscription-required");

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final C5968k f73764ni7 = new C5968k("undefined-condition");

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final C5968k f73759fu4 = new C5968k("unexpected-request");

        /* JADX INFO: renamed from: z */
        public static final C5968k f34248z = new C5968k("request-timeout");

        public C5968k(String str) {
            this.f34249k = str;
        }

        public String toString() {
            return this.f34249k;
        }
    }

    public z617(C5968k c5968k) {
        this.f34236g = null;
        m22075q(c5968k);
        this.f34238n = null;
    }

    /* JADX INFO: renamed from: q */
    private void m22075q(C5968k c5968k) {
        this.f73755zy = c5968k.f34249k;
    }

    /* JADX INFO: renamed from: k */
    public Bundle m22076k() {
        Bundle bundle = new Bundle();
        String str = this.f73754toq;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f34237k);
        String str2 = this.f34239q;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f73755zy;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f34238n;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<hyow> list = this.f34236g;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i2 = 0;
            Iterator<hyow> it = this.f34236g.iterator();
            while (it.hasNext()) {
                Bundle qVar = it.next().toq();
                if (qVar != null) {
                    bundleArr[i2] = qVar;
                    i2++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f73755zy;
        if (str != null) {
            sb.append(str);
        }
        sb.append("(");
        sb.append(this.f34237k);
        sb.append(")");
        if (this.f34238n != null) {
            sb.append(" ");
            sb.append(this.f34238n);
        }
        return sb.toString();
    }

    public String toq() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f34237k);
        sb.append("\"");
        if (this.f73754toq != null) {
            sb.append(" type=\"");
            sb.append(this.f73754toq);
            sb.append("\"");
        }
        if (this.f34239q != null) {
            sb.append(" reason=\"");
            sb.append(this.f34239q);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f73755zy != null) {
            sb.append("<");
            sb.append(this.f73755zy);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f34238n != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f34238n);
            sb.append("</text>");
        }
        Iterator<hyow> it = zy().iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo20961k());
        }
        sb.append("</error>");
        return sb.toString();
    }

    public synchronized List<hyow> zy() {
        List<hyow> list = this.f34236g;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public z617(int i2, String str, String str2, String str3, String str4, List<hyow> list) {
        this.f34237k = i2;
        this.f73754toq = str;
        this.f34239q = str2;
        this.f73755zy = str3;
        this.f34238n = str4;
        this.f34236g = list;
    }

    public z617(Bundle bundle) {
        this.f34236g = null;
        this.f34237k = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f73754toq = bundle.getString("ext_err_type");
        }
        this.f73755zy = bundle.getString("ext_err_cond");
        this.f34239q = bundle.getString("ext_err_reason");
        this.f34238n = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f34236g = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                hyow hyowVarM20958q = hyow.m20958q((Bundle) parcelable);
                if (hyowVarM20958q != null) {
                    this.f34236g.add(hyowVarM20958q);
                }
            }
        }
    }
}
