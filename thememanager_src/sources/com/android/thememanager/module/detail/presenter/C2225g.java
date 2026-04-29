package com.android.thememanager.module.detail.presenter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.fn3e;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.mine.remote.widget.C2197k;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.model.LargeIconElementRuntime;
import com.android.thememanager.model.LargeIconStatus;
import com.android.thememanager.module.detail.presenter.qrj;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.view.zurt;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.util.nn86;
import com.android.thememanager.view.C2938r;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ltg8.C6780k;
import miui.drm.DrmManager;
import mub.InterfaceC7396q;
import zy.lvui;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g */
/* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2225g extends C2226h implements com.android.thememanager.module.detail.presenter.zy {
    public static final int ei = 1;
    public static final int wra = 2;
    private static final int xhv = 6;
    private static final String xqx = "LargeIconVM";
    public static final String zm = "picker";
    public static final String zr5t = "id_load_picker_recommend_list";
    public static final int zsl = 3;
    private String cw14;
    private zurt d1cy;
    private final HashMap<String, fti<LargeIconStatus>> dy;
    private String hp;
    private final fti<C1723y<Integer>> k6e;
    private boolean mjvl;
    private fti<Map<String, com.android.thememanager.module.detail.util.toq>> ndjo;
    private retrofit2.toq<CommonResponse<OnlineResourceDetail>> q7k9;
    private boolean s8y;
    private final fti<List<LargeIconElement>> sk1t;
    private String th6;
    private Map<String, OnlineResourceDetail> vb6;
    private C2938r xk5;
    private boolean xy8;
    private final fti<C2938r> yl25;
    private final fti<List<LargeIconElement>> zmmu;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$g */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class g implements jp0y<ThemeStatus> {
        g() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(ThemeStatus status) {
            int i2 = status.status;
            if (i2 == 98 || i2 == 97) {
                C2225g c2225g = C2225g.this;
                c2225g.z4t(c2225g.f13094h);
                C2225g.this.bz2(this);
                C2225g.this.h7am(11);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$k */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class k extends com.android.thememanager.module.detail.util.toq {
        k(String onlineId, C2225g vm) {
            super(onlineId, vm);
        }

        @Override // com.android.thememanager.module.detail.util.toq, java.lang.Runnable
        public void run() {
            Log.i(C2225g.xqx, "addRequestListToRetry: retry load" + toq());
            super.run();
            C2225g.this.nnh(0, 8, "largeicons");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$n */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class n extends AbstractC1777n<PurchasedOrFavoritedCategory> {

        /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$n$k */
        /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
        class k extends AsyncTask<Void, Void, List<LargeIconElement>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ PurchasedOrFavoritedCategory f13072k;

            k(final PurchasedOrFavoritedCategory val$page) {
                this.f13072k = val$page;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public List<LargeIconElement> doInBackground(Void... voids) {
                ArrayList arrayList = new ArrayList();
                Iterator<UIProduct> it = this.f13072k.products.iterator();
                while (it.hasNext()) {
                    LargeIconElement largeIconElementCreate = LargeIconElement.create(it.next(), 0);
                    largeIconElementCreate.hasBought = true;
                    arrayList.add(largeIconElementCreate);
                    if (arrayList.size() >= 6) {
                        break;
                    }
                }
                return arrayList;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(List<LargeIconElement> originalList) {
                super.onPostExecute(originalList);
                C2225g.this.yp31(originalList, 2);
            }
        }

        n() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui PurchasedOrFavoritedCategory page) {
            if (page.products == null) {
                return;
            }
            new k(page).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$q */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class q extends AbstractC1777n<UIPage> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f13073k;

        q(final String val$productPackageName) {
            this.f13073k = val$productPackageName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(UIPage uIPage, LargeIconElement largeIconElement, String str) {
            ArrayList arrayList = new ArrayList();
            for (UICard uICard : uIPage.cards) {
                if (!y9n.mcp(uICard.products)) {
                    for (UIProduct uIProduct : uICard.products) {
                        if (arrayList.size() >= 8) {
                            break;
                        } else if (largeIconElement == null || !p029m.zy.m24738k(largeIconElement.uuid, uIProduct.uuid)) {
                            arrayList.add(LargeIconElement.create(uIProduct, 2));
                        }
                    }
                }
            }
            if (uIPage.hasMore || arrayList.size() >= 8) {
                LargeIconElement largeIconElement2 = new LargeIconElement();
                largeIconElement2.packageName = str;
                largeIconElement2.type = 3;
                arrayList.add(largeIconElement2);
            }
            C2225g.this.r25n().n7h(new C1723y<>(3));
            C2225g.this.ew().n7h(arrayList);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            C2225g.this.ew().cdj(new ArrayList());
            C2225g.this.r25n().cdj(new C1723y<>(2));
            com.android.thememanager.module.detail.util.toq toqVar = C2225g.this.ndjo.m4388g() != 0 ? (com.android.thememanager.module.detail.util.toq) ((Map) C2225g.this.ndjo.m4388g()).get(C2225g.zr5t) : null;
            if (toqVar == null) {
                if (httpCode == 401) {
                    C2225g.this.h4b();
                }
            } else if (toqVar.toq() < 0) {
                C2225g.this.cyoe(C2225g.zr5t);
            } else {
                C2225g.this.ndjo.cdj((Map) C2225g.this.ndjo.m4388g());
            }
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onResponse(@InterfaceC7396q @lvui final UIPage uiPage) {
            C2225g.this.cyoe(C2225g.zr5t);
            if (y9n.mcp(uiPage.cards)) {
                C2225g.this.ew().cdj(new ArrayList());
                C2225g.this.r25n().cdj(new C1723y<>(3));
            } else {
                final LargeIconElement largeIconElement = C2225g.this.xk5 == null ? null : C2225g.this.xk5.f61539zy;
                final String str = this.f13073k;
                C6002g.m22248y(new Runnable() { // from class: com.android.thememanager.module.detail.presenter.f7l8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13066k.toq(uiPage, largeIconElement, str);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$toq */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class toq extends com.android.thememanager.module.detail.util.toq {

        /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$toq$k */
        /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
        class k extends AbstractC1777n<OnlineResourceDetail> {
            k() {
            }

            @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void onResponse(@InterfaceC7396q @lvui OnlineResourceDetail response) {
                Log.i(C2225g.xqx, "retry success:" + toq.this.zy());
                toq toqVar = toq.this;
                if (C2225g.this.ps(toqVar.zy(), response.isOfficialIcons == 1)) {
                    if (toq.this.m8375q() != null) {
                        toq.this.m8375q().v0af(response);
                    }
                } else {
                    C2225g.this.vb6.put(toq.this.zy(), response);
                    toq toqVar2 = toq.this;
                    C2225g.this.zff0(toqVar2.zy(), 0);
                    toq toqVar3 = toq.this;
                    C2225g.this.cyoe(toqVar3.zy());
                }
            }

            @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
            public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
                super.onFailure(httpCode, apiCode, message, e2);
                if (toq.this.m8374k() >= 0) {
                    C2225g c2225g = C2225g.this;
                    if (!c2225g.u38j((OnlineResourceDetail) c2225g.vb6.get(toq.this.zy()))) {
                        C2225g.this.ndjo.cdj((Map) C2225g.this.ndjo.m4388g());
                        return;
                    }
                }
                toq toqVar = toq.this;
                C2225g.this.cyoe(toqVar.zy());
                Log.i(C2225g.xqx, "retry failed :" + toq.this.zy());
            }
        }

        toq(String onlineId, C2225g vm) {
            super(onlineId, vm);
        }

        @Override // com.android.thememanager.module.detail.util.toq, java.lang.Runnable
        @oc
        public void run() {
            if (m8374k() >= 0) {
                C2225g c2225g = C2225g.this;
                if (!c2225g.u38j((OnlineResourceDetail) c2225g.vb6.get(zy())) && m8375q() != null) {
                    Log.i(C2225g.xqx, "retryRunnable run " + zy() + "," + toq());
                    super.run();
                    DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
                    (p029m.zy.m24738k(zy(), LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID) ? detailRequestInterface.getDefaultLargeIconDetail(zy()) : C1688q.cdj().o1t() ? detailRequestInterface.getSafeResourceDetail(zy(), false) : detailRequestInterface.getResourceDetail(zy(), false)).mo27954p(new k());
                    return;
                }
            }
            C2225g.this.cyoe(zy());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.g$zy */
    /* JADX INFO: compiled from: LargeIconsPickerViewModel.java */
    class zy extends AsyncTask<String, Void, Pair<List<LargeIconElement>, C2938r>> {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.util.Pair<java.util.List<com.android.thememanager.model.LargeIconElement>, com.android.thememanager.view.C2938r> doInBackground(java.lang.String... r11) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.presenter.C2225g.zy.doInBackground(java.lang.String[]):android.util.Pair");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<List<LargeIconElement>, C2938r> result) {
            super.onPostExecute(result);
            if (result != null) {
                Object obj = result.first;
                if (obj != null) {
                    C2225g.this.yp31((List) obj, 1);
                }
                Object obj2 = result.second;
                if (obj2 != null) {
                    C2225g.this.xk5 = new C2938r(((C2938r) obj2).f17676k, ((C2938r) obj2).f61539zy);
                    C2225g c2225g = C2225g.this;
                    Object obj3 = result.second;
                    c2225g.mo8331s(((C2938r) obj3).f61539zy, ((C2938r) obj3).f17676k);
                    C2225g.this.rp(((C2938r) result.second).f61539zy);
                }
            }
        }
    }

    public C2225g(Application app) {
        super(app);
        this.yl25 = new fti<>(new C2938r(-1, null));
        this.zmmu = new fti<>();
        this.sk1t = new fti<>();
        this.dy = new HashMap<>();
        this.vb6 = new HashMap();
        this.k6e = new fti<>();
        this.xy8 = false;
        this.ndjo = new fti<>();
    }

    private retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> b8(int pageIndex, int requestedCount, String packageName) {
        return ((ltg8.toq) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(ltg8.toq.class)).zy(C6780k.f37687k.get(kx3()), pageIndex, requestedCount, C2197k.m8291q(bf2.toq.toq(), C2197k.f12943s, kx3()), C2197k.zy(bf2.toq.toq(), C2197k.f12943s, kx3()), packageName, C2197k.m8288g(bf2.toq.toq(), C2197k.f12943s, kx3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @oc
    public synchronized void cyoe(String id) {
        fti<Map<String, com.android.thememanager.module.detail.util.toq>> ftiVar = this.ndjo;
        if (ftiVar != null && ftiVar.m4388g() != null && this.ndjo.m4388g().size() > 0) {
            this.ndjo.m4388g().remove(id);
        }
    }

    @oc
    private synchronized void ga(String onlineId) {
        if (onlineId == null) {
            return;
        }
        Map<String, com.android.thememanager.module.detail.util.toq> mapM4388g = this.ndjo.m4388g();
        if (mapM4388g == null) {
            mapM4388g = new HashMap<>(8);
        }
        if (!mapM4388g.containsKey(onlineId)) {
            mapM4388g.put(onlineId, new toq(onlineId, this));
            this.ndjo.cdj(mapM4388g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h4b() {
        Map<String, com.android.thememanager.module.detail.util.toq> mapM4388g = this.ndjo.m4388g();
        if (mapM4388g == null) {
            mapM4388g = new HashMap<>(8);
        }
        if (!mapM4388g.containsKey(zr5t)) {
            mapM4388g.put(zr5t, new k(zr5t, this));
            this.ndjo.cdj(mapM4388g);
        }
    }

    private String kx3() {
        return "largeicons";
    }

    private void m58i(String taskId, int status) {
        zurt zurtVar = this.d1cy;
        if (zurtVar != null) {
            zurtVar.f7l8(taskId, status);
        }
    }

    private synchronized List<LargeIconElement> o05(List<LargeIconElement> sources, int dataPart) {
        if (nme().m4388g() != null && nme().m4388g().size() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = dataPart & 1;
            if (i2 != 0 && (dataPart & 2) == 0) {
                for (LargeIconElement largeIconElement : sources) {
                    linkedHashMap.putIfAbsent(largeIconElement.id, largeIconElement);
                }
                if (nme().m4388g() != null) {
                    for (LargeIconElement largeIconElement2 : nme().m4388g()) {
                        linkedHashMap.putIfAbsent(largeIconElement2.id, largeIconElement2);
                    }
                }
            } else if (i2 != 0 || (dataPart & 2) == 0) {
                for (LargeIconElement largeIconElement3 : sources) {
                    linkedHashMap.putIfAbsent(largeIconElement3.id, largeIconElement3);
                }
            } else {
                if (nme().m4388g() != null) {
                    for (LargeIconElement largeIconElement4 : nme().m4388g()) {
                        linkedHashMap.putIfAbsent(largeIconElement4.id, largeIconElement4);
                    }
                }
                for (LargeIconElement largeIconElement5 : sources) {
                    linkedHashMap.putIfAbsent(largeIconElement5.id, largeIconElement5);
                }
            }
            List<LargeIconElement> arrayList = new ArrayList<>(linkedHashMap.size());
            arrayList.addAll(linkedHashMap.values());
            if (arrayList.size() >= 6) {
                arrayList = arrayList.subList(0, 6);
                if (!LargeIconElement.MORE_PURCHASE_LARGE_ICON_ID.equals(arrayList.get(arrayList.size() - 1).id)) {
                    LargeIconElement largeIconElement6 = new LargeIconElement();
                    largeIconElement6.id = LargeIconElement.MORE_PURCHASE_LARGE_ICON_ID;
                    largeIconElement6.type = 1;
                    largeIconElement6.packageName = p029m.zy.toq(this.cw14) ? this.hp : this.cw14;
                    arrayList.add(largeIconElement6);
                }
            }
            Log.d(xqx, "filterLargeIcons islocal:" + dataPart + ", source:" + sources.size() + ",result:" + arrayList.size());
            return arrayList;
        }
        Log.i(xqx, "filterLargeIcons error for empty purchase List." + dataPart);
        if (sources != null && sources.size() > 6) {
            sources = sources.subList(0, 6);
        }
        return sources;
    }

    private void ra() {
        if (!p029m.zy.toq(vyq.ni7("icons"))) {
            Log.i(xqx, "loadOfficialResource: return");
            m4(520);
            return;
        }
        DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
        String str = !p029m.zy.toq(this.cw14) ? this.cw14 : this.hp;
        retrofit2.toq<CommonResponse<OnlineResourceDetail>> toqVar = this.q7k9;
        if (toqVar != null && toqVar.ld6()) {
            this.q7k9.cancel();
        }
        retrofit2.toq<CommonResponse<OnlineResourceDetail>> defaultLargeIconDetail = detailRequestInterface.getDefaultLargeIconDetail(str);
        this.q7k9 = defaultLargeIconDetail;
        defaultLargeIconDetail.mo27954p(new qrj.n7h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rp(LargeIconElement element) {
        String str = element.id;
        this.th6 = str;
        this.f13095i = element.uuid;
        zff0(str, 1);
        OnlineResourceDetail onlineResourceDetail = this.vb6.get(this.th6);
        if (onlineResourceDetail != null && u38j(onlineResourceDetail)) {
            v0af(onlineResourceDetail);
            return;
        }
        retrofit2.toq<CommonResponse<OnlineResourceDetail>> toqVar = this.f13092e;
        if (toqVar != null && toqVar.ld6()) {
            this.f13092e.cancel();
        }
        if (LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID.equals(this.th6)) {
            ra();
        } else {
            f7l8();
        }
    }

    @oc
    private synchronized void uf(String id) {
        LargeIconElement largeIconElement = null;
        List<LargeIconElement> listM4388g = ew().m4388g();
        if (!y9n.mcp(listM4388g)) {
            Iterator<LargeIconElement> it = listM4388g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LargeIconElement next = it.next();
                if (p029m.zy.m24738k(next.id, id)) {
                    largeIconElement = next;
                    break;
                }
            }
            if (largeIconElement != null) {
                largeIconElement.hasBought = true;
                List<LargeIconElement> listM4388g2 = nme().m4388g();
                if (!y9n.mcp(listM4388g2)) {
                    int i2 = -1;
                    C2938r c2938r = this.xk5;
                    if (c2938r == null || c2938r.f61539zy == null || listM4388g2.size() <= 0 || !p029m.zy.m24738k(this.xk5.f61539zy.id, listM4388g2.get(0).id)) {
                        C2938r c2938r2 = this.xk5;
                        if (c2938r2 != null && c2938r2.f61539zy != null && listM4388g2.size() > 1 && p029m.zy.m24738k(this.xk5.f61539zy.id, listM4388g2.get(1).id)) {
                            i2 = 1;
                        }
                    } else {
                        i2 = 0;
                    }
                    if (i2 >= 0 && i2 < listM4388g2.size()) {
                        largeIconElement.type = 0;
                        listM4388g2.add(i2 + 1, largeIconElement);
                        yp31(listM4388g2, 3);
                    }
                    Log.i(xqx, "moveElementToPurchasedList,failed" + i2 + "," + listM4388g2.size());
                    return;
                }
                if (listM4388g.remove(largeIconElement)) {
                    Log.i(xqx, "moveElementToPurchasedList success");
                    ew().cdj(listM4388g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private C2938r m8329w(C2938r selectedElement) {
        if (selectedElement == null || selectedElement.f61539zy == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(1, selectedElement.f61539zy.preview_1_1);
        linkedHashMap.put(2, selectedElement.f61539zy.preview_2_1);
        linkedHashMap.put(3, selectedElement.f61539zy.preview_1_2);
        linkedHashMap.put(4, selectedElement.f61539zy.preview_2_2);
        if (p029m.zy.toq((String) linkedHashMap.get(Integer.valueOf(selectedElement.f17676k)))) {
            int iIntValue = -1;
            Iterator it = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (!p029m.zy.toq((String) linkedHashMap.get(num))) {
                    iIntValue = num.intValue();
                    break;
                }
            }
            selectedElement.f17676k = iIntValue;
        }
        return selectedElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void yp31(List<LargeIconElement> list, int dataPart) {
        Log.d(xqx, "updatePurchaseList: " + dataPart);
        List<LargeIconElement> listO05 = o05(list, dataPart);
        if (y9n.m7250l()) {
            nme().cdj(listO05);
        } else {
            nme().n7h(listO05);
        }
    }

    public void a5id(boolean block) {
        this.xy8 = block;
    }

    public String b9ub(boolean original) {
        return (!original || p029m.zy.toq(this.cw14)) ? this.hp : this.cw14;
    }

    public void bih() {
        try {
            zurt zurtVar = this.d1cy;
            if (zurtVar != null) {
                zurtVar.toq();
            }
            retrofit2.toq<CommonResponse<OnlineResourceDetail>> toqVar = this.f13092e;
            if (toqVar != null) {
                toqVar.cancel();
            }
            retrofit2.toq<CommonResponse<OnlineResourceDetail>> toqVar2 = this.q7k9;
            if (toqVar2 != null) {
                toqVar2.cancel();
            }
            jz5();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void cfr(Resource resource) {
        super.cfr(resource);
        m58i(resource == null ? null : resource.getAssemblyId(), 50);
    }

    public OnlineResourceDetail cnbm(String id, boolean isOfficial) {
        return isOfficial ? this.vb6.get(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID) : this.vb6.get(id);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void dr(DrmManager.DrmResult result, int applyType) {
        super.dr(result, applyType);
        Resource resource = this.f13094h;
        m58i(resource == null ? null : resource.getAssemblyId(), 81);
        h7am(11);
    }

    public fti<ThemeStatus> dxef(AbstractActivityC1717k activity, String applyingId, boolean needDownload) {
        yl(0);
        fti<ThemeStatus> ftiVar = new fti<>(new ThemeStatus(applyingId));
        zurt zurtVar = this.d1cy;
        if (zurtVar != null) {
            zurtVar.toq();
        }
        this.d1cy = new zurt(activity, ftiVar, this, needDownload);
        mo5851h(activity, new g());
        return ftiVar;
    }

    public void e5(String id) {
        m58i(id, 96);
        Log.i(xqx, "apply large Icon");
        if (v5yj()) {
            this.an.cdj(new C1723y<>(i1()));
        } else {
            apply();
        }
    }

    public void ec() {
        h7am(0);
        if (fu4() != null) {
            String str = fu4().id;
            this.f13095i = str;
            OnlineResourceDetail onlineResourceDetailCnbm = cnbm(str, fu4().isOfficialIcons);
            if (onlineResourceDetailCnbm != null) {
                v0af(onlineResourceDetailCnbm);
            } else {
                r6ty(fu4());
            }
        }
    }

    public void el(String usingId) {
        Iterator<String> it = this.dy.keySet().iterator();
        while (it.hasNext()) {
            fti<LargeIconStatus> ftiVar = this.dy.get(it.next());
            if (ftiVar != null && ftiVar.m4388g() != null && ftiVar.m4388g().selected) {
                LargeIconStatus largeIconStatusM4388g = ftiVar.m4388g();
                if (!p029m.zy.m24738k(usingId, largeIconStatusM4388g.id)) {
                    largeIconStatusM4388g.selected = false;
                    ftiVar.cdj(largeIconStatusM4388g);
                }
            }
        }
        fti<LargeIconStatus> ftiVar2 = this.dy.get(usingId);
        if (ftiVar2 == null || ftiVar2.m4388g() == null) {
            return;
        }
        LargeIconStatus largeIconStatusM4388g2 = ftiVar2.m4388g();
        largeIconStatusM4388g2.selected = true;
        ftiVar2.cdj(largeIconStatusM4388g2);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void etdu(Resource resource) {
        super.etdu(resource);
        m58i(resource == null ? null : resource.getAssemblyId(), 49);
        h7am(11);
    }

    public fti<List<LargeIconElement>> ew() {
        return this.sk1t;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void f7l8() {
        try {
            super.f7l8();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    public LargeIconElement fu4() {
        return this.yl25.m4388g().f61539zy;
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    /* JADX INFO: renamed from: g */
    public void mo8330g(@InterfaceC7396q @lvui InterfaceC0954z owner, @InterfaceC7396q @lvui jp0y<C2938r> observer) {
        this.yl25.m4391p(owner, observer);
    }

    public void gcp() {
        this.vb6.clear();
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        super.handleDownloadComplete(downloadPath, taskId, extraData, downloadSuccess, downloadFailCode, new String[0]);
        m58i(taskId, downloadSuccess ? 34 : 33);
        h7am(downloadSuccess ? 9 : 11);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        super.handleDownloadStatusChange(downloadPath, taskId, extraData, currStatus, currBytes, totalBytes);
        if (currStatus == ld6.EnumC1748q.STATUS_WAITING || currStatus == ld6.EnumC1748q.STATUS_PAUSED) {
            return;
        }
        m58i(taskId, 32);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected C2247q i1() {
        C2247q c2247qI1 = super.i1();
        c2247qI1.f13158y = ni7();
        c2247qI1.f13157s = !p029m.zy.toq(this.cw14) ? this.cw14 : this.hp;
        c2247qI1.f60527ld6 = zm;
        c2247qI1.f13155p = this.s8y;
        if (fu4() != null) {
            String str = fu4().id;
            c2247qI1.f60526f7l8 = str;
            if (str == null) {
                c2247qI1.f60526f7l8 = this.th6;
            }
            if (c2247qI1.f13157s == null) {
                c2247qI1.f13157s = fu4().packageName;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("createApplyParams: ");
        sb.append(c2247qI1.f13157s);
        sb.append(",");
        sb.append(c2247qI1.f60526f7l8 != null);
        Log.i(xqx, sb.toString());
        return c2247qI1;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void i9jn() {
        super.i9jn();
        cv06();
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void ikck() {
        if (this.f13095i == null) {
            return;
        }
        DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
        if (C1688q.cdj().o1t()) {
            this.f13092e = detailRequestInterface.getSafeResourceDetail(this.f13095i, false);
        } else {
            this.f13092e = detailRequestInterface.getResourceDetail(this.f13095i, false);
        }
    }

    public fti<Map<String, com.android.thememanager.module.detail.util.toq>> ix() {
        return this.ndjo;
    }

    public fti<LargeIconStatus> kiv(String id, LargeIconStatus status) {
        fti<LargeIconStatus> ftiVar = this.dy.get(id);
        if (ftiVar == null) {
            ftiVar = new fti<>(status);
        } else {
            ftiVar.cdj(status);
        }
        this.dy.put(id, ftiVar);
        return ftiVar;
    }

    public void l05() {
        this.vb6.clear();
        vy(true);
    }

    @SuppressLint({"StaticFieldLeak"})
    public void lw() {
        Log.i(xqx, "buildLocalLargeIcons: " + this.hp + "," + this.cw14);
        new zy().executeOnExecutor(C6002g.ld6(), new String[0]);
    }

    public boolean m2t(String id) {
        LargeIconElementRuntime largeIconElementRuntimeM9919n = nn86.m9915q(fn3e.toq(false)).m9923y().m9919n(this.hp);
        if (largeIconElementRuntimeM9919n == null) {
            return false;
        }
        return p029m.zy.m24738k(id, largeIconElementRuntimeM9919n.uuid);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void m4(int apiCode) {
        OnlineResourceDetail onlineResourceDetail;
        super.m4(apiCode);
        Log.d(xqx, "onReloadFailure: " + this.f13095i + "," + apiCode + "," + this.th6);
        if (apiCode == 520) {
            LargeIconElement largeIconElement = new LargeIconElement();
            largeIconElement.isOfficialIcons = true;
            largeIconElement.id = LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID;
            largeIconElement.packageName = this.hp;
            largeIconElement.author = vyq.fu4("icons");
            largeIconElement.hasBought = true;
            largeIconElement.name = C1819o.m7168z();
            largeIconElement.signature = vyq.fn3e("icons");
            largeIconElement.preview_1_1 = LargeIconElement.getDefaultIconPathByPackageNames(this.hp);
            this.vb6.put(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, LargeIconElement.create(largeIconElement));
        } else {
            ga(this.f13095i);
        }
        if (fu4() == null || !p029m.zy.m24738k(fu4().id, this.th6)) {
            return;
        }
        if (apiCode == 520 && ps(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, true)) {
            OnlineResourceDetail onlineResourceDetail2 = this.vb6.get(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID);
            this.f13109z = onlineResourceDetail2;
            this.in.cdj(onlineResourceDetail2);
            uc(onlineResourceDetail2.toResource(), new boolean[0]);
            this.f13108y.cdj(new Pair<>(onlineResourceDetail2, 1));
            h7am(0);
            zff0(this.th6, 0);
            return;
        }
        Resource resourceN7h = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().f7l8("largeicons")).m7690k().n7h(this.f13095i);
        if (resourceN7h == null) {
            this.f13109z = LargeIconElement.create(fu4());
        } else {
            this.f13109z = OnlineResourceDetail.fromResource(resourceN7h, "largeicons");
        }
        this.f13109z.uiVersion = p001b.toq.ki("largeicons");
        this.in.cdj(this.f13109z);
        if (resourceN7h == null && (onlineResourceDetail = this.f13109z) != null) {
            resourceN7h = onlineResourceDetail.toResource();
        }
        uc(resourceN7h, new boolean[0]);
        this.f13108y.cdj(new Pair<>(this.f13109z, 1));
        h7am(0);
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    public int ni7() {
        return this.yl25.m4388g().f17676k;
    }

    public fti<List<LargeIconElement>> nme() {
        return this.zmmu;
    }

    public void nnh(int cardStart, int cardCount, String pageCategory) {
        Log.i(xqx, "loadRecommendList begin，" + C1688q.cdj().o1t());
        String str = p029m.zy.toq(this.cw14) ? this.hp : this.cw14;
        DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
        retrofit2.toq<CommonResponse<UIPage>> pickerRecommend = C1688q.cdj().o1t() ? detailRequestInterface.getPickerRecommend(C6780k.f37687k.get(pageCategory), cardStart, cardCount, str) : detailRequestInterface.getPickerRecommendNoLogin(C6780k.f37687k.get(pageCategory), cardStart, cardCount, str);
        r25n().cdj(new C1723y<>(1));
        pickerRecommend.mo27954p(new q(str));
    }

    public void o5(String packageName, boolean isDualApp, boolean isDefault, String originalPackageName) {
        this.hp = packageName;
        this.cw14 = originalPackageName;
        this.s8y = isDualApp;
        this.mjvl = isDefault;
        if (this.vb6.get(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID) == null) {
            ra();
        }
    }

    public void oki() {
        if (C1688q.cdj().wvg()) {
            b8(0, 0, p029m.zy.toq(this.cw14) ? this.hp : this.cw14).mo27954p(new n());
        }
    }

    public boolean ps(String elementId, boolean isOfficial) {
        LargeIconElement largeIconElementFu4 = fu4();
        if (largeIconElementFu4 == null) {
            return false;
        }
        if (!isOfficial || !largeIconElementFu4.isOfficialIcons) {
            String str = largeIconElementFu4.id;
            if (isOfficial) {
                elementId = LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID;
            }
            if (!p029m.zy.m24738k(str, elementId)) {
                return false;
            }
        }
        return true;
    }

    public fti<C1723y<Integer>> r25n() {
        return this.k6e;
    }

    public void r6ty(LargeIconElement element) {
        if (element == null) {
            return;
        }
        if (this.xy8) {
            Log.i(xqx, "selectResource error, blocked");
            return;
        }
        Log.i(xqx, "selectResource: " + element.id);
        OnlineResourceDetail onlineResourceDetailCnbm = cnbm(element.id, element.isOfficialIcons);
        if (onlineResourceDetailCnbm != null) {
            element = LargeIconElement.create(onlineResourceDetailCnbm, element, this.hp);
        }
        mo8331s(element, -1);
        rp(element);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void r8s8() {
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    /* JADX INFO: renamed from: s */
    public void mo8331s(LargeIconElement newElement, int type) {
        if (this.xy8) {
            Log.i(xqx, "setSelectedResource error ,blocked");
            return;
        }
        C2938r c2938rM4388g = this.yl25.m4388g();
        if (c2938rM4388g == null) {
            c2938rM4388g = new C2938r(-1, null);
        }
        boolean z2 = !Objects.equals(newElement, c2938rM4388g.f61539zy);
        boolean z3 = type != c2938rM4388g.f17676k;
        if (z2 || z3) {
            if (type >= 0) {
                c2938rM4388g.f17676k = type;
            }
            if (newElement != null) {
                c2938rM4388g.f61539zy = newElement;
            }
            if (newElement != null && p029m.zy.m24738k(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, newElement.id)) {
                c2938rM4388g = m8329w(c2938rM4388g);
            }
            this.yl25.cdj(c2938rM4388g);
            if (newElement == null || !z2) {
                return;
            }
            el(c2938rM4388g.f61539zy.id);
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void sok(Resource resource) {
        super.sok(resource);
        m58i(resource == null ? null : resource.getAssemblyId(), 48);
    }

    public boolean u38j(OnlineResourceDetail detail) {
        if (detail != null) {
            if (detail.isOfficialIcons == 1 && !p029m.zy.toq(detail.largeIconsUrl_1x1)) {
                return true;
            }
            if (detail.isOfficialIcons == 0 && !p029m.zy.toq(detail.largeIconsUrl_1x1) && !p029m.zy.toq(detail.largeIconsUrl_2x1) && !p029m.zy.toq(detail.largeIconsUrl_1x2) && !p029m.zy.toq(detail.largeIconsUrl_2x2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void v0af(@InterfaceC7396q @lvui OnlineResourceDetail response) {
        Map<String, OnlineResourceDetail> map = this.vb6;
        int i2 = response.isOfficialIcons;
        String str = LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID;
        map.put(i2 == 1 ? LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID : response.getId(), response);
        String id = response.getId();
        if (response.isOfficialIcons == 1) {
            response.bought = true;
            response.largeIconsUrl_1x1 = LargeIconElement.getDefaultIconPathByPackageNames(this.hp);
        } else {
            if (ps(response.getId(), response.isOfficialIcons == 1) && fu4() != null && fu4().type == 0 && m2t(response.getId())) {
                response.bought = true;
            }
            str = id;
        }
        Log.d(xqx, "onReloadSuccess: " + str + "," + response.uiVersion);
        if (response.uiVersion <= 0) {
            response.uiVersion = p001b.toq.ki("largeicons");
        }
        zff0(str, 0);
        if (ps(str, response.isOfficialIcons == 1)) {
            super.v0af(response);
        }
        cyoe(str);
    }

    public boolean v5yj() {
        return fu4() != null && LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID.equals(fu4().id) && ni7() == 1;
    }

    public void vy(boolean refresh) {
        Log.i(xqx, "beginLoadData: " + refresh);
        if (y9n.mcp(nme().m4388g()) || refresh) {
            if (y9n.mcp(nme().m4388g())) {
                lw();
            }
            oki();
        }
        if (y9n.mcp(ew().m4388g()) || refresh) {
            nnh(0, 8, "largeicons");
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void w831() {
        ktq();
    }

    public void wlev(InterfaceC0954z owner, jp0y<LargeIconStatus> observer, LargeIconStatus status) {
        new fti(status).m4391p(owner, observer);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void xwq3(zy.C7914zy result, int applyType) {
        super.xwq3(result, applyType);
        Resource resource = this.f13094h;
        m58i(resource == null ? null : resource.getAssemblyId(), 81);
        h7am(11);
    }

    public void yw() {
        if (this.zmmu.m4388g() != null) {
            this.zmmu.m4388g().clear();
            fti<List<LargeIconElement>> ftiVar = this.zmmu;
            ftiVar.cdj(ftiVar.m4388g());
        }
        lw();
        oki();
    }

    public void z4t(Resource resource) {
        m58i(resource == null ? null : resource.getAssemblyId(), 98);
        this.d1cy = null;
        h7am(11);
    }

    public void zff0(String id, int process) {
        fti<LargeIconStatus> ftiVar;
        if (id == null || (ftiVar = this.dy.get(id)) == null || ftiVar.m4388g() == null) {
            return;
        }
        LargeIconStatus largeIconStatusM4388g = ftiVar.m4388g();
        largeIconStatusM4388g.status = process;
        ftiVar.cdj(largeIconStatusM4388g);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void zkd(String id) {
        super.zkd(id);
        OnlineResourceDetail onlineResourceDetail = this.vb6.get(id);
        if (onlineResourceDetail != null && !onlineResourceDetail.bought) {
            onlineResourceDetail.bought = true;
        }
        fti<LargeIconStatus> ftiVar = this.dy.get(id);
        if (ftiVar != null) {
            LargeIconStatus largeIconStatusM4388g = ftiVar.m4388g();
            largeIconStatusM4388g.hasBought = true;
            ftiVar.cdj(largeIconStatusM4388g);
        }
        Log.i(xqx, "purchasedSuccess: " + id);
        uf(id);
    }
}
