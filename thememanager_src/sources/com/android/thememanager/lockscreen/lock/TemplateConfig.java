package com.android.thememanager.lockscreen.lock;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class TemplateConfig {

    @InterfaceC7395n
    private final ColorData autoColorData;

    @InterfaceC7396q
    private final ClockInfo clockInfo;

    @InterfaceC7395n
    private transient Bitmap currentWallpaper;

    @InterfaceC7395n
    private transient Bitmap darkenBitmap;

    @InterfaceC7395n
    private DoodleInfo doodle;
    private transient int randomColorType;

    @InterfaceC7395n
    private final SignatureInfo signatureInfo;

    @InterfaceC7395n
    private final SmartFrameInfo smartFrame;

    @InterfaceC7395n
    private WallpaperInfo wallpaperInfo;

    public TemplateConfig(@InterfaceC7396q ClockInfo clockInfo, @InterfaceC7395n SignatureInfo signatureInfo, @InterfaceC7395n WallpaperInfo wallpaperInfo, @InterfaceC7395n DoodleInfo doodleInfo, @InterfaceC7395n SmartFrameInfo smartFrameInfo, @InterfaceC7395n ColorData colorData) {
        d2ok.m23075h(clockInfo, "clockInfo");
        this.clockInfo = clockInfo;
        this.signatureInfo = signatureInfo;
        this.wallpaperInfo = wallpaperInfo;
        this.doodle = doodleInfo;
        this.smartFrame = smartFrameInfo;
        this.autoColorData = colorData;
    }

    public static /* synthetic */ TemplateConfig copy$default(TemplateConfig templateConfig, ClockInfo clockInfo, SignatureInfo signatureInfo, WallpaperInfo wallpaperInfo, DoodleInfo doodleInfo, SmartFrameInfo smartFrameInfo, ColorData colorData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clockInfo = templateConfig.clockInfo;
        }
        if ((i2 & 2) != 0) {
            signatureInfo = templateConfig.signatureInfo;
        }
        SignatureInfo signatureInfo2 = signatureInfo;
        if ((i2 & 4) != 0) {
            wallpaperInfo = templateConfig.wallpaperInfo;
        }
        WallpaperInfo wallpaperInfo2 = wallpaperInfo;
        if ((i2 & 8) != 0) {
            doodleInfo = templateConfig.doodle;
        }
        DoodleInfo doodleInfo2 = doodleInfo;
        if ((i2 & 16) != 0) {
            smartFrameInfo = templateConfig.smartFrame;
        }
        SmartFrameInfo smartFrameInfo2 = smartFrameInfo;
        if ((i2 & 32) != 0) {
            colorData = templateConfig.autoColorData;
        }
        return templateConfig.copy(clockInfo, signatureInfo2, wallpaperInfo2, doodleInfo2, smartFrameInfo2, colorData);
    }

    @InterfaceC7396q
    public final ClockInfo component1() {
        return this.clockInfo;
    }

    @InterfaceC7395n
    public final SignatureInfo component2() {
        return this.signatureInfo;
    }

    @InterfaceC7395n
    public final WallpaperInfo component3() {
        return this.wallpaperInfo;
    }

    @InterfaceC7395n
    public final DoodleInfo component4() {
        return this.doodle;
    }

    @InterfaceC7395n
    public final SmartFrameInfo component5() {
        return this.smartFrame;
    }

    @InterfaceC7395n
    public final ColorData component6() {
        return this.autoColorData;
    }

    @InterfaceC7396q
    public final TemplateConfig copy(@InterfaceC7396q ClockInfo clockInfo, @InterfaceC7395n SignatureInfo signatureInfo, @InterfaceC7395n WallpaperInfo wallpaperInfo, @InterfaceC7395n DoodleInfo doodleInfo, @InterfaceC7395n SmartFrameInfo smartFrameInfo, @InterfaceC7395n ColorData colorData) {
        d2ok.m23075h(clockInfo, "clockInfo");
        return new TemplateConfig(clockInfo, signatureInfo, wallpaperInfo, doodleInfo, smartFrameInfo, colorData);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateConfig)) {
            return false;
        }
        TemplateConfig templateConfig = (TemplateConfig) obj;
        return d2ok.f7l8(this.clockInfo, templateConfig.clockInfo) && d2ok.f7l8(this.signatureInfo, templateConfig.signatureInfo) && d2ok.f7l8(this.wallpaperInfo, templateConfig.wallpaperInfo) && d2ok.f7l8(this.doodle, templateConfig.doodle) && d2ok.f7l8(this.smartFrame, templateConfig.smartFrame) && d2ok.f7l8(this.autoColorData, templateConfig.autoColorData);
    }

    @InterfaceC7395n
    public final ColorData getAutoColorData() {
        return this.autoColorData;
    }

    @InterfaceC7396q
    public final ClockInfo getClockInfo() {
        return this.clockInfo;
    }

    @InterfaceC7395n
    public final Bitmap getCurrentWallpaper() {
        return this.currentWallpaper;
    }

    @InterfaceC7395n
    public final Bitmap getDarkenBitmap() {
        return this.darkenBitmap;
    }

    @InterfaceC7395n
    public final DoodleInfo getDoodle() {
        return this.doodle;
    }

    public final int getRandomColorType() {
        return this.randomColorType;
    }

    @InterfaceC7395n
    public final SignatureInfo getSignatureInfo() {
        return this.signatureInfo;
    }

    @InterfaceC7395n
    public final SmartFrameInfo getSmartFrame() {
        return this.smartFrame;
    }

    @InterfaceC7395n
    public final WallpaperInfo getWallpaperInfo() {
        return this.wallpaperInfo;
    }

    public int hashCode() {
        int iHashCode = this.clockInfo.hashCode() * 31;
        SignatureInfo signatureInfo = this.signatureInfo;
        int iHashCode2 = (iHashCode + (signatureInfo == null ? 0 : signatureInfo.hashCode())) * 31;
        WallpaperInfo wallpaperInfo = this.wallpaperInfo;
        int iHashCode3 = (iHashCode2 + (wallpaperInfo == null ? 0 : wallpaperInfo.hashCode())) * 31;
        DoodleInfo doodleInfo = this.doodle;
        int iHashCode4 = (iHashCode3 + (doodleInfo == null ? 0 : doodleInfo.hashCode())) * 31;
        SmartFrameInfo smartFrameInfo = this.smartFrame;
        int iHashCode5 = (iHashCode4 + (smartFrameInfo == null ? 0 : smartFrameInfo.hashCode())) * 31;
        ColorData colorData = this.autoColorData;
        return iHashCode5 + (colorData != null ? colorData.hashCode() : 0);
    }

    public final void setCurrentWallpaper(@InterfaceC7395n Bitmap bitmap) {
        this.currentWallpaper = bitmap;
    }

    public final void setDarkenBitmap(@InterfaceC7395n Bitmap bitmap) {
        this.darkenBitmap = bitmap;
    }

    public final void setDoodle(@InterfaceC7395n DoodleInfo doodleInfo) {
        this.doodle = doodleInfo;
    }

    public final void setRandomColorType(int i2) {
        this.randomColorType = i2;
    }

    public final void setWallpaperInfo(@InterfaceC7395n WallpaperInfo wallpaperInfo) {
        this.wallpaperInfo = wallpaperInfo;
    }

    @InterfaceC7396q
    public String toString() {
        return "TemplateConfig(clockInfo=" + this.clockInfo + ", signatureInfo=" + this.signatureInfo + ", wallpaperInfo=" + this.wallpaperInfo + ", doodle=" + this.doodle + ", smartFrame=" + this.smartFrame + ", autoColorData=" + this.autoColorData + ')';
    }
}
