package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "CharsetsKt")
public final class f7l8 {
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final Charset m23523k(String charsetName) {
        kotlin.jvm.internal.d2ok.m23075h(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        kotlin.jvm.internal.d2ok.kja0(charsetForName, "forName(charsetName)");
        return charsetForName;
    }
}
