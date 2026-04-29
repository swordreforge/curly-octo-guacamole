package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.qrj;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.data.InterfaceC2998n;
import com.bumptech.glide.load.resource.transcode.InterfaceC3136n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.s */
/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3043s<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: g */
    private static final String f18463g = "DecodePath";

    /* JADX INFO: renamed from: k */
    private final Class<DataType> f18464k;

    /* JADX INFO: renamed from: n */
    private final String f18465n;

    /* JADX INFO: renamed from: q */
    private final qrj.InterfaceC0641k<List<Throwable>> f18466q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.x2<DataType, ResourceType>> f62809toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3136n<ResourceType, Transcode> f62810zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.s$k */
    /* JADX INFO: compiled from: DecodePath.java */
    interface k<ResourceType> {
        @lvui
        /* JADX INFO: renamed from: k */
        zurt<ResourceType> mo10810k(@lvui zurt<ResourceType> zurtVar);
    }

    public C3043s(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.x2<DataType, ResourceType>> list, InterfaceC3136n<ResourceType, Transcode> interfaceC3136n, qrj.InterfaceC0641k<List<Throwable>> interfaceC0641k) {
        this.f18464k = cls;
        this.f62809toq = list;
        this.f62810zy = interfaceC3136n;
        this.f18466q = interfaceC0641k;
        this.f18465n = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @lvui
    private zurt<ResourceType> toq(InterfaceC2998n<DataType> interfaceC2998n, int i2, int i3, @lvui C3087p c3087p) throws cdj {
        List<Throwable> list = (List) com.bumptech.glide.util.qrj.m11262q(this.f18466q.mo2983k());
        try {
            return zy(interfaceC2998n, i2, i3, c3087p, list);
        } finally {
            this.f18466q.toq(list);
        }
    }

    @lvui
    private zurt<ResourceType> zy(InterfaceC2998n<DataType> interfaceC2998n, int i2, int i3, @lvui C3087p c3087p, List<Throwable> list) throws cdj {
        int size = this.f62809toq.size();
        zurt<ResourceType> qVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            com.bumptech.glide.load.x2<DataType, ResourceType> x2Var = this.f62809toq.get(i4);
            try {
                if (x2Var.mo10948k(interfaceC2998n.mo10630k(), c3087p)) {
                    qVar = x2Var.toq(interfaceC2998n.mo10630k(), i2, i3, c3087p);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable(f18463g, 2)) {
                    Log.v(f18463g, "Failed to decode data for " + x2Var, e2);
                }
                list.add(e2);
            }
            if (qVar != null) {
                break;
            }
        }
        if (qVar != null) {
            return qVar;
        }
        throw new cdj(this.f18465n, new ArrayList(list));
    }

    /* JADX INFO: renamed from: k */
    public zurt<Transcode> m10809k(InterfaceC2998n<DataType> interfaceC2998n, int i2, int i3, @lvui C3087p c3087p, k<ResourceType> kVar) throws cdj {
        return this.f62810zy.mo11064k(kVar.mo10810k(toq(interfaceC2998n, i2, i3, c3087p)), c3087p);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f18464k + ", decoders=" + this.f62809toq + ", transcoder=" + this.f62810zy + '}';
    }
}
