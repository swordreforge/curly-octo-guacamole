package com.android.thememanager.router.detail.entity;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentItem implements Serializable {
    private static final long serialVersionUID = 2;
    public Long commentId;
    public String content;
    public boolean isAllFirst;
    public Boolean isAuthor;
    public Boolean isOfficial;
    public boolean isWonderfulFirst;
    public Boolean like;
    public Integer likeCount;
    public String miuiVersion;
    public float score;
    public List<String> tags;
    public Long toCommentId;
    public String toUserIcon;
    public Long toUserKey;
    public String toUserName;
    public long updateTime;
    public String userIcon;
    public Long userKey;
    public String userName;

    public boolean equals(Object o2) {
        if (o2 == null || !(o2 instanceof ResourceCommentItem)) {
            return false;
        }
        if (o2 == this) {
            return true;
        }
        ResourceCommentItem resourceCommentItem = (ResourceCommentItem) o2;
        return this.updateTime == resourceCommentItem.updateTime && this.isAllFirst == resourceCommentItem.isAllFirst && this.isWonderfulFirst == resourceCommentItem.isWonderfulFirst;
    }

    public String toString() {
        return " content: " + this.content;
    }
}
