package com.android.thememanager.settings.personalize;

import android.graphics.Bitmap;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: compiled from: PersonalizeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    private static final String f15300k = "PersonalizeUtils";

    /* JADX INFO: renamed from: k */
    public static Bitmap m9093k(Bitmap originBitmap, float span, int dpi) {
        if (originBitmap == null || originBitmap.isRecycled()) {
            Log.w(f15300k, "invalid bitmap.");
            return originBitmap;
        }
        int width = originBitmap.getWidth();
        int height = originBitmap.getHeight();
        float f2 = width;
        if ((f2 / height) / span < C1819o.jk(bf2.toq.toq()) / C1819o.mcp(bf2.toq.toq())) {
            return originBitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(originBitmap, 0, 0, (int) (f2 / span), height);
        C1819o.f7l8(bitmapCreateBitmap, dpi);
        if (originBitmap != bitmapCreateBitmap) {
            originBitmap.recycle();
        } else {
            Log.w(f15300k, "cropScrollBitmap return a same object");
        }
        Log.d(f15300k, "crop scroll wp success: " + span);
        return bitmapCreateBitmap;
    }
}
