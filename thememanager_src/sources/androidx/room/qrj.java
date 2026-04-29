package androidx.room;

import androidx.room.n7h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.hyr;

/* JADX INFO: compiled from: Fts4.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@hyr(16)
@Retention(RetentionPolicy.CLASS)
public @interface qrj {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    n7h.EnumC1135k matchInfo() default n7h.EnumC1135k.FTS4;

    String[] notIndexed() default {};

    n7h.toq order() default n7h.toq.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
