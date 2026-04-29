package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.router.recommend.entity.UICard;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.channels.d3;
import kotlinx.coroutines.dr;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {C0846k.d9i, "R", "Lkotlinx/coroutines/channels/s;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/d3;", "Lkotlin/fn3e;", "block", "toq", "(Lkotlinx/coroutines/channels/s;Lcyoe/x2;)Ljava/lang/Object;", "", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/channels/d3;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/q;", AnimatedProperty.PROPERTY_NAME_Y, "zy", "(Lkotlinx/coroutines/channels/d3;Lcyoe/x2;)Ljava/lang/Object;", "Lkotlin/was;", "action", "n", "(Lkotlinx/coroutines/channels/d3;Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "p", "q", "(Lkotlinx/coroutines/channels/s;Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "cause", "k", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class fn3e {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.fn3e$k */
    /* JADX INFO: compiled from: Channels.common.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m22756f = "Channels.common.kt", m22757i = {0, 0}, m22758l = {104}, m22759m = "consumeEach", m22760n = {"action", "$this$consume$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class C6495k<E> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C6495k(InterfaceC6216q<? super C6495k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return fn3e.m23883n(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Channels.common.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m22756f = "Channels.common.kt", m22757i = {0, 0}, m22758l = {129}, m22759m = "consumeEach", m22760n = {"action", "channel$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class toq<E> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return fn3e.m23885q(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Channels.common.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m22756f = "Channels.common.kt", m22757i = {0, 0}, m22758l = {UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, m22759m = "toList", m22760n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, m22761s = {"L$1", "L$2"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy<E> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return t8r.yz(null, this);
        }
    }

    private static final <E> Object f7l8(d3<? extends E> d3Var, cyoe.x2<? super E, was> x2Var, InterfaceC6216q<? super was> interfaceC6216q) {
        try {
            InterfaceC6497h<? extends E> it = d3Var.iterator();
            while (true) {
                kotlin.jvm.internal.d3.m23089n(3);
                kotlin.jvm.internal.d3.m23089n(0);
                Object qVar = it.toq(null);
                kotlin.jvm.internal.d3.m23089n(1);
                if (!((Boolean) qVar).booleanValue()) {
                    was wasVar = was.f36763k;
                    kotlin.jvm.internal.d3.m23090q(1);
                    t8r.toq(d3Var, null);
                    kotlin.jvm.internal.d3.zy(1);
                    return wasVar;
                }
                x2Var.invoke(it.next());
            }
        } finally {
        }
    }

    @gc3c
    /* JADX INFO: renamed from: g */
    private static final <E> Object m23881g(InterfaceC6511s<E> interfaceC6511s, cyoe.x2<? super E, was> x2Var, InterfaceC6216q<? super was> interfaceC6216q) {
        d3<E> d3VarF7l8 = interfaceC6511s.f7l8();
        try {
            InterfaceC6497h<E> it = d3VarF7l8.iterator();
            while (true) {
                kotlin.jvm.internal.d3.m23089n(3);
                kotlin.jvm.internal.d3.m23089n(0);
                Object qVar = it.toq(null);
                kotlin.jvm.internal.d3.m23089n(1);
                if (!((Boolean) qVar).booleanValue()) {
                    return was.f36763k;
                }
                x2Var.invoke(it.next());
            }
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            d3.C6493k.toq(d3VarF7l8, null, 1, null);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @nn86
    /* JADX INFO: renamed from: k */
    public static final void m23882k(@InterfaceC7396q d3<?> d3Var, @InterfaceC7395n Throwable th) {
        if (th != null) {
            cancellationExceptionM24039k = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM24039k == null) {
                cancellationExceptionM24039k = dr.m24039k("Channel was consumed, consumer had failed", th);
            }
        }
        d3Var.mo23862q(cancellationExceptionM24039k);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object m23883n(@mub.InterfaceC7396q kotlinx.coroutines.channels.d3<? extends E> r6, @mub.InterfaceC7396q cyoe.x2<? super E, kotlin.was> r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.fn3e.C6495k
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.fn3e$k r0 = (kotlinx.coroutines.channels.fn3e.C6495k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.fn3e$k r0 = new kotlinx.coroutines.channels.fn3e$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.h r6 = (kotlinx.coroutines.channels.InterfaceC6497h) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.d3 r7 = (kotlinx.coroutines.channels.d3) r7
            java.lang.Object r2 = r0.L$0
            cyoe.x2 r2 = (cyoe.x2) r2
            kotlin.C6318m.n7h(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.C6318m.n7h(r8)
            kotlinx.coroutines.channels.h r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7a
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.toq(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L6e:
            kotlin.was r6 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.d3.m23090q(r3)
            kotlinx.coroutines.channels.t8r.toq(r7, r4)
            kotlin.jvm.internal.d3.zy(r3)
            return r6
        L7a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7e:
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            kotlin.jvm.internal.d3.m23090q(r3)
            kotlinx.coroutines.channels.t8r.toq(r7, r6)
            kotlin.jvm.internal.d3.zy(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.fn3e.m23883n(kotlinx.coroutines.channels.d3, cyoe.x2, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:26:0x0068, B:28:0x0070, B:29:0x0079), top: B:44:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:26:0x0068, B:28:0x0070, B:29:0x0079), top: B:44:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object m23884p(@mub.InterfaceC7396q kotlinx.coroutines.channels.d3<? extends E> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.fn3e.zy
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.fn3e$zy r0 = (kotlinx.coroutines.channels.fn3e.zy) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.fn3e$zy r0 = new kotlinx.coroutines.channels.fn3e$zy
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.h r8 = (kotlinx.coroutines.channels.InterfaceC6497h) r8
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.d3 r2 = (kotlinx.coroutines.channels.d3) r2
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.C6318m.n7h(r9)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r8 = move-exception
            r9 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlin.C6318m.n7h(r9)
            java.util.List r9 = kotlin.collections.fn3e.m22495s()
            kotlinx.coroutines.channels.h r2 = r8.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r9
            r5 = r4
            r9 = r8
            r8 = r2
        L53:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L83
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L83
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L83
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r8.toq(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r7 = r2
            r2 = r9
            r9 = r7
        L67:
            r6 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L39
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r9)     // Catch: java.lang.Throwable -> L39
            r9 = r2
            goto L53
        L79:
            kotlin.was r8 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L39
            kotlinx.coroutines.channels.t8r.toq(r2, r6)
            java.util.List r8 = kotlin.collections.fn3e.m22492k(r5)
            return r8
        L83:
            r8 = move-exception
            goto L89
        L85:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L89:
            throw r8     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.t8r.toq(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.fn3e.m23884p(kotlinx.coroutines.channels.d3, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @mub.InterfaceC7395n
    @kotlinx.coroutines.gc3c
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object m23885q(@mub.InterfaceC7396q kotlinx.coroutines.channels.InterfaceC6511s<E> r6, @mub.InterfaceC7396q cyoe.x2<? super E, kotlin.was> r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.fn3e.toq
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.fn3e$toq r0 = (kotlinx.coroutines.channels.fn3e.toq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.fn3e$toq r0 = new kotlinx.coroutines.channels.fn3e$toq
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.h r6 = (kotlinx.coroutines.channels.InterfaceC6497h) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.d3 r7 = (kotlinx.coroutines.channels.d3) r7
            java.lang.Object r2 = r0.L$0
            cyoe.x2 r2 = (cyoe.x2) r2
            kotlin.C6318m.n7h(r8)     // Catch: java.lang.Throwable -> L3b
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r1
            r1 = r5
            goto L66
        L3b:
            r6 = move-exception
            goto L8f
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.C6318m.n7h(r8)
            kotlinx.coroutines.channels.d3 r6 = r6.f7l8()
            kotlinx.coroutines.channels.h r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L88
            r0.label = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r6.toq(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L85
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L85
            r8 = r0
            r0 = r1
            r1 = r2
            goto L53
        L79:
            kotlin.was r6 = kotlin.was.f36763k     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.d3.m23090q(r4)
            kotlinx.coroutines.channels.d3.C6493k.toq(r0, r3, r4, r3)
            kotlin.jvm.internal.d3.zy(r4)
            return r6
        L85:
            r6 = move-exception
            r7 = r0
            goto L8f
        L88:
            r6 = move-exception
            r7 = r8
            goto L8f
        L8b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8f:
            kotlin.jvm.internal.d3.m23090q(r4)
            kotlinx.coroutines.channels.d3.C6493k.toq(r7, r3, r4, r3)
            kotlin.jvm.internal.d3.zy(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.fn3e.m23885q(kotlinx.coroutines.channels.s, cyoe.x2, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
    /* JADX INFO: renamed from: s */
    public static final <E> Object m23886s(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        return d3Var.o1t(interfaceC6216q);
    }

    @gc3c
    public static final <E, R> R toq(@InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, @InterfaceC7396q cyoe.x2<? super d3<? extends E>, ? extends R> x2Var) {
        d3<E> d3VarF7l8 = interfaceC6511s.f7l8();
        try {
            return x2Var.invoke(d3VarF7l8);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            d3.C6493k.toq(d3VarF7l8, null, 1, null);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    /* JADX INFO: renamed from: y */
    public static final <E> InterfaceC6725q<E> m23887y(@InterfaceC7396q d3<? extends E> d3Var) {
        return d3Var.zurt();
    }

    public static final <E, R> R zy(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q cyoe.x2<? super d3<? extends E>, ? extends R> x2Var) {
        try {
            R rInvoke = x2Var.invoke(d3Var);
            kotlin.jvm.internal.d3.m23090q(1);
            t8r.toq(d3Var, null);
            kotlin.jvm.internal.d3.zy(1);
            return rInvoke;
        } finally {
        }
    }
}
