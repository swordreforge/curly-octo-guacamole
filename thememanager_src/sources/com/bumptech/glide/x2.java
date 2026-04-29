package com.bumptech.glide;

import androidx.core.util.qrj;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC3088q;
import com.bumptech.glide.load.data.C2991g;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.engine.C3032i;
import com.bumptech.glide.load.engine.C3043s;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.model.InterfaceC3059h;
import com.bumptech.glide.load.model.cdj;
import com.bumptech.glide.load.resource.transcode.C3134g;
import com.bumptech.glide.load.resource.transcode.InterfaceC3136n;
import com.bumptech.glide.provider.C3160g;
import com.bumptech.glide.provider.C3161k;
import com.bumptech.glide.provider.C3162n;
import com.bumptech.glide.provider.C3163q;
import com.bumptech.glide.util.pool.C3205k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: h */
    private static final String f19105h = "legacy_append";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f63091kja0 = "legacy_prepend_all";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f63092ld6 = "Animation";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f63093n7h = "BitmapDrawable";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f63094qrj = "Bitmap";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @Deprecated
    public static final String f63095x2 = "Animation";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.bumptech.glide.provider.toq f63096f7l8;

    /* JADX INFO: renamed from: g */
    private final C3134g f19106g;

    /* JADX INFO: renamed from: k */
    private final cdj f19107k;

    /* JADX INFO: renamed from: n */
    private final C2991g f19108n;

    /* JADX INFO: renamed from: p */
    private final qrj.InterfaceC0641k<List<Throwable>> f19109p;

    /* JADX INFO: renamed from: q */
    private final C3160g f19110q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3161k f63097toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3162n f63098zy;

    /* JADX INFO: renamed from: y */
    private final C3163q f19112y = new C3163q();

    /* JADX INFO: renamed from: s */
    private final com.bumptech.glide.provider.zy f19111s = new com.bumptech.glide.provider.zy();

    /* JADX INFO: renamed from: com.bumptech.glide.x2$k */
    /* JADX INFO: compiled from: Registry.java */
    public static class C3210k extends RuntimeException {
        public C3210k(@lvui String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.x2$n */
    /* JADX INFO: compiled from: Registry.java */
    public static class C3211n extends C3210k {
        public C3211n(@lvui Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.x2$q */
    /* JADX INFO: compiled from: Registry.java */
    public static class C3212q extends C3210k {
        public C3212q(@lvui Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: compiled from: Registry.java */
    public static final class toq extends C3210k {
        public toq() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: compiled from: Registry.java */
    public static class zy extends C3210k {
        public zy(@lvui Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> zy(@lvui M m2, @lvui List<com.bumptech.glide.load.model.kja0<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }

        public zy(@lvui Class<?> cls, @lvui Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public x2() {
        qrj.InterfaceC0641k<List<Throwable>> interfaceC0641kM11245g = C3205k.m11245g();
        this.f19109p = interfaceC0641kM11245g;
        this.f19107k = new cdj(interfaceC0641kM11245g);
        this.f63097toq = new C3161k();
        this.f63098zy = new C3162n();
        this.f19110q = new C3160g();
        this.f19108n = new C2991g();
        this.f19106g = new C3134g();
        this.f63096f7l8 = new com.bumptech.glide.provider.toq();
        o1t(Arrays.asList("Animation", f63094qrj, f63093n7h));
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private <Data, TResource, Transcode> List<C3043s<Data, TResource, Transcode>> m11269g(@lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f63098zy.m11130q(cls, cls2)) {
            for (Class cls5 : this.f19106g.toq(cls4, cls3)) {
                arrayList.add(new C3043s(cls, cls4, cls5, this.f63098zy.toq(cls, cls4), this.f19106g.m11065k(cls4, cls5), this.f19109p));
            }
        }
        return arrayList;
    }

    @lvui
    public <Data, TResource> x2 cdj(@lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui com.bumptech.glide.load.x2<Data, TResource> x2Var) {
        t8r(f63091kja0, cls, cls2, x2Var);
        return this;
    }

    @lvui
    public List<ImageHeaderParser> f7l8() {
        List<ImageHeaderParser> qVar = this.f63096f7l8.toq();
        if (qVar.isEmpty()) {
            throw new toq();
        }
        return qVar;
    }

    @lvui
    public x2 fn3e(@lvui InterfaceC2998n.k<?> kVar) {
        this.f19108n.toq(kVar);
        return this;
    }

    @lvui
    public <TResource, Transcode> x2 fu4(@lvui Class<TResource> cls, @lvui Class<Transcode> cls2, @lvui InterfaceC3136n<TResource, Transcode> interfaceC3136n) {
        this.f19106g.zy(cls, cls2, interfaceC3136n);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public <TResource> x2 m11270h(@lvui Class<TResource> cls, @lvui com.bumptech.glide.load.qrj<TResource> qrjVar) {
        this.f19110q.zy(cls, qrjVar);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public x2 m11271i(@lvui ImageHeaderParser imageHeaderParser) {
        this.f63096f7l8.m11133k(imageHeaderParser);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public <Data> x2 m11272k(@lvui Class<Data> cls, @lvui InterfaceC3088q<Data> interfaceC3088q) {
        this.f63097toq.m11125k(cls, interfaceC3088q);
        return this;
    }

    @lvui
    public <Model, Data> x2 ki(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<Model, Data> interfaceC3059h) {
        this.f19107k.f7l8(cls, cls2, interfaceC3059h);
        return this;
    }

    @lvui
    public <Data> x2 kja0(@lvui Class<Data> cls, @lvui InterfaceC3088q<Data> interfaceC3088q) {
        this.f63097toq.zy(cls, interfaceC3088q);
        return this;
    }

    @lvui
    public <X> com.bumptech.glide.load.qrj<X> ld6(@lvui zurt<X> zurtVar) throws C3212q {
        com.bumptech.glide.load.qrj<X> qVar = this.f19110q.toq(zurtVar.mo10765n());
        if (qVar != null) {
            return qVar;
        }
        throw new C3212q(zurtVar.mo10765n());
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public <Data, TResource> x2 m11273n(@lvui String str, @lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui com.bumptech.glide.load.x2<Data, TResource> x2Var) {
        this.f63098zy.m11128k(str, x2Var, cls, cls2);
        return this;
    }

    public boolean n7h(@lvui zurt<?> zurtVar) {
        return this.f19110q.toq(zurtVar.mo10765n()) != null;
    }

    @lvui
    @Deprecated
    public <TResource> x2 ni7(@lvui Class<TResource> cls, @lvui com.bumptech.glide.load.qrj<TResource> qrjVar) {
        return toq(cls, qrjVar);
    }

    @lvui
    public final x2 o1t(@lvui List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f63091kja0);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f19105h);
        this.f63098zy.m11127g(arrayList);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public <Model, TResource, Transcode> List<Class<?>> m11274p(@lvui Class<Model> cls, @lvui Class<TResource> cls2, @lvui Class<Transcode> cls3) {
        List<Class<?>> qVar = this.f19112y.toq(cls, cls2, cls3);
        if (qVar == null) {
            qVar = new ArrayList<>();
            Iterator<Class<?>> it = this.f19107k.m10849q(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f63098zy.m11130q(it.next(), cls2)) {
                    if (!this.f19106g.toq(cls4, cls3).isEmpty() && !qVar.contains(cls4)) {
                        qVar.add(cls4);
                    }
                }
            }
            this.f19112y.zy(cls, cls2, cls3, Collections.unmodifiableList(qVar));
        }
        return qVar;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public <Model, Data> x2 m11275q(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<Model, Data> interfaceC3059h) {
        this.f19107k.m10847k(cls, cls2, interfaceC3059h);
        return this;
    }

    @lvui
    public <X> InterfaceC3088q<X> qrj(@lvui X x3) throws C3211n {
        InterfaceC3088q<X> qVar = this.f63097toq.toq(x3.getClass());
        if (qVar != null) {
            return qVar;
        }
        throw new C3211n(x3.getClass());
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public <Model> List<com.bumptech.glide.load.model.kja0<Model, ?>> m11276s(@lvui Model model) {
        return this.f19107k.m10848n(model);
    }

    @lvui
    public <Data, TResource> x2 t8r(@lvui String str, @lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui com.bumptech.glide.load.x2<Data, TResource> x2Var) {
        this.f63098zy.m11129n(str, x2Var, cls, cls2);
        return this;
    }

    @lvui
    public <TResource> x2 toq(@lvui Class<TResource> cls, @lvui com.bumptech.glide.load.qrj<TResource> qrjVar) {
        this.f19110q.m11123k(cls, qrjVar);
        return this;
    }

    @lvui
    public <X> InterfaceC2998n<X> x2(@lvui X x3) {
        return this.f19108n.m10633k(x3);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public <Data, TResource, Transcode> C3032i<Data, TResource, Transcode> m11277y(@lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui Class<Transcode> cls3) {
        C3032i<Data, TResource, Transcode> c3032iM11134k = this.f19111s.m11134k(cls, cls2, cls3);
        if (this.f19111s.zy(c3032iM11134k)) {
            return null;
        }
        if (c3032iM11134k == null) {
            List<C3043s<Data, TResource, Transcode>> listM11269g = m11269g(cls, cls2, cls3);
            c3032iM11134k = listM11269g.isEmpty() ? null : new C3032i<>(cls, cls2, cls3, listM11269g, this.f19109p);
            this.f19111s.m11135q(cls, cls2, cls3, c3032iM11134k);
        }
        return c3032iM11134k;
    }

    @lvui
    /* JADX INFO: renamed from: z */
    public <Model, Data> x2 m11278z(@lvui Class<Model> cls, @lvui Class<Data> cls2, @lvui InterfaceC3059h<? extends Model, ? extends Data> interfaceC3059h) {
        this.f19107k.m10850s(cls, cls2, interfaceC3059h);
        return this;
    }

    @lvui
    @Deprecated
    public <Data> x2 zurt(@lvui Class<Data> cls, @lvui InterfaceC3088q<Data> interfaceC3088q) {
        return m11272k(cls, interfaceC3088q);
    }

    @lvui
    public <Data, TResource> x2 zy(@lvui Class<Data> cls, @lvui Class<TResource> cls2, @lvui com.bumptech.glide.load.x2<Data, TResource> x2Var) {
        m11273n(f19105h, cls, cls2, x2Var);
        return this;
    }
}
