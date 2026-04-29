package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: compiled from: RsBlurBitmap.java */
/* JADX INFO: loaded from: classes.dex */
public class ncyb {

    /* JADX INFO: renamed from: q */
    private static final float f10364q = 0.1f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57783zy = "RsBlurBitmap";

    /* JADX INFO: renamed from: k */
    private RenderScript f10365k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ScriptIntrinsicBlur f57784toq;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.ncyb$k */
    /* JADX INFO: compiled from: RsBlurBitmap.java */
    static /* synthetic */ class C1817k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f10366k;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f10366k = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10366k[Bitmap.Config.ARGB_4444.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10366k[Bitmap.Config.RGB_565.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10366k[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ncyb(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f10365k = renderScriptCreate;
        this.f57784toq = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    /* JADX INFO: renamed from: k */
    private boolean m7144k(Bitmap image) {
        if (image == null) {
            return false;
        }
        int i2 = C1817k.f10366k[image.getConfig().ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    public void toq() {
        RenderScript renderScript = this.f10365k;
        if (renderScript != null) {
            renderScript.destroy();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f57784toq;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap zy(android.graphics.Bitmap r8, float r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "RsBlurBitmap"
            r1 = 0
            if (r8 == 0) goto Lbd
            boolean r2 = r8.isRecycled()
            if (r2 == 0) goto Ld
            goto Lbd
        Ld:
            int r2 = r8.getWidth()
            float r2 = (float) r2
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r4 = r8.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            boolean r4 = r7.m7144k(r8)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            if (r4 == 0) goto L2b
            goto L32
        L2b:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            r5 = 1
            android.graphics.Bitmap r8 = r8.copy(r4, r5)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
        L32:
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r8, r2, r3, r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r8)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
            if (r8 == 0) goto L7d
            if (r2 == 0) goto L7d
            boolean r3 = r8.isRecycled()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            if (r3 != 0) goto L7d
            boolean r3 = r2.isRecycled()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            if (r3 == 0) goto L4c
            goto L7d
        L4c:
            android.renderscript.RenderScript r0 = r7.f10365k     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            android.renderscript.Allocation r8 = android.renderscript.Allocation.createFromBitmap(r0, r8)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            android.renderscript.RenderScript r0 = r7.f10365k     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r0, r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            android.renderscript.ScriptIntrinsicBlur r0 = r7.f57784toq     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r0.setRadius(r9)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            android.renderscript.ScriptIntrinsicBlur r9 = r7.f57784toq     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r9.setInput(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            android.renderscript.ScriptIntrinsicBlur r9 = r7.f57784toq     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r9.forEach(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r1.copyTo(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            if (r8 == 0) goto L6f
            r8.destroy()
        L6f:
            r1.destroy()
            goto Lb0
        L73:
            r9 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
            goto Lb2
        L78:
            r9 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
            goto La3
        L7d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            r9.<init>()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            java.lang.String r3 = "blurBitmap error , inputBitmap = "
            r9.append(r3)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            r9.append(r8)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            java.lang.String r8 = ",outputBitmap = "
            r9.append(r8)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            r9.append(r2)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            android.util.Log.w(r0, r8)     // Catch: java.lang.Exception -> L9a java.lang.Throwable -> L9d
            return r1
        L9a:
            r9 = move-exception
            r8 = r1
            goto La3
        L9d:
            r9 = move-exception
            r8 = r1
            goto Lb2
        La0:
            r9 = move-exception
            r8 = r1
            r2 = r8
        La3:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto Lab
            r1.destroy()
        Lab:
            if (r8 == 0) goto Lb0
            r8.destroy()
        Lb0:
            return r2
        Lb1:
            r9 = move-exception
        Lb2:
            if (r1 == 0) goto Lb7
            r1.destroy()
        Lb7:
            if (r8 == 0) goto Lbc
            r8.destroy()
        Lbc:
            throw r9
        Lbd:
            java.lang.String r8 = "scriptBlur fail by bitmap is null."
            android.util.Log.w(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.utils.ncyb.zy(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }
}
