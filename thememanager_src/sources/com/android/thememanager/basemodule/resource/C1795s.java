package com.android.thememanager.basemodule.resource;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.List;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.s */
/* JADX INFO: compiled from: ResourceResolver.java */
/* JADX INFO: loaded from: classes.dex */
public class C1795s {

    /* JADX INFO: renamed from: k */
    private Resource f10239k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C1791k f57697toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f57698zy;

    public C1795s(Resource resource, C1791k context) {
        this.f10239k = resource;
        this.f57697toq = context;
        if (resource.getParentResources().size() != 0) {
            this.f57698zy = resource.getParentResources().get(0).getLocalId();
        } else {
            this.f57698zy = resource.getLocalId();
        }
    }

    /* JADX INFO: renamed from: g */
    private List<PathEntry> m6965g(List<PathEntry> list, String folderPath) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList<PathEntry> arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            for (PathEntry pathEntry : arrayList2) {
                if (pathEntry != null) {
                    arrayList.add(new PathEntry(pathEntry.getLocalPath(), pathEntry.getOnlinePath()));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m6966k((PathEntry) arrayList.get(i2), folderPath);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private void m6966k(PathEntry path, String folderPath) {
        String localPath;
        if (path == null || (localPath = path.getLocalPath()) == null) {
            return;
        }
        Uri uri = Uri.parse(localPath);
        if (localPath.startsWith("/") || uri.getScheme() != null) {
            return;
        }
        path.setLocalPath(folderPath + localPath);
    }

    private List<String> toq(List<String> list, String folderPath) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str = (String) arrayList.get(i2);
                if (!str.startsWith("/")) {
                    arrayList.set(i2, folderPath + str);
                }
            }
        }
        return arrayList;
    }

    public String f7l8() {
        if (this.f10239k.getContentPath() != null) {
            return this.f10239k.getContentPath();
        }
        String localId = this.f10239k.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        return C1792n.f7l8(this.f10239k.getResourceStorageType(), this.f57697toq.getContentRelativeFolderName(), this.f57697toq.getContentFolder()) + localId + com.android.thememanager.basemodule.resource.constants.toq.vm8;
    }

    /* JADX INFO: renamed from: n */
    public List<String> m6967n() {
        return toq(this.f10239k.getBuildInThumbnails(), zy());
    }

    /* JADX INFO: renamed from: p */
    public List<PathEntry> m6968p() {
        return m6965g(this.f10239k.getThumbnails(), C7083n.ld6(this.f57697toq.getThumbnailCacheFolder()));
    }

    /* JADX INFO: renamed from: q */
    public List<String> m6969q() {
        return toq(this.f10239k.getBuildInPreviews(), zy());
    }

    /* JADX INFO: renamed from: s */
    public String m6970s() {
        if (this.f10239k.getRightsPath() != null) {
            return this.f10239k.getRightsPath();
        }
        String strF7l8 = C1792n.f7l8(this.f10239k.getResourceStorageType(), this.f57697toq.getRightsRelativeFolderName(), this.f57697toq.getRightsFolder());
        String productId = this.f10239k.getProductId();
        if (TextUtils.isEmpty(productId)) {
            return strF7l8 + this.f10239k.getHash() + com.android.thememanager.basemodule.resource.constants.toq.vuk;
        }
        String resourceCode = this.f57697toq.getResourceCode();
        if (TextUtils.isEmpty(resourceCode) || "theme".equals(resourceCode)) {
            return strF7l8 + productId + com.android.thememanager.basemodule.resource.constants.toq.vuk;
        }
        return strF7l8 + productId + C5658n.f73185t8r + resourceCode + com.android.thememanager.basemodule.resource.constants.toq.vuk;
    }

    /* JADX INFO: renamed from: y */
    public String m6971y() {
        if (this.f10239k.getMetaPath() != null) {
            return this.f10239k.getMetaPath();
        }
        String localId = this.f10239k.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        return C1792n.f7l8(this.f10239k.getResourceStorageType(), this.f57697toq.getMetaRelativeFolderName(), this.f57697toq.getMetaFolder()) + localId + com.android.thememanager.basemodule.resource.constants.toq.n5;
    }

    public String zy() {
        return C7083n.ld6(C1792n.f7l8(this.f10239k.getResourceStorageType(), this.f57697toq.getBuildInImageRelativeFolderName(), this.f57697toq.getBuildInImageFolder()) + this.f57698zy);
    }
}
