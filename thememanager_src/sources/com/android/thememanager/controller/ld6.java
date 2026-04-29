package com.android.thememanager.controller;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.fu4;
import com.android.thememanager.model.ListParams;
import com.android.thememanager.model.PageItem;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: ResourceDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ld6 extends AbstractC1949q {
    public ld6(fu4 context) {
        super(context);
    }

    public abstract void a9(zurt url);

    public abstract List<Resource> cdj(boolean forceRefresh, boolean asyncLinkOnline);

    public abstract void d3(List<Resource> localResources);

    public abstract boolean eqxt(List<Resource> resources);

    public abstract boolean f7l8(List<Resource> resources);

    public abstract a98o.zy<Resource> fn3e(ListParams params);

    public abstract boolean fti(Resource resource);

    public abstract a98o.zy<Resource> fu4(zurt url);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo7473g(Resource resource);

    public abstract void gvn7(Resource localResource);

    /* JADX INFO: renamed from: h */
    public abstract List<Resource> mo7474h(boolean forceRefresh);

    /* JADX INFO: renamed from: i */
    public abstract Resource mo7475i(String id, boolean forceRefresh);

    public abstract boolean jk(Resource resource);

    public abstract boolean jp0y(List<Resource> resources);

    public abstract List<Resource> ki(boolean forceRefresh, boolean asyncLinkOnline, boolean forceAll);

    public abstract List<Resource> kja0();

    @dd
    public abstract Resource ld6();

    public abstract boolean mcp(Resource resource);

    public abstract Resource n7h(String onlineId);

    public abstract a98o.zy<Resource> ni7(ListParams params, boolean forceRefresh, boolean asyncLinkLocal);

    public abstract List<PageItem> o1t(zurt url, boolean forceRefresh);

    public abstract boolean oc(Resource resource);

    /* JADX INFO: renamed from: p */
    public abstract <T> CommonResponse<T> mo7476p(zurt url, boolean forceRefresh, Class<T> pageClass);

    public abstract Resource qrj(String id);

    /* JADX INFO: renamed from: s */
    public abstract <T> CommonResponse<T> mo7477s(zurt url, Class<T> pageClass);

    /* JADX INFO: renamed from: t */
    public abstract boolean mo7478t(Resource resource);

    public abstract Resource t8r(String id);

    public abstract int wvg(Resource resource);

    public abstract int x2();

    /* JADX INFO: renamed from: y */
    public abstract List<Resource> mo7479y(String keyword);

    /* JADX INFO: renamed from: z */
    public abstract List<PageItem> mo7480z(zurt url);

    public abstract a98o.zy<Resource> zurt(ListParams params, boolean forceRefresh);
}
