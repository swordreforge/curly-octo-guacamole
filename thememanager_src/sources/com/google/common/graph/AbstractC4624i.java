package com.google.common.graph;

import com.google.common.collect.g0ad;
import com.google.common.collect.vep5;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.graph.i */
/* JADX INFO: compiled from: EndpointPairIterator.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4624i<N> extends com.google.common.collect.zy<t8r<N>> {

    /* JADX INFO: renamed from: g */
    private final Iterator<N> f26876g;

    /* JADX INFO: renamed from: n */
    private final InterfaceC4648y<N> f26877n;

    /* JADX INFO: renamed from: s */
    protected Iterator<N> f26878s;

    /* JADX INFO: renamed from: y */
    protected N f26879y;

    /* JADX INFO: renamed from: com.google.common.graph.i$toq */
    /* JADX INFO: compiled from: EndpointPairIterator.java */
    private static final class toq<N> extends AbstractC4624i<N> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t8r<N> mo15703k() {
            while (!this.f26878s.hasNext()) {
                if (!m16232q()) {
                    return toq();
                }
            }
            return t8r.m16305s(this.f26879y, this.f26878s.next());
        }

        private toq(InterfaceC4648y<N> interfaceC4648y) {
            super(interfaceC4648y);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.i$zy */
    /* JADX INFO: compiled from: EndpointPairIterator.java */
    private static final class zy<N> extends AbstractC4624i<N> {

        /* JADX INFO: renamed from: p */
        private Set<N> f26880p;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t8r<N> mo15703k() {
            while (true) {
                if (this.f26878s.hasNext()) {
                    N next = this.f26878s.next();
                    if (!this.f26880p.contains(next)) {
                        return t8r.x2(this.f26879y, next);
                    }
                } else {
                    this.f26880p.add(this.f26879y);
                    if (!m16232q()) {
                        this.f26880p = null;
                        return toq();
                    }
                }
            }
        }

        private zy(InterfaceC4648y<N> interfaceC4648y) {
            super(interfaceC4648y);
            this.f26880p = g0ad.m15700z(interfaceC4648y.qrj().size());
        }
    }

    /* JADX INFO: renamed from: n */
    static <N> AbstractC4624i<N> m16231n(InterfaceC4648y<N> interfaceC4648y) {
        return interfaceC4648y.mo16193n() ? new toq(interfaceC4648y) : new zy(interfaceC4648y);
    }

    /* JADX INFO: renamed from: q */
    protected final boolean m16232q() {
        com.google.common.base.jk.yz(!this.f26878s.hasNext());
        if (!this.f26876g.hasNext()) {
            return false;
        }
        N next = this.f26876g.next();
        this.f26879y = next;
        this.f26878s = this.f26877n.toq((Object) next).iterator();
        return true;
    }

    private AbstractC4624i(InterfaceC4648y<N> interfaceC4648y) {
        this.f26879y = null;
        this.f26878s = vep5.of().iterator();
        this.f26877n = interfaceC4648y;
        this.f26876g = interfaceC4648y.qrj().iterator();
    }
}
