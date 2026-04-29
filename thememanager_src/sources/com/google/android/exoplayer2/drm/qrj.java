package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.InterfaceC3312i;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: DrmSession.java */
/* JADX INFO: loaded from: classes2.dex */
public interface qrj {

    /* JADX INFO: renamed from: k */
    public static final int f19682k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f19683n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f19684q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63625toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63626zy = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.qrj$k */
    /* JADX INFO: compiled from: DrmSession.java */
    public static class C3318k extends IOException {
        public final int errorCode;

        public C3318k(Throwable th, int i2) {
            super(th);
            this.errorCode = i2;
        }
    }

    /* JADX INFO: compiled from: DrmSession.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: y */
    static void m11646y(@zy.dd qrj qrjVar, @zy.dd qrj qrjVar2) {
        if (qrjVar == qrjVar2) {
            return;
        }
        if (qrjVar2 != null) {
            qrjVar2.mo11611k(null);
        }
        if (qrjVar != null) {
            qrjVar.toq(null);
        }
    }

    @zy.dd
    com.google.android.exoplayer2.decoder.zy f7l8();

    @zy.dd
    /* JADX INFO: renamed from: g */
    C3318k mo11610g();

    int getState();

    /* JADX INFO: renamed from: k */
    void mo11611k(@zy.dd InterfaceC3312i.k kVar);

    @zy.dd
    /* JADX INFO: renamed from: n */
    byte[] mo11612n();

    /* JADX INFO: renamed from: p */
    boolean mo11613p(String str);

    /* JADX INFO: renamed from: q */
    default boolean mo11614q() {
        return false;
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    Map<String, String> mo11615s();

    void toq(@zy.dd InterfaceC3312i.k kVar);

    UUID zy();
}
