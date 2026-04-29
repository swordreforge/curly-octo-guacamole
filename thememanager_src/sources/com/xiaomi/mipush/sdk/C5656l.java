package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.thememanager.util.jbh;
import com.xiaomi.accountsdk.account.data.C5487q;
import com.xiaomi.push.m8;
import com.xiaomi.push.uf;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.l */
/* JADX INFO: loaded from: classes3.dex */
public class C5656l {

    /* JADX INFO: renamed from: n */
    private static volatile C5656l f31386n;

    /* JADX INFO: renamed from: k */
    private Context f31387k;

    /* JADX INFO: renamed from: q */
    String f31388q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private k f73154toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Map<String, k> f73155zy;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.l$k */
    public static class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public String f73156f7l8;

        /* JADX INFO: renamed from: g */
        public String f31389g;

        /* JADX INFO: renamed from: k */
        public String f31390k;

        /* JADX INFO: renamed from: n */
        public String f31391n;

        /* JADX INFO: renamed from: q */
        public String f31393q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f73158toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private Context f73159x2;

        /* JADX INFO: renamed from: y */
        public String f31395y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f73160zy;

        /* JADX INFO: renamed from: s */
        public boolean f31394s = true;

        /* JADX INFO: renamed from: p */
        public boolean f31392p = false;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f73157ld6 = 1;

        public k(Context context) {
            this.f73159x2 = context;
        }

        /* JADX INFO: renamed from: k */
        public static k m19511k(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                k kVar = new k(context);
                kVar.f31390k = jSONObject.getString("appId");
                kVar.f73158toq = jSONObject.getString("appToken");
                kVar.f73160zy = jSONObject.getString("regId");
                kVar.f31393q = jSONObject.getString("regSec");
                kVar.f31389g = jSONObject.getString(C5487q.f30669g);
                kVar.f31391n = jSONObject.getString("vName");
                kVar.f31394s = jSONObject.getBoolean(jbh.f16569i);
                kVar.f31392p = jSONObject.getBoolean("paused");
                kVar.f73157ld6 = jSONObject.getInt("envType");
                kVar.f73156f7l8 = jSONObject.getString("regResource");
                return kVar;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(th);
                return null;
            }
        }

        private String toq() {
            Context context = this.f73159x2;
            return uf.m21865y(context, context.getPackageName());
        }

        public static String zy(k kVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", kVar.f31390k);
                jSONObject.put("appToken", kVar.f73158toq);
                jSONObject.put("regId", kVar.f73160zy);
                jSONObject.put("regSec", kVar.f31393q);
                jSONObject.put(C5487q.f30669g, kVar.f31389g);
                jSONObject.put("vName", kVar.f31391n);
                jSONObject.put(jbh.f16569i, kVar.f31394s);
                jSONObject.put("paused", kVar.f31392p);
                jSONObject.put("envType", kVar.f73157ld6);
                jSONObject.put("regResource", kVar.f73156f7l8);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(th);
                return null;
            }
        }

        public void f7l8(String str, String str2, String str3) {
            this.f31390k = str;
            this.f73158toq = str2;
            this.f73156f7l8 = str3;
            SharedPreferences.Editor editorEdit = C5656l.toq(this.f73159x2).edit();
            editorEdit.putString("appId", this.f31390k);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        /* JADX INFO: renamed from: g */
        public void m19512g(String str, String str2) {
            this.f73160zy = str;
            this.f31393q = str2;
            this.f31389g = m8.wvg(this.f73159x2);
            this.f31391n = toq();
            this.f31394s = true;
        }

        public void ld6() {
            this.f31394s = false;
            C5656l.toq(this.f73159x2).edit().putBoolean(jbh.f16569i, this.f31394s).commit();
        }

        /* JADX INFO: renamed from: n */
        public void m19513n(int i2) {
            this.f73157ld6 = i2;
        }

        /* JADX INFO: renamed from: p */
        public boolean m19514p(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f31390k, str);
            boolean zEquals2 = TextUtils.equals(this.f73158toq, str2);
            boolean z2 = !TextUtils.isEmpty(this.f73160zy);
            boolean z3 = !TextUtils.isEmpty(this.f31393q);
            boolean z5 = TextUtils.isEmpty(m8.m21274h(this.f73159x2)) || TextUtils.equals(this.f31389g, m8.wvg(this.f73159x2)) || TextUtils.equals(this.f31389g, m8.o1t(this.f73159x2));
            boolean z6 = zEquals && zEquals2 && z2 && z3 && z5;
            if (!z6) {
                com.xiaomi.channel.commonutils.logger.zy.a9(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z5)));
            }
            return z6;
        }

        /* JADX INFO: renamed from: q */
        public void m19515q() {
            C5656l.toq(this.f73159x2).edit().clear().commit();
            this.f31390k = null;
            this.f73158toq = null;
            this.f73160zy = null;
            this.f31393q = null;
            this.f31389g = null;
            this.f31391n = null;
            this.f31394s = false;
            this.f31392p = false;
            this.f31395y = null;
            this.f73157ld6 = 1;
        }

        public void qrj(String str, String str2, String str3) {
            this.f31390k = str;
            this.f73158toq = str2;
            this.f73156f7l8 = str3;
        }

        /* JADX INFO: renamed from: s */
        public boolean m19516s() {
            return m19514p(this.f31390k, this.f73158toq);
        }

        public void x2(String str, String str2, String str3) {
            this.f73160zy = str;
            this.f31393q = str2;
            this.f31389g = m8.wvg(this.f73159x2);
            this.f31391n = toq();
            this.f31394s = true;
            this.f31395y = str3;
            SharedPreferences.Editor editorEdit = C5656l.toq(this.f73159x2).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString(C5487q.f30669g, this.f31389g);
            editorEdit.putString("vName", toq());
            editorEdit.putBoolean(jbh.f16569i, true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }

        /* JADX INFO: renamed from: y */
        public void m19517y(boolean z2) {
            this.f31392p = z2;
        }
    }

    private C5656l(Context context) {
        this.f31387k = context;
        fn3e();
    }

    private void fn3e() {
        this.f73154toq = new k(this.f31387k);
        this.f73155zy = new HashMap();
        SharedPreferences qVar = toq(this.f31387k);
        this.f73154toq.f31390k = qVar.getString("appId", null);
        this.f73154toq.f73158toq = qVar.getString("appToken", null);
        this.f73154toq.f73160zy = qVar.getString("regId", null);
        this.f73154toq.f31393q = qVar.getString("regSec", null);
        this.f73154toq.f31389g = qVar.getString(C5487q.f30669g, null);
        if (!TextUtils.isEmpty(this.f73154toq.f31389g) && m8.qrj(this.f73154toq.f31389g)) {
            this.f73154toq.f31389g = m8.wvg(this.f31387k);
            qVar.edit().putString(C5487q.f30669g, this.f73154toq.f31389g).commit();
        }
        this.f73154toq.f31391n = qVar.getString("vName", null);
        this.f73154toq.f31394s = qVar.getBoolean(jbh.f16569i, true);
        this.f73154toq.f31392p = qVar.getBoolean("paused", false);
        this.f73154toq.f73157ld6 = qVar.getInt("envType", 1);
        this.f73154toq.f73156f7l8 = qVar.getString("regResource", null);
        this.f73154toq.f31395y = qVar.getString("appRegion", null);
    }

    /* JADX INFO: renamed from: q */
    public static C5656l m19500q(Context context) {
        if (f31386n == null) {
            synchronized (C5656l.class) {
                if (f31386n == null) {
                    f31386n = new C5656l(context);
                }
            }
        }
        return f31386n;
    }

    public static SharedPreferences toq(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    public void cdj(String str) {
        this.f73155zy.remove(str);
        toq(this.f31387k).edit().remove("hybrid_app_info_" + str).commit();
    }

    public void f7l8(int i2) {
        this.f73154toq.m19513n(i2);
        toq(this.f31387k).edit().putInt("envType", i2).commit();
    }

    public boolean fu4() {
        return (TextUtils.isEmpty(this.f73154toq.f31390k) || TextUtils.isEmpty(this.f73154toq.f73158toq) || TextUtils.isEmpty(this.f73154toq.f73160zy) || TextUtils.isEmpty(this.f73154toq.f31393q)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public void m19501g() {
        this.f73154toq.m19515q();
    }

    /* JADX INFO: renamed from: h */
    public void m19502h() {
        this.f73154toq.ld6();
    }

    /* JADX INFO: renamed from: i */
    public String m19503i() {
        return this.f73154toq.f73160zy;
    }

    /* JADX INFO: renamed from: k */
    public int m19504k() {
        return this.f73154toq.f73157ld6;
    }

    public void ki(String str, String str2, String str3) {
        this.f73154toq.x2(str, str2, str3);
    }

    public String kja0() {
        return this.f73154toq.f73158toq;
    }

    public void ld6(boolean z2) {
        this.f73154toq.m19517y(z2);
        toq(this.f31387k).edit().putBoolean("paused", z2).commit();
    }

    /* JADX INFO: renamed from: n */
    public String m19505n() {
        return this.f73154toq.f31390k;
    }

    public boolean n7h(String str, String str2, String str3) {
        k kVarZy = zy(str3);
        return kVarZy != null && TextUtils.equals(str, kVarZy.f31390k) && TextUtils.equals(str2, kVarZy.f73158toq);
    }

    public String ni7() {
        return this.f73154toq.f31393q;
    }

    public boolean o1t() {
        return this.f73154toq.f31392p;
    }

    /* JADX INFO: renamed from: p */
    public void m19506p(String str, String str2, String str3) {
        this.f73154toq.f7l8(str, str2, str3);
    }

    public boolean qrj(String str, String str2) {
        return this.f73154toq.m19514p(str, str2);
    }

    /* JADX INFO: renamed from: s */
    public void m19507s(String str, k kVar) {
        this.f73155zy.put(str, kVar);
        toq(this.f31387k).edit().putString("hybrid_app_info_" + str, k.zy(kVar)).commit();
    }

    /* JADX INFO: renamed from: t */
    public boolean m19508t() {
        return !this.f73154toq.f31394s;
    }

    public boolean t8r() {
        if (this.f73154toq.m19516s()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("Don't send message before initialization succeeded!");
        return false;
    }

    public String wvg() {
        return this.f73154toq.f31395y;
    }

    public boolean x2() {
        Context context = this.f31387k;
        return !TextUtils.equals(uf.m21865y(context, context.getPackageName()), this.f73154toq.f31391n);
    }

    /* JADX INFO: renamed from: y */
    public void m19509y(String str) {
        SharedPreferences.Editor editorEdit = toq(this.f31387k).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.f73154toq.f31391n = str;
    }

    /* JADX INFO: renamed from: z */
    public String m19510z() {
        return this.f73154toq.f73156f7l8;
    }

    public boolean zurt() {
        return this.f73154toq.m19516s();
    }

    public k zy(String str) {
        if (this.f73155zy.containsKey(str)) {
            return this.f73155zy.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences qVar = toq(this.f31387k);
        if (!qVar.contains(str2)) {
            return null;
        }
        k kVarM19511k = k.m19511k(this.f31387k, qVar.getString(str2, ""));
        this.f73155zy.put(str2, kVarM19511k);
        return kVarM19511k;
    }
}
