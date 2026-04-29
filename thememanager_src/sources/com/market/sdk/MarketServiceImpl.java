package com.market.sdk;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.market.sdk.IMarketService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MarketServiceImpl extends IMarketService.Stub {
    @Override // com.market.sdk.IMarketService
    public boolean allowConnectToNetwork() {
        return false;
    }

    @Override // com.market.sdk.IMarketService
    public ApkVerifyInfo getApkCheckInfo(String str, String str2, boolean z2) {
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public int getCategory(String[] strArr) {
        return -1;
    }

    @Override // com.market.sdk.IMarketService
    public void getCategoryV2(String[] strArr, ResultReceiver resultReceiver) throws RemoteException {
        resultReceiver.send(-1, null);
    }

    @Override // com.market.sdk.IMarketService
    public void getDesktopFolderConfig(ResultReceiver resultReceiver) throws RemoteException {
    }

    @Override // com.market.sdk.IMarketService
    public String getEnableSettings() {
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public ApkVerifyInfo getVerifyInfo(String str, String str2, boolean z2) {
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public String getWhiteSet() {
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public void getWhiteSetV2(ResultReceiver resultReceiver) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("whiteSet", "");
        resultReceiver.send(1, bundle);
    }

    @Override // com.market.sdk.IMarketService
    public boolean isInWhiteSetForApkCheck(String str) {
        return true;
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfo(long j2, String str, List<String> list, IDesktopRecommendResponse iDesktopRecommendResponse) {
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfoV2(long j2, String str, List<String> list, ResultReceiver resultReceiver) throws RemoteException {
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfoV3(Bundle bundle, ResultReceiver resultReceiver) throws RemoteException {
    }

    @Override // com.market.sdk.IMarketService
    public void loadIcon(String str, String str2, IImageCallback iImageCallback) {
    }

    @Override // com.market.sdk.IMarketService
    public void loadImage(String str, int i2, int i3, IImageCallback iImageCallback) {
    }

    @Override // com.market.sdk.IMarketService
    public void recordStaticsCountEvent(String str, String str2) {
    }
}
