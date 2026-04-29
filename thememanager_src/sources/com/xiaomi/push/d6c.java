package com.xiaomi.push;

import com.xiaomi.push.vahq;

/* JADX INFO: loaded from: classes3.dex */
public class d6c {

    /* JADX INFO: renamed from: k */
    private final ip f32795k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final gw f73303toq;

    public d6c() {
        this(new vahq.C5952k());
    }

    /* JADX INFO: renamed from: k */
    public void m20719k(oaex oaexVar, byte[] bArr) {
        try {
            this.f73303toq.m20944y(bArr);
            oaexVar.mo20557a(this.f32795k);
        } finally {
            this.f32795k.d3();
        }
    }

    public d6c(es7 es7Var) {
        gw gwVar = new gw();
        this.f73303toq = gwVar;
        this.f32795k = es7Var.mo20817a(gwVar);
    }
}
