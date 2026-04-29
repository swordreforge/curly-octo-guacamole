package com.android.thememanager.h5.feature;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.controller.online.fu4;
import com.android.thememanager.h5.feature.FeatureHelper;
import ek5k.C6002g;
import java.util.Map;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;

/* JADX INFO: loaded from: classes2.dex */
public class AccountFeature implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f12032g = "registerAccountListener";

    /* JADX INFO: renamed from: k */
    private static final String f12033k = "AccountFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12034n = "initAccountInfo";

    /* JADX INFO: renamed from: q */
    private static final String f12035q = "login";

    /* JADX INFO: renamed from: y */
    private static final String f12036y = "unregisterAccountListener";

    public static class LoginAsyncTask extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private C1688q f12038k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C7148k f60275toq;

        public LoginAsyncTask(C1688q loginManager, C7148k callback) {
            this.f12038k = loginManager;
            this.f60275toq = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] params) {
            this.f12038k.m6588r();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void result) {
            if (this.f12038k.x2() == null) {
                this.f60275toq.m25906k(new o1t(200, "abnormal account"));
            } else {
                fu4.m7547q();
                this.f60275toq.m25906k(new o1t(0));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private o1t m7921k(final C7156z request) {
        C1688q c1688qCdj = C1688q.cdj();
        if (c1688qCdj.wvg()) {
            if (!c1688qCdj.o1t()) {
                c1688qCdj.m6588r();
            }
            fu4.m7547q();
        }
        return new o1t(0);
    }

    /* JADX INFO: renamed from: q */
    private o1t m7922q(C7156z request) {
        return new o1t(0);
    }

    private o1t toq(final C7156z request) {
        final C1688q c1688qCdj = C1688q.cdj();
        C1688q.cdj().fti(request.zy().toq(), new C1688q.n() { // from class: com.android.thememanager.h5.feature.AccountFeature.1
            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
                request.toq().m25906k(new o1t(200, "login fail"));
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                if (c1688qCdj.x2() == null) {
                    new LoginAsyncTask(c1688qCdj, request.toq()).executeOnExecutor(C6002g.ld6(), new Void[0]);
                } else {
                    fu4.m7547q();
                    request.toq().m25906k(new o1t(0));
                }
            }
        });
        return new o1t(3);
    }

    private o1t zy(final C7156z request) {
        o1t o1tVarBuildDataResponse = FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(1, new FeatureHelper.EmptyJSONConvertibleData()), f12033k);
        request.toq().m25906k(o1tVarBuildDataResponse);
        return o1tVarBuildDataResponse;
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), "login")) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12034n)) {
            return n7h.EnumC7150k.ASYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12032g)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12036y)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(final C7156z request) {
        return TextUtils.equals(request.m25920k(), "login") ? toq(request) : TextUtils.equals(request.m25920k(), f12034n) ? m7921k(request) : TextUtils.equals(request.m25920k(), f12032g) ? zy(request) : TextUtils.equals(request.m25920k(), f12036y) ? m7922q(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
