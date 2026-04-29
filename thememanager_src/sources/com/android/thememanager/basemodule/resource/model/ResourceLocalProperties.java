package com.android.thememanager.basemodule.resource.model;

import com.android.thememanager.basemodule.resource.C1792n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLocalProperties implements Serializable {
    private static final long serialVersionUID = 4;
    private String contentPath;
    private String hash;
    private String localId;
    private String maskPath;
    private String metaPath;
    private long modifiedTime;
    public String pictureDescriptionContent;
    public String pictureDescriptionTitle;
    private String rightsPath;
    private boolean supportHomeSearchBar;
    private List<String> buildInThumbnails = new ArrayList();
    private List<String> buildInPreviews = new ArrayList();
    private Map<String, List<String>> buildInThumbnailsMap = new HashMap();
    private Map<String, List<String>> buildInPreviewsMap = new HashMap();
    private List<RelatedResource> parentResources = new ArrayList();
    private List<RelatedResource> subResources = new ArrayList();
    private ResourceInfo info = new ResourceInfo();
    private ResourceStorageType resourceStorageType = ResourceStorageType.NONE;
    private int mattingMode = 1;

    public enum ResourceStorageType {
        SYSTEM,
        PRECUST,
        DATA,
        BUILDIN_EXTERNAL_STORAGE,
        PLUGIN_SDCARD_STORAGE,
        NONE
    }

    private boolean equals(Object obj1, Object obj2) {
        return obj1 == obj2 || !(obj1 == null || obj2 == null || !obj1.equals(obj2));
    }

    private String trim(String s2) {
        if (s2 == null) {
            return null;
        }
        return s2.trim();
    }

    public void addBuildInPreview(String buildInPreview) {
        this.buildInPreviews.add(buildInPreview);
    }

    public void addBuildInThumbnail(String buildThumbnail) {
        this.buildInThumbnails.add(buildThumbnail);
    }

    public void addParentResources(RelatedResource parentResource) {
        this.parentResources.add(parentResource);
    }

    public void addSubResources(RelatedResource subResource) {
        this.subResources.add(subResource);
    }

    public void clearBuildInPreviews() {
        this.buildInPreviews.clear();
    }

    public void clearBuildInPreviewsMap() {
        this.buildInPreviewsMap.clear();
    }

    public void clearBuildInThumbnails() {
        this.buildInThumbnails.clear();
    }

    public void clearBuildInThumbnailsMap() {
        this.buildInThumbnailsMap.clear();
    }

    public void clearParentResources() {
        this.parentResources.clear();
    }

    public void clearSubResources() {
        this.subResources.clear();
    }

    public List<String> getBuildInPreviews() {
        return this.buildInPreviews;
    }

    public Map<String, List<String>> getBuildInPreviewsMap() {
        return this.buildInPreviewsMap;
    }

    public List<String> getBuildInThumbnails() {
        return this.buildInThumbnails;
    }

    public Map<String, List<String>> getBuildInThumbnailsMap() {
        return this.buildInThumbnailsMap;
    }

    public String getContentPath() {
        return this.contentPath;
    }

    public String getHash() {
        return this.hash;
    }

    public ResourceInfo getInfo() {
        return this.info;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getMaskPath() {
        return this.maskPath;
    }

    public int getMattingMode() {
        return this.mattingMode;
    }

    public String getMetaPath() {
        return this.metaPath;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public List<RelatedResource> getParentResources() {
        return this.parentResources;
    }

    public String getPictureDescriptionContent() {
        return this.pictureDescriptionContent;
    }

    public String getPictureDescriptionTitle() {
        return this.pictureDescriptionTitle;
    }

    public ResourceStorageType getResourceStorageType() {
        return this.resourceStorageType;
    }

    public String getRightsPath() {
        return this.rightsPath;
    }

    public List<RelatedResource> getSubResources() {
        return this.subResources;
    }

    public boolean isSupportHomeSearchBar() {
        return this.supportHomeSearchBar;
    }

    public void putBuildInPreviews(String key, List<String> value) {
        this.buildInPreviewsMap.put(key, value);
    }

    public void putBuildInThumbnails(String key, List<String> value) {
        this.buildInThumbnailsMap.put(key, value);
    }

    public void setBuildInPreviews(List<String> buildInPreviews) {
        this.buildInPreviews = buildInPreviews;
    }

    public void setBuildInPreviewsMap(Map<String, List<String>> buildInPreviewsMap) {
        this.buildInPreviewsMap = buildInPreviewsMap;
    }

    public void setBuildInThumbnails(List<String> buildInThumbnails) {
        this.buildInThumbnails = buildInThumbnails;
    }

    public void setBuildInThumbnailsMap(Map<String, List<String>> buildInThumbnailsMap) {
        this.buildInThumbnailsMap = buildInThumbnailsMap;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = C1792n.m6944q(trim(contentPath));
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setInfo(ResourceInfo info) {
        this.info = info;
    }

    public void setLocalId(String localId) {
        this.localId = trim(localId);
    }

    public void setMaskPath(String maskPath) {
        this.maskPath = maskPath;
    }

    public void setMattingMode(int mattingMode) {
        this.mattingMode = mattingMode;
    }

    public void setMetaPath(String metaPath) {
        this.metaPath = C1792n.m6944q(trim(metaPath));
    }

    public void setModifiedTime(long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setParentResources(List<RelatedResource> parentResources) {
        this.parentResources = parentResources;
    }

    public void setPictureDescriptionContent(String pictureDescriptionContent) {
        this.pictureDescriptionContent = pictureDescriptionContent;
    }

    public void setPictureDescriptionTitle(String pictureDescriptionTitle) {
        this.pictureDescriptionTitle = pictureDescriptionTitle;
    }

    public void setResourceStorageType(ResourceStorageType resourceStorageType) {
        this.resourceStorageType = resourceStorageType;
    }

    public void setRightsPath(String rightsPath) {
        this.rightsPath = C1792n.m6944q(trim(rightsPath));
    }

    public void setSubResources(List<RelatedResource> subResources) {
        this.subResources = subResources;
    }

    public void setSupportHomeSearchBar(boolean supportHomeSearchBar) {
        this.supportHomeSearchBar = supportHomeSearchBar;
    }

    public void updateFrom(ResourceLocalProperties p2) {
        if (this == p2 || p2 == null) {
            return;
        }
        this.localId = p2.localId;
        this.modifiedTime = p2.modifiedTime;
        this.hash = p2.hash;
        this.buildInThumbnails.clear();
        this.buildInThumbnails.addAll(p2.buildInThumbnails);
        this.buildInPreviews.clear();
        this.buildInPreviews.addAll(p2.buildInPreviews);
        this.buildInThumbnailsMap.clear();
        this.buildInThumbnailsMap.putAll(p2.buildInThumbnailsMap);
        this.buildInPreviewsMap.clear();
        this.buildInPreviewsMap.putAll(p2.buildInPreviewsMap);
        this.parentResources.clear();
        this.parentResources.addAll(p2.parentResources);
        this.subResources.clear();
        this.subResources.addAll(p2.subResources);
        this.info.updateFrom(p2.info);
        this.metaPath = p2.metaPath;
        this.contentPath = p2.contentPath;
        this.rightsPath = p2.rightsPath;
        this.resourceStorageType = p2.resourceStorageType;
        this.supportHomeSearchBar = p2.supportHomeSearchBar;
    }

    public List<String> getBuildInPreviews(String key) {
        return this.buildInPreviewsMap.get(key);
    }

    public List<String> getBuildInThumbnails(String key) {
        return this.buildInThumbnailsMap.get(key);
    }

    public List<String> getBuildInPreviews(String key, List<String> defaultValue) {
        List<String> list = this.buildInPreviewsMap.get(key);
        return list != null ? list : defaultValue;
    }

    public List<String> getBuildInThumbnails(String key, List<String> defaultValue) {
        List<String> list = this.buildInThumbnailsMap.get(key);
        return list != null ? list : defaultValue;
    }
}
