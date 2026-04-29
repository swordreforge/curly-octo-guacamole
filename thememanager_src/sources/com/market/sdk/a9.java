package com.market.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import com.android.thememanager.util.r8s8;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5012n;
import com.market.sdk.utils.C5013p;
import com.market.sdk.utils.C5014q;
import com.market.sdk.utils.C5019y;
import com.market.sdk.utils.f7l8;
import com.market.sdk.utils.qrj;
import com.market.sdk.zurt;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import miuix.appcompat.app.ki;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: XiaomiUpdateAgent.java */
/* JADX INFO: loaded from: classes3.dex */
public class a9 {

    /* JADX INFO: renamed from: k */
    private static boolean f28020k = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static volatile a9 f68865kja0 = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static C5019y.zy f68866ld6 = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static EnumC4977k f68867n7h = null;

    /* JADX INFO: renamed from: p */
    private static fti f28022p = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static boolean f68868qrj = false;

    /* JADX INFO: renamed from: s */
    private static zy f28024s = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static boolean f68869toq = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static boolean f68870x2 = false;

    /* JADX INFO: renamed from: y */
    private static t8r f28025y = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f68871zy = "MarketUpdateAgent";

    /* JADX INFO: renamed from: q */
    private static WeakReference<Context> f28023q = new WeakReference<>(null);

    /* JADX INFO: renamed from: n */
    private static boolean f28021n = true;

    /* JADX INFO: renamed from: g */
    public static boolean f28019g = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static boolean f68864f7l8 = false;

    /* JADX INFO: compiled from: XiaomiUpdateAgent.java */
    private static class toq extends AsyncTask<String, Void, Integer> {

        /* JADX INFO: renamed from: com.market.sdk.a9$toq$k */
        /* JADX INFO: compiled from: XiaomiUpdateAgent.java */
        class DialogInterfaceOnClickListenerC4965k implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC4965k() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                a9.t8r();
            }
        }

        private toq() {
        }

        private static void f7l8() {
            try {
                Context context = (Context) a9.f28023q.get();
                if (context == null) {
                    return;
                }
                ki.C6947k c6947k = new ki.C6947k(context, Build.VERSION.SDK_INT < 29 ? zurt.cdj.f69118f7l8 : zurt.cdj.f28286g);
                c6947k.uv6(context.getString(zurt.C5023h.k2b8));
                c6947k.m25050z(a9.f28024s.f28030q);
                c6947k.mcp(zurt.C5023h.j3px, null).dd(zurt.C5023h.i8, new DialogInterfaceOnClickListenerC4965k());
                if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                    return;
                }
                c6947k.hb();
            } catch (Exception e2) {
                C5013p.m17465q(a9.f68871zy, "show update dialog error: " + e2.getMessage());
            }
        }

        /* JADX INFO: renamed from: g */
        private zy m17294g(JSONObject jSONObject) {
            if (jSONObject == null) {
                C5013p.m17465q(a9.f68871zy, "update info json obj null");
                return null;
            }
            if (com.market.sdk.utils.ki.f68996toq) {
                C5013p.toq(a9.f68871zy, "updateInfo : " + jSONObject.toString());
            }
            zy zyVar = new zy();
            zyVar.f28027k = jSONObject.optString("host");
            zyVar.f68877zy = jSONObject.optInt(C5019y.f69034hyr);
            zyVar.f68875toq = jSONObject.optInt("source");
            zyVar.f28030q = jSONObject.optString(C5019y.f28236c);
            zyVar.f28028n = jSONObject.optInt("versionCode");
            zyVar.f28026g = jSONObject.optString("versionName");
            zyVar.f68872f7l8 = jSONObject.optString("apk");
            zyVar.f28032y = jSONObject.optString("apkHash");
            zyVar.f28031s = jSONObject.optLong("apkSize");
            zyVar.f68874qrj = jSONObject.optBoolean(C5019y.f28245m);
            return zyVar;
        }

        /* JADX INFO: renamed from: q */
        private static boolean m17295q() {
            if (System.currentTimeMillis() - Long.valueOf(com.market.sdk.utils.qrj.m17479g(C4979n.f68908kja0, new qrj.EnumC5015k[0])).longValue() >= 259200000) {
                return true;
            }
            Long lValueOf = Long.valueOf(com.market.sdk.utils.qrj.m17479g(C4979n.f28082h, new qrj.EnumC5015k[0]));
            if (System.currentTimeMillis() - lValueOf.longValue() < r8s8.f16779t) {
                return false;
            }
            int iM17485q = com.market.sdk.utils.qrj.m17485q(C4979n.f68906cdj, new qrj.EnumC5015k[0]);
            if (iM17485q < 2) {
                com.market.sdk.utils.qrj.m17480h(C4979n.f68906cdj, iM17485q + 1, new qrj.EnumC5015k[0]);
                com.market.sdk.utils.qrj.ki(C4979n.f28082h, System.currentTimeMillis(), new qrj.EnumC5015k[0]);
                return true;
            }
            if (toq(Long.valueOf(System.currentTimeMillis())) == toq(lValueOf)) {
                return false;
            }
            com.market.sdk.utils.qrj.m17480h(C4979n.f68906cdj, 1, new qrj.EnumC5015k[0]);
            com.market.sdk.utils.qrj.ki(C4979n.f28082h, System.currentTimeMillis(), new qrj.EnumC5015k[0]);
            return true;
        }

        private static int toq(Long l2) {
            Date date = new Date(l2.longValue());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(5);
        }

        private String zy() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C5019y.f69022a9, C5014q.f28222g + "*" + C5014q.f69007f7l8);
                jSONObject.put(C5019y.f69030fti, C5014q.f28229y);
                jSONObject.put(C5019y.f69036jp0y, C5014q.f28228s);
                jSONObject.put(C5019y.f69032gvn7, C5014q.f28226p);
                jSONObject.put(C5019y.f69025d3, C5014q.f69010ld6);
                jSONObject.put("feature", C5014q.f69015x2);
                jSONObject.put(C5019y.f69027eqxt, C5014q.f69012qrj);
                jSONObject.put(C5019y.f69024d2ok, C5014q.f69011n7h);
                jSONObject.put("sdk", C5014q.f69009kja0);
                jSONObject.put("version", C5014q.f28223h);
                jSONObject.put("release", C5014q.f69006cdj);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strArr) {
            Context context = (Context) a9.f28023q.get();
            if (context == null) {
                return 4;
            }
            if (!com.market.sdk.utils.ki.m17445y(context)) {
                return 3;
            }
            if (!com.market.sdk.utils.ki.kja0(context) && a9.f28019g) {
                return 2;
            }
            t8r unused = a9.f28025y = a9.x2(context, strArr[0]);
            if (a9.f28025y == null) {
                return 5;
            }
            com.market.sdk.utils.f7l8 f7l8Var = new com.market.sdk.utils.f7l8(C5019y.f28239g);
            f7l8.C5005n c5005n = new f7l8.C5005n(f7l8Var);
            c5005n.m17422k(C5019y.f69035jk, zy());
            c5005n.m17422k("packageName", a9.f28025y.f28173k);
            c5005n.m17422k("versionCode", a9.f28025y.f68980zy + "");
            c5005n.m17422k("signature", a9.f28025y.f28174n);
            c5005n.m17422k("sdk", String.valueOf(C5014q.f69009kja0));
            c5005n.m17422k(C5019y.f69023cdj, C5014q.f28223h);
            c5005n.m17422k(C5019y.f69037ki, C5014q.n7h());
            c5005n.m17422k(C5019y.f69051t8r, C5014q.m17477y());
            c5005n.m17422k(C5019y.f28241i, C5014q.ki());
            c5005n.m17422k(C5019y.f69057x9kr, C5014q.f69008ki);
            c5005n.m17422k("device", C5014q.m17473p());
            c5005n.m17422k("deviceType", String.valueOf(C5014q.ld6()));
            c5005n.m17422k(C5019y.f28252t, C5014q.m17475s());
            c5005n.m17422k("model", C5014q.cdj());
            c5005n.m17422k(C5019y.f69029fn3e, "11");
            c5005n.m17422k(C5019y.f69058zurt, context.getResources().getString(zurt.C5023h.f69789mj));
            c5005n.m17422k(C5019y.f69046ni7, a9.f68868qrj ? "1" : "0");
            c5005n.m17422k(C5019y.f69031fu4, C5014q.m17469h());
            c5005n.m17422k(C5019y.f28254z, C5014q.kja0());
            c5005n.m17422k(C5019y.f28244l, String.valueOf(a9.f68867n7h.ordinal()));
            if (a9.f68864f7l8 || a9.f68867n7h == EnumC4977k.IMEI_MD5) {
                c5005n.m17422k("imei", C5014q.qrj());
            }
            if (f7l8.EnumC5006q.OK == f7l8Var.n7h()) {
                zy unused2 = a9.f28024s = m17294g(f7l8Var.m17419q());
                if (a9.f28024s != null) {
                    C5013p.m17461g(a9.f68871zy, a9.f28024s.toString());
                    return Integer.valueOf(a9.f28024s.f68877zy != 0 ? 1 : 0);
                }
            }
            return 4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            boolean unused = a9.f68869toq = false;
            Context context = (Context) a9.f28023q.get();
            if (context == null) {
                return;
            }
            mcp mcpVar = new mcp();
            if (num.intValue() == 0) {
                mcpVar.f28077k = a9.f28024s.f28030q;
                mcpVar.f68905zy = a9.f28024s.f28028n;
                mcpVar.f68904toq = a9.f28024s.f28026g;
                mcpVar.f28078n = a9.f28024s.f28031s;
                mcpVar.f28076g = a9.f28024s.f28032y;
                mcpVar.f68903f7l8 = a9.f28024s.f68876x2;
                mcpVar.f28079q = com.market.sdk.utils.f7l8.toq(a9.f28024s.f28027k, a9.f28024s.f68872f7l8);
                mcpVar.f28080y = a9.f28024s.f68874qrj;
            }
            if (a9.f28022p != null) {
                a9.f28022p.lrht(num.intValue(), mcpVar);
            }
            if (a9.f28021n && num.intValue() == 0 && (context instanceof Activity) && C5014q.wvg() && m17295q()) {
                f7l8();
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            C5013p.toq(a9.f68871zy, "start to check update");
        }
    }

    /* JADX INFO: compiled from: XiaomiUpdateAgent.java */
    public static class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        String f68872f7l8;

        /* JADX INFO: renamed from: g */
        String f28026g;

        /* JADX INFO: renamed from: k */
        String f28027k;

        /* JADX INFO: renamed from: n */
        int f28028n;

        /* JADX INFO: renamed from: q */
        String f28030q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f68874qrj;

        /* JADX INFO: renamed from: s */
        long f28031s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f68875toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        long f68876x2;

        /* JADX INFO: renamed from: y */
        String f28032y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f68877zy;

        /* JADX INFO: renamed from: p */
        String f28029p = "";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        String f68873ld6 = "";

        public String toString() {
            return "UpdateInfo:\nhost = " + this.f28027k + "\nfitness = " + this.f68877zy + "\nupdateLog = " + this.f28030q + "\nversionCode = " + this.f28028n + "\nversionName = " + this.f28026g + "\napkUrl = " + this.f68872f7l8 + "\napkHash = " + this.f28032y + "\napkSize = " + this.f28031s + "\ndiffUrl = " + this.f28029p + "\ndiffHash = " + this.f68873ld6 + "\ndiffSize = " + this.f68876x2 + "\nmatchLanguage = " + this.f68874qrj;
        }
    }

    static {
        f68866ld6 = com.market.sdk.utils.ki.x2() ? C5019y.zy.DOWNLOAD_MANAGER : C5019y.zy.MARKET;
        f68867n7h = EnumC4977k.ANDROID_ID;
    }

    private a9() {
    }

    @Deprecated
    public static synchronized void a9(boolean z2, String str) {
        if (f68869toq) {
            return;
        }
        f68869toq = true;
        C5014q.fn3e(C5010k.toq());
        f28023q = new WeakReference<>(C5010k.toq());
        f68868qrj = z2;
        if (!f28020k) {
            f28025y = null;
            f28024s = null;
            C5019y.m17499k();
            f28020k = true;
        }
        new toq().execute(str);
    }

    public static String cdj() {
        return C5010k.toq().getResources().getString(zurt.C5023h.f69789mj);
    }

    public static void fn3e(boolean z2) {
        f28019g = z2;
    }

    public static boolean fti() {
        return f68864f7l8;
    }

    public static void fu4(boolean z2) {
        f28021n = z2;
    }

    /* JADX INFO: renamed from: h */
    public static int m17284h() {
        return 11;
    }

    /* JADX INFO: renamed from: i */
    public static void m17285i(EnumC4977k enumC4977k) {
        f68867n7h = enumC4977k;
    }

    public static synchronized void jk(boolean z2) {
        a9(z2, C5010k.toq().getPackageName());
    }

    public static void ki(cdj cdjVar) {
        kja0.m17321k().toq(cdjVar);
    }

    public static a9 kja0() {
        if (f68865kja0 == null) {
            synchronized (a9.class) {
                if (f68865kja0 == null) {
                    f68865kja0 = new a9();
                }
            }
        }
        return f68865kja0;
    }

    public static EnumC4977k ld6() {
        return f68867n7h;
    }

    public static synchronized void mcp(Context context, boolean z2) {
        if (f68869toq) {
            return;
        }
        f68869toq = true;
        C5014q.fn3e(C5010k.toq());
        f28023q = new WeakReference<>(context);
        f68868qrj = z2;
        if (!f28020k) {
            f28025y = null;
            f28024s = null;
            C5019y.m17499k();
            f28020k = true;
        }
        new toq().execute(C5010k.toq().getPackageName());
    }

    @Deprecated
    public static long n7h() {
        return -1L;
    }

    public static void ni7(fu4 fu4Var) {
        C5019y.zy(fu4Var);
    }

    @Deprecated
    public static void o1t(C5019y.zy zyVar) {
        f68866ld6 = zyVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m17288p(boolean z2) {
        f68870x2 = z2;
        com.market.sdk.utils.ki.f68996toq = z2;
    }

    public static Context qrj() {
        return f28023q.get();
    }

    /* JADX INFO: renamed from: s */
    public static void m17290s() {
        Context context = f28023q.get();
        if (context == null) {
            return;
        }
        C5014q.fn3e(context);
        t8r();
    }

    /* JADX INFO: renamed from: t */
    public static void m17291t(boolean z2) {
        C5019y.m17500q(z2);
    }

    public static void t8r() {
        zy zyVar;
        ActivityInfo activityInfo;
        Context context = f28023q.get();
        if (context == null || (zyVar = f28024s) == null || f28025y == null) {
            return;
        }
        if (zyVar.f68875toq == 1 || !com.market.sdk.utils.ki.ld6(context)) {
            C5013p.m17465q(f68871zy, "MiuiMarket doesn't exist");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?ref=update_sdk&back=true&startDownload=true&id=" + f28025y.f28173k));
        intent.setPackage(com.market.sdk.utils.ki.m17443q());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() == 1 && (activityInfo = listQueryIntentActivities.get(0).activityInfo) != null && activityInfo.exported && activityInfo.enabled) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Deprecated
    public static void wvg(boolean z2) {
        f68867n7h = z2 ? EnumC4977k.IMEI_MD5 : EnumC4977k.ANDROID_ID;
    }

    public static t8r x2(Context context, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        t8r t8rVarM17402k = t8r.m17402k(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(t8rVarM17402k.f28173k, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            C5013p.m17465q(f68871zy, "get package info failed");
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            return null;
        }
        t8rVarM17402k.f68979toq = packageManager.getApplicationLabel(applicationInfo).toString();
        t8rVarM17402k.f68980zy = packageInfo.versionCode;
        t8rVarM17402k.f28175q = packageInfo.versionName;
        t8rVarM17402k.f28174n = C5012n.ld6(String.valueOf(packageInfo.signatures[0].toChars()));
        t8rVarM17402k.f28172g = packageInfo.applicationInfo.sourceDir;
        return t8rVarM17402k;
    }

    /* JADX INFO: renamed from: z */
    public static void m17293z(fti ftiVar) {
        f28022p = ftiVar;
    }

    public static void zurt(String str) {
        C5019y.toq(str);
    }
}
