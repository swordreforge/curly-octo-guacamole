package com.xiaomi.push;

import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class gbni implements Comparable<gbni> {

    /* JADX INFO: renamed from: g */
    protected int f32957g;

    /* JADX INFO: renamed from: k */
    private final LinkedList<C5857d> f32958k;

    /* JADX INFO: renamed from: n */
    private long f32959n;

    /* JADX INFO: renamed from: q */
    String f32960q;

    public gbni() {
        this(null, 0);
    }

    /* JADX INFO: renamed from: n */
    protected synchronized void m20896n(C5857d c5857d) {
        if (c5857d != null) {
            this.f32958k.add(c5857d);
            int iM20711k = c5857d.m20711k();
            if (iM20711k > 0) {
                this.f32957g += c5857d.m20711k();
            } else {
                int i2 = 0;
                for (int size = this.f32958k.size() - 1; size >= 0 && this.f32958k.get(size).m20711k() < 0; size--) {
                    i2++;
                }
                this.f32957g += iM20711k * i2;
            }
            if (this.f32958k.size() > 30) {
                this.f32957g -= this.f32958k.remove().m20711k();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized JSONObject m20897q() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(C3678q.f65832n7h, this.f32959n);
        jSONObject.put("wt", this.f32957g);
        jSONObject.put("host", this.f32960q);
        JSONArray jSONArray = new JSONArray();
        Iterator<C5857d> it = this.f32958k.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().zy());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    public String toString() {
        return this.f32960q + ":" + this.f32957g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(gbni gbniVar) {
        if (gbniVar == null) {
            return 1;
        }
        return gbniVar.f32957g - this.f32957g;
    }

    public synchronized gbni zy(JSONObject jSONObject) {
        this.f32959n = jSONObject.getLong(C3678q.f65832n7h);
        this.f32957g = jSONObject.getInt("wt");
        this.f32960q = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f32958k.add(new C5857d().toq(jSONArray.getJSONObject(i2)));
        }
        return this;
    }

    public gbni(String str) {
        this(str, 0);
    }

    public gbni(String str, int i2) {
        this.f32958k = new LinkedList<>();
        this.f32959n = 0L;
        this.f32960q = str;
        this.f32957g = i2;
    }
}
