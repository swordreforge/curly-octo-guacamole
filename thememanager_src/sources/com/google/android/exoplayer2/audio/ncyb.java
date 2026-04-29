package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.C3548p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: OpusUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class ncyb {

    /* JADX INFO: renamed from: k */
    public static final int f19427k = 48000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f63483toq = 3840;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f63484zy = 3;

    private ncyb() {
    }

    /* JADX INFO: renamed from: k */
    public static List<byte[]> m11495k(byte[] bArr) {
        long jM11496n = m11496n(m11497q(bArr));
        long jM11496n2 = m11496n(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(toq(jM11496n));
        arrayList.add(toq(jM11496n2));
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private static long m11496n(long j2) {
        return (j2 * C3548p.f21101p) / 48000;
    }

    /* JADX INFO: renamed from: q */
    private static int m11497q(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static byte[] toq(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    public static int zy(byte[] bArr) {
        return bArr[9] & 255;
    }
}
