package com.android.thememanager.model;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.toq;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.util.ch;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceResolver implements toq {
    private fu4 context;
    private String localIdForImage;
    private Resource resource;

    public ResourceResolver(Resource resource, fu4 context) {
        this.resource = resource;
        this.context = context;
        if (resource.getParentResources().size() != 0) {
            this.localIdForImage = resource.getParentResources().get(0).getLocalId();
        } else {
            this.localIdForImage = resource.getLocalId();
        }
    }

    private void convertCachePath(PathEntry path, String folderPath) {
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

    private List<String> getBuildInFullImagePaths(List<String> list, String folderPath) {
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

    private Map<String, List<String>> getBuildInFullImagePathsMap(Map<String, List<String>> map, String folderPath) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, getBuildInFullImagePaths(map.get(str), folderPath));
        }
        return map2;
    }

    private PathEntry getCacheFullImagePath(PathEntry path, String folderPath) {
        convertCachePath(path, folderPath);
        return path;
    }

    private List<PathEntry> getCacheFullImagePaths(List<PathEntry> list, String folderPath) {
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
                convertCachePath((PathEntry) arrayList.get(i2), folderPath);
            }
        }
        return arrayList;
    }

    public String getBuildInImageFolder() {
        return C7083n.ld6(ch.m9682s(this.resource.getResourceStorageType(), this.context.getBuildInImageRelativeFolderName(), this.context.getBuildInImageFolder()) + this.localIdForImage);
    }

    public List<String> getBuildInPreviews() {
        return getBuildInFullImagePaths(this.resource.getBuildInPreviews(), getBuildInImageFolder());
    }

    public Map<String, List<String>> getBuildInPreviewsMap() {
        return getBuildInFullImagePathsMap(this.resource.getBuildInPreviewsMap(), getBuildInImageFolder());
    }

    public List<String> getBuildInThumbnails() {
        return getBuildInFullImagePaths(this.resource.getBuildInThumbnails(), getBuildInImageFolder());
    }

    public Map<String, List<String>> getBuildInThumbnailsMap() {
        return getBuildInFullImagePathsMap(this.resource.getBuildInThumbnailsMap(), getBuildInImageFolder());
    }

    public String getContentPath() {
        if (this.resource.getContentPath() != null) {
            return this.resource.getContentPath();
        }
        String localId = this.resource.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        return ch.m9682s(this.resource.getResourceStorageType(), this.context.getContentRelativeFolderName(), this.context.getContentFolder()) + localId + toq.vm8;
    }

    public String getDownloadFolder() {
        return ch.m9682s(this.resource.getResourceStorageType(), this.context.getDownloadRelativeFolderName(), this.context.getDownloadFolder());
    }

    public PathEntry getHeaderDescPic() {
        return getCacheFullImagePath(this.resource.getHeaderDescPic(), C7083n.ld6(this.context.getThumbnailCacheFolder()));
    }

    public PathEntry getMainDescPic() {
        return getCacheFullImagePath(this.resource.getMainDescPic(), C7083n.ld6(this.context.getThumbnailCacheFolder()));
    }

    public String getMetaPath() {
        if (this.resource.getMetaPath() != null) {
            return this.resource.getMetaPath();
        }
        String localId = this.resource.getLocalId();
        if (TextUtils.isEmpty(localId)) {
            return null;
        }
        return ch.m9682s(this.resource.getResourceStorageType(), this.context.getMetaRelativeFolderName(), this.context.getMetaFolder()) + localId + toq.n5;
    }

    public List<PathEntry> getPreviews() {
        return getCacheFullImagePaths(this.resource.getPreviews(), C7083n.ld6(this.context.getPreviewCacheFolder()));
    }

    public String getRightsPath() {
        if (this.resource.getRightsPath() != null) {
            return this.resource.getRightsPath();
        }
        String strM9682s = ch.m9682s(this.resource.getResourceStorageType(), this.context.getRightsRelativeFolderName(), this.context.getRightsFolder());
        String productId = this.resource.getProductId();
        if (TextUtils.isEmpty(productId)) {
            return strM9682s + this.resource.getHash() + toq.vuk;
        }
        String resourceCode = this.context.getResourceCode();
        if (TextUtils.isEmpty(resourceCode) || "theme".equals(resourceCode)) {
            return strM9682s + productId + toq.vuk;
        }
        return strM9682s + productId + C5658n.f73185t8r + resourceCode + toq.vuk;
    }

    public List<PathEntry> getThumbnails() {
        return getCacheFullImagePaths(this.resource.getThumbnails(), C7083n.ld6(this.context.getThumbnailCacheFolder()));
    }
}
