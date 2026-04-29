package okio;

import java.util.zip.Deflater;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC6769y(name = "-DeflaterSinkExtensions")
public final class toq {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final ki m27863k(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q Deflater deflater) {
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(deflater, "deflater");
        return new ki(vyqVar, deflater);
    }

    public static /* synthetic */ ki toq(vyq vyqVar, Deflater deflater, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(deflater, "deflater");
        return new ki(vyqVar, deflater);
    }
}
