package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.c */
/* JADX INFO: loaded from: classes3.dex */
final class C5770c implements FilenameFilter {
    C5770c() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return TextUtils.isDigitsOnly(str);
    }
}
