package com.android.thememanager.comment.view.fragment;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.t8r;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.comment.view.activity.ResourceCommentsActivity;
import com.android.thememanager.comment.view.widget.ResourceCommentsListView;
import com.android.thememanager.comment.view.widget.SubCommentBar;
import com.android.thememanager.router.detail.callback.StartCommentEditActivityListener;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import i1.C6077k;
import java.util.List;
import lv5.InterfaceC6781k;
import zy.lvui;

/* JADX INFO: compiled from: ResourceCommentsFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends com.android.thememanager.basemodule.base.toq implements com.android.thememanager.basemodule.async.toq<Object, List<ResourceCommentGroup>, List<ResourceCommentGroup>>, AbsListView.OnScrollListener, InterfaceC6781k.k.InterfaceC8092k, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f57891ab = "resource";
    private static final int bb = 0;
    private static final int bp = 1;

    /* JADX INFO: renamed from: a */
    private FrameLayout f10768a;

    /* JADX INFO: renamed from: b */
    private TextView f10769b;

    /* JADX INFO: renamed from: c */
    private View f10770c;

    /* JADX INFO: renamed from: d */
    private int f10771d;

    /* JADX INFO: renamed from: e */
    private View f10772e;

    /* JADX INFO: renamed from: f */
    private View f10773f;

    /* JADX INFO: renamed from: j */
    private View f10774j;

    /* JADX INFO: renamed from: l */
    protected ResourceCommentsActivity f10775l;

    /* JADX INFO: renamed from: m */
    private View f10776m;

    /* JADX INFO: renamed from: o */
    private View f10777o;

    /* JADX INFO: renamed from: r */
    protected ld6 f10778r;

    /* JADX INFO: renamed from: t */
    protected ResourceCommentsListView f10779t;

    /* JADX INFO: renamed from: u */
    private t8r.toq f10780u;

    /* JADX INFO: renamed from: v */
    private Resource f10781v;

    /* JADX INFO: renamed from: x */
    private SubCommentBar f10783x;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private InterfaceC6781k.toq f57892bo = null;

    /* JADX INFO: renamed from: w */
    private StartCommentEditActivityListener f10782w = new C1892k();

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.n7h$k */
    /* JADX INFO: compiled from: ResourceCommentsFragment.java */
    class C1892k implements StartCommentEditActivityListener {
        C1892k() {
        }

        @Override // com.android.thememanager.router.detail.callback.StartCommentEditActivityListener
        public void onPostExecute(AsyncTask<?, ?, ?> asyncTask, boolean result) {
            if (n7h.this.f10769b != null) {
                n7h.this.f10769b.setText(R.string.resource_comment_edit_comment);
            }
            if (n7h.this.f10776m != null) {
                n7h.this.f10776m.setEnabled(true);
            }
        }

        @Override // com.android.thememanager.router.detail.callback.StartCommentEditActivityListener
        public void onPreExecute(final AsyncTask<?, ?, ?> asyncTask) {
            if (n7h.this.f10769b != null) {
                n7h.this.f10769b.setText(R.string.resource_comment_edit_comment_waiting);
            }
            if (n7h.this.f10776m != null) {
                n7h.this.f10776m.setEnabled(false);
            }
        }
    }

    /* JADX INFO: compiled from: ResourceCommentsFragment.java */
    class toq implements t8r.toq {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.utils.t8r.toq
        /* JADX INFO: renamed from: k */
        public void mo7222k() {
            n7h.this.f1bi();
            n7h.this.f10783x.m7455p(null);
            n7h.this.f10783x.setVisibility(0);
            n7h.this.f10768a.setVisibility(4);
        }

        @Override // com.android.thememanager.basemodule.utils.t8r.toq
        public void toq() {
            n7h.this.f1bi();
            n7h.this.f10783x.clearFocus();
            n7h.this.f10783x.setVisibility(8);
            n7h.this.f10768a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1bi() {
        Rect rect = new Rect();
        this.f10773f.getWindowVisibleDisplayFrame(rect);
        this.f10771d = this.f10773f.getRootView().getHeight() - rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0ad, reason: merged with bridge method [inline-methods] */
    public void cyoe() {
        wt(this.f10783x, 0);
        wt(this.f10777o, 1);
    }

    private void imd() {
        com.android.thememanager.comment.util.zy.m7428n(this.f10775l, this.f10781v, this.f10782w);
    }

    private int l05() {
        View view = this.f10773f;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r6ty(View view) {
        imd();
    }

    private void wt(View view, int locationAt) {
        if (view == null) {
            return;
        }
        f1bi();
        int iL05 = l05();
        if (locationAt == 0) {
            int height = (iL05 - this.f10771d) - view.getHeight();
            if (y9n.m7258z() && !C1819o.oc()) {
                height += y9n.cdj(view.getContext());
            }
            view.setY(height);
            return;
        }
        if (locationAt == 1) {
            int height2 = 0;
            if (this.f10768a.getVisibility() == 0) {
                height2 = this.f10768a.getHeight();
            } else if (this.f10783x.getVisibility() == 0) {
                height2 = this.f10783x.getHeight();
            }
            view.setY((iL05 - view.getHeight()) - height2);
        }
    }

    public static n7h yp31(Resource resource) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("resource", resource);
        n7h n7hVar = new n7h();
        n7hVar.setArguments(bundle);
        return n7hVar;
    }

    public void bqie(ResourceCommentGroup commentGroup) {
        InterfaceC6781k.toq toqVar = this.f57892bo;
        if (toqVar != null) {
            toqVar.mo7434g(commentGroup);
        }
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void ch() {
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: el, reason: merged with bridge method [inline-methods] */
    public void py(List<ResourceCommentGroup>... values) {
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return com.android.thememanager.basemodule.analysis.toq.qmo;
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void n7h() {
        if (!this.f10779t.toq()) {
            this.f10774j.setVisibility(8);
            this.f10777o.setVisibility(0);
        } else {
            this.f10772e.setVisibility(8);
            this.f10770c.setVisibility(4);
            this.f10774j.setVisibility(0);
            this.f10777o.setVisibility(8);
        }
    }

    @Override // lv5.InterfaceC6781k.k.InterfaceC8092k
    public void nmn5(@lvui ResourceCommentItem commentItem) {
        this.f10783x.getCommentEdit().requestFocus();
        this.f10783x.setInfo(commentItem, commentItem.commentId, this.f10781v);
        ((InputMethodManager) this.f10775l.getSystemService("input_method")).showSoftInput(this.f10783x.getCommentEdit(), 0);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.f10775l = (ResourceCommentsActivity) getActivity();
        this.f10772e = this.f10773f.findViewById(R.id.resource_comment_empty_view);
        this.f10774j = this.f10773f.findViewById(R.id.resource_comment_loadingprogressbar_list);
        this.f10777o = this.f10773f.findViewById(R.id.resource_comment_loadingprogressbar_next_pape);
        this.f10773f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.thememanager.comment.view.fragment.qrj
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f10811k.cyoe();
            }
        });
        this.f10780u = new toq();
        ld6 ld6Var = new ld6(this.f10775l, this, this.f10781v);
        this.f10778r = ld6Var;
        this.f10779t.setAdapter((ListAdapter) ld6Var);
        this.f10778r.m6691z(false);
        this.f10779t.setOnScrollListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.resource_comment_list_container, (ViewGroup) null);
        this.f10773f = viewInflate;
        ResourceCommentsListView resourceCommentsListView = (ResourceCommentsListView) viewInflate.findViewById(android.R.id.list);
        this.f10779t = resourceCommentsListView;
        resourceCommentsListView.setFillMode(0);
        this.f10779t.addHeaderView(inflater.inflate(R.layout.resource_comment_list_header, (ViewGroup) null), null, false);
        View viewInflate2 = inflater.inflate(R.layout.resource_comment_list_footer, (ViewGroup) null);
        this.f10770c = viewInflate2;
        this.f10779t.addFooterView(viewInflate2, null, false);
        this.f10783x = (SubCommentBar) this.f10773f.findViewById(R.id.sub_comment_bar);
        FrameLayout frameLayout = (FrameLayout) this.f10773f.findViewById(R.id.resource_comment_edit_layout);
        this.f10768a = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = getResources().getDimensionPixelSize(R.dimen.miuix_appcompat_split_action_bar_default_height);
        }
        this.f10776m = this.f10773f.findViewById(R.id.resource_comment_edit_btn);
        this.f10769b = (TextView) this.f10773f.findViewById(R.id.resource_comment_edit_text);
        this.f10776m.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10814k.r6ty(view);
            }
        });
        this.f10781v = (Resource) getArguments().getSerializable("resource");
        C6077k.m22369i(this.f10776m);
        return this.f10773f;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ld6 ld6Var = this.f10778r;
        if (ld6Var != null) {
            ld6Var.jk(this);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        ResourceCommentsListView resourceCommentsListView = this.f10779t;
        if (resourceCommentsListView != null) {
            resourceCommentsListView.setMobility(!hidden);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        t8r.toq(getActivity(), this.f10780u);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        t8r.m7220k(getActivity(), this.f10780u);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        cyoe();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: zff0, reason: merged with bridge method [inline-methods] */
    public void ij(List<ResourceCommentGroup> result) {
        this.f10774j.setVisibility(8);
        this.f10777o.setVisibility(8);
        if (this.f10779t.toq()) {
            this.f10772e.setVisibility(0);
        } else {
            this.f10770c.setVisibility(0);
        }
    }

    @Override // lv5.InterfaceC6781k.k.InterfaceC8092k
    public void zsr0(@lvui ResourceCommentGroup commentGroup, @lvui InterfaceC6781k.toq view) {
        this.f57892bo = view;
        this.f10775l.zsr0(commentGroup, -1L, this);
    }
}
