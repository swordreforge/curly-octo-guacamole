package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Count.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "", "toq", "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "", "predicate", "k", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class cdj {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.cdj$k */
    /* JADX INFO: compiled from: Count.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__CountKt", m22756f = "Count.kt", m22757i = {0}, m22758l = {18}, m22759m = "count", m22760n = {"i"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6558k<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C6558k(InterfaceC6216q<? super C6558k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ld6.m24159e(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.cdj$q */
    /* JADX INFO: compiled from: Count.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6559q<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super Boolean>, Object> f36942k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6294g f36943q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.cdj$q$k */
        /* JADX INFO: compiled from: Count.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m22756f = "Count.kt", m22757i = {0}, m22758l = {31}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6559q<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6559q<? super T> c6559q, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6559q;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6559q(InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h, i1.C6294g c6294g) {
            this.f36942k = interfaceC5979h;
            this.f36943q = c6294g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.cdj.C6559q.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.cdj$q$k r0 = (kotlinx.coroutines.flow.cdj.C6559q.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.cdj$q$k r0 = new kotlinx.coroutines.flow.cdj$q$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.cdj$q r5 = (kotlinx.coroutines.flow.cdj.C6559q) r5
                kotlin.C6318m.n7h(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.C6318m.n7h(r6)
                cyoe.h<T, kotlin.coroutines.q<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f36942k
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                kotlin.jvm.internal.i1$g r5 = r5.f36943q
                int r6 = r5.element
                int r6 = r6 + r3
                r5.element = r6
            L55:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.cdj.C6559q.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: Count.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6294g f36944k;

        toq(i1.C6294g c6294g) {
            this.f36944k = c6294g;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f36944k.element++;
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Count.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__CountKt", m22756f = "Count.kt", m22757i = {0}, m22758l = {30}, m22759m = "count", m22760n = {"i"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ld6.vyq(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24076k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super T, ? super kotlin.coroutines.InterfaceC6216q<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.cdj.zy
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.cdj$zy r0 = (kotlinx.coroutines.flow.cdj.zy) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.cdj$zy r0 = new kotlinx.coroutines.flow.cdj$zy
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$g r4 = (kotlin.jvm.internal.i1.C6294g) r4
            kotlin.C6318m.n7h(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r6)
            kotlin.jvm.internal.i1$g r6 = new kotlin.jvm.internal.i1$g
            r6.<init>()
            kotlinx.coroutines.flow.cdj$q r2 = new kotlinx.coroutines.flow.cdj$q
            r2.<init>(r5, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.toq.m22765g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.cdj.m24076k(kotlinx.coroutines.flow.s, cyoe.h, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object toq(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.cdj.C6558k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.cdj$k r0 = (kotlinx.coroutines.flow.cdj.C6558k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.cdj$k r0 = new kotlinx.coroutines.flow.cdj$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$g r4 = (kotlin.jvm.internal.i1.C6294g) r4
            kotlin.C6318m.n7h(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$g r5 = new kotlin.jvm.internal.i1$g
            r5.<init>()
            kotlinx.coroutines.flow.cdj$toq r2 = new kotlinx.coroutines.flow.cdj$toq
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.toq.m22765g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.cdj.toq(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }
}
