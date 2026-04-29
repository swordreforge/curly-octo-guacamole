package com.miui.maml;

import android.content.Context;
import com.miui.maml.util.ZipResourceLoader;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenElementRootFactory {
    public static ScreenElementRoot create(Parameter parameter) {
        Context context = parameter.mContext;
        context.getClass();
        ResourceLoader local = parameter.mResourceLoader;
        String str = parameter.mPath;
        if (local == null && str != null && new File(str).exists()) {
            local = new ZipResourceLoader(str).setLocal(context.getResources().getConfiguration().locale);
        }
        ResourceLoader resourceLoader = local;
        if (resourceLoader == null) {
            return null;
        }
        return new ScreenElementRoot(new ScreenContext(context, new LifecycleResourceManager(resourceLoader, 3600000L, 360000L)));
    }

    public static class Parameter {
        private Context mContext;
        private String mPath;
        private ResourceLoader mResourceLoader;

        public Parameter(Context context, String str) {
            if (context != null) {
                this.mContext = context.getApplicationContext();
            }
            this.mPath = str;
        }

        public Parameter(Context context, ResourceLoader resourceLoader) {
            if (context != null) {
                this.mContext = context.getApplicationContext();
            }
            this.mResourceLoader = resourceLoader;
        }
    }
}
