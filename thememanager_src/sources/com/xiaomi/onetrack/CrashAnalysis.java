package com.xiaomi.onetrack;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.api.C5699m;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5769b;
import com.xiaomi.onetrack.util.C5778k;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.ac;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CrashAnalysis {
    public static final String ANR_CRASH = "anr";
    public static final String JAVA_CRASH = "java";
    public static final String NATIVE_CRASH = "native";

    /* JADX INFO: renamed from: a */
    private static final String f31487a = "CrashAnalysis";

    /* JADX INFO: renamed from: b */
    private static final String f31488b = "backtrace feature id:\n\t";

    /* JADX INFO: renamed from: c */
    private static final String f31489c = "error reason:\n\t";

    /* JADX INFO: renamed from: d */
    private static final String f31490d = "Crash time: '";

    /* JADX INFO: renamed from: e */
    private static final String f31491e = ".xcrash";

    /* JADX INFO: renamed from: f */
    private static final int f31492f = 604800000;

    /* JADX INFO: renamed from: g */
    private static final int f31493g = 102400;

    /* JADX INFO: renamed from: h */
    private static final int f31494h = 10;

    /* JADX INFO: renamed from: i */
    private static final int f31495i = 20;

    /* JADX INFO: renamed from: j */
    private static final String f31496j = "@[0-9a-fA-F]{1,10}";

    /* JADX INFO: renamed from: k */
    private static final String f31497k = "\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}";

    /* JADX INFO: renamed from: l */
    private static final String f31498l = "0x[0-9a-fA-F]{1,10}";

    /* JADX INFO: renamed from: m */
    private static final String f31499m = "\\d+[B,KB,MB]*";

    /* JADX INFO: renamed from: n */
    private static final String f31500n = "((java:)|(length=)|(index=)|(Index:)|(Size:))\\d+";

    /* JADX INFO: renamed from: o */
    private static final int f31501o = 20;

    /* JADX INFO: renamed from: p */
    private static final boolean f31502p = false;

    /* JADX INFO: renamed from: s */
    private static volatile CrashAnalysis f31503s;

    /* JADX INFO: renamed from: q */
    private final FileProcessor[] f31504q;

    /* JADX INFO: renamed from: r */
    private final C5699m f31505r;

    /* JADX INFO: renamed from: t */
    private boolean f31506t;

    private CrashAnalysis(Context context, C5699m c5699m) {
        try {
            Object objNewInstance = Class.forName("xcrash.XCrash$InitParameters").getConstructor(new Class[0]).newInstance(new Object[0]);
            Boolean bool = Boolean.FALSE;
            m19610a(objNewInstance, "setNativeDumpAllThreads", bool);
            m19610a(objNewInstance, "setLogDir", getCrashPath());
            m19610a(objNewInstance, "setNativeDumpMap", bool);
            m19610a(objNewInstance, "setNativeDumpFds", bool);
            m19610a(objNewInstance, "setJavaDumpAllThreads", bool);
            Class.forName("xcrash.XCrash").getDeclaredMethod("init", Context.class, objNewInstance.getClass()).invoke(null, context.getApplicationContext(), objNewInstance);
            C5804p.m20342a(f31487a, "XCrash init success");
            this.f31506t = true;
        } catch (Throwable th) {
            C5804p.m20352c(f31487a, "XCrash init failed: ", th);
        }
        this.f31505r = c5699m;
        this.f31504q = new FileProcessor[]{new FileProcessor("java"), new FileProcessor(ANR_CRASH), new FileProcessor(NATIVE_CRASH)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static String m19614c(String str, String str2) {
        String strM20237b;
        int iIndexOf;
        int iIndexOf2;
        if (TextUtils.isEmpty(str)) {
            return "uncategoried";
        }
        try {
            if (str2.equals(ANR_CRASH)) {
                int iIndexOf3 = str.indexOf(" tid=1 ");
                if (iIndexOf3 == -1 || (iIndexOf = str.indexOf("\n  at ", iIndexOf3)) == -1 || (iIndexOf2 = str.indexOf(10, iIndexOf + 6)) == -1) {
                    return "uncategoried";
                }
                strM20237b = str.substring(iIndexOf + 2, iIndexOf2);
            } else {
                int iIndexOf4 = str.indexOf(f31489c);
                if (iIndexOf4 != -1) {
                    int i2 = iIndexOf4 + 15;
                    int iIndexOf5 = str.indexOf("\n\n", i2);
                    if (iIndexOf5 == -1) {
                        return "uncategoried";
                    }
                    strM20237b = str.substring(i2, iIndexOf5);
                } else {
                    if (!str2.equals(NATIVE_CRASH)) {
                        return "uncategoried";
                    }
                    strM20237b = C5769b.m20237b(str);
                    if (TextUtils.isEmpty(strM20237b)) {
                        return "uncategoried";
                    }
                }
            }
            return strM20237b;
        } catch (Exception e2) {
            C5804p.m20347b(f31487a, "getErrorReasonString error: " + e2.toString());
            return "uncategoried";
        }
    }

    public static String calculateJavaDigest(String str) {
        String[] strArrSplit = str.replaceAll("\\t", "").split("\\n");
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(strArrSplit.length, 20);
        for (int i2 = 0; i2 < iMin; i2++) {
            strArrSplit[i2] = strArrSplit[i2].replaceAll(f31500n, "$1XX").replaceAll("\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}|@[0-9a-fA-F]{1,10}|0x[0-9a-fA-F]{1,10}", "XX").replaceAll(f31499m, "");
        }
        for (int i3 = 0; i3 < iMin && (!strArrSplit[i3].contains("...") || !strArrSplit[i3].contains("more")); i3++) {
            sb.append(strArrSplit[i3]);
            sb.append('\n');
        }
        return C5750d.m20034h(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m19618d(String str, String str2) {
        int i2;
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str2.equals(ANR_CRASH)) {
                int iIndexOf3 = str.indexOf(" tid=1 ");
                if (iIndexOf3 == -1 || (iIndexOf2 = str.indexOf("\n\n", iIndexOf3)) == -1) {
                    return "";
                }
                strSubstring = calculateJavaDigest(str.substring(iIndexOf3, iIndexOf2));
            } else {
                int iIndexOf4 = str.indexOf(f31488b);
                if (iIndexOf4 == -1 || (iIndexOf = str.indexOf("\n\n", (i2 = iIndexOf4 + 23))) == -1) {
                    return "";
                }
                strSubstring = str.substring(i2, iIndexOf);
            }
            return strSubstring;
        } catch (Exception e2) {
            C5804p.m20347b(f31487a, "calculateFeatureId error: " + e2.toString());
            return "";
        }
    }

    public static String getCrashPath() {
        return C5778k.m20265a();
    }

    public static CrashAnalysis getInstance() {
        if (f31503s == null) {
            C5804p.m20347b(f31487a, "CrashAnalysis.init should be called before");
        }
        return f31503s;
    }

    public static CrashAnalysis init(Context context, C5699m c5699m) {
        if (f31503s == null) {
            synchronized (CrashAnalysis.class) {
                if (f31503s == null) {
                    f31503s = new CrashAnalysis(context, c5699m);
                }
            }
        }
        return f31503s;
    }

    public boolean isSupport() {
        return this.f31506t;
    }

    public void start() {
        try {
            if (m19616c()) {
                m19619d();
            } else {
                C5804p.m20342a(f31487a, "no crash file found");
            }
        } catch (Throwable th) {
            C5804p.m20348b(f31487a, "processCrash error: ", th);
        }
    }

    private class FileProcessor {

        /* JADX INFO: renamed from: a */
        final List<File> f31508a = new ArrayList();

        /* JADX INFO: renamed from: b */
        final String f31509b;

        /* JADX INFO: renamed from: c */
        final String f31510c;

        FileProcessor(String str) {
            this.f31510c = str;
            this.f31509b = str + CrashAnalysis.f31491e;
        }

        /* JADX INFO: renamed from: a */
        boolean m19622a(File file) {
            if (!file.getName().contains(this.f31509b)) {
                return false;
            }
            this.f31508a.add(file);
            return true;
        }

        /* JADX INFO: renamed from: a */
        private String m19620a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArrSplit = str.split("__");
            if (strArrSplit.length != 2) {
                return null;
            }
            String[] strArrSplit2 = strArrSplit[0].split("_");
            if (strArrSplit2.length == 3) {
                return strArrSplit2[2];
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        void m19621a() throws Throwable {
            for (int i2 = 0; i2 < this.f31508a.size(); i2++) {
                String absolutePath = this.f31508a.get(i2).getAbsoluteFile().getAbsolutePath();
                String strM19620a = m19620a(absolutePath);
                String[] strArrM20269a = C5778k.m20269a(absolutePath, CrashAnalysis.f31493g);
                if (!TextUtils.isEmpty(strArrM20269a[1]) && CrashAnalysis.this.f31505r != null) {
                    String strM19618d = CrashAnalysis.m19618d(strArrM20269a[1], this.f31510c);
                    String strM19614c = CrashAnalysis.m19614c(strArrM20269a[1], this.f31510c);
                    long jM19617d = CrashAnalysis.m19617d(strArrM20269a[1]);
                    Map<String, Object> mapM19615c = CrashAnalysis.m19615c(strArrM20269a[0]);
                    C5804p.m20342a(CrashAnalysis.f31487a, "fileName: " + absolutePath);
                    C5804p.m20342a(CrashAnalysis.f31487a, "feature id: " + strM19618d);
                    C5804p.m20342a(CrashAnalysis.f31487a, "error: " + strM19614c);
                    C5804p.m20342a(CrashAnalysis.f31487a, "crashTimeStamp: " + jM19617d);
                    StringBuilder sb = new StringBuilder();
                    sb.append("dynamicCommonProperty: ");
                    sb.append(mapM19615c == null ? "" : mapM19615c.toString());
                    C5804p.m20342a(CrashAnalysis.f31487a, sb.toString());
                    CrashAnalysis.this.f31505r.m19852a(strArrM20269a[1], strM19614c, this.f31510c, strM19620a, strM19618d, jM19617d, mapM19615c);
                    C5778k.m20267a(new File(absolutePath));
                    C5804p.m20342a(CrashAnalysis.f31487a, "remove reported crash file");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private List<File> m19612b() {
        File[] fileArrListFiles = new File(getCrashPath()).listFiles();
        if (fileArrListFiles == null) {
            C5804p.m20342a(f31487a, "this path does not denote a directory, or if an I/O error occurs.");
            return null;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new Comparator<File>() { // from class: com.xiaomi.onetrack.CrashAnalysis.1
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return (int) (file.lastModified() - file2.lastModified());
            }
        });
        int size = listAsList.size();
        if (size <= 20) {
            return listAsList;
        }
        int i2 = size - 20;
        for (int i3 = 0; i3 < i2; i3++) {
            C5778k.m20267a(listAsList.get(i3));
        }
        return listAsList.subList(i2, size);
    }

    /* JADX INFO: renamed from: a */
    static void m19609a(Context context) {
        try {
            C5756a.m20050a(context.getApplicationContext());
            Class.forName("xcrash.XCrash").getDeclaredMethod("initHooker", Context.class, String.class).invoke(null, context.getApplicationContext(), getCrashPath());
            C5804p.m20342a(f31487a, "registerHook succeeded");
        } catch (Throwable th) {
            C5804p.m20352c(f31487a, "registerHook failed: ", th);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m19610a(Object obj, String str, Object obj2) throws Exception {
        obj.getClass().getDeclaredMethod(str, obj2.getClass() == Boolean.class ? Boolean.TYPE : obj2.getClass()).invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static long m19617d(String str) {
        int i2;
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            int iIndexOf2 = str.indexOf(f31490d);
            if (iIndexOf2 == -1 || (iIndexOf = str.indexOf("'\n", (i2 = iIndexOf2 + 13))) == -1) {
                return 0L;
            }
            return C5769b.m20228a(str.substring(i2, iIndexOf));
        } catch (Exception e2) {
            C5804p.m20347b(f31487a, "getCrashTimeStamp error: " + e2.toString());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    private long m19604a() {
        long jM20168c = aa.m20168c();
        if (jM20168c == 0) {
            C5804p.m20342a(f31487a, "no ticket data found, return max count");
            return 10L;
        }
        long jM20224b = ac.m20224b();
        if (jM20168c / 100 != jM20224b) {
            C5804p.m20342a(f31487a, "no today's ticket, return max count");
            return 10L;
        }
        long j2 = jM20168c - (jM20224b * 100);
        C5804p.m20342a(f31487a, "today's remain ticket is " + j2);
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static Map<String, Object> m19615c(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str.substring(1));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.opt(next));
                }
            } catch (Exception e2) {
                C5804p.m20348b(f31487a, "getDynamicCommonProperty error：", e2);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    private void m19619d() throws Throwable {
        for (FileProcessor fileProcessor : this.f31504q) {
            fileProcessor.m19621a();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m19608a(long j2) {
        aa.m20174d((ac.m20224b() * 100) + j2);
    }

    /* JADX INFO: renamed from: c */
    private boolean m19616c() {
        boolean z2;
        Iterator<File> it;
        List<File> listM19612b = m19612b();
        long jM19604a = m19604a();
        if (listM19612b == null || listM19612b.size() <= 0) {
            z2 = false;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM20161b = aa.m20161b();
            long j2 = ac.f32265a;
            if (jM20161b > jCurrentTimeMillis) {
                jM20161b = jCurrentTimeMillis - ac.f32265a;
            }
            Iterator<File> it2 = listM19612b.iterator();
            long j3 = 0;
            long j4 = 0;
            boolean z3 = false;
            while (it2.hasNext()) {
                File next = it2.next();
                long jLastModified = next.lastModified();
                if (jLastModified < jCurrentTimeMillis - j2 || jLastModified > jCurrentTimeMillis) {
                    it = it2;
                    C5804p.m20342a(f31487a, "remove obsolete crash files: " + next.getName());
                    C5778k.m20267a(next);
                } else {
                    if (jLastModified <= jM20161b) {
                        C5804p.m20342a(f31487a, "found already reported crash file, ignore");
                    } else if (jM19604a > j3) {
                        FileProcessor[] fileProcessorArr = this.f31504q;
                        int length = fileProcessorArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            Iterator<File> it3 = it2;
                            if (fileProcessorArr[i2].m19622a(next)) {
                                C5804p.m20342a(f31487a, "find crash file:" + next.getName());
                                jM19604a--;
                                if (j4 < jLastModified) {
                                    j4 = jLastModified;
                                }
                                z3 = true;
                            }
                            i2++;
                            it2 = it3;
                        }
                    }
                    it = it2;
                }
                it2 = it;
                j2 = ac.f32265a;
                j3 = 0;
            }
            if (j4 > j3) {
                aa.m20169c(j4);
            }
            z2 = z3;
        }
        if (z2) {
            m19608a(jM19604a);
        }
        return z2;
    }
}
