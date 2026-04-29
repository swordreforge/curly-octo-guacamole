package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.n */
/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/n;", C0846k.zaso, "", "", "toq", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/j;", "k", "[Lkotlinx/coroutines/j;", "deferreds", C4991s.f28129n, "([Lkotlinx/coroutines/j;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6701n<T> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f82054toq = AtomicIntegerFieldUpdater.newUpdater(C6701n.class, "notCompletedCount");

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6695j<T>[] f37294k;

    @InterfaceC7396q
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: renamed from: kotlinx.coroutines.n$k */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/n$k;", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/cdj;", "", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/cdj;", "continuation", "Lkotlinx/coroutines/ch;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/ch;", "a98o", "()Lkotlinx/coroutines/ch;", "zp", "(Lkotlinx/coroutines/ch;)V", "handle", "Lkotlinx/coroutines/n$toq;", "Lkotlinx/coroutines/n;", "value", "i1", "()Lkotlinx/coroutines/n$toq;", "a", "(Lkotlinx/coroutines/n$toq;)V", "disposer", C4991s.f28129n, "(Lkotlinx/coroutines/n;Lkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class k extends v0af {

        @InterfaceC7396q
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX INFO: renamed from: s */
        public ch f37296s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private final cdj<List<? extends T>> f37297y;

        /* JADX WARN: Multi-variable type inference failed */
        public k(@InterfaceC7396q cdj<? super List<? extends T>> cdjVar) {
            this.f37297y = cdjVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m24506a(@InterfaceC7395n C6701n<T>.toq toqVar) {
            this._disposer = toqVar;
        }

        @InterfaceC7396q
        public final ch a98o() {
            ch chVar = this.f37296s;
            if (chVar != null) {
                return chVar;
            }
            kotlin.jvm.internal.d2ok.n5r1("handle");
            return null;
        }

        @InterfaceC7395n
        public final C6701n<T>.toq i1() {
            return (toq) this._disposer;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
            y9n(th);
            return kotlin.was.f36763k;
        }

        @Override // kotlinx.coroutines.jp0y
        public void y9n(@InterfaceC7395n Throwable th) {
            if (th != null) {
                Object objKja0 = this.f37297y.kja0(th);
                if (objKja0 != null) {
                    this.f37297y.mo23848r(objKja0);
                    C6701n<T>.toq toqVarI1 = i1();
                    if (toqVarI1 == null) {
                        return;
                    }
                    toqVarI1.toq();
                    return;
                }
                return;
            }
            if (C6701n.f82054toq.decrementAndGet(C6701n.this) == 0) {
                cdj<List<? extends T>> cdjVar = this.f37297y;
                C6323o.k kVar = C6323o.Companion;
                InterfaceC6695j[] interfaceC6695jArr = ((C6701n) C6701n.this).f37294k;
                ArrayList arrayList = new ArrayList(interfaceC6695jArr.length);
                int i2 = 0;
                int length = interfaceC6695jArr.length;
                while (i2 < length) {
                    InterfaceC6695j interfaceC6695j = interfaceC6695jArr[i2];
                    i2++;
                    arrayList.add(interfaceC6695j.mo24457h());
                }
                cdjVar.resumeWith(C6323o.m28280constructorimpl(arrayList));
            }
        }

        public final void zp(@InterfaceC7396q ch chVar) {
            this.f37296s = chVar;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.n$toq */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/n$toq;", "Lkotlinx/coroutines/kja0;", "Lkotlin/was;", "toq", "", "cause", "k", "", "toString", "", "Lkotlinx/coroutines/n$k;", "Lkotlinx/coroutines/n;", "[Lkotlinx/coroutines/n$k;", "nodes", C4991s.f28129n, "(Lkotlinx/coroutines/n;[Lkotlinx/coroutines/n$k;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class toq extends kja0 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C6701n<T>.k[] f37298k;

        public toq(@InterfaceC7396q C6701n<T>.k[] kVarArr) {
            this.f37298k = kVarArr;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
            mo23837k(th);
            return kotlin.was.f36763k;
        }

        @Override // kotlinx.coroutines.AbstractC6666h
        /* JADX INFO: renamed from: k */
        public void mo23837k(@InterfaceC7395n Throwable th) {
            toq();
        }

        @InterfaceC7396q
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f37298k + ']';
        }

        public final void toq() {
            C6701n<T>.k[] kVarArr = this.f37298k;
            int length = kVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C6701n<T>.k kVar = kVarArr[i2];
                i2++;
                kVar.a98o().zy();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6701n(@InterfaceC7396q InterfaceC6695j<? extends T>[] interfaceC6695jArr) {
        this.f37294k = interfaceC6695jArr;
        this.notCompletedCount = interfaceC6695jArr.length;
    }

    @InterfaceC7395n
    public final Object toq(@InterfaceC7396q InterfaceC6216q<? super List<? extends T>> interfaceC6216q) {
        ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        int length = this.f37294k.length;
        k[] kVarArr = new k[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            InterfaceC6695j interfaceC6695j = this.f37294k[i3];
            interfaceC6695j.start();
            k kVar = new k(kiVar);
            kVar.zp(interfaceC6695j.yz(kVar));
            kotlin.was wasVar = kotlin.was.f36763k;
            kVarArr[i3] = kVar;
        }
        C6701n<T>.toq toqVar = new toq(kVarArr);
        while (i2 < length) {
            k kVar2 = kVarArr[i2];
            i2++;
            kVar2.m24506a(toqVar);
        }
        if (kiVar.mo23847p()) {
            toqVar.toq();
        } else {
            kiVar.ni7(toqVar);
        }
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }
}
