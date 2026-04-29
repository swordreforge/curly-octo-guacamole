package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C6227f;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.nmn5;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010/\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010.\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u00100\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\"\u0014\u00103\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102\"\u001c\u00108\u001a\n 6*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102\"\u001c\u00109\u001a\n 6*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102*\f\b\u0000\u0010:\"\u00020\n2\u00020\n*\f\b\u0000\u0010;\"\u00020\u00122\u00020\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"", C0846k.d9i, "exception", AnimatedProperty.PROPERTY_NAME_H, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ki", "Lkotlin/coroutines/q;", "continuation", "cdj", "(Ljava/lang/Throwable;Lkotlin/coroutines/q;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kja0", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/n;)Ljava/lang/Throwable;", "t8r", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", C7704k.y.toq.f95579toq, "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/f;", "", "n", "(Ljava/lang/Throwable;)Lkotlin/f;", "recoveredStacktrace", "Lkotlin/was;", "x2", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "qrj", "(Ljava/lang/Throwable;Lkotlin/coroutines/q;)Ljava/lang/Object;", "i", "fn3e", "f7l8", "", "message", "q", "", "ld6", "methodName", "", C7704k.y.toq.f44691k, "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "e", AnimatedProperty.PROPERTY_NAME_Y, "p", "k", "Ljava/lang/String;", "baseContinuationImplClass", "toq", "stackTraceRecoveryClass", "kotlin.jvm.PlatformType", "zy", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ncyb {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f37230k = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: q */
    private static final String f37231q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f82024toq = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f82025zy;

    static {
        Object objM28280constructorimpl;
        Object objM28280constructorimpl2;
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(Class.forName("kotlin.coroutines.jvm.internal.k").getCanonicalName());
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        if (C6323o.m28283exceptionOrNullimpl(objM28280constructorimpl) != null) {
            objM28280constructorimpl = f37230k;
        }
        f82025zy = (String) objM28280constructorimpl;
        try {
            C6323o.k kVar3 = C6323o.Companion;
            objM28280constructorimpl2 = C6323o.m28280constructorimpl(ncyb.class.getCanonicalName());
        } catch (Throwable th2) {
            C6323o.k kVar4 = C6323o.Companion;
            objM28280constructorimpl2 = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
        }
        if (C6323o.m28283exceptionOrNullimpl(objM28280constructorimpl2) != null) {
            objM28280constructorimpl2 = f82024toq;
        }
        f37231q = (String) objM28280constructorimpl2;
    }

    @InterfaceC7396q
    public static final <E extends Throwable> E cdj(@InterfaceC7396q E e2, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> f7l8(InterfaceC6207n interfaceC6207n) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = interfaceC6207n.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            interfaceC6207n = interfaceC6207n.getCallerFrame();
            if (interfaceC6207n == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = interfaceC6207n.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    @InterfaceC7396q
    public static final <E extends Throwable> E fn3e(@InterfaceC7396q E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && kotlin.jvm.internal.d2ok.f7l8(e3.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                if (ld6(stackTraceElement)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return e3;
            }
        }
        return e2;
    }

    /* JADX INFO: renamed from: g */
    private static final <E extends Throwable> E m24374g(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m24380q("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int iM24381s = m24381s(stackTrace, f82025zy);
        int i2 = 0;
        if (iM24381s == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iM24381s];
        for (int i3 = 0; i3 < iM24381s; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i2 + iM24381s] = it.next();
            i2++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final <E extends Throwable> E m24375h(@InterfaceC7396q E e2) {
        return e2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final <E extends Throwable> E m24376i(@InterfaceC7396q E e2) {
        return e2;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24377k() {
    }

    private static final <E extends Throwable> E ki(E e2) {
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int iM24381s = m24381s(stackTrace, f37231q);
        int i2 = iM24381s + 1;
        int iM24381s2 = m24381s(stackTrace, f82025zy);
        int i3 = 0;
        int i4 = (length - iM24381s) - (iM24381s2 == -1 ? 0 : length - iM24381s2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? m24380q("Coroutine boundary") : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E kja0(E e2, InterfaceC6207n interfaceC6207n) {
        C6227f c6227fM24378n = m24378n(e2);
        Throwable th = (Throwable) c6227fM24378n.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c6227fM24378n.component2();
        Throwable thT8r = t8r(th);
        if (thT8r == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> arrayDequeF7l8 = f7l8(interfaceC6207n);
        if (arrayDequeF7l8.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            x2(stackTraceElementArr, arrayDequeF7l8);
        }
        return (E) m24374g(th, thT8r, arrayDequeF7l8);
    }

    public static final boolean ld6(@InterfaceC7396q StackTraceElement stackTraceElement) {
        return kotlin.text.a9.r6ty(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    /* JADX INFO: renamed from: n */
    private static final <E extends Throwable> C6227f<E, StackTraceElement[]> m24378n(E e2) {
        boolean z2;
        Throwable cause = e2.getCause();
        if (cause == null || !kotlin.jvm.internal.d2ok.f7l8(cause.getClass(), e2.getClass())) {
            return nmn5.m23230k(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            if (ld6(stackTraceElement)) {
                z2 = true;
                break;
            }
        }
        return z2 ? nmn5.m23230k(cause, stackTrace) : nmn5.m23230k(e2, new StackTraceElement[0]);
    }

    /* JADX INFO: renamed from: p */
    public static final void m24379p(@InterfaceC7396q Throwable th, @InterfaceC7396q Throwable th2) {
        th.initCause(th2);
    }

    @InterfaceC7396q
    @tfm
    /* JADX INFO: renamed from: q */
    public static final StackTraceElement m24380q(@InterfaceC7396q String str) {
        return new StackTraceElement(kotlin.jvm.internal.d2ok.mcp("\b\b\b(", str), "\b", "\b", -1);
    }

    /* JADX INFO: renamed from: s */
    private static final int m24381s(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (kotlin.jvm.internal.d2ok.f7l8(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    private static final <E extends Throwable> E t8r(E e2) {
        E e3 = (E) n7h.m24373y(e2);
        if (e3 == null) {
            return null;
        }
        if ((e2 instanceof kotlinx.coroutines.lvui) || kotlin.jvm.internal.d2ok.f7l8(e3.getMessage(), e2.getMessage())) {
            return e3;
        }
        return null;
    }

    public static /* synthetic */ void toq() {
    }

    private static final void x2(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            if (ld6(stackTraceElementArr[i2])) {
                break;
            } else {
                i2 = i3;
            }
        }
        int i4 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i4 > length2) {
            return;
        }
        while (true) {
            int i5 = length2 - 1;
            if (m24382y(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i4) {
                return;
            } else {
                length2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m24382y(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.d2ok.f7l8(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.d2ok.f7l8(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.d2ok.f7l8(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final Object n7h(Throwable th, InterfaceC6216q<?> interfaceC6216q) throws Throwable {
        throw th;
    }

    @InterfaceC7395n
    public static final Object qrj(@InterfaceC7396q Throwable th, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) throws Throwable {
        throw th;
    }
}
