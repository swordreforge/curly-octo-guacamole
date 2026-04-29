package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.p */
/* JADX INFO: compiled from: Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3397p {

    /* JADX INFO: renamed from: k */
    public static final int f20152k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64378toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64379zy = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.p$k */
    /* JADX INFO: compiled from: Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: k */
    void mo11688k(long j2, long j3);

    /* JADX INFO: renamed from: q */
    void mo11689q(x2 x2Var);

    void release();

    boolean toq(ld6 ld6Var) throws IOException;

    int zy(ld6 ld6Var, fu4 fu4Var) throws IOException;
}
