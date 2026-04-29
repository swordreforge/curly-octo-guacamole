package com.android.thememanager.basemodule.video;

import android.annotation.NonNull;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.android.thememanager.basemodule.utils.hyr;
import java.util.HashMap;
import zy.lvui;

/* JADX INFO: compiled from: VideoFormatUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {
    /* JADX INFO: renamed from: k */
    public static long m7263k(int currentFrameCount, int rate) {
        if (rate < 1) {
            rate = 60;
        }
        return (((long) currentFrameCount) * 1000000) / ((long) rate);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [android.media.MediaMetadataRetriever$BitmapParams] */
    public static Bitmap toq(String originPath, long timeUs, int option) {
        Bitmap frameAtTime;
        Bitmap bitmap = null;
        if (p029m.zy.toq(originPath)) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                if (originPath.startsWith("http://") || originPath.startsWith("https://")) {
                    mediaMetadataRetriever.setDataSource(originPath, new HashMap());
                } else if (originPath.startsWith("content://")) {
                    mediaMetadataRetriever.setDataSource(bf2.toq.toq(), Uri.parse(originPath));
                } else {
                    mediaMetadataRetriever.setDataSource(originPath);
                }
                if (timeUs < 0) {
                    timeUs = Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) * 1000;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    ?? r4 = new Object() { // from class: android.media.MediaMetadataRetriever$BitmapParams
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ void setPreferredConfig(@NonNull Bitmap.Config config);
                    };
                    r4.setPreferredConfig(Bitmap.Config.ARGB_8888);
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(timeUs, option, r4);
                } else {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(timeUs, option);
                }
                bitmap = frameAtTime;
                mediaMetadataRetriever.close();
            } finally {
            }
        } catch (Exception e2) {
            Log.w("VideoFormatUtil", "retriever, " + e2);
        }
        return bitmap;
    }

    public static int zy(@lvui String videoPath) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(videoPath);
            return hyr.m7094y(mediaMetadataRetriever.extractMetadata(24), 0);
        } catch (IllegalArgumentException unused) {
            Log.e("VideoFormatUtil", "fail get rotation for " + videoPath);
            return 0;
        }
    }
}
