package miuix.device;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.PathClassLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: miuix.device.k */
/* JADX INFO: compiled from: DeviceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7106k {

    /* JADX INFO: renamed from: c */
    private static final String f39972c = "com.miui.performance.DeviceLevelUtils";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final String f87412cdj = "msm";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static int f87413ch = 0;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    static final String f87414d2ok = "CPU architecture";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private static Application f87417ek5k = null;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    static final String f87418eqxt = "CPU implementer";

    /* JADX INFO: renamed from: f */
    private static final String f39974f = "/system_ext/framework/MiuiBooster.jar";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f87419f7l8 = 8;

    /* JADX INFO: renamed from: g */
    static final String f39975g = "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq";

    /* JADX INFO: renamed from: h */
    static final String f39976h = "0x";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final String f87425hyr = "/system/framework/MiuiBooster.jar";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static Point f87427jk = null;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static float f87428jp0y = 0.0f;

    /* JADX INFO: renamed from: k */
    public static final int f39979k = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    static final String f87429ki = "sdm";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final int f87430kja0 = 8;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final String f87431ld6 = ": ";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static Class f87432lrht = null;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    static final String f87433lvui = "CPU part";

    /* JADX INFO: renamed from: m */
    private static Method f39981m = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f87434mcp = -1;

    /* JADX INFO: renamed from: n */
    static final String f39982n = "DeviceUtils";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final int f87436n7h = 73;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static int f87439nmn5 = 0;

    /* JADX INFO: renamed from: o */
    private static Method f39983o = null;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    static final String f87442oc = "processor";

    /* JADX INFO: renamed from: p */
    static final int f39984p = 2700000;

    /* JADX INFO: renamed from: q */
    public static final int f39985q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f87443qrj = 68;

    /* JADX INFO: renamed from: s */
    static final int f39987s = 2300000;

    /* JADX INFO: renamed from: t */
    public static final int f39988t = 1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final String f87444t8r = "sm";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f87445toq = 0;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static PathClassLoader f87446uv6 = null;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static Constructor<Class> f87447vyq = null;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f87448wvg = 2;

    /* JADX INFO: renamed from: x */
    private static int f39989x = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final String f87449x2 = "Qualcomm";

    /* JADX INFO: renamed from: y */
    static final int f39990y = 2000000;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private static Context f87452yz = null;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static int f87453zp = 0;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final String f87454zurt = "oled";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f87455zy = 1;

    /* JADX INFO: renamed from: i */
    static final Pattern f39977i = Pattern.compile("Inc ([A-Z]+)([\\d]+)");

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    static final Pattern f87420fn3e = Pattern.compile("MT([\\d]{2})([\\d]+)");

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static Boolean f87438ni7 = null;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static int f87422fu4 = -2;

    /* JADX INFO: renamed from: z */
    static int f39991z = -2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static Boolean f87441o1t = null;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static int f87409a9 = -1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static Boolean f87421fti = null;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static Boolean f87423gvn7 = null;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static Boolean f87415d3 = null;

    /* JADX INFO: renamed from: r */
    static int f39986r = -1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    static int f87416dd = -1;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    static int f87450x9kr = -1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static int f87437ncyb = -1;

    /* JADX INFO: renamed from: l */
    static int f39980l = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final String[] f87435n5r1 = {"cactus", "cereus", "pine", "olive", "ginkgo", "olivelite", "olivewood", "willow", "wayne", "dandelion", "angelica", "angelicain", "whyred", "tulip", "onc", "onclite", "lavender", "lotus", "laurus", "merlinnfc", "merlin", "lancelot", "citrus", "pomelo", "lemon", "shiva", "lime", "cannon", "curtana", "durandal", "excalibur", "joyeuse", "gram", "sunny", "mojito", "rainbow", "cattail", "angelican", "camellia"};

    /* JADX INFO: renamed from: e */
    private static Object f39973e = null;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static Method f87440nn86 = null;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static Method f87424hb = null;

    /* JADX INFO: renamed from: j */
    private static Method f39978j = null;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static int f87451y9n = 1;

    /* JADX INFO: renamed from: b */
    private static int f39971b = 1;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static boolean f87411bf2 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static int f87426i1 = 1;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static int f87410a98o = 2;

    /* JADX INFO: renamed from: a */
    public static int f39970a = 3;

    /* JADX INFO: renamed from: miuix.device.k$k */
    /* JADX INFO: compiled from: DeviceUtils.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        int f39992k;

        /* JADX INFO: renamed from: n */
        int f39993n;

        /* JADX INFO: renamed from: q */
        int f39994q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87456toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f87457zy;

        public String toString() {
            return "CpuInfo{id=" + this.f39992k + ", implementor=" + Integer.toHexString(this.f87456toq) + ", architecture=" + this.f87457zy + ", part=" + Integer.toHexString(this.f39994q) + ", maxFreq=" + this.f39993n + '}';
        }
    }

    /* JADX INFO: renamed from: miuix.device.k$toq */
    /* JADX INFO: compiled from: DeviceUtils.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        int f39995k = -1;

        /* JADX INFO: renamed from: q */
        int f39996q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87458toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f87459zy;

        public String toString() {
            return "CpuStats{level=" + this.f39995k + ", maxFreq=" + this.f87458toq + ", bigCoreCount=" + this.f87459zy + ", smallCoreCount=" + this.f39996q + '}';
        }
    }

    static {
        f87447vyq = null;
        f39983o = null;
        f39981m = null;
        try {
            if (Build.VERSION.SDK_INT > 33) {
                PathClassLoader pathClassLoader = new PathClassLoader(f39974f, ClassLoader.getSystemClassLoader());
                f87446uv6 = pathClassLoader;
                f87432lrht = pathClassLoader.loadClass(f39972c);
            } else {
                PathClassLoader pathClassLoader2 = new PathClassLoader(f87425hyr, ClassLoader.getSystemClassLoader());
                f87446uv6 = pathClassLoader2;
                f87432lrht = pathClassLoader2.loadClass(f39972c);
            }
            f87447vyq = f87432lrht.getConstructor(Context.class);
            f39983o = f87432lrht.getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        } catch (Exception e2) {
            Log.e("DeviceUtils", "static init(): Load Class Exception:" + e2);
        }
        try {
            f39981m = f87432lrht.getDeclaredMethod("getMiuiMiddleVersion", new Class[0]);
        } catch (Exception e3) {
            Log.e("DeviceUtils", "static init(): Load MiuiMiddle Class Exception:" + e3);
        }
        if (f87432lrht == null) {
            Log.e("DeviceUtils", "static init(): MiuiBooster is not in this rom");
        }
    }

    public static boolean a9(Context context) {
        return fti() && !hyr(context);
    }

    /* JADX INFO: renamed from: c */
    private static int m25698c(int i2, int i3, int i4) {
        f39971b = i2;
        if (i4 == f87410a98o) {
            f87416dd = i3;
            return i3;
        }
        if (i4 == f39970a) {
            f87450x9kr = i3;
            return i3;
        }
        if (i4 != f87426i1) {
            return -1;
        }
        f87437ncyb = i3;
        return i3;
    }

    private static String cdj() {
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                String strNextLine = scanner.nextLine();
                if (!scanner.hasNextLine()) {
                    String[] strArrSplit = strNextLine.split(f87431ld6);
                    if (strArrSplit.length > 1) {
                        return strArrSplit[1];
                    }
                }
            }
            return "";
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getChipSetFromCpuInfo failed", e2);
            return "";
        }
    }

    public static boolean d2ok() {
        return oc() && t8r() >= 2;
    }

    public static boolean d3() {
        if (f87441o1t == null) {
            f87441o1t = Boolean.valueOf("true".contentEquals(miuix.device.toq.toq("ro.config.low_ram.support_miuilite_plus", "false")));
        }
        return f87441o1t.booleanValue();
    }

    public static boolean dd(boolean z2) {
        if (z2) {
            if (f87423gvn7 == null) {
                f87423gvn7 = Boolean.valueOf(x9kr());
            }
            return Boolean.TRUE.equals(f87423gvn7);
        }
        if (f87415d3 == null) {
            f87415d3 = Boolean.valueOf(x9kr());
        }
        return Boolean.TRUE.equals(f87415d3);
    }

    public static boolean eqxt() {
        return oc() && t8r() < 2;
    }

    /* JADX INFO: renamed from: f */
    private static k m25699f(String[] strArr, List<k> list, k kVar) throws Throwable {
        String strTrim = strArr[1].trim();
        if (strArr[0].contains(f87442oc) && TextUtils.isDigitsOnly(strTrim)) {
            k kVarM25703k = m25703k(strTrim);
            list.add(kVarM25703k);
            return kVarM25703k;
        }
        if (kVar == null) {
            return kVar;
        }
        m25700g(strArr[0], strTrim, kVar);
        return kVar;
    }

    public static List<k> f7l8() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            k kVarM25699f = null;
            while (scanner.hasNextLine()) {
                String[] strArrSplit = scanner.nextLine().split(f87431ld6);
                if (strArrSplit.length > 1) {
                    kVarM25699f = m25699f(strArrSplit, arrayList, kVarM25699f);
                }
            }
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getChipSetFromCpuInfo failed", e2);
        }
        return arrayList;
    }

    public static int fn3e() {
        if (f39991z == -2) {
            try {
                Object objInvoke = f39981m.invoke(ni7(), new Object[0]);
                if (objInvoke != null) {
                    f39991z = ((Integer) objInvoke).intValue();
                } else {
                    f39991z = -1;
                }
            } catch (Exception e2) {
                f39991z = -1;
                Log.e("DeviceUtils", "getMiuiMiddleVersion failed , e:" + e2.toString());
            }
        }
        return f39991z;
    }

    public static boolean fti() {
        if (f87409a9 == -1) {
            f87409a9 = miuix.device.toq.zy("persist.sys.muiltdisplay_type", 1);
        }
        return f87409a9 == 2;
    }

    private static Class fu4() {
        return f87432lrht;
    }

    /* JADX INFO: renamed from: g */
    private static void m25700g(String str, String str2, k kVar) {
        if (str.contains(f87418eqxt)) {
            kVar.f87456toq = lrht(str2);
        } else if (str.contains(f87414d2ok)) {
            kVar.f87457zy = lrht(str2);
        } else if (str.contains(f87433lvui)) {
            kVar.f39994q = lrht(str2);
        }
    }

    public static boolean gvn7() {
        String strM25712z = m25712z();
        if (strM25712z != null && strM25712z.length() != 0) {
            for (String str : f87435n5r1) {
                if (str.equalsIgnoreCase(strM25712z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static int m25701h(int i2, int i3) {
        Object objNi7;
        int iIntValue = -1;
        if (!mcp()) {
            return -1;
        }
        try {
            objNi7 = ni7();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e2.toString());
        }
        if (objNi7 == null) {
            throw new Exception("perf is null!");
        }
        iIntValue = ((Integer) f87440nn86.invoke(objNi7, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
        return uv6(iIntValue);
    }

    public static boolean hyr(Context context) {
        if (f87427jk == null || fti()) {
            Point point = new Point();
            f87427jk = point;
            zy.zy(context, point);
            f87428jp0y = context.getResources().getDisplayMetrics().density * 600.0f;
        }
        Point point2 = f87427jk;
        return ((float) Math.min(point2.x, point2.y)) >= f87428jp0y;
    }

    /* JADX INFO: renamed from: i */
    private static Method m25702i() throws Exception {
        if (f39983o == null) {
            f39983o = fu4().getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        }
        return f39983o;
    }

    public static void jk(Context context) {
        Constructor<Class> constructor;
        if (f39973e == null) {
            try {
                f87452yz = context;
                if (context != null && (constructor = f87447vyq) != null) {
                    f39973e = constructor.newInstance(context);
                }
            } catch (Exception e2) {
                Log.e("DeviceUtils", "initPerf DeviceUtils(): newInstance Exception:" + e2);
                e2.printStackTrace();
            }
            if (f39973e == null) {
                Log.e("DeviceUtils", "initPerf fail mPerf is still null");
            }
        }
    }

    @Deprecated
    public static boolean jp0y(Context context) {
        return fti() && hyr(context);
    }

    /* JADX INFO: renamed from: k */
    private static k m25703k(String str) throws Throwable {
        k kVar = new k();
        int i2 = Integer.parseInt(str);
        kVar.f39992k = i2;
        String strM25705n = m25705n(String.format(Locale.ENGLISH, f39975g, Integer.valueOf(i2)));
        if (strM25705n != null) {
            kVar.f39993n = Integer.parseInt(strM25705n);
        }
        return kVar;
    }

    private static int ki(int... iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int i2 = iArr[0];
        for (int i3 : iArr) {
            if (i3 > -1 && i3 < i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    private static int kja0(int i2) {
        Object objNi7;
        int iIntValue = -1;
        if (!mcp()) {
            return -1;
        }
        try {
            objNi7 = ni7();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e2.toString());
        }
        if (objNi7 == null) {
            throw new Exception("perf is null!");
        }
        iIntValue = ((Integer) f87424hb.invoke(objNi7, Integer.valueOf(i2))).intValue();
        return uv6(iIntValue);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m25704l() {
        if (f87421fti == null) {
            f87421fti = Boolean.valueOf(miuix.device.toq.toq("ro.build.characteristics", "").contains("tablet"));
        }
        return f87421fti.booleanValue();
    }

    public static int ld6(int i2) {
        int i3;
        if (f39971b == i2 && (i3 = f39986r) != -1) {
            return i3;
        }
        f39971b = i2;
        int iKja0 = kja0(i2);
        f39986r = iKja0;
        return iKja0 != -1 ? iKja0 : qrj();
    }

    private static int lrht(String str) {
        return str.startsWith(f39976h) ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
    }

    public static boolean lvui() {
        return fn3e() >= 1;
    }

    private static boolean mcp() {
        Class clsFu4;
        boolean z2 = f87411bf2;
        if (z2) {
            return z2;
        }
        try {
            clsFu4 = fu4();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "initDeviceLevelInfo Fail: Exception:" + e2);
        }
        if (clsFu4 == null) {
            return f87411bf2;
        }
        Class<?> cls = Integer.TYPE;
        f87440nn86 = clsFu4.getDeclaredMethod("getDeviceLevel", cls, cls);
        f87424hb = clsFu4.getDeclaredMethod("getDeviceLevel", cls);
        f87426i1 = ((Integer) wvg(clsFu4, "DEVICE_LEVEL_FOR_RAM", cls)).intValue();
        f87410a98o = ((Integer) wvg(clsFu4, "DEVICE_LEVEL_FOR_CPU", cls)).intValue();
        f39970a = ((Integer) wvg(clsFu4, "DEVICE_LEVEL_FOR_GPU", cls)).intValue();
        f87453zp = ((Integer) wvg(clsFu4, "LOW_DEVICE", cls)).intValue();
        f39989x = ((Integer) wvg(clsFu4, "MIDDLE_DEVICE", cls)).intValue();
        f87413ch = ((Integer) wvg(clsFu4, "HIGH_DEVICE", cls)).intValue();
        f87439nmn5 = ((Integer) wvg(clsFu4, "DEVICE_LEVEL_UNKNOWN", cls)).intValue();
        f87411bf2 = true;
        return f87411bf2;
    }

    /* JADX INFO: renamed from: n */
    private static String m25705n(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            bufferedReader.close();
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return line;
        } catch (IOException unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static boolean n5r1(Context context) {
        if (f87427jk == null || fti()) {
            Point point = new Point();
            f87427jk = point;
            zy.zy(context, point);
            f87428jp0y = context.getResources().getDisplayMetrics().density * 600.0f;
        }
        Point point2 = f87427jk;
        return ((float) Math.min(point2.x, point2.y)) >= f87428jp0y;
    }

    private static int n7h(int i2) {
        if (i2 != f87426i1) {
            if (i2 == f87410a98o) {
                return m25711y();
            }
            return -1;
        }
        int iM25710t = m25710t();
        if (iM25710t > 6) {
            return 2;
        }
        if (iM25710t > 4) {
            return 1;
        }
        return iM25710t > 0 ? 0 : -1;
    }

    public static boolean ncyb() {
        try {
            Object objNi7 = ni7();
            if (objNi7 == null) {
                throw new Exception("perf is null!");
            }
            if (f39978j != null) {
                return false;
            }
            Method declaredMethod = fu4().getDeclaredMethod("isSupportPrune", new Class[0]);
            f39978j = declaredMethod;
            return ((Boolean) declaredMethod.invoke(objNi7, new Object[0])).booleanValue();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "isSupportPrune failed , e:" + e2);
            return false;
        }
    }

    private static Object ni7() {
        Constructor<Class> constructor;
        if (f39973e == null) {
            try {
                Context contextM25707q = m25707q();
                if (contextM25707q == null || (constructor = f87447vyq) == null) {
                    throw new Exception("getAppContext fail");
                }
                f39973e = constructor.newInstance(contextM25707q);
            } catch (Exception e2) {
                Log.e("DeviceUtils", "getPerf DeviceUtils(): newInstance Exception:" + e2);
                e2.printStackTrace();
            }
        }
        return f39973e;
    }

    public static int o1t(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f39977i.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        String lowerCase = strGroup.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.equals(f87444t8r)) {
            return lowerCase.equals(f87429ki) ? Integer.parseInt(strGroup2.substring(0, 1)) >= 7 ? 1 : 0 : lowerCase.equals(f87412cdj) ? 0 : -1;
        }
        int i2 = Integer.parseInt(strGroup2.substring(0, 1));
        if (i2 >= 8) {
            return 2;
        }
        return i2 >= 7 ? 1 : 0;
    }

    public static boolean oc() {
        if (f87438ni7 == null) {
            try {
                f87438ni7 = Boolean.valueOf(((Boolean) Class.forName("miui.os.Build").getDeclaredField("IS_MIUI_LITE_VERSION").get(null)).booleanValue());
            } catch (Throwable th) {
                Log.i("DeviceUtils", "isMiuiLiteRom failed", th);
                f87438ni7 = null;
            }
        }
        return Boolean.TRUE.equals(f87438ni7);
    }

    /* JADX INFO: renamed from: p */
    public static int m25706p() {
        return ld6(f87451y9n);
    }

    /* JADX INFO: renamed from: q */
    private static Context m25707q() {
        if (f87452yz == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                f87417ek5k = application;
                if (application != null) {
                    f87452yz = application.getApplicationContext();
                }
            } catch (Exception e2) {
                Log.e("DeviceUtils", "android.app.ActivityThread Exception:" + e2);
            }
        }
        if (f87452yz == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
                f87417ek5k = application2;
                if (application2 != null) {
                    f87452yz = application2.getApplicationContext();
                }
            } catch (Exception e3) {
                Log.e("DeviceUtils", "android.app.AppGlobals Exception:" + e3);
            }
        }
        return f87452yz;
    }

    private static int qrj() {
        int i2 = f39986r;
        if (i2 != -1) {
            return i2;
        }
        if (oc()) {
            f39986r = 0;
        } else {
            f39986r = ki(n7h(f87410a98o), n7h(f87426i1), x2(f87451y9n, f39970a));
        }
        return f39986r;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m25708r() {
        return dd(true);
    }

    /* JADX INFO: renamed from: s */
    public static toq m25709s() throws Throwable {
        List<k> listF7l8 = f7l8();
        toq toqVar = new toq();
        if (listF7l8.size() < 8) {
            toqVar.f39995k = 0;
        }
        zy(toqVar, listF7l8);
        return toqVar;
    }

    /* JADX INFO: renamed from: t */
    public static int m25710t() {
        if (f39980l == Integer.MAX_VALUE) {
            try {
                f39980l = (int) (((((Long) Class.forName("miui.util.HardwareInfo").getMethod("getTotalPhysicalMemory", new Class[0]).invoke(null, new Object[0])).longValue() / 1024) / 1024) / 1024);
            } catch (Throwable th) {
                Log.e("DeviceUtils", th.getMessage());
                f39980l = 0;
            }
        }
        return f39980l;
    }

    public static int t8r() {
        Object objNi7;
        if (!oc()) {
            f87422fu4 = 0;
            return 0;
        }
        int i2 = f87422fu4;
        if (i2 != -2) {
            return i2;
        }
        int iIntValue = -1;
        try {
            objNi7 = ni7();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getMiuiLiteVersion failed , e:" + e2.toString());
        }
        if (objNi7 == null) {
            throw new Exception("perf is null!");
        }
        iIntValue = ((Integer) m25702i().invoke(objNi7, new Object[0])).intValue();
        if (iIntValue >= 2) {
            f87422fu4 = iIntValue;
        } else {
            f87422fu4 = 1;
        }
        return f87422fu4;
    }

    private static void toq(toq toqVar) {
        if (toqVar.f39995k != -1) {
            return;
        }
        if (toqVar.f87459zy < 4) {
            if (toqVar.f87458toq > f39987s) {
                toqVar.f39995k = 1;
                return;
            } else {
                toqVar.f39995k = 0;
                return;
            }
        }
        int i2 = toqVar.f87458toq;
        if (i2 > f39984p) {
            toqVar.f39995k = 2;
        } else if (i2 > f39987s) {
            toqVar.f39995k = 1;
        } else {
            toqVar.f39995k = 0;
        }
    }

    private static int uv6(int i2) {
        if (i2 == f87453zp) {
            return 0;
        }
        if (i2 == f39989x) {
            return 1;
        }
        return i2 == f87413ch ? 2 : -1;
    }

    private static <T> T wvg(Class<?> cls, String str, Class<T> cls2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }

    public static int x2(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i3 == f87410a98o) {
            if (f39971b == i2 && (i6 = f87416dd) != -1) {
                return i6;
            }
        } else if (i3 == f39970a) {
            if (f39971b == i2 && (i5 = f87450x9kr) != -1) {
                return i5;
            }
        } else if (i3 == f87426i1 && f39971b == i2 && (i4 = f87437ncyb) != -1) {
            return i4;
        }
        int iM25701h = m25701h(i2, i3);
        return iM25701h != -1 ? m25698c(i2, iM25701h, i3) : m25698c(i2, n7h(i3), i3);
    }

    private static boolean x9kr() {
        try {
            String qVar = miuix.device.toq.toq("ro.vendor.display.type", "lcd");
            String qVar2 = miuix.device.toq.toq("ro.display.type", "lcd");
            if (!f87454zurt.equals(qVar)) {
                if (!f87454zurt.equals(qVar2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getProductDevice failed , e:" + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    private static int m25711y() {
        String strCdj = cdj();
        int iO1t = strCdj.length() > 0 ? strCdj.contains(f87449x2) ? o1t(strCdj) : zurt(strCdj) : -1;
        return iO1t == -1 ? m25709s().f39995k : iO1t;
    }

    /* JADX INFO: renamed from: z */
    public static String m25712z() {
        return Build.DEVICE;
    }

    private static int zurt(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f87420fn3e.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        return (Integer.parseInt(strGroup) != 68 || Integer.parseInt(strGroup2) < 73) ? 0 : 1;
    }

    private static void zy(toq toqVar, List<k> list) {
        for (k kVar : list) {
            if (kVar.f87457zy < 8) {
                toqVar.f39995k = 0;
            }
            int i2 = kVar.f39993n;
            if (i2 > toqVar.f87458toq) {
                toqVar.f87458toq = i2;
            }
            if (i2 >= f39990y) {
                toqVar.f87459zy++;
            } else {
                toqVar.f39996q++;
            }
        }
        toq(toqVar);
    }
}
