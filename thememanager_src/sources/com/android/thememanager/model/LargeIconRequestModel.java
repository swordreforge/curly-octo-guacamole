package com.android.thememanager.model;

import android.util.Log;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import java.io.IOException;
import p029m.zy;
import retrofit2.C7639i;
import retrofit2.toq;
import zy.dd;
import zy.y9n;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconRequestModel {
    private static final String TAG = "LargeIconModel";

    @dd
    @y9n
    public static UIPage getLargeIconCategory(String onlineId) {
        if (zy.toq(onlineId)) {
            return null;
        }
        return (UIPage) getResponseResult(((LargeIconRequestInterface) f7l8.m6882h().toq(LargeIconRequestInterface.class)).getLargeIconCategory(onlineId));
    }

    @dd
    @y9n
    public static toq<CommonResponse<kja0>> getLargeIconCategoryData(String pageId, int cardStart, int cardCount) {
        return ((LargeIconRequestInterface) f7l8.m6882h().toq(LargeIconRequestInterface.class)).getLargeIconCategoryData(pageId, cardStart, cardCount);
    }

    private static <T> T getResponseResult(toq<CommonResponse<T>> call) {
        C7639i<CommonResponse<T>> c7639iF7l8;
        try {
            c7639iF7l8 = call.f7l8();
        } catch (IOException e2) {
            Log.w(TAG, "toUIPage() :" + e2);
            c7639iF7l8 = null;
        }
        if (c7639iF7l8 == null) {
            Log.i(TAG, "toUIPage() response null.");
        } else if (c7639iF7l8.f7l8()) {
            CommonResponse<T> commonResponseM27986k = c7639iF7l8.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
            Log.d(TAG, "toUIPage() CommonResponse null.");
        } else {
            Log.d(TAG, "toUIPage() res fail." + c7639iF7l8);
        }
        return null;
    }
}
