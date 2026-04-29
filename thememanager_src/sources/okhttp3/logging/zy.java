package okhttp3.logging;

import java.io.EOFException;
import kotlin.jvm.internal.d2ok;
import kotlin.ranges.fn3e;
import mub.InterfaceC7396q;
import okio.x2;

/* JADX INFO: compiled from: utf8.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zy {
    /* JADX INFO: renamed from: k */
    public static final boolean m27365k(@InterfaceC7396q x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        try {
            x2 x2Var2 = new x2();
            x2Var.yz(x2Var2, 0L, fn3e.mcp(x2Var.size(), 64L));
            for (int i2 = 0; i2 < 16; i2++) {
                if (x2Var2.py()) {
                    return true;
                }
                int iZkd = x2Var2.zkd();
                if (Character.isISOControl(iZkd) && !Character.isWhitespace(iZkd)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
