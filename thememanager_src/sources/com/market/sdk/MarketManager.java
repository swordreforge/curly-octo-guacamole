package com.market.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.internal.DesktopRecommendManager;
import com.market.pm.api.C4934k;
import com.market.pm.api.C4936q;
import com.market.pm.api.InterfaceC4935n;
import com.market.sdk.homeguide.C4974k;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.WhiteSetManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MarketManager {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f68827f7l8 = "com.xiaomi.discover";

    /* JADX INFO: renamed from: g */
    private static volatile MarketManager f27963g = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f68828kja0 = "packageName";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f68829ld6 = "com.xiaomi.market.service.AppDownloadInstallService";

    /* JADX INFO: renamed from: n */
    public static final String f27964n = "MarketManager";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f68830n7h = "ref";

    /* JADX INFO: renamed from: p */
    public static final String f27965p = ki();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f68831qrj = "apkPath";

    /* JADX INFO: renamed from: s */
    public static final String f27966s = "com.xiaomi.market";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f68832x2 = "startDownload";

    /* JADX INFO: renamed from: y */
    public static final String f27967y = "com.xiaomi.mipicks";

    /* JADX INFO: renamed from: k */
    private Context f27968k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f68833toq = "com.xiaomi.market.ui.AppDetailActivity";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f68834zy = "com.xiaomi.market.data.MarketService";

    /* JADX INFO: renamed from: q */
    private final String f27969q = "com.xiaomi.market.ui.UserAgreementActivity";

    /* JADX INFO: renamed from: com.market.sdk.MarketManager$k */
    class C4953k extends ni7<ApkVerifyInfo> {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f27978h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f27979i;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ String f27980p;

        C4953k(String str, String str2, boolean z2) {
            this.f27980p = str;
            this.f27978h = str2;
            this.f27979i = z2;
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public ApkVerifyInfo mo17245g(IMarketService iMarketService) {
            try {
                return iMarketService.getVerifyInfo(this.f27980p, this.f27978h, this.f27979i);
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketManager$q */
    class C4954q extends ni7<Boolean> {
        C4954q() {
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Boolean mo17245g(IMarketService iMarketService) {
            try {
                return Boolean.valueOf(iMarketService.allowConnectToNetwork());
            } catch (Exception e2) {
                Log.e(MarketManager.f27964n, "Exception: " + e2);
                return Boolean.FALSE;
            }
        }
    }

    class toq extends ni7<ApkVerifyInfo> {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f27983h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f27984i;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ String f27985p;

        toq(String str, String str2, boolean z2) {
            this.f27985p = str;
            this.f27983h = str2;
            this.f27984i = z2;
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public ApkVerifyInfo mo17245g(IMarketService iMarketService) {
            try {
                return iMarketService.getApkCheckInfo(this.f27985p, this.f27983h, this.f27984i);
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    class zy extends ni7<Void> {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f27987h;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ String f27989p;

        zy(String str, String str2) {
            this.f27989p = str;
            this.f27987h = str2;
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Void mo17245g(IMarketService iMarketService) {
            try {
                iMarketService.recordStaticsCountEvent(this.f27989p, this.f27987h);
                return null;
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    private MarketManager(Context context) {
        this.f27968k = context.getApplicationContext();
    }

    public static String ki() {
        try {
            return miuix.os.toq.f40717k ? "com.xiaomi.discover" : "com.xiaomi.market";
        } catch (Throwable unused) {
            return "com.xiaomi.market";
        }
    }

    public static String n7h() {
        return f27965p;
    }

    public static MarketManager qrj() {
        if (f27963g == null) {
            synchronized (MarketManager.class) {
                if (f27963g == null) {
                    f27963g = new MarketManager(C5010k.toq());
                }
            }
        }
        return f27963g;
    }

    private void toq() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new UnsupportedOperationException("Can't call the method on ui thread");
        }
    }

    /* JADX INFO: renamed from: y */
    public static Context m17271y() {
        return f27963g.f27968k;
    }

    public void a9(String str, String str2) {
        new zy(str, str2).m17337s();
    }

    public boolean cdj(EnumC4976i enumC4976i) {
        return enumC4976i.isSupported();
    }

    public String f7l8(final String... strArr) {
        toq();
        if (!ni7(true) || strArr.length == 0) {
            return null;
        }
        final com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        new ni7<Void>() { // from class: com.market.sdk.MarketManager.6
            @Override // com.market.sdk.ni7
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void mo17245g(IMarketService iMarketService) throws RemoteException {
                iMarketService.getCategoryV2(strArr, new ResultReceiver(null) { // from class: com.market.sdk.MarketManager.6.1
                    @Override // android.os.ResultReceiver
                    protected void onReceiveResult(int i2, Bundle bundle) {
                        if (bundle != null) {
                            toqVar.set(bundle.getString(InterfaceC1925p.de9w));
                        } else {
                            toqVar.set(null);
                        }
                    }
                });
                return null;
            }
        }.m17337s();
        return (String) toqVar.get();
    }

    public boolean fn3e() {
        PackageManager packageManager = this.f27968k.getPackageManager();
        try {
            if (!zurt()) {
                return false;
            }
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(f27965p);
            return applicationEnabledSetting == 0 || applicationEnabledSetting == 1;
        } catch (IllegalArgumentException e2) {
            Log.e(f27964n, "IllegalArgmentException when get enabled state of appstore : " + e2);
            return false;
        }
    }

    public x2 fti(String str, String str2, String str3, Map<String, String> map) {
        x2 x2Var = new x2();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            x2Var.f28266k = -1;
            return x2Var;
        }
        if (!com.market.sdk.utils.ki.m17445y(this.f27968k)) {
            x2Var.f28266k = -2;
            x2Var.f69067toq = com.market.sdk.utils.ki.m17438g("install_no_network_description");
            return x2Var;
        }
        Intent intent = new Intent(f68829ld6);
        intent.setPackage(f27965p);
        intent.putExtra("appId", str);
        intent.putExtra("packageName", str2);
        intent.putExtra(C4979n.f28086q, this.f27968k.getPackageName());
        intent.putExtra("ref", str3);
        if (map != null) {
            Set<String> setKeySet = map.keySet();
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : setKeySet) {
                    jSONObject.put(str4, map.get(str4));
                }
                intent.putExtra(C4979n.f68912toq, jSONObject.toString());
            } catch (Exception e2) {
                Log.e(f27964n, e2.toString());
            }
        }
        this.f27968k.startService(intent);
        x2Var.f28266k = 0;
        return x2Var;
    }

    public boolean fu4(String str, String str2) {
        return WhiteSetManager.m17405q(this.f27968k, str, str2);
    }

    /* JADX INFO: renamed from: g */
    public int m17272g(final String... strArr) {
        toq();
        if (!ni7(true) || strArr.length == 0) {
            return -1;
        }
        final com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        new ni7<Void>() { // from class: com.market.sdk.MarketManager.5
            @Override // com.market.sdk.ni7
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void mo17245g(IMarketService iMarketService) throws RemoteException {
                iMarketService.getCategoryV2(strArr, new ResultReceiver(null) { // from class: com.market.sdk.MarketManager.5.1
                    @Override // android.os.ResultReceiver
                    protected void onReceiveResult(int i2, Bundle bundle) {
                        toqVar.set(Integer.valueOf(i2));
                    }
                });
                return null;
            }
        }.m17337s();
        Integer num = (Integer) toqVar.get();
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public void gvn7() {
        try {
            qrj.m17341g().qrj(!com.market.sdk.utils.ki.m17444s());
            Log.d(f27964n, "isFirstBoot: " + com.market.sdk.utils.ki.m17444s());
        } catch (Exception e2) {
            Log.w(f27964n, e2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public Intent m17273h(String str, String str2) {
        Uri uri = Uri.parse("mimarket://search?q=" + str + "&ref=" + str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        return intent;
    }

    /* JADX INFO: renamed from: i */
    public void m17274i(Uri uri, String str, String str2, String str3, String str4, InterfaceC4935n interfaceC4935n) throws C4934k {
        C4936q c4936q = new C4936q(this.f27968k);
        c4936q.m17251n(interfaceC4935n);
        c4936q.m17252q(uri, str, str2, str3, str4);
    }

    public void jk(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Uri uri = Uri.parse("mimarket://search?q=" + str + "&ref=" + str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        intent.addFlags(268435456);
        this.f27968k.startActivity(intent);
    }

    public boolean jp0y(Activity activity, int i2) {
        if (!ni7(true) || activity == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(f27965p, "com.xiaomi.market.ui.UserAgreementActivity"));
        activity.startActivityForResult(intent, i2);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m17275k() {
        Boolean boolM17338y;
        toq();
        if (ni7(true) && (boolM17338y = new C4954q().m17338y()) != null) {
            return boolM17338y.booleanValue();
        }
        return false;
    }

    public Intent kja0(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("packageName", str);
        intent.putExtra("ref", str2);
        intent.setData(Uri.parse("mimarket://details"));
        intent.setComponent(new ComponentName(f27965p, "com.xiaomi.market.ui.AppDetailActivity"));
        return intent;
    }

    public ld6 ld6() {
        return ld6.m17323k();
    }

    public void mcp(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Uri uri = Uri.parse("mimarket://search?q=" + str + "&ref=" + str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f27968k.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: n */
    public C4974k m17276n() {
        return new C4974k();
    }

    public boolean ni7(boolean z2) {
        try {
            ApplicationInfo applicationInfo = this.f27968k.getPackageManager().getApplicationInfo(f27965p, 0);
            if (applicationInfo != null) {
                if (z2) {
                    return (applicationInfo.flags & 1) != 0;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void o1t(long j2, String str, ArrayList<String> arrayList, Map<String, String> map, f7l8 f7l8Var) {
        if (!cdj(EnumC4976i.DESK_RECOMMEND_V3)) {
            m17281z(j2, str, arrayList, f7l8Var);
            return;
        }
        C4969g c4969g = new C4969g(j2, str, arrayList, map);
        try {
            MarketService.openService(this.f27968k).loadDesktopRecommendInfoV3(c4969g.f7l8(), new DesktopRecommendCallbackAdapter(f7l8Var));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public C4983p m17277p() {
        return C4983p.m17340k();
    }

    /* JADX INFO: renamed from: q */
    public ApkVerifyInfo m17278q(String str, String str2, boolean z2) {
        toq();
        return new C4953k(str, str2, z2).m17338y();
    }

    /* JADX INFO: renamed from: s */
    public void m17279s(InterfaceC4970h interfaceC4970h) {
        if (!cdj(EnumC4976i.DESK_RECOMMEND_V3)) {
            interfaceC4970h.toq("Market service not impl.");
            return;
        }
        try {
            MarketService.openService(this.f27968k).getDesktopFolderConfig(new DesktopFolderConfigCallbackAdapter(interfaceC4970h));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public void m17280t(String str, int i2, int i3, ki kiVar) {
        ImageManager.m17265q(str, i2, i3, kiVar);
    }

    public void t8r(Uri uri, InterfaceC4935n interfaceC4935n) throws C4934k {
        m17274i(uri, null, null, null, null, interfaceC4935n);
    }

    public void wvg(String str, String str2, ki kiVar) {
        ImageManager.zy(str, str2, kiVar);
    }

    public n7h x2() {
        return n7h.m17329n((Application) this.f27968k.getApplicationContext());
    }

    /* JADX INFO: renamed from: z */
    public void m17281z(long j2, String str, ArrayList<String> arrayList, f7l8 f7l8Var) {
        if (!cdj(EnumC4976i.DESK_RECOMMEND_V2)) {
            DesktopRecommendManager.toq(j2, str, arrayList, f7l8Var);
            return;
        }
        try {
            MarketService.openService(this.f27968k).loadDesktopRecommendInfoV2(j2, str, arrayList, new DesktopRecommendCallbackAdapter(f7l8Var));
        } catch (RemoteException unused) {
        }
    }

    public boolean zurt() {
        return ni7(true);
    }

    public ApkVerifyInfo zy(String str, String str2, boolean z2) {
        toq();
        return new toq(str, str2, z2).m17338y();
    }
}
