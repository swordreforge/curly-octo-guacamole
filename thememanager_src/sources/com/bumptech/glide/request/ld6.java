package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C3157n;
import com.bumptech.glide.C3164q;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.engine.cdj;
import com.bumptech.glide.load.engine.ld6;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.target.kja0;
import com.bumptech.glide.util.C3208s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.o1t;

/* JADX INFO: compiled from: SingleRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6<R> implements InterfaceC3170n, kja0, InterfaceC3171p {

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f63022fti = "Glide";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.f7l8<? super R> f63024cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Context f63025f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @o1t("requestLock")
    private long f63026fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @o1t("requestLock")
    @dd
    private Drawable f63027fu4;

    /* JADX INFO: renamed from: g */
    private final InterfaceC3167g f18980g;

    /* JADX INFO: renamed from: h */
    @dd
    private final List<InterfaceC3194y<R>> f18981h;

    /* JADX INFO: renamed from: i */
    @o1t("requestLock")
    private ld6.C3035q f18982i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @dd
    private RuntimeException f63028jk;

    /* JADX INFO: renamed from: k */
    private int f18983k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final Executor f63029ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final InterfaceC3175h<R> f63030kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final AbstractC3168k<?> f63031ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @o1t("requestLock")
    private boolean f63032mcp;

    /* JADX INFO: renamed from: n */
    @dd
    private final InterfaceC3194y<R> f18984n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final EnumC3159p f63033n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @o1t("requestLock")
    private EnumC3169k f63034ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    @o1t("requestLock")
    @dd
    private Drawable f63035o1t;

    /* JADX INFO: renamed from: p */
    private final Class<R> f18985p;

    /* JADX INFO: renamed from: q */
    private final Object f18986q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f63036qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private final Object f18987s;

    /* JADX INFO: renamed from: t */
    @o1t("requestLock")
    private int f18988t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @o1t("requestLock")
    private zurt<R> f63037t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final String f63038toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @o1t("requestLock")
    private int f63039wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f63040x2;

    /* JADX INFO: renamed from: y */
    private final C3157n f18989y;

    /* JADX INFO: renamed from: z */
    @o1t("requestLock")
    @dd
    private Drawable f18990z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.ld6 f63041zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.zy f63042zy;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f63021a9 = "GlideRequest";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final boolean f63023jp0y = Log.isLoggable(f63021a9, 2);

    /* JADX INFO: renamed from: com.bumptech.glide.request.ld6$k */
    /* JADX INFO: compiled from: SingleRequest.java */
    private enum EnumC3169k {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private ld6(Context context, C3157n c3157n, @lvui Object obj, @dd Object obj2, Class<R> cls, AbstractC3168k<?> abstractC3168k, int i2, int i3, EnumC3159p enumC3159p, InterfaceC3175h<R> interfaceC3175h, @dd InterfaceC3194y<R> interfaceC3194y, @dd List<InterfaceC3194y<R>> list, InterfaceC3167g interfaceC3167g, com.bumptech.glide.load.engine.ld6 ld6Var, com.bumptech.glide.request.transition.f7l8<? super R> f7l8Var, Executor executor) {
        this.f63038toq = f63023jp0y ? String.valueOf(super.hashCode()) : null;
        this.f63042zy = com.bumptech.glide.util.pool.zy.m11255k();
        this.f18986q = obj;
        this.f63025f7l8 = context;
        this.f18989y = c3157n;
        this.f18987s = obj2;
        this.f18985p = cls;
        this.f63031ld6 = abstractC3168k;
        this.f63040x2 = i2;
        this.f63036qrj = i3;
        this.f63033n7h = enumC3159p;
        this.f63030kja0 = interfaceC3175h;
        this.f18984n = interfaceC3194y;
        this.f18981h = list;
        this.f18980g = interfaceC3167g;
        this.f63041zurt = ld6Var;
        this.f63024cdj = f7l8Var;
        this.f63029ki = executor;
        this.f63034ni7 = EnumC3169k.PENDING;
        if (this.f63028jk == null && c3157n.f7l8().toq(C3164q.q.class)) {
            this.f63028jk = new RuntimeException("Glide request origin trace");
        }
    }

    @o1t("requestLock")
    private Drawable cdj() {
        if (this.f63035o1t == null) {
            Drawable drawableDd = this.f63031ld6.dd();
            this.f63035o1t = drawableDd;
            if (drawableDd == null && this.f63031ld6.x9kr() > 0) {
                this.f63035o1t = m11166i(this.f63031ld6.x9kr());
            }
        }
        return this.f63035o1t;
    }

    private void fn3e(String str) {
        Log.v(f63021a9, str + " this: " + this.f63038toq);
    }

    @o1t("requestLock")
    private void fu4() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        if (interfaceC3167g != null) {
            interfaceC3167g.mo11150g(this);
        }
    }

    @o1t("requestLock")
    /* JADX INFO: renamed from: h */
    private Drawable m11165h() {
        if (this.f63027fu4 == null) {
            Drawable drawableM11163r = this.f63031ld6.m11163r();
            this.f63027fu4 = drawableM11163r;
            if (drawableM11163r == null && this.f63031ld6.lvui() > 0) {
                this.f63027fu4 = m11166i(this.f63031ld6.lvui());
            }
        }
        return this.f63027fu4;
    }

    @o1t("requestLock")
    /* JADX INFO: renamed from: i */
    private Drawable m11166i(@fn3e int i2) {
        return com.bumptech.glide.load.resource.drawable.zy.m11033k(this.f63025f7l8, i2, this.f63031ld6.nn86() != null ? this.f63031ld6.nn86() : this.f63025f7l8.getTheme());
    }

    @o1t("requestLock")
    private Drawable ki() {
        if (this.f18990z == null) {
            Drawable drawableM11158f = this.f63031ld6.m11158f();
            this.f18990z = drawableM11158f;
            if (drawableM11158f == null && this.f63031ld6.m11156c() > 0) {
                this.f18990z = m11166i(this.f63031ld6.m11156c());
            }
        }
        return this.f18990z;
    }

    private void kja0(Object obj) {
        List<InterfaceC3194y<R>> list = this.f18981h;
        if (list == null) {
            return;
        }
        for (InterfaceC3194y<R> interfaceC3194y : list) {
            if (interfaceC3194y instanceof zy) {
                ((zy) interfaceC3194y).m11215k(obj);
            }
        }
    }

    @o1t("requestLock")
    private boolean ld6() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        return interfaceC3167g == null || interfaceC3167g.mo11152p(this);
    }

    @o1t("requestLock")
    private void n7h() {
        m11167p();
        this.f63042zy.zy();
        this.f63030kja0.toq(this);
        ld6.C3035q c3035q = this.f18982i;
        if (c3035q != null) {
            c3035q.m10789k();
            this.f18982i = null;
        }
    }

    @o1t("requestLock")
    private void ni7() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        if (interfaceC3167g != null) {
            interfaceC3167g.mo11153q(this);
        }
    }

    private void o1t(cdj cdjVar, int i2) {
        boolean zMo6805q;
        this.f63042zy.zy();
        synchronized (this.f18986q) {
            cdjVar.setOrigin(this.f63028jk);
            int iM11122y = this.f18989y.m11122y();
            if (iM11122y <= i2) {
                Log.w(f63022fti, "Load failed for [" + this.f18987s + "] with dimensions [" + this.f63039wvg + AnimatedProperty.PROPERTY_NAME_X + this.f18988t + "]", cdjVar);
                if (iM11122y <= 4) {
                    cdjVar.logRootCauses(f63022fti);
                }
            }
            this.f18982i = null;
            this.f63034ni7 = EnumC3169k.FAILED;
            ni7();
            boolean z2 = true;
            this.f63032mcp = true;
            try {
                List<InterfaceC3194y<R>> list = this.f18981h;
                if (list != null) {
                    Iterator<InterfaceC3194y<R>> it = list.iterator();
                    zMo6805q = false;
                    while (it.hasNext()) {
                        zMo6805q |= it.next().mo6805q(cdjVar, this.f18987s, this.f63030kja0, t8r());
                    }
                } else {
                    zMo6805q = false;
                }
                InterfaceC3194y<R> interfaceC3194y = this.f18984n;
                if (interfaceC3194y == null || !interfaceC3194y.mo6805q(cdjVar, this.f18987s, this.f63030kja0, t8r())) {
                    z2 = false;
                }
                if (!(zMo6805q | z2)) {
                    m11168t();
                }
                this.f63032mcp = false;
                com.bumptech.glide.util.pool.toq.f7l8(f63021a9, this.f18983k);
            } catch (Throwable th) {
                this.f63032mcp = false;
                throw th;
            }
        }
    }

    @o1t("requestLock")
    /* JADX INFO: renamed from: p */
    private void m11167p() {
        if (this.f63032mcp) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @o1t("requestLock")
    private boolean qrj() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        return interfaceC3167g == null || interfaceC3167g.zy(this);
    }

    @o1t("requestLock")
    /* JADX INFO: renamed from: t */
    private void m11168t() {
        if (x2()) {
            Drawable drawableCdj = this.f18987s == null ? cdj() : null;
            if (drawableCdj == null) {
                drawableCdj = m11165h();
            }
            if (drawableCdj == null) {
                drawableCdj = ki();
            }
            this.f63030kja0.mo6802h(drawableCdj);
        }
    }

    @o1t("requestLock")
    private boolean t8r() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        return interfaceC3167g == null || !interfaceC3167g.getRoot().mo11151k();
    }

    @o1t("requestLock")
    private void wvg(zurt<R> zurtVar, R r2, EnumC3050k enumC3050k, boolean z2) {
        boolean zMo6804n;
        boolean zT8r = t8r();
        this.f63034ni7 = EnumC3169k.COMPLETE;
        this.f63037t8r = zurtVar;
        if (this.f18989y.m11122y() <= 3) {
            Log.d(f63022fti, "Finished loading " + r2.getClass().getSimpleName() + " from " + enumC3050k + " for " + this.f18987s + " with size [" + this.f63039wvg + AnimatedProperty.PROPERTY_NAME_X + this.f18988t + "] in " + C3208s.m11263k(this.f63026fn3e) + " ms");
        }
        fu4();
        boolean z3 = true;
        this.f63032mcp = true;
        try {
            List<InterfaceC3194y<R>> list = this.f18981h;
            if (list != null) {
                Iterator<InterfaceC3194y<R>> it = list.iterator();
                zMo6804n = false;
                while (it.hasNext()) {
                    zMo6804n |= it.next().mo6804n(r2, this.f18987s, this.f63030kja0, enumC3050k, zT8r);
                }
            } else {
                zMo6804n = false;
            }
            InterfaceC3194y<R> interfaceC3194y = this.f18984n;
            if (interfaceC3194y == null || !interfaceC3194y.mo6804n(r2, this.f18987s, this.f63030kja0, enumC3050k, zT8r)) {
                z3 = false;
            }
            if (!(z3 | zMo6804n)) {
                this.f63030kja0.qrj(r2, this.f63024cdj.mo11210k(enumC3050k, zT8r));
            }
            this.f63032mcp = false;
            com.bumptech.glide.util.pool.toq.f7l8(f63021a9, this.f18983k);
        } catch (Throwable th) {
            this.f63032mcp = false;
            throw th;
        }
    }

    @o1t("requestLock")
    private boolean x2() {
        InterfaceC3167g interfaceC3167g = this.f18980g;
        return interfaceC3167g == null || interfaceC3167g.toq(this);
    }

    /* JADX INFO: renamed from: z */
    public static <R> ld6<R> m11169z(Context context, C3157n c3157n, Object obj, Object obj2, Class<R> cls, AbstractC3168k<?> abstractC3168k, int i2, int i3, EnumC3159p enumC3159p, InterfaceC3175h<R> interfaceC3175h, InterfaceC3194y<R> interfaceC3194y, @dd List<InterfaceC3194y<R>> list, InterfaceC3167g interfaceC3167g, com.bumptech.glide.load.engine.ld6 ld6Var, com.bumptech.glide.request.transition.f7l8<? super R> f7l8Var, Executor executor) {
        return new ld6<>(context, c3157n, obj, obj2, cls, abstractC3168k, i2, i3, enumC3159p, interfaceC3175h, interfaceC3194y, list, interfaceC3167g, ld6Var, f7l8Var, executor);
    }

    private static int zurt(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * i2);
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void clear() {
        synchronized (this.f18986q) {
            m11167p();
            this.f63042zy.zy();
            EnumC3169k enumC3169k = this.f63034ni7;
            EnumC3169k enumC3169k2 = EnumC3169k.CLEARED;
            if (enumC3169k == enumC3169k2) {
                return;
            }
            n7h();
            zurt<R> zurtVar = this.f63037t8r;
            if (zurtVar != null) {
                this.f63037t8r = null;
            } else {
                zurtVar = null;
            }
            if (ld6()) {
                this.f63030kja0.x2(ki());
            }
            com.bumptech.glide.util.pool.toq.f7l8(f63021a9, this.f18983k);
            this.f63034ni7 = enumC3169k2;
            if (zurtVar != null) {
                this.f63041zurt.x2(zurtVar);
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean f7l8() {
        boolean z2;
        synchronized (this.f18986q) {
            z2 = this.f63034ni7 == EnumC3169k.COMPLETE;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3171p
    /* JADX INFO: renamed from: g */
    public Object mo11170g() {
        this.f63042zy.zy();
        return this.f18986q;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean isRunning() {
        boolean z2;
        synchronized (this.f18986q) {
            EnumC3169k enumC3169k = this.f63034ni7;
            z2 = enumC3169k == EnumC3169k.RUNNING || enumC3169k == EnumC3169k.WAITING_FOR_SIZE;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: k */
    public boolean mo11151k() {
        boolean z2;
        synchronized (this.f18986q) {
            z2 = this.f63034ni7 == EnumC3169k.COMPLETE;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: n */
    public boolean mo11171n() {
        boolean z2;
        synchronized (this.f18986q) {
            z2 = this.f63034ni7 == EnumC3169k.CLEARED;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void pause() {
        synchronized (this.f18986q) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.target.kja0
    /* JADX INFO: renamed from: q */
    public void mo11172q(int i2, int i3) throws Throwable {
        Object obj;
        this.f63042zy.zy();
        Object obj2 = this.f18986q;
        synchronized (obj2) {
            try {
                try {
                    boolean z2 = f63023jp0y;
                    if (z2) {
                        fn3e("Got onSizeReady in " + C3208s.m11263k(this.f63026fn3e));
                    }
                    if (this.f63034ni7 == EnumC3169k.WAITING_FOR_SIZE) {
                        EnumC3169k enumC3169k = EnumC3169k.RUNNING;
                        this.f63034ni7 = enumC3169k;
                        float fM11157e = this.f63031ld6.m11157e();
                        this.f63039wvg = zurt(i2, fM11157e);
                        this.f18988t = zurt(i3, fM11157e);
                        if (z2) {
                            fn3e("finished setup for calling load in " + C3208s.m11263k(this.f63026fn3e));
                        }
                        obj = obj2;
                        try {
                            this.f18982i = this.f63041zurt.f7l8(this.f18989y, this.f18987s, this.f63031ld6.vyq(), this.f63039wvg, this.f18988t, this.f63031ld6.uv6(), this.f18985p, this.f63033n7h, this.f63031ld6.d2ok(), this.f63031ld6.hb(), this.f63031ld6.m11164x(), this.f63031ld6.bf2(), this.f63031ld6.m11160l(), this.f63031ld6.y9n(), this.f63031ld6.m11162o(), this.f63031ld6.m11159j(), this.f63031ld6.ncyb(), this, this.f63029ki);
                            if (this.f63034ni7 != enumC3169k) {
                                this.f18982i = null;
                            }
                            if (z2) {
                                fn3e("finished onSizeReady in " + C3208s.m11263k(this.f63026fn3e));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: s */
    public void mo11173s() {
        synchronized (this.f18986q) {
            m11167p();
            this.f63042zy.zy();
            this.f63026fn3e = C3208s.toq();
            Object obj = this.f18987s;
            if (obj == null) {
                if (com.bumptech.glide.util.kja0.ni7(this.f63040x2, this.f63036qrj)) {
                    this.f63039wvg = this.f63040x2;
                    this.f18988t = this.f63036qrj;
                }
                o1t(new cdj("Received null model"), cdj() == null ? 5 : 3);
                return;
            }
            EnumC3169k enumC3169k = this.f63034ni7;
            EnumC3169k enumC3169k2 = EnumC3169k.RUNNING;
            if (enumC3169k == enumC3169k2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (enumC3169k == EnumC3169k.COMPLETE) {
                toq(this.f63037t8r, EnumC3050k.MEMORY_CACHE, false);
                return;
            }
            kja0(obj);
            this.f18983k = com.bumptech.glide.util.pool.toq.toq(f63021a9);
            EnumC3169k enumC3169k3 = EnumC3169k.WAITING_FOR_SIZE;
            this.f63034ni7 = enumC3169k3;
            if (com.bumptech.glide.util.kja0.ni7(this.f63040x2, this.f63036qrj)) {
                mo11172q(this.f63040x2, this.f63036qrj);
            } else {
                this.f63030kja0.t8r(this);
            }
            EnumC3169k enumC3169k4 = this.f63034ni7;
            if ((enumC3169k4 == enumC3169k2 || enumC3169k4 == enumC3169k3) && x2()) {
                this.f63030kja0.mo6797p(ki());
            }
            if (f63023jp0y) {
                fn3e("finished run method in " + C3208s.m11263k(this.f63026fn3e));
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f18986q) {
            obj = this.f18987s;
            cls = this.f18985p;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.InterfaceC3171p
    public void toq(zurt<?> zurtVar, EnumC3050k enumC3050k, boolean z2) {
        this.f63042zy.zy();
        zurt<?> zurtVar2 = null;
        try {
            synchronized (this.f18986q) {
                try {
                    this.f18982i = null;
                    if (zurtVar == null) {
                        zy(new cdj("Expected to receive a Resource<R> with an object of " + this.f18985p + " inside, but instead got null."));
                        return;
                    }
                    Object obj = zurtVar.get();
                    try {
                        if (obj != null && this.f18985p.isAssignableFrom(obj.getClass())) {
                            if (qrj()) {
                                wvg(zurtVar, obj, enumC3050k, z2);
                                return;
                            }
                            this.f63037t8r = null;
                            this.f63034ni7 = EnumC3169k.COMPLETE;
                            com.bumptech.glide.util.pool.toq.f7l8(f63021a9, this.f18983k);
                            this.f63041zurt.x2(zurtVar);
                            return;
                        }
                        this.f63037t8r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f18985p);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(zurtVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        zy(new cdj(sb.toString()));
                        this.f63041zurt.x2(zurtVar);
                    } catch (Throwable th) {
                        zurtVar2 = zurtVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (zurtVar2 != null) {
                this.f63041zurt.x2(zurtVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: y */
    public boolean mo11174y(InterfaceC3170n interfaceC3170n) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        AbstractC3168k<?> abstractC3168k;
        EnumC3159p enumC3159p;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        AbstractC3168k<?> abstractC3168k2;
        EnumC3159p enumC3159p2;
        int size2;
        if (!(interfaceC3170n instanceof ld6)) {
            return false;
        }
        synchronized (this.f18986q) {
            i2 = this.f63040x2;
            i3 = this.f63036qrj;
            obj = this.f18987s;
            cls = this.f18985p;
            abstractC3168k = this.f63031ld6;
            enumC3159p = this.f63033n7h;
            List<InterfaceC3194y<R>> list = this.f18981h;
            size = list != null ? list.size() : 0;
        }
        ld6 ld6Var = (ld6) interfaceC3170n;
        synchronized (ld6Var.f18986q) {
            i4 = ld6Var.f63040x2;
            i5 = ld6Var.f63036qrj;
            obj2 = ld6Var.f18987s;
            cls2 = ld6Var.f18985p;
            abstractC3168k2 = ld6Var.f63031ld6;
            enumC3159p2 = ld6Var.f63033n7h;
            List<InterfaceC3194y<R>> list2 = ld6Var.f18981h;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i2 == i4 && i3 == i5 && com.bumptech.glide.util.kja0.zy(obj, obj2) && cls.equals(cls2) && abstractC3168k.equals(abstractC3168k2) && enumC3159p == enumC3159p2 && size == size2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3171p
    public void zy(cdj cdjVar) {
        o1t(cdjVar, 5);
    }
}
