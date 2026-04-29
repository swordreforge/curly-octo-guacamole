package com.android.thememanager.lockscreen.lock;

import androidx.annotation.Keep;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class DoodleInfo {
    private boolean isAutoSolidColor;
    private int ribbonColor1;
    private int ribbonColor2;
    private int solidColor;

    public DoodleInfo(int i2, boolean z2, int i3, int i4) {
        this.solidColor = i2;
        this.isAutoSolidColor = z2;
        this.ribbonColor1 = i3;
        this.ribbonColor2 = i4;
    }

    public static /* synthetic */ DoodleInfo copy$default(DoodleInfo doodleInfo, int i2, boolean z2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = doodleInfo.solidColor;
        }
        if ((i5 & 2) != 0) {
            z2 = doodleInfo.isAutoSolidColor;
        }
        if ((i5 & 4) != 0) {
            i3 = doodleInfo.ribbonColor1;
        }
        if ((i5 & 8) != 0) {
            i4 = doodleInfo.ribbonColor2;
        }
        return doodleInfo.copy(i2, z2, i3, i4);
    }

    public final int component1() {
        return this.solidColor;
    }

    public final boolean component2() {
        return this.isAutoSolidColor;
    }

    public final int component3() {
        return this.ribbonColor1;
    }

    public final int component4() {
        return this.ribbonColor2;
    }

    @InterfaceC7396q
    public final DoodleInfo copy(int i2, boolean z2, int i3, int i4) {
        return new DoodleInfo(i2, z2, i3, i4);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoodleInfo)) {
            return false;
        }
        DoodleInfo doodleInfo = (DoodleInfo) obj;
        return this.solidColor == doodleInfo.solidColor && this.isAutoSolidColor == doodleInfo.isAutoSolidColor && this.ribbonColor1 == doodleInfo.ribbonColor1 && this.ribbonColor2 == doodleInfo.ribbonColor2;
    }

    public final int getRibbonColor1() {
        return this.ribbonColor1;
    }

    public final int getRibbonColor2() {
        return this.ribbonColor2;
    }

    public final int getSolidColor() {
        return this.solidColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.solidColor) * 31;
        boolean z2 = this.isAutoSolidColor;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + Integer.hashCode(this.ribbonColor1)) * 31) + Integer.hashCode(this.ribbonColor2);
    }

    public final boolean isAutoSolidColor() {
        return this.isAutoSolidColor;
    }

    public final void setAutoSolidColor(boolean z2) {
        this.isAutoSolidColor = z2;
    }

    public final void setRibbonColor1(int i2) {
        this.ribbonColor1 = i2;
    }

    public final void setRibbonColor2(int i2) {
        this.ribbonColor2 = i2;
    }

    public final void setSolidColor(int i2) {
        this.solidColor = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "DoodleInfo(solidColor=" + this.solidColor + ", isAutoSolidColor=" + this.isAutoSolidColor + ", ribbonColor1=" + this.ribbonColor1 + ", ribbonColor2=" + this.ribbonColor2 + ')';
    }
}
