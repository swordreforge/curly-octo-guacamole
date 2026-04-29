package com.android.thememanager.maml;

import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.google.gson.C4871g;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import retrofit2.C7639i;

/* JADX INFO: renamed from: com.android.thememanager.maml.y */
/* JADX INFO: compiled from: MamlBoughtInfoHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2158y {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f60435cdj = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60436f7l8 = "mamlBoughtInfoResult";

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final String f12684g = "pageSize";

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private static final String f12685h = "WIDGET";

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f12686k = "MamlBoughtInfoHelper";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60437kja0 = "WIDGET_SUIT";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f60438ld6 = -1003;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final String f12687n = "pageIndex";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f60439n7h = -1006;

    /* JADX INFO: renamed from: p */
    private static final int f12688p = -1002;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f12689q = "productId";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f60440qrj = -1005;

    /* JADX INFO: renamed from: s */
    private static final int f12690s = -1001;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f60441toq = "checkResourceBoughtState";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f60442x2 = -1004;

    /* JADX INFO: renamed from: y */
    private static final int f12691y = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f60443zy = "userWidgetOrders";

    /* JADX INFO: renamed from: k */
    private static final Bundle m8214k() {
        MamlBoughtInfo mamlBoughtInfo = new MamlBoughtInfo();
        if (!C1781k.m6905k()) {
            mamlBoughtInfo.code = f12690s;
            Log.i(f12686k, "checkCommonStatus ALLOW_CTA_AND_NETWORK_FAIL");
            Bundle bundle = new Bundle();
            bundle.putString(f60436f7l8, new C4871g().wvg(mamlBoughtInfo, MamlBoughtInfo.class));
            return bundle;
        }
        if (!C1915g.m7550n()) {
            mamlBoughtInfo.code = f12688p;
            Log.i(f12686k, "checkCommonStatus NET_ERROR");
            Bundle bundle2 = new Bundle();
            bundle2.putString(f60436f7l8, new C4871g().wvg(mamlBoughtInfo, MamlBoughtInfo.class));
            return bundle2;
        }
        if (C1688q.cdj().wvg()) {
            return null;
        }
        mamlBoughtInfo.code = f60442x2;
        Log.i(f12686k, "checkCommonStatus UN_LOGIN");
        Bundle bundle3 = new Bundle();
        bundle3.putString(f60436f7l8, new C4871g().wvg(mamlBoughtInfo, MamlBoughtInfo.class));
        return bundle3;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.util.ArrayList, java.util.List] */
    @InterfaceC7396q
    public static final Bundle toq(@InterfaceC7395n Bundle bundle) {
        Bundle bundleM8214k;
        Bundle bundle2 = new Bundle();
        MamlBoughtStateInfo mamlBoughtStateInfo = new MamlBoughtStateInfo();
        try {
            bundleM8214k = m8214k();
        } catch (Exception unused) {
            Log.i(f12686k, "checkResourceBoughtState REQUEST SERVER ERROR");
            mamlBoughtStateInfo.code = f60440qrj;
        }
        if (bundleM8214k != null) {
            return bundleM8214k;
        }
        String string = (bundle == null || bundle.isEmpty()) ? null : bundle.getString("productId");
        if (string == null || string.length() == 0) {
            mamlBoughtStateInfo.code = f60438ld6;
            Log.i(f12686k, "checkResourceBoughtState REQUEST_PARAM_ILLEGAL");
            bundle2.putString(f60436f7l8, new C4871g().wvg(mamlBoughtStateInfo, MamlBoughtStateInfo.class));
            return bundle2;
        }
        ?? arrayList = new ArrayList();
        Map<String, Boolean> mapM7576s = ld6.m7576s("WIDGET", string);
        for (String str : mapM7576s.keySet()) {
            MamlProductBoughtInfo mamlProductBoughtInfo = new MamlProductBoughtInfo();
            mamlProductBoughtInfo.productId = str;
            mamlProductBoughtInfo.isBought = d2ok.f7l8(mapM7576s.get(str), Boolean.TRUE);
            arrayList.add(mamlProductBoughtInfo);
        }
        mamlBoughtStateInfo.code = 0;
        mamlBoughtStateInfo.data = arrayList;
        bundle2.putString(f60436f7l8, new C4871g().wvg(mamlBoughtStateInfo, MamlBoughtStateInfo.class));
        return bundle2;
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [T] */
    @InterfaceC7396q
    public static final Bundle zy(@InterfaceC7395n Bundle bundle) {
        Bundle bundleM8214k;
        ?? r14;
        Bundle bundle2 = new Bundle();
        MamlBoughtOrderInfo mamlBoughtOrderInfo = new MamlBoughtOrderInfo();
        try {
            bundleM8214k = m8214k();
        } catch (Exception unused) {
            Log.i(f12686k, "userWidgetOrders REQUEST SERVER ERROR");
            mamlBoughtOrderInfo.code = f60440qrj;
        }
        if (bundleM8214k != null) {
            return bundleM8214k;
        }
        int i2 = -1;
        if (bundle != null && !bundle.isEmpty()) {
            i2 = bundle.getInt(f12687n, -1);
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = (i3 > 0 && bundle != null) ? bundle.getInt("pageSize", 0) : 0;
        if (i3 < 0) {
            mamlBoughtOrderInfo.code = f60438ld6;
            String strWvg = new C4871g().wvg(mamlBoughtOrderInfo, MamlBoughtOrderInfo.class);
            Log.i(f12686k, "userWidgetOrders REQUEST_PARAM_ILLEGAL");
            bundle2.putString(f60436f7l8, strWvg);
            return bundle2;
        }
        C7639i<CommonResponse<PurchasedOrFavoritedCategory>> c7639iF7l8 = ((ltg8.toq) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(ltg8.toq.class)).m24736s("WIDGET_SUIT", i3, i5, false, false, false).f7l8();
        CommonResponse<PurchasedOrFavoritedCategory> commonResponseM27986k = c7639iF7l8.m27986k();
        if (!c7639iF7l8.f7l8() || commonResponseM27986k == null || (r14 = commonResponseM27986k.apiData) == 0) {
            Log.i(f12686k, "userWidgetOrders REQUEST SERVER FAIL");
            mamlBoughtOrderInfo.code = f60440qrj;
        } else {
            if (commonResponseM27986k.apiCode != 0) {
                i4 = f60439n7h;
            }
            mamlBoughtOrderInfo.code = i4;
            mamlBoughtOrderInfo.data = r14;
        }
        bundle2.putString(f60436f7l8, new C4871g().wvg(mamlBoughtOrderInfo, MamlBoughtOrderInfo.class));
        return bundle2;
    }
}
