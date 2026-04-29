package com.xiaomi.onetrack.p014c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.xiaomi.onetrack.p015d.C5749c;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5780m;
import com.xiaomi.onetrack.util.C5804p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.l */
/* JADX INFO: loaded from: classes3.dex */
public class C5738l {

    /* JADX INFO: renamed from: a */
    public static final String f32032a = "eventName";

    /* JADX INFO: renamed from: b */
    public static final String f32033b = "data";

    /* JADX INFO: renamed from: c */
    private static final String f32034c = "SystemImpCacheManager";

    /* JADX INFO: renamed from: d */
    private static final String f32035d = "systemimp_cache";

    /* JADX INFO: renamed from: e */
    private static String f32036e = "systemimp_cache_%s";

    /* JADX INFO: renamed from: f */
    private static volatile C5738l f32037f = null;

    /* JADX INFO: renamed from: g */
    private static String f32038g = "system_imp_cache_manager";

    /* JADX INFO: renamed from: h */
    private Handler f32039h;

    private C5738l() {
        try {
            HandlerThread handlerThread = new HandlerThread(f32038g);
            handlerThread.start();
            this.f32039h = new Handler(handlerThread.getLooper());
        } catch (Throwable th) {
            C5804p.m20347b(f32034c, "SystemImpCacheManager init Throwable: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19972b() {
        if (f32037f == null) {
            synchronized (C5738l.class) {
                if (f32037f == null) {
                    f32037f = new C5738l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m19974c() {
        return C5756a.m20048a().getFilesDir().getAbsolutePath() + File.separator + f32035d;
    }

    /* JADX INFO: renamed from: a */
    public static C5738l m19969a() {
        if (f32037f == null) {
            m19972b();
        }
        return f32037f;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m19977c(String str) {
        if (this.f32039h != null && !TextUtils.isEmpty(str)) {
            this.f32039h.post(new RunnableC5740n(this, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19976a(String str, String str2, String str3) {
        if (this.f32039h == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f32039h.post(new RunnableC5739m(this, str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized void m19973b(String str, String str2, String str3) {
        BufferedWriter bufferedWriter;
        FileWriter fileWriter = null;
        try {
            File file = new File(m19974c(), String.format(f32036e, str));
            if (!file.exists()) {
                if (file.getParentFile().exists()) {
                    file.createNewFile();
                } else {
                    new File(file.getParentFile().getAbsolutePath()).mkdirs();
                    file.createNewFile();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", str2);
            jSONObject.put("data", str3);
            byte[] bArrM19947a = C5729c.m19947a(jSONObject.toString());
            FileWriter fileWriter2 = new FileWriter(file, true);
            try {
                bufferedWriter = new BufferedWriter(fileWriter2);
                try {
                    bufferedWriter.write(C5749c.m20012a(bArrM19947a));
                    bufferedWriter.newLine();
                    C5780m.m20277a(bufferedWriter);
                    C5780m.m20277a(fileWriter2);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    try {
                        C5804p.m20347b(f32034c, "systemimp doSaveData error: " + th.getMessage());
                    } finally {
                        C5780m.m20277a(bufferedWriter);
                        C5780m.m20277a(fileWriter);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r0[r3].delete();
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m19975a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = m19974c()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 == 0) goto L47
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 != 0) goto L17
            goto L47
        L17:
            java.lang.String r1 = com.xiaomi.onetrack.p014c.C5738l.f32036e     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r5 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L27:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r3 >= r1) goto L66
            r1 = r0[r3]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r1 = r1.isFile()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 == 0) goto L44
            r1 = r0[r3]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r1 = r1.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 == 0) goto L44
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r5.delete()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            goto L66
        L44:
            int r3 = r3 + 1
            goto L27
        L47:
            monitor-exit(r4)
            return
        L49:
            r5 = move-exception
            goto L68
        L4b:
            r5 = move-exception
            java.lang.String r0 = "SystemImpCacheManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "systemimp removeObsoleteEvent error: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L49
            r1.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L49
            com.xiaomi.onetrack.util.C5804p.m20347b(r0, r5)     // Catch: java.lang.Throwable -> L49
        L66:
            monitor-exit(r4)
            return
        L68:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.onetrack.p014c.C5738l.m19975a(java.lang.String):void");
    }

    /* JADX INFO: renamed from: b */
    public static synchronized List<JSONObject> m19971b(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Exception e2;
        ArrayList arrayList;
        File file;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                file = new File(m19974c(), String.format(f32036e, str));
            } catch (Throwable th) {
                th = th;
                fileReader = null;
            }
        } catch (Exception e3) {
            bufferedReader = null;
            fileReader = null;
            e2 = e3;
            arrayList = null;
        }
        if (!file.exists()) {
            C5780m.m20277a((Closeable) null);
            C5780m.m20277a((Closeable) null);
            return null;
        }
        arrayList = new ArrayList();
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            arrayList.add(new JSONObject(C5729c.m19944a(C5749c.m20014a(line))));
                        } catch (Exception e4) {
                            e2 = e4;
                            C5804p.m20347b(f32034c, "cta getCacheData error: " + e2.toString());
                            e2.printStackTrace();
                            C5780m.m20277a(bufferedReader);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                    }
                }
                C5780m.m20277a(bufferedReader);
            } catch (Exception e6) {
                bufferedReader = null;
                e2 = e6;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            fileReader = null;
            e2 = e7;
            bufferedReader = null;
        }
        C5780m.m20277a(fileReader);
        return arrayList;
        C5780m.m20277a(bufferedReader2);
        C5780m.m20277a(fileReader);
        throw th;
    }
}
