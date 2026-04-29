package uj2j;

import android.graphics.Bitmap;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: uj2j.q */
/* JADX INFO: compiled from: ThemeCardData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7689q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Bitmap f44438k;

    /* JADX INFO: renamed from: n */
    private boolean f44439n = true;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final String f44440q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final Bitmap f94998toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f94999zy;

    public C7689q(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n Bitmap bitmap2, int i2, @InterfaceC7395n String str) {
        this.f44438k = bitmap;
        this.f94998toq = bitmap2;
        this.f94999zy = i2;
        this.f44440q = str;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C7689q m28073g(C7689q c7689q, Bitmap bitmap, Bitmap bitmap2, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bitmap = c7689q.f44438k;
        }
        if ((i3 & 2) != 0) {
            bitmap2 = c7689q.f94998toq;
        }
        if ((i3 & 4) != 0) {
            i2 = c7689q.f94999zy;
        }
        if ((i3 & 8) != 0) {
            str = c7689q.f44440q;
        }
        return c7689q.m28075n(bitmap, bitmap2, i2, str);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7689q)) {
            return false;
        }
        C7689q c7689q = (C7689q) obj;
        return d2ok.f7l8(this.f44438k, c7689q.f44438k) && d2ok.f7l8(this.f94998toq, c7689q.f94998toq) && this.f94999zy == c7689q.f94999zy && d2ok.f7l8(this.f44440q, c7689q.f44440q);
    }

    public final int f7l8() {
        return this.f94999zy;
    }

    public int hashCode() {
        Bitmap bitmap = this.f44438k;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.f94998toq;
        int iHashCode2 = (((iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31) + Integer.hashCode(this.f94999zy)) * 31;
        String str = this.f44440q;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Bitmap m28074k() {
        return this.f44438k;
    }

    public final boolean ld6() {
        return this.f44439n;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final C7689q m28075n(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n Bitmap bitmap2, int i2, @InterfaceC7395n String str) {
        return new C7689q(bitmap, bitmap2, i2, str);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public final String m28076p() {
        return this.f44440q;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final String m28077q() {
        return this.f44440q;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final Bitmap m28078s() {
        return this.f44438k;
    }

    @InterfaceC7396q
    public String toString() {
        return "ThemeCardData(lockBitmap=" + this.f44438k + ", deskBitmap=" + this.f94998toq + ", bgColor=" + this.f94999zy + ", themeName=" + this.f44440q + ')';
    }

    @InterfaceC7395n
    public final Bitmap toq() {
        return this.f94998toq;
    }

    public final void x2(boolean z2) {
        this.f44439n = z2;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final Bitmap m28079y() {
        return this.f94998toq;
    }

    public final int zy() {
        return this.f94999zy;
    }
}
