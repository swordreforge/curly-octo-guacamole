package com.android.thememanager.ad;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.ad.q */
/* JADX INFO: compiled from: AdServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@lv5({"SMAP\nAdServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdServiceImpl.kt\ncom/android/thememanager/ad/AdServiceImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class C1653q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1653q f9530k = new C1653q();

    private C1653q() {
    }

    @qrj
    public static final void cdj(@InterfaceC7395n InterfaceC1694q interfaceC1694q) {
        AdUtils.jp0y(interfaceC1694q);
    }

    @qrj
    public static final void f7l8(@InterfaceC7395n Context context, @InterfaceC7395n AdInfo adInfo, @InterfaceC7395n Map<String, String> map) {
        AdUtils.m6495s(context, adInfo, map);
    }

    @qrj
    /* JADX INFO: renamed from: g */
    public static final void m6524g(@InterfaceC7395n Context context, @InterfaceC7396q AdInfo info, boolean z2, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(info, "info");
        d2ok.m23075h(extra, "extra");
        d2ok.qrj(context);
        AdUtils.f7l8(context, info, z2, false, null, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @qrj
    /* JADX INFO: renamed from: h */
    public static final boolean m6525h(@InterfaceC7395n String str) {
        return false;
    }

    @qrj
    /* JADX INFO: renamed from: k */
    public static final void m6526k(@InterfaceC7395n InterfaceC1694q interfaceC1694q) {
        AdUtils.m6494q(interfaceC1694q);
    }

    @qrj
    public static final void ki(@InterfaceC7395n InterfaceC1852k interfaceC1852k) {
        com.android.thememanager.ad.download.toq.m6518s().n7h(interfaceC1852k);
    }

    @qrj
    public static final boolean kja0(@InterfaceC7395n AdInfo adInfo) {
        return AdUtils.wvg(adInfo);
    }

    @qrj
    public static final boolean ld6(@InterfaceC7395n Activity activity, @InterfaceC7395n AdInfo adInfo, @InterfaceC7395n ImageView imageView, @InterfaceC7395n ImageView imageView2, int i2, int i3, @InterfaceC7395n TextView textView, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(extra, "extra");
        return AdUtils.m6489h(activity, adInfo, imageView, imageView2, i2, i3, textView, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @qrj
    /* JADX INFO: renamed from: n */
    public static final void m6527n(@InterfaceC7395n Context context, @InterfaceC7396q AdInfo info, boolean z2, boolean z3, @InterfaceC7395n Map<String, String> map, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(info, "info");
        d2ok.m23075h(extra, "extra");
        d2ok.qrj(context);
        AdUtils.f7l8(context, info, z2, z3, map, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @InterfaceC7395n
    @qrj
    public static final String n7h(@InterfaceC7395n AdInfo adInfo) {
        return AdUtils.fu4(adInfo);
    }

    @qrj
    /* JADX INFO: renamed from: p */
    public static final boolean m6528p(@InterfaceC7395n Activity activity, @InterfaceC7395n AdInfo adInfo, @InterfaceC7395n View view, @InterfaceC7395n ImageView imageView, @InterfaceC7395n TextView textView, @InterfaceC7395n TextView textView2, @InterfaceC7395n TextView textView3, int i2, @InterfaceC7395n TextView textView4, @InterfaceC7395n TextView textView5, @InterfaceC7395n TextView textView6, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(extra, "extra");
        return AdUtils.kja0(activity, adInfo, view, imageView, textView, textView2, textView3, i2, textView4, textView5, textView6, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @qrj
    /* JADX INFO: renamed from: q */
    public static final void m6529q(@InterfaceC7395n Context context, @InterfaceC7396q AdInfo info, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(info, "info");
        d2ok.m23075h(extra, "extra");
        AdUtils.m6488g(context, info, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @InterfaceC7396q
    @qrj
    public static final String qrj(@InterfaceC7395n AdInfo adInfo) {
        String strNi7 = AdUtils.ni7(adInfo);
        d2ok.kja0(strNi7, "getSubTitle(...)");
        return strNi7;
    }

    @qrj
    /* JADX INFO: renamed from: s */
    public static final boolean m6530s(@InterfaceC7395n Activity activity, @InterfaceC7395n AdInfo adInfo, @InterfaceC7395n View view, @InterfaceC7395n ImageView imageView, int i2, @InterfaceC7395n TextView textView, @InterfaceC7395n TextView textView2, @InterfaceC7395n TextView textView3, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(extra, "extra");
        return AdUtils.qrj(activity, adInfo, view, imageView, i2, textView, textView2, textView3, (Map[]) Arrays.copyOf(extra, extra.length));
    }

    @qrj
    public static final void toq(@InterfaceC7395n InterfaceC1852k interfaceC1852k) {
        com.android.thememanager.ad.download.toq.m6518s().zy(interfaceC1852k);
    }

    @InterfaceC7396q
    @qrj
    public static final String x2(@InterfaceC7395n AdInfo adInfo) {
        String strN7h;
        StringBuilder sb = new StringBuilder();
        if (adInfo == null || (strN7h = n7h(adInfo)) == null) {
            strN7h = "";
        }
        sb.append(strN7h);
        sb.append("广告");
        return sb.toString();
    }

    @qrj
    /* JADX INFO: renamed from: y */
    public static final void m6531y(@InterfaceC7395n Context context, @InterfaceC7395n AdInfo adInfo, @InterfaceC7395n Map<String, String> map, boolean z2, @InterfaceC7395n Map<String, String> map2) {
        AdUtils.m6493p(context, adInfo, map, z2, map2);
    }

    @qrj
    public static final void zy(@InterfaceC7395n Context context, @InterfaceC7396q AdInfo info, boolean z2, @InterfaceC7396q Map<String, String> extraToAdDataDepartment, @InterfaceC7396q Map<String, String>... extra) {
        d2ok.m23075h(info, "info");
        d2ok.m23075h(extraToAdDataDepartment, "extraToAdDataDepartment");
        d2ok.m23075h(extra, "extra");
        AdUtils.m6492n(context, info, z2, extraToAdDataDepartment, (Map[]) Arrays.copyOf(extra, extra.length));
    }
}
