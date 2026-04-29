package zy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: InspectableProperty.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Deprecated
@Retention(RetentionPolicy.SOURCE)
public @interface mcp {

    /* JADX INFO: renamed from: zy.mcp$k */
    /* JADX INFO: compiled from: InspectableProperty.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7836k {
        String name();

        int value();
    }

    /* JADX INFO: compiled from: InspectableProperty.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX INFO: compiled from: InspectableProperty.java */
    public enum zy {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    InterfaceC7836k[] enumMapping() default {};

    toq[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    zy valueType() default zy.INFERRED;
}
