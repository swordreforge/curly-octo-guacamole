package com.google.common.util.concurrent;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.google.common.util.concurrent.o */
/* JADX INFO: compiled from: Partially.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
final class C4833o {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.o$k */
    /* JADX INFO: compiled from: Partially.java */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    @interface k {
        String value();
    }

    private C4833o() {
    }
}
