package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.gvn7;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.k */
/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3873k {

    /* JADX INFO: renamed from: g */
    @dd
    public final String f23420g;

    /* JADX INFO: renamed from: k */
    public final List<byte[]> f23421k;

    /* JADX INFO: renamed from: n */
    public final float f23422n;

    /* JADX INFO: renamed from: q */
    public final int f23423q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f67179toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f67180zy;

    private C3873k(List<byte[]> list, int i2, int i3, int i4, float f2, @dd String str) {
        this.f23421k = list;
        this.f67179toq = i2;
        this.f67180zy = i3;
        this.f23423q = i4;
        this.f23422n = f2;
        this.f23420g = str;
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m13797k(gvn7 gvn7Var) {
        int iLvui = gvn7Var.lvui();
        int iM13596n = gvn7Var.m13596n();
        gvn7Var.hyr(iLvui);
        return C3838g.m13588q(gvn7Var.m13598q(), iM13596n, iLvui);
    }

    public static C3873k toq(gvn7 gvn7Var) throws sok {
        float f2;
        String strM13586k;
        int i2;
        try {
            gvn7Var.hyr(4);
            int iJp0y = (gvn7Var.jp0y() & 3) + 1;
            if (iJp0y == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iJp0y2 = gvn7Var.jp0y() & 31;
            for (int i3 = 0; i3 < iJp0y2; i3++) {
                arrayList.add(m13797k(gvn7Var));
            }
            int iJp0y3 = gvn7Var.jp0y();
            for (int i4 = 0; i4 < iJp0y3; i4++) {
                arrayList.add(m13797k(gvn7Var));
            }
            int i5 = -1;
            if (iJp0y2 > 0) {
                C3856t.zy zyVarX2 = C3856t.x2((byte[]) arrayList.get(0), iJp0y, ((byte[]) arrayList.get(0)).length);
                int i6 = zyVarX2.f23285n;
                int i7 = zyVarX2.f23283g;
                float f3 = zyVarX2.f67077f7l8;
                strM13586k = C3838g.m13586k(zyVarX2.f23284k, zyVarX2.f67080toq, zyVarX2.f67082zy);
                i5 = i6;
                i2 = i7;
                f2 = f3;
            } else {
                f2 = 1.0f;
                strM13586k = null;
                i2 = -1;
            }
            return new C3873k(arrayList, iJp0y, i5, i2, f2, strM13586k);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw sok.createForMalformedContainer("Error parsing AVC config", e2);
        }
    }
}
