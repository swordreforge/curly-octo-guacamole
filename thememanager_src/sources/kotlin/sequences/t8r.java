package kotlin.sequences;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6227f;
import kotlin.C6318m;
import kotlin.collections.C6144h;
import kotlin.collections.C6163t;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6244y;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.random.AbstractC6332g;
import kotlin.was;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
public class t8r extends ki {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    static final class f7l8<T> extends AbstractC6308r implements cyoe.x2<T, T> {
        final /* synthetic */ InterfaceC5981k<T> $nextFunction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f7l8(InterfaceC5981k<? extends T> interfaceC5981k) {
            super(1);
            this.$nextFunction = interfaceC5981k;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final T invoke(@InterfaceC7396q T it) {
            d2ok.m23075h(it, "it");
            return this.$nextFunction.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$g */
    /* JADX INFO: compiled from: Sequences.kt */
    static final class C6412g<T> extends AbstractC6308r implements cyoe.x2<T, T> {
        public static final C6412g INSTANCE = new C6412g();

        C6412g() {
            super(1);
        }

        @Override // cyoe.x2
        public final T invoke(T t2) {
            return t2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$k */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    public static final class C6413k<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k<Iterator<T>> f36634k;

        /* JADX WARN: Multi-variable type inference failed */
        public C6413k(InterfaceC5981k<? extends Iterator<? extends T>> interfaceC5981k) {
            this.f36634k = interfaceC5981k;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return this.f36634k.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$n */
    /* JADX INFO: compiled from: Sequences.kt */
    static final class C6414n<T> extends AbstractC6308r implements cyoe.x2<Iterable<? extends T>, Iterator<? extends T>> {
        public static final C6414n INSTANCE = new C6414n();

        C6414n() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<T> invoke(@InterfaceC7396q Iterable<? extends T> it) {
            d2ok.m23075h(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$p */
    /* JADX INFO: compiled from: Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m22756f = "Sequences.kt", m22757i = {0, 0}, m22758l = {145}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "buffer"}, m22761s = {"L$0", "L$1"})
    static final class C6415p<T> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ AbstractC6332g $random;
        final /* synthetic */ qrj<T> $this_shuffled;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6415p(qrj<? extends T> qrjVar, AbstractC6332g abstractC6332g, InterfaceC6216q<? super C6415p> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_shuffled = qrjVar;
            this.$random = abstractC6332g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6415p c6415p = new C6415p(this.$this_shuffled, this.$random, interfaceC6216q);
            c6415p.L$0 = obj;
            return c6415p;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super T> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6415p) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            List listVss1;
            kja0 kja0Var;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var2 = (kja0) this.L$0;
                listVss1 = fn3e.vss1(this.$this_shuffled);
                kja0Var = kja0Var2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                listVss1 = (List) this.L$1;
                kja0 kja0Var3 = (kja0) this.L$0;
                C6318m.n7h(obj);
                kja0Var = kja0Var3;
            }
            while (!listVss1.isEmpty()) {
                int iNextInt = this.$random.nextInt(listVss1.size());
                Object objG1 = C6163t.g1(listVss1);
                if (iNextInt < listVss1.size()) {
                    objG1 = listVss1.set(iNextInt, objG1);
                }
                this.L$0 = kja0Var;
                this.L$1 = listVss1;
                this.label = 1;
                if (kja0Var.toq(objG1, this) == objX2) {
                    return objX2;
                }
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$q */
    /* JADX INFO: compiled from: Sequences.kt */
    static final class C6416q<T> extends AbstractC6308r implements cyoe.x2<qrj<? extends T>, Iterator<? extends T>> {
        public static final C6416q INSTANCE = new C6416q();

        C6416q() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<T> invoke(@InterfaceC7396q qrj<? extends T> it) {
            d2ok.m23075h(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$s */
    /* JADX INFO: compiled from: Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m22756f = "Sequences.kt", m22757i = {}, m22758l = {69, 71}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C6417s<T> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5981k<qrj<T>> $defaultValue;
        final /* synthetic */ qrj<T> $this_ifEmpty;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6417s(qrj<? extends T> qrjVar, InterfaceC5981k<? extends qrj<? extends T>> interfaceC5981k, InterfaceC6216q<? super C6417s> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_ifEmpty = qrjVar;
            this.$defaultValue = interfaceC5981k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6417s c6417s = new C6417s(this.$this_ifEmpty, this.$defaultValue, interfaceC6216q);
            c6417s.L$0 = obj;
            return c6417s;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super T> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6417s) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var = (kja0) this.L$0;
                Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                if (it.hasNext()) {
                    this.label = 1;
                    if (kja0Var.mo23450g(it, this) == objX2) {
                        return objX2;
                    }
                } else {
                    qrj<T> qrjVarInvoke = this.$defaultValue.invoke();
                    this.label = 2;
                    if (kja0Var.f7l8(qrjVarInvoke, this) == objX2) {
                        return objX2;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    public static final class toq<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f36635k;

        public toq(Iterator it) {
            this.f36635k = it;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return this.f36635k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.t8r$y */
    /* JADX INFO: compiled from: Sequences.kt */
    static final class C6418y<T> extends AbstractC6308r implements InterfaceC5981k<T> {
        final /* synthetic */ T $seed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6418y(T t2) {
            super(0);
            this.$seed = t2;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final T invoke() {
            return this.$seed;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m22756f = "Sequences.kt", m22757i = {0, 0}, m22758l = {332}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "index"}, m22761s = {"L$0", "I$0"})
    static final class zy<R> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kja0<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ cyoe.x2<C, Iterator<R>> $iterator;
        final /* synthetic */ qrj<T> $source;
        final /* synthetic */ InterfaceC5979h<Integer, T, C> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(qrj<? extends T> qrjVar, InterfaceC5979h<? super Integer, ? super T, ? extends C> interfaceC5979h, cyoe.x2<? super C, ? extends Iterator<? extends R>> x2Var, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$source = qrjVar;
            this.$transform = interfaceC5979h;
            this.$iterator = x2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            zy zyVar = new zy(this.$source, this.$transform, this.$iterator, interfaceC6216q);
            zyVar.L$0 = obj;
            return zyVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kja0<? super R> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2;
            Iterator it;
            kja0 kja0Var;
            Object objX2 = C6199q.x2();
            int i3 = this.label;
            if (i3 == 0) {
                C6318m.n7h(obj);
                kja0 kja0Var2 = (kja0) this.L$0;
                i2 = 0;
                it = this.$source.iterator();
                kja0Var = kja0Var2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                it = (Iterator) this.L$1;
                kja0Var = (kja0) this.L$0;
                C6318m.n7h(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                InterfaceC5979h<Integer, T, C> interfaceC5979h = this.$transform;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.ni7.lrht();
                }
                Iterator<R> itInvoke = this.$iterator.invoke((C) interfaceC5979h.invoke(kotlin.coroutines.jvm.internal.toq.m22765g(i2), (T) next));
                this.L$0 = kja0Var;
                this.L$1 = it;
                this.I$0 = i4;
                this.label = 1;
                if (kja0Var.mo23450g(itInvoke, this) == objX2) {
                    return objX2;
                }
                i2 = i4;
            }
            return was.f36763k;
        }
    }

    @InterfaceC7396q
    public static <T> qrj<T> cdj(@InterfaceC7396q T... elements) {
        d2ok.m23075h(elements, "elements");
        return elements.length == 0 ? f7l8() : C6144h.rlj(elements);
    }

    @InterfaceC7396q
    public static <T> qrj<T> f7l8() {
        return kotlin.sequences.f7l8.f36590k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static <T> qrj<T> m23472g(@InterfaceC7396q qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return qrjVar instanceof C6403k ? qrjVar : new C6403k(qrjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: h */
    private static final <T> qrj<T> m23473h(qrj<? extends T> qrjVar) {
        return qrjVar == 0 ? f7l8() : qrjVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final <T, R> C6227f<List<T>, List<R>> m23474i(@InterfaceC7396q qrj<? extends C6227f<? extends T, ? extends R>> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C6227f<? extends T, ? extends R> c6227f : qrjVar) {
            arrayList.add(c6227f.getFirst());
            arrayList2.add(c6227f.getSecond());
        }
        return nmn5.m23230k(arrayList, arrayList2);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T> qrj<T> ki(@InterfaceC7396q qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return t8r(qrjVar, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <T> qrj<T> kja0(@InterfaceC7396q qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5981k<? extends qrj<? extends T>> defaultValue) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(defaultValue, "defaultValue");
        return cdj.toq(new C6417s(qrjVar, defaultValue, null));
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "flattenSequenceOfIterable")
    public static final <T> qrj<T> ld6(@InterfaceC7396q qrj<? extends Iterable<? extends T>> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return m23476p(qrjVar, C6414n.INSTANCE);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static <T> qrj<T> m23475n(@InterfaceC7396q Iterator<? extends T> it) {
        d2ok.m23075h(it, "<this>");
        return m23472g(new toq(it));
    }

    @InterfaceC6244y
    @InterfaceC7396q
    public static <T> qrj<T> n7h(@InterfaceC7395n T t2, @InterfaceC7396q cyoe.x2<? super T, ? extends T> nextFunction) {
        d2ok.m23075h(nextFunction, "nextFunction");
        return t2 == null ? kotlin.sequences.f7l8.f36590k : new C6408p(new C6418y(t2), nextFunction);
    }

    /* JADX INFO: renamed from: p */
    private static final <T, R> qrj<R> m23476p(qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends Iterator<? extends R>> x2Var) {
        return qrjVar instanceof o1t ? ((o1t) qrjVar).m23458n(x2Var) : new C6410s(qrjVar, C6412g.INSTANCE, x2Var);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final <T> qrj<T> m23477q(InterfaceC5981k<? extends Iterator<? extends T>> iterator) {
        d2ok.m23075h(iterator, "iterator");
        return new C6413k(iterator);
    }

    @InterfaceC7396q
    public static <T> qrj<T> qrj(@InterfaceC7396q InterfaceC5981k<? extends T> seedFunction, @InterfaceC7396q cyoe.x2<? super T, ? extends T> nextFunction) {
        d2ok.m23075h(seedFunction, "seedFunction");
        d2ok.m23075h(nextFunction, "nextFunction");
        return new C6408p(seedFunction, nextFunction);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final <T> qrj<T> m23478s(@InterfaceC7396q qrj<? extends qrj<? extends T>> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return m23476p(qrjVar, C6416q.INSTANCE);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T> qrj<T> t8r(@InterfaceC7396q qrj<? extends T> qrjVar, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(random, "random");
        return cdj.toq(new C6415p(qrjVar, random, null));
    }

    @InterfaceC7396q
    public static final <T> qrj<T> x2(@InterfaceC7396q InterfaceC5981k<? extends T> nextFunction) {
        d2ok.m23075h(nextFunction, "nextFunction");
        return m23472g(new C6408p(nextFunction, new f7l8(nextFunction)));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T, C, R> qrj<R> m23479y(@InterfaceC7396q qrj<? extends T> source, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends C> transform, @InterfaceC7396q cyoe.x2<? super C, ? extends Iterator<? extends R>> iterator) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(transform, "transform");
        d2ok.m23075h(iterator, "iterator");
        return cdj.toq(new zy(source, transform, iterator, null));
    }
}
