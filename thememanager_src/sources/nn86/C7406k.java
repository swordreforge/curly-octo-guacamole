package nn86;

import android.text.TextUtils;
import com.android.thememanager.ad.ad_test.view.AbstractC1641k;
import com.android.thememanager.ad.ad_test.view.C1642n;
import com.android.thememanager.ad.ad_test.view.C1643q;
import com.android.thememanager.ad.ad_test.view.toq;
import com.android.thememanager.ad.ad_test.view.zy;

/* JADX INFO: renamed from: nn86.k */
/* JADX INFO: compiled from: ElementAdBannerManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C7406k {
    /* JADX INFO: renamed from: k */
    public static AbstractC1641k m26808k(String bannerBucketYType) {
        if (!toq(bannerBucketYType)) {
            return null;
        }
        bannerBucketYType.hashCode();
        switch (bannerBucketYType) {
            case "theme_adtest_button_group1":
                return new zy(bannerBucketYType);
            case "theme_adtest_button_group2":
                return new C1642n(bannerBucketYType);
            case "theme_adtest_button_group3":
                return new C1643q(bannerBucketYType);
            case "theme_adtest_button_group4":
                return new toq(bannerBucketYType);
            default:
                return null;
        }
    }

    public static boolean toq(String bucketType) {
        return (TextUtils.isEmpty(bucketType) || TextUtils.equals(p001b.zy.f7228k, bucketType)) ? false : true;
    }
}
