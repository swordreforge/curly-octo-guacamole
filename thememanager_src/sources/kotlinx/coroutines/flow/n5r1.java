package kotlinx.coroutines.flow;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import java.util.List;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/n5r1;", "Lkotlinx/coroutines/flow/dd;", "Lkotlinx/coroutines/flow/hyr;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/lvui;", "k", "", "toString", "", C2690k.k.f61039ld6, "", "equals", "hashCode", "", "toq", com.market.sdk.reflect.toq.f68928f7l8, "stopTimeout", "zy", "replayExpiration", C4991s.f28129n, "(JJ)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class n5r1 implements dd {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f81993toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f81994zy;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.n5r1$k */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m22756f = "SharingStarted.kt", m22757i = {1, 2, 3}, m22758l = {178, 180, 182, 183, 185}, m22759m = "invokeSuspend", m22760n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m22761s = {"L$0", "L$0", "L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/flow/lvui;", "", "count", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6607k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super lvui>, Integer, InterfaceC6216q<? super was>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        C6607k(InterfaceC6216q<? super C6607k> interfaceC6216q) {
            super(3, interfaceC6216q);
        }

        @Override // cyoe.cdj
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC6618p<? super lvui> interfaceC6618p, Integer num, InterfaceC6216q<? super was> interfaceC6216q) {
            return invoke(interfaceC6618p, num.intValue(), interfaceC6216q);
        }

        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super lvui> interfaceC6618p, int i2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            C6607k c6607k = n5r1.this.new C6607k(interfaceC6216q);
            c6607k.L$0 = interfaceC6618p;
            c6607k.I$0 = i2;
            return c6607k.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r10)
                goto L64
            L38:
                kotlin.C6318m.n7h(r10)
                goto L9c
            L3c:
                kotlin.C6318m.n7h(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                int r10 = r9.I$0
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.lvui r10 = kotlinx.coroutines.flow.lvui.START
                r9.label = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                kotlinx.coroutines.flow.n5r1 r10 = kotlinx.coroutines.flow.n5r1.this
                long r6 = kotlinx.coroutines.flow.n5r1.zy(r10)
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.ek5k.toq(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.n5r1 r10 = kotlinx.coroutines.flow.n5r1.this
                long r5 = kotlinx.coroutines.flow.n5r1.toq(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.lvui r10 = kotlinx.coroutines.flow.lvui.STOP
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                kotlinx.coroutines.flow.n5r1 r10 = kotlinx.coroutines.flow.n5r1.this
                long r4 = kotlinx.coroutines.flow.n5r1.toq(r10)
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.ek5k.toq(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                kotlinx.coroutines.flow.lvui r10 = kotlinx.coroutines.flow.lvui.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                kotlin.was r10 = kotlin.was.f36763k
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n5r1.C6607k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: SharingStarted.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m22756f = "SharingStarted.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/lvui;", "it", "", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<lvui, InterfaceC6216q<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q lvui lvuiVar, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((toq) create(lvuiVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return kotlin.coroutines.jvm.internal.toq.m22766k(((lvui) this.L$0) != lvui.START);
        }
    }

    public n5r1(long j2, long j3) {
        this.f81993toq = j2;
        this.f81994zy = j3;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        }
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof n5r1) {
            n5r1 n5r1Var = (n5r1) obj;
            if (this.f81993toq == n5r1Var.f81993toq && this.f81994zy == n5r1Var.f81994zy) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f81993toq) * 31) + Long.hashCode(this.f81994zy);
    }

    @Override // kotlinx.coroutines.flow.dd
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC6622s<lvui> mo24080k(@InterfaceC7396q hyr<Integer> hyrVar) {
        return ld6.yz(ld6.i1(ld6.m24177w(hyrVar, new C6607k(null)), new toq(null)));
    }

    @InterfaceC7396q
    public String toString() {
        List listM22676p = kotlin.collections.zurt.m22676p(2);
        if (this.f81993toq > 0) {
            listM22676p.add("stopTimeout=" + this.f81993toq + "ms");
        }
        if (this.f81994zy < Long.MAX_VALUE) {
            listM22676p.add("replayExpiration=" + this.f81994zy + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kotlin.collections.a9.uo(kotlin.collections.zurt.m22674k(listM22676p), null, null, null, 0, null, null, 63, null) + ')';
    }
}
