package com.android.thememanager.v9;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.util.g1;
import com.android.thememanager.v9.f7l8;
import com.android.thememanager.v9.model.UILink;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: compiled from: ThemeCommentDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends androidx.fragment.app.zy {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f61485ab = "ThemeCommentDialog";
    private static final String an = "cancel";
    private static final String bb = "theme_comment_dialog";
    private static final String bp = "show";
    private static final String bv = "ok";

    private void bqie() {
        UILink uILink = new UILink();
        uILink.link = g1.fti("theme");
        uILink.productType = "THEME";
        uILink.type = "PRODUCT_DETAIL";
        f7l8.toq toqVarM10170s = f7l8.m10170s();
        toqVarM10170s.m10173k(true);
        f7l8.ld6(getActivity(), null, uILink, toqVarM10170s);
    }

    private void el(DialogInterface dialog) {
        tww7("T_CLICK", an);
    }

    public static void f1bi(ActivityC0891q activity) {
        new n7h().cyoe(activity.getSupportFragmentManager(), f61485ab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0ad(DialogInterface dialogInterface, int i2) {
        wt(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void imd(DialogInterface dialogInterface, int i2) {
        el(dialogInterface);
    }

    private void tww7(@lvui String actionType, @lvui String extra) {
        String strMo6345a = getActivity() instanceof com.android.thememanager.activity.kja0 ? ((com.android.thememanager.activity.kja0) getActivity()).mo6345a() : null;
        com.android.thememanager.basemodule.analysis.kja0.m6641s(actionType, strMo6345a, bb, extra);
        C1708s.f7l8().ld6().n5r1(actionType, C1706p.kja0(strMo6345a, bb, extra));
    }

    private void wt(DialogInterface dialog) {
        bqie();
        tww7("T_CLICK", "ok");
    }

    @Override // androidx.fragment.app.zy
    @lvui
    public Dialog nnh(Bundle savedInstanceState) {
        return new ki.C6947k(requireContext()).fu4(R.string.theme_comment_dialog_message).dd(R.string.theme_comment_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.v9.x2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f17205k.g0ad(dialogInterface, i2);
            }
        }).mcp(R.string.theme_comment_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.v9.qrj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f17181k.imd(dialogInterface, i2);
            }
        }).m25037g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        tww7("T_EXPOSE", bp);
    }
}
