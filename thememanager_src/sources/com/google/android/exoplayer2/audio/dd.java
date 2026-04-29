package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.audio.fn3e;
import com.google.android.exoplayer2.audio.zurt;
import com.google.android.exoplayer2.bek6;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.mediacodec.o1t;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3863z;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import com.xiaomi.onetrack.p014c.C5729c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public class dd extends com.google.android.exoplayer2.mediacodec.kja0 implements InterfaceC3863z {
    private static final String rt0p = "v-bits-per-sample";
    private static final String svt = "MediaCodecAudioRenderer";
    private boolean deb;
    private final fn3e.C3246k lr4;
    private final Context p2c;
    private boolean qnoq;
    private boolean smyf;

    @zy.dd
    private bek6.zy u6;
    private final zurt ule;
    private int v3;

    @zy.dd
    private xwq3 v62;
    private long vl4;
    private boolean w7wd;
    private boolean yf;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    private final class toq implements zurt.zy {
        private toq() {
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        public void f7l8() {
            if (dd.this.u6 != null) {
                dd.this.u6.mo11555k();
            }
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: g */
        public void mo11401g() {
            dd.this.nsb();
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: k */
        public void mo11402k(boolean z2) {
            dd.this.lr4.mcp(z2);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: n */
        public void mo11403n(int i2, long j2, long j3) {
            dd.this.lr4.jk(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        /* JADX INFO: renamed from: q */
        public void mo11404q(long j2) {
            if (dd.this.u6 != null) {
                dd.this.u6.toq(j2);
            }
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        public void toq(Exception exc) {
            com.google.android.exoplayer2.util.ni7.m13700n(dd.svt, "Audio sink error", exc);
            dd.this.lr4.x2(exc);
        }

        @Override // com.google.android.exoplayer2.audio.zurt.zy
        public void zy(long j2) {
            dd.this.lr4.m11423t(j2);
        }
    }

    public dd(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar) {
        this(context, cdjVar, null, null);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static boolean m28263do() {
        if (com.google.android.exoplayer2.util.lrht.f23230k == 23) {
            String str = com.google.android.exoplayer2.util.lrht.f23233q;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int ebn(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(n7hVar.f20688k) || (i2 = com.google.android.exoplayer2.util.lrht.f23230k) >= 24 || (i2 == 23 && com.google.android.exoplayer2.util.lrht.g1(this.p2c))) {
            return xwq3Var.f23676l;
        }
        return -1;
    }

    private static boolean ixz(String str) {
        if (com.google.android.exoplayer2.util.lrht.f23230k < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(com.google.android.exoplayer2.util.lrht.f67042zy)) {
            String str2 = com.google.android.exoplayer2.util.lrht.f67040toq;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private void zwy() {
        long jKi = this.ule.ki(zy());
        if (jKi != Long.MIN_VALUE) {
            if (!this.smyf) {
                jKi = Math.max(this.vl4, jKi);
            }
            this.vl4 = jKi;
            this.smyf = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected boolean bek6(xwq3 xwq3Var) {
        return this.ule.mo11458k(xwq3Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected float bo(float f2, xwq3 xwq3Var, xwq3[] xwq3VarArr) {
        int iMax = -1;
        for (xwq3 xwq3Var2 : xwq3VarArr) {
            int i2 = xwq3Var2.f23668d;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f2 * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected List<com.google.android.exoplayer2.mediacodec.n7h> c8jq(com.google.android.exoplayer2.mediacodec.cdj cdjVar, xwq3 xwq3Var, boolean z2) throws o1t.zy {
        com.google.android.exoplayer2.mediacodec.n7h n7hVarZurt;
        String str = xwq3Var.f23682r;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.ule.mo11458k(xwq3Var) && (n7hVarZurt = com.google.android.exoplayer2.mediacodec.o1t.zurt()) != null) {
            return Collections.singletonList(n7hVarZurt);
        }
        List<com.google.android.exoplayer2.mediacodec.n7h> listFn3e = com.google.android.exoplayer2.mediacodec.o1t.fn3e(cdjVar.mo12189k(str, z2, false), xwq3Var);
        if (com.google.android.exoplayer2.util.wvg.f23312r.equals(str)) {
            ArrayList arrayList = new ArrayList(listFn3e);
            arrayList.addAll(cdjVar.mo12189k(com.google.android.exoplayer2.util.wvg.f67120lvui, z2, false));
            listFn3e = arrayList;
        }
        return Collections.unmodifiableList(listFn3e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected int cv06(com.google.android.exoplayer2.mediacodec.cdj cdjVar, xwq3 xwq3Var) throws o1t.zy {
        if (!com.google.android.exoplayer2.util.wvg.m13744h(xwq3Var.f23682r)) {
            return cv06.m11557p(0);
        }
        int i2 = com.google.android.exoplayer2.util.lrht.f23230k >= 21 ? 32 : 0;
        boolean z2 = xwq3Var.bv != 0;
        boolean zH7am = com.google.android.exoplayer2.mediacodec.kja0.h7am(xwq3Var);
        int i3 = 8;
        if (zH7am && this.ule.mo11458k(xwq3Var) && (!z2 || com.google.android.exoplayer2.mediacodec.o1t.zurt() != null)) {
            return cv06.cdj(4, 8, i2);
        }
        if (com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r) && !this.ule.mo11458k(xwq3Var)) {
            return cv06.m11557p(1);
        }
        if (!this.ule.mo11458k(com.google.android.exoplayer2.util.lrht.zp(2, xwq3Var.f23686v, xwq3Var.f23668d))) {
            return cv06.m11557p(1);
        }
        List<com.google.android.exoplayer2.mediacodec.n7h> listC8jq = c8jq(cdjVar, xwq3Var, false);
        if (listC8jq.isEmpty()) {
            return cv06.m11557p(1);
        }
        if (!zH7am) {
            return cv06.m11557p(2);
        }
        com.google.android.exoplayer2.mediacodec.n7h n7hVar = listC8jq.get(0);
        boolean zKja0 = n7hVar.kja0(xwq3Var);
        if (zKja0 && n7hVar.cdj(xwq3Var)) {
            i3 = 16;
        }
        return cv06.cdj(zKja0 ? 4 : 3, i3, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) throws com.google.android.exoplayer2.ki {
        super.d2ok(j2, z2);
        if (this.deb) {
            this.ule.mo11456h();
        } else {
            this.ule.flush();
        }
        this.vl4 = j2;
        this.w7wd = true;
        this.smyf = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void dd() {
        zwy();
        this.ule.pause();
        super.dd();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected x2.C3472k dr(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, @zy.dd MediaCrypto mediaCrypto, float f2) {
        this.v3 = pc(n7hVar, xwq3Var, gvn7());
        this.yf = ixz(n7hVar.f20688k);
        MediaFormat mediaFormatIj = ij(xwq3Var, n7hVar.f64950zy, this.v3, f2);
        this.v62 = com.google.android.exoplayer2.util.wvg.f67095d3.equals(n7hVar.f64949toq) && !com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r) ? xwq3Var : null;
        return x2.C3472k.m12277k(n7hVar, mediaFormatIj, xwq3Var, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void eqxt(boolean z2, boolean z3) throws com.google.android.exoplayer2.ki {
        super.eqxt(z2, z3);
        this.lr4.m11422h(this.zm);
        if (jk().f20547k) {
            this.ule.mo11457i();
        } else {
            this.ule.mo11455g();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    /* JADX INFO: renamed from: f */
    protected com.google.android.exoplayer2.decoder.ld6 mo11399f(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, xwq3 xwq3Var2) {
        com.google.android.exoplayer2.decoder.ld6 ld6VarM12236n = n7hVar.m12236n(xwq3Var, xwq3Var2);
        int i2 = ld6VarM12236n.f19587n;
        if (ebn(n7hVar, xwq3Var2) > this.v3) {
            i2 |= 64;
        }
        int i3 = i2;
        return new com.google.android.exoplayer2.decoder.ld6(n7hVar.f20688k, xwq3Var, xwq3Var2, i3 != 0 ? 0 : ld6VarM12236n.f19588q, i3);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public se f7l8() {
        return this.ule.f7l8();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void g1(Exception exc) {
        com.google.android.exoplayer2.util.ni7.m13700n(svt, "Audio codec error", exc);
        this.lr4.ld6(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void gbni(String str) {
        this.lr4.n7h(str);
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    public String getName() {
        return svt;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat ij(xwq3 xwq3Var, String str, int i2, float f2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", xwq3Var.f23686v);
        mediaFormat.setInteger("sample-rate", xwq3Var.f23668d);
        com.google.android.exoplayer2.util.o1t.m13708p(mediaFormat, xwq3Var.f23670f);
        com.google.android.exoplayer2.util.o1t.m13707n(mediaFormat, "max-input-size", i2);
        int i3 = com.google.android.exoplayer2.util.lrht.f23230k;
        if (i3 >= 23) {
            mediaFormat.setInteger(C5729c.a.f32003g, 0);
            if (f2 != -1.0f && !m28263do()) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (i3 <= 28 && com.google.android.exoplayer2.util.wvg.f67097dd.equals(xwq3Var.f23682r)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i3 >= 24 && this.ule.kja0(com.google.android.exoplayer2.util.lrht.zp(4, xwq3Var.f23686v, xwq3Var.f23668d)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return this.ule.mo11459n() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public long ki() {
        if (getState() == 2) {
            zwy();
        }
        return this.vl4;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public void ld6(se seVar) {
        this.ule.ld6(seVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void ltg8() {
        super.ltg8();
        this.ule.t8r();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void lvui() {
        try {
            super.lvui();
        } finally {
            if (this.qnoq) {
                this.qnoq = false;
                this.ule.reset();
            }
        }
    }

    @InterfaceC7842s
    protected void nsb() {
        this.smyf = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.bek6
    @zy.dd
    public InterfaceC3863z o1t() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.qnoq = true;
        try {
            this.ule.flush();
            try {
                super.oc();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.oc();
                throw th;
            } finally {
            }
        }
    }

    protected int pc(com.google.android.exoplayer2.mediacodec.n7h n7hVar, xwq3 xwq3Var, xwq3[] xwq3VarArr) {
        int iEbn = ebn(n7hVar, xwq3Var);
        if (xwq3VarArr.length == 1) {
            return iEbn;
        }
        for (xwq3 xwq3Var2 : xwq3VarArr) {
            if (n7hVar.m12236n(xwq3Var, xwq3Var2).f19588q != 0) {
                iEbn = Math.max(iEbn, ebn(n7hVar, xwq3Var2));
            }
        }
        return iEbn;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void py(xwq3 xwq3Var, @zy.dd MediaFormat mediaFormat) throws com.google.android.exoplayer2.ki {
        int i2;
        xwq3 xwq3Var2 = this.v62;
        int[] iArr = null;
        if (xwq3Var2 != null) {
            xwq3Var = xwq3Var2;
        } else if (nmn5() != null) {
            xwq3 xwq3VarA9 = new xwq3.toq().m13945m(com.google.android.exoplayer2.util.wvg.f67095d3).vyq(com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r) ? xwq3Var.f23687w : (com.google.android.exoplayer2.util.lrht.f23230k < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey(rt0p) ? com.google.android.exoplayer2.util.lrht.m13652a(mediaFormat.getInteger(rt0p)) : com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r) ? xwq3Var.f23687w : 2 : mediaFormat.getInteger("pcm-encoding")).m13947r(xwq3Var.f67273ab).dd(xwq3Var.bb).gvn7(mediaFormat.getInteger("channel-count")).ek5k(mediaFormat.getInteger("sample-rate")).a9();
            if (this.yf && xwq3VarA9.f23686v == 6 && (i2 = xwq3Var.f23686v) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < xwq3Var.f23686v; i3++) {
                    iArr[i3] = i3;
                }
            }
            xwq3Var = xwq3VarA9;
        }
        try {
            this.ule.fn3e(xwq3Var, 0, iArr);
        } catch (zurt.C3273k e2) {
            throw m12067t(e2, e2.format, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.AbstractC3433g
    /* JADX INFO: renamed from: r */
    protected void mo11400r() {
        super.mo11400r();
        this.ule.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void r8s8(C3297s c3297s) {
        if (!this.w7wd || c3297s.qrj()) {
            return;
        }
        if (Math.abs(c3297s.f19618s - this.vl4) > 500000) {
            this.vl4 = c3297s.f19618s;
        }
        this.w7wd = false;
    }

    public void ukdy(boolean z2) {
        this.deb = z2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected boolean v0af(long j2, long j3, @zy.dd com.google.android.exoplayer2.mediacodec.x2 x2Var, @zy.dd ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, xwq3 xwq3Var) throws com.google.android.exoplayer2.ki {
        C3844k.f7l8(byteBuffer);
        if (this.v62 != null && (i3 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.x2) C3844k.f7l8(x2Var)).kja0(i2, false);
            return true;
        }
        if (z2) {
            if (x2Var != null) {
                x2Var.kja0(i2, false);
            }
            this.zm.f19557g += i4;
            this.ule.t8r();
            return true;
        }
        try {
            if (!this.ule.qrj(byteBuffer, j4, i4)) {
                return false;
            }
            if (x2Var != null) {
                x2Var.kja0(i2, false);
            }
            this.zm.f19559n += i4;
            return true;
        } catch (zurt.C3272g e2) {
            throw mcp(e2, xwq3Var, e2.isRecoverable, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        } catch (zurt.toq e3) {
            throw mcp(e3, e3.format, e3.isRecoverable, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void was(String str, long j2, long j3) {
        this.lr4.qrj(str, j2, j3);
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g, com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @zy.dd Object obj) throws com.google.android.exoplayer2.ki {
        if (i2 == 2) {
            this.ule.toq(((Float) obj).floatValue());
        }
        if (i2 == 3) {
            this.ule.mo11462s((C3248g) obj);
            return;
        }
        if (i2 == 6) {
            this.ule.mo11463y((C3271z) obj);
            return;
        }
        switch (i2) {
            case 9:
                this.ule.x2(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.ule.mo11461q(((Integer) obj).intValue());
                break;
            case 11:
                this.u6 = (bek6.zy) obj;
                break;
            default:
                super.x2(i2, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    protected void z4() throws com.google.android.exoplayer2.ki {
        try {
            this.ule.cdj();
        } catch (zurt.C3272g e2) {
            throw mcp(e2, e2.format, e2.isRecoverable, yqrt.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0
    @zy.dd
    protected com.google.android.exoplayer2.decoder.ld6 zsr0(C3865v c3865v) throws com.google.android.exoplayer2.ki {
        com.google.android.exoplayer2.decoder.ld6 ld6VarZsr0 = super.zsr0(c3865v);
        this.lr4.cdj(c3865v.f67166toq, ld6VarZsr0);
        return ld6VarZsr0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.kja0, com.google.android.exoplayer2.bek6
    public boolean zy() {
        return super.zy() && this.ule.zy();
    }

    public dd(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, @zy.dd Handler handler, @zy.dd fn3e fn3eVar) {
        this(context, cdjVar, handler, fn3eVar, (C3270y) null, new InterfaceC3262p[0]);
    }

    public dd(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, @zy.dd Handler handler, @zy.dd fn3e fn3eVar, @zy.dd C3270y c3270y, InterfaceC3262p... interfaceC3262pArr) {
        this(context, cdjVar, handler, fn3eVar, new gvn7(c3270y, interfaceC3262pArr));
    }

    public dd(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, @zy.dd Handler handler, @zy.dd fn3e fn3eVar, zurt zurtVar) {
        this(context, x2.toq.f20727k, cdjVar, false, handler, fn3eVar, zurtVar);
    }

    public dd(Context context, com.google.android.exoplayer2.mediacodec.cdj cdjVar, boolean z2, @zy.dd Handler handler, @zy.dd fn3e fn3eVar, zurt zurtVar) {
        this(context, x2.toq.f20727k, cdjVar, z2, handler, fn3eVar, zurtVar);
    }

    public dd(Context context, x2.toq toqVar, com.google.android.exoplayer2.mediacodec.cdj cdjVar, boolean z2, @zy.dd Handler handler, @zy.dd fn3e fn3eVar, zurt zurtVar) {
        super(1, toqVar, cdjVar, z2, 44100.0f);
        this.p2c = context.getApplicationContext();
        this.ule = zurtVar;
        this.lr4 = new fn3e.C3246k(handler, fn3eVar);
        zurtVar.n7h(new toq());
    }
}
