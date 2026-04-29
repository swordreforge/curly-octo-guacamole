package com.android.thememanager.controller.online;

import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.k */
/* JADX INFO: compiled from: BaseOperationController.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1918k implements InterfaceC1925p {

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.k$k */
    /* JADX INFO: compiled from: BaseOperationController.java */
    public interface k<T> {
        /* JADX INFO: renamed from: k */
        void mo6418k();

        Resource[] toq();

        void zy(T result);
    }

    /* JADX INFO: renamed from: k */
    public static void m7561k(EnumC1933t cacheHelper, boolean isAdd, Resource... resources) {
        toq(cacheHelper, isAdd, EnumC1933t.getResourceIds(resources));
    }

    public static void toq(EnumC1933t cacheHelper, boolean isAdd, String... resourceIds) {
        if (isAdd) {
            cacheHelper.add(resourceIds);
        } else {
            cacheHelper.remove(resourceIds);
        }
    }
}
