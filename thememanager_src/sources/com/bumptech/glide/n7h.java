package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.request.AbstractC3168k;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3167g;
import com.bumptech.glide.request.InterfaceC3170n;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.request.InterfaceFutureC3172q;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.target.ki;
import com.bumptech.glide.signature.C3196k;
import com.bumptech.glide.util.C3199g;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import zy.InterfaceC7839p;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n5r1;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h<TranscodeType> extends AbstractC3168k<n7h<TranscodeType>> implements Cloneable, InterfaceC3195s<n7h<TranscodeType>> {
    protected static final C3173s k6e = new C3173s().mo6769z(AbstractC3039p.f62799zy).qkj8(EnumC3159p.LOW).zsr0(true);
    private final Class<TranscodeType> ar;
    private final zy bc;

    @lvui
    private AbstractC2977h<?, ? super TranscodeType> bd;
    private final Context bs;
    private final C3157n bu;
    private boolean dy;
    private final kja0 k0;
    private boolean sk1t;

    @dd
    private n7h<TranscodeType> tgs;

    @dd
    private Object tlhn;
    private boolean vb6;

    @dd
    private List<InterfaceC3194y<TranscodeType>> w97r;

    @dd
    private n7h<TranscodeType> yl25;

    @dd
    private Float zmmu;

    /* JADX INFO: renamed from: com.bumptech.glide.n7h$k */
    /* JADX INFO: compiled from: RequestBuilder.java */
    static /* synthetic */ class C3158k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f18918k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f62998toq;

        static {
            int[] iArr = new int[EnumC3159p.values().length];
            f62998toq = iArr;
            try {
                iArr[EnumC3159p.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62998toq[EnumC3159p.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62998toq[EnumC3159p.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62998toq[EnumC3159p.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f18918k = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18918k[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18918k[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18918k[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18918k[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18918k[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18918k[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18918k[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected n7h(@lvui zy zyVar, kja0 kja0Var, Class<TranscodeType> cls, Context context) {
        this.sk1t = true;
        this.bc = zyVar;
        this.k0 = kja0Var;
        this.ar = cls;
        this.bs = context;
        this.bd = kja0Var.fti(cls);
        this.bu = zyVar.ld6();
        mbx(kja0Var.jk());
        mo6764k(kja0Var.a9());
    }

    @lvui
    private n7h<TranscodeType> bap7(@dd Object obj) {
        if (m11161m()) {
            return zurt().bap7(obj);
        }
        this.tlhn = obj;
        this.dy = true;
        return d8wk();
    }

    private n7h<TranscodeType> bwp(n7h<TranscodeType> n7hVar) {
        return n7hVar.py(this.bs.getTheme()).was(C3196k.zy(this.bs));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean m28260do(AbstractC3168k<?> abstractC3168k, InterfaceC3170n interfaceC3170n) {
        return !abstractC3168k.y9n() && interfaceC3170n.f7l8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC3170n gc3c(Object obj, InterfaceC3175h<TranscodeType> interfaceC3175h, @dd InterfaceC3194y<TranscodeType> interfaceC3194y, @dd InterfaceC3167g interfaceC3167g, AbstractC2977h<?, ? super TranscodeType> abstractC2977h, EnumC3159p enumC3159p, int i2, int i3, AbstractC3168k<?> abstractC3168k, Executor executor) {
        InterfaceC3167g interfaceC3167g2;
        InterfaceC3167g toqVar;
        if (this.yl25 != null) {
            toqVar = new com.bumptech.glide.request.toq(obj, interfaceC3167g);
            interfaceC3167g2 = toqVar;
        } else {
            interfaceC3167g2 = null;
            toqVar = interfaceC3167g;
        }
        InterfaceC3170n interfaceC3170nZkd = zkd(obj, interfaceC3175h, interfaceC3194y, toqVar, abstractC2977h, enumC3159p, i2, i3, abstractC3168k, executor);
        if (interfaceC3167g2 == null) {
            return interfaceC3170nZkd;
        }
        int iHyr = this.yl25.hyr();
        int iN5r1 = this.yl25.n5r1();
        if (com.bumptech.glide.util.kja0.ni7(i2, i3) && !this.yl25.nmn5()) {
            iHyr = abstractC3168k.hyr();
            iN5r1 = abstractC3168k.n5r1();
        }
        n7h<TranscodeType> n7hVar = this.yl25;
        com.bumptech.glide.request.toq toqVar2 = interfaceC3167g2;
        toqVar2.kja0(interfaceC3170nZkd, n7hVar.gc3c(obj, interfaceC3175h, interfaceC3194y, toqVar2, n7hVar.bd, n7hVar.lrht(), iHyr, iN5r1, this.yl25, executor));
        return toqVar2;
    }

    private n7h<TranscodeType> h4b(@dd Uri uri, n7h<TranscodeType> n7hVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? n7hVar : bwp(n7hVar);
    }

    @SuppressLint({"CheckResult"})
    private void mbx(List<InterfaceC3194y<Object>> list) {
        Iterator<InterfaceC3194y<Object>> it = list.iterator();
        while (it.hasNext()) {
            yqrt((InterfaceC3194y) it.next());
        }
    }

    private InterfaceC3170n se(InterfaceC3175h<TranscodeType> interfaceC3175h, @dd InterfaceC3194y<TranscodeType> interfaceC3194y, AbstractC3168k<?> abstractC3168k, Executor executor) {
        return gc3c(new Object(), interfaceC3175h, interfaceC3194y, null, this.bd, abstractC3168k.lrht(), abstractC3168k.hyr(), abstractC3168k.n5r1(), abstractC3168k, executor);
    }

    private <Y extends InterfaceC3175h<TranscodeType>> Y uc(@lvui Y y3, @dd InterfaceC3194y<TranscodeType> interfaceC3194y, AbstractC3168k<?> abstractC3168k, Executor executor) {
        com.bumptech.glide.util.qrj.m11262q(y3);
        if (!this.dy) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC3170n interfaceC3170nSe = se(y3, interfaceC3194y, abstractC3168k, executor);
        InterfaceC3170n interfaceC3170nLd6 = y3.ld6();
        if (interfaceC3170nSe.mo11174y(interfaceC3170nLd6) && !m28260do(abstractC3168k, interfaceC3170nLd6)) {
            if (!((InterfaceC3170n) com.bumptech.glide.util.qrj.m11262q(interfaceC3170nLd6)).isRunning()) {
                interfaceC3170nLd6.mo11173s();
            }
            return y3;
        }
        this.k0.wvg(y3);
        y3.kja0(interfaceC3170nSe);
        this.k0.m10623e(y3, interfaceC3170nSe);
        return y3;
    }

    private n7h<TranscodeType> uj2j() {
        return zurt().b3e(null).lw(null);
    }

    @lvui
    private EnumC3159p vep5(@lvui EnumC3159p enumC3159p) {
        int i2 = C3158k.f62998toq[enumC3159p.ordinal()];
        if (i2 == 1) {
            return EnumC3159p.NORMAL;
        }
        if (i2 == 2) {
            return EnumC3159p.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return EnumC3159p.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + lrht());
    }

    private InterfaceC3170n wlev(Object obj, InterfaceC3175h<TranscodeType> interfaceC3175h, InterfaceC3194y<TranscodeType> interfaceC3194y, AbstractC3168k<?> abstractC3168k, InterfaceC3167g interfaceC3167g, AbstractC2977h<?, ? super TranscodeType> abstractC2977h, EnumC3159p enumC3159p, int i2, int i3, Executor executor) {
        Context context = this.bs;
        C3157n c3157n = this.bu;
        return com.bumptech.glide.request.ld6.m11169z(context, c3157n, obj, this.tlhn, this.ar, abstractC3168k, i2, i3, enumC3159p, interfaceC3175h, interfaceC3194y, this.w97r, interfaceC3167g, c3157n.m11117g(), abstractC2977h.m10611n(), executor);
    }

    private InterfaceC3170n zkd(Object obj, InterfaceC3175h<TranscodeType> interfaceC3175h, InterfaceC3194y<TranscodeType> interfaceC3194y, @dd InterfaceC3167g interfaceC3167g, AbstractC2977h<?, ? super TranscodeType> abstractC2977h, EnumC3159p enumC3159p, int i2, int i3, AbstractC3168k<?> abstractC3168k, Executor executor) {
        n7h<TranscodeType> n7hVar = this.tgs;
        if (n7hVar == null) {
            if (this.zmmu == null) {
                return wlev(obj, interfaceC3175h, interfaceC3194y, abstractC3168k, interfaceC3167g, abstractC2977h, enumC3159p, i2, i3, executor);
            }
            com.bumptech.glide.request.x2 x2Var = new com.bumptech.glide.request.x2(obj, interfaceC3167g);
            x2Var.n7h(wlev(obj, interfaceC3175h, interfaceC3194y, abstractC3168k, x2Var, abstractC2977h, enumC3159p, i2, i3, executor), wlev(obj, interfaceC3175h, interfaceC3194y, abstractC3168k.zurt().gbni(this.zmmu.floatValue()), x2Var, abstractC2977h, vep5(enumC3159p), i2, i3, executor));
            return x2Var;
        }
        if (this.vb6) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC2977h<?, ? super TranscodeType> abstractC2977h2 = n7hVar.sk1t ? abstractC2977h : n7hVar.bd;
        EnumC3159p enumC3159pLrht = n7hVar.m11155b() ? this.tgs.lrht() : vep5(enumC3159p);
        int iHyr = this.tgs.hyr();
        int iN5r1 = this.tgs.n5r1();
        if (com.bumptech.glide.util.kja0.ni7(i2, i3) && !this.tgs.nmn5()) {
            iHyr = abstractC3168k.hyr();
            iN5r1 = abstractC3168k.n5r1();
        }
        com.bumptech.glide.request.x2 x2Var2 = new com.bumptech.glide.request.x2(obj, interfaceC3167g);
        InterfaceC3170n interfaceC3170nWlev = wlev(obj, interfaceC3175h, interfaceC3194y, abstractC3168k, x2Var2, abstractC2977h, enumC3159p, i2, i3, executor);
        this.vb6 = true;
        n7h<TranscodeType> n7hVar2 = this.tgs;
        InterfaceC3170n interfaceC3170nGc3c = n7hVar2.gc3c(obj, interfaceC3175h, interfaceC3194y, x2Var2, abstractC2977h2, enumC3159pLrht, iHyr, iN5r1, n7hVar2, executor);
        this.vb6 = false;
        x2Var2.n7h(interfaceC3170nWlev, interfaceC3170nGc3c);
        return x2Var2;
    }

    @InterfaceC7839p
    @lvui
    @Deprecated
    public n7h<TranscodeType> a5id(float f2) {
        if (m11161m()) {
            return zurt().a5id(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.zmmu = Float.valueOf(f2);
        return d8wk();
    }

    @lvui
    public n7h<TranscodeType> b3e(@dd n7h<TranscodeType> n7hVar) {
        if (m11161m()) {
            return zurt().b3e(n7hVar);
        }
        this.yl25 = n7hVar;
        return d8wk();
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> bek6(Object obj) {
        return obj == null ? b3e(null) : b3e(uj2j().cdj(obj));
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    /* JADX INFO: renamed from: bz2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n7h<TranscodeType> zurt() {
        n7h<TranscodeType> n7hVar = (n7h) super.zurt();
        n7hVar.bd = n7hVar.bd.clone();
        if (n7hVar.w97r != null) {
            n7hVar.w97r = new ArrayList(n7hVar.w97r);
        }
        n7h<TranscodeType> n7hVar2 = n7hVar.tgs;
        if (n7hVar2 != null) {
            n7hVar.tgs = n7hVar2.zurt();
        }
        n7h<TranscodeType> n7hVar3 = n7hVar.yl25;
        if (n7hVar3 != null) {
            n7hVar.yl25 = n7hVar3.zurt();
        }
        return n7hVar;
    }

    @InterfaceC7839p
    @lvui
    protected n7h<File> cv06() {
        return new n7h(File.class, this).mo6764k(k6e);
    }

    @lvui
    public InterfaceFutureC3172q<TranscodeType> dxef() {
        return vy(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @lvui
    public InterfaceC3175h<TranscodeType> e5(int i2, int i3) {
        return yl(com.bumptech.glide.request.target.qrj.m11205q(this.k0, i2, i3));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ebn, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> n7h(@dd Bitmap bitmap) {
        return bap7(bitmap).mo6764k(C3173s.zkd(AbstractC3039p.f62798toq));
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    public boolean equals(Object obj) {
        if (!(obj instanceof n7h)) {
            return false;
        }
        n7h n7hVar = (n7h) obj;
        return super.equals(n7hVar) && Objects.equals(this.ar, n7hVar.ar) && this.bd.equals(n7hVar.bd) && Objects.equals(this.tlhn, n7hVar.tlhn) && Objects.equals(this.w97r, n7hVar.w97r) && Objects.equals(this.tgs, n7hVar.tgs) && Objects.equals(this.yl25, n7hVar.yl25) && Objects.equals(this.zmmu, n7hVar.zmmu) && this.sk1t == n7hVar.sk1t && this.dy == n7hVar.dy;
    }

    @lvui
    public InterfaceC3175h<TranscodeType> ga() {
        return e5(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> gcp(@dd List<n7h<TranscodeType>> list) {
        n7h<TranscodeType> n7hVarLw = null;
        if (list == null || list.isEmpty()) {
            return lw(null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            n7h<TranscodeType> n7hVar = list.get(size);
            if (n7hVar != null) {
                n7hVarLw = n7hVarLw == null ? n7hVar : n7hVar.lw(n7hVarLw);
            }
        }
        return lw(n7hVarLw);
    }

    kja0 h7am() {
        return this.k0;
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    public int hashCode() {
        return com.bumptech.glide.util.kja0.t8r(this.dy, com.bumptech.glide.util.kja0.t8r(this.sk1t, com.bumptech.glide.util.kja0.cdj(this.zmmu, com.bumptech.glide.util.kja0.cdj(this.yl25, com.bumptech.glide.util.kja0.cdj(this.tgs, com.bumptech.glide.util.kja0.cdj(this.w97r, com.bumptech.glide.util.kja0.cdj(this.tlhn, com.bumptech.glide.util.kja0.cdj(this.bd, com.bumptech.glide.util.kja0.cdj(this.ar, super.hashCode())))))))));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ij, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6750n(@dd Uri uri) {
        return h4b(uri, bap7(uri));
    }

    @lvui
    public ki<ImageView, TranscodeType> ixz(@lvui ImageView imageView) {
        AbstractC3168k abstractC3168kMo6766u;
        com.bumptech.glide.util.kja0.toq();
        com.bumptech.glide.util.qrj.m11262q(imageView);
        if (!ch() && zp() && imageView.getScaleType() != null) {
            switch (C3158k.f18918k[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC3168kMo6766u = zurt().mo6766u();
                    break;
                case 2:
                    abstractC3168kMo6766u = zurt().bo();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC3168kMo6766u = zurt().c8jq();
                    break;
                case 6:
                    abstractC3168kMo6766u = zurt().bo();
                    break;
                default:
                    abstractC3168kMo6766u = this;
                    break;
            }
        } else {
            abstractC3168kMo6766u = this;
        }
        return (ki) uc(this.bu.m11118k(imageView, this.ar), null, abstractC3168kMo6766u, C3199g.toq());
    }

    @Deprecated
    public InterfaceFutureC3172q<TranscodeType> jbh(int i2, int i3) {
        return vy(i2, i3);
    }

    @InterfaceC7839p
    @Deprecated
    public InterfaceFutureC3172q<File> jz5(int i2, int i3) {
        return cv06().vy(i2, i3);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: kcsr, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6764k(@lvui AbstractC3168k<?> abstractC3168k) {
        com.bumptech.glide.util.qrj.m11262q(abstractC3168k);
        return (n7h) super.mo6764k(abstractC3168k);
    }

    @InterfaceC7839p
    @Deprecated
    public <Y extends InterfaceC3175h<File>> Y ktq(@lvui Y y3) {
        return (Y) cv06().yl(y3);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: lh, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6747g(@dd byte[] bArr) {
        n7h<TranscodeType> n7hVarBap7 = bap7(bArr);
        if (!n7hVarBap7.ek5k()) {
            n7hVarBap7 = n7hVarBap7.mo6764k(C3173s.zkd(AbstractC3039p.f62798toq));
        }
        return !n7hVarBap7.m11154a() ? n7hVarBap7.mo6764k(C3173s.pc(true)) : n7hVarBap7;
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> lw(@dd n7h<TranscodeType> n7hVar) {
        if (m11161m()) {
            return zurt().lw(n7hVar);
        }
        this.tgs = n7hVar;
        return d8wk();
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: n2t, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> cdj(@dd Object obj) {
        return bap7(obj);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @Deprecated
    /* JADX INFO: renamed from: ngy, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6752q(@dd URL url) {
        return bap7(url);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nsb, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6758y(@dd File file) {
        return bap7(file);
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> o05(@lvui AbstractC2977h<?, ? super TranscodeType> abstractC2977h) {
        if (m11161m()) {
            return zurt().o05(abstractC2977h);
        }
        this.bd = (AbstractC2977h) com.bumptech.glide.util.qrj.m11262q(abstractC2977h);
        this.sk1t = false;
        return d8wk();
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> oki(@dd n7h<TranscodeType>... n7hVarArr) {
        return (n7hVarArr == null || n7hVarArr.length == 0) ? lw(null) : gcp(Arrays.asList(n7hVarArr));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: pc, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6754s(@dd Drawable drawable) {
        return bap7(drawable).mo6764k(C3173s.zkd(AbstractC3039p.f62798toq));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: pjz9, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> mo6748i(@dd String str) {
        return bap7(str);
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> ukdy(@dd InterfaceC3194y<TranscodeType> interfaceC3194y) {
        if (m11161m()) {
            return zurt().ukdy(interfaceC3194y);
        }
        this.w97r = null;
        return yqrt(interfaceC3194y);
    }

    @lvui
    public InterfaceFutureC3172q<TranscodeType> vy(int i2, int i3) {
        com.bumptech.glide.request.f7l8 f7l8Var = new com.bumptech.glide.request.f7l8(i2, i3);
        return (InterfaceFutureC3172q) wx16(f7l8Var, f7l8Var, C3199g.m11219k());
    }

    @lvui
    <Y extends InterfaceC3175h<TranscodeType>> Y wx16(@lvui Y y3, @dd InterfaceC3194y<TranscodeType> interfaceC3194y, Executor executor) {
        return (Y) uc(y3, interfaceC3194y, this, executor);
    }

    @lvui
    public <Y extends InterfaceC3175h<TranscodeType>> Y yl(@lvui Y y3) {
        return (Y) wx16(y3, null, C3199g.toq());
    }

    @InterfaceC7839p
    @lvui
    public n7h<TranscodeType> yqrt(@dd InterfaceC3194y<TranscodeType> interfaceC3194y) {
        if (m11161m()) {
            return zurt().yqrt(interfaceC3194y);
        }
        if (interfaceC3194y != null) {
            if (this.w97r == null) {
                this.w97r = new ArrayList();
            }
            this.w97r.add(interfaceC3194y);
        }
        return d8wk();
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: zwy, reason: merged with bridge method [inline-methods] */
    public n7h<TranscodeType> ki(@dd @fn3e @n5r1 Integer num) {
        return bwp(bap7(num));
    }

    @SuppressLint({"CheckResult"})
    protected n7h(Class<TranscodeType> cls, n7h<?> n7hVar) {
        this(n7hVar.bc, n7hVar.k0, cls, n7hVar.bs);
        this.tlhn = n7hVar.tlhn;
        this.dy = n7hVar.dy;
        mo6764k(n7hVar);
    }
}
