package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.util.yz;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.was;
import kotlinx.coroutines.channels.zy;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6687o;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ConflatedChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010,j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Lkotlinx/coroutines/channels/wvg;", C0846k.d9i, "Lkotlinx/coroutines/channels/k;", "", "element", "Lkotlinx/coroutines/internal/o;", "t8iq", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "select", "dd", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "a", "zp", "", "wasClosed", "Lkotlin/was;", "b", "Lkotlinx/coroutines/channels/gvn7;", "receive", "j", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", C7704k.y.toq.f95579toq, "Ljava/util/concurrent/locks/ReentrantLock;", yz.xk5, AnimatedProperty.PROPERTY_NAME_Y, "Ljava/lang/Object;", "value", "ek5k", "()Z", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", "isEmpty", "", "cdj", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", C4991s.f28129n, "(Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class wvg<E> extends AbstractC6500k<E> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ReentrantLock f36858g;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private Object f36859y;

    public wvg(@InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        super(x2Var);
        this.f36858g = new ReentrantLock();
        this.f36859y = toq.f81966zy;
    }

    private final C6687o t8iq(Object obj) {
        cyoe.x2<E, was> x2Var;
        Object obj2 = this.f36859y;
        C6687o c6687oM24326q = null;
        if (obj2 != toq.f81966zy && (x2Var = this.f36868k) != null) {
            c6687oM24326q = kotlinx.coroutines.internal.d3.m24326q(x2Var, obj2, null, 2, null);
        }
        this.f36859y = obj;
        return c6687oM24326q;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    @InterfaceC7395n
    /* JADX INFO: renamed from: a */
    protected Object mo23879a() {
        ReentrantLock reentrantLock = this.f36858g;
        reentrantLock.lock();
        try {
            Object obj = this.f36859y;
            C6679l c6679l = toq.f81966zy;
            if (obj != c6679l) {
                this.f36859y = c6679l;
                was wasVar = was.f36763k;
                return obj;
            }
            Object objM23995i = m23995i();
            if (objM23995i == null) {
                objM23995i = toq.f36853g;
            }
            return objM23995i;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    /* JADX INFO: renamed from: b */
    protected void mo23899b(boolean z2) {
        ReentrantLock reentrantLock = this.f36858g;
        reentrantLock.lock();
        try {
            C6687o c6687oT8iq = t8iq(toq.f81966zy);
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            super.mo23899b(z2);
            if (c6687oT8iq != null) {
                throw c6687oT8iq;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected String cdj() {
        return "(value=" + this.f36859y + ')';
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean d2ok() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected Object dd(E e2, @InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        Object objFu4;
        ReentrantLock reentrantLock = this.f36858g;
        reentrantLock.lock();
        try {
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            if (this.f36859y == toq.f81966zy) {
                do {
                    zy.C6532q<E> c6532qKja0 = kja0(e2);
                    objFu4 = interfaceC6720g.fu4(c6532qKja0);
                    if (objFu4 == null) {
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
                return objFu4;
            }
            if (!interfaceC6720g.ki()) {
                return kotlinx.coroutines.selects.f7l8.m24562q();
            }
            C6687o c6687oT8iq = t8iq(e2);
            if (c6687oT8iq == null) {
                return toq.f36856q;
            }
            throw c6687oT8iq;
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

    @Override // kotlinx.coroutines.channels.AbstractC6500k, kotlinx.coroutines.channels.d3
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f36858g;
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
        ReentrantLock reentrantLock = this.f36858g;
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
        ReentrantLock reentrantLock = this.f36858g;
        reentrantLock.lock();
        try {
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            if (this.f36859y == toq.f81966zy) {
                do {
                    ocVarHyr = hyr();
                    if (ocVarHyr != null) {
                        if (ocVarHyr instanceof ni7) {
                            return ocVarHyr;
                        }
                    }
                } while (ocVarHyr.mo23909z(e2, null) == null);
                was wasVar = was.f36763k;
                reentrantLock.unlock();
                ocVarHyr.mo23908y(e2);
                return ocVarHyr.mo23891q();
            }
            C6687o c6687oT8iq = t8iq(e2);
            if (c6687oT8iq == null) {
                return toq.f36856q;
            }
            throw c6687oT8iq;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean yz() {
        return this.f36859y == toq.f81966zy;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    @InterfaceC7395n
    protected Object zp(@InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        ReentrantLock reentrantLock = this.f36858g;
        reentrantLock.lock();
        try {
            Object obj = this.f36859y;
            C6679l c6679l = toq.f81966zy;
            if (obj == c6679l) {
                Object objM23995i = m23995i();
                if (objM23995i == null) {
                    objM23995i = toq.f36853g;
                }
                return objM23995i;
            }
            if (!interfaceC6720g.ki()) {
                return kotlinx.coroutines.selects.f7l8.m24562q();
            }
            Object obj2 = this.f36859y;
            this.f36859y = c6679l;
            was wasVar = was.f36763k;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
