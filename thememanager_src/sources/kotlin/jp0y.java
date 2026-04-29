package kotlin;

import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes3.dex */
class jp0y extends fti {
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> jk<T> m23033n(T t2) {
        return new fu4(t2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final <T> T m23034q(jk<? extends T> jkVar, Object obj, kotlin.reflect.kja0<?> property) {
        kotlin.jvm.internal.d2ok.m23075h(jkVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        return jkVar.getValue();
    }
}
