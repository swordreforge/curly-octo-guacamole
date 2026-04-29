package com.market.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import java.util.List;

/* JADX INFO: renamed from: com.market.sdk.s */
/* JADX INFO: compiled from: DetailsPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4993s {

    /* JADX INFO: renamed from: k */
    private static final String f28140k = "DetailsPageManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68934toq = "data";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C4993s f68935zy;

    /* JADX INFO: renamed from: com.market.sdk.s$k */
    /* JADX INFO: compiled from: DetailsPageManager.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void m17374k(boolean z2);
    }

    private C4993s() {
    }

    /* JADX INFO: renamed from: k */
    public static C4993s m17372k() {
        if (f68935zy == null) {
            synchronized (C4993s.class) {
                if (f68935zy == null) {
                    f68935zy = new C4993s();
                }
            }
        }
        return f68935zy;
    }

    /* JADX INFO: renamed from: q */
    private boolean m17373q(C5020y c5020y) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.xiaomi.market", "com.xiaomi.market.data.DetailsPageService"));
        List<ResolveInfo> listQueryIntentServices = C5010k.toq().getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            C5013p.n7h(f28140k, "com.xiaomi.market.data.DetailsPageService not found, try start activity with deeplink.");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(c5020y.m17506q()));
            intent2.setFlags(268435456);
            if (!C5010k.toq().getPackageManager().queryIntentActivities(intent2, 0).isEmpty()) {
                C5010k.toq().startActivity(intent2);
                return true;
            }
        }
        return false;
    }

    public boolean toq(C5020y c5020y) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new UnsupportedOperationException("Can't call this method on ui thread");
        }
        if (!MarketManager.f27965p.equals("com.xiaomi.market")) {
            return false;
        }
        if (m17373q(c5020y)) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("data", c5020y.m17506q());
        try {
            return DetailsPageService.openConnect().openDetailsPage(bundle);
        } catch (Exception e2) {
            C5013p.m17463n(f28140k, "open market failed.", e2);
            return false;
        }
    }

    public void zy(C5020y c5020y, k kVar) {
        if (MarketManager.f27965p.equals("com.xiaomi.market")) {
            if (m17373q(c5020y)) {
                kVar.m17374k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("data", c5020y.m17506q());
            try {
                DetailsPageService.openConnect().openDetailPageAsync(bundle, kVar);
            } catch (Exception e2) {
                C5013p.m17463n(f28140k, "open market failed.", e2);
            }
        }
    }
}
