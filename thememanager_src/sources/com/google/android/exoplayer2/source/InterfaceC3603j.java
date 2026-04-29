package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.j */
/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3603j {
    public static final int e6nw = 1;
    public static final int hsg = 2;
    public static final int lk5 = 4;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$k */
    /* JADX INFO: compiled from: SampleStream.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$toq */
    /* JADX INFO: compiled from: SampleStream.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    int cdj(long j2);

    boolean isReady();

    /* JADX INFO: renamed from: s */
    int mo12610s(C3865v c3865v, C3297s c3297s, int i2);

    void toq() throws IOException;
}
