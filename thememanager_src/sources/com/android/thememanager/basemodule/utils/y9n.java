package com.android.thememanager.basemodule.utils;

import a98o.C0005q;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.util.uc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public class y9n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile Boolean f57820f7l8 = null;

    /* JADX INFO: renamed from: k */
    public static final int f10444k = 23;

    /* JADX INFO: renamed from: n */
    public static final int f10445n = 2;

    /* JADX INFO: renamed from: p */
    public static final String f10446p = "com.miui.themestore";

    /* JADX INFO: renamed from: q */
    public static final int f10447q = 1;

    /* JADX INFO: renamed from: s */
    private static final boolean f10448s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57821toq = "Utils";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57822zy = 0;

    /* JADX INFO: renamed from: g */
    private static final Point[] f10443g = new Point[3];

    /* JADX INFO: renamed from: y */
    private static final Object f10449y = new Object();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.y9n$k */
    /* JADX INFO: compiled from: Utils.java */
    private static class C1832k implements Comparator<ResolveInfo> {

        /* JADX INFO: renamed from: k */
        private PackageManager f10450k;

        public C1832k(PackageManager pm) {
            this.f10450k = pm;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final int compare(ResolveInfo a2, ResolveInfo b2) {
            String str = a2.activityInfo.packageName;
            String str2 = b2.activityInfo.packageName;
            CharSequence charSequenceLoadLabel = a2.loadLabel(this.f10450k);
            CharSequence charSequenceLoadLabel2 = b2.loadLabel(this.f10450k);
            if (charSequenceLoadLabel == null) {
                charSequenceLoadLabel = a2.activityInfo.name;
            }
            if (charSequenceLoadLabel2 == null) {
                charSequenceLoadLabel2 = b2.activityInfo.name;
            }
            int iCompareTo = str.compareTo(str2);
            return iCompareTo == 0 ? charSequenceLoadLabel.toString().compareTo(charSequenceLoadLabel2.toString()) : iCompareTo;
        }
    }

    static {
        f10448s = !C1807g.m7081r() && miuix.os.f7l8.zy("ro.miui.notch", 0) == 1;
    }

    public static boolean a9() {
        return C1807g.zurt() && "cetus".equals(Build.DEVICE);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<ResolveInfo> m7244c(Intent targetIntent) {
        PackageManager packageManager = bf2.toq.toq().getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(targetIntent, 65536);
        if (listQueryIntentActivities.size() > 0) {
            Collections.sort(listQueryIntentActivities, new C1832k(packageManager));
        }
        return new ArrayList<>(listQueryIntentActivities);
    }

    public static int cdj(Context context) {
        if (!m7258z()) {
            return 0;
        }
        if (!C1819o.d3()) {
            return C1819o.zurt(context);
        }
        if (o1t.kja0()) {
            return C1819o.zurt(context);
        }
        return 0;
    }

    public static boolean d2ok() {
        try {
            return bf2.toq.toq().getPackageManager().getApplicationInfo(uc.f16819f, 128).metaData.getBoolean(InterfaceC1789q.x0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean d3(String path) {
        return path != null && path.length() >= 2 && C1788k.m6921k() && path.startsWith(C1788k.f10175k);
    }

    public static String dd(CharSequence delimiter, List tokens) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Object obj : tokens) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(delimiter);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static boolean eqxt(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7245f() {
        Arrays.fill(f10443g, (Object) null);
    }

    public static boolean f7l8(Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        try {
            dialog.dismiss();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point fn3e() {
        /*
            boolean r0 = com.android.thememanager.basemodule.utils.C1807g.zurt()
            if (r0 == 0) goto L11
            android.graphics.Point r0 = ld6()
            boolean r1 = m7254r(r0)
            if (r1 == 0) goto L11
            return r0
        L11:
            android.graphics.Point[] r0 = com.android.thememanager.basemodule.utils.y9n.f10443g
            r1 = 0
            r0 = r0[r1]
            boolean r2 = m7254r(r0)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            android.content.Context r2 = bf2.toq.toq()
            boolean r3 = m7258z()
            if (r3 == 0) goto L45
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Exception -> L3e
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Exception -> L3e
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Exception -> L3e
            android.graphics.Point r3 = new android.graphics.Point     // Catch: java.lang.Exception -> L3e
            r3.<init>()     // Catch: java.lang.Exception -> L3e
            r2.getRealSize(r3)     // Catch: java.lang.Exception -> L3c
            return r3
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r2 = move-exception
            r3 = r0
            r0 = r2
        L41:
            r0.printStackTrace()
            r0 = r3
        L45:
            boolean r2 = m7254r(r0)
            if (r2 == 0) goto L50
            android.graphics.Point[] r2 = com.android.thememanager.basemodule.utils.y9n.f10443g
            r2[r1] = r0
            return r0
        L50:
            android.graphics.Point r0 = zurt()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.utils.y9n.fn3e():android.graphics.Point");
    }

    public static boolean fti() {
        return !C1807g.m7081r() || lvui.fti(bf2.toq.toq());
    }

    public static int fu4() {
        return cdj.qrj();
    }

    /* JADX INFO: renamed from: g */
    public static void m7246g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean gvn7(String processName) {
        if (TextUtils.isEmpty(processName)) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) bf2.toq.toq().getSystemService(C1873k.f10652g)).getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            if (processName.equals(it.next().processName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static int m7247h() {
        return cdj(bf2.toq.toq());
    }

    public static Uri hyr(@zy.lvui Uri uri, @zy.lvui String query, @zy.lvui String newValue) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : queryParameterNames) {
            builderClearQuery.appendQueryParameter(str, str.equals(query) ? newValue : uri.getQueryParameter(str));
        }
        return builderClearQuery.build();
    }

    /* JADX INFO: renamed from: i */
    public static Point m7248i() {
        int physicalHeight;
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) bf2.toq.toq().getSystemService("window")).getDefaultDisplay();
        Display.Mode mode = defaultDisplay.getMode();
        int physicalWidth = -1;
        if (mode != null) {
            physicalWidth = mode.getPhysicalWidth();
            physicalHeight = mode.getPhysicalHeight();
        } else {
            physicalHeight = -1;
        }
        if (physicalWidth <= 0 || physicalHeight <= 0) {
            defaultDisplay.getRealSize(point);
        } else {
            point.x = physicalWidth;
            point.y = physicalHeight;
        }
        return point;
    }

    public static boolean jk() {
        return ((PowerManager) bf2.toq.toq().getSystemService("power")).isInteractive();
    }

    public static boolean jp0y() {
        return f10448s;
    }

    public static String ki(Context context, int pid) {
        if (toq(28)) {
            return Application.getProcessName();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C1873k.f10652g)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == pid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static String kja0(String url) {
        int iLastIndexOf = url.lastIndexOf(47);
        if (-1 != iLastIndexOf) {
            url = url.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = url.lastIndexOf(46);
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(-1 != iLastIndexOf2 ? url.substring(iLastIndexOf2 + 1) : "");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7250l() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static Point ld6() {
        Display display;
        Context qVar = bf2.toq.toq();
        if (!C1807g.zurt()) {
            return null;
        }
        if (a9()) {
            if (!C1807g.m7083t(qVar)) {
                return new Point(880, 2640);
            }
            if (C1819o.ncyb(qVar)) {
                new Point(2480, 1860);
            }
            return new Point(1860, 2480);
        }
        Point[] pointArr = f10443g;
        Point point = pointArr[0];
        if (m7254r(point)) {
            return point;
        }
        DisplayManager displayManager = (DisplayManager) qVar.getSystemService("display");
        Point point2 = new Point();
        Display[] displays = displayManager.getDisplays();
        if (displays != null && displays.length > 0 && (display = displays[0]) != null) {
            display.getRealSize(point2);
        }
        if (m7254r(point2)) {
            pointArr[0] = point2;
        }
        return point2;
    }

    public static void lrht(TextView tv, String text) {
        if (text == null) {
            tv.setText(text);
            return;
        }
        Matcher matcher = Pattern.compile("(http|ftp|https)://[a-zA-Z0-9-_]+(\\.[a-zA-Z0-9-_]+)+([a-zA-Z0-9-.,@?^=%&;:/~+#!]*[a-zA-Z0-9-@?^=%&;/~+#!])?").matcher(text);
        SpannableString spannableString = new SpannableString(text);
        int iEnd = 0;
        while (matcher.find()) {
            spannableString.setSpan(new URLSpan(matcher.group()), matcher.start(), matcher.end(), 17);
            spannableString.setSpan(new ForegroundColorSpan(tv.getCurrentTextColor()), iEnd, matcher.start(), 17);
            iEnd = matcher.end();
        }
        spannableString.setSpan(new ForegroundColorSpan(tv.getCurrentTextColor()), iEnd, text.length(), 17);
        tv.setText(spannableString);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean lvui() {
        return (C1807g.zurt() && o1t.cdj()) || ni7();
    }

    public static boolean mcp(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7251n(int apiLevel) {
        return Build.VERSION.SDK_INT <= apiLevel;
    }

    private static void n5r1(boolean isNeedLargeScreenSize, Point screenPoint) {
        if (isNeedLargeScreenSize) {
            f10443g[2] = screenPoint;
        } else {
            f10443g[1] = screenPoint;
        }
    }

    public static Point n7h(boolean z2) {
        if (!C1807g.zurt()) {
            return null;
        }
        Context qVar = bf2.toq.toq();
        if (a9()) {
            if (!z2) {
                return new Point(880, 2640);
            }
            if (C1819o.ncyb(qVar)) {
                new Point(2480, 1860);
            }
            return new Point(1860, 2480);
        }
        Point pointM7252p = m7252p(z2);
        if (pointM7252p != null) {
            return pointM7252p;
        }
        Point point = new Point();
        boolean zM7083t = C1807g.m7083t(qVar);
        DisplayManager displayManager = (DisplayManager) qVar.getSystemService("display");
        Display[] displays = toq(33) ? displayManager.getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED") : displayManager.getDisplays();
        if (displays == null || displays.length != 2) {
            return fn3e();
        }
        if (zM7083t) {
            Display display = displays[!z2 ? 1 : 0];
            if (display != null) {
                display.getRealSize(point);
            }
        } else {
            Display display2 = displays[z2 ? 1 : 0];
            if (display2 != null) {
                display2.getRealSize(point);
            }
            Log.i(f57821toq, "get Fold small Screen PhysicalSize: " + point);
        }
        if (!m7254r(point)) {
            return fn3e();
        }
        n5r1(z2, point);
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ncyb(View view, int i2, int i3) {
        if ((i3 & 4) == 0) {
            view.setSystemUiVisibility(i2);
        }
    }

    private static boolean ni7() {
        try {
            return bf2.toq.toq().getPackageManager().getApplicationInfo("com.miui.miwallpaper", 128).metaData.getBoolean(InterfaceC1789q.usxh);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void o1t(Activity activity) {
        if (m7258z()) {
            C1819o.hb(activity, 0);
            final View decorView = activity.getWindow().getDecorView();
            final int i2 = 4871;
            decorView.setSystemUiVisibility(4871);
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.android.thememanager.basemodule.utils.yz
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i3) {
                    y9n.ncyb(decorView, i2, i3);
                }
            });
        }
    }

    public static boolean oc(Context context, Class<?> service) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService(C1873k.f10652g)).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (service.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private static Point m7252p(boolean isNeedLargeScreenSize) {
        return isNeedLargeScreenSize ? f10443g[2] : f10443g[1];
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7253q() {
        return Build.VERSION.SDK_INT > 34 || "VanillaIceCream".equals(Build.VERSION.CODENAME);
    }

    public static String qrj() {
        return C1807g.m7082s();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m7254r(Point point) {
        return point != null && point.x > 0 && point.y > 0;
    }

    /* JADX INFO: renamed from: s */
    public static void m7255s() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("You must call this method in Main-UI thread");
        Log.e(f57821toq, "You must call this method in Main-UI thread", illegalStateException);
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m7256t() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100;
    }

    @zy.lvui
    public static String t8r() {
        String absolutePath;
        Context qVar = bf2.toq.toq();
        File externalFilesDir = qVar.getExternalFilesDir("MIUI");
        if (externalFilesDir == null) {
            Log.w(f57821toq, "getExDir null..");
            absolutePath = "/sdcard/Android/data/" + qVar.getPackageName() + "/files/MIUI/";
        } else {
            Log.i(f57821toq, "getExDir. " + externalFilesDir.getAbsolutePath());
            absolutePath = externalFilesDir.getAbsolutePath();
        }
        C1821p.m7190s(absolutePath);
        if (absolutePath.charAt(absolutePath.length() - 1) == File.separatorChar) {
            return absolutePath;
        }
        return absolutePath + File.separator;
    }

    public static boolean toq(int apiLevel) {
        return Build.VERSION.SDK_INT >= apiLevel;
    }

    public static List<String> uv6(String delimiter, String tokens) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(tokens)) {
            String[] strArrSplit = tokens.split(delimiter);
            for (String str : strArrSplit) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static boolean vyq() {
        return miuix.os.f7l8.toq("ro.miui.support.system.app.uninstall.v2", false);
    }

    public static boolean wvg(List a2, List b2) {
        if (a2 == null || b2 == null) {
            return false;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            if (b2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static Pair<ArrayList<C0005q<String, String>>, Integer> x2(int position, List<UIProduct> uiProductList) {
        ArrayList arrayList = new ArrayList();
        if (uiProductList == null) {
            Log.e(f57821toq, "getDetailIds: uiProductList is null!");
            return new Pair<>(arrayList, 0);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < uiProductList.size(); i3++) {
            UIProduct uIProduct = uiProductList.get(i3);
            if (uIProduct != null) {
                arrayList.add(new C0005q(uIProduct.uuid, uIProduct.trackId));
            } else if (i3 <= position) {
                i2++;
            }
        }
        return new Pair<>(arrayList, Integer.valueOf(Math.max(position - i2, 0)));
    }

    public static void x9kr(String reason) {
        Log.w(f57821toq, "kill self, reason :" + reason);
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: y */
    public static void m7257y() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("calling this from your main thread can lead to ANRs");
        Log.e(f57821toq, "calling this from your main thread can lead to ANRs", illegalStateException);
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m7258z() {
        if (f57820f7l8 == null) {
            synchronized (f10449y) {
                if (f57820f7l8 == null) {
                    Boolean bool = Boolean.TRUE;
                    f57820f7l8 = bool;
                    if (f57820f7l8 == null) {
                        Resources resources = bf2.toq.toq().getResources();
                        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
                        if (identifier <= 0 || !resources.getBoolean(identifier)) {
                            f57820f7l8 = Boolean.FALSE;
                        } else {
                            f57820f7l8 = bool;
                        }
                    }
                }
            }
        }
        return f57820f7l8.booleanValue();
    }

    public static Point zurt() {
        Point point = new Point();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        point.x = i2;
        int i3 = displayMetrics.heightPixels;
        point.y = i3;
        if (i2 <= 0 || i3 <= 0) {
            try {
                ((WindowManager) bf2.toq.toq().getSystemService("window")).getDefaultDisplay().getSize(point);
            } catch (Exception unused) {
            }
        }
        return point;
    }

    public static boolean zy() {
        return Build.VERSION.SDK_INT > 33 || "UpsideDownCake".equals(Build.VERSION.CODENAME);
    }
}
