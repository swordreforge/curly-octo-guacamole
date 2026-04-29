package okio;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.n */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.ld6(message = "changed in Okio 2.x")
public final class C7567n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7567n f43801k = new C7567n();

    private C7567n() {
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    /* JADX INFO: renamed from: k */
    public final long m27806k(@InterfaceC7396q String string) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        return C7571o.x2(string, 0, 0, 3, null);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long toq(@InterfaceC7396q String string, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        return C7571o.ld6(string, i2, i3);
    }
}
