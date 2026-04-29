package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5717e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6668i;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.flow.internal.AbstractC6587q;
import kotlinx.coroutines.internal.C6679l;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010M\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bo\u0010pJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010JR\u0016\u0010Z\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\\\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u00109R\u0014\u0010_\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0014\u0010c\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00109R\u0014\u0010e\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u00109R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bl\u0010m\u001a\u0004\bj\u0010k\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006q"}, d2 = {"Lkotlinx/coroutines/flow/oc;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/toq;", "Lkotlinx/coroutines/flow/d2ok;", "Lkotlinx/coroutines/flow/jk;", "Lkotlinx/coroutines/flow/zy;", "Lkotlinx/coroutines/flow/internal/ki;", "value", "", "vyq", "(Ljava/lang/Object;)Z", "e", "Lkotlin/was;", "eqxt", "", "newHead", "gvn7", "", "item", "r", "", "curBuffer", "", "curSize", "newSize", "uv6", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "lvui", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/oc$k;", "emitter", "a9", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "j", "fti", "slot", "hb", "nn86", "index", "hyr", "jk", "(Lkotlinx/coroutines/flow/d2ok;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/q;", "resumesIn", "dd", "([Lkotlin/coroutines/q;)[Lkotlin/coroutines/q;", "Lkotlinx/coroutines/flow/p;", "collector", "", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "toq", "emit", "m", "()J", "oldIndex", "o", "(J)[Lkotlin/coroutines/q;", "d3", "size", "oc", "(I)[Lkotlinx/coroutines/flow/d2ok;", "f7l8", "Lkotlin/coroutines/f7l8;", "context", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/s;", "q", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f28131g, "replay", C7704k.y.toq.f44691k, "bufferCapacity", "p", "Lkotlinx/coroutines/channels/qrj;", AnimatedProperty.PROPERTY_NAME_H, "[Ljava/lang/Object;", "buffer", "i", com.market.sdk.reflect.toq.f68928f7l8, "replayIndex", "z", "minCollectorIndex", "t", "bufferSize", "queueSize", "ncyb", C3678q.f65826kja0, "c", "()I", "replaySize", "lrht", "totalSize", "x9kr", "bufferEndIndex", "f", "queueEndIndex", "", "n", "()Ljava/util/List;", "replayCache", C5717e.f31929a, "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", C4991s.f28129n, "(IILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class oc<T> extends kotlinx.coroutines.flow.internal.toq<d2ok> implements jk<T>, kotlinx.coroutines.flow.zy<T>, kotlinx.coroutines.flow.internal.ki<T> {

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private Object[] f37059h;

    /* JADX INFO: renamed from: i */
    private long f37060i;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final kotlinx.coroutines.channels.qrj f37061p;

    /* JADX INFO: renamed from: r */
    private int f37062r;

    /* JADX INFO: renamed from: s */
    private final int f37063s;

    /* JADX INFO: renamed from: t */
    private int f37064t;

    /* JADX INFO: renamed from: y */
    private final int f37065y;

    /* JADX INFO: renamed from: z */
    private long f37066z;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.oc$k */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/oc$k;", "Lkotlinx/coroutines/ch;", "Lkotlin/was;", "zy", "Lkotlinx/coroutines/flow/oc;", "k", "Lkotlinx/coroutines/flow/oc;", "flow", "", "q", com.market.sdk.reflect.toq.f68928f7l8, "index", "", "n", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/q;", C7704k.y.toq.f95579toq, "Lkotlin/coroutines/q;", "cont", C4991s.f28129n, "(Lkotlinx/coroutines/flow/oc;JLjava/lang/Object;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6617k implements ch {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC6216q<was> f37067g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final oc<?> f37068k;

        /* JADX INFO: renamed from: n */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Object f37069n;

        /* JADX INFO: renamed from: q */
        @InterfaceC6765n
        public long f37070q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6617k(@InterfaceC7396q oc<?> ocVar, long j2, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37068k = ocVar;
            this.f37070q = j2;
            this.f37069n = obj;
            this.f37067g = interfaceC6216q;
        }

        @Override // kotlinx.coroutines.ch
        public void zy() {
            this.f37068k.a9(this);
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f37071k;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.qrj.values().length];
            iArr[kotlinx.coroutines.channels.qrj.SUSPEND.ordinal()] = 1;
            iArr[kotlinx.coroutines.channels.qrj.DROP_LATEST.ordinal()] = 2;
            iArr[kotlinx.coroutines.channels.qrj.DROP_OLDEST.ordinal()] = 3;
            f37071k = iArr;
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.SharedFlowImpl", m22756f = "SharedFlow.kt", m22757i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m22758l = {373, 380, 383}, m22759m = "collect$suspendImpl", m22760n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, m22761s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ oc<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(oc<T> ocVar, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = ocVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return oc.jp0y(this.this$0, null, this);
        }
    }

    public oc(int i2, int i3, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        this.f37065y = i2;
        this.f37063s = i3;
        this.f37061p = qrjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a9(C6617k c6617k) {
        synchronized (this) {
            if (c6617k.f37070q < ncyb()) {
                return;
            }
            Object[] objArr = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr);
            if (eqxt.m24083g(objArr, c6617k.f37070q) != c6617k) {
                return;
            }
            eqxt.m24087y(objArr, c6617k.f37070q, eqxt.f36949k);
            fti();
            was wasVar = was.f36763k;
        }
    }

    /* JADX INFO: renamed from: c */
    private final int m24215c() {
        return (int) ((ncyb() + ((long) this.f37064t)) - this.f37060i);
    }

    static /* synthetic */ Object d2ok(oc ocVar, Object obj, InterfaceC6216q interfaceC6216q) {
        if (ocVar.toq(obj)) {
            return was.f36763k;
        }
        Object objLvui = ocVar.lvui(obj, interfaceC6216q);
        return objLvui == C6199q.x2() ? objLvui : was.f36763k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.q<kotlin.was>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final InterfaceC6216q<was>[] dd(InterfaceC6216q<was>[] interfaceC6216qArr) {
        AbstractC6587q[] abstractC6587qArr;
        d2ok d2okVar;
        InterfaceC6216q<? super was> interfaceC6216q;
        int length = interfaceC6216qArr.length;
        if (((kotlinx.coroutines.flow.internal.toq) this).f37024q != 0 && (abstractC6587qArr = ((kotlinx.coroutines.flow.internal.toq) this).f37022k) != null) {
            int i2 = 0;
            int length2 = abstractC6587qArr.length;
            while (i2 < length2) {
                AbstractC6587q abstractC6587q = abstractC6587qArr[i2];
                i2++;
                if (abstractC6587q != null && (interfaceC6216q = (d2okVar = (d2ok) abstractC6587q).f81988toq) != null && nn86(d2okVar) >= 0) {
                    int length3 = interfaceC6216qArr.length;
                    interfaceC6216qArr = interfaceC6216qArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC6216qArr, Math.max(2, interfaceC6216qArr.length * 2));
                        kotlin.jvm.internal.d2ok.kja0(objArrCopyOf, "copyOf(this, newSize)");
                        interfaceC6216qArr = objArrCopyOf;
                    }
                    ((InterfaceC6216q[]) interfaceC6216qArr)[length] = interfaceC6216q;
                    d2okVar.f81988toq = null;
                    length++;
                }
            }
        }
        return (InterfaceC6216q[]) interfaceC6216qArr;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m24216e(T t2) {
        if (this.f37065y == 0) {
            return true;
        }
        m24220r(t2);
        int i2 = this.f37064t + 1;
        this.f37064t = i2;
        if (i2 > this.f37065y) {
            eqxt();
        }
        this.f37066z = ncyb() + ((long) this.f37064t);
        return true;
    }

    private final void eqxt() {
        Object[] objArr = this.f37059h;
        kotlin.jvm.internal.d2ok.qrj(objArr);
        eqxt.m24087y(objArr, ncyb(), null);
        this.f37064t--;
        long jNcyb = ncyb() + 1;
        if (this.f37060i < jNcyb) {
            this.f37060i = jNcyb;
        }
        if (this.f37066z < jNcyb) {
            gvn7(jNcyb);
        }
    }

    /* JADX INFO: renamed from: f */
    private final long m24217f() {
        return ncyb() + ((long) this.f37064t) + ((long) this.f37062r);
    }

    private final void fti() {
        if (this.f37063s != 0 || this.f37062r > 1) {
            Object[] objArr = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr);
            while (this.f37062r > 0 && eqxt.m24083g(objArr, (ncyb() + ((long) lrht())) - 1) == eqxt.f36949k) {
                this.f37062r--;
                eqxt.m24087y(objArr, ncyb() + ((long) lrht()), null);
            }
        }
    }

    private final void gvn7(long j2) {
        AbstractC6587q[] abstractC6587qArr;
        if (((kotlinx.coroutines.flow.internal.toq) this).f37024q != 0 && (abstractC6587qArr = ((kotlinx.coroutines.flow.internal.toq) this).f37022k) != null) {
            int i2 = 0;
            int length = abstractC6587qArr.length;
            while (i2 < length) {
                AbstractC6587q abstractC6587q = abstractC6587qArr[i2];
                i2++;
                if (abstractC6587q != null) {
                    d2ok d2okVar = (d2ok) abstractC6587q;
                    long j3 = d2okVar.f36945k;
                    if (j3 >= 0 && j3 < j2) {
                        d2okVar.f36945k = j2;
                    }
                }
            }
        }
        this.f37066z = j2;
    }

    private final Object hb(d2ok d2okVar) {
        Object obj;
        InterfaceC6216q<was>[] interfaceC6216qArrM24225o = kotlinx.coroutines.flow.internal.zy.f37027k;
        synchronized (this) {
            long jNn86 = nn86(d2okVar);
            if (jNn86 < 0) {
                obj = eqxt.f36949k;
            } else {
                long j2 = d2okVar.f36945k;
                Object objHyr = hyr(jNn86);
                d2okVar.f36945k = jNn86 + 1;
                interfaceC6216qArrM24225o = m24225o(j2);
                obj = objHyr;
            }
        }
        int i2 = 0;
        int length = interfaceC6216qArrM24225o.length;
        while (i2 < length) {
            InterfaceC6216q<was> interfaceC6216q = interfaceC6216qArrM24225o[i2];
            i2++;
            if (interfaceC6216q != null) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
            }
        }
        return obj;
    }

    private final Object hyr(long j2) {
        Object[] objArr = this.f37059h;
        kotlin.jvm.internal.d2ok.qrj(objArr);
        Object objM24083g = eqxt.m24083g(objArr, j2);
        return objM24083g instanceof C6617k ? ((C6617k) objM24083g).f37069n : objM24083g;
    }

    /* JADX INFO: renamed from: j */
    private final void m24219j(long j2, long j3, long j4, long j5) {
        long jMin = Math.min(j3, j2);
        for (long jNcyb = ncyb(); jNcyb < jMin; jNcyb = 1 + jNcyb) {
            Object[] objArr = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr);
            eqxt.m24087y(objArr, jNcyb, null);
        }
        this.f37060i = j2;
        this.f37066z = j3;
        this.f37064t = (int) (j4 - jMin);
        this.f37062r = (int) (j5 - j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object jk(d2ok d2okVar, InterfaceC6216q<? super was> interfaceC6216q) {
        was wasVar;
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        synchronized (this) {
            if (nn86(d2okVar) < 0) {
                d2okVar.f81988toq = kiVar;
            } else {
                C6323o.k kVar = C6323o.Companion;
                kiVar.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
            }
            wasVar = was.f36763k;
        }
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : wasVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object jp0y(kotlinx.coroutines.flow.oc r8, kotlinx.coroutines.flow.InterfaceC6618p r9, kotlin.coroutines.InterfaceC6216q r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.oc.jp0y(kotlinx.coroutines.flow.oc, kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int lrht() {
        return this.f37064t + this.f37062r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lvui(T t2, InterfaceC6216q<? super was> interfaceC6216q) {
        InterfaceC6216q<was>[] interfaceC6216qArrDd;
        C6617k c6617k;
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        InterfaceC6216q<was>[] interfaceC6216qArrDd2 = kotlinx.coroutines.flow.internal.zy.f37027k;
        synchronized (this) {
            if (vyq(t2)) {
                C6323o.k kVar = C6323o.Companion;
                kiVar.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
                interfaceC6216qArrDd = dd(interfaceC6216qArrDd2);
                c6617k = null;
            } else {
                C6617k c6617k2 = new C6617k(this, ((long) lrht()) + ncyb(), t2, kiVar);
                m24220r(c6617k2);
                this.f37062r++;
                if (this.f37063s == 0) {
                    interfaceC6216qArrDd2 = dd(interfaceC6216qArrDd2);
                }
                interfaceC6216qArrDd = interfaceC6216qArrDd2;
                c6617k = c6617k2;
            }
        }
        if (c6617k != null) {
            C6668i.m24303k(kiVar, c6617k);
        }
        int i2 = 0;
        int length = interfaceC6216qArrDd.length;
        while (i2 < length) {
            InterfaceC6216q<was> interfaceC6216q2 = interfaceC6216qArrDd[i2];
            i2++;
            if (interfaceC6216q2 != null) {
                C6323o.k kVar2 = C6323o.Companion;
                interfaceC6216q2.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
            }
        }
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : was.f36763k;
    }

    protected static /* synthetic */ void n5r1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ncyb() {
        return Math.min(this.f37066z, this.f37060i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long nn86(d2ok d2okVar) {
        long j2 = d2okVar.f36945k;
        if (j2 < x9kr()) {
            return j2;
        }
        if (this.f37063s <= 0 && j2 <= ncyb() && this.f37062r != 0) {
            return j2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m24220r(Object obj) {
        int iLrht = lrht();
        Object[] objArrUv6 = this.f37059h;
        if (objArrUv6 == null) {
            objArrUv6 = uv6(null, 0, 2);
        } else if (iLrht >= objArrUv6.length) {
            objArrUv6 = uv6(objArrUv6, iLrht, objArrUv6.length * 2);
        }
        eqxt.m24087y(objArrUv6, ncyb() + ((long) iLrht), obj);
    }

    private final Object[] uv6(Object[] objArr, int i2, int i3) {
        if (!(i3 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.f37059h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jNcyb = ncyb();
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = ((long) i4) + jNcyb;
            eqxt.m24087y(objArr2, j2, eqxt.m24083g(objArr, j2));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean vyq(T t2) {
        if (kja0() == 0) {
            return m24216e(t2);
        }
        if (this.f37064t >= this.f37063s && this.f37066z <= this.f37060i) {
            int i2 = toq.f37071k[this.f37061p.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        m24220r(t2);
        int i3 = this.f37064t + 1;
        this.f37064t = i3;
        if (i3 > this.f37063s) {
            eqxt();
        }
        if (m24215c() > this.f37065y) {
            m24219j(this.f37060i + 1, this.f37066z, x9kr(), m24217f());
        }
        return true;
    }

    private final long x9kr() {
        return ncyb() + ((long) this.f37064t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.toq
    @InterfaceC7396q
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public d2ok ld6() {
        return new d2ok();
    }

    @Override // kotlinx.coroutines.flow.jk, kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return d2ok(this, t2, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.flow.jk
    public void f7l8() {
        synchronized (this) {
            m24219j(x9kr(), this.f37066z, x9kr(), m24217f());
            was wasVar = was.f36763k;
        }
    }

    @Override // kotlinx.coroutines.flow.d3, kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        return jp0y(this, interfaceC6618p, interfaceC6216q);
    }

    /* JADX INFO: renamed from: l */
    protected final T m24223l() {
        Object[] objArr = this.f37059h;
        kotlin.jvm.internal.d2ok.qrj(objArr);
        return (T) eqxt.m24083g(objArr, (this.f37060i + ((long) m24215c())) - 1);
    }

    /* JADX INFO: renamed from: m */
    public final long m24224m() {
        long j2 = this.f37060i;
        if (j2 < this.f37066z) {
            this.f37066z = j2;
        }
        return j2;
    }

    @Override // kotlinx.coroutines.flow.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public List<T> mo24079n() {
        synchronized (this) {
            int iM24215c = m24215c();
            if (iM24215c == 0) {
                return kotlin.collections.ni7.a9();
            }
            ArrayList arrayList = new ArrayList(iM24215c);
            Object[] objArr = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr);
            int i2 = 0;
            while (i2 < iM24215c) {
                int i3 = i2 + 1;
                arrayList.add(eqxt.m24083g(objArr, this.f37060i + ((long) i2)));
                i2 = i3;
            }
            return arrayList;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: o */
    public final InterfaceC6216q<was>[] m24225o(long j2) {
        long j3;
        AbstractC6587q[] abstractC6587qArr;
        if (j2 > this.f37066z) {
            return kotlinx.coroutines.flow.internal.zy.f37027k;
        }
        long jNcyb = ncyb();
        long j4 = ((long) this.f37064t) + jNcyb;
        long j5 = 1;
        if (this.f37063s == 0 && this.f37062r > 0) {
            j4++;
        }
        if (((kotlinx.coroutines.flow.internal.toq) this).f37024q != 0 && (abstractC6587qArr = ((kotlinx.coroutines.flow.internal.toq) this).f37022k) != null) {
            int length = abstractC6587qArr.length;
            int i2 = 0;
            while (i2 < length) {
                AbstractC6587q abstractC6587q = abstractC6587qArr[i2];
                i2++;
                if (abstractC6587q != null) {
                    long j6 = ((d2ok) abstractC6587q).f36945k;
                    if (j6 >= 0 && j6 < j4) {
                        j4 = j6;
                    }
                }
            }
        }
        if (j4 <= this.f37066z) {
            return kotlinx.coroutines.flow.internal.zy.f37027k;
        }
        long jX9kr = x9kr();
        int iMin = kja0() > 0 ? Math.min(this.f37062r, this.f37063s - ((int) (jX9kr - j4))) : this.f37062r;
        InterfaceC6216q<was>[] interfaceC6216qArr = kotlinx.coroutines.flow.internal.zy.f37027k;
        long j7 = ((long) this.f37062r) + jX9kr;
        if (iMin > 0) {
            interfaceC6216qArr = new InterfaceC6216q[iMin];
            Object[] objArr = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr);
            long j8 = jX9kr;
            int i3 = 0;
            while (true) {
                if (jX9kr >= j7) {
                    j3 = j4;
                    break;
                }
                long j9 = jX9kr + j5;
                Object objM24083g = eqxt.m24083g(objArr, jX9kr);
                C6679l c6679l = eqxt.f36949k;
                if (objM24083g == c6679l) {
                    jX9kr = j9;
                } else {
                    if (objM24083g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    C6617k c6617k = (C6617k) objM24083g;
                    int i4 = i3 + 1;
                    j3 = j4;
                    interfaceC6216qArr[i3] = c6617k.f37067g;
                    eqxt.m24087y(objArr, jX9kr, c6679l);
                    long j10 = j8;
                    eqxt.m24087y(objArr, j10, c6617k.f37069n);
                    j8 = j10 + 1;
                    if (i4 >= iMin) {
                        break;
                    }
                    i3 = i4;
                    jX9kr = j9;
                    j4 = j3;
                }
                j5 = 1;
            }
            jX9kr = j8;
        } else {
            j3 = j4;
        }
        int i5 = (int) (jX9kr - jNcyb);
        long j11 = kja0() == 0 ? jX9kr : j3;
        long jMax = Math.max(this.f37060i, jX9kr - ((long) Math.min(this.f37065y, i5)));
        if (this.f37063s == 0 && jMax < j7) {
            Object[] objArr2 = this.f37059h;
            kotlin.jvm.internal.d2ok.qrj(objArr2);
            if (kotlin.jvm.internal.d2ok.f7l8(eqxt.m24083g(objArr2, jMax), eqxt.f36949k)) {
                jX9kr++;
                jMax++;
            }
        }
        m24219j(jMax, j11, jX9kr, j7);
        fti();
        return (interfaceC6216qArr.length == 0) ^ true ? dd(interfaceC6216qArr) : interfaceC6216qArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.toq
    @InterfaceC7396q
    /* JADX INFO: renamed from: oc, reason: merged with bridge method [inline-methods] */
    public d2ok[] x2(int i2) {
        return new d2ok[i2];
    }

    @Override // kotlinx.coroutines.flow.internal.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public InterfaceC6622s<T> mo24089q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return eqxt.m24085n(this, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.jk
    public boolean toq(T t2) {
        int i2;
        boolean z2;
        InterfaceC6216q<was>[] interfaceC6216qArrDd = kotlinx.coroutines.flow.internal.zy.f37027k;
        synchronized (this) {
            i2 = 0;
            if (vyq(t2)) {
                interfaceC6216qArrDd = dd(interfaceC6216qArrDd);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        int length = interfaceC6216qArrDd.length;
        while (i2 < length) {
            InterfaceC6216q<was> interfaceC6216q = interfaceC6216qArrDd[i2];
            i2++;
            if (interfaceC6216q != null) {
                C6323o.k kVar = C6323o.Companion;
                interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
            }
        }
        return z2;
    }
}
