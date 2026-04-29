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
public final class WallpaperInfo {

    @InterfaceC7395n
    private String cropSubject;
    private boolean enableBlur;
    private boolean isNeedDark;
    private int magicType;

    @InterfaceC7395n
    private String mask;

    @InterfaceC7395n
    private String originResourcePath;

    @InterfaceC7395n
    private WallpaperPositionInfo positionInfo;

    @InterfaceC7395n
    private String resourceType;

    @InterfaceC7396q
    private String source;

    @InterfaceC7395n
    private String subject;

    @InterfaceC7395n
    private transient Bitmap subjectBitmap;
    private boolean supportSubject;

    public WallpaperInfo(@InterfaceC7396q String source, @InterfaceC7395n String str, @InterfaceC7395n String str2, int i2, @InterfaceC7395n String str3, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo, @InterfaceC7395n String str4, @InterfaceC7395n String str5, boolean z2, boolean z3, boolean z5) {
        d2ok.m23075h(source, "source");
        this.source = source;
        this.mask = str;
        this.subject = str2;
        this.magicType = i2;
        this.cropSubject = str3;
        this.positionInfo = wallpaperPositionInfo;
        this.resourceType = str4;
        this.originResourcePath = str5;
        this.supportSubject = z2;
        this.isNeedDark = z3;
        this.enableBlur = z5;
    }

    @InterfaceC7396q
    public final String component1() {
        return this.source;
    }

    public final boolean component10() {
        return this.isNeedDark;
    }

    public final boolean component11() {
        return this.enableBlur;
    }

    @InterfaceC7395n
    public final String component2() {
        return this.mask;
    }

    @InterfaceC7395n
    public final String component3() {
        return this.subject;
    }

    public final int component4() {
        return this.magicType;
    }

    @InterfaceC7395n
    public final String component5() {
        return this.cropSubject;
    }

    @InterfaceC7395n
    public final WallpaperPositionInfo component6() {
        return this.positionInfo;
    }

    @InterfaceC7395n
    public final String component7() {
        return this.resourceType;
    }

    @InterfaceC7395n
    public final String component8() {
        return this.originResourcePath;
    }

    public final boolean component9() {
        return this.supportSubject;
    }

    @InterfaceC7396q
    public final WallpaperInfo copy(@InterfaceC7396q String source, @InterfaceC7395n String str, @InterfaceC7395n String str2, int i2, @InterfaceC7395n String str3, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo, @InterfaceC7395n String str4, @InterfaceC7395n String str5, boolean z2, boolean z3, boolean z5) {
        d2ok.m23075h(source, "source");
        return new WallpaperInfo(source, str, str2, i2, str3, wallpaperPositionInfo, str4, str5, z2, z3, z5);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperInfo)) {
            return false;
        }
        WallpaperInfo wallpaperInfo = (WallpaperInfo) obj;
        return d2ok.f7l8(this.source, wallpaperInfo.source) && d2ok.f7l8(this.mask, wallpaperInfo.mask) && d2ok.f7l8(this.subject, wallpaperInfo.subject) && this.magicType == wallpaperInfo.magicType && d2ok.f7l8(this.cropSubject, wallpaperInfo.cropSubject) && d2ok.f7l8(this.positionInfo, wallpaperInfo.positionInfo) && d2ok.f7l8(this.resourceType, wallpaperInfo.resourceType) && d2ok.f7l8(this.originResourcePath, wallpaperInfo.originResourcePath) && this.supportSubject == wallpaperInfo.supportSubject && this.isNeedDark == wallpaperInfo.isNeedDark && this.enableBlur == wallpaperInfo.enableBlur;
    }

    @InterfaceC7395n
    public final String getCropSubject() {
        return this.cropSubject;
    }

    public final boolean getEnableBlur() {
        return this.enableBlur;
    }

    public final int getMagicType() {
        return this.magicType;
    }

    @InterfaceC7395n
    public final String getMask() {
        return this.mask;
    }

    @InterfaceC7395n
    public final String getOriginResourcePath() {
        return this.originResourcePath;
    }

    @InterfaceC7395n
    public final WallpaperPositionInfo getPositionInfo() {
        return this.positionInfo;
    }

    @InterfaceC7395n
    public final String getResourceType() {
        return this.resourceType;
    }

    @InterfaceC7396q
    public final String getSource() {
        return this.source;
    }

    @InterfaceC7395n
    public final String getSubject() {
        return this.subject;
    }

    @InterfaceC7395n
    public final Bitmap getSubjectBitmap() {
        return this.subjectBitmap;
    }

    public final boolean getSupportSubject() {
        return this.supportSubject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mask;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subject;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.magicType)) * 31;
        String str3 = this.cropSubject;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WallpaperPositionInfo wallpaperPositionInfo = this.positionInfo;
        int iHashCode5 = (iHashCode4 + (wallpaperPositionInfo == null ? 0 : wallpaperPositionInfo.hashCode())) * 31;
        String str4 = this.resourceType;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originResourcePath;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z2 = this.supportSubject;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i2 = (iHashCode7 + r1) * 31;
        boolean z3 = this.isNeedDark;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        int i3 = (i2 + r12) * 31;
        boolean z5 = this.enableBlur;
        return i3 + (z5 ? 1 : z5);
    }

    public final boolean isNeedDark() {
        return this.isNeedDark;
    }

    public final void setCropSubject(@InterfaceC7395n String str) {
        this.cropSubject = str;
    }

    public final void setEnableBlur(boolean z2) {
        this.enableBlur = z2;
    }

    public final void setMagicType(int i2) {
        this.magicType = i2;
    }

    public final void setMask(@InterfaceC7395n String str) {
        this.mask = str;
    }

    public final void setNeedDark(boolean z2) {
        this.isNeedDark = z2;
    }

    public final void setOriginResourcePath(@InterfaceC7395n String str) {
        this.originResourcePath = str;
    }

    public final void setPositionInfo(@InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        this.positionInfo = wallpaperPositionInfo;
    }

    public final void setResourceType(@InterfaceC7395n String str) {
        this.resourceType = str;
    }

    public final void setSource(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<set-?>");
        this.source = str;
    }

    public final void setSubject(@InterfaceC7395n String str) {
        this.subject = str;
    }

    public final void setSubjectBitmap(@InterfaceC7395n Bitmap bitmap) {
        this.subjectBitmap = bitmap;
    }

    public final void setSupportSubject(boolean z2) {
        this.supportSubject = z2;
    }

    @InterfaceC7396q
    public String toString() {
        return "WallpaperInfo(source=" + this.source + ", mask=" + this.mask + ", subject=" + this.subject + ", magicType=" + this.magicType + ", cropSubject=" + this.cropSubject + ", positionInfo=" + this.positionInfo + ", resourceType=" + this.resourceType + ", originResourcePath=" + this.originResourcePath + ", supportSubject=" + this.supportSubject + ", isNeedDark=" + this.isNeedDark + ", enableBlur=" + this.enableBlur + ')';
    }

    public /* synthetic */ WallpaperInfo(String str, String str2, String str3, int i2, String str4, WallpaperPositionInfo wallpaperPositionInfo, String str5, String str6, boolean z2, boolean z3, boolean z5, int i3, ni7 ni7Var) {
        this(str, str2, str3, i2, str4, wallpaperPositionInfo, str5, str6, (i3 & 256) != 0 ? true : z2, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z5);
    }
}
