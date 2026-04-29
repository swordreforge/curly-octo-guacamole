package miuix.animation.utils;

import android.app.Application;
import android.content.Context;
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

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DeviceUtils {
    static final String ARCHITECTURE = "CPU architecture";
    static final int ARM_V8 = 8;
    static final int BIG_CORE_FREQ = 2000000;
    static final int CORE_COUNT = 8;
    static final String CpuMaxInfoFormat = "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq";
    static final int D800 = 73;
    public static final int DEVICE_HIGHEND = 2;
    public static final int DEVICE_MIDDLE = 1;
    public static final int DEVICE_PRIMARY = 0;
    public static final int DEVICE_UNKNOWN = -1;
    static final String HEX = "0x";
    private static int HIGH = 0;
    static final int HIGH_FREQ = 2700000;
    static final String IMPLEMENTOR = "CPU implementer";
    private static int LOW = 0;
    private static int MIDDLE = 0;
    static final int MIDDLE_FREQ = 2300000;
    static final int MTK_DIMENSITY = 68;
    static final String PART = "CPU part";
    private static final String PERFORMANCE_CLASS = "com.miui.performance.DeviceLevelUtils";
    private static final String PERFORMANCE_JAR = "/system/framework/MiuiBooster.jar";
    static final String PROCESSOR = "processor";
    static final String QUALCOMM = "Qualcomm";
    static final String SEPARATOR = ": ";
    static final String SNAPDRAGON1 = "msm";
    static final String SNAPDRAGON2 = "sdm";
    static final String SNAPDRAGON3 = "sm";
    private static final String[] STOCK_DEVICE;
    static final String TAG = "DeviceUtils";
    public static int TYPE_CPU;
    public static int TYPE_GPU;
    public static int TYPE_RAM;
    private static int UNKNOWN;
    private static Application application;
    private static Context applicationContext;
    private static Constructor<Class> mConstructor;
    private static Method mGetDeviceLevel;
    private static Method mGetDeviceLevelForWhole;
    private static Method mIsSupportPrune;
    private static Object mPerf;
    private static Class perfClass;
    private static PathClassLoader perfClassLoader;
    static final Pattern SM_PATTERN = Pattern.compile("Inc ([A-Z]+)([\\d]+)");
    static final Pattern MT_PATTERN = Pattern.compile("MT([\\d]{2})([\\d]+)");
    static int mLevel = -1;
    static int mCpuLevel = -1;
    static int mGpuLevel = -1;
    static int mRamLevel = -1;
    static int mTotalRam = Integer.MAX_VALUE;
    public static int DEV_STANDARD_VERSION = 1;
    private static int mLastVersion = 1;

    public static class CpuInfo {
        int architecture;
        int id;
        int implementor;
        int maxFreq;
        int part;

        public String toString() {
            return "CpuInfo{id=" + this.id + ", implementor=" + Integer.toHexString(this.implementor) + ", architecture=" + this.architecture + ", part=" + Integer.toHexString(this.part) + ", maxFreq=" + this.maxFreq + '}';
        }
    }

    public static class CpuStats {
        int bigCoreCount;
        int level = -1;
        int maxFreq;
        int smallCoreCount;

        public String toString() {
            return "CpuStats{level=" + this.level + ", maxFreq=" + this.maxFreq + ", bigCoreCount=" + this.bigCoreCount + ", smallCoreCount=" + this.smallCoreCount + '}';
        }
    }

    static {
        mConstructor = null;
        mPerf = null;
        mGetDeviceLevel = null;
        mGetDeviceLevelForWhole = null;
        mIsSupportPrune = null;
        TYPE_RAM = 1;
        TYPE_CPU = 2;
        TYPE_GPU = 3;
        try {
            PathClassLoader pathClassLoader = new PathClassLoader(PERFORMANCE_JAR, ClassLoader.getSystemClassLoader());
            perfClassLoader = pathClassLoader;
            Class<?> clsLoadClass = pathClassLoader.loadClass(PERFORMANCE_CLASS);
            perfClass = clsLoadClass;
            mConstructor = clsLoadClass.getConstructor(Context.class);
            Class<?> cls = Integer.TYPE;
            mGetDeviceLevel = perfClass.getDeclaredMethod("getDeviceLevel", cls, cls);
            mGetDeviceLevelForWhole = perfClass.getDeclaredMethod("getDeviceLevel", cls);
            mIsSupportPrune = perfClass.getDeclaredMethod("isSupportPrune", new Class[0]);
            TYPE_RAM = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_RAM", cls)).intValue();
            TYPE_CPU = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_CPU", cls)).intValue();
            TYPE_GPU = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_FOR_GPU", cls)).intValue();
            LOW = ((Integer) getStaticObjectField(perfClass, "LOW_DEVICE", cls)).intValue();
            MIDDLE = ((Integer) getStaticObjectField(perfClass, "MIDDLE_DEVICE", cls)).intValue();
            HIGH = ((Integer) getStaticObjectField(perfClass, "HIGH_DEVICE", cls)).intValue();
            UNKNOWN = ((Integer) getStaticObjectField(perfClass, "DEVICE_LEVEL_UNKNOWN", cls)).intValue();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "DeviceLevel(): Load Class Exception:" + e2);
        }
        if (applicationContext == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                application = application2;
                if (application2 != null) {
                    applicationContext = application2.getApplicationContext();
                }
            } catch (Exception e3) {
                Log.e("DeviceUtils", "android.app.ActivityThread Exception:" + e3);
            }
        }
        if (applicationContext == null) {
            try {
                Application application3 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
                application = application3;
                if (application3 != null) {
                    applicationContext = application3.getApplicationContext();
                }
            } catch (Exception e4) {
                Log.e("DeviceUtils", "android.app.AppGlobals Exception:" + e4);
            }
        }
        try {
            Constructor<Class> constructor = mConstructor;
            if (constructor != null) {
                mPerf = constructor.newInstance(applicationContext);
            }
        } catch (Exception e6) {
            Log.e("DeviceUtils", "DeviceLevelUtils(): newInstance Exception:" + e6);
            e6.printStackTrace();
        }
        STOCK_DEVICE = new String[]{"cactus", "cereus", "pine", "olive", "ginkgo", "olivelite", "olivewood", "willow", "wayne", "dandelion", "angelica", "angelicain", "whyred", "tulip", "onc", "onclite", "lavender", "lotus", "laurus", "merlinnfc", "merlin", "lancelot", "citrus", "pomelo", "lemon", "shiva", "lime", "cannon", "curtana", "durandal", "excalibur", "joyeuse", "gram", "sunny", "mojito", "rainbow", "cattail", "angelican", "camellia"};
    }

    private static CpuInfo createCpuInfo(String str) throws Throwable {
        CpuInfo cpuInfo = new CpuInfo();
        int i2 = Integer.parseInt(str);
        cpuInfo.id = i2;
        String contentFromFileInfo = getContentFromFileInfo(String.format(Locale.ENGLISH, CpuMaxInfoFormat, Integer.valueOf(i2)));
        if (contentFromFileInfo != null) {
            cpuInfo.maxFreq = Integer.parseInt(contentFromFileInfo);
        }
        return cpuInfo;
    }

    private static void decideLevel(CpuStats cpuStats) {
        if (cpuStats.level != -1) {
            return;
        }
        if (cpuStats.bigCoreCount < 4) {
            if (cpuStats.maxFreq > MIDDLE_FREQ) {
                cpuStats.level = 1;
                return;
            } else {
                cpuStats.level = 0;
                return;
            }
        }
        int i2 = cpuStats.maxFreq;
        if (i2 > HIGH_FREQ) {
            cpuStats.level = 2;
        } else if (i2 > MIDDLE_FREQ) {
            cpuStats.level = 1;
        } else {
            cpuStats.level = 0;
        }
    }

    private static void doCpuStats(CpuStats cpuStats, List<CpuInfo> list) {
        for (CpuInfo cpuInfo : list) {
            if (cpuInfo.architecture < 8) {
                cpuStats.level = 0;
            }
            int i2 = cpuInfo.maxFreq;
            if (i2 > cpuStats.maxFreq) {
                cpuStats.maxFreq = i2;
            }
            if (i2 >= BIG_CORE_FREQ) {
                cpuStats.bigCoreCount++;
            } else {
                cpuStats.smallCoreCount++;
            }
        }
        decideLevel(cpuStats);
    }

    private static String getContentFromFileInfo(String str) throws Throwable {
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

    private static void getCpuInfo(String str, String str2, CpuInfo cpuInfo) {
        if (str.contains(IMPLEMENTOR)) {
            cpuInfo.implementor = toInt(str2);
        } else if (str.contains(ARCHITECTURE)) {
            cpuInfo.architecture = toInt(str2);
        } else if (str.contains(PART)) {
            cpuInfo.part = toInt(str2);
        }
    }

    public static List<CpuInfo> getCpuInfoList() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            CpuInfo line = null;
            while (scanner.hasNextLine()) {
                String[] strArrSplit = scanner.nextLine().split(SEPARATOR);
                if (strArrSplit.length > 1) {
                    line = parseLine(strArrSplit, arrayList, line);
                }
            }
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getChipSetFromCpuInfo failed", e2);
        }
        return arrayList;
    }

    private static int getCpuLevel() {
        String hardwareInfo = getHardwareInfo();
        int qualcommCpuLevel = hardwareInfo.length() > 0 ? hardwareInfo.contains(QUALCOMM) ? getQualcommCpuLevel(hardwareInfo) : getMtkCpuLevel(hardwareInfo) : -1;
        return qualcommCpuLevel == -1 ? getCpuStats().level : qualcommCpuLevel;
    }

    public static CpuStats getCpuStats() throws Throwable {
        List<CpuInfo> cpuInfoList = getCpuInfoList();
        CpuStats cpuStats = new CpuStats();
        if (cpuInfoList.size() < 8) {
            cpuStats.level = 0;
        }
        doCpuStats(cpuStats, cpuInfoList);
        return cpuStats;
    }

    public static int getDeviceLevel() {
        return getDeviceLevel(DEV_STANDARD_VERSION);
    }

    private static int getDeviceLevel1(int i2) {
        if (i2 != TYPE_RAM) {
            if (i2 == TYPE_CPU) {
                return getCpuLevel();
            }
            return -1;
        }
        int totalRam = getTotalRam();
        if (totalRam > 6) {
            return 2;
        }
        if (totalRam > 4) {
            return 1;
        }
        return totalRam > 0 ? 0 : -1;
    }

    private static int getDeviceLevel2(int i2) {
        int iIntValue;
        try {
            iIntValue = ((Integer) mGetDeviceLevelForWhole.invoke(mPerf, Integer.valueOf(i2))).intValue();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e2.toString());
            iIntValue = -1;
        }
        return transDeviceLevel(iIntValue);
    }

    private static String getHardwareInfo() {
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                String strNextLine = scanner.nextLine();
                if (!scanner.hasNextLine()) {
                    String[] strArrSplit = strNextLine.split(SEPARATOR);
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

    private static int getMinLevel(int... iArr) {
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

    private static int getMtkCpuLevel(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = MT_PATTERN.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        return (Integer.parseInt(strGroup) != 68 || Integer.parseInt(strGroup2) < 73) ? 0 : 1;
    }

    public static String getProductDevice() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.product.device", "");
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getProductDevice failed , e:" + e2.toString());
            return "";
        }
    }

    public static int getQualcommCpuLevel(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = SM_PATTERN.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        String lowerCase = strGroup.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.equals(SNAPDRAGON3)) {
            return lowerCase.equals(SNAPDRAGON2) ? Integer.parseInt(strGroup2.substring(0, 1)) >= 7 ? 1 : 0 : lowerCase.equals(SNAPDRAGON1) ? 0 : -1;
        }
        int i2 = Integer.parseInt(strGroup2.substring(0, 1));
        if (i2 >= 8) {
            return 2;
        }
        return i2 >= 7 ? 1 : 0;
    }

    private static <T> T getStaticObjectField(Class<?> cls, String str, Class<T> cls2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }

    public static int getTotalRam() {
        if (mTotalRam == Integer.MAX_VALUE) {
            try {
                mTotalRam = (int) (((((Long) Class.forName("miui.util.HardwareInfo").getMethod("getTotalPhysicalMemory", new Class[0]).invoke(null, new Object[0])).longValue() / 1024) / 1024) / 1024);
            } catch (Throwable th) {
                Log.e("DeviceUtils", th.getMessage());
                mTotalRam = 0;
            }
        }
        return mTotalRam;
    }

    private static boolean isMiuiLite() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getDeclaredField("IS_MIUI_LITE_VERSION").get(null)).booleanValue();
        } catch (Throwable th) {
            Log.i("DeviceUtils", "getDeviceLevel failed", th);
            return false;
        }
    }

    public static boolean isStockDevice() {
        String productDevice = getProductDevice();
        if (productDevice != null && productDevice.length() != 0) {
            for (String str : STOCK_DEVICE) {
                if (str.equalsIgnoreCase(productDevice)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSupportPrune() {
        try {
            return ((Boolean) mIsSupportPrune.invoke(mPerf, new Object[0])).booleanValue();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "isSupportPrune failed , e:" + e2.toString());
            return false;
        }
    }

    private static CpuInfo parseLine(String[] strArr, List<CpuInfo> list, CpuInfo cpuInfo) throws Throwable {
        String strTrim = strArr[1].trim();
        if (strArr[0].contains(PROCESSOR) && TextUtils.isDigitsOnly(strTrim)) {
            CpuInfo cpuInfoCreateCpuInfo = createCpuInfo(strTrim);
            list.add(cpuInfoCreateCpuInfo);
            return cpuInfoCreateCpuInfo;
        }
        if (cpuInfo == null) {
            return cpuInfo;
        }
        getCpuInfo(strArr[0], strTrim, cpuInfo);
        return cpuInfo;
    }

    private static int setDeviceLevel(int i2, int i3, int i4) {
        mLastVersion = i2;
        if (i4 == TYPE_CPU) {
            mCpuLevel = i3;
            return i3;
        }
        if (i4 == TYPE_GPU) {
            mGpuLevel = i3;
            return i3;
        }
        if (i4 != TYPE_RAM) {
            return -1;
        }
        mRamLevel = i3;
        return i3;
    }

    private static int toInt(String str) {
        return str.startsWith(HEX) ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
    }

    private static int transDeviceLevel(int i2) {
        if (i2 == LOW) {
            return 0;
        }
        if (i2 == MIDDLE) {
            return 1;
        }
        return i2 == HIGH ? 2 : -1;
    }

    public static int getDeviceLevel(int i2) {
        int i3;
        if (mLastVersion == i2 && (i3 = mLevel) != -1) {
            return i3;
        }
        mLastVersion = i2;
        int deviceLevel2 = getDeviceLevel2(i2);
        mLevel = deviceLevel2;
        return deviceLevel2 != -1 ? deviceLevel2 : getDeviceLevel1();
    }

    private static int getDeviceLevel1() {
        int i2 = mLevel;
        if (i2 != -1) {
            return i2;
        }
        if (isMiuiLite()) {
            mLevel = 0;
        } else {
            mLevel = getMinLevel(getDeviceLevel1(TYPE_CPU), getDeviceLevel1(TYPE_RAM), getDeviceLevel(DEV_STANDARD_VERSION, TYPE_GPU));
        }
        return mLevel;
    }

    private static int getDeviceLevel2(int i2, int i3) {
        int iIntValue;
        try {
            iIntValue = ((Integer) mGetDeviceLevel.invoke(mPerf, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
        } catch (Exception e2) {
            Log.e("DeviceUtils", "getDeviceLevel failed , e:" + e2.toString());
            iIntValue = -1;
        }
        return transDeviceLevel(iIntValue);
    }

    public static int getDeviceLevel(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i3 == TYPE_CPU) {
            if (mLastVersion == i2 && (i6 = mCpuLevel) != -1) {
                return i6;
            }
        } else if (i3 == TYPE_GPU) {
            if (mLastVersion == i2 && (i5 = mGpuLevel) != -1) {
                return i5;
            }
        } else if (i3 == TYPE_RAM && mLastVersion == i2 && (i4 = mRamLevel) != -1) {
            return i4;
        }
        int deviceLevel2 = getDeviceLevel2(i2, i3);
        if (deviceLevel2 != -1) {
            return setDeviceLevel(i2, deviceLevel2, i3);
        }
        return setDeviceLevel(i2, getDeviceLevel1(i3), i3);
    }
}
