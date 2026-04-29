package kotlinx.coroutines;

import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.e */
/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlin/coroutines/q;", "", "zy", "", "toq", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "k", "classSimpleName", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6551e {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final String m24040k(@InterfaceC7396q Object obj) {
        return obj.getClass().getSimpleName();
    }

    @InterfaceC7396q
    public static final String toq(@InterfaceC7396q Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @InterfaceC7396q
    public static final String zy(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        Object objM28280constructorimpl;
        if (interfaceC6216q instanceof kotlinx.coroutines.internal.x2) {
            return interfaceC6216q.toString();
        }
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(interfaceC6216q + '@' + toq(interfaceC6216q));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        if (C6323o.m28283exceptionOrNullimpl(objM28280constructorimpl) != null) {
            objM28280constructorimpl = ((Object) interfaceC6216q.getClass().getName()) + '@' + toq(interfaceC6216q);
        }
        return (String) objM28280constructorimpl;
    }
}
