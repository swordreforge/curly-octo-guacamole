package com.android.thememanager.basemodule.resource.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
public class ResourceInfo implements Serializable {
    private static final String EXTRA_TRACK_ID = "trackId";
    private static final long serialVersionUID = 5;
    private int allFrameCount;
    private String author;
    private String brief;
    private String description;
    private String designer;
    private String deviceType;
    private boolean enableIconMask;
    private Integer iconsCount;
    private boolean isBackUpVersion;
    private boolean isOfficial;
    private String lageIconPackageName;
    private Boolean like;
    private Integer likeCount;
    private String miuiAdapterVersion;
    private String packageVersion;
    private int platform;
    private int rate;
    private String screenRatio;
    private long size;
    private int smallFrameCount;
    private int stiffness;
    private String tags;
    private int themeType;
    private String title;
    private long updatedTime;
    private String version;
    private String wallpeperGalleryType;
    private String wallpeperGalleryTypeId;
    private String widgetDarkPreview;

    @dd
    private String widgetDeepLink;
    private String widgetPreview;
    private String widgetProductId;
    private String widgetSubjectId;
    private Map<String, String> authors = new HashMap();
    private Map<String, String> designers = new HashMap();
    private Map<String, String> titles = new HashMap();
    private Map<String, String> descriptions = new HashMap();
    private Map<String, String> extraMeta = new HashMap();

    public void clearAuthors() {
        this.authors.clear();
    }

    public void clearDescriptions() {
        this.descriptions.clear();
    }

    public void clearDesigners() {
        this.designers.clear();
    }

    public void clearExtraMeta() {
        this.extraMeta.clear();
    }

    public void clearTitles() {
        this.titles.clear();
    }

    public int getAllFrameCount() {
        return this.allFrameCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public Map<String, String> getAuthors() {
        return this.authors;
    }

    public String getBrief() {
        return this.brief;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, String> getDescriptions() {
        return this.descriptions;
    }

    public String getDesigner() {
        return this.designer;
    }

    public Map<String, String> getDesigners() {
        return this.designers;
    }

    public Map<String, String> getExtraMeta() {
        return this.extraMeta;
    }

    public Integer getIconsCount() {
        return this.iconsCount;
    }

    public boolean getIsBackUpVersion() {
        return this.isBackUpVersion;
    }

    public String getLargeIconPackageName() {
        return this.lageIconPackageName;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public String getMiuiAdapterVersion() {
        return this.miuiAdapterVersion;
    }

    public String getPackageVersion() {
        return this.packageVersion;
    }

    public int getPlatform() {
        return this.platform;
    }

    public int getRate() {
        return this.rate;
    }

    public String getResourceDeviceType() {
        return this.deviceType;
    }

    public String getScreenRatio() {
        return this.screenRatio;
    }

    public long getSize() {
        return this.size;
    }

    public int getSmallFrameCount() {
        return this.smallFrameCount;
    }

    public int getStiffness() {
        return this.stiffness;
    }

    public String getTags() {
        return this.tags;
    }

    public int getThemeType() {
        return this.themeType;
    }

    public String getTitle() {
        return this.title;
    }

    public Map<String, String> getTitles() {
        return this.titles;
    }

    public String getTrackId() {
        return this.extraMeta.get("trackId");
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public String getVersion() {
        return this.version;
    }

    public String getWallpeperGalleryType() {
        return this.wallpeperGalleryType;
    }

    public String getWallpeperGalleryTypeId() {
        return this.wallpeperGalleryTypeId;
    }

    public String getWidgetDarkPreview() {
        return this.widgetDarkPreview;
    }

    public String getWidgetDeepLink() {
        return this.widgetDeepLink;
    }

    public String getWidgetPreview() {
        return this.widgetPreview;
    }

    public String getWidgetSubjectId() {
        return this.widgetSubjectId;
    }

    public String getWidgetproductId() {
        return this.widgetProductId;
    }

    public Boolean isLike() {
        return this.like;
    }

    public boolean isOfficial() {
        return this.isOfficial;
    }

    public boolean isSupportIconMask() {
        return this.enableIconMask;
    }

    public void putAuthor(String key, String value) {
        this.authors.put(key, value);
    }

    public void putDescription(String key, String value) {
        this.descriptions.put(key, value);
    }

    public void putDesigner(String key, String value) {
        this.designers.put(key, value);
    }

    public void putExtraMeta(String key, String value) {
        this.extraMeta.put(key, value);
    }

    public void putTitle(String key, String value) {
        this.titles.put(key, value);
    }

    public void setAllFrameCount(int frameCount) {
        this.allFrameCount = frameCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthors(Map<String, String> authors) {
        this.authors = authors;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescriptions(Map<String, String> descriptions) {
        this.descriptions = descriptions;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public void setDesigners(Map<String, String> designers) {
        this.designers = designers;
    }

    public void setExtraMeta(Map<String, String> extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setIconsCount(Integer iconCount) {
        this.iconsCount = iconCount;
    }

    public void setIsBackUpVersion(boolean isBackUpVersion) {
        this.isBackUpVersion = isBackUpVersion;
    }

    public void setIsOfficial(boolean isOfficial) {
        this.isOfficial = isOfficial;
    }

    public void setLageIconPackageName(String packageName) {
        this.lageIconPackageName = packageName;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public void setMiuiAdapterVersion(String miuiAdapterVersion) {
        this.miuiAdapterVersion = miuiAdapterVersion;
    }

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public void setRate(int frameRate) {
        this.rate = frameRate;
    }

    public void setResourceDeviceType(String type) {
        this.deviceType = type;
    }

    public void setScreenRatio(String screenRatio) {
        this.screenRatio = screenRatio;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setSmallFrameCount(int frameCount) {
        this.smallFrameCount = frameCount;
    }

    public int setStiffness(int stiffness) {
        this.stiffness = stiffness;
        return stiffness;
    }

    public void setSupportIconMask(boolean enableIconMask) {
        this.enableIconMask = enableIconMask;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setThemeType(int themeType) {
        this.themeType = themeType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitles(Map<String, String> titles) {
        this.titles = titles;
    }

    public void setTrackId(String trackId) {
        this.extraMeta.put("trackId", trackId);
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setWallpaperGalleryType(String type) {
        this.wallpeperGalleryType = type;
    }

    public void setWallpeperGalleryTypeId(String typeId) {
        this.wallpeperGalleryTypeId = typeId;
    }

    public void setWidgetDarkPreview(String widgetDarkPreview) {
        this.widgetDarkPreview = widgetDarkPreview;
    }

    public void setWidgetDeepLink(String link) {
        this.widgetDeepLink = link;
    }

    public void setWidgetPreview(String widgetPreview) {
        this.widgetPreview = widgetPreview;
    }

    public void setWidgetProductId(String id) {
        this.widgetProductId = id;
    }

    public void setWidgetSubjectId(String id) {
        this.widgetSubjectId = id;
    }

    public void updateFrom(ResourceInfo i2) {
        if (this == i2 || i2 == null) {
            return;
        }
        this.tags = i2.tags;
        this.size = i2.size;
        this.updatedTime = i2.updatedTime;
        int i3 = i2.platform;
        if (i3 > 0) {
            this.platform = i3;
        }
        if (!TextUtils.isEmpty(i2.version)) {
            this.version = i2.version;
        }
        if (!TextUtils.isEmpty(i2.author)) {
            this.author = i2.author;
        }
        if (!TextUtils.isEmpty(i2.designer)) {
            this.designer = i2.designer;
        }
        if (!TextUtils.isEmpty(i2.title)) {
            this.title = i2.title;
        }
        if (!TextUtils.isEmpty(i2.brief)) {
            this.brief = i2.brief;
        }
        if (!TextUtils.isEmpty(i2.description)) {
            this.description = i2.description;
        }
        Boolean bool = i2.like;
        if (bool != null) {
            this.like = bool;
        }
        Integer num = i2.likeCount;
        if (num != null) {
            this.likeCount = num;
        }
        if (!TextUtils.isEmpty(i2.packageVersion)) {
            this.packageVersion = i2.packageVersion;
        }
        Integer num2 = i2.iconsCount;
        if (num2 != null) {
            this.iconsCount = num2;
        }
        this.authors.clear();
        this.authors.putAll(i2.authors);
        this.designers.clear();
        this.designers.putAll(i2.designers);
        this.titles.clear();
        this.titles.putAll(i2.titles);
        this.descriptions.clear();
        this.descriptions.putAll(i2.descriptions);
        this.extraMeta.clear();
        this.extraMeta.putAll(i2.extraMeta);
        this.themeType = i2.themeType;
        this.rate = i2.rate;
        this.allFrameCount = i2.allFrameCount;
        this.smallFrameCount = i2.smallFrameCount;
        this.lageIconPackageName = i2.lageIconPackageName;
        this.isOfficial = i2.isOfficial;
        this.enableIconMask = i2.enableIconMask;
    }

    public String getAuthor(String key) {
        return this.authors.get(key);
    }

    public String getDescription(String key) {
        return this.descriptions.get(key);
    }

    public String getDesigner(String key) {
        return this.designers.get(key);
    }

    public String getExtraMeta(String key) {
        return this.extraMeta.get(key);
    }

    public String getTitle(String key) {
        return this.titles.get(key);
    }

    public String getAuthor(String key, String defaultValue) {
        String str = this.authors.get(key);
        return str != null ? str : defaultValue;
    }

    public String getDescription(String key, String defaultValue) {
        String str = this.descriptions.get(key);
        return str != null ? str : defaultValue;
    }

    public String getDesigner(String key, String defaultValue) {
        String str = this.designers.get(key);
        return str != null ? str : defaultValue;
    }

    public String getExtraMeta(String key, String defaultValue) {
        String str = this.extraMeta.get(key);
        return str != null ? str : defaultValue;
    }

    public String getTitle(String key, String defaultValue) {
        String str = this.titles.get(key);
        return str != null ? str : defaultValue;
    }
}
