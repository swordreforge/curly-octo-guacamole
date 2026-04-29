package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.util.yz;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.was;
import kotlinx.coroutines.channels.AbstractC6500k;
import kotlinx.coroutines.channels.zy;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6687o;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.y */
/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020(\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u00108\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010?\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00107R\u0014\u0010E\u001a\u00020B8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006K"}, d2 = {"Lkotlinx/coroutines/channels/y;", C0846k.d9i, "Lkotlinx/coroutines/channels/k;", "", "currentSize", "Lkotlinx/coroutines/internal/l;", "bo", "(I)Lkotlinx/coroutines/internal/l;", "element", "Lkotlin/was;", "t8iq", "(ILjava/lang/Object;)V", "u", "(I)V", "", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "select", "dd", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/d2ok;", InterfaceC1925p.pnh, AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/channels/d2ok;)Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "zp", "(Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/gvn7;", "receive", "", "j", "(Lkotlinx/coroutines/channels/gvn7;)Z", "wasClosed", "b", "(Z)V", C7704k.y.toq.f95579toq, com.market.sdk.reflect.toq.f28131g, "capacity", "Lkotlinx/coroutines/channels/qrj;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", C7704k.y.toq.f44691k, "Ljava/util/concurrent/locks/ReentrantLock;", yz.xk5, "", "p", "[Ljava/lang/Object;", "buffer", C3678q.f65826kja0, "ek5k", "()Z", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", "isEmpty", "toq", "isClosedForReceive", "", "cdj", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", C4991s.f28129n, "(ILkotlinx/coroutines/channels/qrj;Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class C6516y<E> extends AbstractC6500k<E> {

    /* JADX INFO: renamed from: g */
    private final int f36861g;

    /* JADX INFO: renamed from: h */
    private int f36862h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private Object[] f36863p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final ReentrantLock f36864s;

    @InterfaceC7396q
    private volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final qrj f36865y;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.y$k */
    /* JADX INFO: compiled from: ArrayChannel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36866k;

        static {
            int[] iArr = new int[qrj.values().length];
            iArr[qrj.SUSPEND.ordinal()] = 1;
            iArr[qrj.DROP_LATEST.ordinal()] = 2;
            iArr[qrj.DROP_OLDEST.ordinal()] = 3;
            f36866k = iArr;
        }
    }

    public C6516y(int i2, @InterfaceC7396q qrj qrjVar, @InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        super(x2Var);
        this.f36861g = i2;
        this.f36865y = qrjVar;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f36864s = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        kotlin.collections.kja0.b8(objArr, toq.f81966zy, 0, 0, 6, null);
        this.f36863p = objArr;
        this.size = 0;
    }

    private final C6679l bo(int i2) {
        if (i2 < this.f36861g) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = k.f36866k[this.f36865y.ordinal()];
        if (i3 == 1) {
            return toq.f36855n;
        }
        if (i3 == 2) {
            return toq.f36856q;
        }
        if (i3 == 3) {
            return null;
        }
        throw new kotlin.oc();
    }

    private final void t8iq(int i2, E e2) {
        if (i2 < this.f36861g) {
            m23970u(i2);
            Object[] objArr = this.f36863p;
            objArr[(this.f36862h + i2) % objArr.length] = e2;
        } else {
            Object[] objArr2 = this.f36863p;
            int i3 = this.f36862h;
            objArr2[i3 % objArr2.length] = null;
            objArr2[(i2 + i3) % objArr2.length] = e2;
            this.f36862h = (i3 + 1) % objArr2.length;
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m23970u(int i2) {
        Object[] objArr = this.f36863p;
        if (i2 >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.f36861g);
            Object[] objArr2 = new Object[iMin];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f36863p;
                objArr2[i3] = objArr3[(this.f36862h + i3) % objArr3.length];
            }
            kotlin.collections.kja0.vy(objArr2, toq.f81966zy, i2, iMin);
            this.f36863p = objArr2;
            this.f36862h = 0;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    @InterfaceC7395n
    /* JADX INFO: renamed from: a */
    protected Object mo23879a() {
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object objM23995i = m23995i();
                if (objM23995i == null) {
                    objM23995i = toq.f36853g;
                }
                return objM23995i;
            }
            Object[] objArr = this.f36863p;
            int i3 = this.f36862h;
            Object obj = objArr[i3];
            d2ok d2okVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object objMo23860b = toq.f36853g;
            boolean z2 = false;
            if (i2 == this.f36861g) {
                d2ok d2okVar2 = null;
                while (true) {
                    d2ok d2okVarM23994f = m23994f();
                    if (d2okVarM23994f == null) {
                        d2okVar = d2okVar2;
                        break;
                    }
                    if (d2okVarM23994f.i1(null) != null) {
                        objMo23860b = d2okVarM23994f.mo23860b();
                        z2 = true;
                        d2okVar = d2okVarM23994f;
                        break;
                    }
                    d2okVarM23994f.a98o();
                    d2okVar2 = d2okVarM23994f;
                }
            }
            if (objMo23860b != toq.f36853g && !(objMo23860b instanceof ni7)) {
                this.size = i2;
                Object[] objArr2 = this.f36863p;
                objArr2[(this.f36862h + i2) % objArr2.length] = objMo23860b;
            }
            this.f36862h = (this.f36862h + 1) % this.f36863p.length;
            was wasVar = was.f36763k;
            if (z2) {
                kotlin.jvm.internal.d2ok.qrj(d2okVar);
                d2okVar.y9n();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    /* JADX INFO: renamed from: b */
    protected void mo23899b(boolean z2) {
        cyoe.x2<E, was> x2Var = this.f36868k;
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            C6687o c6687oZy = null;
            int i3 = 0;
            while (i3 < i2) {
                i3++;
                Object obj = this.f36863p[this.f36862h];
                if (x2Var != null && obj != toq.f81966zy) {
                    c6687oZy = kotlinx.coroutines.internal.d3.zy(x2Var, obj, c6687oZy);
                }
                Object[] objArr = this.f36863p;
                int i4 = this.f36862h;
                objArr[i4] = toq.f81966zy;
                this.f36862h = (i4 + 1) % objArr.length;
            }
            this.size = 0;
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            super.mo23899b(z2);
            if (c6687oZy != null) {
                throw c6687oZy;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected String cdj() {
        return "(buffer:capacity=" + this.f36861g + ",size=" + this.size + ')';
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean d2ok() {
        return this.size == this.f36861g && this.f36865y == qrj.SUSPEND;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected Object dd(E e2, @InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        Object objFu4;
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            C6679l c6679lBo = bo(i2);
            if (c6679lBo != null) {
                return c6679lBo;
            }
            if (i2 == 0) {
                do {
                    zy.C6532q<E> c6532qKja0 = kja0(e2);
                    objFu4 = interfaceC6720g.fu4(c6532qKja0);
                    if (objFu4 == null) {
                        this.size = i2;
                        oc<? super E> ocVarKja0 = c6532qKja0.kja0();
                        was wasVar = was.f36763k;
                        reentrantLock.unlock();
                        kotlin.jvm.internal.d2ok.qrj(ocVarKja0);
                        oc<? super E> ocVar = ocVarKja0;
                        ocVar.mo23908y(e2);
                        return ocVar.mo23891q();
                    }
                    if (objFu4 == toq.f36855n) {
                    }
                } while (objFu4 == kotlinx.coroutines.internal.zy.f82050toq);
                if (objFu4 != kotlinx.coroutines.selects.f7l8.m24562q() && !(objFu4 instanceof ni7)) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("performAtomicTrySelect(describeTryOffer) returned ", objFu4).toString());
                }
                this.size = i2;
                return objFu4;
            }
            if (interfaceC6720g.ki()) {
                t8iq(i2, e2);
                return toq.f36856q;
            }
            this.size = i2;
            return kotlinx.coroutines.selects.f7l8.m24562q();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean ek5k() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean eqxt() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    protected Object mo23971h(@InterfaceC7396q d2ok d2okVar) {
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            return super.mo23971h(d2okVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k, kotlinx.coroutines.channels.d3
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            return y9n();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    /* JADX INFO: renamed from: j */
    protected boolean mo23901j(@InterfaceC7396q gvn7<? super E> gvn7Var) {
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            return super.mo23901j(gvn7Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    protected Object mo23878r(E e2) {
        oc<E> ocVarHyr;
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            C6679l c6679lBo = bo(i2);
            if (c6679lBo != null) {
                return c6679lBo;
            }
            if (i2 == 0) {
                do {
                    ocVarHyr = hyr();
                    if (ocVarHyr != null) {
                        if (ocVarHyr instanceof ni7) {
                            this.size = i2;
                            return ocVarHyr;
                        }
                    }
                } while (ocVarHyr.mo23909z(e2, null) == null);
                this.size = i2;
                was wasVar = was.f36763k;
                reentrantLock.unlock();
                ocVarHyr.mo23908y(e2);
                return ocVarHyr.mo23891q();
            }
            t8iq(i2, e2);
            return toq.f36856q;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k, kotlinx.coroutines.channels.d3
    public boolean toq() {
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            return super.toq();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean yz() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    @InterfaceC7395n
    protected Object zp(@InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        boolean z2;
        ReentrantLock reentrantLock = this.f36864s;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object objM23995i = m23995i();
                if (objM23995i == null) {
                    objM23995i = toq.f36853g;
                }
                return objM23995i;
            }
            Object[] objArr = this.f36863p;
            int i3 = this.f36862h;
            Object obj = objArr[i3];
            Object objKja0 = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object objMo23860b = toq.f36853g;
            if (i2 == this.f36861g) {
                while (true) {
                    AbstractC6500k.f7l8<E> f7l8VarNn86 = nn86();
                    Object objFu4 = interfaceC6720g.fu4(f7l8VarNn86);
                    if (objFu4 == null) {
                        objKja0 = f7l8VarNn86.kja0();
                        kotlin.jvm.internal.d2ok.qrj(objKja0);
                        objMo23860b = ((d2ok) objKja0).mo23860b();
                        z2 = true;
                        break;
                    }
                    if (objFu4 == toq.f36853g) {
                        break;
                    }
                    if (objFu4 != kotlinx.coroutines.internal.zy.f82050toq) {
                        if (objFu4 == kotlinx.coroutines.selects.f7l8.m24562q()) {
                            this.size = i2;
                            this.f36863p[this.f36862h] = obj;
                            return objFu4;
                        }
                        if (!(objFu4 instanceof ni7)) {
                            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("performAtomicTrySelect(describeTryOffer) returned ", objFu4).toString());
                        }
                        z2 = true;
                        objMo23860b = objFu4;
                        objKja0 = objMo23860b;
                    }
                }
            } else {
                z2 = false;
            }
            if (objMo23860b != toq.f36853g && !(objMo23860b instanceof ni7)) {
                this.size = i2;
                Object[] objArr2 = this.f36863p;
                objArr2[(this.f36862h + i2) % objArr2.length] = objMo23860b;
            } else if (!interfaceC6720g.ki()) {
                this.size = i2;
                this.f36863p[this.f36862h] = obj;
                return kotlinx.coroutines.selects.f7l8.m24562q();
            }
            this.f36862h = (this.f36862h + 1) % this.f36863p.length;
            was wasVar = was.f36763k;
            if (z2) {
                kotlin.jvm.internal.d2ok.qrj(objKja0);
                ((d2ok) objKja0).y9n();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
