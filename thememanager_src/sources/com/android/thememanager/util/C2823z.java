package com.android.thememanager.util;

import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UILink;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.util.z */
/* JADX INFO: compiled from: BusinessAdUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2823z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2823z f16914k = new C2823z();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61440toq = "BusinessAdUtil";

    private C2823z() {
    }

    /* JADX INFO: renamed from: k */
    public final void m10094k(@InterfaceC7395n ActivityC0891q activityC0891q, @InterfaceC7395n UICard uICard, @InterfaceC7396q C2451n.toq params) {
        UILink uILink;
        kotlin.jvm.internal.d2ok.m23075h(params, "params");
        if (uICard == null) {
            Log.w(f61440toq, "jumpToActivity: card is null");
            return;
        }
        String str = uICard.packageName;
        Log.w(f61440toq, "jumpToActivity: isAd: " + uICard.isNonStanAd + ", packageName: " + str);
        if (!uICard.isNonStanAd || p029m.zy.toq(str)) {
            C2451n.m8803y(activityC0891q, null, uICard.link, params);
            return;
        }
        if (com.android.thememanager.basemodule.utils.a9.m6999s(str)) {
            uILink = new UILink();
            uILink.type = "EXTERNAL_HREF";
            UILink uILink2 = uICard.link;
            uILink.trackId = uILink2 != null ? uILink2.trackId : null;
            uILink.title = uILink2 != null ? uILink2.title : null;
            uILink.link = uICard.deepLink;
        } else {
            Log.w(f61440toq, "jumpToActivity: not install " + str);
            uILink = uICard.link;
        }
        C2451n.m8803y(activityC0891q, null, uILink, params);
    }
}
