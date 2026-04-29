package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: androidx.room.h */
/* JADX INFO: compiled from: Index.java */
/* JADX INFO: loaded from: classes.dex */
@Target({})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1128h {
    String name() default "";

    boolean unique() default false;

    String[] value();
}
