package androidx.versionedparcelable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zy.uv6;

/* JADX INFO: compiled from: ParcelField.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public @interface toq {
    String defaultValue() default "";

    int value();
}
