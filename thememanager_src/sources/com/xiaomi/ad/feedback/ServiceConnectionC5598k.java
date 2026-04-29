package com.xiaomi.ad.feedback;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.xiaomi.ad.feedback.IAdFeedbackService;

/* JADX INFO: renamed from: com.xiaomi.ad.feedback.k */
/* JADX INFO: compiled from: DislikeManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class ServiceConnectionC5598k implements ServiceConnection {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f31144g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ IAdFeedbackListener f31145k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f31146n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f31147q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ Context f31148y;

    ServiceConnectionC5598k(IAdFeedbackListener iAdFeedbackListener, String str, String str2, String str3, Context context) {
        this.f31145k = iAdFeedbackListener;
        this.f31147q = str;
        this.f31146n = str2;
        this.f31144g = str3;
        this.f31148y = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            try {
                IAdFeedbackService.Stub.asInterface(iBinder).showFeedbackWindowAndTrackResult(this.f31145k, this.f31147q, this.f31146n, this.f31144g);
            } catch (Exception e2) {
                Log.e("DislikeManager", "show dislike window exception", e2);
            }
        } finally {
            this.f31148y.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
