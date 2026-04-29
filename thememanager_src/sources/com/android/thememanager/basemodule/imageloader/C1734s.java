package com.android.thememanager.basemodule.imageloader;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import com.bumptech.glide.request.AbstractC3168k;
import com.bumptech.glide.request.C3173s;
import zy.InterfaceC7839p;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.s */
/* JADX INFO: compiled from: GlideOptions.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1734s extends C3173s implements Cloneable {
    private static C1734s dy;
    private static C1734s sk1t;
    private static C1734s tgs;
    private static C1734s vb6;
    private static C1734s yl25;
    private static C1734s zmmu;

    @InterfaceC7839p
    @lvui
    public static C1734s b9ub(@lvui Bitmap.CompressFormat format) {
        return new C1734s().mcp(format);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s bap7() {
        if (yl25 == null) {
            yl25 = new C1734s().t8r().qrj();
        }
        return yl25;
    }

    @InterfaceC7839p
    @lvui
    public static C1734s bih() {
        if (dy == null) {
            dy = new C1734s().wvg().qrj();
        }
        return dy;
    }

    @InterfaceC7839p
    @lvui
    public static C1734s dxef(@lvui Class<?> clazz) {
        return new C1734s().ni7(clazz);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s f1bi(@fn3e int id) {
        return new C1734s().mu(id);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s g0ad(int width, int height) {
        return new C1734s().mo6763d(width, height);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s hyow(@a9(from = 0) int value) {
        return new C1734s().i9jn(value);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s ix(@fn3e int id) {
        return new C1734s().a9(id);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s kbj(@lvui EnumC3159p priority) {
        return new C1734s().qkj8(priority);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s kq2f(@lvui com.bumptech.glide.load.f7l8 key) {
        return new C1734s().was(key);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s kx3(@dd Drawable drawable) {
        return new C1734s().fti(drawable);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s lw(@lvui AbstractC3039p strategy) {
        return new C1734s().mo6769z(strategy);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s m58i(@lvui AbstractC3101h strategy) {
        return new C1734s().mo6765t(strategy);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s mj(@zurt(from = 0.0d, to = 1.0d) float value) {
        return new C1734s().gbni(value);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s n2t(@lvui com.bumptech.glide.load.n7h<Bitmap> transformation) {
        return new C1734s().ltg8(transformation);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s ngy() {
        if (zmmu == null) {
            zmmu = new C1734s().kja0().qrj();
        }
        return zmmu;
    }

    @InterfaceC7839p
    @lvui
    public static C1734s nme(@a9(from = 0, to = 100) int value) {
        return new C1734s().jk(value);
    }

    @InterfaceC7839p
    @lvui
    public static <T> C1734s o5(@lvui C3138s<T> option, @lvui T t2) {
        return new C1734s().g1(option, t2);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s ovdh(boolean skipMemoryCache) {
        return new C1734s().zsr0(skipMemoryCache);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s ps() {
        if (tgs == null) {
            tgs = new C1734s().d3().qrj();
        }
        return tgs;
    }

    @InterfaceC7839p
    @lvui
    public static C1734s ra(@lvui com.bumptech.glide.load.toq format) {
        return new C1734s().oc(format);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s tww7(@dd Drawable drawable) {
        return new C1734s().vq(drawable);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s uf(@a9(from = 0) long value) {
        return new C1734s().eqxt(value);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s wlev() {
        if (sk1t == null) {
            sk1t = new C1734s().fn3e().qrj();
        }
        return sk1t;
    }

    @InterfaceC7839p
    @lvui
    public static C1734s wt(int size) {
        return new C1734s().ikck(size);
    }

    @InterfaceC7839p
    @lvui
    public static C1734s z4t() {
        if (vb6 == null) {
            vb6 = new C1734s().o1t().qrj();
        }
        return vb6;
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: a5id, reason: merged with bridge method [inline-methods] */
    public C1734s mo6769z(@lvui AbstractC3039p strategy) {
        return (C1734s) super.mo6769z(strategy);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: b8, reason: merged with bridge method [inline-methods] */
    public C1734s jk(@a9(from = 0, to = 100) int value) {
        return (C1734s) super.jk(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: bqie, reason: merged with bridge method [inline-methods] */
    public C1734s vq(@dd Drawable drawable) {
        return (C1734s) super.vq(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: btvn, reason: merged with bridge method [inline-methods] */
    public C1734s was(@lvui com.bumptech.glide.load.f7l8 key) {
        return (C1734s) super.was(key);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cn02, reason: merged with bridge method [inline-methods] */
    public C1734s zsr0(boolean skip) {
        return (C1734s) super.zsr0(skip);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cnbm, reason: merged with bridge method [inline-methods] */
    public C1734s mcp(@lvui Bitmap.CompressFormat format) {
        return (C1734s) super.mcp(format);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cyoe, reason: merged with bridge method [inline-methods] */
    public C1734s c8jq() {
        return (C1734s) super.c8jq();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: e5, reason: merged with bridge method [inline-methods] */
    public C1734s ni7(@lvui Class<?> clazz) {
        return (C1734s) super.ni7(clazz);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ec, reason: merged with bridge method [inline-methods] */
    public C1734s t8iq(boolean flag) {
        return (C1734s) super.t8iq(flag);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: el, reason: merged with bridge method [inline-methods] */
    public C1734s mo6763d(int width, int height) {
        return (C1734s) super.mo6763d(width, height);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ew, reason: merged with bridge method [inline-methods] */
    public C1734s fti(@dd Drawable drawable) {
        return (C1734s) super.fti(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: exv8, reason: merged with bridge method [inline-methods] */
    public C1734s py(@dd Resources.Theme theme) {
        return (C1734s) super.py(theme);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    /* JADX INFO: renamed from: ga, reason: merged with bridge method [inline-methods] */
    public C1734s zurt() {
        return (C1734s) super.zurt();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: gb, reason: merged with bridge method [inline-methods] */
    public <Y> C1734s g1(@lvui C3138s<Y> option, @lvui Y y3) {
        return (C1734s) super.g1(option, y3);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: gcp, reason: merged with bridge method [inline-methods] */
    public C1734s o1t() {
        return (C1734s) super.o1t();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: h4b, reason: merged with bridge method [inline-methods] */
    public C1734s fn3e() {
        return (C1734s) super.fn3e();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: imd, reason: merged with bridge method [inline-methods] */
    public C1734s mu(@fn3e int id) {
        return (C1734s) super.mu(id);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @lvui
    /* JADX INFO: renamed from: kiv, reason: merged with bridge method [inline-methods] */
    public C1734s lv5() {
        return (C1734s) super.lv5();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: l05, reason: merged with bridge method [inline-methods] */
    public C1734s y2() {
        return (C1734s) super.y2();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: lh, reason: merged with bridge method [inline-methods] */
    public C1734s t8r() {
        return (C1734s) super.t8r();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: lk, reason: merged with bridge method [inline-methods] */
    public C1734s z4(boolean flag) {
        return (C1734s) super.z4(flag);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: m2t, reason: merged with bridge method [inline-methods] */
    public C1734s gvn7(@dd Drawable drawable) {
        return (C1734s) super.gvn7(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @Deprecated
    @SafeVarargs
    @lvui
    /* JADX INFO: renamed from: mi1u, reason: merged with bridge method [inline-methods] */
    public final C1734s cfr(@lvui com.bumptech.glide.load.n7h<Bitmap>... transformations) {
        return (C1734s) super.cfr(transformations);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nnh, reason: merged with bridge method [inline-methods] */
    public C1734s eqxt(@a9(from = 0) long value) {
        return (C1734s) super.eqxt(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nsb, reason: merged with bridge method [inline-methods] */
    public C1734s mo6764k(@lvui AbstractC3168k<?> options) {
        return (C1734s) super.mo6764k(options);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: o05, reason: merged with bridge method [inline-methods] */
    public C1734s mo6765t(@lvui AbstractC3101h strategy) {
        return (C1734s) super.mo6765t(strategy);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ob, reason: merged with bridge method [inline-methods] */
    public C1734s qkj8(@lvui EnumC3159p priority) {
        return (C1734s) super.qkj8(priority);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: oki, reason: merged with bridge method [inline-methods] */
    public C1734s wvg() {
        return (C1734s) super.wvg();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: pjz9, reason: merged with bridge method [inline-methods] */
    public C1734s kja0() {
        return (C1734s) super.kja0();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: pnt2, reason: merged with bridge method [inline-methods] */
    public <Y> C1734s v0af(@lvui Class<Y> clazz, @lvui com.bumptech.glide.load.n7h<Y> transformation) {
        return (C1734s) super.v0af(clazz, transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: qh4d, reason: merged with bridge method [inline-methods] */
    public C1734s i9jn(@a9(from = 0) int value) {
        return (C1734s) super.i9jn(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: r25n, reason: merged with bridge method [inline-methods] */
    public C1734s a9(@fn3e int id) {
        return (C1734s) super.a9(id);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: r6ty, reason: merged with bridge method [inline-methods] */
    public C1734s dr(@lvui com.bumptech.glide.load.n7h<Bitmap> transformation) {
        return (C1734s) super.dr(transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: rp, reason: merged with bridge method [inline-methods] */
    public C1734s bo() {
        return (C1734s) super.bo();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: u38j, reason: merged with bridge method [inline-methods] */
    public C1734s d3() {
        return (C1734s) super.d3();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: v5yj, reason: merged with bridge method [inline-methods] */
    public C1734s oc(@lvui com.bumptech.glide.load.toq format) {
        return (C1734s) super.oc(format);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: vwb, reason: merged with bridge method [inline-methods] */
    public C1734s w831(boolean flag) {
        return (C1734s) super.w831(flag);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: vy, reason: merged with bridge method [inline-methods] */
    public C1734s fu4() {
        return (C1734s) super.fu4();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C1734s jp0y(@fn3e int id) {
        return (C1734s) super.jp0y(id);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xblq, reason: merged with bridge method [inline-methods] */
    public C1734s ltg8(@lvui com.bumptech.glide.load.n7h<Bitmap> transformation) {
        return (C1734s) super.ltg8(transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xm, reason: merged with bridge method [inline-methods] */
    public C1734s gbni(@zurt(from = 0.0d, to = 1.0d) float value) {
        return (C1734s) super.gbni(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @SafeVarargs
    @lvui
    /* JADX INFO: renamed from: xtb7, reason: merged with bridge method [inline-methods] */
    public final C1734s sok(@lvui com.bumptech.glide.load.n7h<Bitmap>... transformations) {
        return (C1734s) super.sok(transformations);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: yp31, reason: merged with bridge method [inline-methods] */
    public <Y> C1734s mo6767v(@lvui Class<Y> clazz, @lvui com.bumptech.glide.load.n7h<Y> transformation) {
        return (C1734s) super.mo6767v(clazz, transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: yw, reason: merged with bridge method [inline-methods] */
    public C1734s mo6766u() {
        return (C1734s) super.mo6766u();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: zff0, reason: merged with bridge method [inline-methods] */
    public C1734s ikck(int size) {
        return (C1734s) super.ikck(size);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @lvui
    /* JADX INFO: renamed from: zwy, reason: merged with bridge method [inline-methods] */
    public C1734s qrj() {
        return (C1734s) super.qrj();
    }
}
