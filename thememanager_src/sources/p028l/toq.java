package p028l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.lvui;

/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface toq {

    /* JADX INFO: renamed from: l.toq$k */
    /* JADX INFO: compiled from: Attribute.java */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6760k {
        int mask() default 0;

        @lvui
        String name();

        int value();
    }

    @lvui
    InterfaceC6760k[] intMapping() default {};

    @lvui
    String value();
}
