package com.miui.maml.util;

import com.miui.maml.ResourceLoader;
import java.io.InputStream;
import miui.content.res.ThemeResources;

/* JADX INFO: loaded from: classes3.dex */
public class FancyIconResourceLoader extends ResourceLoader {
    private static final String LOG_TAG = "FancyIconResourceLoader";
    private String mRelatviePathBaseIcons;

    public FancyIconResourceLoader(String str) {
        this.mRelatviePathBaseIcons = str;
    }

    @Override // com.miui.maml.ResourceLoader
    public String getID() {
        return LOG_TAG + this.mRelatviePathBaseIcons;
    }

    @Override // com.miui.maml.ResourceLoader
    public InputStream getInputStream(String str, long[] jArr) {
        return ThemeResources.getSystem().getIconStream(this.mRelatviePathBaseIcons + str, jArr);
    }

    @Override // com.miui.maml.ResourceLoader
    public boolean resourceExists(String str) {
        return ThemeResources.getSystem().hasIcon(this.mRelatviePathBaseIcons + str);
    }
}
