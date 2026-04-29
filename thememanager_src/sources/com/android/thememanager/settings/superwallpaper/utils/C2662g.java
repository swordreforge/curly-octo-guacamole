package com.android.thememanager.settings.superwallpaper.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import com.android.thememanager.basemodule.utils.a9;
import com.miui.maml.util.AppIconsHelper;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import miuix.graphics.C7111k;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.g */
/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2662g {

    /* JADX INFO: renamed from: k */
    private static final List<String> f15759k;

    static {
        ArrayList arrayList = new ArrayList(1);
        f15759k = arrayList;
        arrayList.add("com.miui.weather2");
    }

    private C2662g() {
    }

    public static Drawable f7l8(Context context, String filePath) {
        try {
            Bitmap bitmapFn3e = C7111k.fn3e(filePath, false);
            if (bitmapFn3e != null) {
                return new BitmapDrawable(context.getResources(), bitmapFn3e);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m9260g(Drawable drawable) {
        return (drawable instanceof DrawableWrapper) || (drawable instanceof ScaleDrawable) || (drawable instanceof ClipDrawable) || (drawable instanceof InsetDrawable) || (drawable instanceof RotateDrawable);
    }

    /* JADX INFO: renamed from: k */
    public static LayerDrawable m9261k(Drawable background, Drawable foreground, int fgGravity) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{background, foreground});
        layerDrawable.setLayerGravity(1, fgGravity);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: n */
    private static Drawable m9262n(Drawable parent, Drawable def) {
        return parent instanceof DrawableWrapper ? ((DrawableWrapper) parent).getDrawable() : parent instanceof ScaleDrawable ? ((ScaleDrawable) parent).getDrawable() : parent instanceof ClipDrawable ? ((ClipDrawable) parent).getDrawable() : parent instanceof InsetDrawable ? ((InsetDrawable) parent).getDrawable() : parent instanceof RotateDrawable ? ((RotateDrawable) parent).getDrawable() : def;
    }

    /* JADX INFO: renamed from: q */
    public static Drawable m9263q(String packageClaseName) {
        if (packageClaseName == null) {
            return null;
        }
        String[] strArrSplit = packageClaseName.split(C5658n.f73185t8r);
        Drawable iconDrawable = AppIconsHelper.getIconDrawable(bf2.toq.toq(), strArrSplit[0], strArrSplit.length > 1 ? strArrSplit[1] : null, 0L);
        if (iconDrawable == null) {
            return a9.m6998q(strArrSplit[0], strArrSplit.length > 1 ? strArrSplit[1] : null, false);
        }
        return iconDrawable;
    }

    public static Bitmap toq(Drawable drawable) {
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m9264y(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "icons"
            java.lang.String r0 = com.android.thememanager.basemodule.utils.vyq.ni7(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L31
            java.util.List<java.lang.String> r0 = com.android.thememanager.settings.superwallpaper.utils.C2662g.f15759k
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L31
            android.content.Context r0 = bf2.toq.toq()
            r2 = 0
            android.graphics.drawable.Drawable r0 = com.miui.maml.util.AppIconsHelper.getIconDrawable(r0, r4, r5, r2)
            if (r0 == 0) goto L2e
            android.graphics.Bitmap r2 = toq(r0)
            r3 = 10
            boolean r3 = com.android.thememanager.util.C2763c.ni7(r2, r3)
            if (r3 == 0) goto L2f
            goto L31
        L2e:
            r2 = r1
        L2f:
            r1 = r0
            goto L32
        L31:
            r2 = r1
        L32:
            if (r1 != 0) goto L3d
            r0 = 0
            android.graphics.drawable.Drawable r4 = com.android.thememanager.basemodule.utils.a9.m6998q(r4, r5, r0)
            android.graphics.Bitmap r2 = toq(r4)
        L3d:
            com.android.thememanager.basemodule.utils.C1821p.m7191y(r6)
            r4 = 1
            r5 = 100
            boolean r4 = com.android.thememanager.util.C2763c.mcp(r2, r6, r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.utils.C2662g.m9264y(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static Drawable zy(Drawable parent, int id) {
        if (parent == null) {
            return null;
        }
        if (parent instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) parent;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                if (layerDrawable.getId(i2) == id) {
                    return layerDrawable.getDrawable(i2);
                }
                Drawable drawableZy = zy(layerDrawable.getDrawable(i2), id);
                if (drawableZy != null) {
                    return drawableZy;
                }
            }
        } else if (m9260g(parent)) {
            return zy(m9262n(parent, null), id);
        }
        return null;
    }
}
