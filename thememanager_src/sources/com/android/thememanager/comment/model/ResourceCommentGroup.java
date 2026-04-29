package com.android.thememanager.comment.model;

import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentGroup implements Serializable {
    private static final long serialVersionUID = 1;
    public ResourceCommentItem main;
    public List<ResourceCommentItem> subList;
}
