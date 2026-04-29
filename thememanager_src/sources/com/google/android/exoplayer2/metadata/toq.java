package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.metadata.dvbsi.C3477k;
import com.google.android.exoplayer2.metadata.emsg.C3479k;
import com.google.android.exoplayer2.metadata.icy.C3486k;
import com.google.android.exoplayer2.metadata.scte35.C3516k;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface toq {

    /* JADX INFO: renamed from: k */
    public static final toq f20892k = new C3517k();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.toq$k */
    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    class C3517k implements toq {
        C3517k() {
        }

        @Override // com.google.android.exoplayer2.metadata.toq
        /* JADX INFO: renamed from: k */
        public boolean mo12345k(xwq3 xwq3Var) {
            String str = xwq3Var.f23682r;
            return wvg.f67093ch.equals(str) || wvg.f23298d.equals(str) || wvg.f23316v.equals(str) || wvg.f67131qkj8.equals(str) || wvg.f67103fnq8.equals(str);
        }

        @Override // com.google.android.exoplayer2.metadata.toq
        public InterfaceC3500k toq(xwq3 xwq3Var) {
            String str = xwq3Var.f23682r;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C3477k();
                    case "application/x-icy":
                        return new C3486k();
                    case "application/id3":
                        return new com.google.android.exoplayer2.metadata.id3.toq();
                    case "application/x-emsg":
                        return new C3479k();
                    case "application/x-scte35":
                        return new C3516k();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    /* JADX INFO: renamed from: k */
    boolean mo12345k(xwq3 xwq3Var);

    InterfaceC3500k toq(xwq3 xwq3Var);
}
