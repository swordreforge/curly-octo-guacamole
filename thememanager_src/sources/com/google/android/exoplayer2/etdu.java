package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3863z;
import java.io.IOException;

/* JADX INFO: compiled from: NoSampleRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class etdu implements bek6, cv06 {

    /* JADX INFO: renamed from: g */
    @zy.dd
    private InterfaceC3603j f19730g;

    /* JADX INFO: renamed from: k */
    private h7am f19731k;

    /* JADX INFO: renamed from: n */
    private int f19732n;

    /* JADX INFO: renamed from: q */
    private int f19733q;

    /* JADX INFO: renamed from: y */
    private boolean f19734y;

    protected void a9() {
    }

    @zy.dd
    protected final h7am f7l8() {
        return this.f19731k;
    }

    @Override // com.google.android.exoplayer2.cv06
    public int fn3e() throws ki {
        return 0;
    }

    protected void fti() throws ki {
    }

    @Override // com.google.android.exoplayer2.bek6
    public long fu4() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: g */
    public final boolean mo11548g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final int getState() {
        return this.f19732n;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: h */
    public final cv06 mo11549h() {
        return this;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: i */
    public final void mo11550i(h7am h7amVar, xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, boolean z2, boolean z3, long j3, long j4) throws ki {
        C3844k.m13633s(this.f19732n == 0);
        this.f19731k = h7amVar;
        this.f19732n = 1;
        m11673t(z2);
        kja0(xwq3VarArr, interfaceC3603j, j3, j4);
        mcp(j2, z2);
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return true;
    }

    protected void jk(long j2) throws ki {
    }

    protected void jp0y() {
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public int mo11518k(xwq3 xwq3Var) throws ki {
        return cv06.m11557p(0);
    }

    protected void ki() {
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void kja0(xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, long j3) throws ki {
        C3844k.m13633s(!this.f19734y);
        this.f19730g = interfaceC3603j;
        jk(j3);
    }

    protected final int ld6() {
        return this.f19733q;
    }

    protected void mcp(long j2, boolean z2) throws ki {
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: n */
    public final int mo11551n() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final boolean n7h() {
        return this.f19734y;
    }

    @Override // com.google.android.exoplayer2.bek6
    @zy.dd
    public final InterfaceC3603j ni7() {
        return this.f19730g;
    }

    @Override // com.google.android.exoplayer2.bek6
    @zy.dd
    public InterfaceC3863z o1t() {
        return null;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: q */
    public final void mo11552q() {
        C3844k.m13633s(this.f19732n == 1);
        this.f19732n = 0;
        this.f19730g = null;
        this.f19734y = false;
        ki();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void qrj() throws IOException {
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void reset() {
        C3844k.m13633s(this.f19732n == 0);
        a9();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void setIndex(int i2) {
        this.f19733q = i2;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void start() throws ki {
        C3844k.m13633s(this.f19732n == 1);
        this.f19732n = 2;
        fti();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void stop() {
        C3844k.m13633s(this.f19732n == 2);
        this.f19732n = 1;
        jp0y();
    }

    /* JADX INFO: renamed from: t */
    protected void m11673t(boolean z2) throws ki {
    }

    @Override // com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @zy.dd Object obj) throws ki {
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: y */
    public final void mo11553y() {
        this.f19734y = true;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: z */
    public final void mo11554z(long j2) throws ki {
        this.f19734y = false;
        mcp(j2, false);
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return true;
    }
}
