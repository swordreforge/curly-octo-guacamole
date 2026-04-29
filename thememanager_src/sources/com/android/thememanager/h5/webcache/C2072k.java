package com.android.thememanager.h5.webcache;

import android.net.Uri;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.h5.webcache.toq;
import com.android.thememanager.util.ch;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import miuix.hybrid.cdj;

/* JADX INFO: renamed from: com.android.thememanager.h5.webcache.k */
/* JADX INFO: compiled from: WebCacheManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2072k {

    /* JADX INFO: renamed from: k */
    private static final String f12263k = "WebCacheManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60317toq = "needLocalCache";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60318zy = C1788k.f10175k + com.android.thememanager.basemodule.resource.constants.toq.cax + "webResCache/";

    /* JADX INFO: renamed from: k */
    public static String m7976k(Uri uri) {
        return f60318zy + ch.gvn7(uri.getPath());
    }

    public static cdj toq(String strUrl) {
        Uri uri = Uri.parse(strUrl);
        if (uri.getBooleanQueryParameter(f60317toq, false)) {
            toq.C7922toq.m7979k(f12263k, "url = %s", strUrl);
            zurt zurtVar = new zurt(uri);
            zurtVar.removeParameter(f60317toq);
            String strM7976k = m7976k(uri);
            InputStream inputStreamZy = zy(strM7976k);
            if (inputStreamZy == null) {
                toq.C7922toq.m7979k(f12263k, "download %s", strUrl);
                new File(strM7976k).getParentFile().mkdirs();
                inputStreamZy = toq.m7977k(zurtVar.getFinalGetUrl(), strM7976k);
            } else {
                toq.C7922toq.m7979k(f12263k, "open file for %s", strM7976k);
            }
            if (inputStreamZy != null) {
                return new cdj(null, null, inputStreamZy);
            }
        }
        return null;
    }

    static InputStream zy(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            file.setLastModified(System.currentTimeMillis());
            return fileInputStream;
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }
}
