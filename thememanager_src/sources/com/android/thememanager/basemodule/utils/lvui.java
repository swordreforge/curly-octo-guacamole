package com.android.thememanager.basemodule.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.UserAgreementVersionManager;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.util.gc3c;
import com.market.sdk.utils.C5010k;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import miui.drm.DrmManager;
import miuix.appcompat.app.ki;
import p000a.InterfaceC0001q;
import yz.C7794k;

/* JADX INFO: compiled from: PermissionsUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class lvui {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57772f7l8 = 1011;

    /* JADX INFO: renamed from: g */
    public static final int f10349g = -2;

    /* JADX INFO: renamed from: k */
    public static final String[] f10350k = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f57773ld6 = "theme_user_agreement_remind_again2";

    /* JADX INFO: renamed from: n */
    public static final int f10351n = -1;

    /* JADX INFO: renamed from: p */
    public static final String f10352p = "key_get_device_status";

    /* JADX INFO: renamed from: q */
    public static final int f10353q = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f57774qrj = "PermissionsUtils";

    /* JADX INFO: renamed from: s */
    public static final int f10354s = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f57775toq = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57776x2 = "storage_permission_switch";

    /* JADX INFO: renamed from: y */
    public static final int f10355y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57777zy = 1;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.lvui$k */
    /* JADX INFO: compiled from: PermissionsUtils.java */
    static class AsyncTaskC1814k extends AsyncTask<Void, String, Integer> {

        /* JADX INFO: renamed from: k */
        private final String f10356k;

        /* JADX INFO: renamed from: q */
        private final int f10357q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final WeakReference<AbstractC0067g> f57778toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final WeakReference<p000a.zy> f57779zy;

        public AsyncTaskC1814k(String permissionName, AbstractC0067g mActivityResultLauncher, p000a.zy callBack, int eventFlag) {
            this.f10356k = permissionName;
            this.f57778toq = new WeakReference<>(mActivityResultLauncher);
            this.f57779zy = new WeakReference<>(callBack);
            this.f10357q = eventFlag;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voids) {
            try {
                return Integer.valueOf(lvui.ncyb(this.f10356k));
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            WeakReference<AbstractC0067g> weakReference = this.f57778toq;
            AbstractC0067g abstractC0067g = weakReference != null ? weakReference.get() : null;
            WeakReference<p000a.zy> weakReference2 = this.f57779zy;
            p000a.zy zyVar = weakReference2 != null ? weakReference2.get() : null;
            if (abstractC0067g == null || zyVar == null) {
                return;
            }
            if (this.f10357q != 1) {
                zyVar.toq(true);
                return;
            }
            if (result.intValue() != 1) {
                zyVar.toq(true);
                return;
            }
            String[] strArr = lvui.f10350k;
            String[] strArr2 = new String[2];
            strArr2[0] = kja0.m7111p().getString(Build.VERSION.SDK_INT >= 30 ? R.string.system_cta_runtime_perm_desc_storage_above_eleven : R.string.system_cta_runtime_perm_desc_storage);
            strArr2[1] = " ";
            lvui.m7126l(abstractC0067g, strArr, strArr2);
        }
    }

    public static boolean a9(Context context) {
        return (ni7(context) || jp0y()) ? false : true;
    }

    private static void cdj(final Context context, String message, final boolean finish) {
        if (context != null) {
            if (!(context instanceof Activity) || gc3c.cdj((Activity) context)) {
                new ki.C6947k(context).uv6(kja0.ld6(R.string.need_to_open_permission)).m25050z(message).m25047s(false).x9kr(kja0.ld6(R.string.system_aod_dialog_positive_button), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.gvn7
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        lvui.d3(context, finish, dialogInterface, i2);
                    }
                }).mcp(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.d3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        lvui.oc(finish, context, dialogInterface, i2);
                    }
                }).hb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d2ok(Activity activity, p000a.zy zyVar, DialogInterface dialogInterface, int i2) {
        if (PreferenceManager.getDefaultSharedPreferences(activity).getBoolean(f57776x2, false)) {
            return;
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.kl, null, com.android.thememanager.basemodule.analysis.toq.a46k));
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
        editorEdit.putBoolean(f57776x2, false);
        editorEdit.apply();
        if (zyVar != null) {
            zyVar.toq(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d3(Context context, boolean z2, DialogInterface dialogInterface, int i2) {
        fn3e(context);
        if (z2) {
            ((Activity) context).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dd(InterfaceC0001q interfaceC0001q, Map map) {
        if (map.isEmpty() || interfaceC0001q.jz5() == null) {
            return;
        }
        if (m7123h(map)) {
            interfaceC0001q.jz5().mo0k();
        } else {
            interfaceC0001q.jz5().toq(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void eqxt(Activity activity, p000a.zy zyVar, DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.kl, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
        editorEdit.putBoolean(f57776x2, true);
        editorEdit.apply();
        if (zyVar != null) {
            zyVar.mo0k();
        }
    }

    public static void fn3e(Context context) {
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("extra_pkgname", context.getPackageName());
            context.startActivity(intent);
        } catch (Exception e2) {
            Intent intent2 = new Intent();
            intent2.addFlags(268435456);
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent2);
            Log.d(f57774qrj, "Can Not Open Authority Management " + e2);
        }
    }

    public static boolean fti(Context context) {
        return a9.t8r(context);
    }

    private static boolean fu4() {
        String vaid;
        try {
            vaid = DrmManager.getVAID(bf2.toq.toq());
        } catch (Exception | NoSuchMethodError e2) {
            e2.printStackTrace();
            vaid = null;
        }
        boolean z2 = !p029m.zy.toq(vaid);
        Log.i(f57774qrj, "isDrmV: " + z2);
        return z2;
    }

    public static boolean gvn7() {
        if (!p029m.zy.toq(C1807g.m7075i())) {
            return fu4();
        }
        Log.i(f57774qrj, "localVaid is null");
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m7123h(Map<String, Boolean> o2) {
        Iterator<Boolean> it = o2.values().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue = it.next().booleanValue();
            if (!zBooleanValue) {
                return false;
            }
        }
        return zBooleanValue;
    }

    private static boolean hyr(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getApplicationInfo("com.lbe.security.miui", 128).metaData.getBoolean("miui.supportGetPermissionState", false);
        } catch (Exception e2) {
            Log.e(f57774qrj, "getMeta error=", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7124i(final Activity context) {
        if (gc3c.cdj(context)) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.wx, null, ""));
            new ki.C6947k(context).uv6(kja0.ld6(R.string.need_to_open_permission)).fu4(R.string.apply_warning_get_device_dialog_message).m25047s(false).x9kr(kja0.ld6(R.string.dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.fti
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lvui.lvui(context, dialogInterface, i2);
                }
            }).mcp(R.string.dialog_negative_button_text, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.jp0y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lvui.m7130r(dialogInterface, i2);
                }
            }).m25037g().show();
        }
    }

    public static boolean jk(Context context) {
        if (y9n.toq(33) || !fti(context)) {
            return false;
        }
        int i2 = 0;
        while (true) {
            String[] strArr = f10350k;
            if (i2 >= strArr.length) {
                return false;
            }
            if (context.checkSelfPermission(strArr[i2]) != 0) {
                return true;
            }
            i2++;
        }
    }

    public static boolean jp0y() {
        String strM7075i = C1807g.m7075i();
        String strQrj = C1807g.qrj();
        if (!p029m.zy.toq(strQrj) && !p029m.zy.toq(strM7075i)) {
            return fu4();
        }
        Log.i(f57774qrj, "isVOVaid: o is empty = " + p029m.zy.toq(strQrj) + ",v is empty = " + p029m.zy.toq(strM7075i));
        return false;
    }

    public static void ki(Context context, boolean finish) {
        cdj(context, Build.VERSION.SDK_INT >= 30 ? kja0.ld6(R.string.custom_storage_permission_desc_above_eleven) : kja0.ld6(R.string.need_to_open_storage_permission_desc), finish);
    }

    public static boolean kja0(com.android.thememanager.basemodule.base.toq fragment, p000a.zy callBack) {
        if (fragment != null && fragment.getActivity() != null && (fragment.getActivity() instanceof AbstractActivityC1717k)) {
            return ld6(fragment.getActivity(), null, callBack, false);
        }
        C7794k.f7l8("checkAndPopStoragePermission activity not AbstractBaseActivity!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static void m7126l(AbstractC0067g activityResultLauncher, String[] permission, String[] permissionDesc) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < permission.length; i2++) {
            arrayList.add(permission[i2]);
            arrayList.add(permissionDesc[i2]);
        }
        activityResultLauncher.toq((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    private static boolean ld6(Activity activity, AbstractC0067g activityResultLauncher, p000a.zy callBack, boolean isStorageMigration) {
        if (!y9n.toq(33) && activity != null && mcp(activity)) {
            if (fti(activity)) {
                if (jk(activity) && isStorageMigration) {
                    if (activityResultLauncher == null && (activity instanceof AbstractActivityC1717k)) {
                        AbstractActivityC1717k abstractActivityC1717k = (AbstractActivityC1717k) activity;
                        activityResultLauncher = abstractActivityC1717k.ek5k();
                        abstractActivityC1717k.gyi(callBack);
                    }
                    x9kr(activityResultLauncher, callBack);
                    return true;
                }
            } else {
                if (C1807g.m7081r()) {
                    return false;
                }
                boolean z2 = isStorageMigration || Build.VERSION.SDK_INT < 30;
                if (!m7134z() && !jk(activity) && z2) {
                    t8r(activity, callBack);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lvui(Activity activity, DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.wx, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
        editorEdit.putBoolean(f10352p, true);
        editorEdit.apply();
    }

    public static boolean mcp(Context context) {
        boolean z2 = false;
        boolean z3 = C1781k.toq(context) || C1781k.ld6(context);
        if (C1807g.m7081r()) {
            return z3;
        }
        if (z3 && (com.android.thememanager.basemodule.privacy.x2.m6914n() <= 2 || !UserAgreementVersionManager.x2())) {
            z2 = true;
        }
        return z2;
    }

    public static AbstractC0067g n5r1(final InterfaceC0001q interfaces) {
        if (interfaces != null) {
            return interfaces.a5id(new toq.C0066y(), new InterfaceC0068k() { // from class: com.android.thememanager.basemodule.utils.d2ok
                @Override // androidx.activity.result.InterfaceC0068k
                /* JADX INFO: renamed from: k */
                public final void mo79k(Object obj) {
                    lvui.dd(interfaces, (Map) obj);
                }
            });
        }
        return null;
    }

    public static boolean n7h(AbstractActivityC1717k activity, p000a.zy callBack, Bundle savedInstanceState) {
        if (savedInstanceState == null && fti(activity)) {
            return qrj(activity, callBack);
        }
        activity.gyi(callBack);
        return false;
    }

    @zy.y9n
    public static int ncyb(String permissionName) {
        Bundle bundle = new Bundle();
        bundle.putString("permissionName", permissionName);
        Bundle bundleCall = C5010k.m17435k().call(Uri.parse("content://com.lbe.security.miui.autostartmgr"), "getPermissionState", (String) null, bundle);
        if (bundleCall == null) {
            return -2;
        }
        return bundleCall.getInt(InterfaceC1925p.l1l1, -2);
    }

    public static boolean ni7(Context context) {
        if (!jp0y() && com.android.thememanager.basemodule.privacy.x2.zy()) {
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f10352p, true);
        }
        return false;
    }

    public static boolean o1t(Context context) {
        if (Build.VERSION.SDK_INT > 29 || context == null) {
            return false;
        }
        return jk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void oc(boolean z2, Context context, DialogInterface dialogInterface, int i2) {
        if (z2) {
            ((Activity) context).finish();
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7128p(AbstractActivityC1717k activity, p000a.zy callBack, Bundle savedInstanceState) {
        if (savedInstanceState == null && fti(activity)) {
            return ld6(activity, null, callBack, true);
        }
        activity.gyi(callBack);
        return false;
    }

    public static boolean qrj(AbstractActivityC1717k activity, p000a.zy callBack) {
        return ld6(activity, null, callBack, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m7130r(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.wx, null, com.android.thememanager.basemodule.analysis.toq.a46k));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7131s(AbstractActivityC1717k activity, p000a.zy callBack) {
        return ld6(activity, null, callBack, true);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m7132t() {
        return C1807g.m7081r() || fti(bf2.toq.toq()) || m7134z();
    }

    private static void t8r(final Activity context, final p000a.zy callBack) {
        if (gc3c.cdj(context)) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.kl, null, ""));
            new ki.C6947k(context).uv6(kja0.ld6(R.string.need_to_open_permission)).m25050z(kja0.ld6(Build.VERSION.SDK_INT >= 30 ? R.string.custom_storage_permission_desc_above_eleven : R.string.custom_storage_permission_desc)).m25047s(false).dd(R.string.dialog_positive_button_text, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.oc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lvui.eqxt(context, callBack, dialogInterface, i2);
                }
            }).mcp(R.string.dialog_negative_button_text, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.utils.eqxt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lvui.d2ok(context, callBack, dialogInterface, i2);
                }
            }).m25037g().show();
        }
    }

    public static boolean wvg() {
        return Build.VERSION.SDK_INT >= 30 || m7134z();
    }

    public static boolean x2(ActivityC0891q activity, p000a.zy callBack, AbstractC0067g activityResultLauncher) {
        return ld6(activity, activityResultLauncher, callBack, false);
    }

    public static void x9kr(AbstractC0067g mActivityResultLauncher, p000a.zy callBack) {
        zurt(f10350k[1], mActivityResultLauncher, callBack, 1);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m7134z() {
        return PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f57776x2, false);
    }

    public static void zurt(String permissionName, AbstractC0067g mActivityResultLauncher, p000a.zy callBack, int flag) {
        if (flag == 1 || flag == 2) {
            new AsyncTaskC1814k(permissionName, mActivityResultLauncher, callBack, flag).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }
}
