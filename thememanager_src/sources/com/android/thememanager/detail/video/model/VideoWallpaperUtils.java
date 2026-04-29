package com.android.thememanager.detail.video.model;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import bf2.toq;
import com.android.thememanager.basemodule.utils.C1821p;
import com.bumptech.glide.request.InterfaceFutureC3172q;
import com.bumptech.glide.zy;
import com.google.android.exoplayer2.util.wvg;
import ek5k.C6002g;
import java.io.File;
import java.io.FileInputStream;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class VideoWallpaperUtils {

    private static class getMimeTypeTask extends AsyncTask<String, String, Pair<String, String>> {
        private String mMediaPath;
        private LocalVideoResource mResource;

        public getMimeTypeTask(String path, LocalVideoResource resource) {
            this.mMediaPath = path;
            this.mResource = resource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Pair<String, String> doInBackground(String... strings) {
            String strExtractMetadata;
            String string = null;
            if (this.mMediaPath == null) {
                return null;
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.mMediaPath);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
            } catch (Exception e2) {
                e = e2;
                strExtractMetadata = null;
            }
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(this.mMediaPath);
                string = mediaExtractor.getTrackFormat(0).getString("mime");
            } catch (Exception e3) {
                e = e3;
                Log.e("VideoWallpaperUtils", "doInBackground: ", e);
            }
            return new Pair<>(strExtractMetadata, string);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Pair<String, String> pair) {
            super.onPostExecute(pair);
            this.mResource.setMimeType((String) pair.first);
            this.mResource.setVideoType((String) pair.second);
        }
    }

    public static boolean downLoadVideoWallpaper(String onlineUrl, String targetPath) {
        File file = new File(targetPath);
        if (TextUtils.isEmpty(onlineUrl)) {
            C7794k.m28196p("VideoWallpaperUtils", "can not downloadImage. onlineUrl null !");
            return false;
        }
        Context qVar = toq.toq();
        InterfaceFutureC3172q<File> interfaceFutureC3172qDxef = zy.a9(qVar).mcp().mo6748i(onlineUrl).dxef();
        try {
            if (!file.getParentFile().exists()) {
                C1821p.qrj(file.getParentFile(), 509, -1, -1);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            File file2 = interfaceFutureC3172qDxef.get();
            if (file2 == null || !file2.exists()) {
                C7794k.toq("VideoWallpaperUtils", "glide failed to load. ");
            } else {
                zF7l8 = C1821p.f7l8(new FileInputStream(file2), file) & (C1821p.zy(file.getAbsolutePath(), 509) >= 0);
            }
        } catch (Exception e2) {
            C7794k.m28196p("VideoWallpaperUtils", String.format("glide load fail , error:%s", e2.toString()));
        }
        zy.a9(qVar).wvg(interfaceFutureC3172qDxef);
        return zF7l8;
    }

    public static void getMimeType(LocalVideoResource resource, String path) {
        new getMimeTypeTask(path, resource).executeOnExecutor(C6002g.ld6(), new String[0]);
    }

    public static boolean isDolbyVisionVideo(String mimeType) {
        return TextUtils.equals(mimeType, wvg.f67126ni7);
    }
}
