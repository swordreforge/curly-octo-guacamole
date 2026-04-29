package com.android.thememanager.basemodule.privacy;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.zy;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1826t;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.C1900g;
import com.android.thememanager.mcp;
import com.android.thememanager.util.gc3c;
import miuix.appcompat.app.ki;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k */
/* JADX INFO: compiled from: UserAgreement.java */
/* JADX INFO: loaded from: classes.dex */
public class C1781k {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f57610a9 = "agree_desc";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f57611cdj = "https://privacy.mi.com/miaccount/?lang=%s";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f57612d2ok = "key_welcome_purchase";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f57613d3 = "app_name";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final String f57615eqxt = "key_app_name";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f57616f7l8 = -3;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f57617fn3e = "themes-pad";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f57618fti = "privacy_policy";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f57619fu4 = "all_purpose";

    /* JADX INFO: renamed from: g */
    public static final int f10129g = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final String f57620gvn7 = "show_locked";

    /* JADX INFO: renamed from: h */
    private static final String f10130h = "https://privacy.mi.com/themes/%s";

    /* JADX INFO: renamed from: i */
    private static final String f10131i = "https://privacy.mi.com/themes-pad/%s";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f57621jk = "user_agreement";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f57622jp0y = "mandatory_permission";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f57623ki = "https://static.account.xiaomi.com/html/agreement/user/%s.html";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f57624kja0 = "https://www.miui.com/res/doc/eula.html?lang=%s";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f57625ld6 = "theme_user_agreement_remind_again2";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f57626lvui = "theme_recommend_trigger";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f57627mcp = "runtime_perm_desc";

    /* JADX INFO: renamed from: n */
    public static final int f10132n = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f57628n7h = "key_local_mode";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f57630o1t = "optional_perm";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final String f57631oc = "key_theme_store";

    /* JADX INFO: renamed from: p */
    private static final String f10133p = "miui.intent.action.SYSTEM_PERMISSION_DECLARE";

    /* JADX INFO: renamed from: q */
    public static final int f10134q = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f57632qrj = "theme_user_has_show_warning_dialog";

    /* JADX INFO: renamed from: r */
    private static final int f10135r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f10136s = 0;

    /* JADX INFO: renamed from: t */
    private static final String f10137t = "runtime_perm";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f57633t8r = "themes";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f57634wvg = "optional_perm_desc";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f57635x2 = "theme_user_has_disagree_agreement";

    /* JADX INFO: renamed from: y */
    public static final int f10138y = 1;

    /* JADX INFO: renamed from: z */
    private static final String f10139z = "use_network";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57637zy = 5001;

    /* JADX INFO: renamed from: k */
    private ki f10140k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ki f57638toq;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static Boolean f57636zurt = Boolean.FALSE;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static Boolean f57629ni7 = Boolean.TRUE;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static boolean f57614dd = false;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$f7l8 */
    /* JADX INFO: compiled from: UserAgreement.java */
    public interface f7l8 {
        void y9n(boolean agree);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$g */
    /* JADX INFO: compiled from: UserAgreement.java */
    public interface g {
        /* JADX INFO: renamed from: k */
        void mo6371k(boolean agree);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$k */
    /* JADX INFO: compiled from: UserAgreement.java */
    class k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f10141k;

        k(final f7l8 val$callback) {
            this.f10141k = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            f7l8 f7l8Var = this.f10141k;
            if (f7l8Var != null) {
                f7l8Var.y9n(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$n */
    /* JADX INFO: compiled from: UserAgreement.java */
    class n implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ g f10143k;

        n(final g val$callback) {
            this.f10143k = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            g gVar = this.f10143k;
            if (gVar != null) {
                gVar.mo6371k(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$q */
    /* JADX INFO: compiled from: UserAgreement.java */
    class q implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f10145k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ g f10147q;

        q(final Activity val$activity, final g val$callback) {
            this.f10145k = val$activity;
            this.f10147q = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            x2.m6915p(3);
            C1781k.m6904h(this.f10145k);
            g gVar = this.f10147q;
            if (gVar != null) {
                gVar.mo6371k(true);
            }
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.m24, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$toq */
    /* JADX INFO: compiled from: UserAgreement.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f10148k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ f7l8 f10150q;

        toq(final Activity val$activity, final f7l8 val$callback) {
            this.f10148k = val$activity;
            this.f10150q = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C1781k.m6904h(this.f10148k);
            f7l8 f7l8Var = this.f10150q;
            if (f7l8Var != null) {
                f7l8Var.y9n(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.k$zy */
    /* JADX INFO: compiled from: UserAgreement.java */
    class zy implements DialogInterface.OnClickListener {
        zy() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Process.killProcess(Process.myPid());
        }
    }

    public static void cdj() {
        f57614dd = true;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
        editorEdit.putBoolean(f57635x2, true);
        editorEdit.putBoolean(f57625ld6, true);
        editorEdit.apply();
        f57636zurt = Boolean.FALSE;
    }

    public static String f7l8(String lang) {
        return String.format(f57623ki, lang);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6903g(Activity activity) {
        if (activity.getApplicationInfo().uid % 100000 == y9n.fu4()) {
            return false;
        }
        new ki.C6947k(activity).uv6(activity.getString(R.string.uid_change_dialog_title)).m25050z(activity.getString(R.string.uid_change_dialog_message)).m25047s(false).x9kr(activity.getString(R.string.uid_change_dialog_ok), new zy()).hb();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m6904h(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(f57625ld6, false);
        editorEdit.apply();
        Boolean bool = Boolean.TRUE;
        f57636zurt = bool;
        f57629ni7 = bool;
        C1708s.f7l8().m6664y(new mcp());
        com.android.thememanager.basemodule.privacy.zy.m6920q(context);
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.zlf, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        C1688q.cdj().x9kr();
        bf2.toq.m5814q();
        com.android.thememanager.basemodule.utils.zy.toq(true);
        C1826t.m7216g();
        C1900g.zy().m7463s(false);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6905k() {
        return toq(bf2.toq.toq()) && !x2.f7l8() && x2.zy();
    }

    public static void ki(boolean agreed) {
        f57614dd = agreed;
    }

    public static void kja0(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(f57625ld6, false);
        editorEdit.apply();
        f57636zurt = Boolean.TRUE;
        bf2.toq.m5814q();
    }

    public static boolean ld6(Context context) {
        if (!f57614dd) {
            if (!context.getSharedPreferences(context.getPackageName() + "_preferences", 4).getBoolean(f57635x2, false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean n7h() {
        if (!x2.zy() || C1807g.m7081r() || C1688q.cdj().jk()) {
            return false;
        }
        return PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f57626lvui, true);
    }

    /* JADX INFO: renamed from: p */
    private static Intent m6906p(Activity activity) {
        String[] stringArray;
        String[] stringArray2;
        String strM7067k = fu4.m7067k();
        if (!TextUtils.isEmpty(C1807g.m7079p(activity))) {
            stringArray = activity.getResources().getStringArray(R.array.system_cta_runtime_perm);
            if (C1807g.m7081r()) {
                stringArray2 = activity.getResources().getStringArray(R.array.system_cta_runtime_perm_desc_pad);
            } else {
                stringArray2 = activity.getResources().getStringArray(Build.VERSION.SDK_INT >= 30 ? R.array.system_cta_runtime_perm_desc_above_eleven : R.array.system_cta_runtime_perm_desc);
            }
        } else {
            stringArray = activity.getResources().getStringArray(R.array.system_cta_runtime_perm_non_phone_state);
            if (C1807g.m7081r()) {
                stringArray2 = activity.getResources().getStringArray(R.array.system_cta_runtime_perm_desc_non_phone_state_pad);
            } else {
                stringArray2 = activity.getResources().getStringArray(Build.VERSION.SDK_INT >= 30 ? R.array.system_cta_runtime_perm_desc_non_phone_state_above_eleven : R.array.system_cta_runtime_perm_desc_non_phone_state);
            }
        }
        boolean zFti = y9n.fti();
        boolean z2 = activity.getIntent() != null && activity.getIntent().getBooleanExtra(f57631oc, false);
        Intent intent = new Intent(f10133p);
        intent.setPackage("com.miui.securitycenter");
        if (C1807g.lvui()) {
            intent.putExtra(f57619fu4, activity.getString(R.string.system_cta_all_purpose_pad));
        } else if (C1807g.zurt()) {
            intent.putExtra(f57619fu4, activity.getString(R.string.system_cta_all_purpose_fold));
        } else {
            if (zFti) {
                intent.putExtra(f57630o1t, stringArray);
                intent.putExtra(f57634wvg, stringArray2);
            }
            if (z2) {
                intent.putExtra(f57619fu4, activity.getIntent().getStringExtra(f57612d2ok));
            } else {
                intent.putExtra(f57619fu4, activity.getString(R.string.system_cta_all_purpose));
            }
        }
        if (C1807g.m7081r()) {
            if (!a9.t8r(bf2.toq.toq())) {
                intent.putExtra(f10137t, stringArray);
                intent.putExtra(f57627mcp, stringArray2);
            } else if (zFti) {
                intent.putExtra(f57630o1t, stringArray);
                intent.putExtra(f57634wvg, stringArray2);
            }
        }
        intent.putExtra(f10139z, true);
        intent.putExtra(f57622jp0y, false);
        intent.putExtra(f57618fti, m6907s(strM7067k));
        if (gc3c.t8r(activity)) {
            intent.putExtra(f57620gvn7, true);
        }
        if (z2) {
            intent.putExtra("app_name", activity.getIntent().getStringExtra(f57615eqxt));
        }
        return intent;
    }

    public static String qrj() {
        try {
            if (x2.m6914n() > 2 && !C1807g.m7081r()) {
                boolean z2 = true;
                if ((Settings.Global.getInt(bf2.toq.toq().getContentResolver(), "personalized_ad_enabled", 1) & 1) == 0) {
                    z2 = false;
                }
                return String.valueOf(z2);
            }
            return String.valueOf(Boolean.FALSE);
        } catch (Exception unused) {
            return "ERROR";
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m6907s(String lang) {
        return C1807g.m7081r() ? String.format(f10131i, lang) : String.format(f10130h, lang);
    }

    public static boolean t8r() {
        return !x2.zy();
    }

    public static boolean toq(Context context) {
        boolean z2 = true;
        if (!f57636zurt.booleanValue()) {
            if (context.getSharedPreferences(context.getPackageName() + "_preferences", 4).getBoolean(f57625ld6, true)) {
                z2 = false;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        f57636zurt = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean x2() {
        return bf2.toq.toq().getSharedPreferences(bf2.toq.toq().getPackageName() + "_preferences", 4).getBoolean(f57632qrj, false);
    }

    /* JADX INFO: renamed from: y */
    public static String m6908y(String lang) {
        return String.format(f57611cdj, lang);
    }

    public static boolean zy() {
        boolean z2 = true;
        if (!f57629ni7.booleanValue() && x2.m6914n() < 1) {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        f57629ni7 = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public void m6909i(Activity activity, final g callback) {
        String strM7067k = fu4.m7067k();
        String.format(activity.getString(R.string.privacy_remind_user_mode_content), m6907s(strM7067k));
        if (this.f57638toq == null) {
            this.f57638toq = new ki.C6947k(activity).uv6(activity.getString(R.string.privacy_remind_user_mode_title)).m25050z(hyr.m7091k(activity, R.string.privacy_remind_user_mode_content, activity.getResources().getColor(R.color.policy_warning_upgrade_user_mode_span), m6907s(strM7067k))).m25047s(false).jk(activity.getString(R.string.theme_user_agreement_exit), new n(callback)).x9kr(activity.getString(R.string.privacy_remind_user_mode_agree), new q(activity, callback)).m25037g();
        }
        this.f57638toq.show();
        TextView textViewKi = this.f57638toq.ki();
        if (textViewKi != null) {
            textViewKi.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6910n() {
        ki kiVar = this.f10140k;
        if (kiVar != null && kiVar.isShowing()) {
            this.f10140k.dismiss();
        }
        ki kiVar2 = this.f57638toq;
        if (kiVar2 == null || !kiVar2.isShowing()) {
            return;
        }
        this.f57638toq.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public boolean m6911q(final Activity activity, Fragment fragment, final f7l8 callback, boolean forceCheck) {
        if (m6903g(activity) || toq(activity) || !C1819o.eqxt(activity) || (ld6(activity) && !forceCheck)) {
            return false;
        }
        f57629ni7 = Boolean.FALSE;
        Intent intentM6906p = m6906p(activity);
        if (activity.getPackageManager().queryIntentActivities(intentM6906p, 0).size() > 0) {
            try {
                if (fragment != null) {
                    fragment.startActivityForResult(intentM6906p, 5001);
                } else {
                    activity.startActivityForResult(intentM6906p, 5001);
                }
                return true;
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        String string = activity.getString(R.string.theme_user_agreement_content1);
        String string2 = activity.getString(R.string.theme_user_agreement_content2);
        String string3 = activity.getString(R.string.theme_user_agreement_content3);
        String string4 = activity.getString(R.string.theme_user_agreement_content4);
        String string5 = activity.getString(R.string.theme_user_agreement_content5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (string + string2 + string3 + string4 + string5));
        int length = string.length();
        int length2 = string2.length() + length;
        int length3 = string3.length() + length2;
        int length4 = string4.length() + length3;
        String strM7067k = fu4.m7067k();
        String str = String.format(f57624kja0, strM7067k);
        String strM6907s = m6907s(strM7067k);
        spannableStringBuilder.setSpan(new zy.C1787k(activity, str), length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.theme_user_agreement_hightlight_color)), length, length2, 33);
        spannableStringBuilder.setSpan(new zy.C1787k(activity, strM6907s), length3, length4, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.theme_user_agreement_hightlight_color)), length3, length4, 33);
        ki kiVarM25037g = new ki.C6947k(activity).lrht(R.string.theme_user_agreement_title).m25050z(spannableStringBuilder).m25047s(false).dd(R.string.theme_user_agreement_allow, new toq(activity, callback)).mcp(R.string.theme_user_agreement_exit, new k(callback)).m25037g();
        this.f10140k = kiVarM25037g;
        kiVarM25037g.show();
        TextView textViewKi = this.f10140k.ki();
        if (textViewKi != null) {
            textViewKi.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return true;
    }
}
