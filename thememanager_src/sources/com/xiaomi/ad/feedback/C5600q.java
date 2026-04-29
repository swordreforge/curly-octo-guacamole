package com.xiaomi.ad.feedback;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;

/* JADX INFO: renamed from: com.xiaomi.ad.feedback.q */
/* JADX INFO: compiled from: DislikeManagerV2.java */
/* JADX INFO: loaded from: classes3.dex */
class C5600q extends AbstractServiceConnectionC5349q<Void, IAdFeedbackService> {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ String f31154h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ String f31155i;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ String f31156p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ IAdFeedbackListener f31157s;

    /* JADX INFO: renamed from: z */
    final /* synthetic */ C5597g f31158z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5600q(C5597g c5597g, Context context, Class cls, IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3) {
        super(context, cls);
        this.f31158z = c5597g;
        this.f31157s = iAdFeedbackListener;
        this.f31156p = str;
        this.f31154h = str2;
        this.f31155i = str3;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(IAdFeedbackService iAdFeedbackService) {
        try {
            iAdFeedbackService.showFeedbackWindowAndTrackResult(this.f31157s, this.f31156p, this.f31154h, this.f31155i);
            return null;
        } catch (Exception e2) {
            Log.e("DislikeManagerV2", "showDislikeWindows: ", e2);
            return null;
        }
    }
}
