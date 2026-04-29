package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.sok;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: EbmlProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface toq {

    /* JADX INFO: renamed from: g */
    public static final int f19928g = 5;

    /* JADX INFO: renamed from: k */
    public static final int f19929k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f19930n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f19931q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64039toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64040zy = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.toq$k */
    /* JADX INFO: compiled from: EbmlProcessor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3360k {
    }

    void f7l8(int i2, String str) throws sok;

    /* JADX INFO: renamed from: g */
    void mo11808g(int i2, int i3, ld6 ld6Var) throws IOException;

    /* JADX INFO: renamed from: k */
    void mo11809k(int i2) throws sok;

    /* JADX INFO: renamed from: n */
    boolean mo11810n(int i2);

    /* JADX INFO: renamed from: q */
    int mo11811q(int i2);

    void toq(int i2, double d2) throws sok;

    /* JADX INFO: renamed from: y */
    void mo11812y(int i2, long j2, long j3) throws sok;

    void zy(int i2, long j2) throws sok;
}
