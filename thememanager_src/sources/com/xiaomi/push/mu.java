package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.onetrack.api.at;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mu {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public String f73494f7l8;

    /* JADX INFO: renamed from: g */
    public String f33424g;

    /* JADX INFO: renamed from: k */
    public String f33425k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private String f73495ld6;

    /* JADX INFO: renamed from: n */
    public String f33426n;

    /* JADX INFO: renamed from: p */
    protected String f33427p;

    /* JADX INFO: renamed from: q */
    public String f33428q;

    /* JADX INFO: renamed from: s */
    public String f33429s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73498toq;

    /* JADX INFO: renamed from: y */
    public String f33430y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ArrayList<gbni> f73500zy = new ArrayList<>();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private double f73499x2 = 0.1d;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private String f73497qrj = "s.mi1.cc";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f73496n7h = 86400000;

    public mu(String str) {
        this.f33425k = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f73498toq = System.currentTimeMillis();
        this.f73500zy.add(new gbni(str, -1));
        this.f33425k = tfm.m21848q();
        this.f33428q = str;
    }

    private synchronized void zurt(String str) {
        Iterator<gbni> it = this.f73500zy.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f32960q, str)) {
                it.remove();
            }
        }
    }

    public boolean cdj(mu muVar) {
        return TextUtils.equals(this.f33425k, muVar.f33425k);
    }

    public void f7l8(double d2) {
        this.f73499x2 = d2;
    }

    public boolean fn3e() {
        return System.currentTimeMillis() - this.f73498toq < this.f73496n7h;
    }

    /* JADX INFO: renamed from: g */
    public synchronized JSONObject m21290g() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f33425k);
        jSONObject.put("ttl", this.f73496n7h);
        jSONObject.put("pct", this.f73499x2);
        jSONObject.put("ts", this.f73498toq);
        jSONObject.put(at.f31715i, this.f33424g);
        jSONObject.put("prv", this.f33426n);
        jSONObject.put("cty", this.f33429s);
        jSONObject.put("isp", this.f73494f7l8);
        jSONObject.put("ip", this.f33430y);
        jSONObject.put("host", this.f33428q);
        jSONObject.put("xf", this.f33427p);
        JSONArray jSONArray = new JSONArray();
        Iterator<gbni> it = this.f73500zy.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m20897q());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21291h() {
        return TextUtils.equals(this.f33425k, tfm.m21848q());
    }

    /* JADX INFO: renamed from: i */
    public void m21292i(String str, long j2, long j3, Exception exc) {
        ld6(str, -1, j2, j3, exc);
    }

    /* JADX INFO: renamed from: k */
    public synchronized mu m21293k(JSONObject jSONObject) {
        this.f33425k = jSONObject.optString("net");
        this.f73496n7h = jSONObject.getLong("ttl");
        this.f73499x2 = jSONObject.getDouble("pct");
        this.f73498toq = jSONObject.getLong("ts");
        this.f33424g = jSONObject.optString(at.f31715i);
        this.f33426n = jSONObject.optString("prv");
        this.f33429s = jSONObject.optString("cty");
        this.f73494f7l8 = jSONObject.optString("isp");
        this.f33430y = jSONObject.optString("ip");
        this.f33428q = jSONObject.optString("host");
        this.f33427p = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            m21296s(new gbni().zy(jSONArray.getJSONObject(i2)));
        }
        return this;
    }

    public void ki(String str) {
        this.f73497qrj = str;
    }

    public synchronized void kja0(String[] strArr) {
        int i2;
        int size = this.f73500zy.size() - 1;
        while (true) {
            i2 = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i2 < length) {
                    if (TextUtils.equals(this.f73500zy.get(size).f32960q, strArr[i2])) {
                        this.f73500zy.remove(size);
                        break;
                    }
                    i2++;
                }
            }
            size--;
        }
        Iterator<gbni> it = this.f73500zy.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = it.next().f32957g;
            if (i4 > i3) {
                i3 = i4;
            }
        }
        while (i2 < strArr.length) {
            m21296s(new gbni(strArr[i2], (strArr.length + i3) - i2));
            i2++;
        }
    }

    public void ld6(String str, int i2, long j2, long j3, Exception exc) {
        n7h(str, new C5857d(i2, j2, j3, exc));
    }

    /* JADX INFO: renamed from: n */
    public synchronized ArrayList<String> mo20721n(boolean z2) {
        ArrayList<String> arrayList;
        int size = this.f73500zy.size();
        gbni[] gbniVarArr = new gbni[size];
        this.f73500zy.toArray(gbniVarArr);
        Arrays.sort(gbniVarArr);
        arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < size; i2++) {
            gbni gbniVar = gbniVarArr[i2];
            if (z2) {
                arrayList.add(gbniVar.f32960q);
            } else {
                int iIndexOf = gbniVar.f32960q.indexOf(":");
                if (iIndexOf != -1) {
                    arrayList.add(gbniVar.f32960q.substring(0, iIndexOf));
                } else {
                    arrayList.add(gbniVar.f32960q);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r1.m20896n(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void n7h(java.lang.String r4, com.xiaomi.push.C5857d r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<com.xiaomi.push.gbni> r0 = r3.f73500zy     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.xiaomi.push.gbni r1 = (com.xiaomi.push.gbni) r1     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.f32960q     // Catch: java.lang.Throwable -> L20
            boolean r2 = android.text.TextUtils.equals(r4, r2)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L7
            r1.m20896n(r5)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r3)
            return
        L20:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.mu.n7h(java.lang.String, com.xiaomi.push.d):void");
    }

    boolean ni7() {
        long j2 = this.f73496n7h;
        if (864000000 >= j2) {
            j2 = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = this.f73498toq;
        return jCurrentTimeMillis - j3 > j2 || (jCurrentTimeMillis - j3 > this.f73496n7h && this.f33425k.startsWith("WIFI-"));
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m21294p(String str) {
        m21296s(new gbni(str));
    }

    /* JADX INFO: renamed from: q */
    public ArrayList<String> m21295q(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f33428q)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = mo20721n(true).iterator();
        while (it.hasNext()) {
            fnq8 qVar = fnq8.toq(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), qVar.zy(), qVar.m20880k(), url.getFile()).toString());
        }
        return arrayList;
    }

    public void qrj(String str, long j2, long j3, Exception exc) {
        try {
            m21292i(new URL(str).getHost(), j2, j3, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    synchronized void m21296s(gbni gbniVar) {
        zurt(gbniVar.f32960q);
        this.f73500zy.add(gbniVar);
    }

    public void t8r(String str, long j2, long j3) {
        ld6(str, 0, j2, j3, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33425k);
        sb.append("\n");
        sb.append(toq());
        for (gbni gbniVar : this.f73500zy) {
            sb.append("\n");
            sb.append(gbniVar.toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public synchronized String toq() {
        if (!TextUtils.isEmpty(this.f73495ld6)) {
            return this.f73495ld6;
        }
        if (TextUtils.isEmpty(this.f73494f7l8)) {
            return "hardcode_isp";
        }
        String strF7l8 = n5r1.f7l8(new String[]{this.f73494f7l8, this.f33426n, this.f33424g, this.f33429s, this.f33430y}, "_");
        this.f73495ld6 = strF7l8;
        return strF7l8;
    }

    public void x2(String str, long j2, long j3) {
        try {
            t8r(new URL(str).getHost(), j2, j3);
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public void m21297y(long j2) {
        if (j2 > 0) {
            this.f73496n7h = j2;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j2);
    }

    public synchronized ArrayList<String> zy() {
        return mo20721n(false);
    }
}
