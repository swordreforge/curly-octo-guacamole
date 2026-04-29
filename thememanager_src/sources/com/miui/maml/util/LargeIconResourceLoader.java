package com.miui.maml.util;

import android.text.TextUtils;
import com.miui.maml.ResourceLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class LargeIconResourceLoader extends ResourceLoader {
    private static final String LOG_TAG = "LargeIconResourceLoader";
    private final String mResourcePath;

    public LargeIconResourceLoader(String str) {
        this.mResourcePath = str;
    }

    @Override // com.miui.maml.ResourceLoader
    public String getID() {
        return LOG_TAG + this.mResourcePath;
    }

    @Override // com.miui.maml.ResourceLoader
    public InputStream getInputStream(String str, long[] jArr) {
        FileInputStream fileInputStream = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.mResourcePath + "/" + str);
            if (jArr == null) {
                return fileInputStream2;
            }
            try {
                if (jArr.length <= 0) {
                    return fileInputStream2;
                }
                jArr[0] = fileInputStream2.available();
                return fileInputStream2;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                e.printStackTrace();
                return fileInputStream;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.miui.maml.ResourceLoader
    public boolean resourceExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(this.mResourcePath + "/" + str).exists();
    }
}
