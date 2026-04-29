package miuix.view;

import android.content.res.Configuration;

/* JADX INFO: renamed from: miuix.view.y */
/* JADX INFO: compiled from: DisplayConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7389y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public float f92295f7l8;

    /* JADX INFO: renamed from: g */
    public float f42310g;

    /* JADX INFO: renamed from: k */
    public int f42311k;

    /* JADX INFO: renamed from: n */
    public float f42312n;

    /* JADX INFO: renamed from: q */
    public int f42313q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f92296toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f92297zy;

    public C7389y(Configuration configuration) {
        this.f42311k = configuration.screenWidthDp;
        this.f92296toq = configuration.screenHeightDp;
        int i2 = configuration.densityDpi;
        this.f92297zy = i2;
        this.f42313q = i2;
        float f2 = i2 * 0.00625f;
        this.f42312n = f2;
        float f3 = configuration.fontScale;
        this.f92295f7l8 = f3;
        this.f42310g = f2 * (f3 == 0.0f ? 1.0f : f3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7389y)) {
            return false;
        }
        C7389y c7389y = (C7389y) obj;
        return Float.compare(this.f42312n, c7389y.f42312n) == 0 && Float.compare(this.f42310g, c7389y.f42310g) == 0 && Float.compare(this.f92295f7l8, c7389y.f92295f7l8) == 0 && this.f42313q == c7389y.f42313q && this.f92297zy == c7389y.f92297zy;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "{ densityDpi:" + this.f42313q + ", density:" + this.f42312n + ", windowWidthDp:" + this.f42311k + ", windowHeightDp: " + this.f92296toq + ", scaledDensity:" + this.f42310g + ", fontScale: " + this.f92295f7l8 + ", defaultBitmapDensity:" + this.f92297zy + "}";
    }
}
