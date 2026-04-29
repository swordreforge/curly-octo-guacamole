package com.miui.maml.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import miuix.core.util.f7l8;

/* JADX INFO: loaded from: classes3.dex */
public class LargeIconResManager {
    private static final String TAG = "LargeIconResManager";

    public static void clearCache(List<String> list) {
    }

    private static Bitmap getBitmapInfo(String str, String str2, BitmapFactory.Options options) {
        InputStream inputStream = getInputStream(str, str2);
        if (inputStream == null) {
            MamlLog.m17850d(TAG, "TRY AGAIN to get InputStream: " + str2);
            inputStream = getInputStream(str, str2);
            if (inputStream == null) {
                MamlLog.m17853i(TAG, "fail to get InputStream: " + str2);
                return null;
            }
        }
        try {
            try {
                Rect rect = new Rect();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
                MamlLog.m17850d(TAG, "TRY AGAIN to decode bitmap: " + str2);
                if (BitmapFactory.decodeStream(inputStream, rect, options) == null) {
                    MamlLog.m17853i(TAG, "fail to decode bitmap: " + str2);
                    return null;
                }
            } catch (OutOfMemoryError e2) {
                MamlLog.m17851e(TAG, e2.toString());
            }
            return null;
        } finally {
            f7l8.toq(inputStream);
        }
    }

    public static Drawable getDrawable(Resources resources, String str, String str2, int i2) {
        Bitmap bitmapLoadBitmap = loadBitmap(str, str2, i2);
        if (bitmapLoadBitmap == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapLoadBitmap);
        bitmapDrawable.setTargetDensity(i2);
        return bitmapDrawable;
    }

    private static InputStream getInputStream(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return new FileInputStream(str + "/" + str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Bitmap loadBitmap(String str, String str2, int i2) {
        Bitmap bitmapInfo;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inTargetDensity = i2;
        if (str != null) {
            MamlLog.m17853i(TAG, "try to load resource from extra resource: " + str + " of " + str2);
            options.inDensity = i2;
            bitmapInfo = getBitmapInfo(str, str2, options);
        } else {
            bitmapInfo = null;
        }
        if (bitmapInfo != null) {
            bitmapInfo.setDensity(i2);
        }
        return bitmapInfo;
    }

    private static BitmapDrawable getDrawable(Resources resources, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(resources, bitmap);
    }
}
