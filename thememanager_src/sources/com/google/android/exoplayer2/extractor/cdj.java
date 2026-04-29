package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.t8r;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.jp0y;
import com.google.common.base.C4258g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj {

    /* JADX INFO: renamed from: k */
    private static final int f19759k = 1716281667;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f63691toq = 16382;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f63692zy = 18;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.cdj$k */
    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class C3336k {

        /* JADX INFO: renamed from: k */
        @dd
        public t8r f19760k;

        public C3336k(@dd t8r t8rVar) {
            this.f19760k = t8rVar;
        }
    }

    private cdj() {
    }

    private static t8r.C3402k f7l8(ld6 ld6Var, int i2) throws IOException {
        gvn7 gvn7Var = new gvn7(i2);
        ld6Var.readFully(gvn7Var.m13598q(), 0, i2);
        return m11696y(gvn7Var);
    }

    /* JADX INFO: renamed from: g */
    private static PictureFrame m11690g(ld6 ld6Var, int i2) throws IOException {
        gvn7 gvn7Var = new gvn7(i2);
        ld6Var.readFully(gvn7Var.m13598q(), 0, i2);
        gvn7Var.hyr(4);
        int iKja0 = gvn7Var.kja0();
        String strA9 = gvn7Var.a9(gvn7Var.kja0(), C4258g.f25663k);
        String strJk = gvn7Var.jk(gvn7Var.kja0());
        int iKja02 = gvn7Var.kja0();
        int iKja03 = gvn7Var.kja0();
        int iKja04 = gvn7Var.kja0();
        int iKja05 = gvn7Var.kja0();
        int iKja06 = gvn7Var.kja0();
        byte[] bArr = new byte[iKja06];
        gvn7Var.ld6(bArr, 0, iKja06);
        return new PictureFrame(iKja0, strA9, strJk, iKja02, iKja03, iKja04, iKja05, bArr);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11691k(ld6 ld6Var) throws IOException {
        gvn7 gvn7Var = new gvn7(4);
        ld6Var.fn3e(gvn7Var.m13598q(), 0, 4);
        return gvn7Var.d3() == 1716281667;
    }

    private static List<String> ld6(ld6 ld6Var, int i2) throws IOException {
        gvn7 gvn7Var = new gvn7(i2);
        ld6Var.readFully(gvn7Var.m13598q(), 0, i2);
        gvn7Var.hyr(4);
        return Arrays.asList(a9.m11679s(gvn7Var, false, false).f63670toq);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m11692n(ld6 ld6Var, C3336k c3336k) throws IOException {
        ld6Var.mo11730y();
        jp0y jp0yVar = new jp0y(new byte[4]);
        ld6Var.fn3e(jp0yVar.f23205k, 0, 4);
        boolean zF7l8 = jp0yVar.f7l8();
        int iM13627y = jp0yVar.m13627y(7);
        int iM13627y2 = jp0yVar.m13627y(24) + 4;
        if (iM13627y == 0) {
            c3336k.f19760k = m11695s(ld6Var);
        } else {
            t8r t8rVar = c3336k.f19760k;
            if (t8rVar == null) {
                throw new IllegalArgumentException();
            }
            if (iM13627y == 3) {
                c3336k.f19760k = t8rVar.zy(f7l8(ld6Var, iM13627y2));
            } else if (iM13627y == 4) {
                c3336k.f19760k = t8rVar.m11936q(ld6(ld6Var, iM13627y2));
            } else if (iM13627y == 6) {
                c3336k.f19760k = t8rVar.toq(Collections.singletonList(m11690g(ld6Var, iM13627y2)));
            } else {
                ld6Var.cdj(iM13627y2);
            }
        }
        return zF7l8;
    }

    /* JADX INFO: renamed from: p */
    public static void m11693p(ld6 ld6Var) throws IOException {
        gvn7 gvn7Var = new gvn7(4);
        ld6Var.readFully(gvn7Var.m13598q(), 0, 4);
        if (gvn7Var.d3() != 1716281667) {
            throw sok.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static Metadata m11694q(ld6 ld6Var, boolean z2) throws IOException {
        ld6Var.mo11730y();
        long jX2 = ld6Var.x2();
        Metadata metadataZy = zy(ld6Var, z2);
        ld6Var.cdj((int) (ld6Var.x2() - jX2));
        return metadataZy;
    }

    /* JADX INFO: renamed from: s */
    private static t8r m11695s(ld6 ld6Var) throws IOException {
        byte[] bArr = new byte[38];
        ld6Var.readFully(bArr, 0, 38);
        return new t8r(bArr, 4);
    }

    public static int toq(ld6 ld6Var) throws IOException {
        ld6Var.mo11730y();
        gvn7 gvn7Var = new gvn7(2);
        ld6Var.fn3e(gvn7Var.m13598q(), 0, 2);
        int iLvui = gvn7Var.lvui();
        if ((iLvui >> 2) == f63691toq) {
            ld6Var.mo11730y();
            return iLvui;
        }
        ld6Var.mo11730y();
        throw sok.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    /* JADX INFO: renamed from: y */
    public static t8r.C3402k m11696y(gvn7 gvn7Var) {
        gvn7Var.hyr(1);
        int iOc = gvn7Var.oc();
        long jM13596n = ((long) gvn7Var.m13596n()) + ((long) iOc);
        int i2 = iOc / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jO1t = gvn7Var.o1t();
            if (jO1t == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jO1t;
            jArrCopyOf2[i3] = gvn7Var.o1t();
            gvn7Var.hyr(2);
            i3++;
        }
        gvn7Var.hyr((int) (jM13596n - ((long) gvn7Var.m13596n())));
        return new t8r.C3402k(jArrCopyOf, jArrCopyOf2);
    }

    @dd
    public static Metadata zy(ld6 ld6Var, boolean z2) throws IOException {
        Metadata metadataM12057k = new zurt().m12057k(ld6Var, z2 ? null : com.google.android.exoplayer2.metadata.id3.toq.f64986toq);
        if (metadataM12057k == null || metadataM12057k.m12282g() == 0) {
            return null;
        }
        return metadataM12057k;
    }
}
