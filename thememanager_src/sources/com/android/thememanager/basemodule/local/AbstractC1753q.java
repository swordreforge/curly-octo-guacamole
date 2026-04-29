package com.android.thememanager.basemodule.local;

import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.io.File;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.local.q */
/* JADX INFO: compiled from: LocalDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1753q {

    /* JADX INFO: renamed from: k */
    protected C1791k f10033k;

    public AbstractC1753q(C1791k context) {
        this.f10033k = C1791k.getInstance(context.getResourceCode());
    }

    /* JADX INFO: renamed from: k */
    public abstract Resource mo6852k(File file) throws C1743g;

    public abstract void toq(File file, Resource resource) throws C1743g;
}
