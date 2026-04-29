package com.android.thememanager.module.detail.util;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.ld6;
import ek5k.C6002g;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.util.n */
/* JADX INFO: compiled from: ResourceBuyHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2246n {

    /* JADX INFO: renamed from: k */
    private static final String f13148k = "ResourceBuyHelper";

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.util.n$k */
    /* JADX INFO: compiled from: ResourceBuyHelper.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo8356k(Resource resource, String result);
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.util.n$toq */
    /* JADX INFO: compiled from: ResourceBuyHelper.java */
    protected static class toq extends AbstractAsyncTaskC1713n<Void, Void, String> {

        /* JADX INFO: renamed from: g */
        private Resource f13149g;

        /* JADX INFO: renamed from: n */
        private k f13150n;

        /* JADX INFO: renamed from: q */
        private String f13151q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f60525zy;

        public toq(String uniqueId, String redeemCode, String onlineId, k callback) {
            super(uniqueId);
            this.f60525zy = redeemCode;
            this.f13151q = onlineId;
            this.f13150n = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String result) {
            super.onPostExecute(result);
            k kVar = this.f13150n;
            if (kVar != null) {
                kVar.mo8356k(this.f13149g, result);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... params) {
            if (TextUtils.isEmpty(this.f60525zy)) {
                return null;
            }
            try {
                return C1915g.f7l8(ld6.d3(this.f60525zy, this.f13151q));
            } catch (Exception e2) {
                Log.e(C2246n.f13148k, "ResourceExchangeTask request throw exception : " + e2);
                return null;
            }
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n
        /* JADX INFO: renamed from: q */
        protected final boolean mo6421q() {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m8372k(String uniqueId, String redeemCode, String onlineId, k callback) {
        new toq(uniqueId, redeemCode, onlineId, callback).executeOnExecutor(C6002g.x2(), new Void[0]);
    }
}
