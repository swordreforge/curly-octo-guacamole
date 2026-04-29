package com.android.thememanager.comment.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceComment implements Serializable {
    private static final long serialVersionUID = 2;
    public ResourceCommentOverview commentOverview;
    public List<ResourceCommentGroup> comments;
    public boolean hasMore = true;
    public long maxUpdateTime;
    public List<ResourceCommentGroup> topComments;
}
