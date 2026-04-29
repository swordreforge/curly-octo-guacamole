package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.concurrent.CancellationException;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {C0846k.zaso, "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/Function0;", "block", "toq", "(Lkotlin/coroutines/f7l8;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "coroutineContext", "q", "(Lkotlin/coroutines/f7l8;Lcyoe/k;)Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "WORKING", "FINISHED", "zy", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class wo {

    /* JADX INFO: renamed from: k */
    private static final int f37481k = 0;

    /* JADX INFO: renamed from: q */
    private static final int f37482q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f82086toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f82087zy = 2;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.wo$k */
    /* JADX INFO: compiled from: Interruptible.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m22756f = "Interruptible.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6744k<T> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super T>, Object> {
        final /* synthetic */ InterfaceC5981k<T> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6744k(InterfaceC5981k<? extends T> interfaceC5981k, InterfaceC6216q<? super C6744k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$block = interfaceC5981k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<kotlin.was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6744k c6744k = new C6744k(this.$block, interfaceC6216q);
            c6744k.L$0 = obj;
            return c6744k;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super T> interfaceC6216q) {
            return ((C6744k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(kotlin.was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return wo.m24644q(((InterfaceC6556f) this.L$0).i1(), this.$block);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final <T> T m24644q(kotlin.coroutines.f7l8 f7l8Var, InterfaceC5981k<? extends T> interfaceC5981k) throws Throwable {
        try {
            ebn ebnVar = new ebn(ltg8.m24486t(f7l8Var));
            ebnVar.m24042q();
            try {
                return interfaceC5981k.invoke();
            } finally {
                ebnVar.m24041k();
            }
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }

    @InterfaceC7395n
    public static final <T> Object toq(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5981k<? extends T> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return C6708p.m24523y(f7l8Var, new C6744k(interfaceC5981k, null), interfaceC6216q);
    }

    public static /* synthetic */ Object zy(kotlin.coroutines.f7l8 f7l8Var, InterfaceC5981k interfaceC5981k, InterfaceC6216q interfaceC6216q, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        return toq(f7l8Var, interfaceC5981k, interfaceC6216q);
    }
}
