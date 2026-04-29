package com.android.thememanager.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.bumptech.glide.request.InterfaceFutureC3172q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import yz.C7794k;

/* JADX INFO: compiled from: DownloadWallpaperTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class jp0y {

    /* JADX INFO: renamed from: k */
    private static final String f16577k = "DWTask";

    /* JADX INFO: renamed from: k */
    public static boolean m9838k(Resource resource, String path, String onlineUrl, String pageId, String sourceType) {
        if (resource == null) {
            C7794k.m28196p(f16577k, "Resource null !!");
            return false;
        }
        if (new File(path).exists()) {
            return true;
        }
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("name", resource.getTitle());
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("source", sourceType);
        arrayMapM6679k.put("resourceType", "wallpaper");
        arrayMapM6679k.put("productId", resource.getOnlineId());
        File file = new File(path);
        Context qVar = bf2.toq.toq();
        if (TextUtils.isEmpty(onlineUrl)) {
            C7794k.m28196p(f16577k, "can not downloadImage. onlineUrl null !");
            return false;
        }
        InterfaceFutureC3172q<File> interfaceFutureC3172qDxef = com.bumptech.glide.zy.a9(qVar).mcp().mo6748i(onlineUrl).dxef();
        try {
            if (!file.getParentFile().exists()) {
                C1821p.qrj(file.getParentFile(), 509, -1, -1);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            File file2 = interfaceFutureC3172qDxef.get();
            if (file2 == null || !file2.exists()) {
                C7794k.toq(f16577k, "glide failed to load. ");
            } else {
                C1821p.f7l8(new FileInputStream(file2), file);
                C1821p.zy(file.getAbsolutePath(), 509);
            }
        } catch (IOException | InterruptedException | SecurityException | ExecutionException e2) {
            C7794k.m28196p(f16577k, String.format("glide load fail , error:%s", e2.toString()));
        }
        com.bumptech.glide.zy.a9(qVar).wvg(interfaceFutureC3172qDxef);
        if (!file.exists()) {
            C7794k.m28195n(f16577k, "after decode. destFile not exist !");
            return false;
        }
        com.android.thememanager.basemodule.analysis.kja0.m6641s("DOWNLOAD", pageId, resource.getOnlineInfo().getTrackId(), null);
        C1708s.f7l8().ld6().dd(C1706p.n7h(pageId, resource.getOnlineInfo().getTrackId(), arrayMapM6679k));
        return true;
    }
}
