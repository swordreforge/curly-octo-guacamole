package com.google.android.exoplayer2.metadata.dvbsi;

import com.google.android.exoplayer2.metadata.AbstractC3483g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.zy;
import com.google.android.exoplayer2.util.jp0y;
import com.google.common.base.C4258g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.dvbsi.k */
/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3477k extends AbstractC3483g {

    /* JADX INFO: renamed from: k */
    private static final int f20741k = 2;

    /* JADX INFO: renamed from: q */
    public static final int f20742q = 116;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f64975toq = 21;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f64976zy = 3;

    @dd
    private static Metadata zy(jp0y jp0yVar) {
        jp0yVar.t8r(12);
        int iM13625q = (jp0yVar.m13625q() + jp0yVar.m13627y(12)) - 4;
        jp0yVar.t8r(44);
        jp0yVar.m13622i(jp0yVar.m13627y(12));
        jp0yVar.t8r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strQrj = null;
            if (jp0yVar.m13625q() >= iM13625q) {
                break;
            }
            jp0yVar.t8r(48);
            int iM13627y = jp0yVar.m13627y(8);
            jp0yVar.t8r(4);
            int iM13625q2 = jp0yVar.m13625q() + jp0yVar.m13627y(12);
            String strQrj2 = null;
            while (jp0yVar.m13625q() < iM13625q2) {
                int iM13627y2 = jp0yVar.m13627y(8);
                int iM13627y3 = jp0yVar.m13627y(8);
                int iM13625q3 = jp0yVar.m13625q() + iM13627y3;
                if (iM13627y2 == 2) {
                    int iM13627y4 = jp0yVar.m13627y(16);
                    jp0yVar.t8r(8);
                    if (iM13627y4 == 3) {
                        while (jp0yVar.m13625q() < iM13625q3) {
                            strQrj = jp0yVar.qrj(jp0yVar.m13627y(8), C4258g.f25663k);
                            int iM13627y5 = jp0yVar.m13627y(8);
                            for (int i2 = 0; i2 < iM13627y5; i2++) {
                                jp0yVar.m13622i(jp0yVar.m13627y(8));
                            }
                        }
                    }
                } else if (iM13627y2 == 21) {
                    strQrj2 = jp0yVar.qrj(iM13627y3, C4258g.f25663k);
                }
                jp0yVar.cdj(iM13625q3 * 8);
            }
            jp0yVar.cdj(iM13625q2 * 8);
            if (strQrj != null && strQrj2 != null) {
                arrayList.add(new AppInfoTable(iM13627y, strQrj2.length() != 0 ? strQrj.concat(strQrj2) : new String(strQrj)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // com.google.android.exoplayer2.metadata.AbstractC3483g
    @dd
    protected Metadata toq(zy zyVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return zy(new jp0y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
