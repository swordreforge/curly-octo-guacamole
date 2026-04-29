package kotlin;

import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class eqxt extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public eqxt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqxt(@InterfaceC7396q String message) {
        super(message);
        kotlin.jvm.internal.d2ok.m23075h(message, "message");
    }

    public /* synthetic */ eqxt(String str, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this((i2 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
