package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4258g;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends AbstractC3795g {

    /* JADX INFO: renamed from: p */
    public static final String f23087p = "data";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private byte[] f66899f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private t8r f23088g;

    /* JADX INFO: renamed from: s */
    private int f23089s;

    /* JADX INFO: renamed from: y */
    private int f23090y;

    public qrj() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() {
        if (this.f66899f7l8 != null) {
            this.f66899f7l8 = null;
            ni7();
        }
        this.f23088g = null;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        t8r t8rVar = this.f23088g;
        if (t8rVar != null) {
            return t8rVar.f23103k;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        fu4(t8rVar);
        this.f23088g = t8rVar;
        Uri uri = t8rVar.f23103k;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        C3844k.toq(zEquals, strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        String[] strArrMbx = com.google.android.exoplayer2.util.lrht.mbx(uri.getSchemeSpecificPart(), ",");
        if (strArrMbx.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw sok.createForMalformedDataOfUnknownType(sb.toString(), null);
        }
        String str = strArrMbx[1];
        if (strArrMbx[0].contains(";base64")) {
            try {
                this.f66899f7l8 = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                String strValueOf3 = String.valueOf(str);
                throw sok.createForMalformedDataOfUnknownType(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e2);
            }
        } else {
            this.f66899f7l8 = com.google.android.exoplayer2.util.lrht.dr(URLDecoder.decode(str, C4258g.f25663k.name()));
        }
        long j2 = t8rVar.f66911f7l8;
        byte[] bArr = this.f66899f7l8;
        if (j2 > bArr.length) {
            this.f66899f7l8 = null;
            throw new C3796h(2008);
        }
        int i2 = (int) j2;
        this.f23090y = i2;
        int length = bArr.length - i2;
        this.f23089s = length;
        long j3 = t8rVar.f23108y;
        if (j3 != -1) {
            this.f23089s = (int) Math.min(length, j3);
        }
        m13463z(t8rVar);
        long j4 = t8rVar.f23108y;
        return j4 != -1 ? j4 : this.f23089s;
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f23089s;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(com.google.android.exoplayer2.util.lrht.ld6(this.f66899f7l8), this.f23090y, bArr, i2, iMin);
        this.f23090y += iMin;
        this.f23089s -= iMin;
        zurt(iMin);
        return iMin;
    }
}
