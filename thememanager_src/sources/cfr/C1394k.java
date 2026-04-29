package cfr;

import android.content.Context;
import android.content.Intent;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.recommend.view.fragment.f7l8;
import com.android.thememanager.recommend.view.fragment.toq;
import com.android.thememanager.recommend.view.listview.C2367n;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: cfr.k */
/* JADX INFO: compiled from: RecommendRouterImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1394k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1394k f7678k = new C1394k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f55677toq = "EXTRA_TAB_ID";

    private C1394k() {
    }

    @qrj
    /* JADX INFO: renamed from: k */
    public static final Intent m5861k(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, boolean z2, int i2) {
        return RecommendActivity.zsr0(context, str, str2, str3, z2, i2);
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: q */
    public static final C2367n m5862q() {
        return new C2367n();
    }

    @InterfaceC7396q
    @qrj
    public static final toq toq() {
        return new toq();
    }

    @InterfaceC7396q
    @qrj
    public static final f7l8 zy() {
        return new f7l8();
    }
}
