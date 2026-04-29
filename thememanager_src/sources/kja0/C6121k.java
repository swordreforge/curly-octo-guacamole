package kja0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: kja0.k */
/* JADX INFO: compiled from: AccessibilityServiceInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C6121k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f81775f7l8 = 2;

    /* JADX INFO: renamed from: g */
    public static final int f36095g = -1;

    /* JADX INFO: renamed from: k */
    public static final int f36096k = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f81776ld6 = 32;

    /* JADX INFO: renamed from: n */
    public static final int f36097n = 32;

    /* JADX INFO: renamed from: p */
    public static final int f36098p = 16;

    /* JADX INFO: renamed from: q */
    public static final int f36099q = 8;

    /* JADX INFO: renamed from: s */
    public static final int f36100s = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f81777toq = 2;

    /* JADX INFO: renamed from: y */
    public static final int f36101y = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f81778zy = 4;

    private C6121k() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static String m22399k(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static String m22400n(@lvui AccessibilityServiceInfo accessibilityServiceInfo, @lvui PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }

    /* JADX INFO: renamed from: q */
    public static int m22401q(@lvui AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @lvui
    public static String toq(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i2 > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i2);
            i2 &= ~iNumberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @dd
    public static String zy(int i2) {
        if (i2 == 1) {
            return "DEFAULT";
        }
        if (i2 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i2 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i2 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i2 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i2 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }
}
