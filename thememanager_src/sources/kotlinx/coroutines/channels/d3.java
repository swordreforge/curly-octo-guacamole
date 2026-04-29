package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.internal.InterfaceC6244y;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6725q;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\b\u0010\u0010\u001a\u00020\u000eH\u0017J\u0014\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0011H'J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001d8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/d3;", C0846k.d9i, "", "fti", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki;", "mcp", "z", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/was;", "q", "cancel", "", "", "k", "poll", "o1t", "toq", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/q;", "t8r", "()Lkotlinx/coroutines/selects/q;", "onReceive", "fn3e", "onReceiveCatching", "zurt", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface d3<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.d3$k */
    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6493k {

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.d3$k$k */
        /* JADX INFO: compiled from: Channel.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JL\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\b\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/d3$k$k", "Lkotlinx/coroutines/selects/q;", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "eqxt", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        public static final class k implements InterfaceC6725q<E> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ d3<E> f36801k;

            /* JADX INFO: Add missing generic type declarations: [R] */
            /* JADX INFO: renamed from: kotlinx.coroutines.channels.d3$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Channel.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", m22756f = "Channel.kt", m22757i = {}, m22758l = {375}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
            @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"R", C0846k.d9i, "Lkotlinx/coroutines/channels/ki;", "it", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C8066k<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<ki<? extends E>, InterfaceC6216q<? super R>, Object> {
                final /* synthetic */ InterfaceC5979h<E, InterfaceC6216q<? super R>, Object> $block;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C8066k(InterfaceC5979h<? super E, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C8066k> interfaceC6216q) {
                    super(2, interfaceC6216q);
                    this.$block = interfaceC5979h;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7396q
                public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                    C8066k c8066k = new C8066k(this.$block, interfaceC6216q);
                    c8066k.L$0 = obj;
                    return c8066k;
                }

                @Override // cyoe.InterfaceC5979h
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m28292invokeWpGqRn0(((ki) obj).kja0(), (InterfaceC6216q) obj2);
                }

                @InterfaceC7395n
                /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
                public final Object m28292invokeWpGqRn0(@InterfaceC7396q Object obj, @InterfaceC7395n InterfaceC6216q<? super R> interfaceC6216q) {
                    return ((C8066k) create(ki.toq(obj), interfaceC6216q)).invokeSuspend(was.f36763k);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.d3$k$k$k<R> for r3v1 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @mub.InterfaceC7395n
                public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                        int r1 = r3.label
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        kotlin.C6318m.n7h(r4)
                        goto L37
                    Lf:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    L17:
                        kotlin.C6318m.n7h(r4)
                        java.lang.Object r4 = r3.L$0
                        kotlinx.coroutines.channels.ki r4 = (kotlinx.coroutines.channels.ki) r4
                        java.lang.Object r4 = r4.kja0()
                        java.lang.Throwable r1 = kotlinx.coroutines.channels.ki.m23911g(r4)
                        if (r1 != 0) goto L38
                        cyoe.h<E, kotlin.coroutines.q<? super R>, java.lang.Object> r1 = r3.$block
                        java.lang.Object r4 = kotlinx.coroutines.channels.ki.m23917y(r4)
                        r3.label = r2
                        java.lang.Object r4 = r1.invoke(r4, r3)
                        if (r4 != r0) goto L37
                        return r0
                    L37:
                        return r4
                    L38:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.d3.C6493k.k.C8066k.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            k(d3<? extends E> d3Var) {
                this.f36801k = d3Var;
            }

            @Override // kotlinx.coroutines.selects.InterfaceC6725q
            @tfm
            public <R> void eqxt(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super E, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
                this.f36801k.fn3e().eqxt(interfaceC6720g, new C8066k(interfaceC5979h, null));
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.d3$k$toq */
        /* JADX INFO: compiled from: Channel.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m22756f = "Channel.kt", m22757i = {}, m22758l = {354}, m22759m = "receiveOrNull", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class toq<E> extends AbstractC6209q {
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
                return C6493k.m23868s(null, this);
            }
        }

        @InterfaceC6533d
        public static /* synthetic */ void f7l8() {
        }

        @InterfaceC6533d
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m23864g() {
        }

        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @hb(expression = "onReceiveCatching", imports = {}))
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m23866n() {
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static <E> InterfaceC6725q<E> m23867q(@InterfaceC7396q d3<? extends E> d3Var) {
            return new k(d3Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @kotlin.internal.InterfaceC6244y
        @mub.InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.hb(expression = "receiveCatching().getOrNull()", imports = {}))
        /* JADX INFO: renamed from: s */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object m23868s(@mub.InterfaceC7396q kotlinx.coroutines.channels.d3<? extends E> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.d3.C6493k.toq
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.d3$k$toq r0 = (kotlinx.coroutines.channels.d3.C6493k.toq) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.d3$k$toq r0 = new kotlinx.coroutines.channels.d3$k$toq
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.C6318m.n7h(r5)
                kotlinx.coroutines.channels.ki r5 = (kotlinx.coroutines.channels.ki) r5
                java.lang.Object r4 = r5.kja0()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.C6318m.n7h(r5)
                r0.label = r3
                java.lang.Object r4 = r4.mcp(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = kotlinx.coroutines.channels.ki.m23917y(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.d3.C6493k.m23868s(kotlinx.coroutines.channels.d3, kotlin.coroutines.q):java.lang.Object");
        }

        public static /* synthetic */ void toq(d3 d3Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            d3Var.mo23862q(cancellationException);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
        /* JADX INFO: renamed from: y */
        public static <E> E m23869y(@InterfaceC7396q d3<? extends E> d3Var) throws Throwable {
            Object objMo23863z = d3Var.mo23863z();
            if (ki.qrj(objMo23863z)) {
                return (E) ki.m23916s(objMo23863z);
            }
            Throwable thM23911g = ki.m23911g(objMo23863z);
            if (thM23911g == null) {
                return null;
            }
            throw kotlinx.coroutines.internal.ncyb.m24375h(thM23911g);
        }

        public static /* synthetic */ boolean zy(d3 d3Var, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return d3Var.mo23861k(th);
        }
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC7396q
    InterfaceC6725q<ki<E>> fn3e();

    @InterfaceC7395n
    Object fti(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q);

    boolean isEmpty();

    @InterfaceC7396q
    InterfaceC6497h<E> iterator();

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    /* synthetic */ boolean mo23861k(Throwable th);

    @InterfaceC7395n
    Object mcp(@InterfaceC7396q InterfaceC6216q<? super ki<? extends E>> interfaceC6216q);

    @InterfaceC6244y
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
    Object o1t(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q);

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    /* JADX INFO: renamed from: q */
    void mo23862q(@InterfaceC7395n CancellationException cancellationException);

    @InterfaceC7396q
    InterfaceC6725q<E> t8r();

    boolean toq();

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    Object mo23863z();

    @InterfaceC7396q
    InterfaceC6725q<E> zurt();
}
