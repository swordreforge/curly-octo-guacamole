package com.android.thememanager.module.detail.view;

import android.util.Pair;
import com.android.thememanager.module.detail.presenter.C2227k;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.RecommendListView;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.util.List;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AodRecommendListView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AodRecommendListView extends RecommendListView {

    /* JADX INFO: renamed from: l */
    @InterfaceC7396q
    private final C2227k f13186l;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.AodRecommendListView$k */
    /* JADX INFO: compiled from: AodRecommendListView.kt */
    public static final class C2250k extends C2367n {

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        @InterfaceC7396q
        private final C2227k f60541zurt;

        public C2250k(@InterfaceC7396q C2227k mViewModel) {
            kotlin.jvm.internal.d2ok.m23075h(mViewModel, "mViewModel");
            this.f60541zurt = mViewModel;
        }

        @Override // com.android.thememanager.recommend.view.listview.C2367n, com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
        @InterfaceC7396q
        public IRecommendListView build() {
            m8560k();
            return new AodRecommendListView(this, this.f60541zurt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AodRecommendListView(@InterfaceC7396q C2367n builder, @InterfaceC7396q C2227k mVm) {
        super(builder);
        kotlin.jvm.internal.d2ok.m23075h(builder, "builder");
        kotlin.jvm.internal.d2ok.m23075h(mVm, "mVm");
        this.f13186l = mVm;
    }

    @Override // com.android.thememanager.recommend.view.listview.RecommendListView
    /* JADX INFO: renamed from: p */
    protected void mo8396p(@InterfaceC7395n UIPage uIPage, @InterfaceC7395n List<? extends UIElement> list, boolean z2) {
        this.f13186l.ebn(new Pair<>(uIPage, list));
        super.mo8396p(uIPage, list, z2);
    }

    public final void setListData() {
        mo8396p((UIPage) this.f13186l.m28257do().first, (List) this.f13186l.m28257do().second, true);
    }
}
