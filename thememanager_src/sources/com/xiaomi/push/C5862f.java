package com.xiaomi.push;

import com.xiaomi.push.service.C5939t;

/* JADX INFO: renamed from: com.xiaomi.push.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5862f {

    /* JADX INFO: renamed from: k */
    private long f32889k;

    /* JADX INFO: renamed from: n */
    private final long f32890n = System.currentTimeMillis();

    /* JADX INFO: renamed from: q */
    private long f32891q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f73321toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f73322zy;

    public long f7l8() {
        return this.f73322zy;
    }

    /* JADX INFO: renamed from: g */
    public void m20821g(long j2) {
        this.f73321toq += j2;
    }

    /* JADX INFO: renamed from: k */
    public int m20822k() {
        return C5939t.m21759h() ? 1 : 0;
    }

    /* JADX INFO: renamed from: n */
    public long m20823n() {
        return this.f73321toq;
    }

    /* JADX INFO: renamed from: q */
    public void m20824q(long j2) {
        this.f32889k = j2;
    }

    /* JADX INFO: renamed from: s */
    public long m20825s() {
        return this.f32891q;
    }

    public long toq() {
        return this.f32889k;
    }

    /* JADX INFO: renamed from: y */
    public void m20826y(long j2) {
        this.f32891q += j2;
    }

    public void zy() {
        this.f73322zy++;
    }
}
