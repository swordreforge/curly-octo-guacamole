package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.collection.C0247k;
import com.bumptech.glide.C2972g;
import com.bumptech.glide.load.engine.bitmap_recycle.C3003g;
import com.bumptech.glide.load.engine.bitmap_recycle.C3009p;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.engine.cache.C3021s;
import com.bumptech.glide.load.engine.cache.C3024y;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.engine.cache.x2;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k;
import com.bumptech.glide.manager.C3142g;
import com.bumptech.glide.manager.InterfaceC3149q;
import com.bumptech.glide.manager.cdj;
import com.bumptech.glide.module.AbstractC3154k;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.zy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.q */
/* JADX INFO: compiled from: GlideBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3164q {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private List<InterfaceC3194y<Object>> f63007cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ExecutorServiceC3027k f63008f7l8;

    /* JADX INFO: renamed from: g */
    private InterfaceC3018p f18929g;

    /* JADX INFO: renamed from: h */
    private boolean f18930h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ExecutorServiceC3027k f63009kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private InterfaceC3149q f63010ld6;

    /* JADX INFO: renamed from: n */
    private com.bumptech.glide.load.engine.bitmap_recycle.toq f18932n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private cdj.toq f63011n7h;

    /* JADX INFO: renamed from: p */
    private com.bumptech.glide.load.engine.cache.x2 f18933p;

    /* JADX INFO: renamed from: q */
    private InterfaceC3008n f18934q;

    /* JADX INFO: renamed from: s */
    private InterfaceC3016k.k f18935s;

    /* JADX INFO: renamed from: y */
    private ExecutorServiceC3027k f18936y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private com.bumptech.glide.load.engine.ld6 f63015zy;

    /* JADX INFO: renamed from: k */
    private final Map<Class<?>, AbstractC2977h<?, ?>> f18931k = new C0247k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C2972g.k f63013toq = new C2972g.k();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f63014x2 = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private zy.InterfaceC3214k f63012qrj = new k();

    /* JADX INFO: renamed from: com.bumptech.glide.q$f7l8 */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class f7l8 implements C2972g.toq {
        private f7l8() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$g */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class g implements C2972g.toq {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$k */
    /* JADX INFO: compiled from: GlideBuilder.java */
    class k implements zy.InterfaceC3214k {
        k() {
        }

        @Override // com.bumptech.glide.zy.InterfaceC3214k
        @lvui
        public C3173s build() {
            return new C3173s();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$n */
    /* JADX INFO: compiled from: GlideBuilder.java */
    static final class n implements C2972g.toq {

        /* JADX INFO: renamed from: k */
        final int f18938k;

        n(int i2) {
            this.f18938k = i2;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$q */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class q implements C2972g.toq {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$toq */
    /* JADX INFO: compiled from: GlideBuilder.java */
    class toq implements zy.InterfaceC3214k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C3173s f18939k;

        toq(C3173s c3173s) {
            this.f18939k = c3173s;
        }

        @Override // com.bumptech.glide.zy.InterfaceC3214k
        @lvui
        public C3173s build() {
            C3173s c3173s = this.f18939k;
            return c3173s != null ? c3173s : new C3173s();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.q$zy */
    /* JADX INFO: compiled from: GlideBuilder.java */
    static final class zy implements C2972g.toq {
        zy() {
        }
    }

    @lvui
    public C3164q cdj(@dd InterfaceC3018p interfaceC3018p) {
        this.f18929g = interfaceC3018p;
        return this;
    }

    @lvui
    public C3164q f7l8(@lvui zy.InterfaceC3214k interfaceC3214k) {
        this.f63012qrj = (zy.InterfaceC3214k) com.bumptech.glide.util.qrj.m11262q(interfaceC3214k);
        return this;
    }

    @Deprecated
    public C3164q fn3e(@dd ExecutorServiceC3027k executorServiceC3027k) {
        return zurt(executorServiceC3027k);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public C3164q m11136g(@dd InterfaceC3149q interfaceC3149q) {
        this.f63010ld6 = interfaceC3149q;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C3164q m11137h(boolean z2) {
        this.f63013toq.m10583q(new q(), z2);
        return this;
    }

    /* JADX INFO: renamed from: i */
    void m11138i(@dd cdj.toq toqVar) {
        this.f63011n7h = toqVar;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public C3164q m11139k(@lvui InterfaceC3194y<Object> interfaceC3194y) {
        if (this.f63007cdj == null) {
            this.f63007cdj = new ArrayList();
        }
        this.f63007cdj.add(interfaceC3194y);
        return this;
    }

    @lvui
    public C3164q ki(@lvui x2.C3023k c3023k) {
        return t8r(c3023k.m10730k());
    }

    @lvui
    public C3164q kja0(int i2) {
        if (i2 < 2 || i2 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f63014x2 = i2;
        return this;
    }

    @lvui
    public C3164q ld6(@dd ExecutorServiceC3027k executorServiceC3027k) {
        this.f18936y = executorServiceC3027k;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public C3164q m11140n(@dd InterfaceC3008n interfaceC3008n) {
        this.f18934q = interfaceC3008n;
        return this;
    }

    @lvui
    public C3164q n7h(boolean z2) {
        this.f18930h = z2;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public C3164q m11141p(@dd InterfaceC3016k.k kVar) {
        this.f18935s = kVar;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public C3164q m11142q(@dd com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18932n = toqVar;
        return this;
    }

    public C3164q qrj(boolean z2) {
        this.f63013toq.m10583q(new zy(), z2 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public <T> C3164q m11143s(@lvui Class<T> cls, @dd AbstractC2977h<?, T> abstractC2977h) {
        this.f18931k.put(cls, abstractC2977h);
        return this;
    }

    @lvui
    public C3164q t8r(@dd com.bumptech.glide.load.engine.cache.x2 x2Var) {
        this.f18933p = x2Var;
        return this;
    }

    @lvui
    com.bumptech.glide.zy toq(@lvui Context context, List<com.bumptech.glide.module.zy> list, AbstractC3154k abstractC3154k) {
        if (this.f63008f7l8 == null) {
            this.f63008f7l8 = ExecutorServiceC3027k.ld6();
        }
        if (this.f18936y == null) {
            this.f18936y = ExecutorServiceC3027k.f7l8();
        }
        if (this.f63009kja0 == null) {
            this.f63009kja0 = ExecutorServiceC3027k.m10745q();
        }
        if (this.f18933p == null) {
            this.f18933p = new x2.C3023k(context).m10730k();
        }
        if (this.f63010ld6 == null) {
            this.f63010ld6 = new C3142g();
        }
        if (this.f18934q == null) {
            int qVar = this.f18933p.toq();
            if (qVar > 0) {
                this.f18934q = new com.bumptech.glide.load.engine.bitmap_recycle.ld6(qVar);
            } else {
                this.f18934q = new C3003g();
            }
        }
        if (this.f18932n == null) {
            this.f18932n = new C3009p(this.f18933p.m10727k());
        }
        if (this.f18929g == null) {
            this.f18929g = new C3021s(this.f18933p.m10728q());
        }
        if (this.f18935s == null) {
            this.f18935s = new C3024y(context);
        }
        if (this.f63015zy == null) {
            this.f63015zy = new com.bumptech.glide.load.engine.ld6(this.f18929g, this.f18935s, this.f18936y, this.f63008f7l8, ExecutorServiceC3027k.n7h(), this.f63009kja0, this.f18930h);
        }
        List<InterfaceC3194y<Object>> list2 = this.f63007cdj;
        if (list2 == null) {
            this.f63007cdj = Collections.emptyList();
        } else {
            this.f63007cdj = Collections.unmodifiableList(list2);
        }
        C2972g c2972gZy = this.f63013toq.zy();
        return new com.bumptech.glide.zy(context, this.f63015zy, this.f18929g, this.f18934q, this.f18932n, new cdj(this.f63011n7h, c2972gZy), this.f63010ld6, this.f63014x2, this.f63012qrj, this.f18931k, this.f63007cdj, list, abstractC3154k, c2972gZy);
    }

    C3164q x2(com.bumptech.glide.load.engine.ld6 ld6Var) {
        this.f63015zy = ld6Var;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public C3164q m11144y(@dd C3173s c3173s) {
        return f7l8(new toq(c3173s));
    }

    @lvui
    public C3164q zurt(@dd ExecutorServiceC3027k executorServiceC3027k) {
        this.f63008f7l8 = executorServiceC3027k;
        return this;
    }

    @lvui
    public C3164q zy(@dd ExecutorServiceC3027k executorServiceC3027k) {
        this.f63009kja0 = executorServiceC3027k;
        return this;
    }
}
