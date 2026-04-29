package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.r */
/* JADX INFO: compiled from: MediaDrmCallbackException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3319r extends IOException {
    public final long bytesLoaded;
    public final com.google.android.exoplayer2.upstream.t8r dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public C3319r(com.google.android.exoplayer2.upstream.t8r t8rVar, Uri uri, Map<String, List<String>> map, long j2, Throwable th) {
        super(th);
        this.dataSpec = t8rVar;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j2;
    }
}
