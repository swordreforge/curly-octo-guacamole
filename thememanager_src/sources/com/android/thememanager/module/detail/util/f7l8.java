package com.android.thememanager.module.detail.util;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.controller.x2;
import com.android.thememanager.fu4;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import miui.drm.DrmManager;

/* JADX INFO: compiled from: ResourceRightsHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.util.f7l8$k */
    /* JADX INFO: compiled from: ResourceRightsHelper.java */
    public interface InterfaceC2242k {
        /* JADX INFO: renamed from: k */
        void mo8358k(Resource resource, DrmManager.DrmResult result);
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.util.f7l8$q */
    /* JADX INFO: compiled from: ResourceRightsHelper.java */
    protected static class AsyncTaskC2243q extends AsyncTask<Void, Void, zy.C7914zy> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private WeakReference<zy> f60520f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f13140g;

        /* JADX INFO: renamed from: k */
        private int f13141k;

        /* JADX INFO: renamed from: n */
        private int f13142n;

        /* JADX INFO: renamed from: q */
        String f13143q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.android.thememanager.controller.online.zy f60521toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Resource f60522zy;

        public AsyncTaskC2243q(int applyType, com.android.thememanager.controller.online.zy service, Resource resource, String productType, zy callback) {
            this(applyType, service, resource, productType, 1, callback);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public zy.C7914zy doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            zy.C7914zy c7914zy = new zy.C7914zy(com.android.thememanager.controller.online.zy.f57986kja0);
            while (true) {
                int i2 = this.f13141k;
                this.f13141k = i2 - 1;
                if (i2 <= 0 || c7914zy.m7664n() == 100000 || c7914zy.m7664n() == 100006 || c7914zy.m7664n() == 100007) {
                    break;
                }
                c7914zy = this.f60521toq.m7658k(this.f60522zy, this.f13142n, this.f13143q, this.f13140g);
            }
            return c7914zy;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.f13140g = C1688q.cdj().o1t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(zy.C7914zy result) {
            zy zyVar = this.f60520f7l8.get();
            if (zyVar != null) {
                zyVar.mo8354k(this.f60522zy, result);
            }
        }

        public AsyncTaskC2243q(int applyType, com.android.thememanager.controller.online.zy service, Resource resource, String productType, int tryCnt, zy callback) {
            this.f13141k = tryCnt;
            this.f60521toq = service;
            this.f60522zy = resource;
            this.f13143q = productType;
            this.f13142n = applyType;
            this.f60520f7l8 = new WeakReference<>(callback);
        }
    }

    /* JADX INFO: compiled from: ResourceRightsHelper.java */
    private static class toq extends AsyncTask<Void, Void, DrmManager.DrmResult> {

        /* JADX INFO: renamed from: g */
        private static final String f13144g = "CheckRightsTask";

        /* JADX INFO: renamed from: k */
        private com.android.thememanager.controller.online.zy f13145k;

        /* JADX INFO: renamed from: n */
        private WeakReference<InterfaceC2242k> f13146n;

        /* JADX INFO: renamed from: q */
        private x2 f13147q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Resource f60523toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private fu4 f60524zy;

        public toq(com.android.thememanager.controller.online.zy service, Resource resource, fu4 resContext, x2 controller, InterfaceC2242k callback) {
            this.f13145k = service;
            this.f60523toq = resource;
            this.f60524zy = resContext;
            this.f13147q = controller;
            this.f13146n = new WeakReference<>(callback);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DrmManager.DrmResult doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            return f7l8.m8364k(this.f60524zy, this.f13147q, this.f13145k, this.f60523toq);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(DrmManager.DrmResult result) {
            InterfaceC2242k interfaceC2242k = this.f13146n.get();
            if (interfaceC2242k != null) {
                interfaceC2242k.mo8358k(this.f60523toq, result);
            } else {
                Log.w(f13144g, "callback is null ");
            }
        }
    }

    /* JADX INFO: compiled from: ResourceRightsHelper.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo8354k(Resource resource, zy.C7914zy result);
    }

    /* JADX INFO: renamed from: k */
    public static DrmManager.DrmResult m8364k(fu4 resContext, x2 controller, com.android.thememanager.controller.online.zy drmService, Resource resource) {
        DrmManager.DrmResult drmResultM7660q = drmService.m7660q(resource);
        if (drmResultM7660q != DrmManager.DrmResult.DRM_SUCCESS) {
            Resource resourceKja0 = C1792n.kja0(resource, resContext.getNewResourceContext());
            if (resourceKja0 != null) {
                drmResultM7660q = drmService.m7660q(resourceKja0);
            }
            if (drmResultM7660q != DrmManager.DrmResult.DRM_SUCCESS && TextUtils.isEmpty(resource.getProductId())) {
                controller.m7690k().gvn7(resource);
            }
        }
        return drmResultM7660q;
    }

    public static void toq(com.android.thememanager.controller.online.zy drmService, String resourceCode, Resource resource, InterfaceC2242k callback) {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
        new toq(drmService, resource, fu4VarM10535g, C2082k.zy().m8001n().ld6(fu4VarM10535g), callback).executeOnExecutor(C6002g.x2(), new Void[0]);
    }

    public static void zy(int applyType, com.android.thememanager.controller.online.zy service, Resource resource, String productType, zy callback) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("resourceType", "theme");
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.bf5, C1706p.ki(arrayMapM6679k));
        new AsyncTaskC2243q(applyType, service, resource, productType, callback).executeOnExecutor(C6002g.x2(), new Void[0]);
    }
}
