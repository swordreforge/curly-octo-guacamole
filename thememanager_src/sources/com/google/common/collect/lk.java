package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TreeMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class lk<E> extends kja0<E> implements Serializable {

    @wlev.zy
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g */
    private final transient f7l8<C4438g<E>> f26295g;

    /* JADX INFO: renamed from: s */
    private final transient C4438g<E> f26296s;

    /* JADX INFO: renamed from: y */
    private final transient zsr0<E> f26297y;

    /* JADX INFO: compiled from: TreeMultiset.java */
    private static final class f7l8<T> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private T f26298k;

        private f7l8() {
        }

        /* JADX INFO: renamed from: k */
        public void m15790k(@NullableDecl T t2, T t3) {
            if (this.f26298k != t2) {
                throw new ConcurrentModificationException();
            }
            this.f26298k = t3;
        }

        void toq() {
            this.f26298k = null;
        }

        @NullableDecl
        public T zy() {
            return this.f26298k;
        }

        /* synthetic */ f7l8(C4439k c4439k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.lk$g */
    /* JADX INFO: compiled from: TreeMultiset.java */
    private static final class C4438g<E> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @NullableDecl
        private C4438g<E> f68224f7l8;

        /* JADX INFO: renamed from: g */
        @NullableDecl
        private C4438g<E> f26299g;

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private final E f26300k;

        /* JADX INFO: renamed from: n */
        private int f26301n;

        /* JADX INFO: renamed from: q */
        private long f26302q;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        private C4438g<E> f26303s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f68225toq;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        private C4438g<E> f26304y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68226zy;

        C4438g(@NullableDecl E e2, int i2) {
            com.google.common.base.jk.m15383q(i2 > 0);
            this.f26300k = e2;
            this.f68225toq = i2;
            this.f26302q = i2;
            this.f68226zy = 1;
            this.f26301n = 1;
            this.f26299g = null;
            this.f68224f7l8 = null;
        }

        private C4438g<E> cdj(E e2, int i2) {
            C4438g<E> c4438g = new C4438g<>(e2, i2);
            this.f26299g = c4438g;
            lk.m15789y(this.f26304y, c4438g, this);
            this.f26301n = Math.max(2, this.f26301n);
            this.f68226zy++;
            this.f26302q += (long) i2;
            return this;
        }

        private static long d2ok(@NullableDecl C4438g<?> c4438g) {
            if (c4438g == null) {
                return 0L;
            }
            return ((C4438g) c4438g).f26302q;
        }

        private C4438g<E> d3() {
            com.google.common.base.jk.yz(this.f26299g != null);
            C4438g<E> c4438g = this.f26299g;
            this.f26299g = c4438g.f68224f7l8;
            c4438g.f68224f7l8 = this;
            c4438g.f26302q = this.f26302q;
            c4438g.f68226zy = this.f68226zy;
            m15798t();
            c4438g.mcp();
            return c4438g;
        }

        private C4438g<E> fti(C4438g<E> c4438g) {
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                return this.f26299g;
            }
            this.f68224f7l8 = c4438g2.fti(c4438g);
            this.f68226zy--;
            this.f26302q -= (long) c4438g.f68225toq;
            return wvg();
        }

        private C4438g<E> gvn7() {
            com.google.common.base.jk.yz(this.f68224f7l8 != null);
            C4438g<E> c4438g = this.f68224f7l8;
            this.f68224f7l8 = c4438g.f26299g;
            c4438g.f26299g = this;
            c4438g.f26302q = this.f26302q;
            c4438g.f68226zy = this.f68226zy;
            m15798t();
            c4438g.mcp();
            return c4438g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        /* JADX INFO: renamed from: i */
        public C4438g<E> m15792i(Comparator<? super E> comparator, E e2) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                return c4438g == null ? this : (C4438g) com.google.common.base.fu4.m15351k(c4438g.m15792i(comparator, e2), this);
            }
            if (iCompare == 0) {
                return this;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                return null;
            }
            return c4438g2.m15792i(comparator, e2);
        }

        private void jk() {
            this.f68226zy = lk.distinctElements(this.f26299g) + 1 + lk.distinctElements(this.f68224f7l8);
            this.f26302q = ((long) this.f68225toq) + d2ok(this.f26299g) + d2ok(this.f68224f7l8);
        }

        private C4438g<E> jp0y(C4438g<E> c4438g) {
            C4438g<E> c4438g2 = this.f26299g;
            if (c4438g2 == null) {
                return this.f68224f7l8;
            }
            this.f26299g = c4438g2.jp0y(c4438g);
            this.f68226zy--;
            this.f26302q -= (long) c4438g.f68225toq;
            return wvg();
        }

        private C4438g<E> ki(E e2, int i2) {
            C4438g<E> c4438g = new C4438g<>(e2, i2);
            this.f68224f7l8 = c4438g;
            lk.m15789y(this, c4438g, this.f26303s);
            this.f26301n = Math.max(2, this.f26301n);
            this.f68226zy++;
            this.f26302q += (long) i2;
            return this;
        }

        private void mcp() {
            this.f26301n = Math.max(o1t(this.f26299g), o1t(this.f68224f7l8)) + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        public C4438g<E> ni7(Comparator<? super E> comparator, E e2) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare > 0) {
                C4438g<E> c4438g = this.f68224f7l8;
                return c4438g == null ? this : (C4438g) com.google.common.base.fu4.m15351k(c4438g.ni7(comparator, e2), this);
            }
            if (iCompare == 0) {
                return this;
            }
            C4438g<E> c4438g2 = this.f26299g;
            if (c4438g2 == null) {
                return null;
            }
            return c4438g2.ni7(comparator, e2);
        }

        private static int o1t(@NullableDecl C4438g<?> c4438g) {
            if (c4438g == null) {
                return 0;
            }
            return ((C4438g) c4438g).f26301n;
        }

        /* JADX INFO: renamed from: t */
        private void m15798t() {
            jk();
            mcp();
        }

        private int t8r() {
            return o1t(this.f26299g) - o1t(this.f68224f7l8);
        }

        private C4438g<E> wvg() {
            int iT8r = t8r();
            if (iT8r == -2) {
                if (this.f68224f7l8.t8r() > 0) {
                    this.f68224f7l8 = this.f68224f7l8.d3();
                }
                return gvn7();
            }
            if (iT8r != 2) {
                mcp();
                return this;
            }
            if (this.f26299g.t8r() < 0) {
                this.f26299g = this.f26299g.gvn7();
            }
            return d3();
        }

        private C4438g<E> zurt() {
            int i2 = this.f68225toq;
            this.f68225toq = 0;
            lk.f7l8(this.f26304y, this.f26303s);
            C4438g<E> c4438g = this.f26299g;
            if (c4438g == null) {
                return this.f68224f7l8;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                return c4438g;
            }
            if (c4438g.f26301n >= c4438g2.f26301n) {
                C4438g<E> c4438g3 = this.f26304y;
                c4438g3.f26299g = c4438g.fti(c4438g3);
                c4438g3.f68224f7l8 = this.f68224f7l8;
                c4438g3.f68226zy = this.f68226zy - 1;
                c4438g3.f26302q = this.f26302q - ((long) i2);
                return c4438g3.wvg();
            }
            C4438g<E> c4438g4 = this.f26303s;
            c4438g4.f68224f7l8 = c4438g2.jp0y(c4438g4);
            c4438g4.f26299g = this.f26299g;
            c4438g4.f68226zy = this.f68226zy - 1;
            c4438g4.f26302q = this.f26302q - ((long) i2);
            return c4438g4.wvg();
        }

        /* JADX WARN: Multi-variable type inference failed */
        C4438g<E> a9(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                if (c4438g == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f26299g = c4438g.a9(comparator, e2, i2, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i2 >= i3) {
                        this.f68226zy--;
                        this.f26302q -= (long) i3;
                    } else {
                        this.f26302q -= (long) i2;
                    }
                }
                return i3 == 0 ? this : wvg();
            }
            if (iCompare <= 0) {
                int i4 = this.f68225toq;
                iArr[0] = i4;
                if (i2 >= i4) {
                    return zurt();
                }
                this.f68225toq = i4 - i2;
                this.f26302q -= (long) i2;
                return this;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f68224f7l8 = c4438g2.a9(comparator, e2, i2, iArr);
            int i5 = iArr[0];
            if (i5 > 0) {
                if (i2 >= i5) {
                    this.f68226zy--;
                    this.f26302q -= (long) i5;
                } else {
                    this.f26302q -= (long) i2;
                }
            }
            return wvg();
        }

        /* JADX WARN: Multi-variable type inference failed */
        C4438g<E> eqxt(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                if (c4438g == null) {
                    iArr[0] = 0;
                    return i2 > 0 ? cdj(e2, i2) : this;
                }
                this.f26299g = c4438g.eqxt(comparator, e2, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.f68226zy--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.f68226zy++;
                }
                this.f26302q += (long) (i2 - iArr[0]);
                return wvg();
            }
            if (iCompare <= 0) {
                int i3 = this.f68225toq;
                iArr[0] = i3;
                if (i2 == 0) {
                    return zurt();
                }
                this.f26302q += (long) (i2 - i3);
                this.f68225toq = i2;
                return this;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                iArr[0] = 0;
                return i2 > 0 ? ki(e2, i2) : this;
            }
            this.f68224f7l8 = c4438g2.eqxt(comparator, e2, i2, iArr);
            if (i2 == 0 && iArr[0] != 0) {
                this.f68226zy--;
            } else if (i2 > 0 && iArr[0] == 0) {
                this.f68226zy++;
            }
            this.f26302q += (long) (i2 - iArr[0]);
            return wvg();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int fn3e(Comparator<? super E> comparator, E e2) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                if (c4438g == null) {
                    return 0;
                }
                return c4438g.fn3e(comparator, e2);
            }
            if (iCompare <= 0) {
                return this.f68225toq;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                return 0;
            }
            return c4438g2.fn3e(comparator, e2);
        }

        int fu4() {
            return this.f68225toq;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        C4438g<E> m15800h(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                if (c4438g == null) {
                    iArr[0] = 0;
                    return cdj(e2, i2);
                }
                int i3 = c4438g.f26301n;
                C4438g<E> c4438gM15800h = c4438g.m15800h(comparator, e2, i2, iArr);
                this.f26299g = c4438gM15800h;
                if (iArr[0] == 0) {
                    this.f68226zy++;
                }
                this.f26302q += (long) i2;
                return c4438gM15800h.f26301n == i3 ? this : wvg();
            }
            if (iCompare <= 0) {
                int i4 = this.f68225toq;
                iArr[0] = i4;
                long j2 = i2;
                com.google.common.base.jk.m15383q(((long) i4) + j2 <= 2147483647L);
                this.f68225toq += i2;
                this.f26302q += j2;
                return this;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                iArr[0] = 0;
                return ki(e2, i2);
            }
            int i5 = c4438g2.f26301n;
            C4438g<E> c4438gM15800h2 = c4438g2.m15800h(comparator, e2, i2, iArr);
            this.f68224f7l8 = c4438gM15800h2;
            if (iArr[0] == 0) {
                this.f68226zy++;
            }
            this.f26302q += (long) i2;
            return c4438gM15800h2.f26301n == i5 ? this : wvg();
        }

        /* JADX WARN: Multi-variable type inference failed */
        C4438g<E> oc(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int i3, int[] iArr) {
            int iCompare = comparator.compare(e2, this.f26300k);
            if (iCompare < 0) {
                C4438g<E> c4438g = this.f26299g;
                if (c4438g == null) {
                    iArr[0] = 0;
                    return (i2 != 0 || i3 <= 0) ? this : cdj(e2, i3);
                }
                this.f26299g = c4438g.oc(comparator, e2, i2, i3, iArr);
                int i4 = iArr[0];
                if (i4 == i2) {
                    if (i3 == 0 && i4 != 0) {
                        this.f68226zy--;
                    } else if (i3 > 0 && i4 == 0) {
                        this.f68226zy++;
                    }
                    this.f26302q += (long) (i3 - i4);
                }
                return wvg();
            }
            if (iCompare <= 0) {
                int i5 = this.f68225toq;
                iArr[0] = i5;
                if (i2 == i5) {
                    if (i3 == 0) {
                        return zurt();
                    }
                    this.f26302q += (long) (i3 - i5);
                    this.f68225toq = i3;
                }
                return this;
            }
            C4438g<E> c4438g2 = this.f68224f7l8;
            if (c4438g2 == null) {
                iArr[0] = 0;
                return (i2 != 0 || i3 <= 0) ? this : ki(e2, i3);
            }
            this.f68224f7l8 = c4438g2.oc(comparator, e2, i2, i3, iArr);
            int i6 = iArr[0];
            if (i6 == i2) {
                if (i3 == 0 && i6 != 0) {
                    this.f68226zy--;
                } else if (i3 > 0 && i6 == 0) {
                    this.f68226zy++;
                }
                this.f26302q += (long) (i3 - i6);
            }
            return wvg();
        }

        public String toString() {
            return m58i.ld6(m15801z(), fu4()).toString();
        }

        /* JADX INFO: renamed from: z */
        E m15801z() {
            return this.f26300k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.lk$k */
    /* JADX INFO: compiled from: TreeMultiset.java */
    class C4439k extends m58i.AbstractC4452g<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4438g f26305k;

        C4439k(C4438g c4438g) {
            this.f26305k = c4438g;
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public int getCount() {
            int iFu4 = this.f26305k.fu4();
            return iFu4 == 0 ? lk.this.count(getElement()) : iFu4;
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public E getElement() {
            return (E) this.f26305k.m15801z();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.collect.lk$n */
    /* JADX INFO: compiled from: TreeMultiset.java */
    private static abstract class EnumC4440n {
        public static final EnumC4440n DISTINCT;
        public static final EnumC4440n SIZE;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4440n[] f26307k;

        /* JADX INFO: renamed from: com.google.common.collect.lk$n$k */
        /* JADX INFO: compiled from: TreeMultiset.java */
        enum k extends EnumC4440n {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.lk.EnumC4440n
            int nodeAggregate(C4438g<?> c4438g) {
                return ((C4438g) c4438g).f68225toq;
            }

            @Override // com.google.common.collect.lk.EnumC4440n
            long treeAggregate(@NullableDecl C4438g<?> c4438g) {
                if (c4438g == null) {
                    return 0L;
                }
                return ((C4438g) c4438g).f26302q;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.lk$n$toq */
        /* JADX INFO: compiled from: TreeMultiset.java */
        enum toq extends EnumC4440n {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.collect.lk.EnumC4440n
            int nodeAggregate(C4438g<?> c4438g) {
                return 1;
            }

            @Override // com.google.common.collect.lk.EnumC4440n
            long treeAggregate(@NullableDecl C4438g<?> c4438g) {
                if (c4438g == null) {
                    return 0L;
                }
                return ((C4438g) c4438g).f68226zy;
            }
        }

        static {
            k kVar = new k("SIZE", 0);
            SIZE = kVar;
            toq toqVar = new toq("DISTINCT", 1);
            DISTINCT = toqVar;
            f26307k = new EnumC4440n[]{kVar, toqVar};
        }

        private EnumC4440n(String str, int i2) {
        }

        public static EnumC4440n valueOf(String str) {
            return (EnumC4440n) Enum.valueOf(EnumC4440n.class, str);
        }

        public static EnumC4440n[] values() {
            return (EnumC4440n[]) f26307k.clone();
        }

        abstract int nodeAggregate(C4438g<?> c4438g);

        abstract long treeAggregate(@NullableDecl C4438g<?> c4438g);

        /* synthetic */ EnumC4440n(String str, int i2, C4439k c4439k) {
            this(str, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.lk$q */
    /* JADX INFO: compiled from: TreeMultiset.java */
    static /* synthetic */ class C4441q {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f26308k;

        static {
            int[] iArr = new int[fu4.values().length];
            f26308k = iArr;
            try {
                iArr[fu4.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26308k[fu4.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: TreeMultiset.java */
    class toq implements Iterator<o05.InterfaceC4482k<E>> {

        /* JADX INFO: renamed from: k */
        C4438g<E> f26309k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        o05.InterfaceC4482k<E> f26311q;

        toq() {
            this.f26309k = lk.this.m15787n();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26309k == null) {
                return false;
            }
            if (!lk.this.f26297y.tooHigh(this.f26309k.m15801z())) {
                return true;
            }
            this.f26309k = null;
            return false;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            o05.InterfaceC4482k<E> interfaceC4482kM15788s = lk.this.m15788s(this.f26309k);
            this.f26311q = interfaceC4482kM15788s;
            if (((C4438g) this.f26309k).f26303s == lk.this.f26296s) {
                this.f26309k = null;
            } else {
                this.f26309k = ((C4438g) this.f26309k).f26303s;
            }
            return interfaceC4482kM15788s;
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26311q != null);
            lk.this.setCount(this.f26311q.getElement(), 0);
            this.f26311q = null;
        }
    }

    /* JADX INFO: compiled from: TreeMultiset.java */
    class zy implements Iterator<o05.InterfaceC4482k<E>> {

        /* JADX INFO: renamed from: k */
        C4438g<E> f26312k;

        /* JADX INFO: renamed from: q */
        o05.InterfaceC4482k<E> f26314q = null;

        zy() {
            this.f26312k = lk.this.m15785g();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26312k == null) {
                return false;
            }
            if (!lk.this.f26297y.tooLow(this.f26312k.m15801z())) {
                return true;
            }
            this.f26312k = null;
            return false;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            o05.InterfaceC4482k<E> interfaceC4482kM15788s = lk.this.m15788s(this.f26312k);
            this.f26314q = interfaceC4482kM15788s;
            if (((C4438g) this.f26312k).f26304y == lk.this.f26296s) {
                this.f26312k = null;
            } else {
                this.f26312k = ((C4438g) this.f26312k).f26304y;
            }
            return interfaceC4482kM15788s;
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26314q != null);
            lk.this.setCount(this.f26314q.getElement(), 0);
            this.f26314q = null;
        }
    }

    lk(f7l8<C4438g<E>> f7l8Var, zsr0<E> zsr0Var, C4438g<E> c4438g) {
        super(zsr0Var.comparator());
        this.f26295g = f7l8Var;
        this.f26297y = zsr0Var;
        this.f26296s = c4438g;
    }

    public static <E extends Comparable> lk<E> create() {
        return new lk<>(kx3.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void f7l8(C4438g<T> c4438g, C4438g<T> c4438g2) {
        ((C4438g) c4438g).f26303s = c4438g2;
        ((C4438g) c4438g2).f26304y = c4438g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    /* JADX INFO: renamed from: g */
    public C4438g<E> m15785g() {
        C4438g<E> c4438gNi7;
        if (this.f26295g.zy() == null) {
            return null;
        }
        if (this.f26297y.hasUpperBound()) {
            E upperEndpoint = this.f26297y.getUpperEndpoint();
            c4438gNi7 = this.f26295g.zy().ni7(comparator(), upperEndpoint);
            if (c4438gNi7 == null) {
                return null;
            }
            if (this.f26297y.getUpperBoundType() == fu4.OPEN && comparator().compare(upperEndpoint, c4438gNi7.m15801z()) == 0) {
                c4438gNi7 = ((C4438g) c4438gNi7).f26304y;
            }
        } else {
            c4438gNi7 = ((C4438g) this.f26296s).f26304y;
        }
        if (c4438gNi7 == this.f26296s || !this.f26297y.contains(c4438gNi7.m15801z())) {
            return null;
        }
        return c4438gNi7;
    }

    /* JADX INFO: renamed from: k */
    private long m15786k(EnumC4440n enumC4440n, @NullableDecl C4438g<E> c4438g) {
        long jTreeAggregate;
        long jM15786k;
        if (c4438g == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.f26297y.getUpperEndpoint(), ((C4438g) c4438g).f26300k);
        if (iCompare > 0) {
            return m15786k(enumC4440n, ((C4438g) c4438g).f68224f7l8);
        }
        if (iCompare == 0) {
            int i2 = C4441q.f26308k[this.f26297y.getUpperBoundType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return enumC4440n.treeAggregate(((C4438g) c4438g).f68224f7l8);
                }
                throw new AssertionError();
            }
            jTreeAggregate = enumC4440n.nodeAggregate(c4438g);
            jM15786k = enumC4440n.treeAggregate(((C4438g) c4438g).f68224f7l8);
        } else {
            jTreeAggregate = enumC4440n.treeAggregate(((C4438g) c4438g).f68224f7l8) + ((long) enumC4440n.nodeAggregate(c4438g));
            jM15786k = m15786k(enumC4440n, ((C4438g) c4438g).f26299g);
        }
        return jTreeAggregate + jM15786k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    /* JADX INFO: renamed from: n */
    public C4438g<E> m15787n() {
        C4438g<E> c4438gM15792i;
        if (this.f26295g.zy() == null) {
            return null;
        }
        if (this.f26297y.hasLowerBound()) {
            E lowerEndpoint = this.f26297y.getLowerEndpoint();
            c4438gM15792i = this.f26295g.zy().m15792i(comparator(), lowerEndpoint);
            if (c4438gM15792i == null) {
                return null;
            }
            if (this.f26297y.getLowerBoundType() == fu4.OPEN && comparator().compare(lowerEndpoint, c4438gM15792i.m15801z()) == 0) {
                c4438gM15792i = ((C4438g) c4438gM15792i).f26303s;
            }
        } else {
            c4438gM15792i = ((C4438g) this.f26296s).f26303s;
        }
        if (c4438gM15792i == this.f26296s || !this.f26297y.contains(c4438gM15792i.m15801z())) {
            return null;
        }
        return c4438gM15792i;
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        el.m15645k(kja0.class, "comparator").toq(this, comparator);
        el.m15645k(lk.class, "range").toq(this, zsr0.all(comparator));
        el.m15645k(lk.class, "rootReference").toq(this, new f7l8(null));
        C4438g c4438g = new C4438g(null, 1);
        el.m15645k(lk.class, "header").toq(this, c4438g);
        f7l8(c4438g, c4438g);
        el.m15644g(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public o05.InterfaceC4482k<E> m15788s(C4438g<E> c4438g) {
        return new C4439k(c4438g);
    }

    private long toq(EnumC4440n enumC4440n, @NullableDecl C4438g<E> c4438g) {
        long jTreeAggregate;
        long qVar;
        if (c4438g == null) {
            return 0L;
        }
        int iCompare = comparator().compare(this.f26297y.getLowerEndpoint(), ((C4438g) c4438g).f26300k);
        if (iCompare < 0) {
            return toq(enumC4440n, ((C4438g) c4438g).f26299g);
        }
        if (iCompare == 0) {
            int i2 = C4441q.f26308k[this.f26297y.getLowerBoundType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return enumC4440n.treeAggregate(((C4438g) c4438g).f26299g);
                }
                throw new AssertionError();
            }
            jTreeAggregate = enumC4440n.nodeAggregate(c4438g);
            qVar = enumC4440n.treeAggregate(((C4438g) c4438g).f26299g);
        } else {
            jTreeAggregate = enumC4440n.treeAggregate(((C4438g) c4438g).f26299g) + ((long) enumC4440n.nodeAggregate(c4438g));
            qVar = toq(enumC4440n, ((C4438g) c4438g).f68224f7l8);
        }
        return jTreeAggregate + qVar;
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        el.ld6(this, objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static <T> void m15789y(C4438g<T> c4438g, C4438g<T> c4438g2, C4438g<T> c4438g3) {
        f7l8(c4438g, c4438g2);
        f7l8(c4438g2, c4438g3);
    }

    private long zy(EnumC4440n enumC4440n) {
        C4438g<E> c4438gZy = this.f26295g.zy();
        long jTreeAggregate = enumC4440n.treeAggregate(c4438gZy);
        if (this.f26297y.hasLowerBound()) {
            jTreeAggregate -= toq(enumC4440n, c4438gZy);
        }
        return this.f26297y.hasUpperBound() ? jTreeAggregate - m15786k(enumC4440n, c4438gZy) : jTreeAggregate;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i2) {
        C4524t.toq(i2, "occurrences");
        if (i2 == 0) {
            return count(e2);
        }
        com.google.common.base.jk.m15383q(this.f26297y.contains(e2));
        C4438g<E> c4438gZy = this.f26295g.zy();
        if (c4438gZy != null) {
            int[] iArr = new int[1];
            this.f26295g.m15790k(c4438gZy, c4438gZy.m15800h(comparator(), e2, i2, iArr));
            return iArr[0];
        }
        comparator().compare(e2, e2);
        C4438g<E> c4438g = new C4438g<>(e2, i2);
        C4438g<E> c4438g2 = this.f26296s;
        m15789y(c4438g2, c4438g, c4438g2);
        this.f26295g.m15790k(c4438gZy, c4438g);
        return 0;
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f26297y.hasLowerBound() || this.f26297y.hasUpperBound()) {
            zwy.m16135y(entryIterator());
            return;
        }
        C4438g<E> c4438g = ((C4438g) this.f26296s).f26303s;
        while (true) {
            C4438g<E> c4438g2 = this.f26296s;
            if (c4438g == c4438g2) {
                f7l8(c4438g2, c4438g2);
                this.f26295g.toq();
                return;
            }
            C4438g<E> c4438g3 = ((C4438g) c4438g).f26303s;
            ((C4438g) c4438g).f68225toq = 0;
            ((C4438g) c4438g).f26299g = null;
            ((C4438g) c4438g).f68224f7l8 = null;
            ((C4438g) c4438g).f26304y = null;
            ((C4438g) c4438g).f26303s = null;
            c4438g = c4438g3;
        }
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb, com.google.common.collect.f1bi
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        try {
            C4438g<E> c4438gZy = this.f26295g.zy();
            if (this.f26297y.contains(obj) && c4438gZy != null) {
                return c4438gZy.fn3e(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.kja0
    Iterator<o05.InterfaceC4482k<E>> descendingEntryIterator() {
        return new zy();
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ gb descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC4519s
    int distinctElements() {
        return C4746s.fu4(zy(EnumC4440n.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<E> elementIterator() {
        return m58i.m15842y(entryIterator());
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<o05.InterfaceC4482k<E>> entryIterator() {
        return new toq();
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ o05.InterfaceC4482k firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.gb
    public gb<E> headMultiset(@NullableDecl E e2, fu4 fu4Var) {
        return new lk(this.f26295g, this.f26297y.intersect(zsr0.upTo(comparator(), e2, fu4Var)), this.f26296s);
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public Iterator<E> iterator() {
        return m58i.n7h(this);
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ o05.InterfaceC4482k lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ o05.InterfaceC4482k pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ o05.InterfaceC4482k pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
        C4524t.toq(i2, "occurrences");
        if (i2 == 0) {
            return count(obj);
        }
        C4438g<E> c4438gZy = this.f26295g.zy();
        int[] iArr = new int[1];
        try {
            if (this.f26297y.contains(obj) && c4438gZy != null) {
                this.f26295g.m15790k(c4438gZy, c4438gZy.a9(comparator(), obj, i2, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i2) {
        C4524t.toq(i2, "count");
        if (!this.f26297y.contains(e2)) {
            com.google.common.base.jk.m15383q(i2 == 0);
            return 0;
        }
        C4438g<E> c4438gZy = this.f26295g.zy();
        if (c4438gZy == null) {
            if (i2 > 0) {
                add(e2, i2);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f26295g.m15790k(c4438gZy, c4438gZy.eqxt(comparator(), e2, i2, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        return C4746s.fu4(zy(EnumC4440n.SIZE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.kja0, com.google.common.collect.gb
    public /* bridge */ /* synthetic */ gb subMultiset(@NullableDecl Object obj, fu4 fu4Var, @NullableDecl Object obj2, fu4 fu4Var2) {
        return super.subMultiset(obj, fu4Var, obj2, fu4Var2);
    }

    @Override // com.google.common.collect.gb
    public gb<E> tailMultiset(@NullableDecl E e2, fu4 fu4Var) {
        return new lk(this.f26295g, this.f26297y.intersect(zsr0.downTo(comparator(), e2, fu4Var)), this.f26296s);
    }

    public static <E> lk<E> create(@NullableDecl Comparator<? super E> comparator) {
        return comparator == null ? new lk<>(kx3.natural()) : new lk<>(comparator);
    }

    static int distinctElements(@NullableDecl C4438g<?> c4438g) {
        if (c4438g == null) {
            return 0;
        }
        return ((C4438g) c4438g).f68226zy;
    }

    public static <E extends Comparable> lk<E> create(Iterable<? extends E> iterable) {
        lk<E> lkVarCreate = create();
        nsb.m15905k(lkVarCreate, iterable);
        return lkVarCreate;
    }

    lk(Comparator<? super E> comparator) {
        super(comparator);
        this.f26297y = zsr0.all(comparator);
        C4438g<E> c4438g = new C4438g<>(null, 1);
        this.f26296s = c4438g;
        f7l8(c4438g, c4438g);
        this.f26295g = new f7l8<>(null);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i2, int i3) {
        C4524t.toq(i3, "newCount");
        C4524t.toq(i2, "oldCount");
        com.google.common.base.jk.m15383q(this.f26297y.contains(e2));
        C4438g<E> c4438gZy = this.f26295g.zy();
        if (c4438gZy != null) {
            int[] iArr = new int[1];
            this.f26295g.m15790k(c4438gZy, c4438gZy.oc(comparator(), e2, i2, i3, iArr));
            return iArr[0] == i2;
        }
        if (i2 != 0) {
            return false;
        }
        if (i3 > 0) {
            add(e2, i3);
        }
        return true;
    }
}
