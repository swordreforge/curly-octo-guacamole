package com.market.sdk.homeguide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import com.market.sdk.utils.C5008h;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import com.market.sdk.utils.C5016s;
import com.market.sdk.utils.cdj;
import com.market.sdk.utils.kja0;
import com.market.sdk.utils.n7h;
import com.market.sdk.utils.qrj;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: com.market.sdk.homeguide.k */
/* JADX INFO: compiled from: AppstoreUserGuide.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4974k {

    /* JADX INFO: renamed from: g */
    public static final Set<String> f28053g;

    /* JADX INFO: renamed from: k */
    private static final String f28054k = "AppstoreUserGuide";

    /* JADX INFO: renamed from: n */
    public static final Set<String> f28055n;

    /* JADX INFO: renamed from: q */
    private static final int f28056q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68883toq = "need_show_user_guide";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f68884zy = 1;

    /* JADX INFO: renamed from: com.market.sdk.homeguide.k$k */
    /* JADX INFO: compiled from: AppstoreUserGuide.java */
    class k implements toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zy f28057k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ HomeUserGuideData f68885toq;

        k(zy zyVar, HomeUserGuideData homeUserGuideData) {
            this.f28057k = zyVar;
            this.f68885toq = homeUserGuideData;
        }

        @Override // com.market.sdk.homeguide.toq
        /* JADX INFO: renamed from: k */
        public void mo17319k(boolean z2) {
            if (!TextUtils.isEmpty(this.f68885toq.getLocalFilePath())) {
                new File(this.f68885toq.getLocalFilePath()).delete();
            }
            if (z2) {
                return;
            }
            qrj.n7h(C4974k.f68883toq, false, new qrj.EnumC5015k[0]);
        }

        @Override // com.market.sdk.homeguide.toq
        public boolean toq() {
            zy zyVar = this.f28057k;
            if (zyVar != null) {
                return zyVar.m17320k();
            }
            return false;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f28055n = hashSet;
        HashSet hashSet2 = new HashSet();
        f28053g = hashSet2;
        hashSet.add(kja0.f28213k);
        hashSet.add(kja0.f68998toq);
        hashSet.add(kja0.f68999zy);
        hashSet.add(kja0.f28214q);
        hashSet2.add(C5016s.f28231k);
        hashSet2.add(C5016s.f69017toq);
        hashSet2.add(C5016s.f69018zy);
        hashSet2.add(C5016s.f28232q);
    }

    private void f7l8(HomeUserGuideData homeUserGuideData, zy zyVar) {
        if (AppstoreUserGuideService.getUserGuideIntent() == null) {
            C5013p.m17461g(f28054k, "can not found user guide service");
        } else {
            AppstoreUserGuideService.openService().tryShow(homeUserGuideData, new k(zyVar, homeUserGuideData));
        }
    }

    /* JADX INFO: renamed from: k */
    private Bitmap m17314k() {
        Class<?> clsZy = n7h.zy("miui.util.ScreenshotUtils");
        Class cls = Integer.TYPE;
        String strF7l8 = n7h.f7l8(Bitmap.class, Context.class, Float.TYPE, cls, cls, Boolean.TYPE);
        int iZy = zy();
        Bitmap bitmap = (Bitmap) n7h.m17459s(clsZy, clsZy, "getScreenshot", strF7l8, C5010k.toq(), Float.valueOf(1.0f), Integer.valueOf(iZy), Integer.valueOf(iZy), Boolean.TRUE);
        if (bitmap == null) {
            return null;
        }
        return bitmap;
    }

    private Bitmap toq(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint();
        if (!bitmap2.isMutable()) {
            bitmap2 = Bitmap.createBitmap(C5008h.toq(), C5008h.m17432k(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmap2;
    }

    private int zy() {
        return 11000;
    }

    /* JADX INFO: renamed from: g */
    public boolean m17315g() {
        if (!com.market.sdk.utils.zy.m17501k() || !qrj.toq(f68883toq, true, new qrj.EnumC5015k[0])) {
            return false;
        }
        if (C5008h.zy()) {
            C5013p.toq(f28054k, "do not show appstore guide in big font mode");
            return false;
        }
        int qVar = cdj.zy.toq(C5010k.toq(), "com.xiaomi.mipicks.need_show_user_guide_status", -1);
        if (qVar == 1) {
            return true;
        }
        if (qVar == 2) {
            return false;
        }
        Set<String> set = f28055n;
        if (!set.contains(kja0.m17446k())) {
            C5013p.toq(f28054k, "region not match, current is: " + kja0.m17446k() + ", expected is: " + set);
            return false;
        }
        Set<String> set2 = f28053g;
        if (set2.contains(Locale.getDefault().getLanguage())) {
            if (AppstoreUserGuideService.getUserGuideIntent() != null) {
                return true;
            }
            C5013p.toq(f28054k, "no service found to show appstore guide");
            return false;
        }
        C5013p.toq(f28054k, "language not match, current is: " + Locale.getDefault().getLanguage() + ", expected is: " + set2);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public String m17316n() {
        return "com.xiaomi.mipicks";
    }

    /* JADX INFO: renamed from: q */
    public String m17317q() {
        return "com.xiaomi.market.ui.MarketTabActivity";
    }

    /* JADX INFO: renamed from: y */
    public void m17318y(Bitmap bitmap, HomeUserGuideData homeUserGuideData, zy zyVar) throws Throwable {
        Bitmap bitmapM17314k = m17314k();
        if (bitmapM17314k == null) {
            C5013p.m17465q(f28054k, "capture wallpaper failed!");
            return;
        }
        try {
            com.market.sdk.utils.toq.m17489g(toq(bitmapM17314k, bitmap), homeUserGuideData.getLocalFilePath(), false);
        } catch (IOException e2) {
            C5013p.m17463n(f28054k, e2.toString(), e2);
        }
        f7l8(homeUserGuideData, zyVar);
    }
}
