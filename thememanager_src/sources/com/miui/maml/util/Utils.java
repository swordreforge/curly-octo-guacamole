package com.miui.maml.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.miui.Shell;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import miuix.core.util.C7083n;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    private static ArrayList<String> INTENT_BLACK_LIST = null;
    private static final int INVALID = -2;
    private static int sAcrossUsersFullPermission = -2;
    private static int sAcrossUsersPermission = -2;
    private static Context sAppContext;

    public static class GetChildWrapper {
        private Element mEle;

        public GetChildWrapper(Element element) {
            this.mEle = element;
        }

        public GetChildWrapper getChild(String str) {
            return new GetChildWrapper(Utils.getChild(this.mEle, str));
        }

        public Element getElement() {
            return this.mEle;
        }
    }

    public static class Point {

        /* JADX INFO: renamed from: x */
        public double f29483x;

        /* JADX INFO: renamed from: y */
        public double f29484y;

        public Point(double d2, double d4) {
            this.f29483x = d2;
            this.f29484y = d4;
        }

        public void Offset(Point point) {
            this.f29483x += point.f29483x;
            this.f29484y += point.f29484y;
        }

        Point minus(Point point) {
            return new Point(this.f29483x - point.f29483x, this.f29484y - point.f29484y);
        }
    }

    public interface XmlTraverseListener {
        void onChild(Element element);
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        INTENT_BLACK_LIST = arrayList;
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        INTENT_BLACK_LIST.add("android.intent.action.BATTERY_CHANGED");
        INTENT_BLACK_LIST.add("android.intent.action.BATTERY_LOW");
        INTENT_BLACK_LIST.add("android.intent.action.BATTERY_OKAY");
        INTENT_BLACK_LIST.add("android.intent.action.BOOT_COMPLETED");
        INTENT_BLACK_LIST.add("android.intent.action.CONFIGURATION_CHANGED");
        INTENT_BLACK_LIST.add("android.intent.action.DEVICE_STORAGE_LOW");
        INTENT_BLACK_LIST.add("android.intent.action.DEVICE_STORAGE_OK");
        INTENT_BLACK_LIST.add("android.intent.action.DREAMING_STARTED");
        INTENT_BLACK_LIST.add("android.intent.action.DREAMING_STOPPED");
        INTENT_BLACK_LIST.add("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        INTENT_BLACK_LIST.add("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        INTENT_BLACK_LIST.add("android.intent.action.LOCALE_CHANGED");
        INTENT_BLACK_LIST.add("android.intent.action.MY_PACKAGE_REPLACED");
        INTENT_BLACK_LIST.add("android.intent.action.NEW_OUTGOING_CALL");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_ADDED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_CHANGED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_DATA_CLEARED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_FIRST_LAUNCH");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_FULLY_REMOVED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_INSTALL");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_NEEDS_VERIFICATION");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_REMOVED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_REPLACED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_RESTARTED");
        INTENT_BLACK_LIST.add("android.intent.action.PACKAGE_VERIFIED");
        INTENT_BLACK_LIST.add("android.intent.action.ACTION_POWER_CONNECTED");
        INTENT_BLACK_LIST.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        INTENT_BLACK_LIST.add("android.intent.action.REBOOT");
        INTENT_BLACK_LIST.add("android.intent.action.SCREEN_OFF");
        INTENT_BLACK_LIST.add("android.intent.action.SCREEN_ON");
        INTENT_BLACK_LIST.add("android.intent.action.ACTION_SHUTDOWN");
        INTENT_BLACK_LIST.add("android.intent.action.TIMEZONE_CHANGED");
        INTENT_BLACK_LIST.add("android.intent.action.TIME_TICK");
        INTENT_BLACK_LIST.add("android.intent.action.UID_REMOVED");
        INTENT_BLACK_LIST.add("android.intent.action.USER_PRESENT");
    }

    public static double Dist(Point point, Point point2, boolean z2) {
        double d2 = point.f29483x - point2.f29483x;
        double d4 = point.f29484y - point2.f29484y;
        return z2 ? Math.sqrt((d2 * d2) + (d4 * d4)) : (d2 * d2) + (d4 * d4);
    }

    public static String addFileNameSuffix(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            return str;
        }
        return str.substring(0, iIndexOf) + str2 + str3 + str.substring(iIndexOf);
    }

    private static boolean arrContains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean arrayContains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static void asserts(boolean z2) throws Exception {
        asserts(z2, "assert error");
    }

    public static void copyFile(String str, String str2) {
        C7083n.zy(new File(str), new File(str2));
    }

    public static String doubleToString(double d2) {
        String strValueOf = String.valueOf(d2);
        return strValueOf.endsWith(".0") ? strValueOf.substring(0, strValueOf.length() - 2) : strValueOf;
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static float getAttrAsFloat(Element element, String str, float f2) {
        String attribute = element.getAttribute(str);
        if (!TextUtils.isEmpty(attribute)) {
            try {
                return Float.parseFloat(attribute);
            } catch (NumberFormatException unused) {
            }
        }
        return f2;
    }

    public static float getAttrAsFloatThrows(Element element, String str) throws NumberFormatException {
        return Float.parseFloat(element.getAttribute(str));
    }

    public static int getAttrAsInt(Element element, String str, int i2) {
        String attribute = element.getAttribute(str);
        if (!TextUtils.isEmpty(attribute)) {
            try {
                return Integer.parseInt(attribute);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static int getAttrAsIntThrows(Element element, String str) throws NumberFormatException {
        return Integer.parseInt(element.getAttribute(str));
    }

    public static long getAttrAsLong(Element element, String str, long j2) {
        String attribute = element.getAttribute(str);
        if (!TextUtils.isEmpty(attribute)) {
            try {
                return Long.parseLong(attribute);
            } catch (NumberFormatException unused) {
            }
        }
        return j2;
    }

    public static long getAttrAsLongThrows(Element element, String str) throws NumberFormatException {
        return Long.parseLong(element.getAttribute(str));
    }

    public static Element getChild(Element element, String str) {
        if (element == null) {
            return null;
        }
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeType() == 1 && nodeItem.getNodeName().equalsIgnoreCase(str)) {
                return (Element) nodeItem;
            }
        }
        return null;
    }

    public static PorterDuff.Mode getPorterDuffMode(String str) {
        if (TextUtils.isEmpty(str)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        for (PorterDuff.Mode mode2 : PorterDuff.Mode.values()) {
            if (str.equalsIgnoreCase(mode2.name())) {
                return mode2;
            }
        }
        return mode;
    }

    public static double getVariableNumber(String str, Variables variables) {
        return new IndexedVariable(str, variables, true).getDouble();
    }

    public static String getVariableString(String str, Variables variables) {
        return new IndexedVariable(str, variables, false).getString();
    }

    public static void initContextIfNeed(Context context) {
        if (sAppContext == null) {
            sAppContext = context;
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isProtectedIntent(String str) {
        if (str == null) {
            return false;
        }
        return INTENT_BLACK_LIST.contains(str.trim());
    }

    public static int mixAlpha(int i2, int i3) {
        if (i2 >= 255) {
            i2 = i3;
        } else if (i3 < 255) {
            i2 = Math.round((i2 * i3) / 255.0f);
        }
        return Math.min(255, Math.max(0, i2));
    }

    public static String numberToString(Number number) {
        String strValueOf = String.valueOf(number);
        return strValueOf.endsWith(".0") ? strValueOf.substring(0, strValueOf.length() - 2) : strValueOf;
    }

    public static boolean onMuiltDisplayType2() {
        return SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
    }

    public static double parseDouble(String str) {
        if (str.startsWith("+") && str.length() > 1) {
            str = str.substring(1);
        }
        return Double.parseDouble(str);
    }

    public static Point pointProjectionOnSegment(Point point, Point point2, Point point3, boolean z2) {
        Point pointMinus = point2.minus(point);
        Point pointMinus2 = point3.minus(point);
        double dDist = ((pointMinus.f29483x * pointMinus2.f29483x) + (pointMinus.f29484y * pointMinus2.f29484y)) / Dist(point, point2, false);
        if (dDist < 0.0d || dDist > 1.0d) {
            if (z2) {
                return dDist < 0.0d ? point : point2;
            }
            return null;
        }
        pointMinus.f29483x *= dDist;
        pointMinus.f29484y *= dDist;
        pointMinus.Offset(point);
        return pointMinus;
    }

    public static void putVariableNumber(String str, Variables variables, Double d2) {
        variables.put(str, d2.doubleValue());
    }

    public static void putVariableString(String str, Variables variables, String str2) {
        variables.put(str, str2);
    }

    public static boolean removeFile(String str) {
        return Build.VERSION.SDK_INT > 27 ? rm(str) : Shell.remove(str);
    }

    public static boolean rm(String str) {
        File[] fileArrListFiles;
        if (isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                rm(file2.getPath());
            }
        }
        return file.delete();
    }

    public static void sendBroadcast(Context context, Intent intent) {
        if (sAcrossUsersPermission == -2) {
            sAcrossUsersPermission = context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS");
        }
        if (sAcrossUsersPermission == 0) {
            context.sendBroadcastAsUser(intent, HideSdkDependencyUtils.UserHandle_CURRENT());
        } else {
            context.sendBroadcast(intent);
        }
    }

    public static byte[] splitByteArray(String str) {
        return splitByteArray(str, 10);
    }

    public static double[] splitDoubleArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                dArr[i2] = Double.parseDouble(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
            }
        }
        return dArr;
    }

    public static int[] splitIntArray(String str) {
        return splitIntArray(str, 10);
    }

    public static String[] splitStringArray(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x001b, B:10:0x001f, B:11:0x0027), top: B:17:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void startActivity(android.content.Context r3, android.content.Intent r4, android.os.Bundle r5) {
        /*
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = "com.android.systemui"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            int r1 = com.miui.maml.util.Utils.sAcrossUsersFullPermission
            r2 = -2
            if (r1 != r2) goto L19
            java.lang.String r1 = "android.permission.INTERACT_ACROSS_USERS_FULL"
            int r1 = r3.checkSelfPermission(r1)
            com.miui.maml.util.Utils.sAcrossUsersFullPermission = r1
        L19:
            if (r0 == 0) goto L27
            int r0 = com.miui.maml.util.Utils.sAcrossUsersFullPermission     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L27
            android.os.UserHandle r0 = com.miui.maml.util.HideSdkDependencyUtils.UserHandle_CURRENT()     // Catch: java.lang.Exception -> L2b
            com.miui.maml.util.HideSdkDependencyUtils.Context_startActivityAsUser(r3, r4, r5, r0)     // Catch: java.lang.Exception -> L2b
            goto L42
        L27:
            r3.startActivity(r4, r5)     // Catch: java.lang.Exception -> L2b
            goto L42
        L2b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startActivity fail. "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "MamlUtil"
            com.miui.maml.util.MamlLog.m17853i(r4, r3)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.util.Utils.startActivity(android.content.Context, android.content.Intent, android.os.Bundle):void");
    }

    public static void startActivityBg(final Context context, final Intent intent, final Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.miui.maml.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    Utils.startActivity(context, intent, bundle);
                }
            });
        } else {
            startActivity(context, intent, bundle);
        }
    }

    public static void startService(Context context, Intent intent) {
        if (sAcrossUsersPermission == -2) {
            sAcrossUsersPermission = context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS");
        }
        if (sAcrossUsersPermission == 0) {
            HideSdkDependencyUtils.Context_startServiceAsUser(context, intent, HideSdkDependencyUtils.UserHandle_CURRENT());
        } else {
            context.startService(intent);
        }
    }

    public static double stringToDouble(String str, double d2) {
        if (str == null) {
            return d2;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public static void traverseXmlElementChildren(Element element, String str, XmlTraverseListener xmlTraverseListener) {
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeType() == 1 && (str == null || TextUtils.equals(nodeItem.getNodeName(), str))) {
                xmlTraverseListener.onChild((Element) nodeItem);
            }
        }
    }

    public static void traverseXmlElementChildrenTags(Element element, String[] strArr, XmlTraverseListener xmlTraverseListener) {
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            String nodeName = nodeItem.getNodeName();
            if (nodeItem.getNodeType() == 1 && (strArr == null || arrContains(strArr, nodeName))) {
                xmlTraverseListener.onChild((Element) nodeItem);
            }
        }
    }

    public static void triggerGC() {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
    }

    public static void writeDataToFile(String str, String str2) {
        if (isEmpty(str2)) {
            return;
        }
        try {
            C7083n.kja0(str, str2);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void asserts(boolean z2, String str) throws Exception {
        if (!z2) {
            throw new Exception(str);
        }
    }

    public static void putVariableNumber(String str, Variables variables, double d2) {
        variables.put(str, d2);
    }

    public static byte[] splitByteArray(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            try {
                bArr[i3] = Byte.parseByte(strArrSplit[i3], i2);
            } catch (NumberFormatException unused) {
            }
        }
        return bArr;
    }

    public static int[] splitIntArray(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            try {
                iArr[i3] = Integer.parseInt(strArrSplit[i3], i2);
            } catch (NumberFormatException unused) {
            }
        }
        return iArr;
    }

    public static String addFileNameSuffix(String str, String str2) {
        return addFileNameSuffix(str, "_", str2);
    }

    public static PorterDuff.Mode getPorterDuffMode(int i2) {
        return getPorterDuffMode(i2, PorterDuff.Mode.SRC_OVER);
    }

    public static PorterDuff.Mode getPorterDuffMode(int i2, PorterDuff.Mode mode) {
        for (PorterDuff.Mode mode2 : PorterDuff.Mode.values()) {
            if (mode2.ordinal() == i2) {
                return mode2;
            }
        }
        return mode;
    }
}
