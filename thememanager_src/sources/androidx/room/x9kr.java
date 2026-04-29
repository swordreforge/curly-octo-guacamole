package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Update.java */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.CLASS)
public @interface x9kr {
    Class<?> entity() default Object.class;

    @fn3e
    int onConflict() default 3;
}
