package com.bumptech.glide.annotation.ksp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.bumptech.glide.annotation.ksp.k */
/* JADX INFO: compiled from: Index.java */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@interface InterfaceC2967k {
    String[] modules() default {};
}
