package com.android.thememanager.h5;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.privacy.zy;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.h5.C2069n;
import com.android.thememanager.h5.jsinterface.KuYinExtJsInterface;
import com.android.thememanager.library.base.arch.cache.C2086q;
import miui.app.constants.ThemeManagerConstants;
import miuix.appcompat.app.ki;
import miuix.hybrid.HybridView;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.h5.k */
/* JADX INFO: compiled from: KuYinWebFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2068k extends zy implements InterfaceC1357q, InterfaceC1925p, ThemeManagerConstants, C2069n.k {
    private static final String ar = "https://h5res.kuyin123.com/client/rights/xiaomi.html";
    private static final String bc = "has_agree_kuyin_agreement";
    private KuYinExtJsInterface bs;
    private ki k0;

    /* JADX INFO: renamed from: com.android.thememanager.h5.k$k */
    /* JADX INFO: compiled from: KuYinWebFragment.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            if (C2068k.this.getActivity() == null || C2068k.this.getActivity().isFinishing() || C2068k.this.getActivity().isDestroyed()) {
                return;
            }
            C2068k.this.getActivity().onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.k$toq */
    /* JADX INFO: compiled from: KuYinWebFragment.java */
    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            if (C2068k.this.getActivity() == null || C2068k.this.getActivity().isFinishing() || C2068k.this.getActivity().isDestroyed()) {
                return;
            }
            C2068k.this.fh();
            C2068k c2068k = C2068k.this;
            c2068k.kz28(c2068k.hyow());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fh() {
        C2086q.toq().m8020s(bc, true);
    }

    private boolean kq() {
        return C2086q.toq().m8016k(bc, false);
    }

    @Override // com.android.thememanager.h5.zy
    protected void exv8(HybridView webView) {
        webView.setPullableStatus(false);
        webView.getSettings().qrj(100);
        KuYinExtJsInterface kuYinExtJsInterface = new KuYinExtJsInterface(getActivity(), webView);
        this.bs = kuYinExtJsInterface;
        webView.toq(kuYinExtJsInterface, KuYinExtJsInterface.KUYIN_EXT_JS_INTERFACE);
    }

    @Override // com.android.thememanager.h5.zy, com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        KuYinExtJsInterface kuYinExtJsInterface = this.bs;
        return kuYinExtJsInterface != null && kuYinExtJsInterface.onBackPressed();
    }

    @Override // com.android.thememanager.h5.zy
    protected void kz28(Uri uri) {
        if (kq()) {
            super.kz28(uri);
        }
    }

    @Override // com.android.thememanager.h5.zy, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (kq()) {
            return;
        }
        String string = getString(R.string.kuyin_user_agreement_content_href);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.kuyin_user_agreement_content, string));
        int iIndexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(new zy.C1787k(getActivity(), ar), iIndexOf, string.length() + iIndexOf, 33);
        ki kiVarM25037g = new ki.C6947k(getActivity()).lrht(R.string.theme_user_agreement_title).m25047s(false).m25050z(spannableStringBuilder).dd(R.string.theme_user_agreement_allow, new toq()).mcp(R.string.theme_user_agreement_exit, new k()).m25037g();
        this.k0 = kiVarM25037g;
        kiVarM25037g.show();
        TextView textViewKi = this.k0.ki();
        if (textViewKi != null) {
            textViewKi.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // com.android.thememanager.h5.zy, miuix.hybrid.kja0, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ki kiVar = this.k0;
        if (kiVar == null || !kiVar.isShowing()) {
            return;
        }
        this.k0.dismiss();
    }

    @Override // com.android.thememanager.h5.zy, miuix.hybrid.kja0, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KuYinExtJsInterface kuYinExtJsInterface = this.bs;
        if (kuYinExtJsInterface != null) {
            kuYinExtJsInterface.onPause();
        }
    }
}
