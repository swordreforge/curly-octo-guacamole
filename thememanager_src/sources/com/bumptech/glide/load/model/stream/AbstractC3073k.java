package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.load.model.InterfaceC3071s;
import com.bumptech.glide.load.model.kja0;
import com.bumptech.glide.load.model.n7h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.stream.k */
/* JADX INFO: compiled from: BaseGlideUrlLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3073k<Model> implements kja0<Model, InputStream> {

    /* JADX INFO: renamed from: k */
    private final kja0<C3084y, InputStream> f18630k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final n7h<Model, C3084y> f62854toq;

    protected AbstractC3073k(kja0<C3084y, InputStream> kja0Var) {
        this(kja0Var, null);
    }

    private static List<com.bumptech.glide.load.f7l8> zy(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3084y(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    protected abstract String m10898g(Model model, int i2, int i3, C3087p c3087p);

    @dd
    /* JADX INFO: renamed from: n */
    protected InterfaceC3071s m10899n(Model model, int i2, int i3, C3087p c3087p) {
        return InterfaceC3071s.f62850toq;
    }

    /* JADX INFO: renamed from: q */
    protected List<String> m10900q(Model model, int i2, int i3, C3087p c3087p) {
        return Collections.emptyList();
    }

    @Override // com.bumptech.glide.load.model.kja0
    @dd
    public kja0.C3063k<InputStream> toq(@lvui Model model, int i2, int i3, @lvui C3087p c3087p) {
        n7h<Model, C3084y> n7hVar = this.f62854toq;
        C3084y qVar = n7hVar != null ? n7hVar.toq(model, i2, i3) : null;
        if (qVar == null) {
            String strM10898g = m10898g(model, i2, i3, c3087p);
            if (TextUtils.isEmpty(strM10898g)) {
                return null;
            }
            C3084y c3084y = new C3084y(strM10898g, m10899n(model, i2, i3, c3087p));
            n7h<Model, C3084y> n7hVar2 = this.f62854toq;
            if (n7hVar2 != null) {
                n7hVar2.zy(model, i2, i3, c3084y);
            }
            qVar = c3084y;
        }
        List<String> listM10900q = m10900q(model, i2, i3, c3087p);
        kja0.C3063k<InputStream> qVar2 = this.f18630k.toq(qVar, i2, i3, c3087p);
        return (qVar2 == null || listM10900q.isEmpty()) ? qVar2 : new kja0.C3063k<>(qVar2.f18594k, zy(listM10900q), qVar2.f62840zy);
    }

    protected AbstractC3073k(kja0<C3084y, InputStream> kja0Var, @dd n7h<Model, C3084y> n7hVar) {
        this.f18630k = kja0Var;
        this.f62854toq = n7hVar;
    }
}
