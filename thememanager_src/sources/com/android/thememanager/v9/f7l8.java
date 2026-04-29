package com.android.thememanager.v9;

import a98o.C0004k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.C2307p;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.fti;
import com.android.thememanager.util.uc;
import com.android.thememanager.v9.model.UIImageWithLink;
import com.android.thememanager.v9.model.UILink;
import com.android.thememanager.v9.model.UIProduct;
import java.util.ArrayList;
import java.util.List;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: compiled from: ItemResourceHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements InterfaceC1357q, InterfaceC1789q, InterfaceC1925p {

    /* JADX INFO: renamed from: k */
    private static final String f17094k = "http://app.xiaomi.com/details?id=%s&back=true&ref=thememanager&startDownload=%s";

    /* JADX INFO: renamed from: n */
    private static final String f17095n = "\\|";

    /* JADX INFO: renamed from: q */
    private static final String f17096q = "|";

    /* JADX INFO: compiled from: ItemResourceHelper.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f61472f7l8;

        /* JADX INFO: renamed from: g */
        boolean f17097g;

        /* JADX INFO: renamed from: k */
        int f17098k;

        /* JADX INFO: renamed from: n */
        boolean f17099n;

        /* JADX INFO: renamed from: q */
        String f17100q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f61473toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f61474zy;

        public toq f7l8(boolean isStartWithHomePage) {
            this.f17099n = isStartWithHomePage;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m10172g(int productIndex) {
            this.f17098k = productIndex;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public toq m10173k(boolean autojumpCommentEdit) {
            this.f17097g = autojumpCommentEdit;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m10174n(String pendingThumbnail) {
            this.f17100q = pendingThumbnail;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public void m10175q(boolean isFromClickTag) {
            this.f61472f7l8 = isFromClickTag;
        }

        public toq toq(String category) {
            this.f61474zy = category;
            return this;
        }

        public toq zy(String entryType) {
            this.f61473toq = entryType;
            return this;
        }

        private toq() {
        }
    }

    public static void cdj(ActivityC0891q activity, Resource resource) {
        activity.startActivity(com.android.thememanager.toq.m9539g(activity, resource, false));
    }

    public static void f7l8(ActivityC0891q activity, String uri) {
        if (uri == null) {
            nn86.m7150k(R.string.card_data_request_error, 0);
            return;
        }
        if (activity == null) {
            Log.w(C2755a.f16307g, "gotoCommunityActivityCompat: activity is invalid");
            return;
        }
        if (!fti.zy()) {
            nn86.m7150k(R.string.update_community_tip, 1);
            m10164h(activity, a9.f10267n, false);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            intent.setPackage(a9.f10267n);
            intent.addFlags(268435456);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.e(C2755a.f16307g, "gotoCommunityActivityCompat happens error, Version = " + fti.m9734k());
        }
    }

    public static void fn3e(ActivityC0891q activity, String path) {
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.previewPath = path;
        videoInfo.path = path;
        videoInfo.sizeBytes = -1L;
        m10165i(activity, null, videoInfo, false);
    }

    /* JADX INFO: renamed from: g */
    public static Intent m10163g(ActivityC0891q activity, int index, String entryType, String uuid, String passTrackId, boolean isSubject, String pendingThumbnail) {
        Intent intent = new Intent(activity, (Class<?>) WallpaperSubjectActivity.class);
        intent.putExtra("uuid", uuid);
        intent.putExtra(InterfaceC1925p.a95z, isSubject);
        intent.putExtra(InterfaceC1925p.byb3, isSubject ? Math.max(index - 1, 0) : 0);
        com.android.thememanager.basemodule.analysis.f7l8.toq(intent, entryType);
        intent.putExtra(InterfaceC1357q.f53863e5, passTrackId);
        intent.putExtra(InterfaceC1357q.f53862dxef, pendingThumbnail);
        return intent;
    }

    /* JADX INFO: renamed from: h */
    public static void m10164h(ActivityC0891q activity, String packName, boolean startDownload) {
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(f17094k, packName, Boolean.valueOf(startDownload)))));
    }

    /* JADX INFO: renamed from: i */
    public static void m10165i(ActivityC0891q activity, Fragment fragment, VideoInfo videoInfo, boolean swipe) {
        Intent intentZy = C2307p.zy(activity, videoInfo, swipe, (activity == null || !p001b.f7l8.f53794le7.equals(activity.getIntent().getAction())) ? 3 : 2);
        if (fragment == null) {
            activity.startActivity(intentZy);
        } else {
            activity.startActivityFromFragment(fragment, intentZy, -1);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m10166k(@lvui String link) {
        String[] strArrSplit = link.split(f17095n);
        Intent intentZy = x9kr.zy(strArrSplit[0]);
        return (strArrSplit.length <= 1 || y9n.m7244c(intentZy).size() != 0) ? intentZy : x9kr.zy(strArrSplit[1]);
    }

    public static void ki(final ActivityC0891q activity, Fragment fragment, String id) {
        Intent intent = new Intent(activity, (Class<?>) ThemeDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53892jk, id);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        activity.startActivityFromFragment(fragment, intent, 1);
    }

    public static void kja0(final Context context, String localId, boolean applyImediately, boolean newTask) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + localId));
        intent.putExtra("REQUEST_RESOURCE_CODE", "theme");
        intent.addCategory("android.intent.category.DEFAULT");
        if (newTask) {
            intent.addFlags(335544320);
        }
        intent.putExtra(InterfaceC1357q.f53965y2, 1);
        intent.putExtra(InterfaceC1357q.f53963x9kr, applyImediately);
        context.startActivity(intent);
    }

    public static void ld6(ActivityC0891q activityC0891q, Fragment fragment, UILink uILink, @lvui toq toqVar) {
        String strM28200g;
        if (uILink == null || TextUtils.isEmpty(uILink.link)) {
            return;
        }
        String str = uILink.type;
        if ("NONE".equals(str)) {
            return;
        }
        Intent intent = null;
        intent = null;
        String str2 = null;
        if ("EXTERNAL_HREF".equals(str)) {
            intent = m10166k(uILink.link);
        } else if ("HREF".equals(str)) {
            if (uILink.link.startsWith("theme")) {
                Uri uri = Uri.parse(uILink.link);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent = intent2;
            } else {
                Intent intent3 = new Intent(activityC0891q, (Class<?>) ThemeTabActivity.class);
                ArrayList arrayList = new ArrayList();
                PageGroup pageGroup = new PageGroup();
                pageGroup.setTitle(uILink.title);
                pageGroup.setUrl(uILink.link);
                pageGroup.setPageGroupType(1);
                arrayList.add(pageGroup);
                intent3.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
                intent = intent3;
            }
            if (!TextUtils.isEmpty(uILink.title)) {
                intent.putExtra(InterfaceC1357q.f53866eqxt, uILink.title);
            }
        } else if ("SUBJECT".equals(str) && "WALLPAPER".equals(uILink.productType)) {
            zurt(activityC0891q, toqVar.f17098k, toqVar.f61473toq, uILink.link, uILink.trackId, true, toqVar.f17100q);
        } else if (m10171y(uILink)) {
            String str3 = uILink.title;
            if ("UI_PAGE".equals(str)) {
                strM28200g = z4.toq.m28202n(uILink.link);
            } else if ("SEARCH".equals(str)) {
                strM28200g = z4.toq.f7l8(uILink.link, toqVar.f61474zy);
            } else {
                if ("SUBJECT".equals(str)) {
                    strM28200g = z4.toq.m28200g(uILink.link);
                }
                intent = RecommendActivity.i9jn(activityC0891q, str3, str2, ((com.android.thememanager.activity.kja0) activityC0891q).etdu().getResourceCode(), false, toqVar.f61472f7l8);
            }
            str2 = strM28200g;
            intent = RecommendActivity.i9jn(activityC0891q, str3, str2, ((com.android.thememanager.activity.kja0) activityC0891q).etdu().getResourceCode(), false, toqVar.f61472f7l8);
        } else if ("PRODUCT_DETAIL".equals(str)) {
            intent = new Intent(activityC0891q, (Class<?>) ThemeDetailActivity.class);
            intent.putExtra(InterfaceC1357q.f53892jk, uILink.link);
            intent.putExtra(InterfaceC1357q.f53862dxef, toqVar.f17100q);
            intent.putExtra(InterfaceC1357q.f53863e5, uILink.trackId);
            intent.putExtra(InterfaceC1357q.f53860dd, toqVar.f17097g);
            intent.putExtra(InterfaceC1357q.f53965y2, 2);
            x2(intent, activityC0891q, fragment, uILink.productType);
        }
        if (intent != null) {
            com.android.thememanager.fu4 fu4VarA98o = ch.a98o(activityC0891q);
            if (fu4VarA98o != null) {
                try {
                    if (fu4VarA98o.isPicker() && bwp.jk(fu4VarA98o.getResourceCode())) {
                        activityC0891q.startActivityForResult(intent, 105);
                        return;
                    }
                } catch (ActivityNotFoundException e2) {
                    Log.w(f7l8.class.getSimpleName(), "resolveUILinkIntent happens error UILink = " + uILink + ", error = " + e2);
                    return;
                }
            }
            if (!toqVar.f17099n) {
                if (fragment != null) {
                    activityC0891q.startActivityFromFragment(fragment, intent, 1);
                    return;
                } else {
                    activityC0891q.startActivityForResult(intent, 1);
                    return;
                }
            }
            Intent intent4 = new Intent();
            intent4.setAction(ThemeResourceProxyTabActivity.bl);
            intent4.setPackage(bf2.toq.toq().getPackageName());
            String str4 = uILink.productType;
            if (str4 != null) {
                intent4.putExtra("EXTRA_TAB_ID", p001b.toq.zy(str4));
            }
            Intent[] intentArr = {intent4, intent};
            if (activityC0891q instanceof com.android.thememanager.activity.kja0) {
                ((com.android.thememanager.activity.kja0) activityC0891q).qkj8(fragment, intentArr);
            } else {
                activityC0891q.startActivities(intentArr);
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static C0004k<Resource> m10167n(List<UIProduct> dataSet, int curIndex) {
        int size = dataSet.size();
        if (size == 0) {
            return new C0004k<>();
        }
        C0004k<Resource> c0004k = new C0004k<>();
        int i2 = 0;
        while (i2 < size) {
            c0004k.add(zy(dataSet.get(i2), curIndex < 0 || curIndex == i2));
            i2++;
        }
        return c0004k;
    }

    public static void n7h(final Context context, String localId, boolean applyImediately) {
        kja0(context, localId, applyImediately, true);
    }

    public static void ni7(ActivityC0891q activity, int index, String entryType, String uuid, boolean isSubject) {
        zurt(activity, index, entryType, uuid, null, isSubject, null);
    }

    /* JADX INFO: renamed from: p */
    public static void m10168p(ActivityC0891q activity, Fragment fragment, UILink link) {
        ld6(activity, fragment, link, m10170s());
    }

    /* JADX INFO: renamed from: q */
    public static Resource m10169q(UIImageWithLink imageWithLink, boolean withLocal) {
        UILink uILink;
        if (imageWithLink == null || (uILink = imageWithLink.link) == null) {
            return null;
        }
        Resource resource = new Resource();
        String str = uILink.title;
        String str2 = uILink.link;
        String str3 = imageWithLink.imageUrl;
        resource.setOnlineId(str2);
        resource.getOnlineInfo().setTitle(str);
        resource.getOnlineInfo().setTrackId(uILink.trackId);
        resource.setProductId(imageWithLink.productUuid);
        resource.setWallpaperGalleryTypeAndId(imageWithLink.wallpaperGalleryType, imageWithLink.wallpaperGalleryTypeId);
        uc.fn3e(resource, str3, str3, withLocal);
        return resource;
    }

    public static void qrj(Context context, String localId, boolean newTask) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(InterfaceC1357q.f53972zkd + localId));
        intent.putExtra("REQUEST_RESOURCE_CODE", "fonts");
        intent.addCategory("android.intent.category.DEFAULT");
        if (newTask) {
            intent.addFlags(335544320);
        }
        intent.putExtra(InterfaceC1357q.f53965y2, 1);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: s */
    public static toq m10170s() {
        return new toq().zy("thememanager");
    }

    public static Intent t8r(ActivityC0891q activity, List<VideoInfo> videoInfo, int index) {
        return VideoDetailActivity.bz2(activity, videoInfo, index, 3);
    }

    public static UILink toq(String link, String productType, String type, String title, String adTagId, String trackId) {
        UILink uILink = new UILink();
        uILink.link = link;
        uILink.productType = productType;
        uILink.type = type;
        uILink.title = title;
        uILink.adTagId = adTagId;
        uILink.trackId = trackId;
        return uILink;
    }

    private static void x2(Intent intent, ActivityC0891q activity, Fragment fragment, String productType) {
        if (TextUtils.isEmpty(productType)) {
            return;
        }
        String strZy = p001b.toq.zy(productType);
        if (TextUtils.isEmpty(strZy)) {
            return;
        }
        String resourceCode = null;
        if (fragment instanceof C1582h) {
            resourceCode = ((C1582h) fragment).bih().getResourceCode();
        } else if (activity instanceof com.android.thememanager.activity.kja0) {
            resourceCode = ((com.android.thememanager.activity.kja0) activity).etdu().getResourceCode();
        }
        if (strZy.equals(resourceCode)) {
            return;
        }
        intent.putExtra("REQUEST_RESOURCE_CODE", strZy);
    }

    /* JADX INFO: renamed from: y */
    private static boolean m10171y(UILink link) {
        if (link == null) {
            return false;
        }
        String str = link.type;
        return "UI_PAGE".equals(str) || "SEARCH".equals(str) || ("SUBJECT".equals(str) && !"WALLPAPER".equals(link.productType));
    }

    public static void zurt(ActivityC0891q activity, int index, String entryType, String uuid, String passTrackId, boolean isSubject, String pendingThumbnail) {
        if (TextUtils.isEmpty(uuid)) {
            return;
        }
        activity.startActivityForResult(m10163g(activity, index, entryType, uuid, passTrackId, isSubject, pendingThumbnail), 1);
    }

    private static Resource zy(UIProduct product, boolean withLocal) {
        if (product == null) {
            return null;
        }
        Resource resource = new Resource();
        String str = product.name;
        String str2 = product.uuid;
        String str3 = product.imageUrl;
        String str4 = product.originalImageUrl;
        resource.setOnlineId(str2);
        resource.getOnlineInfo().setTitle(str);
        resource.getOnlineInfo().setTrackId(product.trackId);
        resource.setProductId(product.productUuid);
        resource.setWallpaperGalleryTypeAndId(product.wallpaperGalleryType, product.wallpaperGalleryTypeId);
        resource.setDeviceType(product.deviceType);
        uc.fn3e(resource, str3, str4, withLocal);
        return resource;
    }
}
