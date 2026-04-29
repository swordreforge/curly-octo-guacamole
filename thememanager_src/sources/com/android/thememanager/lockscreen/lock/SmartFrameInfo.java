package com.android.thememanager.lockscreen.lock;

import androidx.annotation.Keep;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SmartFrameInfo {
    private boolean isAutoSolidColor;
    private int shape;
    private int solidColor;

    public SmartFrameInfo(int i2, boolean z2, int i3) {
        this.solidColor = i2;
        this.isAutoSolidColor = z2;
        this.shape = i3;
    }

    public static /* synthetic */ SmartFrameInfo copy$default(SmartFrameInfo smartFrameInfo, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = smartFrameInfo.solidColor;
        }
        if ((i4 & 2) != 0) {
            z2 = smartFrameInfo.isAutoSolidColor;
        }
        if ((i4 & 4) != 0) {
            i3 = smartFrameInfo.shape;
        }
        return smartFrameInfo.copy(i2, z2, i3);
    }

    public final int component1() {
        return this.solidColor;
    }

    public final boolean component2() {
        return this.isAutoSolidColor;
    }

    public final int component3() {
        return this.shape;
    }

    @InterfaceC7396q
    public final SmartFrameInfo copy(int i2, boolean z2, int i3) {
        return new SmartFrameInfo(i2, z2, i3);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartFrameInfo)) {
            return false;
        }
        SmartFrameInfo smartFrameInfo = (SmartFrameInfo) obj;
        return this.solidColor == smartFrameInfo.solidColor && this.isAutoSolidColor == smartFrameInfo.isAutoSolidColor && this.shape == smartFrameInfo.shape;
    }

    public final int getShape() {
        return this.shape;
    }

    public final int getSolidColor() {
        return this.solidColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.solidColor) * 31;
        boolean z2 = this.isAutoSolidColor;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.shape);
    }

    public final boolean isAutoSolidColor() {
        return this.isAutoSolidColor;
    }

    public final void setAutoSolidColor(boolean z2) {
        this.isAutoSolidColor = z2;
    }

    public final void setShape(int i2) {
        this.shape = i2;
    }

    public final void setSolidColor(int i2) {
        this.solidColor = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "SmartFrameInfo(solidColor=" + this.solidColor + ", isAutoSolidColor=" + this.isAutoSolidColor + ", shape=" + this.shape + ')';
    }
}
