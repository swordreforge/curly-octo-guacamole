package androidx.versionedparcelable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.uv6;

/* JADX INFO: renamed from: androidx.versionedparcelable.s */
/* JADX INFO: compiled from: VersionedParcelize.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public @interface InterfaceC1268s {
    boolean allowSerialization() default false;

    int[] deprecatedIds() default {};

    Class factory() default void.class;

    boolean ignoreParcelables() default false;

    boolean isCustom() default false;

    String jetifyAs() default "";
}
