package com.android.thememanager.basemodule.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import miui.util.InputStreamLoader;

/* JADX INFO: compiled from: ImageUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ki {

    /* JADX INFO: renamed from: k */
    private static final String f10345k = "ImageUtils";

    /* JADX INFO: renamed from: k */
    public static Bitmap m7107k(@zy.dd Drawable drawable) {
        if (drawable == null) {
            Log.d(f10345k, "cannot convert drawable into bitmap by null.");
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Log.e(f10345k, "drawable width: " + intrinsicWidth + " , height: " + intrinsicHeight);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        Log.d(f10345k, "drawable type: " + drawable);
        return bitmapCreateBitmap;
    }

    @zy.lvui
    public static BitmapFactory.Options toq(String filePath) {
        return zy(new InputStreamLoader(filePath));
    }

    @zy.lvui
    public static BitmapFactory.Options zy(InputStreamLoader streamLoader) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(streamLoader.get(), null, options);
        } catch (Exception unused) {
        } catch (Throwable th) {
            streamLoader.close();
            throw th;
        }
        streamLoader.close();
        return options;
    }
}
