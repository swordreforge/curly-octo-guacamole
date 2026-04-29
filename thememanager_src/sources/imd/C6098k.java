package imd;

import kotlin.jvm.internal.d2ok;
import kotlin.text.kja0;
import kotlin.text.n7h;
import kotlin.text.qrj;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: imd.k */
/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "RegexExtensionsJDK8Kt")
public final class C6098k {
    @InterfaceC7395n
    @yz(version = "1.2")
    /* JADX INFO: renamed from: k */
    public static final qrj m22381k(@InterfaceC7396q n7h n7hVar, @InterfaceC7396q String name) {
        d2ok.m23075h(n7hVar, "<this>");
        d2ok.m23075h(name, "name");
        kja0 kja0Var = n7hVar instanceof kja0 ? (kja0) n7hVar : null;
        if (kja0Var != null) {
            return kja0Var.mo23511q(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
