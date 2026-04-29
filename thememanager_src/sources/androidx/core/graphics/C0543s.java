package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import com.android.thememanager.util.ltg8;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.graphics.s */
/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\f\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\r\u001a\u00020\u0000*\u00020\bH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u000e*\u00020\bH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u000eH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\b*\u00020\u000eH\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001a\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\r\u0010 \u001a\u00020\b*\u00020\u001fH\u0087\b\"\u0016\u0010#\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010%\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\"\"\u0016\u0010'\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\"\"\u0016\u0010)\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\"\"\u0016\u0010,\u001a\u00020\u0001*\u00020\b8Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0016\u0010#\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0016\u0010%\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010.\"\u0016\u0010'\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010.\"\u0016\u0010)\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b1\u0010.\"\u0016\u0010,\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b2\u0010.\"\u0016\u00106\u001a\u000203*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0016\u00108\u001a\u000203*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b7\u00105\"\u0016\u0010\u0017\u001a\u00020\u0019*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Landroid/graphics/Color;", "", "toq", "n", AnimatedProperty.PROPERTY_NAME_Y, "ld6", "c", "fti", "", "zy", C7704k.y.toq.f95579toq, C7704k.y.toq.f44691k, "x2", "jp0y", "", "eqxt", "k", "q", "f7l8", "p", "gvn7", "d3", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "qrj", "Landroid/graphics/ColorSpace;", "n7h", "kja0", AnimatedProperty.PROPERTY_NAME_H, "cdj", "ki", "", "oc", "i", "(I)I", "alpha", "mcp", ltg8.f61332n7h, "z", ltg8.f16615h, "zurt", "blue", "o1t", "(I)F", "luminance", "t8r", "(J)F", "t", "fu4", "fn3e", "wvg", "", "jk", "(J)Z", "isSrgb", "a9", "isWideGamut", "ni7", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0543s {
    @hyr(26)
    public static final boolean a9(long j2) {
        return Color.isWideGamut(j2);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Color cdj(@InterfaceC7396q Color convertTo, @InterfaceC7396q ColorSpace.Named colorSpace) {
        d2ok.cdj(convertTo, "$this$convertTo");
        d2ok.cdj(colorSpace, "colorSpace");
        Color colorConvert = convertTo.convert(ColorSpace.get(colorSpace));
        d2ok.m23085y(colorConvert, "convert(ColorSpace.get(colorSpace))");
        return colorConvert;
    }

    @zy.x2
    @hyr(26)
    public static final int d3(long j2) {
        return Color.toArgb(j2);
    }

    @hyr(26)
    public static final long eqxt(@zy.x2 int i2) {
        return Color.pack(i2);
    }

    @hyr(26)
    public static final float f7l8(long j2) {
        return Color.blue(j2);
    }

    @hyr(26)
    public static final float fn3e(long j2) {
        return Color.blue(j2);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Color fti(@InterfaceC7396q Color plus, @InterfaceC7396q Color c2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(c2, "c");
        Color colorFn3e = C0541p.fn3e(c2, plus);
        d2ok.m23085y(colorFn3e, "ColorUtils.compositeColors(c, this)");
        return colorFn3e;
    }

    @hyr(26)
    public static final float fu4(long j2) {
        return Color.green(j2);
    }

    /* JADX INFO: renamed from: g */
    public static final int m2558g(@zy.x2 int i2) {
        return (i2 >> 16) & 255;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Color gvn7(long j2) {
        Color colorValueOf = Color.valueOf(j2);
        d2ok.m23085y(colorValueOf, "Color.valueOf(this)");
        return colorValueOf;
    }

    @hyr(26)
    /* JADX INFO: renamed from: h */
    public static final long m2559h(long j2, @InterfaceC7396q ColorSpace colorSpace) {
        d2ok.cdj(colorSpace, "colorSpace");
        return Color.convert(j2, colorSpace);
    }

    /* JADX INFO: renamed from: i */
    public static final int m2560i(@zy.x2 int i2) {
        return (i2 >> 24) & 255;
    }

    @hyr(26)
    public static final boolean jk(long j2) {
        return Color.isSrgb(j2);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Color jp0y(@zy.x2 int i2) {
        Color colorValueOf = Color.valueOf(i2);
        d2ok.m23085y(colorValueOf, "Color.valueOf(this)");
        return colorValueOf;
    }

    @hyr(26)
    /* JADX INFO: renamed from: k */
    public static final float m2561k(long j2) {
        return Color.red(j2);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Color ki(@InterfaceC7396q Color convertTo, @InterfaceC7396q ColorSpace colorSpace) {
        d2ok.cdj(convertTo, "$this$convertTo");
        d2ok.cdj(colorSpace, "colorSpace");
        Color colorConvert = convertTo.convert(colorSpace);
        d2ok.m23085y(colorConvert, "convert(colorSpace)");
        return colorConvert;
    }

    @hyr(26)
    public static final long kja0(long j2, @InterfaceC7396q ColorSpace.Named colorSpace) {
        d2ok.cdj(colorSpace, "colorSpace");
        return Color.convert(j2, ColorSpace.get(colorSpace));
    }

    @hyr(26)
    public static final float ld6(@InterfaceC7396q Color component4) {
        d2ok.cdj(component4, "$this$component4");
        return component4.getComponent(3);
    }

    public static final int mcp(@zy.x2 int i2) {
        return (i2 >> 16) & 255;
    }

    @hyr(26)
    /* JADX INFO: renamed from: n */
    public static final float m2562n(@InterfaceC7396q Color component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.getComponent(1);
    }

    @hyr(26)
    public static final long n7h(@zy.x2 int i2, @InterfaceC7396q ColorSpace colorSpace) {
        d2ok.cdj(colorSpace, "colorSpace");
        return Color.convert(i2, colorSpace);
    }

    @InterfaceC7396q
    @hyr(26)
    public static final ColorSpace ni7(long j2) {
        ColorSpace colorSpace = Color.colorSpace(j2);
        d2ok.m23085y(colorSpace, "Color.colorSpace(this)");
        return colorSpace;
    }

    @hyr(26)
    public static final float o1t(@zy.x2 int i2) {
        return Color.luminance(i2);
    }

    @zy.x2
    public static final int oc(@InterfaceC7396q String toColorInt) {
        d2ok.cdj(toColorInt, "$this$toColorInt");
        return Color.parseColor(toColorInt);
    }

    @hyr(26)
    /* JADX INFO: renamed from: p */
    public static final float m2563p(long j2) {
        return Color.alpha(j2);
    }

    @hyr(26)
    /* JADX INFO: renamed from: q */
    public static final float m2564q(long j2) {
        return Color.green(j2);
    }

    @hyr(26)
    public static final long qrj(@zy.x2 int i2, @InterfaceC7396q ColorSpace.Named colorSpace) {
        d2ok.cdj(colorSpace, "colorSpace");
        return Color.convert(i2, ColorSpace.get(colorSpace));
    }

    /* JADX INFO: renamed from: s */
    public static final int m2565s(@zy.x2 int i2) {
        return (i2 >> 8) & 255;
    }

    @hyr(26)
    /* JADX INFO: renamed from: t */
    public static final float m2566t(long j2) {
        return Color.red(j2);
    }

    @hyr(26)
    public static final float t8r(long j2) {
        return Color.alpha(j2);
    }

    @hyr(26)
    public static final float toq(@InterfaceC7396q Color component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.getComponent(0);
    }

    @hyr(26)
    public static final float wvg(long j2) {
        return Color.luminance(j2);
    }

    public static final int x2(@zy.x2 int i2) {
        return i2 & 255;
    }

    @hyr(26)
    /* JADX INFO: renamed from: y */
    public static final float m2567y(@InterfaceC7396q Color component3) {
        d2ok.cdj(component3, "$this$component3");
        return component3.getComponent(2);
    }

    /* JADX INFO: renamed from: z */
    public static final int m2568z(@zy.x2 int i2) {
        return (i2 >> 8) & 255;
    }

    public static final int zurt(@zy.x2 int i2) {
        return i2 & 255;
    }

    public static final int zy(@zy.x2 int i2) {
        return (i2 >> 24) & 255;
    }
}
