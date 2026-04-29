package com.android.thememanager.basemodule.ad;

import android.app.Activity;
import android.content.SharedPreferences;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.google.gson.C4871g;
import com.xiaomi.ad.feedback.C5597g;
import com.xiaomi.ad.feedback.IAdFeedbackListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AdDislikeManager {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f57449f7l8 = "ad_dislike_info";

    /* JADX INFO: renamed from: g */
    private static final String f9664g = "ad_dislike_pref";

    /* JADX INFO: renamed from: n */
    private static final long f9665n = 86400000;

    /* JADX INFO: renamed from: q */
    private static final String f9666q = "AdDislikeManager";

    /* JADX INFO: renamed from: s */
    private static final String f9667s = "com.miui.systemAdSolution";

    /* JADX INFO: renamed from: y */
    private static final String f9668y = m6597n();

    /* JADX INFO: renamed from: k */
    private SharedPreferences f9669k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private SharedPreferences.Editor f57450toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C1692k f57451zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.ad.AdDislikeManager$1 */
    class BinderC16901 extends IAdFeedbackListener.Stub {
        final /* synthetic */ AdInfo val$adInfo;
        final /* synthetic */ WeakReference val$refCallback;
        final /* synthetic */ WeakReference val$reference;

        BinderC16901(final WeakReference val$reference, final AdInfo val$adInfo, final WeakReference val$refCallback) {
            this.val$reference = val$reference;
            this.val$adInfo = val$adInfo;
            this.val$refCallback = val$refCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFinished$0(AdInfo adInfo, WeakReference weakReference, int i2) {
            IAdFeedbackListener.Stub stub;
            AdDislikeManager.this.f57451zy.f9671k.put(adInfo.tagId, Long.valueOf(System.currentTimeMillis()));
            AdDislikeManager.this.f57450toq.putString(AdDislikeManager.f57449f7l8, new C4871g().o1t(AdDislikeManager.this.f57451zy));
            AdDislikeManager.this.f57450toq.apply();
            if (weakReference == null || (stub = (IAdFeedbackListener.Stub) weakReference.get()) == null) {
                return;
            }
            stub.onFinished(i2);
        }

        @Override // com.xiaomi.ad.feedback.IAdFeedbackListener
        public void onFinished(final int resultCode) {
            Activity activity = (Activity) this.val$reference.get();
            if (resultCode <= 0 || activity == null) {
                return;
            }
            final AdInfo adInfo = this.val$adInfo;
            final WeakReference weakReference = this.val$refCallback;
            activity.runOnUiThread(new Runnable() { // from class: com.android.thememanager.basemodule.ad.toq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9673k.lambda$onFinished$0(adInfo, weakReference, resultCode);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.ad.AdDislikeManager$k */
    private static class C1691k {

        /* JADX INFO: renamed from: k */
        private static AdDislikeManager f9670k = new AdDislikeManager(null);

        private C1691k() {
        }
    }

    /* synthetic */ AdDislikeManager(BinderC16901 binderC16901) {
        this();
    }

    /* JADX INFO: renamed from: g */
    public static AdDislikeManager m6595g() {
        return C1691k.f9670k;
    }

    /* JADX INFO: renamed from: n */
    private static String m6597n() {
        return bf2.toq.zy() == 1 ? "systemadsolution_commonadeventsstaging" : "systemadsolution_commonadevents";
    }

    public boolean f7l8(String adTagId) {
        Long l2 = this.f57451zy.f9671k.get(adTagId);
        return l2 != null && System.currentTimeMillis() - l2.longValue() < 86400000;
    }

    /* JADX INFO: renamed from: q */
    public void m6598q(IAdFeedbackListener.Stub listener, String adEx) {
        C5597g.toq(bf2.toq.toq()).m19220q(listener, "com.miui.systemAdSolution", f9668y, adEx);
    }

    /* JADX INFO: renamed from: y */
    public void m6599y(String adId) {
        if (this.f57451zy == null || p029m.zy.toq(adId)) {
            return;
        }
        this.f57451zy.f9671k.put(adId, Long.valueOf(System.currentTimeMillis()));
        this.f57450toq.putString(f57449f7l8, new C4871g().o1t(this.f57451zy));
        this.f57450toq.apply();
    }

    @Deprecated
    public void zy(Activity activity, final AdInfo adInfo, IAdFeedbackListener.Stub callback) {
        C5597g.toq(activity.getApplicationContext()).m19220q(new BinderC16901(new WeakReference(activity), adInfo, new WeakReference(callback)), "com.miui.systemAdSolution", f9668y, adInfo.ex);
    }

    private AdDislikeManager() {
        C1692k c1692k;
        C1692k c1692k2;
        SharedPreferences sharedPreferences = bf2.toq.toq().getSharedPreferences(f9664g, 0);
        this.f9669k = sharedPreferences;
        this.f57450toq = sharedPreferences.edit();
        try {
            c1692k2 = (C1692k) new C4871g().n7h(this.f9669k.getString(f57449f7l8, ""), C1692k.class);
            this.f57451zy = c1692k2;
        } catch (Exception unused) {
            if (this.f57451zy != null) {
                return;
            } else {
                c1692k = new C1692k();
            }
        } catch (Throwable th) {
            if (this.f57451zy == null) {
                this.f57451zy = new C1692k();
            }
            throw th;
        }
        if (c1692k2 == null) {
            c1692k = new C1692k();
            this.f57451zy = c1692k;
        }
    }
}
