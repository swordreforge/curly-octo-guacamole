package com.google.gson;

import com.google.gson.internal.C4899k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: FieldAttributes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private final Field f27868k;

    public zy(Field field) {
        C4899k.toq(field);
        this.f27868k = field;
    }

    public String f7l8() {
        return this.f27868k.getName();
    }

    /* JADX INFO: renamed from: g */
    public Class<?> m17237g() {
        return this.f27868k.getDeclaringClass();
    }

    /* JADX INFO: renamed from: k */
    Object m17238k(Object obj) throws IllegalAccessException {
        return this.f27868k.get(obj);
    }

    /* JADX INFO: renamed from: n */
    public Type m17239n() {
        return this.f27868k.getGenericType();
    }

    /* JADX INFO: renamed from: q */
    public Class<?> m17240q() {
        return this.f27868k.getType();
    }

    /* JADX INFO: renamed from: s */
    boolean m17241s() {
        return this.f27868k.isSynthetic();
    }

    public <T extends Annotation> T toq(Class<T> cls) {
        return (T) this.f27868k.getAnnotation(cls);
    }

    /* JADX INFO: renamed from: y */
    public boolean m17242y(int i2) {
        return (i2 & this.f27868k.getModifiers()) != 0;
    }

    public Collection<Annotation> zy() {
        return Arrays.asList(this.f27868k.getAnnotations());
    }
}
