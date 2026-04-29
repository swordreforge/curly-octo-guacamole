package com.xiaomi.push;

import com.xiaomi.push.vahq;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class eklw {

    /* JADX INFO: renamed from: k */
    private final ByteArrayOutputStream f32844k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final cjaj f73317toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ip f73318zy;

    public eklw() {
        this(new vahq.C5952k());
    }

    /* JADX INFO: renamed from: k */
    public byte[] m20779k(oaex oaexVar) {
        this.f32844k.reset();
        oaexVar.mo20561b(this.f73318zy);
        return this.f32844k.toByteArray();
    }

    public eklw(es7 es7Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f32844k = byteArrayOutputStream;
        cjaj cjajVar = new cjaj(byteArrayOutputStream);
        this.f73317toq = cjajVar;
        this.f73318zy = es7Var.mo20817a(cjajVar);
    }
}
