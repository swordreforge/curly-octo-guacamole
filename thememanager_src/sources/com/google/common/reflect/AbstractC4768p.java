package com.google.common.reflect;

import com.google.common.base.jk;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.p */
/* JADX INFO: compiled from: TypeParameter.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class AbstractC4768p<T> extends AbstractC4778s<T> {

    /* JADX INFO: renamed from: k */
    final TypeVariable<?> f27335k;

    protected AbstractC4768p() {
        Type typeCapture = capture();
        jk.fn3e(typeCapture instanceof TypeVariable, "%s should be a type variable.", typeCapture);
        this.f27335k = (TypeVariable) typeCapture;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof AbstractC4768p) {
            return this.f27335k.equals(((AbstractC4768p) obj).f27335k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27335k.hashCode();
    }

    public String toString() {
        return this.f27335k.toString();
    }
}
