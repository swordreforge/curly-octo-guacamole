package com.xiaomi.onetrack.p013b;

import android.text.TextUtils;
import com.xiaomi.onetrack.p015d.C5752f;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.n */
/* JADX INFO: loaded from: classes3.dex */
public class C5726n {

    /* JADX INFO: renamed from: a */
    private static String f31977a = "ConfigProvider";

    /* JADX INFO: renamed from: b */
    private static volatile boolean f31978b = false;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f31979c = true;

    /* JADX INFO: renamed from: a */
    public static boolean m19933a() {
        try {
            String[] strArrM20043b = C5752f.m20039a().m20043b();
            return (!TextUtils.isEmpty(strArrM20043b[0]) && !TextUtils.isEmpty(strArrM20043b[1])) && !C5805q.m20361a(f31977a);
        } catch (Exception e2) {
            C5804p.m20344a(f31977a, "ConfigProvider.available", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m19935b() {
        return f31978b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19936c() {
        return f31979c;
    }

    /* JADX INFO: renamed from: b */
    public static void m19934b(boolean z2) {
        f31979c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static int m19931a(int i2) {
        int iIntValue;
        if (C5804p.f32411b) {
            C5804p.m20342a(f31977a, "debug upload mode, send events immediately");
            return 0;
        }
        try {
            iIntValue = C5717e.m19903c().get(Integer.valueOf(i2 + 1)).intValue();
        } catch (Exception unused) {
            iIntValue = 60000;
        }
        C5804p.m20342a(f31977a, "getUploadInterval " + iIntValue);
        return iIntValue;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m19932a(boolean z2) {
        f31978b = z2;
    }
}
