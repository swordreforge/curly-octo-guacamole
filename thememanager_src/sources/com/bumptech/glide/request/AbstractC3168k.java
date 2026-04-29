package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.C3139y;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.load.n7h;
import com.bumptech.glide.load.resource.bitmap.AbstractC3101h;
import com.bumptech.glide.load.resource.bitmap.C3110n;
import com.bumptech.glide.load.resource.bitmap.cdj;
import com.bumptech.glide.load.resource.bitmap.eqxt;
import com.bumptech.glide.load.resource.bitmap.qrj;
import com.bumptech.glide.load.resource.bitmap.t8r;
import com.bumptech.glide.load.resource.gif.C3125g;
import com.bumptech.glide.load.resource.gif.C3130s;
import com.bumptech.glide.request.AbstractC3168k;
import com.bumptech.glide.util.kja0;
import java.util.Map;
import zy.InterfaceC7839p;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: com.bumptech.glide.request.k */
/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3168k<T extends AbstractC3168k<T>> implements Cloneable {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f63019ab = 2;
    private static final int ac = 32768;
    private static final int ad = 65536;
    private static final int aj = 1048576;
    private static final int am = 131072;
    private static final int an = 32;
    private static final int as = 512;
    private static final int ax = 8192;
    private static final int ay = 262144;
    private static final int az = 2048;
    private static final int ba = 4096;
    private static final int bb = 4;
    private static final int be = 524288;
    private static final int bg = 1024;
    private static final int bl = 256;
    private static final int bp = 8;
    private static final int bq = 16384;
    private static final int bv = 16;
    private static final int id = 64;
    private static final int in = 128;

    /* JADX INFO: renamed from: w */
    private static final int f18954w = -1;

    /* JADX INFO: renamed from: a */
    @dd
    private Resources.Theme f18955a;

    /* JADX INFO: renamed from: b */
    private boolean f18956b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f63020bo;

    /* JADX INFO: renamed from: c */
    @dd
    private Drawable f18957c;

    /* JADX INFO: renamed from: d */
    private boolean f18958d;

    /* JADX INFO: renamed from: e */
    private int f18959e;

    /* JADX INFO: renamed from: h */
    private int f18962h;

    /* JADX INFO: renamed from: k */
    private int f18965k;

    /* JADX INFO: renamed from: l */
    private boolean f18966l;

    /* JADX INFO: renamed from: p */
    @dd
    private Drawable f18970p;

    /* JADX INFO: renamed from: s */
    private int f18973s;

    /* JADX INFO: renamed from: u */
    private boolean f18975u;

    /* JADX INFO: renamed from: x */
    private boolean f18977x;

    /* JADX INFO: renamed from: y */
    @dd
    private Drawable f18978y;

    /* JADX INFO: renamed from: q */
    private float f18971q = 1.0f;

    /* JADX INFO: renamed from: n */
    @lvui
    private AbstractC3039p f18968n = AbstractC3039p.f18437n;

    /* JADX INFO: renamed from: g */
    @lvui
    private EnumC3159p f18961g = EnumC3159p.NORMAL;

    /* JADX INFO: renamed from: i */
    private boolean f18963i = true;

    /* JADX INFO: renamed from: z */
    private int f18979z = -1;

    /* JADX INFO: renamed from: t */
    private int f18974t = -1;

    /* JADX INFO: renamed from: r */
    @lvui
    private com.bumptech.glide.load.f7l8 f18972r = com.bumptech.glide.signature.zy.zy();

    /* JADX INFO: renamed from: f */
    private boolean f18960f = true;

    /* JADX INFO: renamed from: j */
    @lvui
    private C3087p f18964j = new C3087p();

    /* JADX INFO: renamed from: o */
    @lvui
    private Map<Class<?>, n7h<?>> f18969o = new com.bumptech.glide.util.toq();

    /* JADX INFO: renamed from: m */
    @lvui
    private Class<?> f18967m = Object.class;

    /* JADX INFO: renamed from: v */
    private boolean f18976v = true;

    private static boolean a98o(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    @lvui
    private T gyi(@lvui AbstractC3101h abstractC3101h, @lvui n7h<Bitmap> n7hVar) {
        return (T) tfm(abstractC3101h, n7hVar, false);
    }

    private boolean i1(int i2) {
        return a98o(this.f18965k, i2);
    }

    @lvui
    private T qo(@lvui AbstractC3101h abstractC3101h, @lvui n7h<Bitmap> n7hVar) {
        return (T) tfm(abstractC3101h, n7hVar, true);
    }

    @lvui
    private T tfm(@lvui AbstractC3101h abstractC3101h, @lvui n7h<Bitmap> n7hVar, boolean z2) {
        T t2 = z2 ? (T) m4(abstractC3101h, n7hVar) : (T) xwq3(abstractC3101h, n7hVar);
        t2.f18976v = true;
        return t2;
    }

    private T wo() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11154a() {
        return i1(256);
    }

    @InterfaceC7839p
    @lvui
    public T a9(@fn3e int i2) {
        if (this.f18977x) {
            return (T) zurt().a9(i2);
        }
        this.f18973s = i2;
        int i3 = this.f18965k | 32;
        this.f18978y = null;
        this.f18965k = i3 & (-17);
        return (T) d8wk();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11155b() {
        return i1(8);
    }

    boolean bf2() {
        return this.f18976v;
    }

    @InterfaceC7839p
    @lvui
    public T bo() {
        return (T) gyi(AbstractC3101h.f18701q, new qrj());
    }

    /* JADX INFO: renamed from: c */
    public final int m11156c() {
        return this.f18962h;
    }

    @InterfaceC7839p
    @lvui
    public T c8jq() {
        return (T) gyi(AbstractC3101h.f62895zy, new com.bumptech.glide.load.resource.bitmap.fn3e());
    }

    @InterfaceC7839p
    @lvui
    @Deprecated
    public T cfr(@lvui n7h<Bitmap>... n7hVarArr) {
        return (T) r8s8(new C3139y(n7hVarArr), true);
    }

    public final boolean ch() {
        return i1(2048);
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: d */
    public T mo6763d(int i2, int i3) {
        if (this.f18977x) {
            return (T) zurt().mo6763d(i2, i3);
        }
        this.f18974t = i2;
        this.f18979z = i3;
        this.f18965k |= 512;
        return (T) d8wk();
    }

    @lvui
    public final AbstractC3039p d2ok() {
        return this.f18968n;
    }

    @InterfaceC7839p
    @lvui
    public T d3() {
        return (T) qo(AbstractC3101h.f62895zy, new com.bumptech.glide.load.resource.bitmap.fn3e());
    }

    @lvui
    protected final T d8wk() {
        if (this.f18956b) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) wo();
    }

    @dd
    public final Drawable dd() {
        return this.f18957c;
    }

    @InterfaceC7839p
    @lvui
    public T dr(@lvui n7h<Bitmap> n7hVar) {
        return (T) r8s8(n7hVar, false);
    }

    /* JADX INFO: renamed from: e */
    public final float m11157e() {
        return this.f18971q;
    }

    public final boolean ek5k() {
        return i1(4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC3168k)) {
            return false;
        }
        AbstractC3168k abstractC3168k = (AbstractC3168k) obj;
        return Float.compare(abstractC3168k.f18971q, this.f18971q) == 0 && this.f18973s == abstractC3168k.f18973s && kja0.m11231q(this.f18978y, abstractC3168k.f18978y) && this.f18962h == abstractC3168k.f18962h && kja0.m11231q(this.f18970p, abstractC3168k.f18970p) && this.f18959e == abstractC3168k.f18959e && kja0.m11231q(this.f18957c, abstractC3168k.f18957c) && this.f18963i == abstractC3168k.f18963i && this.f18979z == abstractC3168k.f18979z && this.f18974t == abstractC3168k.f18974t && this.f18966l == abstractC3168k.f18966l && this.f18960f == abstractC3168k.f18960f && this.f18975u == abstractC3168k.f18975u && this.f63020bo == abstractC3168k.f63020bo && this.f18968n.equals(abstractC3168k.f18968n) && this.f18961g == abstractC3168k.f18961g && this.f18964j.equals(abstractC3168k.f18964j) && this.f18969o.equals(abstractC3168k.f18969o) && this.f18967m.equals(abstractC3168k.f18967m) && kja0.m11231q(this.f18972r, abstractC3168k.f18972r) && kja0.m11231q(this.f18955a, abstractC3168k.f18955a);
    }

    @InterfaceC7839p
    @lvui
    public T eqxt(@a9(from = 0) long j2) {
        return (T) g1(eqxt.f62875f7l8, Long.valueOf(j2));
    }

    @lvui
    <Y> T etdu(@lvui Class<Y> cls, @lvui n7h<Y> n7hVar, boolean z2) {
        if (this.f18977x) {
            return (T) zurt().etdu(cls, n7hVar, z2);
        }
        com.bumptech.glide.util.qrj.m11262q(cls);
        com.bumptech.glide.util.qrj.m11262q(n7hVar);
        this.f18969o.put(cls, n7hVar);
        int i2 = this.f18965k | 2048;
        this.f18960f = true;
        int i3 = i2 | 65536;
        this.f18965k = i3;
        this.f18976v = false;
        if (z2) {
            this.f18965k = i3 | 131072;
            this.f18966l = true;
        }
        return (T) d8wk();
    }

    @dd
    /* JADX INFO: renamed from: f */
    public final Drawable m11158f() {
        return this.f18970p;
    }

    @InterfaceC7839p
    @lvui
    public T fn3e() {
        return (T) m4(AbstractC3101h.f18701q, new com.bumptech.glide.load.resource.bitmap.n7h());
    }

    T fnq8(@lvui C3138s<?> c3138s) {
        if (this.f18977x) {
            return (T) zurt().fnq8(c3138s);
        }
        this.f18964j.m10928n(c3138s);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T fti(@dd Drawable drawable) {
        if (this.f18977x) {
            return (T) zurt().fti(drawable);
        }
        this.f18978y = drawable;
        int i2 = this.f18965k | 16;
        this.f18973s = 0;
        this.f18965k = i2 & (-33);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T fu4() {
        return (T) g1(cdj.f62869ld6, Boolean.FALSE);
    }

    @InterfaceC7839p
    @lvui
    public <Y> T g1(@lvui C3138s<Y> c3138s, @lvui Y y3) {
        if (this.f18977x) {
            return (T) zurt().g1(c3138s, y3);
        }
        com.bumptech.glide.util.qrj.m11262q(c3138s);
        com.bumptech.glide.util.qrj.m11262q(y3);
        this.f18964j.m10927g(c3138s, y3);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T gbni(@zurt(from = 0.0d, to = 1.0d) float f2) {
        if (this.f18977x) {
            return (T) zurt().gbni(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f18971q = f2;
        this.f18965k |= 2;
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T gvn7(@dd Drawable drawable) {
        if (this.f18977x) {
            return (T) zurt().gvn7(drawable);
        }
        this.f18957c = drawable;
        int i2 = this.f18965k | 8192;
        this.f18959e = 0;
        this.f18965k = i2 & (-16385);
        return (T) d8wk();
    }

    public int hashCode() {
        return kja0.cdj(this.f18955a, kja0.cdj(this.f18972r, kja0.cdj(this.f18967m, kja0.cdj(this.f18969o, kja0.cdj(this.f18964j, kja0.cdj(this.f18961g, kja0.cdj(this.f18968n, kja0.t8r(this.f63020bo, kja0.t8r(this.f18975u, kja0.t8r(this.f18960f, kja0.t8r(this.f18966l, kja0.m11226h(this.f18974t, kja0.m11226h(this.f18979z, kja0.t8r(this.f18963i, kja0.cdj(this.f18957c, kja0.m11226h(this.f18959e, kja0.cdj(this.f18970p, kja0.m11226h(this.f18962h, kja0.cdj(this.f18978y, kja0.m11226h(this.f18973s, kja0.qrj(this.f18971q)))))))))))))))))))));
    }

    @lvui
    public final Map<Class<?>, n7h<?>> hb() {
        return this.f18969o;
    }

    public final int hyr() {
        return this.f18974t;
    }

    @InterfaceC7839p
    @lvui
    public T i9jn(@a9(from = 0) int i2) {
        return (T) g1(com.bumptech.glide.load.model.stream.toq.f62855toq, Integer.valueOf(i2));
    }

    @InterfaceC7839p
    @lvui
    public T ikck(int i2) {
        return (T) mo6763d(i2, i2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11159j() {
        return this.f18958d;
    }

    @InterfaceC7839p
    @lvui
    public T jk(@a9(from = 0, to = 100) int i2) {
        return (T) g1(C3110n.f62922toq, Integer.valueOf(i2));
    }

    @InterfaceC7839p
    @lvui
    public T jp0y(@fn3e int i2) {
        if (this.f18977x) {
            return (T) zurt().jp0y(i2);
        }
        this.f18959e = i2;
        int i3 = this.f18965k | 16384;
        this.f18957c = null;
        this.f18965k = i3 & (-8193);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: k */
    public T mo6764k(@lvui AbstractC3168k<?> abstractC3168k) {
        if (this.f18977x) {
            return (T) zurt().mo6764k(abstractC3168k);
        }
        if (a98o(abstractC3168k.f18965k, 2)) {
            this.f18971q = abstractC3168k.f18971q;
        }
        if (a98o(abstractC3168k.f18965k, 262144)) {
            this.f18975u = abstractC3168k.f18975u;
        }
        if (a98o(abstractC3168k.f18965k, 1048576)) {
            this.f18958d = abstractC3168k.f18958d;
        }
        if (a98o(abstractC3168k.f18965k, 4)) {
            this.f18968n = abstractC3168k.f18968n;
        }
        if (a98o(abstractC3168k.f18965k, 8)) {
            this.f18961g = abstractC3168k.f18961g;
        }
        if (a98o(abstractC3168k.f18965k, 16)) {
            this.f18978y = abstractC3168k.f18978y;
            this.f18973s = 0;
            this.f18965k &= -33;
        }
        if (a98o(abstractC3168k.f18965k, 32)) {
            this.f18973s = abstractC3168k.f18973s;
            this.f18978y = null;
            this.f18965k &= -17;
        }
        if (a98o(abstractC3168k.f18965k, 64)) {
            this.f18970p = abstractC3168k.f18970p;
            this.f18962h = 0;
            this.f18965k &= -129;
        }
        if (a98o(abstractC3168k.f18965k, 128)) {
            this.f18962h = abstractC3168k.f18962h;
            this.f18970p = null;
            this.f18965k &= -65;
        }
        if (a98o(abstractC3168k.f18965k, 256)) {
            this.f18963i = abstractC3168k.f18963i;
        }
        if (a98o(abstractC3168k.f18965k, 512)) {
            this.f18974t = abstractC3168k.f18974t;
            this.f18979z = abstractC3168k.f18979z;
        }
        if (a98o(abstractC3168k.f18965k, 1024)) {
            this.f18972r = abstractC3168k.f18972r;
        }
        if (a98o(abstractC3168k.f18965k, 4096)) {
            this.f18967m = abstractC3168k.f18967m;
        }
        if (a98o(abstractC3168k.f18965k, 8192)) {
            this.f18957c = abstractC3168k.f18957c;
            this.f18959e = 0;
            this.f18965k &= -16385;
        }
        if (a98o(abstractC3168k.f18965k, 16384)) {
            this.f18959e = abstractC3168k.f18959e;
            this.f18957c = null;
            this.f18965k &= -8193;
        }
        if (a98o(abstractC3168k.f18965k, 32768)) {
            this.f18955a = abstractC3168k.f18955a;
        }
        if (a98o(abstractC3168k.f18965k, 65536)) {
            this.f18960f = abstractC3168k.f18960f;
        }
        if (a98o(abstractC3168k.f18965k, 131072)) {
            this.f18966l = abstractC3168k.f18966l;
        }
        if (a98o(abstractC3168k.f18965k, 2048)) {
            this.f18969o.putAll(abstractC3168k.f18969o);
            this.f18976v = abstractC3168k.f18976v;
        }
        if (a98o(abstractC3168k.f18965k, 524288)) {
            this.f63020bo = abstractC3168k.f63020bo;
        }
        if (!this.f18960f) {
            this.f18969o.clear();
            int i2 = this.f18965k & (-2049);
            this.f18966l = false;
            this.f18965k = i2 & (-131073);
            this.f18976v = true;
        }
        this.f18965k |= abstractC3168k.f18965k;
        this.f18964j.m10929q(abstractC3168k.f18964j);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T kja0() {
        return (T) m4(AbstractC3101h.f18700n, new com.bumptech.glide.load.resource.bitmap.x2());
    }

    @lvui
    /* JADX INFO: renamed from: l */
    public final C3087p m11160l() {
        return this.f18964j;
    }

    @lvui
    public final EnumC3159p lrht() {
        return this.f18961g;
    }

    @InterfaceC7839p
    @lvui
    public T ltg8(@lvui n7h<Bitmap> n7hVar) {
        return (T) r8s8(n7hVar, true);
    }

    @lvui
    public T lv5() {
        this.f18956b = true;
        return (T) wo();
    }

    public final int lvui() {
        return this.f18973s;
    }

    /* JADX INFO: renamed from: m */
    protected final boolean m11161m() {
        return this.f18977x;
    }

    @InterfaceC7839p
    @lvui
    final T m4(@lvui AbstractC3101h abstractC3101h, @lvui n7h<Bitmap> n7hVar) {
        if (this.f18977x) {
            return (T) zurt().m4(abstractC3101h, n7hVar);
        }
        mo6765t(abstractC3101h);
        return (T) ltg8(n7hVar);
    }

    @InterfaceC7839p
    @lvui
    public T mcp(@lvui Bitmap.CompressFormat compressFormat) {
        return (T) g1(C3110n.f62923zy, com.bumptech.glide.util.qrj.m11262q(compressFormat));
    }

    @InterfaceC7839p
    @lvui
    public T mu(@fn3e int i2) {
        if (this.f18977x) {
            return (T) zurt().mu(i2);
        }
        this.f18962h = i2;
        int i3 = this.f18965k | 128;
        this.f18970p = null;
        this.f18965k = i3 & (-65);
        return (T) d8wk();
    }

    public final int n5r1() {
        return this.f18979z;
    }

    public final boolean ncyb() {
        return this.f63020bo;
    }

    @InterfaceC7839p
    @lvui
    public T ni7(@lvui Class<?> cls) {
        if (this.f18977x) {
            return (T) zurt().ni7(cls);
        }
        this.f18967m = (Class) com.bumptech.glide.util.qrj.m11262q(cls);
        this.f18965k |= 4096;
        return (T) d8wk();
    }

    public final boolean nmn5() {
        return kja0.ni7(this.f18974t, this.f18979z);
    }

    @dd
    public final Resources.Theme nn86() {
        return this.f18955a;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11162o() {
        return this.f18975u;
    }

    @InterfaceC7839p
    @lvui
    public T o1t() {
        return (T) g1(C3130s.f62965toq, Boolean.TRUE);
    }

    @InterfaceC7839p
    @lvui
    public T oc(@lvui com.bumptech.glide.load.toq toqVar) {
        com.bumptech.glide.util.qrj.m11262q(toqVar);
        return (T) g1(cdj.f62867f7l8, toqVar).g1(C3130s.f18806k, toqVar);
    }

    @InterfaceC7839p
    @lvui
    public T py(@dd Resources.Theme theme) {
        if (this.f18977x) {
            return (T) zurt().py(theme);
        }
        this.f18955a = theme;
        if (theme != null) {
            this.f18965k |= 32768;
            return (T) g1(com.bumptech.glide.load.resource.drawable.f7l8.f62944toq, theme);
        }
        this.f18965k &= -32769;
        return (T) fnq8(com.bumptech.glide.load.resource.drawable.f7l8.f62944toq);
    }

    @InterfaceC7839p
    @lvui
    public T qkj8(@lvui EnumC3159p enumC3159p) {
        if (this.f18977x) {
            return (T) zurt().qkj8(enumC3159p);
        }
        this.f18961g = (EnumC3159p) com.bumptech.glide.util.qrj.m11262q(enumC3159p);
        this.f18965k |= 8;
        return (T) d8wk();
    }

    @lvui
    public T qrj() {
        if (this.f18956b && !this.f18977x) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f18977x = true;
        return (T) lv5();
    }

    @dd
    /* JADX INFO: renamed from: r */
    public final Drawable m11163r() {
        return this.f18978y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    T r8s8(@lvui n7h<Bitmap> n7hVar, boolean z2) {
        if (this.f18977x) {
            return (T) zurt().r8s8(n7hVar, z2);
        }
        t8r t8rVar = new t8r(n7hVar, z2);
        etdu(Bitmap.class, n7hVar, z2);
        etdu(Drawable.class, t8rVar, z2);
        etdu(BitmapDrawable.class, t8rVar.zy(), z2);
        etdu(com.bumptech.glide.load.resource.gif.zy.class, new C3125g(n7hVar), z2);
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T sok(@lvui n7h<Bitmap>... n7hVarArr) {
        return n7hVarArr.length > 1 ? (T) r8s8(new C3139y(n7hVarArr), true) : n7hVarArr.length == 1 ? (T) ltg8(n7hVarArr[0]) : (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: t */
    public T mo6765t(@lvui AbstractC3101h abstractC3101h) {
        return (T) g1(AbstractC3101h.f18703y, com.bumptech.glide.util.qrj.m11262q(abstractC3101h));
    }

    @InterfaceC7839p
    @lvui
    public T t8iq(boolean z2) {
        if (this.f18977x) {
            return (T) zurt().t8iq(z2);
        }
        this.f63020bo = z2;
        this.f18965k |= 524288;
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T t8r() {
        return (T) qo(AbstractC3101h.f18701q, new qrj());
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: u */
    public T mo6766u() {
        return (T) xwq3(AbstractC3101h.f18700n, new com.bumptech.glide.load.resource.bitmap.x2());
    }

    @lvui
    public final Class<?> uv6() {
        return this.f18967m;
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: v */
    public <Y> T mo6767v(@lvui Class<Y> cls, @lvui n7h<Y> n7hVar) {
        return (T) etdu(cls, n7hVar, false);
    }

    @InterfaceC7839p
    @lvui
    public <Y> T v0af(@lvui Class<Y> cls, @lvui n7h<Y> n7hVar) {
        return (T) etdu(cls, n7hVar, true);
    }

    @InterfaceC7839p
    @lvui
    public T vq(@dd Drawable drawable) {
        if (this.f18977x) {
            return (T) zurt().vq(drawable);
        }
        this.f18970p = drawable;
        int i2 = this.f18965k | 64;
        this.f18962h = 0;
        this.f18965k = i2 & (-129);
        return (T) d8wk();
    }

    @lvui
    public final com.bumptech.glide.load.f7l8 vyq() {
        return this.f18972r;
    }

    @InterfaceC7839p
    @lvui
    public T w831(boolean z2) {
        if (this.f18977x) {
            return (T) zurt().w831(z2);
        }
        this.f18958d = z2;
        this.f18965k |= 1048576;
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T was(@lvui com.bumptech.glide.load.f7l8 f7l8Var) {
        if (this.f18977x) {
            return (T) zurt().was(f7l8Var);
        }
        this.f18972r = (com.bumptech.glide.load.f7l8) com.bumptech.glide.util.qrj.m11262q(f7l8Var);
        this.f18965k |= 1024;
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T wvg() {
        if (this.f18977x) {
            return (T) zurt().wvg();
        }
        this.f18969o.clear();
        int i2 = this.f18965k & (-2049);
        this.f18966l = false;
        this.f18960f = false;
        this.f18965k = (i2 & (-131073)) | 65536;
        this.f18976v = true;
        return (T) d8wk();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11164x() {
        return this.f18966l;
    }

    public final int x9kr() {
        return this.f18959e;
    }

    @lvui
    final T xwq3(@lvui AbstractC3101h abstractC3101h, @lvui n7h<Bitmap> n7hVar) {
        if (this.f18977x) {
            return (T) zurt().xwq3(abstractC3101h, n7hVar);
        }
        mo6765t(abstractC3101h);
        return (T) r8s8(n7hVar, false);
    }

    @InterfaceC7839p
    @lvui
    public T y2() {
        return (T) xwq3(AbstractC3101h.f18700n, new com.bumptech.glide.load.resource.bitmap.n7h());
    }

    public final boolean y9n() {
        return this.f18963i;
    }

    public final boolean yz() {
        return this.f18956b;
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: z */
    public T mo6769z(@lvui AbstractC3039p abstractC3039p) {
        if (this.f18977x) {
            return (T) zurt().mo6769z(abstractC3039p);
        }
        this.f18968n = (AbstractC3039p) com.bumptech.glide.util.qrj.m11262q(abstractC3039p);
        this.f18965k |= 4;
        return (T) d8wk();
    }

    @InterfaceC7839p
    @lvui
    public T z4(boolean z2) {
        if (this.f18977x) {
            return (T) zurt().z4(z2);
        }
        this.f18975u = z2;
        this.f18965k |= 262144;
        return (T) d8wk();
    }

    public final boolean zp() {
        return this.f18960f;
    }

    @InterfaceC7839p
    @lvui
    public T zsr0(boolean z2) {
        if (this.f18977x) {
            return (T) zurt().zsr0(true);
        }
        this.f18963i = !z2;
        this.f18965k |= 256;
        return (T) d8wk();
    }

    @Override // 
    @InterfaceC7839p
    public T zurt() {
        try {
            T t2 = (T) super.clone();
            C3087p c3087p = new C3087p();
            t2.f18964j = c3087p;
            c3087p.m10929q(this.f18964j);
            com.bumptech.glide.util.toq toqVar = new com.bumptech.glide.util.toq();
            t2.f18969o = toqVar;
            toqVar.putAll(this.f18969o);
            t2.f18956b = false;
            t2.f18977x = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
