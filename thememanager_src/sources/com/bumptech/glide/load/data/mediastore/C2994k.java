package com.bumptech.glide.load.data.mediastore;

import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.mediastore.k */
/* JADX INFO: compiled from: FileService.java */
/* JADX INFO: loaded from: classes2.dex */
class C2994k {
    C2994k() {
    }

    /* JADX INFO: renamed from: k */
    public boolean m10638k(File file) {
        return file.exists();
    }

    public File toq(String str) {
        return new File(str);
    }

    public long zy(File file) {
        return file.length();
    }
}
