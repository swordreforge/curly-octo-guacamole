package com.tencent.wxop.stat.common;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.n */
/* JADX INFO: loaded from: classes3.dex */
class C5394n implements FileFilter {
    C5394n() {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
