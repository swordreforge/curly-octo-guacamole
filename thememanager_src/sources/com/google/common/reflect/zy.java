package com.google.common.reflect;

import com.google.common.base.jk;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Element.java */
/* JADX INFO: loaded from: classes2.dex */
class zy extends AccessibleObject implements Member {

    /* JADX INFO: renamed from: k */
    private final AccessibleObject f27358k;

    /* JADX INFO: renamed from: q */
    private final Member f27359q;

    <M extends AccessibleObject & Member> zy(M m2) {
        jk.a9(m2);
        this.f27358k = m2;
        this.f27359q = m2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof zy)) {
            return false;
        }
        zy zyVar = (zy) obj;
        return mo16796k().equals(zyVar.mo16796k()) && this.f27359q.equals(zyVar.f27359q);
    }

    public final boolean f7l8() {
        return Modifier.isProtected(getModifiers());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m16847g() {
        return Modifier.isPrivate(getModifiers());
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f27358k.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f27358k.getAnnotations();
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f27358k.getDeclaredAnnotations();
    }

    public Class<?> getDeclaringClass() {
        return this.f27359q.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f27359q.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f27359q.getName();
    }

    public int hashCode() {
        return this.f27359q.hashCode();
    }

    @Override // java.lang.reflect.AccessibleObject
    public final boolean isAccessible() {
        return this.f27358k.isAccessible();
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f27358k.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f27359q.isSynthetic();
    }

    /* JADX INFO: renamed from: k */
    public qrj<?> mo16796k() {
        return qrj.of((Class) getDeclaringClass());
    }

    final boolean ld6() {
        return Modifier.isTransient(getModifiers());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m16848n() {
        return (m16847g() || m16852y() || f7l8()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16849p() {
        return Modifier.isSynchronized(getModifiers());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16850q() {
        return Modifier.isNative(getModifiers());
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16851s() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z2) throws SecurityException {
        this.f27358k.setAccessible(z2);
    }

    public String toString() {
        return this.f27359q.toString();
    }

    public final boolean toq() {
        return Modifier.isAbstract(getModifiers());
    }

    final boolean x2() {
        return Modifier.isVolatile(getModifiers());
    }

    /* JADX INFO: renamed from: y */
    public final boolean m16852y() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean zy() {
        return Modifier.isFinal(getModifiers());
    }
}
