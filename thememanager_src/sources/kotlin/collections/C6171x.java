package kotlin.collections;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.x */
/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6171x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.x$k */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @InterfaceC6205g(m22755c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m22756f = "SlidingWindow.kt", m22757i = {0, 0, 0, 2, 2, 3, 3}, m22758l = {34, 40, 49, 55, 58}, m22759m = "invokeSuspend", m22760n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m22761s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    static final class k<T> extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super List<? extends T>>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(int i2, int i3, Iterator<? extends T> it, boolean z2, boolean z3, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$size = i2;
            this.$step = i3;
            this.$iterator = it;
            this.$reuseBuffer = z2;
            this.$partialWindows = z3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super List<? extends T>> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C6171x.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.x$toq */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    public static final class toq<T> implements kotlin.sequences.qrj<List<? extends T>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj f36202k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f36203n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f36204q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f81781toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f81782zy;

        public toq(kotlin.sequences.qrj qrjVar, int i2, int i3, boolean z2, boolean z3) {
            this.f36202k = qrjVar;
            this.f81781toq = i2;
            this.f81782zy = i3;
            this.f36204q = z2;
            this.f36203n = z3;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<List<? extends T>> iterator() {
            return C6171x.toq(this.f36202k.iterator(), this.f81781toq, this.f81782zy, this.f36204q, this.f36203n);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m22658k(int i2, int i3) {
        String str;
        if (i2 > 0 && i3 > 0) {
            return;
        }
        if (i2 != i3) {
            str = "Both size " + i2 + " and step " + i3 + " must be greater than zero.";
        } else {
            str = "size " + i2 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @InterfaceC7396q
    public static final <T> Iterator<List<T>> toq(@InterfaceC7396q Iterator<? extends T> iterator, int i2, int i3, boolean z2, boolean z3) {
        kotlin.jvm.internal.d2ok.m23075h(iterator, "iterator");
        return !iterator.hasNext() ? jp0y.f36161k : kotlin.sequences.cdj.m23418k(new k(i2, i3, iterator, z3, z2, null));
    }

    @InterfaceC7396q
    public static final <T> kotlin.sequences.qrj<List<T>> zy(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar, int i2, int i3, boolean z2, boolean z3) {
        kotlin.jvm.internal.d2ok.m23075h(qrjVar, "<this>");
        m22658k(i2, i3);
        return new toq(qrjVar, i2, i3, z2, z3);
    }
}
