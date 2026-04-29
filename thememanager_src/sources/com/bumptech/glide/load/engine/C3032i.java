package com.bumptech.glide.load.engine;

import androidx.core.util.qrj;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.engine.C3043s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.i */
/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3032i<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: k */
    private final Class<Data> f18383k;

    /* JADX INFO: renamed from: q */
    private final String f18384q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final qrj.InterfaceC0641k<List<Throwable>> f62774toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<? extends C3043s<Data, ResourceType, Transcode>> f62775zy;

    public C3032i(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C3043s<Data, ResourceType, Transcode>> list, qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
        this.f18383k = cls;
        this.f62774toq = interfaceC0641k;
        this.f62775zy = (List) com.bumptech.glide.util.qrj.zy(list);
        this.f18384q = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private zurt<Transcode> zy(InterfaceC2998n<Data> interfaceC2998n, @lvui C3087p c3087p, int i2, int i3, C3043s.k<ResourceType> kVar, List<Throwable> list) throws cdj {
        int size = this.f62775zy.size();
        zurt<Transcode> zurtVarM10809k = null;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                zurtVarM10809k = this.f62775zy.get(i4).m10809k(interfaceC2998n, i2, i3, c3087p, kVar);
            } catch (cdj e2) {
                list.add(e2);
            }
            if (zurtVarM10809k != null) {
                break;
            }
        }
        if (zurtVarM10809k != null) {
            return zurtVarM10809k;
        }
        throw new cdj(this.f18384q, new ArrayList(list));
    }

    /* JADX INFO: renamed from: k */
    public Class<Data> m10773k() {
        return this.f18383k;
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f62775zy.toArray()) + '}';
    }

    public zurt<Transcode> toq(InterfaceC2998n<Data> interfaceC2998n, @lvui C3087p c3087p, int i2, int i3, C3043s.k<ResourceType> kVar) throws cdj {
        List<Throwable> list = (List) com.bumptech.glide.util.qrj.m11262q(this.f62774toq.mo2983k());
        try {
            return zy(interfaceC2998n, c3087p, i2, i3, kVar, list);
        } finally {
            this.f62774toq.toq(list);
        }
    }
}
