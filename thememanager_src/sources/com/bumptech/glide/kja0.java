package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.load.engine.AbstractC3039p;
import com.bumptech.glide.manager.InterfaceC3149q;
import com.bumptech.glide.manager.ki;
import com.bumptech.glide.manager.t8r;
import com.bumptech.glide.manager.zurt;
import com.bumptech.glide.manager.zy;
import com.bumptech.glide.request.C3173s;
import com.bumptech.glide.request.InterfaceC3170n;
import com.bumptech.glide.request.InterfaceC3194y;
import com.bumptech.glide.request.target.AbstractC3174g;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.InterfaceC7839p;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n5r1;
import zy.o1t;

/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 implements ComponentCallbacks2, com.bumptech.glide.manager.qrj, InterfaceC3195s<n7h<Drawable>> {

    /* JADX INFO: renamed from: g */
    @o1t("this")
    private final t8r f17967g;

    /* JADX INFO: renamed from: h */
    private final com.bumptech.glide.manager.zy f17968h;

    /* JADX INFO: renamed from: i */
    private final CopyOnWriteArrayList<InterfaceC3194y<Object>> f17969i;

    /* JADX INFO: renamed from: k */
    protected final com.bumptech.glide.zy f17970k;

    /* JADX INFO: renamed from: n */
    final com.bumptech.glide.manager.x2 f17971n;

    /* JADX INFO: renamed from: p */
    private final Runnable f17972p;

    /* JADX INFO: renamed from: q */
    protected final Context f17973q;

    /* JADX INFO: renamed from: s */
    @o1t("this")
    private final zurt f17974s;

    /* JADX INFO: renamed from: t */
    private boolean f17975t;

    /* JADX INFO: renamed from: y */
    @o1t("this")
    private final ki f17976y;

    /* JADX INFO: renamed from: z */
    @o1t("this")
    private C3173s f17977z;

    /* JADX INFO: renamed from: r */
    private static final C3173s f17966r = C3173s.gc3c(Bitmap.class).lv5();

    /* JADX INFO: renamed from: l */
    private static final C3173s f17965l = C3173s.gc3c(com.bumptech.glide.load.resource.gif.zy.class).lv5();

    /* JADX INFO: renamed from: f */
    private static final C3173s f17964f = C3173s.zkd(AbstractC3039p.f62799zy).qkj8(EnumC3159p.LOW).zsr0(true);

    /* JADX INFO: renamed from: com.bumptech.glide.kja0$k */
    /* JADX INFO: compiled from: RequestManager.java */
    class RunnableC2981k implements Runnable {
        RunnableC2981k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kja0 kja0Var = kja0.this;
            kja0Var.f17971n.toq(kja0Var);
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    private static class toq extends AbstractC3174g<View, Object> {
        toq(@lvui View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        /* JADX INFO: renamed from: h */
        public void mo6802h(@dd Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.InterfaceC3175h
        public void qrj(@lvui Object obj, @dd InterfaceC3185g<? super Object> interfaceC3185g) {
        }

        @Override // com.bumptech.glide.request.target.AbstractC3174g
        /* JADX INFO: renamed from: y */
        protected void mo10626y(@dd Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    private class zy implements zy.InterfaceC3152k {

        /* JADX INFO: renamed from: k */
        @o1t("RequestManager.this")
        private final t8r f17979k;

        zy(@lvui t8r t8rVar) {
            this.f17979k = t8rVar;
        }

        @Override // com.bumptech.glide.manager.zy.InterfaceC3152k
        /* JADX INFO: renamed from: k */
        public void mo10627k(boolean z2) {
            if (z2) {
                synchronized (kja0.this) {
                    this.f17979k.f7l8();
                }
            }
        }
    }

    public kja0(@lvui com.bumptech.glide.zy zyVar, @lvui com.bumptech.glide.manager.x2 x2Var, @lvui ki kiVar, @lvui Context context) {
        this(zyVar, x2Var, kiVar, new t8r(), zyVar.m11287s(), context);
    }

    private void hb(@lvui InterfaceC3175h<?> interfaceC3175h) {
        boolean zNn86 = nn86(interfaceC3175h);
        InterfaceC3170n interfaceC3170nLd6 = interfaceC3175h.ld6();
        if (zNn86 || this.f17970k.ni7(interfaceC3175h) || interfaceC3170nLd6 == null) {
            return;
        }
        interfaceC3175h.kja0(null);
        interfaceC3170nLd6.clear();
    }

    /* JADX INFO: renamed from: j */
    private synchronized void m10621j(@lvui C3173s c3173s) {
        this.f17977z = this.f17977z.mo6764k(c3173s);
    }

    synchronized C3173s a9() {
        return this.f17977z;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m10622c() {
        com.bumptech.glide.util.kja0.toq();
        m10624f();
        Iterator<kja0> it = this.f17976y.mo11084k().iterator();
        while (it.hasNext()) {
            it.next().m10624f();
        }
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> ki(@dd @fn3e @n5r1 Integer num) {
        return ni7().ki(num);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6754s(@dd Drawable drawable) {
        return ni7().mo6754s(drawable);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @Deprecated
    /* JADX INFO: renamed from: dd, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6752q(@dd URL url) {
        return ni7().mo6752q(url);
    }

    /* JADX INFO: renamed from: e */
    synchronized void m10623e(@lvui InterfaceC3175h<?> interfaceC3175h, @lvui InterfaceC3170n interfaceC3170n) {
        this.f17974s.m11113n(interfaceC3175h);
        this.f17967g.m11110s(interfaceC3170n);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: eqxt, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6758y(@dd File file) {
        return ni7().mo6758y(file);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m10624f() {
        this.f17967g.m11111y();
    }

    @lvui
    public synchronized kja0 f7l8(@lvui C3173s c3173s) {
        m10621j(c3173s);
        return this;
    }

    @InterfaceC7839p
    @lvui
    public <ResourceType> n7h<ResourceType> fn3e(@lvui Class<ResourceType> cls) {
        return new n7h<>(this.f17970k, this, cls, this.f17973q);
    }

    @lvui
    <T> AbstractC2977h<?, T> fti(Class<T> cls) {
        return this.f17970k.ld6().m11119n(cls);
    }

    @InterfaceC7839p
    @lvui
    public n7h<File> fu4() {
        return fn3e(File.class).mo6764k(C3173s.pc(true));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> n7h(@dd Bitmap bitmap) {
        return ni7().n7h(bitmap);
    }

    public synchronized void hyr() {
        n5r1();
        Iterator<kja0> it = this.f17976y.mo11084k().iterator();
        while (it.hasNext()) {
            it.next().n5r1();
        }
    }

    List<InterfaceC3194y<Object>> jk() {
        return this.f17969i;
    }

    public synchronized boolean jp0y() {
        return this.f17967g.m11109q();
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public synchronized void mo10580k() {
        m10624f();
        this.f17974s.mo10580k();
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m10625l() {
        ncyb();
        Iterator<kja0> it = this.f17976y.mo11084k().iterator();
        while (it.hasNext()) {
            it.next().ncyb();
        }
    }

    @lvui
    public synchronized kja0 lrht(@lvui C3173s c3173s) {
        vyq(c3173s);
        return this;
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> cdj(@dd Object obj) {
        return ni7().cdj(obj);
    }

    @InterfaceC7839p
    @lvui
    public n7h<File> mcp() {
        return fn3e(File.class).mo6764k(f17964f);
    }

    public synchronized void n5r1() {
        this.f17967g.m11106g();
    }

    public synchronized void ncyb() {
        this.f17967g.m11108n();
    }

    @InterfaceC7839p
    @lvui
    public n7h<Drawable> ni7() {
        return fn3e(Drawable.class);
    }

    synchronized boolean nn86(@lvui InterfaceC3175h<?> interfaceC3175h) {
        InterfaceC3170n interfaceC3170nLd6 = interfaceC3175h.ld6();
        if (interfaceC3170nLd6 == null) {
            return true;
        }
        if (!this.f17967g.toq(interfaceC3170nLd6)) {
            return false;
        }
        this.f17974s.m11112g(interfaceC3175h);
        interfaceC3175h.kja0(null);
        return true;
    }

    public void o1t(@lvui View view) {
        wvg(new toq(view));
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: oc, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6750n(@dd Uri uri) {
        return ni7().mo6750n(uri);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.qrj
    public synchronized void onDestroy() {
        this.f17974s.onDestroy();
        Iterator<InterfaceC3175h<?>> it = this.f17974s.m11114q().iterator();
        while (it.hasNext()) {
            wvg(it.next());
        }
        this.f17974s.zy();
        this.f17967g.zy();
        this.f17971n.mo11072k(this);
        this.f17971n.mo11072k(this.f17968h);
        com.bumptech.glide.util.kja0.m11234z(this.f17972p);
        this.f17970k.m11288t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.qrj
    public synchronized void onStop() {
        n5r1();
        this.f17974s.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.f17975t) {
            m10625l();
        }
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6748i(@dd String str) {
        return ni7().mo6748i(str);
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: t */
    public n7h<File> mo6755t(@dd Object obj) {
        return mcp().cdj(obj);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f17967g + ", treeNode=" + this.f17976y + "}";
    }

    public void uv6(boolean z2) {
        this.f17975t = z2;
    }

    protected synchronized void vyq(@lvui C3173s c3173s) {
        this.f17977z = c3173s.zurt().qrj();
    }

    public void wvg(@dd InterfaceC3175h<?> interfaceC3175h) {
        if (interfaceC3175h == null) {
            return;
        }
        hb(interfaceC3175h);
    }

    @Override // com.bumptech.glide.InterfaceC3195s
    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: x9kr, reason: merged with bridge method [inline-methods] */
    public n7h<Drawable> mo6747g(@dd byte[] bArr) {
        return ni7().mo6747g(bArr);
    }

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: z */
    public n7h<com.bumptech.glide.load.resource.gif.zy> mo6759z() {
        return fn3e(com.bumptech.glide.load.resource.gif.zy.class).mo6764k(f17965l);
    }

    @InterfaceC7839p
    @lvui
    public n7h<Bitmap> zurt() {
        return fn3e(Bitmap.class).mo6764k(f17966r);
    }

    public kja0 zy(InterfaceC3194y<Object> interfaceC3194y) {
        this.f17969i.add(interfaceC3194y);
        return this;
    }

    kja0(com.bumptech.glide.zy zyVar, com.bumptech.glide.manager.x2 x2Var, ki kiVar, t8r t8rVar, InterfaceC3149q interfaceC3149q, Context context) {
        this.f17974s = new zurt();
        RunnableC2981k runnableC2981k = new RunnableC2981k();
        this.f17972p = runnableC2981k;
        this.f17970k = zyVar;
        this.f17971n = x2Var;
        this.f17976y = kiVar;
        this.f17967g = t8rVar;
        this.f17973q = context;
        com.bumptech.glide.manager.zy zyVarMo11085k = interfaceC3149q.mo11085k(context.getApplicationContext(), new zy(t8rVar));
        this.f17968h = zyVarMo11085k;
        zyVar.zurt(this);
        if (com.bumptech.glide.util.kja0.m11227i()) {
            com.bumptech.glide.util.kja0.fu4(runnableC2981k);
        } else {
            x2Var.toq(this);
        }
        x2Var.toq(zyVarMo11085k);
        this.f17969i = new CopyOnWriteArrayList<>(zyVar.ld6().zy());
        vyq(zyVar.ld6().m11120q());
    }
}
