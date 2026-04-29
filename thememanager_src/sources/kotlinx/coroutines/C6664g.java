package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.g */
/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {C0846k.zaso, "", "Lkotlinx/coroutines/j;", "deferreds", "", "toq", "([Lkotlinx/coroutines/j;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "k", "(Ljava/util/Collection;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/gbni;", "jobs", "Lkotlin/was;", "q", "([Lkotlinx/coroutines/gbni;Lkotlin/coroutines/q;)Ljava/lang/Object;", "zy", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6664g {

    /* JADX INFO: renamed from: kotlinx.coroutines.g$k */
    /* JADX INFO: compiled from: Await.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.AwaitKt", m22756f = "Await.kt", m22757i = {}, m22758l = {54}, m22759m = "joinAll", m22760n = {}, m22761s = {})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class k extends AbstractC6209q {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        k(InterfaceC6216q<? super k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6664g.m24290q(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.g$toq */
    /* JADX INFO: compiled from: Await.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.AwaitKt", m22756f = "Await.kt", m22757i = {}, m22758l = {66}, m22759m = "joinAll", m22760n = {}, m22761s = {})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6664g.zy(null, this);
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <T> Object m24289k(@InterfaceC7396q Collection<? extends InterfaceC6695j<? extends T>> collection, @InterfaceC7396q InterfaceC6216q<? super List<? extends T>> interfaceC6216q) {
        if (collection.isEmpty()) {
            return kotlin.collections.ni7.a9();
        }
        Object[] array = collection.toArray(new InterfaceC6695j[0]);
        if (array != null) {
            return new C6701n((InterfaceC6695j[]) array).toq(interfaceC6216q);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24290q(@mub.InterfaceC7396q kotlinx.coroutines.gbni[] r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.C6664g.k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.g$k r0 = (kotlinx.coroutines.C6664g.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.g$k r0 = new kotlinx.coroutines.g$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.gbni[] r4 = (kotlinx.coroutines.gbni[]) r4
            kotlin.C6318m.n7h(r7)
            r7 = r4
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
            goto L49
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.C6318m.n7h(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r1
            r1 = r0
            r0 = r5
        L49:
            if (r0 >= r6) goto L5e
            r4 = r7[r0]
            int r0 = r0 + 1
            r1.L$0 = r7
            r1.I$0 = r0
            r1.I$1 = r6
            r1.label = r3
            java.lang.Object r4 = r4.was(r1)
            if (r4 != r2) goto L49
            return r2
        L5e:
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6664g.m24290q(kotlinx.coroutines.gbni[], kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7395n
    public static final <T> Object toq(@InterfaceC7396q InterfaceC6695j<? extends T>[] interfaceC6695jArr, @InterfaceC7396q InterfaceC6216q<? super List<? extends T>> interfaceC6216q) {
        return interfaceC6695jArr.length == 0 ? kotlin.collections.ni7.a9() : new C6701n(interfaceC6695jArr).toq(interfaceC6216q);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zy(@mub.InterfaceC7396q java.util.Collection<? extends kotlinx.coroutines.gbni> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.C6664g.toq
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.g$toq r0 = (kotlinx.coroutines.C6664g.toq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.g$toq r0 = new kotlinx.coroutines.g$toq
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.C6318m.n7h(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.gbni r5 = (kotlinx.coroutines.gbni) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.was(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6664g.zy(java.util.Collection, kotlin.coroutines.q):java.lang.Object");
    }
}
