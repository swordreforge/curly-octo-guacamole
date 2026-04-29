package ltg8;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.network.theme.model.OrderResponse;
import com.android.thememanager.basemodule.resource.model.PostResult;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.mine.remote.model.entity.BatchOrderResult;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;
import f7z0.zy;
import java.util.Map;

/* JADX INFO: compiled from: RemoteResourceRequestInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface toq {
    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/addFavoriteV2")
    retrofit2.toq<CommonResponse<PostResult>> f7l8(@zy("moduleId") String moduleId, @zy(InterfaceC1925p.ivf) String category);

    @InterfaceC6030g("/thm/native/purchase/largeIcons")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    /* JADX INFO: renamed from: g */
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> m24731g(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount, @InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i(InterfaceC1925p.xk9p) boolean hideFree, @InterfaceC6032i(InterfaceC1925p.gb1) boolean hideManualHiding, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/delFavoriteV2")
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<PostResult>> m24732k(@zy("moduleId") String moduleIds, @zy(InterfaceC1925p.ivf) String productType);

    @InterfaceC6030g("/thm/native/favorite/largeIcons")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> ld6(@InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount, @InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible, @InterfaceC6032i(InterfaceC1925p.u7oz) boolean hideOtherDevice);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/like/products")
    /* JADX INFO: renamed from: n */
    retrofit2.toq<EmptyResponse> m24733n(@zy("moduleId") String moduleId);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    @kja0("native/batchCreateOrder")
    retrofit2.toq<OrderResponse<BatchOrderResult>> n7h(@zy("packInfo") Map<String, String> packInfo, @zy(InterfaceC1925p.zogz) String orderType, @zy("orderChannel") String orderChannel);

    @InterfaceC6030g("/thm/native/like/largeIcons")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    /* JADX INFO: renamed from: p */
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> m24734p(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("cardStart") int cardStart, @InterfaceC6032i("cardCount") int cardCount, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/delLike/products")
    /* JADX INFO: renamed from: q */
    retrofit2.toq<EmptyResponse> m24735q(@zy(InterfaceC1925p.v4) String moduleIds);

    @InterfaceC6030g("safe/auth/myFavorite")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> qrj(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("page") int pageIndex, @InterfaceC6032i(InterfaceC1925p.mp7a) int requestedCount, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible);

    @InterfaceC6030g("safe/auth/myPurchased")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    /* JADX INFO: renamed from: s */
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> m24736s(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("page") int pageIndex, @InterfaceC6032i(InterfaceC1925p.mp7a) int requestedCount, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible, @InterfaceC6032i(InterfaceC1925p.xk9p) boolean hideFree, @InterfaceC6032i(InterfaceC1925p.gb1) boolean hideManualHiding);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/myPurchased/addManualHide")
    retrofit2.toq<EmptyResponse> toq(@zy(InterfaceC1925p.ivf) String category, @zy("productIds") String productIds);

    @InterfaceC6030g("safe/auth/like/products")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> x2(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("page") int pageIndex, @InterfaceC6032i(InterfaceC1925p.mp7a) int requestedCount, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r})
    @kja0("safe/auth/myPurchased/delManualHide")
    /* JADX INFO: renamed from: y */
    retrofit2.toq<EmptyResponse> m24737y(@zy(InterfaceC1925p.ivf) String category, @zy("productIds") String productIds);

    @InterfaceC6030g("safe/auth/myPurchased")
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj})
    retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> zy(@InterfaceC6032i(InterfaceC1925p.ivf) String category, @InterfaceC6032i("page") int pageIndex, @InterfaceC6032i(InterfaceC1925p.mp7a) int requestedCount, @InterfaceC6032i(InterfaceC1925p.a7on) boolean hideIncompatible, @InterfaceC6032i(InterfaceC1925p.xk9p) boolean hideFree, @InterfaceC6032i("productPackageName") String packageName, @InterfaceC6032i(InterfaceC1925p.gb1) boolean hideManualHiding);
}
