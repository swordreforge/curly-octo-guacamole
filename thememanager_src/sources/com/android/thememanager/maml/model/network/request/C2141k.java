package com.android.thememanager.maml.model.network.request;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import java.io.Serializable;

/* JADX INFO: renamed from: com.android.thememanager.maml.model.network.request.k */
/* JADX INFO: compiled from: InformationRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2141k implements Serializable {
    private static final long serialVersionUID = 1;

    @e5.zy("cardCount")
    public Integer cardCount;

    @e5.zy(k.f12609q)
    public Integer imageHeight;

    @e5.zy(k.f60421zy)
    public Integer imageWidth;

    @e5.zy("cardStart")
    public Integer startNumber;

    /* JADX INFO: renamed from: com.android.thememanager.maml.model.network.request.k$k */
    /* JADX INFO: compiled from: InformationRequest.java */
    private interface k {

        /* JADX INFO: renamed from: k */
        public static final String f12608k = "cardStart";

        /* JADX INFO: renamed from: q */
        public static final String f12609q = "imgHeight";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f60420toq = "cardCount";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f60421zy = "imgWidth";
    }

    public zurt getUrl() {
        zurt zurtVar = new zurt(InterfaceC1925p.ft4, 1, zurt.EnumC1946k.API_PROXY);
        Integer num = this.startNumber;
        if (num != null) {
            zurtVar.addParameter("cardStart", String.valueOf(num));
        }
        Integer num2 = this.cardCount;
        if (num2 != null) {
            zurtVar.addParameter("cardCount", String.valueOf(num2));
        }
        Integer num3 = this.imageWidth;
        if (num3 != null) {
            zurtVar.addParameter(k.f60421zy, String.valueOf(num3));
        }
        Integer num4 = this.imageHeight;
        if (num4 != null) {
            zurtVar.addParameter(k.f12609q, String.valueOf(num4));
        }
        zurtVar.setHttpMethod(zurt.toq.GET);
        return zurtVar;
    }
}
