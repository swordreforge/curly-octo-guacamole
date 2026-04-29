package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.was;
import kotlinx.coroutines.internal.hb;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u0010\u0013J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0086\b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0006H\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0001¢\u0006\u0004\b(\u0010\u001eR \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\nR\u0011\u00102\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lkotlinx/coroutines/internal/nn86;", "Lkotlinx/coroutines/internal/hb;", "", C0846k.zaso, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_H, "(I)V", "kja0", "", C7704k.y.toq.f44691k, "()[Lkotlinx/coroutines/internal/hb;", "j", "cdj", "(II)V", "q", "()V", AnimatedProperty.PROPERTY_NAME_Y, "()Lkotlinx/coroutines/internal/hb;", "qrj", "Lkotlin/Function1;", "", "predicate", "x2", "(Lcyoe/x2;)Lkotlinx/coroutines/internal/hb;", "node", "toq", "(Lkotlinx/coroutines/internal/hb;)V", "cond", "zy", "(Lkotlinx/coroutines/internal/hb;Lcyoe/x2;)Z", "p", "(Lkotlinx/coroutines/internal/hb;)Z", "n", "index", "ld6", "(I)Lkotlinx/coroutines/internal/hb;", "k", "[Lkotlinx/coroutines/internal/hb;", "a", "value", C7704k.y.toq.f95579toq, "()I", "n7h", "size", "f7l8", "()Z", "isEmpty", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public class nn86<T extends hb & Comparable<? super T>> {

    @InterfaceC7396q
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private T[] f37232k;

    private final void cdj(int i2, int i3) {
        T[] tArr = this.f37232k;
        kotlin.jvm.internal.d2ok.qrj(tArr);
        T t2 = tArr[i3];
        kotlin.jvm.internal.d2ok.qrj(t2);
        T t3 = tArr[i2];
        kotlin.jvm.internal.d2ok.qrj(t3);
        tArr[i2] = t2;
        tArr[i3] = t3;
        t2.setIndex(i2);
        t3.setIndex(i3);
    }

    /* JADX INFO: renamed from: h */
    private final void m24385h(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f37232k;
            kotlin.jvm.internal.d2ok.qrj(tArr);
            int i3 = (i2 - 1) / 2;
            T t2 = tArr[i3];
            kotlin.jvm.internal.d2ok.qrj(t2);
            T t3 = tArr[i2];
            kotlin.jvm.internal.d2ok.qrj(t3);
            if (((Comparable) t2).compareTo(t3) <= 0) {
                return;
            }
            cdj(i2, i3);
            i2 = i3;
        }
    }

    private final void kja0(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 >= m24387g()) {
                return;
            }
            T[] tArr = this.f37232k;
            kotlin.jvm.internal.d2ok.qrj(tArr);
            int i4 = i3 + 1;
            if (i4 < m24387g()) {
                T t2 = tArr[i4];
                kotlin.jvm.internal.d2ok.qrj(t2);
                T t3 = tArr[i3];
                kotlin.jvm.internal.d2ok.qrj(t3);
                if (((Comparable) t2).compareTo(t3) < 0) {
                    i3 = i4;
                }
            }
            T t4 = tArr[i2];
            kotlin.jvm.internal.d2ok.qrj(t4);
            T t5 = tArr[i3];
            kotlin.jvm.internal.d2ok.qrj(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            cdj(i2, i3);
            i2 = i3;
        }
    }

    private final void n7h(int i2) {
        this._size = i2;
    }

    /* JADX INFO: renamed from: s */
    private final T[] m24386s() {
        T[] tArr = this.f37232k;
        if (tArr == null) {
            T[] tArr2 = (T[]) new hb[4];
            this.f37232k = tArr2;
            return tArr2;
        }
        if (m24387g() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, m24387g() * 2);
        kotlin.jvm.internal.d2ok.kja0(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((hb[]) objArrCopyOf);
        this.f37232k = tArr3;
        return tArr3;
    }

    public final boolean f7l8() {
        return m24387g() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m24387g() {
        return this._size;
    }

    @kotlin.nn86
    /* JADX INFO: renamed from: k */
    public final void m24388k(@InterfaceC7396q T t2) {
        t2.toq(this);
        hb[] hbVarArrM24386s = m24386s();
        int iM24387g = m24387g();
        n7h(iM24387g + 1);
        hbVarArrM24386s[iM24387g] = t2;
        t2.setIndex(iM24387g);
        m24385h(iM24387g);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @kotlin.nn86
    @mub.InterfaceC7396q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T ld6(int r6) {
        /*
            r5 = this;
            T extends kotlinx.coroutines.internal.hb & java.lang.Comparable<? super T>[] r0 = r5.f37232k
            kotlin.jvm.internal.d2ok.qrj(r0)
            int r1 = r5.m24387g()
            r2 = -1
            int r1 = r1 + r2
            r5.n7h(r1)
            int r1 = r5.m24387g()
            if (r6 >= r1) goto L3d
            int r1 = r5.m24387g()
            r5.cdj(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.d2ok.qrj(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.d2ok.qrj(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.cdj(r6, r1)
            r5.m24385h(r1)
            goto L3d
        L3a:
            r5.kja0(r6)
        L3d:
            int r6 = r5.m24387g()
            r6 = r0[r6]
            kotlin.jvm.internal.d2ok.qrj(r6)
            r1 = 0
            r6.toq(r1)
            r6.setIndex(r2)
            int r2 = r5.m24387g()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.nn86.ld6(int):kotlinx.coroutines.internal.hb");
    }

    @kotlin.nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final T m24389n() {
        T[] tArr = this.f37232k;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24390p(@InterfaceC7396q T t2) {
        boolean z2;
        synchronized (this) {
            if (t2.mo23835q() == null) {
                z2 = false;
            } else {
                ld6(t2.getIndex());
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: q */
    public final void m24391q() {
        synchronized (this) {
            T[] tArr = this.f37232k;
            if (tArr != null) {
                kotlin.collections.kja0.b8(tArr, null, 0, 0, 6, null);
            }
            this._size = 0;
            was wasVar = was.f36763k;
        }
    }

    @InterfaceC7395n
    public final T qrj() {
        T t2;
        synchronized (this) {
            t2 = m24387g() > 0 ? (T) ld6(0) : null;
        }
        return t2;
    }

    public final void toq(@InterfaceC7396q T t2) {
        synchronized (this) {
            m24388k(t2);
            was wasVar = was.f36763k;
        }
    }

    @InterfaceC7395n
    public final T x2(@InterfaceC7396q cyoe.x2<? super T, Boolean> x2Var) {
        synchronized (this) {
            try {
                hb hbVarM24389n = m24389n();
                T t2 = null;
                if (hbVarM24389n == null) {
                    kotlin.jvm.internal.d3.m23090q(2);
                    kotlin.jvm.internal.d3.zy(2);
                    return null;
                }
                if (x2Var.invoke(hbVarM24389n).booleanValue()) {
                    t2 = (T) ld6(0);
                }
                kotlin.jvm.internal.d3.m23090q(1);
                kotlin.jvm.internal.d3.zy(1);
                return t2;
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final T m24392y() {
        T t2;
        synchronized (this) {
            t2 = (T) m24389n();
        }
        return t2;
    }

    public final boolean zy(@InterfaceC7396q T t2, @InterfaceC7396q cyoe.x2<? super T, Boolean> x2Var) {
        boolean z2;
        synchronized (this) {
            try {
                if (x2Var.invoke(m24389n()).booleanValue()) {
                    m24388k(t2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
        kotlin.jvm.internal.d3.zy(1);
        return z2;
    }
}
