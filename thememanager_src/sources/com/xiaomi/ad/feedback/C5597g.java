package com.xiaomi.ad.feedback;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import m2t.C6794k;

/* JADX INFO: renamed from: com.xiaomi.ad.feedback.g */
/* JADX INFO: compiled from: DislikeManagerV2.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5597g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73029toq = "DislikeManagerV2";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C5597g f73030zy;

    /* JADX INFO: renamed from: k */
    private Context f31143k;

    private C5597g(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f31143k = applicationContext;
        if (applicationContext == null) {
            this.f31143k = context;
        }
    }

    /* JADX INFO: renamed from: k */
    private Intent m19218k() {
        Intent intent = new Intent("miui.intent.action.ad.FEEDBACK_SERVICE");
        intent.setPackage(C6794k.f38036k);
        return intent;
    }

    public static C5597g toq(Context context) {
        if (f73030zy == null) {
            synchronized (C5597g.class) {
                if (f73030zy == null) {
                    f73030zy = new C5597g(context);
                }
            }
        }
        return f73030zy;
    }

    private boolean zy() {
        List<ResolveInfo> listQueryIntentServices = this.f31143k.getPackageManager().queryIntentServices(m19218k(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public void m19219n(IAdFeedbackListener iAdFeedbackListener, String str, String str2, List<String> list) {
        if (zy()) {
            new C5599n(this, this.f31143k, IAdFeedbackService.class, iAdFeedbackListener, str, str2, list).x2(m19218k());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19220q(IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3) {
        if (zy()) {
            new C5600q(this, this.f31143k, IAdFeedbackService.class, iAdFeedbackListener, str, str2, str3).x2(m19218k());
        }
    }
}
