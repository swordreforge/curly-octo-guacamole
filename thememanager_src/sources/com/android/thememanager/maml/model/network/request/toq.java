package com.android.thememanager.maml.model.network.request;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import java.io.Serializable;

/* JADX INFO: compiled from: LikeInfoRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements Serializable {
    private static final long serialVersionUID = 1;
    public String imageIds;

    /* JADX INFO: renamed from: com.android.thememanager.maml.model.network.request.toq$k */
    /* JADX INFO: compiled from: LikeInfoRequest.java */
    private interface InterfaceC2142k {

        /* JADX INFO: renamed from: k */
        public static final String f12610k = "imageIds";
    }

    public zurt getUrl() {
        zurt zurtVar = new zurt(InterfaceC1925p.qcx, 15, zurt.EnumC1946k.API_PROXY);
        String str = this.imageIds;
        if (str != null) {
            zurtVar.addParameter(InterfaceC2142k.f12610k, str);
        }
        zurtVar.setHttpMethod(zurt.toq.GET);
        return zurtVar;
    }
}
