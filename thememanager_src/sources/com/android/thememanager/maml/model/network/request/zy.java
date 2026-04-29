package com.android.thememanager.maml.model.network.request;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import java.io.Serializable;

/* JADX INFO: compiled from: LikeRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements Serializable {
    private static final long serialVersionUID = 1;

    @e5.zy(InterfaceC2143k.f12611k)
    public String imageId;

    @e5.zy("isLike")
    public boolean isLike;

    /* JADX INFO: renamed from: com.android.thememanager.maml.model.network.request.zy$k */
    /* JADX INFO: compiled from: LikeRequest.java */
    private interface InterfaceC2143k {

        /* JADX INFO: renamed from: k */
        public static final String f12611k = "imageId";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f60422toq = "isLike";
    }

    public zurt getUrl() {
        zurt zurtVar = new zurt(InterfaceC1925p.qcx, 15, zurt.EnumC1946k.API_PROXY);
        String str = this.imageId;
        if (str != null) {
            zurtVar.addParameter(InterfaceC2143k.f12611k, str);
        }
        zurtVar.addParameter("isLike", String.valueOf(this.isLike));
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }
}
