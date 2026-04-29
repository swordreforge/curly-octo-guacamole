package com.android.thememanager.h5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o1t;
import androidx.lifecycle.n7h;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.PageGroup;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.h5.n */
/* JADX INFO: compiled from: ThemeWebFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2069n extends C1582h implements InterfaceC1357q, InterfaceC1925p {

    /* JADX INFO: renamed from: j */
    public static final String f12239j = "status_bar";

    /* JADX INFO: renamed from: m */
    private static final String f12240m = "&dark";

    /* JADX INFO: renamed from: o */
    private static final String f12241o = "diyring.cc";

    /* JADX INFO: renamed from: c */
    protected k f12242c;

    /* JADX INFO: renamed from: e */
    private boolean f12243e = false;

    /* JADX INFO: renamed from: f */
    protected PageGroup f12244f;

    /* JADX INFO: renamed from: com.android.thememanager.h5.n$k */
    /* JADX INFO: compiled from: ThemeWebFragment.java */
    public interface k {
        boolean gyi();

        void n2t(String url);

        void qo(boolean visible);

        /* JADX INFO: renamed from: x */
        void mo7961x();

        void yqrt();
    }

    private Fragment r6ty(String url) {
        if (url != null) {
            Uri uri = Uri.parse(url);
            if (uri.getHost() != null && mcp.m7141y(uri.getHost())) {
                return new C2068k();
            }
        }
        return new zy();
    }

    protected PageGroup el() {
        if (kiv() != null) {
            return (PageGroup) kiv().getSerializable(InterfaceC1357q.f53848bf2);
        }
        return null;
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        k kVar = this.f12242c;
        if (kVar == null || !kVar.gyi()) {
            return super.gyi();
        }
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.z3jl;
    }

    public void n2t(String url) {
        k kVar;
        if (C1915g.m7549k() && (kVar = this.f12242c) != null) {
            kVar.n2t(url);
        }
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        wt();
        n7h n7hVarCh = getChildFragmentManager().ch(R.id.root);
        if (n7hVarCh == null) {
            Bundle bundle = new Bundle();
            bundle.putInt(InterfaceC1357q.f53940sok, yp31());
            String url = null;
            PageGroup pageGroup = this.f12244f;
            if (pageGroup != null) {
                url = pageGroup.getUrl();
                if (C1819o.d2ok(getActivity())) {
                    url = url + f12240m;
                }
                bundle.putString(InterfaceC1357q.f53885i1, url);
                bundle.putSerializable(InterfaceC1357q.f53848bf2, this.f12244f);
                if (!TextUtils.isEmpty(this.f12244f.getTitle())) {
                    bundle.putString(InterfaceC1357q.f53909m4, this.f12244f.getTitle());
                }
            }
            o1t o1tVarKi = getChildFragmentManager().ki();
            Fragment fragmentR6ty = r6ty(url);
            fragmentR6ty.setArguments(bundle);
            o1tVarKi.toq(R.id.root, fragmentR6ty);
            o1tVarKi.qrj();
            n7hVarCh = fragmentR6ty;
        }
        if (n7hVarCh instanceof k) {
            this.f12242c = (k) n7hVarCh;
        }
        View view = getView();
        if (view == null || !this.f12243e) {
            return;
        }
        C1819o.zy(view.getContext(), view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(zff0(), container, false);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        k kVar = this.f12242c;
        if (kVar != null) {
            kVar.yqrt();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        k kVar = this.f12242c;
        if (kVar != null) {
            kVar.mo7961x();
        }
        super.onResume();
        k kVar2 = this.f12242c;
        if (kVar2 != null) {
            kVar2.qo(true);
        }
    }

    protected void wt() {
        this.f12244f = el();
        if (getArguments() != null) {
            this.f12243e = getArguments().getBoolean(f12239j, false);
        }
    }

    protected int yp31() {
        return 0;
    }

    protected int zff0() {
        return R.layout.theme_web_content;
    }
}
