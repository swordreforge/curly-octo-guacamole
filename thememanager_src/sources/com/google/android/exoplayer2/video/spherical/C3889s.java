package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.cdj;
import com.google.android.exoplayer2.util.ncyb;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.s */
/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3889s implements com.google.android.exoplayer2.video.ld6, InterfaceC3885k {

    /* JADX INFO: renamed from: i */
    private int f23535i;

    /* JADX INFO: renamed from: l */
    @dd
    private byte[] f23537l;

    /* JADX INFO: renamed from: z */
    private SurfaceTexture f23545z;

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f23536k = new AtomicBoolean();

    /* JADX INFO: renamed from: q */
    private final AtomicBoolean f23540q = new AtomicBoolean(true);

    /* JADX INFO: renamed from: n */
    private final f7l8 f23538n = new f7l8();

    /* JADX INFO: renamed from: g */
    private final zy f23533g = new zy();

    /* JADX INFO: renamed from: y */
    private final ncyb<Long> f23544y = new ncyb<>();

    /* JADX INFO: renamed from: s */
    private final ncyb<C3886n> f23542s = new ncyb<>();

    /* JADX INFO: renamed from: p */
    private final float[] f23539p = new float[16];

    /* JADX INFO: renamed from: h */
    private final float[] f23534h = new float[16];

    /* JADX INFO: renamed from: t */
    private volatile int f23543t = 0;

    /* JADX INFO: renamed from: r */
    private int f23541r = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m13854g(SurfaceTexture surfaceTexture) {
        this.f23536k.set(true);
    }

    /* JADX INFO: renamed from: s */
    private void m13855s(@dd byte[] bArr, int i2, long j2) {
        byte[] bArr2 = this.f23537l;
        int i3 = this.f23541r;
        this.f23537l = bArr;
        if (i2 == -1) {
            i2 = this.f23543t;
        }
        this.f23541r = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f23537l)) {
            return;
        }
        byte[] bArr3 = this.f23537l;
        C3886n c3886nM13845k = bArr3 != null ? C3884g.m13845k(bArr3, this.f23541r) : null;
        if (c3886nM13845k == null || !f7l8.zy(c3886nM13845k)) {
            c3886nM13845k = C3886n.toq(this.f23541r);
        }
        this.f23542s.m13695k(j2, c3886nM13845k);
    }

    @Override // com.google.android.exoplayer2.video.spherical.InterfaceC3885k
    public void f7l8() {
        this.f23544y.zy();
        this.f23533g.m13862q();
        this.f23540q.set(true);
    }

    @Override // com.google.android.exoplayer2.video.ld6
    /* JADX INFO: renamed from: k */
    public void mo12133k(long j2, long j3, xwq3 xwq3Var, @dd MediaFormat mediaFormat) {
        this.f23544y.m13695k(j3, Long.valueOf(j2));
        m13855s(xwq3Var.f23688x, xwq3Var.f23685u, j3);
    }

    /* JADX INFO: renamed from: n */
    public SurfaceTexture m13856n() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        cdj.m13546n();
        this.f23538n.toq();
        cdj.m13546n();
        this.f23535i = cdj.m13547p();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23535i);
        this.f23545z = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.y
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f23560k.m13854g(surfaceTexture2);
            }
        });
        return this.f23545z;
    }

    /* JADX INFO: renamed from: p */
    public void m13857p() {
        this.f23538n.m13840n();
    }

    /* JADX INFO: renamed from: q */
    public void m13858q(float[] fArr, boolean z2) {
        GLES20.glClear(16384);
        cdj.m13546n();
        if (this.f23536k.compareAndSet(true, false)) {
            ((SurfaceTexture) C3844k.f7l8(this.f23545z)).updateTexImage();
            cdj.m13546n();
            if (this.f23540q.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f23539p, 0);
            }
            long timestamp = this.f23545z.getTimestamp();
            Long lF7l8 = this.f23544y.f7l8(timestamp);
            if (lF7l8 != null) {
                this.f23533g.zy(this.f23539p, lF7l8.longValue());
            }
            C3886n c3886nM13696p = this.f23542s.m13696p(timestamp);
            if (c3886nM13696p != null) {
                this.f23538n.m13841q(c3886nM13696p);
            }
        }
        Matrix.multiplyMM(this.f23534h, 0, fArr, 0, this.f23539p, 0);
        this.f23538n.m13839k(this.f23535i, this.f23534h, z2);
    }

    @Override // com.google.android.exoplayer2.video.spherical.InterfaceC3885k
    public void toq(long j2, float[] fArr) {
        this.f23533g.m13861n(j2, fArr);
    }

    /* JADX INFO: renamed from: y */
    public void m13859y(int i2) {
        this.f23543t = i2;
    }
}
