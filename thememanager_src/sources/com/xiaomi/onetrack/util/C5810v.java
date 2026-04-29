package com.xiaomi.onetrack.util;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.C5693g;
import com.xiaomi.onetrack.p017f.C5756a;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.v */
/* JADX INFO: loaded from: classes3.dex */
public class C5810v {

    /* JADX INFO: renamed from: a */
    private static final String f32453a = "custom_open";

    /* JADX INFO: renamed from: b */
    private static final String f32454b = "custom_close";

    /* JADX INFO: renamed from: c */
    private static final String f32455c = "exprience_open";

    /* JADX INFO: renamed from: d */
    private static final String f32456d = "exprience_close";

    /* JADX INFO: renamed from: e */
    private static final String f32457e = "PrivacyManager";

    /* JADX INFO: renamed from: k */
    private static final long f32458k = 900000;

    /* JADX INFO: renamed from: f */
    private OneTrack.IEventHook f32459f;

    /* JADX INFO: renamed from: g */
    private Configuration f32460g;

    /* JADX INFO: renamed from: h */
    private boolean f32461h;

    /* JADX INFO: renamed from: i */
    private boolean f32462i;

    /* JADX INFO: renamed from: j */
    private long f32463j = 0;

    public C5810v(Configuration configuration) {
        this.f32460g = configuration;
        this.f32461h = aa.m20196k(C5806r.m20374a(configuration));
    }

    /* JADX INFO: renamed from: b */
    private boolean m20395b(String str) {
        return "onetrack_dau".equals(str) || C5693g.f31791g.equals(str);
    }

    /* JADX INFO: renamed from: c */
    private boolean m20396c(String str) {
        OneTrack.IEventHook iEventHook = this.f32459f;
        return iEventHook != null && iEventHook.isRecommendEvent(str);
    }

    /* JADX INFO: renamed from: d */
    private boolean m20397d(String str) {
        OneTrack.IEventHook iEventHook = this.f32459f;
        return iEventHook != null && iEventHook.isCustomDauEvent(str);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20401a(String str) {
        boolean zM20394b;
        boolean zIsUseCustomPrivacyPolicy = this.f32460g.isUseCustomPrivacyPolicy();
        String str2 = C3678q.f65822ikck;
        if (zIsUseCustomPrivacyPolicy) {
            StringBuilder sb = new StringBuilder();
            sb.append("use custom privacy policy, the policy is ");
            if (!this.f32461h) {
                str2 = "close";
            }
            sb.append(str2);
            C5804p.m20342a(f32457e, sb.toString());
            zM20394b = this.f32461h;
        } else {
            zM20394b = m20394b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("use system experience plan, the policy is ");
            if (!zM20394b) {
                str2 = "close";
            }
            sb2.append(str2);
            C5804p.m20342a(f32457e, sb2.toString());
        }
        if (zM20394b) {
            return zM20394b;
        }
        boolean zM20395b = m20395b(str);
        boolean zM20396c = m20396c(str);
        boolean zM20397d = m20397d(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("This event ");
        sb3.append(str);
        sb3.append(zM20395b ? " is " : " is not ");
        sb3.append("basic event and ");
        sb3.append(zM20396c ? "is" : "is not");
        sb3.append(" recommend event and ");
        sb3.append(zM20397d ? "is" : "is not");
        sb3.append(" custom dau event");
        C5804p.m20342a(f32457e, sb3.toString());
        return zM20395b || zM20396c || zM20397d;
    }

    /* JADX INFO: renamed from: b */
    private boolean m20394b() {
        if (Math.abs(System.currentTimeMillis() - this.f32463j) > f32458k) {
            this.f32463j = System.currentTimeMillis();
            this.f32462i = C5805q.m20360a(C5756a.m20053b());
        }
        return this.f32462i;
    }

    /* JADX INFO: renamed from: a */
    public void m20399a(OneTrack.IEventHook iEventHook) {
        this.f32459f = iEventHook;
    }

    /* JADX INFO: renamed from: a */
    public void m20400a(boolean z2) {
        this.f32461h = z2;
    }

    /* JADX INFO: renamed from: a */
    public String m20398a() {
        return this.f32460g.isUseCustomPrivacyPolicy() ? this.f32461h ? f32453a : f32454b : m20394b() ? f32455c : f32456d;
    }
}
