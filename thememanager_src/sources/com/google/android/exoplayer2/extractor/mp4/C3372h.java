package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.ni7;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.h */
/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3372h {

    /* JADX INFO: renamed from: g */
    private static final String f19990g = "TrackEncryptionBox";

    /* JADX INFO: renamed from: k */
    public final boolean f19991k;

    /* JADX INFO: renamed from: n */
    @dd
    public final byte[] f19992n;

    /* JADX INFO: renamed from: q */
    public final int f19993q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public final String f64119toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final InterfaceC3401t.k f64120zy;

    public C3372h(boolean z2, @dd String str, int i2, byte[] bArr, int i3, int i4, @dd byte[] bArr2) {
        C3844k.m13629k((bArr2 == null) ^ (i2 == 0));
        this.f19991k = z2;
        this.f64119toq = str;
        this.f19993q = i2;
        this.f19992n = bArr2;
        this.f64120zy = new InterfaceC3401t.k(m11848k(str), bArr, i3, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    private static int m11848k(@dd String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C3548p.f65231o05)) {
                    b2 = 0;
                }
                break;
            case 3046671:
                if (str.equals(C3548p.f65146cnbm)) {
                    b2 = 1;
                }
                break;
            case 3049879:
                if (str.equals(C3548p.f65236oki)) {
                    b2 = 2;
                }
                break;
            case 3049895:
                if (str.equals(C3548p.f65214m58i)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return 2;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 68);
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                ni7.qrj(f19990g, sb.toString());
            case 2:
            case 3:
                return 1;
        }
    }
}
