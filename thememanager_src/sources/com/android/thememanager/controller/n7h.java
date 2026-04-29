package com.android.thememanager.controller;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.controller.zy;
import com.android.thememanager.fu4;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.lvui;
import com.android.thememanager.util.uc;

/* JADX INFO: compiled from: WallpaperApplyTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends zy {
    public n7h(Resource resource, String onlineUrl, fu4 context, zy.InterfaceC1958k callBack, int applyType, String analyticsEntryType, String v9PageId, Matrix matrix, int[] lockScreenSize, int[] wallpaperSize, WallpaperApplyInfos applyInfos, int dpi) {
        super(resource, onlineUrl, context, callBack, applyType, analyticsEntryType, v9PageId, matrix, lockScreenSize, wallpaperSize, applyInfos, dpi);
    }

    @Override // com.android.thememanager.controller.zy
    /* JADX INFO: renamed from: g */
    protected Bitmap mo7538g(Matrix imageMatrix, int width, int height, boolean equalsScreenSize, fu4 resContext, Bitmap wallpaperViewBitmap, boolean enableWallpaperScroll, Resource adjResource, boolean userCustomized, Matrix wallpaperMatrix) {
        if (equalsScreenSize && C2763c.qrj(uc.jk(resContext, adjResource)) == 0) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, wallpaperViewBitmap.getWidth(), wallpaperViewBitmap.getHeight());
        imageMatrix.mapRect(rectF);
        Rect rect = new Rect();
        float width2 = wallpaperViewBitmap.getWidth() / rectF.width();
        float height2 = wallpaperViewBitmap.getHeight() / rectF.height();
        int i2 = (int) ((-rectF.left) * width2);
        rect.left = i2;
        rect.top = (int) ((-rectF.top) * height2);
        rect.right = i2 + Math.round(width * width2);
        rect.bottom = rect.top + Math.round(height * height2);
        Point pointM9859n = lvui.m9859n(enableWallpaperScroll, rect.width(), rect.height(), lvui.zy(wallpaperViewBitmap, bf2.toq(), userCustomized, imageMatrix), false);
        int i3 = pointM9859n.x;
        int i4 = pointM9859n.y;
        Bitmap bitmapM7693q = zy.m7693q(i3, i4, wallpaperViewBitmap);
        if (bitmapM7693q == null) {
            return bitmapM7693q;
        }
        C1819o.f7l8(bitmapM7693q, this.f11099b);
        Canvas canvas = new Canvas(bitmapM7693q);
        float[] fArrZy = zy(canvas, 0, new Rect(0, 0, i3, i4), rect);
        canvas.drawBitmap(wallpaperViewBitmap, fArrZy[0], fArrZy[1], new Paint(2));
        return bitmapM7693q;
    }

    @Override // com.android.thememanager.controller.zy
    protected float[] zy(Canvas canvas, int rotation, Rect dstRect, Rect cropRect) {
        canvas.rotate(rotation, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float fWidth = dstRect.width() / cropRect.width();
        float fHeight = dstRect.height() / cropRect.height();
        canvas.scale(fWidth, fHeight, canvas.getWidth() / 2, canvas.getHeight() / 2);
        float[] fArr = {(-cropRect.left) * fWidth, (-cropRect.top) * fHeight};
        Matrix matrix = new Matrix();
        canvas.getMatrix().invert(matrix);
        matrix.mapPoints(fArr);
        return fArr;
    }

    public n7h(Resource resource, String onlineUrl, fu4 context, zy.InterfaceC1958k callBack, int applyType, String v9PageId, String analyticsEntryType, Matrix matrix, int[] lockScreenSize, int[] wallpaperSize, boolean enableWallpaperScroll, boolean equalsScreenSize, Bitmap wallpaperBitmap, Resource adjResource, String sourcePage, boolean userCustomized, Bitmap darkBitmap, WallpaperApplyInfos applyInfos, int dpi) {
        super(resource, onlineUrl, context, callBack, applyType, v9PageId, analyticsEntryType, matrix, lockScreenSize, wallpaperSize, enableWallpaperScroll, equalsScreenSize, wallpaperBitmap, adjResource, sourcePage, userCustomized, darkBitmap, null, applyInfos, dpi);
    }
}
