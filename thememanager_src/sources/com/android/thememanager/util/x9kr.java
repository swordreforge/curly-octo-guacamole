package com.android.thememanager.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.provider.MiuiSettings;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.util.Log;
import cnbm.C1404k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.request.target.AbstractC3179n;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import java.security.MessageDigest;
import yz.C7794k;

/* JADX INFO: compiled from: GlideImageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class x9kr {

    /* JADX INFO: renamed from: s */
    private static final int f16889s = 104857600;

    /* JADX INFO: renamed from: y */
    private static final String f16890y = "GlideImageDecoder";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f61429f7l8;

    /* JADX INFO: renamed from: g */
    private final int f16891g;

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.kja0 f16892k;

    /* JADX INFO: renamed from: n */
    private final int f16893n;

    /* JADX INFO: renamed from: q */
    private int f16894q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final androidx.collection.ld6<Integer, Bitmap> f61430toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    private final zy f61431zy;

    /* JADX INFO: renamed from: com.android.thememanager.util.x9kr$k */
    /* JADX INFO: compiled from: GlideImageDecoder.java */
    class C2818k extends AbstractC3179n<Bitmap> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f16895g;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f16897s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f16898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2818k(int width, int height, final String val$localPath, final String val$onlineUrl, final int val$index) {
            super(width, height);
            this.f16895g = val$localPath;
            this.f16898y = val$onlineUrl;
            this.f16897s = val$index;
        }

        @Override // com.bumptech.glide.request.target.AbstractC3179n, com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@zy.dd Drawable errorDrawable) {
            x9kr.this.f61431zy.mo6457k(null, this.f16895g, this.f16898y);
            Log.w(x9kr.f16890y, "CustomTarget.onLoadFailed.");
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void x2(@zy.dd Drawable placeholder) {
            Log.i(x9kr.f16890y, "decodeImageAsync. load cleared..");
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void qrj(@zy.lvui Bitmap resource, @zy.dd InterfaceC3185g<? super Bitmap> transition) {
            int byteCount = resource.getByteCount();
            if (byteCount >= x9kr.f16889s) {
                Log.w(x9kr.f16890y, String.format("bitmap too large, onResourceReady: size %d = (%d x %d), width=%d", Integer.valueOf(byteCount), Integer.valueOf(resource.getRowBytes()), Integer.valueOf(resource.getHeight()), Integer.valueOf(resource.getWidth())));
                x9kr.this.f61431zy.mo6457k(null, this.f16895g, this.f16898y);
            } else {
                if (x9kr.this.f61429f7l8 != resource.getDensity()) {
                    resource.setDensity(x9kr.this.f61429f7l8);
                }
                x9kr.this.f61430toq.m840p(Integer.valueOf(this.f16897s), resource);
                x9kr.this.f61431zy.mo6457k(resource, this.f16895g, this.f16898y);
            }
        }
    }

    /* JADX INFO: compiled from: GlideImageDecoder.java */
    public static class toq extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: g */
        private static final byte[] f16899g = toq.class.getSimpleName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

        /* JADX INFO: renamed from: n */
        private static final String f16900n = "x9kr$toq";

        /* JADX INFO: renamed from: q */
        public static final String f16901q = "darken_wallpaper_under_dark_mode";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Boolean f61432zy;

        toq(boolean isDarkMode) {
            this.f61432zy = Boolean.valueOf(isDarkMode && MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), f16901q, true));
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object o2) {
            return (o2 instanceof toq) && ((toq) o2).f61432zy == this.f61432zy;
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return f16900n.hashCode() + this.f61432zy.hashCode();
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@zy.lvui MessageDigest messageDigest) {
            byte[] bArr = f16899g;
            bArr[0] = this.f61432zy.booleanValue();
            messageDigest.update(bArr);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@zy.lvui InterfaceC3008n pool, @zy.lvui Bitmap toTransform, int outWidth, int outHeight) {
            return x9kr.m10069g(toTransform, pool, this.f61432zy.booleanValue(), mo6742q());
        }
    }

    /* JADX INFO: compiled from: GlideImageDecoder.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo6457k(Bitmap result, String localPath, String onlinePath);
    }

    public x9kr(@zy.lvui Activity activity, int cacheSize, int width, int height, @zy.lvui zy listener) {
        this.f16892k = com.bumptech.glide.zy.a9((C1807g.lvui() || C1807g.zurt()) ? bf2.toq.toq() : activity);
        this.f61430toq = new androidx.collection.ld6<>(cacheSize);
        this.f61431zy = listener;
        this.f16893n = width;
        this.f16891g = height;
        this.f61429f7l8 = activity.getResources().getDisplayMetrics().densityDpi;
    }

    /* JADX INFO: renamed from: g */
    public static Bitmap m10069g(Bitmap bitmap, InterfaceC3008n pool, boolean darkenUnderDarkMode, boolean supportWideColor) {
        return m10071n(bitmap, pool, darkenUnderDarkMode, Bitmap.Config.ARGB_8888, supportWideColor);
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m10071n(Bitmap bitmap, InterfaceC3008n pool, boolean darkenUnderDarkMode, Bitmap.Config config, boolean supportWideColor) {
        boolean z2;
        boolean z3;
        if (!com.android.thememanager.basemodule.utils.a9.m6993h(bf2.toq.toq())) {
            return bitmap;
        }
        byte b2 = 1;
        if (com.android.thememanager.basemodule.utils.o1t.m7171i()) {
            z3 = !C1404k.m5866n(bitmap, false);
            z2 = false;
        } else {
            z2 = darkenUnderDarkMode;
            z3 = com.android.thememanager.basemodule.utils.bf2.m7005k(bitmap, 5) == 2;
        }
        Log.d(f16890y, "dark if need isLight：" + z3 + " darkenUnderDarkMode：" + z2);
        if (z3 && !z2) {
            return bitmap;
        }
        RenderScript renderScript = null;
        try {
            try {
                RenderScript renderScriptCreate = RenderScript.create(bf2.toq.toq());
                com.android.thememanager.wvg wvgVar = new com.android.thememanager.wvg(renderScriptCreate);
                wvgVar.m10528s(z3 ? (byte) 0 : (byte) 1);
                if (!com.android.thememanager.basemodule.utils.o1t.m7171i()) {
                    if (!z2) {
                        b2 = 0;
                    }
                    wvgVar.m10529y(b2);
                }
                Bitmap bitmapMo10666g = pool.mo10666g(bitmap.getWidth(), bitmap.getHeight(), config);
                if (supportWideColor) {
                    C2763c.jp0y(bitmap.getColorSpace(), bitmapMo10666g);
                }
                if (bitmapMo10666g != null && !bitmap.isRecycled() && !bitmapMo10666g.isRecycled()) {
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapMo10666g);
                    wvgVar.m10525k(allocationCreateFromBitmap, allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapMo10666g);
                    wvgVar.destroy();
                    allocationCreateFromBitmap.destroy();
                    allocationCreateFromBitmap2.destroy();
                    if (renderScriptCreate != null) {
                        renderScriptCreate.destroy();
                    }
                    return bitmapMo10666g;
                }
                Log.w(f16890y, "darkIfNeed get error bitmap ,bitmap = " + bitmap + ",transformBitmap = " + bitmapMo10666g);
                if (renderScriptCreate != null) {
                    renderScriptCreate.destroy();
                }
                return bitmap;
            } catch (Exception e2) {
                C7794k.m28196p(f16890y, "Darken transform failed: " + e2);
                if (0 != 0) {
                    renderScript.destroy();
                }
                return bitmap;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                renderScript.destroy();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f7l8(int r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.x9kr.f7l8(int, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public void ld6(int index) {
        this.f16894q = index;
    }

    /* JADX INFO: renamed from: p */
    public int m10072p() {
        return this.f16894q;
    }

    /* JADX INFO: renamed from: q */
    public void m10073q(boolean force) {
        if (force) {
            this.f61430toq.m841q();
        }
    }

    /* JADX INFO: renamed from: s */
    public Bitmap m10074s(int index) {
        return this.f61430toq.m836g(Integer.valueOf(index));
    }

    @zy.dd
    @zy.y9n
    /* JADX INFO: renamed from: y */
    public Bitmap m10075y(String onlineUrl) {
        if (TextUtils.isEmpty(onlineUrl)) {
            return null;
        }
        try {
            return this.f16892k.zurt().mo6748i(onlineUrl).dxef().get();
        } catch (Exception e2) {
            Log.w(f16890y, "decode sync fail, " + e2);
            return null;
        }
    }
}
