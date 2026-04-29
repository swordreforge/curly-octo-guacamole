package androidx.recyclerview.widget;

import androidx.collection.C0252s;
import androidx.core.util.qrj;
import androidx.recyclerview.widget.RecyclerView;
import zy.yz;

/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes.dex */
class x9kr {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final boolean f52318zy = false;

    /* JADX INFO: renamed from: k */
    @yz
    final androidx.collection.qrj<RecyclerView.fti, C1115k> f6111k = new androidx.collection.qrj<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @yz
    final C0252s<RecyclerView.fti> f52319toq = new C0252s<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.x9kr$k */
    /* JADX INFO: compiled from: ViewInfoStore.java */
    static class C1115k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52320f7l8 = 8;

        /* JADX INFO: renamed from: g */
        static final int f6112g = 4;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        static qrj.InterfaceC0641k<C1115k> f52321ld6 = new qrj.toq(20);

        /* JADX INFO: renamed from: n */
        static final int f6113n = 2;

        /* JADX INFO: renamed from: p */
        static final int f6114p = 14;

        /* JADX INFO: renamed from: q */
        static final int f6115q = 1;

        /* JADX INFO: renamed from: s */
        static final int f6116s = 12;

        /* JADX INFO: renamed from: y */
        static final int f6117y = 3;

        /* JADX INFO: renamed from: k */
        int f6118k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        RecyclerView.qrj.C1056q f52322toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        RecyclerView.qrj.C1056q f52323zy;

        private C1115k() {
        }

        /* JADX INFO: renamed from: k */
        static void m5132k() {
            while (f52321ld6.mo2983k() != null) {
            }
        }

        static C1115k toq() {
            C1115k c1115kMo2983k = f52321ld6.mo2983k();
            return c1115kMo2983k == null ? new C1115k() : c1115kMo2983k;
        }

        static void zy(C1115k c1115k) {
            c1115k.f6118k = 0;
            c1115k.f52322toq = null;
            c1115k.f52323zy = null;
            f52321ld6.toq(c1115k);
        }
    }

    /* JADX INFO: compiled from: ViewInfoStore.java */
    interface toq {
        /* JADX INFO: renamed from: k */
        void mo4841k(RecyclerView.fti ftiVar, @zy.dd RecyclerView.qrj.C1056q c1056q, RecyclerView.qrj.C1056q c1056q2);

        /* JADX INFO: renamed from: q */
        void mo4842q(RecyclerView.fti ftiVar, @zy.lvui RecyclerView.qrj.C1056q c1056q, @zy.lvui RecyclerView.qrj.C1056q c1056q2);

        void toq(RecyclerView.fti ftiVar);

        void zy(RecyclerView.fti ftiVar, @zy.lvui RecyclerView.qrj.C1056q c1056q, @zy.dd RecyclerView.qrj.C1056q c1056q2);
    }

    x9kr() {
    }

    private RecyclerView.qrj.C1056q x2(RecyclerView.fti ftiVar, int i2) {
        C1115k c1115kM873h;
        RecyclerView.qrj.C1056q c1056q;
        int iF7l8 = this.f6111k.f7l8(ftiVar);
        if (iF7l8 >= 0 && (c1115kM873h = this.f6111k.m873h(iF7l8)) != null) {
            int i3 = c1115kM873h.f6118k;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                c1115kM873h.f6118k = i4;
                if (i2 == 4) {
                    c1056q = c1115kM873h.f52322toq;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c1056q = c1115kM873h.f52323zy;
                }
                if ((i4 & 12) == 0) {
                    this.f6111k.n7h(iF7l8);
                    C1115k.zy(c1115kM873h);
                }
                return c1056q;
            }
        }
        return null;
    }

    void cdj(RecyclerView.fti ftiVar) {
        int iJk = this.f52319toq.jk() - 1;
        while (true) {
            if (iJk < 0) {
                break;
            }
            if (ftiVar == this.f52319toq.a9(iJk)) {
                this.f52319toq.o1t(iJk);
                break;
            }
            iJk--;
        }
        C1115k c1115kRemove = this.f6111k.remove(ftiVar);
        if (c1115kRemove != null) {
            C1115k.zy(c1115kRemove);
        }
    }

    RecyclerView.fti f7l8(long j2) {
        return this.f52319toq.n7h(j2);
    }

    /* JADX INFO: renamed from: g */
    void m5124g() {
        this.f6111k.clear();
        this.f52319toq.m880q();
    }

    /* JADX INFO: renamed from: h */
    void m5125h(RecyclerView.fti ftiVar) {
        C1115k c1115k = this.f6111k.get(ftiVar);
        if (c1115k == null) {
            return;
        }
        c1115k.f6118k &= -2;
    }

    /* JADX INFO: renamed from: k */
    void m5126k(RecyclerView.fti ftiVar, RecyclerView.qrj.C1056q c1056q) {
        C1115k qVar = this.f6111k.get(ftiVar);
        if (qVar == null) {
            qVar = C1115k.toq();
            this.f6111k.put(ftiVar, qVar);
        }
        qVar.f6118k |= 2;
        qVar.f52322toq = c1056q;
    }

    void kja0(toq toqVar) {
        for (int size = this.f6111k.size() - 1; size >= 0; size--) {
            RecyclerView.fti ftiVarLd6 = this.f6111k.ld6(size);
            C1115k c1115kN7h = this.f6111k.n7h(size);
            int i2 = c1115kN7h.f6118k;
            if ((i2 & 3) == 3) {
                toqVar.toq(ftiVarLd6);
            } else if ((i2 & 1) != 0) {
                RecyclerView.qrj.C1056q c1056q = c1115kN7h.f52322toq;
                if (c1056q == null) {
                    toqVar.toq(ftiVarLd6);
                } else {
                    toqVar.zy(ftiVarLd6, c1056q, c1115kN7h.f52323zy);
                }
            } else if ((i2 & 14) == 14) {
                toqVar.mo4841k(ftiVarLd6, c1115kN7h.f52322toq, c1115kN7h.f52323zy);
            } else if ((i2 & 12) == 12) {
                toqVar.mo4842q(ftiVarLd6, c1115kN7h.f52322toq, c1115kN7h.f52323zy);
            } else if ((i2 & 4) != 0) {
                toqVar.zy(ftiVarLd6, c1115kN7h.f52322toq, null);
            } else if ((i2 & 8) != 0) {
                toqVar.mo4841k(ftiVarLd6, c1115kN7h.f52322toq, c1115kN7h.f52323zy);
            }
            C1115k.zy(c1115kN7h);
        }
    }

    public void ld6(RecyclerView.fti ftiVar) {
        m5125h(ftiVar);
    }

    /* JADX INFO: renamed from: n */
    void m5127n(RecyclerView.fti ftiVar, RecyclerView.qrj.C1056q c1056q) {
        C1115k qVar = this.f6111k.get(ftiVar);
        if (qVar == null) {
            qVar = C1115k.toq();
            this.f6111k.put(ftiVar, qVar);
        }
        qVar.f52322toq = c1056q;
        qVar.f6118k |= 4;
    }

    @zy.dd
    RecyclerView.qrj.C1056q n7h(RecyclerView.fti ftiVar) {
        return x2(ftiVar, 4);
    }

    /* JADX INFO: renamed from: p */
    void m5128p() {
        C1115k.m5132k();
    }

    /* JADX INFO: renamed from: q */
    void m5129q(RecyclerView.fti ftiVar, RecyclerView.qrj.C1056q c1056q) {
        C1115k qVar = this.f6111k.get(ftiVar);
        if (qVar == null) {
            qVar = C1115k.toq();
            this.f6111k.put(ftiVar, qVar);
        }
        qVar.f52323zy = c1056q;
        qVar.f6118k |= 8;
    }

    @zy.dd
    RecyclerView.qrj.C1056q qrj(RecyclerView.fti ftiVar) {
        return x2(ftiVar, 8);
    }

    /* JADX INFO: renamed from: s */
    boolean m5130s(RecyclerView.fti ftiVar) {
        C1115k c1115k = this.f6111k.get(ftiVar);
        return (c1115k == null || (c1115k.f6118k & 4) == 0) ? false : true;
    }

    void toq(RecyclerView.fti ftiVar) {
        C1115k qVar = this.f6111k.get(ftiVar);
        if (qVar == null) {
            qVar = C1115k.toq();
            this.f6111k.put(ftiVar, qVar);
        }
        qVar.f6118k |= 1;
    }

    /* JADX INFO: renamed from: y */
    boolean m5131y(RecyclerView.fti ftiVar) {
        C1115k c1115k = this.f6111k.get(ftiVar);
        return (c1115k == null || (c1115k.f6118k & 1) == 0) ? false : true;
    }

    void zy(long j2, RecyclerView.fti ftiVar) {
        this.f52319toq.fn3e(j2, ftiVar);
    }
}
