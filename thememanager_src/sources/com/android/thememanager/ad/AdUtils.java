package com.android.thememanager.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.view.activity.AdWebViewActivity;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.LocalAdInfo;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.module.detail.presenter.qrj;
import com.android.thememanager.view.LightingAnimationTextView;
import com.xiaomi.ad.feedback.IAdFeedbackListener;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y9n.C7780k;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class AdUtils {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f57367cdj = 4;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57368f7l8 = "theme_wallpaper_detail_group1";

    /* JADX INFO: renamed from: g */
    public static final String f9438g = "ad_font_group2";

    /* JADX INFO: renamed from: h */
    public static final int f9439h = 3;

    /* JADX INFO: renamed from: k */
    private static final String f9440k = "AdUtils";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f57369kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f57370ld6 = "ad_application_card_group3";

    /* JADX INFO: renamed from: n */
    public static final String f9441n = "ad_font_group1";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f57371n7h = 1;

    /* JADX INFO: renamed from: p */
    public static final String f9442p = "ad_application_card_group2";

    /* JADX INFO: renamed from: q */
    public static final String f9443q = "theme_detail_ad_button_group2";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f57372qrj = 0;

    /* JADX INFO: renamed from: s */
    public static final String f9444s = "ad_application_card_group1";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57373toq = ".apk";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57374x2 = "ad_application_card_group4";

    /* JADX INFO: renamed from: y */
    public static final String f9445y = "ad_application_card_control_group";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile List<InterfaceC1694q> f57375zy = new ArrayList();

    private static class AdFeedbackListener extends IAdFeedbackListener.Stub {
        private WeakReference<Activity> mActivity;
        private WeakReference<View> mAdCloseView;
        private String mAdId;
        private WeakReference<View> mAdInfoContainer;
        private WeakReference<TextView> mDiscountedPriceView;
        private WeakReference<ImageView> mImageView;
        private WeakReference<TextView> mPriceView;
        private int mRadius;
        private WeakReference<TextView> mTitleView;

        /* JADX INFO: renamed from: com.android.thememanager.ad.AdUtils$AdFeedbackListener$k */
        class RunnableC1635k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f9446k;

            RunnableC1635k(final int val$i) {
                this.f9446k = val$i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (((Activity) AdFeedbackListener.this.mActivity.get()) == null || this.f9446k < 0) {
                    return;
                }
                TextView textView = (TextView) AdFeedbackListener.this.mTitleView.get();
                View view = (View) AdFeedbackListener.this.mAdCloseView.get();
                TextView textView2 = (TextView) AdFeedbackListener.this.mPriceView.get();
                View view2 = (View) AdFeedbackListener.this.mAdInfoContainer.get();
                TextView textView3 = (TextView) AdFeedbackListener.this.mDiscountedPriceView.get();
                ImageView imageView = (ImageView) AdFeedbackListener.this.mImageView.get();
                if (textView != null) {
                    textView.setVisibility(4);
                }
                if (view != null) {
                    view.setVisibility(4);
                }
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                if (imageView != null) {
                    Context context = imageView.getContext();
                    x2.m6778n(context instanceof Activity ? (Activity) context : null, "", imageView, R.drawable.ad_closed_bg, AdFeedbackListener.this.mRadius);
                    C1812k.m7106k(imageView, R.string.ad_close);
                }
                Iterator it = AdUtils.f57375zy.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1694q) it.next()).mo6510s(AdFeedbackListener.this.mAdId);
                }
                AdDislikeManager.m6595g().m6599y(AdFeedbackListener.this.mAdId);
            }
        }

        public AdFeedbackListener(Activity activity, TextView titleView, View adCloseView, TextView priceView, View adInfoContainer, TextView discountedPriceView, ImageView imageView, int radius, String adId) {
            this.mActivity = new WeakReference<>(activity);
            this.mTitleView = new WeakReference<>(titleView);
            this.mAdCloseView = new WeakReference<>(adCloseView);
            this.mPriceView = new WeakReference<>(priceView);
            this.mAdInfoContainer = new WeakReference<>(adInfoContainer);
            this.mDiscountedPriceView = new WeakReference<>(discountedPriceView);
            this.mImageView = new WeakReference<>(imageView);
            this.mAdId = adId;
            this.mRadius = radius;
        }

        @Override // com.xiaomi.ad.feedback.IAdFeedbackListener
        public void onFinished(int i2) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1635k(i2));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ad.AdUtils$k */
    class ViewOnClickListenerC1636k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f9448k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Map[] f9449n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AdInfo f9450q;

        ViewOnClickListenerC1636k(final Activity val$activity, final AdInfo val$adInfo, final Map[] val$extra) {
            this.f9448k = val$activity;
            this.f9450q = val$adInfo;
            this.f9449n = val$extra;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AdUtils.m6488g(this.f9448k, this.f9450q, this.f9449n);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ad.AdUtils$n */
    class RunnableC1637n implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f9451g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f9452k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f9453n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f9454q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f9455y;

        RunnableC1637n(final View val$view, final int val$top, final int val$bottom, final int val$left, final int val$right) {
            this.f9452k = val$view;
            this.f9454q = val$top;
            this.f9453n = val$bottom;
            this.f9451g = val$left;
            this.f9455y = val$right;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f9452k.setEnabled(true);
            this.f9452k.getHitRect(rect);
            rect.top -= this.f9454q;
            rect.bottom += this.f9453n;
            rect.left -= this.f9451g;
            rect.right += this.f9455y;
            TouchDelegate touchDelegate = new TouchDelegate(rect, this.f9452k);
            if (this.f9452k.getParent() instanceof View) {
                ((View) this.f9452k.getParent()).setTouchDelegate(touchDelegate);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ad.AdUtils$q */
    class ViewOnClickListenerC1638q implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ TextView f9456g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f9457h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ AdInfo f9458i;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f9459k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f9460n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ ImageView f9461p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ TextView f9462q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ TextView f9463s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ View f9464y;

        ViewOnClickListenerC1638q(final Activity val$activity, final TextView val$titleView, final View val$adCloseView, final TextView val$priceView, final View val$adInfoContainer, final TextView val$discountedPriceView, final ImageView val$imageView, final int val$radius, final AdInfo val$adInfo) {
            this.f9459k = val$activity;
            this.f9462q = val$titleView;
            this.f9460n = val$adCloseView;
            this.f9456g = val$priceView;
            this.f9464y = val$adInfoContainer;
            this.f9463s = val$discountedPriceView;
            this.f9461p = val$imageView;
            this.f9457h = val$radius;
            this.f9458i = val$adInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AdDislikeManager.m6595g().m6598q(new AdFeedbackListener(this.f9459k, this.f9462q, this.f9460n, this.f9456g, this.f9464y, this.f9463s, this.f9461p, this.f9457h, this.f9458i.tagId), this.f9458i.ex);
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("trackId", this.f9458i.tagId);
            arrayMap.put("content", "close_ad");
            C1706p.ki(arrayMap);
            C1708s.f7l8().ld6().ni7(arrayMap);
        }
    }

    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ TextView f9465g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f9466h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ AdInfo f9467i;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f9468k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f9469n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ ImageView f9470p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ TextView f9471q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ TextView f9472s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ View f9473y;

        toq(final Activity val$activity, final TextView val$titleView, final View val$adCloseView, final TextView val$priceView, final View val$adInfoContainer, final TextView val$discountedPriceView, final ImageView val$imageView, final int val$radius, final AdInfo val$adInfo) {
            this.f9468k = val$activity;
            this.f9471q = val$titleView;
            this.f9469n = val$adCloseView;
            this.f9465g = val$priceView;
            this.f9473y = val$adInfoContainer;
            this.f9472s = val$discountedPriceView;
            this.f9470p = val$imageView;
            this.f9466h = val$radius;
            this.f9467i = val$adInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AdDislikeManager.m6595g().m6598q(new AdFeedbackListener(this.f9468k, this.f9471q, this.f9469n, this.f9465g, this.f9473y, this.f9472s, this.f9470p, this.f9466h, this.f9467i.tagId), this.f9467i.ex);
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("trackId", this.f9467i.tagId);
            arrayMap.put("content", "close_ad");
            C1706p.ki(arrayMap);
            C1708s.f7l8().ld6().ni7(arrayMap);
        }
    }

    class zy implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f9474k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Map[] f9475n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AdInfo f9476q;

        zy(final Activity val$activity, final AdInfo val$adInfo, final Map[] val$extra) {
            this.f9474k = val$activity;
            this.f9476q = val$adInfo;
            this.f9475n = val$extra;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AdUtils.m6488g(this.f9474k, this.f9476q, this.f9475n);
        }
    }

    private static void a9(Context context, AdInfo info) {
        C1708s.f7l8().x2(4001).x2(info);
        if (a9.kja0(context, info.packageName)) {
            C1708s.f7l8().x2(4001).mo6668i(info);
        } else {
            C1708s.f7l8().x2(4001).oc(info);
        }
    }

    public static void cdj(final Activity activity, final View adCloseView, final AdInfo adInfo, final String tagId) {
        if (adCloseView != null) {
            if (AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
                adCloseView.setVisibility(8);
                return;
            }
            adCloseView.setVisibility(0);
            C6077k.f7l8(adCloseView);
            adCloseView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.ad.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdUtils.jk(activity, adCloseView, tagId, adInfo, view);
                }
            });
        }
    }

    public static void f7l8(@lvui Context context, @lvui AdInfo info, boolean isViewHolder, boolean reportToAdDataDepartment, Map<String, String> extraToAdDataDepartment, Map<String, String>... extras) {
        int i2;
        C1708s.f7l8().x2(4001).t8r(LocalAdInfo.builder(info).isViewHolderInfo(isViewHolder).build(), (extras == null || extras.length <= 0) ? null : extras[0], reportToAdDataDepartment, extraToAdDataDepartment);
        boolean zM6496t = m6496t(info.packageName);
        if (TextUtils.isEmpty(info.deeplink) || ((((i2 = info.targetType) == 2 || i2 == 4) && !zM6496t) || !n7h(context, info))) {
            if (!wvg(info)) {
                ld6(context, info, false);
            } else if (zM6496t) {
                a9(context, info);
            } else {
                com.android.thememanager.basemodule.ad.zy.zy().m6603k(context, info);
            }
        }
    }

    public static String fn3e(Context context, AdInfo info) {
        return info == null ? "" : com.android.thememanager.basemodule.utils.x2.m7238k(context, info.allDownloadNum);
    }

    public static void fti(Context context, String url) {
        if (TextUtils.isEmpty(url) || context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AdWebViewActivity.class);
        intent.putExtra("extra_url", url);
        context.startActivity(intent);
    }

    public static String fu4(AdInfo info) {
        if (info == null) {
            return "";
        }
        int i2 = info.targetType;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return "";
                    }
                }
            }
            return !TextUtils.isEmpty(info.appName) ? info.appName : info.title;
        }
        return !TextUtils.isEmpty(info.source) ? info.source : info.title;
    }

    /* JADX INFO: renamed from: g */
    public static void m6488g(Context context, @lvui AdInfo info, Map<String, String>... extras) {
        m6492n(context, info, false, null, extras);
    }

    public static void gvn7(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        view.getLayoutParams().width = (int) (r2.getDisplayMetrics().widthPixels - (context.getResources().getDimension(R.dimen.de_detail_new_ad_card_edge_padding) * 2.0f));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 1;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6489h(final Activity activity, final AdInfo adInfo, final ImageView thumbnailImageView, final ImageView iconImageView, final int coverRadius, final int iconRadius, final TextView titleView, final Map<String, String>... extra) {
        boolean zF7l8 = AdDislikeManager.m6595g().f7l8(adInfo.tagId);
        if (thumbnailImageView != null) {
            if (zF7l8) {
                x2.m6778n(activity, "", thumbnailImageView, R.drawable.ad_closed_bg, coverRadius);
            } else {
                ArrayList<String> arrayList = adInfo.imgUrls;
                if (arrayList != null && arrayList.size() > 0) {
                    float f2 = coverRadius;
                    x2.m6782y(activity, adInfo.imgUrls.get(0), thumbnailImageView, x2.fn3e().m6793r(x2.ki(x2.x2(), f2)).x9kr((int) adInfo.width, (int) adInfo.height).m6794t(f2).a9(false));
                }
            }
            C6077k.o1t(thumbnailImageView);
            C1812k.toq(thumbnailImageView, C1653q.x2(adInfo));
            thumbnailImageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.ad.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdUtils.m6492n(activity, adInfo, true, null, extra);
                }
            });
        }
        if (titleView != null) {
            String strFu4 = fu4(adInfo);
            titleView.setVisibility(zF7l8 ? 4 : 0);
            titleView.setText(strFu4);
        }
        if (iconImageView == null) {
            return true;
        }
        if (zF7l8) {
            x2.m6778n(activity, "", iconImageView, R.drawable.ad_closed_bg, iconRadius);
        } else {
            String str = adInfo.iconUrl;
            if (str != null) {
                float f3 = iconRadius;
                x2.m6782y(activity, str, iconImageView, x2.fn3e().m6793r(x2.ki(x2.x2(), f3)).m6794t(f3).a9(false));
            }
        }
        C1812k.toq(iconImageView, C1653q.x2(adInfo));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static String m6490i(String taskId) {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + taskId + f57373toq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void jk(Activity activity, View view, String str, AdInfo adInfo, View view2) {
        AdDislikeManager.m6595g().m6598q(new AdFeedbackListener(activity, null, view, null, null, null, null, 0, str), adInfo.ex);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("trackId", str);
        arrayMap.put("content", "close_ad");
        C1706p.ki(arrayMap);
        C1708s.f7l8().ld6().ni7(arrayMap);
    }

    public static void jp0y(InterfaceC1694q listener) {
        f57375zy.remove(listener);
    }

    public static void ki(final View view, final int left, final int top, final int right, final int bottom) {
        ((View) view.getParent()).post(new RunnableC1637n(view, top, bottom, left, right));
    }

    public static boolean kja0(final Activity activity, final AdInfo adInfo, final View adInfoContainer, final ImageView imageView, final TextView categoryView, final TextView downloadNumberView, final TextView apkSize, final int radius, final TextView titleView, final TextView priceView, final TextView discountedPriceView, Map<String, String>... extra) {
        int i2;
        String str;
        if (adInfoContainer == null) {
            return false;
        }
        if (adInfo == null) {
            adInfoContainer.setVisibility(8);
            return false;
        }
        boolean zF7l8 = AdDislikeManager.m6595g().f7l8(adInfo.tagId);
        if (zF7l8) {
            adInfoContainer.setVisibility(8);
        } else {
            adInfoContainer.setVisibility(0);
        }
        View viewFindViewById = adInfoContainer.findViewById(R.id.ad_close_btn);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.detail_ad_view_close_btn_enlarge_click_distance);
        ki(viewFindViewById, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (imageView != null && (str = adInfo.iconUrl) != null) {
            x2.m6782y(activity, str, imageView, x2.fn3e().m6793r(x2.ki(x2.x2(), 0.0f)));
        }
        adInfoContainer.setOnClickListener(new zy(activity, adInfo, extra));
        if (titleView != null) {
            String strFu4 = fu4(adInfo);
            if (TextUtils.isEmpty(strFu4) || zF7l8) {
                titleView.setVisibility(8);
            } else {
                titleView.setText(strFu4);
                titleView.setVisibility(0);
            }
        }
        if (priceView != null) {
            String strNi7 = ni7(adInfo);
            priceView.setVisibility(zF7l8 ? 4 : 0);
            priceView.setText(strNi7);
        }
        if (discountedPriceView != null) {
            discountedPriceView.setVisibility(8);
        }
        if (viewFindViewById == null) {
            i2 = 8;
        } else if (AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
            viewFindViewById.setVisibility(8);
            i2 = 8;
        } else {
            viewFindViewById.setVisibility(0);
            C6077k.f7l8(viewFindViewById);
            i2 = 8;
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC1638q(activity, titleView, viewFindViewById, priceView, adInfoContainer, discountedPriceView, imageView, radius, adInfo));
        }
        if (TextUtils.isEmpty(adInfo.parameters.categoryTop) && TextUtils.isEmpty(adInfo.categoryName) && categoryView != null) {
            adInfoContainer.findViewById(R.id.app_info).setVisibility(i2);
            return true;
        }
        if (categoryView != null) {
            categoryView.setText(TextUtils.isEmpty(adInfo.parameters.categoryTop) ? adInfo.categoryName : adInfo.parameters.categoryTop);
        }
        if (downloadNumberView != null) {
            downloadNumberView.setText(fn3e(activity, adInfo));
        }
        if (apkSize != null) {
            apkSize.setText(t8r(adInfo));
        }
        return true;
    }

    private static void ld6(Context context, AdInfo info, boolean forceBroswer) {
        if (TextUtils.isEmpty(info.landingPageUrl)) {
            Log.e(f9440k, "landingPageUrl is null");
            return;
        }
        try {
            context.startActivity((!mcp.m7140q(Uri.parse(info.landingPageUrl)) || forceBroswer) ? x9kr.zy(info.landingPageUrl) : com.android.thememanager.toq.m9541i(context, info.title, info.landingPageUrl));
        } catch (Exception e2) {
            C7794k.m28196p(f9440k, "dealLandingPage happens error" + e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6492n(Context context, @lvui AdInfo info, boolean reportToAdDataDepartment, Map<String, String> extraToAdDataDepartment, Map<String, String>... extras) {
        if (AdDislikeManager.m6595g().f7l8(info.tagId)) {
            return;
        }
        Map<String, String> map = null;
        if (extras != null && extras.length > 0) {
            map = extras[0];
        }
        C1708s.f7l8().x2(4001).t8r(info, map, reportToAdDataDepartment, extraToAdDataDepartment);
        x2(context, info);
    }

    public static boolean n7h(Context context, AdInfo info) {
        C1708s.f7l8().x2(4001).ki(info);
        try {
            Intent uri = Intent.parseUri(info.deeplink, 0);
            if (!TextUtils.isEmpty(info.packageName)) {
                uri.setPackage(info.packageName);
            }
            uri.addFlags(268435456);
            context.startActivity(uri);
            C1708s.f7l8().x2(4001).toq(info);
            return true;
        } catch (Exception e2) {
            C7794k.m28196p(f9440k, "dealWithDeeplink happens error" + e2);
            C1708s.f7l8().x2(4001).mo6676y(info);
            if (TextUtils.isEmpty(info.packageName) || !m6496t(info.packageName)) {
                return false;
            }
            C1708s.f7l8().x2(4001).x2(info);
            boolean zKja0 = a9.kja0(context, info.packageName);
            if (zKja0) {
                C1708s.f7l8().x2(4001).mo6668i(info);
            } else {
                C1708s.f7l8().x2(4001).oc(info);
            }
            return zKja0;
        }
    }

    public static String ni7(AdInfo info) {
        return info == null ? "" : info.summary;
    }

    public static com.android.thememanager.ad.download.controller.toq o1t(Activity activity, View adView, AdInfo adInfo, String adEid, boolean isVisibleForUser, qrj presenter) {
        TextView textView;
        TextView textView2;
        int dimensionPixelSize;
        TextView textView3;
        if (activity == null || adView == null || adInfo == null) {
            return null;
        }
        ImageView imageView = (ImageView) adView.findViewById(R.id.app_icon);
        TextView textView4 = (TextView) adView.findViewById(R.id.ad_title);
        TextView textView5 = (TextView) adView.findViewById(R.id.ad_subtitle);
        TextView textView6 = (TextView) adView.findViewById(R.id.download_button);
        AdSubTextView adSubTextView = (AdSubTextView) adView.findViewById(R.id.ad_textview);
        if (f57370ld6.equals(adEid) || f57374x2.equals(adEid)) {
            TextView textView7 = (TextView) adView.findViewById(R.id.ad_category);
            textView = (TextView) adView.findViewById(R.id.download_num);
            textView2 = (TextView) adView.findViewById(R.id.app_size);
            dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.element_ad_detail_test_three_app_icon_radius);
            textView3 = textView7;
        } else {
            textView3 = null;
            textView = null;
            textView2 = null;
            dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.element_ad_detail_test_one_app_icon_radius);
        }
        gvn7(activity, adView);
        kja0(activity, adInfo, adView, imageView, textView3, textView, textView2, dimensionPixelSize, textView4, textView5, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
        if (isVisibleForUser) {
            if (presenter != null) {
                presenter.d2ok();
            }
            if ((f9442p.equals(adEid) || f57374x2.equals(adEid)) && (textView6 instanceof LightingAnimationTextView)) {
                ((LightingAnimationTextView) textView6).n7h(1000);
            }
        }
        C6077k.o1t(adView);
        C1812k.toq(adView, C1653q.x2(adInfo));
        return new com.android.thememanager.ad.download.controller.toq(textView6, adSubTextView, adInfo, true, true);
    }

    /* JADX INFO: renamed from: p */
    public static void m6493p(Context context, AdInfo info, Map<String, String> extra, boolean reportToAdDataDepartment, Map<String, String> extraToAdDataDepartment) {
        if (info == null || context == null) {
            return;
        }
        if (!wvg(info)) {
            m6497y(context, info, true, extra);
            return;
        }
        C1708s.f7l8().x2(4001).t8r(LocalAdInfo.builder(info).isViewHolderInfo(true).build(), extra, reportToAdDataDepartment, extraToAdDataDepartment);
        if (m6496t(info.packageName)) {
            a9(context, info);
            return;
        }
        if (TextUtils.isEmpty(info.actionUrl)) {
            Log.e(f9440k, "actionUrl is null");
        } else if (info.actionUrl.startsWith("https") || info.actionUrl.startsWith("http")) {
            fti(context, info.actionUrl);
        } else {
            ld6(context, info, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m6494q(InterfaceC1694q listener) {
        f57375zy.add(listener);
    }

    public static boolean qrj(final Activity activity, final AdInfo adInfo, final View adInfoContainer, final ImageView imageView, final int radius, final TextView titleView, final TextView priceView, final TextView discountedPriceView, Map<String, String>... extra) {
        if (adInfoContainer == null) {
            return false;
        }
        if (adInfo == null) {
            adInfoContainer.setVisibility(8);
            return false;
        }
        boolean zF7l8 = AdDislikeManager.m6595g().f7l8(adInfo.tagId);
        if (zF7l8) {
            adInfoContainer.setVisibility(8);
        } else {
            adInfoContainer.setVisibility(0);
        }
        View viewFindViewById = adInfoContainer.findViewById(R.id.ad_close_btn);
        View viewFindViewById2 = adInfoContainer.findViewById(R.id.download_tip);
        if (imageView != null) {
            if (zF7l8) {
                x2.m6778n(activity, "", imageView, R.drawable.ad_closed_bg, 0);
            } else {
                ArrayList<String> arrayList = adInfo.imgUrls;
                if (arrayList != null && arrayList.size() > 0) {
                    x2.m6782y(activity, adInfo.imgUrls.get(0), imageView, x2.fn3e().m6793r(x2.ki(x2.x2(), 0.0f)).x9kr((int) adInfo.width, (int) adInfo.height).a9(false));
                }
            }
            imageView.setOnClickListener(new ViewOnClickListenerC1636k(activity, adInfo, extra));
        }
        if (titleView != null) {
            String strFu4 = fu4(adInfo);
            titleView.setVisibility(zF7l8 ? 4 : 0);
            titleView.setText(strFu4);
        }
        if (priceView != null) {
            String strNi7 = C1653q.m6525h(adInfo.dspName) ? adInfo.title : ni7(adInfo);
            priceView.setVisibility(zF7l8 ? 4 : 0);
            priceView.setText(strNi7);
        }
        if (discountedPriceView != null) {
            discountedPriceView.setVisibility(8);
        }
        if (viewFindViewById != null) {
            if (AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
                C6077k.f7l8(viewFindViewById);
                viewFindViewById.setOnClickListener(new toq(activity, titleView, viewFindViewById, priceView, adInfoContainer, discountedPriceView, imageView, radius, adInfo));
            }
        }
        if (viewFindViewById2 == null) {
            return true;
        }
        viewFindViewById2.setVisibility(wvg(adInfo) ? 0 : 4);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static void m6495s(Context context, AdInfo info, Map<String, String> extra) {
        m6493p(context, info, extra, false, null);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m6496t(String packageName) {
        try {
            bf2.toq.toq().getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static String t8r(AdInfo adInfo) {
        return adInfo == null ? "" : com.android.thememanager.basemodule.utils.x2.toq(adInfo.apkSize);
    }

    public static boolean wvg(AdInfo info) {
        if (info == null) {
            return false;
        }
        return !TextUtils.isEmpty(info.packageName);
    }

    private static void x2(Context context, @lvui AdInfo info) {
        if (TextUtils.isEmpty(info.deeplink) || ((wvg(info) && !m6496t(info.packageName)) || !n7h(context, info))) {
            if (!wvg(info)) {
                ld6(context, info, false);
                return;
            }
            if (m6496t(info.packageName)) {
                a9(context, info);
                return;
            }
            AdInfo.Parameters parameters = info.parameters;
            if (parameters != null) {
                int i2 = parameters.landingPageType;
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3 || i2 == 5) {
                        ld6(context, info, true);
                        return;
                    } else if (i2 != 6) {
                        ld6(context, info, true);
                        return;
                    }
                }
                fti(context, info.landingPageUrl);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m6497y(@lvui Context context, @lvui AdInfo info, boolean isViewHolder, Map<String, String>... extras) {
        f7l8(context, info, isViewHolder, false, null, extras);
    }

    /* JADX INFO: renamed from: z */
    public static View m6498z(View rootView, String adEid) {
        ViewStub viewStub = (ViewStub) rootView.findViewById(R.id.ad_stub);
        if (viewStub == null) {
            return null;
        }
        if (f57370ld6.equals(adEid) || f57374x2.equals(adEid)) {
            viewStub.setLayoutResource(R.layout.detail_ad_view_with_rank);
        } else {
            viewStub.setLayoutResource(R.layout.detail_ad_view);
        }
        return viewStub.inflate();
    }

    public static int zurt(String adEid) {
        return (int) (((TextUtils.isEmpty(adEid) || f9445y.equals(adEid)) ? 0.3976f : (f9444s.equals(adEid) || f9442p.equals(adEid)) ? 0.545f : 0.51f) * y9n.fn3e().y);
    }
}
