package miuix.internal.util;

import miuix.device.C7106k;

/* JADX INFO: renamed from: miuix.internal.util.y */
/* JADX INFO: compiled from: LiteUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7172y {

    /* JADX INFO: renamed from: k */
    private static Boolean f40399k;

    /* JADX INFO: renamed from: k */
    public static boolean m25998k() {
        if (f40399k == null) {
            f40399k = Boolean.valueOf(C7106k.d2ok() || C7106k.d3() || C7106k.lvui());
        }
        return f40399k.booleanValue();
    }
}
