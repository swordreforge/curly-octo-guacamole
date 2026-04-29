package com.android.thememanager.basemodule.privacy;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.ni7;
import com.google.gson.C4871g;
import com.google.gson.zurt;
import ek5k.C6002g;
import java.util.Locale;
import miuix.appcompat.app.ki;
import zp.C7809k;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class UserAgreementVersionManager implements InterfaceC0928g, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: h */
    private static fti<String> f10117h = new fti<>();

    /* JADX INFO: renamed from: p */
    private static boolean f10118p = false;

    /* JADX INFO: renamed from: s */
    public static final String f10119s = "com.android.thememanager.action.REQUEST_PERMISSION";

    /* JADX INFO: renamed from: y */
    private static final String f10120y = "UserAgreementVersion";

    /* JADX INFO: renamed from: g */
    private jp0y f10121g = new C1779k();

    /* JADX INFO: renamed from: k */
    private ki f10122k;

    /* JADX INFO: renamed from: n */
    private AbstractActivityC1717k f10123n;

    /* JADX INFO: renamed from: q */
    private ki f10124q;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.UserAgreementVersionManager$k */
    class C1779k implements jp0y<String> {
        C1779k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(String s2) {
            if (TextUtils.isEmpty(s2) && UserAgreementVersionManager.this.f10122k != null && UserAgreementVersionManager.this.f10122k.isShowing()) {
                UserAgreementVersionManager.this.f10122k.dismiss();
            } else {
                UserAgreementVersionManager userAgreementVersionManager = UserAgreementVersionManager.this;
                userAgreementVersionManager.fn3e(userAgreementVersionManager.f10123n);
            }
        }
    }

    class toq extends AsyncTask<Void, String, String> {
        toq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voids) {
            int i2;
            zp.toq toqVar;
            String strM18116g = com.miui.privacypolicy.f7l8.m18116g(bf2.toq.toq(), C1807g.m7081r() ? C1781k.f57617fn3e : C1781k.f57633t8r, zy.toq());
            if (TextUtils.isEmpty(strM18116g)) {
                return null;
            }
            try {
                try {
                    i2 = Integer.parseInt(strM18116g);
                } catch (NumberFormatException unused) {
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 <= Integer.MIN_VALUE && (toqVar = (zp.toq) new C4871g().n7h(strM18116g, zp.toq.class)) != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(bf2.toq.toq().getString(R.string.privacy_phone_update_content));
                    stringBuffer.append("<br>");
                    stringBuffer.append(UserAgreementVersionManager.ld6(toqVar.translation));
                    stringBuffer.append(bf2.toq.toq().getString(R.string.privacy_read_the_updated_privacy_policy_content, C1781k.m6907s(fu4.m7067k())));
                    return stringBuffer.toString().replaceAll("\\n", "<br>");
                }
            } catch (zurt e2) {
                Log.w(UserAgreementVersionManager.f10120y, "checkAgreementVersion: ", e2);
            } catch (Exception unused2) {
            }
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String result) {
            super.onPostExecute(result);
            boolean unused = UserAgreementVersionManager.f10118p = true;
            UserAgreementVersionManager.cdj(result);
        }
    }

    public UserAgreementVersionManager() {
    }

    public static void cdj(String content) {
        f10117h.cdj(content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m6895h(AbstractActivityC1717k abstractActivityC1717k, DialogInterface dialogInterface, int i2) {
        if (TextUtils.isEmpty(f10117h.m4388g())) {
            return;
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.mpzf, null, com.android.thememanager.basemodule.analysis.toq.a46k));
        m6898p(abstractActivityC1717k);
        dialogInterface.dismiss();
    }

    public static boolean ki() {
        return (f10118p && TextUtils.isEmpty(f10117h.m4388g())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kja0(AbstractActivityC1717k abstractActivityC1717k, DialogInterface dialogInterface, int i2) {
        if (TextUtils.isEmpty(f10117h.m4388g())) {
            return;
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.mpzf, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        zy.m6920q(abstractActivityC1717k);
        cdj(null);
        ni7.m7146k().zy("com.android.thememanager.action.REQUEST_PERMISSION", new Intent("com.android.thememanager.action.REQUEST_PERMISSION"));
    }

    public static String ld6(C7809k multilingual) {
        if (multilingual == null) {
            return "";
        }
        String str = String.format("%s_%s", Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        str.hashCode();
        switch (str) {
            case "bo_CN":
                return multilingual.bo_CN;
            case "ug_CN":
                return multilingual.ug_CN;
            case "zh_CN":
                return multilingual.zh_CN;
            case "zh_TW":
                return multilingual.zh_TW;
            default:
                return multilingual.en_US;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n7h(Activity activity, DialogInterface dialogInterface, int i2) {
        if (TextUtils.isEmpty(f10117h.m4388g())) {
            return;
        }
        cdj(null);
        if (x2.x2()) {
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.e8vv, null, com.android.thememanager.basemodule.analysis.toq.a46k));
            activity.startActivityForResult(x2.m6912g(true, x2.f57641ld6), 6002);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m6898p(final Activity activity) {
        ki kiVarM25037g = new ki.C6947k(activity).lrht(R.string.privacy_update_prompt_title).m25050z(Html.fromHtml(bf2.toq.toq().getString(R.string.privacy_permit_privacy_policy_content, C1781k.m6907s(fu4.m7067k())))).dd(R.string.exit_extreme_mode_dialog_agree, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.f7l8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UserAgreementVersionManager.qrj(activity, dialogInterface, i2);
            }
        }).mcp(R.string.theme_user_agreement_exit, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UserAgreementVersionManager.n7h(activity, dialogInterface, i2);
            }
        }).m25047s(false).m25037g();
        this.f10124q = kiVarM25037g;
        if (!kiVarM25037g.isShowing()) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.e8vv, null, ""));
            this.f10124q.show();
        }
        this.f10124q.ki().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void qrj(Activity activity, DialogInterface dialogInterface, int i2) {
        if (TextUtils.isEmpty(f10117h.m4388g())) {
            return;
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.e8vv, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        zy.m6920q(activity);
        cdj(null);
        ni7.m7146k().zy("com.android.thememanager.action.REQUEST_PERMISSION", new Intent("com.android.thememanager.action.REQUEST_PERMISSION"));
    }

    /* JADX INFO: renamed from: s */
    public static void m6900s() {
        if (C1781k.toq(bf2.toq.toq()) && x2.zy()) {
            new toq().executeOnExecutor(C6002g.n7h(), new Void[0]);
        }
    }

    public static boolean x2() {
        return !TextUtils.isEmpty(f10117h.m4388g());
    }

    public void fn3e(final AbstractActivityC1717k activity) {
        if (!C1819o.eqxt(activity) || TextUtils.isEmpty(f10117h.m4388g())) {
            return;
        }
        ki kiVar = this.f10122k;
        if (kiVar != null && kiVar.isShowing()) {
            this.f10122k.dismiss();
        }
        ki kiVarM25037g = new ki.C6947k(activity).lrht(R.string.privacy_update_prompt_title).m25050z(Html.fromHtml(f10117h.m4388g())).dd(R.string.exit_extreme_mode_dialog_agree, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UserAgreementVersionManager.kja0(activity, dialogInterface, i2);
            }
        }).mcp(R.string.exit_extreme_mode_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f10127k.m6895h(activity, dialogInterface, i2);
            }
        }).m25047s(false).m25037g();
        this.f10122k = kiVarM25037g;
        if (!kiVarM25037g.isShowing()) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.mpzf, null, ""));
            this.f10122k.show();
        }
        this.f10122k.ki().setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        ki kiVar = this.f10122k;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        ki kiVar2 = this.f10124q;
        if (kiVar2 != null) {
            kiVar2.dismiss();
        }
        this.f10122k = null;
        this.f10124q = null;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        if (f10118p || !C1819o.eqxt(this.f10123n)) {
            return;
        }
        f10117h.m4391p(this.f10123n, this.f10121g);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
        f10117h.kja0(this.f10121g);
    }

    public UserAgreementVersionManager(AbstractActivityC1717k activity) {
        this.f10123n = activity;
    }
}
