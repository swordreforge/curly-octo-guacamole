package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.basemodule.imageloader.ThemeCustomizeGlideModule;
import com.bumptech.glide.integration.okhttp3.C2978k;
import java.util.Collections;
import java.util.Set;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: k */
    private final ThemeCustomizeGlideModule f17867k = new ThemeCustomizeGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.android.thememanager.basemodule.imageloader.ThemeCustomizeGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @lvui
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2980k mo10543n() {
        return new C2980k();
    }

    @Override // com.bumptech.glide.module.AbstractC3154k, com.bumptech.glide.module.toq
    /* JADX INFO: renamed from: k */
    public void mo6740k(@lvui Context context, @lvui C3164q builder) {
        this.f17867k.mo6740k(context, builder);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @lvui
    /* JADX INFO: renamed from: q */
    public Set<Class<?>> mo10544q() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.module.AbstractC3156q, com.bumptech.glide.module.InterfaceC3153g
    public void toq(@lvui Context context, @lvui zy glide, @lvui x2 registry) {
        new C2978k().toq(context, glide, registry);
        this.f17867k.toq(context, glide, registry);
    }

    @Override // com.bumptech.glide.module.AbstractC3154k
    public boolean zy() {
        return this.f17867k.zy();
    }
}
