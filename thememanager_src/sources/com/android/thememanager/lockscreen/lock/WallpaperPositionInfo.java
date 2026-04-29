package com.android.thememanager.lockscreen.lock;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperPositionInfo {
    private float bottom;
    private float left;

    @InterfaceC7395n
    private float[] matrixArr;
    private float right;
    private float top;

    public WallpaperPositionInfo(float f2, float f3, float f4, float f5, @InterfaceC7395n float[] fArr) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.matrixArr = fArr;
    }

    public static /* synthetic */ WallpaperPositionInfo copy$default(WallpaperPositionInfo wallpaperPositionInfo, float f2, float f3, float f4, float f5, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = wallpaperPositionInfo.left;
        }
        if ((i2 & 2) != 0) {
            f3 = wallpaperPositionInfo.top;
        }
        float f6 = f3;
        if ((i2 & 4) != 0) {
            f4 = wallpaperPositionInfo.right;
        }
        float f7 = f4;
        if ((i2 & 8) != 0) {
            f5 = wallpaperPositionInfo.bottom;
        }
        float f8 = f5;
        if ((i2 & 16) != 0) {
            fArr = wallpaperPositionInfo.matrixArr;
        }
        return wallpaperPositionInfo.copy(f2, f6, f7, f8, fArr);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    @InterfaceC7395n
    public final float[] component5() {
        return this.matrixArr;
    }

    @InterfaceC7396q
    public final WallpaperPositionInfo copy(float f2, float f3, float f4, float f5, @InterfaceC7395n float[] fArr) {
        return new WallpaperPositionInfo(f2, f3, f4, f5, fArr);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperPositionInfo)) {
            return false;
        }
        WallpaperPositionInfo wallpaperPositionInfo = (WallpaperPositionInfo) obj;
        return Float.compare(this.left, wallpaperPositionInfo.left) == 0 && Float.compare(this.top, wallpaperPositionInfo.top) == 0 && Float.compare(this.right, wallpaperPositionInfo.right) == 0 && Float.compare(this.bottom, wallpaperPositionInfo.bottom) == 0 && d2ok.f7l8(this.matrixArr, wallpaperPositionInfo.matrixArr);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    @InterfaceC7395n
    public final float[] getMatrixArr() {
        return this.matrixArr;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31;
        float[] fArr = this.matrixArr;
        return iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr));
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final void setLeft(float f2) {
        this.left = f2;
    }

    public final void setMatrixArr(@InterfaceC7395n float[] fArr) {
        this.matrixArr = fArr;
    }

    public final void setRight(float f2) {
        this.right = f2;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    @InterfaceC7396q
    public String toString() {
        return "WallpaperPositionInfo(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", matrixArr=" + Arrays.toString(this.matrixArr) + ')';
    }
}
