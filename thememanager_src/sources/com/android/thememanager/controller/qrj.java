package com.android.thememanager.controller;

import android.text.TextUtils;
import com.android.thememanager.basemodule.local.AbstractC1753q;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.controller.local.ki;
import com.android.thememanager.fu4;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.g1;

/* JADX INFO: compiled from: ThemeDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends C1950s {
    public qrj(fu4 context) {
        super(context);
    }

    @Override // com.android.thememanager.controller.C1950s
    /* JADX INFO: renamed from: b */
    protected AbstractC1753q mo7672b(fu4 resContext) {
        return resContext.isSelfDescribing() ? new com.android.thememanager.controller.local.f7l8(resContext) : new ki(resContext);
    }

    @Override // com.android.thememanager.controller.C1950s
    protected boolean lv5(Resource resource) {
        if (!"aod".equals(this.f11062k.getResourceCode()) && !"icons".equals(this.f11062k.getResourceCode())) {
            return super.lv5(resource);
        }
        if (!TextUtils.isEmpty(resource.getOnlineId())) {
            return true;
        }
        if (C1807g.m7081r() && "icons".equals(this.f11062k.getResourceCode()) && ch.vyq(resource.getContentPath())) {
            return true;
        }
        String strM6942o = C1792n.m6942o(resource);
        return "aod".equals(strM6942o) || "icons".equals(strM6942o);
    }

    @Override // com.android.thememanager.controller.C1950s
    protected boolean t8iq(Resource resource) {
        if (g1.m9737a() || !com.android.thememanager.basemodule.resource.n7h.m6953q(resource) || resource.getResourceStorageType() == ResourceLocalProperties.ResourceStorageType.PRECUST) {
            return super.t8iq(resource);
        }
        return false;
    }
}
