package okio;

import java.util.zip.Inflater;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.y */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC6769y(name = "-InflaterSourceExtensions")
public final class C7578y {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final a9 m27878k(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q Inflater inflater) {
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
        return new a9(nn86Var, inflater);
    }

    public static /* synthetic */ a9 toq(nn86 nn86Var, Inflater inflater, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
        return new a9(nn86Var, inflater);
    }
}
