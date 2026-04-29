package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.i */
/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/channels/lvui;", "element", "Lkotlinx/coroutines/channels/ki;", "Lkotlin/was;", "toq", "(Lkotlinx/coroutines/channels/lvui;Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Lkotlinx/coroutines/channels/lvui;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class C6498i {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.i$k */
    /* JADX INFO: compiled from: Channels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", m22756f = "Channels.kt", m22757i = {}, m22758l = {58}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ lvui<E> $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(lvui<? super E> lvuiVar, E e2, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_sendBlocking = lvuiVar;
            this.$element = e2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$this_sendBlocking, this.$element, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
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
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                lvui<E> lvuiVar = this.$this_sendBlocking;
                E e2 = this.$element;
                this.label = 1;
                if (lvuiVar.d3(e2, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.i$toq */
    /* JADX INFO: compiled from: Channels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m22756f = "Channels.kt", m22757i = {}, m22758l = {39}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/channels/ki;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super ki<? extends was>>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ lvui<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(lvui<? super E> lvuiVar, E e2, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_trySendBlocking = lvuiVar;
            this.$element = e2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(this.$this_trySendBlocking, this.$element, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC6556f interfaceC6556f, InterfaceC6216q<? super ki<? extends was>> interfaceC6216q) {
            return invoke2(interfaceC6556f, (InterfaceC6216q<? super ki<was>>) interfaceC6216q);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super ki<was>> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
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
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objM28280constructorimpl;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    lvui<E> lvuiVar = this.$this_trySendBlocking;
                    E e2 = this.$element;
                    C6323o.k kVar = C6323o.Companion;
                    this.label = 1;
                    if (lvuiVar.d3(e2, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                objM28280constructorimpl = C6323o.m28280constructorimpl(was.f36763k);
            } catch (Throwable th) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
            }
            return ki.toq(C6323o.m28286isSuccessimpl(objM28280constructorimpl) ? ki.f81958toq.zy(was.f36763k) : ki.f81958toq.m23918k(C6323o.m28283exceptionOrNullimpl(objM28280constructorimpl)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @hb(expression = "trySendBlocking(element)", imports = {}))
    /* JADX INFO: renamed from: k */
    public static final <E> void m23894k(@InterfaceC7396q lvui<? super E> lvuiVar, E e2) throws InterruptedException {
        if (ki.qrj(lvuiVar.mo23921s(e2))) {
            return;
        }
        kotlinx.coroutines.ld6.toq(null, new k(lvuiVar, e2, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <E> Object toq(@InterfaceC7396q lvui<? super E> lvuiVar, E e2) {
        Object objMo23921s = lvuiVar.mo23921s(e2);
        if (objMo23921s instanceof ki.zy) {
            return ((ki) kotlinx.coroutines.ld6.toq(null, new toq(lvuiVar, e2, null), 1, null)).kja0();
        }
        return ki.f81958toq.zy(was.f36763k);
    }
}
