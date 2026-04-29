package com.bumptech.glide.load.engine.cache;

import java.io.File;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.k */
/* JADX INFO: compiled from: DiskCache.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3016k {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.k$k */
    /* JADX INFO: compiled from: DiskCache.java */
    public interface k {

        /* JADX INFO: renamed from: k */
        public static final int f18294k = 262144000;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f62732toq = "image_manager_disk_cache";

        @dd
        InterfaceC3016k build();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.k$toq */
    /* JADX INFO: compiled from: DiskCache.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        boolean mo10712k(@lvui File file);
    }

    void clear();

    /* JADX INFO: renamed from: k */
    void mo10711k(com.bumptech.glide.load.f7l8 f7l8Var, toq toqVar);

    @dd
    File toq(com.bumptech.glide.load.f7l8 f7l8Var);

    void zy(com.bumptech.glide.load.f7l8 f7l8Var);
}
