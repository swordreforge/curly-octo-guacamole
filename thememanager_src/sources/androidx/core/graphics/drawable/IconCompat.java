package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0498q;
import androidx.core.content.res.C0506s;
import androidx.core.util.C0642s;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.thememanager.clockmessage.model.C1873k;
import com.google.android.exoplayer2.C3548p;
import com.miui.maml.folme.AnimatedProperty;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import zy.InterfaceC7830i;
import zy.InterfaceC7843t;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    @yz
    static final String f50426a9 = "tint_mode";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50427cdj = 5;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final float f50428fn3e = 0.9166667f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    @yz
    static final String f50429fti = "string1";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f50430fu4 = 61;

    /* JADX INFO: renamed from: h */
    public static final int f3528h = 4;

    /* JADX INFO: renamed from: i */
    private static final float f3529i = 0.6666667f;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @yz
    static final String f50431jk = "tint_list";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    static final PorterDuff.Mode f50432jp0y = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50433ki = 6;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50434kja0 = 3;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50435ld6 = "IconCompat";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @yz
    static final String f50436mcp = "int2";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50437n7h = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final float f50438ni7 = 0.020833334f;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    @yz
    static final String f50439o1t = "type";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50440qrj = 1;

    /* JADX INFO: renamed from: t */
    @yz
    static final String f3530t = "int1";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f50441t8r = 0.25f;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @yz
    static final String f50442wvg = "obj";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50443x2 = -1;

    /* JADX INFO: renamed from: z */
    private static final int f3531z = 30;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final float f50444zurt = 0.010416667f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public ColorStateList f50445f7l8;

    /* JADX INFO: renamed from: g */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f3532g;

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int f3533k;

    /* JADX INFO: renamed from: n */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public int f3534n;

    /* JADX INFO: renamed from: p */
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public String f3535p;

    /* JADX INFO: renamed from: q */
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public Parcelable f3536q;

    /* JADX INFO: renamed from: s */
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public String f3537s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Object f50446toq;

    /* JADX INFO: renamed from: y */
    PorterDuff.Mode f3538y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public byte[] f50447zy;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$k */
    @hyr(23)
    static class C0516k {
        private C0516k() {
        }

        @InterfaceC7830i
        static Drawable f7l8(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @InterfaceC7830i
        @dd
        /* JADX INFO: renamed from: g */
        static Uri m2406g(@lvui Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zy.m2414q(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon uri", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon uri", e4);
                return null;
            }
        }

        @dd
        /* JADX INFO: renamed from: k */
        static IconCompat m2407k(@lvui Context context, @lvui Icon icon) {
            int iM2408n = m2408n(icon);
            if (iM2408n == 2) {
                String strM2409q = m2409q(icon);
                try {
                    return IconCompat.ni7(IconCompat.wvg(context, strM2409q), strM2409q, zy(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iM2408n == 4) {
                return IconCompat.t8r(m2406g(icon));
            }
            if (iM2408n == 6) {
                return IconCompat.m2398h(m2406g(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f50446toq = icon;
            return iconCompat;
        }

        /* JADX INFO: renamed from: n */
        static int m2408n(@lvui Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zy.zy(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon type " + obj, e2);
                return -1;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon type " + obj, e3);
                return -1;
            } catch (InvocationTargetException e4) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon type " + obj, e4);
                return -1;
            }
        }

        @dd
        /* JADX INFO: renamed from: q */
        static String m2409q(@lvui Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zy.toq(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon package", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon package", e4);
                return null;
            }
        }

        static IconCompat toq(@lvui Object obj) {
            androidx.core.util.n7h.x2(obj);
            int iM2408n = m2408n(obj);
            if (iM2408n == 2) {
                return IconCompat.ni7(null, m2409q(obj), zy(obj));
            }
            if (iM2408n == 4) {
                return IconCompat.t8r(m2406g(obj));
            }
            if (iM2408n == 6) {
                return IconCompat.m2398h(m2406g(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f50446toq = obj;
            return iconCompat;
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static Icon m2410y(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f3533k) {
                case -1:
                    return (Icon) iconCompat.f50446toq;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f50446toq);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.o1t(), iconCompat.f3534n);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f50446toq, iconCompat.f3534n, iconCompat.f3532g);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f50446toq);
                    break;
                case 5:
                    iconCreateWithBitmap = toq.toq((Bitmap) iconCompat.f50446toq);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = C0518q.m2411k(iconCompat.mcp());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.mcp());
                        }
                        InputStream inputStreamJk = iconCompat.jk(context);
                        if (inputStreamJk == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.mcp());
                        }
                        iconCreateWithBitmap = toq.toq(BitmapFactory.decodeStream(inputStreamJk));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f50445f7l8;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3538y;
            if (mode != IconCompat.f50432jp0y) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        @InterfaceC7843t
        @fn3e
        static int zy(@lvui Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zy.m2413k(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon resource", e3);
                return 0;
            } catch (InvocationTargetException e4) {
                Log.e(IconCompat.f50435ld6, "Unable to get icon resource", e4);
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$n */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public @interface InterfaceC0517n {
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$q */
    @hyr(30)
    static class C0518q {
        private C0518q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Icon m2411k(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @hyr(26)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Drawable m2412k(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @InterfaceC7830i
        static Icon toq(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @hyr(28)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2413k(Object obj) {
            return ((Icon) obj).getResId();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static Uri m2414q(Object obj) {
            return ((Icon) obj).getUri();
        }

        @InterfaceC7830i
        static String toq(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @InterfaceC7830i
        static int zy(Object obj) {
            return ((Icon) obj).getType();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public IconCompat() {
        this.f3533k = -1;
        this.f50447zy = null;
        this.f3536q = null;
        this.f3534n = 0;
        this.f3532g = 0;
        this.f50445f7l8 = null;
        this.f3538y = f50432jp0y;
        this.f3537s = null;
    }

    @lvui
    public static IconCompat cdj(@lvui String str) {
        C0642s.m2987q(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f50446toq = str;
        return iconCompat;
    }

    @hyr(23)
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static IconCompat f7l8(@lvui Icon icon) {
        return C0516k.toq(icon);
    }

    @lvui
    public static IconCompat fn3e(@lvui byte[] bArr, int i2, int i3) {
        C0642s.m2987q(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f50446toq = bArr;
        iconCompat.f3534n = i2;
        iconCompat.f3532g = i3;
        return iconCompat;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable fti(Context context) {
        switch (this.f3533k) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f50446toq);
            case 2:
                String strO1t = o1t();
                if (TextUtils.isEmpty(strO1t)) {
                    strO1t = context.getPackageName();
                }
                try {
                    return C0506s.f7l8(wvg(context, strO1t), this.f3534n, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e(f50435ld6, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f3534n), this.f50446toq), e2);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f50446toq, this.f3534n, this.f3532g));
            case 4:
                InputStream inputStreamJk = jk(context);
                if (inputStreamJk != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamJk));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), n7h((Bitmap) this.f50446toq, false));
            case 6:
                InputStream inputStreamJk2 = jk(context);
                if (inputStreamJk2 != null) {
                    return toq.m2412k(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamJk2)));
                }
                return null;
            default:
                return null;
        }
    }

    @hyr(23)
    @dd
    /* JADX INFO: renamed from: g */
    public static IconCompat m2397g(@lvui Context context, @lvui Icon icon) {
        androidx.core.util.n7h.x2(icon);
        return C0516k.m2407k(context, icon);
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public static IconCompat m2398h(@lvui Uri uri) {
        C0642s.m2987q(uri);
        return cdj(uri.toString());
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public static IconCompat m2399i(@lvui String str) {
        C0642s.m2987q(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f50446toq = str;
        return iconCompat;
    }

    @lvui
    public static IconCompat ki(@lvui Bitmap bitmap) {
        C0642s.m2987q(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f50446toq = bitmap;
        return iconCompat;
    }

    @lvui
    public static IconCompat kja0(@lvui Bitmap bitmap) {
        C0642s.m2987q(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f50446toq = bitmap;
        return iconCompat;
    }

    private static String lvui(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static IconCompat m2400n(@lvui Bundle bundle) {
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.f3534n = bundle.getInt(f3530t);
        iconCompat.f3532g = bundle.getInt(f50436mcp);
        iconCompat.f3535p = bundle.getString(f50429fti);
        if (bundle.containsKey(f50431jk)) {
            iconCompat.f50445f7l8 = (ColorStateList) bundle.getParcelable(f50431jk);
        }
        if (bundle.containsKey(f50426a9)) {
            iconCompat.f3538y = PorterDuff.Mode.valueOf(bundle.getString(f50426a9));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                iconCompat.f50446toq = bundle.getParcelable(f50442wvg);
                return iconCompat;
            case 0:
            default:
                Log.w(f50435ld6, "Unknown type " + i2);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f50446toq = bundle.getString(f50442wvg);
                return iconCompat;
            case 3:
                iconCompat.f50446toq = bundle.getByteArray(f50442wvg);
                return iconCompat;
        }
    }

    @yz
    static Bitmap n7h(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * f3529i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = f50428fn3e * f3;
        if (z2) {
            float f5 = f50444zurt * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * f50438ni7, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static IconCompat ni7(@dd Resources resources, @lvui String str, @fn3e int i2) {
        C0642s.m2987q(str);
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3534n = i2;
        if (resources != null) {
            try {
                iconCompat.f50446toq = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f50446toq = str;
        }
        iconCompat.f3535p = str;
        return iconCompat;
    }

    @lvui
    public static IconCompat t8r(@lvui Uri uri) {
        C0642s.m2987q(uri);
        return m2399i(uri.toString());
    }

    static Resources wvg(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(f50435ld6, String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    @hyr(23)
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: y */
    public static IconCompat m2401y(@lvui Icon icon) {
        if (C0516k.m2408n(icon) == 2 && C0516k.zy(icon) == 0) {
            return null;
        }
        return C0516k.toq(icon);
    }

    @lvui
    public static IconCompat zurt(@lvui Context context, @fn3e int i2) {
        C0642s.m2987q(context);
        return ni7(context.getResources(), context.getPackageName(), i2);
    }

    @dd
    public Drawable a9(@lvui Context context) {
        m2403q(context);
        return C0516k.f7l8(d2ok(context), context);
    }

    @hyr(23)
    @lvui
    public Icon d2ok(@dd Context context) {
        return C0516k.m2410y(this, context);
    }

    @lvui
    public IconCompat d3(@dd PorterDuff.Mode mode) {
        this.f3538y = mode;
        return this;
    }

    @hyr(23)
    @lvui
    @Deprecated
    public Icon eqxt() {
        return d2ok(null);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public Bitmap fu4() {
        int i2 = this.f3533k;
        if (i2 == -1) {
            Object obj = this.f50446toq;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.f50446toq;
        }
        if (i2 == 5) {
            return n7h((Bitmap) this.f50446toq, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @lvui
    public IconCompat gvn7(@dd ColorStateList colorStateList) {
        this.f50445f7l8 = colorStateList;
        return this;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public InputStream jk(@lvui Context context) {
        Uri uriMcp = mcp();
        String scheme = uriMcp.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriMcp);
            } catch (Exception e2) {
                Log.w(f50435ld6, "Unable to load image from URI: " + uriMcp, e2);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f50446toq));
        } catch (FileNotFoundException e3) {
            Log.w(f50435ld6, "Unable to load image from path: " + uriMcp, e3);
            return null;
        }
    }

    @lvui
    public IconCompat jp0y(@zy.x2 int i2) {
        return gvn7(ColorStateList.valueOf(i2));
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* JADX INFO: renamed from: k */
    public void mo2402k() {
        this.f3538y = PorterDuff.Mode.valueOf(this.f3537s);
        switch (this.f3533k) {
            case -1:
                Parcelable parcelable = this.f3536q;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f50446toq = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3536q;
                if (parcelable2 != null) {
                    this.f50446toq = parcelable2;
                    return;
                }
                byte[] bArr = this.f50447zy;
                this.f50446toq = bArr;
                this.f3533k = 3;
                this.f3534n = 0;
                this.f3532g = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f50447zy, Charset.forName(C3548p.f21093h));
                this.f50446toq = str;
                if (this.f3533k == 2 && this.f3535p == null) {
                    this.f3535p = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f50446toq = this.f50447zy;
                return;
        }
    }

    @lvui
    public Uri mcp() {
        int i2 = this.f3533k;
        if (i2 == -1) {
            return C0516k.m2406g(this.f50446toq);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f50446toq);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @lvui
    public String o1t() {
        int i2 = this.f3533k;
        if (i2 == -1) {
            return C0516k.m2409q(this.f50446toq);
        }
        if (i2 == 2) {
            String str = this.f3535p;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f50446toq).split(":", -1)[0] : this.f3535p;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    @lvui
    public Bundle oc() {
        Bundle bundle = new Bundle();
        switch (this.f3533k) {
            case -1:
                bundle.putParcelable(f50442wvg, (Parcelable) this.f50446toq);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(f50442wvg, (Bitmap) this.f50446toq);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f50442wvg, (String) this.f50446toq);
                break;
            case 3:
                bundle.putByteArray(f50442wvg, (byte[]) this.f50446toq);
                break;
        }
        bundle.putInt("type", this.f3533k);
        bundle.putInt(f3530t, this.f3534n);
        bundle.putInt(f50436mcp, this.f3532g);
        bundle.putString(f50429fti, this.f3535p);
        ColorStateList colorStateList = this.f50445f7l8;
        if (colorStateList != null) {
            bundle.putParcelable(f50431jk, colorStateList);
        }
        PorterDuff.Mode mode = this.f3538y;
        if (mode != f50432jp0y) {
            bundle.putString(f50426a9, mode.name());
        }
        return bundle;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public void m2403q(@lvui Context context) {
        Object obj;
        if (this.f3533k != 2 || (obj = this.f50446toq) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f50435ld6, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strO1t = o1t();
            int identifier = wvg(context, strO1t).getIdentifier(str4, str3, str5);
            if (this.f3534n != identifier) {
                Log.i(f50435ld6, "Id has changed for " + strO1t + " " + str);
                this.f3534n = identifier;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public int m2404t() {
        int i2 = this.f3533k;
        return i2 == -1 ? C0516k.m2408n(this.f50446toq) : i2;
    }

    @lvui
    public String toString() {
        if (this.f3533k == -1) {
            return String.valueOf(this.f50446toq);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(lvui(this.f3533k));
        switch (this.f3533k) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f50446toq).getWidth());
                sb.append(AnimatedProperty.PROPERTY_NAME_X);
                sb.append(((Bitmap) this.f50446toq).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3535p);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m2405z())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3534n);
                if (this.f3532g != 0) {
                    sb.append(" off=");
                    sb.append(this.f3532g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f50446toq);
                break;
        }
        if (this.f50445f7l8 != null) {
            sb.append(" tint=");
            sb.append(this.f50445f7l8);
        }
        if (this.f3538y != f50432jp0y) {
            sb.append(" mode=");
            sb.append(this.f3538y);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void toq(boolean z2) {
        this.f3537s = this.f3538y.name();
        switch (this.f3533k) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f3536q = (Parcelable) this.f50446toq;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z2) {
                    this.f3536q = (Parcelable) this.f50446toq;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f50446toq;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f50447zy = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f50447zy = ((String) this.f50446toq).getBytes(Charset.forName(C3548p.f21093h));
                return;
            case 3:
                this.f50447zy = (byte[]) this.f50446toq;
                return;
            case 4:
            case 6:
                this.f50447zy = this.f50446toq.toString().getBytes(Charset.forName(C3548p.f21093h));
                return;
        }
    }

    @fn3e
    /* JADX INFO: renamed from: z */
    public int m2405z() {
        int i2 = this.f3533k;
        if (i2 == -1) {
            return C0516k.zy(this.f50446toq);
        }
        if (i2 == 2) {
            return this.f3534n;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void zy(@lvui Intent intent, @dd Drawable drawable, @lvui Context context) {
        Bitmap bitmapCopy;
        m2403q(context);
        int i2 = this.f3533k;
        if (i2 == 1) {
            bitmapCopy = (Bitmap) this.f50446toq;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i2 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(o1t(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f3534n));
                    return;
                }
                Drawable drawableM2259s = C0498q.m2259s(contextCreatePackageContext, this.f3534n);
                if (drawableM2259s.getIntrinsicWidth() <= 0 || drawableM2259s.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(C1873k.f10652g)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM2259s.getIntrinsicWidth(), drawableM2259s.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM2259s.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM2259s.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException("Can't find package " + this.f50446toq, e2);
            }
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = n7h((Bitmap) this.f50446toq, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    IconCompat(int i2) {
        this.f50447zy = null;
        this.f3536q = null;
        this.f3534n = 0;
        this.f3532g = 0;
        this.f50445f7l8 = null;
        this.f3538y = f50432jp0y;
        this.f3537s = null;
        this.f3533k = i2;
    }
}
