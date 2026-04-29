package com.android.thememanager.basemodule.resource.model;

import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.constants.toq;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.hyr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
public class Resource implements Serializable, Cloneable {
    public static final int STATUS_LOCAL = 1;
    public static final int STATUS_OLD = 4;
    public static final int STATUS_ONLINE = 2;
    private static final long serialVersionUID = 7;
    private ResourceLocalProperties localProperties = new ResourceLocalProperties();
    private ResourceOnlineProperties onlineProperties = new ResourceOnlineProperties();
    private Map<String, String> extraMeta = new HashMap();

    public void addBuildInPreview(String buildInPreview) {
        this.localProperties.addBuildInPreview(buildInPreview);
    }

    public void addBuildInThumbnail(String buildThumbnail) {
        this.localProperties.addBuildInThumbnail(buildThumbnail);
    }

    public void addParentResources(RelatedResource parentResource) {
        this.localProperties.addParentResources(parentResource);
    }

    public void addPreview(PathEntry preview) {
        this.onlineProperties.addPreview(preview);
    }

    public void addSubResources(RelatedResource subResource) {
        this.localProperties.addSubResources(subResource);
    }

    public void addThumbnail(PathEntry thumbnail) {
        this.onlineProperties.addThumbnail(thumbnail);
    }

    public void clearBuildInPreviews() {
        this.localProperties.clearBuildInPreviews();
    }

    public void clearBuildInPreviewsMap() {
        this.localProperties.clearBuildInPreviewsMap();
    }

    public void clearBuildInThumbnails() {
        this.localProperties.clearBuildInThumbnails();
    }

    public void clearBuildInThumbnailsMap() {
        this.localProperties.clearBuildInThumbnailsMap();
    }

    public void clearExtraMeta() {
        this.extraMeta.clear();
    }

    public synchronized void clearLocalProperties() {
        this.localProperties = new ResourceLocalProperties();
    }

    public synchronized void clearOnlineProperties() {
        this.onlineProperties = new ResourceOnlineProperties();
    }

    public void clearParentResources() {
        this.localProperties.clearParentResources();
    }

    public void clearPreviews() {
        this.onlineProperties.clearPreviews();
    }

    public void clearSubResources() {
        this.localProperties.clearSubResources();
    }

    public void clearThumbnails() {
        this.onlineProperties.clearThumbnails();
    }

    public int getAllFrameCount() {
        return this.localProperties.getInfo().getAllFrameCount();
    }

    public String getAssemblyId() {
        return this.onlineProperties.getAssemblyId();
    }

    public String getBrief() {
        String brief = this.onlineProperties.getInfo().getBrief();
        return brief == null ? this.localProperties.getInfo().getBrief() : brief;
    }

    public List<String> getBuildInPreviews() {
        return this.localProperties.getBuildInPreviews();
    }

    public Map<String, List<String>> getBuildInPreviewsMap() {
        return this.localProperties.getBuildInPreviewsMap();
    }

    public List<String> getBuildInThumbnails() {
        return this.localProperties.getBuildInThumbnails();
    }

    public Map<String, List<String>> getBuildInThumbnailsMap() {
        return this.localProperties.getBuildInThumbnailsMap();
    }

    public String getCategory() {
        return this.onlineProperties.getCategory();
    }

    public String getColorRingId() {
        return this.onlineProperties.getColorRingId();
    }

    public String getContentPath() {
        return this.localProperties.getContentPath();
    }

    public String getDeviceType() {
        return this.onlineProperties.getInfo().getResourceDeviceType();
    }

    public String getDownloadPath() {
        return this.onlineProperties.getDownloadPath();
    }

    public Map<String, String> getExtraMeta() {
        return this.extraMeta;
    }

    public ArrayList<Integer> getFontWeightList() {
        return this.onlineProperties.getFontWeightList();
    }

    public String getFormatFontWeightList() {
        return hyr.m7093q(this.onlineProperties.getFontWeightList(), ",");
    }

    public String getHash() {
        return this.localProperties.getHash();
    }

    public PathEntry getHeaderDescPic() {
        return this.onlineProperties.getHeaderDescPic();
    }

    public Integer getIconsCount() {
        return this.onlineProperties.getInfo().getIconsCount();
    }

    public boolean getIsBackUpVersion() {
        return this.localProperties.getInfo().getIsBackUpVersion();
    }

    public Integer getLikeCount() {
        return this.onlineProperties.getInfo().getLikeCount();
    }

    public String getLocalId() {
        return this.localProperties.getLocalId();
    }

    public ResourceInfo getLocalInfo() {
        return this.localProperties.getInfo();
    }

    public int getLocalPlatform() {
        return (TextUtils.isEmpty(getContentPath()) || !(getContentPath().startsWith(toq.ru) || getContentPath().startsWith(toq.anfo) || getContentPath().startsWith(toq.y1e))) ? this.localProperties.getInfo().getPlatform() : InterfaceC1789q.y7;
    }

    public PathEntry getMainDescPic() {
        return this.onlineProperties.getMainDescPic();
    }

    public String getMaskPath() {
        return this.localProperties.getMaskPath();
    }

    public int getMattingMode() {
        return this.localProperties.getMattingMode();
    }

    public String getMetaPath() {
        return this.localProperties.getMetaPath();
    }

    public String getMiuiAdapterVersion() {
        return this.localProperties.getInfo().getMiuiAdapterVersion();
    }

    public long getModifiedTime() {
        return this.localProperties.getModifiedTime();
    }

    public String getOnlineId() {
        return this.onlineProperties.getOnlineId();
    }

    public ResourceInfo getOnlineInfo() {
        return this.onlineProperties.getInfo();
    }

    public String getOnlinePath() {
        return this.onlineProperties.getOnlinePath();
    }

    public int getOriginPrice() {
        return this.onlineProperties.getOriginPrice();
    }

    public String getPackageVersion() {
        return this.localProperties.getInfo().getPackageVersion();
    }

    public List<RelatedResource> getParentResources() {
        return this.localProperties.getParentResources();
    }

    public String getPictureDescriptionContent() {
        return this.localProperties.getPictureDescriptionContent();
    }

    public String getPictureDescriptionTitle() {
        return this.localProperties.getPictureDescriptionTitle();
    }

    public List<PathEntry> getPreviews() {
        return this.onlineProperties.getPreviews();
    }

    public String getProductId() {
        return this.onlineProperties.getProductId();
    }

    public int getProductPrice() {
        return this.onlineProperties.getProductPrice();
    }

    public int getRate() {
        return this.localProperties.getInfo().getRate();
    }

    public ResourceLocalProperties.ResourceStorageType getResourceStorageType() {
        return this.localProperties.getResourceStorageType();
    }

    public String getRightsPath() {
        return this.localProperties.getRightsPath();
    }

    public float getScore() {
        return this.onlineProperties.getScore();
    }

    public int getSmallFrameCount() {
        return this.localProperties.getInfo().getSmallFrameCount();
    }

    public int getStiffness() {
        return this.localProperties.getInfo().getStiffness();
    }

    @dd
    public RelatedResource getSubResource(@dd String resourceCode) {
        if (TextUtils.isEmpty(resourceCode)) {
            return null;
        }
        for (RelatedResource relatedResource : getSubResources()) {
            if (resourceCode.equals(relatedResource.getResourceCode())) {
                return relatedResource;
            }
        }
        return null;
    }

    public List<RelatedResource> getSubResources() {
        return this.localProperties.getSubResources();
    }

    public int getThemeType() {
        return this.localProperties.getInfo().getThemeType();
    }

    public String getThumbName() {
        if (getThumbnails() == null || getThumbnails().size() <= 0) {
            return null;
        }
        return C1821p.ld6(getThumbnails().get(0).getLocalPath());
    }

    public List<PathEntry> getThumbnails() {
        return this.onlineProperties.getThumbnails();
    }

    public String getTitle() {
        String title = this.onlineProperties.getInfo().getTitle();
        return title == null ? this.localProperties.getInfo().getTitle() : title;
    }

    public String getTrialDialogMessage() {
        return this.onlineProperties.getTrialDialogMessage();
    }

    public String getTrialDialogTitle() {
        return this.onlineProperties.getTrialDialogTitle();
    }

    public long getTrialTime() {
        return this.onlineProperties.getTrialTime();
    }

    public Pair<String, String> getVideoUrl() {
        return this.onlineProperties.getVideoUrl();
    }

    public String getWallpaperType() {
        return this.onlineProperties.getInfo().getWallpeperGalleryType();
    }

    public String getWallpaperTypeId() {
        return this.onlineProperties.getInfo().getWallpeperGalleryTypeId();
    }

    public String getWidgetDarkPreview() {
        String widgetDarkPreview = this.onlineProperties.getInfo().getWidgetDarkPreview();
        return widgetDarkPreview == null ? this.localProperties.getInfo().getWidgetDarkPreview() : widgetDarkPreview;
    }

    public String getWidgetPreview() {
        String widgetPreview = this.onlineProperties.getInfo().getWidgetPreview();
        return widgetPreview == null ? this.localProperties.getInfo().getWidgetPreview() : widgetPreview;
    }

    public String getWidgetProductId() {
        String widgetproductId = this.onlineProperties.getInfo().getWidgetproductId();
        return widgetproductId == null ? this.localProperties.getInfo().getWidgetproductId() : widgetproductId;
    }

    public String getWidgetSubjectId() {
        String widgetSubjectId = this.onlineProperties.getInfo().getWidgetSubjectId();
        return widgetSubjectId == null ? this.localProperties.getInfo().getWidgetSubjectId() : widgetSubjectId;
    }

    public boolean hasCheckBoughtStatus() {
        return this.onlineProperties.isCheckBoughtStatus();
    }

    public boolean hasVideo() {
        return this.onlineProperties.hasVideo();
    }

    public boolean isAuthorizedResource() {
        return isProductBought();
    }

    public boolean isCanNotPlay() {
        return Boolean.valueOf(getLocalInfo().getExtraMeta(InterfaceC1789q.y53, "false")).booleanValue();
    }

    public Boolean isLike() {
        return this.onlineProperties.getInfo().isLike();
    }

    public boolean isOnShelf() {
        return this.onlineProperties.isOnShelf();
    }

    public boolean isProductBought() {
        return this.onlineProperties.isProductBought();
    }

    public boolean isSupportHomeSearchBar() {
        return this.localProperties.isSupportHomeSearchBar();
    }

    public boolean isSystemOrPreCutsRes() {
        return ResourceLocalProperties.ResourceStorageType.PRECUST == this.localProperties.getResourceStorageType() || ResourceLocalProperties.ResourceStorageType.SYSTEM == this.localProperties.getResourceStorageType();
    }

    public synchronized void mergeLocalProperties(Resource r2) {
        this.localProperties.updateFrom(r2.localProperties);
    }

    public synchronized void mergeOnlineProperties(Resource r2) {
        this.onlineProperties.updateFrom(r2.onlineProperties);
    }

    public void putBuildInPreviews(String key, List<String> value) {
        this.localProperties.putBuildInPreviews(key, value);
    }

    public void putBuildInThumbnails(String key, List<String> value) {
        this.localProperties.putBuildInThumbnails(key, value);
    }

    public void putExtraMeta(String key, String value) {
        this.extraMeta.put(key, value);
    }

    public synchronized void reset() {
        clearLocalProperties();
        clearOnlineProperties();
        clearExtraMeta();
    }

    public void setAllFrameCount(int frameCount) {
        this.localProperties.getInfo().setAllFrameCount(frameCount);
    }

    public void setAssemblyId(String assemblyId) {
        this.onlineProperties.setAssemblyId(assemblyId);
    }

    public void setBuildInPreviews(List<String> buildInPreviews) {
        this.localProperties.setBuildInPreviews(buildInPreviews);
    }

    public void setBuildInPreviewsMap(Map<String, List<String>> buildInPreviewsMap) {
        this.localProperties.setBuildInPreviewsMap(buildInPreviewsMap);
    }

    public void setBuildInThumbnails(List<String> buildInThumbnails) {
        this.localProperties.setBuildInThumbnails(buildInThumbnails);
    }

    public void setBuildInThumbnailsMap(Map<String, List<String>> buildInThumbnailsMap) {
        this.localProperties.setBuildInThumbnailsMap(buildInThumbnailsMap);
    }

    public void setCanNotPlay(boolean canNotPlay) {
        getLocalInfo().putExtraMeta(InterfaceC1789q.y53, String.valueOf(canNotPlay));
    }

    public void setCategory(String category) {
        this.onlineProperties.setCategory(category);
    }

    public void setCheckBoughtStatus(boolean checkBoughtStatus) {
        this.onlineProperties.setCheckBoughtStatus(checkBoughtStatus);
    }

    public void setColorRingId(String colorRingId) {
        this.onlineProperties.setColorRingId(colorRingId);
    }

    public void setContentPath(String contentPath) {
        this.localProperties.setContentPath(contentPath);
    }

    public void setDeviceType(String type) {
        this.onlineProperties.getInfo().setResourceDeviceType(type);
    }

    public void setDownloadPath(String downloadPath) {
        this.onlineProperties.setDownloadPath(downloadPath);
    }

    public void setExtraMeta(Map<String, String> extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setFontWeightList(ArrayList<Integer> fontWeightList) {
        this.onlineProperties.setFontWeightList(fontWeightList);
    }

    public void setFormatFontWeightList(String formatFontWeightList) {
        this.onlineProperties.setFontWeightList(hyr.f7l8(formatFontWeightList, ","));
    }

    public void setFrameRate(int frameRate) {
        this.localProperties.getInfo().setRate(frameRate);
    }

    public void setHash(String hash) {
        this.localProperties.setHash(hash);
    }

    public void setHeaderDescPic(PathEntry headerDescPic) {
        this.onlineProperties.setHeaderDescPic(headerDescPic);
    }

    public void setIconsCount(Integer iconsCount) {
        if (iconsCount != null) {
            this.onlineProperties.getInfo().setIconsCount(iconsCount);
        }
    }

    public void setIsBackUpVersion(boolean isBackUpVersion) {
        this.localProperties.getInfo().setIsBackUpVersion(isBackUpVersion);
    }

    public void setLike(Boolean like) {
        this.onlineProperties.getInfo().setLike(like);
    }

    public void setLikeCount(Integer count) {
        this.onlineProperties.getInfo().setLikeCount(count);
    }

    public void setLocalId(String localId) {
        this.localProperties.setLocalId(localId);
    }

    public void setLocalInfo(ResourceInfo info) {
        this.localProperties.setInfo(info);
    }

    public void setLocalPlatform(int platform) {
        this.localProperties.getInfo().setPlatform(platform);
    }

    public void setMainDescPic(PathEntry mainDescPic) {
        this.onlineProperties.setMainDescPic(mainDescPic);
    }

    public void setMaskPath(String maskPath) {
        this.localProperties.setMaskPath(maskPath);
    }

    public void setMattingMode(int mattingMode) {
        this.localProperties.setMattingMode(mattingMode);
    }

    public void setMetaPath(String metaPath) {
        this.localProperties.setMetaPath(metaPath);
    }

    public void setMiuiAdapterVersion(String miuiAdapterVersion) {
        this.localProperties.getInfo().setMiuiAdapterVersion(miuiAdapterVersion);
    }

    public void setModifiedTime(long modifiedTime) {
        this.localProperties.setModifiedTime(modifiedTime);
    }

    public void setOnShelf(boolean onShelf) {
        this.onlineProperties.setOnShelf(onShelf);
    }

    public void setOnlineId(String onlineId) {
        this.onlineProperties.setOnlineId(onlineId);
    }

    public void setOnlineInfo(ResourceInfo info) {
        this.onlineProperties.setInfo(info);
    }

    public void setOnlinePath(String onlinePath) {
        this.onlineProperties.setOnlinePath(onlinePath);
    }

    public void setOriginPrice(int originPrice) {
        this.onlineProperties.setOriginPrice(originPrice);
    }

    public void setPackageVersion(String packageVersion) {
        this.localProperties.getInfo().setPackageVersion(packageVersion);
    }

    public void setParentResources(List<RelatedResource> parentResources) {
        this.localProperties.setParentResources(parentResources);
    }

    public void setPictureDescriptionContent(String pictureDescriptionContent) {
        this.localProperties.setPictureDescriptionContent(pictureDescriptionContent);
    }

    public void setPictureDescriptionTitle(String pictureDescriptionTitle) {
        this.localProperties.setPictureDescriptionTitle(pictureDescriptionTitle);
    }

    public void setPreviews(List<PathEntry> previews) {
        this.onlineProperties.setPreviews(previews);
    }

    public void setProductBought(boolean productBought) {
        this.onlineProperties.setProductBought(productBought);
    }

    public void setProductId(String productId) {
        this.onlineProperties.setProductId(productId);
    }

    public void setProductPrice(int productPrice) {
        this.onlineProperties.setProductPrice(productPrice);
    }

    public void setResourceStorageType(ResourceLocalProperties.ResourceStorageType resourceStorageType) {
        this.localProperties.setResourceStorageType(resourceStorageType);
    }

    public void setRightsPath(String rightsPath) {
        this.localProperties.setRightsPath(rightsPath);
    }

    public void setScore(float score) {
        this.onlineProperties.setScore(score);
    }

    public void setSensorVideoMessage(int rate, int allFrameCount, int smallFrameCount, int stiffness) {
        setFrameRate(rate);
        setAllFrameCount(allFrameCount);
        setSmallFrameCount(smallFrameCount);
        setStiffness(stiffness);
    }

    public void setSmallFrameCount(int frameCount) {
        this.localProperties.getInfo().setSmallFrameCount(frameCount);
    }

    public int setStiffness(int stiffness) {
        return this.localProperties.getInfo().setStiffness(stiffness);
    }

    public void setSubResources(List<RelatedResource> subResources) {
        this.localProperties.setSubResources(subResources);
    }

    public void setSupportHomeSearchBar(boolean supportHomeSearchBar) {
        this.localProperties.setSupportHomeSearchBar(supportHomeSearchBar);
    }

    public void setThemeType(int themeType) {
        this.localProperties.getInfo().setThemeType(themeType);
    }

    public void setThumbnails(List<PathEntry> thumbnails) {
        this.onlineProperties.setThumbnails(thumbnails);
    }

    public void setTrialDialogMessage(String trialDialogMessage) {
        this.onlineProperties.setTrialDialogMessage(trialDialogMessage);
    }

    public void setTrialDialogTitle(String trialDialogTitle) {
        this.onlineProperties.setTrialDialogTitle(trialDialogTitle);
    }

    public void setTrialTime(long trialTime) {
        this.onlineProperties.setTrialTime(trialTime);
    }

    public void setVideoUrl(String big, String small) {
        this.onlineProperties.setVideoUrl(big, small);
    }

    public void setWallpaperGalleryTypeAndId(String type, String typeId) {
        this.onlineProperties.getInfo().setWallpaperGalleryType(type);
        this.onlineProperties.getInfo().setWallpeperGalleryTypeId(typeId);
    }

    public synchronized void updateFrom(Resource r2) {
        mergeLocalProperties(r2);
        mergeOnlineProperties(r2);
        this.extraMeta.clear();
        this.extraMeta.putAll(r2.extraMeta);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized Resource m28251clone() {
        Resource resource;
        resource = new Resource();
        resource.updateFrom(this);
        return resource;
    }

    public List<String> getBuildInPreviews(String key) {
        return this.localProperties.getBuildInPreviews(key);
    }

    public List<String> getBuildInThumbnails(String key) {
        return this.localProperties.getBuildInThumbnails(key);
    }

    public String getExtraMeta(String key) {
        return this.extraMeta.get(key);
    }

    public List<String> getBuildInPreviews(String key, List<String> defaultValue) {
        return this.localProperties.getBuildInPreviews(key, defaultValue);
    }

    public List<String> getBuildInThumbnails(String key, List<String> defaultValue) {
        return this.localProperties.getBuildInThumbnails(key, defaultValue);
    }

    public String getExtraMeta(String key, String defaultValue) {
        String str = this.extraMeta.get(key);
        return str != null ? str : defaultValue;
    }
}
