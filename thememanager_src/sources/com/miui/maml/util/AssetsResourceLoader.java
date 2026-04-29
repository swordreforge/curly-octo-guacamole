package com.miui.maml.util;

import android.content.Context;
import android.text.TextUtils;
import com.miui.maml.ResourceLoader;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class AssetsResourceLoader extends ResourceLoader {
    private static final String LOG_TAG = "AssetsResourceLoader";
    private Context mContext;
    private String mResourcePath;

    public AssetsResourceLoader(Context context, String str) {
        this.mContext = context.getApplicationContext();
        this.mResourcePath = str;
    }

    @Override // com.miui.maml.ResourceLoader
    public String getID() {
        return LOG_TAG + this.mResourcePath;
    }

    @Override // com.miui.maml.ResourceLoader
    public InputStream getInputStream(String str, long[] jArr) {
        InputStream inputStreamOpen = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                inputStreamOpen = this.mContext.getAssets().open(this.mResourcePath + "/" + str);
                if (jArr != null && jArr.length > 0) {
                    jArr[0] = inputStreamOpen.available();
                }
            } catch (IOException unused) {
                MamlLog.m17850d(LOG_TAG, "resource " + str + " do not exists");
            }
        }
        return inputStreamOpen;
    }

    @Override // com.miui.maml.ResourceLoader
    public boolean resourceExists(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                InputStream inputStreamOpen = this.mContext.getAssets().open(this.mResourcePath + "/" + str);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        return true;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (IOException unused) {
                MamlLog.m17850d(LOG_TAG, "resource " + str + " do not exists");
            }
        }
        return false;
    }
}
