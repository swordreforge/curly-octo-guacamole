package com.android.thememanager.mine.local.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.jz5;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.f7l8;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.controller.local.C1907k;
import com.android.thememanager.controller.local.kja0;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.remote.view.activity.RemoteResourcePurchasedTabActivity;
import gbni.InterfaceC6058k;
import gbni.InterfaceC6058k.k;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import miuix.miuixbasewidget.widget.MessageView;
import miuix.recyclerview.widget.C7318k;
import p001b.InterfaceC1357q;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLocalResourceFragment<P extends InterfaceC6058k.k> extends f7l8<P> implements InterfaceC0928g, InterfaceC6058k.toq<P>, View.OnClickListener, BatchOperationAdapter.zy {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f60451ab = "has_goto_purchasedList";

    /* JADX INFO: renamed from: w */
    public static final String f12738w = "goto_pref";

    /* JADX INFO: renamed from: b */
    protected View f12740b;

    /* JADX INFO: renamed from: c */
    private TextView f12741c;

    /* JADX INFO: renamed from: e */
    protected RecyclerView f12743e;

    /* JADX INFO: renamed from: f */
    private View f12744f;

    /* JADX INFO: renamed from: j */
    protected com.android.thememanager.basemodule.views.f7l8 f12745j;

    /* JADX INFO: renamed from: l */
    protected MessageView f12746l;

    /* JADX INFO: renamed from: m */
    protected RecyclerView.AbstractC1048h f12747m;

    /* JADX INFO: renamed from: o */
    protected BaseLocalResourceAdapter f12748o;

    /* JADX INFO: renamed from: r */
    protected View f12749r;

    /* JADX INFO: renamed from: u */
    protected String f12750u;

    /* JADX INFO: renamed from: v */
    private View f12751v;

    /* JADX INFO: renamed from: x */
    protected C1791k f12752x;

    /* JADX INFO: renamed from: a */
    protected boolean f12739a = false;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected boolean f60452bo = false;

    /* JADX INFO: renamed from: d */
    private p000a.zy f12742d = new C2164k();

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment$k */
    class C2164k implements p000a.zy {
        C2164k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            InterfaceC6058k.k kVar = (InterfaceC6058k.k) BaseLocalResourceFragment.this.kiv();
            if (kVar != null) {
                kVar.wvg(BaseLocalResourceFragment.this.f12750u);
            }
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(BaseLocalResourceFragment.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment$n */
    class C2165n implements jp0y<List<Resource>> {
        C2165n() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(@dd List<Resource> resources) {
            BaseLocalResourceFragment.this.gc3c(resources);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment$q */
    class C2166q implements C1688q.n {
        C2166q() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            Intent intentW831 = RemoteResourcePurchasedTabActivity.w831(BaseLocalResourceFragment.this.getActivity(), BaseLocalResourceFragment.this.f12752x.getResourceCode());
            intentW831.putExtra(InterfaceC1357q.f53866eqxt, BaseLocalResourceFragment.this.getResources().getString(R.string.order_list));
            BaseLocalResourceFragment.this.startActivityForResult(intentW831, 1);
            zsr0.toq.m28224y();
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.vf);
            arrayMapZy.put("entryType", com.android.thememanager.basemodule.analysis.toq.w82);
            C1708s.f7l8().ld6().ni7(arrayMapZy);
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            BaseLocalResourceFragment baseLocalResourceFragment = BaseLocalResourceFragment.this;
            if (!baseLocalResourceFragment.f12739a || baseLocalResourceFragment.f12748o.m7312m()) {
                return;
            }
            BaseLocalResourceFragment.this.zff0();
        }
    }

    class zy implements C1781k.f7l8 {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
        public void y9n(boolean agree) {
            if (agree) {
                BaseLocalResourceFragment.this.zff0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean el(Resource resource) {
        return C1907k.f10893k.equals(resource.getMetaPath());
    }

    private boolean rp(List<Resource> resources) {
        if (C1792n.o1t(this.f12750u) && kja0.m7517y()) {
            String strM7511g = kja0.m7511g();
            if (!p029m.zy.toq(strM7511g)) {
                for (Resource resource : resources) {
                    if (resource != null) {
                        List<RelatedResource> parentResources = resource.getParentResources();
                        if (!com.android.thememanager.basemodule.utils.kja0.qrj(parentResources)) {
                            String localId = parentResources.get(0).getLocalId();
                            if (!p029m.zy.toq(localId) && localId.equals(strM7511g)) {
                                return true;
                            }
                        }
                        if (resource.getLocalId() != null && resource.getLocalId().equals(strM7511g)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void cyoe() {
        TextView textView = this.f12741c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // gbni.InterfaceC6058k.toq
    public boolean dd() {
        return this.f60452bo;
    }

    @Override // gbni.InterfaceC6058k.toq
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void mo28253do() {
        View view = this.f12744f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // gbni.InterfaceC6058k.toq
    public void dr() {
        if (this.f60452bo) {
            this.f12745j.oc(this.f12751v);
            this.f60452bo = false;
            this.f12746l = null;
        }
    }

    @Override // gbni.InterfaceC6058k.toq
    public void dxef() {
        View view = this.f12744f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    protected void g0ad(int updatingNum, int oldNum) {
        if (updatingNum > oldNum / 2) {
            this.f12746l.setMessage(getString(R.string.theme_batch_updating_text, Integer.valueOf(oldNum)));
        } else {
            this.f12746l.setMessage(getResources().getQuantityString(R.plurals.theme_batch_has_update_text, oldNum, Integer.valueOf(oldNum)));
        }
    }

    @Override // gbni.InterfaceC6058k.toq
    public void gc3c(List<Resource> resources) {
        if (resources == null || resources.isEmpty()) {
            imd();
        } else {
            cyoe();
        }
        if (resources != null && rp(resources)) {
            resources.removeIf(new Predicate() { // from class: com.android.thememanager.mine.local.view.fragment.k
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BaseLocalResourceFragment.el((Resource) obj);
                }
            });
        }
        this.f12748o.xwq3(resources);
    }

    public void imd() {
        TextView textView = this.f12741c;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: k */
    public String mo8236k() {
        return null;
    }

    @Override // gbni.InterfaceC6058k.toq
    public void kcsr() {
        if (this.f60452bo) {
            return;
        }
        if (!this.f12739a) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.me_theme_oper_info_bar, (ViewGroup) null, false);
            this.f12740b = viewInflate;
            MessageView messageView = (MessageView) viewInflate.findViewById(R.id.info_bar);
            this.f12746l = messageView;
            messageView.setVisibility(0);
            this.f12746l.setOnClickListener(new toq());
            this.f12739a = true;
            this.f12745j.ki(this.f12740b);
        }
        this.f12746l.setMessage(getString(R.string.goto_purchased_list));
    }

    @Override // gbni.InterfaceC6058k.toq
    public void kja0() {
    }

    protected abstract int l05();

    @Override // gbni.InterfaceC6058k.toq
    public void ld6(Set<String> deletedItemIds) {
        this.f12748o.mo7308a(deletedItemIds);
        this.f12748o.bf2();
        if (kiv().mo8225y() == null || kiv().mo8225y().isEmpty()) {
            imd();
        }
    }

    @Override // gbni.InterfaceC6058k.toq
    public void m4() {
        startActivity(C1803e.toq(getActivity()));
    }

    @Override // gbni.InterfaceC6058k.toq
    public void m58i(int updatingNum, int oldNum) {
        if (!this.f60452bo) {
            if (this.f12739a) {
                this.f12745j.oc(this.f12740b);
                this.f12739a = false;
            }
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.me_theme_oper_update_info_bar, (ViewGroup) null, false);
            this.f12751v = viewInflate;
            MessageView messageView = (MessageView) viewInflate.findViewById(R.id.info_bar);
            this.f12746l = messageView;
            messageView.setVisibility(0);
            this.f12746l.setOnClickListener(this);
            this.f60452bo = true;
            this.f12745j.ki(this.f12751v);
        }
        g0ad(updatingNum, oldNum);
    }

    protected abstract BaseLocalResourceAdapter o5();

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() == R.id.info_bar && !this.f12748o.m7312m() && this.f60452bo) {
            kiv().qrj();
        }
    }

    @Override // com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        String stringExtra = getActivity().getIntent().getStringExtra("REQUEST_RESOURCE_CODE");
        this.f12750u = stringExtra;
        if (stringExtra == null) {
            this.f12750u = mo8236k();
        }
        this.f12752x = C1791k.getInstance(this.f12750u);
        super.onCreate(savedInstanceState);
        lvui.kja0(this, this.f12742d);
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(l05(), container, false);
        this.f12749r = viewInflate;
        yp31(viewInflate);
        return this.f12749r;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BaseLocalResourceAdapter baseLocalResourceAdapter = this.f12748o;
        if (baseLocalResourceAdapter != null) {
            baseLocalResourceAdapter.nmn5();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        kiv().kja0(this.f12750u);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
    }

    protected RecyclerView.kja0 r6ty() {
        return null;
    }

    @Override // gbni.InterfaceC6058k.toq
    /* JADX INFO: renamed from: s */
    public void mo8237s() {
        imd();
    }

    protected void wt() {
        kiv().fn3e(this, new C2165n());
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
    }

    protected void yp31(View view) {
        TextView textView = (TextView) view.findViewById(R.id.empty_tv);
        this.f12741c = textView;
        if (textView != null) {
            textView.setOnClickListener(new jz5());
        }
        this.f12744f = view.findViewById(R.id.loadingprogressbar);
        this.f12743e = (RecyclerView) view.findViewById(R.id.local_resource_rv);
        BaseLocalResourceAdapter baseLocalResourceAdapterO5 = o5();
        this.f12748o = baseLocalResourceAdapterO5;
        baseLocalResourceAdapterO5.a98o(this);
        com.android.thememanager.basemodule.views.f7l8 f7l8Var = new com.android.thememanager.basemodule.views.f7l8(this.f12748o);
        this.f12745j = f7l8Var;
        this.f12748o.m8239v(f7l8Var);
        RecyclerView.AbstractC1048h abstractC1048hYw = yw();
        this.f12747m = abstractC1048hYw;
        this.f12743e.setLayoutManager(abstractC1048hYw);
        this.f12743e.setAdapter(this.f12745j);
        this.f12743e.setItemAnimator(new C7318k());
        RecyclerView.kja0 kja0VarR6ty = r6ty();
        if (kja0VarR6ty != null) {
            this.f12743e.addItemDecoration(kja0VarR6ty);
        }
        wt();
    }

    protected abstract RecyclerView.AbstractC1048h yw();

    public void zff0() {
        if (!C1781k.toq(bf2.toq.toq())) {
            ix(true, new zy());
        } else {
            C1688q.cdj().fti(getActivity(), new C2166q());
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
    }
}
