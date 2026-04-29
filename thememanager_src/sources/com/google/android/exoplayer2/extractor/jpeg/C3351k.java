package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.jpeg.k */
/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3351k implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f63766cdj = 4;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final long f63767fn3e = 1165519206;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f63768fu4 = 65504;

    /* JADX INFO: renamed from: h */
    private static final int f19828h = 2;

    /* JADX INFO: renamed from: i */
    private static final int f19829i = 6;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f63769ki = 5;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f63770kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f63771n7h = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f63772ni7 = 65498;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f63773o1t = "http://ns.adobe.com/xap/1.0/";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f63774t8r = 6;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f63775wvg = 1024;

    /* JADX INFO: renamed from: z */
    private static final int f19830z = 65505;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f63776zurt = 65496;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63777f7l8;

    /* JADX INFO: renamed from: g */
    private int f19831g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private ld6 f63778ld6;

    /* JADX INFO: renamed from: n */
    private x2 f19832n;

    /* JADX INFO: renamed from: p */
    @dd
    private MotionPhotoMetadata f19833p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.extractor.mp4.ld6 f63779qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private zy f63780x2;

    /* JADX INFO: renamed from: y */
    private int f19836y;

    /* JADX INFO: renamed from: q */
    private final gvn7 f19834q = new gvn7(6);

    /* JADX INFO: renamed from: s */
    private long f19835s = -1;

    @dd
    private static MotionPhotoMetadata f7l8(String str, long j2) throws IOException {
        toq toqVarM11749k;
        if (j2 == -1 || (toqVarM11749k = C3352n.m11749k(str)) == null) {
            return null;
        }
        return toqVarM11749k.m11756k(j2);
    }

    /* JADX INFO: renamed from: g */
    private void m11743g() {
        m11747y(new Metadata.Entry[0]);
        ((x2) C3844k.f7l8(this.f19832n)).mo11753i();
        this.f19832n.cdj(new o1t.toq(C3548p.f65257toq));
        this.f19831g = 6;
    }

    private void ld6(ld6 ld6Var) throws IOException {
        String strWvg;
        if (this.f63777f7l8 == f19830z) {
            gvn7 gvn7Var = new gvn7(this.f19836y);
            ld6Var.readFully(gvn7Var.m13598q(), 0, this.f19836y);
            if (this.f19833p == null && f63773o1t.equals(gvn7Var.wvg()) && (strWvg = gvn7Var.wvg()) != null) {
                MotionPhotoMetadata motionPhotoMetadataF7l8 = f7l8(strWvg, ld6Var.getLength());
                this.f19833p = motionPhotoMetadataF7l8;
                if (motionPhotoMetadataF7l8 != null) {
                    this.f19835s = motionPhotoMetadataF7l8.f20836g;
                }
            }
        } else {
            ld6Var.cdj(this.f19836y);
        }
        this.f19831g = 0;
    }

    /* JADX INFO: renamed from: n */
    private void m11744n(ld6 ld6Var) throws IOException {
        this.f19834q.dd(2);
        ld6Var.fn3e(this.f19834q.m13598q(), 0, 2);
        ld6Var.qrj(this.f19834q.lvui() - 2);
    }

    private void n7h() {
        m11747y((Metadata.Entry) C3844k.f7l8(this.f19833p));
        this.f19831g = 5;
    }

    /* JADX INFO: renamed from: p */
    private void m11745p(ld6 ld6Var) throws IOException {
        this.f19834q.dd(2);
        ld6Var.readFully(this.f19834q.m13598q(), 0, 2);
        int iLvui = this.f19834q.lvui();
        this.f63777f7l8 = iLvui;
        if (iLvui == f63772ni7) {
            if (this.f19835s != -1) {
                this.f19831g = 4;
                return;
            } else {
                m11743g();
                return;
            }
        }
        if ((iLvui < 65488 || iLvui > 65497) && iLvui != 65281) {
            this.f19831g = 1;
        }
    }

    private void qrj(ld6 ld6Var) throws IOException {
        if (!ld6Var.f7l8(this.f19834q.m13598q(), 0, 1, true)) {
            m11743g();
            return;
        }
        ld6Var.mo11730y();
        if (this.f63779qrj == null) {
            this.f63779qrj = new com.google.android.exoplayer2.extractor.mp4.ld6();
        }
        zy zyVar = new zy(ld6Var, this.f19835s);
        this.f63780x2 = zyVar;
        if (!this.f63779qrj.toq(zyVar)) {
            m11743g();
        } else {
            this.f63779qrj.mo11689q(new C3353q(this.f19835s, (x2) C3844k.f7l8(this.f19832n)));
            n7h();
        }
    }

    /* JADX INFO: renamed from: s */
    private int m11746s(ld6 ld6Var) throws IOException {
        this.f19834q.dd(2);
        ld6Var.fn3e(this.f19834q.m13598q(), 0, 2);
        return this.f19834q.lvui();
    }

    private void x2(ld6 ld6Var) throws IOException {
        this.f19834q.dd(2);
        ld6Var.readFully(this.f19834q.m13598q(), 0, 2);
        this.f19836y = this.f19834q.lvui() - 2;
        this.f19831g = 2;
    }

    /* JADX INFO: renamed from: y */
    private void m11747y(Metadata.Entry... entryArr) {
        ((x2) C3844k.f7l8(this.f19832n)).toq(1024, 4).mo11931q(new xwq3.toq().eqxt(wvg.f67136tfm).uv6(new Metadata(entryArr)).a9());
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        if (j2 == 0) {
            this.f19831g = 0;
            this.f63779qrj = null;
        } else if (this.f19831g == 5) {
            ((com.google.android.exoplayer2.extractor.mp4.ld6) C3844k.f7l8(this.f63779qrj)).mo11688k(j2, j3);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f19832n = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
        com.google.android.exoplayer2.extractor.mp4.ld6 ld6Var = this.f63779qrj;
        if (ld6Var != null) {
            ld6Var.release();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        if (m11746s(ld6Var) != f63776zurt) {
            return false;
        }
        int iM11746s = m11746s(ld6Var);
        this.f63777f7l8 = iM11746s;
        if (iM11746s == f63768fu4) {
            m11744n(ld6Var);
            this.f63777f7l8 = m11746s(ld6Var);
        }
        if (this.f63777f7l8 != f19830z) {
            return false;
        }
        ld6Var.qrj(2);
        this.f19834q.dd(6);
        ld6Var.fn3e(this.f19834q.m13598q(), 0, 6);
        return this.f19834q.d3() == f63767fn3e && this.f19834q.lvui() == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        int i2 = this.f19831g;
        if (i2 == 0) {
            m11745p(ld6Var);
            return 0;
        }
        if (i2 == 1) {
            x2(ld6Var);
            return 0;
        }
        if (i2 == 2) {
            ld6(ld6Var);
            return 0;
        }
        if (i2 == 4) {
            long position = ld6Var.getPosition();
            long j2 = this.f19835s;
            if (position != j2) {
                fu4Var.f19818k = j2;
                return 1;
            }
            qrj(ld6Var);
            return 0;
        }
        if (i2 != 5) {
            if (i2 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f63780x2 == null || ld6Var != this.f63778ld6) {
            this.f63778ld6 = ld6Var;
            this.f63780x2 = new zy(ld6Var, this.f19835s);
        }
        int iZy = ((com.google.android.exoplayer2.extractor.mp4.ld6) C3844k.f7l8(this.f63779qrj)).zy(this.f63780x2, fu4Var);
        if (iZy == 1) {
            fu4Var.f19818k += this.f19835s;
        }
        return iZy;
    }
}
