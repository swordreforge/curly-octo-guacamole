package com.market.internal;

import android.os.RemoteException;
import android.util.Log;
import com.market.sdk.DesktopRecommendInfo;
import com.market.sdk.IDesktopRecommendResponse;
import com.market.sdk.IMarketService;
import com.market.sdk.MarketManager;
import com.market.sdk.f7l8;
import com.market.sdk.ni7;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class DesktopRecommendManager {

    /* JADX INFO: renamed from: k */
    private static Set<Long> f27872k = new HashSet();

    private static class DesktopRecomendResponse extends IDesktopRecommendResponse.Stub {
        private f7l8 mCallback;
        private long mFolderId;

        public DesktopRecomendResponse(long j2, f7l8 f7l8Var) {
            this.mFolderId = j2;
            this.mCallback = f7l8Var;
        }

        @Override // com.market.sdk.IDesktopRecommendResponse
        public void onLoadFailed() {
            DesktopRecommendManager.f27872k.remove(Long.valueOf(this.mFolderId));
            f7l8 f7l8Var = this.mCallback;
            if (f7l8Var != null) {
                f7l8Var.onLoadFailed();
            }
        }

        @Override // com.market.sdk.IDesktopRecommendResponse
        public void onLoadSuccess(DesktopRecommendInfo desktopRecommendInfo) {
            DesktopRecommendManager.f27872k.remove(Long.valueOf(this.mFolderId));
            f7l8 f7l8Var = this.mCallback;
            if (f7l8Var != null) {
                f7l8Var.onLoadSuccess(desktopRecommendInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.market.internal.DesktopRecommendManager$k */
    class C4930k extends ni7<Void> {

        /* JADX INFO: renamed from: h */
        final /* synthetic */ f7l8 f27873h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ String f27874i;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ long f27875p;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List f27876z;

        C4930k(long j2, f7l8 f7l8Var, String str, List list) {
            this.f27875p = j2;
            this.f27873h = f7l8Var;
            this.f27874i = str;
            this.f27876z = list;
        }

        @Override // com.market.sdk.ni7
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Void mo17245g(IMarketService iMarketService) throws RemoteException {
            try {
                iMarketService.loadDesktopRecommendInfo(this.f27875p, this.f27874i, this.f27876z, new DesktopRecomendResponse(this.f27875p, this.f27873h));
                return null;
            } catch (Exception e2) {
                Log.e(MarketManager.f27964n, "Exception when load desktop recommend info : " + e2);
                return null;
            }
        }
    }

    public static void toq(long j2, String str, List<String> list, f7l8 f7l8Var) {
        synchronized (f27872k) {
            if (!f27872k.contains(Long.valueOf(j2))) {
                f27872k.add(Long.valueOf(j2));
                new C4930k(j2, f7l8Var, str, list).m17337s();
            }
        }
    }
}
