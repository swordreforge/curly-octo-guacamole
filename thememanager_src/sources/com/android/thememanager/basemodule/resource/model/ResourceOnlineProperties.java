package com.android.thememanager.basemodule.resource.model;

import android.util.Pair;
import com.android.thememanager.basemodule.utils.kja0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResourceOnlineProperties implements Serializable {
    private static final String ATTR_COMMENT_PREVIEW_VIDEO_BIG_URL = "bigVideoUrl";
    private static final String ATTR_COMMENT_PREVIEW_VIDEO_SMALL_URL = "smallVideoUrl";
    private static final long serialVersionUID = 6;
    private String assemblyId;
    private String category;
    private String colorRingId;
    private String downloadPath;
    private ArrayList<Integer> fontWeightList;
    private boolean hasCheckBoughtStatus;
    private PathEntry headerDescPic;
    private PathEntry mainDescPic;
    private boolean onShelf;
    private String onlineId;
    private String onlinePath;
    private boolean productBought;
    private String productId;
    private String trialDialogMessage;
    private String trialDialogTitle;
    private long trialTime;
    private int productPrice = -1;
    private int originPrice = -1;
    private float score = -1.0f;
    private List<PathEntry> thumbnails = new ArrayList();
    private List<PathEntry> previews = new ArrayList();
    private ResourceInfo info = new ResourceInfo();

    private boolean equals(Object obj1, Object obj2) {
        return obj1 == obj2 || !(obj1 == null || obj2 == null || !obj1.equals(obj2));
    }

    private String trim(String s2) {
        if (s2 == null) {
            return null;
        }
        return s2.trim();
    }

    public void addPreview(PathEntry preview) {
        this.previews.add(preview);
    }

    public void addThumbnail(PathEntry thumbnail) {
        this.thumbnails.add(thumbnail);
    }

    public void clearPreviews() {
        this.previews.clear();
    }

    public void clearThumbnails() {
        this.thumbnails.clear();
    }

    public String getAssemblyId() {
        return this.assemblyId;
    }

    public String getCategory() {
        return this.category;
    }

    public String getColorRingId() {
        return this.colorRingId;
    }

    public String getDownloadPath() {
        return this.downloadPath;
    }

    public ArrayList<Integer> getFontWeightList() {
        return this.fontWeightList;
    }

    public PathEntry getHeaderDescPic() {
        return this.headerDescPic;
    }

    public ResourceInfo getInfo() {
        return this.info;
    }

    public PathEntry getMainDescPic() {
        return this.mainDescPic;
    }

    public String getOnlineId() {
        return this.onlineId;
    }

    public String getOnlinePath() {
        return this.onlinePath;
    }

    public int getOriginPrice() {
        return this.originPrice;
    }

    public List<PathEntry> getPreviews() {
        return this.previews;
    }

    public String getProductId() {
        return this.productId;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public float getScore() {
        return this.score;
    }

    public List<PathEntry> getThumbnails() {
        return this.thumbnails;
    }

    public String getTrialDialogMessage() {
        return this.trialDialogMessage;
    }

    public String getTrialDialogTitle() {
        return this.trialDialogTitle;
    }

    public long getTrialTime() {
        return this.trialTime;
    }

    public Pair<String, String> getVideoUrl() {
        return new Pair<>(this.info.getExtraMeta("bigVideoUrl", null), this.info.getExtraMeta("smallVideoUrl", null));
    }

    public boolean hasVideo() {
        return (this.info.getExtraMeta("bigVideoUrl") == null && this.info.getExtraMeta("smallVideoUrl") == null) ? false : true;
    }

    public boolean isCheckBoughtStatus() {
        return this.hasCheckBoughtStatus;
    }

    public boolean isOnShelf() {
        return this.onShelf;
    }

    public boolean isProductBought() {
        return this.productBought;
    }

    public void setAssemblyId(String assemblyId) {
        this.assemblyId = trim(assemblyId);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCheckBoughtStatus(boolean hasCheckBoughtStatus) {
        this.hasCheckBoughtStatus = hasCheckBoughtStatus;
    }

    public void setColorRingId(String colorRingId) {
        this.colorRingId = colorRingId;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = trim(downloadPath);
    }

    public void setFontWeightList(ArrayList<Integer> fontWeightList) {
        this.fontWeightList = fontWeightList;
    }

    public void setHeaderDescPic(PathEntry headerDescPic) {
        this.headerDescPic = headerDescPic;
    }

    public void setInfo(ResourceInfo info) {
        this.info = info;
    }

    public void setMainDescPic(PathEntry mainDescPic) {
        this.mainDescPic = mainDescPic;
    }

    public void setOnShelf(boolean onShelf) {
        this.onShelf = onShelf;
    }

    public void setOnlineId(String onlineId) {
        this.onlineId = trim(onlineId);
    }

    public void setOnlinePath(String onlinePath) {
        this.onlinePath = trim(onlinePath);
    }

    public void setOriginPrice(int originPrice) {
        this.originPrice = originPrice;
    }

    public void setPreviews(List<PathEntry> previews) {
        this.previews = previews;
    }

    public void setProductBought(boolean productBought) {
        this.productBought = productBought;
    }

    public void setProductId(String productId) {
        this.productId = trim(productId);
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setThumbnails(List<PathEntry> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public void setTrialDialogMessage(String trialDialogMessage) {
        this.trialDialogMessage = trialDialogMessage;
    }

    public void setTrialDialogTitle(String trialDialogTitle) {
        this.trialDialogTitle = trialDialogTitle;
    }

    public void setTrialTime(long trialTime) {
        this.trialTime = trialTime;
    }

    public void setVideoUrl(String downloadUrl, String previewUrl) {
        this.info.putExtraMeta("bigVideoUrl", downloadUrl);
        this.info.putExtraMeta("smallVideoUrl", previewUrl);
    }

    public void updateFrom(ResourceOnlineProperties p2) {
        if (this == p2 || p2 == null) {
            return;
        }
        this.onlineId = p2.onlineId;
        this.assemblyId = p2.assemblyId;
        this.productId = p2.productId;
        this.productPrice = p2.productPrice;
        this.originPrice = p2.originPrice;
        if (!this.productBought) {
            this.productBought = p2.productBought;
        }
        this.score = p2.score;
        long j2 = p2.trialTime;
        if (j2 >= 0) {
            this.trialTime = j2;
        }
        if (!kja0.qrj(p2.thumbnails)) {
            this.thumbnails.clear();
            this.thumbnails.addAll(p2.thumbnails);
        }
        if (!kja0.qrj(p2.previews)) {
            this.previews.clear();
            this.previews.addAll(p2.previews);
        }
        this.headerDescPic = p2.headerDescPic;
        this.mainDescPic = p2.mainDescPic;
        this.info.updateFrom(p2.info);
        this.downloadPath = p2.downloadPath;
        this.onlinePath = p2.onlinePath;
        this.trialDialogTitle = p2.trialDialogTitle;
        this.trialDialogMessage = p2.trialDialogMessage;
        this.colorRingId = p2.colorRingId;
        this.category = p2.category;
        this.onShelf = p2.onShelf;
        this.fontWeightList = p2.fontWeightList;
        this.hasCheckBoughtStatus = p2.hasCheckBoughtStatus;
    }
}
