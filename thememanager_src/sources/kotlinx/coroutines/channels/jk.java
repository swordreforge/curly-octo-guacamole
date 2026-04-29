package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.ArrayList;
import kotlin.was;
import kotlinx.coroutines.channels.zy;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6687o;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/jk;", C0846k.d9i, "Lkotlinx/coroutines/channels/k;", "element", "", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "select", "dd", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/cdj;", "Lkotlinx/coroutines/channels/d2ok;", "list", "Lkotlinx/coroutines/channels/ni7;", "closed", "Lkotlin/was;", "bf2", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ni7;)V", "", "ek5k", "()Z", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", C4991s.f28129n, "(Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class jk<E> extends AbstractC6500k<E> {
    public jk(@InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        super(x2Var);
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected void bf2(@InterfaceC7396q Object obj, @InterfaceC7396q ni7<?> ni7Var) {
        C6687o c6687oZy = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    C6687o c6687oZy2 = null;
                    while (true) {
                        int i2 = size - 1;
                        d2ok d2okVar = (d2ok) arrayList.get(size);
                        if (d2okVar instanceof zy.C6530k) {
                            cyoe.x2<E, was> x2Var = this.f36868k;
                            c6687oZy2 = x2Var == null ? null : kotlinx.coroutines.internal.d3.zy(x2Var, ((zy.C6530k) d2okVar).f36871g, c6687oZy2);
                        } else {
                            d2okVar.bf2(ni7Var);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                    c6687oZy = c6687oZy2;
                }
            } else {
                d2ok d2okVar2 = (d2ok) obj;
                if (d2okVar2 instanceof zy.C6530k) {
                    cyoe.x2<E, was> x2Var2 = this.f36868k;
                    if (x2Var2 != null) {
                        c6687oZy = kotlinx.coroutines.internal.d3.zy(x2Var2, ((zy.C6530k) d2okVar2).f36871g, null);
                    }
                } else {
                    d2okVar2.bf2(ni7Var);
                }
            }
        }
        if (c6687oZy != null) {
            throw c6687oZy;
        }
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean d2ok() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected Object dd(E e2, @InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        Object objFu4;
        while (true) {
            if (m23902m()) {
                objFu4 = super.dd(e2, interfaceC6720g);
            } else {
                objFu4 = interfaceC6720g.fu4(n7h(e2));
                if (objFu4 == null) {
                    objFu4 = toq.f36856q;
                }
            }
            if (objFu4 == kotlinx.coroutines.selects.f7l8.m24562q()) {
                return kotlinx.coroutines.selects.f7l8.m24562q();
            }
            C6679l c6679l = toq.f36856q;
            if (objFu4 == c6679l) {
                return c6679l;
            }
            if (objFu4 != toq.f36855n && objFu4 != kotlinx.coroutines.internal.zy.f82050toq) {
                if (objFu4 instanceof ni7) {
                    return objFu4;
                }
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid result ", objFu4).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean ek5k() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean eqxt() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    protected Object mo23878r(E e2) {
        oc<?> ocVarM23996l;
        do {
            Object objMo23878r = super.mo23878r(e2);
            C6679l c6679l = toq.f36856q;
            if (objMo23878r == c6679l) {
                return c6679l;
            }
            if (objMo23878r != toq.f36855n) {
                if (objMo23878r instanceof ni7) {
                    return objMo23878r;
                }
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid offerInternal result ", objMo23878r).toString());
            }
            ocVarM23996l = m23996l(e2);
            if (ocVarM23996l == null) {
                return c6679l;
            }
        } while (!(ocVarM23996l instanceof ni7));
        return ocVarM23996l;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean yz() {
        return true;
    }
}
