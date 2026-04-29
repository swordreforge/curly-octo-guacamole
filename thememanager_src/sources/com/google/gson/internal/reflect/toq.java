package com.google.gson.internal.reflect;

import com.google.gson.internal.C4898g;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq {

    /* JADX INFO: renamed from: k */
    private static final toq f27778k;

    static {
        f27778k = C4898g.zy() < 9 ? new C4906k() : new zy();
    }

    /* JADX INFO: renamed from: k */
    public static toq m17184k() {
        return f27778k;
    }

    public abstract void toq(AccessibleObject accessibleObject);
}
