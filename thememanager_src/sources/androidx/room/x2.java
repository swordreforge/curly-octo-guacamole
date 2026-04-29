package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.hyr;

/* JADX INFO: compiled from: Fts3.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@hyr(16)
@Retention(RetentionPolicy.CLASS)
public @interface x2 {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
