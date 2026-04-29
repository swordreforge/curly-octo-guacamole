package z4;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.gson.kja0;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6039z;
import f7z0.ld6;

/* JADX INFO: compiled from: RecommendRequestInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface zy {
    @InterfaceC6030g
    @ld6({f7l8.f57594zurt})
    retrofit2.toq<CommonResponse<kja0>> f7l8(@InterfaceC6039z String url, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/search/key")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: g */
    retrofit2.toq<CommonResponse<kja0>> m28205g(@InterfaceC6032i(InterfaceC1925p.w3u7) String searchType, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g("page/v3?apiVersion=1")
    @ld6({f7l8.f57584fn3e})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<kja0>> m28206k(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g
    @ld6({f7l8.f57594zurt, "request_analytics_flag:/app/v9/uipages"})
    /* JADX INFO: renamed from: n */
    retrofit2.toq<CommonResponse<kja0>> m28207n(@InterfaceC6039z String url, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("page/v3/recommend")
    @ld6({f7l8.f57584fn3e})
    /* JADX INFO: renamed from: q */
    retrofit2.toq<CommonResponse<kja0>> m28208q(@InterfaceC6032i("type") String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g("page/v3/classification?apiVersion=1")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: s */
    retrofit2.toq<CommonResponse<kja0>> m28209s(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g
    @ld6({f7l8.f57594zurt})
    retrofit2.toq<CommonResponse<kja0>> toq(@InterfaceC6039z String url, @InterfaceC6032i("keywords") String keywords, @InterfaceC6032i(InterfaceC1925p.zogz) String orderType, @InterfaceC6032i("leftPrice") int apiVersion, @InterfaceC6032i("rightPrice") int rightPrice, @InterfaceC6032i("cardStart") int cardStart);

    @InterfaceC6030g("uipages/settings/theme")
    @ld6({f7l8.f57594zurt})
    /* JADX INFO: renamed from: y */
    retrofit2.toq<CommonResponse<kja0>> m28210y(@InterfaceC6032i(InterfaceC1925p.ads1) boolean ignoreAd, @InterfaceC6032i(InterfaceC1925p.fp) int apiVersion, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount);

    @InterfaceC6030g("page/v3?apiVersion=1")
    @ld6({f7l8.f57584fn3e})
    retrofit2.toq<CommonResponse<kja0>> zy(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount, @InterfaceC6032i(InterfaceC1925p.jt) int randIndex);
}
