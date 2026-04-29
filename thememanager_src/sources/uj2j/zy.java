package uj2j;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SuperWallpaperInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private String f44443k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private String f95002toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f95003zy;

    public zy(@InterfaceC7395n String str, @InterfaceC7395n String str2, int i2) {
        this.f44443k = str;
        this.f95002toq = str2;
        this.f95003zy = i2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ zy m28082n(zy zyVar, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = zyVar.f44443k;
        }
        if ((i3 & 2) != 0) {
            str2 = zyVar.f95002toq;
        }
        if ((i3 & 4) != 0) {
            i2 = zyVar.f95003zy;
        }
        return zyVar.m28086q(str, str2, i2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return d2ok.f7l8(this.f44443k, zyVar.f44443k) && d2ok.f7l8(this.f95002toq, zyVar.f95002toq) && this.f95003zy == zyVar.f95003zy;
    }

    public final int f7l8() {
        return this.f95003zy;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final String m28083g() {
        return this.f95002toq;
    }

    public int hashCode() {
        String str = this.f44443k;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95002toq;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f95003zy);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final String m28084k() {
        return this.f44443k;
    }

    public final void ld6(@InterfaceC7395n String str) {
        this.f44443k = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m28085p(int i2) {
        this.f95003zy = i2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final zy m28086q(@InterfaceC7395n String str, @InterfaceC7395n String str2, int i2) {
        return new zy(str, str2, i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m28087s(@InterfaceC7395n String str) {
        this.f95002toq = str;
    }

    @InterfaceC7396q
    public String toString() {
        return "SuperWallpaperInfo(superWallpaperId=" + this.f44443k + ", serviceName=" + this.f95002toq + ", style=" + this.f95003zy + ')';
    }

    @InterfaceC7395n
    public final String toq() {
        return this.f95002toq;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final String m28088y() {
        return this.f44443k;
    }

    public final int zy() {
        return this.f95003zy;
    }

    public /* synthetic */ zy(String str, String str2, int i2, int i3, ni7 ni7Var) {
        this(str, (i3 & 2) != 0 ? null : str2, i2);
    }
}
