package com.android.thememanager.lockscreen.lock;

import androidx.annotation.Keep;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ClockInfo {
    private int classicLine1;
    private int classicLine2;
    private int classicLine3;
    private int classicLine4;
    private int classicLine5;

    @InterfaceC7396q
    private String classicSignature;
    private boolean enableDiffusion;
    private boolean isAutoPrimaryColor;
    private boolean isAutoSecondaryColor;
    private boolean isDiffHourMinuteColor;
    private int primaryColor;
    private int secondaryColor;
    private int style;

    @InterfaceC7396q
    private final String templateId;

    public ClockInfo(@InterfaceC7396q String templateId, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8, int i9, @InterfaceC7396q String classicSignature, boolean z3, boolean z5, boolean z6) {
        d2ok.m23075h(templateId, "templateId");
        d2ok.m23075h(classicSignature, "classicSignature");
        this.templateId = templateId;
        this.primaryColor = i2;
        this.secondaryColor = i3;
        this.style = i4;
        this.enableDiffusion = z2;
        this.classicLine1 = i5;
        this.classicLine2 = i6;
        this.classicLine3 = i7;
        this.classicLine4 = i8;
        this.classicLine5 = i9;
        this.classicSignature = classicSignature;
        this.isAutoPrimaryColor = z3;
        this.isAutoSecondaryColor = z5;
        this.isDiffHourMinuteColor = z6;
    }

    @InterfaceC7396q
    public final String component1() {
        return this.templateId;
    }

    public final int component10() {
        return this.classicLine5;
    }

    @InterfaceC7396q
    public final String component11() {
        return this.classicSignature;
    }

    public final boolean component12() {
        return this.isAutoPrimaryColor;
    }

    public final boolean component13() {
        return this.isAutoSecondaryColor;
    }

    public final boolean component14() {
        return this.isDiffHourMinuteColor;
    }

    public final int component2() {
        return this.primaryColor;
    }

    public final int component3() {
        return this.secondaryColor;
    }

    public final int component4() {
        return this.style;
    }

    public final boolean component5() {
        return this.enableDiffusion;
    }

    public final int component6() {
        return this.classicLine1;
    }

    public final int component7() {
        return this.classicLine2;
    }

    public final int component8() {
        return this.classicLine3;
    }

    public final int component9() {
        return this.classicLine4;
    }

    @InterfaceC7396q
    public final ClockInfo copy(@InterfaceC7396q String templateId, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8, int i9, @InterfaceC7396q String classicSignature, boolean z3, boolean z5, boolean z6) {
        d2ok.m23075h(templateId, "templateId");
        d2ok.m23075h(classicSignature, "classicSignature");
        return new ClockInfo(templateId, i2, i3, i4, z2, i5, i6, i7, i8, i9, classicSignature, z3, z5, z6);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInfo)) {
            return false;
        }
        ClockInfo clockInfo = (ClockInfo) obj;
        return d2ok.f7l8(this.templateId, clockInfo.templateId) && this.primaryColor == clockInfo.primaryColor && this.secondaryColor == clockInfo.secondaryColor && this.style == clockInfo.style && this.enableDiffusion == clockInfo.enableDiffusion && this.classicLine1 == clockInfo.classicLine1 && this.classicLine2 == clockInfo.classicLine2 && this.classicLine3 == clockInfo.classicLine3 && this.classicLine4 == clockInfo.classicLine4 && this.classicLine5 == clockInfo.classicLine5 && d2ok.f7l8(this.classicSignature, clockInfo.classicSignature) && this.isAutoPrimaryColor == clockInfo.isAutoPrimaryColor && this.isAutoSecondaryColor == clockInfo.isAutoSecondaryColor && this.isDiffHourMinuteColor == clockInfo.isDiffHourMinuteColor;
    }

    public final int getClassicLine1() {
        return this.classicLine1;
    }

    public final int getClassicLine2() {
        return this.classicLine2;
    }

    public final int getClassicLine3() {
        return this.classicLine3;
    }

    public final int getClassicLine4() {
        return this.classicLine4;
    }

    public final int getClassicLine5() {
        return this.classicLine5;
    }

    @InterfaceC7396q
    public final String getClassicSignature() {
        return this.classicSignature;
    }

    public final boolean getEnableDiffusion() {
        return this.enableDiffusion;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getStyle() {
        return this.style;
    }

    @InterfaceC7396q
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((this.templateId.hashCode() * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.secondaryColor)) * 31) + Integer.hashCode(this.style)) * 31;
        boolean z2 = this.enableDiffusion;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.classicLine1)) * 31) + Integer.hashCode(this.classicLine2)) * 31) + Integer.hashCode(this.classicLine3)) * 31) + Integer.hashCode(this.classicLine4)) * 31) + Integer.hashCode(this.classicLine5)) * 31) + this.classicSignature.hashCode()) * 31;
        boolean z3 = this.isAutoPrimaryColor;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        int i2 = (iHashCode2 + r12) * 31;
        boolean z5 = this.isAutoSecondaryColor;
        ?? r13 = z5;
        if (z5) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        boolean z6 = this.isDiffHourMinuteColor;
        return i3 + (z6 ? 1 : z6);
    }

    public final boolean isAutoPrimaryColor() {
        return this.isAutoPrimaryColor;
    }

    public final boolean isAutoSecondaryColor() {
        return this.isAutoSecondaryColor;
    }

    public final boolean isDiffHourMinuteColor() {
        return this.isDiffHourMinuteColor;
    }

    public final void setAutoPrimaryColor(boolean z2) {
        this.isAutoPrimaryColor = z2;
    }

    public final void setAutoSecondaryColor(boolean z2) {
        this.isAutoSecondaryColor = z2;
    }

    public final void setClassicLine1(int i2) {
        this.classicLine1 = i2;
    }

    public final void setClassicLine2(int i2) {
        this.classicLine2 = i2;
    }

    public final void setClassicLine3(int i2) {
        this.classicLine3 = i2;
    }

    public final void setClassicLine4(int i2) {
        this.classicLine4 = i2;
    }

    public final void setClassicLine5(int i2) {
        this.classicLine5 = i2;
    }

    public final void setClassicSignature(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<set-?>");
        this.classicSignature = str;
    }

    public final void setDiffHourMinuteColor(boolean z2) {
        this.isDiffHourMinuteColor = z2;
    }

    public final void setEnableDiffusion(boolean z2) {
        this.enableDiffusion = z2;
    }

    public final void setPrimaryColor(int i2) {
        this.primaryColor = i2;
    }

    public final void setSecondaryColor(int i2) {
        this.secondaryColor = i2;
    }

    public final void setStyle(int i2) {
        this.style = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "ClockInfo(templateId=" + this.templateId + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", style=" + this.style + ", enableDiffusion=" + this.enableDiffusion + ", classicLine1=" + this.classicLine1 + ", classicLine2=" + this.classicLine2 + ", classicLine3=" + this.classicLine3 + ", classicLine4=" + this.classicLine4 + ", classicLine5=" + this.classicLine5 + ", classicSignature=" + this.classicSignature + ", isAutoPrimaryColor=" + this.isAutoPrimaryColor + ", isAutoSecondaryColor=" + this.isAutoSecondaryColor + ", isDiffHourMinuteColor=" + this.isDiffHourMinuteColor + ')';
    }

    public /* synthetic */ ClockInfo(String str, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8, int i9, String str2, boolean z3, boolean z5, boolean z6, int i10, ni7 ni7Var) {
        this(str, i2, i3, i4, z2, i5, i6, i7, i8, i9, (i10 & 1024) != 0 ? "" : str2, z3, z5, z6);
    }
}
