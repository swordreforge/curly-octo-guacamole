package com.google.common.collect;

import com.google.common.collect.kq2f;
import com.google.common.collect.o05;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
@InterfaceC7731k
public abstract class d8wk<E> extends AbstractC4333d<E> implements gb<E> {

    /* JADX INFO: renamed from: com.google.common.collect.d8wk$k */
    /* JADX INFO: compiled from: ForwardingSortedMultiset.java */
    protected abstract class AbstractC4334k extends AbstractC4369f<E> {
        public AbstractC4334k() {
        }

        @Override // com.google.common.collect.AbstractC4369f
        gb<E> kja0() {
            return d8wk.this;
        }
    }

    /* JADX INFO: compiled from: ForwardingSortedMultiset.java */
    protected class toq extends kq2f.toq<E> {
        public toq() {
            super(d8wk.this);
        }
    }

    protected d8wk() {
    }

    protected gb<E> cdj(E e2, fu4 fu4Var, E e3, fu4 fu4Var2) {
        return tailMultiset(e2, fu4Var).headMultiset(e3, fu4Var2);
    }

    @Override // com.google.common.collect.gb, com.google.common.collect.f1bi
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public abstract gb<E> delegate();

    @Override // com.google.common.collect.gb
    public gb<E> descendingMultiset() {
        return delegate().descendingMultiset();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        return delegate().firstEntry();
    }

    /* JADX INFO: renamed from: h */
    protected o05.InterfaceC4482k<E> m15600h() {
        Iterator<o05.InterfaceC4482k<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = it.next();
        o05.InterfaceC4482k<E> interfaceC4482kLd6 = m58i.ld6(next.getElement(), next.getCount());
        it.remove();
        return interfaceC4482kLd6;
    }

    @Override // com.google.common.collect.gb
    public gb<E> headMultiset(E e2, fu4 fu4Var) {
        return delegate().headMultiset(e2, fu4Var);
    }

    protected o05.InterfaceC4482k<E> kja0() {
        Iterator<o05.InterfaceC4482k<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = it.next();
        o05.InterfaceC4482k<E> interfaceC4482kLd6 = m58i.ld6(next.getElement(), next.getCount());
        it.remove();
        return interfaceC4482kLd6;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        return delegate().lastEntry();
    }

    protected o05.InterfaceC4482k<E> ld6() {
        Iterator<o05.InterfaceC4482k<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = it.next();
        return m58i.ld6(next.getElement(), next.getCount());
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @Override // com.google.common.collect.gb
    public gb<E> subMultiset(E e2, fu4 fu4Var, E e3, fu4 fu4Var2) {
        return delegate().subMultiset(e2, fu4Var, e3, fu4Var2);
    }

    @Override // com.google.common.collect.gb
    public gb<E> tailMultiset(E e2, fu4 fu4Var) {
        return delegate().tailMultiset(e2, fu4Var);
    }

    protected o05.InterfaceC4482k<E> x2() {
        Iterator<o05.InterfaceC4482k<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        o05.InterfaceC4482k<E> next = it.next();
        return m58i.ld6(next.getElement(), next.getCount());
    }

    @Override // com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
    public NavigableSet<E> elementSet() {
        return delegate().elementSet();
    }
}
