package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.core.graphics.C0536k;
import java.io.InputStream;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: RoundedBitmapDrawableFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    private static final String f3550k = "RoundedBitmapDrawableFa";

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.qrj$k */
    /* JADX INFO: compiled from: RoundedBitmapDrawableFactory.java */
    private static class C0525k extends x2 {
        C0525k(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.x2
        /* JADX INFO: renamed from: g */
        void mo2423g(int i2, int i3, int i4, Rect rect, Rect rect2) {
            androidx.core.view.qrj.toq(i2, i3, i4, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.x2
        public void kja0(boolean z2) {
            Bitmap bitmap = this.f3552k;
            if (bitmap != null) {
                C0536k.m2497q(bitmap, z2);
                invalidateSelf();
            }
        }

        @Override // androidx.core.graphics.drawable.x2
        /* JADX INFO: renamed from: y */
        public boolean mo2424y() {
            Bitmap bitmap = this.f3552k;
            return bitmap != null && C0536k.zy(bitmap);
        }
    }

    private qrj() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static x2 m2430k(@lvui Resources resources, @dd Bitmap bitmap) {
        return new ld6(resources, bitmap);
    }

    @lvui
    public static x2 toq(@lvui Resources resources, @lvui InputStream inputStream) {
        x2 x2VarM2430k = m2430k(resources, BitmapFactory.decodeStream(inputStream));
        if (x2VarM2430k.toq() == null) {
            Log.w(f3550k, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return x2VarM2430k;
    }

    @lvui
    public static x2 zy(@lvui Resources resources, @lvui String str) {
        x2 x2VarM2430k = m2430k(resources, BitmapFactory.decodeFile(str));
        if (x2VarM2430k.toq() == null) {
            Log.w(f3550k, "RoundedBitmapDrawable cannot decode " + str);
        }
        return x2VarM2430k;
    }
}
