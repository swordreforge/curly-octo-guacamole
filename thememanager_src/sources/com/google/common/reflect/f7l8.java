package com.google.common.reflect;

import com.google.common.base.jk;
import com.google.common.collect.AbstractC4308a;
import com.google.common.collect.ab;
import com.google.common.collect.se;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Parameter.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class f7l8 implements AnnotatedElement {

    /* JADX INFO: renamed from: g */
    private final se<Annotation> f27312g;

    /* JADX INFO: renamed from: k */
    private final AbstractC4767n<?, ?> f27313k;

    /* JADX INFO: renamed from: n */
    private final qrj<?> f27314n;

    /* JADX INFO: renamed from: q */
    private final int f27315q;

    f7l8(AbstractC4767n<?, ?> abstractC4767n, int i2, qrj<?> qrjVar, Annotation[] annotationArr) {
        this.f27313k = abstractC4767n;
        this.f27315q = i2;
        this.f27314n = qrjVar;
        this.f27312g = se.copyOf(annotationArr);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        return this.f27315q == f7l8Var.f27315q && this.f27313k.equals(f7l8Var.f27313k);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        jk.a9(cls);
        ab<Annotation> it = this.f27312g.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        jk.a9(cls);
        return (A) AbstractC4308a.t8r(this.f27312g).kja0(cls).m15532h().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        se<Annotation> seVar = this.f27312g;
        return (Annotation[]) seVar.toArray(new Annotation[seVar.size()]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) AbstractC4308a.t8r(this.f27312g).kja0(cls).mcp(cls));
    }

    public int hashCode() {
        return this.f27315q;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC4767n<?, ?> m16760k() {
        return this.f27313k;
    }

    public String toString() {
        return this.f27314n + " arg" + this.f27315q;
    }

    public qrj<?> toq() {
        return this.f27314n;
    }
}
