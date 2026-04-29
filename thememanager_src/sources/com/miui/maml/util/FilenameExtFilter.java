package com.miui.maml.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class FilenameExtFilter implements FilenameFilter {
    private HashSet<String> mExts;

    public FilenameExtFilter(String[] strArr) {
        HashSet<String> hashSet = new HashSet<>();
        this.mExts = hashSet;
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (new File(file + File.separator + str).isDirectory()) {
            return true;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return contains(((String) str.subSequence(iLastIndexOf + 1, str.length())).toLowerCase());
        }
        return false;
    }

    public boolean contains(String str) {
        return this.mExts.contains(str.toLowerCase());
    }
}
