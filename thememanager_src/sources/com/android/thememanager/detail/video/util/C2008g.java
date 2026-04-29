package com.android.thememanager.detail.video.util;

import android.util.ArrayMap;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import java.util.Map;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: com.android.thememanager.detail.video.util.g */
/* JADX INFO: compiled from: VideoWallpaperStatisticsUploadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2008g {

    /* JADX INFO: renamed from: k */
    private static final String f11464k = "VIDEO_WALLPAPER_TIMES";

    /* JADX INFO: renamed from: k */
    public static void m7846k(String pageId, String trackId, Map<String, String> extras) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            if (!z2) {
                sb.append(eqxt.f36674q);
            }
            z2 = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        kja0.m6641s(f11464k, pageId, trackId, sb.toString());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.putAll(extras);
        C1708s.f7l8().ld6().n5r1(f11464k, C1706p.n7h(pageId, trackId, arrayMap));
    }
}
