package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DataSourceUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki {
    private ki() {
    }

    /* JADX INFO: renamed from: k */
    public static void m13484k(@zy.dd kja0 kja0Var) {
        if (kja0Var != null) {
            try {
                kja0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] toq(kja0 kja0Var, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = kja0Var.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                StringBuilder sb = new StringBuilder(56);
                sb.append("Not enough data could be read: ");
                sb.append(i3);
                sb.append(" < ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] zy(kja0 kja0Var) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i2 = 0;
        int i3 = 0;
        while (i2 != -1) {
            if (i3 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i2 = kja0Var.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
            if (i2 != -1) {
                i3 += i2;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i3);
    }
}
