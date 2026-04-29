package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xtb7 {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static long f73733kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static String f73735n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final DateFormat f73736qrj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private List<hyow> f73738f7l8;

    /* JADX INFO: renamed from: g */
    private String f34181g;

    /* JADX INFO: renamed from: k */
    private String f34182k;

    /* JADX INFO: renamed from: n */
    private String f34183n;

    /* JADX INFO: renamed from: p */
    public long f34184p;

    /* JADX INFO: renamed from: q */
    private String f34185q;

    /* JADX INFO: renamed from: s */
    private z617 f34186s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73739toq;

    /* JADX INFO: renamed from: y */
    private final Map<String, Object> f34187y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73740zy;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected static final String f73734ld6 = Locale.getDefault().getLanguage().toLowerCase();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static String f73737x2 = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f73736qrj = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f73735n7h = i3x9.m20969k(5) + C5658n.f73185t8r;
        f73733kja0 = 0L;
    }

    public xtb7() {
        this.f34182k = f73737x2;
        this.f73739toq = null;
        this.f73740zy = null;
        this.f34185q = null;
        this.f34183n = null;
        this.f34181g = null;
        this.f73738f7l8 = new CopyOnWriteArrayList();
        this.f34187y = new HashMap();
        this.f34186s = null;
    }

    public static String fu4() {
        return f73734ld6;
    }

    public static synchronized String ld6() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f73735n7h);
        long j2 = f73733kja0;
        f73733kja0 = 1 + j2;
        sb.append(Long.toString(j2));
        return sb.toString();
    }

    public String cdj() {
        return this.f34185q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xtb7 xtb7Var = (xtb7) obj;
        z617 z617Var = this.f34186s;
        if (z617Var == null ? xtb7Var.f34186s != null : !z617Var.equals(xtb7Var.f34186s)) {
            return false;
        }
        String str = this.f34185q;
        if (str == null ? xtb7Var.f34185q != null : !str.equals(xtb7Var.f34185q)) {
            return false;
        }
        if (!this.f73738f7l8.equals(xtb7Var.f73738f7l8)) {
            return false;
        }
        String str2 = this.f73739toq;
        if (str2 == null ? xtb7Var.f73739toq != null : !str2.equals(xtb7Var.f73739toq)) {
            return false;
        }
        String str3 = this.f34183n;
        if (str3 == null ? xtb7Var.f34183n != null : !str3.equals(xtb7Var.f34183n)) {
            return false;
        }
        Map<String, Object> map = this.f34187y;
        if (map == null ? xtb7Var.f34187y != null : !map.equals(xtb7Var.f34187y)) {
            return false;
        }
        String str4 = this.f73740zy;
        if (str4 == null ? xtb7Var.f73740zy != null : !str4.equals(xtb7Var.f73740zy)) {
            return false;
        }
        String str5 = this.f34182k;
        String str6 = xtb7Var.f34182k;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public synchronized Collection<hyow> f7l8() {
        if (this.f73738f7l8 == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f73738f7l8));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized java.lang.String fn3e() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.xtb7.fn3e():java.lang.String");
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo21382g();

    /* JADX INFO: renamed from: h */
    public void m22026h(String str) {
        this.f34183n = str;
    }

    public int hashCode() {
        String str = this.f34182k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73739toq;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73740zy;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f34185q;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f34183n;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f73738f7l8.hashCode()) * 31) + this.f34187y.hashCode()) * 31;
        z617 z617Var = this.f34186s;
        return iHashCode5 + (z617Var != null ? z617Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public void m22027i(String str) {
        this.f34185q = str;
    }

    /* JADX INFO: renamed from: k */
    public Bundle mo21383k() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f34182k)) {
            bundle.putString("ext_ns", this.f34182k);
        }
        if (!TextUtils.isEmpty(this.f34185q)) {
            bundle.putString("ext_from", this.f34185q);
        }
        if (!TextUtils.isEmpty(this.f73740zy)) {
            bundle.putString("ext_to", this.f73740zy);
        }
        if (!TextUtils.isEmpty(this.f73739toq)) {
            bundle.putString("ext_pkt_id", this.f73739toq);
        }
        if (!TextUtils.isEmpty(this.f34183n)) {
            bundle.putString("ext_chid", this.f34183n);
        }
        z617 z617Var = this.f34186s;
        if (z617Var != null) {
            bundle.putBundle("ext_ERROR", z617Var.m22076k());
        }
        List<hyow> list = this.f73738f7l8;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i2 = 0;
            Iterator<hyow> it = this.f73738f7l8.iterator();
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

    public void ki(String str) {
        this.f73740zy = str;
    }

    public String kja0() {
        return this.f73740zy;
    }

    /* JADX INFO: renamed from: n */
    public synchronized Object m22028n(String str) {
        Map<String, Object> map = this.f34187y;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void n7h(String str) {
        this.f73739toq = str;
    }

    public String ni7() {
        return this.f34182k;
    }

    /* JADX INFO: renamed from: p */
    public synchronized Collection<String> m22029p() {
        if (this.f34187y == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f34187y.keySet()));
    }

    /* JADX INFO: renamed from: q */
    public z617 m22030q() {
        return this.f34186s;
    }

    public String qrj() {
        return this.f34183n;
    }

    /* JADX INFO: renamed from: s */
    public void m22031s(z617 z617Var) {
        this.f34186s = z617Var;
    }

    public String t8r() {
        return this.f34181g;
    }

    public hyow toq(String str) {
        return zy(str, null);
    }

    public String x2() {
        if ("ID_NOT_AVAILABLE".equals(this.f73739toq)) {
            return null;
        }
        if (this.f73739toq == null) {
            this.f73739toq = ld6();
        }
        return this.f73739toq;
    }

    /* JADX INFO: renamed from: y */
    public void m22032y(hyow hyowVar) {
        this.f73738f7l8.add(hyowVar);
    }

    public void zurt(String str) {
        this.f34181g = str;
    }

    public hyow zy(String str, String str2) {
        for (hyow hyowVar : this.f73738f7l8) {
            if (str2 == null || str2.equals(hyowVar.ld6())) {
                if (str.equals(hyowVar.m20962n())) {
                    return hyowVar;
                }
            }
        }
        return null;
    }

    public xtb7(Bundle bundle) {
        this.f34182k = f73737x2;
        this.f73739toq = null;
        this.f73740zy = null;
        this.f34185q = null;
        this.f34183n = null;
        this.f34181g = null;
        this.f73738f7l8 = new CopyOnWriteArrayList();
        this.f34187y = new HashMap();
        this.f34186s = null;
        this.f73740zy = bundle.getString("ext_to");
        this.f34185q = bundle.getString("ext_from");
        this.f34183n = bundle.getString("ext_chid");
        this.f73739toq = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f73738f7l8 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                hyow hyowVarM20958q = hyow.m20958q((Bundle) parcelable);
                if (hyowVarM20958q != null) {
                    this.f73738f7l8.add(hyowVarM20958q);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f34186s = new z617(bundle2);
        }
    }
}
