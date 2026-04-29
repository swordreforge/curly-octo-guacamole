package com.android.thememanager.author.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import androidx.viewpager.widget.AbstractC1288k;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.author.C1669k;
import com.android.thememanager.author.fragment.C1662g;
import com.android.thememanager.author.viewmodel.AbstractC1671q;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.router.recommend.entity.AuthorEntity;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.util.bek6;
import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6227f;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.author.fragment.g */
/* JADX INFO: compiled from: AuthorContainerFragment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1662g extends C1582h {

    /* JADX INFO: renamed from: a */
    private ImageView f9572a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private TextView f57397ab;

    /* JADX INFO: renamed from: b */
    private ViewPager f9573b;
    private View bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private TextView f57398bo;
    private Button bp;

    @InterfaceC7395n
    private com.android.thememanager.author.adapter.toq bv;

    /* JADX INFO: renamed from: c */
    private RelativeLayout f9574c;

    /* JADX INFO: renamed from: d */
    private TextView f9575d;

    /* JADX INFO: renamed from: e */
    private NavViewContainer f9576e;

    /* JADX INFO: renamed from: f */
    private com.android.thememanager.author.viewmodel.toq f9577f;

    /* JADX INFO: renamed from: j */
    private View f9578j;

    /* JADX INFO: renamed from: m */
    private View f9579m;

    /* JADX INFO: renamed from: o */
    private View f9580o;

    /* JADX INFO: renamed from: u */
    private TextView f9581u;

    /* JADX INFO: renamed from: v */
    private ImageView f9582v;

    /* JADX INFO: renamed from: w */
    private TextView f9583w;

    /* JADX INFO: renamed from: x */
    private ImageView f9584x;

    @InterfaceC7396q
    private final ArrayList<C1857k> an = new ArrayList<>();

    @InterfaceC7396q
    private final SparseIntArray id = new SparseIntArray();
    private boolean in = true;

    @InterfaceC7396q
    private String bl = "";

    @InterfaceC7396q
    private String as = "";

    @InterfaceC7396q
    private String bg = "";

    @InterfaceC7396q
    private final cyoe.x2<AuthorEntity, was> az = new q();

    @InterfaceC7396q
    private final InterfaceC5981k<was> ba = new zy();

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$g */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    static final class g extends AbstractC6308r implements cyoe.x2<C6227f<? extends Boolean, ? extends Long>, was> {
        g() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(C6227f<? extends Boolean, ? extends Long> c6227f) {
            invoke2((C6227f<Boolean, Long>) c6227f);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n C6227f<Boolean, Long> c6227f) {
            if (c6227f == null) {
                return;
            }
            Log.i("AuthorContainerFragment", "initViewModel: followLiveData: " + c6227f);
            C1662g.this.tjz5(c6227f.getFirst().booleanValue(), c6227f.getSecond().longValue());
            Intent intent = new Intent(InterfaceC1357q.f53946uf);
            intent.putExtra(InterfaceC1357q.f53897kiv, c6227f.getFirst().booleanValue());
            intent.putExtra(InterfaceC1357q.f53971z4t, (int) c6227f.getSecond().longValue());
            intent.putExtra(InterfaceC1357q.f53908m2t, C1662g.this.as);
            ni7.m7146k().zy(InterfaceC1357q.f53946uf, intent);
            if (C1662g.this.in) {
                Intent intent2 = new Intent();
                intent2.putExtra(C2782h.f61253toq, true);
                ActivityC0891q activity = C1662g.this.getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent2);
                }
                C1662g.this.in = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$k */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    public final class k implements ViewPager.InterfaceC1284p {
        public k() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            NavViewContainer navViewContainer = C1662g.this.f9576e;
            if (navViewContainer == null) {
                d2ok.n5r1("mNavContainer");
                navViewContainer = null;
            }
            navViewContainer.setSelectedPosition(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float f2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$n */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    static final class n extends AbstractC6308r implements cyoe.x2<AbstractC1671q, was> {
        n() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(AbstractC1671q abstractC1671q) {
            invoke2(abstractC1671q);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n AbstractC1671q abstractC1671q) {
            if (abstractC1671q == null) {
                return;
            }
            C1662g.this.c25(abstractC1671q);
            Log.i("AuthorContainerFragment", "initViewModel: dataState: " + abstractC1671q);
            com.android.thememanager.author.viewmodel.toq toqVar = C1662g.this.f9577f;
            if (toqVar == null) {
                d2ok.n5r1("mViewModel");
                toqVar = null;
            }
            AuthorEntity authorEntityM6545f = toqVar.m6545f();
            if (authorEntityM6545f != null) {
                C1662g c1662g = C1662g.this;
                c1662g.az.invoke(authorEntityM6545f);
                c1662g.pnt2(authorEntityM6545f);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$q */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    static final class q extends AbstractC6308r implements cyoe.x2<AuthorEntity, was> {
        q() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(AuthorEntity authorEntity) {
            invoke2(authorEntity);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q AuthorEntity author) {
            d2ok.m23075h(author, "author");
            TextView textView = null;
            if (!TextUtils.isEmpty(author.getDesignerIcon())) {
                x2.C1735g c1735gWvg = com.android.thememanager.basemodule.imageloader.x2.fn3e().wvg(0);
                ActivityC0891q activity = C1662g.this.getActivity();
                String designerIcon = author.getDesignerIcon();
                ImageView imageView = C1662g.this.f9584x;
                if (imageView == null) {
                    d2ok.n5r1("mAvatar");
                    imageView = null;
                }
                com.android.thememanager.basemodule.imageloader.x2.m6782y(activity, designerIcon, imageView, c1735gWvg);
            }
            if (!TextUtils.isEmpty(author.getDesignerName())) {
                TextView textView2 = C1662g.this.f9581u;
                if (textView2 == null) {
                    d2ok.n5r1("mAuthorName");
                    textView2 = null;
                }
                textView2.setText(author.getDesignerName());
            }
            if (author.getDesignerLevel() == 1) {
                ImageView imageView2 = C1662g.this.f9582v;
                if (imageView2 == null) {
                    d2ok.n5r1("mOfficial");
                    imageView2 = null;
                }
                bek6.x2(imageView2);
            } else {
                ImageView imageView3 = C1662g.this.f9582v;
                if (imageView3 == null) {
                    d2ok.n5r1("mOfficial");
                    imageView3 = null;
                }
                bek6.m9613g(imageView3);
            }
            TextView textView3 = C1662g.this.f57398bo;
            if (textView3 == null) {
                d2ok.n5r1("mWorksCount");
                textView3 = null;
            }
            textView3.setText(String.valueOf(author.getProductCount()));
            if (!TextUtils.isEmpty(author.getDesignerDescription())) {
                TextView textView4 = C1662g.this.f9583w;
                if (textView4 == null) {
                    d2ok.n5r1("mSignature");
                } else {
                    textView = textView4;
                }
                textView.setText(author.getDesignerDescription());
            }
            C1662g.this.tjz5(author.getFollow(), author.getFansNum());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$toq */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    public final class toq implements NavViewContainer.InterfaceC1856q {
        public toq() {
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        /* JADX INFO: renamed from: k */
        public void mo6323k(int i2) {
            ViewPager viewPager = C1662g.this.f9573b;
            if (viewPager == null) {
                d2ok.n5r1("mViewPager");
                viewPager = null;
            }
            viewPager.setCurrentItem(i2);
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        public void toq() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$zy */
    /* JADX INFO: compiled from: AuthorContainerFragment.kt */
    static final class zy extends AbstractC6308r implements InterfaceC5981k<was> {

        /* JADX INFO: renamed from: com.android.thememanager.author.fragment.g$zy$k */
        /* JADX INFO: compiled from: AuthorContainerFragment.kt */
        public static final class k implements C2782h.q {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C1662g f9587k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ AuthorEntity f57399toq;

            k(C1662g c1662g, AuthorEntity authorEntity) {
                this.f9587k = c1662g;
                this.f57399toq = authorEntity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: q */
            public static final void m6540q(C1662g this$0, AuthorEntity authorEntity) {
                d2ok.m23075h(this$0, "this$0");
                com.android.thememanager.author.viewmodel.toq toqVar = this$0.f9577f;
                if (toqVar == null) {
                    d2ok.n5r1("mViewModel");
                    toqVar = null;
                }
                toqVar.hyr(!authorEntity.getFollow());
            }

            @Override // com.android.thememanager.util.C2782h.q
            /* JADX INFO: renamed from: k */
            public void mo6541k() {
                C1688q c1688qCdj = C1688q.cdj();
                ActivityC0891q activity = this.f9587k.getActivity();
                final C1662g c1662g = this.f9587k;
                final AuthorEntity authorEntity = this.f57399toq;
                c1688qCdj.fti(activity, new C1688q.n() { // from class: com.android.thememanager.author.fragment.y
                    @Override // com.android.thememanager.basemodule.account.C1688q.n
                    public final void loginSuccess() {
                        C1662g.zy.k.m6540q(c1662g, authorEntity);
                    }
                });
            }

            @Override // com.android.thememanager.util.C2782h.q
            public void toq() {
            }
        }

        zy() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void toq(C1662g this$0, AuthorEntity authorEntity) {
            d2ok.m23075h(this$0, "this$0");
            com.android.thememanager.author.viewmodel.toq toqVar = this$0.f9577f;
            if (toqVar == null) {
                d2ok.n5r1("mViewModel");
                toqVar = null;
            }
            toqVar.hyr(!authorEntity.getFollow());
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            com.android.thememanager.author.viewmodel.toq toqVar = C1662g.this.f9577f;
            if (toqVar == null) {
                d2ok.n5r1("mViewModel");
                toqVar = null;
            }
            final AuthorEntity authorEntityM6545f = toqVar.m6545f();
            if (authorEntityM6545f != null) {
                if (authorEntityM6545f.getFollow()) {
                    C2782h.m9791s(C1662g.this.getContext(), new k(C1662g.this, authorEntityM6545f));
                    return;
                }
                C1688q c1688qCdj = C1688q.cdj();
                ActivityC0891q activity = C1662g.this.getActivity();
                final C1662g c1662g = C1662g.this;
                c1688qCdj.fti(activity, new C1688q.n() { // from class: com.android.thememanager.author.fragment.f7l8
                    @Override // com.android.thememanager.basemodule.account.C1688q.n
                    public final void loginSuccess() {
                        C1662g.zy.toq(c1662g, authorEntityM6545f);
                    }
                });
            }
        }
    }

    private final void ab() {
        if (getArguments() != null) {
            qh4d();
            TextView textView = this.f9581u;
            com.android.thememanager.author.viewmodel.toq toqVar = null;
            if (textView == null) {
                d2ok.n5r1("mAuthorName");
                textView = null;
            }
            textView.setText(this.bl);
            TextView textView2 = this.f9581u;
            if (textView2 == null) {
                d2ok.n5r1("mAuthorName");
                textView2 = null;
            }
            textView2.setSelected(true);
            com.android.thememanager.author.viewmodel.toq toqVar2 = this.f9577f;
            if (toqVar2 == null) {
                d2ok.n5r1("mViewModel");
            } else {
                toqVar = toqVar2;
            }
            toqVar.uv6(this.bl, this.bg, this.as);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c25(AbstractC1671q abstractC1671q) {
        ViewPager viewPager = null;
        if (d2ok.f7l8(abstractC1671q, AbstractC1671q.zy.f9606k)) {
            RelativeLayout relativeLayout = this.f9574c;
            if (relativeLayout == null) {
                d2ok.n5r1("mAuthorContainer");
                relativeLayout = null;
            }
            bek6.m9613g(relativeLayout);
            View view = this.f9580o;
            if (view == null) {
                d2ok.n5r1("mLoadingContainer");
                view = null;
            }
            bek6.m9613g(view);
            View view2 = this.f9579m;
            if (view2 == null) {
                d2ok.n5r1("mErrorContainer");
                view2 = null;
            }
            bek6.m9613g(view2);
            xblq();
            ViewPager viewPager2 = this.f9573b;
            if (viewPager2 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager2;
            }
            bek6.m9613g(viewPager);
            return;
        }
        if (d2ok.f7l8(abstractC1671q, AbstractC1671q.q.f9604k)) {
            RelativeLayout relativeLayout2 = this.f9574c;
            if (relativeLayout2 == null) {
                d2ok.n5r1("mAuthorContainer");
                relativeLayout2 = null;
            }
            bek6.x2(relativeLayout2);
            View view3 = this.f9580o;
            if (view3 == null) {
                d2ok.n5r1("mLoadingContainer");
                view3 = null;
            }
            bek6.x2(view3);
            View view4 = this.f9579m;
            if (view4 == null) {
                d2ok.n5r1("mErrorContainer");
                view4 = null;
            }
            bek6.m9613g(view4);
            xblq();
            ViewPager viewPager3 = this.f9573b;
            if (viewPager3 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager3;
            }
            bek6.m9613g(viewPager);
            return;
        }
        if (d2ok.f7l8(abstractC1671q, AbstractC1671q.n.f9603k)) {
            RelativeLayout relativeLayout3 = this.f9574c;
            if (relativeLayout3 == null) {
                d2ok.n5r1("mAuthorContainer");
                relativeLayout3 = null;
            }
            bek6.x2(relativeLayout3);
            View view5 = this.f9580o;
            if (view5 == null) {
                d2ok.n5r1("mLoadingContainer");
                view5 = null;
            }
            bek6.m9613g(view5);
            View view6 = this.f9579m;
            if (view6 == null) {
                d2ok.n5r1("mErrorContainer");
                view6 = null;
            }
            bek6.m9613g(view6);
            f3f();
            ViewPager viewPager4 = this.f9573b;
            if (viewPager4 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager4;
            }
            bek6.x2(viewPager);
            return;
        }
        if (d2ok.f7l8(abstractC1671q, AbstractC1671q.k.f9602k)) {
            RelativeLayout relativeLayout4 = this.f9574c;
            if (relativeLayout4 == null) {
                d2ok.n5r1("mAuthorContainer");
                relativeLayout4 = null;
            }
            bek6.m9613g(relativeLayout4);
            View view7 = this.f9580o;
            if (view7 == null) {
                d2ok.n5r1("mLoadingContainer");
                view7 = null;
            }
            bek6.m9613g(view7);
            View view8 = this.f9579m;
            if (view8 == null) {
                d2ok.n5r1("mErrorContainer");
                view8 = null;
            }
            bek6.m9613g(view8);
            xblq();
            ViewPager viewPager5 = this.f9573b;
            if (viewPager5 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager5;
            }
            bek6.m9613g(viewPager);
            return;
        }
        if (d2ok.f7l8(abstractC1671q, AbstractC1671q.toq.f9605k)) {
            RelativeLayout relativeLayout5 = this.f9574c;
            if (relativeLayout5 == null) {
                d2ok.n5r1("mAuthorContainer");
                relativeLayout5 = null;
            }
            bek6.x2(relativeLayout5);
            View view9 = this.f9580o;
            if (view9 == null) {
                d2ok.n5r1("mLoadingContainer");
                view9 = null;
            }
            bek6.m9613g(view9);
            View view10 = this.f9579m;
            if (view10 == null) {
                d2ok.n5r1("mErrorContainer");
                view10 = null;
            }
            bek6.x2(view10);
            xblq();
            ViewPager viewPager6 = this.f9573b;
            if (viewPager6 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager6;
            }
            bek6.m9613g(viewPager);
        }
    }

    private final void f3f() {
        ImageView imageView = this.f9582v;
        View view = null;
        if (imageView == null) {
            d2ok.n5r1("mOfficial");
            imageView = null;
        }
        bek6.x2(imageView);
        View view2 = this.f9578j;
        if (view2 == null) {
            d2ok.n5r1("mCountContainer");
            view2 = null;
        }
        bek6.x2(view2);
        TextView textView = this.f9583w;
        if (textView == null) {
            d2ok.n5r1("mSignature");
            textView = null;
        }
        bek6.x2(textView);
        TextView textView2 = this.f57397ab;
        if (textView2 == null) {
            d2ok.n5r1("mFollow");
            textView2 = null;
        }
        bek6.x2(textView2);
        View view3 = this.bb;
        if (view3 == null) {
            d2ok.n5r1("mNavLayout");
        } else {
            view = view3;
        }
        bek6.x2(view);
    }

    private final void hyow() {
        int i2 = requireArguments().getInt(C1669k.f57403toq, -1);
        int i3 = this.id.get(i2, -1);
        Log.i("AuthorContainerFragment", "gotoTabForType: select tab type: " + i2 + ", position: " + i3);
        if (i3 == -1) {
            return;
        }
        ViewPager viewPager = this.f9573b;
        ViewPager viewPager2 = null;
        if (viewPager == null) {
            d2ok.n5r1("mViewPager");
            viewPager = null;
        }
        AbstractC1288k adapter = viewPager.getAdapter();
        if ((adapter != null ? adapter.mo5575n() : 0) > i3) {
            NavViewContainer navViewContainer = this.f9576e;
            if (navViewContainer == null) {
                d2ok.n5r1("mNavContainer");
                navViewContainer = null;
            }
            navViewContainer.setSelectedPosition(i3);
            ViewPager viewPager3 = this.f9573b;
            if (viewPager3 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager2 = viewPager3;
            }
            viewPager2.setCurrentItem(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lk(C1662g this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        this$0.ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mi1u(C1662g this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        ActivityC0891q activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pnt2(AuthorEntity authorEntity) {
        int i2;
        if (authorEntity.getWidget()) {
            this.an.add(new C1857k("", R.drawable.me_author_detail_tab_bottom, R.string.component_title_widget_suit));
            i2 = 0;
            this.id.append(1, 0);
        } else {
            i2 = -1;
        }
        if (authorEntity.getLargeIcons()) {
            this.an.add(new C1857k("", R.drawable.me_author_detail_tab_bottom, R.string.theme_component_title_large_icon));
            i2++;
            this.id.append(3, i2);
        }
        if (authorEntity.getTheme()) {
            this.an.add(new C1857k("", R.drawable.me_author_detail_tab_bottom, R.string.theme_component_title_all));
            this.id.append(2, i2 + 1);
        }
        if (!this.an.isEmpty()) {
            NavViewContainer navViewContainer = this.f9576e;
            ViewPager viewPager = null;
            if (navViewContainer == null) {
                d2ok.n5r1("mNavContainer");
                navViewContainer = null;
            }
            navViewContainer.mo7342q(this.an);
            FragmentManager childFragmentManager = getChildFragmentManager();
            d2ok.kja0(childFragmentManager, "getChildFragmentManager(...)");
            this.bv = new com.android.thememanager.author.adapter.toq(childFragmentManager, authorEntity, this);
            ViewPager viewPager2 = this.f9573b;
            if (viewPager2 == null) {
                d2ok.n5r1("mViewPager");
            } else {
                viewPager = viewPager2;
            }
            viewPager.setAdapter(this.bv);
        }
        hyow();
    }

    private final void qh4d() {
        Page page;
        zurt listUrl;
        String string = requireArguments().getString(C1667s.f57400toq);
        String str = "";
        if (string == null) {
            string = "";
        }
        this.bl = string;
        String string2 = requireArguments().getString("designerMiId");
        if (string2 == null) {
            string2 = "";
        }
        this.bg = string2;
        String string3 = requireArguments().getString("designerId");
        if (string3 == null) {
            string3 = "";
        }
        this.as = string3;
        PageGroup pageGroup = (PageGroup) kiv().getSerializable(InterfaceC1357q.f53848bf2);
        if (pageGroup != null) {
            Log.i("AuthorContainerFragment", "getAuthorRequestInfo: " + com.android.thememanager.library.util.app.toq.m8027g(pageGroup));
            List<Page> pages = pageGroup.getPages();
            if (pages == null || (page = pages.get(0)) == null || (listUrl = page.getListUrl()) == null) {
                return;
            }
            d2ok.qrj(listUrl);
            if (TextUtils.isEmpty(this.bl)) {
                String parameter = listUrl.getParameter("designer");
                if (parameter == null) {
                    parameter = "";
                } else {
                    d2ok.qrj(parameter);
                }
                this.bl = parameter;
            }
            if (TextUtils.isEmpty(this.as)) {
                String parameter2 = listUrl.getParameter("designerId");
                if (parameter2 == null) {
                    parameter2 = "";
                } else {
                    d2ok.qrj(parameter2);
                }
                this.as = parameter2;
            }
            if (TextUtils.isEmpty(this.bg)) {
                String parameter3 = listUrl.getParameter("designerMiId");
                if (parameter3 != null) {
                    d2ok.qrj(parameter3);
                    str = parameter3;
                }
                this.bg = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tjz5(boolean z2, long j2) {
        TextView textView = this.f9575d;
        if (textView == null) {
            d2ok.n5r1("mFansCount");
            textView = null;
        }
        textView.setText(String.valueOf(j2));
        TextView textView2 = this.f57397ab;
        if (textView2 == null) {
            d2ok.n5r1("mFollow");
            textView2 = null;
        }
        bek6.x2(textView2);
        if (z2) {
            TextView textView3 = this.f57397ab;
            if (textView3 == null) {
                d2ok.n5r1("mFollow");
                textView3 = null;
            }
            textView3.setText(requireContext().getResources().getString(R.string.de_author_following));
            TextView textView4 = this.f57397ab;
            if (textView4 == null) {
                d2ok.n5r1("mFollow");
                textView4 = null;
            }
            textView4.setBackgroundResource(R.drawable.me_author_detail_followed_bg);
            TextView textView5 = this.f57397ab;
            if (textView5 == null) {
                d2ok.n5r1("mFollow");
                textView5 = null;
            }
            textView5.setTextColor(getResources().getColor(R.color.text_color_author_followed, null));
            return;
        }
        TextView textView6 = this.f57397ab;
        if (textView6 == null) {
            d2ok.n5r1("mFollow");
            textView6 = null;
        }
        textView6.setText(requireContext().getResources().getString(R.string.de_author_follow));
        TextView textView7 = this.f57397ab;
        if (textView7 == null) {
            d2ok.n5r1("mFollow");
            textView7 = null;
        }
        textView7.setBackgroundResource(R.drawable.me_author_detail_unfollow_bg);
        TextView textView8 = this.f57397ab;
        if (textView8 == null) {
            d2ok.n5r1("mFollow");
            textView8 = null;
        }
        textView8.setTextColor(getResources().getColor(R.color.text_color_author_unfollow, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vwb(C1662g this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        this$0.ba.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wtop(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void xblq() {
        ImageView imageView = this.f9582v;
        View view = null;
        if (imageView == null) {
            d2ok.n5r1("mOfficial");
            imageView = null;
        }
        bek6.m9613g(imageView);
        View view2 = this.f9578j;
        if (view2 == null) {
            d2ok.n5r1("mCountContainer");
            view2 = null;
        }
        bek6.m9613g(view2);
        TextView textView = this.f9583w;
        if (textView == null) {
            d2ok.n5r1("mSignature");
            textView = null;
        }
        bek6.m9613g(textView);
        TextView textView2 = this.f57397ab;
        if (textView2 == null) {
            d2ok.n5r1("mFollow");
            textView2 = null;
        }
        bek6.m9613g(textView2);
        View view3 = this.bb;
        if (view3 == null) {
            d2ok.n5r1("mNavLayout");
        } else {
            view = view3;
        }
        bek6.m9613g(view);
    }

    private final void xtb7(View view) {
        Resources resources;
        Configuration configuration;
        View viewFindViewById = view.findViewById(R.id.author_container);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f9574c = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.nav_container);
        d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f9576e = (NavViewContainer) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.viewPager);
        d2ok.kja0(viewFindViewById3, "findViewById(...)");
        this.f9573b = (ViewPager) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.author_back);
        d2ok.kja0(viewFindViewById4, "findViewById(...)");
        this.f9572a = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.author_avatar);
        d2ok.kja0(viewFindViewById5, "findViewById(...)");
        this.f9584x = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.author_name);
        d2ok.kja0(viewFindViewById6, "findViewById(...)");
        this.f9581u = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.author_official);
        d2ok.kja0(viewFindViewById7, "findViewById(...)");
        this.f9582v = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.author_works_count);
        d2ok.kja0(viewFindViewById8, "findViewById(...)");
        this.f57398bo = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.author_fans_count);
        d2ok.kja0(viewFindViewById9, "findViewById(...)");
        this.f9575d = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.author_signature);
        d2ok.kja0(viewFindViewById10, "findViewById(...)");
        this.f9583w = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.author_follow);
        d2ok.kja0(viewFindViewById11, "findViewById(...)");
        this.f57397ab = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.count_container);
        d2ok.kja0(viewFindViewById12, "findViewById(...)");
        this.f9578j = viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.loading_container);
        d2ok.kja0(viewFindViewById13, "findViewById(...)");
        this.f9580o = viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.error_container);
        d2ok.kja0(viewFindViewById14, "findViewById(...)");
        this.f9579m = viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.count_container);
        d2ok.kja0(viewFindViewById15, "findViewById(...)");
        this.f9578j = viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.nav_layout);
        d2ok.kja0(viewFindViewById16, "findViewById(...)");
        this.bb = viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.btn_retry);
        d2ok.kja0(viewFindViewById17, "findViewById(...)");
        this.bp = (Button) viewFindViewById17;
        ImageView imageView = this.f9572a;
        ViewPager viewPager = null;
        if (imageView == null) {
            d2ok.n5r1("mBackBtn");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.author.fragment.zy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1662g.mi1u(this.f9598k, view2);
            }
        });
        ImageView imageView2 = this.f9572a;
        if (imageView2 == null) {
            d2ok.n5r1("mBackBtn");
            imageView2 = null;
        }
        boolean z2 = false;
        bek6.m9617q(imageView2, 0, 0, 3, null);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.getLayoutDirection() == 1) {
            z2 = true;
        }
        if (z2) {
            ImageView imageView3 = this.f9572a;
            if (imageView3 == null) {
                d2ok.n5r1("mBackBtn");
                imageView3 = null;
            }
            imageView3.setImageResource(R.drawable.me_author_detail_back_right);
        } else {
            ImageView imageView4 = this.f9572a;
            if (imageView4 == null) {
                d2ok.n5r1("mBackBtn");
                imageView4 = null;
            }
            imageView4.setImageResource(R.drawable.me_author_detail_back);
        }
        TextView textView = this.f57397ab;
        if (textView == null) {
            d2ok.n5r1("mFollow");
            textView = null;
        }
        bek6.m9613g(textView);
        TextView textView2 = this.f57397ab;
        if (textView2 == null) {
            d2ok.n5r1("mFollow");
            textView2 = null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.author.fragment.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1662g.vwb(this.f9592k, view2);
            }
        });
        Button button = this.bp;
        if (button == null) {
            d2ok.n5r1("mBtnRetry");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.author.fragment.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1662g.lk(this.f9590k, view2);
            }
        });
        NavViewContainer navViewContainer = this.f9576e;
        if (navViewContainer == null) {
            d2ok.n5r1("mNavContainer");
            navViewContainer = null;
        }
        navViewContainer.setOnItemClickListener(new toq());
        ViewPager viewPager2 = this.f9573b;
        if (viewPager2 == null) {
            d2ok.n5r1("mViewPager");
        } else {
            viewPager = viewPager2;
        }
        viewPager.zy(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xzl(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void z617() {
        com.android.thememanager.author.viewmodel.toq toqVar = (com.android.thememanager.author.viewmodel.toq) new C0924e(this).m4420k(com.android.thememanager.author.viewmodel.toq.class);
        this.f9577f = toqVar;
        com.android.thememanager.author.viewmodel.toq toqVar2 = null;
        if (toqVar == null) {
            d2ok.n5r1("mViewModel");
            toqVar = null;
        }
        fti<AbstractC1671q> ftiVarM6543c = toqVar.m6543c();
        InterfaceC0954z viewLifecycleOwner = getViewLifecycleOwner();
        final n nVar = new n();
        ftiVarM6543c.m4391p(viewLifecycleOwner, new jp0y() { // from class: com.android.thememanager.author.fragment.k
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                C1662g.xzl(nVar, obj);
            }
        });
        com.android.thememanager.author.viewmodel.toq toqVar3 = this.f9577f;
        if (toqVar3 == null) {
            d2ok.n5r1("mViewModel");
        } else {
            toqVar2 = toqVar3;
        }
        fti<C6227f<Boolean, Long>> ftiVarLrht = toqVar2.lrht();
        InterfaceC0954z viewLifecycleOwner2 = getViewLifecycleOwner();
        final g gVar = new g();
        ftiVarLrht.m4391p(viewLifecycleOwner2, new jp0y() { // from class: com.android.thememanager.author.fragment.toq
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                C1662g.wtop(gVar, obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7395n
    public View onCreateView(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7395n ViewGroup viewGroup, @InterfaceC7395n Bundle bundle) {
        d2ok.m23075h(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_author_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC7396q View view, @InterfaceC7395n Bundle bundle) {
        d2ok.m23075h(view, "view");
        super.onViewCreated(view, bundle);
        xtb7(view);
        z617();
        ab();
        c25(AbstractC1671q.zy.f9606k);
    }
}
