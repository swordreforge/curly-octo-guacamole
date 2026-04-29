package b8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.android.thememanager.share.C2706p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import zy.lvui;

/* JADX INFO: renamed from: b8.k */
/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1363k {
    public static Bitmap f7l8(Bitmap bitmap, float f2, float f3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f2 / width, f3 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m5778g(Bitmap bitmap, float f2) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f2), (int) (bitmap.getHeight() / f2), true);
    }

    /* JADX INFO: renamed from: k */
    public static String m5779k(@lvui Bitmap bitmap, @lvui String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            return file.getAbsolutePath();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5780n(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m5781q(Bitmap bitmap, float f2, int i2, int i3, int i4, int i5) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((i5 - i3) / f2), (int) ((i4 - i2) / f2), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate((-i3) / f2, (-i2) / f2);
        float f3 = 1.0f / f2;
        canvas.scale(f3, f3);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap toq(Bitmap bitmap, int i2) {
        int[] iArr;
        int i3 = i2;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (i3 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i4 = width * height;
        int[] iArr2 = new int[i4];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3 + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i7 + 1) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i7, 3);
        int i12 = i3 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = -i3;
            int i26 = 0;
            while (i25 <= i3) {
                int i27 = i6;
                int[] iArr9 = iArr6;
                int i28 = iArr2[i14 + Math.min(i5, Math.max(i25, 0))];
                int[] iArr10 = iArr8[i25 + i3];
                iArr10[0] = (i28 & C2706p.f61107fn3e) >> 16;
                iArr10[1] = (i28 & 65280) >> 8;
                iArr10[2] = i28 & 255;
                int iAbs = i12 - Math.abs(i25);
                int i29 = iArr10[0];
                i26 += i29 * iAbs;
                int i30 = iArr10[1];
                i17 += i30 * iAbs;
                int i31 = iArr10[2];
                i18 += iAbs * i31;
                if (i25 > 0) {
                    i22 += i29;
                    i23 += i30;
                    i24 += i31;
                } else {
                    i19 += i29;
                    i20 += i30;
                    i21 += i31;
                }
                i25++;
                i6 = i27;
                iArr6 = iArr9;
            }
            int i32 = i6;
            int[] iArr11 = iArr6;
            int i33 = i3;
            int i34 = i26;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i14] = iArr7[i34];
                iArr4[i14] = iArr7[i17];
                iArr5[i14] = iArr7[i18];
                int i36 = i34 - i19;
                int i37 = i17 - i20;
                int i38 = i18 - i21;
                int[] iArr12 = iArr8[((i33 - i3) + i7) % i7];
                int i39 = i19 - iArr12[0];
                int i40 = i20 - iArr12[1];
                int i41 = i21 - iArr12[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr11[i35] = Math.min(i35 + i3 + 1, i5);
                } else {
                    iArr = iArr7;
                }
                int i42 = iArr2[i15 + iArr11[i35]];
                int i43 = (i42 & C2706p.f61107fn3e) >> 16;
                iArr12[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr12[1] = i44;
                int i45 = i42 & 255;
                iArr12[2] = i45;
                int i46 = i22 + i43;
                int i47 = i23 + i44;
                int i48 = i24 + i45;
                i34 = i36 + i46;
                i17 = i37 + i47;
                i18 = i38 + i48;
                i33 = (i33 + 1) % i7;
                int[] iArr13 = iArr8[i33 % i7];
                int i49 = iArr13[0];
                i19 = i39 + i49;
                int i50 = iArr13[1];
                i20 = i40 + i50;
                int i51 = iArr13[2];
                i21 = i41 + i51;
                i22 = i46 - i49;
                i23 = i47 - i50;
                i24 = i48 - i51;
                i14++;
                i35++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            bitmapCopy = bitmap2;
            height = i16;
            i6 = i32;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i52 = i6;
        int[] iArr14 = iArr6;
        int i53 = height;
        int[] iArr15 = iArr7;
        int i54 = 0;
        while (i54 < width) {
            int i55 = -i3;
            int i56 = i7;
            int[] iArr16 = iArr2;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = i55;
            int i65 = i55 * width;
            int i66 = 0;
            int i67 = 0;
            while (i64 <= i3) {
                int i68 = width;
                int iMax = Math.max(0, i65) + i54;
                int[] iArr17 = iArr8[i64 + i3];
                iArr17[0] = iArr3[iMax];
                iArr17[1] = iArr4[iMax];
                iArr17[2] = iArr5[iMax];
                int iAbs2 = i12 - Math.abs(i64);
                i66 += iArr3[iMax] * iAbs2;
                i67 += iArr4[iMax] * iAbs2;
                i57 += iArr5[iMax] * iAbs2;
                if (i64 > 0) {
                    i61 += iArr17[0];
                    i62 += iArr17[1];
                    i63 += iArr17[2];
                } else {
                    i58 += iArr17[0];
                    i59 += iArr17[1];
                    i60 += iArr17[2];
                }
                int i69 = i52;
                if (i64 < i69) {
                    i65 += i68;
                }
                i64++;
                i52 = i69;
                width = i68;
            }
            int i70 = width;
            int i71 = i52;
            int i72 = i3;
            int i73 = i54;
            int i74 = i67;
            int i75 = i53;
            int i76 = i66;
            int i77 = 0;
            while (i77 < i75) {
                iArr16[i73] = (iArr16[i73] & (-16777216)) | (iArr15[i76] << 16) | (iArr15[i74] << 8) | iArr15[i57];
                int i78 = i76 - i58;
                int i79 = i74 - i59;
                int i80 = i57 - i60;
                int[] iArr18 = iArr8[((i72 - i3) + i56) % i56];
                int i81 = i58 - iArr18[0];
                int i82 = i59 - iArr18[1];
                int i83 = i60 - iArr18[2];
                if (i54 == 0) {
                    iArr14[i77] = Math.min(i77 + i12, i71) * i70;
                }
                int i84 = iArr14[i77] + i54;
                int i85 = iArr3[i84];
                iArr18[0] = i85;
                int i86 = iArr4[i84];
                iArr18[1] = i86;
                int i87 = iArr5[i84];
                iArr18[2] = i87;
                int i88 = i61 + i85;
                int i89 = i62 + i86;
                int i90 = i63 + i87;
                i76 = i78 + i88;
                i74 = i79 + i89;
                i57 = i80 + i90;
                i72 = (i72 + 1) % i56;
                int[] iArr19 = iArr8[i72];
                int i91 = iArr19[0];
                i58 = i81 + i91;
                int i92 = iArr19[1];
                i59 = i82 + i92;
                int i93 = iArr19[2];
                i60 = i83 + i93;
                i61 = i88 - i91;
                i62 = i89 - i92;
                i63 = i90 - i93;
                i73 += i70;
                i77++;
                i3 = i2;
            }
            i54++;
            i3 = i2;
            i52 = i71;
            i53 = i75;
            i7 = i56;
            iArr2 = iArr16;
            width = i70;
        }
        int i94 = width;
        bitmap3.setPixels(iArr2, 0, i94, 0, 0, i94, i53);
        return bitmap3;
    }

    public static Bitmap zy(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        RectF rectF = new RectF(-i2, 0.0f, i2, i3);
        float f2 = i5;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.translate(-(i4 - i2), 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
