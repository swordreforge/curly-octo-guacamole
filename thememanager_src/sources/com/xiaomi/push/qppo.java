package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes3.dex */
class qppo implements FileFilter {
    qppo() {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
