package com.android.thememanager.basemodule.utils;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import androidx.appcompat.app.ActivityC0097n;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.gc3c;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import miui.theme.ThemeFileUtils;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.ki;
import miuix.view.InterfaceC7387s;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.o */
/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1819o {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f57787f7l8 = 8;

    /* JADX INFO: renamed from: g */
    public static final int f10370g = 4;

    /* JADX INFO: renamed from: k */
    private static final String f10371k = "UIUtils";

    /* JADX INFO: renamed from: n */
    private static Random f10372n = null;

    /* JADX INFO: renamed from: q */
    private static float f10373q = -1.0f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f57788toq = -1;

    /* JADX INFO: renamed from: y */
    private static long f10374y = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f57789zy = -1;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.o$k */
    /* JADX INFO: compiled from: UIUtils.java */
    class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f10375k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f10376n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f10377q;

        k(final Activity val$activity, final View val$rootView, final int val$bottomPadding) {
            this.f10375k = val$activity;
            this.f10377q = val$rootView;
            this.f10376n = val$bottomPadding;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View decorView = this.f10375k.getWindow().getDecorView();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            if (C1819o.mcp(this.f10375k) - rect.bottom > this.f10375k.getResources().getDimensionPixelOffset(R.dimen.soft_keyboard_min_height)) {
                this.f10377q.setPadding(0, 0, 0, this.f10376n);
            } else {
                this.f10377q.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.o$toq */
    /* JADX INFO: compiled from: UIUtils.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f10378k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ViewGroup f10379n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Activity f10380q;

        toq(final View val$decorView, final Activity val$context, final ViewGroup val$view) {
            this.f10378k = val$decorView;
            this.f10380q = val$context;
            this.f10379n = val$view;
        }

        @Override // java.lang.Runnable
        public void run() {
            DisplayCutout displayCutout;
            List<Rect> boundingRects;
            WindowInsets rootWindowInsets = this.f10378k.getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() == 0) {
                return;
            }
            boolean z2 = true;
            if (Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "force_black", 0) != 1 && Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "force_black_v2", 0) != 1) {
                z2 = false;
            }
            for (Rect rect : boundingRects) {
                if (z2 || ((rect.right == this.f10378k.getRight() && !this.f10380q.getResources().getConfiguration().locale.getLanguage().equals("ug")) || (this.f10380q.getResources().getConfiguration().locale.getLanguage().equals("ug") && rect.left == this.f10378k.getLeft()))) {
                    if (this.f10379n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10379n.getLayoutParams();
                        marginLayoutParams.setMargins(0, displayCutout.getSafeInsetTop() + 15, 0, 0);
                        this.f10379n.setLayoutParams(marginLayoutParams);
                        this.f10379n.requestLayout();
                        return;
                    }
                }
            }
        }
    }

    public static Point a9(Activity activity) {
        Point point = new Point();
        point.x = fti(activity);
        point.y = y9n.fn3e().y;
        return point;
    }

    /* JADX INFO: renamed from: c */
    public static void m7151c(Activity activity) {
        Intent intent = activity.getIntent();
        if (activity.isInMultiWindowMode() && (intent.getFlags() & 268435456) == 0) {
            intent.removeFlags(536870912);
            intent.addFlags(268435456);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public static int cdj(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.miuix_appcompat_action_bar_default_height);
    }

    public static boolean d2ok(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean d3() {
        return Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    public static boolean dd(Activity activity) {
        if (activity != null) {
            return activity.isInMultiWindowMode();
        }
        Log.e(f10371k, "isInMultiWindowMode: activity is null!");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m7152e(Activity activity, String title) {
        ActionBar actionBar;
        if (activity instanceof AbstractActivityC1717k) {
            ((AbstractActivityC1717k) activity).mo6478v(title);
            return;
        }
        if (activity instanceof miuix.appcompat.app.t8r) {
            AbstractC6946k appCompatActionBar = ((miuix.appcompat.app.t8r) activity).getAppCompatActionBar();
            if (appCompatActionBar != null) {
                appCompatActionBar.mo173v(title);
                return;
            }
            return;
        }
        if (activity instanceof ActivityC0097n) {
            AbstractC0096k abstractC0096kNn86 = ((ActivityC0097n) activity).nn86();
            if (abstractC0096kNn86 != null) {
                abstractC0096kNn86.mo173v(title);
                return;
            }
            return;
        }
        if (activity == null || (actionBar = activity.getActionBar()) == null) {
            return;
        }
        actionBar.setTitle(title);
    }

    public static boolean eqxt(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7153f() {
        return o1t.x2() && !o1t.m7178y();
    }

    public static void f7l8(Bitmap bitmap, int dpi) {
        if (dpi != bitmap.getDensity()) {
            bitmap.setDensity(dpi);
        }
    }

    public static int fn3e(String resCode, Context context) {
        int i2 = (("theme".equals(resCode) || "icons".equals(resCode)) && !ncyb(context)) ? 2 : 3;
        return (C1807g.lvui() && "icons".equals(resCode)) ? i2 + 1 : i2;
    }

    public static int fti(Activity activity) {
        if (!eqxt(activity) || activity.getWindow() == null) {
            return -1;
        }
        int i2 = activity.getWindow().getAttributes().width;
        if (i2 < 0 && C1807g.m7081r()) {
            i2 = y9n.fn3e().x;
        }
        Log.d(f10371k, "getScreenWindowWidth: " + i2);
        return i2;
    }

    public static int fu4(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7154g(Activity activity, boolean statusBarDarkColor) {
        if (!gc3c.cdj(activity)) {
            return false;
        }
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        activity.getWindow().getDecorView().setSystemUiVisibility(statusBarDarkColor ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        Log.i(f10371k, "changeStatusBarColor: " + statusBarDarkColor);
        return true;
    }

    public static int gvn7(Resources resources) {
        return m7156i(resources, "status_bar_height", "dimen", "android");
    }

    /* JADX INFO: renamed from: h */
    public static int m7155h(Resources resources) {
        return gvn7(resources) + cdj(resources);
    }

    public static void hb(Context context, int colorInt) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            try {
                window.getClass().getMethod("setNavigationBarColor", Integer.TYPE).invoke(window, Integer.valueOf(colorInt));
            } catch (Exception e2) {
                Log.e(f10371k, "Reflection calls setNavigationBarColor() method exception : " + e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void hyr(miuix.appcompat.app.t8r t8rVar, DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.f4f));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(C1803e.m7039p("com.miui.gallery", true));
        try {
            t8rVar.startActivity(intent);
        } catch (Exception unused) {
            C2789j.x2(C2755a.f16307g, "showWarningNoGalleryDialog error.", new Object[0]);
            intent.setData(C1803e.m7039p("com.miui.gallery", false));
            try {
                t8rVar.startActivity(intent);
            } catch (Exception e2) {
                C2789j.x2(C2755a.f16307g, "showWarningNoGalleryDialog cannot open market.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static int m7156i(Resources resources, String name, String defType, String defPackage) {
        int identifier = resources.getIdentifier(name, defType, defPackage);
        if (identifier > 0) {
            return resources.getDimensionPixelOffset(identifier);
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static void m7157j(@zy.lvui InterfaceC7387s actionMode, boolean isSelectedAll, Context context) {
        if (o1t.f10386q) {
            actionMode.cdj(16908314, "", !isSelectedAll ? R.drawable.action_select_all : R.drawable.action_deselect_all);
        } else {
            actionMode.ki(16908314, !isSelectedAll ? R.string.miuix_appcompat_select_all : R.string.miuix_appcompat_deselect_all);
        }
    }

    public static int jk(Context context) {
        if (f57789zy == -1) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            int width = windowManager.getDefaultDisplay().getWidth();
            int height = windowManager.getDefaultDisplay().getHeight();
            if (C1807g.dd()) {
                width = Math.min(width, height);
            }
            f57789zy = width;
            Log.i(f10371k, "getScreenWidth: " + f57789zy);
        }
        return f57789zy;
    }

    public static int jp0y() {
        boolean zD2ok = d2ok(bf2.toq.toq());
        return o1t.n7h() ? zD2ok ? R.drawable.miuix_appcompat_action_button_search_dark : R.drawable.miuix_appcompat_action_button_search_light : zD2ok ? R.drawable.icon_search_dark : R.drawable.resource_icon_search_light;
    }

    public static Activity ki(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            do {
                baseContext = ((ContextWrapper) context).getBaseContext();
            } while (!(baseContext instanceof Activity));
            return (Activity) baseContext;
        }
        C7794k.f7l8("context is " + context);
        return null;
    }

    @TargetApi(28)
    public static void kja0(Activity context, ViewGroup view) {
        if (context == null || view == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        View decorView = context.getWindow().getDecorView();
        decorView.post(new toq(decorView, context, view));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7159l() {
        return !(C1724k.m6723p().x2() != null && !C1724k.m6723p().x2().research_aod_display) && o1t.x2();
    }

    public static Bitmap ld6(View v2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(v2.getResources().getDisplayMetrics(), v2.getWidth(), v2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = v2.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        v2.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static boolean lrht(String src, String dest) {
        ThemeFileUtils.remove(dest);
        File file = new File(src);
        return file.exists() && file.renameTo(new File(dest));
    }

    public static boolean lvui() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - f10374y;
        f10374y = jCurrentTimeMillis;
        return j2 > 0 && j2 < 500;
    }

    public static int mcp(Context context) {
        if (f57788toq == -1) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay != null) {
                defaultDisplay.getRealSize(point);
                f57788toq = point.y;
            }
        }
        return f57788toq;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7160n(Intent intent) {
        return cdj.ld6(intent, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n5r1(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.a46k));
        dialogInterface.dismiss();
    }

    public static void n7h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public static boolean ncyb(@zy.lvui Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static int ni7() {
        if (!y9n.jp0y()) {
            return 0;
        }
        Resources resources = bf2.toq.toq().getResources();
        int identifier = resources.getIdentifier("notch_height", "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : resources.getDimensionPixelSize(R.dimen.notch_height_default);
    }

    public static void nn86(Activity activity) {
        if (y9n.a9()) {
            activity.setRequestedOrientation(1);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7161o(@zy.lvui TextView textView, @zy.lvui boolean isBold) {
        textView.getPaint().setFakeBoldText(isBold);
    }

    public static Point o1t(Activity activity) {
        int iHeight;
        WindowMetrics currentWindowMetrics;
        int iWidth = -1;
        if (!eqxt(activity) || activity.getWindow() == null) {
            return new Point(-1, -1);
        }
        if (Build.VERSION.SDK_INT < 30 || (currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics()) == null) {
            iHeight = -1;
        } else {
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        }
        if (iWidth < 0 || iHeight < 0) {
            Log.w(f10371k, "getRelativeScreenWindowPoint\u3000width: " + iWidth + " height: " + iHeight);
        }
        return (iWidth < 0 || iHeight < 0) ? y9n.fn3e() : new Point(iWidth, iHeight);
    }

    public static boolean oc() {
        return d3() && Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "hide_gesture_line", 0) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static String m7162p(String str, String placeHolder) {
        if (placeHolder == null || placeHolder.equals(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static void m7163q(View view, View rootView, Activity activity, int bottomPadding) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new k(activity, rootView, bottomPadding));
    }

    public static int qrj(float dp) {
        if (f10373q <= 0.0f) {
            f10373q = bf2.toq.toq().getResources().getDisplayMetrics().density;
        }
        return (int) ((f10373q * dp) + 0.5f);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m7164r(Context context) {
        if (!C1807g.lvui()) {
            return false;
        }
        if (context == null) {
            try {
                context = bf2.toq.toq();
            } catch (Exception e2) {
                Log.e(f10371k, "Failed to read isInDktMode ", e2);
                return false;
            }
        }
        int i2 = Settings.System.getInt(context.getContentResolver(), "miui_dkt_mode");
        Log.i(f10371k, "isInDktMode: " + i2);
        return i2 != 0;
    }

    /* JADX INFO: renamed from: s */
    public static String m7165s(String str, String placeHolder) {
        return str == null ? placeHolder : str;
    }

    @zy.lvui
    /* JADX INFO: renamed from: t */
    public static Drawable m7166t(@zy.x2 int color, float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius);
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    public static int t8r() {
        if (f10372n == null) {
            f10372n = new Random();
        }
        return f10372n.nextInt(7);
    }

    public static void uv6() {
        f57788toq = -1;
        f57789zy = -1;
        f10373q = -1.0f;
    }

    public static void vyq(Activity activity) {
        if (C1807g.lvui() && m7164r(activity)) {
            return;
        }
        m7151c(activity);
    }

    public static int wvg(Activity activity, boolean min) {
        int iHeight;
        WindowMetrics currentWindowMetrics;
        int iWidth = -1;
        if (!eqxt(activity) || activity.getWindow() == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 30 || (currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics()) == null) {
            iHeight = -1;
        } else {
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        }
        if (C1807g.m7081r()) {
            if (iWidth < 0) {
                iWidth = y9n.fn3e().x;
            }
            if (iHeight < 0) {
                iHeight = y9n.fn3e().y;
            }
        }
        int iMin = min ? Math.min(iWidth, iHeight) : Math.max(iWidth, iHeight);
        Log.d(f10371k, "getRelativeScreenWindowWidth: " + iMin);
        return iMin;
    }

    public static miuix.appcompat.app.ki x2(final miuix.appcompat.app.t8r activity) {
        return new ki.C6947k(activity).lrht(R.string.install_gallery_title).fu4(R.string.install_gallery_content).m25047s(false).mcp(android.R.string.no, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.hb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1819o.n5r1(dialogInterface, i2);
            }
        }).dd(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1819o.hyr(activity, dialogInterface, i2);
            }
        }).m25037g();
    }

    public static boolean x9kr() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX INFO: renamed from: y */
    public static void m7167y(Bitmap bitmap, Context context) {
        if (bitmap == null || context == null) {
            return;
        }
        if (context == bf2.toq.toq()) {
            C7794k.f7l8("context should not application ." + context);
        }
        f7l8(bitmap, context.getResources().getDisplayMetrics().densityDpi);
    }

    /* JADX INFO: renamed from: z */
    public static String m7168z() {
        return bf2.toq.toq().getResources().getString(TextUtils.isEmpty(vyq.ni7("icons")) ^ true ? R.string.large_icon_theme : R.string.large_icon_official);
    }

    public static int zurt(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void zy(Context context, @zy.lvui View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + fu4(context), view.getPaddingRight(), view.getPaddingBottom());
    }
}
