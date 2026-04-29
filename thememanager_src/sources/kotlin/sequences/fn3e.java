package kotlin.sequences;

import cyoe.InterfaceC5979h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C6227f;
import kotlin.C6318m;
import kotlin.InterfaceC6232i;
import kotlin.collections.C6144h;
import kotlin.collections.C6163t;
import kotlin.collections.C6171x;
import kotlin.collections.a9;
import kotlin.collections.a98o;
import kotlin.collections.x9kr;
import kotlin.comparisons.f7l8;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.gyi;
import kotlin.hb;
import kotlin.hyr;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.gvn7;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.was;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n179#1,2:3113\n316#1,7:3115\n1324#1,3:3123\n739#1,4:3126\n704#1,4:3130\n722#1,4:3134\n775#1,4:3138\n1017#1,3:3142\n1020#1,3:3152\n1037#1,3:3155\n1040#1,3:3165\n1324#1,3:3182\n1313#1,2:3185\n1#2:3122\n372#3,7:3145\n372#3,7:3158\n372#3,7:3168\n372#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3113,2\n99#1:3115,7\n458#1:3123,3\n658#1:3126,4\n674#1:3130,4\n689#1:3134,4\n760#1:3138,4\n988#1:3142,3\n988#1:3152,3\n1003#1:3155,3\n1003#1:3165,3\n1106#1:3182,3\n1144#1:3185,2\n988#1:3145,7\n1003#1:3158,7\n1019#1:3168,7\n1039#1:3175,7\n*E\n"})
public class fn3e extends C6402i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class cdj<T> extends AbstractC6308r implements cyoe.x2<T, T> {
        final /* synthetic */ cyoe.x2<T, was> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        cdj(cyoe.x2<? super T, was> x2Var) {
            super(1);
            this.$action = x2Var;
        }

        @Override // cyoe.x2
        public final T invoke(T t2) {
            this.$action.invoke(t2);
            return t2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class f7l8<T> extends AbstractC6308r implements cyoe.x2<T, Boolean> {
        public static final f7l8 INSTANCE = new f7l8();

        f7l8() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7395n T t2) {
            return Boolean.valueOf(t2 == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$fn3e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: _Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m22756f = "_Sequences.kt", m22757i = {0, 1, 1, 1}, m22758l = {2336, 2341}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, m22761s = {"L$0", "L$0", "L$1", "I$0"})
    static final class C8060fn3e<R> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ R $initial;
        final /* synthetic */ cyoe.cdj<Integer, R, T, R> $operation;
        final /* synthetic */ kotlin.sequences.qrj<T> $this_runningFoldIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8060fn3e(R r2, kotlin.sequences.qrj<? extends T> qrjVar, cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> cdjVar, InterfaceC6216q<? super C8060fn3e> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$initial = r2;
            this.$this_runningFoldIndexed = qrjVar;
            this.$operation = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C8060fn3e c8060fn3e = new C8060fn3e(this.$initial, this.$this_runningFoldIndexed, this.$operation, interfaceC6216q);
            c8060fn3e.L$0 = obj;
            return c8060fn3e;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super R> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C8060fn3e) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r9.I$0
                java.lang.Object r3 = r9.L$2
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r9.L$1
                java.lang.Object r5 = r9.L$0
                kotlin.sequences.kja0 r5 = (kotlin.sequences.kja0) r5
                kotlin.C6318m.n7h(r10)
                r10 = r1
                r1 = r4
                goto L51
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.L$0
                kotlin.sequences.kja0 r1 = (kotlin.sequences.kja0) r1
                kotlin.C6318m.n7h(r10)
                goto L45
            L30:
                kotlin.C6318m.n7h(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlin.sequences.kja0 r1 = (kotlin.sequences.kja0) r1
                R r10 = r9.$initial
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = r1.toq(r10, r9)
                if (r10 != r0) goto L45
                return r0
            L45:
                r10 = 0
                R r3 = r9.$initial
                kotlin.sequences.qrj<T> r4 = r9.$this_runningFoldIndexed
                java.util.Iterator r4 = r4.iterator()
                r5 = r1
                r1 = r3
                r3 = r4
            L51:
                r4 = r9
            L52:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L81
                java.lang.Object r6 = r3.next()
                cyoe.cdj<java.lang.Integer, R, T, R> r7 = r4.$operation
                int r8 = r10 + 1
                if (r10 >= 0) goto L65
                kotlin.collections.fn3e.lrht()
            L65:
                java.lang.Integer r10 = kotlin.coroutines.jvm.internal.toq.m22765g(r10)
                java.lang.Object r10 = r7.invoke(r10, r1, r6)
                r4.L$0 = r5
                r4.L$1 = r10
                r4.L$2 = r3
                r4.I$0 = r8
                r4.label = r2
                java.lang.Object r1 = r5.toq(r10, r4)
                if (r1 != r0) goto L7e
                return r0
            L7e:
                r1 = r10
                r10 = r8
                goto L52
            L81:
                kotlin.was r10 = kotlin.was.f36763k
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.fn3e.C8060fn3e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class fu4<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36591k;

        /* JADX WARN: Multi-variable type inference failed */
        fu4(kotlin.sequences.qrj<? extends T> qrjVar) {
            this.f36591k = qrjVar;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            List listVss1 = fn3e.vss1(this.f36591k);
            kotlin.collections.wvg.bf2(listVss1);
            return listVss1.iterator();
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.fn3e$g */
    /* JADX INFO: compiled from: _Sequences.kt */
    @lv5({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3112:1\n*E\n"})
    public static final class C6385g extends AbstractC6308r implements cyoe.x2<Object, Boolean> {
        public static final C6385g INSTANCE = new C6385g();

        public C6385g() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7395n Object obj) {
            d2ok.m23086z(3, "R");
            return Boolean.valueOf(obj instanceof Object);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$h */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class C6386h<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36592k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.qrj<T> f81864toq;

        /* JADX INFO: renamed from: kotlin.sequences.fn3e$h$k */
        /* JADX INFO: compiled from: _Sequences.kt */
        static final class k extends AbstractC6308r implements cyoe.x2<T, Boolean> {
            final /* synthetic */ List<T> $other;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(List<? extends T> list) {
                super(1);
                this.$other = list;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cyoe.x2
            @InterfaceC7396q
            public final Boolean invoke(T t2) {
                return Boolean.valueOf(this.$other.contains(t2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6386h(kotlin.sequences.qrj<? extends T> qrjVar, kotlin.sequences.qrj<? extends T> qrjVar2) {
            this.f36592k = qrjVar;
            this.f81864toq = qrjVar2;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            List listNyj = fn3e.nyj(this.f36592k);
            return listNyj.isEmpty() ? this.f81864toq.iterator() : fn3e.bo(this.f81864toq, new k(listNyj)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$i */
    /* JADX INFO: compiled from: _Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m22756f = "_Sequences.kt", m22757i = {0, 1, 1}, m22758l = {2308, 2312}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "$this$sequence", "accumulator"}, m22761s = {"L$0", "L$0", "L$1"})
    static final class C6387i<R> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ R $initial;
        final /* synthetic */ InterfaceC5979h<R, T, R> $operation;
        final /* synthetic */ kotlin.sequences.qrj<T> $this_runningFold;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6387i(R r2, kotlin.sequences.qrj<? extends T> qrjVar, InterfaceC5979h<? super R, ? super T, ? extends R> interfaceC5979h, InterfaceC6216q<? super C6387i> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$initial = r2;
            this.$this_runningFold = qrjVar;
            this.$operation = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6387i c6387i = new C6387i(this.$initial, this.$this_runningFold, this.$operation, interfaceC6216q);
            c6387i.L$0 = obj;
            return c6387i;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super R> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6387i) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.L$1
                java.lang.Object r4 = r7.L$0
                kotlin.sequences.kja0 r4 = (kotlin.sequences.kja0) r4
                kotlin.C6318m.n7h(r8)
                r8 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.L$0
                kotlin.sequences.kja0 r1 = (kotlin.sequences.kja0) r1
                kotlin.C6318m.n7h(r8)
                goto L42
            L2d:
                kotlin.C6318m.n7h(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlin.sequences.kja0 r1 = (kotlin.sequences.kja0) r1
                R r8 = r7.$initial
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r1.toq(r8, r7)
                if (r8 != r0) goto L42
                return r0
            L42:
                R r8 = r7.$initial
                kotlin.sequences.qrj<T> r3 = r7.$this_runningFold
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                r3 = r7
            L4d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()
                cyoe.h<R, T, R> r6 = r3.$operation
                java.lang.Object r8 = r6.invoke(r8, r5)
                r3.L$0 = r4
                r3.L$1 = r8
                r3.L$2 = r1
                r3.label = r2
                java.lang.Object r5 = r4.toq(r8, r3)
                if (r5 != r0) goto L4d
                return r0
            L6c:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.fn3e.C6387i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$k */
    /* JADX INFO: compiled from: Iterables.kt */
    @lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2921#2:71\n*E\n"})
    public static final class C6388k<T> implements Iterable<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj f36593k;

        public C6388k(kotlin.sequences.qrj qrjVar) {
            this.f36593k = qrjVar;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return this.f36593k.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class ki<T> extends AbstractC6308r implements InterfaceC5979h<Integer, T, T> {
        final /* synthetic */ InterfaceC5979h<Integer, T, was> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ki(InterfaceC5979h<? super Integer, ? super T, was> interfaceC5979h) {
            super(2);
            this.$action = interfaceC5979h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return invoke(num.intValue(), obj);
        }

        public final T invoke(int i2, T t2) {
            this.$action.invoke(Integer.valueOf(i2), t2);
            return t2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class kja0<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable<T> f36594k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.qrj<T> f81865toq;

        /* JADX INFO: renamed from: kotlin.sequences.fn3e$kja0$k */
        /* JADX INFO: compiled from: _Sequences.kt */
        static final class C6389k extends AbstractC6308r implements cyoe.x2<T, Boolean> {
            final /* synthetic */ Collection<T> $other;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6389k(Collection<? extends T> collection) {
                super(1);
                this.$other = collection;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cyoe.x2
            @InterfaceC7396q
            public final Boolean invoke(T t2) {
                return Boolean.valueOf(this.$other.contains(t2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        kja0(Iterable<? extends T> iterable, kotlin.sequences.qrj<? extends T> qrjVar) {
            this.f36594k = iterable;
            this.f81865toq = qrjVar;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            Collection collectionNmn5 = C6163t.nmn5(this.f36594k);
            return collectionNmn5.isEmpty() ? this.f81865toq.iterator() : fn3e.bo(this.f81865toq, new C6389k(collectionNmn5)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* synthetic */ class ld6<R> extends gvn7 implements cyoe.x2<kotlin.sequences.qrj<? extends R>, Iterator<? extends R>> {
        public static final ld6 INSTANCE = new ld6();

        ld6() {
            super(1, kotlin.sequences.qrj.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<R> invoke(@InterfaceC7396q kotlin.sequences.qrj<? extends R> p0) {
            d2ok.m23075h(p0, "p0");
            return p0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$n */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class C6390n<T> extends AbstractC6308r implements cyoe.x2<x9kr<? extends T>, T> {
        public static final C6390n INSTANCE = new C6390n();

        C6390n() {
            super(1);
        }

        @Override // cyoe.x2
        public final T invoke(@InterfaceC7396q x9kr<? extends T> it) {
            d2ok.m23075h(it, "it");
            return it.m22664g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class n7h<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36595k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ T[] f81866toq;

        /* JADX INFO: renamed from: kotlin.sequences.fn3e$n7h$k */
        /* JADX INFO: compiled from: _Sequences.kt */
        static final class C6391k extends AbstractC6308r implements cyoe.x2<T, Boolean> {
            final /* synthetic */ T[] $elements;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6391k(T[] tArr) {
                super(1);
                this.$elements = tArr;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cyoe.x2
            @InterfaceC7396q
            public final Boolean invoke(T t2) {
                return Boolean.valueOf(C6144h.ph5d(this.$elements, t2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n7h(kotlin.sequences.qrj<? extends T> qrjVar, T[] tArr) {
            this.f36595k = qrjVar;
            this.f81866toq = tArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return fn3e.bo(this.f36595k, new C6391k(this.f81866toq)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", m22756f = "_Sequences.kt", m22757i = {0, 0, 0, 1, 1, 1, 1}, m22758l = {2395, 2399}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, m22761s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    static final class ni7<S> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super S>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ cyoe.cdj<Integer, S, T, S> $operation;
        final /* synthetic */ kotlin.sequences.qrj<T> $this_runningReduceIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ni7(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> cdjVar, InterfaceC6216q<? super ni7> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_runningReduceIndexed = qrjVar;
            this.$operation = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            ni7 ni7Var = new ni7(this.$this_runningReduceIndexed, this.$operation, interfaceC6216q);
            ni7Var.L$0 = obj;
            return ni7Var;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super S> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((ni7) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                int r1 = r10.I$0
                java.lang.Object r3 = r10.L$2
                java.lang.Object r4 = r10.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.L$0
                kotlin.sequences.kja0 r5 = (kotlin.sequences.kja0) r5
                kotlin.C6318m.n7h(r11)
                r11 = r10
                r9 = r3
                r3 = r1
                r1 = r9
                goto L60
            L22:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2a:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r4 = r10.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.L$0
                kotlin.sequences.kja0 r5 = (kotlin.sequences.kja0) r5
                kotlin.C6318m.n7h(r11)
                goto L5f
            L38:
                kotlin.C6318m.n7h(r11)
                java.lang.Object r11 = r10.L$0
                r5 = r11
                kotlin.sequences.kja0 r5 = (kotlin.sequences.kja0) r5
                kotlin.sequences.qrj<T> r11 = r10.$this_runningReduceIndexed
                java.util.Iterator r4 = r11.iterator()
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L8f
                java.lang.Object r1 = r4.next()
                r10.L$0 = r5
                r10.L$1 = r4
                r10.L$2 = r1
                r10.label = r3
                java.lang.Object r11 = r5.toq(r1, r10)
                if (r11 != r0) goto L5f
                return r0
            L5f:
                r11 = r10
            L60:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L8f
                cyoe.cdj<java.lang.Integer, S, T, S> r6 = r11.$operation
                int r7 = r3 + 1
                if (r3 >= 0) goto L6f
                kotlin.collections.fn3e.lrht()
            L6f:
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.toq.m22765g(r3)
                java.lang.Object r8 = r4.next()
                java.lang.Object r3 = r6.invoke(r3, r1, r8)
                r11.L$0 = r5
                r11.L$1 = r4
                r11.L$2 = r3
                r11.I$0 = r7
                r11.label = r2
                java.lang.Object r1 = r5.toq(r3, r11)
                if (r1 != r0) goto L8c
                return r0
            L8c:
                r1 = r3
                r3 = r7
                goto L60
            L8f:
                kotlin.was r11 = kotlin.was.f36763k
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.fn3e.ni7.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class o1t<R, T> extends AbstractC6308r implements InterfaceC5979h<T, R, C6227f<? extends T, ? extends R>> {
        public static final o1t INSTANCE = new o1t();

        o1t() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final C6227f<T, R> invoke(T t2, R r2) {
            return nmn5.m23230k(t2, r2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$p */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* synthetic */ class C6392p<R> extends gvn7 implements cyoe.x2<Iterable<? extends R>, Iterator<? extends R>> {
        public static final C6392p INSTANCE = new C6392p();

        C6392p() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<R> invoke(@InterfaceC7396q Iterable<? extends R> p0) {
            d2ok.m23075h(p0, "p0");
            return p0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$q */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class C6393q<T> extends AbstractC6308r implements cyoe.x2<x9kr<? extends T>, Boolean> {
        final /* synthetic */ InterfaceC5979h<Integer, T, Boolean> $predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6393q(InterfaceC5979h<? super Integer, ? super T, Boolean> interfaceC5979h) {
            super(1);
            this.$predicate = interfaceC5979h;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q x9kr<? extends T> it) {
            d2ok.m23075h(it, "it");
            return this.$predicate.invoke(Integer.valueOf(it.m22666n()), it.m22664g());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class qrj<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36596k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ T f81867toq;

        /* JADX INFO: renamed from: kotlin.sequences.fn3e$qrj$k */
        /* JADX INFO: compiled from: _Sequences.kt */
        static final class C6394k extends AbstractC6308r implements cyoe.x2<T, Boolean> {
            final /* synthetic */ T $element;
            final /* synthetic */ i1.C6295k $removed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6394k(i1.C6295k c6295k, T t2) {
                super(1);
                this.$removed = c6295k;
                this.$element = t2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cyoe.x2
            @InterfaceC7396q
            public final Boolean invoke(T t2) {
                boolean z2 = true;
                if (!this.$removed.element && d2ok.f7l8(t2, this.$element)) {
                    this.$removed.element = true;
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        qrj(kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
            this.f36596k = qrjVar;
            this.f81867toq = t2;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return fn3e.ch(this.f36596k, new C6394k(new i1.C6295k(), this.f81867toq)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$s */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* synthetic */ class C6395s<R> extends gvn7 implements cyoe.x2<kotlin.sequences.qrj<? extends R>, Iterator<? extends R>> {
        public static final C6395s INSTANCE = new C6395s();

        C6395s() {
            super(1, kotlin.sequences.qrj.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<R> invoke(@InterfaceC7396q kotlin.sequences.qrj<? extends R> p0) {
            d2ok.m23075h(p0, "p0");
            return p0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$t */
    /* JADX INFO: compiled from: _Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", m22756f = "_Sequences.kt", m22757i = {0, 0, 0}, m22758l = {2873}, m22759m = "invokeSuspend", m22760n = {"$this$result", "iterator", "next"}, m22761s = {"L$0", "L$1", "L$2"})
    static final class C6396t<R> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ kotlin.sequences.qrj<T> $this_zipWithNext;
        final /* synthetic */ InterfaceC5979h<T, T, R> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6396t(kotlin.sequences.qrj<? extends T> qrjVar, InterfaceC5979h<? super T, ? super T, ? extends R> interfaceC5979h, InterfaceC6216q<? super C6396t> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_zipWithNext = qrjVar;
            this.$transform = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6396t c6396t = new C6396t(this.$this_zipWithNext, this.$transform, interfaceC6216q);
            c6396t.L$0 = obj;
            return c6396t;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super R> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6396t) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            kotlin.sequences.kja0 kja0Var;
            Object next;
            Iterator it;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kotlin.sequences.kja0 kja0Var2 = (kotlin.sequences.kja0) this.L$0;
                Iterator it2 = this.$this_zipWithNext.iterator();
                if (!it2.hasNext()) {
                    return was.f36763k;
                }
                kja0Var = kja0Var2;
                next = it2.next();
                it = it2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$2;
                it = (Iterator) this.L$1;
                kja0Var = (kotlin.sequences.kja0) this.L$0;
                C6318m.n7h(obj);
                next = obj2;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                R rInvoke = this.$transform.invoke((T) next, (T) next2);
                this.L$0 = kja0Var;
                this.L$1 = it;
                this.L$2 = next2;
                this.label = 1;
                if (kja0Var.toq(rInvoke, this) == objX2) {
                    return objX2;
                }
                next = next2;
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class t8r<T> extends AbstractC6308r implements cyoe.x2<T, T> {
        final /* synthetic */ kotlin.sequences.qrj<T> $this_requireNoNulls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t8r(kotlin.sequences.qrj<? extends T> qrjVar) {
            super(1);
            this.$this_requireNoNulls = qrjVar;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final T invoke(@InterfaceC7395n T t2) {
            if (t2 != null) {
                return t2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class toq<T> extends AbstractC6308r implements cyoe.x2<T, T> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        public final T invoke(T t2) {
            return t2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class wvg<T> extends AbstractC6308r implements InterfaceC5979h<T, T, C6227f<? extends T, ? extends T>> {
        public static final wvg INSTANCE = new wvg();

        wvg() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final C6227f<T, T> invoke(T t2, T t3) {
            return nmn5.m23230k(t2, t3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @lv5({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3112:1\n*E\n"})
    public static final class x2<K, T> implements kotlin.collections.d2ok<T, K> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36597k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cyoe.x2<T, K> f81868toq;

        /* JADX WARN: Multi-variable type inference failed */
        public x2(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36597k = qrjVar;
            this.f81868toq = x2Var;
        }

        @Override // kotlin.collections.d2ok
        /* JADX INFO: renamed from: k */
        public K mo22425k(T t2) {
            return this.f81868toq.invoke(t2);
        }

        @Override // kotlin.collections.d2ok
        @InterfaceC7396q
        public Iterator<T> toq() {
            return this.f36597k.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$y */
    /* JADX INFO: compiled from: _Sequences.kt */
    /* synthetic */ class C6397y<R> extends gvn7 implements cyoe.x2<Iterable<? extends R>, Iterator<? extends R>> {
        public static final C6397y INSTANCE = new C6397y();

        C6397y() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Iterator<R> invoke(@InterfaceC7396q Iterable<? extends R> p0) {
            d2ok.m23075h(p0, "p0");
            return p0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.fn3e$z */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class C6398z<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj<T> f36598k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Comparator<? super T> f81869toq;

        /* JADX WARN: Multi-variable type inference failed */
        C6398z(kotlin.sequences.qrj<? extends T> qrjVar, Comparator<? super T> comparator) {
            this.f36598k = qrjVar;
            this.f81869toq = comparator;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            List listVss1 = fn3e.vss1(this.f36598k);
            kotlin.collections.wvg.m22656a(listVss1, this.f81869toq);
            return listVss1.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @InterfaceC6205g(m22755c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m22756f = "_Sequences.kt", m22757i = {0, 0, 0, 1, 1, 1}, m22758l = {2366, 2369}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, m22761s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class zurt<S> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super S>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<S, T, S> $operation;
        final /* synthetic */ kotlin.sequences.qrj<T> $this_runningReduce;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zurt(kotlin.sequences.qrj<? extends T> qrjVar, InterfaceC5979h<? super S, ? super T, ? extends S> interfaceC5979h, InterfaceC6216q<? super zurt> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_runningReduce = qrjVar;
            this.$operation = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            zurt zurtVar = new zurt(this.$this_runningReduce, this.$operation, interfaceC6216q);
            zurtVar.L$0 = obj;
            return zurtVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super S> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zurt) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            kotlin.sequences.kja0 kja0Var;
            Object next;
            Iterator it;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0Var = (kotlin.sequences.kja0) this.L$0;
                Iterator it2 = this.$this_runningReduce.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.L$0 = kja0Var;
                    this.L$1 = it2;
                    this.L$2 = next;
                    this.label = 1;
                    if (kja0Var.toq(next, this) == objX2) {
                        return objX2;
                    }
                    it = it2;
                }
                return was.f36763k;
            }
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.L$2;
            it = (Iterator) this.L$1;
            kja0Var = (kotlin.sequences.kja0) this.L$0;
            C6318m.n7h(obj);
            while (it.hasNext()) {
                next = this.$operation.invoke((S) next, (T) it.next());
                this.L$0 = kja0Var;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 2;
                if (kja0Var.toq(next, this) == objX2) {
                    return objX2;
                }
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    static final class zy<T> extends AbstractC6308r implements cyoe.x2<Integer, T> {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(int i2) {
            super(1);
            this.$index = i2;
        }

        public final T invoke(int i2) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.$index + '.');
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> T m23421a(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2) {
        d2ok.m23075h(qrjVar, "<this>");
        return (T) zp(qrjVar, i2, new zy(i2));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> float a5id(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Float> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> a98o(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        return new C6400g(qrjVar, predicate);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final <T> long ab(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ikck> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(it.next()).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public static final <T> kotlin.sequences.qrj<T> m23422b(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return bf2(qrjVar, toq.INSTANCE);
    }

    @InterfaceC7396q
    public static <T, R> kotlin.sequences.qrj<R> b3e(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return new kotlin.sequences.o1t(qrjVar, transform);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Double b8(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T b9ub(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final float bap7(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T, R> kotlin.sequences.qrj<R> bek6(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return new C6421z(qrjVar, transform);
    }

    @InterfaceC7396q
    public static final <T, K> kotlin.sequences.qrj<T> bf2(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        return new kotlin.sequences.zy(qrjVar, selector);
    }

    @InterfaceC7396q
    public static final <T> C6227f<List<T>, List<T>> bih(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : qrjVar) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            } else {
                arrayList2.add(t2);
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> bo(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        return new C6420y(qrjVar, false, predicate);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <S, T extends S> kotlin.sequences.qrj<S> bqie(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return kotlin.sequences.cdj.toq(new ni7(qrjVar, operation, null));
    }

    @InterfaceC7395n
    public static final <T> T btvn(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        T t2 = null;
        for (T t3 : qrjVar) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    return null;
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        return null;
    }

    public static final <T> T bz2(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : qrjVar) {
            if (predicate.invoke(t3).booleanValue()) {
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: c */
    public static final <K, V> Map<K, V> m23423c(@InterfaceC7396q kotlin.sequences.qrj<? extends K> qrjVar, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k2 : qrjVar) {
            linkedHashMap.put(k2, valueSelector.invoke(k2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> c25(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2) {
        d2ok.m23075h(qrjVar, "<this>");
        if (i2 >= 0) {
            return i2 == 0 ? kotlin.sequences.t8r.f7l8() : qrjVar instanceof InterfaceC6405n ? ((InterfaceC6405n) qrjVar).toq(i2) : new kotlin.sequences.ni7(qrjVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super T>, T> C c8jq(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        for (T t2 : qrjVar) {
            if (t2 != null) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <T, K> kotlin.collections.d2ok<T, K> cfr(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(keySelector, "keySelector");
        return new x2(qrjVar, keySelector);
    }

    @InterfaceC7396q
    public static <T> kotlin.sequences.qrj<T> ch(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        return new C6420y(qrjVar, true, predicate);
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> kotlin.sequences.qrj<T> cn02(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return ovdh(qrjVar, kotlin.comparisons.f7l8.fu4());
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R> R cnbm(kotlin.sequences.qrj<? extends T> qrjVar, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T, R> kotlin.sequences.qrj<R> cv06(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return y2(new C6421z(qrjVar, transform));
    }

    public static final <S, T extends S> S cyoe(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public static final <T> T m23424d(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        for (T t2 : qrjVar) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <T, R> kotlin.sequences.qrj<R> d1ts(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2, int i3, boolean z2, @InterfaceC7396q cyoe.x2<? super List<? extends T>, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return b3e(C6171x.zy(qrjVar, i2, i3, z2, true), transform);
    }

    public static final <T> boolean d2ok(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return qrjVar.iterator().hasNext();
    }

    @hyr
    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequence")
    public static final <T, R> kotlin.sequences.qrj<R> d8wk(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return kotlin.sequences.t8r.m23479y(qrjVar, transform, ld6.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <T> kotlin.sequences.qrj<T> dd(kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return qrjVar;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final <T> float m28290do(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Float> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C dr(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        for (T t2 : qrjVar) {
            if (predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T dxef(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC6769y(name = "averageOfFloat")
    /* JADX INFO: renamed from: e */
    public static final double m23425e(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        double dFloatValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i2);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T e5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R extends Comparable<? super R>> R ebn(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> ec(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Iterable<? extends T> elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return kotlin.sequences.t8r.m23478s(kotlin.sequences.t8r.cdj(qrjVar, a9.ebn(elements)));
    }

    public static final <T> boolean ek5k(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        return w831(qrjVar, t2) >= 0;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> el(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return b3e(qrjVar, new t8r(qrjVar));
    }

    public static final <T> boolean eqxt(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, List<T>>> M etdu(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : qrjVar) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return destination;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final float ew(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int exv8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Integer> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m23426f(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(it.next());
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T, R> kotlin.sequences.qrj<R> f1bi(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return wt(qrjVar, r2, operation);
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C f3f(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC7395n
    public static final <T> T fnq8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        for (T t2 : qrjVar) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T, R> kotlin.sequences.qrj<R> g0ad(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return kotlin.sequences.cdj.toq(new C8060fn3e(r2, qrjVar, operation, null));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C g1(kotlin.sequences.qrj<? extends T> qrjVar, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            C6163t.m22610x(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final <T> T ga(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7395n
    public static final <T> T gb(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @hyr
    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIterableTo")
    public static final <T, R, C extends Collection<? super R>> C gbni(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            C6163t.zp(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static /* synthetic */ String gc3c(kotlin.sequences.qrj qrjVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return se(qrjVar, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R extends Comparable<? super R>> R gcp(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C gyi(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        for (T t2 : qrjVar) {
            if (!predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T h4b(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C h7am(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i2), t2);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2 = i3;
        }
        return destination;
    }

    @InterfaceC6769y(name = "averageOfLong")
    public static final double hb(@InterfaceC7396q kotlin.sequences.qrj<Long> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Long> it = qrjVar.iterator();
        double dLongValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i2);
    }

    @InterfaceC6769y(name = "sumOfByte")
    public static final int hyow(@InterfaceC7396q kotlin.sequences.qrj<Byte> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Byte> it = qrjVar.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, ? super V>> M hyr(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : qrjVar) {
            destination.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static <T> kotlin.sequences.qrj<T> i1(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2) {
        d2ok.m23075h(qrjVar, "<this>");
        if (i2 >= 0) {
            return i2 == 0 ? qrjVar : qrjVar instanceof InterfaceC6405n ? ((InterfaceC6405n) qrjVar).mo23419k(i2) : new C6409q(qrjVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static /* synthetic */ kotlin.sequences.qrj i1an(kotlin.sequences.qrj qrjVar, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return kt06(qrjVar, i2, i3, z2);
    }

    @InterfaceC7396q
    public static final <T> HashSet<T> i3x9(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return (HashSet) f3f(qrjVar, new HashSet());
    }

    public static final <T, R> R i9jn(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            r2 = operation.invoke(Integer.valueOf(i2), r2, t2);
            i2 = i3;
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> Float ij(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Float> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final <T> T ikck(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <S, T extends S> kotlin.sequences.qrj<S> imd(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return kotlin.sequences.cdj.toq(new zurt(qrjVar, operation, null));
    }

    @InterfaceC7396q
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T ix(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> double ixz(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6769y(name = "averageOfShort")
    /* JADX INFO: renamed from: j */
    public static final double m23427j(@InterfaceC7396q kotlin.sequences.qrj<Short> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Short> it = qrjVar.iterator();
        double dShortValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i2);
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C jbh(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @InterfaceC7395n
    public static final <T> T jz5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T kbj(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : qrjVar) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <T, A extends Appendable> A kcsr(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) throws IOException {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(buffer, "buffer");
        d2ok.m23075h(separator, "separator");
        d2ok.m23075h(prefix, "prefix");
        d2ok.m23075h(postfix, "postfix");
        d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t2 : qrjVar) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            kotlin.text.ni7.toq(buffer, t2, x2Var);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <T> kotlin.sequences.qrj<T> kiv(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, was> action) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(action, "action");
        return b3e(qrjVar, new cdj(action));
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> kotlin.sequences.qrj<T> kq2f(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return new fu4(qrjVar);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <T> kotlin.sequences.qrj<List<T>> kt06(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2, int i3, boolean z2) {
        d2ok.m23075h(qrjVar, "<this>");
        return C6171x.zy(qrjVar, i2, i3, z2, false);
    }

    @InterfaceC7395n
    public static final <T> T ktq(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        for (T t3 : qrjVar) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T> T kx3(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T> Set<T> kz28(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return a98o.ld6();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.i1.m22499g(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: l */
    public static final <T, K, V> Map<K, V> m23428l(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : qrjVar) {
            linkedHashMap.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final <T> kotlin.sequences.qrj<T> l05(kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        return o5(qrjVar, t2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final double lh(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6769y(name = "sumOfLong")
    public static final long lk(@InterfaceC7396q kotlin.sequences.qrj<Long> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Long> it = qrjVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M lrht(@InterfaceC7396q kotlin.sequences.qrj<? extends K> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(valueSelector, "valueSelector");
        for (K k2 : qrjVar) {
            destination.put(k2, valueSelector.invoke(k2));
        }
        return destination;
    }

    public static final <T> void ltg8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, was> action) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(action, "action");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C lv5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            if (predicate.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                destination.add(t2);
            }
            i2 = i3;
        }
        return destination;
    }

    public static final <T> boolean lvui(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R extends Comparable<? super R>> R lw(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: m */
    public static final <T, R> kotlin.sequences.qrj<R> m23429m(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2, @InterfaceC7396q cyoe.x2<? super List<? extends T>, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return d1ts(qrjVar, i2, i2, true, transform);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> m2t(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Iterable<? extends T> elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return new kja0(elements, qrjVar);
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, List<T>> m4(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : qrjVar) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R> R m58i(kotlin.sequences.qrj<? extends T> qrjVar, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<x9kr<T>> m8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return new kotlin.sequences.ld6(qrjVar);
    }

    @InterfaceC7396q
    public static <T, R> kotlin.sequences.qrj<R> mbx(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return y2(new kotlin.sequences.o1t(qrjVar, transform));
    }

    @InterfaceC6769y(name = "sumOfInt")
    public static final int mi1u(@InterfaceC7396q kotlin.sequences.qrj<Integer> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Integer> it = qrjVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> kotlin.sequences.qrj<T> mj(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        return ovdh(qrjVar, new f7l8.zy(selector));
    }

    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <T, R> R mu(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> transform) {
        R rInvoke;
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T n2t(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, ? super T>> M n5r1(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : qrjVar) {
            destination.put(keySelector.invoke(t2), t2);
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, T> ncyb(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : qrjVar) {
            linkedHashMap.put(keySelector.invoke(t2), t2);
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Float ngy(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Float nme(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> nmn5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        return new kotlin.sequences.o1t(new C6420y(new kotlin.sequences.ld6(qrjVar), true, new C6393q(predicate)), C6390n.INSTANCE);
    }

    @InterfaceC6769y(name = "averageOfInt")
    public static final double nn86(@InterfaceC7396q kotlin.sequences.qrj<Integer> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Integer> it = qrjVar.iterator();
        double dIntValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i2);
    }

    public static final <T> boolean nnh(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return !qrjVar.iterator().hasNext();
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R> R nsb(kotlin.sequences.qrj<? extends T> qrjVar, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static <T> List<T> nyj(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return kotlin.collections.ni7.a9();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.zurt.ld6(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: o */
    public static final <T> kotlin.sequences.qrj<List<T>> m23430o(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2) {
        d2ok.m23075h(qrjVar, "<this>");
        return kt06(qrjVar, i2, i2, true);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> Float o05(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Float> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> o5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        return kotlin.sequences.t8r.m23478s(kotlin.sequences.t8r.cdj(qrjVar, kotlin.sequences.t8r.cdj(t2)));
    }

    public static final <T> T ob(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> Double oki(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static <T> kotlin.sequences.qrj<T> ovdh(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        return new C6398z(qrjVar, comparator);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> Double pc(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Double pjz9(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final <T> double pnt2(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> ps(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return new C6386h(elements, qrjVar);
    }

    public static final <T, R> R py(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
        }
        return r2;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double qh4d(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    public static <T> T qkj8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T, R> kotlin.sequences.qrj<R> qo(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return new C6410s(qrjVar, transform, C6395s.INSTANCE);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    public static <T> Iterable<T> m23431r(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return new C6388k(qrjVar);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final double r25n(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    public static final <S, T extends S> S r6ty(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    public static final <T> void r8s8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(action, "action");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            action.invoke(Integer.valueOf(i2), t2);
            i2 = i3;
        }
    }

    @InterfaceC6234g
    private static final <T> kotlin.sequences.qrj<T> ra(kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        return u38j(qrjVar, t2);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> rp(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q T[] elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return ec(qrjVar, kotlin.collections.kja0.m22514i(elements));
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <T, R> kotlin.sequences.qrj<R> sc(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super T, ? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return kotlin.sequences.cdj.toq(new C6396t(qrjVar, transform, null));
    }

    @InterfaceC7396q
    public static final <T> String se(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(separator, "separator");
        d2ok.m23075h(prefix, "prefix");
        d2ok.m23075h(postfix, "postfix");
        d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) kcsr(qrjVar, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, List<V>>> M sok(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : qrjVar) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t2));
        }
        return destination;
    }

    public static final /* synthetic */ <R> kotlin.sequences.qrj<R> t8iq(kotlin.sequences.qrj<?> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.ni7();
        kotlin.sequences.qrj<R> qrjVarCh = ch(qrjVar, C6385g.INSTANCE);
        d2ok.n7h(qrjVarCh, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return qrjVarCh;
    }

    @hyr
    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    public static final <T, R> kotlin.sequences.qrj<R> tfm(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return kotlin.sequences.t8r.m23479y(qrjVar, transform, C6392p.INSTANCE);
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> tjz5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        return new kotlin.sequences.fu4(qrjVar, predicate);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T, R> kotlin.sequences.qrj<R> tww7(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return g0ad(qrjVar, r2, operation);
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ <R, C extends Collection<? super R>> C m23432u(kotlin.sequences.qrj<?> qrjVar, C destination) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        for (Object obj : qrjVar) {
            d2ok.m23086z(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> u38j(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        return new qrj(qrjVar, t2);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T uc(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    public static final <T> boolean uf(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int uj2j(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        int i2 = -1;
        int i3 = 0;
        for (T t3 : qrjVar) {
            if (i3 < 0) {
                kotlin.collections.ni7.lrht();
            }
            if (d2ok.f7l8(t2, t3)) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R extends Comparable<? super R>> R ukdy(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T, R> kotlin.sequences.qrj<C6227f<T, R>> ula6(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q kotlin.sequences.qrj<? extends R> other) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(other, "other");
        return new kotlin.sequences.x2(qrjVar, other, o1t.INSTANCE);
    }

    public static /* synthetic */ kotlin.sequences.qrj uo(kotlin.sequences.qrj qrjVar, int i2, int i3, boolean z2, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return d1ts(qrjVar, i2, i3, z2, x2Var);
    }

    @InterfaceC6769y(name = "averageOfByte")
    public static final double uv6(@InterfaceC7396q kotlin.sequences.qrj<Byte> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Byte> it = qrjVar.iterator();
        double dByteValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: v */
    private static final <T> T m23433v(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        for (T t3 : qrjVar) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, List<V>> v0af(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : qrjVar) {
            K kInvoke = keySelector.invoke(t2);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> v5yj(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q T[] elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return elements.length == 0 ? qrjVar : new n7h(qrjVar, elements);
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C vep5(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            destination.add(transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <T, R> R vq(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T> List<T> vss1(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return (List) f3f(qrjVar, new ArrayList());
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final <T> int vwb(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Integer> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T> double vy(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Double> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6769y(name = "averageOfDouble")
    public static final double vyq(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    /* JADX INFO: renamed from: w */
    public static final <T> T m23434w(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> int w831(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, T t2) {
        d2ok.m23075h(qrjVar, "<this>");
        int i2 = 0;
        for (T t3 : qrjVar) {
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            if (d2ok.f7l8(t2, t3)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @hyr
    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIterable")
    public static final <T, R> kotlin.sequences.qrj<R> was(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        return new C6410s(qrjVar, transform, C6397y.INSTANCE);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T> T wlev(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C wo(kotlin.sequences.qrj<? extends T> qrjVar, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : qrjVar) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T, R> kotlin.sequences.qrj<R> wt(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        return kotlin.sequences.cdj.toq(new C6387i(r2, qrjVar, operation, null));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final <T> int wtop(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, gyi> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(it.next()).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final <T, R, V> kotlin.sequences.qrj<V> wwp(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q kotlin.sequences.qrj<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends V> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        return new kotlin.sequences.x2(qrjVar, other, transform);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T wx16(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: x */
    public static final <T> T m23435x(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2) {
        d2ok.m23075h(qrjVar, "<this>");
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (T t2 : qrjVar) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, V> x9kr(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(it.next());
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC6769y(name = "sumOfDouble")
    public static final double xblq(@InterfaceC7396q kotlin.sequences.qrj<Double> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Double> it = qrjVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> kotlin.sequences.qrj<T> xm(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        return ovdh(qrjVar, new f7l8.C6179k(selector));
    }

    @InterfaceC6769y(name = "sumOfFloat")
    public static final float xtb7(@InterfaceC7396q kotlin.sequences.qrj<Float> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Float> it = qrjVar.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC6234g
    private static final <T> T xwq3(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        for (T t2 : qrjVar) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @InterfaceC6769y(name = "sumOfShort")
    public static final int xzl(@InterfaceC7396q kotlin.sequences.qrj<Short> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<Short> it = qrjVar.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> y2(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        kotlin.sequences.qrj<T> qrjVarBo = bo(qrjVar, f7l8.INSTANCE);
        d2ok.n7h(qrjVarBo, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return qrjVarBo;
    }

    public static final <T> int y9n(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        Iterator<? extends T> it = qrjVar.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C yl(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <S, T extends S> S yp31(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    public static final <T> int yqrt(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        int i2 = -1;
        int i3 = 0;
        for (T t2 : qrjVar) {
            if (i3 < 0) {
                kotlin.collections.ni7.lrht();
            }
            if (predicate.invoke(t2).booleanValue()) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<T> yw(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(elements, "elements");
        return kotlin.sequences.t8r.m23478s(kotlin.sequences.t8r.cdj(qrjVar, elements));
    }

    public static <T> int yz(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                kotlin.collections.ni7.m22563c();
            }
        }
        return i2;
    }

    public static final <T> int z4(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (T t2 : qrjVar) {
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            if (predicate.invoke(t2).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <T> Set<T> z4j7(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T> kotlin.sequences.qrj<T> z4t(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(action, "action");
        return bek6(qrjVar, new ki(action));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final <T> long z617(kotlin.sequences.qrj<? extends T> qrjVar, cyoe.x2<? super T, Long> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <S, T extends S> S zff0(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static <T> T zkd(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T zp(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2, @InterfaceC7396q cyoe.x2<? super Integer, ? extends T> defaultValue) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(defaultValue, "defaultValue");
        if (i2 < 0) {
            return defaultValue.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (T t2 : qrjVar) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return defaultValue.invoke(Integer.valueOf(i2));
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C zsr0(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            C6163t.m22610x(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <T> kotlin.sequences.qrj<C6227f<T, T>> zuf(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return sc(qrjVar, wvg.INSTANCE);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @hyr
    private static final <T, R> R zwy(kotlin.sequences.qrj<? extends T> qrjVar, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }
}
