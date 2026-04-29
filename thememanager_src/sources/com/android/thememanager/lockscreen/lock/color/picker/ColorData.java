package com.android.thememanager.lockscreen.lock.color.picker;

import androidx.annotation.Keep;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import java.util.Map;
import kotlin.collections.nn86;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ColorBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ColorData {

    @InterfaceC7396q
    private final Map<String, Integer> clockPalette;
    private final boolean darkClockArea;
    private final boolean darkInfoText;
    private final boolean darkSignatureArea;
    private final int extraColor1;
    private final int extraColor2;
    private final int primaryColor;
    private final int randomColorType;
    private final int secondaryColor;

    @InterfaceC7396q
    private final Map<String, Integer> signaturePalette;

    public ColorData() {
        this(0, 0, 0, 0, false, false, null, false, null, 0, InterfaceC3239x.f63281ncyb, null);
    }

    public ColorData(int i2, int i3, int i4, int i5, boolean z2, boolean z3, @InterfaceC7396q Map<String, Integer> clockPalette, boolean z5, @InterfaceC7396q Map<String, Integer> signaturePalette, int i6) {
        d2ok.m23075h(clockPalette, "clockPalette");
        d2ok.m23075h(signaturePalette, "signaturePalette");
        this.primaryColor = i2;
        this.secondaryColor = i3;
        this.extraColor1 = i4;
        this.extraColor2 = i5;
        this.darkClockArea = z2;
        this.darkInfoText = z3;
        this.clockPalette = clockPalette;
        this.darkSignatureArea = z5;
        this.signaturePalette = signaturePalette;
        this.randomColorType = i6;
    }

    public final int component1() {
        return this.primaryColor;
    }

    public final int component10() {
        return this.randomColorType;
    }

    public final int component2() {
        return this.secondaryColor;
    }

    public final int component3() {
        return this.extraColor1;
    }

    public final int component4() {
        return this.extraColor2;
    }

    public final boolean component5() {
        return this.darkClockArea;
    }

    public final boolean component6() {
        return this.darkInfoText;
    }

    @InterfaceC7396q
    public final Map<String, Integer> component7() {
        return this.clockPalette;
    }

    public final boolean component8() {
        return this.darkSignatureArea;
    }

    @InterfaceC7396q
    public final Map<String, Integer> component9() {
        return this.signaturePalette;
    }

    @InterfaceC7396q
    public final ColorData copy(int i2, int i3, int i4, int i5, boolean z2, boolean z3, @InterfaceC7396q Map<String, Integer> clockPalette, boolean z5, @InterfaceC7396q Map<String, Integer> signaturePalette, int i6) {
        d2ok.m23075h(clockPalette, "clockPalette");
        d2ok.m23075h(signaturePalette, "signaturePalette");
        return new ColorData(i2, i3, i4, i5, z2, z3, clockPalette, z5, signaturePalette, i6);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorData)) {
            return false;
        }
        ColorData colorData = (ColorData) obj;
        return this.primaryColor == colorData.primaryColor && this.secondaryColor == colorData.secondaryColor && this.extraColor1 == colorData.extraColor1 && this.extraColor2 == colorData.extraColor2 && this.darkClockArea == colorData.darkClockArea && this.darkInfoText == colorData.darkInfoText && d2ok.f7l8(this.clockPalette, colorData.clockPalette) && this.darkSignatureArea == colorData.darkSignatureArea && d2ok.f7l8(this.signaturePalette, colorData.signaturePalette) && this.randomColorType == colorData.randomColorType;
    }

    @InterfaceC7396q
    public final Map<String, Integer> getClockPalette() {
        return this.clockPalette;
    }

    public final boolean getDarkClockArea() {
        return this.darkClockArea;
    }

    public final boolean getDarkInfoText() {
        return this.darkInfoText;
    }

    public final boolean getDarkSignatureArea() {
        return this.darkSignatureArea;
    }

    public final int getExtraColor1() {
        return this.extraColor1;
    }

    public final int getExtraColor2() {
        return this.extraColor2;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRandomColorType() {
        return this.randomColorType;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    @InterfaceC7396q
    public final Map<String, Integer> getSignaturePalette() {
        return this.signaturePalette;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.primaryColor) * 31) + Integer.hashCode(this.secondaryColor)) * 31) + Integer.hashCode(this.extraColor1)) * 31) + Integer.hashCode(this.extraColor2)) * 31;
        boolean z2 = this.darkClockArea;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        boolean z3 = this.darkInfoText;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        int iHashCode2 = (((i2 + r12) * 31) + this.clockPalette.hashCode()) * 31;
        boolean z5 = this.darkSignatureArea;
        return ((((iHashCode2 + (z5 ? 1 : z5)) * 31) + this.signaturePalette.hashCode()) * 31) + Integer.hashCode(this.randomColorType);
    }

    @InterfaceC7396q
    public String toString() {
        return "ColorData(primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", extraColor1=" + this.extraColor1 + ", extraColor2=" + this.extraColor2 + ", darkClockArea=" + this.darkClockArea + ", darkInfoText=" + this.darkInfoText + ", clockPalette=" + this.clockPalette + ", darkSignatureArea=" + this.darkSignatureArea + ", signaturePalette=" + this.signaturePalette + ", randomColorType=" + this.randomColorType + ')';
    }

    public /* synthetic */ ColorData(int i2, int i3, int i4, int i5, boolean z2, boolean z3, Map map, boolean z5, Map map2, int i6, int i7, ni7 ni7Var) {
        this((i7 & 1) != 0 ? -16777216 : i2, (i7 & 2) != 0 ? -16777216 : i3, (i7 & 4) != 0 ? -16777216 : i4, (i7 & 8) == 0 ? i5 : -16777216, (i7 & 16) != 0 ? false : z2, (i7 & 32) != 0 ? false : z3, (i7 & 64) != 0 ? nn86.o1t() : map, (i7 & 128) != 0 ? false : z5, (i7 & 256) != 0 ? nn86.o1t() : map2, (i7 & 512) == 0 ? i6 : 0);
    }
}
