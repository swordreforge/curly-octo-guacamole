package com.android.thememanager.model;

import android.graphics.Matrix;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperHistoryItem {
    private final boolean isVideo;

    @dd
    private final Matrix matrix;

    @dd
    private final String path;
    private final long time;

    public WallpaperHistoryItem(@dd String path, @dd Matrix matrix, long time, boolean video) {
        this.path = path;
        this.matrix = matrix;
        this.time = time;
        this.isVideo = video;
    }

    @dd
    public Matrix getMatrix() {
        return this.matrix;
    }

    @dd
    public String getPath() {
        return this.path;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isVideo() {
        return this.isVideo;
    }
}
