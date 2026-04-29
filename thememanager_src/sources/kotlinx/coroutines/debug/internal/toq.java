package kotlinx.coroutines.debug.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.common.util.concurrent.C4849x;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.C6480z;
import kotlin.collections.AbstractC6172y;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.fn3e;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7627q;
import r6ty.f7l8;
import v5yj.C7704k;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0017\u001f\u001bB\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010 ¨\u0006'"}, d2 = {"Lkotlinx/coroutines/debug/internal/toq;", "", "K", "V", "Lkotlin/collections/f7l8;", "Lkotlin/was;", "ld6", "()V", InterfaceC1925p.qn, "value", "x2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ld6;", AnimatedProperty.PROPERTY_NAME_W, "p", "(Lkotlinx/coroutines/debug/internal/ld6;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "n7h", "Ljava/lang/ref/ReferenceQueue;", "k", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "zy", "()I", "size", "", "toq", "()Ljava/util/Set;", "keys", "", "entries", "", C4991s.f28129n, "(Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class toq<K, V> extends kotlin.collections.f7l8<K, V> {

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f36907q = AtomicIntegerFieldUpdater.newUpdater(toq.class, "_size");

    @InterfaceC7396q
    private volatile /* synthetic */ int _size;

    @InterfaceC7396q
    volatile /* synthetic */ Object core;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final ReferenceQueue<K> f36908k;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.toq$k */
    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0002\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/toq$k;", "", "", "hash", "q", "(I)I", "index", "Lkotlin/was;", C7704k.y.toq.f44691k, "(I)V", InterfaceC1925p.qn, "zy", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/ld6;", "weakKey0", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/ld6;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/toq;", AnimatedProperty.PROPERTY_NAME_Y, "()Lkotlinx/coroutines/debug/internal/toq$k;", "weakRef", "toq", "(Lkotlinx/coroutines/debug/internal/ld6;)V", C0846k.d9i, "Lkotlin/Function2;", "factory", "", "n", "(Lcyoe/h;)Ljava/util/Iterator;", "k", com.market.sdk.reflect.toq.f28131g, "allocated", "shift", "threshold", C4991s.f28129n, "(Lkotlinx/coroutines/debug/internal/toq;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class C6547k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f81980f7l8 = AtomicIntegerFieldUpdater.newUpdater(C6547k.class, "load");

        /* JADX INFO: renamed from: k */
        private final int f36910k;

        @InterfaceC7396q
        private volatile /* synthetic */ int load = 0;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        /* synthetic */ AtomicReferenceArray f36911n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        /* synthetic */ AtomicReferenceArray f36912q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f81981toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f81982zy;

        /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.toq$k$k */
        /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
        @d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/toq$k$k;", C0846k.d9i, "", "Lkotlin/was;", "k", "", "hasNext", "next", "()Ljava/lang/Object;", "", "toq", "Lkotlin/Function2;", "Lcyoe/h;", "factory", "", "q", com.market.sdk.reflect.toq.f28131g, "index", "n", "Ljava/lang/Object;", InterfaceC1925p.qn, C7704k.y.toq.f95579toq, "value", C4991s.f28129n, "(Lkotlinx/coroutines/debug/internal/toq$k;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        private final class k<E> implements Iterator<E>, InterfaceC7627q {

            /* JADX INFO: renamed from: g */
            private V f36913g;

            /* JADX INFO: renamed from: k */
            @InterfaceC7396q
            private final InterfaceC5979h<K, V, E> f36914k;

            /* JADX INFO: renamed from: n */
            private K f36915n;

            /* JADX INFO: renamed from: q */
            private int f36916q = -1;

            /* JADX WARN: Multi-variable type inference failed */
            public k(@InterfaceC7396q InterfaceC5979h<? super K, ? super V, ? extends E> interfaceC5979h) {
                this.f36914k = interfaceC5979h;
                m24035k();
            }

            /* JADX INFO: renamed from: k */
            private final void m24035k() {
                while (true) {
                    int i2 = this.f36916q + 1;
                    this.f36916q = i2;
                    if (i2 >= ((C6547k) C6547k.this).f36910k) {
                        return;
                    }
                    ld6 ld6Var = (ld6) C6547k.this.f36912q.get(this.f36916q);
                    K k2 = ld6Var == null ? null : (K) ld6Var.get();
                    if (k2 != null) {
                        this.f36915n = k2;
                        Object obj = (V) C6547k.this.f36911n.get(this.f36916q);
                        if (obj instanceof x2) {
                            obj = (V) ((x2) obj).f36922k;
                        }
                        if (obj != null) {
                            this.f36913g = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f36916q < ((C6547k) C6547k.this).f36910k;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.f36916q >= ((C6547k) C6547k.this).f36910k) {
                    throw new NoSuchElementException();
                }
                InterfaceC5979h<K, V, E> interfaceC5979h = this.f36914k;
                K k2 = this.f36915n;
                if (k2 == false) {
                    d2ok.n5r1(InterfaceC1925p.qn);
                    k2 = (K) was.f36763k;
                }
                V v2 = this.f36913g;
                if (v2 == false) {
                    d2ok.n5r1("value");
                    v2 = (V) was.f36763k;
                }
                E e2 = (E) interfaceC5979h.invoke(k2, v2);
                m24035k();
                return e2;
            }

            @Override // java.util.Iterator
            @InterfaceC7396q
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.zy.m24037n();
                throw new C6480z();
            }
        }

        public C6547k(int i2) {
            this.f36910k = i2;
            this.f81981toq = Integer.numberOfLeadingZeros(i2) + 1;
            this.f81982zy = (i2 * 2) / 3;
            this.f36912q = new AtomicReferenceArray(i2);
            this.f36911n = new AtomicReferenceArray(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object f7l8(C6547k c6547k, Object obj, Object obj2, ld6 ld6Var, int i2, Object obj3) {
            if ((i2 & 4) != 0) {
                ld6Var = null;
            }
            return c6547k.m24032g(obj, obj2, ld6Var);
        }

        /* JADX INFO: renamed from: q */
        private final int m24030q(int i2) {
            return (i2 * (-1640531527)) >>> this.f81981toq;
        }

        /* JADX INFO: renamed from: s */
        private final void m24031s(int i2) {
            Object obj;
            do {
                obj = this.f36911n.get(i2);
                if (obj == null || (obj instanceof x2)) {
                    return;
                }
            } while (!C4849x.m17025k(this.f36911n, i2, obj, null));
            toq.this.ld6();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final Object m24032g(@InterfaceC7396q K k2, @InterfaceC7395n V v2, @InterfaceC7395n ld6<K> ld6Var) {
            int i2;
            Object obj;
            int iM24030q = m24030q(k2.hashCode());
            boolean z2 = false;
            while (true) {
                ld6 ld6Var2 = (ld6) this.f36912q.get(iM24030q);
                if (ld6Var2 != null) {
                    T t2 = ld6Var2.get();
                    if (!d2ok.f7l8(k2, t2)) {
                        if (t2 == 0) {
                            m24031s(iM24030q);
                        }
                        if (iM24030q == 0) {
                            iM24030q = this.f36910k;
                        }
                        iM24030q--;
                    } else if (z2) {
                        f81980f7l8.decrementAndGet(this);
                    }
                } else {
                    if (v2 == null) {
                        return null;
                    }
                    if (!z2) {
                        do {
                            i2 = this.load;
                            if (i2 >= this.f81982zy) {
                                return kotlinx.coroutines.debug.internal.zy.f81984zy;
                            }
                        } while (!f81980f7l8.compareAndSet(this, i2, i2 + 1));
                        z2 = true;
                    }
                    if (ld6Var == null) {
                        ld6Var = new ld6<>(k2, ((toq) toq.this).f36908k);
                    }
                    if (C4849x.m17025k(this.f36912q, iM24030q, null, ld6Var)) {
                        break;
                    }
                }
            }
            do {
                obj = this.f36911n.get(iM24030q);
                if (obj instanceof x2) {
                    return kotlinx.coroutines.debug.internal.zy.f81984zy;
                }
            } while (!C4849x.m17025k(this.f36911n, iM24030q, obj, v2));
            return obj;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final <E> Iterator<E> m24033n(@InterfaceC7396q InterfaceC5979h<? super K, ? super V, ? extends E> interfaceC5979h) {
            return new k(interfaceC5979h);
        }

        public final void toq(@InterfaceC7396q ld6<?> ld6Var) {
            int iM24030q = m24030q(ld6Var.f36895k);
            while (true) {
                ld6<?> ld6Var2 = (ld6) this.f36912q.get(iM24030q);
                if (ld6Var2 == null) {
                    return;
                }
                if (ld6Var2 == ld6Var) {
                    m24031s(iM24030q);
                    return;
                } else {
                    if (iM24030q == 0) {
                        iM24030q = this.f36910k;
                    }
                    iM24030q--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final toq<K, V>.C6547k m24034y() {
            int i2;
            Object obj;
            while (true) {
                toq<K, V>.C6547k c6547k = (toq<K, V>.C6547k) toq.this.new C6547k(Integer.highestOneBit(fn3e.fn3e(toq.this.size(), 4)) * 4);
                int i3 = this.f36910k;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    ld6 ld6Var = (ld6) this.f36912q.get(i2);
                    Object obj2 = ld6Var == null ? null : ld6Var.get();
                    if (ld6Var != null && obj2 == null) {
                        m24031s(i2);
                    }
                    while (true) {
                        obj = this.f36911n.get(i2);
                        if (obj instanceof x2) {
                            obj = ((x2) obj).f36922k;
                            break;
                        }
                        if (C4849x.m17025k(this.f36911n, i2, obj, kotlinx.coroutines.debug.internal.zy.m24038q(obj))) {
                            break;
                        }
                    }
                    i2 = (obj2 == null || obj == null || c6547k.m24032g(obj2, obj, ld6Var) != kotlinx.coroutines.debug.internal.zy.f81984zy) ? i4 : 0;
                }
                return c6547k;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7395n
        public final V zy(@InterfaceC7396q K k2) {
            int iM24030q = m24030q(k2.hashCode());
            while (true) {
                ld6 ld6Var = (ld6) this.f36912q.get(iM24030q);
                if (ld6Var == null) {
                    return null;
                }
                T t2 = ld6Var.get();
                if (d2ok.f7l8(k2, t2)) {
                    V v2 = (V) this.f36911n.get(iM24030q);
                    return v2 instanceof x2 ? (V) ((x2) v2).f36922k : v2;
                }
                if (t2 == 0) {
                    m24031s(iM24030q);
                }
                if (iM24030q == 0) {
                    iM24030q = this.f36910k;
                }
                iM24030q--;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.toq$n */
    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @d3(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6548n extends AbstractC6308r implements InterfaceC5979h<K, V, K> {
        public static final C6548n INSTANCE = new C6548n();

        C6548n() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final K invoke(@InterfaceC7396q K k2, @InterfaceC7396q V v2) {
            return k2;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.toq$q */
    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @d3(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "V", "", "k", "v", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6549q extends AbstractC6308r implements InterfaceC5979h<K, V, Map.Entry<K, V>> {
        public static final C6549q INSTANCE = new C6549q();

        C6549q() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final Map.Entry<K, V> invoke(@InterfaceC7396q K k2, @InterfaceC7396q V v2) {
            return new C8071toq(k2, v2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/toq$toq;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", InterfaceC1925p.qn, "q", "getValue", "value", C4991s.f28129n, "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C8071toq<K, V> implements Map.Entry<K, V>, f7l8.InterfaceC7623k {

        /* JADX INFO: renamed from: k */
        private final K f36918k;

        /* JADX INFO: renamed from: q */
        private final V f36919q;

        public C8071toq(K k2, V v2) {
            this.f36918k = k2;
            this.f36919q = v2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f36918k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f36919q;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            kotlinx.coroutines.debug.internal.zy.m24037n();
            throw new C6480z();
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/toq$zy;", C0846k.d9i, "Lkotlin/collections/y;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", "k", "Lcyoe/h;", "factory", "", "getSize", "()I", "size", C4991s.f28129n, "(Lkotlinx/coroutines/debug/internal/toq;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class zy<E> extends AbstractC6172y<E> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final InterfaceC5979h<K, V, E> f36920k;

        /* JADX WARN: Multi-variable type inference failed */
        public zy(@InterfaceC7396q InterfaceC5979h<? super K, ? super V, ? extends E> interfaceC5979h) {
            this.f36920k = interfaceC5979h;
        }

        @Override // kotlin.collections.AbstractC6172y, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e2) {
            kotlinx.coroutines.debug.internal.zy.m24037n();
            throw new C6480z();
        }

        @Override // kotlin.collections.AbstractC6172y
        public int getSize() {
            return toq.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @InterfaceC7396q
        public Iterator<E> iterator() {
            return ((C6547k) toq.this.core).m24033n(this.f36920k);
        }
    }

    public toq() {
        this(false, 1, null);
    }

    public /* synthetic */ toq(boolean z2, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? false : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ld6() {
        f36907q.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: p */
    private final void m24027p(ld6<?> ld6Var) {
        ((C6547k) this.core).toq(ld6Var);
    }

    private final synchronized V x2(K k2, V v2) {
        V v3;
        C6547k c6547kM24034y = (C6547k) this.core;
        while (true) {
            v3 = (V) C6547k.f7l8(c6547kM24034y, k2, v2, null, 4, null);
            if (v3 == kotlinx.coroutines.debug.internal.zy.f81984zy) {
                c6547kM24034y = c6547kM24034y.m24034y();
                this.core = c6547kM24034y;
            }
        }
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC7395n
    public V get(@InterfaceC7395n Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((C6547k) this.core).zy(obj);
    }

    @Override // kotlin.collections.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public Set<Map.Entry<K, V>> mo22488k() {
        return new zy(C6549q.INSTANCE);
    }

    public final void n7h() {
        if (!(this.f36908k != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.f36908k.remove();
                if (referenceRemove == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                }
                m24027p((ld6) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.f7l8, java.util.AbstractMap, java.util.Map
    @InterfaceC7395n
    public V put(@InterfaceC7396q K k2, @InterfaceC7396q V v2) {
        V vX2 = (V) C6547k.f7l8((C6547k) this.core, k2, v2, null, 4, null);
        if (vX2 == kotlinx.coroutines.debug.internal.zy.f81984zy) {
            vX2 = x2(k2, v2);
        }
        if (vX2 == null) {
            f36907q.incrementAndGet(this);
        }
        return vX2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC7395n
    public V remove(@InterfaceC7395n Object obj) {
        if (obj == 0) {
            return null;
        }
        V vX2 = (V) C6547k.f7l8((C6547k) this.core, obj, null, null, 4, null);
        if (vX2 == kotlinx.coroutines.debug.internal.zy.f81984zy) {
            vX2 = x2(obj, null);
        }
        if (vX2 != null) {
            f36907q.decrementAndGet(this);
        }
        return vX2;
    }

    @Override // kotlin.collections.f7l8
    @InterfaceC7396q
    public Set<K> toq() {
        return new zy(C6548n.INSTANCE);
    }

    @Override // kotlin.collections.f7l8
    public int zy() {
        return this._size;
    }

    public toq(boolean z2) {
        this._size = 0;
        this.core = new C6547k(16);
        this.f36908k = z2 ? new ReferenceQueue<>() : null;
    }
}
