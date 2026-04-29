package com.android.thememanager.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.provider.MiuiSettings;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.hyr;
import miui.util.InputStreamLoader;
import yz.C7794k;

/* JADX INFO: compiled from: WallpaperDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class vep5 extends n5r1 {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f61421fu4 = "darken_wallpaper_under_dark_mode";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f61422ni7 = "vep5";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private RenderScript f61423fn3e;

    /* JADX INFO: renamed from: i */
    private int f16855i;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f61424t8r;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private com.android.thememanager.wvg f61425zurt;

    public vep5(int cacheSize, int baseWidth, int baseHeight) {
        super(cacheSize);
        this.f61424t8r = baseWidth;
        this.f16855i = baseHeight;
        ni7(new hyr.zy(3, 2));
        if (com.android.thememanager.basemodule.utils.a9.m6993h(bf2.toq.toq())) {
            d3();
        }
    }

    private void d3() {
        try {
            this.f61423fn3e = RenderScript.create(bf2.toq.toq());
            this.f61425zurt = new com.android.thememanager.wvg(this.f61423fn3e);
        } catch (Exception e2) {
            C7794k.m28195n(f61422ni7, "tryCreateScript faild: " + e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void fti(@zy.lvui Bitmap bitmap) {
        if (!com.android.thememanager.basemodule.utils.a9.m6993h(bf2.toq.toq()) || this.f61423fn3e == null || this.f61425zurt == null) {
            return;
        }
        byte b2 = 0;
        char c2 = com.android.thememanager.basemodule.utils.bf2.m7005k(bitmap, 5) == 2 ? (char) 1 : (char) 0;
        if (C1819o.d2ok(bf2.toq.toq()) && MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), "darken_wallpaper_under_dark_mode", true)) {
            b2 = 1;
        }
        if (c2 == 0 || b2 != 0) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.w(f61422ni7, "darkenIfNeeded error bitmap = " + bitmap);
                return;
            }
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f61423fn3e, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(this.f61423fn3e, bitmap);
            this.f61425zurt.m10528s(c2 ^ 1 ? (byte) 1 : (byte) 0);
            this.f61425zurt.m10529y(b2);
            this.f61425zurt.m10525k(allocationCreateFromBitmap, allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmap);
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
        }
    }

    private Pair<Bitmap, Boolean> gvn7(C2775f decodeInfo) {
        C2775f c2775fClone = decodeInfo.clone();
        c2775fClone.f16419q = this.f61424t8r;
        c2775fClone.f16418n = this.f16855i;
        Bitmap bitmapWvg = wvg(c2775fClone);
        return bitmapWvg != null ? new Pair<>(bitmapWvg, Boolean.FALSE) : new Pair<>(jp0y(decodeInfo), Boolean.TRUE);
    }

    private Bitmap jp0y(C2775f decodeInfo) {
        BitmapFactory.Options optionsCdj = C2763c.cdj();
        InputStreamLoader inputStreamLoader = new InputStreamLoader(decodeInfo.f61234toq);
        optionsCdj.inSampleSize = C2763c.m9651q(inputStreamLoader, this.f61424t8r * this.f16855i * 2);
        inputStreamLoader.close();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 >= 3) {
                return null;
            }
            try {
                return C2763c.m9646h(decodeInfo.f61234toq, optionsCdj);
            } catch (OutOfMemoryError unused) {
                Log.i("decoder", "decode wallpaper OOM: " + i3 + " " + decodeInfo.f61234toq);
                optionsCdj.inSampleSize = optionsCdj.inSampleSize + 1;
                i2 = i3;
            }
        }
    }

    @Override // com.android.thememanager.util.n5r1, com.android.thememanager.util.hyr
    protected Bitmap zy(C2775f decodeInfo) {
        Pair<Bitmap, Boolean> pairGvn7 = gvn7(decodeInfo);
        Bitmap bitmap = (Bitmap) pairGvn7.first;
        boolean zBooleanValue = ((Boolean) pairGvn7.second).booleanValue();
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapM9887q = this.f61361ki.m9887q(decodeInfo.m9717q());
        if (bitmapM9887q == null) {
            float fMax = Math.max((this.f61424t8r * 1.0f) / bitmap.getWidth(), (this.f16855i * 1.0f) / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * fMax);
            int height = (int) (bitmap.getHeight() * fMax);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 2 || bitmapM9887q != null) {
                    break;
                }
                try {
                    bitmapM9887q = Bitmap.createBitmap(width, height, bitmap.getConfig());
                    break;
                } catch (OutOfMemoryError unused) {
                    width = (width * 2) / 3;
                    height = (height * 2) / 3;
                    i2 = i3;
                }
            }
        }
        if (bitmapM9887q != null) {
            C2763c.k kVar = new C2763c.k();
            kVar.f16351n = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            synchronized (bitmapM9887q) {
                C2763c.f7l8(bitmap, bitmapM9887q, kVar);
            }
            fti(bitmapM9887q);
            this.f61361ki.m9884k(bitmapM9887q, decodeInfo);
        }
        if (zBooleanValue) {
            bitmap.recycle();
        }
        return bitmapM9887q;
    }
}
