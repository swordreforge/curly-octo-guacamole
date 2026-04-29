package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.AbstractC3483g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.zy;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.jp0y;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.k */
/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3516k extends AbstractC3483g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64999f7l8 = 6;

    /* JADX INFO: renamed from: g */
    private static final int f20887g = 5;

    /* JADX INFO: renamed from: n */
    private static final int f20888n = 4;

    /* JADX INFO: renamed from: q */
    private static final int f20889q = 0;

    /* JADX INFO: renamed from: y */
    private static final int f20890y = 255;

    /* JADX INFO: renamed from: k */
    private final gvn7 f20891k = new gvn7();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final jp0y f65000toq = new jp0y();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C3847l f65001zy;

    @Override // com.google.android.exoplayer2.metadata.AbstractC3483g
    protected Metadata toq(zy zyVar, ByteBuffer byteBuffer) {
        C3847l c3847l = this.f65001zy;
        if (c3847l == null || zyVar.f20893l != c3847l.m13648n()) {
            C3847l c3847l2 = new C3847l(zyVar.f19618s);
            this.f65001zy = c3847l2;
            c3847l2.m13647k(zyVar.f19618s - zyVar.f20893l);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f20891k.ncyb(bArrArray, iLimit);
        this.f65000toq.m13621h(bArrArray, iLimit);
        this.f65000toq.t8r(39);
        long jM13627y = (((long) this.f65000toq.m13627y(1)) << 32) | ((long) this.f65000toq.m13627y(32));
        this.f65000toq.t8r(20);
        int iM13627y = this.f65000toq.m13627y(12);
        int iM13627y2 = this.f65000toq.m13627y(8);
        Metadata.Entry spliceNullCommand = null;
        this.f20891k.hyr(14);
        if (iM13627y2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iM13627y2 == 255) {
            spliceNullCommand = PrivateCommand.m12329k(this.f20891k, iM13627y, jM13627y);
        } else if (iM13627y2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.m12335k(this.f20891k);
        } else if (iM13627y2 == 5) {
            spliceNullCommand = SpliceInsertCommand.m12331k(this.f20891k, jM13627y, this.f65001zy);
        } else if (iM13627y2 == 6) {
            spliceNullCommand = TimeSignalCommand.m12343k(this.f20891k, jM13627y, this.f65001zy);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
