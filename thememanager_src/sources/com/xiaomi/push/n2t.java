package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class n2t extends zwy {
    public n2t(Context context, int i2) {
        super(context, i2);
    }

    @Override // com.xiaomi.push.zwy
    /* JADX INFO: renamed from: g */
    public String mo21300g() {
        return "ram:" + m8.m21277n() + ",rom:" + m8.kja0() + "|ramOriginal:" + m8.t8r() + ",romOriginal:" + m8.zurt();
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "23";
    }

    @Override // com.xiaomi.push.zwy
    public sc toq() {
        return sc.Storage;
    }
}
