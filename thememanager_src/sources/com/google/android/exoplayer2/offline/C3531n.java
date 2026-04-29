package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.C3844k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n */
/* JADX INFO: compiled from: Download.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3531n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f65031cdj = 1;

    /* JADX INFO: renamed from: h */
    public static final int f20969h = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f65032ki = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f65033kja0 = 7;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f65034ld6 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f65035n7h = 5;

    /* JADX INFO: renamed from: p */
    public static final int f20970p = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f65036qrj = 4;

    /* JADX INFO: renamed from: s */
    public static final int f20971s = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f65037x2 = 3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final int f65038f7l8;

    /* JADX INFO: renamed from: g */
    public final int f20972g;

    /* JADX INFO: renamed from: k */
    public final DownloadRequest f20973k;

    /* JADX INFO: renamed from: n */
    public final long f20974n;

    /* JADX INFO: renamed from: q */
    public final long f20975q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f65039toq;

    /* JADX INFO: renamed from: y */
    final fn3e f20976y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final long f65040zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n$k */
    /* JADX INFO: compiled from: Download.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.n$toq */
    /* JADX INFO: compiled from: Download.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public C3531n(DownloadRequest downloadRequest, int i2, long j2, long j3, long j4, int i3, int i4) {
        this(downloadRequest, i2, j2, j3, j4, i3, i4, new fn3e());
    }

    /* JADX INFO: renamed from: k */
    public long m12391k() {
        return this.f20976y.f20954k;
    }

    public float toq() {
        return this.f20976y.f65025toq;
    }

    public boolean zy() {
        int i2 = this.f65039toq;
        return i2 == 3 || i2 == 4;
    }

    public C3531n(DownloadRequest downloadRequest, int i2, long j2, long j3, long j4, int i3, int i4, fn3e fn3eVar) {
        C3844k.f7l8(fn3eVar);
        C3844k.m13629k((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            C3844k.m13629k((i2 == 2 || i2 == 0) ? false : true);
        }
        this.f20973k = downloadRequest;
        this.f65039toq = i2;
        this.f65040zy = j2;
        this.f20975q = j3;
        this.f20974n = j4;
        this.f20972g = i3;
        this.f65038f7l8 = i4;
        this.f20976y = fn3eVar;
    }
}
