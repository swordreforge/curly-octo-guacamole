package com.android.thememanager;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.comment.view.activity.ResourceCommentsActivity;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.router.detail.entity.VideoInfo;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.p */
/* JADX INFO: compiled from: DetailRouterImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2307p {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2307p f13464k = new C2307p();

    private C2307p() {
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: k */
    public static final Intent m8437k(@InterfaceC7396q Context context, @InterfaceC7396q Resource resource, boolean z2, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        kotlin.jvm.internal.d2ok.m23075h(resource, "resource");
        Intent intentWas = ResourceCommentsActivity.was(context, resource, z2, j2);
        kotlin.jvm.internal.d2ok.kja0(intentWas, "createIntent(...)");
        return intentWas;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent toq(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n VideoInfo videoInfo, boolean z2) {
        return zy(activityC0891q, videoInfo, z2, 3);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent zy(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n VideoInfo videoInfo, boolean z2, int i2) {
        Intent intentZkd = VideoDetailActivity.zkd(activityC0891q, videoInfo, z2, i2);
        kotlin.jvm.internal.d2ok.kja0(intentZkd, "createIntent(...)");
        return intentZkd;
    }
}
