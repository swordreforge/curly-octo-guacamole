package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.text.cea.C3642k;
import com.google.android.exoplayer2.text.dvb.C3646k;
import com.google.android.exoplayer2.text.pgs.C3658k;
import com.google.android.exoplayer2.text.ssa.C3665k;
import com.google.android.exoplayer2.text.subrip.C3669k;
import com.google.android.exoplayer2.text.tx3g.C3683k;
import com.google.android.exoplayer2.text.webvtt.C3685k;
import com.google.android.exoplayer2.text.webvtt.C3690y;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.p */
/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3657p {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC3657p f21929k = new k();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.p$k */
    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    class k implements InterfaceC3657p {
        k() {
        }

        @Override // com.google.android.exoplayer2.text.InterfaceC3657p
        /* JADX INFO: renamed from: k */
        public boolean mo12914k(xwq3 xwq3Var) {
            String str = xwq3Var.f23682r;
            return wvg.f67099ek5k.equals(str) || wvg.f67148yz.equals(str) || wvg.f23315u.equals(str) || wvg.f67146y2.equals(str) || wvg.f67134t8iq.equals(str) || wvg.f67090bo.equals(str) || wvg.f67127nmn5.equals(str) || wvg.f67091c8jq.equals(str) || wvg.f67119lv5.equals(str) || wvg.f67122mu.equals(str) || wvg.f67145xwq3.equals(str) || wvg.f67147y9n.equals(str);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.google.android.exoplayer2.text.InterfaceC3657p
        public InterfaceC3691y toq(xwq3 xwq3Var) {
            String str = xwq3Var.f23682r;
            if (str != null) {
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals(wvg.f67122mu)) {
                            b2 = 0;
                        }
                        break;
                    case -1248334819:
                        if (str.equals(wvg.f67145xwq3)) {
                            b2 = 1;
                        }
                        break;
                    case -1026075066:
                        if (str.equals(wvg.f67146y2)) {
                            b2 = 2;
                        }
                        break;
                    case -1004728940:
                        if (str.equals(wvg.f67099ek5k)) {
                            b2 = 3;
                        }
                        break;
                    case 691401887:
                        if (str.equals(wvg.f67090bo)) {
                            b2 = 4;
                        }
                        break;
                    case 822864842:
                        if (str.equals(wvg.f67148yz)) {
                            b2 = 5;
                        }
                        break;
                    case 930165504:
                        if (str.equals(wvg.f67091c8jq)) {
                            b2 = 6;
                        }
                        break;
                    case 1201784583:
                        if (str.equals(wvg.f67147y9n)) {
                            b2 = 7;
                        }
                        break;
                    case 1566015601:
                        if (str.equals(wvg.f67127nmn5)) {
                            b2 = 8;
                        }
                        break;
                    case 1566016562:
                        if (str.equals(wvg.f67119lv5)) {
                            b2 = 9;
                        }
                        break;
                    case 1668750253:
                        if (str.equals(wvg.f67134t8iq)) {
                            b2 = 10;
                        }
                        break;
                    case 1693976202:
                        if (str.equals(wvg.f23315u)) {
                            b2 = com.google.common.base.zy.f68132qrj;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        return new C3646k(xwq3Var.f23670f);
                    case 1:
                        return new C3658k();
                    case 2:
                        return new C3685k();
                    case 3:
                        return new C3690y();
                    case 4:
                        return new C3683k(xwq3Var.f23670f);
                    case 5:
                        return new C3665k(xwq3Var.f23670f);
                    case 6:
                    case 8:
                        return new C3642k(str, xwq3Var.bp, C3642k.f65517wvg);
                    case 7:
                        return new C3656n();
                    case 9:
                        return new com.google.android.exoplayer2.text.cea.zy(xwq3Var.bp, xwq3Var.f23670f);
                    case 10:
                        return new C3669k();
                    case 11:
                        return new com.google.android.exoplayer2.text.ttml.zy();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    /* JADX INFO: renamed from: k */
    boolean mo12914k(xwq3 xwq3Var);

    InterfaceC3691y toq(xwq3 xwq3Var);
}
