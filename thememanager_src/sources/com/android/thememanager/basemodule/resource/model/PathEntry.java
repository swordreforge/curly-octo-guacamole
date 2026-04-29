package com.android.thememanager.basemodule.resource.model;

import android.net.Uri;
import com.android.thememanager.h5.f7l8;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class PathEntry implements Serializable {
    public static final String LOCAL_PATH = "localPath";
    public static final String ONLINE_PATH = "onlinePath";
    private static final long serialVersionUID = 1;
    private String localPath;
    private String onlinePath;

    public PathEntry() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PathEntry pathEntry = (PathEntry) obj;
        return equals(this.localPath, pathEntry.localPath) && equals(this.onlinePath, pathEntry.onlinePath);
    }

    public String getAbsoluteLocalPath() {
        String str = this.localPath;
        if (str == null || Uri.parse(str).getScheme() != null) {
            return this.localPath;
        }
        return f7l8.f12010h + this.localPath;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getOnlinePath() {
        return this.onlinePath;
    }

    public int hashCode() {
        String str = this.localPath;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.onlinePath;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public void setOnlinePath(String onlinePath) {
        this.onlinePath = onlinePath;
    }

    public PathEntry(String localPath, String onlinePath) {
        this.localPath = localPath;
        this.onlinePath = onlinePath;
    }

    private boolean equals(Object obj1, Object obj2) {
        return obj1 == obj2 || !(obj1 == null || obj2 == null || !obj1.equals(obj2));
    }
}
