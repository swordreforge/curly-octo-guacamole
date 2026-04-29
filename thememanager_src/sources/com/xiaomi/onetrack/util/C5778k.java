package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import android.util.LruCache;
import com.xiaomi.onetrack.p017f.C5756a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5778k {

    /* JADX INFO: renamed from: a */
    private static final String f32312a = "FileUtil";

    /* JADX INFO: renamed from: b */
    private static final String f32313b = "onetrack";

    /* JADX INFO: renamed from: c */
    private static final String f32314c = "tombstone";

    /* JADX INFO: renamed from: d */
    private static LruCache<String, a> f32315d = new C5779l(1048576);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.k$a */
    static class a {

        /* JADX INFO: renamed from: a */
        String f32316a;

        private a() {
        }

        /* synthetic */ a(C5779l c5779l) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.onetrack.util.l] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: a */
    public static void m20268a(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                a aVar = new a(r0);
                aVar.f32316a = str2;
                f32315d.put(str, aVar);
                String strM20270b = m20270b();
                File file = new File(strM20270b);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(strM20270b, str);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                bufferedWriter = new BufferedWriter(new FileWriter(file2), 1024);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            C5780m.m20277a(bufferedWriter);
        } catch (Exception e3) {
            r0 = bufferedWriter;
            e = e3;
            C5804p.m20351c(f32312a, "put error:" + e.toString());
            C5780m.m20277a((Closeable) r0);
        } catch (Throwable th2) {
            r0 = bufferedWriter;
            th = th2;
            C5780m.m20277a((Closeable) r0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m20270b() {
        return m20272c("onetrack");
    }

    /* JADX INFO: renamed from: c */
    private static String m20272c(String str) {
        String str2 = C5756a.m20048a().getFilesDir().getAbsolutePath() + File.separator + str;
        File file = new File(str2);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m20271b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f32315d.remove(str);
            File file = new File(m20270b(), str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e2) {
            C5804p.m20351c(f32312a, "clear error:" + e2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.onetrack.util.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: a */
    public static String m20266a(String str) throws Throwable {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        a aVar = f32315d.get(str);
        if (aVar != null) {
            return aVar.f32316a;
        }
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                File file = new File(m20270b(), str);
                StringBuilder sb = new StringBuilder();
                if (file.exists()) {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (Exception e2) {
                            e = e2;
                            r0 = bufferedReader;
                            C5804p.m20351c(f32312a, "get error:" + e.toString());
                            C5780m.m20277a((Closeable) r0);
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            r0 = bufferedReader;
                            C5780m.m20277a((Closeable) r0);
                            throw th;
                        }
                    }
                } else {
                    bufferedReader = null;
                }
                String string = sb.toString();
                a aVar2 = new a(r0);
                aVar2.f32316a = string;
                f32315d.put(str, aVar2);
                C5780m.m20277a(bufferedReader);
                return string;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20265a() {
        return m20272c(f32314c);
    }

    /* JADX INFO: renamed from: a */
    public static String[] m20269a(String str, int i2) throws Throwable {
        String[] strArr = new String[2];
        BufferedReader bufferedReader = null;
        try {
            try {
                File file = new File(str);
                StringBuilder sb = new StringBuilder();
                if (file.exists()) {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    boolean z2 = false;
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (z2) {
                                strArr[0] = line;
                                z2 = false;
                            } else if (C5769b.f32286k.equals(line)) {
                                z2 = true;
                            }
                            if (sb.length() <= i2) {
                                sb.append(line);
                                sb.append("\n");
                            } else if (!TextUtils.isEmpty(strArr[0])) {
                                break;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            C5804p.m20352c(f32312a, "readCrashFile error:", e);
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            C5780m.m20277a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedReader = bufferedReader2;
                }
                if (sb.length() > i2) {
                    strArr[1] = sb.substring(0, i2 - 1);
                } else {
                    strArr[1] = sb.toString();
                }
            } catch (Exception e3) {
                e = e3;
            }
            C5780m.m20277a(bufferedReader);
            return strArr;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20267a(File file) {
        try {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e2) {
            C5804p.m20351c(f32312a, "failed to remove file: " + file.getName() + "," + e2.toString());
        }
    }
}
