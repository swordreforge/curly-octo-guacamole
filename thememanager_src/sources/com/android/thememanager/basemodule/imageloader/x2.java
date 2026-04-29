package com.android.thememanager.basemodule.imageloader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.bumptech.glide.disklrucache.C2968k;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.load.engine.cdj;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.resource.bitmap.jp0y;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Random;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ImageLoaderUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f9930k = "file://";

    /* JADX INFO: renamed from: n */
    private static Random f9931n = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57523toq = "ImageLoader";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final C1735g f57524zy = new C1735g(null);

    /* JADX INFO: renamed from: q */
    private static final LruCache<Object, Object> f9932q = new LruCache<>(3);

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    private static class f7l8 extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final byte[] f57525f7l8 = f7l8.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

        /* JADX INFO: renamed from: g */
        private static final String f9933g = "com.android.thememanager.basemodule.imageloader.x2$f7l8";

        /* JADX INFO: renamed from: n */
        private int f9934n;

        /* JADX INFO: renamed from: q */
        private float f9935q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f57526zy;

        /* synthetic */ f7l8(float f2, float f3, int i2, C1736k c1736k) {
            this(f2, f3, i2);
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object obj) {
            if (!(obj instanceof f7l8)) {
                return super.equals(obj);
            }
            f7l8 f7l8Var = (f7l8) obj;
            return this.f57526zy == f7l8Var.f57526zy && this.f9935q == f7l8Var.f9935q && this.f9934n == f7l8Var.f9934n;
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return com.bumptech.glide.util.kja0.kja0(f9933g.hashCode()) + com.bumptech.glide.util.kja0.qrj(this.f57526zy) + com.bumptech.glide.util.kja0.qrj(this.f9935q) + com.bumptech.glide.util.kja0.kja0(this.f9934n);
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            messageDigest.update(f57525f7l8);
            messageDigest.update(ByteBuffer.allocate(12).putFloat(this.f57526zy).putFloat(this.f9935q).putInt(this.f9934n).array());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@lvui InterfaceC3008n bitmapPool, @lvui Bitmap bitmap, int targetWidth, int targetHeight) {
            try {
                Bitmap bitmapMo10666g = bitmapPool.mo10666g(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                m6773n(bitmap.getColorSpace(), bitmapMo10666g);
                Canvas canvas = new Canvas(bitmapMo10666g);
                Paint paint = new Paint();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                paint.setAntiAlias(true);
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                float f2 = this.f57526zy;
                canvas.drawRoundRect(rectF, f2, f2, paint);
                if (this.f9935q > 0.0f) {
                    Paint paint2 = new Paint();
                    paint2.setColor(this.f9934n);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(this.f9935q);
                    paint2.setAntiAlias(true);
                    RectF rectF2 = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                    float f3 = this.f57526zy;
                    canvas.drawRoundRect(rectF2, f3, f3, paint2);
                }
                return bitmapMo10666g;
            } catch (OutOfMemoryError e2) {
                Log.e(x2.class.getSimpleName(), "GlideRoundedWithBorderTransform happens OutOfMemoryError" + e2);
                return null;
            }
        }

        private f7l8(float radius, float borderSize, int borderColor) {
            this.f57526zy = radius;
            this.f9935q = borderSize;
            this.f9934n = borderColor;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$g */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    public static class C1735g {

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final int f57527fu4 = 0;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public static final int f57528mcp = 2;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final int f57529o1t = 2;

        /* JADX INFO: renamed from: t */
        public static final int f9936t = 4;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final int f57530wvg = 3;

        /* JADX INFO: renamed from: z */
        public static final int f9937z = 1;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private InterfaceC1740s f57531cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f57532f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private String f57533fn3e;

        /* JADX INFO: renamed from: g */
        private int f9938g;

        /* JADX INFO: renamed from: h */
        private Matrix f9939h;

        /* JADX INFO: renamed from: i */
        private Rect f9940i;

        /* JADX INFO: renamed from: k */
        @Deprecated
        private int f9941k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private Object f57534ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f57535kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f57536ld6;

        /* JADX INFO: renamed from: n */
        private int f9942n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private boolean f57537n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private boolean f57538ni7;

        /* JADX INFO: renamed from: p */
        private com.bumptech.glide.load.toq f9943p;

        /* JADX INFO: renamed from: q */
        private int f9944q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f57539qrj;

        /* JADX INFO: renamed from: s */
        private float f9945s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f57540t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Drawable f57541toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f57542x2;

        /* JADX INFO: renamed from: y */
        private int f9946y;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private AbstractC3039p f57543zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private float f57544zy;

        /* synthetic */ C1735g(C1736k c1736k) {
            this();
        }

        public C1735g a9(boolean crossFade) {
            this.f57537n7h = crossFade;
            return this;
        }

        public C1735g d2ok(InterfaceC1740s onLoadListener) {
            this.f57531cdj = onLoadListener;
            return this;
        }

        public C1735g d3(AbstractC3039p d2) {
            this.f57543zurt = d2;
            return this;
        }

        public C1735g dd(String signature) {
            this.f57533fn3e = signature;
            return this;
        }

        public C1735g eqxt(Matrix matrix) {
            this.f9939h = matrix;
            return this;
        }

        public C1735g fti(boolean isDarkMode) {
            this.f57540t8r = isDarkMode;
            return this;
        }

        public C1735g fu4() {
            this.f57539qrj = true;
            return this;
        }

        @Deprecated
        public C1735g gvn7(int defaultImage) {
            this.f9941k = defaultImage;
            return this;
        }

        @Deprecated
        public C1735g hyr(boolean topCrop) {
            if (topCrop) {
                jk(1);
            }
            return this;
        }

        public C1735g jk(int cropType) {
            this.f9938g = cropType;
            return this;
        }

        public C1735g jp0y(com.bumptech.glide.load.toq format) {
            this.f9943p = format;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C1735g m6792l(boolean supportWideColor) {
            this.f57538ni7 = supportWideColor;
            return this;
        }

        public C1735g lvui(boolean origin) {
            this.f57542x2 = origin;
            return this;
        }

        public C1735g mcp(Rect cropRect) {
            this.f9940i = cropRect;
            return this;
        }

        public C1735g n5r1(Object thumbnail) {
            this.f57534ki = thumbnail;
            return this;
        }

        public C1735g ncyb(float sizeMultiplier) {
            this.f9945s = sizeMultiplier;
            return this;
        }

        public C1735g o1t(int borderColor) {
            this.f9942n = borderColor;
            return this;
        }

        public C1735g oc(boolean enable) {
            this.f57536ld6 = enable;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C1735g m6793r(Drawable placeholder) {
            this.f57541toq = placeholder;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C1735g m6794t(float cornerRadiusPixels) {
            this.f57544zy = cornerRadiusPixels;
            return this;
        }

        public C1735g wvg(int borderSize) {
            this.f9944q = borderSize;
            return this;
        }

        public C1735g x9kr(int w2, int h2) {
            this.f57532f7l8 = w2;
            this.f9946y = h2;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C1735g m6795z(boolean asBitmap) {
            this.f57535kja0 = asBitmap;
            return this;
        }

        private C1735g() {
            this.f9944q = 2;
            this.f9942n = R.color.item_border_color;
            this.f9938g = 0;
            this.f57532f7l8 = 0;
            this.f9946y = 0;
            this.f9945s = 1.0f;
            this.f57537n7h = true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$k */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    class C1736k extends com.bumptech.glide.request.target.n7h<Drawable> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ View f9947g;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f9948y;

        C1736k(final View val$layout, final int val$defaultImage) {
            this.f9947g = val$layout;
            this.f9948y = val$defaultImage;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void qrj(@lvui Drawable resource, @dd InterfaceC3185g<? super Drawable> transition) {
            this.f9947g.setBackground(resource);
        }

        @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: p */
        public void mo6797p(Drawable placeholder) {
            this.f9947g.setBackgroundResource(this.f9948y);
        }
    }

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    public static abstract class ld6 {

        /* JADX INFO: renamed from: k */
        private boolean f9949k = false;

        /* JADX INFO: renamed from: k */
        abstract void mo6798k();

        /* JADX INFO: renamed from: q */
        public void m6799q() {
            this.f9949k = false;
            toq();
        }

        abstract void toq();

        public void zy() {
            if (this.f9949k) {
                return;
            }
            mo6798k();
            this.f9949k = true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$n */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    private static class C1737n extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: q */
        private static final byte[] f9950q = C1737n.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f57545zy = "com.android.thememanager.basemodule.imageloader.x2$n";

        private C1737n() {
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object o2) {
            return o2 instanceof com.bumptech.glide.load.resource.bitmap.x2;
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return f57545zy.hashCode();
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            messageDigest.update(f9950q);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap inBitmap, int width, int height) {
            float width2;
            float height2;
            if (inBitmap.getWidth() == width && inBitmap.getHeight() == height) {
                return inBitmap;
            }
            Matrix matrix = new Matrix();
            float width3 = 0.0f;
            if (inBitmap.getWidth() * height > inBitmap.getHeight() * width) {
                width2 = height / inBitmap.getHeight();
                width3 = (width - (inBitmap.getWidth() * width2)) * 0.5f;
                height2 = 0.0f;
            } else {
                width2 = width / inBitmap.getWidth();
                height2 = (height - (inBitmap.getHeight() * width2)) * 0.5f;
            }
            matrix.setScale(width2, width2);
            matrix.postTranslate((int) (width3 + 0.5f), (int) (height2 + 0.5f));
            Bitmap bitmapMo10666g = pool.mo10666g(width, height, inBitmap.getConfig());
            m6773n(inBitmap.getColorSpace(), bitmapMo10666g);
            jp0y.m10968i(inBitmap, bitmapMo10666g);
            Canvas canvas = new Canvas(bitmapMo10666g);
            canvas.drawBitmap(inBitmap, matrix, new Paint(6));
            canvas.setBitmap(null);
            return bitmapMo10666g;
        }

        /* synthetic */ C1737n(C1736k c1736k) {
            this();
        }
    }

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    private static class n7h extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: q */
        private static final byte[] f9951q = n7h.class.getName().getBytes(com.bumptech.glide.load.f7l8.f62824toq);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f57546zy = "com.android.thememanager.basemodule.imageloader.x2$n7h";

        private n7h() {
        }

        /* JADX INFO: renamed from: g */
        private Bitmap m6800g(Bitmap recycled, Bitmap toCrop, int width, int height) {
            float f2;
            int width2;
            if (toCrop == null) {
                return null;
            }
            if (toCrop.getWidth() == width && toCrop.getHeight() == height) {
                return toCrop;
            }
            Matrix matrix = new Matrix();
            if (toCrop.getWidth() >= toCrop.getHeight()) {
                f2 = height;
                width2 = toCrop.getHeight();
            } else {
                f2 = width;
                width2 = toCrop.getWidth();
            }
            float f3 = f2 / width2;
            matrix.setScale(f3, f3);
            if (recycled == null) {
                recycled = Bitmap.createBitmap(width, height, toCrop.getConfig() != null ? toCrop.getConfig() : Bitmap.Config.ARGB_8888);
            }
            jp0y.m10968i(toCrop, recycled);
            new Canvas(recycled).drawBitmap(toCrop, matrix, new Paint(6));
            return recycled;
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object obj) {
            return obj instanceof n7h;
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return f57546zy.hashCode();
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            messageDigest.update(f9951q);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@lvui InterfaceC3008n bitmapPool, @lvui Bitmap bitmap, int targetWidth, int targetHeight) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapMo10666g = bitmapPool.mo10666g(targetWidth, targetHeight, config);
            m6773n(bitmap.getColorSpace(), bitmapMo10666g);
            Bitmap bitmapM6800g = m6800g(bitmapMo10666g, bitmap, targetWidth, targetHeight);
            if (bitmapMo10666g != bitmapM6800g) {
                bitmapMo10666g.recycle();
            }
            return bitmapM6800g;
        }

        /* synthetic */ n7h(C1736k c1736k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$p */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    private static class C1738p extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: n */
        private static final byte[] f9952n;

        /* JADX INFO: renamed from: q */
        private static final String f9953q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Rect f57547zy;

        static {
            String name = f7l8.class.getName();
            f9953q = name;
            f9952n = name.getBytes(com.bumptech.glide.load.f7l8.f62824toq);
        }

        public C1738p(@lvui Rect rect) {
            this.f57547zy = rect;
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object obj) {
            if (!(obj instanceof C1738p)) {
                return super.equals(obj);
            }
            return this.f57547zy.equals(((C1738p) obj).f57547zy);
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return com.bumptech.glide.util.kja0.kja0(f9953q.hashCode()) + com.bumptech.glide.util.kja0.kja0(this.f57547zy.left) + com.bumptech.glide.util.kja0.kja0(this.f57547zy.top) + com.bumptech.glide.util.kja0.kja0(this.f57547zy.right) + com.bumptech.glide.util.kja0.kja0(this.f57547zy.bottom);
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            messageDigest.update(f9952n);
            messageDigest.update(ByteBuffer.allocate(16).putInt(this.f57547zy.left).putInt(this.f57547zy.top).putInt(this.f57547zy.right).putInt(this.f57547zy.bottom).array());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap toTransform, int outWidth, int outHeight) {
            Rect rect = this.f57547zy;
            if (rect.left == 0 && rect.top == 0 && rect.width() == toTransform.getWidth() && this.f57547zy.height() == toTransform.getHeight()) {
                return toTransform;
            }
            Rect rect2 = this.f57547zy;
            return Bitmap.createBitmap(toTransform, rect2.left, rect2.top, Math.min(toTransform.getWidth(), this.f57547zy.right) - this.f57547zy.left, Math.min(toTransform.getHeight(), this.f57547zy.bottom) - this.f57547zy.top);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$q */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    class C1739q extends com.bumptech.glide.request.target.n7h<Bitmap> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC1740s f9954g;

        C1739q(final InterfaceC1740s val$onLoadListener) {
            this.f9954g = val$onLoadListener;
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void qrj(@lvui Bitmap resource, @dd InterfaceC3185g<? super Bitmap> transition) {
            this.f9954g.mo6382k(resource);
        }

        @Override // com.bumptech.glide.request.target.toq, com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@dd Drawable errorDrawable) {
            super.mo6802h(errorDrawable);
            this.f9954g.toq();
        }
    }

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    public static final class qrj implements com.bumptech.glide.load.f7l8 {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f57548zy;

        public qrj(String signature) {
            if (signature == null) {
                this.f57548zy = "";
            } else {
                this.f57548zy = signature;
            }
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object o2) {
            return this == o2 || ((o2 instanceof qrj) && this.f57548zy.equals(((qrj) o2).f57548zy));
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return this.f57548zy.hashCode();
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(MessageDigest messageDigest) {
            try {
                messageDigest.update(this.f57548zy.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                Log.i(x2.f57523toq, "StringSignature updateDiskCacheKey exception", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$s */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    public interface InterfaceC1740s<T> {
        /* JADX INFO: renamed from: k */
        void mo6382k(@lvui T result);

        void toq();
    }

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    class toq implements InterfaceC3194y<Drawable> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC1740s f9955k;

        toq(final InterfaceC1740s val$onLoadListener) {
            this.f9955k = val$onLoadListener;
        }

        @Override // com.bumptech.glide.request.InterfaceC3194y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo6804n(Drawable resource, Object model, InterfaceC3175h<Drawable> target, EnumC3050k dataSource, boolean isFirstResource) {
            if (!(resource instanceof BitmapDrawable)) {
                return false;
            }
            this.f9955k.mo6382k(((BitmapDrawable) resource).getBitmap());
            return false;
        }

        @Override // com.bumptech.glide.request.InterfaceC3194y
        /* JADX INFO: renamed from: q */
        public boolean mo6805q(@dd cdj e2, Object model, InterfaceC3175h<Drawable> target, boolean isFirstResource) {
            this.f9955k.toq();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$x2, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    public interface InterfaceC7907x2 {
        void setRecyclerImageLoader(ld6 recyclerImageLoader);
    }

    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    class zy extends ld6 {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Activity f9957n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ImageView f9958q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AsyncTask f57550toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.n7h f57551zy;

        zy(final AsyncTask val$task, final com.bumptech.glide.n7h val$requestBuilder, final ImageView val$imageView, final Activity val$activity) {
            this.f57550toq = val$task;
            this.f57551zy = val$requestBuilder;
            this.f9958q = val$imageView;
            this.f9957n = val$activity;
        }

        @Override // com.android.thememanager.basemodule.imageloader.x2.ld6
        @SuppressLint({"CheckResult", com.google.common.net.zy.f68521jp0y})
        /* JADX INFO: renamed from: k */
        void mo6798k() {
            AsyncTask asyncTask = this.f57550toq;
            if (asyncTask == null) {
                this.f57551zy.ixz(this.f9958q);
            } else {
                if (asyncTask.isCancelled()) {
                    return;
                }
                this.f57551zy.ixz(this.f9958q);
            }
        }

        @Override // com.android.thememanager.basemodule.imageloader.x2.ld6
        void toq() {
            x2.ni7(this.f9957n, this.f9958q);
        }
    }

    @Deprecated
    public static int cdj(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_small_corner_bg_yellow : R.drawable.thumbnail_small_corner_bg_light_purple : R.drawable.thumbnail_small_corner_bg_light_blue : R.drawable.thumbnail_small_corner_bg_sky_blue : R.drawable.thumbnail_small_corner_bg_light_pink : R.drawable.thumbnail_small_corner_bg_pink : R.drawable.thumbnail_small_corner_bg_yellow;
    }

    public static void f7l8(Activity activity, Object url, ImageView imageView, Drawable placeholder, int cornerRadiusPixels) {
        m6782y(activity, url, imageView, fn3e().m6793r(placeholder).m6794t(cornerRadiusPixels));
    }

    public static C1735g fn3e() {
        return new C1735g(null);
    }

    /* JADX INFO: renamed from: g */
    public static void m6774g(Activity activity, Object url, ImageView imageView, int defaultImage, int cornerRadiusPixels, int cropType) {
        m6782y(activity, url, imageView, fn3e().gvn7(defaultImage).m6794t(cornerRadiusPixels).jk(cropType));
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static int m6775h(int level) {
        return R.drawable.ringtone_bg_pink;
    }

    /* JADX INFO: renamed from: i */
    public static void m6776i(Activity activity, String url, @lvui final InterfaceC1740s onLoadListener) {
        com.bumptech.glide.zy.mcp(activity).zurt().mo6748i(url).yl(new C1739q(onLoadListener));
    }

    public static Drawable ki(int level, float radius) {
        return t8r(level, radius, C1819o.d2ok(bf2.toq.toq()));
    }

    @Deprecated
    public static int kja0(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_big_corner_bg_yellow : R.drawable.thumbnail_big_corner_bg_light_purple : R.drawable.thumbnail_big_corner_bg_light_blue : R.drawable.thumbnail_big_corner_bg_sky_blue : R.drawable.thumbnail_big_corner_bg_light_pink : R.drawable.thumbnail_big_corner_bg_pink : R.drawable.thumbnail_big_corner_bg_yellow;
    }

    public static void ld6(@lvui Context context, @lvui String path, @lvui String signatureString, @lvui ImageView imageView) {
        com.bumptech.glide.zy.a9(context).mo6748i(path).was(new qrj(signatureString)).ixz(imageView);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static void m6778n(Activity activity, Object url, ImageView imageView, int defaultImage, int cornerRadiusPixels) {
        m6782y(activity, url, imageView, fn3e().gvn7(defaultImage).m6794t(cornerRadiusPixels));
    }

    @Deprecated
    public static int n7h(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_bg_yellow : R.drawable.thumbnail_bg_light_purple : R.drawable.thumbnail_bg_light_blue : R.drawable.thumbnail_bg_sky_blue : R.drawable.thumbnail_bg_light_pink : R.drawable.thumbnail_bg_pink : R.drawable.thumbnail_bg_yellow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ni7(Activity activity, ImageView view) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        com.bumptech.glide.zy.mcp(activity).o1t(view);
    }

    /* JADX INFO: renamed from: p */
    public static void m6779p(Activity activity, String url, final View layout, final int defaultImage) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        com.bumptech.glide.zy.mcp(activity).mo6748i(url).mo6764k(new C3173s().mu(defaultImage)).yl(new C1736k(layout, defaultImage));
    }

    /* JADX INFO: renamed from: q */
    public static void m6780q(Activity activity, Object url, ImageView imageView, int defaultImage) {
        m6782y(activity, url, imageView, fn3e().gvn7(defaultImage));
    }

    public static File qrj(String url) {
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        try {
            C2968k.n nVarA98o = C2968k.was(new File(bf2.toq.toq().getCacheDir(), InterfaceC3016k.k.f62732toq), 1, 1, 100000000).a98o(new com.bumptech.glide.load.engine.cache.qrj().toq(new C1730n(new C3084y(url), com.bumptech.glide.signature.zy.zy())));
            if (nVarA98o != null) {
                return nVarA98o.toq(0);
            }
        } catch (IOException e2) {
            Log.i(f57523toq, "getCachePath err ", e2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6781s(android.app.Activity r10, java.lang.Object r11, android.widget.ImageView r12, com.android.thememanager.basemodule.imageloader.x2.C1735g r13, android.os.AsyncTask r14) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.imageloader.x2.m6781s(android.app.Activity, java.lang.Object, android.widget.ImageView, com.android.thememanager.basemodule.imageloader.x2$g, android.os.AsyncTask):void");
    }

    public static Drawable t8r(int level, float radius, boolean darkMode) {
        int i2 = level % 6;
        int i3 = R.color.preview_bg_yellow;
        if (darkMode) {
            i3 = C1807g.lvui() ? R.color.miuix_appcompat_black : R.color.preview_night_bg;
        } else if (i2 != 0) {
            if (i2 == 1) {
                i3 = R.color.preview_bg_pink;
            } else if (i2 == 2) {
                i3 = R.color.preview_bg_light_pink;
            } else if (i2 == 3) {
                i3 = R.color.preview_bg_sky_blue;
            } else if (i2 == 4) {
                i3 = R.color.preview_bg_light_blue;
            } else if (i2 == 5) {
                i3 = R.color.preview_bg_light_purple;
            }
        }
        return C1819o.m7166t(bf2.toq.toq().getResources().getColor(i3), radius);
    }

    public static void toq(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        com.bumptech.glide.zy.a9(context).o1t(view);
    }

    public static int x2() {
        if (f9931n == null) {
            f9931n = new Random();
        }
        return f9931n.nextInt(7);
    }

    /* JADX INFO: renamed from: y */
    public static void m6782y(final Activity activity, final Object url, final ImageView imageView, C1735g params) {
        m6781s(activity, url, imageView, params, null);
    }

    public static void zurt(Object target, Object thumbnail) {
        if (target == null || thumbnail == null) {
            return;
        }
        f9932q.put(target, thumbnail);
    }

    public static void zy(Activity activity, Object url, ImageView imageView) {
        m6782y(activity, url, imageView, null);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.x2$y */
    /* JADX INFO: compiled from: ImageLoaderUtils.java */
    private static class C1741y extends com.android.thememanager.basemodule.imageloader.toq {

        /* JADX INFO: renamed from: q */
        private static final String f9956q = "com.android.thememanager.basemodule.imageloader.x2$y";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final byte[] f57549zy;

        private C1741y() {
            this.f57549zy = f9956q.getBytes(com.bumptech.glide.load.f7l8.f62824toq);
        }

        @Override // com.bumptech.glide.load.f7l8
        public boolean equals(Object obj) {
            return obj instanceof C1741y;
        }

        @Override // com.bumptech.glide.load.f7l8
        public int hashCode() {
            return f9956q.hashCode();
        }

        @Override // com.android.thememanager.basemodule.imageloader.toq
        /* JADX INFO: renamed from: q */
        protected boolean mo6742q() {
            return true;
        }

        @Override // com.bumptech.glide.load.f7l8
        public void toq(@lvui MessageDigest messageDigest) {
            messageDigest.update(this.f57549zy);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3115y
        protected Bitmap zy(@lvui InterfaceC3008n pool, @lvui Bitmap toTransform, int outWidth, int outHeight) {
            int width = toTransform.getWidth();
            int height = toTransform.getHeight();
            int[] iArr = new int[width * height];
            toTransform.getPixels(iArr, 0, width, 0, 0, width, height);
            for (int i2 = 0; i2 < height; i2++) {
                for (int i3 = 0; i3 < width; i3++) {
                    int i4 = (width * i2) + i3;
                    int i5 = iArr[i4];
                    int i6 = ((-16777216) & i5) >> 24;
                    int i7 = (16711680 & i5) >> 16;
                    int i8 = (65280 & i5) >> 8;
                    int i9 = i5 & 255;
                    if (i7 == 0 && i8 == 0 && i9 == 0 && i6 != 0) {
                        iArr[i4] = Color.argb(i6, 255, 255, 255);
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            m6773n(toTransform.getColorSpace(), bitmapCreateBitmap);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        }

        /* synthetic */ C1741y(C1736k c1736k) {
            this();
        }
    }
}
