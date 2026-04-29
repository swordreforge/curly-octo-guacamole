package com.google.android.exoplayer2.audio;

import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.xwq3;
import com.miui.clock.module.toq;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import miuix.core.util.C7083n;
import okio.C7571o;
import z4j7.C7797k;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f63507f7l8 = 1536;

    /* JADX INFO: renamed from: g */
    private static final int f19472g = 256;

    /* JADX INFO: renamed from: k */
    public static final int f19473k = 80000;

    /* JADX INFO: renamed from: n */
    public static final int f19474n = 10;

    /* JADX INFO: renamed from: q */
    public static final int f19476q = 16;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63510toq = 768000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63512zy = 3062500;

    /* JADX INFO: renamed from: y */
    private static final int[] f19478y = {1, 2, 3, 6};

    /* JADX INFO: renamed from: s */
    private static final int[] f19477s = {ncyb.f19427k, 44100, 32000};

    /* JADX INFO: renamed from: p */
    private static final int[] f19475p = {24000, 22050, C3258k.f63451f7l8};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int[] f63508ld6 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int[] f63511x2 = {32, 40, 48, 56, 64, 80, 96, 112, 128, ThemeStatus.Redeem.REDEEMING, com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4, 224, 256, 320, 384, C7083n.f39873k, 512, 576, C7797k.f100633toq};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int[] f63509qrj = {69, 87, 104, 121, UICard.LARGE_ICONS_APP_SEARCH_CARD, 174, toq.zy.f29239s, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class C7951toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f63513f7l8 = -1;

        /* JADX INFO: renamed from: p */
        public static final int f19479p = 2;

        /* JADX INFO: renamed from: s */
        public static final int f19480s = 1;

        /* JADX INFO: renamed from: y */
        public static final int f19481y = 0;

        /* JADX INFO: renamed from: g */
        public final int f19482g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        public final String f19483k;

        /* JADX INFO: renamed from: n */
        public final int f19484n;

        /* JADX INFO: renamed from: q */
        public final int f19485q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63514toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63515zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.toq$toq$k */
        /* JADX INFO: compiled from: Ac3Util.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC3268k {
        }

        private C7951toq(@zy.dd String str, int i2, int i3, int i4, int i5, int i6) {
            this.f19483k = str;
            this.f63514toq = i2;
            this.f19485q = i3;
            this.f63515zy = i4;
            this.f19484n = i5;
            this.f19482g = i6;
        }
    }

    private toq() {
    }

    public static xwq3 f7l8(com.google.android.exoplayer2.util.gvn7 gvn7Var, String str, String str2, @zy.dd DrmInitData drmInitData) {
        gvn7Var.hyr(2);
        int i2 = f19477s[(gvn7Var.jp0y() & com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4) >> 6];
        int iJp0y = gvn7Var.jp0y();
        int i3 = f63508ld6[(iJp0y & 14) >> 1];
        if ((iJp0y & 1) != 0) {
            i3++;
        }
        if (((gvn7Var.jp0y() & 30) >> 1) > 0 && (2 & gvn7Var.jp0y()) != 0) {
            i3 += 2;
        }
        return new xwq3.toq().n5r1(str).m13945m((gvn7Var.m13594k() <= 0 || (gvn7Var.jp0y() & 1) == 0) ? com.google.android.exoplayer2.util.wvg.f67120lvui : com.google.android.exoplayer2.util.wvg.f23312r).gvn7(i3).ek5k(i2).lvui(drmInitData).m13940c(str2).a9();
    }

    /* JADX INFO: renamed from: g */
    public static int m11521g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return toq((b2 & 192) >> 6, b2 & C7571o.f43818k);
    }

    /* JADX INFO: renamed from: k */
    public static int m11522k(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i2 = iPosition; i2 <= iLimit; i2++) {
            if ((com.google.android.exoplayer2.util.lrht.x9kr(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static C7951toq m11523n(com.google.android.exoplayer2.util.jp0y jp0yVar) {
        int qVar;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int iM13627y;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM13623n = jp0yVar.m13623n();
        jp0yVar.t8r(40);
        boolean z2 = jp0yVar.m13627y(5) > 10;
        jp0yVar.cdj(iM13623n);
        int i10 = -1;
        if (z2) {
            jp0yVar.t8r(16);
            int iM13627y2 = jp0yVar.m13627y(2);
            if (iM13627y2 == 0) {
                i10 = 0;
            } else if (iM13627y2 == 1) {
                i10 = 1;
            } else if (iM13627y2 == 2) {
                i10 = 2;
            }
            jp0yVar.t8r(3);
            qVar = (jp0yVar.m13627y(11) + 1) * 2;
            int iM13627y3 = jp0yVar.m13627y(2);
            if (iM13627y3 == 3) {
                i2 = f19475p[jp0yVar.m13627y(2)];
                i6 = 6;
                iM13627y = 3;
            } else {
                iM13627y = jp0yVar.m13627y(2);
                i6 = f19478y[iM13627y];
                i2 = f19477s[iM13627y3];
            }
            i3 = i6 * 256;
            int iM13627y4 = jp0yVar.m13627y(3);
            boolean zF7l8 = jp0yVar.f7l8();
            i4 = f63508ld6[iM13627y4] + (zF7l8 ? 1 : 0);
            jp0yVar.t8r(10);
            if (jp0yVar.f7l8()) {
                jp0yVar.t8r(8);
            }
            if (iM13627y4 == 0) {
                jp0yVar.t8r(5);
                if (jp0yVar.f7l8()) {
                    jp0yVar.t8r(8);
                }
            }
            if (i10 == 1 && jp0yVar.f7l8()) {
                jp0yVar.t8r(16);
            }
            if (jp0yVar.f7l8()) {
                if (iM13627y4 > 2) {
                    jp0yVar.t8r(2);
                }
                if ((iM13627y4 & 1) == 0 || iM13627y4 <= 2) {
                    i8 = 6;
                } else {
                    i8 = 6;
                    jp0yVar.t8r(6);
                }
                if ((iM13627y4 & 4) != 0) {
                    jp0yVar.t8r(i8);
                }
                if (zF7l8 && jp0yVar.f7l8()) {
                    jp0yVar.t8r(5);
                }
                if (i10 == 0) {
                    if (jp0yVar.f7l8()) {
                        i9 = 6;
                        jp0yVar.t8r(6);
                    } else {
                        i9 = 6;
                    }
                    if (iM13627y4 == 0 && jp0yVar.f7l8()) {
                        jp0yVar.t8r(i9);
                    }
                    if (jp0yVar.f7l8()) {
                        jp0yVar.t8r(i9);
                    }
                    int iM13627y5 = jp0yVar.m13627y(2);
                    if (iM13627y5 == 1) {
                        jp0yVar.t8r(5);
                    } else if (iM13627y5 == 2) {
                        jp0yVar.t8r(12);
                    } else if (iM13627y5 == 3) {
                        int iM13627y6 = jp0yVar.m13627y(5);
                        if (jp0yVar.f7l8()) {
                            jp0yVar.t8r(5);
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(4);
                            }
                            if (jp0yVar.f7l8()) {
                                if (jp0yVar.f7l8()) {
                                    jp0yVar.t8r(4);
                                }
                                if (jp0yVar.f7l8()) {
                                    jp0yVar.t8r(4);
                                }
                            }
                        }
                        if (jp0yVar.f7l8()) {
                            jp0yVar.t8r(5);
                            if (jp0yVar.f7l8()) {
                                jp0yVar.t8r(7);
                                if (jp0yVar.f7l8()) {
                                    jp0yVar.t8r(8);
                                }
                            }
                        }
                        jp0yVar.t8r((iM13627y6 + 2) * 8);
                        jp0yVar.zy();
                    }
                    if (iM13627y4 < 2) {
                        if (jp0yVar.f7l8()) {
                            jp0yVar.t8r(14);
                        }
                        if (iM13627y4 == 0 && jp0yVar.f7l8()) {
                            jp0yVar.t8r(14);
                        }
                    }
                    if (jp0yVar.f7l8()) {
                        if (iM13627y == 0) {
                            jp0yVar.t8r(5);
                        } else {
                            for (int i11 = 0; i11 < i6; i11++) {
                                if (jp0yVar.f7l8()) {
                                    jp0yVar.t8r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (jp0yVar.f7l8()) {
                jp0yVar.t8r(5);
                if (iM13627y4 == 2) {
                    jp0yVar.t8r(4);
                }
                if (iM13627y4 >= 6) {
                    jp0yVar.t8r(2);
                }
                if (jp0yVar.f7l8()) {
                    jp0yVar.t8r(8);
                }
                if (iM13627y4 == 0 && jp0yVar.f7l8()) {
                    jp0yVar.t8r(8);
                }
                if (iM13627y3 < 3) {
                    jp0yVar.ki();
                }
            }
            if (i10 == 0 && iM13627y != 3) {
                jp0yVar.ki();
            }
            if (i10 == 2 && (iM13627y == 3 || jp0yVar.f7l8())) {
                i7 = 6;
                jp0yVar.t8r(6);
            } else {
                i7 = 6;
            }
            str = (jp0yVar.f7l8() && jp0yVar.m13627y(i7) == 1 && jp0yVar.m13627y(8) == 1) ? com.google.android.exoplayer2.util.wvg.f23312r : com.google.android.exoplayer2.util.wvg.f67120lvui;
            i5 = i10;
        } else {
            jp0yVar.t8r(32);
            int iM13627y7 = jp0yVar.m13627y(2);
            String str2 = iM13627y7 == 3 ? null : com.google.android.exoplayer2.util.wvg.f67094d2ok;
            qVar = toq(iM13627y7, jp0yVar.m13627y(6));
            jp0yVar.t8r(8);
            int iM13627y8 = jp0yVar.m13627y(3);
            if ((iM13627y8 & 1) != 0 && iM13627y8 != 1) {
                jp0yVar.t8r(2);
            }
            if ((iM13627y8 & 4) != 0) {
                jp0yVar.t8r(2);
            }
            if (iM13627y8 == 2) {
                jp0yVar.t8r(2);
            }
            int[] iArr = f19477s;
            i2 = iM13627y7 < iArr.length ? iArr[iM13627y7] : -1;
            i3 = f63507f7l8;
            i4 = f63508ld6[iM13627y8] + (jp0yVar.f7l8() ? 1 : 0);
            i5 = -1;
            str = str2;
        }
        return new C7951toq(str, i5, i4, i2, qVar, i3);
    }

    /* JADX INFO: renamed from: q */
    public static int m11524q(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f19478y[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return f63507f7l8;
    }

    /* JADX INFO: renamed from: s */
    public static int m11525s(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    private static int toq(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f19477s;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = f63509qrj;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return (iArr2[i4] + (i3 % 2)) * 2;
        }
        int i6 = f63511x2[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    /* JADX INFO: renamed from: y */
    public static int m11526y(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static xwq3 zy(com.google.android.exoplayer2.util.gvn7 gvn7Var, String str, String str2, @zy.dd DrmInitData drmInitData) {
        int i2 = f19477s[(gvn7Var.jp0y() & com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4) >> 6];
        int iJp0y = gvn7Var.jp0y();
        int i3 = f63508ld6[(iJp0y & 56) >> 3];
        if ((iJp0y & 4) != 0) {
            i3++;
        }
        return new xwq3.toq().n5r1(str).m13945m(com.google.android.exoplayer2.util.wvg.f67094d2ok).gvn7(i3).ek5k(i2).lvui(drmInitData).m13940c(str2).a9();
    }
}
