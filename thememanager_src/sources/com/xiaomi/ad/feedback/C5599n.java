package com.xiaomi.ad.feedback;

import android.content.Context;
import android.util.Log;
import com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.ad.feedback.n */
/* JADX INFO: compiled from: DislikeManagerV2.java */
/* JADX INFO: loaded from: classes3.dex */
class C5599n extends AbstractServiceConnectionC5349q<Void, IAdFeedbackService> {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ String f31149h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ List f31150i;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ String f31151p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ IAdFeedbackListener f31152s;

    /* JADX INFO: renamed from: z */
    final /* synthetic */ C5597g f31153z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5599n(C5597g c5597g, Context context, Class cls, IAdFeedbackListener iAdFeedbackListener, String str, String str2, List list) {
        super(context, cls);
        this.f31153z = c5597g;
        this.f31152s = iAdFeedbackListener;
        this.f31151p = str;
        this.f31149h = str2;
        this.f31150i = list;
    }

    @Override // com.miui.systemAdSolution.remoteMethodInvoker.AbstractServiceConnectionC5349q
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public Void mo18148p(IAdFeedbackService iAdFeedbackService) {
        try {
            iAdFeedbackService.showFeedbackWindowAndTrackResultForMultiAds(this.f31152s, this.f31151p, this.f31149h, this.f31150i);
            return null;
        } catch (Exception e2) {
            Log.e("DislikeManagerV2", "showDislikeWindows: ", e2);
            return null;
        }
    }
}
