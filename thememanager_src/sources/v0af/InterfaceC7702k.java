package v0af;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.v9.model.AuthorAttentionDyncmicModel;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.ld6;

/* JADX INFO: renamed from: v0af.k */
/* JADX INFO: compiled from: AttentionInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7702k {
    @InterfaceC6030g("safe/auth/social/list/feed")
    @ld6({f7l8.f57592t8r})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<AuthorAttentionDyncmicModel>> m28097k(@InterfaceC6032i("title") String attention, @InterfaceC6032i("lastUpdateTime") String start);

    @InterfaceC6030g("safe/auth/social/list/users")
    @ld6({f7l8.f57592t8r})
    retrofit2.toq<CommonResponse<AuthorAttentionDyncmicModel>> toq(@InterfaceC6032i(InterfaceC1925p.bgz) String userType, @InterfaceC6032i("title") String attention, @InterfaceC6032i(InterfaceC1925p.w4de) String start);
}
