package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.n7h;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import zy.InterfaceC7839p;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.bumptech.glide.request.s */
/* JADX INFO: compiled from: RequestOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3173s extends AbstractC3168k<C3173s> {

    @dd
    private static C3173s ar;

    @dd
    private static C3173s bc;

    @dd
    private static C3173s bd;

    @dd
    private static C3173s bs;

    @dd
    private static C3173s bu;

    @dd
    private static C3173s k0;

    @dd
    private static C3173s tlhn;

    @dd
    private static C3173s w97r;

    @InterfaceC7839p
    @lvui
    public static C3173s b3e(@dd Drawable drawable) {
        return new C3173s().fti(drawable);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s bek6() {
        if (ar == null) {
            ar = new C3173s().d3().qrj();
        }
        return ar;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s bwp() {
        if (bc == null) {
            bc = new C3173s().t8r().qrj();
        }
        return bc;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s bz2(@lvui AbstractC3101h abstractC3101h) {
        return new C3173s().mo6765t(abstractC3101h);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s cv06(@lvui com.bumptech.glide.load.toq toqVar) {
        return new C3173s().oc(toqVar);
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static C3173s m28261do(@lvui EnumC3159p enumC3159p) {
        return new C3173s().qkj8(enumC3159p);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s ebn(@zurt(from = 0.0d, to = 1.0d) float f2) {
        return new C3173s().gbni(f2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s gc3c(@lvui Class<?> cls) {
        return new C3173s().ni7(cls);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s h7am(@a9(from = 0) long j2) {
        return new C3173s().eqxt(j2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s ij(@a9(from = 0) int i2) {
        return new C3173s().i9jn(i2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s ixz(@dd Drawable drawable) {
        return new C3173s().vq(drawable);
    }

    @InterfaceC7839p
    @lvui
    public static <T> C3173s jbh(@lvui C3138s<T> c3138s, @lvui T t2) {
        return new C3173s().g1(c3138s, t2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s jz5(@a9(from = 0, to = 100) int i2) {
        return new C3173s().jk(i2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s kcsr() {
        if (bu == null) {
            bu = new C3173s().kja0().qrj();
        }
        return bu;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s ktq(@fn3e int i2) {
        return new C3173s().a9(i2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s mbx() {
        if (tlhn == null) {
            tlhn = new C3173s().wvg().qrj();
        }
        return tlhn;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s pc(boolean z2) {
        if (z2) {
            if (bs == null) {
                bs = new C3173s().zsr0(true).qrj();
            }
            return bs;
        }
        if (k0 == null) {
            k0 = new C3173s().zsr0(false).qrj();
        }
        return k0;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s se() {
        if (bd == null) {
            bd = new C3173s().fn3e().qrj();
        }
        return bd;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s uc(int i2, int i3) {
        return new C3173s().mo6763d(i2, i3);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s uj2j(@lvui Bitmap.CompressFormat compressFormat) {
        return new C3173s().mcp(compressFormat);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s ukdy(@lvui com.bumptech.glide.load.f7l8 f7l8Var) {
        return new C3173s().was(f7l8Var);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s vep5() {
        if (w97r == null) {
            w97r = new C3173s().o1t().qrj();
        }
        return w97r;
    }

    @InterfaceC7839p
    @lvui
    public static C3173s wx16(@fn3e int i2) {
        return new C3173s().mu(i2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s yl(int i2) {
        return uc(i2, i2);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s yqrt(@lvui n7h<Bitmap> n7hVar) {
        return new C3173s().ltg8(n7hVar);
    }

    @InterfaceC7839p
    @lvui
    public static C3173s zkd(@lvui AbstractC3039p abstractC3039p) {
        return new C3173s().mo6769z(abstractC3039p);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    public boolean equals(Object obj) {
        return (obj instanceof C3173s) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    public int hashCode() {
        return super.hashCode();
    }
}
