package com.xiaomi.onetrack.p016e;

import com.xiaomi.onetrack.p013b.C5720h;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.e.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5754a extends C5757b {

    /* JADX INFO: renamed from: d */
    private static final String f32099d = "CustomEvent";

    public C5754a(String str, String str2, String str3, String str4) {
        try {
            m20068a(str);
            m20074c(str3);
            m20071b(str2);
            m20070b(System.currentTimeMillis());
            m20072b(new JSONObject(str4));
            m20066a(C5720h.m19910a().m19916a(str, str3, "level", 1));
        } catch (Exception e2) {
            C5804p.m20347b(f32099d, "CustomEvent error:" + e2.toString());
        }
    }
}
