package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.ki;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;
import zy.dd;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends AbstractC3433g {

    /* JADX INFO: renamed from: m */
    private static final int f23546m = 100000;

    /* JADX INFO: renamed from: o */
    private static final String f23547o = "CameraMotionRenderer";

    /* JADX INFO: renamed from: c */
    private long f23548c;

    /* JADX INFO: renamed from: e */
    @dd
    private InterfaceC3885k f23549e;

    /* JADX INFO: renamed from: f */
    private final gvn7 f23550f;

    /* JADX INFO: renamed from: j */
    private long f23551j;

    /* JADX INFO: renamed from: l */
    private final C3297s f23552l;

    public toq() {
        super(6);
        this.f23552l = new C3297s(1);
        this.f23550f = new gvn7();
    }

    private void hyr() {
        InterfaceC3885k interfaceC3885k = this.f23549e;
        if (interfaceC3885k != null) {
            interfaceC3885k.f7l8();
        }
    }

    @dd
    private float[] n5r1(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f23550f.ncyb(byteBuffer.array(), byteBuffer.limit());
        this.f23550f.n5r1(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = Float.intBitsToFloat(this.f23550f.ki());
        }
        return fArr;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) {
        this.f23551j = Long.MIN_VALUE;
        hyr();
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    public String getName() {
        return f23547o;
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public int mo11518k(xwq3 xwq3Var) {
        return wvg.f67112ikck.equals(xwq3Var.f23682r) ? cv06.m11557p(4) : cv06.m11557p(0);
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        hyr();
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @dd Object obj) throws ki {
        if (i2 == 8) {
            this.f23549e = (InterfaceC3885k) obj;
        } else {
            super.x2(i2, obj);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) {
        this.f23548c = j3;
    }

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) {
        while (!mo11548g() && this.f23551j < 100000 + j2) {
            this.f23552l.mo11567s();
            if (ncyb(a9(), this.f23552l, 0) != -4 || this.f23552l.n7h()) {
                return;
            }
            C3297s c3297s = this.f23552l;
            this.f23551j = c3297s.f19618s;
            if (this.f23549e != null && !c3297s.qrj()) {
                this.f23552l.m11579i();
                float[] fArrN5r1 = n5r1((ByteBuffer) lrht.ld6(this.f23552l.f19612g));
                if (fArrN5r1 != null) {
                    ((InterfaceC3885k) lrht.ld6(this.f23549e)).toq(this.f23551j - this.f23548c, fArrN5r1);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return mo11548g();
    }
}
