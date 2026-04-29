package com.tencent.wxop.stat.common;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.market.sdk.utils.C5019y;
import com.tencent.wxop.stat.C5378a;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.au;
import com.xiaomi.accountsdk.account.C5497k;
import com.xiaomi.onetrack.p013b.C5725m;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.d */
/* JADX INFO: loaded from: classes3.dex */
class C5384d {

    /* JADX INFO: renamed from: a */
    String f30104a;

    /* JADX INFO: renamed from: b */
    String f30105b;

    /* JADX INFO: renamed from: c */
    DisplayMetrics f30106c;

    /* JADX INFO: renamed from: d */
    int f30107d;

    /* JADX INFO: renamed from: e */
    String f30108e;

    /* JADX INFO: renamed from: f */
    String f30109f;

    /* JADX INFO: renamed from: g */
    String f30110g;

    /* JADX INFO: renamed from: h */
    String f30111h;

    /* JADX INFO: renamed from: i */
    String f30112i;

    /* JADX INFO: renamed from: j */
    String f30113j;

    /* JADX INFO: renamed from: k */
    String f30114k;

    /* JADX INFO: renamed from: l */
    int f30115l;

    /* JADX INFO: renamed from: m */
    String f30116m;

    /* JADX INFO: renamed from: n */
    String f30117n;

    /* JADX INFO: renamed from: o */
    Context f30118o;

    /* JADX INFO: renamed from: p */
    private String f30119p;

    /* JADX INFO: renamed from: q */
    private String f30120q;

    /* JADX INFO: renamed from: r */
    private String f30121r;

    /* JADX INFO: renamed from: s */
    private String f30122s;

    private C5384d(Context context) {
        this.f30105b = StatConstants.VERSION;
        this.f30107d = Build.VERSION.SDK_INT;
        this.f30108e = Build.MODEL;
        this.f30109f = Build.MANUFACTURER;
        this.f30110g = Locale.getDefault().getLanguage();
        this.f30115l = 0;
        this.f30116m = null;
        this.f30117n = null;
        this.f30118o = null;
        this.f30119p = null;
        this.f30120q = null;
        this.f30121r = null;
        this.f30122s = null;
        Context applicationContext = context.getApplicationContext();
        this.f30118o = applicationContext;
        this.f30106c = C5392l.m18423d(applicationContext);
        this.f30104a = C5392l.m18432h(this.f30118o);
        this.f30111h = StatConfig.getInstallChannel(this.f30118o);
        this.f30112i = C5392l.m18429g(this.f30118o);
        this.f30113j = TimeZone.getDefault().getID();
        this.f30115l = C5392l.m18437m(this.f30118o);
        this.f30114k = C5392l.m18438n(this.f30118o);
        this.f30116m = this.f30118o.getPackageName();
        if (this.f30107d >= 14) {
            this.f30119p = C5392l.m18444t(this.f30118o);
        }
        this.f30120q = C5392l.m18443s(this.f30118o).toString();
        this.f30121r = C5392l.m18442r(this.f30118o);
        this.f30122s = C5392l.m18424d();
        this.f30117n = C5392l.m18404A(this.f30118o);
    }

    /* JADX INFO: renamed from: a */
    void m18388a(JSONObject jSONObject, Thread thread) throws JSONException {
        String localMidOnly;
        String str;
        if (thread == null) {
            if (this.f30106c != null) {
                jSONObject.put("sr", this.f30106c.widthPixels + "*" + this.f30106c.heightPixels);
                jSONObject.put("dpi", this.f30106c.xdpi + "*" + this.f30106c.ydpi);
            }
            if (C5378a.m18307a(this.f30118o).m18319e()) {
                JSONObject jSONObject2 = new JSONObject();
                C5398r.m18466a(jSONObject2, "bs", C5398r.m18471d(this.f30118o));
                C5398r.m18466a(jSONObject2, "ss", C5398r.m18472e(this.f30118o));
                if (jSONObject2.length() > 0) {
                    C5398r.m18466a(jSONObject, "wf", jSONObject2.toString());
                }
            }
            JSONArray jSONArrayM18465a = C5398r.m18465a(this.f30118o, 10);
            if (jSONArrayM18465a != null && jSONArrayM18465a.length() > 0) {
                C5398r.m18466a(jSONObject, "wflist", jSONArrayM18465a.toString());
            }
            localMidOnly = this.f30119p;
            str = "sen";
        } else {
            C5398r.m18466a(jSONObject, "thn", thread.getName());
            C5398r.m18466a(jSONObject, C5497k.f72765zy, StatConfig.getQQ(this.f30118o));
            C5398r.m18466a(jSONObject, "cui", StatConfig.getCustomUserId(this.f30118o));
            if (C5392l.m18422c(this.f30121r) && this.f30121r.split("/").length == 2) {
                C5398r.m18466a(jSONObject, "fram", this.f30121r.split("/")[0]);
            }
            if (C5392l.m18422c(this.f30122s) && this.f30122s.split("/").length == 2) {
                C5398r.m18466a(jSONObject, "from", this.f30122s.split("/")[0]);
            }
            if (au.m18335a(this.f30118o).m18368b(this.f30118o) != null) {
                jSONObject.put("ui", au.m18335a(this.f30118o).m18368b(this.f30118o).m18382b());
            }
            localMidOnly = StatConfig.getLocalMidOnly(this.f30118o);
            str = "mid";
        }
        C5398r.m18466a(jSONObject, str, localMidOnly);
        C5398r.m18466a(jSONObject, "pcn", C5392l.m18439o(this.f30118o));
        C5398r.m18466a(jSONObject, "osn", Build.VERSION.RELEASE);
        C5398r.m18466a(jSONObject, C5725m.f31968f, this.f30104a);
        C5398r.m18466a(jSONObject, "ch", this.f30111h);
        C5398r.m18466a(jSONObject, "mf", this.f30109f);
        C5398r.m18466a(jSONObject, C5725m.f31967e, this.f30105b);
        C5398r.m18466a(jSONObject, "osd", Build.DISPLAY);
        C5398r.m18466a(jSONObject, "prod", Build.PRODUCT);
        C5398r.m18466a(jSONObject, "tags", Build.TAGS);
        C5398r.m18466a(jSONObject, "id", Build.ID);
        C5398r.m18466a(jSONObject, "fng", Build.FINGERPRINT);
        C5398r.m18466a(jSONObject, "lch", this.f30117n);
        C5398r.m18466a(jSONObject, C5725m.f31964b, Integer.toString(this.f30107d));
        jSONObject.put(C5019y.f69023cdj, 1);
        C5398r.m18466a(jSONObject, "op", this.f30112i);
        C5398r.m18466a(jSONObject, "lg", this.f30110g);
        C5398r.m18466a(jSONObject, "md", this.f30108e);
        C5398r.m18466a(jSONObject, "tz", this.f30113j);
        int i2 = this.f30115l;
        if (i2 != 0) {
            jSONObject.put("jb", i2);
        }
        C5398r.m18466a(jSONObject, "sd", this.f30114k);
        C5398r.m18466a(jSONObject, "apn", this.f30116m);
        C5398r.m18466a(jSONObject, "cpu", this.f30120q);
        C5398r.m18466a(jSONObject, "abi", Build.CPU_ABI);
        C5398r.m18466a(jSONObject, "abi2", Build.CPU_ABI2);
        C5398r.m18466a(jSONObject, "ram", this.f30121r);
        C5398r.m18466a(jSONObject, "rom", this.f30122s);
    }
}
