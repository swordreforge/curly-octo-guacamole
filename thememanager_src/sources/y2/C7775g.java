package y2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.utils.C1824r;
import java.util.ArrayList;
import zy.lvui;

/* JADX INFO: renamed from: y2.g */
/* JADX INFO: compiled from: FontCompatUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7775g {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f100558zy = "fontDialogPopInHome";

    /* JADX INFO: renamed from: k */
    private static final String f45903k = Build.DEVICE;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f100557toq = Build.VERSION.INCREMENTAL;

    /* JADX INFO: renamed from: q */
    private static final ArrayList<String> f45904q = new ArrayList<>();

    /* JADX INFO: renamed from: y2.g$k */
    /* JADX INFO: compiled from: FontCompatUtils.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo8401k(boolean confirm);
    }

    public static void ld6(@lvui Activity activity, final String resourceId, String resourceCode, int state, final k callback) {
        if (!m28151p(resourceId, resourceCode)) {
            callback.mo8401k(true);
            return;
        }
        int i2 = R.string.font_compat_dialog_download_content;
        int i3 = R.string.font_compat_dialog_download_confirm;
        if (state == 1 || state == 144) {
            i2 = R.string.font_compat_dialog_trial_content;
            i3 = R.string.font_compat_dialog_trial_confirm;
        } else if (state == 3 || state == 112) {
            i2 = R.string.font_compat_dialog_buy_content;
            i3 = R.string.font_compat_dialog_buy_confirm;
        }
        new AlertDialog.Builder(activity).setTitle(R.string.font_compat_dialog_title).setMessage(i2).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: y2.toq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                callback.mo8401k(false);
            }
        }).setNegativeButton(R.string.font_compat_dialog_cancel, new DialogInterface.OnClickListener() { // from class: y2.zy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                callback.mo8401k(false);
            }
        }).setPositiveButton(i3, new DialogInterface.OnClickListener() { // from class: y2.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C7775g.m28154y(resourceId, callback, dialogInterface, i4);
            }
        }).show();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.i8fu, null, ""));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28150n() {
        String str = f45903k;
        return (str.equalsIgnoreCase("cmi") && f100557toq.equalsIgnoreCase("V12.2.2.0.RJACNXM")) || (str.equalsIgnoreCase("lmi") && f100557toq.equalsIgnoreCase("V12.2.2.0.RJKCNXM")) || ((str.equalsIgnoreCase("umi") && f100557toq.equalsIgnoreCase("V12.2.7.0.RJBCNXM")) || ((str.equalsIgnoreCase("picasso") && f100557toq.equalsIgnoreCase("V12.1.4.0.RGICNXM")) || (str.equalsIgnoreCase("vangogh") && f100557toq.equalsIgnoreCase("V12.1.3.0.RJVCNXM"))));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m28151p(String resourceId, String resourceCode) {
        return "fonts".equals(resourceCode) && !f45904q.contains(resourceId) && m28150n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m28153s(DialogInterface dialogInterface, int i2) {
        C1824r.m7203y().m7206p(f100558zy, true).toq();
    }

    public static void x2(@lvui Activity activity) {
        if (!m28150n() || C1824r.m7203y().zy(f100558zy, false) || TextUtils.equals(p001b.toq.t8r("fonts"), C1792n.toq(activity, "fonts"))) {
            return;
        }
        new AlertDialog.Builder(activity).setTitle(R.string.font_compat_dialog_title).setMessage(R.string.font_compat_dialog_trial_content).setPositiveButton(R.string.miuix_compat_dialog_button, new DialogInterface.OnClickListener() { // from class: y2.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7775g.m28153s(dialogInterface, i2);
            }
        }).show();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.q4lv, null, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m28154y(String str, k kVar, DialogInterface dialogInterface, int i2) {
        f45904q.add(str);
        kVar.mo8401k(true);
    }
}
