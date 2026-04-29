package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.util.hb;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.List;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.f */
/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\b9\u00102J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b3\u0010\u0017\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/flow/f;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/toq;", "Lkotlinx/coroutines/flow/lrht;", "Lkotlinx/coroutines/flow/a9;", "Lkotlinx/coroutines/flow/zy;", "Lkotlinx/coroutines/flow/internal/ki;", "", "expectedState", "newState", "", "fn3e", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", hb.f61276lvui, C7704k.y.toq.f95579toq, "value", "toq", "(Ljava/lang/Object;)Z", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "f7l8", "()V", "Lkotlinx/coroutines/flow/p;", "collector", "", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "ki", "()Lkotlinx/coroutines/flow/lrht;", "", "size", "", "t8r", "(I)[Lkotlinx/coroutines/flow/lrht;", "Lkotlin/coroutines/f7l8;", "context", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/s;", "q", "(Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)Lkotlinx/coroutines/flow/s;", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f28131g, "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "n", "()Ljava/util/List;", "replayCache", "initialState", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6562f<T> extends kotlinx.coroutines.flow.internal.toq<lrht> implements a9<T>, zy<T>, kotlinx.coroutines.flow.internal.ki<T> {

    @InterfaceC7396q
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: y */
    private int f36950y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.f$k */
    /* JADX INFO: compiled from: StateFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.StateFlowImpl", m22756f = "StateFlow.kt", m22757i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m22758l = {386, 398, 403}, m22759m = "collect", m22760n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m22761s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class k extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C6562f<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C6562f<T> c6562f, InterfaceC6216q<? super k> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = c6562f;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo5262k(null, this);
        }
    }

    public C6562f(@InterfaceC7396q Object obj) {
        this._state = obj;
    }

    private final boolean fn3e(Object obj, Object obj2) {
        int i2;
        lrht[] lrhtVarArrM24138h;
        m24138h();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !kotlin.jvm.internal.d2ok.f7l8(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.d2ok.f7l8(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i3 = this.f36950y;
            if ((i3 & 1) != 0) {
                this.f36950y = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f36950y = i4;
            lrht[] lrhtVarArrM24138h2 = m24138h();
            was wasVar = was.f36763k;
            while (true) {
                lrht[] lrhtVarArr = lrhtVarArrM24138h2;
                if (lrhtVarArr != null) {
                    int length = lrhtVarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        lrht lrhtVar = lrhtVarArr[i5];
                        i5++;
                        if (lrhtVar != null) {
                            lrhtVar.m24181g();
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f36950y;
                    if (i2 == i4) {
                        this.f36950y = i4 + 1;
                        return true;
                    }
                    lrhtVarArrM24138h = m24138h();
                    was wasVar2 = was.f36763k;
                }
                lrhtVarArrM24138h2 = lrhtVarArrM24138h;
                i4 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24088i() {
    }

    @Override // kotlinx.coroutines.flow.jk, kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        setValue(t2);
        return was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.jk
    public void f7l8() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.a9
    /* JADX INFO: renamed from: g */
    public boolean mo24069g(T t2, T t3) {
        if (t2 == null) {
            t2 = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
        }
        if (t3 == null) {
            t3 = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
        }
        return fn3e(t2, t3);
    }

    @Override // kotlinx.coroutines.flow.a9, kotlinx.coroutines.flow.hyr
    public T getValue() {
        C6679l c6679l = kotlinx.coroutines.flow.internal.fn3e.f36987k;
        T t2 = (T) this._state;
        if (t2 == c6679l) {
            return null;
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x00b0, B:41:0x00b6], limit reached: 58 */
    /* JADX WARN: Path cross not found for [B:41:0x00b6, B:39:0x00b0], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.q] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlinx.coroutines.flow.lrht] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.flow.p] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.d3, kotlinx.coroutines.flow.InterfaceC6622s
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r11, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6562f.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.toq
    @InterfaceC7396q
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public lrht ld6() {
        return new lrht();
    }

    @Override // kotlinx.coroutines.flow.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public List<T> mo24079n() {
        return kotlin.collections.zurt.ld6(getValue());
    }

    @Override // kotlinx.coroutines.flow.internal.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public InterfaceC6622s<T> mo24089q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return C6557c.m24073q(this, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.a9
    public void setValue(T t2) {
        if (t2 == null) {
            t2 = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
        }
        fn3e(null, t2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.toq
    @InterfaceC7396q
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public lrht[] x2(int i2) {
        return new lrht[i2];
    }

    @Override // kotlinx.coroutines.flow.jk
    public boolean toq(T t2) {
        setValue(t2);
        return true;
    }
}
