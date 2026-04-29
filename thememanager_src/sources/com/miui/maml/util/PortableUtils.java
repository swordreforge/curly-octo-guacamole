package com.miui.maml.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.miui.maml.C5134R;
import p001b.InterfaceC1356n;

/* JADX INFO: loaded from: classes3.dex */
public class PortableUtils {
    public static Drawable getBadgedDrawable(Context context, Drawable drawable, Drawable drawable2, Rect rect, boolean z2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        boolean z3 = z2 && (drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap().isMutable();
        Bitmap bitmap = z3 ? ((BitmapDrawable) drawable).getBitmap() : Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        if (!z3) {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
        }
        if (rect == null) {
            drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable2.draw(canvas);
        } else {
            if (rect.left < 0 || rect.top < 0 || rect.width() > intrinsicWidth || rect.height() > intrinsicHeight) {
                throw new IllegalArgumentException("Badge location " + rect + " not in badged drawable bounds " + new Rect(0, 0, intrinsicWidth, intrinsicHeight));
            }
            drawable2.setBounds(0, 0, rect.width(), rect.height());
            canvas.save();
            canvas.translate(rect.left, rect.top);
            drawable2.draw(canvas);
            canvas.restore();
        }
        if (z3) {
            return drawable;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable.setTargetDensity(((BitmapDrawable) drawable).getBitmap().getDensity());
        }
        return bitmapDrawable;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int getMaskCornerId(String str) {
        int i2 = C5134R.drawable.icon_mask;
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        byte b2 = -1;
        switch (lowerCase.hashCode()) {
            case 50858:
                if (lowerCase.equals(InterfaceC1356n.f7200k)) {
                    b2 = 0;
                }
                break;
            case 50859:
                if (lowerCase.equals(InterfaceC1356n.f53839zy)) {
                    b2 = 1;
                }
                break;
            case 51819:
                if (lowerCase.equals(InterfaceC1356n.f53838toq)) {
                    b2 = 2;
                }
                break;
            case 51820:
                if (lowerCase.equals(InterfaceC1356n.f7201q)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            default:
                return i2;
            case 1:
                return C5134R.drawable.icon_mask_1x2;
            case 2:
                return C5134R.drawable.icon_mask_2x1;
            case 3:
                return C5134R.drawable.icon_mask_2x2;
        }
    }

    public static Drawable getUserBadgedIcon(Context context, Drawable drawable, UserHandle userHandle) {
        return context.getPackageManager().getUserBadgedIcon(drawable, userHandle);
    }

    public static Drawable getXSpaceBadgeDrawable(Context context, String str) {
        int i2;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int iFindNearestSupportDensity = ThemeDensityFallbackUtils.findNearestSupportDensity(displayMetrics.densityDpi);
        i2 = C5134R.drawable.ic_corp_icon_xspace_single;
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "1x1":
                i2 = C5134R.drawable.ic_corp_icon_xspace_1x1;
                break;
        }
        return context.getResources().getDrawableForDensity(i2, iFindNearestSupportDensity, null);
    }

    public static Drawable getXspaceDrawable(Context context, Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable2 == null) {
            Log.e("LargeIconsHelper", "getXspaceDrawable exception, drawable or xSpaceDrawable in to null");
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        int intrinsicHeight2 = drawable2.getIntrinsicHeight();
        if (intrinsicWidth < intrinsicWidth2 || intrinsicHeight < intrinsicHeight2) {
            Log.e("LargeIconsHelper", "getXspaceDrawable exception, originDrawable must be larger than xSpaceDrawable!");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        drawable2.setBounds(0, intrinsicHeight - intrinsicHeight2, intrinsicWidth2, intrinsicHeight);
        drawable2.draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable.setTargetDensity(((BitmapDrawable) drawable).getBitmap().getDensity());
        }
        return bitmapDrawable;
    }
}
