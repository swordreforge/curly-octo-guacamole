package com.google.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.base.z */
/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4280z extends qrj {
    private C4280z() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15455k(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int toq(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
