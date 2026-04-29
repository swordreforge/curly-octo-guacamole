package com.android.thememanager.activity;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.mine.remote.view.activity.MineResourceTabActivity;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.superwallpaper.C2656k;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.activity.h */
/* JADX INFO: compiled from: BaseFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class C1582h extends com.android.thememanager.basemodule.base.toq {

    /* JADX INFO: renamed from: l */
    protected com.android.thememanager.fu4 f9059l;

    /* JADX INFO: renamed from: r */
    private Bundle f9060r;

    /* JADX INFO: renamed from: t */
    private boolean f9061t = false;

    public com.android.thememanager.fu4 bih() {
        return this.f9059l;
    }

    public void cyoe(Bundle extraArguments) {
        this.f9060r = extraArguments;
    }

    public void ec() {
    }

    public Bundle kiv() {
        return this.f9060r;
    }

    public void l05(boolean isSearchFromAudio, String searchContent) {
        SearchableInfo searchableInfo = ((SearchManager) getActivity().getSystemService(C2656k.f15718s)).getSearchableInfo(getActivity().getComponentName());
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.putExtra(isSearchFromAudio ? InterfaceC1357q.f53866eqxt : InterfaceC1357q.f53941t8iq, searchContent);
        intent.setComponent(searchableInfo.getSearchActivity());
        intent.putExtra("REQUEST_RESOURCE_CODE", this.f9059l.getResourceCode());
        startActivityForResult(intent, 1);
    }

    protected void o5() {
        PageGroup pageGroup;
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        if (getActivity() instanceof MineResourceTabActivity) {
            String stringExtra = getActivity().getIntent().getStringExtra("REQUEST_RESOURCE_CODE");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            this.f9059l = C2082k.zy().m8001n().m10535g(stringExtra);
            return;
        }
        this.f9059l = ((kja0) getActivity()).etdu();
        if (kiv() == null || (pageGroup = (PageGroup) kiv().getSerializable(InterfaceC1357q.f53848bf2)) == null || TextUtils.isEmpty(pageGroup.getResourceCode()) || pageGroup.getResourceCode().equals(this.f9059l.getResourceCode())) {
            return;
        }
        this.f9059l = C2082k.zy().m8001n().m10535g(pageGroup.getResourceCode());
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        o5();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f9061t = true;
    }

    public boolean rp() {
        return false;
    }

    public boolean yw() {
        return this.f9061t;
    }

    public AbstractC6946k z4t() {
        ActivityC0891q activity = getActivity();
        if (activity instanceof AbstractActivityC1717k) {
            return ((AbstractActivityC1717k) activity).m6709b();
        }
        return null;
    }
}
