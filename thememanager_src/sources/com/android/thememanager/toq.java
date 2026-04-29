package com.android.thememanager;

import a98o.C0004k;
import a98o.C0005q;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.activity.ThirdPartyPickersActivity;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.ad.VideoAdActivity;
import com.android.thememanager.author.AuthorDetailActivity;
import com.android.thememanager.author.C1669k;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.module.detail.view.WidgetDetailActivity;
import com.android.thememanager.module.detail.view.jz5;
import com.android.thememanager.module.detail.view.y9n;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.search.ThemeSearchActivity;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.superwallpaper.activity.MamlSuperWallpaperDetailActivity;
import com.android.thememanager.util.uc;
import com.android.thememanager.v9.WallpaperSubjectActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6311u;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: AppRouterImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f16223k = new toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61170toq = "AppRouterImpl";

    private toq() {
    }

    @l05.qrj
    public static final void a9(@InterfaceC7396q ActivityC0891q activity, int i2, @InterfaceC7395n List<? extends UIProduct> list, int i3, boolean z2, int i4, @InterfaceC7396q String subjectUuid, @InterfaceC7396q String subjectTitle) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        kotlin.jvm.internal.d2ok.m23075h(subjectUuid, "subjectUuid");
        kotlin.jvm.internal.d2ok.m23075h(subjectTitle, "subjectTitle");
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(x2(list, i2));
        m9547t(activity, i2, arrayList, 2, null, i3, z2, i4, subjectUuid, subjectTitle);
    }

    public static /* synthetic */ Intent cdj(ActivityC0891q activityC0891q, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return m9540h(activityC0891q, str, str2);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent f7l8(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n AdInfo adInfo) {
        Intent intent = new Intent(activityC0891q, (Class<?>) VideoAdActivity.class);
        intent.putExtra(p001b.f7l8.erbd, adInfo);
        return intent;
    }

    @InterfaceC6768s
    @l05.qrj
    public static final boolean fn3e(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        return ni7(activity, str, str2, str3, 0, 16, null);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent fti(@InterfaceC7395n ActivityC0891q activityC0891q, int i2, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, boolean z2, @InterfaceC7395n String str4) {
        Intent intentM10163g = com.android.thememanager.v9.f7l8.m10163g(activityC0891q, i2, str, str2, str3, z2, str4);
        kotlin.jvm.internal.d2ok.kja0(intentM10163g, "getWallpaperSubjectDetailIntent(...)");
        return intentM10163g;
    }

    @l05.qrj
    public static final boolean fu4(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n String str, @InterfaceC7395n String str2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        Intent intentM9546s = m9546s(activity, str, str2, z2);
        if (intentM9546s != null) {
            z = intentM9546s.resolveActivity(activity.getPackageManager()) != null;
            if (z) {
                activity.startActivity(intentM9546s);
            } else {
                Log.e(f61170toq, "navigationToWidgetDetail failed: intent not resolved.");
            }
        }
        return z;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final Intent m9539g(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n Resource resource, boolean z2) {
        Intent intentH4b = MamlSuperWallpaperDetailActivity.h4b(activityC0891q, resource, z2);
        kotlin.jvm.internal.d2ok.kja0(intentH4b, "createIntent(...)");
        return intentH4b;
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: h */
    public static final Intent m9540h(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        Intent intent = new Intent("android.intent.action.SEARCH");
        Object systemService = activity.getApplicationContext().getSystemService(C2656k.f15718s);
        kotlin.jvm.internal.d2ok.n7h(systemService, "null cannot be cast to non-null type android.app.SearchManager");
        SearchableInfo searchableInfo = ((SearchManager) systemService).getSearchableInfo(activity.getComponentName());
        if (C1807g.zurt()) {
            intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.search.ThemeSearchActivity"));
        } else {
            intent.setComponent(searchableInfo.getSearchActivity());
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("REQUEST_RESOURCE_CODE", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(InterfaceC1357q.f53866eqxt, str2);
        }
        return intent;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: i */
    public static final Intent m9541i(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
        Intent intent = new Intent(context, (Class<?>) ThemeTabActivity.class);
        ArrayList arrayList = new ArrayList();
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(str);
        pageGroup.setUrl(str2);
        pageGroup.setPageGroupType(1);
        arrayList.add(pageGroup);
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(InterfaceC1357q.f53866eqxt, str);
        }
        return intent;
    }

    @l05.qrj
    public static final void jk(@InterfaceC7396q ActivityC0891q activity, int i2, int i3, int i4, @InterfaceC7395n List<? extends Resource> list) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        ArrayList arrayList = new ArrayList();
        C0004k c0004k = new C0004k();
        kotlin.jvm.internal.d2ok.qrj(list);
        c0004k.addAll(list);
        arrayList.add(c0004k);
        C2082k.zy().qrj(arrayList);
        Intent intent = new Intent(activity, (Class<?>) WallpaperDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, i3);
        intent.putExtra(InterfaceC1357q.f53965y2, i4);
        activity.startActivityForResult(intent, intent.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: k */
    public static final Intent m9542k(@InterfaceC7395n ActivityC0891q activityC0891q, int i2, @InterfaceC7396q List<? extends Resource> dataGroup, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(dataGroup, "dataGroup");
        ArrayList arrayList = new ArrayList();
        C0004k c0004k = new C0004k();
        int size = dataGroup.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0004k.add(dataGroup.get(i3));
        }
        arrayList.add(c0004k);
        C2082k.zy().qrj(arrayList);
        Intent intent = new Intent(activityC0891q, (Class<?>) ThemeDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra(InterfaceC1357q.f53965y2, 1);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("REQUEST_RESOURCE_CODE", str);
        }
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        return intent;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent ki(@InterfaceC7395n Context context, @InterfaceC7395n Fragment fragment, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n Boolean bool, @InterfaceC7395n String str4) {
        Intent intent = new Intent(context, (Class<?>) ThemeDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53892jk, str);
        intent.putExtra(InterfaceC1357q.f53862dxef, str2);
        intent.putExtra(InterfaceC1357q.f53863e5, str3);
        intent.putExtra(InterfaceC1357q.f53860dd, bool);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        f16223k.o1t(intent, context, fragment, str4);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        return intent;
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @l05.qrj
    public static final Intent kja0(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        return cdj(activity, str, null, 4, null);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent ld6(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setClassName(bf2.toq.toq().getPackageName(), ThemeSearchActivity.class.getName());
        intent.putExtra(InterfaceC1357q.f53866eqxt, str2);
        intent.putExtra("REQUEST_RESOURCE_CODE", str);
        intent.setFlags(536870912);
        return intent;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent mcp(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n List<? extends Resource> list, @InterfaceC7395n String str) {
        ArrayList arrayList = new ArrayList();
        C0004k c0004k = new C0004k();
        Intent intent = new Intent(activityC0891q, (Class<?>) WallpaperDetailActivity.class);
        kotlin.jvm.internal.d2ok.qrj(list);
        c0004k.addAll(list);
        arrayList.add(c0004k);
        C2082k.zy().qrj(arrayList);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra(InterfaceC1357q.f53875ga, str);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        return intent;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: n */
    public static final Intent m9543n(@InterfaceC7396q Context context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        Intent forwardLocalIntent = RecommendItemResolver.getForwardLocalIntent("theme");
        forwardLocalIntent.putExtra(InterfaceC1357q.f53866eqxt, context.getResources().getString(R.string.present_local_themes));
        kotlin.jvm.internal.d2ok.qrj(forwardLocalIntent);
        return forwardLocalIntent;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent n7h(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, @InterfaceC7395n String str5, int i2) {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(str);
        Page page = new Page();
        page.setListUrl(com.android.thememanager.controller.online.ld6.y9n(str, -1, str5, str2, str3));
        C6311u c6311u = C6311u.f36447k;
        String str6 = String.format(InterfaceC1925p.kfxm, Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.d2ok.kja0(str6, "format(format, *args)");
        page.setKey(str6);
        page.setTitle(str4);
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        Intent intent = new Intent(context, (Class<?>) AuthorDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53949uv6, 11);
        intent.putExtra(InterfaceC1357q.f53866eqxt, str);
        intent.putExtra("REQUEST_RESOURCE_CODE", p001b.toq.m5744q(str5));
        intent.putExtra(C1669k.f57403toq, i2);
        return intent;
    }

    public static /* synthetic */ boolean ni7(ActivityC0891q activityC0891q, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        return zurt(activityC0891q, str, str2, str3, i2);
    }

    private final void o1t(Intent intent, Context context, Fragment fragment, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strZy = p001b.toq.zy(str);
        kotlin.jvm.internal.d2ok.kja0(strZy, "getComponentCodeByProductType(...)");
        if (TextUtils.isEmpty(strZy)) {
            return;
        }
        String resourceCode = null;
        if (fragment instanceof C1582h) {
            resourceCode = ((C1582h) fragment).bih().getResourceCode();
        } else if (context instanceof com.android.thememanager.activity.kja0) {
            resourceCode = ((com.android.thememanager.activity.kja0) context).etdu().getResourceCode();
        }
        if (kotlin.jvm.internal.d2ok.f7l8(strZy, resourceCode)) {
            return;
        }
        intent.putExtra("REQUEST_RESOURCE_CODE", strZy);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Intent m9544p(ActivityC0891q activityC0891q, String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return m9546s(activityC0891q, str, str2, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: q */
    public static final Intent m9545q(@InterfaceC7396q Context context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        Intent forwardLocalIntent = RecommendItemResolver.getForwardLocalIntent("fonts");
        forwardLocalIntent.putExtra(InterfaceC1357q.f53866eqxt, context.getResources().getString(R.string.present_local_fonts));
        kotlin.jvm.internal.d2ok.qrj(forwardLocalIntent);
        return forwardLocalIntent;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent qrj(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4) {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(str);
        Page page = new Page();
        page.setListUrl(com.android.thememanager.controller.online.ld6.yz(str, -1, str4, str2));
        C6311u c6311u = C6311u.f36447k;
        String str5 = String.format(InterfaceC1925p.kfxm, Arrays.copyOf(new Object[]{str}, 1));
        kotlin.jvm.internal.d2ok.kja0(str5, "format(format, *args)");
        page.setKey(str5);
        page.setTitle(str3);
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        Intent intent = new Intent(context, (Class<?>) ThemeTabActivity.class);
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53949uv6, 0);
        intent.putExtra(InterfaceC1357q.f53866eqxt, str);
        intent.putExtra("REQUEST_RESOURCE_CODE", p001b.toq.m5744q(str4));
        return intent;
    }

    @InterfaceC7395n
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final Intent m9546s(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n String str, @InterfaceC7395n String str2, boolean z2) {
        if (activityC0891q == null) {
            Log.e(f61170toq, "createWidgetDetailIntent failed: activity == null");
            return null;
        }
        Intent intent = new Intent(activityC0891q, (Class<?>) WidgetDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53951v5yj, str);
        intent.putExtra(y9n.f13388v, str2);
        intent.putExtra(jz5.f13283q, z2);
        return intent;
    }

    @l05.qrj
    /* JADX INFO: renamed from: t */
    private static final void m9547t(ActivityC0891q activityC0891q, int i2, List<? extends C0004k<Resource>> list, int i3, Matrix matrix, int i4, boolean z2, int i5, String str, String str2) {
        C2082k.zy().qrj(list);
        Intent intent = new Intent();
        intent.setClassName(activityC0891q, WallpaperDetailActivity.class.getName());
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra("REQUEST_RESOURCE_CODE", "wallpaper");
        intent.putExtra(InterfaceC1357q.f53840a5id, i4);
        intent.putExtra(InterfaceC1357q.f53965y2, i3);
        intent.putExtra(InterfaceC1357q.f53929pc, str);
        intent.putExtra(InterfaceC1357q.f53887ij, str2);
        intent.putExtra(InterfaceC1357q.f53930pjz9, i5);
        intent.putExtra(InterfaceC1357q.f53918ngy, z2);
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            intent.putExtra(InterfaceC1357q.f46174do, fArr);
        }
        if (activityC0891q instanceof WallpaperSubjectActivity) {
            WallpaperSubjectActivity wallpaperSubjectActivity = (WallpaperSubjectActivity) activityC0891q;
            intent.putExtra(InterfaceC1357q.f53875ga, wallpaperSubjectActivity.yz());
            intent.putExtra(InterfaceC1357q.f53881h4b, wallpaperSubjectActivity.wlev());
            intent.putExtra(InterfaceC1357q.f53958wlev, wallpaperSubjectActivity.bd);
        }
        activityC0891q.startActivityForResult(intent, 1);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent t8r(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n Fragment fragment, @InterfaceC7395n ArrayList<C0005q<String, String>> arrayList, int i2, @InterfaceC7395n String str, @InterfaceC7395n Boolean bool, @InterfaceC7395n String str2) {
        Intent intent = new Intent(activityC0891q, (Class<?>) ThemeDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53841a9, arrayList);
        intent.putExtra(InterfaceC1357q.f53872fti, i2);
        intent.putExtra(InterfaceC1357q.f53862dxef, str);
        intent.putExtra(InterfaceC1357q.f53860dd, bool);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        f16223k.o1t(intent, activityC0891q, fragment, str2);
        return intent;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent toq(@InterfaceC7395n Context context, @InterfaceC7395n String str) {
        Intent intent = new Intent(context, (Class<?>) ThemeResourceProxyTabActivity.class);
        intent.putExtra("EXTRA_TAB_ID", str);
        return intent;
    }

    @InterfaceC7395n
    @l05.qrj
    public static final Intent wvg(@InterfaceC7396q Fragment fragment, @InterfaceC7395n Intent intent, int i2, @InterfaceC7395n String str, @InterfaceC7395n ArrayList<ResolveInfo> arrayList) {
        kotlin.jvm.internal.d2ok.m23075h(fragment, "fragment");
        ActivityC0891q activity = fragment.getActivity();
        if (!C1819o.eqxt(activity)) {
            return null;
        }
        Intent intent2 = new Intent(activity, (Class<?>) ThirdPartyPickersActivity.class);
        intent2.setAction("android.intent.action.MAIN");
        intent2.putExtra("android.intent.extra.INTENT", intent);
        intent2.putExtra(ThirdPartyPickersActivity.f8901q, str);
        intent2.putParcelableArrayListExtra("extra_resolve_info_list", arrayList);
        fragment.startActivityForResult(intent2, i2);
        if (!com.android.thememanager.basemodule.utils.o1t.n7h()) {
            kotlin.jvm.internal.d2ok.qrj(activity);
            activity.overridePendingTransition(R.anim.push_up_in, android.R.anim.fade_out);
        }
        return intent2;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final C0004k<Resource> x2(@InterfaceC7396q List<? extends UIProduct> dataSet, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dataSet, "dataSet");
        if (com.android.thememanager.basemodule.utils.y9n.mcp(dataSet)) {
            return new C0004k<>();
        }
        int size = dataSet.size();
        C0004k<Resource> c0004k = new C0004k<>();
        int i3 = 0;
        while (i3 < size) {
            boolean z2 = i2 < 0 || i2 == i3;
            Resource resource = null;
            UIProduct uIProduct = dataSet.get(i3);
            if (uIProduct != null) {
                resource = new Resource();
                String str = uIProduct.name;
                String str2 = uIProduct.uuid;
                String str3 = uIProduct.imageUrl;
                String str4 = uIProduct.originalImageUrl;
                resource.setOnlineId(str2);
                resource.getOnlineInfo().setTitle(str);
                resource.getOnlineInfo().setTrackId(uIProduct.trackId);
                resource.setProductId(uIProduct.productUuid);
                resource.setWallpaperGalleryTypeAndId(uIProduct.wallpaperGalleryType, uIProduct.wallpaperGalleryTypeId);
                uc.fn3e(resource, str3, str4, z2);
            }
            c0004k.add(resource);
            i3++;
        }
        return c0004k;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final Intent m9548y(@InterfaceC7395n ActivityC0891q activityC0891q, int i2, @InterfaceC7395n List<? extends UIProduct> list, int i3, int i4, @InterfaceC7395n String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2320q.d3(list, i2));
        C2082k.zy().qrj(arrayList);
        Intent intent = new Intent();
        kotlin.jvm.internal.d2ok.qrj(activityC0891q);
        intent.setClassName(activityC0891q, WallpaperDetailActivity.class.getName());
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra("REQUEST_RESOURCE_CODE", "wallpaper");
        intent.putExtra(InterfaceC1357q.f53840a5id, i3);
        intent.putExtra(InterfaceC1357q.f53930pjz9, i4);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        intent.putExtra(InterfaceC1357q.f53929pc, str);
        return intent;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m9549z(ActivityC0891q activityC0891q, String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return fu4(activityC0891q, str, str2, z2);
    }

    @InterfaceC6768s
    @l05.qrj
    public static final boolean zurt(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        Intent intentN7h = n7h(activity, str3, str, str2, "", InterfaceC1789q.q68, i2);
        boolean z2 = intentN7h.resolveActivity(activity.getPackageManager()) != null;
        if (z2) {
            activity.startActivity(intentN7h);
        } else {
            Log.e(f61170toq, "navigationToDesignerDetail failed: intent not resolved.");
        }
        return z2;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent zy(@InterfaceC7396q String localId) {
        kotlin.jvm.internal.d2ok.m23075h(localId, "localId");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + localId));
        intent.putExtra("REQUEST_RESOURCE_CODE", "fonts");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra(InterfaceC1357q.f53965y2, 1);
        return intent;
    }
}
