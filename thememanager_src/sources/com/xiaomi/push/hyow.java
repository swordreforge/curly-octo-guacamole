package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class hyow implements mi1u {

    /* JADX INFO: renamed from: g */
    private List<hyow> f33007g;

    /* JADX INFO: renamed from: k */
    private String f33008k;

    /* JADX INFO: renamed from: n */
    private String f33009n;

    /* JADX INFO: renamed from: q */
    private String[] f33010q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73356toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String[] f73357zy;

    public hyow(String str, String str2, String[] strArr, String[] strArr2) {
        this.f33007g = null;
        this.f33008k = str;
        this.f73356toq = str2;
        this.f73357zy = strArr;
        this.f33010q = strArr2;
    }

    /* JADX INFO: renamed from: p */
    public static Parcelable[] m20957p(hyow[] hyowVarArr) {
        if (hyowVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[hyowVarArr.length];
        for (int i2 = 0; i2 < hyowVarArr.length; i2++) {
            parcelableArr[i2] = hyowVarArr[i2].zy();
        }
        return parcelableArr;
    }

    /* JADX INFO: renamed from: q */
    public static hyow m20958q(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> setKeySet = bundle2.keySet();
        String[] strArr = new String[setKeySet.size()];
        String[] strArr2 = new String[setKeySet.size()];
        int i2 = 0;
        for (String str : setKeySet) {
            strArr[i2] = str;
            strArr2[i2] = bundle2.getString(str);
            i2++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(m20958q((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new hyow(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static Parcelable[] m20959s(List<hyow> list) {
        return m20957p((hyow[]) list.toArray(new hyow[list.size()]));
    }

    public void f7l8(hyow hyowVar) {
        if (this.f33007g == null) {
            this.f33007g = new ArrayList();
        }
        if (this.f33007g.contains(hyowVar)) {
            return;
        }
        this.f33007g.add(hyowVar);
    }

    /* JADX INFO: renamed from: g */
    public String m20960g(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.f73357zy == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.f73357zy;
            if (i2 >= strArr.length) {
                return null;
            }
            if (str.equals(strArr[i2])) {
                return this.f33010q[i2];
            }
            i2++;
        }
    }

    @Override // com.xiaomi.push.mi1u
    /* JADX INFO: renamed from: k */
    public String mo20961k() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f33008k);
        if (!TextUtils.isEmpty(this.f73356toq)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.f73356toq);
            sb.append("\"");
        }
        String[] strArr = this.f73357zy;
        if (strArr != null && strArr.length > 0) {
            for (int i2 = 0; i2 < this.f73357zy.length; i2++) {
                if (!TextUtils.isEmpty(this.f33010q[i2])) {
                    sb.append(" ");
                    sb.append(this.f73357zy[i2]);
                    sb.append("=\"");
                    sb.append(i3x9.toq(this.f33010q[i2]));
                    sb.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f33009n)) {
            List<hyow> list = this.f33007g;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
            } else {
                sb.append(">");
                Iterator<hyow> it = this.f33007g.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().mo20961k());
                }
                sb.append("</");
                sb.append(this.f33008k);
                sb.append(">");
            }
        } else {
            sb.append(">");
            sb.append(this.f33009n);
            sb.append("</");
            sb.append(this.f33008k);
            sb.append(">");
        }
        return sb.toString();
    }

    public String ld6() {
        return this.f73356toq;
    }

    /* JADX INFO: renamed from: n */
    public String m20962n() {
        return this.f33008k;
    }

    public String toString() {
        return mo20961k();
    }

    public Bundle toq() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f33008k);
        bundle.putString("ext_ns", this.f73356toq);
        bundle.putString("ext_text", this.f33009n);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f73357zy;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f73357zy;
                if (i2 >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i2], this.f33010q[i2]);
                i2++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<hyow> list = this.f33007g;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", m20959s(this.f33007g));
        }
        return bundle;
    }

    public String x2() {
        return !TextUtils.isEmpty(this.f33009n) ? i3x9.m20970n(this.f33009n) : this.f33009n;
    }

    /* JADX INFO: renamed from: y */
    public void m20963y(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f33009n = str;
        } else {
            this.f33009n = i3x9.toq(str);
        }
    }

    public Parcelable zy() {
        return toq();
    }

    public hyow(String str, String str2, String[] strArr, String[] strArr2, String str3, List<hyow> list) {
        this.f33008k = str;
        this.f73356toq = str2;
        this.f73357zy = strArr;
        this.f33010q = strArr2;
        this.f33009n = str3;
        this.f33007g = list;
    }
}
