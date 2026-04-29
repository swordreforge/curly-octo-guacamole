package com.google.common.net;

import com.google.common.escape.AbstractC4601g;

/* JADX INFO: renamed from: com.google.common.net.y */
/* JADX INFO: compiled from: UrlEscapers.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4732y {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f68486toq = "-._~!$'()*,;&=@:";

    /* JADX INFO: renamed from: k */
    static final String f27241k = "-_.*";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final AbstractC4601g f68487zy = new f7l8(f27241k, true);

    /* JADX INFO: renamed from: q */
    private static final AbstractC4601g f27243q = new f7l8("-._~!$'()*,;&=@:+", false);

    /* JADX INFO: renamed from: n */
    private static final AbstractC4601g f27242n = new f7l8("-._~!$'()*,;&=@:+/?", false);

    private C4732y() {
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC4601g m16621k() {
        return f68487zy;
    }

    public static AbstractC4601g toq() {
        return f27242n;
    }

    public static AbstractC4601g zy() {
        return f27243q;
    }
}
