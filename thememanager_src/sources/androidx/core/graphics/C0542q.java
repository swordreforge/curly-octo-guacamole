package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.graphics.q */
/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b\u001a\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\b\u001a#\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086\b\u001a7\u0010\u0017\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0087\b\u001a\u0015\u0010\u001a\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\n¨\u0006\u001d"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/was;", "Lkotlin/fn3e;", "block", "k", "", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "color", "ld6", "width", InterfaceC1925p.byf, "", InterfaceC1357q.f53904ltg8, C7704k.y.toq.f44691k, "Landroid/graphics/Bitmap$Config;", "config", "q", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "n", "Landroid/graphics/Point;", "p", "toq", "Landroid/graphics/PointF;", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0542q {
    public static /* synthetic */ Bitmap f7l8(int i2, int i3, Bitmap.Config config, boolean z2, ColorSpace colorSpace, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i4 & 8) != 0) {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            d2ok.m23085y(colorSpace, "ColorSpace.get(ColorSpace.Named.SRGB)");
        }
        d2ok.cdj(config, "config");
        d2ok.cdj(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
        d2ok.m23085y(bitmapCreateBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Bitmap m2546g(int i2, int i3, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        d2ok.cdj(config, "config");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        d2ok.m23085y(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Bitmap m2547k(@InterfaceC7396q Bitmap applyCanvas, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(applyCanvas, "$this$applyCanvas");
        d2ok.cdj(block, "block");
        block.invoke(new Canvas(applyCanvas));
        return applyCanvas;
    }

    public static final void ld6(@InterfaceC7396q Bitmap set, int i2, int i3, @zy.x2 int i4) {
        d2ok.cdj(set, "$this$set");
        set.setPixel(i2, i3, i4);
    }

    @InterfaceC7396q
    @hyr(26)
    /* JADX INFO: renamed from: n */
    public static final Bitmap m2548n(int i2, int i3, @InterfaceC7396q Bitmap.Config config, boolean z2, @InterfaceC7396q ColorSpace colorSpace) {
        d2ok.cdj(config, "config");
        d2ok.cdj(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
        d2ok.m23085y(bitmapCreateBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Bitmap m2549p(Bitmap scale, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z2 = true;
        }
        d2ok.cdj(scale, "$this$scale");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(scale, i2, i3, z2);
        d2ok.m23085y(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return bitmapCreateScaledBitmap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final Bitmap m2550q(int i2, int i3, @InterfaceC7396q Bitmap.Config config) {
        d2ok.cdj(config, "config");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        d2ok.m23085y(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final Bitmap m2551s(@InterfaceC7396q Bitmap scale, int i2, int i3, boolean z2) {
        d2ok.cdj(scale, "$this$scale");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(scale, i2, i3, z2);
        d2ok.m23085y(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return bitmapCreateScaledBitmap;
    }

    public static final boolean toq(@InterfaceC7396q Bitmap contains, @InterfaceC7396q Point p2) {
        int i2;
        d2ok.cdj(contains, "$this$contains");
        d2ok.cdj(p2, "p");
        int i3 = p2.x;
        return i3 >= 0 && i3 < contains.getWidth() && (i2 = p2.y) >= 0 && i2 < contains.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public static final int m2552y(@InterfaceC7396q Bitmap get, int i2, int i3) {
        d2ok.cdj(get, "$this$get");
        return get.getPixel(i2, i3);
    }

    public static final boolean zy(@InterfaceC7396q Bitmap contains, @InterfaceC7396q PointF p2) {
        d2ok.cdj(contains, "$this$contains");
        d2ok.cdj(p2, "p");
        float f2 = p2.x;
        float f3 = 0;
        if (f2 < f3 || f2 >= contains.getWidth()) {
            return false;
        }
        float f4 = p2.y;
        return f4 >= f3 && f4 < ((float) contains.getHeight());
    }
}
