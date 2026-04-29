package com.android.thememanager.model;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendItem implements Serializable {
    public static final long FLAG_APPEND_PARAMS = 2;
    public static final long FLAG_OPEN_INSIDE = 1;
    public static final String RECOMMEND_ITEM_IS_TAG = "RECOMMEND_ITEM_IS_TAG";
    private static final long serialVersionUID = 2;
    private String contentId;
    private Bundle extraMeta;
    private long flags;
    private int heightCount;
    private boolean isSelect;
    private String itemId;
    private RecommendType itemType;
    private String localThumbnail;
    private boolean loginRequried;
    private String onlineThumbnail;
    private List<PageGroup> pageGroups = new ArrayList();
    private String resourceStamp;
    private String title;
    private int widthCount;

    public enum RecommendType {
        UNKNOWN,
        SINGLE,
        PAGE,
        LINK,
        PACK,
        SEARCH,
        CUSTOMIZE,
        LOCAL,
        COMMENT
    }

    public void addPageGroup(PageGroup pageGroup) {
        this.pageGroups.add(pageGroup);
    }

    public void clearPageGroups() {
        this.pageGroups.clear();
    }

    public String getContentId() {
        return this.contentId;
    }

    public Bundle getExtraMeta() {
        if (this.extraMeta == null) {
            this.extraMeta = new Bundle();
        }
        return this.extraMeta;
    }

    public long getFlags() {
        return this.flags;
    }

    public int getHeightCount() {
        return this.heightCount;
    }

    public String getItemId() {
        return this.itemId;
    }

    public RecommendType getItemType() {
        return this.itemType;
    }

    public String getLocalThumbnail() {
        return this.localThumbnail;
    }

    public String getOnlineThumbnail() {
        return this.onlineThumbnail;
    }

    public List<PageGroup> getPageGroups() {
        return this.pageGroups;
    }

    public String getResourceStamp() {
        return this.resourceStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidthCount() {
        return this.widthCount;
    }

    public boolean isLoginRequried() {
        return this.loginRequried;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public void setExtraMeta(Bundle extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }

    public void setHeightCount(int heightCount) {
        this.heightCount = heightCount;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemType(RecommendType itemType) {
        this.itemType = itemType;
    }

    public void setLocalThumbnail(String localThumbnail) {
        this.localThumbnail = localThumbnail;
    }

    public void setLoginRequried(boolean loginRequried) {
        this.loginRequried = loginRequried;
    }

    public void setOnlineThumbnail(String onlineThumbnail) {
        this.onlineThumbnail = onlineThumbnail;
    }

    public void setPageGroups(List<PageGroup> pageGroups) {
        this.pageGroups = pageGroups;
    }

    public void setResourceStamp(String resourceStamp) {
        this.resourceStamp = resourceStamp;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWidthCount(int widthCount) {
        this.widthCount = widthCount;
    }

    public String toString() {
        return this.title;
    }
}
