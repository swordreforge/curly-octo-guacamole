package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mediacodec.o1t;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.n5r1;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import com.google.android.exoplayer2.xwq3;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p014c.C5729c;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import z4j7.C7797k;
import zy.InterfaceC7842s;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.s */
/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3881s extends com.google.android.exoplayer2.mediacodec.kja0 {
    private static boolean aw3 = false;
    private static final float fy94 = 1.5f;
    private static final int[] nxe = {1920, 1600, 1440, 1280, C7797k.f100634zy, 854, C7797k.f100633toq, 540, 480};
    private static final long q7 = Long.MAX_VALUE;
    private static boolean ry = false;
    private static final String t7v = "crop-bottom";
    private static final String vv9 = "MediaCodecVideoRenderer";
    private static final String x63 = "crop-left";
    private static final String x6n7 = "crop-top";
    private static final String za = "crop-right";
    private boolean a1;
    private boolean a62w;
    private int ao6;
    private long b9;
    private int br;
    private int cm0;
    private int cr;

    @dd
    private DummySurface deb;
    private long faqz;
    private long ilvb;

    @dd
    private ld6 kl1;
    private int kybi;

    @dd
    toq lgf;
    private final n7h lr4;
    private long n1u4;
    private int nze;
    private int o9;

    @dd
    private wvg o917;
    private final Context p2c;
    private int ph90;

    @dd
    private Surface qnoq;
    private boolean rt0p;
    private long s3;
    private boolean smyf;
    private int svt;
    private boolean u6;
    private final InterfaceC3894z.k ule;
    private final long v3;
    private final boolean v62;
    private boolean vfa;
    private long vh6m;
    private k vl4;
    private float w0an;
    private boolean w7wd;
    private final int yf;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.s$k */
    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    protected static final class k {

        /* JADX INFO: renamed from: k */
        public final int f23468k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67200toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f67201zy;

        public k(int i2, int i3, int i4) {
            this.f23468k = i2;
            this.f67200toq = i3;
            this.f67201zy = i4;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.s$toq */
    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @hyr(23)
    private final class toq implements x2.zy, Handler.Callback {

        /* JADX INFO: renamed from: n */
        private static final int f23469n = 0;

        /* JADX INFO: renamed from: k */
        private final Handler f23470k;

        public toq(com.google.android.exoplayer2.mediacodec.x2 x2Var) {
            Handler handlerO1t = lrht.o1t(this);
            this.f23470k = handlerO1t;
            x2Var.zy(this, handlerO1t);
        }

        private void toq(long j2) {
            C3881s c3881s = C3881s.this;
            if (this != c3881s.lgf) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                c3881s.cnbm();
                return;
            }
            try {
                c3881s.m58i(j2);
            } catch (com.google.android.exoplayer2.ki e2) {
                C3881s.this.bz2(e2);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            toq(lrht.ebn(message.arg1, message.arg2));
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.x2.zy
        /* JADX INFO: renamed from: k */
        public void mo12279k(com.google.android.exoplayer2.mediacodec.x2 x2Var, long j2, long j3) {
            if (lrht.f23230k >= 30) {
                toq(j2);
            } else {
                this.f23470k.sendMessageAtFrontOfQueue(Message.obtain(this.f23470k, 0, (int) (j2 >> 32), (int) j2));
            }
        }
    }

    public C3881s(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar) {
        this(context, cdjVar, 0L);
    }

    private void a5id() {
        int i2 = this.nze;
        if (i2 != 0) {
            this.ule.m13874t(this.vh6m, i2);
            this.vh6m = 0L;
            this.nze = 0;
        }
    }

    @hyr(17)
    private void b9ub() {
        Surface surface = this.qnoq;
        DummySurface dummySurface = this.deb;
        if (surface == dummySurface) {
            this.qnoq = null;
        }
        dummySurface.release();
        this.deb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cnbm() {
        zkd();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m28266do() {
        this.o917 = null;
    }

    private void dxef() {
        if (this.br > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.ule.n7h(this.br, jElapsedRealtime - this.b9);
            this.br = 0;
            this.b9 = jElapsedRealtime;
        }
    }

    @hyr(21)
    private static void ebn(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    private void ew() {
        this.s3 = this.v3 > 0 ? SystemClock.elapsedRealtime() + this.v3 : C3548p.f65257toq;
    }

    private static boolean ga(long j2) {
        return j2 < -500000;
    }

    private void gcp() {
        if (this.u6) {
            this.ule.wvg(this.qnoq);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.video.n7h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.g, com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.video.s] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.exoplayer2.video.DummySurface] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void ix(@dd Object obj) throws com.google.android.exoplayer2.ki {
        ?? Zy = obj instanceof Surface ? (Surface) obj : 0;
        if (Zy == 0) {
            DummySurface dummySurface = this.deb;
            if (dummySurface != null) {
                Zy = dummySurface;
            } else {
                com.google.android.exoplayer2.mediacodec.n7h n7hVarLv5 = lv5();
                if (n7hVarLv5 != null && ps(n7hVarLv5)) {
                    Zy = DummySurface.zy(this.p2c, n7hVarLv5.f64947f7l8);
                    this.deb = Zy;
                }
            }
        }
        if (this.qnoq == Zy) {
            if (Zy == 0 || Zy == this.deb) {
                return;
            }
            oki();
            gcp();
            return;
        }
        this.qnoq = Zy;
        this.lr4.kja0(Zy);
        this.u6 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.x2 x2VarNmn5 = nmn5();
        if (x2VarNmn5 != null) {
            if (lrht.f23230k < 23 || Zy == 0 || this.w7wd) {
                w831();
                wo();
            } else {
                kx3(x2VarNmn5, Zy);
            }
        }
        if (Zy == 0 || Zy == this.deb) {
            m28266do();
            ixz();
            return;
        }
        oki();
        ixz();
        if (state == 2) {
            ew();
        }
    }

    private void ixz() {
        com.google.android.exoplayer2.mediacodec.x2 x2VarNmn5;
        this.rt0p = false;
        if (lrht.f23230k < 23 || !this.vfa || (x2VarNmn5 = nmn5()) == null) {
            return;
        }
        this.lgf = new toq(x2VarNmn5);
    }

    protected static int lh(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var) {
        if (xwq3Var.f23676l == -1) {
            return zwy(n7hVar, xwq3Var);
        }
        int size = xwq3Var.f23670f.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += xwq3Var.f23670f.get(i2).length;
        }
        return xwq3Var.f23676l + length;
    }

    private void lw() {
        int i2 = this.o9;
        if (i2 == -1 && this.cr == -1) {
            return;
        }
        wvg wvgVar = this.o917;
        if (wvgVar != null && wvgVar.f23577k == i2 && wvgVar.f23579q == this.cr && wvgVar.f23578n == this.kybi && wvgVar.f23576g == this.w0an) {
            return;
        }
        wvg wvgVar2 = new wvg(this.o9, this.cr, this.kybi, this.w0an);
        this.o917 = wvgVar2;
        this.ule.jk(wvgVar2);
    }

    private static Point n2t(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var) {
        int i2 = xwq3Var.f23679o;
        int i3 = xwq3Var.f23674j;
        boolean z2 = i2 > i3;
        int i4 = z2 ? i2 : i3;
        if (z2) {
            i2 = i3;
        }
        float f2 = i2 / i4;
        for (int i5 : nxe) {
            int i6 = (int) (i5 * f2);
            if (i5 <= i4 || i6 <= i2) {
                break;
            }
            if (lrht.f23230k >= 21) {
                int i7 = z2 ? i6 : i5;
                if (!z2) {
                    i5 = i6;
                }
                Point qVar = n7hVar.toq(i7, i5);
                if (n7hVar.ni7(qVar.x, qVar.y, xwq3Var.f23677m)) {
                    return qVar;
                }
            } else {
                try {
                    int iQrj = lrht.qrj(i5, 16) * 16;
                    int iQrj2 = lrht.qrj(i6, 16) * 16;
                    if (iQrj * iQrj2 <= com.google.android.exoplayer2.mediacodec.o1t.m12246r()) {
                        int i8 = z2 ? iQrj2 : iQrj;
                        if (!z2) {
                            iQrj = iQrj2;
                        }
                        return new Point(i8, iQrj);
                    }
                } catch (o1t.zy unused) {
                }
            }
        }
        return null;
    }

    private static List<com.google.android.exoplayer2.mediacodec.n7h> ngy(com.google.android.exoplayer2.mediacodec.cdj cdjVar, xwq3 xwq3Var, boolean z2, boolean z3) throws o1t.zy {
        Pair<Integer, Integer> pairCdj;
        String str = xwq3Var.f23682r;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.n7h> listFn3e = com.google.android.exoplayer2.mediacodec.o1t.fn3e(cdjVar.mo12189k(str, z2, z3), xwq3Var);
        if (com.google.android.exoplayer2.util.wvg.f67126ni7.equals(str) && (pairCdj = com.google.android.exoplayer2.mediacodec.o1t.cdj(xwq3Var)) != null) {
            int iIntValue = ((Integer) pairCdj.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listFn3e.addAll(cdjVar.mo12189k(com.google.android.exoplayer2.util.wvg.f67117ld6, z2, z3));
            } else if (iIntValue == 512) {
                listFn3e.addAll(cdjVar.mo12189k(com.google.android.exoplayer2.util.wvg.f23310p, z2, z3));
            }
        }
        return Collections.unmodifiableList(listFn3e);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static boolean nsb() {
        /*
            Method dump skipped, instruction units count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C3881s.nsb():boolean");
    }

    private void o05(long j2, long j3, xwq3 xwq3Var) {
        ld6 ld6Var = this.kl1;
        if (ld6Var != null) {
            ld6Var.mo12133k(j2, j3, xwq3Var, y2());
        }
    }

    private void oki() {
        wvg wvgVar = this.o917;
        if (wvgVar != null) {
            this.ule.jk(wvgVar);
        }
    }

    private static boolean pc() {
        return "NVIDIA".equals(lrht.f67042zy);
    }

    private boolean ps(com.google.android.exoplayer2.mediacodec.n7h n7hVar) {
        return lrht.f23230k >= 23 && !this.vfa && !ukdy(n7hVar.f20688k) && (!n7hVar.f64947f7l8 || DummySurface.toq(this.p2c));
    }

    @hyr(29)
    private static void r25n(com.google.android.exoplayer2.mediacodec.x2 x2Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        x2Var.mo12265p(bundle);
    }

    private static boolean wlev(long j2) {
        return j2 < -30000;
    }

    private static int zwy(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var) {
        int i2;
        int iQrj;
        int iIntValue;
        int i3 = xwq3Var.f23674j;
        int i4 = xwq3Var.f23679o;
        if (i3 == -1 || i4 == -1) {
            return -1;
        }
        String str = xwq3Var.f23682r;
        if (com.google.android.exoplayer2.util.wvg.f67126ni7.equals(str)) {
            Pair<Integer, Integer> pairCdj = com.google.android.exoplayer2.mediacodec.o1t.cdj(xwq3Var);
            str = (pairCdj == null || !((iIntValue = ((Integer) pairCdj.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? com.google.android.exoplayer2.util.wvg.f67117ld6 : com.google.android.exoplayer2.util.wvg.f23310p;
        }
        str.hashCode();
        i2 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iQrj = i3 * i4;
                i2 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iQrj = i3 * i4;
                break;
            case "video/avc":
                String str2 = lrht.f23233q;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(lrht.f67042zy) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !n7hVar.f64947f7l8)))) {
                    iQrj = lrht.qrj(i3, 16) * lrht.qrj(i4, 16) * 16 * 16;
                    i2 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected boolean b3e(com.google.android.exoplayer2.mediacodec.n7h n7hVar) {
        return this.qnoq != null || ps(n7hVar);
    }

    protected void b8(com.google.android.exoplayer2.mediacodec.x2 x2Var, int i2, long j2) {
        lw();
        n5r1.m13686k("releaseOutputBuffer");
        x2Var.kja0(i2, true);
        n5r1.zy();
        this.ilvb = SystemClock.elapsedRealtime() * 1000;
        this.zm.f19559n++;
        this.ph90 = 0;
        vy();
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat bap7(xwq3 xwq3Var, String str, k kVar, float f2, boolean z2, int i2) {
        Pair<Integer, Integer> pairCdj;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", xwq3Var.f23674j);
        mediaFormat.setInteger(InterfaceC1925p.byf, xwq3Var.f23679o);
        com.google.android.exoplayer2.util.o1t.m13708p(mediaFormat, xwq3Var.f23670f);
        com.google.android.exoplayer2.util.o1t.m13709q(mediaFormat, "frame-rate", xwq3Var.f23677m);
        com.google.android.exoplayer2.util.o1t.m13707n(mediaFormat, "rotation-degrees", xwq3Var.f23666b);
        com.google.android.exoplayer2.util.o1t.zy(mediaFormat, xwq3Var.f67274bo);
        if (com.google.android.exoplayer2.util.wvg.f67126ni7.equals(xwq3Var.f23682r) && (pairCdj = com.google.android.exoplayer2.mediacodec.o1t.cdj(xwq3Var)) != null) {
            com.google.android.exoplayer2.util.o1t.m13707n(mediaFormat, "profile", ((Integer) pairCdj.first).intValue());
        }
        mediaFormat.setInteger("max-width", kVar.f23468k);
        mediaFormat.setInteger("max-height", kVar.f67200toq);
        com.google.android.exoplayer2.util.o1t.m13707n(mediaFormat, "max-input-size", kVar.f67201zy);
        if (lrht.f23230k >= 23) {
            mediaFormat.setInteger(C5729c.a.f32003g, 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            ebn(mediaFormat, i2);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected float bo(float f2, xwq3 xwq3Var, xwq3[] xwq3VarArr) {
        float fMax = -1.0f;
        for (xwq3 xwq3Var2 : xwq3VarArr) {
            float f3 = xwq3Var2.f23677m;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected List<com.google.android.exoplayer2.mediacodec.n7h> c8jq(com.google.android.exoplayer2.mediacodec.cdj cdjVar, xwq3 xwq3Var, boolean z2) throws o1t.zy {
        return ngy(cdjVar, xwq3Var, z2, this.vfa);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected int cv06(com.google.android.exoplayer2.mediacodec.cdj cdjVar, xwq3 xwq3Var) throws o1t.zy {
        int i2 = 0;
        if (!com.google.android.exoplayer2.util.wvg.m13745i(xwq3Var.f23682r)) {
            return cv06.m11557p(0);
        }
        boolean z2 = xwq3Var.f23667c != null;
        List<com.google.android.exoplayer2.mediacodec.n7h> listNgy = ngy(cdjVar, xwq3Var, z2, false);
        if (z2 && listNgy.isEmpty()) {
            listNgy = ngy(cdjVar, xwq3Var, false, false);
        }
        if (listNgy.isEmpty()) {
            return cv06.m11557p(1);
        }
        if (!com.google.android.exoplayer2.mediacodec.kja0.h7am(xwq3Var)) {
            return cv06.m11557p(2);
        }
        com.google.android.exoplayer2.mediacodec.n7h n7hVar = listNgy.get(0);
        boolean zKja0 = n7hVar.kja0(xwq3Var);
        int i3 = n7hVar.cdj(xwq3Var) ? 16 : 8;
        if (zKja0) {
            List<com.google.android.exoplayer2.mediacodec.n7h> listNgy2 = ngy(cdjVar, xwq3Var, z2, true);
            if (!listNgy2.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.n7h n7hVar2 = listNgy2.get(0);
                if (n7hVar2.kja0(xwq3Var) && n7hVar2.cdj(xwq3Var)) {
                    i2 = 32;
                }
            }
        }
        return cv06.cdj(zKja0 ? 4 : 3, i3, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        super.d2ok(j2, z2);
        ixz();
        this.lr4.x2();
        this.faqz = C3548p.f65257toq;
        this.n1u4 = C3548p.f65257toq;
        this.ph90 = 0;
        if (z2) {
            ew();
        } else {
            this.s3 = C3548p.f65257toq;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void dd() {
        this.s3 = C3548p.f65257toq;
        dxef();
        a5id();
        this.lr4.n7h();
        super.dd();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @TargetApi(17)
    protected x2.C3472k dr(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, @dd MediaCrypto mediaCrypto, float f2) {
        DummySurface dummySurface = this.deb;
        if (dummySurface != null && dummySurface.f23366k != n7hVar.f64947f7l8) {
            b9ub();
        }
        String str = n7hVar.f64950zy;
        k kVarPjz9 = pjz9(n7hVar, xwq3Var, gvn7());
        this.vl4 = kVarPjz9;
        MediaFormat mediaFormatBap7 = bap7(xwq3Var, str, kVarPjz9, f2, this.v62, this.vfa ? this.cm0 : 0);
        if (this.qnoq == null) {
            if (!ps(n7hVar)) {
                throw new IllegalStateException();
            }
            if (this.deb == null) {
                this.deb = DummySurface.zy(this.p2c, n7hVar.f64947f7l8);
            }
            this.qnoq = this.deb;
        }
        return x2.C3472k.zy(n7hVar, mediaFormatBap7, xwq3Var, this.qnoq, mediaCrypto);
    }

    protected boolean e5(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        int iM12066l = m12066l(j2);
        if (iM12066l == 0) {
            return false;
        }
        com.google.android.exoplayer2.decoder.f7l8 f7l8Var = this.zm;
        f7l8Var.f19562s++;
        int i2 = this.ao6 + iM12066l;
        if (z2) {
            f7l8Var.f19557g += i2;
        } else {
            ra(i2);
        }
        zp();
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void eqxt(boolean z2, boolean z3) throws com.google.android.exoplayer2.ki {
        super.eqxt(z2, z3);
        boolean z5 = jk().f20547k;
        C3844k.m13633s((z5 && this.cm0 == 0) ? false : true);
        if (this.vfa != z5) {
            this.vfa = z5;
            w831();
        }
        this.ule.kja0(this.zm);
        this.lr4.m13807y();
        this.a62w = z3;
        this.a1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    /* JADX INFO: renamed from: f */
    protected com.google.android.exoplayer2.decoder.ld6 mo11399f(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, xwq3 xwq3Var2) {
        com.google.android.exoplayer2.decoder.ld6 ld6VarM12236n = n7hVar.m12236n(xwq3Var, xwq3Var2);
        int i2 = ld6VarM12236n.f19587n;
        int i3 = xwq3Var2.f23674j;
        k kVar = this.vl4;
        if (i3 > kVar.f23468k || xwq3Var2.f23679o > kVar.f67200toq) {
            i2 |= 256;
        }
        if (lh(n7hVar, xwq3Var2) > this.vl4.f67201zy) {
            i2 |= 64;
        }
        int i4 = i2;
        return new com.google.android.exoplayer2.decoder.ld6(n7hVar.f20688k, xwq3Var, xwq3Var2, i4 != 0 ? 0 : ld6VarM12236n.f19588q, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void g1(Exception exc) {
        com.google.android.exoplayer2.util.ni7.m13700n(vv9, "Video codec error", exc);
        this.ule.mcp(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void gbni(String str) {
        this.ule.x2(str);
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    public String getName() {
        return vv9;
    }

    protected Surface h4b() {
        return this.qnoq;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @InterfaceC7842s
    protected void i9jn(long j2) {
        super.i9jn(j2);
        if (this.vfa) {
            return;
        }
        this.ao6--;
    }

    protected void ij(com.google.android.exoplayer2.mediacodec.x2 x2Var, int i2, long j2) {
        n5r1.m13686k("dropVideoBuffer");
        x2Var.kja0(i2, false);
        n5r1.zy();
        ra(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @TargetApi(29)
    protected void ikck(C3297s c3297s) throws com.google.android.exoplayer2.ki {
        if (this.smyf) {
            ByteBuffer byteBuffer = (ByteBuffer) C3844k.f7l8(c3297s.f19616p);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    r25n(nmn5(), bArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.bek6
    public boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.rt0p || (((dummySurface = this.deb) != null && this.qnoq == dummySurface) || nmn5() == null || this.vfa))) {
            this.s3 = C3548p.f65257toq;
            return true;
        }
        if (this.s3 == C3548p.f65257toq) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.s3) {
            return true;
        }
        this.s3 = C3548p.f65257toq;
        return false;
    }

    @hyr(23)
    protected void kx3(com.google.android.exoplayer2.mediacodec.x2 x2Var, Surface surface) {
        x2Var.mo12264n(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void ltg8() {
        super.ltg8();
        ixz();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    @TargetApi(17)
    protected void lvui() {
        try {
            super.lvui();
        } finally {
            if (this.deb != null) {
                b9ub();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    /* JADX INFO: renamed from: m */
    protected com.google.android.exoplayer2.mediacodec.qrj mo12209m(Throwable th, @dd com.google.android.exoplayer2.mediacodec.n7h n7hVar) {
        return new C3893y(th, n7hVar, this.qnoq);
    }

    protected boolean m2t(long j2, long j3, boolean z2) {
        return wlev(j2) && !z2;
    }

    protected void m58i(long j2) throws com.google.android.exoplayer2.ki {
        yl(j2);
        lw();
        this.zm.f19559n++;
        vy();
        i9jn(j2);
    }

    @hyr(21)
    protected void nme(com.google.android.exoplayer2.mediacodec.x2 x2Var, int i2, long j2, long j3) {
        lw();
        n5r1.m13686k("releaseOutputBuffer");
        x2Var.x2(i2, j3);
        n5r1.zy();
        this.ilvb = SystemClock.elapsedRealtime() * 1000;
        this.zm.f19559n++;
        this.ph90 = 0;
        vy();
    }

    protected void nnh(long j2) {
        this.zm.m11562k(j2);
        this.vh6m += j2;
        this.nze++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        m28266do();
        ixz();
        this.u6 = false;
        this.lr4.f7l8();
        this.lgf = null;
        try {
            super.oc();
        } finally {
            this.ule.qrj(this.zm);
        }
    }

    protected k pjz9(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, xwq3[] xwq3VarArr) {
        int iZwy;
        int iMax = xwq3Var.f23674j;
        int iMax2 = xwq3Var.f23679o;
        int iLh = lh(n7hVar, xwq3Var);
        if (xwq3VarArr.length == 1) {
            if (iLh != -1 && (iZwy = zwy(n7hVar, xwq3Var)) != -1) {
                iLh = Math.min((int) (iLh * 1.5f), iZwy);
            }
            return new k(iMax, iMax2, iLh);
        }
        int length = xwq3VarArr.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            xwq3 xwq3VarA9 = xwq3VarArr[i2];
            if (xwq3Var.f67274bo != null && xwq3VarA9.f67274bo == null) {
                xwq3VarA9 = xwq3VarA9.toq().oc(xwq3Var.f67274bo).a9();
            }
            if (n7hVar.m12236n(xwq3Var, xwq3VarA9).f19588q != 0) {
                int i3 = xwq3VarA9.f23674j;
                z2 |= i3 == -1 || xwq3VarA9.f23679o == -1;
                iMax = Math.max(iMax, i3);
                iMax2 = Math.max(iMax2, xwq3VarA9.f23679o);
                iLh = Math.max(iLh, lh(n7hVar, xwq3VarA9));
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(iMax);
            sb.append(AnimatedProperty.PROPERTY_NAME_X);
            sb.append(iMax2);
            com.google.android.exoplayer2.util.ni7.qrj(vv9, sb.toString());
            Point pointN2t = n2t(n7hVar, xwq3Var);
            if (pointN2t != null) {
                iMax = Math.max(iMax, pointN2t.x);
                iMax2 = Math.max(iMax2, pointN2t.y);
                iLh = Math.max(iLh, zwy(n7hVar, xwq3Var.toq().bf2(iMax).ncyb(iMax2).a9()));
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(iMax);
                sb2.append(AnimatedProperty.PROPERTY_NAME_X);
                sb2.append(iMax2);
                com.google.android.exoplayer2.util.ni7.qrj(vv9, sb2.toString());
            }
        }
        return new k(iMax, iMax2, iLh);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void py(xwq3 xwq3Var, @dd MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.x2 x2VarNmn5 = nmn5();
        if (x2VarNmn5 != null) {
            x2VarNmn5.mo12261g(this.svt);
        }
        if (this.vfa) {
            this.o9 = xwq3Var.f23674j;
            this.cr = xwq3Var.f23679o;
        } else {
            C3844k.f7l8(mediaFormat);
            boolean z2 = mediaFormat.containsKey(za) && mediaFormat.containsKey(x63) && mediaFormat.containsKey(t7v) && mediaFormat.containsKey(x6n7);
            this.o9 = z2 ? (mediaFormat.getInteger(za) - mediaFormat.getInteger(x63)) + 1 : mediaFormat.getInteger("width");
            this.cr = z2 ? (mediaFormat.getInteger(t7v) - mediaFormat.getInteger(x6n7)) + 1 : mediaFormat.getInteger(InterfaceC1925p.byf);
        }
        float f2 = xwq3Var.f23665a;
        this.w0an = f2;
        if (lrht.f23230k >= 21) {
            int i2 = xwq3Var.f23666b;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.o9;
                this.o9 = this.cr;
                this.cr = i3;
                this.w0an = 1.0f / f2;
            }
        } else {
            this.kybi = xwq3Var.f23666b;
        }
        this.lr4.m13806s(xwq3Var.f23677m);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    /* JADX INFO: renamed from: r */
    protected void mo11400r() {
        super.mo11400r();
        this.br = 0;
        this.b9 = SystemClock.elapsedRealtime();
        this.ilvb = SystemClock.elapsedRealtime() * 1000;
        this.vh6m = 0L;
        this.nze = 0;
        this.lr4.qrj();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @InterfaceC7842s
    protected void r8s8(C3297s c3297s) throws com.google.android.exoplayer2.ki {
        boolean z2 = this.vfa;
        if (!z2) {
            this.ao6++;
        }
        if (lrht.f23230k >= 23 || !z2) {
            return;
        }
        m58i(c3297s.f19618s);
    }

    protected void ra(int i2) {
        com.google.android.exoplayer2.decoder.f7l8 f7l8Var = this.zm;
        f7l8Var.f63552f7l8 += i2;
        this.br += i2;
        int i3 = this.ph90 + i2;
        this.ph90 = i3;
        f7l8Var.f19563y = Math.max(i3, f7l8Var.f19563y);
        int i4 = this.yf;
        if (i4 <= 0 || this.br < i4) {
            return;
        }
        dxef();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected boolean t8iq() {
        return this.vfa && lrht.f23230k < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.bek6
    public void t8r(float f2, float f3) throws com.google.android.exoplayer2.ki {
        super.t8r(f2, f3);
        this.lr4.ld6(f2);
    }

    protected boolean u38j(long j2, long j3) {
        return wlev(j2) && j3 > 100000;
    }

    protected boolean ukdy(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C3881s.class) {
            if (!aw3) {
                ry = nsb();
                aw3 = true;
            }
        }
        return ry;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected boolean v0af(long j2, long j3, @dd com.google.android.exoplayer2.mediacodec.x2 x2Var, @dd ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, xwq3 xwq3Var) throws com.google.android.exoplayer2.ki {
        boolean z5;
        long j5;
        C3844k.f7l8(x2Var);
        if (this.n1u4 == C3548p.f65257toq) {
            this.n1u4 = j2;
        }
        if (j4 != this.faqz) {
            this.lr4.m13805p(j4);
            this.faqz = j4;
        }
        long jXwq3 = xwq3();
        long j6 = j4 - jXwq3;
        if (z2 && !z3) {
            v5yj(x2Var, i2, j6);
            return true;
        }
        double dM12211v = m12211v();
        boolean z6 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j7 = (long) ((j4 - j2) / dM12211v);
        if (z6) {
            j7 -= jElapsedRealtime - j3;
        }
        if (this.qnoq == this.deb) {
            if (!wlev(j7)) {
                return false;
            }
            v5yj(x2Var, i2, j6);
            nnh(j7);
            return true;
        }
        long j8 = jElapsedRealtime - this.ilvb;
        if (this.a1 ? this.rt0p : !(z6 || this.a62w)) {
            j5 = j8;
            z5 = false;
        } else {
            z5 = true;
            j5 = j8;
        }
        if (this.s3 == C3548p.f65257toq && j2 >= jXwq3 && (z5 || (z6 && u38j(j7, j5)))) {
            long jNanoTime = System.nanoTime();
            o05(j6, jNanoTime, xwq3Var);
            if (lrht.f23230k >= 21) {
                nme(x2Var, i2, j6, jNanoTime);
            } else {
                b8(x2Var, i2, j6);
            }
            nnh(j7);
            return true;
        }
        if (z6 && j2 != this.n1u4) {
            long jNanoTime2 = System.nanoTime();
            long qVar = this.lr4.toq((j7 * 1000) + jNanoTime2);
            long j9 = (qVar - jNanoTime2) / 1000;
            boolean z7 = this.s3 != C3548p.f65257toq;
            if (m13829w(j9, j3, z3) && e5(j2, z7)) {
                return false;
            }
            if (m2t(j9, j3, z3)) {
                if (z7) {
                    v5yj(x2Var, i2, j6);
                } else {
                    ij(x2Var, i2, j6);
                }
                nnh(j9);
                return true;
            }
            if (lrht.f23230k >= 21) {
                if (j9 < 50000) {
                    o05(j6, qVar, xwq3Var);
                    nme(x2Var, i2, j6, qVar);
                    nnh(j9);
                    return true;
                }
            } else if (j9 < 30000) {
                if (j9 > 11000) {
                    try {
                        Thread.sleep((j9 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                o05(j6, qVar, xwq3Var);
                b8(x2Var, i2, j6);
                nnh(j9);
                return true;
            }
        }
        return false;
    }

    protected void v5yj(com.google.android.exoplayer2.mediacodec.x2 x2Var, int i2, long j2) {
        n5r1.m13686k("skipVideoBuffer");
        x2Var.kja0(i2, false);
        n5r1.zy();
        this.zm.f19557g++;
    }

    void vy() {
        this.a1 = true;
        if (this.rt0p) {
            return;
        }
        this.rt0p = true;
        this.ule.wvg(this.qnoq);
        this.u6 = true;
    }

    /* JADX INFO: renamed from: w */
    protected boolean m13829w(long j2, long j3, boolean z2) {
        return ga(j2) && !z2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void was(String str, long j2, long j3) {
        this.ule.ld6(str, j2, j3);
        this.w7wd = ukdy(str);
        this.smyf = ((com.google.android.exoplayer2.mediacodec.n7h) C3844k.f7l8(lv5())).m12235h();
        if (lrht.f23230k < 23 || !this.vfa) {
            return;
        }
        this.lgf = new toq((com.google.android.exoplayer2.mediacodec.x2) C3844k.f7l8(nmn5()));
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @dd Object obj) throws com.google.android.exoplayer2.ki {
        if (i2 == 1) {
            ix(obj);
            return;
        }
        if (i2 == 7) {
            this.kl1 = (ld6) obj;
            return;
        }
        if (i2 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.cm0 != iIntValue) {
                this.cm0 = iIntValue;
                if (this.vfa) {
                    w831();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                super.x2(i2, obj);
                return;
            } else {
                this.lr4.cdj(((Integer) obj).intValue());
                return;
            }
        }
        this.svt = ((Integer) obj).intValue();
        com.google.android.exoplayer2.mediacodec.x2 x2VarNmn5 = nmn5();
        if (x2VarNmn5 != null) {
            x2VarNmn5.mo12261g(this.svt);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @InterfaceC7842s
    protected void yqrt() {
        super.yqrt();
        this.ao6 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @dd
    protected com.google.android.exoplayer2.decoder.ld6 zsr0(C3865v c3865v) throws com.google.android.exoplayer2.ki {
        com.google.android.exoplayer2.decoder.ld6 ld6VarZsr0 = super.zsr0(c3865v);
        this.ule.m13873h(c3865v.f67166toq, ld6VarZsr0);
        return ld6VarZsr0;
    }

    public C3881s(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, long j2) {
        this(context, cdjVar, j2, null, null, 0);
    }

    public C3881s(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, long j2, @dd Handler handler, @dd InterfaceC3894z interfaceC3894z, int i2) {
        this(context, x2.toq.f20727k, cdjVar, j2, false, handler, interfaceC3894z, i2, 30.0f);
    }

    public C3881s(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, long j2, boolean z2, @dd Handler handler, @dd InterfaceC3894z interfaceC3894z, int i2) {
        this(context, x2.toq.f20727k, cdjVar, j2, z2, handler, interfaceC3894z, i2, 30.0f);
    }

    public C3881s(Context context, x2.toq toqVar, com.google.android.exoplayer2.mediacodec.cdj cdjVar, long j2, boolean z2, @dd Handler handler, @dd InterfaceC3894z interfaceC3894z, int i2) {
        this(context, toqVar, cdjVar, j2, z2, handler, interfaceC3894z, i2, 30.0f);
    }

    public C3881s(Context context, x2.toq toqVar, com.google.android.exoplayer2.mediacodec.cdj cdjVar, long j2, boolean z2, @dd Handler handler, @dd InterfaceC3894z interfaceC3894z, int i2, float f2) {
        super(2, toqVar, cdjVar, z2, f2);
        this.v3 = j2;
        this.yf = i2;
        Context applicationContext = context.getApplicationContext();
        this.p2c = applicationContext;
        this.lr4 = new n7h(applicationContext);
        this.ule = new InterfaceC3894z.k(handler, interfaceC3894z);
        this.v62 = pc();
        this.s3 = C3548p.f65257toq;
        this.o9 = -1;
        this.cr = -1;
        this.w0an = -1.0f;
        this.svt = 1;
        this.cm0 = 0;
        m28266do();
    }
}
