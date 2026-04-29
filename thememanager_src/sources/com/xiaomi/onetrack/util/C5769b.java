package com.xiaomi.onetrack.util;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.system.Os;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5769b {

    /* JADX INFO: renamed from: a */
    static final String f32276a = "2.1.4";

    /* JADX INFO: renamed from: b */
    static final String f32277b = "OneTrack 2.1.4";

    /* JADX INFO: renamed from: c */
    static final String f32278c = "CrashUtil";

    /* JADX INFO: renamed from: d */
    public static final String f32279d = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";

    /* JADX INFO: renamed from: e */
    public static final String f32280e = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";

    /* JADX INFO: renamed from: f */
    public static final String f32281f = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";

    /* JADX INFO: renamed from: g */
    static final String f32282g = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    /* JADX INFO: renamed from: h */
    public static final String f32283h = "java";

    /* JADX INFO: renamed from: i */
    static final String f32284i = "tombstone";

    /* JADX INFO: renamed from: j */
    static final String f32285j = ".java.xcrash";

    /* JADX INFO: renamed from: k */
    public static final String f32286k = "dynamic common property:";

    /* JADX INFO: renamed from: l */
    public static final String f32287l = "dynamic common property:\n\t";

    /* JADX INFO: renamed from: m */
    private static final String f32288m = "%21s %8s\n";

    /* JADX INFO: renamed from: n */
    private static final String f32289n = "%21s %8s %21s %8s\n";

    /* JADX INFO: renamed from: o */
    private static final String[] f32290o = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    private C5769b() {
    }

    /* JADX INFO: renamed from: a */
    public static String m20231a(Context context, int i2) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i2 + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    String strTrim = line.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        return strTrim;
                    }
                }
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        try {
            bufferedReader.close();
        } catch (Exception unused5) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    static String m20236b() {
        return TextUtils.join(",", Build.SUPPORTED_ABIS);
    }

    /* JADX INFO: renamed from: c */
    static String m20238c() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, f32288m, "", "Pss(KB)"));
        sb.append(String.format(locale, f32288m, "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, f32288m, "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
            sb.append(String.format(locale, f32288m, "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
            sb.append(String.format(locale, f32288m, "Code:", memoryInfo.getMemoryStat("summary.code")));
            sb.append(String.format(locale, f32288m, "Stack:", memoryInfo.getMemoryStat("summary.stack")));
            sb.append(String.format(locale, f32288m, "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
            sb.append(String.format(locale, f32288m, "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
            sb.append(String.format(locale, f32288m, "System:", memoryInfo.getMemoryStat("summary.system")));
            sb.append(String.format(locale, f32289n, "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
        } catch (Exception e2) {
            C5804p.m20348b(f32278c, "CrashUtil getProcessMemoryInfo failed", e2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m20240d() {
        return "memory info:\n System Summary (From: /proc/meminfo)\n" + m20239c("/proc/meminfo") + "-\n Process Status (From: /proc/PID/status)\n" + m20239c("/proc/self/status") + "-\n Process Limits (From: /proc/PID/limits)\n" + m20239c("/proc/self/limits") + "-\n" + m20238c() + "\n";
    }

    /* JADX INFO: renamed from: e */
    public static String m20241e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "network info:\nNot supported on Android Q (API level 29) and later.\n\n";
        }
        return "network info:\n TCP over IPv4 (From: /proc/PID/net/tcp)\n" + m20232a("/proc/self/net/tcp", 1024) + "-\n TCP over IPv6 (From: /proc/PID/net/tcp6)\n" + m20232a("/proc/self/net/tcp6", 1024) + "-\n UDP over IPv4 (From: /proc/PID/net/udp)\n" + m20232a("/proc/self/net/udp", 1024) + "-\n UDP over IPv6 (From: /proc/PID/net/udp6)\n" + m20232a("/proc/self/net/udp6", 1024) + "-\n ICMP in IPv4 (From: /proc/PID/net/icmp)\n" + m20232a("/proc/self/net/icmp", 256) + "-\n ICMP in IPv6 (From: /proc/PID/net/icmp6)\n" + m20232a("/proc/self/net/icmp6", 256) + "-\n UNIX domain (From: /proc/PID/net/unix)\n" + m20232a("/proc/self/net/unix", 256) + "\n";
    }

    /* JADX INFO: renamed from: f */
    public static String m20242f() {
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles(new C5770c());
            if (fileArrListFiles != null) {
                int i2 = 0;
                for (File file : fileArrListFiles) {
                    String str = null;
                    try {
                        str = Os.readlink(file.getAbsolutePath());
                    } catch (Exception unused) {
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    sb.append(TextUtils.isEmpty(str) ? "???" : str.trim());
                    sb.append('\n');
                    i2++;
                    if (i2 > 1024) {
                        break;
                    }
                }
                if (fileArrListFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(fileArrListFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append('\n');
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m20237b(String str) {
        int iIndexOf;
        int iIndexOf2;
        try {
            int iIndexOf3 = str.indexOf("\nbacktrace:\n");
            return (iIndexOf3 == -1 || (iIndexOf = str.indexOf("(", iIndexOf3 + 12)) == -1 || (iIndexOf2 = str.indexOf(41, iIndexOf + 12)) == -1) ? "" : str.substring(iIndexOf, iIndexOf2 + 1);
        } catch (Exception e2) {
            C5804p.m20348b(f32278c, "getErrorReason error, e: ", e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m20235a() {
        try {
            for (String str : f32290o) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m20230a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: a */
    private static String m20232a(String str, int i2) throws Throwable {
        BufferedReader bufferedReader;
        int i3;
        StringBuilder sb = new StringBuilder();
        ?? r1 = 0;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(str));
                    i3 = 0;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception unused) {
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (strTrim.length() > 0) {
                    i3++;
                    if (i2 == 0 || i3 <= i2) {
                        sb.append("  ");
                        sb.append(strTrim);
                        sb.append("\n");
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader2 = bufferedReader;
                C5804p.m20352c(f32278c, "CrashUtil getInfo(" + str + ") failed", e);
                r1 = bufferedReader2;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                    r1 = bufferedReader2;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = bufferedReader;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            return sb.toString();
        }
        if (i2 > 0 && i3 > i2) {
            sb.append("  ......\n");
            sb.append("  (number of records: ");
            sb.append(i3);
            sb.append(")\n");
        }
        bufferedReader.close();
        r1 = i3;
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m20239c(String str) {
        return m20232a(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m20233a(Date date, Date date2, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f32282g, Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nTombstone maker: 'OneTrack 2.1.4'\nCrash type: '");
        sb.append(str);
        sb.append("'\nStart time: '");
        sb.append(simpleDateFormat.format(date));
        sb.append("'\nCrash time: '");
        sb.append(simpleDateFormat.format(date2));
        sb.append("'\nApp ID: '");
        sb.append(str2);
        sb.append("'\nApp version: '");
        sb.append(str3);
        sb.append("'\nRooted: '");
        sb.append(m20235a() ? "Yes" : "No");
        sb.append("'\nAPI level: '");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("'\nOS version: '");
        sb.append(Build.VERSION.RELEASE);
        sb.append("'\nABI list: '");
        sb.append(m20236b());
        sb.append("'\nManufacturer: '");
        sb.append(Build.MANUFACTURER);
        sb.append("'\nBrand: '");
        sb.append(Build.BRAND);
        sb.append("'\nModel: '");
        sb.append(Build.MODEL);
        sb.append("'\nBuild fingerprint: '");
        sb.append(Build.FINGERPRINT);
        sb.append("'\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m20229a(int i2, int i3, int i4) throws Throwable {
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append("logcat:\n");
        if (i2 > 0) {
            m20234a(iMyPid, sb, "main", i2, 'D');
        }
        if (i3 > 0) {
            m20234a(iMyPid, sb, "system", i3, 'W');
        }
        if (i4 > 0) {
            m20234a(iMyPid, sb, "events", i3, 'I');
        }
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.BufferedReader] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m20234a(int r3, java.lang.StringBuilder r4, java.lang.String r5, int r6, char r7) throws java.lang.Throwable {
        /*
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "/system/bin/logcat"
            r0.add(r2)
            java.lang.String r2 = "-b"
            r0.add(r2)
            r0.add(r5)
            java.lang.String r2 = "-d"
            r0.add(r2)
            java.lang.String r2 = "-v"
            r0.add(r2)
            java.lang.String r2 = "threadtime"
            r0.add(r2)
            java.lang.String r2 = "-t"
            r0.add(r2)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r0.add(r6)
            java.lang.String r6 = "--pid"
            r0.add(r6)
            r0.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "*:"
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            java.lang.Object[] r3 = r0.toArray()
            java.lang.String r6 = "--------- tail end of log "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " ("
            r4.append(r5)
            java.lang.String r3 = android.text.TextUtils.join(r1, r3)
            r4.append(r3)
            java.lang.String r3 = ")\n"
            r4.append(r3)
            r3 = 0
            java.lang.ProcessBuilder r5 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            java.lang.ProcessBuilder r5 = r5.command(r0)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            java.lang.Process r5 = r5.start()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb2
        L99:
            java.lang.String r3 = r6.readLine()     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lc0
            if (r3 == 0) goto La8
            r4.append(r3)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lc0
            java.lang.String r3 = "\n"
            r4.append(r3)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lc0
            goto L99
        La8:
            r6.close()     // Catch: java.io.IOException -> Lbf
            goto Lbf
        Lac:
            r3 = move-exception
            goto Lb5
        Lae:
            r4 = move-exception
            r6 = r3
            r3 = r4
            goto Lc1
        Lb2:
            r4 = move-exception
            r6 = r3
            r3 = r4
        Lb5:
            java.lang.String r4 = "CrashUtil"
            java.lang.String r5 = "CrashUtil run logcat command failed"
            com.xiaomi.onetrack.util.C5804p.m20348b(r4, r5, r3)     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto Lbf
            goto La8
        Lbf:
            return
        Lc0:
            r3 = move-exception
        Lc1:
            if (r6 == 0) goto Lc6
            r6.close()     // Catch: java.io.IOException -> Lc6
        Lc6:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.onetrack.util.C5769b.m20234a(int, java.lang.StringBuilder, java.lang.String, int, char):void");
    }

    /* JADX INFO: renamed from: a */
    public static long m20228a(String str) {
        try {
            return new SimpleDateFormat(f32282g, Locale.US).parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }
}
