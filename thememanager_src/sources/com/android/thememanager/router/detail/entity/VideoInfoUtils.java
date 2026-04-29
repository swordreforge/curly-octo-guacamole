package com.android.thememanager.router.detail.entity;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.model.PrecustSystemWallpaperInfo;
import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import miuix.core.util.C7083n;
import zsr0.toq;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: loaded from: classes2.dex */
public class VideoInfoUtils {
    public static final int FLAG_APPLY_INCALL_SHOW = 2;
    public static final int FLAG_APPLY_VIDEO_WALLPAPER = 1;
    public static final String ID_IN_CALL_SHOW_REMOVE = "incall_show_remove";
    public static final String NO_LOOP = "noLoop";
    public static final String SUPPORTLOOP = "loop";
    private static final String TAG = "VideoInfo";
    public static final int USING_TYPE_INCALL_SHOW = 2;
    public static final int USING_TYPE_WALLPAPER = 1;
    public static final String VIDEO_MUTE = "mute";
    public static final String VIDEO_PRECUST = "precust";

    /* JADX INFO: renamed from: com.android.thememanager.router.detail.entity.VideoInfoUtils$1TempSortObject, reason: invalid class name */
    class C1TempSortObject {
        String id;
        long time;

        C1TempSortObject() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApplyFlag {
    }

    @lvui
    @y9n
    public static List<VideoInfo> fetchDynamicVideoInfo() {
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            File file = new File(InterfaceC1789q.p9k9);
            if (file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.android.thememanager.router.detail.entity.VideoInfoUtils.11
                    @Override // java.io.FileFilter
                    public boolean accept(File pathname) {
                        return pathname.getName().equals("dynamic_video_wallpaper.mp4");
                    }
                });
                Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.android.thememanager.router.detail.entity.VideoInfoUtils.12
                    @Override // java.util.Comparator
                    public int compare(File o1, File o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                arrayList2.addAll(Arrays.asList(fileArrListFiles));
            }
            for (File file2 : arrayList2) {
                VideoInfo videoInfo = new VideoInfo();
                videoInfo.path = file2.getAbsolutePath();
                arrayList.add(videoInfo);
            }
        } catch (Exception e2) {
            Log.i(TAG, "load dynamic video data exception : ", e2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00df A[Catch: all -> 0x00fa, TryCatch #2 {all -> 0x00fa, blocks: (B:20:0x00a2, B:22:0x00a8, B:24:0x00b4, B:26:0x00bf, B:28:0x00c5, B:30:0x00cd, B:32:0x00db, B:34:0x00f3, B:33:0x00df), top: B:58:0x00a2, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.android.thememanager.router.detail.entity.VideoInfo> fetchShowVideoInfo() {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.router.detail.entity.VideoInfoUtils.fetchShowVideoInfo():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:4:0x000c, B:6:0x0019, B:8:0x001f, B:12:0x003d, B:14:0x004e, B:15:0x0052, B:17:0x0058, B:19:0x0069, B:21:0x006f, B:22:0x009d, B:24:0x00a7, B:29:0x00b6, B:31:0x00c3, B:33:0x00c9, B:35:0x00d4, B:37:0x00d7, B:38:0x0102, B:39:0x010e, B:41:0x0114, B:42:0x0129, B:43:0x012d, B:45:0x0133, B:26:0x00ad, B:47:0x0146, B:49:0x0153, B:51:0x0159, B:52:0x0171, B:53:0x0175, B:55:0x017b), top: B:59:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:4:0x000c, B:6:0x0019, B:8:0x001f, B:12:0x003d, B:14:0x004e, B:15:0x0052, B:17:0x0058, B:19:0x0069, B:21:0x006f, B:22:0x009d, B:24:0x00a7, B:29:0x00b6, B:31:0x00c3, B:33:0x00c9, B:35:0x00d4, B:37:0x00d7, B:38:0x0102, B:39:0x010e, B:41:0x0114, B:42:0x0129, B:43:0x012d, B:45:0x0133, B:26:0x00ad, B:47:0x0146, B:49:0x0153, B:51:0x0159, B:52:0x0171, B:53:0x0175, B:55:0x017b), top: B:59:0x000c }] */
    @zy.lvui
    @zy.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.android.thememanager.router.detail.entity.VideoInfo> fetchVideoInfo(boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.router.detail.entity.VideoInfoUtils.fetchVideoInfo(boolean, boolean):java.util.List");
    }

    public static VideoInfo fromResource(Resource item) {
        VideoInfo videoInfo = new VideoInfo();
        String onlineId = item.getOnlineId();
        videoInfo.onlineId = onlineId;
        if (TextUtils.isEmpty(onlineId)) {
            String contentPath = item.getContentPath();
            videoInfo.previewPath = contentPath;
            videoInfo.path = contentPath;
        } else {
            Pair<String, String> videoUrl = item.getVideoUrl();
            videoInfo.name = item.getLocalInfo().getTitle();
            videoInfo.path = (String) videoUrl.first;
            videoInfo.previewPath = (String) videoUrl.second;
            videoInfo.sizeBytes = hyr.m7094y(item.getExtraMeta(PrecustSystemWallpaperInfo.FILE_SIZE_IN_KB), 0);
            videoInfo.innerTags = hyr.m7090g(",", item.getExtraMeta(PrecustSystemWallpaperInfo.INNERTAGS));
            if (item.getThumbnails() != null && item.getThumbnails().size() > 0) {
                String localPath = item.getThumbnails().get(0).getLocalPath();
                videoInfo.thumbnail = localPath;
                if (TextUtils.isEmpty(localPath)) {
                    videoInfo.thumbnail = item.getThumbnails().get(0).getOnlinePath();
                }
            }
            videoInfo.pictureDescriptionTitle = item.getPictureDescriptionTitle();
            videoInfo.pictureDescriptionContent = item.getPictureDescriptionContent();
        }
        if (C1807g.zurt() && "sensor".equals(item.getCategory())) {
            videoInfo.allScreenFrameCount = item.getAllFrameCount();
            videoInfo.smallScreenFrameCount = item.getSmallFrameCount();
            videoInfo.rate = item.getRate();
            videoInfo.stiffness = item.getStiffness();
            videoInfo.videoType = item.getCategory();
            if (!com.android.thememanager.basemodule.utils.y9n.mcp(item.getThumbnails())) {
                String localPath2 = item.getThumbnails().get(0).getLocalPath();
                videoInfo.thumbnail = localPath2;
                String qVar = toq.toq(localPath2);
                if (!C1821p.m7188p(qVar)) {
                    qVar = videoInfo.thumbnail;
                }
                videoInfo.smallSensorThumbnail = qVar;
            }
        }
        return videoInfo;
    }

    public static List<VideoInfo> fromResourceList(@lvui List<Resource> resList) {
        ArrayList arrayList = new ArrayList();
        Iterator<Resource> it = resList.iterator();
        while (it.hasNext()) {
            arrayList.add(fromResource(it.next()));
        }
        return arrayList;
    }

    public static boolean isDynamicVideoInfo(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return false;
        }
        return isDynamicVideoInfo(videoInfo.path);
    }

    private static boolean isEqualFile(String originPath, String destPath) {
        return !TextUtils.isEmpty(originPath) && originPath.equals(destPath);
    }

    public static boolean isOnlineFile(VideoInfo videoInfo) {
        String str = videoInfo.path;
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isSystemFile(@dd VideoInfo videoInfo) {
        String str;
        List<String> list;
        return videoInfo != null && (((str = videoInfo.path) != null && str.startsWith("/system/")) || ((list = videoInfo.innerTags) != null && list.contains(VIDEO_PRECUST)));
    }

    public static boolean isUsing(VideoInfo videoInfo, int usingType) {
        if (TextUtils.isEmpty(videoInfo.path)) {
            return false;
        }
        if (isDynamicVideoInfo(videoInfo)) {
            return vyq.t8r().contains(InterfaceC1789q.y6);
        }
        if (usingType != 1 && usingType != 2) {
            return false;
        }
        String strM25584g = C7083n.m25584g(videoInfo.path);
        if (usingType != 1) {
            return isEqualFile(C1821p.x2(videoInfo.path), C1821p.x2(vyq.fu4(InterfaceC1789q.ta3f)));
        }
        if (isEqualFile(strM25584g, vyq.fu4("wallpaper"))) {
            return true;
        }
        return isEqualFile(strM25584g, vyq.fu4("lockscreen"));
    }

    public static boolean isUsingWallpaper(String code, String path) {
        if ("lockscreen".equals(code) || "wallpaper".equals(code)) {
            return isEqualFile(path, vyq.fu4(code));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean tagContainMute(@dd String tags) {
        List<String> listM7090g = hyr.m7090g(",", tags);
        return listM7090g != null && listM7090g.contains(VIDEO_MUTE);
    }

    public static boolean isDynamicVideoInfo(String path) {
        return !TextUtils.isEmpty(path) && path.contains("dynamic_video");
    }
}
