package com.android.thememanager.recommend.view;

import a98o.C0005q;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.C2307p;
import com.android.thememanager.activity.LargeIconAllActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.settings.personalize.x2;
import java.io.File;
import java.util.ArrayList;
import p001b.InterfaceC1357q;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.n */
/* JADX INFO: compiled from: ItemResourceHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2451n {

    /* JADX INFO: renamed from: k */
    private static final String f14448k = "ItemResourceHelper";

    /* JADX INFO: renamed from: q */
    private static final String f14449q = "theme";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60725toq = "|";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60726zy = "\\|";

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.n$toq */
    /* JADX INFO: compiled from: ItemResourceHelper.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f60727f7l8;

        /* JADX INFO: renamed from: g */
        boolean f14450g;

        /* JADX INFO: renamed from: k */
        int f14451k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        boolean f60728ld6;

        /* JADX INFO: renamed from: n */
        boolean f14452n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        String f60729n7h;

        /* JADX INFO: renamed from: p */
        boolean f14453p;

        /* JADX INFO: renamed from: q */
        String f14454q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        String f60730qrj;

        /* JADX INFO: renamed from: s */
        boolean f14455s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f60731toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        int f60732x2;

        /* JADX INFO: renamed from: y */
        String f14456y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f60733zy;

        public toq f7l8(boolean isSettingPage) {
            this.f14453p = isSettingPage;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m8804g(boolean isPicker) {
            this.f14455s = isPicker;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public toq m8805k(boolean autojumpCommentEdit) {
            this.f14450g = autojumpCommentEdit;
            return this;
        }

        public toq ld6(String productUuid) {
            this.f60730qrj = productUuid;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m8806n(boolean isGrid) {
            this.f60728ld6 = isGrid;
            return this;
        }

        public toq n7h(boolean isStartWithHomePage) {
            this.f14452n = isStartWithHomePage;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m8807p(int productIndex) {
            this.f14451k = productIndex;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public void m8808q(boolean isFromClickTag) {
            this.f60727f7l8 = isFromClickTag;
        }

        public toq qrj(int ringtoneFlag) {
            this.f60732x2 = ringtoneFlag;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m8809s(String preRef) {
            this.f60729n7h = preRef;
            return this;
        }

        public toq toq(String category) {
            this.f60733zy = category;
            return this;
        }

        public toq x2(String resCode) {
            this.f14456y = resCode;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m8810y(String pendingThumbnail) {
            this.f14454q = pendingThumbnail;
            return this;
        }

        public toq zy(String entryType) {
            this.f60731toq = entryType;
            return this;
        }

        private toq() {
            this.f60729n7h = null;
        }
    }

    public static void f7l8(ActivityC0891q activity, Fragment fragment, UILink link) {
        m8803y(activity, fragment, link, m8797g());
    }

    /* JADX INFO: renamed from: g */
    public static toq m8797g() {
        return new toq().zy("thememanager");
    }

    /* JADX INFO: renamed from: k */
    private static Intent m8798k(Context context, @lvui String link) {
        String[] strArrSplit = link.split(f60726zy);
        Intent intentZy = x9kr.zy(strArrSplit[0]);
        return (strArrSplit.length <= 1 || a9.qrj(context, intentZy).size() != 0) ? intentZy : x9kr.zy(strArrSplit[1]);
    }

    public static void kja0(ActivityC0891q activity, int index, String entryType, String uuid, String passTrackId, boolean isSubject, String pendingThumbnail) {
        if (TextUtils.isEmpty(uuid)) {
            return;
        }
        activity.startActivityForResult(com.android.thememanager.toq.fti(activity, index, entryType, uuid, passTrackId, isSubject, pendingThumbnail), 1);
    }

    public static void ld6(final ActivityC0891q activity, Fragment fragment, UIProduct product) {
        Intent intentKi = com.android.thememanager.toq.ki(activity, fragment, product.uuid, product.imageUrl, product.trackId, Boolean.FALSE, product.productType);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intentKi);
        }
        activity.startActivityFromFragment(fragment, intentKi, 1);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m8799n(UILink link) {
        if (link == null) {
            return false;
        }
        String str = link.type;
        return "UI_PAGE".equals(str) || "SEARCH".equals(str) || ("SUBJECT".equals(str) && !"WALLPAPER".equals(link.productType));
    }

    public static void n7h(ActivityC0891q activity, Fragment fragment, UIProduct itemProduct, boolean swipe) {
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.name = itemProduct.name;
        videoInfo.previewPath = itemProduct.videoUrl;
        videoInfo.path = itemProduct.downloadUrl;
        videoInfo.trackId = itemProduct.trackId;
        videoInfo.onlineId = itemProduct.uuid;
        videoInfo.productId = itemProduct.productUuid;
        videoInfo.sizeBytes = itemProduct.fileSizeInKB;
        videoInfo.thumbnail = itemProduct.imageUrl;
        videoInfo.innerTags = itemProduct.innerTags;
        qrj(activity, fragment, videoInfo, swipe);
    }

    /* JADX INFO: renamed from: p */
    public static void m8800p(ActivityC0891q activity) {
        String str = com.android.thememanager.basemodule.analysis.toq.pb;
        try {
            activity.startActivity(x2.m9126k(x2.f60842zy));
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.i0, com.android.thememanager.basemodule.analysis.toq.pb);
            if (o1t.m7171i()) {
                str = com.android.thememanager.basemodule.analysis.toq.u3gu;
            }
            C1708s.f7l8().ld6().ni7(C1706p.n7h("personalize", str, arrayMapM6679k));
        } catch (Exception e2) {
            C7794k.m28198s(f14448k, "startLockScreenEditor error: ", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static Resource m8801q(UIProduct uiProduct, boolean withLocal) {
        UILink uILink;
        UILink uILink2;
        if (uiProduct == null) {
            return null;
        }
        Resource resource = new Resource();
        String str = uiProduct.name;
        if (TextUtils.isEmpty(str)) {
            str = uiProduct.title;
            if (TextUtils.isEmpty(str) && (uILink2 = uiProduct.link) != null) {
                str = uILink2.title;
            }
        }
        String str2 = uiProduct.trackId;
        if (TextUtils.isEmpty(str2) && (uILink = uiProduct.link) != null) {
            str2 = uILink.trackId;
        }
        resource.setOnlineId(uiProduct.uuid);
        resource.getOnlineInfo().setTitle(str);
        resource.getOnlineInfo().setTrackId(str2);
        resource.setProductId(uiProduct.productUuid);
        resource.setWallpaperGalleryTypeAndId(uiProduct.wallpaperGalleryType, uiProduct.wallpaperGalleryTypeId);
        String str3 = uiProduct.imageUrl;
        toq(resource, str3, str3, withLocal);
        return resource;
    }

    public static void qrj(ActivityC0891q activity, Fragment fragment, VideoInfo videoInfo, boolean swipe) {
        Intent qVar = C2307p.toq(activity, videoInfo, swipe);
        if (fragment == null) {
            activity.startActivity(qVar);
        } else {
            activity.startActivityFromFragment(fragment, qVar, -1);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8802s(ActivityC0891q activity, Fragment fragment, UILink link, RecommendListViewAdapter adapter) {
        toq toqVarM8797g = m8797g();
        toqVarM8797g.x2(adapter.lvui());
        toqVarM8797g.m8804g(adapter.m8549l());
        toqVarM8797g.f7l8(adapter.n5r1());
        toqVarM8797g.qrj(adapter.m8551r());
        m8803y(activity, fragment, link, toqVarM8797g);
    }

    public static void toq(Resource r2, String thumbnailPath, String previewPath, boolean withLocal) {
        if (!TextUtils.isEmpty(thumbnailPath)) {
            ArrayList arrayList = new ArrayList();
            PathEntry pathEntry = new PathEntry();
            pathEntry.setOnlinePath(thumbnailPath);
            if (withLocal) {
                File fileQrj = com.android.thememanager.basemodule.imageloader.x2.qrj(thumbnailPath);
                if (fileQrj != null) {
                    pathEntry.setLocalPath(fileQrj.getPath());
                } else {
                    pathEntry.setLocalPath(null);
                }
            }
            arrayList.add(pathEntry);
            r2.setThumbnails(arrayList);
        }
        if (TextUtils.isEmpty(previewPath)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        PathEntry pathEntry2 = new PathEntry();
        pathEntry2.setOnlinePath(previewPath);
        if (withLocal) {
            File fileQrj2 = com.android.thememanager.basemodule.imageloader.x2.qrj(previewPath);
            if (fileQrj2 != null) {
                pathEntry2.setLocalPath(fileQrj2.getPath());
            } else {
                pathEntry2.setLocalPath(null);
            }
        }
        arrayList2.add(pathEntry2);
        r2.setPreviews(arrayList2);
    }

    public static void x2(final ActivityC0891q activity, Fragment fragment, ArrayList<C0005q<String, String>> ids, int index, String pendingThumbnail, String productType) {
        Intent intentT8r = com.android.thememanager.toq.t8r(activity, fragment, ids, index, pendingThumbnail, Boolean.FALSE, productType);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intentT8r);
        }
        activity.startActivityForResult(intentT8r, 1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0181 -> B:75:0x019d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: y */
    public static void m8803y(ActivityC0891q activityC0891q, Fragment fragment, UILink uILink, @lvui toq toqVar) {
        String strM28200g;
        if (uILink == null || TextUtils.isEmpty(uILink.link)) {
            Log.w(f14448k, "resolveUILinkIntent: link is unValid");
            return;
        }
        String str = uILink.type;
        if ("NONE".equals(str)) {
            return;
        }
        Intent intentM9546s = null;
        String str2 = null;
        if ("EXTERNAL_HREF".equals(str)) {
            intentM9546s = m8798k(activityC0891q, uILink.link);
        } else if ("HREF".equals(str)) {
            if (uILink.link.startsWith("theme")) {
                Uri uri = Uri.parse(uILink.link);
                intentM9546s = new Intent("android.intent.action.VIEW");
                intentM9546s.setData(uri);
                if (C1807g.zurt()) {
                    intentM9546s.setPackage(bf2.toq.toq().getPackageName());
                }
                if (!TextUtils.isEmpty(uILink.title)) {
                    intentM9546s.putExtra(InterfaceC1357q.f53866eqxt, uILink.title);
                }
            } else {
                intentM9546s = com.android.thememanager.toq.m9541i(activityC0891q, uILink.title, uILink.link);
                intentM9546s.putExtra("REQUEST_RESOURCE_CODE", toqVar.f14456y);
            }
        } else if ("SUBJECT".equals(str) && "WALLPAPER".equals(uILink.productType)) {
            intentM9546s = com.android.thememanager.toq.fti(activityC0891q, toqVar.f14451k, toqVar.f60731toq, uILink.link, uILink.trackId, true, toqVar.f14454q);
        } else if (m8799n(uILink)) {
            String str3 = uILink.title;
            if ("UI_PAGE".equals(str)) {
                strM28200g = z4.toq.m28202n(uILink.link);
                if (InterfaceC1789q.fd23.equals(uILink.productType) && "UI_PAGE".equals(uILink.type) && activityC0891q != null) {
                    activityC0891q.startActivity(LargeIconAllActivity.z4(activityC0891q, uILink.link, uILink.title, false));
                    return;
                }
            } else if ("SEARCH".equals(str)) {
                strM28200g = z4.toq.f7l8(uILink.link, toqVar.f60733zy);
            } else {
                if ("SUBJECT".equals(str)) {
                    strM28200g = z4.toq.m28200g(uILink.link);
                }
                intentM9546s = RecommendActivity.v0af(activityC0891q, str3, str2, toqVar.f14456y, toqVar.f14455s, toqVar.f60727f7l8, toqVar.f60728ld6, toqVar.f60732x2);
            }
            str2 = strM28200g;
            intentM9546s = RecommendActivity.v0af(activityC0891q, str3, str2, toqVar.f14456y, toqVar.f14455s, toqVar.f60727f7l8, toqVar.f60728ld6, toqVar.f60732x2);
        } else if ("PRODUCT_DETAIL".equals(str)) {
            intentM9546s = "WIDGET_SUIT".equals(uILink.productType) ? com.android.thememanager.toq.m9546s(activityC0891q, toqVar.f60730qrj, uILink.trackId, false) : com.android.thememanager.toq.ki(activityC0891q, fragment, uILink.link, toqVar.f14454q, uILink.trackId, Boolean.valueOf(toqVar.f14450g), uILink.productType);
        }
        if (intentM9546s != null) {
            String str4 = toqVar.f60729n7h;
            if (str4 != null) {
                f7l8.zy(intentM9546s, str4);
            }
            try {
                if (toqVar.f14452n) {
                    Intent[] intentArr = {com.android.thememanager.toq.toq(activityC0891q, p001b.toq.zy(uILink.productType)), intentM9546s};
                    if (fragment == null || !(activityC0891q instanceof AbstractActivityC1717k)) {
                        activityC0891q.startActivities(intentArr);
                    } else {
                        ((AbstractActivityC1717k) activityC0891q).qkj8(fragment, intentArr);
                    }
                } else if (fragment != null) {
                    activityC0891q.startActivityFromFragment(fragment, intentM9546s, 1);
                } else {
                    activityC0891q.startActivityForResult(intentM9546s, 1);
                }
            } catch (ActivityNotFoundException e2) {
                C7794k.m28196p(f14448k, "resolveUILinkIntent happens error UILink = " + uILink + ", error = " + e2);
            }
        }
    }

    public static toq zy(RecommendListViewAdapter adapter) {
        toq toqVarM8797g = m8797g();
        toqVarM8797g.x2(adapter.lvui());
        toqVarM8797g.m8804g(adapter.m8549l());
        toqVarM8797g.f7l8(adapter.n5r1());
        toqVarM8797g.qrj(adapter.m8551r());
        return toqVarM8797g;
    }
}
