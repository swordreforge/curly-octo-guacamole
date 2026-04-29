package com.android.thememanager.recommend.view.listview.viewholder;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.R;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.LocalAdInfo;
import com.android.thememanager.basemodule.analysis.C1698k;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.utils.dd;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.InterfaceC1865s;
import com.android.thememanager.recommend.model.entity.element.HomepageSlideAdCardElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementHomepageSlideAdCardViewHolder extends BaseAdViewHolder<HomepageSlideAdCardElement> implements InterfaceC1694q, InterfaceC1865s {

    /* JADX INFO: renamed from: l */
    private static boolean f13897l;

    /* JADX INFO: renamed from: h */
    private C2386q f13898h;

    /* JADX INFO: renamed from: i */
    private RecyclerView f13899i;

    /* JADX INFO: renamed from: p */
    private ImageView f13900p;

    /* JADX INFO: renamed from: r */
    public dd f13901r;

    /* JADX INFO: renamed from: s */
    private TextView f13902s;

    /* JADX INFO: renamed from: t */
    private int f13903t;

    /* JADX INFO: renamed from: z */
    private int f13904z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementHomepageSlideAdCardViewHolder$k */
    class C2385k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f13905k;

        C2385k(final int val$padding) {
            this.f13905k = val$padding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q @lvui Rect outRect, @InterfaceC7396q @lvui View view, @InterfaceC7396q @lvui RecyclerView parent, @InterfaceC7396q @lvui RecyclerView.mcp state) {
            int i2 = this.f13905k;
            outRect.left = i2;
            outRect.right = i2;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementHomepageSlideAdCardViewHolder$q */
    private class C2386q extends RecyclerView.AbstractC1060y<zy> {

        /* JADX INFO: renamed from: k */
        private final List<AdInfo> f13906k = new ArrayList();

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementHomepageSlideAdCardViewHolder$q$k */
        class k extends ld6.toq {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ List f13908k;

            k(final List val$newAdInfoList) {
                this.f13908k = val$newAdInfoList;
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: k */
            public boolean mo4703k(int oldItemPosition, int newItemPosition) {
                return C2386q.this.fn3e((AdInfo) C2386q.this.f13906k.get(oldItemPosition), (AdInfo) this.f13908k.get(newItemPosition));
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: n */
            public int mo4704n() {
                return C2386q.this.f13906k.size();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            /* JADX INFO: renamed from: q */
            public int mo4705q() {
                return this.f13908k.size();
            }

            @Override // androidx.recyclerview.widget.ld6.toq
            public boolean toq(int oldItemPosition, int newItemPosition) {
                return C2386q.this.fn3e((AdInfo) C2386q.this.f13906k.get(oldItemPosition), (AdInfo) this.f13908k.get(newItemPosition));
            }
        }

        public C2386q() {
            ElementHomepageSlideAdCardViewHolder.this.f13904z = ElementHomepageSlideAdCardViewHolder.this.ki().getResources().getDimensionPixelOffset(R.dimen.rc_slide_ad_card_item_cover_radius);
            ElementHomepageSlideAdCardViewHolder.this.f13903t = ElementHomepageSlideAdCardViewHolder.this.ki().getResources().getDimensionPixelOffset(R.dimen.rc_slide_ad_card_item_icon_radius);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean fn3e(AdInfo info1, AdInfo info2) {
            return Objects.equals(info1.title, info2.title) && Objects.equals(info1.imgUrls, info2.imgUrls) && Float.compare(info1.width, info2.width) == 0 && Float.compare(info1.height, info2.height) == 0 && Objects.equals(info1.tagId, info2.tagId) && Objects.equals(info1.iconUrl, info2.iconUrl) && Objects.equals(info1.packageName, info2.packageName) && Objects.equals(info1.appName, info2.appName) && Objects.equals(info1.dspName, info2.dspName) && Objects.equals(info1.appDeveloper, info2.appDeveloper) && Objects.equals(info1.appVersion, info2.appVersion) && Objects.equals(info1.appPermission, info2.appPermission) && Objects.equals(info1.appPrivacy, info2.appPrivacy) && Objects.equals(info1.appIntroduction, info2.appIntroduction) && Objects.equals(info1.deeplink, info2.deeplink) && Objects.equals(info1.actionUrl, info2.actionUrl) && Objects.equals(info1.ex, info2.ex);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @InterfaceC7396q
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public zy onCreateViewHolder(@InterfaceC7396q @lvui ViewGroup parent, int viewType) {
            ElementHomepageSlideAdCardViewHolder elementHomepageSlideAdCardViewHolder = ElementHomepageSlideAdCardViewHolder.this;
            return elementHomepageSlideAdCardViewHolder.new zy(LayoutInflater.from(elementHomepageSlideAdCardViewHolder.fn3e()).inflate(R.layout.rc_element_slide_ad_card_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f13906k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@lvui zy holder, int position) {
            AdInfo adInfo = this.f13906k.get(position);
            if (adInfo == null) {
                return;
            }
            holder.fn3e(LocalAdInfo.builder(adInfo).adPosition(position).build());
        }

        public void o1t(List<AdInfo> newAdInfoList) {
            if (com.android.thememanager.basemodule.utils.kja0.qrj(newAdInfoList)) {
                this.f13906k.clear();
                notifyDataSetChanged();
            } else {
                androidx.recyclerview.widget.ld6.zy(new k(newAdInfoList), false).m5034n(this);
                this.f13906k.clear();
                this.f13906k.addAll(newAdInfoList);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@lvui zy holder) {
            super.onViewDetachedFromWindow(holder);
            LocalAdInfo localAdInfoKi = holder.ki();
            if (localAdInfoKi != null) {
                C1698k.m6634n().m6635g(localAdInfoKi);
            }
        }
    }

    class toq extends RecyclerView.fn3e {
        toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@lvui RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            ElementHomepageSlideAdCardViewHolder.this.f13901r.ld6(recyclerView, newState);
        }
    }

    private class zy extends RecyclerView.fti implements View.OnClickListener, InterfaceC1865s {

        /* JADX INFO: renamed from: g */
        private final NinePatchImageView f13910g;

        /* JADX INFO: renamed from: k */
        private final TextView f13911k;

        /* JADX INFO: renamed from: n */
        private final NinePatchImageView f13912n;

        /* JADX INFO: renamed from: q */
        private final AdSubTextView f13914q;

        /* JADX INFO: renamed from: s */
        private LocalAdInfo f13915s;

        /* JADX INFO: renamed from: y */
        private final com.android.thememanager.ad.download.controller.zy f13916y;

        public zy(@InterfaceC7396q @lvui View itemView) {
            super(itemView);
            this.f13911k = (TextView) itemView.findViewById(R.id.app_name);
            this.f13914q = (AdSubTextView) itemView.findViewById(R.id.ad_sub_text);
            this.f13912n = (NinePatchImageView) itemView.findViewById(R.id.app_thumbnail);
            this.f13910g = (NinePatchImageView) itemView.findViewById(R.id.app_icon);
            TextView textView = (TextView) itemView.findViewById(R.id.download_btn);
            textView.setOnClickListener(this);
            com.android.thememanager.ad.download.controller.zy zyVar = new com.android.thememanager.ad.download.controller.zy(textView);
            this.f13916y = zyVar;
            C1653q.toq(zyVar);
        }

        @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
        public View cdj() {
            return this.itemView;
        }

        public void fn3e(LocalAdInfo adInfo) {
            this.f13915s = adInfo;
            this.f13914q.m7276p(adInfo, Boolean.TRUE);
            C1653q.ld6(ElementHomepageSlideAdCardViewHolder.this.ki(), adInfo, this.f13912n, this.f13910g, ElementHomepageSlideAdCardViewHolder.this.f13904z, ElementHomepageSlideAdCardViewHolder.this.f13903t, this.f13911k, new Map[0]);
            this.f13916y.zy(adInfo);
        }

        public LocalAdInfo ki() {
            return this.f13915s;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            com.android.thememanager.ad.download.controller.zy zyVar;
            if (v2.getId() != R.id.download_btn || (zyVar = this.f13916y) == null) {
                return;
            }
            zyVar.m6508k();
        }

        @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
        /* JADX INFO: renamed from: p */
        public boolean mo7369p() {
            return ElementHomepageSlideAdCardViewHolder.f13897l;
        }

        @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
        public void qrj(int state) {
            if (dd.m7030n(this.itemView, 100) && dd.m7028g(this.itemView, 100)) {
                C1698k.m6634n().zy(this.f13915s);
            }
        }

        @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
        public int x2() {
            return 4;
        }
    }

    public ElementHomepageSlideAdCardViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (adapter != null && adapter.d2ok() == 0) {
            x9kr();
        }
        uv6(itemView);
    }

    private void uv6(View itemView) {
        this.f13900p = (ImageView) itemView.findViewById(R.id.ad_close_btn);
        this.f13902s = (TextView) itemView.findViewById(R.id.card_title);
        this.f13899i = (RecyclerView) itemView.findViewById(R.id.ad_recyclerview);
        this.f13899i.addItemDecoration(new C2385k(fn3e().getResources().getDimensionPixelSize(R.dimen.rc_slide_ad_card_list_padding)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fn3e());
        linearLayoutManager.setOrientation(0);
        this.f13899i.setLayoutManager(linearLayoutManager);
        this.f13898h = new C2386q();
        this.f13901r = new dd();
        this.f13899i.setAdapter(this.f13898h);
        this.f13899i.addOnScrollListener(new toq());
    }

    public static ElementHomepageSlideAdCardViewHolder vyq(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementHomepageSlideAdCardViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_slide_ad_card, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public View cdj() {
        return this.itemView;
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void o1t(HomepageSlideAdCardElement item, int position) {
        super.o1t(item, position);
        this.f13902s.setText(item.getTitle());
        List<AdInfo> adInfos = item.getAdInfos();
        if (com.android.thememanager.basemodule.utils.kja0.qrj(adInfos) || adInfos.size() == 0) {
            return;
        }
        this.f13898h.o1t(adInfos);
        AdUtils.cdj(ki(), this.f13900p, adInfos.get(0), item.getAdTagId());
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseAdViewHolder, com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        f13897l = true;
        C1653q.m6526k(this);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    /* JADX INFO: renamed from: p */
    public boolean mo7369p() {
        return f13897l;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public void qrj(int state) {
        this.f13901r.m7034p(this.f13899i);
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        if (this.f9848n < 0 || wvg().ni7().size() == 0) {
            return;
        }
        wvg().ni7().remove(this.f9848n);
        wvg().notifyItemRemoved(this.f9848n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        return Collections.singletonList(((HomepageSlideAdCardElement) this.f9849q).getTrackId());
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1865s
    public int x2() {
        return 4;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        f13897l = false;
        dd ddVar = this.f13901r;
        if (ddVar != null) {
            ddVar.toq();
        }
        C1653q.cdj(this);
    }
}
