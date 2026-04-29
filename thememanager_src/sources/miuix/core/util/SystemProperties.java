package miuix.core.util;

import android.util.Log;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SystemProperties {
    public static final int PROP_NAME_MAX = 31;
    public static final int PROP_VALUE_MAX = 91;
    private static final String TAG = "SystemProperties";
    private static Class classSystemProperties = null;
    private static boolean isSupportGet = false;
    private static boolean isSupportGetBoolean = false;
    private static boolean isSupportGetInt = false;
    private static boolean isSupportGetLong = false;
    private static boolean isSupportSet = false;

    static {
        try {
            classSystemProperties = Class.forName("android.os.SystemProperties");
        } catch (Exception unused) {
            classSystemProperties = null;
        }
        Class cls = classSystemProperties;
        if (cls != null) {
            boolean z2 = true;
            try {
                isSupportGet = cls.getMethod("get", String.class, String.class) != null;
            } catch (Exception unused2) {
                isSupportGet = false;
            }
            try {
                isSupportGetInt = classSystemProperties.getMethod("getInt", String.class, Integer.TYPE) != null;
            } catch (Exception unused3) {
                isSupportGetInt = false;
            }
            try {
                isSupportGetLong = classSystemProperties.getMethod("getLong", String.class, Long.TYPE) != null;
            } catch (Exception unused4) {
                isSupportGetLong = false;
            }
            try {
                isSupportGetBoolean = classSystemProperties.getMethod("getBoolean", String.class, Boolean.TYPE) != null;
            } catch (Exception unused5) {
                isSupportGetBoolean = false;
            }
            try {
                if (classSystemProperties.getMethod("set", String.class, String.class) == null) {
                    z2 = false;
                }
                isSupportSet = z2;
            } catch (Exception unused6) {
                isSupportSet = false;
            }
        }
    }

    public static String get(String str, String str2) {
        if (isSupportGet) {
            try {
                return android.os.SystemProperties.get(str, str2);
            } catch (IllegalArgumentException e2) {
                Log.e(TAG, "key: " + str + " detail:" + e2.toString());
            }
        }
        return str2;
    }

    public static boolean getBoolean(String str, boolean z2) {
        if (isSupportGetBoolean) {
            try {
                return android.os.SystemProperties.getBoolean(str, z2);
            } catch (IllegalArgumentException e2) {
                Log.e(TAG, "key: " + str + " detail:" + e2.toString());
            }
        }
        return z2;
    }

    public static int getInt(String str, int i2) {
        if (isSupportGetInt) {
            try {
                return android.os.SystemProperties.getInt(str, i2);
            } catch (IllegalArgumentException e2) {
                Log.e(TAG, "key: " + str + " detail:" + e2.toString());
            }
        }
        return i2;
    }

    public static long getLong(String str, long j2) {
        if (isSupportGetLong) {
            try {
                return android.os.SystemProperties.getLong(str, j2);
            } catch (IllegalArgumentException e2) {
                Log.e(TAG, "key: " + str + " detail:" + e2.toString());
            }
        }
        return j2;
    }

    public static void set(String str, String str2) {
        if (isSupportSet) {
            if (str.length() > 31) {
                throw new IllegalArgumentException("key.length > 31");
            }
            if (str2 != null && str2.length() > 91) {
                throw new IllegalArgumentException("val.length > 91");
            }
            android.os.SystemProperties.set(str, str2);
        }
    }

    public static String get(String str) {
        return get(str, "");
    }

    public static void set(String str, int i2) {
        set(str, Integer.toString(i2));
    }

    public static void set(String str, long j2) {
        set(str, Long.toString(j2));
    }

    public static void set(String str, boolean z2) {
        set(str, Boolean.toString(z2));
    }
}
