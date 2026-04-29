package yl;

import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: yl.s */
/* JADX INFO: compiled from: PickerAnimHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7789s {

    /* JADX INFO: renamed from: k */
    private boolean f45957k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private AbstractC7785k f100623toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f100624zy;

    public C7789s(boolean z2, @InterfaceC7396q AbstractC7785k animStatus, float f2) {
        d2ok.m23075h(animStatus, "animStatus");
        this.f45957k = z2;
        this.f100623toq = animStatus;
        this.f100624zy = f2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C7789s m28176n(C7789s c7789s, boolean z2, AbstractC7785k abstractC7785k, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = c7789s.f45957k;
        }
        if ((i2 & 2) != 0) {
            abstractC7785k = c7789s.f100623toq;
        }
        if ((i2 & 4) != 0) {
            f2 = c7789s.f100624zy;
        }
        return c7789s.m28180q(z2, abstractC7785k, f2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7789s)) {
            return false;
        }
        C7789s c7789s = (C7789s) obj;
        return this.f45957k == c7789s.f45957k && d2ok.f7l8(this.f100623toq, c7789s.f100623toq) && Float.compare(this.f100624zy, c7789s.f100624zy) == 0;
    }

    public final float f7l8() {
        return this.f100624zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final AbstractC7785k m28177g() {
        return this.f100623toq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z2 = this.f45957k;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return (((r0 * 31) + this.f100623toq.hashCode()) * 31) + Float.hashCode(this.f100624zy);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m28178k() {
        return this.f45957k;
    }

    public final void ld6(float f2) {
        this.f100624zy = f2;
    }

    /* JADX INFO: renamed from: p */
    public final void m28179p(boolean z2) {
        this.f45957k = z2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final C7789s m28180q(boolean z2, @InterfaceC7396q AbstractC7785k animStatus, float f2) {
        d2ok.m23075h(animStatus, "animStatus");
        return new C7789s(z2, animStatus, f2);
    }

    /* JADX INFO: renamed from: s */
    public final void m28181s(@InterfaceC7396q AbstractC7785k abstractC7785k) {
        d2ok.m23075h(abstractC7785k, "<set-?>");
        this.f100623toq = abstractC7785k;
    }

    @InterfaceC7396q
    public String toString() {
        return "PickerAnimStatus(isPickerIn=" + this.f45957k + ", animStatus=" + this.f100623toq + ", progress=" + this.f100624zy + ')';
    }

    @InterfaceC7396q
    public final AbstractC7785k toq() {
        return this.f100623toq;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m28182y() {
        return this.f45957k;
    }

    public final float zy() {
        return this.f100624zy;
    }
}
