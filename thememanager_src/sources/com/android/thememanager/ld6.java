package com.android.thememanager;

import android.app.Activity;
import android.view.View;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.comment.util.C1880n;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.router.detail.callback.StartCommentEditActivityListener;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import gyi.C6068k;
import java.util.List;
import java.util.Map;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DetailServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ld6 f12320k = new ld6();

    private ld6() {
    }

    @l05.qrj
    public static final void f7l8(@InterfaceC7395n View view, @InterfaceC7395n ResourceCommentItem resourceCommentItem, @InterfaceC7395n ResourceInfo resourceInfo) {
        C1880n.m7417k(view, resourceCommentItem, resourceInfo);
    }

    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8008g() {
    }

    @l05.qrj
    /* JADX INFO: renamed from: k */
    public static final void m8009k(@InterfaceC7395n List<String> list) {
        C1976k.m7741y().m7742g(list);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m8010n() {
        return C6068k.m22357y();
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: q */
    public static final Map<String, String> m8011q() {
        Map<String, String> mapLd6 = C1976k.m7741y().ld6();
        kotlin.jvm.internal.d2ok.kja0(mapLd6, "getReplenishResources(...)");
        return mapLd6;
    }

    @l05.qrj
    public static final void toq() {
        C6068k.m22354k(C6068k.f35060p);
    }

    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final void m8012y(@InterfaceC7395n Activity activity, @InterfaceC7395n Resource resource, @InterfaceC7395n StartCommentEditActivityListener startCommentEditActivityListener) {
        com.android.thememanager.comment.util.zy.m7428n(activity, resource, startCommentEditActivityListener);
    }

    @l05.qrj
    public static final int zy() {
        return C1976k.m7741y().m7744s();
    }
}
