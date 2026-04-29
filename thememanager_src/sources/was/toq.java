package was;

import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.resource.model.PostResult;
import com.android.thememanager.mine.follow.model.FollowInterface;
import kotlin.jvm.internal.d2ok;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import retrofit2.InterfaceC7648q;

/* JADX INFO: compiled from: MineServiceImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f45043k = new toq();

    private toq() {
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: k */
    public static final retrofit2.toq<CommonResponse<PostResult>> m28124k(@InterfaceC7396q String onlineId, @InterfaceC7396q String category, @InterfaceC7396q AbstractC1777n<PostResult> callback) {
        d2ok.m23075h(onlineId, "onlineId");
        d2ok.m23075h(category, "category");
        d2ok.m23075h(callback, "callback");
        retrofit2.toq<CommonResponse<PostResult>> toqVarF7l8 = ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).f7l8(onlineId, category);
        toqVarF7l8.mo27954p(callback);
        d2ok.qrj(toqVarF7l8);
        return toqVarF7l8;
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: n */
    public static final retrofit2.toq<EmptyResponse> m28125n(@InterfaceC7395n String str, boolean z2, @InterfaceC7395n String str2, @InterfaceC7396q InterfaceC7648q<EmptyResponse> callback) {
        d2ok.m23075h(callback, "callback");
        retrofit2.toq<EmptyResponse> toqVarFollow = ((FollowInterface) f7l8.m6882h().qrj(FollowInterface.class)).follow(str, z2, str2);
        toqVarFollow.mo27954p(callback);
        d2ok.qrj(toqVarFollow);
        return toqVarFollow;
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: q */
    public static final retrofit2.toq<EmptyResponse> m28126q(@InterfaceC7396q String onlineIds, @InterfaceC7396q AbstractC1770g callback) {
        d2ok.m23075h(onlineIds, "onlineIds");
        d2ok.m23075h(callback, "callback");
        retrofit2.toq<EmptyResponse> toqVarM24735q = ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).m24735q(onlineIds);
        toqVarM24735q.mo27954p(callback);
        d2ok.qrj(toqVarM24735q);
        return toqVarM24735q;
    }

    @InterfaceC7396q
    @qrj
    public static final retrofit2.toq<EmptyResponse> toq(@InterfaceC7396q String onlineId, @InterfaceC7396q AbstractC1770g callback) {
        d2ok.m23075h(onlineId, "onlineId");
        d2ok.m23075h(callback, "callback");
        retrofit2.toq<EmptyResponse> toqVarM24733n = ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).m24733n(onlineId);
        toqVarM24733n.mo27954p(callback);
        d2ok.qrj(toqVarM24733n);
        return toqVarM24733n;
    }

    @InterfaceC7396q
    @qrj
    public static final retrofit2.toq<CommonResponse<PostResult>> zy(@InterfaceC7396q String onlineIds, @InterfaceC7396q String productType, @InterfaceC7396q AbstractC1777n<PostResult> callback) {
        d2ok.m23075h(onlineIds, "onlineIds");
        d2ok.m23075h(productType, "productType");
        d2ok.m23075h(callback, "callback");
        retrofit2.toq<CommonResponse<PostResult>> toqVarM24732k = ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).m24732k(onlineIds, productType);
        toqVarM24732k.mo27954p(callback);
        d2ok.qrj(toqVarM24732k);
        return toqVarM24732k;
    }
}
