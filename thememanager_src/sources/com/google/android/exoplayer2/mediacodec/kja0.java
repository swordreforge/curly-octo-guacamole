package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.drm.C3321t;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.mediacodec.o1t;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.n5r1;
import com.google.android.exoplayer2.util.ncyb;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import zy.InterfaceC7839p;
import zy.InterfaceC7842s;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: MediaCodecRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kja0 extends AbstractC3433g {
    private static final int a7kc = 2;
    private static final String afw = "MediaCodecRenderer";
    private static final byte[] bsb = {0, 0, 1, 103, 66, -64, com.google.common.base.zy.f68132qrj, -38, 37, -112, 0, 0, 1, 104, -50, com.google.common.base.zy.f68111cdj, 19, 32, 0, 0, 1, 101, -120, -124, com.google.common.base.zy.f68124kja0, -50, 113, com.google.common.base.zy.f25759t, -96, 0, 47, -65, com.google.common.base.zy.f68118fti, 49, -61, 39, 93, 120};
    private static final int cecm = 1;
    private static final int eht = 10;
    private static final int fn2 = 2;
    private static final int gjxq = 0;
    private static final int h06 = 3;
    private static final int k84 = 0;
    private static final int kdv1 = 2;
    private static final int l2jk = 2;
    private static final int lw58 = 1;
    private static final int n5ij = 0;
    private static final int nq0z = 1;
    private static final long oyp = 1000;
    private static final int q09 = 32;
    protected static final float qns = -1.0f;
    private static final int r7v2 = 1;
    private static final int us2t = 0;

    /* JADX INFO: renamed from: a */
    private final ncyb<xwq3> f20654a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @dd
    private xwq3 f64935ab;

    @dd
    private C3461k ac;

    @dd
    private n7h ad;
    private boolean aj;
    private int am;
    private boolean an;
    private boolean ar;

    @dd
    private x2 as;
    private float ax;
    private boolean ay;

    @dd
    private MediaFormat az;

    /* JADX INFO: renamed from: b */
    private final C3473y f20655b;
    private boolean ba;

    @dd
    private com.google.android.exoplayer2.drm.qrj bb;
    private boolean bc;
    private boolean bd;
    private boolean be;

    @dd
    private xwq3 bg;
    private float bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final long[] f64936bo;

    @dd
    private com.google.android.exoplayer2.drm.qrj bp;

    @dd
    private ArrayDeque<n7h> bq;
    private boolean bs;
    private boolean bu;

    @dd
    private MediaCrypto bv;

    /* JADX INFO: renamed from: c */
    private final boolean f20656c;
    private int cw14;

    /* JADX INFO: renamed from: d */
    private final long[] f20657d;
    private long d1cy;
    private boolean dy;

    /* JADX INFO: renamed from: e */
    private final float f20658e;
    private boolean ei;

    /* JADX INFO: renamed from: f */
    private final cdj f20659f;
    private int hp;
    private long id;
    private float in;

    /* JADX INFO: renamed from: j */
    private final C3297s f20660j;
    private boolean k0;
    private boolean k6e;

    /* JADX INFO: renamed from: l */
    private final x2.toq f20661l;
    private int ls9;

    /* JADX INFO: renamed from: m */
    private final C3297s f20662m;
    private boolean mjvl;
    private boolean ndjo;

    /* JADX INFO: renamed from: o */
    private final C3297s f20663o;
    private boolean q7k9;
    private boolean s8y;

    @dd
    private ByteBuffer sk1t;
    private long tgs;
    private boolean th6;
    private boolean tlhn;

    /* JADX INFO: renamed from: u */
    private final MediaCodec.BufferInfo f20664u;
    private long ut;

    /* JADX INFO: renamed from: v */
    private final long[] f20665v;
    private boolean vb6;

    /* JADX INFO: renamed from: w */
    @dd
    private xwq3 f20666w;

    @dd
    private C3469s w97r;
    private long wh6;
    private boolean wra;

    /* JADX INFO: renamed from: x */
    private final ArrayList<Long> f20667x;

    @dd
    private com.google.android.exoplayer2.ki xhv;
    private boolean xk5;
    private long xqx;
    private int xy8;
    private int yl25;
    protected com.google.android.exoplayer2.decoder.f7l8 zm;
    private int zmmu;
    private boolean zr5t;
    private boolean zsl;

    public kja0(int i2, x2.toq toqVar, cdj cdjVar, boolean z2, float f2) {
        super(i2);
        this.f20661l = toqVar;
        this.f20659f = (cdj) C3844k.f7l8(cdjVar);
        this.f20656c = z2;
        this.f20658e = f2;
        this.f20660j = C3297s.zurt();
        this.f20663o = new C3297s(0);
        this.f20662m = new C3297s(2);
        C3473y c3473y = new C3473y();
        this.f20655b = c3473y;
        this.f20654a = new ncyb<>();
        this.f20667x = new ArrayList<>();
        this.f20664u = new MediaCodec.BufferInfo();
        this.in = 1.0f;
        this.bl = 1.0f;
        this.id = C3548p.f65257toq;
        this.f64936bo = new long[10];
        this.f20665v = new long[10];
        this.f20657d = new long[10];
        this.ut = C3548p.f65257toq;
        this.wh6 = C3548p.f65257toq;
        c3473y.ki(0);
        c3473y.f19612g.order(ByteOrder.nativeOrder());
        this.ax = -1.0f;
        this.am = 0;
        this.hp = 0;
        this.yl25 = -1;
        this.zmmu = -1;
        this.tgs = C3548p.f65257toq;
        this.d1cy = C3548p.f65257toq;
        this.xqx = C3548p.f65257toq;
        this.cw14 = 0;
        this.xy8 = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m12202a() {
        try {
            this.as.flush();
        } finally {
            yqrt();
        }
    }

    private boolean a98o() throws com.google.android.exoplayer2.ki {
        x2 x2Var = this.as;
        if (x2Var == null || this.cw14 == 2 || this.zr5t) {
            return false;
        }
        if (this.yl25 < 0) {
            int iQrj = x2Var.qrj();
            this.yl25 = iQrj;
            if (iQrj < 0) {
                return false;
            }
            this.f20663o.f19612g = this.as.mo12266q(iQrj);
            this.f20663o.mo11567s();
        }
        if (this.cw14 == 1) {
            if (!this.tlhn) {
                this.q7k9 = true;
                this.as.f7l8(this.yl25, 0, 0, 0L, 4);
                bwp();
            }
            this.cw14 = 2;
            return false;
        }
        if (this.bu) {
            this.bu = false;
            ByteBuffer byteBuffer = this.f20663o.f19612g;
            byte[] bArr = bsb;
            byteBuffer.put(bArr);
            this.as.f7l8(this.yl25, 0, bArr.length, 0L, 0);
            bwp();
            this.th6 = true;
            return true;
        }
        if (this.hp == 1) {
            for (int i2 = 0; i2 < this.bg.f23670f.size(); i2++) {
                this.f20663o.f19612g.put(this.bg.f23670f.get(i2));
            }
            this.hp = 2;
        }
        int iPosition = this.f20663o.f19612g.position();
        C3865v c3865vA9 = a9();
        try {
            int iNcyb = ncyb(c3865vA9, this.f20663o, 0);
            if (mo11548g()) {
                this.xqx = this.d1cy;
            }
            if (iNcyb == -3) {
                return false;
            }
            if (iNcyb == -5) {
                if (this.hp == 2) {
                    this.f20663o.mo11567s();
                    this.hp = 1;
                }
                zsr0(c3865vA9);
                return true;
            }
            if (this.f20663o.n7h()) {
                if (this.hp == 2) {
                    this.f20663o.mo11567s();
                    this.hp = 1;
                }
                this.zr5t = true;
                if (!this.th6) {
                    m4();
                    return false;
                }
                try {
                    if (!this.tlhn) {
                        this.q7k9 = true;
                        this.as.f7l8(this.yl25, 0, 0, 0L, 4);
                        bwp();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw m12067t(e2, this.f20666w, lrht.m13664m(e2.getErrorCode()));
                }
            }
            if (!this.th6 && !this.f20663o.kja0()) {
                this.f20663o.mo11567s();
                if (this.hp == 2) {
                    this.hp = 1;
                }
                return true;
            }
            boolean zFn3e = this.f20663o.fn3e();
            if (zFn3e) {
                this.f20663o.f19615n.toq(iPosition);
            }
            if (this.ay && !zFn3e) {
                C3856t.toq(this.f20663o.f19612g);
                if (this.f20663o.f19612g.position() == 0) {
                    return true;
                }
                this.ay = false;
            }
            C3297s c3297s = this.f20663o;
            long jM12260q = c3297s.f19618s;
            C3469s c3469s = this.w97r;
            if (c3469s != null) {
                jM12260q = c3469s.m12260q(this.f20666w, c3297s);
                this.d1cy = Math.max(this.d1cy, this.w97r.toq(this.f20666w));
            }
            long j2 = jM12260q;
            if (this.f20663o.qrj()) {
                this.f20667x.add(Long.valueOf(j2));
            }
            if (this.wra) {
                this.f20654a.m13695k(j2, this.f20666w);
                this.wra = false;
            }
            this.d1cy = Math.max(this.d1cy, j2);
            this.f20663o.m11579i();
            if (this.f20663o.x2()) {
                ikck(this.f20663o);
            }
            r8s8(this.f20663o);
            try {
                if (zFn3e) {
                    this.as.mo12263k(this.yl25, 0, this.f20663o.f19615n, j2, 0);
                } else {
                    this.as.f7l8(this.yl25, 0, this.f20663o.f19612g.limit(), j2, 0);
                }
                bwp();
                this.th6 = true;
                this.hp = 0;
                this.zm.f63555zy++;
                return true;
            } catch (MediaCodec.CryptoException e3) {
                throw m12067t(e3, this.f20666w, lrht.m13664m(e3.getErrorCode()));
            }
        } catch (C3297s.toq e4) {
            g1(e4);
            sok(0);
            m12202a();
            return true;
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: b */
    private boolean m12203b() throws com.google.android.exoplayer2.ki {
        if (this.th6) {
            this.cw14 = 1;
            if (this.be || this.bs) {
                this.xy8 = 3;
                return false;
            }
            this.xy8 = 2;
        } else {
            jbh();
        }
        return true;
    }

    private boolean bf2(long j2, long j3) throws com.google.android.exoplayer2.ki {
        boolean z2;
        boolean zV0af;
        x2 x2Var;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        int iN7h;
        if (!m12205d()) {
            if (this.k0 && this.q7k9) {
                try {
                    iN7h = this.as.n7h(this.f20664u);
                } catch (IllegalStateException unused) {
                    m4();
                    if (this.ei) {
                        w831();
                    }
                    return false;
                }
            } else {
                iN7h = this.as.n7h(this.f20664u);
            }
            if (iN7h < 0) {
                if (iN7h == -2) {
                    etdu();
                    return true;
                }
                if (this.tlhn && (this.zr5t || this.cw14 == 2)) {
                    m4();
                }
                return false;
            }
            if (this.bd) {
                this.bd = false;
                this.as.kja0(iN7h, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f20664u;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m4();
                return false;
            }
            this.zmmu = iN7h;
            ByteBuffer byteBufferMo12262h = this.as.mo12262h(iN7h);
            this.sk1t = byteBufferMo12262h;
            if (byteBufferMo12262h != null) {
                byteBufferMo12262h.position(this.f20664u.offset);
                ByteBuffer byteBuffer2 = this.sk1t;
                MediaCodec.BufferInfo bufferInfo3 = this.f20664u;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.ar) {
                MediaCodec.BufferInfo bufferInfo4 = this.f20664u;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j4 = this.d1cy;
                    if (j4 != C3548p.f65257toq) {
                        bufferInfo4.presentationTimeUs = j4;
                    }
                }
            }
            this.dy = qkj8(this.f20664u.presentationTimeUs);
            long j5 = this.xqx;
            long j6 = this.f20664u.presentationTimeUs;
            this.vb6 = j5 == j6;
            yl(j6);
        }
        if (this.k0 && this.q7k9) {
            try {
                x2Var = this.as;
                byteBuffer = this.sk1t;
                i2 = this.zmmu;
                bufferInfo = this.f20664u;
                z2 = false;
            } catch (IllegalStateException unused2) {
                z2 = false;
            }
            try {
                zV0af = v0af(j2, j3, x2Var, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.dy, this.vb6, this.f64935ab);
            } catch (IllegalStateException unused3) {
                m4();
                if (this.ei) {
                    w831();
                }
                return z2;
            }
        } else {
            z2 = false;
            x2 x2Var2 = this.as;
            ByteBuffer byteBuffer3 = this.sk1t;
            int i3 = this.zmmu;
            MediaCodec.BufferInfo bufferInfo5 = this.f20664u;
            zV0af = v0af(j2, j3, x2Var2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.dy, this.vb6, this.f64935ab);
        }
        if (zV0af) {
            i9jn(this.f20664u.presentationTimeUs);
            boolean z3 = (this.f20664u.flags & 4) != 0 ? true : z2;
            se();
            if (!z3) {
                return true;
            }
            m4();
        }
        return z2;
    }

    private void bwp() {
        this.yl25 = -1;
        this.f20663o.f19612g = null;
    }

    /* JADX INFO: renamed from: c */
    private int m12204c(String str) {
        int i2 = lrht.f23230k;
        if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = lrht.f23233q;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i2 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = lrht.f67040toq;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private void cfr() throws com.google.android.exoplayer2.ki {
        w831();
        wo();
    }

    private List<n7h> ch(boolean z2) throws o1t.zy {
        List<n7h> listC8jq = c8jq(this.f20659f, this.f20666w, z2);
        if (listC8jq.isEmpty() && z2) {
            listC8jq = c8jq(this.f20659f, this.f20666w, false);
            if (!listC8jq.isEmpty()) {
                String str = this.f20666w.f23682r;
                String strValueOf = String.valueOf(listC8jq);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + strValueOf.length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(strValueOf);
                sb.append(".");
                com.google.android.exoplayer2.util.ni7.qrj(afw, sb.toString());
            }
        }
        return listC8jq;
    }

    /* JADX INFO: renamed from: d */
    private boolean m12205d() {
        return this.zmmu >= 0;
    }

    private void d8wk(MediaCrypto mediaCrypto, boolean z2) throws C3461k {
        if (this.bq == null) {
            try {
                List<n7h> listCh = ch(z2);
                ArrayDeque<n7h> arrayDeque = new ArrayDeque<>();
                this.bq = arrayDeque;
                if (this.f20656c) {
                    arrayDeque.addAll(listCh);
                } else if (!listCh.isEmpty()) {
                    this.bq.add(listCh.get(0));
                }
                this.ac = null;
            } catch (o1t.zy e2) {
                throw new C3461k(this.f20666w, e2, z2, -49998);
            }
        }
        if (this.bq.isEmpty()) {
            throw new C3461k(this.f20666w, (Throwable) null, z2, -49999);
        }
        while (this.as == null) {
            n7h n7hVarPeekFirst = this.bq.peekFirst();
            if (!b3e(n7hVarPeekFirst)) {
                return;
            }
            try {
                vq(n7hVarPeekFirst, mediaCrypto);
            } catch (Exception e3) {
                String strValueOf = String.valueOf(n7hVarPeekFirst);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Failed to initialize decoder: ");
                sb.append(strValueOf);
                com.google.android.exoplayer2.util.ni7.n7h(afw, sb.toString(), e3);
                this.bq.removeFirst();
                C3461k c3461k = new C3461k(this.f20666w, e3, z2, n7hVarPeekFirst);
                g1(c3461k);
                if (this.ac == null) {
                    this.ac = c3461k;
                } else {
                    this.ac = this.ac.toq(c3461k);
                }
                if (this.bq.isEmpty()) {
                    throw this.ac;
                }
            }
        }
        this.bq = null;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m12206e(String str) {
        return lrht.f23230k == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void ek5k() {
        this.s8y = false;
        this.f20655b.mo11567s();
        this.f20662m.mo11567s();
        this.xk5 = false;
        this.k6e = false;
    }

    private void etdu() {
        this.ndjo = true;
        MediaFormat qVar = this.as.toq();
        if (this.am != 0 && qVar.getInteger("width") == 32 && qVar.getInteger(InterfaceC1925p.byf) == 32) {
            this.bd = true;
            return;
        }
        if (this.bc) {
            qVar.setInteger("channel-count", 1);
        }
        this.az = qVar;
        this.ba = true;
    }

    private static boolean fnq8(IllegalStateException illegalStateException) {
        if (lrht.f23230k >= 21 && qo(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void gc3c(@dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.bb, qrjVar);
        this.bb = qrjVar;
    }

    @dd
    private C3321t gyi(com.google.android.exoplayer2.drm.qrj qrjVar) throws com.google.android.exoplayer2.ki {
        com.google.android.exoplayer2.decoder.zy zyVarF7l8 = qrjVar.f7l8();
        if (zyVarF7l8 == null || (zyVarF7l8 instanceof C3321t)) {
            return (C3321t) zyVarF7l8;
        }
        String strValueOf = String.valueOf(zyVarF7l8);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
        sb.append("Expecting FrameworkCryptoConfig but found: ");
        sb.append(strValueOf);
        throw m12067t(new IllegalArgumentException(sb.toString()), this.f20666w, yqrt.ERROR_CODE_DRM_SCHEME_UNSUPPORTED);
    }

    protected static boolean h7am(xwq3 xwq3Var) {
        int i2 = xwq3Var.bv;
        return i2 == 0 || i2 == 2;
    }

    private static boolean hb(String str) {
        int i2 = lrht.f23230k;
        return i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i2 == 19 && lrht.f23233q.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private boolean hyr(long j2, long j3) throws com.google.android.exoplayer2.ki {
        boolean z2;
        C3844k.m13633s(!this.ei);
        if (this.f20655b.mcp()) {
            C3473y c3473y = this.f20655b;
            if (!v0af(j2, j3, null, c3473y.f19612g, this.zmmu, 0, c3473y.m12281t(), this.f20655b.o1t(), this.f20655b.qrj(), this.f20655b.n7h(), this.f64935ab)) {
                return false;
            }
            i9jn(this.f20655b.wvg());
            this.f20655b.mo11567s();
            z2 = false;
        } else {
            z2 = false;
        }
        if (this.zr5t) {
            this.ei = true;
            return z2;
        }
        if (this.xk5) {
            C3844k.m13633s(this.f20655b.fu4(this.f20662m));
            this.xk5 = z2;
        }
        if (this.s8y) {
            if (this.f20655b.mcp()) {
                return true;
            }
            ek5k();
            this.s8y = z2;
            wo();
            if (!this.k6e) {
                return z2;
            }
        }
        n5r1();
        if (this.f20655b.mcp()) {
            this.f20655b.m11579i();
        }
        if (this.f20655b.mcp() || this.zr5t || this.s8y) {
            return true;
        }
        return z2;
    }

    private boolean i1(n7h n7hVar, xwq3 xwq3Var, @dd com.google.android.exoplayer2.drm.qrj qrjVar, @dd com.google.android.exoplayer2.drm.qrj qrjVar2) throws com.google.android.exoplayer2.ki {
        C3321t c3321tGyi;
        if (qrjVar == qrjVar2) {
            return false;
        }
        if (qrjVar2 == null || qrjVar == null || lrht.f23230k < 23) {
            return true;
        }
        UUID uuid = C3548p.f65162ew;
        if (uuid.equals(qrjVar.zy()) || uuid.equals(qrjVar2.zy()) || (c3321tGyi = gyi(qrjVar2)) == null) {
            return true;
        }
        return !n7hVar.f64947f7l8 && (c3321tGyi.f63628zy ? false : qrjVar2.mo11613p(xwq3Var.f23682r));
    }

    /* JADX INFO: renamed from: j */
    private static boolean m12207j(String str, xwq3 xwq3Var) {
        return lrht.f23230k <= 18 && xwq3Var.f23686v == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    @hyr(23)
    private void jbh() throws com.google.android.exoplayer2.ki {
        try {
            this.bv.setMediaDrmSession(gyi(this.bp).f63627toq);
            gc3c(this.bp);
            this.cw14 = 0;
            this.xy8 = 0;
        } catch (MediaCryptoException e2) {
            throw m12067t(e2, this.f20666w, yqrt.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    private void jz5(@dd com.google.android.exoplayer2.drm.qrj qrjVar) {
        com.google.android.exoplayer2.drm.qrj.m11646y(this.bp, qrjVar);
        this.bp = qrjVar;
    }

    private boolean ktq(long j2) {
        return this.id == C3548p.f65257toq || SystemClock.elapsedRealtime() - j2 < this.id;
    }

    private static boolean lrht(String str, xwq3 xwq3Var) {
        return lrht.f23230k < 21 && xwq3Var.f23670f.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    @TargetApi(23)
    private void m4() throws com.google.android.exoplayer2.ki {
        int i2 = this.xy8;
        if (i2 == 1) {
            m12202a();
            return;
        }
        if (i2 == 2) {
            m12202a();
            jbh();
        } else if (i2 == 3) {
            cfr();
        } else {
            this.ei = true;
            z4();
        }
    }

    private boolean mbx(xwq3 xwq3Var) throws com.google.android.exoplayer2.ki {
        if (lrht.f23230k >= 23 && this.as != null && this.xy8 != 3 && getState() != 0) {
            float fBo = bo(this.bl, xwq3Var, gvn7());
            float f2 = this.ax;
            if (f2 == fBo) {
                return true;
            }
            if (fBo == -1.0f) {
                y9n();
                return false;
            }
            if (f2 == -1.0f && fBo <= this.f20658e) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fBo);
            this.as.mo12265p(bundle);
            this.ax = fBo;
        }
        return true;
    }

    private void mu(xwq3 xwq3Var) {
        ek5k();
        String str = xwq3Var.f23682r;
        if (com.google.android.exoplayer2.util.wvg.f67142wvg.equals(str) || com.google.android.exoplayer2.util.wvg.f67113jk.equals(str) || com.google.android.exoplayer2.util.wvg.f23297c.equals(str)) {
            this.f20655b.jk(32);
        } else {
            this.f20655b.jk(1);
        }
        this.k6e = true;
    }

    private void n5r1() throws com.google.android.exoplayer2.ki {
        C3844k.m13633s(!this.zr5t);
        C3865v c3865vA9 = a9();
        this.f20662m.mo11567s();
        do {
            this.f20662m.mo11567s();
            int iNcyb = ncyb(c3865vA9, this.f20662m, 0);
            if (iNcyb == -5) {
                zsr0(c3865vA9);
                return;
            }
            if (iNcyb != -4) {
                if (iNcyb != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f20662m.n7h()) {
                    this.zr5t = true;
                    return;
                }
                if (this.wra) {
                    xwq3 xwq3Var = (xwq3) C3844k.f7l8(this.f20666w);
                    this.f64935ab = xwq3Var;
                    py(xwq3Var, null);
                    this.wra = false;
                }
                this.f20662m.m11579i();
            }
        } while (this.f20655b.fu4(this.f20662m));
        this.xk5 = true;
    }

    private static boolean nn86(n7h n7hVar) {
        String str = n7hVar.f20688k;
        int i2 = lrht.f23230k;
        return (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(lrht.f67042zy) && "AFTS".equals(lrht.f23233q) && n7hVar.f64947f7l8));
    }

    /* JADX INFO: renamed from: o */
    private static boolean m12208o(String str) {
        return lrht.f23230k == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean qkj8(long j2) {
        int size = this.f20667x.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f20667x.get(i2).longValue() == j2) {
                this.f20667x.remove(i2);
                return true;
            }
        }
        return false;
    }

    @hyr(21)
    private static boolean qo(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void se() {
        this.zmmu = -1;
        this.sk1t = null;
    }

    private boolean sok(int i2) throws com.google.android.exoplayer2.ki {
        C3865v c3865vA9 = a9();
        this.f20660j.mo11567s();
        int iNcyb = ncyb(c3865vA9, this.f20660j, i2 | 4);
        if (iNcyb == -5) {
            zsr0(c3865vA9);
            return true;
        }
        if (iNcyb != -4 || !this.f20660j.n7h()) {
            return false;
        }
        this.zr5t = true;
        m4();
        return false;
    }

    @hyr(21)
    private static boolean tfm(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean uv6(String str) {
        if (lrht.f23230k < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(lrht.f67042zy)) {
            String str2 = lrht.f67040toq;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void vq(n7h n7hVar, MediaCrypto mediaCrypto) throws Exception {
        String str = n7hVar.f20688k;
        float fBo = lrht.f23230k < 23 ? -1.0f : bo(this.bl, this.f20666w, gvn7());
        float f2 = fBo > this.f20658e ? fBo : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strValueOf = String.valueOf(str);
        n5r1.m13686k(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        this.as = this.f20661l.mo12255k(dr(n7hVar, this.f20666w, mediaCrypto, f2));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.ad = n7hVar;
        this.ax = f2;
        this.bg = this.f20666w;
        this.am = m12204c(str);
        this.ay = lrht(str, this.bg);
        this.be = hb(str);
        this.aj = m12208o(str);
        this.bs = vyq(str);
        this.k0 = m12206e(str);
        this.ar = uv6(str);
        this.bc = m12207j(str, this.bg);
        this.tlhn = nn86(n7hVar) || t8iq();
        if (this.as.mo12267s()) {
            this.mjvl = true;
            this.hp = 1;
            this.bu = this.am != 0;
        }
        if ("c2.android.mp3.decoder".equals(n7hVar.f20688k)) {
            this.w97r = new C3469s();
        }
        if (getState() == 2) {
            this.tgs = SystemClock.elapsedRealtime() + 1000;
        }
        this.zm.f19558k++;
        was(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    private static boolean vyq(String str) {
        int i2 = lrht.f23230k;
        if (i2 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i2 <= 19) {
                String str2 = lrht.f67040toq;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private void y9n() throws com.google.android.exoplayer2.ki {
        if (!this.th6) {
            cfr();
        } else {
            this.cw14 = 1;
            this.xy8 = 3;
        }
    }

    private boolean yz() {
        if (this.th6) {
            this.cw14 = 1;
            if (this.be || this.bs) {
                this.xy8 = 3;
                return false;
            }
            this.xy8 = 1;
        }
        return true;
    }

    protected boolean b3e(n7h n7hVar) {
        return true;
    }

    protected boolean bek6(xwq3 xwq3Var) {
        return false;
    }

    protected float bo(float f2, xwq3 xwq3Var, xwq3[] xwq3VarArr) {
        return -1.0f;
    }

    protected final void bz2(com.google.android.exoplayer2.ki kiVar) {
        this.xhv = kiVar;
    }

    protected abstract List<n7h> c8jq(cdj cdjVar, xwq3 xwq3Var, boolean z2) throws o1t.zy;

    protected abstract int cv06(cdj cdjVar, xwq3 xwq3Var) throws o1t.zy;

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        this.zr5t = false;
        this.ei = false;
        this.zsl = false;
        if (this.k6e) {
            this.f20655b.mo11567s();
            this.f20662m.mo11567s();
            this.xk5 = false;
        } else {
            zp();
        }
        if (this.f20654a.x2() > 0) {
            this.wra = true;
        }
        this.f20654a.zy();
        int i2 = this.ls9;
        if (i2 != 0) {
            this.wh6 = this.f20665v[i2 - 1];
            this.ut = this.f64936bo[i2 - 1];
            this.ls9 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void dd() {
    }

    protected abstract x2.C3472k dr(n7h n7hVar, xwq3 xwq3Var, @dd MediaCrypto mediaCrypto, float f2);

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void eqxt(boolean z2, boolean z3) throws com.google.android.exoplayer2.ki {
        this.zm = new com.google.android.exoplayer2.decoder.f7l8();
    }

    /* JADX INFO: renamed from: f */
    protected com.google.android.exoplayer2.decoder.ld6 mo11399f(n7h n7hVar, xwq3 xwq3Var, xwq3 xwq3Var2) {
        return new com.google.android.exoplayer2.decoder.ld6(n7hVar.f20688k, xwq3Var, xwq3Var2, 0, 1);
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.cv06
    public final int fn3e() {
        return 8;
    }

    protected void g1(Exception exc) {
    }

    protected void gbni(String str) {
    }

    @InterfaceC7842s
    protected void i9jn(long j2) {
        while (true) {
            int i2 = this.ls9;
            if (i2 == 0 || j2 < this.f20657d[0]) {
                return;
            }
            long[] jArr = this.f64936bo;
            this.ut = jArr[0];
            this.wh6 = this.f20665v[0];
            int i3 = i2 - 1;
            this.ls9 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.f20665v;
            System.arraycopy(jArr2, 1, jArr2, 0, this.ls9);
            long[] jArr3 = this.f20657d;
            System.arraycopy(jArr3, 1, jArr3, 0, this.ls9);
            ltg8();
        }
    }

    protected void ikck(C3297s c3297s) throws com.google.android.exoplayer2.ki {
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return this.f20666w != null && (d3() || m12205d() || (this.tgs != C3548p.f65257toq && SystemClock.elapsedRealtime() < this.tgs));
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public final int mo11518k(xwq3 xwq3Var) throws com.google.android.exoplayer2.ki {
        try {
            return cv06(this.f20659f, xwq3Var);
        } catch (o1t.zy e2) {
            throw m12067t(e2, xwq3Var, 4002);
        }
    }

    @InterfaceC7842s
    protected void kcsr() {
        yqrt();
        this.xhv = null;
        this.w97r = null;
        this.bq = null;
        this.ad = null;
        this.bg = null;
        this.az = null;
        this.ba = false;
        this.ndjo = false;
        this.ax = -1.0f;
        this.am = 0;
        this.ay = false;
        this.be = false;
        this.aj = false;
        this.bs = false;
        this.k0 = false;
        this.ar = false;
        this.bc = false;
        this.tlhn = false;
        this.mjvl = false;
        this.hp = 0;
        this.an = false;
    }

    protected void ltg8() {
    }

    @dd
    protected final n7h lv5() {
        return this.ad;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void lvui() {
        try {
            ek5k();
            w831();
        } finally {
            jz5(null);
        }
    }

    /* JADX INFO: renamed from: m */
    protected qrj mo12209m(Throwable th, @dd n7h n7hVar) {
        return new qrj(th, n7hVar);
    }

    @dd
    protected final x2 nmn5() {
        return this.as;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.f20666w = null;
        this.ut = C3548p.f65257toq;
        this.wh6 = C3548p.f65257toq;
        this.ls9 = 0;
        m12212x();
    }

    protected void py(xwq3 xwq3Var, @dd MediaFormat mediaFormat) throws com.google.android.exoplayer2.ki {
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    /* JADX INFO: renamed from: r */
    protected void mo11400r() {
    }

    protected void r8s8(C3297s c3297s) throws com.google.android.exoplayer2.ki {
    }

    protected boolean t8iq() {
        return false;
    }

    @Override // com.google.android.exoplayer2.bek6
    public void t8r(float f2, float f3) throws com.google.android.exoplayer2.ki {
        this.in = f2;
        this.bl = f3;
        mbx(this.bg);
    }

    /* JADX INFO: renamed from: u */
    protected float m12210u() {
        return this.ax;
    }

    public void uj2j(long j2) {
        this.id = j2;
    }

    /* JADX INFO: renamed from: v */
    protected float m12211v() {
        return this.in;
    }

    protected abstract boolean v0af(long j2, long j3, @dd x2 x2Var, @dd ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, xwq3 xwq3Var) throws com.google.android.exoplayer2.ki;

    protected final boolean vep5() throws com.google.android.exoplayer2.ki {
        return mbx(this.bg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void w831() {
        try {
            x2 x2Var = this.as;
            if (x2Var != null) {
                x2Var.release();
                this.zm.f63554toq++;
                gbni(this.ad.f20688k);
            }
            this.as = null;
            try {
                MediaCrypto mediaCrypto = this.bv;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.as = null;
            try {
                MediaCrypto mediaCrypto2 = this.bv;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void was(String str, long j2, long j3) {
    }

    protected final void wo() throws com.google.android.exoplayer2.ki {
        xwq3 xwq3Var;
        if (this.as != null || this.k6e || (xwq3Var = this.f20666w) == null) {
            return;
        }
        if (this.bp == null && bek6(xwq3Var)) {
            mu(this.f20666w);
            return;
        }
        gc3c(this.bp);
        String str = this.f20666w.f23682r;
        com.google.android.exoplayer2.drm.qrj qrjVar = this.bb;
        if (qrjVar != null) {
            if (this.bv == null) {
                C3321t c3321tGyi = gyi(qrjVar);
                if (c3321tGyi != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(c3321tGyi.f19687k, c3321tGyi.f63627toq);
                        this.bv = mediaCrypto;
                        this.an = !c3321tGyi.f63628zy && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e2) {
                        throw m12067t(e2, this.f20666w, yqrt.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                } else if (this.bb.mo11610g() == null) {
                    return;
                }
            }
            if (C3321t.f19686q) {
                int state = this.bb.getState();
                if (state == 1) {
                    qrj.C3318k c3318k = (qrj.C3318k) C3844k.f7l8(this.bb.mo11610g());
                    throw m12067t(c3318k, this.f20666w, c3318k.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            d8wk(this.bv, this.an);
        } catch (C3461k e3) {
            throw m12067t(e3, this.f20666w, 4001);
        }
    }

    /* JADX INFO: renamed from: x */
    protected boolean m12212x() {
        if (this.as == null) {
            return false;
        }
        if (this.xy8 == 3 || this.be || ((this.aj && !this.ndjo) || (this.bs && this.q7k9))) {
            w831();
            return true;
        }
        m12202a();
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) throws com.google.android.exoplayer2.ki {
        if (this.wh6 == C3548p.f65257toq) {
            C3844k.m13633s(this.ut == C3548p.f65257toq);
            this.ut = j2;
            this.wh6 = j3;
            return;
        }
        int i2 = this.ls9;
        long[] jArr = this.f20665v;
        if (i2 == jArr.length) {
            long j4 = jArr[i2 - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j4);
            com.google.android.exoplayer2.util.ni7.qrj(afw, sb.toString());
        } else {
            this.ls9 = i2 + 1;
        }
        long[] jArr2 = this.f64936bo;
        int i3 = this.ls9;
        jArr2[i3 - 1] = j2;
        this.f20665v[i3 - 1] = j3;
        this.f20657d[i3 - 1] = this.d1cy;
    }

    protected final long xwq3() {
        return this.wh6;
    }

    @dd
    protected final MediaFormat y2() {
        return this.az;
    }

    protected final void yl(long j2) throws com.google.android.exoplayer2.ki {
        boolean z2;
        xwq3 xwq3VarM13696p = this.f20654a.m13696p(j2);
        if (xwq3VarM13696p == null && this.ba) {
            xwq3VarM13696p = this.f20654a.m13697s();
        }
        if (xwq3VarM13696p != null) {
            this.f64935ab = xwq3VarM13696p;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (this.ba && this.f64935ab != null)) {
            py(this.f64935ab, this.az);
            this.ba = false;
        }
    }

    @InterfaceC7842s
    protected void yqrt() {
        bwp();
        se();
        this.tgs = C3548p.f65257toq;
        this.q7k9 = false;
        this.th6 = false;
        this.bu = false;
        this.bd = false;
        this.dy = false;
        this.vb6 = false;
        this.f20667x.clear();
        this.d1cy = C3548p.f65257toq;
        this.xqx = C3548p.f65257toq;
        C3469s c3469s = this.w97r;
        if (c3469s != null) {
            c3469s.zy();
        }
        this.cw14 = 0;
        this.xy8 = 0;
        this.hp = this.mjvl ? 1 : 0;
    }

    protected void z4() throws com.google.android.exoplayer2.ki {
    }

    protected final void zkd() {
        this.zsl = true;
    }

    protected final boolean zp() throws com.google.android.exoplayer2.ki {
        boolean zM12212x = m12212x();
        if (zM12212x) {
            wo();
        }
        return zM12212x;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    @zy.dd
    @zy.InterfaceC7842s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.exoplayer2.decoder.ld6 zsr0(com.google.android.exoplayer2.C3865v r12) throws com.google.android.exoplayer2.ki {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.kja0.zsr0(com.google.android.exoplayer2.v):com.google.android.exoplayer2.decoder.ld6");
    }

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) throws com.google.android.exoplayer2.ki {
        boolean z2 = false;
        if (this.zsl) {
            this.zsl = false;
            m4();
        }
        com.google.android.exoplayer2.ki kiVar = this.xhv;
        if (kiVar != null) {
            this.xhv = null;
            throw kiVar;
        }
        try {
            if (this.ei) {
                z4();
                return;
            }
            if (this.f20666w != null || sok(2)) {
                wo();
                if (this.k6e) {
                    n5r1.m13686k("bypassRender");
                    while (hyr(j2, j3)) {
                    }
                    n5r1.zy();
                } else if (this.as != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    n5r1.m13686k("drainAndFeed");
                    while (bf2(j2, j3) && ktq(jElapsedRealtime)) {
                    }
                    while (a98o() && ktq(jElapsedRealtime)) {
                    }
                    n5r1.zy();
                } else {
                    this.zm.f19561q += m12066l(j2);
                    sok(1);
                }
                this.zm.zy();
            }
        } catch (IllegalStateException e2) {
            if (!fnq8(e2)) {
                throw e2;
            }
            g1(e2);
            if (lrht.f23230k >= 21 && tfm(e2)) {
                z2 = true;
            }
            if (z2) {
                w831();
            }
            throw mcp(mo12209m(e2, lv5()), this.f20666w, z2, 4003);
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return this.ei;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.kja0$k */
    /* JADX INFO: compiled from: MediaCodecRenderer.java */
    public static class C3461k extends Exception {

        /* JADX INFO: renamed from: k */
        private static final int f20668k = -50000;

        /* JADX INFO: renamed from: n */
        private static final int f20669n = -49998;

        /* JADX INFO: renamed from: q */
        private static final int f20670q = -49999;

        @dd
        public final n7h codecInfo;

        @dd
        public final String diagnosticInfo;

        @dd
        public final C3461k fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public C3461k(xwq3 xwq3Var, @dd Throwable th, boolean z2, int i2) {
            String strValueOf = String.valueOf(xwq3Var);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Decoder init failed: [");
            sb.append(i2);
            sb.append("], ");
            sb.append(strValueOf);
            this(sb.toString(), th, xwq3Var.f23682r, z2, null, m12213k(i2), null);
        }

        /* JADX INFO: renamed from: k */
        private static String m12213k(int i2) {
            String str = i2 < 0 ? "neg_" : "";
            int iAbs = Math.abs(i2);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(iAbs);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC7839p
        public C3461k toq(C3461k c3461k) {
            return new C3461k(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, c3461k);
        }

        @hyr(21)
        @dd
        private static String zy(@dd Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public C3461k(xwq3 xwq3Var, @dd Throwable th, boolean z2, n7h n7hVar) {
            String str = n7hVar.f20688k;
            String strValueOf = String.valueOf(xwq3Var);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(strValueOf);
            this(sb.toString(), th, xwq3Var.f23682r, z2, n7hVar, lrht.f23230k >= 21 ? zy(th) : null, null);
        }

        private C3461k(String str, @dd Throwable th, String str2, boolean z2, @dd n7h n7hVar, @dd String str3, @dd C3461k c3461k) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z2;
            this.codecInfo = n7hVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = c3461k;
        }
    }
}
