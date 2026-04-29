package com.miui.unifiedAdSdk;

import com.miui.systemAdSolution.changeSkin.IChangeSkinService;
import com.miui.systemAdSolution.common.AdTrackType;
import com.miui.unifiedAdSdk.f7l8;
import com.xiaomi.ad.entity.common.C5586q;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.q */
/* JADX INFO: compiled from: RemoteUnifiedAdService.java */
/* JADX INFO: loaded from: classes3.dex */
class C5354q extends f7l8.AbstractRunnableC5350k<Void, Boolean> {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f29881g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C5586q f29882h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ long f29883i;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f29884n;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ long f29885p;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f29886s;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ AdTrackType f29887y;

    /* JADX INFO: renamed from: z */
    final /* synthetic */ f7l8 f29888z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5354q(f7l8 f7l8Var, Void r2, String str, String str2, AdTrackType adTrackType, String str3, long j2, C5586q c5586q, long j3) {
        super(r2);
        this.f29888z = f7l8Var;
        this.f29884n = str;
        this.f29881g = str2;
        this.f29887y = adTrackType;
        this.f29886s = str3;
        this.f29885p = j2;
        this.f29882h = c5586q;
        this.f29883i = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.miui.unifiedAdSdk.f7l8.AbstractRunnableC5350k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean toq(IChangeSkinService iChangeSkinService, Void r13) {
        return Boolean.valueOf(iChangeSkinService.doTrack(this.f29884n, this.f29881g, this.f29887y, this.f29886s, this.f29885p, this.f29882h.getId(), this.f29883i));
    }
}
