package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class zy implements InterfaceC6216q<Object> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f36257k = new zy();

    private zy() {
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @InterfaceC7396q
    public String toString() {
        return "This continuation is already complete";
    }
}
