package bz2;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UIPage;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.t8r;

/* JADX INFO: compiled from: WidgetListInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface zy {
    @InterfaceC6030g("page/v3/theme-detail-widgets")
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<UIPage>> m5845k(@InterfaceC6032i("subjectId") String id);

    @InterfaceC6030g("page/v3/mipad-theme-detail-widgets")
    retrofit2.toq<CommonResponse<UIPage>> toq(@InterfaceC6032i("subjectId") String id);

    @InterfaceC6030g("page/v3/subjects/{uuid}")
    retrofit2.toq<CommonResponse<UIPage>> zy(@t8r("uuid") String uuid, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int count);
}
