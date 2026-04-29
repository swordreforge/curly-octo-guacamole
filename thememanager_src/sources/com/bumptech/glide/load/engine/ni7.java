package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.engine.InterfaceC3030g;
import com.bumptech.glide.load.model.kja0;
import java.io.File;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
class ni7 implements InterfaceC3030g, InterfaceC3000q.k<Object> {

    /* JADX INFO: renamed from: g */
    private int f18416g = -1;

    /* JADX INFO: renamed from: h */
    private volatile kja0.C3063k<?> f18417h;

    /* JADX INFO: renamed from: i */
    private File f18418i;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3030g.k f18419k;

    /* JADX INFO: renamed from: n */
    private int f18420n;

    /* JADX INFO: renamed from: p */
    private int f18421p;

    /* JADX INFO: renamed from: q */
    private final f7l8<?> f18422q;

    /* JADX INFO: renamed from: s */
    private List<com.bumptech.glide.load.model.kja0<File, ?>> f18423s;

    /* JADX INFO: renamed from: y */
    private com.bumptech.glide.load.f7l8 f18424y;

    /* JADX INFO: renamed from: z */
    private fu4 f18425z;

    ni7(f7l8<?> f7l8Var, InterfaceC3030g.k kVar) {
        this.f18422q = f7l8Var;
        this.f18419k = kVar;
    }

    private boolean toq() {
        return this.f18421p < this.f18423s.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    public void cancel() {
        kja0.C3063k<?> c3063k = this.f18417h;
        if (c3063k != null) {
            c3063k.f62840zy.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3030g
    /* JADX INFO: renamed from: k */
    public boolean mo10767k() {
        com.bumptech.glide.util.pool.toq.m11251k("ResourceCacheGenerator.startNext");
        try {
            List<com.bumptech.glide.load.f7l8> listZy = this.f18422q.zy();
            boolean z2 = false;
            if (listZy.isEmpty()) {
                return false;
            }
            List<Class<?>> listQrj = this.f18422q.qrj();
            if (listQrj.isEmpty()) {
                if (File.class.equals(this.f18422q.ki())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f18422q.m10760s() + " to " + this.f18422q.ki());
            }
            while (true) {
                if (this.f18423s != null && toq()) {
                    this.f18417h = null;
                    while (!z2 && toq()) {
                        List<com.bumptech.glide.load.model.kja0<File, ?>> list = this.f18423s;
                        int i2 = this.f18421p;
                        this.f18421p = i2 + 1;
                        this.f18417h = list.get(i2).toq(this.f18418i, this.f18422q.m10755i(), this.f18422q.m10753g(), this.f18422q.ld6());
                        if (this.f18417h != null && this.f18422q.fn3e(this.f18417h.f62840zy.mo10634k())) {
                            this.f18417h.f62840zy.mo10647g(this.f18422q.x2(), this);
                            z2 = true;
                        }
                    }
                    return z2;
                }
                int i3 = this.f18416g + 1;
                this.f18416g = i3;
                if (i3 >= listQrj.size()) {
                    int i4 = this.f18420n + 1;
                    this.f18420n = i4;
                    if (i4 >= listZy.size()) {
                        return false;
                    }
                    this.f18416g = 0;
                }
                com.bumptech.glide.load.f7l8 f7l8Var = listZy.get(this.f18420n);
                Class<?> cls = listQrj.get(this.f18416g);
                this.f18425z = new fu4(this.f18422q.toq(), f7l8Var, this.f18422q.m10754h(), this.f18422q.m10755i(), this.f18422q.m10753g(), this.f18422q.t8r(cls), cls, this.f18422q.ld6());
                File qVar = this.f18422q.m10759q().toq(this.f18425z);
                this.f18418i = qVar;
                if (qVar != null) {
                    this.f18424y = f7l8Var;
                    this.f18423s = this.f18422q.m10758p(qVar);
                    this.f18421p = 0;
                }
            }
        } finally {
            com.bumptech.glide.util.pool.toq.m11250g();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
    /* JADX INFO: renamed from: q */
    public void mo10657q(Object obj) {
        this.f18419k.mo10768n(this.f18424y, obj, this.f18417h.f62840zy, EnumC3050k.RESOURCE_DISK_CACHE, this.f18425z);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q.k
    public void zy(@lvui Exception exc) {
        this.f18419k.toq(this.f18425z, exc, this.f18417h.f62840zy, EnumC3050k.RESOURCE_DISK_CACHE);
    }
}
