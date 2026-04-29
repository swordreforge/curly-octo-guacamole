package com.airbnb.lottie.model;

/* JADX INFO: renamed from: com.airbnb.lottie.model.y */
/* JADX INFO: compiled from: Marker.java */
/* JADX INFO: loaded from: classes.dex */
public class C1475y {

    /* JADX INFO: renamed from: q */
    private static final String f8100q = "\r";

    /* JADX INFO: renamed from: k */
    private final String f8101k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final float f56112toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final float f56113zy;

    public C1475y(String str, float f2, float f3) {
        this.f8101k = str;
        this.f56113zy = f3;
        this.f56112toq = f2;
    }

    /* JADX INFO: renamed from: k */
    public float m6096k() {
        return this.f56113zy;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6097q(String str) {
        if (this.f8101k.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f8101k.endsWith(f8100q)) {
            String str2 = this.f8101k;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public String toq() {
        return this.f8101k;
    }

    public float zy() {
        return this.f56112toq;
    }
}
