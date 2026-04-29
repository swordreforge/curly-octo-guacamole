package com.android.thememanager.basemodule.resource.model;

import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RelatedResource implements Serializable {
    private static final long serialVersionUID = 2;
    private String contentPath;
    private String largeIconPackage;
    private String localId;
    private String metaPath;
    private String resourceCode;
    private Map<String, String> extraMeta = new HashMap();
    private ResourceLocalProperties.ResourceStorageType resourceStorageType = ResourceLocalProperties.ResourceStorageType.NONE;

    public String getContentPath() {
        return this.contentPath;
    }

    public Map<String, String> getExtraMeta() {
        return this.extraMeta;
    }

    public String getLargeIconPackage() {
        return this.largeIconPackage;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getMetaPath() {
        return this.metaPath;
    }

    public String getResourceCode() {
        return this.resourceCode;
    }

    public ResourceLocalProperties.ResourceStorageType getResourceStorageType() {
        return this.resourceStorageType;
    }

    public void putExtraMeta(String key, String value) {
        this.extraMeta.put(key, value);
    }

    public void setContentPath(String contentPath) {
        this.contentPath = C1792n.m6944q(contentPath);
    }

    public void setExtraMeta(Map<String, String> extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setLargeIconPackage(String largeIconPackage) {
        this.largeIconPackage = largeIconPackage;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public void setMetaPath(String metaPath) {
        this.metaPath = C1792n.m6944q(metaPath);
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public void setResourceStorageType(ResourceLocalProperties.ResourceStorageType resourceStorageType) {
        this.resourceStorageType = resourceStorageType;
    }

    public String getExtraMeta(String key) {
        return this.extraMeta.get(key);
    }

    public String getExtraMeta(String key, String defaultValue) {
        String str = this.extraMeta.get(key);
        return str != null ? str : defaultValue;
    }
}
