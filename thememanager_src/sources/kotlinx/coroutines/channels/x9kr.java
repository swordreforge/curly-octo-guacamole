package kotlinx.coroutines.channels;

import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.vq;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/channels/ncyb;", "mode", "Lkotlinx/coroutines/channels/d3;", "Lkotlin/was;", "n", "Lkotlinx/coroutines/channels/lvui;", "channel", "q", "(JJLkotlinx/coroutines/channels/lvui;Lkotlin/coroutines/q;)Ljava/lang/Object;", "zy", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class x9kr {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.x9kr$k */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.TickerChannelsKt", m22756f = "TickerChannels.kt", m22757i = {0, 0, 1, 1, 2, 2}, m22758l = {106, 108, 109}, m22759m = "fixedDelayTicker", m22760n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m22761s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6514k extends AbstractC6209q {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C6514k(InterfaceC6216q<? super C6514k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return x9kr.zy(0L, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: TickerChannels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.TickerChannelsKt", m22756f = "TickerChannels.kt", m22757i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, m22758l = {84, 88, 94, 96}, m22759m = "fixedPeriodTicker", m22760n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, m22761s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6209q {
        long J$0;
        long J$1;
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
            return x9kr.m23969q(0L, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: TickerChannels.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m22756f = "TickerChannels.kt", m22757i = {}, m22758l = {72, 73}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<jp0y<? super was>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ ncyb $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.x9kr$zy$k */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class C6515k {

            /* JADX INFO: renamed from: k */
            public static final /* synthetic */ int[] f36860k;

            static {
                int[] iArr = new int[ncyb.values().length];
                iArr[ncyb.FIXED_PERIOD.ordinal()] = 1;
                iArr[ncyb.FIXED_DELAY.ordinal()] = 2;
                f36860k = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(ncyb ncybVar, long j2, long j3, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$mode = ncybVar;
            this.$delayMillis = j2;
            this.$initialDelayMillis = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            zy zyVar = new zy(this.$mode, this.$delayMillis, this.$initialDelayMillis, interfaceC6216q);
            zyVar.L$0 = obj;
            return zyVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q jp0y<? super was> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                jp0y jp0yVar = (jp0y) this.L$0;
                int i3 = C6515k.f36860k[this.$mode.ordinal()];
                if (i3 == 1) {
                    long j2 = this.$delayMillis;
                    long j3 = this.$initialDelayMillis;
                    lvui lvuiVarZy = jp0yVar.zy();
                    this.label = 1;
                    if (x9kr.m23969q(j2, j3, lvuiVarZy, this) == objX2) {
                        return objX2;
                    }
                } else if (i3 == 2) {
                    long j4 = this.$delayMillis;
                    long j5 = this.$initialDelayMillis;
                    lvui lvuiVarZy2 = jp0yVar.zy();
                    this.label = 2;
                    if (x9kr.zy(j4, j5, lvuiVarZy2, this) == objX2) {
                        return objX2;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ d3 m23966g(long j2, long j3, kotlin.coroutines.f7l8 f7l8Var, ncyb ncybVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        if ((i2 & 4) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            ncybVar = ncyb.FIXED_PERIOD;
        }
        return m23968n(j2, j3, f7l8Var, ncybVar);
    }

    @InterfaceC7396q
    @gc3c
    /* JADX INFO: renamed from: n */
    public static final d3<was> m23968n(long j2, long j3, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q ncyb ncybVar) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return a9.zy(vq.f37472k, C6481a.f7l8().plus(f7l8Var), 0, new zy(ncybVar, j2, j3, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0111 -> B:34:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0125 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m23969q(long r19, long r21, kotlinx.coroutines.channels.lvui<? super kotlin.was> r23, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r24) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x9kr.m23969q(long, long, kotlinx.coroutines.channels.lvui, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zy(long r6, long r8, kotlinx.coroutines.channels.lvui<? super kotlin.was> r10, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.x9kr.C6514k
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.x9kr$k r0 = (kotlinx.coroutines.channels.x9kr.C6514k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.x9kr$k r0 = new kotlinx.coroutines.channels.x9kr$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.lvui r8 = (kotlinx.coroutines.channels.lvui) r8
            kotlin.C6318m.n7h(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.lvui r8 = (kotlinx.coroutines.channels.lvui) r8
            kotlin.C6318m.n7h(r11)
            goto L73
        L48:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.lvui r10 = (kotlinx.coroutines.channels.lvui) r10
            kotlin.C6318m.n7h(r11)
            goto L63
        L53:
            kotlin.C6318m.n7h(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.ek5k.toq(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.was r8 = kotlin.was.f36763k
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.d3(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.ek5k.toq(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x9kr.zy(long, long, kotlinx.coroutines.channels.lvui, kotlin.coroutines.q):java.lang.Object");
    }
}
