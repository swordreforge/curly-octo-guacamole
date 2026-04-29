package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes2.dex */
public interface wvg {

    /* JADX INFO: renamed from: g */
    public static final int f19690g = 3;

    /* JADX INFO: renamed from: k */
    public static final int f19691k = 2;

    /* JADX INFO: renamed from: n */
    public static final int f19692n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f19693q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63629toq = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63630zy = 1;

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        wvg mo11623k(UUID uuid);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$g */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface InterfaceC3322g {
        /* JADX INFO: renamed from: k */
        void m11647k(wvg wvgVar, byte[] bArr, List<zy> list, boolean z2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$k */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class C3323k implements f7l8 {

        /* JADX INFO: renamed from: k */
        private final wvg f19694k;

        public C3323k(wvg wvgVar) {
            this.f19694k = wvgVar;
        }

        @Override // com.google.android.exoplayer2.drm.wvg.f7l8
        /* JADX INFO: renamed from: k */
        public wvg mo11623k(UUID uuid) {
            this.f19694k.mo11593k();
            return this.f19694k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$n */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface InterfaceC3324n {
        /* JADX INFO: renamed from: k */
        void m11648k(wvg wvgVar, byte[] bArr, long j2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$q */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface InterfaceC3325q {
        /* JADX INFO: renamed from: k */
        void mo11649k(wvg wvgVar, @zy.dd byte[] bArr, int i2, int i3, @zy.dd byte[] bArr2);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f63631f7l8 = 2;

        /* JADX INFO: renamed from: g */
        public static final int f19695g = 1;

        /* JADX INFO: renamed from: n */
        public static final int f19696n = 0;

        /* JADX INFO: renamed from: q */
        public static final int f19697q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: s */
        public static final int f19698s = 4;

        /* JADX INFO: renamed from: y */
        public static final int f19699y = 3;

        /* JADX INFO: renamed from: k */
        private final byte[] f19700k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f63632toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f63633zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$toq$k */
        /* JADX INFO: compiled from: ExoMediaDrm.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC3326k {
        }

        public toq(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        /* JADX INFO: renamed from: k */
        public byte[] m11650k() {
            return this.f19700k;
        }

        public String toq() {
            return this.f63632toq;
        }

        public int zy() {
            return this.f63633zy;
        }

        public toq(byte[] bArr, String str, int i2) {
            this.f19700k = bArr;
            this.f63632toq = str;
            this.f63633zy = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.wvg$y */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class C3327y {

        /* JADX INFO: renamed from: k */
        private final byte[] f19701k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f63634toq;

        public C3327y(byte[] bArr, String str) {
            this.f19701k = bArr;
            this.f63634toq = str;
        }

        /* JADX INFO: renamed from: k */
        public byte[] m11651k() {
            return this.f19701k;
        }

        public String toq() {
            return this.f63634toq;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final int f19702k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final byte[] f63635toq;

        public zy(int i2, byte[] bArr) {
            this.f19702k = i2;
            this.f63635toq = bArr;
        }

        /* JADX INFO: renamed from: k */
        public byte[] m11652k() {
            return this.f63635toq;
        }

        public int toq() {
            return this.f19702k;
        }
    }

    byte[] cdj(String str);

    void f7l8(String str, String str2);

    /* JADX INFO: renamed from: g */
    void mo11590g(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: h */
    void mo11591h(byte[] bArr);

    /* JADX INFO: renamed from: i */
    void mo11592i(@zy.dd InterfaceC3322g interfaceC3322g);

    /* JADX INFO: renamed from: k */
    void mo11593k();

    @zy.dd
    byte[] ki(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    boolean kja0(byte[] bArr, String str);

    int ld6();

    /* JADX INFO: renamed from: n */
    byte[] mo11594n() throws MediaDrmException;

    com.google.android.exoplayer2.decoder.zy n7h(byte[] bArr) throws MediaCryptoException;

    /* JADX INFO: renamed from: p */
    void mo11595p(byte[] bArr) throws DeniedByServerException;

    /* JADX INFO: renamed from: q */
    void mo11596q(@zy.dd InterfaceC3324n interfaceC3324n);

    String qrj(String str);

    void release();

    @zy.dd
    /* JADX INFO: renamed from: s */
    PersistableBundle mo11597s();

    toq t8r(byte[] bArr, @zy.dd List<DrmInitData.SchemeData> list, int i2, @zy.dd HashMap<String, String> map) throws NotProvisionedException;

    Map<String, String> toq(byte[] bArr);

    void x2(String str, byte[] bArr);

    /* JADX INFO: renamed from: y */
    void mo11598y(@zy.dd InterfaceC3325q interfaceC3325q);

    C3327y zy();
}
