package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "", "destination", "", "toq", "(Lkotlinx/coroutines/flow/s;Ljava/util/List;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "", "q", "(Lkotlinx/coroutines/flow/s;Ljava/util/Set;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", com.market.sdk.reflect.toq.f28134q, "k", "(Lkotlinx/coroutines/flow/s;Ljava/util/Collection;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class kja0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.kja0$k */
    /* JADX INFO: compiled from: Collection.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m22756f = "Collection.kt", m22757i = {0}, m22758l = {26}, m22759m = "toCollection", m22760n = {"destination"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6603k<T, C extends Collection<? super T>> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C6603k(InterfaceC6216q<? super C6603k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ld6.b8(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Collection.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {C0846k.zaso, "", com.market.sdk.reflect.toq.f28134q, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: k */
        final /* synthetic */ Collection f37032k;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        toq(Collection collection) {
            this.f37032k = collection;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37032k.add(t2);
            return was.f36763k;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object m24151k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q C r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.kja0.C6603k
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.kja0$k r0 = (kotlinx.coroutines.flow.kja0.C6603k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.kja0$k r0 = new kotlinx.coroutines.flow.kja0$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.C6318m.n7h(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C6318m.n7h(r6)
            kotlinx.coroutines.flow.kja0$toq r6 = new kotlinx.coroutines.flow.kja0$toq
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.kja0.m24151k(kotlinx.coroutines.flow.s, java.util.Collection, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m24152n(InterfaceC6622s interfaceC6622s, Set set, InterfaceC6216q interfaceC6216q, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return ld6.ew(interfaceC6622s, set, interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final <T> Object m24153q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q Set<T> set, @InterfaceC7396q InterfaceC6216q<? super Set<? extends T>> interfaceC6216q) {
        return ld6.b8(interfaceC6622s, set, interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <T> Object toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q List<T> list, @InterfaceC7396q InterfaceC6216q<? super List<? extends T>> interfaceC6216q) {
        return ld6.b8(interfaceC6622s, list, interfaceC6216q);
    }

    public static /* synthetic */ Object zy(InterfaceC6622s interfaceC6622s, List list, InterfaceC6216q interfaceC6216q, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        return ld6.nme(interfaceC6622s, list, interfaceC6216q);
    }
}
