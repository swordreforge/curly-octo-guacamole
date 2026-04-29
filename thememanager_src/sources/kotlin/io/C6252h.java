package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.h */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6252h extends kja0 {
    @InterfaceC7396q
    public static final ld6 d2ok(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        return oc(file, x2.BOTTOM_UP);
    }

    public static /* synthetic */ ld6 eqxt(File file, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            x2Var = x2.TOP_DOWN;
        }
        return oc(file, x2Var);
    }

    @InterfaceC7396q
    public static final ld6 lvui(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        return oc(file, x2.TOP_DOWN);
    }

    @InterfaceC7396q
    public static final ld6 oc(@InterfaceC7396q File file, @InterfaceC7396q x2 direction) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(direction, "direction");
        return new ld6(file, direction);
    }
}
