package com.android.thememanager.basemodule.ad.model;

import android.text.TextUtils;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.google.gson.C4871g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AdInfoResponse implements Serializable {
    public ArrayList<AdInfo> adInfos;
    public int status;
    public String triggerId;

    @Deprecated
    public static AdInfo checkAndGetAdInfo(String response) {
        return checkAndGetAdInfo(response, false);
    }

    private static boolean isAdValid(AdInfo info) {
        return (info == null || TextUtils.isEmpty(info.tagId) || TextUtils.isEmpty(info.ex)) ? false : true;
    }

    public AdInfo getAdInfo() {
        return getAdInfo(false);
    }

    public List<AdInfo> getAdInfos(boolean checkDislike) {
        ArrayList<AdInfo> arrayList = this.adInfos;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (AdInfo adInfo : arrayList) {
            if (isAdValid(adInfo) && (!checkDislike || !AdDislikeManager.m6595g().f7l8(adInfo.tagId))) {
                arrayList2.add(adInfo);
            }
        }
        return arrayList2;
    }

    @Deprecated
    public static AdInfo checkAndGetAdInfo(String response, boolean checkDislike) {
        ArrayList<AdInfo> arrayList;
        try {
            AdInfoResponse adInfoResponse = (AdInfoResponse) new C4871g().n7h(response, AdInfoResponse.class);
            if (adInfoResponse == null || (arrayList = adInfoResponse.adInfos) == null || arrayList.isEmpty()) {
                return null;
            }
            AdInfo adInfo = adInfoResponse.adInfos.get(0);
            if (!isAdValid(adInfo)) {
                return null;
            }
            if (checkDislike) {
                if (AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
                    return null;
                }
            }
            return adInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public AdInfo getAdInfo(boolean checkDislike) {
        ArrayList<AdInfo> arrayList = this.adInfos;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        AdInfo adInfo = this.adInfos.get(0);
        if (!isAdValid(adInfo)) {
            return null;
        }
        if (checkDislike && AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
            return null;
        }
        return adInfo;
    }
}
