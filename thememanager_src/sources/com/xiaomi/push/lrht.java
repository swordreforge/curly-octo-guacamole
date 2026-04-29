package com.xiaomi.push;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class lrht extends JSONArray implements InterfaceC5853c {

    /* JADX INFO: renamed from: k */
    private int f33365k = 2;

    @Override // com.xiaomi.push.InterfaceC5853c
    /* JADX INFO: renamed from: a */
    public int mo20675a() {
        return this.f33365k + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof InterfaceC5853c) {
            this.f33365k += ((InterfaceC5853c) obj).mo20675a();
        }
        return super.put(obj);
    }
}
