package miuix.graphics;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import miuix.core.util.ki;
import miuix.graphics.C7112q;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;
import miuix.io.C7184k;

/* JADX INFO: renamed from: miuix.graphics.k */
/* JADX INFO: compiled from: BitmapFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7111k extends BitmapFactory {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String[] f87509f7l8;

    /* JADX INFO: renamed from: g */
    private static final Pattern f40036g;

    /* JADX INFO: renamed from: k */
    static RenderScript f40037k = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f87510ld6 = 0;

    /* JADX INFO: renamed from: n */
    private static final Paint f40038n;

    /* JADX INFO: renamed from: p */
    public static final int f40039p = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f87511qrj = 2;

    /* JADX INFO: renamed from: s */
    public static final int f40041s = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f87513x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final int f40042y = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static Object f87512toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static byte[] f87514zy = {-119, 80, 78, 71, com.google.common.base.zy.f68124kja0, 10, com.google.common.base.zy.f68121jk, 10};

    /* JADX INFO: renamed from: q */
    private static final ThreadLocal<Canvas> f40040q = new ThreadLocal<>();

    /* JADX INFO: renamed from: miuix.graphics.k$k */
    /* JADX INFO: compiled from: BitmapFactory.java */
    class k extends ContextWrapper {
        k(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context getApplicationContext() {
            return this;
        }
    }

    /* JADX INFO: renamed from: miuix.graphics.k$toq */
    /* JADX INFO: compiled from: BitmapFactory.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public int f40043k;

        /* JADX INFO: renamed from: n */
        public Rect f40044n;

        /* JADX INFO: renamed from: q */
        public int f40045q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f87515toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f87516zy;

        public toq() {
        }

        public toq(int i2, int i3, int i4, int i5) {
            this.f40043k = i2;
            this.f87515toq = i3;
            this.f87516zy = i4;
            this.f40045q = i5;
        }

        public toq(toq toqVar) {
            this.f40043k = toqVar.f40043k;
            this.f87515toq = toqVar.f87515toq;
            this.f87516zy = toqVar.f87516zy;
            this.f40045q = toqVar.f40045q;
            this.f40044n = toqVar.f40044n;
        }
    }

    static {
        Paint paint = new Paint(1);
        f40038n = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        f40036g = Pattern.compile("[\u3100-ㄭㆠ-ㆺ一-鿌㐀-䶵豈-龎⼀-⿕⺀-⻳㇀-㇣ᄀ-ᇿꥠ-ꥼힰ-ퟻㄱ-ㆎ가-힣\u3040-ゟ゠-ヿㇰ-ㇿ㆐-㆟ꀀ-ꒌ꒐-꓆]");
        f87509f7l8 = new String[]{"老师", "先生", "老板", "仔", "手机", "叔", "阿姨", "宅", "伯", "伯母", "伯父", "哥", "姐", "弟", "妹", "舅", "姑", "父", "主任", "经理", "工作", "同事", "律师", "司机", "师傅", "师父", "爷", "奶", "中介", "董", "总", "太太", "保姆", "某", "秘书", "处长", "局长", "班长", "兄", "助理"};
    }

    protected C7111k() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    private static Canvas a9() {
        ThreadLocal<Canvas> threadLocal = f40040q;
        Canvas canvas = threadLocal.get();
        if (canvas != null) {
            return canvas;
        }
        Canvas canvas2 = new Canvas();
        threadLocal.set(canvas2);
        return canvas2;
    }

    public static Bitmap cdj(Context context, Uri uri, int i2, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(context, uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapNi7 = ni7(c7184k, i2, z2);
            c7184k.close();
            return bitmapNi7;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    private static boolean d2ok(byte[] bArr) {
        if (bArr == null || bArr.length < f87514zy.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f87514zy;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static boolean d3(Context context, Uri uri) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(context, uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zEqxt = eqxt(c7184k);
            c7184k.close();
            return zEqxt;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static boolean dd(Bitmap bitmap, String str) throws IOException {
        return x9kr(bitmap, str, false);
    }

    public static boolean eqxt(C7184k c7184k) throws IOException {
        int length = f87514zy.length;
        byte[] bArr = new byte[length];
        if (c7184k.read(bArr) >= length) {
            return d2ok(bArr);
        }
        return false;
    }

    private static Bitmap f7l8(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        return Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
    }

    public static Bitmap fn3e(String str, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapNi7 = ni7(c7184k, -1, z2);
            c7184k.close();
            return bitmapNi7;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static Bitmap fti(Bitmap bitmap, float f2) {
        return jp0y(bitmap, f2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap fu4(Context context, Bitmap bitmap, int i2) {
        Bitmap bitmapF7l8 = f7l8(bitmap);
        m25755z(context, bitmap, bitmapF7l8, i2);
        return bitmapF7l8;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m25743g(String str) {
        return f40036g.matcher(str).find();
    }

    private static String gvn7(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!m25743g(str)) {
            return ki.m25563g(str, 0, 1).toUpperCase();
        }
        String strM25751r = m25751r(str);
        if (TextUtils.isEmpty(strM25751r)) {
            return null;
        }
        int length = strM25751r.length();
        return strM25751r.substring(length - 1, length).trim();
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m25744h(Context context, Uri uri, int i2, int i3, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(context, uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapZurt = zurt(c7184k, i2, i3, z2);
            c7184k.close();
            return bitmapZurt;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m25745i(String str, int i2, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapNi7 = ni7(c7184k, i2, z2);
            c7184k.close();
            return bitmapNi7;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static BitmapFactory.Options jk(C7184k c7184k) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c7184k, null, options);
        return options;
    }

    public static Bitmap jp0y(Bitmap bitmap, float f2, Bitmap.Config config) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: k */
    private static int m25746k(int i2, int i3, int i4) {
        return Math.min(i3, Math.max(i2, i4));
    }

    public static Bitmap ki(Context context, Uri uri, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(context, uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapNi7 = ni7(c7184k, -1, z2);
            c7184k.close();
            return bitmapNi7;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static Bitmap kja0(Bitmap bitmap, toq toqVar) {
        if (bitmap != null) {
            return n7h(bitmap, f7l8(bitmap), toqVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Bitmap m25747l(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        if (bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight()) {
            return bitmap;
        }
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
        return bitmap2;
    }

    public static Bitmap ld6(Context context, String str, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        int color;
        int iM25949n;
        if (str == null) {
            return null;
        }
        String strGvn7 = gvn7(str.trim());
        if (TextUtils.isEmpty(strGvn7)) {
            return null;
        }
        if (i3 != 0) {
            drawable = context.getResources().getDrawable(i3);
        } else if (i5 == 0) {
            drawable = context.getResources().getDrawable(C7112q.q.f87648cdj);
        } else if (1 == i5) {
            drawable = context.getResources().getDrawable(C7112q.q.f40109h);
        } else {
            if (2 != i5) {
                throw new IllegalArgumentException("unknown mode when get drawable: " + i5);
            }
            drawable = C7164n.m25952s(context, C7112q.k.f87527gvn7);
            if (drawable == null) {
                drawable = n7h.qrj(context) ? context.getResources().getDrawable(C7112q.q.f40109h) : context.getResources().getDrawable(C7112q.q.f87648cdj);
            }
        }
        drawable.setBounds(new Rect(0, 0, i2, i2));
        if (i4 != 0) {
            color = context.getResources().getColor(i4);
        } else if (i5 == 0) {
            color = context.getResources().getColor(C7112q.toq.f40122n);
        } else if (1 == i5) {
            color = context.getResources().getColor(C7112q.toq.f40120g);
        } else {
            if (2 != i5) {
                throw new IllegalArgumentException("unknown mode when get photo color: " + i5);
            }
            try {
                iM25949n = C7164n.m25949n(context, C7112q.k.f87522d3);
            } catch (Exception unused) {
                iM25949n = -1;
            }
            color = iM25949n == -1 ? n7h.qrj(context) ? context.getResources().getColor(C7112q.toq.f40120g) : context.getResources().getColor(C7112q.toq.f40122n) : iM25949n;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.draw(canvas);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setColor(color);
        paint.setTextSize(i2 * 0.6f);
        paint.getTextBounds(strGvn7, 0, strGvn7.length(), new Rect());
        canvas.drawText(strGvn7, (int) (((double) (i2 - (r6.right + r6.left))) * 0.5d), (int) (((double) (i2 - (r6.top + r6.bottom))) * 0.5d), paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap lvui(Bitmap bitmap, Drawable drawable, Bitmap bitmap2, Rect rect, Rect rect2) {
        int i2;
        if (bitmap2 == null && rect2 == null) {
            return null;
        }
        int i3 = 0;
        if (bitmap2 == null) {
            if (rect2.height() <= 0 || rect2.width() <= 0) {
                return null;
            }
            bitmap2 = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        } else if (rect2 == null) {
            rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        }
        Canvas canvasA9 = a9();
        canvasA9.setBitmap(bitmap2);
        canvasA9.drawColor(0, PorterDuff.Mode.CLEAR);
        if (drawable != null) {
            drawable.setBounds(rect2);
            drawable.draw(canvasA9);
        }
        if (rect == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int iWidth = rect2.width();
            float fHeight = rect2.height();
            float f2 = iWidth;
            float f3 = fHeight / f2;
            float f4 = width;
            float f5 = f4 / f2;
            float f6 = height;
            float f7 = f6 / fHeight;
            if (f5 > f7) {
                int i4 = (int) (f6 / f3);
                i3 = (width - i4) / 2;
                width = i4;
                i2 = 0;
            } else if (f5 < f7) {
                int i5 = (int) (f3 * f4);
                i2 = (height - i5) / 2;
                height = i5;
            } else {
                i2 = 0;
            }
            rect = new Rect(i3, i2, width + i3, height + i2);
        }
        canvasA9.drawBitmap(bitmap, rect, rect2, f40038n);
        return bitmap2;
    }

    public static BitmapFactory.Options mcp(String str) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            BitmapFactory.Options optionsJk = jk(c7184k);
            c7184k.close();
            return optionsJk;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    private static int m25748n(C7184k c7184k, int i2) {
        if (i2 <= 0) {
            return 1;
        }
        BitmapFactory.Options optionsJk = jk(c7184k);
        return (int) Math.sqrt((((double) optionsJk.outWidth) * ((double) optionsJk.outHeight)) / ((double) i2));
    }

    private static Bitmap n5r1(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(3);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap n7h(Bitmap bitmap, Bitmap bitmap2, toq toqVar) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        toq toqVar2 = toqVar == null ? new toq() : toqVar;
        Rect rect = toqVar2.f40044n;
        if (rect == null) {
            rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        int iM25746k = m25746k(0, bitmap.getWidth() - 1, rect.left);
        int iM25746k2 = m25746k(iM25746k, bitmap.getWidth(), rect.right);
        int iM25746k3 = m25746k(0, bitmap.getHeight() - 1, rect.top);
        int iM25746k4 = m25746k(iM25746k3, bitmap.getHeight(), rect.bottom);
        int i2 = iM25746k2 - iM25746k;
        int i3 = iM25746k4 - iM25746k3;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        toqVar2.f87516zy = m25746k(0, Math.min(width, height) / 2, toqVar2.f87516zy);
        toqVar2.f40043k = m25746k(0, width / 2, toqVar2.f40043k);
        toqVar2.f87515toq = m25746k(0, height / 2, toqVar2.f87515toq);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawARGB(0, 0, 0, 0);
        int i4 = toqVar2.f40043k;
        int i5 = toqVar2.f87516zy;
        if (i4 - i5 > 0 && toqVar2.f87515toq - i5 > 0) {
            int i6 = toqVar2.f87516zy;
            RectF rectF = new RectF(i6, i6, width - i6, height - i6);
            int i7 = toqVar2.f40043k;
            int i8 = toqVar2.f87516zy;
            canvas.drawRoundRect(rectF, i7 - i8, toqVar2.f87515toq - i8, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        int i9 = toqVar2.f87516zy;
        float f2 = i2;
        float f3 = width - (i9 * 2);
        float f4 = i3;
        float f5 = height - (i9 * 2);
        float fMin = Math.min((f2 * 1.0f) / f3, (1.0f * f4) / f5);
        int i10 = (int) ((f2 - (f3 * fMin)) / 2.0f);
        int i11 = (int) ((f4 - (f5 * fMin)) / 2.0f);
        Rect rect2 = new Rect(iM25746k + i10, iM25746k3 + i11, iM25746k2 - i10, iM25746k4 - i11);
        int i12 = toqVar2.f87516zy;
        canvas.drawBitmap(bitmap, rect2, new Rect(i12, i12, width - i12, height - i12), paint);
        if (toqVar2.f87516zy > 0) {
            int i13 = toqVar2.f40045q;
            if ((i13 >>> 24) != 0) {
                paint.setColor(i13);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), toqVar2.f40043k, toqVar2.f87515toq, paint);
            }
        }
        return bitmap2;
    }

    public static Bitmap ncyb(Bitmap bitmap, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        m25747l(bitmap, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap ni7(miuix.io.C7184k r4, int r5, boolean r6) throws java.io.IOException {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inSampleSize = r1
            r1 = 0
            r0.inScaled = r1
            int r5 = m25748n(r4, r5)
            r0.inSampleSize = r5
        L11:
            int r5 = r1 + 1
            r2 = 3
            r3 = 0
            if (r1 >= r2) goto L2b
            r4.reset()     // Catch: java.lang.OutOfMemoryError -> L1f
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4, r3, r0)     // Catch: java.lang.OutOfMemoryError -> L1f
            goto L2b
        L1f:
            r1 = move-exception
            if (r6 == 0) goto L2a
            int r1 = r0.inSampleSize
            int r1 = r1 * 2
            r0.inSampleSize = r1
            r1 = r5
            goto L11
        L2a:
            throw r1
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.graphics.C7111k.ni7(miuix.io.k, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r2 = n5r1(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap o1t(android.content.Context r9, android.graphics.Bitmap r10, android.graphics.Bitmap r11, int r12) {
        /*
            r0 = 1
            r1 = r0
        L2:
            r2 = 25
            if (r12 <= r2) goto Lb
            int r1 = r1 * 2
            int r12 = r12 / 2
            goto L2
        Lb:
            int r2 = r10.getWidth()
            int r3 = r10.getHeight()
            if (r1 != r0) goto L17
            r2 = r10
            goto L25
        L17:
            int r2 = r2 / r1
            int r2 = java.lang.Math.max(r2, r0)
            int r3 = r3 / r1
            int r3 = java.lang.Math.max(r3, r0)
            android.graphics.Bitmap r2 = ncyb(r10, r2, r3)
        L25:
            android.content.Context r3 = r9.getApplicationContext()
            if (r3 != 0) goto L31
            miuix.graphics.k$k r3 = new miuix.graphics.k$k
            r3.<init>(r9)
            r9 = r3
        L31:
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch: java.lang.Exception -> L61
            java.lang.String r4 = "android.graphics.Bitmap$Config"
            java.lang.Class r3 = r3.loadClass(r4)     // Catch: java.lang.Exception -> L61
            java.lang.Object[] r3 = r3.getEnumConstants()     // Catch: java.lang.Exception -> L61
            int r4 = r3.length     // Catch: java.lang.Exception -> L61
            r5 = 0
        L41:
            if (r5 >= r4) goto L61
            r6 = r3[r5]     // Catch: java.lang.Exception -> L61
            java.lang.Enum r6 = (java.lang.Enum) r6     // Catch: java.lang.Exception -> L61
            java.lang.String r7 = r6.name()     // Catch: java.lang.Exception -> L61
            java.lang.String r8 = "RGBA_F16"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Exception -> L61
            if (r7 == 0) goto L5e
            android.graphics.Bitmap$Config r7 = r2.getConfig()     // Catch: java.lang.Exception -> L61
            if (r7 != r6) goto L5e
            android.graphics.Bitmap r2 = n5r1(r2)     // Catch: java.lang.Exception -> L61
            goto L61
        L5e:
            int r5 = r5 + 1
            goto L41
        L61:
            java.lang.Object r3 = miuix.graphics.C7111k.f87512toq
            monitor-enter(r3)
            android.renderscript.RenderScript r4 = miuix.graphics.C7111k.f40037k     // Catch: java.lang.Throwable -> Lc4
            if (r4 != 0) goto L6e
            android.renderscript.RenderScript r9 = android.renderscript.RenderScript.create(r9)     // Catch: java.lang.Throwable -> Lc4
            miuix.graphics.C7111k.f40037k = r9     // Catch: java.lang.Throwable -> Lc4
        L6e:
            if (r1 != r0) goto L72
            r9 = r11
            goto L73
        L72:
            r9 = r2
        L73:
            int r1 = r2.getRowBytes()     // Catch: java.lang.Throwable -> Lc4
            int r4 = r9.getRowBytes()     // Catch: java.lang.Throwable -> Lc4
            if (r1 == r4) goto L83
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lc4
            android.graphics.Bitmap r2 = r2.copy(r1, r0)     // Catch: java.lang.Throwable -> Lc4
        L83:
            android.renderscript.RenderScript r0 = miuix.graphics.C7111k.f40037k     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r0, r2)     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.RenderScript r1 = miuix.graphics.C7111k.f40037k     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.Type r4 = r0.getType()     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.RenderScript r4 = miuix.graphics.C7111k.f40037k     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.Element r5 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> Lc4
            android.renderscript.ScriptIntrinsicBlur r4 = android.renderscript.ScriptIntrinsicBlur.create(r4, r5)     // Catch: java.lang.Throwable -> Lc4
            float r12 = (float) r12     // Catch: java.lang.Throwable -> Lc4
            r4.setRadius(r12)     // Catch: java.lang.Throwable -> Lc4
            r4.setInput(r0)     // Catch: java.lang.Throwable -> Lc4
            r4.forEach(r1)     // Catch: java.lang.Throwable -> Lc4
            r1.copyTo(r9)     // Catch: java.lang.Throwable -> Lc4
            if (r9 == r11) goto Laf
            m25747l(r9, r11)     // Catch: java.lang.Throwable -> Lc4
        Laf:
            if (r2 == r10) goto Lb4
            r2.recycle()     // Catch: java.lang.Throwable -> Lc4
        Lb4:
            if (r9 == r11) goto Lb9
            r9.recycle()     // Catch: java.lang.Throwable -> Lc4
        Lb9:
            r0.destroy()     // Catch: java.lang.Throwable -> Lc4
            r1.destroy()     // Catch: java.lang.Throwable -> Lc4
            r4.destroy()     // Catch: java.lang.Throwable -> Lc4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc4
            return r11
        Lc4:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.graphics.C7111k.o1t(android.content.Context, android.graphics.Bitmap, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static boolean oc(String str) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zEqxt = eqxt(c7184k);
            c7184k.close();
            return zEqxt;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static Bitmap m25749p(Context context, String str, int i2, int i3, int i4) {
        return ld6(context, str, i2, i3, i4, 0);
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m25750q(Bitmap bitmap, Bitmap bitmap2, Drawable drawable, Drawable drawable2, Drawable drawable3, Rect rect, Rect rect2) {
        if (bitmap2 == null && rect2 == null) {
            return null;
        }
        if (bitmap2 == null) {
            if (rect2.height() <= 0 || rect2.width() <= 0) {
                return null;
            }
            bitmap2 = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        } else if (rect2 == null) {
            rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        }
        Bitmap bitmapLvui = lvui(bitmap, drawable, null, rect, rect2);
        Canvas canvasA9 = a9();
        canvasA9.setBitmap(bitmap2);
        if (drawable3 != null) {
            drawable3.setBounds(rect2);
            drawable3.draw(canvasA9);
        }
        canvasA9.drawBitmap(bitmapLvui, rect2, rect2, (Paint) null);
        bitmapLvui.recycle();
        if (drawable2 != null) {
            drawable2.setBounds(rect2);
            drawable2.draw(canvasA9);
        }
        return bitmap2;
    }

    public static Bitmap qrj(Context context, Bitmap bitmap, int i2) {
        Resources resources = context.getResources();
        return zy(bitmap, null, resources.getDrawable(C7112q.q.f87656zy), resources.getDrawable(C7112q.q.f87654toq), resources.getDrawable(C7112q.q.f40110k), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:1: B:8:0x000c->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[EDGE_INSN: B:33:0x0052->B:21:0x0052 BREAK  A[LOOP:1: B:8:0x000c->B:20:0x004f], SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m25751r(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            r0 = r7
        L9:
            r1 = 0
            r2 = r1
            r3 = r2
        Lc:
            java.lang.String[] r4 = miuix.graphics.C7111k.f87509f7l8
            int r5 = r4.length
            r6 = 1
            if (r2 >= r5) goto L52
            r5 = r4[r2]
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L2b
            int r3 = r0.length()
            r4 = r4[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            java.lang.String r0 = r0.substring(r1, r3)
        L29:
            r3 = r6
            goto L48
        L2b:
            int r4 = r0.length()
            int r4 = r4 - r6
            char r4 = r0.charAt(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = m25743g(r4)
            if (r4 != 0) goto L48
            int r3 = r0.length()
            int r3 = r3 - r6
            java.lang.String r0 = r0.substring(r1, r3)
            goto L29
        L48:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L4f
            goto L52
        L4f:
            int r2 = r2 + 1
            goto Lc
        L52:
            if (r3 == 0) goto L5a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L9
        L5a:
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.trim()
        L60:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L6f
            int r0 = r7.length()
            int r0 = r0 - r6
            java.lang.String r0 = r7.substring(r0)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.graphics.C7111k.m25751r(java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: s */
    public static Bitmap m25752s(Context context, String str, int i2, int i3) {
        return ld6(context, str, i2, 0, 0, i3);
    }

    /* JADX INFO: renamed from: t */
    public static BitmapFactory.Options m25753t(Context context, Uri uri) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(context, uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            BitmapFactory.Options optionsJk = jk(c7184k);
            c7184k.close();
            return optionsJk;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static Bitmap t8r(String str, int i2, int i3, boolean z2) throws Throwable {
        C7184k c7184k;
        C7184k c7184k2 = null;
        try {
            c7184k = new C7184k(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapZurt = zurt(c7184k, i2, i3, z2);
            c7184k.close();
            return bitmapZurt;
        } catch (Throwable th2) {
            th = th2;
            c7184k2 = c7184k;
            if (c7184k2 != null) {
                c7184k2.close();
            }
            throw th;
        }
    }

    public static Bitmap toq(Bitmap bitmap, Bitmap bitmap2, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        return m25750q(bitmap, bitmap2, drawable, drawable2, drawable3, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap2 != null ? new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()) : new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    public static int wvg(Bitmap bitmap, int i2) {
        int height = bitmap.getHeight() / i2;
        int width = bitmap.getWidth() / i2;
        int i3 = (width * height) / 5;
        Bitmap bitmapNcyb = ncyb(bitmap, width, height);
        int i4 = 2;
        int i5 = 0;
        for (int i6 = 0; i6 < width; i6++) {
            int i7 = 0;
            while (true) {
                if (i7 < height) {
                    int pixel = bitmapNcyb.getPixel(i6, i7);
                    if (((int) ((((double) ((16711680 & pixel) >> 16)) * 0.3d) + (((double) ((65280 & pixel) >> 8)) * 0.59d) + (((double) (pixel & 255)) * 0.11d))) < 180) {
                        i5++;
                        if (i5 > i3) {
                            i4 = 1;
                        }
                        if (i5 > i3 * 2) {
                            i4 = 0;
                            break;
                        }
                    }
                    i7++;
                }
            }
        }
        if (bitmapNcyb != bitmap) {
            bitmapNcyb.recycle();
        }
        return i4;
    }

    public static Bitmap x2(Context context, Bitmap bitmap) {
        return qrj(context, bitmap, context.getResources().getDimensionPixelSize(C7112q.zy.f40133y));
    }

    public static boolean x9kr(Bitmap bitmap, String str, boolean z2) throws Throwable {
        if (bitmap == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(z2 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static Bitmap m25754y(Context context, String str, int i2) {
        return m25749p(context, str, i2, 0, 0);
    }

    /* JADX INFO: renamed from: z */
    public static Bitmap m25755z(Context context, Bitmap bitmap, Bitmap bitmap2, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null || bitmap.getWidth() != bitmap2.getWidth() || bitmap.getHeight() != bitmap2.getHeight()) {
            bitmap2 = f7l8(bitmap);
        }
        o1t(context, bitmap, bitmap2, i2);
        return bitmap2;
    }

    public static Bitmap zurt(C7184k c7184k, int i2, int i3, boolean z2) throws IOException {
        int i4 = i2 * i3;
        if (i2 <= 0 || i3 <= 0) {
            i4 = -1;
        }
        Bitmap bitmapNi7 = ni7(c7184k, i4, z2);
        if (bitmapNi7 == null) {
            return null;
        }
        if (i4 <= 0) {
            return bitmapNi7;
        }
        Bitmap bitmapNcyb = ncyb(bitmapNi7, i2, i3);
        if (bitmapNi7 != bitmapNcyb) {
            bitmapNi7.recycle();
        }
        return bitmapNcyb;
    }

    public static Bitmap zy(Bitmap bitmap, Bitmap bitmap2, Drawable drawable, Drawable drawable2, Drawable drawable3, int i2) {
        return m25750q(bitmap, bitmap2, drawable, drawable2, drawable3, null, new Rect(0, 0, i2, i2));
    }
}
