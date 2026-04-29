package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class Cdo {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile Cdo f73310toq;

    /* JADX INFO: renamed from: k */
    private ixz f32804k;

    public static Cdo toq() {
        if (f73310toq == null) {
            synchronized (Cdo.class) {
                if (f73310toq == null) {
                    f73310toq = new Cdo();
                }
            }
        }
        return f73310toq;
    }

    /* JADX INFO: renamed from: k */
    public ixz m20726k() {
        return this.f32804k;
    }

    public void zy(ixz ixzVar) {
        this.f32804k = ixzVar;
    }
}
