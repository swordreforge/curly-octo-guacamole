package com.xiaomi.ad.feedback;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.xiaomi.ad.feedback.IAdFeedbackService;
import java.util.List;

/* JADX INFO: compiled from: DislikeManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class toq implements ServiceConnection {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ List f31159g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IAdFeedbackListener f31160k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f31161n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f31162q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ Context f31163y;

    toq(IAdFeedbackListener iAdFeedbackListener, String str, String str2, List list, Context context) {
        this.f31160k = iAdFeedbackListener;
        this.f31162q = str;
        this.f31161n = str2;
        this.f31159g = list;
        this.f31163y = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            try {
                IAdFeedbackService.Stub.asInterface(iBinder).showFeedbackWindowAndTrackResultForMultiAds(this.f31160k, this.f31162q, this.f31161n, this.f31159g);
            } catch (Exception e2) {
                Log.e("DislikeManager", "show dislike window with passbacks exception", e2);
            }
        } finally {
            this.f31163y.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
