package vy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.mibi.sdk.app.C5031k;
import com.mibi.sdk.web.C5037k;

/* JADX INFO: renamed from: vy.q */
/* JADX INFO: compiled from: MibiFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7718q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f97043a9 = "intent";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f97044cdj = 10;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f97045d2ok = "deductSignOrder";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f97046d3 = "com.xiaomi.action.DEDUCT";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f97047dd = "sign_deduct_channel";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f97048eqxt = "com.xiaomi.action.REQUEST_CHANNELS";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f97049f7l8 = -1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f97050fn3e = 14;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f97051fti = "rechargeAmount";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f97052fu4 = 17;

    /* JADX INFO: renamed from: g */
    public static final int f44949g = 424;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f97053gvn7 = "com.xiaomi.payment";

    /* JADX INFO: renamed from: h */
    public static final int f44950h = 9;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f97054hyr = "order";

    /* JADX INFO: renamed from: i */
    public static final int f44951i = 13;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f97055jk = "payment_trade_balance";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f97056jp0y = "payment_fragment_arguments";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f97057ki = 11;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f97058kja0 = 8;

    /* JADX INFO: renamed from: l */
    public static final String f44952l = "orderFee";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f97059ld6 = 3;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f97060lvui = "deductRequestCode";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f97061mcp = "payment_is_no_account";

    /* JADX INFO: renamed from: n */
    public static final int f44953n = 425;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f97062n5r1 = "marketType";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f97063n7h = 7;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f97064ncyb = "requestChannelType";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f97065ni7 = 16;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f97066o1t = "message";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f97067oc = "com.xiaomi.action.SIGN_DEDUCT";

    /* JADX INFO: renamed from: p */
    public static final int f44954p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f44955q = 1019017;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f97068qrj = 6;

    /* JADX INFO: renamed from: r */
    public static final String f44956r = "signDeductRequestCode";

    /* JADX INFO: renamed from: s */
    public static final int f44957s = 1;

    /* JADX INFO: renamed from: t */
    public static final String f44958t = "fullResult";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f97069t8r = 12;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f97070toq = "MibiFactory";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f97071wvg = "result";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f97072x2 = 5;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f97073x9kr = "deductChannel";

    /* JADX INFO: renamed from: y */
    public static final int f44959y = 0;

    /* JADX INFO: renamed from: z */
    public static final String f44960z = "code";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f97074zurt = 15;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f97075zy = "mibi_extra_params";

    /* JADX INFO: renamed from: k */
    public toq f44961k;

    /* JADX INFO: renamed from: vy.q$k */
    /* JADX INFO: compiled from: MibiFactory.java */
    public enum k {
        MIBI_CHANNELS_PAY,
        MIBI_CHANNELS_SIGN,
        MIBI_CHANNELS_SIGN_DEDUCT
    }

    private C7718q(Context context) {
        if (m28123y(context) && m28121n(context)) {
            this.f44961k = new C5031k();
        } else {
            this.f44961k = new C5037k();
        }
    }

    public static boolean f7l8(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(f97053gvn7, 0);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(f97053gvn7, 0);
            if (packageInfo == null || applicationInfo == null) {
                return false;
            }
            return applicationInfo.enabled;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m28119g(Context context) {
        return zy(context).contains("global");
    }

    /* JADX INFO: renamed from: k */
    public static toq m28120k(Context context) {
        return new C7718q(context).f44961k;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28121n(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(f97053gvn7);
        intent.setData(Uri.parse("https://app.mibi.xiaomi.com?id=mibi.milicenter"));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        Log.e(f97070toq, "can't resolve by scheme: https");
        intent.setData(Uri.parse("mibi://mibiapp?id=mibi.milicenter"));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        Log.e(f97070toq, "can't resolve by scheme: mibi");
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m28122q(Context context) {
        return zy(context).contains("alpha");
    }

    public static int toq(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f97053gvn7, 0);
            if (packageInfo == null) {
                return -1;
            }
            Log.d(f97070toq, "MibiVersionCode(context) is " + packageInfo.versionCode);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m28123y(Context context) {
        try {
            context.getPackageManager().getPackageInfo(f97053gvn7, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String zy(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f97053gvn7, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.d(f97070toq, "get mibi versionName error");
            return "";
        }
    }
}
