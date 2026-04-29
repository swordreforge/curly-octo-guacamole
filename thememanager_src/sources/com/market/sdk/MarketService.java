package com.market.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.market.AbstractC4931k;
import com.market.sdk.IMarketService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MarketService extends AbstractC4931k implements IMarketService {
    private static final String MARKET_SERVICE_CLASS_NAME = "com.xiaomi.market.data.MarketService";
    private IMarketService mService;

    class f7l8 implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ResultReceiver f27990k;

        f7l8(ResultReceiver resultReceiver) {
            this.f27990k = resultReceiver;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.getDesktopFolderConfig(this.f27990k);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$g */
    class C4955g implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Bundle f27991k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f68836toq;

        C4955g(Bundle bundle, ResultReceiver resultReceiver) {
            this.f27991k = bundle;
            this.f68836toq = resultReceiver;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.loadDesktopRecommendInfoV3(this.f27991k, this.f68836toq);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$h */
    class C4956h implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27992k;

        C4956h(com.market.sdk.compat.toq toqVar) {
            this.f27992k = toqVar;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f27992k.set(MarketService.this.mService.getWhiteSet());
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$k */
    class C4957k implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27993k;

        C4957k(com.market.sdk.compat.toq toqVar) {
            this.f27993k = toqVar;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f27993k.set(MarketService.this.mService.getEnableSettings());
        }
    }

    class kja0 implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f27994k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68840toq;

        kja0(com.market.sdk.compat.toq toqVar, String str) {
            this.f27994k = toqVar;
            this.f68840toq = str;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f27994k.set(Boolean.valueOf(MarketService.this.mService.isInWhiteSetForApkCheck(this.f68840toq)));
        }
    }

    class ld6 implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f27995k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68842toq;

        ld6(String str, String str2) {
            this.f27995k = str;
            this.f68842toq = str2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.recordStaticsCountEvent(this.f27995k, this.f68842toq);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$n */
    class C4958n implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long f27996k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ResultReceiver f27998q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68844toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ List f68845zy;

        C4958n(long j2, String str, List list, ResultReceiver resultReceiver) {
            this.f27996k = j2;
            this.f68844toq = str;
            this.f68845zy = list;
            this.f27998q = resultReceiver;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.loadDesktopRecommendInfoV2(this.f27996k, this.f68844toq, this.f68845zy, this.f27998q);
        }
    }

    class n7h implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long f27999k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ IDesktopRecommendResponse f28001q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68846toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ List f68847zy;

        n7h(long j2, String str, List list, IDesktopRecommendResponse iDesktopRecommendResponse) {
            this.f27999k = j2;
            this.f68846toq = str;
            this.f68847zy = list;
            this.f28001q = iDesktopRecommendResponse;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.loadDesktopRecommendInfo(this.f27999k, this.f68846toq, this.f68847zy, this.f28001q);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$p */
    class C4959p implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f28002k;

        C4959p(com.market.sdk.compat.toq toqVar) {
            this.f28002k = toqVar;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f28002k.set(Boolean.valueOf(MarketService.this.mService.allowConnectToNetwork()));
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$q */
    class C4960q implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String[] f28003k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f68849toq;

        C4960q(String[] strArr, ResultReceiver resultReceiver) {
            this.f28003k = strArr;
            this.f68849toq = resultReceiver;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.getCategoryV2(this.f28003k, this.f68849toq);
        }
    }

    class qrj implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f28004k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ IImageCallback f28006q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f68851toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f68852zy;

        qrj(String str, int i2, int i3, IImageCallback iImageCallback) {
            this.f28004k = str;
            this.f68851toq = i2;
            this.f68852zy = i3;
            this.f28006q = iImageCallback;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.loadImage(this.f28004k, this.f68851toq, this.f68852zy, this.f28006q);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$s */
    class C4961s implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f28007k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f28009q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68853toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f68854zy;

        C4961s(com.market.sdk.compat.toq toqVar, String str, String str2, boolean z2) {
            this.f28007k = toqVar;
            this.f68853toq = str;
            this.f68854zy = str2;
            this.f28009q = z2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f28007k.set(MarketService.this.mService.getApkCheckInfo(this.f68853toq, this.f68854zy, this.f28009q));
        }
    }

    class toq implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f28010k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String[] f68855toq;

        toq(com.market.sdk.compat.toq toqVar, String[] strArr) {
            this.f28010k = toqVar;
            this.f68855toq = strArr;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f28010k.set(Integer.valueOf(MarketService.this.mService.getCategory(this.f68855toq)));
        }
    }

    class x2 implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f28011k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68857toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ IImageCallback f68858zy;

        x2(String str, String str2, IImageCallback iImageCallback) {
            this.f28011k = str;
            this.f68857toq = str2;
            this.f68858zy = iImageCallback;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.loadIcon(this.f28011k, this.f68857toq, this.f68858zy);
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.MarketService$y */
    class C4962y implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.market.sdk.compat.toq f28013k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f28015q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68859toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f68860zy;

        C4962y(com.market.sdk.compat.toq toqVar, String str, String str2, boolean z2) {
            this.f28013k = toqVar;
            this.f68859toq = str;
            this.f68860zy = str2;
            this.f28015q = z2;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            this.f28013k.set(MarketService.this.mService.getVerifyInfo(this.f68859toq, this.f68860zy, this.f28015q));
        }
    }

    class zy implements AbstractC4931k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ResultReceiver f28016k;

        zy(ResultReceiver resultReceiver) {
            this.f28016k = resultReceiver;
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
            MarketService.this.mService.getWhiteSetV2(this.f28016k);
        }
    }

    private MarketService(Context context, Intent intent) {
        super(context, intent);
    }

    public static IMarketService openService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MarketManager.f27965p, MARKET_SERVICE_CLASS_NAME));
        return new MarketService(context, intent);
    }

    @Override // com.market.sdk.IMarketService
    public boolean allowConnectToNetwork() throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4959p(toqVar), "allowConnectToNetwork");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Boolean) toqVar.get()).booleanValue();
        }
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public ApkVerifyInfo getApkCheckInfo(String str, String str2, boolean z2) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4961s(toqVar, str, str2, z2), "getApkCheckInfo");
        waitForCompletion();
        if (toqVar.isDone()) {
            return (ApkVerifyInfo) toqVar.get();
        }
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public int getCategory(String[] strArr) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new toq(toqVar, strArr), "getCategory");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Integer) toqVar.get()).intValue();
        }
        return -1;
    }

    @Override // com.market.sdk.IMarketService
    public void getCategoryV2(String[] strArr, ResultReceiver resultReceiver) throws RemoteException {
        setTask(new C4960q(strArr, resultReceiver), "getCategoryV2");
    }

    @Override // com.market.sdk.IMarketService
    public void getDesktopFolderConfig(ResultReceiver resultReceiver) throws RemoteException {
        setTask(new f7l8(resultReceiver), "getDesktopFolderConfig");
    }

    @Override // com.market.sdk.IMarketService
    public String getEnableSettings() throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4957k(toqVar), "getEnableSettings");
        waitForCompletion();
        return toqVar.isDone() ? (String) toqVar.get() : "";
    }

    @Override // com.market.sdk.IMarketService
    public ApkVerifyInfo getVerifyInfo(String str, String str2, boolean z2) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4962y(toqVar, str, str2, z2), "getVerifyInfo");
        waitForCompletion();
        if (toqVar.isDone()) {
            return (ApkVerifyInfo) toqVar.get();
        }
        return null;
    }

    @Override // com.market.sdk.IMarketService
    public String getWhiteSet() throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new C4956h(toqVar), "getWhiteSet");
        waitForCompletion();
        return toqVar.isDone() ? (String) toqVar.get() : "";
    }

    @Override // com.market.sdk.IMarketService
    public void getWhiteSetV2(ResultReceiver resultReceiver) throws RemoteException {
        setTask(new zy(resultReceiver), "getWhiteSetV2");
    }

    @Override // com.market.sdk.IMarketService
    public boolean isInWhiteSetForApkCheck(String str) throws RemoteException {
        com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        setTask(new kja0(toqVar, str), "isInWhiteSetForApkCheck");
        waitForCompletion();
        if (toqVar.isDone()) {
            return ((Boolean) toqVar.get()).booleanValue();
        }
        return false;
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfo(long j2, String str, List<String> list, IDesktopRecommendResponse iDesktopRecommendResponse) throws RemoteException {
        setTask(new n7h(j2, str, list, iDesktopRecommendResponse), "loadDesktopRecommendInfo");
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfoV2(long j2, String str, List<String> list, ResultReceiver resultReceiver) throws RemoteException {
        setTask(new C4958n(j2, str, list, resultReceiver), "loadDesktopRecommendInfoV2");
    }

    @Override // com.market.sdk.IMarketService
    public void loadDesktopRecommendInfoV3(Bundle bundle, ResultReceiver resultReceiver) throws RemoteException {
        setTask(new C4955g(bundle, resultReceiver), "loadDesktopRecommendInfoV3");
    }

    @Override // com.market.sdk.IMarketService
    public void loadIcon(String str, String str2, IImageCallback iImageCallback) throws RemoteException {
        setTask(new x2(str, str2, iImageCallback), "loadIcon");
    }

    @Override // com.market.sdk.IMarketService
    public void loadImage(String str, int i2, int i3, IImageCallback iImageCallback) throws RemoteException {
        setTask(new qrj(str, i2, i3, iImageCallback), "loadImage");
    }

    @Override // com.market.AbstractC4931k
    public void onConnected(IBinder iBinder) {
        this.mService = IMarketService.Stub.asInterface(iBinder);
    }

    @Override // com.market.AbstractC4931k
    public void onDisconnected() {
    }

    @Override // com.market.sdk.IMarketService
    public void recordStaticsCountEvent(String str, String str2) throws RemoteException {
        setTask(new ld6(str, str2), "recordStaticsCountEvent");
    }
}
