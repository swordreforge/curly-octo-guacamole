package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.h */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/h;", C0846k.d9i, "", "", "toq", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface InterfaceC6497h<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.h$k */
    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.h$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Channel.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m22756f = "Channel.kt", m22757i = {0}, m22758l = {584}, m22759m = "next", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class C8067k<E> extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            C8067k(InterfaceC6216q<? super C8067k> interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return k.m23893k(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @l05.InterfaceC6769y(name = "next")
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object m23893k(kotlinx.coroutines.channels.InterfaceC6497h r4, kotlin.coroutines.InterfaceC6216q r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.InterfaceC6497h.k.C8067k
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.h$k$k r0 = (kotlinx.coroutines.channels.InterfaceC6497h.k.C8067k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.h$k$k r0 = new kotlinx.coroutines.channels.h$k$k
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.channels.h r4 = (kotlinx.coroutines.channels.InterfaceC6497h) r4
                kotlin.C6318m.n7h(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.C6318m.n7h(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.toq(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                kotlinx.coroutines.channels.fu4 r4 = new kotlinx.coroutines.channels.fu4
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.InterfaceC6497h.k.m23893k(kotlinx.coroutines.channels.h, kotlin.coroutines.q):java.lang.Object");
        }
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @InterfaceC6769y(name = "next")
    /* JADX INFO: renamed from: k */
    /* synthetic */ Object mo23892k(InterfaceC6216q interfaceC6216q);

    E next();

    @InterfaceC7395n
    Object toq(@InterfaceC7396q InterfaceC6216q<? super Boolean> interfaceC6216q);
}
