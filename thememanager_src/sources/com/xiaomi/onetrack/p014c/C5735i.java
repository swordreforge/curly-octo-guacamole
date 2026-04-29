package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.InterfaceC5696j;
import com.xiaomi.onetrack.p015d.C5749c;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5776i;
import com.xiaomi.onetrack.util.C5780m;
import com.xiaomi.onetrack.util.C5804p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5735i {

    /* JADX INFO: renamed from: a */
    public static final long f32017a = 0;

    /* JADX INFO: renamed from: b */
    public static final long f32018b = 1;

    /* JADX INFO: renamed from: c */
    public static final long f32019c = 2;

    /* JADX INFO: renamed from: d */
    public static final String f32020d = "eventName";

    /* JADX INFO: renamed from: e */
    public static final String f32021e = "data";

    /* JADX INFO: renamed from: f */
    private static final String f32022f = "NetworkAccessManager";

    /* JADX INFO: renamed from: g */
    private static final String f32023g = "networkAccess";

    /* JADX INFO: renamed from: h */
    private static String f32024h = "onetrack_netaccess_%s";

    /* JADX INFO: renamed from: i */
    private static SimpleDateFormat f32025i = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: j */
    private static boolean f32026j = false;

    /* JADX INFO: renamed from: k */
    private static volatile boolean f32027k = true;

    /* JADX INFO: renamed from: l */
    private static volatile boolean f32028l = false;

    /* JADX INFO: renamed from: a */
    public static boolean m19959a() {
        return f32026j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static synchronized void m19964c(String str, String str2) {
        FileWriter fileWriter;
        byte[] bArrM19947a;
        BufferedWriter bufferedWriter;
        File file = new File(m19968e(), String.format(f32024h, f32025i.format(new Date())));
        BufferedWriter bufferedWriter2 = null;
        try {
            if (!file.exists()) {
                if (file.getParentFile().exists()) {
                    file.createNewFile();
                } else {
                    new File(file.getParentFile().getAbsolutePath()).mkdirs();
                    file.createNewFile();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", str);
            jSONObject.put("data", str2);
            bArrM19947a = C5729c.m19947a(jSONObject.toString());
            fileWriter = new FileWriter(file, true);
            try {
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
            fileWriter = null;
        } catch (Throwable th2) {
            th = th2;
            fileWriter = null;
        }
        try {
            bufferedWriter.write(C5749c.m20012a(bArrM19947a));
            bufferedWriter.newLine();
            f32027k = true;
            C5780m.m20277a(bufferedWriter);
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            C5804p.m20347b(f32022f, "cta doSaveData error: " + e.toString());
            e.printStackTrace();
            C5780m.m20277a(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            C5780m.m20277a(bufferedWriter2);
            C5780m.m20277a(fileWriter);
            throw th;
        }
        C5780m.m20277a(fileWriter);
    }

    /* JADX INFO: renamed from: e */
    private static String m19968e() {
        return C5756a.m20048a().getFilesDir().getAbsolutePath() + File.separator + f32023g;
    }

    /* JADX INFO: renamed from: a */
    public static void m19958a(boolean z2) {
        f32026j = z2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19962b() {
        return !new File(C5756a.m20048a().getFilesDir(), ".ot_net_disallowed").exists();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19966d() {
        return !f32028l && f32027k;
    }

    /* JADX INFO: renamed from: a */
    public static void m19957a(String str, String str2) {
        C5776i.m20256a(new RunnableC5736j(str, str2));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m19956a(InterfaceC5696j interfaceC5696j) {
        if (m19966d()) {
            if (interfaceC5696j != null && m19962b() && !OneTrack.isDisable()) {
                f32028l = true;
                C5776i.m20256a(new RunnableC5737k(interfaceC5696j));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19961b(boolean z2) {
        File file = new File(C5756a.m20048a().getFilesDir(), ".ot_net_allowed");
        File file2 = new File(C5756a.m20048a().getFilesDir(), ".ot_net_disallowed");
        try {
            if (z2) {
                file.createNewFile();
                if (file2.exists()) {
                    file2.delete();
                }
            } else {
                file2.createNewFile();
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (IOException e2) {
            C5804p.m20348b(f32022f, "setNetworkAccessStateEnabled: " + z2 + "failed ", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m19965c(boolean z2) {
        File file;
        try {
            file = new File(m19968e());
        } catch (Exception e2) {
            C5804p.m20347b(f32022f, "cta removeObsoleteEvent error: " + e2.toString());
            e2.printStackTrace();
        }
        if (file.exists() && file.isDirectory()) {
            String str = String.format(f32024h, f32025i.format(new Date()));
            File[] fileArrListFiles = file.listFiles();
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                if (fileArrListFiles[i2].isFile() && (z2 || !fileArrListFiles[i2].getName().equalsIgnoreCase(str))) {
                    fileArrListFiles[i2].delete();
                }
            }
            if (file.listFiles().length == 0) {
                f32027k = false;
            }
            return;
        }
        f32027k = false;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized List<JSONObject> m19963c() {
        FileReader fileReader;
        Exception e2;
        BufferedReader bufferedReader;
        File file = new File(m19968e(), String.format(f32024h, f32025i.format(new Date())));
        BufferedReader bufferedReader2 = null;
        if (!file.exists()) {
            return null;
        }
        List<JSONObject> arrayList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
        } catch (Exception e3) {
            fileReader = null;
            e2 = e3;
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
            fileReader = null;
        }
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
                        C5804p.m20347b(f32022f, "cta getCacheData error: " + e2.toString());
                        e2.printStackTrace();
                        C5780m.m20277a(bufferedReader);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    C5780m.m20277a(bufferedReader2);
                    C5780m.m20277a(fileReader);
                    throw th;
                }
            }
            C5780m.m20277a(bufferedReader);
        } catch (Exception e6) {
            e2 = e6;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            C5780m.m20277a(bufferedReader2);
            C5780m.m20277a(fileReader);
            throw th;
        }
        C5780m.m20277a(fileReader);
        if (arrayList.size() > 200) {
            arrayList = arrayList.subList(arrayList.size() - 200, arrayList.size());
        }
        if (arrayList.size() > 0) {
            f32027k = true;
        }
        return arrayList;
    }
}
