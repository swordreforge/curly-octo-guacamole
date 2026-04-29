package com.android.thememanager.basemodule.resource;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.utils.C1822q;
import java.io.File;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.q */
/* JADX INFO: compiled from: RelatedResourceResolver.java */
/* JADX INFO: loaded from: classes.dex */
public class C1794q implements com.android.thememanager.basemodule.resource.constants.toq {

    /* JADX INFO: renamed from: k */
    private RelatedResource f10236k;

    /* JADX INFO: renamed from: q */
    private C1791k f10237q;

    public C1794q(RelatedResource relatedResource, C1791k context) {
        this.f10236k = relatedResource;
        this.f10237q = context;
    }

    /* JADX INFO: renamed from: k */
    public String m6956k() {
        if (this.f10236k.getContentPath() != null) {
            return this.f10236k.getContentPath();
        }
        String strF7l8 = C1792n.f7l8(this.f10236k.getResourceStorageType(), this.f10237q.getContentRelativeFolderName(), this.f10237q.getContentFolder());
        String localId = this.f10236k.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        String strLd6 = C7083n.ld6(this.f10236k.getResourceCode());
        return C7083n.ld6(new File(strF7l8).getParent()) + strLd6 + localId + com.android.thememanager.basemodule.resource.constants.toq.vm8;
    }

    public String toq() {
        if (this.f10236k.getMetaPath() != null) {
            return this.f10236k.getMetaPath();
        }
        String strF7l8 = C1792n.f7l8(this.f10236k.getResourceStorageType(), this.f10237q.getMetaRelativeFolderName(), this.f10237q.getMetaFolder());
        String localId = this.f10236k.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        String strLd6 = C7083n.ld6(this.f10236k.getResourceCode());
        return C7083n.ld6(new File(strF7l8).getParent()) + strLd6 + localId + com.android.thememanager.basemodule.resource.constants.toq.n5;
    }

    public String zy() {
        return C1792n.f7l8(this.f10236k.getResourceStorageType(), this.f10237q.getRightsRelativeFolderName(), this.f10237q.getRightsFolder()) + C1822q.m7195q(m6956k()) + com.android.thememanager.basemodule.resource.constants.toq.vuk;
    }
}
