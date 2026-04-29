package com.android.thememanager.controller;

import a98o.C0004k;
import android.os.AsyncTask;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.AbstractViewOnClickListenerC1611m;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.model.Page;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.router.recommend.entity.UISubject;
import com.android.thememanager.router.recommend.entity.WallpaperRecommendItem;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.v9.data.C2853p;
import com.android.thememanager.v9.model.WallpaperUIResult;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.android.thememanager.controller.h */
/* JADX INFO: compiled from: WallpaperDetailLoadPageManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1901h implements InterfaceC1925p {

    /* JADX INFO: renamed from: z */
    private static final int f10849z = 10;

    /* JADX INFO: renamed from: g */
    private Page f10850g;

    /* JADX INFO: renamed from: h */
    private toq f10851h;

    /* JADX INFO: renamed from: i */
    private List<WallpaperRecommendItem> f10852i;

    /* JADX INFO: renamed from: k */
    private x2 f10853k;

    /* JADX INFO: renamed from: n */
    private k f10854n;

    /* JADX INFO: renamed from: p */
    private int f10855p = -1;

    /* JADX INFO: renamed from: q */
    private AbstractViewOnClickListenerC1611m f10856q;

    /* JADX INFO: renamed from: s */
    private int f10857s;

    /* JADX INFO: renamed from: y */
    private int f10858y;

    /* JADX INFO: renamed from: com.android.thememanager.controller.h$k */
    /* JADX INFO: compiled from: WallpaperDetailLoadPageManager.java */
    private static class k extends AsyncTask<Boolean, Void, WallpaperUIResult> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private List<WallpaperRecommendItem> f57900f7l8;

        /* JADX INFO: renamed from: g */
        private int f10859g;

        /* JADX INFO: renamed from: k */
        private WeakReference<C1901h> f10860k;

        /* JADX INFO: renamed from: n */
        private int f10861n;

        /* JADX INFO: renamed from: q */
        private int f10862q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f57901toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Page f57902zy;

        public k(C1901h manager, boolean switchNewGroup, Page page, int wallpaperEntryPageType, int pageIndex, int productIndex, List<WallpaperRecommendItem> subjectRecommends) {
            this.f57901toq = false;
            this.f10861n = -1;
            this.f10859g = -1;
            this.f10860k = new WeakReference<>(manager);
            this.f57901toq = switchNewGroup;
            this.f57902zy = page;
            this.f10862q = wallpaperEntryPageType;
            this.f10861n = pageIndex;
            this.f10859g = productIndex;
            this.f57900f7l8 = subjectRecommends;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public WallpaperUIResult doInBackground(Boolean... params) {
            T t2;
            T t3;
            if (isCancelled()) {
                return null;
            }
            zurt itemUrl = this.f57902zy.getItemUrl();
            ArrayList arrayList = new ArrayList();
            x2 x2VarLd6 = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g("wallpaper"));
            int i2 = this.f10862q;
            if (i2 == 2 || i2 == 4) {
                if (this.f57902zy.isPaging()) {
                    itemUrl.addParameter("page", String.valueOf(this.f10861n));
                }
                CommonResponse commonResponseMo7476p = x2VarLd6.m7690k().mo7476p(itemUrl, params[0].booleanValue(), PurchasedOrFavoritedCategory.class);
                if (commonResponseMo7476p == null || (t2 = commonResponseMo7476p.apiData) == 0 || commonResponseMo7476p.apiCode != 0) {
                    return null;
                }
                if (((PurchasedOrFavoritedCategory) t2).products != null) {
                    arrayList.addAll(((PurchasedOrFavoritedCategory) t2).products);
                }
                C0004k<Resource> c0004kX2 = com.android.thememanager.toq.x2(arrayList, -1);
                T t4 = commonResponseMo7476p.apiData;
                return new WallpaperUIResult(c0004kX2, ((PurchasedOrFavoritedCategory) t4).hasMore, ((PurchasedOrFavoritedCategory) t4).pageCategory, -1, ((PurchasedOrFavoritedCategory) t4).uuid);
            }
            if (this.f57902zy.isPaging()) {
                int i3 = this.f10861n;
                if (i3 != -1) {
                    itemUrl.addParameter("cardStart", String.valueOf(i3));
                } else {
                    itemUrl.addParameter("start", String.valueOf(this.f10859g));
                }
            }
            CommonResponse commonResponseMo7476p2 = x2VarLd6.m7690k().mo7476p(itemUrl, params[0].booleanValue(), UIPage.class);
            if (commonResponseMo7476p2 == null || (t3 = commonResponseMo7476p2.apiData) == 0 || commonResponseMo7476p2.apiCode != 0) {
                return null;
            }
            if (((UIPage) t3).cards != null) {
                for (UICard uICard : ((UIPage) t3).cards) {
                    int i4 = uICard.cardTypeOrdinal;
                    if (i4 == 23 || i4 == 60) {
                        List<UIProduct> list = uICard.products;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                    } else if (i4 == 59 && this.f57900f7l8 != null) {
                        List<UISubject> listX2 = C2853p.x2(uICard.rightSubjects);
                        if (listX2.size() != 0) {
                            C2853p.toq(listX2, this.f57900f7l8);
                            Iterator<UISubject> it = listX2.iterator();
                            while (it.hasNext()) {
                                List<UIProduct> list2 = it.next().products;
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                            }
                        }
                    }
                }
            }
            C0004k<Resource> c0004kX22 = com.android.thememanager.toq.x2(arrayList, -1);
            T t5 = commonResponseMo7476p2.apiData;
            return new WallpaperUIResult(c0004kX22, ((UIPage) t5).hasMore, ((UIPage) t5).category, -1, ((UIPage) t5).uuid);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            if (this.f57902zy.getItemUrl() == null) {
                cancel(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(WallpaperUIResult result) {
            toq toqVar;
            C0004k<Resource> c0004k;
            C1901h c1901h = this.f10860k.get();
            if (c1901h == null || !gc3c.cdj(c1901h.f10856q.getActivity()) || (toqVar = c1901h.f10851h) == null) {
                return;
            }
            if (result != null && (c0004k = result.mDataGroup) != null && !c0004k.isEmpty()) {
                if (c1901h.f10857s != -1) {
                    C1901h.m7469q(c1901h);
                }
                C1901h.m7468n(c1901h, result.mDataGroup.size());
                toqVar.mo6405k(result.hasMore, result.mDataGroup);
                return;
            }
            if (this.f57901toq) {
                if (!C1915g.m7550n()) {
                    nn86.m7150k(R.string.wallpaper_detail_load_page_no_network, 0);
                } else if (result == null || result.mDataGroup == null) {
                    nn86.m7150k(R.string.card_data_request_error, 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.h$toq */
    /* JADX INFO: compiled from: WallpaperDetailLoadPageManager.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo6405k(boolean hasMore, C0004k<Resource> dataGroup);
    }

    public C1901h(String resCode, AbstractViewOnClickListenerC1611m fragment, String subjectUuid, int startRequestEndlessPageIndex, int wallpaperEntryPageType, List<WallpaperRecommendItem> recommends, boolean recommendFirstUuidIsSubject) {
        this.f10857s = -1;
        this.f10852i = null;
        this.f10853k = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resCode));
        this.f10856q = fragment;
        Page page = new Page();
        this.f10850g = page;
        page.setPaging(true);
        this.f10857s = startRequestEndlessPageIndex;
        this.f10858y = wallpaperEntryPageType;
        if (wallpaperEntryPageType == 2) {
            this.f10850g.setItemUrl(com.android.thememanager.controller.online.ld6.d2ok(resCode));
            return;
        }
        if (wallpaperEntryPageType == 4) {
            this.f10850g.setItemUrl(com.android.thememanager.controller.online.ld6.ek5k(resCode));
            return;
        }
        if (wallpaperEntryPageType == 3) {
            this.f10852i = recommends;
            this.f10850g.setItemUrl(com.android.thememanager.controller.online.ld6.r8s8(subjectUuid, 0, InterfaceC1925p.p7p2, recommendFirstUuidIsSubject));
        } else if (startRequestEndlessPageIndex == -1) {
            this.f10850g.setItemUrl(com.android.thememanager.controller.online.ld6.mu(subjectUuid));
        } else {
            this.f10850g.setItemUrl(com.android.thememanager.controller.online.ld6.tfm(subjectUuid));
        }
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m7468n(C1901h c1901h, int i2) {
        int i3 = c1901h.f10855p + i2;
        c1901h.f10855p = i3;
        return i3;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ int m7469q(C1901h c1901h) {
        int i2 = c1901h.f10857s;
        c1901h.f10857s = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public void m7470g(toq listener, int currentIndex, int totalSize, boolean firstLoad, boolean switchNewGroup, int startRequestProductIndex) {
        if (!firstLoad ? !(totalSize - currentIndex == 10 || totalSize + (-1) == currentIndex) : totalSize - currentIndex >= 10) {
            k kVar = this.f10854n;
            if (kVar == null || kVar.getStatus() == AsyncTask.Status.FINISHED) {
                this.f10851h = listener;
                this.f10855p = startRequestProductIndex;
                this.f10854n = new k(this, switchNewGroup, this.f10850g, this.f10858y, this.f10857s, this.f10855p, this.f10852i);
                if (C1781k.toq(this.f10856q.getActivity())) {
                    k kVar2 = this.f10854n;
                    ThreadPoolExecutor threadPoolExecutorX2 = C6002g.x2();
                    Boolean[] boolArr = new Boolean[1];
                    boolArr[0] = Boolean.valueOf(this.f10858y == 2);
                    kVar2.executeOnExecutor(threadPoolExecutorX2, boolArr);
                }
            }
        }
    }
}
