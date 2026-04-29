package com.android.thememanager;

import a98o.C0004k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ListView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.BatchOperationResources;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.controller.local.AsyncTaskC1904g;
import com.android.thememanager.controller.local.AsyncTaskC1911q;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.model.PrecustSystemWallpaperInfo;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.search.ThemeSearchActivity;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.personalize.C2567p;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.jbh;
import com.android.thememanager.util.uc;
import com.android.thememanager.util.vq;
import ek5k.C6002g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import miuix.core.util.C7083n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.q */
/* JADX INFO: compiled from: AppServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2320q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2320q f13524k = new C2320q();

    private C2320q() {
    }

    @l05.qrj
    /* JADX INFO: renamed from: a */
    public static final void m8473a(@InterfaceC7395n String str, boolean z2) {
        g1.gyi(str, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final List<Resource> a9(@InterfaceC7395n String str, boolean z2) {
        List<Resource> listKi = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(str)).m7690k().ki(false, true, z2);
        kotlin.jvm.internal.d2ok.kja0(listKi, "getLocalResources(...)");
        return listKi;
    }

    @l05.qrj
    public static final void a98o(@InterfaceC7395n Resource resource) {
        C2082k.zy().m8000g().m8433i(resource);
    }

    @l05.qrj
    /* JADX INFO: renamed from: b */
    public static final void m8474b(@InterfaceC7395n C1791k c1791k, @InterfaceC7395n InterfaceC1744k interfaceC1744k) {
        C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10537n(c1791k)).m7690k().m7671q(interfaceC1744k);
    }

    @l05.qrj
    public static final void bf2(@InterfaceC7396q String onlineId) {
        kotlin.jvm.internal.d2ok.m23075h(onlineId, "onlineId");
        EnumC1933t.LIKE.remove(onlineId);
    }

    @l05.qrj
    /* JADX INFO: renamed from: c */
    public static final boolean m8475c(@InterfaceC7395n String str) {
        return C2082k.zy().m8000g().cdj(str);
    }

    @l05.qrj
    public static final boolean cdj(boolean z2) {
        C2567p.m9074s(z2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ch() {
        EnumC1933t.FAVORITE.syncFavoriteWithServer();
    }

    @l05.qrj
    public static final void d2ok(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n ListView listView, @InterfaceC7395n View view) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        ((ThemeSearchActivity) activity).bz2().mcp(listView, view);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final C0004k<Resource> d3(@InterfaceC7395n List<? extends UIProduct> list, int i2) {
        int size = list != null ? list.size() : 0;
        if (size == 0) {
            return new C0004k<>();
        }
        C0004k<Resource> c0004k = new C0004k<>();
        int i3 = 0;
        while (i3 < size) {
            boolean z2 = i2 < 0 || i2 == i3;
            kotlin.jvm.internal.d2ok.qrj(list);
            c0004k.add(zurt(list.get(i3), z2));
            i3++;
        }
        return c0004k;
    }

    @l05.qrj
    public static final boolean dd(@InterfaceC7395n String str, @InterfaceC7395n Resource resource) {
        return C2244g.zy(str, resource);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8476e() {
        return com.android.thememanager.util.oc.m9943c().lrht();
    }

    @InterfaceC7396q
    @l05.qrj
    public static final List<Resource> ek5k(@InterfaceC7395n String str, boolean z2) {
        List<Resource> listKi = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(str)).m7690k().ki(true, true, z2);
        kotlin.jvm.internal.d2ok.kja0(listKi, "getLocalResources(...)");
        return listKi;
    }

    @l05.qrj
    public static final void eqxt(@InterfaceC7395n C1791k c1791k, @InterfaceC7395n Resource resource) {
        C2082k.zy().f7l8().m9771t(C2082k.zy().m8001n().m10537n(c1791k), resource);
    }

    @l05.qrj
    /* JADX INFO: renamed from: f */
    public static final boolean m8477f(@InterfaceC7395n Resource resource) {
        return C2082k.zy().m8000g().m8432h(resource);
    }

    @l05.qrj
    public static final void f7l8(@InterfaceC7395n String str) {
        uc.m10033q(str);
    }

    @l05.qrj
    public static final void fn3e(@InterfaceC7395n Resource resource, @InterfaceC7395n C1791k c1791k, @InterfaceC7395n zy.C1711k c1711k, @InterfaceC7395n ld6.InterfaceC1747n interfaceC1747n) throws Throwable {
        C2082k.zy().m8000g().m8431g(resource, C2082k.zy().m8001n().m10537n(c1791k), c1711k, true);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final BatchOperationResources fti(@InterfaceC7395n C1791k c1791k) {
        BatchOperationResources batchOperationResourcesZy = com.android.thememanager.controller.local.x2.zy(c1791k);
        kotlin.jvm.internal.d2ok.kja0(batchOperationResourcesZy, "getOperationThemeStatus(...)");
        return batchOperationResourcesZy;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final String fu4(@InterfaceC7395n String str) {
        String strM9751o = g1.m9751o(str);
        kotlin.jvm.internal.d2ok.kja0(strM9751o, "loadApplyingComponentId(...)");
        return strM9751o;
    }

    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final void m8478g(@InterfaceC7395n InterfaceC1755y interfaceC1755y) {
        C2082k.zy().m8000g().zy(interfaceC1755y);
    }

    @l05.qrj
    public static /* synthetic */ void gvn7() {
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: h */
    public static final Map<String, Boolean> m8479h(@InterfaceC7396q String productType, @InterfaceC7396q String... onlineIds) {
        kotlin.jvm.internal.d2ok.m23075h(productType, "productType");
        kotlin.jvm.internal.d2ok.m23075h(onlineIds, "onlineIds");
        try {
            Map<String, Boolean> mapM7579y = com.android.thememanager.controller.online.ld6.m7579y(productType, (String[]) Arrays.copyOf(onlineIds, onlineIds.length));
            kotlin.jvm.internal.d2ok.qrj(mapM7579y);
            return mapM7579y;
        } catch (Exception unused) {
            Map<String, Boolean> mapEmptyMap = Collections.emptyMap();
            kotlin.jvm.internal.d2ok.qrj(mapEmptyMap);
            return mapEmptyMap;
        }
    }

    @l05.qrj
    public static final boolean hb(@InterfaceC7395n Resource resource, @InterfaceC7395n C1791k c1791k) {
        return new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10537n(c1791k)).m7690k().mcp(resource);
    }

    @l05.qrj
    public static final boolean hyr(@InterfaceC7395n String str, @InterfaceC7395n Resource resource) {
        return C2244g.m8367g(str, resource);
    }

    @l05.qrj
    /* JADX INFO: renamed from: i */
    public static final void m8480i(@InterfaceC7395n Resource resource, @InterfaceC7395n C1791k c1791k, @InterfaceC7395n zy.C1711k c1711k) {
        C2082k.zy().m8000g().m8434n(resource, C2082k.zy().m8001n().m10537n(c1791k), c1711k);
    }

    @l05.qrj
    public static final void i1(@InterfaceC7395n InterfaceC1755y interfaceC1755y) {
        C2082k.zy().m8000g().t8r(interfaceC1755y);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: j */
    public static final Resource m8481j(@InterfaceC7395n String str, @InterfaceC7395n Resource resource) {
        Resource resourceF7l8 = C2244g.f7l8(str, resource, false);
        kotlin.jvm.internal.d2ok.kja0(resourceF7l8, "mergeLocalInfo(...)");
        return resourceF7l8;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final List<Resource> jk(@InterfaceC7395n String str) {
        return a9(str, false);
    }

    @InterfaceC7396q
    public static final List<Resource> jp0y() {
        ArrayList arrayList = new ArrayList();
        for (Resource resource : jk("spwallpaper")) {
            if (C1792n.gvn7(resource)) {
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    @l05.qrj
    public static final void ki(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n List<? extends Resource> list, @InterfaceC7395n C1791k c1791k, @InterfaceC7395n com.android.thememanager.basemodule.local.f7l8 f7l8Var) {
        new AsyncTaskC1911q(activityC0891q, list, c1791k, f7l8Var).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @l05.qrj
    public static final boolean kja0(@InterfaceC7395n ActivityC0891q activityC0891q) {
        return com.android.thememanager.util.oc.ncyb(activityC0891q);
    }

    @l05.qrj
    /* JADX INFO: renamed from: l */
    public static final boolean m8483l(@InterfaceC7395n Resource resource) {
        return EnumC1933t.LIKE.contains(resource);
    }

    @l05.qrj
    public static final void ld6(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n Resource resource, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(str);
        fu4VarM10535g.setCurrentUsingPath(str2);
        vq.m10057n(activityC0891q, fu4VarM10535g, resource);
    }

    public static final boolean lrht() {
        return C2082k.zy().f7l8().mcp();
    }

    @l05.qrj
    public static final boolean lvui(@InterfaceC7395n Resource resource, @InterfaceC7396q C1791k newResourceContext) {
        kotlin.jvm.internal.d2ok.m23075h(newResourceContext, "newResourceContext");
        fu4 fu4VarM10537n = C2082k.zy().m8001n().m10537n(newResourceContext);
        String metaPath = new ResourceResolver(resource, fu4VarM10537n).getMetaPath();
        return (TextUtils.isEmpty(metaPath) || C1792n.nn86(metaPath) || C1792n.hyr(metaPath) || !new com.android.thememanager.controller.x2(fu4VarM10537n).m7690k().mo7478t(resource) || TextUtils.equals(C7083n.m25584g(metaPath), C7083n.m25584g(bwp.m9634s(bf2.toq.toq(), newResourceContext.getResourceCode())))) ? false : true;
    }

    @l05.qrj
    /* JADX INFO: renamed from: m */
    public static final void m8484m(@InterfaceC7395n Resource resource) {
        C2082k.zy().m8000g().ki(resource);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Class<? extends Fragment> mcp(@InterfaceC7396q String resourceCode) {
        kotlin.jvm.internal.d2ok.m23075h(resourceCode, "resourceCode");
        Class<? extends Fragment> clsLd6 = bwp.ld6(resourceCode);
        kotlin.jvm.internal.d2ok.kja0(clsLd6, "getLocalListFragmentClass(...)");
        return clsLd6;
    }

    @l05.qrj
    /* JADX INFO: renamed from: n */
    public static final void m8485n(@InterfaceC7395n String str) {
        EnumC1933t.LIKE.add(str);
    }

    @l05.qrj
    public static final boolean n5r1(@InterfaceC7395n String str, @InterfaceC7395n Resource resource) {
        return C2244g.m8369n(str, resource);
    }

    @l05.qrj
    public static final boolean n7h(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n C1791k c1791k, @InterfaceC7395n List<? extends Resource> list, @InterfaceC7395n InterfaceC1744k interfaceC1744k) {
        return com.android.thememanager.controller.local.x2.toq(activityC0891q, c1791k, list, interfaceC1744k);
    }

    @l05.qrj
    public static final boolean ncyb(@InterfaceC7396q Intent intent) {
        kotlin.jvm.internal.d2ok.m23075h(intent, "intent");
        return intent.getIntExtra("category_type", -1) == 0;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final String ni7(@InterfaceC7395n Resource resource, @InterfaceC7395n C1791k c1791k) {
        String strF7l8 = o1t.f7l8(resource, C2082k.zy().m8001n().m10537n(c1791k));
        kotlin.jvm.internal.d2ok.kja0(strF7l8, "generateDownloadPath(...)");
        return strF7l8;
    }

    @l05.qrj
    public static /* synthetic */ void nn86() {
    }

    @l05.qrj
    /* JADX INFO: renamed from: o */
    public static final boolean m8486o(@InterfaceC7395n C1791k c1791k) {
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10537n(c1791k));
        if (x2VarLd6.m7690k() == null || x2VarLd6.m7690k().kja0() == null) {
            return true;
        }
        kotlin.jvm.internal.d2ok.kja0(x2VarLd6.m7690k().kja0(), "getLocalResources(...)");
        if (!(!r0.isEmpty())) {
            return true;
        }
        for (Resource resource : x2VarLd6.m7690k().kja0()) {
            kotlin.jvm.internal.d2ok.kja0(resource, "next(...)");
            Resource resource2 = resource;
            if (ResourceLocalProperties.ResourceStorageType.SYSTEM != resource2.getResourceStorageType() && ResourceLocalProperties.ResourceStorageType.PRECUST != resource2.getResourceStorageType()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7395n
    @l05.qrj
    public static final String o1t(@InterfaceC7395n Context context, @InterfaceC7395n String str) {
        return bwp.m9634s(context, str);
    }

    @l05.qrj
    public static final void oc(@InterfaceC7395n Uri uri, @InterfaceC7395n C1791k c1791k, int i2, @InterfaceC7395n com.android.thememanager.basemodule.local.n7h n7hVar) {
        new AsyncTaskC1904g(uri, c1791k, i2, n7hVar).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @l05.qrj
    /* JADX INFO: renamed from: p */
    public static final boolean m8487p(boolean z2, @InterfaceC7395n String str, @InterfaceC7395n Resource resource, boolean z3) {
        kotlin.jvm.internal.d2ok.qrj(resource);
        return uc.m10032p(z2, str, jbh.m9832k("video", "theme", resource), z3);
    }

    @l05.qrj
    /* JADX INFO: renamed from: q */
    public static final void m8488q(@InterfaceC7396q String onlineId) {
        kotlin.jvm.internal.d2ok.m23075h(onlineId, "onlineId");
        EnumC1933t.LIKE.add(onlineId);
    }

    @l05.qrj
    public static final boolean qrj(boolean z2, boolean z3, boolean z5, @InterfaceC7395n String str, boolean z6, @InterfaceC7395n Resource resource) {
        kotlin.jvm.internal.d2ok.qrj(resource);
        return uc.n7h(z2, z3, z5, str, z6, jbh.m9832k("video", "theme", resource));
    }

    @l05.qrj
    /* JADX INFO: renamed from: r */
    public static final boolean m8489r(@InterfaceC7395n Resource resource) {
        fu4 fu4VarM10537n = C2082k.zy().m8001n().m10537n(C1791k.getWallpaper());
        String metaPath = new ResourceResolver(resource, fu4VarM10537n).getMetaPath();
        return (TextUtils.isEmpty(metaPath) || C1792n.nn86(metaPath) || C1792n.hyr(metaPath) || !new com.android.thememanager.controller.x2(fu4VarM10537n).m7690k().mo7478t(resource) || TextUtils.equals(metaPath, bwp.m9634s(bf2.toq.toq(), "wallpaper")) || TextUtils.equals(metaPath, bwp.m9634s(bf2.toq.toq(), "lockscreen"))) ? false : true;
    }

    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final boolean m8490s(@InterfaceC7395n String str, boolean z2, boolean z3, boolean z5) {
        return uc.m10038y(str, z2, z3, z5);
    }

    @l05.qrj
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m8491t() {
    }

    @l05.qrj
    public static final void t8r(@InterfaceC7395n Resource resource, @InterfaceC7395n C1791k c1791k) {
        C2082k.zy().m8000g().m8436q(resource, C2082k.zy().m8001n().m10537n(c1791k));
    }

    @l05.qrj
    public static final void toq(@InterfaceC7395n C1791k c1791k, @InterfaceC7395n InterfaceC1744k interfaceC1744k) {
        C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10537n(c1791k)).m7690k().m7669k(interfaceC1744k);
    }

    @l05.qrj
    public static final boolean uv6(@InterfaceC7395n Resource resource) {
        return C2082k.zy().f7l8().jk(resource);
    }

    @l05.qrj
    public static /* synthetic */ void vyq() {
    }

    @InterfaceC7396q
    public static final String wvg() {
        String strM9384y = C2687z.m9384y();
        kotlin.jvm.internal.d2ok.kja0(strM9384y, "getHistoryFolderPath(...)");
        return strM9384y;
    }

    @l05.qrj
    /* JADX INFO: renamed from: x */
    public static final void m8492x() {
        C6002g.f7l8(new Runnable() { // from class: com.android.thememanager.zy
            @Override // java.lang.Runnable
            public final void run() {
                C2320q.ch();
            }
        });
    }

    @l05.qrj
    public static final void x2(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n String str) {
        vq.m10061y(activityC0891q, str);
    }

    @l05.qrj
    public static final boolean x9kr(@InterfaceC7395n Resource resource) {
        return C2082k.zy().m8000g().n7h(resource);
    }

    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final boolean m8493y(@InterfaceC7395n String str, int i2, int i3, int i4, int i5, @InterfaceC7395n String str2) {
        return uc.qrj(str, i2, i3, i4, i5, str2);
    }

    @l05.qrj
    public static final void y9n(@InterfaceC7395n String str) {
        EnumC1933t.LIKE.remove(str);
    }

    @l05.qrj
    public static final void yz(@InterfaceC7395n String str) {
        EnumC1933t.FAVORITE.remove(str);
    }

    @l05.qrj
    /* JADX INFO: renamed from: z */
    public static final boolean m8494z(@InterfaceC7395n String str, boolean z2) {
        return g1.x2(str, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Pair<File, File> zp(@InterfaceC7395n File file) {
        Pair<File, File> pairZp = uc.zp(file);
        kotlin.jvm.internal.d2ok.kja0(pairZp, "splitVideoApplyIncallShow(...)");
        return pairZp;
    }

    @InterfaceC7395n
    @l05.qrj
    public static final Resource zurt(@InterfaceC7395n UIProduct uIProduct, boolean z2) {
        if (uIProduct == null) {
            return null;
        }
        Resource resource = new Resource();
        String str = uIProduct.name;
        String str2 = uIProduct.uuid;
        String str3 = uIProduct.imageUrl;
        String str4 = uIProduct.originalImageUrl;
        resource.setOnlineId(str2);
        resource.getOnlineInfo().setTitle(str);
        resource.getOnlineInfo().setTrackId(uIProduct.trackId);
        resource.setProductId(uIProduct.productUuid);
        resource.setVideoUrl(uIProduct.downloadUrl, uIProduct.videoUrl);
        resource.putExtraMeta(PrecustSystemWallpaperInfo.FILE_SIZE_IN_KB, "" + uIProduct.fileSizeInKB);
        resource.putExtraMeta(PrecustSystemWallpaperInfo.INNERTAGS, com.android.thememanager.basemodule.utils.hyr.zy(",", uIProduct.innerTags));
        resource.setWallpaperGalleryTypeAndId(uIProduct.wallpaperGalleryType, uIProduct.wallpaperGalleryTypeId);
        uc.fn3e(resource, str3, str4, z2);
        return resource;
    }

    @l05.qrj
    public static final void zy(@InterfaceC7395n String str) {
        EnumC1933t.FAVORITE.add(str);
    }
}
