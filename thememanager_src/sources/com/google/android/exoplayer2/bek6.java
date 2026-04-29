package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.uj2j;
import com.google.android.exoplayer2.util.InterfaceC3863z;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface bek6 extends uj2j.toq {
    public static final int d5i1 = 9;
    public static final int iuh = 2;
    public static final int l2hi = 3;
    public static final int lmkm = 10;
    public static final int mb2r = 10000;
    public static final int mgh = 7;
    public static final int mzk = 6;
    public static final int ns20 = 4;
    public static final int o6 = 5;
    public static final int pxe = 2;
    public static final int qml = 0;
    public static final int r84j = 11;
    public static final int spjb = 1;
    public static final int tbc = 1;
    public static final int tlra = 8;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.bek6$k */
    /* JADX INFO: compiled from: Renderer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3278k {
    }

    /* JADX INFO: compiled from: Renderer.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: compiled from: Renderer.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo11555k();

        void toq(long j2);
    }

    long fu4();

    /* JADX INFO: renamed from: g */
    boolean mo11548g();

    String getName();

    int getState();

    /* JADX INFO: renamed from: h */
    cv06 mo11549h();

    /* JADX INFO: renamed from: i */
    void mo11550i(h7am h7amVar, xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, boolean z2, boolean z3, long j3, long j4) throws ki;

    boolean isReady();

    void kja0(xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, long j3) throws ki;

    /* JADX INFO: renamed from: n */
    int mo11551n();

    boolean n7h();

    @zy.dd
    InterfaceC3603j ni7();

    @zy.dd
    InterfaceC3863z o1t();

    /* JADX INFO: renamed from: q */
    void mo11552q();

    void qrj() throws IOException;

    void reset();

    void setIndex(int i2);

    void start() throws ki;

    void stop();

    default void t8r(float f2, float f3) throws ki {
    }

    /* JADX INFO: renamed from: y */
    void mo11553y();

    /* JADX INFO: renamed from: z */
    void mo11554z(long j2) throws ki;

    void zurt(long j2, long j3) throws ki;

    boolean zy();
}
