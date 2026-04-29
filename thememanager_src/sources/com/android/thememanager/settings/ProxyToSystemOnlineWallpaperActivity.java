package com.android.thememanager.settings;

import a98o.C0004k;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.settings.C2532p;
import com.android.thememanager.v9.f7l8;
import com.android.thememanager.v9.model.UIImageWithLink;
import com.android.thememanager.v9.model.UILink;
import com.google.gson.C4871g;
import com.google.gson.reflect.C4922k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyToSystemOnlineWallpaperActivity extends com.android.thememanager.activity.kja0 {

    /* JADX INFO: renamed from: c */
    private static final String f14925c = "SystemOnlineWallpaper";

    /* JADX INFO: renamed from: e */
    private static final String f14926e = "id";

    /* JADX INFO: renamed from: j */
    private static final String f14927j = "wallpaper_data_list";

    /* JADX INFO: renamed from: o */
    private static final String f14928o = "page_id";

    /* JADX INFO: renamed from: com.android.thememanager.settings.ProxyToSystemOnlineWallpaperActivity$k */
    class C2505k extends C4922k<ArrayList<UIImageWithLink>> {
        C2505k() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void cfr(String id, String dataList, String pageId) {
        if (TextUtils.isEmpty(id) || TextUtils.isEmpty(dataList)) {
            Log.w(f14925c, "id == null || data_list == null");
            return;
        }
        ArrayList<UIImageWithLink> arrayList = (ArrayList) new C4871g().kja0(dataList, new C2505k().getType());
        if (arrayList == null || arrayList.size() == 0) {
            Log.w(f14925c, "UIImageWithLink data_list == null");
            return;
        }
        C0004k c0004k = new C0004k();
        List<C0004k<Resource>> listSingletonList = Collections.singletonList(c0004k);
        UIImageWithLink uIImageWithLink = null;
        for (UIImageWithLink uIImageWithLink2 : arrayList) {
            Resource resourceM10169q = com.android.thememanager.v9.f7l8.m10169q(uIImageWithLink2, false);
            if (resourceM10169q != null && "PRODUCT_DETAIL".equals(uIImageWithLink2.link.type) && "wallpaper".equalsIgnoreCase(uIImageWithLink2.link.productType)) {
                c0004k.add(resourceM10169q);
            }
            C2532p.k kVarM9038q = C2532p.toq().m9038q(uIImageWithLink2.imageUrl);
            if (kVarM9038q != null) {
                resourceM10169q.setWallpaperGalleryTypeAndId(kVarM9038q.f15165k, kVarM9038q.f60802toq);
            }
            if (id.equals(uIImageWithLink2.link.link)) {
                uIImageWithLink = uIImageWithLink2;
            }
        }
        if (uIImageWithLink == null) {
            Log.w(f14925c, "UIImageWithLink == null");
            return;
        }
        if (!"PRODUCT_DETAIL".equals(uIImageWithLink.link.type) || !"wallpaper".equalsIgnoreCase(uIImageWithLink.link.productType)) {
            f7l8.toq toqVarM10170s = com.android.thememanager.v9.f7l8.m10170s();
            toqVarM10170s.m10172g(uIImageWithLink.index);
            toqVarM10170s.m10174n(uIImageWithLink.imageUrl);
            toqVarM10170s.toq(uIImageWithLink.link.productType);
            com.android.thememanager.v9.f7l8.ld6(this, null, uIImageWithLink.link, toqVarM10170s);
            UILink uILink = uIImageWithLink.link;
            if (uILink != null) {
                com.android.thememanager.basemodule.analysis.kja0.f7l8(pageId, uILink.trackId, com.android.thememanager.basemodule.analysis.toq.nr0);
                C1708s.f7l8().ld6().ni7(C1706p.kja0(pageId, uIImageWithLink.link.trackId, com.android.thememanager.basemodule.analysis.toq.nr0));
                return;
            }
            return;
        }
        UILink uILink2 = uIImageWithLink.link;
        int i2 = 0;
        while (true) {
            if (i2 >= c0004k.size()) {
                i2 = -1;
                break;
            }
            String onlineId = ((Resource) c0004k.get(i2)).getOnlineId();
            if (!TextUtils.isEmpty(onlineId) && onlineId.equals(uILink2.link)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        C2082k.zy().qrj(listSingletonList);
        Intent intent = new Intent(this, (Class<?>) WallpaperDetailActivity.class);
        intent.putExtra(InterfaceC1357q.f53879gvn7, i2);
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra(InterfaceC1357q.f53965y2, 2);
        startActivityForResult(intent, 109);
        com.android.thememanager.basemodule.analysis.kja0.f7l8(pageId, uIImageWithLink.link.trackId, com.android.thememanager.basemodule.analysis.toq.nr0);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(pageId, uIImageWithLink.link.trackId, com.android.thememanager.basemodule.analysis.toq.nr0));
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null) {
            cfr(intent.getStringExtra("id"), intent.getStringExtra(f14927j), intent.getStringExtra(f14928o));
        }
        finish();
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }
}
