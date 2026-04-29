package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.gvn7;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67170f7l8 = 33;

    /* JADX INFO: renamed from: g */
    @dd
    public final String f23395g;

    /* JADX INFO: renamed from: k */
    public final List<byte[]> f23396k;

    /* JADX INFO: renamed from: n */
    public final float f23397n;

    /* JADX INFO: renamed from: q */
    public final int f23398q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f67171toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f67172zy;

    private f7l8(List<byte[]> list, int i2, int i3, int i4, float f2, @dd String str) {
        this.f23396k = list;
        this.f67171toq = i2;
        this.f67172zy = i3;
        this.f23398q = i4;
        this.f23397n = f2;
        this.f23395g = str;
    }

    /* JADX INFO: renamed from: k */
    public static f7l8 m13788k(gvn7 gvn7Var) throws sok {
        int i2;
        int i3;
        try {
            gvn7Var.hyr(21);
            int iJp0y = gvn7Var.jp0y() & 3;
            int iJp0y2 = gvn7Var.jp0y();
            int iM13596n = gvn7Var.m13596n();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iJp0y2; i6++) {
                gvn7Var.hyr(1);
                int iLvui = gvn7Var.lvui();
                for (int i7 = 0; i7 < iLvui; i7++) {
                    int iLvui2 = gvn7Var.lvui();
                    i5 += iLvui2 + 4;
                    gvn7Var.hyr(iLvui2);
                }
            }
            gvn7Var.n5r1(iM13596n);
            byte[] bArr = new byte[i5];
            float f2 = 1.0f;
            String strZy = null;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            int i11 = 0;
            while (i10 < iJp0y2) {
                int iJp0y3 = gvn7Var.jp0y() & 127;
                int iLvui3 = gvn7Var.lvui();
                int i12 = i4;
                while (i12 < iLvui3) {
                    int iLvui4 = gvn7Var.lvui();
                    byte[] bArr2 = C3856t.f67070toq;
                    int i13 = iJp0y2;
                    System.arraycopy(bArr2, i4, bArr, i11, bArr2.length);
                    int length = i11 + bArr2.length;
                    System.arraycopy(gvn7Var.m13598q(), gvn7Var.m13596n(), bArr, length, iLvui4);
                    if (iJp0y3 == 33 && i12 == 0) {
                        C3856t.k kVarM13732y = C3856t.m13732y(bArr, length, length + iLvui4);
                        int i14 = kVarM13732y.f23281y;
                        i9 = kVarM13732y.f23280s;
                        f2 = kVarM13732y.f23278p;
                        i2 = iJp0y3;
                        i3 = iLvui3;
                        i8 = i14;
                        strZy = C3838g.zy(kVarM13732y.f23276k, kVarM13732y.f67073toq, kVarM13732y.f67074zy, kVarM13732y.f23279q, kVarM13732y.f23277n, kVarM13732y.f23275g);
                    } else {
                        i2 = iJp0y3;
                        i3 = iLvui3;
                    }
                    i11 = length + iLvui4;
                    gvn7Var.hyr(iLvui4);
                    i12++;
                    iJp0y2 = i13;
                    iJp0y3 = i2;
                    iLvui3 = i3;
                    i4 = 0;
                }
                i10++;
                i4 = 0;
            }
            return new f7l8(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iJp0y + 1, i8, i9, f2, strZy);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw sok.createForMalformedContainer("Error parsing HEVC config", e2);
        }
    }
}
