package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: androidx.room.i */
/* JADX INFO: compiled from: Junction.java */
/* JADX INFO: loaded from: classes.dex */
@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1129i {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
