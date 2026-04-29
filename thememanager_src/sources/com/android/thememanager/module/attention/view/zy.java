package com.android.thememanager.module.attention.view;

import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.module.attention.presenter.AuthorAttentionPresenter;
import com.android.thememanager.util.C2782h;
import v0af.zy;
import zy.dd;

/* JADX INFO: compiled from: AuthorAttentionFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends f7l8 {

    /* JADX INFO: renamed from: w */
    public static final String f13054w = "attention";

    /* JADX INFO: renamed from: d */
    private com.android.thememanager.v9.holder.toq f13055d;

    /* JADX INFO: renamed from: v */
    private zy.InterfaceC7703k f13056v;

    @Override // v0af.zy.toq
    public void b9ub(@dd Boolean attention) {
        com.android.thememanager.v9.holder.toq toqVar = this.f13055d;
        if (toqVar != null) {
            if (attention == null) {
                toqVar.wvg();
            } else if (attention.booleanValue()) {
                this.f13055d.fu4();
            } else {
                this.f13055d.m10180z();
            }
        }
    }

    public void cn02(boolean value, com.android.thememanager.v9.holder.toq viewHolder, String userId, String authorName) {
        this.f13055d = viewHolder;
        this.f13056v.fti(value, userId, authorName);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return "attention";
    }

    @Override // com.android.thememanager.module.attention.view.f7l8
    protected void ob() {
        this.f13056v.d3();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == -1 && this.f13036a != null && data.getBooleanExtra(C2782h.f61253toq, false)) {
            C2782h.f16522s.clear();
            this.f13036a.ki();
            this.f13056v.wx16();
            ob();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f13056v = new AuthorAttentionPresenter();
        getLifecycle().mo4451k(this.f13056v);
    }
}
