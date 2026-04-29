package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.clockmessage.C1875q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.mine.remote.view.activity.RemoteResourceFavoriteTabActivity;
import com.android.thememanager.mine.remote.view.activity.RemoteResourceLikeTabActivity;
import com.android.thememanager.mine.remote.view.activity.RemoteResourcePurchasedTabActivity;
import com.android.thememanager.mine.setting.view.AccountScrollView;
import com.android.thememanager.mine.setting.view.activity.ResourceExchangeActivity;
import com.android.thememanager.mine.setting.view.activity.SupportThemeActivity;
import com.android.thememanager.mine.setting.view.zy;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.v9.model.UserMessage;
import com.android.thememanager.view.AccountInfoView;
import com.android.thememanager.view.ComponentCategoryView;
import com.android.thememanager.viewmodel.C2947k;
import com.theme.loopwallpaper.view.C5449k;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.ki;
import miuix.miuixbasewidget.widget.MessageView;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.activity.y */
/* JADX INFO: compiled from: AccountFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class C1632y extends C1582h implements InterfaceC1357q, com.android.thememanager.basemodule.analysis.ld6, InterfaceC1925p, InterfaceC1789q, C1688q.f7l8, com.android.thememanager.basemodule.analysis.toq {
    public static final String bv = "AccountFragment";

    /* JADX INFO: renamed from: a */
    private C5449k f9378a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private MessageView f57358ab;

    /* JADX INFO: renamed from: b */
    private C5449k f9379b;
    private miuix.appcompat.app.ki bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private AccountInfoView f57359bo;
    private miuix.appcompat.app.ki bp;

    /* JADX INFO: renamed from: c */
    private C5449k f9380c;

    /* JADX INFO: renamed from: d */
    private com.android.thememanager.controller.x2 f9381d;

    /* JADX INFO: renamed from: e */
    private C5449k f9382e;

    /* JADX INFO: renamed from: f */
    private ComponentCategoryView f9383f;

    /* JADX INFO: renamed from: j */
    private C5449k f9384j;

    /* JADX INFO: renamed from: m */
    private C5449k f9385m;

    /* JADX INFO: renamed from: o */
    private C5449k f9386o;

    /* JADX INFO: renamed from: u */
    private View.OnClickListener f9387u;

    /* JADX INFO: renamed from: v */
    private C2947k f9388v;

    /* JADX INFO: renamed from: w */
    private boolean f9389w;

    /* JADX INFO: renamed from: x */
    private View f9390x;

    /* JADX INFO: renamed from: com.android.thememanager.activity.y$k */
    /* JADX INFO: compiled from: AccountFragment.java */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.activity.y$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AccountFragment.java */
        class C7903k implements C1688q.n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AbstractActivityC1717k f9392k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ boolean f57360toq;

            C7903k(final AbstractActivityC1717k val$activity, final boolean val$isLogin) {
                this.f9392k = val$activity;
                this.f57360toq = val$isLogin;
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                if (C1632y.this.isAdded()) {
                    C1632y.this.startActivityForResult(new Intent("com.xiaomi.account.action.USER_INFO_DETAIL"), 6000);
                    this.f9392k.m6710d(true);
                    if (this.f57360toq && C1632y.this.f9389w) {
                        return;
                    }
                    C1632y.this.f9388v.m10458c(C1632y.this.f9381d);
                }
            }
        }

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C1781k.toq(bf2.toq.toq())) {
                C1632y.this.ew(true);
                return;
            }
            boolean zWvg = C1688q.cdj().wvg();
            AbstractActivityC1717k abstractActivityC1717k = (AbstractActivityC1717k) C1632y.this.getActivity();
            abstractActivityC1717k.m6710d(false);
            C1688q.cdj().fti(abstractActivityC1717k, new C7903k(abstractActivityC1717k, zWvg));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.y$n */
    /* JADX INFO: compiled from: AccountFragment.java */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1632y.this.startActivity(new Intent(C1632y.this.getActivity(), (Class<?>) SupportThemeActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.y$q */
    /* JADX INFO: compiled from: AccountFragment.java */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.mc));
            Intent intent = new Intent(C1632y.this.getActivity(), (Class<?>) ThemeLabActivity.class);
            intent.putExtra(InterfaceC1357q.f53866eqxt, C1632y.this.getResources().getString(R.string.lab));
            intent.putExtra(p001b.f7l8.nod, "account");
            C1632y.this.startActivity(intent);
            com.android.thememanager.util.g1.ld6();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.y$toq */
    /* JADX INFO: compiled from: AccountFragment.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.activity.y$toq$k */
        /* JADX INFO: compiled from: AccountFragment.java */
        class k implements C1688q.n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f9396k;

            k(final View val$v) {
                this.f9396k = val$v;
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                switch (this.f9396k.getId()) {
                    case R.id.community /* 2131427689 */:
                        com.android.thememanager.v9.f7l8.f7l8(C1632y.this.getActivity(), C1875q.f57860ld6);
                        C1632y c1632y = C1632y.this;
                        c1632y.nme("COMMUNITY", c1632y.m2t(), null);
                        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.xx));
                        break;
                    case R.id.exchange /* 2131427879 */:
                        C1632y.this.btvn();
                        break;
                    case R.id.favorite /* 2131427940 */:
                        Intent intent = new Intent(C1632y.this.getActivity(), (Class<?>) RemoteResourceFavoriteTabActivity.class);
                        intent.putExtra(InterfaceC1357q.f53857d2ok, R.string.favorite_list);
                        C1632y.this.startActivity(intent);
                        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.g8));
                        break;
                    case R.id.like /* 2131428186 */:
                        Intent intent2 = new Intent(C1632y.this.getActivity(), (Class<?>) RemoteResourceLikeTabActivity.class);
                        intent2.putExtra(InterfaceC1357q.f53857d2ok, R.string.like_list);
                        C1632y.this.startActivity(intent2);
                        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.wqg));
                        break;
                    case R.id.purchased /* 2131428529 */:
                        Intent intent3 = new Intent(C1632y.this.getActivity(), (Class<?>) RemoteResourcePurchasedTabActivity.class);
                        intent3.putExtra(InterfaceC1357q.f53857d2ok, R.string.order_list);
                        C1632y.this.startActivity(intent3);
                        com.android.thememanager.basemodule.analysis.zy.m6679k().put("entryType", "account");
                        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.vf));
                        break;
                }
            }
        }

        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View v2) {
            if (!C1781k.toq(bf2.toq.toq())) {
                C1632y.this.ew(true);
            } else {
                C1688q.cdj().fti(C1632y.this.getActivity(), new k(v2));
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.y$zy */
    /* JADX INFO: compiled from: AccountFragment.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.w0));
            RecommendItem recommendItem = new RecommendItem();
            recommendItem.setItemType(RecommendItem.RecommendType.CUSTOMIZE);
            C1632y.this.getActivity().startActivityForResult(new RecommendItemResolver(recommendItem, C1632y.this.f9059l).getForwardIntent(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btvn() {
        if (com.android.thememanager.util.gc3c.cdj(getActivity())) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.w2bz));
            startActivity(new Intent(getActivity(), (Class<?>) ResourceExchangeActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cn02(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.vz));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void exv8(DialogInterface dialogInterface, int i2) {
        pnt2();
        this.bp.show();
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.c8n3));
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.czxz, null, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hyow(DialogInterface dialogInterface, int i2) {
        final com.android.thememanager.mine.setting.view.zy zyVar = new com.android.thememanager.mine.setting.view.zy();
        zyVar.gb(new zy.InterfaceC2205q() { // from class: com.android.thememanager.activity.k
            @Override // com.android.thememanager.mine.setting.view.zy.InterfaceC2205q
            /* JADX INFO: renamed from: k */
            public final void mo6423k(int i3) {
                this.f9118k.qh4d(zyVar, i3);
            }
        });
        zyVar.cyoe(getChildFragmentManager(), null);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ct));
    }

    private void kq2f() {
        this.f9378a.f30410k.setOnClickListener(new q());
    }

    private void mi1u() {
        int iM7744s;
        if (!C1688q.cdj().o1t() || (iM7744s = C1976k.m7741y().m7744s()) == 0) {
            this.f57358ab.setVisibility(8);
        } else {
            this.f57358ab.setVisibility(0);
            this.f57358ab.setMessage(getResources().getQuantityString(R.plurals.anonymous_resource_view, iM7744s, Integer.valueOf(iM7744s)));
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.fpx, null, ""));
        }
        boolean z2 = com.android.thememanager.basemodule.privacy.x2.f7l8() || com.android.thememanager.basemodule.privacy.x2.m6914n() == 1;
        C5449k c5449k = this.f9386o;
        if (c5449k != null) {
            c5449k.kja0(!z2);
        }
        C5449k c5449k2 = this.f9385m;
        if (c5449k2 != null) {
            c5449k2.kja0(!z2);
        }
    }

    private void mj() {
        this.f9390x.setOnClickListener(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ovdh(DialogInterface dialogInterface, int i2) {
        C1976k.m7741y().m7742g(null);
        this.f57358ab.setVisibility(8);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.oqy));
    }

    private void pnt2() {
        if (this.bp == null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.me_anonymous_dialog_message_view, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.message)).setText(R.string.anonymous_resource_unlink_hint);
            this.bp = new ki.C6947k(getActivity()).lrht(R.string.anonymous_resource_unlink_title).nn86(viewInflate).mcp(R.string.anonymous_resource_unlink_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.toq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C1632y.cn02(dialogInterface, i2);
                }
            }).dd(R.string.anonymous_resource_unlink_confirm, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.zy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9437k.ovdh(dialogInterface, i2);
                }
            }).m25037g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qh4d(com.android.thememanager.mine.setting.view.zy zyVar, int i2) {
        zyVar.gb(null);
        mi1u();
    }

    private void vwb() {
        AccountScrollView accountScrollView = (AccountScrollView) getView().findViewById(R.id.scroll_view);
        View viewFindViewById = getView().findViewById(R.id.status_bar_bg);
        accountScrollView.setStatusBarView(viewFindViewById);
        AccountInfoView accountInfoView = (AccountInfoView) getView().findViewById(R.id.account_view);
        this.f57359bo = accountInfoView;
        accountInfoView.m10220m();
        this.f57359bo.setFragment(new WeakReference<>(this));
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f57359bo.getLayoutParams();
        int iQrj = com.android.thememanager.util.gc3c.qrj(getResources());
        layoutParams2.topMargin = iQrj;
        layoutParams.height = iQrj;
        k kVar = new k();
        this.f57359bo.findViewById(R.id.avatar).setOnClickListener(kVar);
        this.f57359bo.findViewById(R.id.name).setOnClickListener(kVar);
        MessageView messageView = (MessageView) getView().findViewById(R.id.anonymous_link_bar);
        this.f57358ab = messageView;
        messageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.f7l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9046k.xblq(view);
            }
        });
        TextView textView = (TextView) this.f57358ab.findViewById(android.R.id.text1);
        if (textView != null) {
            textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.me_anonymous_link_bar_text_size));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<com.android.thememanager.basemodule.model.flextab.toq> listZurt = p001b.toq.zurt(p001b.toq.f7227z);
        if (listZurt != null) {
            for (com.android.thememanager.basemodule.model.flextab.toq toqVar : listZurt) {
                if (toqVar.mo6880y(p001b.toq.f7227z)) {
                    arrayList.add(toqVar.m6881q());
                    arrayList2.add(Integer.valueOf(toqVar.mo6879n()));
                    arrayList3.add(Integer.valueOf(toqVar.toq()));
                }
            }
        }
        ComponentCategoryView componentCategoryView = (ComponentCategoryView) getView().findViewById(R.id.category_view);
        this.f9383f = componentCategoryView;
        componentCategoryView.setComponentItems(arrayList, arrayList2, arrayList3, 1);
        this.f9387u = new toq();
        C5449k c5449k = new C5449k(getView().findViewById(R.id.like));
        this.f9382e = c5449k;
        c5449k.m18561p(R.string.like_list);
        this.f9382e.m18560n(R.drawable.me_account_like_svg);
        this.f9382e.f30410k.setOnClickListener(this.f9387u);
        C5449k c5449k2 = new C5449k(getView().findViewById(R.id.favorite));
        this.f9380c = c5449k2;
        c5449k2.m18561p(R.string.favorite_list);
        this.f9380c.m18560n(R.drawable.me_account_favourite_svg);
        this.f9380c.f30410k.setOnClickListener(this.f9387u);
        C5449k c5449k3 = new C5449k(getView().findViewById(R.id.purchased));
        this.f9384j = c5449k3;
        c5449k3.m18561p(R.string.order_list);
        this.f9384j.m18560n(R.drawable.me_account_order_svg);
        this.f9384j.f30410k.setOnClickListener(this.f9387u);
        C5449k c5449k4 = new C5449k(getView().findViewById(R.id.community));
        this.f9386o = c5449k4;
        c5449k4.m18561p(R.string.theme_community);
        this.f9386o.m18560n(R.drawable.me_account_community_svg);
        this.f9386o.f30410k.setOnClickListener(this.f9387u);
        C5449k c5449k5 = new C5449k(getView().findViewById(R.id.mix));
        this.f9379b = c5449k5;
        c5449k5.m18561p(R.string.title_component);
        this.f9379b.m18560n(R.drawable.me_account_mix_svg);
        xm();
        C5449k c5449k6 = new C5449k(getView().findViewById(R.id.lab));
        this.f9378a = c5449k6;
        c5449k6.m18561p(R.string.lab);
        this.f9378a.m18560n(R.drawable.me_account_lab_svg);
        kq2f();
        if (com.android.thememanager.basemodule.utils.qrj.zy(qrj.toq.LAB)) {
            this.f9378a.toq();
        }
        C5449k c5449k7 = new C5449k(getView().findViewById(R.id.exchange));
        this.f9385m = c5449k7;
        c5449k7.m18561p(R.string.resource_exchange);
        this.f9385m.m18560n(R.drawable.me_account_exchange_svg);
        this.f9385m.f30410k.setOnClickListener(this.f9387u);
        View viewFindViewById2 = getView().findViewById(R.id.support);
        this.f9390x = viewFindViewById2;
        C6077k.f7l8(viewFindViewById2);
        mj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xblq(View view) {
        miuix.appcompat.app.ki kiVar = this.bb;
        if (kiVar == null || !kiVar.isShowing()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.me_link_dialog_view, (ViewGroup) null);
            Map<String, Integer> mapM7743p = C1976k.m7741y().m7743p();
            for (String str : mapM7743p.keySet()) {
                Integer num = C1976k.f11185q.get(str);
                if (num != null) {
                    TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.me_link_dialog_view_item, (ViewGroup) linearLayout, false);
                    textView.setText(getActivity().getResources().getQuantityString(num.intValue(), mapM7743p.get(str).intValue(), mapM7743p.get(str)));
                    linearLayout.addView(textView);
                }
            }
            int iM7744s = C1976k.m7741y().m7744s();
            this.bb = new ki.C6947k(getActivity()).uv6(getActivity().getResources().getQuantityString(R.plurals.anonymous_resource_count_title, iM7744s, Integer.valueOf(iM7744s))).nn86(linearLayout).mcp(R.string.anonymous_resource_unlink, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9244k.exv8(dialogInterface, i2);
                }
            }).dd(R.string.anonymous_resource_link_now, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9052k.hyow(dialogInterface, i2);
                }
            }).hb();
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.fpx));
        }
    }

    private void xm() {
        this.f9379b.f30410k.setOnClickListener(new zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xtb7(@zy.dd UserMessage userMessage) {
        if (userMessage != null) {
            this.f9389w = true;
            this.f57359bo.setInfo(userMessage);
        }
    }

    @Override // com.android.thememanager.basemodule.account.C1688q.f7l8
    public void ebn() {
        Log.i(bv, "Start onAccountUpdate");
        this.f57359bo.y9n();
        if (C1688q.cdj().m6590z() == null) {
            this.f57359bo.m10219j();
        } else {
            this.f9388v.m10458c(this.f9381d);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.x85;
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        vwb();
        this.f9388v.m10459f().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.q
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9319k.xtb7((UserMessage) obj);
            }
        });
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(this.f9059l);
        this.f9381d = x2VarLd6;
        this.f9388v.m10458c(x2VarLd6);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            if (requestCode == 6000) {
                C1688q.cdj().m6587p();
            }
        } else if (resultCode == -1) {
            if (data.getBooleanExtra(AuthorAttentionActivity.f57267bo, false)) {
                this.f57359bo.setHasUpdateFeed(false);
            }
            this.f57359bo.setFollowNum(C2782h.f16520p);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@zy.lvui Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        ComponentCategoryView componentCategoryView = this.f9383f;
        if (componentCategoryView != null) {
            componentCategoryView.m10229p();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C1688q.cdj().eqxt(this);
        this.f9388v = (C2947k) new C0924e(this).m4420k(C2947k.class);
        Log.d(C2755a.f16307g, "has login theme " + C1688q.cdj().wvg());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_list_items, container, false);
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        AccountInfoView accountInfoView = this.f57359bo;
        if (accountInfoView != null) {
            accountInfoView.ek5k();
        }
        miuix.appcompat.app.ki kiVar = this.bb;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        miuix.appcompat.app.ki kiVar2 = this.bp;
        if (kiVar2 != null) {
            kiVar2.dismiss();
        }
        super.onDestroy();
        C1688q.cdj().dd(this);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f9383f.setNeedRefreshView(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9383f.m10230s();
        mi1u();
    }
}
