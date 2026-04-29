package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.sok;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;
import zy.dd;

/* JADX INFO: compiled from: ExtractorUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj {
    private qrj() {
    }

    @Pure
    /* JADX INFO: renamed from: k */
    public static void m11923k(boolean z2, @dd String str) throws sok {
        if (!z2) {
            throw sok.createForMalformedContainer(str, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m11924n(ld6 ld6Var, int i2) throws IOException {
        try {
            ld6Var.cdj(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11925q(ld6 ld6Var, byte[] bArr, int i2, int i3) throws IOException {
        try {
            ld6Var.readFully(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean toq(ld6 ld6Var, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return ld6Var.f7l8(bArr, i2, i3, z2);
        } catch (EOFException e2) {
            if (z2) {
                return false;
            }
            throw e2;
        }
    }

    public static int zy(ld6 ld6Var, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int iMo11728h = ld6Var.mo11728h(bArr, i2 + i4, i3 - i4);
            if (iMo11728h == -1) {
                break;
            }
            i4 += iMo11728h;
        }
        return i4;
    }
}
