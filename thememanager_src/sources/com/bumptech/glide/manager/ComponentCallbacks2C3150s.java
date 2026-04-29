package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.manager.s */
/* JADX INFO: compiled from: FirstFrameAndAfterTrimMemoryWaiter.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(26)
final class ComponentCallbacks2C3150s implements ld6, ComponentCallbacks2 {
    ComponentCallbacks2C3150s() {
    }

    @Override // com.bumptech.glide.manager.ld6
    /* JADX INFO: renamed from: k */
    public void mo11082k(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@lvui Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }
}
