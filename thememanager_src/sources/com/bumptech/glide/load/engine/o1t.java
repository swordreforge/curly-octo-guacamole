package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.InterfaceC3088q;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.engine.InterfaceC3030g;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.util.C3208s;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
class o1t implements InterfaceC3030g, InterfaceC3030g.k {

    /* JADX INFO: renamed from: h */
    private static final String f18426h = "SourceGenerator";

    /* JADX INFO: renamed from: g */
    private volatile zy f18427g;

    /* JADX INFO: renamed from: k */
    private final f7l8<?> f18428k;

    /* JADX INFO: renamed from: n */
    private volatile int f18429n;

    /* JADX INFO: renamed from: p */
    private volatile C3042q f18430p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3030g.k f18431q;

    /* JADX INFO: renamed from: s */
    private volatile kja0.C3063k<?> f18432s;

    /* JADX INFO: renamed from: y */
    private volatile Object f18433y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.o1t$k */
    /* JADX INFO: compiled from: SourceGenerator.java */
    class C3038k implements InterfaceC3000q.k<Object> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kja0.C3063k f18434k;

        C3038k(kja0.C3063k c3063k) {
            this.f18434k = c3063k;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
        /* JADX INFO: renamed from: q */
        public void mo10657q(@dd Object obj) {
            if (o1t.this.f7l8(this.f18434k)) {
                o1t.this.m10796y(this.f18434k, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
        public void zy(@lvui Exception exc) {
            if (o1t.this.f7l8(this.f18434k)) {
                o1t.this.m10795s(this.f18434k, exc);
            }
        }
    }

    o1t(f7l8<?> f7l8Var, InterfaceC3030g.k kVar) {
        this.f18428k = f7l8Var;
        this.f18431q = kVar;
    }

    /* JADX INFO: renamed from: g */
    private boolean m10792g() {
        return this.f18429n < this.f18428k.f7l8().size();
    }

    /* JADX INFO: renamed from: p */
    private void m10793p(kja0.C3063k<?> c3063k) {
        this.f18432s.f62840zy.mo10647g(this.f18428k.x2(), new C3038k(c3063k));
    }

    /* JADX INFO: renamed from: q */
    private boolean m10794q(Object obj) throws Throwable {
        long qVar = C3208s.toq();
        boolean z2 = true;
        try {
            InterfaceC2998n<T> interfaceC2998nKja0 = this.f18428k.kja0(obj);
            Object objMo10630k = interfaceC2998nKja0.mo10630k();
            InterfaceC3088q<X> interfaceC3088qCdj = this.f18428k.cdj(objMo10630k);
            C3037n c3037n = new C3037n(interfaceC3088qCdj, objMo10630k, this.f18428k.ld6());
            C3042q c3042q = new C3042q(this.f18432s.f18594k, this.f18428k.m10754h());
            InterfaceC3016k interfaceC3016kM10759q = this.f18428k.m10759q();
            interfaceC3016kM10759q.mo10711k(c3042q, c3037n);
            if (Log.isLoggable(f18426h, 2)) {
                Log.v(f18426h, "Finished encoding source to cache, key: " + c3042q + ", data: " + obj + ", encoder: " + interfaceC3088qCdj + ", duration: " + C3208s.m11263k(qVar));
            }
            if (interfaceC3016kM10759q.toq(c3042q) != null) {
                this.f18430p = c3042q;
                this.f18427g = new zy(Collections.singletonList(this.f18432s.f18594k), this.f18428k, this);
                this.f18432s.f62840zy.toq();
                return true;
            }
            if (Log.isLoggable(f18426h, 3)) {
                Log.d(f18426h, "Attempt to write: " + this.f18430p + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f18431q.mo10768n(this.f18432s.f18594k, interfaceC2998nKja0.mo10630k(), this.f18432s.f62840zy, this.f18432s.f62840zy.mo10648n(), this.f18432s.f18594k);
                return false;
            } catch (Throwable th) {
                th = th;
                if (!z2) {
                    this.f18432s.f62840zy.toq();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    public void cancel() {
        kja0.C3063k<?> c3063k = this.f18432s;
        if (c3063k != null) {
            c3063k.f62840zy.cancel();
        }
    }

    boolean f7l8(kja0.C3063k<?> c3063k) {
        kja0.C3063k<?> c3063k2 = this.f18432s;
        return c3063k2 != null && c3063k2 == c3063k;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    /* JADX INFO: renamed from: k */
    public boolean mo10767k() {
        if (this.f18433y != null) {
            Object obj = this.f18433y;
            this.f18433y = null;
            try {
                if (!m10794q(obj)) {
                    return true;
                }
            } catch (IOException e2) {
                if (Log.isLoggable(f18426h, 3)) {
                    Log.d(f18426h, "Failed to properly rewind or write data to cache", e2);
                }
            }
        }
        if (this.f18427g != null && this.f18427g.mo10767k()) {
            return true;
        }
        this.f18427g = null;
        this.f18432s = null;
        boolean z2 = false;
        while (!z2 && m10792g()) {
            List<kja0.C3063k<?>> listF7l8 = this.f18428k.f7l8();
            int i2 = this.f18429n;
            this.f18429n = i2 + 1;
            this.f18432s = listF7l8.get(i2);
            if (this.f18432s != null && (this.f18428k.m10757n().zy(this.f18432s.f62840zy.mo10648n()) || this.f18428k.fn3e(this.f18432s.f62840zy.mo10634k()))) {
                m10793p(this.f18432s);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    /* JADX INFO: renamed from: n */
    public void mo10768n(com.bumptech.glide.load.f7l8 f7l8Var, Object obj, InterfaceC3000q<?> interfaceC3000q, EnumC3050k enumC3050k, com.bumptech.glide.load.f7l8 f7l8Var2) {
        this.f18431q.mo10768n(f7l8Var, obj, interfaceC3000q, this.f18432s.f62840zy.mo10648n(), f7l8Var);
    }

    /* JADX INFO: renamed from: s */
    void m10795s(kja0.C3063k<?> c3063k, @lvui Exception exc) {
        InterfaceC3030g.k kVar = this.f18431q;
        C3042q c3042q = this.f18430p;
        InterfaceC3000q<?> interfaceC3000q = c3063k.f62840zy;
        kVar.toq(c3042q, exc, interfaceC3000q, interfaceC3000q.mo10648n());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    public void toq(com.bumptech.glide.load.f7l8 f7l8Var, Exception exc, InterfaceC3000q<?> interfaceC3000q, EnumC3050k enumC3050k) {
        this.f18431q.toq(f7l8Var, exc, interfaceC3000q, this.f18432s.f62840zy.mo10648n());
    }

    /* JADX INFO: renamed from: y */
    void m10796y(kja0.C3063k<?> c3063k, Object obj) {
        AbstractC3039p abstractC3039pM10757n = this.f18428k.m10757n();
        if (obj != null && abstractC3039pM10757n.zy(c3063k.f62840zy.mo10648n())) {
            this.f18433y = obj;
            this.f18431q.zy();
        } else {
            InterfaceC3030g.k kVar = this.f18431q;
            com.bumptech.glide.load.f7l8 f7l8Var = c3063k.f18594k;
            InterfaceC3000q<?> interfaceC3000q = c3063k.f62840zy;
            kVar.mo10768n(f7l8Var, obj, interfaceC3000q, interfaceC3000q.mo10648n(), this.f18430p);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g.k
    public void zy() {
        throw new UnsupportedOperationException();
    }
}
