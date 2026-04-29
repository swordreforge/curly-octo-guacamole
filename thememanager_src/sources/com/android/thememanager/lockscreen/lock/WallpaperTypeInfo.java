package com.android.thememanager.lockscreen.lock;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperTypeInfo {

    @InterfaceC7395n
    private Bitmap bitmap;

    @InterfaceC7395n
    private String maskPath;
    private int mattingMode;

    @InterfaceC7395n
    private String resourcePath;

    @InterfaceC7395n
    private String type;

    public WallpaperTypeInfo(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2) {
        this.bitmap = bitmap;
        this.type = str;
        this.resourcePath = str2;
        this.maskPath = str3;
        this.mattingMode = i2;
    }

    public static /* synthetic */ WallpaperTypeInfo copy$default(WallpaperTypeInfo wallpaperTypeInfo, Bitmap bitmap, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bitmap = wallpaperTypeInfo.bitmap;
        }
        if ((i3 & 2) != 0) {
            str = wallpaperTypeInfo.type;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = wallpaperTypeInfo.resourcePath;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = wallpaperTypeInfo.maskPath;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = wallpaperTypeInfo.mattingMode;
        }
        return wallpaperTypeInfo.copy(bitmap, str4, str5, str6, i2);
    }

    @InterfaceC7395n
    public final Bitmap component1() {
        return this.bitmap;
    }

    @InterfaceC7395n
    public final String component2() {
        return this.type;
    }

    @InterfaceC7395n
    public final String component3() {
        return this.resourcePath;
    }

    @InterfaceC7395n
    public final String component4() {
        return this.maskPath;
    }

    public final int component5() {
        return this.mattingMode;
    }

    @InterfaceC7396q
    public final WallpaperTypeInfo copy(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2) {
        return new WallpaperTypeInfo(bitmap, str, str2, str3, i2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperTypeInfo)) {
            return false;
        }
        WallpaperTypeInfo wallpaperTypeInfo = (WallpaperTypeInfo) obj;
        return d2ok.f7l8(this.bitmap, wallpaperTypeInfo.bitmap) && d2ok.f7l8(this.type, wallpaperTypeInfo.type) && d2ok.f7l8(this.resourcePath, wallpaperTypeInfo.resourcePath) && d2ok.f7l8(this.maskPath, wallpaperTypeInfo.maskPath) && this.mattingMode == wallpaperTypeInfo.mattingMode;
    }

    @InterfaceC7395n
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @InterfaceC7395n
    public final String getMaskPath() {
        return this.maskPath;
    }

    public final int getMattingMode() {
        return this.mattingMode;
    }

    @InterfaceC7395n
    public final String getResourcePath() {
        return this.resourcePath;
    }

    @InterfaceC7395n
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Bitmap bitmap = this.bitmap;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resourcePath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maskPath;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.mattingMode);
    }

    public final void setBitmap(@InterfaceC7395n Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setMaskPath(@InterfaceC7395n String str) {
        this.maskPath = str;
    }

    public final void setMattingMode(int i2) {
        this.mattingMode = i2;
    }

    public final void setResourcePath(@InterfaceC7395n String str) {
        this.resourcePath = str;
    }

    public final void setType(@InterfaceC7395n String str) {
        this.type = str;
    }

    @InterfaceC7396q
    public String toString() {
        return "WallpaperTypeInfo(bitmap=" + this.bitmap + ", type=" + this.type + ", resourcePath=" + this.resourcePath + ", maskPath=" + this.maskPath + ", mattingMode=" + this.mattingMode + ')';
    }

    public /* synthetic */ WallpaperTypeInfo(Bitmap bitmap, String str, String str2, String str3, int i2, int i3, ni7 ni7Var) {
        this(bitmap, str, str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? 0 : i2);
    }
}
