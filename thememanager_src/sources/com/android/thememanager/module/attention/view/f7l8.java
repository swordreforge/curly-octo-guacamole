package com.android.thememanager.module.attention.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.ThemeLinearLayoutManager;
import com.android.thememanager.basemodule.views.ld6;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.module.attention.presenter.C2218k;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.view.ResourceEmptyView;
import java.util.List;
import miuix.springback.view.SpringBackLayout;
import v0af.zy;
import zy.dd;

/* JADX INFO: compiled from: BaseAuthorFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f7l8 extends C1582h implements zy.toq {

    /* JADX INFO: renamed from: a */
    protected toq f13036a;

    /* JADX INFO: renamed from: b */
    protected LinearLayoutManager f13037b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f60509bo;

    /* JADX INFO: renamed from: c */
    protected x2 f13038c;

    /* JADX INFO: renamed from: e */
    protected SpringBackLayout f13039e;

    /* JADX INFO: renamed from: f */
    protected RecyclerView f13040f;

    /* JADX INFO: renamed from: j */
    protected ViewGroup f13041j;

    /* JADX INFO: renamed from: m */
    protected ld6 f13042m;

    /* JADX INFO: renamed from: o */
    protected View f13043o;

    /* JADX INFO: renamed from: u */
    private boolean f13044u;

    /* JADX INFO: renamed from: x */
    private boolean f13045x;

    /* JADX INFO: renamed from: com.android.thememanager.module.attention.view.f7l8$k */
    /* JADX INFO: compiled from: BaseAuthorFragment.java */
    class C2219k implements x2.InterfaceC1868n {
        C2219k() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            f7l8.this.ob();
        }
    }

    private void bqie() {
        if (this.f13045x && this.f13044u && !this.f60509bo) {
            this.f13041j = (ResourceEmptyView) getView().findViewById(R.id.empty_view);
            f1bi();
            this.f60509bo = true;
        }
    }

    private void btvn() {
        nn86.toq(getActivity().getResources().getText(R.string.online_no_network), 0);
        this.f13038c.m7374q(false, true);
    }

    private void g0ad() {
        if (this.f13041j == null) {
            ViewStub viewStub = (ViewStub) getView().findViewById(R.id.webview_reload_stub);
            ld6 ld6Var = new ld6();
            this.f13042m = ld6Var;
            ViewGroup viewGroupM7337k = ld6Var.m7337k(viewStub, 1);
            this.f13041j = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f13041j.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.attention.view.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13049k.imd(view);
                }
            });
        }
    }

    private void gb(List<UIElement> list, boolean hasMore) {
        if (xm()) {
            getActivity().finish();
        }
        this.f13036a.ni7(list);
        el();
        this.f13038c.m7374q(true, hasMore);
        this.f13038c.m7373p(hasMore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void imd(View view) {
        if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.module.attention.view.g
                @Override // p000a.toq
                public final void onSuccess() {
                    this.f13047k.kq2f();
                }
            });
        } else {
            kq2f();
        }
    }

    private void kbj() {
        mj();
        ((TextView) this.f13041j.findViewById(R.id.reload_info)).setText(R.string.author_dynamic_no_resource);
        this.f13038c.m7373p(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq2f() {
        this.f13041j.setVisibility(8);
        this.f13043o.setVisibility(0);
        ob();
    }

    private void tww7() {
        mj();
        ((TextView) this.f13041j.findViewById(R.id.reload_info)).setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.no_data);
        this.f13038c.m7373p(false);
    }

    public void el() {
        g0ad();
        this.f13040f.setVisibility(0);
        this.f13041j.setVisibility(8);
        this.f13043o.setVisibility(8);
    }

    protected void f1bi() {
        wt();
        this.f13043o.setVisibility(0);
        this.f13040f.setAdapter(this.f13036a);
        ob();
        this.f13038c = new x2(this.f13039e, new C2219k(), false, true);
    }

    public void mj() {
        g0ad();
        this.f13040f.setVisibility(8);
        this.f13041j.setVisibility(0);
        this.f13043o.setVisibility(8);
    }

    protected abstract void ob();

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.f13045x = true;
        bqie();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.content_author_list, container, false);
        this.f13039e = (SpringBackLayout) viewGroup.findViewById(R.id.refreshLayout);
        this.f13043o = viewGroup.findViewById(R.id.loading);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recyclerView);
        this.f13040f = recyclerView;
        recyclerView.setVisibility(8);
        ThemeLinearLayoutManager themeLinearLayoutManager = new ThemeLinearLayoutManager(getActivity());
        this.f13037b = themeLinearLayoutManager;
        this.f13040f.setLayoutManager(themeLinearLayoutManager);
        bqie();
        return viewGroup;
    }

    @Override // v0af.zy.toq
    public void pc(@dd C2218k result) {
        List<UIElement> list;
        if (result != null && (list = result.f13035k) != null && (!list.isEmpty() || zff0() >= 1)) {
            gb(result.f13035k, result.f60508zy);
            return;
        }
        if (zff0() >= 1) {
            if (C1915g.m7550n()) {
                return;
            }
            btvn();
        } else if (result == null || result.f13035k == null) {
            tww7();
        } else {
            kbj();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.f13044u = isVisibleToUser;
        bqie();
    }

    protected void wt() {
        this.f13036a = new toq(this);
    }

    protected boolean xm() {
        return false;
    }

    public int zff0() {
        return this.f13036a.getItemCount();
    }
}
