package zy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: RequiresPermission.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface lrht {

    /* JADX INFO: renamed from: zy.lrht$k */
    /* JADX INFO: compiled from: RequiresPermission.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface InterfaceC7834k {
        lrht value() default @lrht;
    }

    /* JADX INFO: compiled from: RequiresPermission.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface toq {
        lrht value() default @lrht;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
