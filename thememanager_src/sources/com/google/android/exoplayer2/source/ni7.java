package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: y */
    private static final AtomicLong f21657y = new AtomicLong();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final long f65462f7l8;

    /* JADX INFO: renamed from: g */
    public final long f21658g;

    /* JADX INFO: renamed from: k */
    public final long f21659k;

    /* JADX INFO: renamed from: n */
    public final long f21660n;

    /* JADX INFO: renamed from: q */
    public final Map<String, List<String>> f21661q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.t8r f65463toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final Uri f65464zy;

    public ni7(long j2, com.google.android.exoplayer2.upstream.t8r t8rVar, long j3) {
        this(j2, t8rVar, t8rVar.f23103k, Collections.emptyMap(), j3, 0L, 0L);
    }

    /* JADX INFO: renamed from: k */
    public static long m12808k() {
        return f21657y.getAndIncrement();
    }

    public ni7(long j2, com.google.android.exoplayer2.upstream.t8r t8rVar, Uri uri, Map<String, List<String>> map, long j3, long j4, long j5) {
        this.f21659k = j2;
        this.f65463toq = t8rVar;
        this.f65464zy = uri;
        this.f21661q = map;
        this.f21660n = j3;
        this.f21658g = j4;
        this.f65462f7l8 = j5;
    }
}
