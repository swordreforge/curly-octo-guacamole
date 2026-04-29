package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.util.lrht;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.k */
/* JADX INFO: compiled from: ActionFile.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class C3530k {

    /* JADX INFO: renamed from: g */
    private static final String f20962g = "ss";

    /* JADX INFO: renamed from: n */
    private static final String f20963n = "hls";

    /* JADX INFO: renamed from: q */
    private static final String f20964q = "dash";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f65029toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f65030zy = "progressive";

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.util.toq f20965k;

    public C3530k(File file) {
        this.f20965k = new com.google.android.exoplayer2.util.toq(file);
    }

    private static StreamKey f7l8(String str, int i2, DataInputStream dataInputStream) throws IOException {
        int i3;
        int i4;
        int i5;
        if ((f20963n.equals(str) || f20962g.equals(str)) && i2 == 0) {
            i3 = 0;
            i4 = dataInputStream.readInt();
            i5 = dataInputStream.readInt();
        } else {
            i3 = dataInputStream.readInt();
            i4 = dataInputStream.readInt();
            i5 = dataInputStream.readInt();
        }
        return new StreamKey(i3, i4, i5);
    }

    /* JADX INFO: renamed from: g */
    private static DownloadRequest m12386g(DataInputStream dataInputStream) throws IOException {
        byte[] bArr;
        String utf = dataInputStream.readUTF();
        int i2 = dataInputStream.readInt();
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z2 = dataInputStream.readBoolean();
        int i3 = dataInputStream.readInt();
        String utf2 = null;
        if (i3 != 0) {
            bArr = new byte[i3];
            dataInputStream.readFully(bArr);
        } else {
            bArr = null;
        }
        boolean z3 = true;
        boolean z5 = i2 == 0 && f65030zy.equals(utf);
        ArrayList arrayList = new ArrayList();
        if (!z5) {
            int i4 = dataInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(f7l8(utf, i2, dataInputStream));
            }
        }
        if (i2 >= 2 || (!f20964q.equals(utf) && !f20963n.equals(utf) && !f20962g.equals(utf))) {
            z3 = false;
        }
        if (!z3 && dataInputStream.readBoolean()) {
            utf2 = dataInputStream.readUTF();
        }
        String strZy = i2 < 3 ? zy(uri, utf2) : dataInputStream.readUTF();
        if (z2) {
            throw new DownloadRequest.toq();
        }
        return new DownloadRequest.C3522k(strZy, uri).m12363n(m12387q(utf)).m12361g(arrayList).toq(utf2).zy(bArr).m12362k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m12387q(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3680(0xe60, float:5.157E-42)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L38
            r1 = 103407(0x193ef, float:1.44904E-40)
            if (r0 == r1) goto L2e
            r1 = 3075986(0x2eef92, float:4.310374E-39)
            if (r0 == r1) goto L24
            r1 = 1131547531(0x43720b8b, float:242.04509)
            if (r0 == r1) goto L1a
            goto L42
        L1a:
            java.lang.String r0 = "progressive"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 3
            goto L43
        L24:
            java.lang.String r0 = "dash"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = 0
            goto L43
        L2e:
            java.lang.String r0 = "hls"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = r3
            goto L43
        L38:
            java.lang.String r0 = "ss"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L42
            r4 = r2
            goto L43
        L42:
            r4 = -1
        L43:
            if (r4 == 0) goto L52
            if (r4 == r3) goto L4f
            if (r4 == r2) goto L4c
            java.lang.String r4 = "video/x-unknown"
            return r4
        L4c:
            java.lang.String r4 = "application/vnd.ms-sstr+xml"
            return r4
        L4f:
            java.lang.String r4 = "application/x-mpegURL"
            return r4
        L52:
            java.lang.String r4 = "application/dash+xml"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.C3530k.m12387q(java.lang.String):java.lang.String");
    }

    private static String zy(Uri uri, @dd String str) {
        return str != null ? str : uri.toString();
    }

    /* JADX INFO: renamed from: k */
    public void m12388k() {
        this.f20965k.m13736k();
    }

    /* JADX INFO: renamed from: n */
    public DownloadRequest[] m12389n() throws IOException {
        if (!toq()) {
            return new DownloadRequest[0];
        }
        try {
            InputStream inputStreamM13737q = this.f20965k.m13737q();
            DataInputStream dataInputStream = new DataInputStream(inputStreamM13737q);
            int i2 = dataInputStream.readInt();
            if (i2 > 0) {
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported action file version: ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            int i3 = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                try {
                    arrayList.add(m12386g(dataInputStream));
                } catch (DownloadRequest.toq unused) {
                }
            }
            DownloadRequest[] downloadRequestArr = (DownloadRequest[]) arrayList.toArray(new DownloadRequest[0]);
            lrht.m13659h(inputStreamM13737q);
            return downloadRequestArr;
        } catch (Throwable th) {
            lrht.m13659h(null);
            throw th;
        }
    }

    public boolean toq() {
        return this.f20965k.zy();
    }
}
