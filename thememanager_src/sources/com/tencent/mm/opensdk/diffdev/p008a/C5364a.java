package com.tencent.mm.opensdk.diffdev.p008a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5364a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: Z */
    private AsyncTaskC5367d f29900Z;
    private Handler handler = null;

    /* JADX INFO: renamed from: Y */
    private List<OAuthListener> f29899Y = new ArrayList();
    private OAuthListener aa = new C5365b(this);

    /* JADX INFO: renamed from: c */
    static /* synthetic */ AsyncTaskC5367d m18242c(C5364a c5364a) {
        c5364a.f29900Z = null;
        return null;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void addListener(OAuthListener oAuthListener) {
        if (this.f29899Y.contains(oAuthListener)) {
            return;
        }
        this.f29899Y.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m18254i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m18252d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        addListener(oAuthListener);
        if (this.f29900Z != null) {
            Log.m18252d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC5367d asyncTaskC5367d = new AsyncTaskC5367d(str, str2, str3, str4, str5, this.aa);
        this.f29900Z = asyncTaskC5367d;
        asyncTaskC5367d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void detach() {
        Log.m18254i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f29899Y.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeAllListeners() {
        this.f29899Y.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeListener(OAuthListener oAuthListener) {
        this.f29899Y.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean stopAuth() {
        boolean zM18243q;
        Log.m18254i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            AsyncTaskC5367d asyncTaskC5367d = this.f29900Z;
            zM18243q = asyncTaskC5367d == null ? true : asyncTaskC5367d.m18243q();
        } catch (Exception e2) {
            Log.m18256w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e2.getMessage());
            zM18243q = false;
        }
        this.f29900Z = null;
        return zM18243q;
    }
}
