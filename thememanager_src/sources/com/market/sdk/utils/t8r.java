package com.market.sdk.utils;

import android.text.TextUtils;
import com.market.sdk.MarketManager;
import miui.os.Build;

/* JADX INFO: compiled from: VersionConstraint.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t8r {

    /* JADX INFO: renamed from: com.market.sdk.utils.t8r$k */
    /* JADX INFO: compiled from: VersionConstraint.java */
    class C5017k extends t8r {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f28233k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f69019toq;

        C5017k(String str, String str2) {
            this.f28233k = str;
            this.f69019toq = str2;
        }

        @Override // com.market.sdk.utils.t8r
        /* JADX INFO: renamed from: k */
        public boolean mo17488k() {
            try {
                if (Build.IS_STABLE_VERSION && !TextUtils.isEmpty(this.f28233k)) {
                    return C5009i.toq(this.f28233k);
                }
                if ((Build.IS_DEVELOPMENT_VERSION || Build.IS_ALPHA_BUILD) && !TextUtils.isEmpty(this.f69019toq)) {
                    return C5009i.m17433k(this.f69019toq);
                }
                return true;
            } catch (Throwable th) {
                C5013p.m17465q(MarketManager.f27964n, th.toString());
                return true;
            }
        }
    }

    public static t8r toq(String str, String str2) {
        return new C5017k(str, str2);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo17488k();
}
