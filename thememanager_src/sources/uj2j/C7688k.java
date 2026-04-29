package uj2j;

import android.graphics.Bitmap;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: uj2j.k */
/* JADX INFO: compiled from: DeskWallpaperCardData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7688k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Bitmap f44437k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f94996toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f94997zy;

    public C7688k(@InterfaceC7395n Bitmap bitmap, boolean z2) {
        this.f44437k = bitmap;
        this.f94996toq = z2;
        this.f94997zy = true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C7688k m28068q(C7688k c7688k, Bitmap bitmap, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bitmap = c7688k.f44437k;
        }
        if ((i2 & 2) != 0) {
            z2 = c7688k.f94996toq;
        }
        return c7688k.zy(bitmap, z2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7688k)) {
            return false;
        }
        C7688k c7688k = (C7688k) obj;
        return d2ok.f7l8(this.f44437k, c7688k.f44437k) && this.f94996toq == c7688k.f94996toq;
    }

    public final boolean f7l8() {
        return this.f94997zy;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28069g() {
        return this.f94996toq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        Bitmap bitmap = this.f44437k;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        boolean z2 = this.f94996toq;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Bitmap m28070k() {
        return this.f44437k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Bitmap m28071n() {
        return this.f44437k;
    }

    @InterfaceC7396q
    public String toString() {
        return "DeskWallpaperCardData(deskWallpaper=" + this.f44437k + ", isLight=" + this.f94996toq + ')';
    }

    public final boolean toq() {
        return this.f94996toq;
    }

    /* JADX INFO: renamed from: y */
    public final void m28072y(boolean z2) {
        this.f94997zy = z2;
    }

    @InterfaceC7396q
    public final C7688k zy(@InterfaceC7395n Bitmap bitmap, boolean z2) {
        return new C7688k(bitmap, z2);
    }

    public /* synthetic */ C7688k(Bitmap bitmap, boolean z2, int i2, ni7 ni7Var) {
        this(bitmap, (i2 & 2) != 0 ? false : z2);
    }
}
