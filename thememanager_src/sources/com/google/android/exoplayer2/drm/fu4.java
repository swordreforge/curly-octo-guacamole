package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.C3329y;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.yqrt;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7830i;
import zy.hyr;

/* JADX INFO: compiled from: DrmUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class fu4 {

    /* JADX INFO: renamed from: k */
    public static final int f19656k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63615toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63616zy = 3;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.fu4$k */
    /* JADX INFO: compiled from: DrmUtil.java */
    @hyr(18)
    private static final class C3308k {
        private C3308k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static boolean m11625k(@zy.dd Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @InterfaceC7830i
        public static boolean toq(@zy.dd Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.fu4$q */
    /* JADX INFO: compiled from: DrmUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3309q {
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    @hyr(21)
    private static final class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static boolean m11626k(@zy.dd Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @InterfaceC7830i
        public static int toq(Throwable th) {
            return lrht.m13664m(lrht.ek5k(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: compiled from: DrmUtil.java */
    @hyr(23)
    private static final class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static boolean m11627k(@zy.dd Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    private fu4() {
    }

    /* JADX INFO: renamed from: k */
    public static int m11624k(Exception exc, int i2) {
        int i3 = lrht.f23230k;
        if (i3 >= 21 && toq.m11626k(exc)) {
            return toq.toq(exc);
        }
        if (i3 >= 23 && zy.m11627k(exc)) {
            return yqrt.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i3 >= 18 && C3308k.toq(exc)) {
            return 6002;
        }
        if (i3 >= 18 && C3308k.m11625k(exc)) {
            return yqrt.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exc instanceof x9kr) {
            return yqrt.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (exc instanceof C3329y.n) {
            return 6003;
        }
        if (exc instanceof eqxt) {
            return yqrt.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i2 == 1) {
            return yqrt.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 == 2) {
            return 6004;
        }
        if (i2 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
