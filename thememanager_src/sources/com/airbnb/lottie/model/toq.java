package com.airbnb.lottie.model;

import zy.uv6;
import zy.x2;

/* JADX INFO: compiled from: DocumentData.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public float f56108f7l8;

    /* JADX INFO: renamed from: g */
    public float f8092g;

    /* JADX INFO: renamed from: k */
    public String f8093k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public boolean f56109ld6;

    /* JADX INFO: renamed from: n */
    public int f8094n;

    /* JADX INFO: renamed from: p */
    public float f8095p;

    /* JADX INFO: renamed from: q */
    public EnumC1474k f8096q;

    /* JADX INFO: renamed from: s */
    @x2
    public int f8097s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f56110toq;

    /* JADX INFO: renamed from: y */
    @x2
    public int f8098y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public float f56111zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.toq$k */
    /* JADX INFO: compiled from: DocumentData.java */
    public enum EnumC1474k {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public toq(String str, String str2, float f2, EnumC1474k enumC1474k, int i2, float f3, float f4, @x2 int i3, @x2 int i4, float f5, boolean z2) {
        m6095k(str, str2, f2, enumC1474k, i2, f3, f4, i3, i4, f5, z2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f8093k.hashCode() * 31) + this.f56110toq.hashCode()) * 31) + this.f56111zy)) * 31) + this.f8096q.ordinal()) * 31) + this.f8094n;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f8092g);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f8098y;
    }

    /* JADX INFO: renamed from: k */
    public void m6095k(String str, String str2, float f2, EnumC1474k enumC1474k, int i2, float f3, float f4, @x2 int i3, @x2 int i4, float f5, boolean z2) {
        this.f8093k = str;
        this.f56110toq = str2;
        this.f56111zy = f2;
        this.f8096q = enumC1474k;
        this.f8094n = i2;
        this.f8092g = f3;
        this.f56108f7l8 = f4;
        this.f8098y = i3;
        this.f8097s = i4;
        this.f8095p = f5;
        this.f56109ld6 = z2;
    }

    public toq() {
    }
}
