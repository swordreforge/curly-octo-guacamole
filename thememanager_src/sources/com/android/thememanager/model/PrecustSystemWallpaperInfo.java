package com.android.thememanager.model;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.detail.video.model.PictureDescription;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PrecustSystemWallpaperInfo {
    public static final String FILE_SIZE_IN_KB = "fileSizeInKB";
    public static final String INNERTAGS = "innerTags";
    public String version;
    public Group[] wallpaperGroups;

    public static class Group {
        public int cardType;
        public int count;
        public int slideCount;
        public String subtitle;
        public String subtitleResId;
        public ArrayList<String> supportHWVersion;
        public String title;
        public String titleResId;
        public PreWallpaper[] wallpapers;
        public boolean randomOrder = false;
        public boolean mixed = false;
        public boolean conflictWithSuperWallpaper = false;
    }

    public static class PreWallpaper {
        private Map<String, PictureDescription> descriptionTranslationMap;
        public String downloadPath;
        public String fileSizeInKB;
        public int frameRate;
        public String isSupportLoop;
        public String maskPath;
        public int mattingMode;
        public String onlineId;
        public String originPath;
        public String originalImageUrl;
        public String previewPath;
        public int smallScreenFrameCount;
        public int stiffness;
        public String thumbPath;
        public String type;
        public int videoFrameCount;

        private static String toFilePath(String dir, String path) {
            if (TextUtils.isEmpty(path)) {
                return null;
            }
            return path.startsWith("/") ? path : new File(dir, path).getPath();
        }

        public Resource toWallpaper(String dir) {
            Resource resource = new Resource();
            String filePath = toFilePath(dir, this.thumbPath);
            String filePath2 = toFilePath(dir, this.originPath);
            String filePath3 = toFilePath(dir, this.maskPath);
            resource.setContentPath(filePath2);
            resource.setMetaPath(filePath2);
            resource.setCategory(this.type);
            resource.setMaskPath(filePath3);
            resource.setMattingMode(this.mattingMode);
            if (!TextUtils.isEmpty(this.onlineId)) {
                resource.setOnlineId(this.onlineId);
                resource.setProductId(this.onlineId);
            }
            PathEntry pathEntry = new PathEntry();
            pathEntry.setLocalPath(filePath);
            resource.setThumbnails(Collections.singletonList(pathEntry));
            if ("wallpaper".equals(this.type)) {
                PathEntry pathEntry2 = new PathEntry();
                if (TextUtils.isEmpty(this.originalImageUrl)) {
                    pathEntry2.setLocalPath(filePath2);
                } else {
                    pathEntry2.setOnlinePath(this.originalImageUrl);
                }
                resource.setPreviews(Collections.singletonList(pathEntry2));
            } else {
                if ("sensor".equals(this.type)) {
                    resource.setSensorVideoMessage(this.frameRate, this.videoFrameCount, this.smallScreenFrameCount, this.stiffness);
                }
                resource.setVideoUrl(this.downloadPath, this.previewPath);
                resource.putExtraMeta(PrecustSystemWallpaperInfo.FILE_SIZE_IN_KB, this.fileSizeInKB);
                if ("true".equals(this.isSupportLoop) || TextUtils.isEmpty(this.isSupportLoop)) {
                    resource.putExtraMeta(PrecustSystemWallpaperInfo.INNERTAGS, "mute,precust,loop");
                } else {
                    resource.putExtraMeta(PrecustSystemWallpaperInfo.INNERTAGS, "mute,precust");
                }
                if (this.descriptionTranslationMap != null) {
                    PictureDescription pictureDescription = this.descriptionTranslationMap.get(fu4.m7067k());
                    if (pictureDescription != null) {
                        resource.setPictureDescriptionTitle(pictureDescription.title);
                        resource.setPictureDescriptionContent(pictureDescription.content);
                    }
                }
            }
            return resource;
        }
    }
}
