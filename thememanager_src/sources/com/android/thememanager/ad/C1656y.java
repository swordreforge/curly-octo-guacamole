package com.android.thememanager.ad;

import android.media.MediaMetadataRetriever;
import com.android.thememanager.ad.model.VideoAdResponse;
import java.util.HashMap;

/* JADX INFO: renamed from: com.android.thememanager.ad.y */
/* JADX INFO: compiled from: VideoAdUtls.java */
/* JADX INFO: loaded from: classes.dex */
public class C1656y {
    /* JADX INFO: renamed from: k */
    public static void m6535k(String videoUrl, VideoAdResponse response) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (videoUrl != null) {
                try {
                    mediaMetadataRetriever.setDataSource(videoUrl, new HashMap());
                    response.width = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    response.height = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                } finally {
                }
            }
            mediaMetadataRetriever.close();
        } catch (Exception unused) {
        }
    }
}
