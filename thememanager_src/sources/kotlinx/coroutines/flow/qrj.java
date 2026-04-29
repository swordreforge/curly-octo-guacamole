package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.InterfaceC6511s;
import kotlinx.coroutines.flow.internal.C6578g;
import kotlinx.coroutines.mu;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/channels/d3;", "channel", "Lkotlin/was;", "q", "(Lkotlinx/coroutines/flow/p;Lkotlinx/coroutines/channels/d3;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "consume", "n", "(Lkotlinx/coroutines/flow/p;Lkotlinx/coroutines/channels/d3;ZLkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/s;", "f7l8", "zy", "Lkotlinx/coroutines/channels/s;", "toq", "Lkotlinx/coroutines/f;", "scope", C7704k.y.toq.f95579toq, "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class qrj {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.qrj$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6620k<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6511s f37074k;

        public C6620k(InterfaceC6511s interfaceC6511s) {
            this.f37074k = interfaceC6511s;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objA98o = ld6.a98o(interfaceC6618p, this.f37074k.f7l8(), interfaceC6216q);
            return objA98o == C6199q.x2() ? objA98o : was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Channels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m22756f = "Channels.kt", m22757i = {0, 0, 0, 1, 1, 1}, m22758l = {51, 62}, m22759m = "emitAllImpl$FlowKt__ChannelsKt", m22760n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, m22761s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        boolean Z$0;
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
            return qrj.m24228n(null, null, false, this);
        }
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q kotlinx.coroutines.channels.d3<? extends T> d3Var) {
        return new C6606n(d3Var, false, null, 0, null, 28, null);
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: g */
    public static final <T> kotlinx.coroutines.channels.d3<T> m24226g(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        return C6578g.toq(interfaceC6622s).kja0(interfaceC6556f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.p<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlinx.coroutines.flow.p] */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24228n(kotlinx.coroutines.flow.InterfaceC6618p<? super T> r7, kotlinx.coroutines.channels.d3<? extends T> r8, boolean r9, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.qrj.toq
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.qrj$toq r0 = (kotlinx.coroutines.flow.qrj.toq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.qrj$toq r0 = new kotlinx.coroutines.flow.qrj$toq
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d3 r8 = (kotlinx.coroutines.channels.d3) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.InterfaceC6618p) r9
            kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d3 r8 = (kotlinx.coroutines.channels.d3) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.InterfaceC6618p) r9
            kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> L55
            kotlinx.coroutines.channels.ki r10 = (kotlinx.coroutines.channels.ki) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.kja0()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            kotlin.C6318m.n7h(r10)
            kotlinx.coroutines.flow.ld6.m24178x(r7)
        L5d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L98
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L98
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L98
            r0.label = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.mcp(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = kotlinx.coroutines.channels.ki.ld6(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = kotlinx.coroutines.channels.ki.m23911g(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            kotlinx.coroutines.channels.t8r.toq(r8, r2)
        L81:
            kotlin.was r7 = kotlin.was.f36763k
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = kotlinx.coroutines.channels.ki.m23916s(r10)     // Catch: java.lang.Throwable -> L55
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L55
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L55
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L55
            r0.label = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            kotlinx.coroutines.channels.t8r.toq(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.qrj.m24228n(kotlinx.coroutines.flow.p, kotlinx.coroutines.channels.d3, boolean, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final <T> Object m24229q(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q kotlinx.coroutines.channels.d3<? extends T> d3Var, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objM24228n = m24228n(interfaceC6618p, d3Var, true, interfaceC6216q);
        return objM24228n == C6199q.x2() ? objM24228n : was.f36763k;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> InterfaceC6622s<T> toq(@InterfaceC7396q InterfaceC6511s<T> interfaceC6511s) {
        return new C6620k(interfaceC6511s);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q kotlinx.coroutines.channels.d3<? extends T> d3Var) {
        return new C6606n(d3Var, true, null, 0, null, 28, null);
    }
}
