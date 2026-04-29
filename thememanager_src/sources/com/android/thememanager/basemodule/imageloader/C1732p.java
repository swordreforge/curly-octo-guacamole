package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.AbstractC2977h;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import com.bumptech.glide.request.AbstractC3168k;
import com.bumptech.glide.request.InterfaceC3194y;
import java.io.File;
import java.net.URL;
import java.util.List;
import zy.InterfaceC7839p;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n5r1;
import zy.zurt;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.p */
/* JADX INFO: compiled from: GlideRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class C1732p<TranscodeType> extends com.bumptech.glide.n7h<TranscodeType> implements Cloneable {
    C1732p(@lvui Class<TranscodeType> transcodeClass, @lvui com.bumptech.glide.n7h<?> other) {
        super(transcodeClass, other);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ab, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> i9jn(@a9(from = 0) int value) {
        return (C1732p) super.i9jn(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: b8, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> kja0() {
        return (C1732p) super.kja0();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @lvui
    /* JADX INFO: renamed from: b9ub, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> qrj() {
        return (C1732p) super.qrj();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: bih, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> jp0y(@fn3e int id) {
        return (C1732p) super.jp0y(id);
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @Deprecated
    /* JADX INFO: renamed from: bqie, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6752q(@dd URL url) {
        return (C1732p) super.mo6752q(url);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: btvn, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> y2() {
        return (C1732p) super.y2();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: c25, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> ltg8(@lvui com.bumptech.glide.load.n7h<Bitmap> transformation) {
        return (C1732p) super.ltg8(transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cn02, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> ikck(int size) {
        return (C1732p) super.ikck(size);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cnbm, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6764k(@lvui AbstractC3168k<?> options) {
        return (C1732p) super.mo6764k(options);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: cyoe, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> ukdy(@dd InterfaceC3194y<TranscodeType> listener) {
        return (C1732p) super.ukdy(listener);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ec, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> gvn7(@dd Drawable drawable) {
        return (C1732p) super.gvn7(drawable);
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: el, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6758y(@dd File file) {
        return (C1732p) super.mo6758y(file);
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    /* JADX INFO: renamed from: ew, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> zurt() {
        return (C1732p) super.zurt();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: exv8, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mu(@fn3e int id) {
        return (C1732p) super.mu(id);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: f1bi, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6747g(@dd byte[] bytes) {
        return (C1732p) super.mo6747g(bytes);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: f3f, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> sok(@lvui com.bumptech.glide.load.n7h<Bitmap>... transformations) {
        return (C1732p) super.sok(transformations);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: g0ad, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> cdj(@dd Object o2) {
        return (C1732p) super.cdj(o2);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: gb, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> bo() {
        return (C1732p) super.bo();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: hyow, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> qkj8(@lvui EnumC3159p priority) {
        return (C1732p) super.qkj8(priority);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @Deprecated
    @lvui
    /* JADX INFO: renamed from: i3x9, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> cfr(@lvui com.bumptech.glide.load.n7h<Bitmap>... transformations) {
        return (C1732p) super.cfr(transformations);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: imd, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6748i(@dd String string) {
        return (C1732p) super.mo6748i(string);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ix, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> ni7(@lvui Class<?> clazz) {
        return (C1732p) super.ni7(clazz);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: kbj, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6766u() {
        return (C1732p) super.mo6766u();
    }

    @Override // com.bumptech.glide.n7h
    @lvui
    /* JADX INFO: renamed from: kiv, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> b3e(@dd com.bumptech.glide.n7h<TranscodeType> builder) {
        return (C1732p) super.b3e(builder);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: kq2f, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> c8jq() {
        return (C1732p) super.c8jq();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: kx3, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> fu4() {
        return (C1732p) super.fu4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: l05, reason: merged with bridge method [inline-methods] */
    public C1732p<File> cv06() {
        return new C1732p(File.class, this).mo6764k(com.bumptech.glide.n7h.k6e);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @Deprecated
    @lvui
    /* JADX INFO: renamed from: lk, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> a5id(float sizeMultiplier) {
        return (C1732p) super.a5id(sizeMultiplier);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: m2t, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> o1t() {
        return (C1732p) super.o1t();
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: m58i, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> yqrt(@dd InterfaceC3194y<TranscodeType> listener) {
        return (C1732p) super.yqrt(listener);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: mi1u, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> zsr0(boolean skip) {
        return (C1732p) super.zsr0(skip);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: mj, reason: merged with bridge method [inline-methods] */
    public <Y> C1732p<TranscodeType> mo6767v(@lvui Class<Y> clazz, @lvui com.bumptech.glide.load.n7h<Y> transformation) {
        return (C1732p) super.mo6767v(clazz, transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nme, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> t8r() {
        return (C1732p) super.t8r();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nnh, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> a9(@fn3e int id) {
        return (C1732p) super.a9(id);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: nyj, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> o05(@lvui AbstractC2977h<?, ? super TranscodeType> options) {
        return (C1732p) super.o05(options);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> d3() {
        return (C1732p) super.d3();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ob, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> t8iq(boolean flag) {
        return (C1732p) super.t8iq(flag);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ovdh, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6763d(int width, int height) {
        return (C1732p) super.mo6763d(width, height);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: pnt2, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> was(@lvui com.bumptech.glide.load.f7l8 key) {
        return (C1732p) super.was(key);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ps, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6765t(@lvui AbstractC3101h strategy) {
        return (C1732p) super.mo6765t(strategy);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: qh4d, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> vq(@dd Drawable drawable) {
        return (C1732p) super.vq(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: r25n, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> fn3e() {
        return (C1732p) super.fn3e();
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: r6ty, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> n7h(@dd Bitmap bitmap) {
        return (C1732p) super.n7h(bitmap);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> jk(@a9(from = 0, to = 100) int value) {
        return (C1732p) super.jk(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: rp, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> eqxt(@a9(from = 0) long value) {
        return (C1732p) super.eqxt(value);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: tjz5, reason: merged with bridge method [inline-methods] */
    public <Y> C1732p<TranscodeType> v0af(@lvui Class<Y> clazz, @lvui com.bumptech.glide.load.n7h<Y> transformation) {
        return (C1732p) super.v0af(clazz, transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @lvui
    /* JADX INFO: renamed from: tww7, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> lv5() {
        return (C1732p) super.lv5();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: u38j, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> wvg() {
        return (C1732p) super.wvg();
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: uf, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> fti(@dd Drawable drawable) {
        return (C1732p) super.fti(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: v5yj, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mcp(@lvui Bitmap.CompressFormat format) {
        return (C1732p) super.mcp(format);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: vss1, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> w831(boolean flag) {
        return (C1732p) super.w831(flag);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: vwb, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> py(@dd Resources.Theme theme) {
        return (C1732p) super.py(theme);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6769z(@lvui AbstractC3039p strategy) {
        return (C1732p) super.mo6769z(strategy);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: wt, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> ki(@dd @fn3e @n5r1 Integer id) {
        return (C1732p) super.ki(id);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @SafeVarargs
    @lvui
    /* JADX INFO: renamed from: wtop, reason: merged with bridge method [inline-methods] */
    public final C1732p<TranscodeType> oki(@dd com.bumptech.glide.n7h<TranscodeType>... builders) {
        return (C1732p) super.oki(builders);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xblq, reason: merged with bridge method [inline-methods] */
    public <Y> C1732p<TranscodeType> g1(@lvui C3138s<Y> option, @lvui Y y3) {
        return (C1732p) super.g1(option, y3);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xm, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> dr(@lvui com.bumptech.glide.load.n7h<Bitmap> transformation) {
        return (C1732p) super.dr(transformation);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xtb7, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> gbni(@zurt(from = 0.0d, to = 1.0d) float value) {
        return (C1732p) super.gbni(value);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: xzl, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> gcp(@dd List<com.bumptech.glide.n7h<TranscodeType>> list) {
        return (C1732p) super.gcp(list);
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: yp31, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6754s(@dd Drawable drawable) {
        return (C1732p) super.mo6754s(drawable);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: yw, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> oc(@lvui com.bumptech.glide.load.toq format) {
        return (C1732p) super.oc(format);
    }

    @Override // com.bumptech.glide.request.AbstractC3168k
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: z4j7, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> z4(boolean flag) {
        return (C1732p) super.z4(flag);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: z4t, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> bek6(Object o2) {
        return (C1732p) super.bek6(o2);
    }

    @Override // com.bumptech.glide.n7h
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: z617, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> lw(@dd com.bumptech.glide.n7h<TranscodeType> builder) {
        return (C1732p) super.lw(builder);
    }

    @Override // com.bumptech.glide.n7h, com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: zff0, reason: merged with bridge method [inline-methods] */
    public C1732p<TranscodeType> mo6750n(@dd Uri uri) {
        return (C1732p) super.mo6750n(uri);
    }

    C1732p(@lvui com.bumptech.glide.zy glide, @lvui com.bumptech.glide.kja0 requestManager, @lvui Class<TranscodeType> transcodeClass, @lvui Context context) {
        super(glide, requestManager, transcodeClass, context);
    }
}
