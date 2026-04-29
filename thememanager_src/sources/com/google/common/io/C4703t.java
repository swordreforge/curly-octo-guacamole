package com.google.common.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.t */
/* JADX INFO: compiled from: PatternFilenameFilter.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4703t implements FilenameFilter {

    /* JADX INFO: renamed from: k */
    private final Pattern f27103k;

    public C4703t(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(@NullableDecl File file, String str) {
        return this.f27103k.matcher(str).matches();
    }

    public C4703t(Pattern pattern) {
        this.f27103k = (Pattern) com.google.common.base.jk.a9(pattern);
    }
}
