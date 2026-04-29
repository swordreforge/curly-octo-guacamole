package com.xiaomi.ad.entity.contract;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GsonEntityBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zy implements f7l8 {
    @Override // com.xiaomi.ad.entity.contract.f7l8
    /* JADX INFO: renamed from: n */
    public final JSONObject mo19199n() {
        try {
            return new JSONObject(serialize());
        } catch (JSONException e2) {
            throw new RuntimeException("should NEVER happen, " + mo18161y() + ": " + serialize(), e2);
        }
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5588g
    public final String serialize() {
        return com.xiaomi.ad.entity.util.zy.m19214p(this, mo18161y());
    }

    public final String toString() {
        return serialize();
    }

    /* JADX INFO: renamed from: y */
    protected abstract String mo18161y();
}
