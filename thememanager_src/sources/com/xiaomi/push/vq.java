package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class vq {

    /* JADX INFO: renamed from: k */
    private String f34035k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<mu> f73709toq = new ArrayList<>();

    public vq(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f34035k = str;
    }

    public synchronized void f7l8(boolean z2) {
        for (int size = this.f73709toq.size() - 1; size >= 0; size--) {
            mu muVar = this.f73709toq.get(size);
            if (z2) {
                if (muVar.ni7()) {
                    this.f73709toq.remove(size);
                }
            } else if (!muVar.fn3e()) {
                this.f73709toq.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m21916g(mu muVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f73709toq.size()) {
                break;
            }
            if (this.f73709toq.get(i2).cdj(muVar)) {
                this.f73709toq.set(i2, muVar);
                break;
            }
            i2++;
        }
        if (i2 >= this.f73709toq.size()) {
            this.f73709toq.add(muVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized mu m21917k() {
        for (int size = this.f73709toq.size() - 1; size >= 0; size--) {
            mu muVar = this.f73709toq.get(size);
            if (muVar.m21291h()) {
                tfm.zy().x2(muVar.toq());
                return muVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public synchronized JSONObject m21918n() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f34035k);
        JSONArray jSONArray = new JSONArray();
        Iterator<mu> it = this.f73709toq.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m21290g());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: q */
    public ArrayList<mu> m21919q() {
        return this.f73709toq;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34035k);
        sb.append("\n");
        Iterator<mu> it = this.f73709toq.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public synchronized vq toq(JSONObject jSONObject) {
        this.f34035k = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f73709toq.add(new mu(this.f34035k).m21293k(jSONArray.getJSONObject(i2)));
        }
        return this;
    }

    public String zy() {
        return this.f34035k;
    }

    public vq() {
    }
}
