package kotlinx.coroutines.flow.internal;

import kotlin.d3;
import kotlin.nn86;
import kotlinx.coroutines.flow.InterfaceC6618p;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0081\b¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/internal/k;", "Lkotlinx/coroutines/flow/p;", "owner", "Lkotlin/was;", "toq", "", "index", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class cdj {
    @nn86
    /* JADX INFO: renamed from: k */
    public static final int m24121k(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void toq(@InterfaceC7396q C6581k c6581k, @InterfaceC7396q InterfaceC6618p<?> interfaceC6618p) {
        if (c6581k.getOwner() != interfaceC6618p) {
            throw c6581k;
        }
    }
}
