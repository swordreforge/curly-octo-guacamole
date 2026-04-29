package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.metadata.AbstractC3483g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.jp0y;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import zy.dd;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends AbstractC3483g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64980cdj = 3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64981f7l8 = 64;

    /* JADX INFO: renamed from: g */
    private static final int f20822g = 128;

    /* JADX INFO: renamed from: h */
    private static final int f20823h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64982kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64983ld6 = 64;

    /* JADX INFO: renamed from: n */
    public static final int f20824n = 10;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64984n7h = 0;

    /* JADX INFO: renamed from: p */
    private static final int f20825p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f20826q = 4801587;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f64985qrj = 1;

    /* JADX INFO: renamed from: s */
    private static final int f20827s = 8;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC3499k f64986toq = new InterfaceC3499k() { // from class: com.google.android.exoplayer2.metadata.id3.k
        @Override // com.google.android.exoplayer2.metadata.id3.toq.InterfaceC3499k
        /* JADX INFO: renamed from: k */
        public final boolean mo11822k(int i2, int i3, int i4, int i5, int i6) {
            return toq.o1t(i2, i3, i4, i5, i6);
        }
    };

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64987x2 = 2;

    /* JADX INFO: renamed from: y */
    private static final int f20828y = 32;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f64988zy = "Id3Decoder";

    /* JADX INFO: renamed from: k */
    @dd
    private final InterfaceC3499k f20829k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.toq$k */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface InterfaceC3499k {
        /* JADX INFO: renamed from: k */
        boolean mo11822k(int i2, int i3, int i4, int i5, int i6);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    private static final class C7957toq {

        /* JADX INFO: renamed from: k */
        private final int f20830k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f64989toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f64990zy;

        public C7957toq(int i2, boolean z2, int i3) {
            this.f20830k = i2;
            this.f64989toq = z2;
            this.f64990zy = i3;
        }
    }

    public toq() {
        this(null);
    }

    @dd
    private static TextInformationFrame cdj(gvn7 gvn7Var, int i2, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        gvn7Var.ld6(bArr, 0, i3);
        return new TextInformationFrame(str, null, new String(bArr, 0, fu4(bArr, 0, iJp0y), strZurt));
    }

    private static BinaryFrame f7l8(gvn7 gvn7Var, int i2, String str) {
        byte[] bArr = new byte[i2];
        gvn7Var.ld6(bArr, 0, i2);
        return new BinaryFrame(str, bArr);
    }

    private static int fn3e(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static int fu4(byte[] bArr, int i2, int i3) {
        int iM12317z = m12317z(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iM12317z;
        }
        while (iM12317z < bArr.length - 1) {
            if ((iM12317z - i2) % 2 == 0 && bArr[iM12317z + 1] == 0) {
                return iM12317z;
            }
            iM12317z = m12317z(bArr, iM12317z + 1);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: g */
    private static ApicFrame m12309g(gvn7 gvn7Var, int i2, int i3) throws UnsupportedEncodingException {
        int iM12317z;
        String strConcat;
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        gvn7Var.ld6(bArr, 0, i4);
        if (i3 == 2) {
            String strValueOf = String.valueOf(com.google.common.base.zy.f7l8(new String(bArr, 0, 3, C3548p.f65199kja0)));
            strConcat = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strConcat)) {
                strConcat = wvg.f67136tfm;
            }
            iM12317z = 2;
        } else {
            iM12317z = m12317z(bArr, 0);
            String strF7l8 = com.google.common.base.zy.f7l8(new String(bArr, 0, iM12317z, C3548p.f65199kja0));
            if (strF7l8.indexOf(47) != -1) {
                strConcat = strF7l8;
            } else if (strF7l8.length() != 0) {
                strConcat = "image/".concat(strF7l8);
            } else {
                strF7l8 = new String("image/");
                strConcat = strF7l8;
            }
        }
        int i5 = bArr[iM12317z + 1] & 255;
        int i6 = iM12317z + 2;
        int iFu4 = fu4(bArr, i6, iJp0y);
        return new ApicFrame(strConcat, new String(bArr, i6, iFu4 - i6, strZurt), i5, m12313q(bArr, iFu4 + fn3e(iJp0y), i4));
    }

    /* JADX INFO: renamed from: h */
    private static String m12310h(byte[] bArr, int i2, int i3, String str) throws UnsupportedEncodingException {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    @dd
    /* JADX INFO: renamed from: i */
    private static UrlLinkFrame m12311i(gvn7 gvn7Var, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        gvn7Var.ld6(bArr, 0, i3);
        int iFu4 = fu4(bArr, 0, iJp0y);
        String str = new String(bArr, 0, iFu4, strZurt);
        int iFn3e = iFu4 + fn3e(iJp0y);
        return new UrlLinkFrame("WXXX", str, m12310h(bArr, iFn3e, m12317z(bArr, iFn3e), C3548p.f65199kja0));
    }

    @dd
    private static TextInformationFrame ki(gvn7 gvn7Var, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        gvn7Var.ld6(bArr, 0, i3);
        int iFu4 = fu4(bArr, 0, iJp0y);
        String str = new String(bArr, 0, iFu4, strZurt);
        int iFn3e = iFu4 + fn3e(iJp0y);
        return new TextInformationFrame("TXXX", str, m12310h(bArr, iFn3e, fu4(bArr, iFn3e, iJp0y), strZurt));
    }

    private static PrivFrame kja0(gvn7 gvn7Var, int i2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        gvn7Var.ld6(bArr, 0, i2);
        int iM12317z = m12317z(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iM12317z, C3548p.f65199kja0), m12313q(bArr, iM12317z + 1, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0222, TryCatch #0 {UnsupportedEncodingException -> 0x0222, blocks: (B:91:0x011c, B:159:0x01f4, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112, outer: #1 }] */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame ld6(int r19, com.google.android.exoplayer2.util.gvn7 r20, boolean r21, int r22, @zy.dd com.google.android.exoplayer2.metadata.id3.toq.InterfaceC3499k r23) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.toq.ld6(int, com.google.android.exoplayer2.util.gvn7, boolean, int, com.google.android.exoplayer2.metadata.id3.toq$k):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    private static MlltFrame n7h(gvn7 gvn7Var, int i2) {
        int iLvui = gvn7Var.lvui();
        int iOc = gvn7Var.oc();
        int iOc2 = gvn7Var.oc();
        int iJp0y = gvn7Var.jp0y();
        int iJp0y2 = gvn7Var.jp0y();
        jp0y jp0yVar = new jp0y();
        jp0yVar.n7h(gvn7Var);
        int i3 = ((i2 - 10) * 8) / (iJp0y + iJp0y2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM13627y = jp0yVar.m13627y(iJp0y);
            int iM13627y2 = jp0yVar.m13627y(iJp0y2);
            iArr[i4] = iM13627y;
            iArr2[i4] = iM13627y2;
        }
        return new MlltFrame(iLvui, iOc, iOc2, iArr, iArr2);
    }

    private static String ni7(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o1t(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    @dd
    /* JADX INFO: renamed from: p */
    private static CommentFrame m12312p(gvn7 gvn7Var, int i2) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        byte[] bArr = new byte[3];
        gvn7Var.ld6(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        gvn7Var.ld6(bArr2, 0, i3);
        int iFu4 = fu4(bArr2, 0, iJp0y);
        String str2 = new String(bArr2, 0, iFu4, strZurt);
        int iFn3e = iFu4 + fn3e(iJp0y);
        return new CommentFrame(str, str2, m12310h(bArr2, iFn3e, fu4(bArr2, iFn3e, iJp0y), strZurt));
    }

    /* JADX INFO: renamed from: q */
    private static byte[] m12313q(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? lrht.f23228g : Arrays.copyOfRange(bArr, i2, i3);
    }

    @dd
    private static C7957toq qrj(gvn7 gvn7Var) {
        if (gvn7Var.m13594k() < 10) {
            ni7.qrj(f64988zy, "Data too short to be an ID3 tag");
            return null;
        }
        int iOc = gvn7Var.oc();
        boolean z2 = false;
        if (iOc != 4801587) {
            String strValueOf = String.valueOf(String.format("%06X", Integer.valueOf(iOc)));
            ni7.qrj(f64988zy, strValueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(strValueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int iJp0y = gvn7Var.jp0y();
        gvn7Var.hyr(1);
        int iJp0y2 = gvn7Var.jp0y();
        int iFti = gvn7Var.fti();
        if (iJp0y == 2) {
            if ((iJp0y2 & 64) != 0) {
                ni7.qrj(f64988zy, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iJp0y == 3) {
            if ((iJp0y2 & 64) != 0) {
                int iKja0 = gvn7Var.kja0();
                gvn7Var.hyr(iKja0);
                iFti -= iKja0 + 4;
            }
        } else {
            if (iJp0y != 4) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Skipped ID3 tag with unsupported majorVersion=");
                sb.append(iJp0y);
                ni7.qrj(f64988zy, sb.toString());
                return null;
            }
            if ((iJp0y2 & 64) != 0) {
                int iFti2 = gvn7Var.fti();
                gvn7Var.hyr(iFti2 - 4);
                iFti -= iFti2;
            }
            if ((iJp0y2 & 16) != 0) {
                iFti -= 10;
            }
        }
        if (iJp0y < 4 && (iJp0y2 & 128) != 0) {
            z2 = true;
        }
        return new C7957toq(iJp0y, z2, iFti);
    }

    /* JADX INFO: renamed from: s */
    private static ChapterTocFrame m12314s(gvn7 gvn7Var, int i2, int i3, boolean z2, int i4, @dd InterfaceC3499k interfaceC3499k) throws UnsupportedEncodingException {
        int iM13596n = gvn7Var.m13596n();
        int iM12317z = m12317z(gvn7Var.m13598q(), iM13596n);
        String str = new String(gvn7Var.m13598q(), iM13596n, iM12317z - iM13596n, C3548p.f65199kja0);
        gvn7Var.n5r1(iM12317z + 1);
        int iJp0y = gvn7Var.jp0y();
        boolean z3 = (iJp0y & 2) != 0;
        boolean z5 = (iJp0y & 1) != 0;
        int iJp0y2 = gvn7Var.jp0y();
        String[] strArr = new String[iJp0y2];
        for (int i5 = 0; i5 < iJp0y2; i5++) {
            int iM13596n2 = gvn7Var.m13596n();
            int iM12317z2 = m12317z(gvn7Var.m13598q(), iM13596n2);
            strArr[i5] = new String(gvn7Var.m13598q(), iM13596n2, iM12317z2 - iM13596n2, C3548p.f65199kja0);
            gvn7Var.n5r1(iM12317z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = iM13596n + i2;
        while (gvn7Var.m13596n() < i6) {
            Id3Frame id3FrameLd6 = ld6(i3, gvn7Var, z2, i4, interfaceC3499k);
            if (id3FrameLd6 != null) {
                arrayList.add(id3FrameLd6);
            }
        }
        return new ChapterTocFrame(str, z3, z5, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r3
      0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m12315t(com.google.android.exoplayer2.util.gvn7 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m13596n()
        L8:
            int r3 = r18.m13594k()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.kja0()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.d3()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.lvui()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.oc()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.oc()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.n5r1(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.n5r1(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.n5r1(r2)
            return r6
        L98:
            int r3 = r18.m13594k()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.n5r1(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.hyr(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.n5r1(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.n5r1(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.toq.m12315t(com.google.android.exoplayer2.util.gvn7, int, int, boolean):boolean");
    }

    private static UrlLinkFrame t8r(gvn7 gvn7Var, int i2, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        gvn7Var.ld6(bArr, 0, i2);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m12317z(bArr, 0), C3548p.f65199kja0));
    }

    private static int wvg(gvn7 gvn7Var, int i2) {
        byte[] bArrM13598q = gvn7Var.m13598q();
        int iM13596n = gvn7Var.m13596n();
        int i3 = iM13596n;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iM13596n + i2) {
                return i2;
            }
            if ((bArrM13598q[i3] & 255) == 255 && bArrM13598q[i4] == 0) {
                System.arraycopy(bArrM13598q, i3 + 2, bArrM13598q, i4, (i2 - (i3 - iM13596n)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    private static GeobFrame x2(gvn7 gvn7Var, int i2) throws UnsupportedEncodingException {
        int iJp0y = gvn7Var.jp0y();
        String strZurt = zurt(iJp0y);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        gvn7Var.ld6(bArr, 0, i3);
        int iM12317z = m12317z(bArr, 0);
        String str = new String(bArr, 0, iM12317z, C3548p.f65199kja0);
        int i4 = iM12317z + 1;
        int iFu4 = fu4(bArr, i4, iJp0y);
        String strM12310h = m12310h(bArr, i4, iFu4, strZurt);
        int iFn3e = iFu4 + fn3e(iJp0y);
        int iFu42 = fu4(bArr, iFn3e, iJp0y);
        return new GeobFrame(str, strM12310h, m12310h(bArr, iFn3e, iFu42, strZurt), m12313q(bArr, iFu42 + fn3e(iJp0y), i3));
    }

    /* JADX INFO: renamed from: y */
    private static ChapterFrame m12316y(gvn7 gvn7Var, int i2, int i3, boolean z2, int i4, @dd InterfaceC3499k interfaceC3499k) throws UnsupportedEncodingException {
        int iM13596n = gvn7Var.m13596n();
        int iM12317z = m12317z(gvn7Var.m13598q(), iM13596n);
        String str = new String(gvn7Var.m13598q(), iM13596n, iM12317z - iM13596n, C3548p.f65199kja0);
        gvn7Var.n5r1(iM12317z + 1);
        int iKja0 = gvn7Var.kja0();
        int iKja02 = gvn7Var.kja0();
        long jD3 = gvn7Var.d3();
        long j2 = jD3 == 4294967295L ? -1L : jD3;
        long jD32 = gvn7Var.d3();
        long j3 = jD32 == 4294967295L ? -1L : jD32;
        ArrayList arrayList = new ArrayList();
        int i5 = iM13596n + i2;
        while (gvn7Var.m13596n() < i5) {
            Id3Frame id3FrameLd6 = ld6(i3, gvn7Var, z2, i4, interfaceC3499k);
            if (id3FrameLd6 != null) {
                arrayList.add(id3FrameLd6);
            }
        }
        return new ChapterFrame(str, iKja0, iKja02, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: z */
    private static int m12317z(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    private static String zurt(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? C3548p.f65199kja0 : "UTF-8" : "UTF-16BE" : C3548p.f21093h;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public Metadata m12318n(byte[] bArr, int i2) {
        ArrayList arrayList = new ArrayList();
        gvn7 gvn7Var = new gvn7(bArr, i2);
        C7957toq c7957toqQrj = qrj(gvn7Var);
        if (c7957toqQrj == null) {
            return null;
        }
        int iM13596n = gvn7Var.m13596n();
        int i3 = c7957toqQrj.f20830k == 2 ? 6 : 10;
        int iWvg = c7957toqQrj.f64990zy;
        if (c7957toqQrj.f64989toq) {
            iWvg = wvg(gvn7Var, c7957toqQrj.f64990zy);
        }
        gvn7Var.m13595l(iM13596n + iWvg);
        boolean z2 = false;
        if (!m12315t(gvn7Var, c7957toqQrj.f20830k, i3, false)) {
            if (c7957toqQrj.f20830k != 4 || !m12315t(gvn7Var, 4, i3, true)) {
                int i4 = c7957toqQrj.f20830k;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(i4);
                ni7.qrj(f64988zy, sb.toString());
                return null;
            }
            z2 = true;
        }
        while (gvn7Var.m13594k() >= i3) {
            Id3Frame id3FrameLd6 = ld6(c7957toqQrj.f20830k, gvn7Var, z2, i3, this.f20829k);
            if (id3FrameLd6 != null) {
                arrayList.add(id3FrameLd6);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.google.android.exoplayer2.metadata.AbstractC3483g
    @dd
    protected Metadata toq(com.google.android.exoplayer2.metadata.zy zyVar, ByteBuffer byteBuffer) {
        return m12318n(byteBuffer.array(), byteBuffer.limit());
    }

    public toq(@dd InterfaceC3499k interfaceC3499k) {
        this.f20829k = interfaceC3499k;
    }
}
