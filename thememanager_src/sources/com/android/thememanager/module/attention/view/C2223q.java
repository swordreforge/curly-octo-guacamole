package com.android.thememanager.module.attention.view;

import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.module.attention.presenter.AuthorDynamicsPresenter;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.v9.model.UILink;
import v0af.zy;

/* JADX INFO: renamed from: com.android.thememanager.module.attention.view.q */
/* JADX INFO: compiled from: AuthorDynamicsFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2223q extends f7l8 {

    /* JADX INFO: renamed from: d */
    public static final String f13050d = "dynamic";

    /* JADX INFO: renamed from: v */
    private zy.InterfaceC8138zy f13051v;

    /* JADX INFO: renamed from: com.android.thememanager.module.attention.view.q$k */
    /* JADX INFO: compiled from: AuthorDynamicsFragment.java */
    public interface k {
        void d2ok();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return f13050d;
    }

    @Override // com.android.thememanager.module.attention.view.f7l8
    protected void ob() {
        this.f13051v.zkd();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == -1 && this.f13036a != null && data.getBooleanExtra(C2782h.f61253toq, false)) {
            this.f13036a.ki();
            this.f13051v.a9(0L);
            ob();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle b2) {
        super.onCreate(b2);
        this.f13051v = new AuthorDynamicsPresenter();
        getLifecycle().mo4451k(this.f13051v);
    }

    @Override // com.android.thememanager.module.attention.view.f7l8
    protected void wt() {
        if (getActivity() instanceof k) {
            ((k) getActivity()).d2ok();
        }
        super.wt();
    }

    @Override // com.android.thememanager.module.attention.view.f7l8
    protected boolean xm() {
        if (getActivity() != null && getActivity().getIntent().getStringExtra("packIds") != null) {
            String[] strArrSplit = getActivity().getIntent().getStringExtra("packIds").split(",");
            if (strArrSplit.length == 1) {
                UILink uILink = new UILink();
                uILink.link = strArrSplit[0];
                uILink.productType = "THEME";
                uILink.type = "PRODUCT_DETAIL";
                com.android.thememanager.v9.f7l8.ld6(getActivity(), null, uILink, com.android.thememanager.v9.f7l8.m10170s());
                return true;
            }
        }
        return super.xm();
    }
}
