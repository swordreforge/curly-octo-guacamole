package com.android.thememanager.settings;

import a98o.C0004k;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.recommend.model.entity.element.CoverElement;
import com.android.thememanager.recommend.model.entity.element.PlaceHolderElement;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.model.entity.element.WallpaperSettingElement;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.RecommendListView;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2805r;
import com.android.thememanager.util.uc;
import com.android.thememanager.v10.viewholder.CoverViewHolder;
import com.android.thememanager.v10.viewholder.OfflineViewHolder;
import com.android.thememanager.v10.viewholder.WallpaperSettingOnlineViewHolder;
import com.android.thememanager.v10.viewholder.WallpaperSettingStaggerHolder;
import com.android.thememanager.view.C2918h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import miui.app.constants.ThemeManagerConstants;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: compiled from: WallpaperSettingsFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ncyb extends com.android.thememanager.basemodule.base.toq implements ThemeManagerConstants, InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {
    private static final int an = 500;
    public static final String bb = "scrollToOnline";
    private static final int bp = 2;
    private static final int bv = 4;
    private static final int id = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final WallpaperSettingsPresenter f60792ab;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final C0004k<Resource> f60793bo;

    /* JADX INFO: renamed from: c */
    private SettingFindMoreButton f15121c;

    /* JADX INFO: renamed from: d */
    private HashSet<String> f15122d;

    /* JADX INFO: renamed from: f */
    private com.android.thememanager.basemodule.views.x2 f15124f;

    /* JADX INFO: renamed from: l */
    private RecyclerView f15126l;

    /* JADX INFO: renamed from: r */
    private RecommendListViewAdapter f15129r;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private WallpaperSettingsActivity f15130t;

    /* JADX INFO: renamed from: v */
    private final List<C0004k<Resource>> f15132v;

    /* JADX INFO: renamed from: w */
    private Handler f15133w;

    /* JADX INFO: renamed from: e */
    private int f15123e = 0;

    /* JADX INFO: renamed from: j */
    private int f15125j = 0;

    /* JADX INFO: renamed from: o */
    private int f15128o = 0;

    /* JADX INFO: renamed from: m */
    private int f15127m = 0;

    /* JADX INFO: renamed from: b */
    private int f15120b = 0;

    /* JADX INFO: renamed from: a */
    private int f15119a = 0;

    /* JADX INFO: renamed from: x */
    private final AtomicBoolean f15134x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u */
    private final AtomicBoolean f15131u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.android.thememanager.settings.ncyb$g */
    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    private static class C2526g extends C2918h {

        /* JADX INFO: renamed from: q */
        private final int f15135q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60794toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f60795zy;

        public C2526g(@zy.lvui Context context, int itemOffsetId) {
            super(context, itemOffsetId);
            this.f60794toq = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_online_text_top_margin);
            this.f60795zy = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_online_text_bottom_margin);
            this.f15135q = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_tile_top_margin);
        }

        @Override // com.android.thememanager.view.C2918h, androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition > -1) {
                if (childAdapterPosition == 4) {
                    outRect.set(this.f17544k, this.f60794toq, 0, this.f60795zy);
                } else if (childAdapterPosition >= 4) {
                    super.mo4711n(outRect, view, parent, state);
                } else {
                    int i2 = this.f17544k;
                    outRect.set(i2, this.f15135q, i2, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.ncyb$k */
    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    class HandlerC2527k extends Handler {
        HandlerC2527k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (ncyb.this.f15126l.getChildAt(4) != null) {
                ncyb.this.f15126l.scrollBy(0, ncyb.this.f15126l.getChildAt(4).getBottom());
                ncyb.this.f1bi();
                ncyb.this.imd();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.ncyb$n */
    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    class C2528n extends RecyclerView.fn3e {
        C2528n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@zy.lvui RecyclerView recyclerView, int newState) {
            ncyb.this.f15128o = newState;
            ncyb.this.bqie(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@zy.lvui RecyclerView recyclerView, int dx, int dy) {
            ncyb.r6ty(ncyb.this, dy);
            ncyb.this.f1bi();
            ncyb.this.imd();
            ncyb.this.bqie(dy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.ncyb$q */
    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    class ViewTreeObserverOnGlobalLayoutListenerC2529q implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2529q() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = ncyb.this.f15126l.getChildAt(2);
            View childAt2 = ncyb.this.f15126l.getChildAt(4);
            if (childAt == null || childAt2 == null) {
                return;
            }
            ncyb.this.f15126l.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ncyb.this.f15120b = childAt.getBottom();
            ncyb.this.f15119a = childAt2.getBottom();
        }
    }

    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    class toq extends IRecommendListView.CallBack<UIPage> {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public Pair<UIPage, List<UIElement>> editRecommendLoadResult(UIPage page, List<UIElement> list, boolean refresh) {
            ncyb.this.f15125j = 0;
            ncyb.this.f15127m = 0;
            ncyb.this.f60793bo.clear();
            if (page != null && list != null) {
                ncyb.this.cn02(list, refresh);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ncyb.this.cn02(arrayList, refresh);
            UIPage uIPage = new UIPage();
            uIPage.cards = Collections.emptyList();
            return new Pair<>(uIPage, arrayList);
        }
    }

    /* JADX INFO: compiled from: WallpaperSettingsFragment.java */
    class zy implements IRecommendListView.Request {
        zy() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return ncyb.this.f60792ab.m8984k();
        }
    }

    public ncyb() {
        C0004k<Resource> c0004k = new C0004k<>();
        this.f60793bo = c0004k;
        this.f15132v = Collections.singletonList(c0004k);
        this.f60792ab = new WallpaperSettingsPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bqie(int dy) {
        int i2;
        int i3;
        int i4 = this.f15119a;
        if (i4 == 0) {
            return;
        }
        boolean z2 = true;
        if (dy == 0 || this.f15128o != 1) {
            if (dy != 0 || this.f15128o == 0) {
                if (dy >= 0 ? (i2 = this.f15127m) <= this.f15120b || i2 >= i4 : (i3 = this.f15127m) <= i4 || i3 + dy >= i4) {
                    z2 = false;
                }
                if (z2) {
                    this.f15126l.smoothScrollBy(0, i4 - this.f15127m);
                }
            }
        }
    }

    private C2367n btvn(View view) {
        C2367n c2367n = new C2367n();
        c2367n.setContext(this).setRefresh(true).setLoadMore(false).setLayoutManagerType(0).setCardDivider(false).setLayoutManagerSpanCount(ob()).setItemDecoration(new C2526g(view.getContext(), R.dimen.wallpaper_setting_item_half_margin)).setResCode("wallpaper").setPicker(false).setRequest(new zy()).setCallBack(new toq());
        return c2367n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn02(List<UIElement> list, boolean refresh) {
        int size = list.size();
        if (size % 2 != 0) {
            list.remove(size - 1);
        }
        list.add(0, new PlaceHolderElement(89));
        list.addAll(0, mj());
        this.f15123e++;
        if (refresh && size < 1) {
            exv8(true, list);
        }
        for (UIElement uIElement : list) {
            if (uIElement instanceof WallpaperSettingElement) {
                UIImageWithLink imageBanner = ((WallpaperSettingElement) uIElement).getImageBanner();
                Resource resourceTww7 = tww7(imageBanner, false);
                if (resourceTww7 != null && "PRODUCT_DETAIL".equals(imageBanner.link.type)) {
                    this.f60793bo.add(resourceTww7);
                }
            } else {
                this.f15125j++;
            }
        }
        C2082k.zy().qrj(this.f15132v);
    }

    private void exv8(boolean show, List<UIElement> list) {
        UIElement uIElement = list.get(list.size() - 1);
        if (show) {
            if (uIElement.getCardTypeOrdinal() != 91) {
                list.add(new PlaceHolderElement(91));
            }
        } else if (uIElement.getCardTypeOrdinal() == 91) {
            list.remove(uIElement);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1bi() {
        int i2 = this.f15119a;
        if (i2 == 0 || this.f15130t == null) {
            return;
        }
        if (this.f15127m >= i2) {
            if (this.f15131u.getAndSet(true)) {
                return;
            }
            this.f15130t.bz2();
        } else if (this.f15131u.getAndSet(false)) {
            this.f15130t.bz2();
        }
    }

    private void gb(View view) {
        this.f15121c = (SettingFindMoreButton) view.findViewById(R.id.find_more);
        if (!com.android.thememanager.basemodule.utils.toq.m7224q("wallpaper") || C1807g.zurt()) {
            this.f15121c.setVisibility(8);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15121c.getLayoutParams();
        marginLayoutParams.bottomMargin = -marginLayoutParams.height;
        this.f15121c.setLayoutParams(marginLayoutParams);
        this.f15121c.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.dd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14997k.kq2f(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void imd() {
        int i2 = this.f15119a;
        if (i2 == 0) {
            return;
        }
        if (this.f15127m < i2) {
            if (this.f15134x.getAndSet(false)) {
                this.f15121c.toq();
            }
        } else {
            if (this.f15134x.getAndSet(true)) {
                return;
            }
            this.f15121c.m8982q();
            if (kbj().contains(com.android.thememanager.basemodule.analysis.toq.zkf2)) {
                return;
            }
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", kx3(), com.android.thememanager.basemodule.analysis.toq.zkf2, null);
            C1708s.f7l8().ld6().cdj(C1706p.kja0(kx3(), com.android.thememanager.basemodule.analysis.toq.zkf2, ""));
            kbj().add(com.android.thememanager.basemodule.analysis.toq.zkf2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kq2f(View view) {
        com.android.thememanager.basemodule.analysis.kja0.f7l8(kx3(), com.android.thememanager.basemodule.analysis.toq.zkf2, null);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(kx3(), com.android.thememanager.basemodule.analysis.toq.zkf2, ""));
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("EXTRA_TAB_ID", "wallpaper");
        startActivity(intent);
    }

    private List<UIElement> mj() {
        List<Integer> listAsList = Arrays.asList(2, 4, 10, 9);
        this.f15125j += listAsList.size();
        ArrayList arrayList = new ArrayList(listAsList.size());
        for (Integer num : listAsList) {
            CoverElement coverElement = new CoverElement(87);
            coverElement.subType = num.intValue();
            arrayList.add(coverElement);
        }
        return arrayList;
    }

    private int ob() {
        return (C1807g.zurt() && C1807g.m7083t(getContext())) ? 4 : 2;
    }

    private void ovdh(View v2, RecommendListView lv) {
        FrameLayout frameLayout = (FrameLayout) v2;
        frameLayout.addView(lv, 0);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.recyclerView);
        this.f15126l = recyclerView;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2529q());
        this.f15126l.addOnScrollListener(new C2528n());
        this.f15124f = lv.getSpringLayoutWrap();
        RecommendListViewAdapter recommendListViewAdapter = (RecommendListViewAdapter) lv.getAdapter();
        this.f15129r = recommendListViewAdapter;
        recommendListViewAdapter.mo8550n(mj(), false, true);
        int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_horizontal_margin);
        this.f15126l.setPadding(dimensionPixelSize, frameLayout.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_top_margin), dimensionPixelSize, 0);
        gb(v2);
    }

    static /* synthetic */ int r6ty(ncyb ncybVar, int i2) {
        int i3 = ncybVar.f15127m + i2;
        ncybVar.f15127m = i3;
        return i3;
    }

    private static Resource tww7(UIImageWithLink imageWithLink, boolean withLocal) {
        UILink uILink;
        if (imageWithLink == null || (uILink = imageWithLink.link) == null) {
            return null;
        }
        Resource resource = new Resource();
        String str = uILink.title;
        resource.setOnlineId(uILink.link);
        resource.getOnlineInfo().setTitle(str);
        resource.getOnlineInfo().setTrackId(uILink.trackId);
        resource.setProductId(imageWithLink.productUuid);
        resource.setWallpaperGalleryTypeAndId(imageWithLink.wallpaperGalleryType, imageWithLink.wallpaperGalleryTypeId);
        String str2 = imageWithLink.imageUrl;
        uc.fn3e(resource, str2, str2, withLocal);
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RecyclerView.fti xm(int i2, ViewGroup viewGroup, RecyclerView.AbstractC1060y abstractC1060y) {
        if (abstractC1060y instanceof RecommendListViewAdapter) {
            RecommendListViewAdapter recommendListViewAdapter = (RecommendListViewAdapter) abstractC1060y;
            switch (i2) {
                case 87:
                    return CoverViewHolder.nmn5(viewGroup, recommendListViewAdapter);
                case 88:
                    return WallpaperSettingStaggerHolder.n5r1(viewGroup, recommendListViewAdapter);
                case 89:
                    return WallpaperSettingOnlineViewHolder.ncyb(viewGroup, recommendListViewAdapter);
                case 91:
                    return OfflineViewHolder.n5r1(viewGroup, recommendListViewAdapter);
            }
        }
        C7794k.f7l8("unknown type. " + i2);
        return null;
    }

    public void hyow(@zy.lvui UIImageBannerElement element) {
        UILink uILink;
        UIImageWithLink imageBanner = element.getImageBanner();
        if (imageBanner == null || (uILink = imageBanner.link) == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f60793bo.size()) {
                i2 = -1;
                break;
            }
            String onlineId = this.f60793bo.get(i2).getOnlineId();
            if (!TextUtils.isEmpty(onlineId) && onlineId.equals(uILink.link)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        C2082k.zy().qrj(this.f15132v);
        Intent intent = new Intent(getActivity(), (Class<?>) WallpaperDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53875ga, kx3());
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        if (C1807g.zurt()) {
            C2805r.m9972s(getActivity(), intent);
        } else {
            startActivityForResult(intent, 109);
        }
    }

    public Set<String> kbj() {
        return this.f15122d;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.mgf;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.ncyb.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f15130t = (WallpaperSettingsActivity) getActivity();
        getLifecycle().mo4451k(this.f60792ab);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        this.f15130t = (WallpaperSettingsActivity) getActivity();
        return inflater.inflate(R.layout.wallpaper_settings, container, false);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler handler = this.f15133w;
        if (handler != null) {
            handler.removeMessages(1);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        this.f15122d = new HashSet<>();
        RecommendListView recommendListView = (RecommendListView) btvn(view).build();
        recommendListView.setExVH(new IRecommendListView.ExViewHolder() { // from class: com.android.thememanager.settings.x9kr
            @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.ExViewHolder
            public final RecyclerView.fti getVH(int i2, ViewGroup viewGroup, RecyclerView.AbstractC1060y abstractC1060y) {
                return ncyb.xm(i2, viewGroup, abstractC1060y);
            }
        });
        ovdh(view, recommendListView);
        xblq();
        if (getArguments() != null && getArguments().getBoolean(bb)) {
            HandlerC2527k handlerC2527k = new HandlerC2527k(Looper.getMainLooper());
            this.f15133w = handlerC2527k;
            handlerC2527k.sendEmptyMessageDelayed(1, 500L);
        }
        com.android.thememanager.basemodule.analysis.kja0.m6641s(com.android.thememanager.basemodule.analysis.toq.cjaj, com.android.thememanager.basemodule.analysis.toq.mho, null, null);
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.mho, null, ""));
    }

    boolean qh4d() {
        return this.f15127m >= this.f15119a;
    }

    public void vyq() {
        this.f15126l.scrollToPosition(0);
        this.f15127m = 0;
        f1bi();
        imd();
        com.android.thememanager.basemodule.analysis.kja0.f7l8(kx3(), com.android.thememanager.basemodule.analysis.toq.trap, com.android.thememanager.basemodule.analysis.toq.w1q6);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(kx3(), com.android.thememanager.basemodule.analysis.toq.trap, com.android.thememanager.basemodule.analysis.toq.w1q6));
    }

    public void xblq() {
        this.f15124f.x2();
    }
}
