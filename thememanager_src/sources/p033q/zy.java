package p033q;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import kiv.toq;
import kotlin.d3;
import kotlin.hb;
import kotlin.ld6;

/* JADX INFO: compiled from: UseExperimental.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@InterfaceC6117g(allowedTargets = {toq.CLASS, toq.PROPERTY, toq.LOCAL_VARIABLE, toq.VALUE_PARAMETER, toq.CONSTRUCTOR, toq.FUNCTION, toq.PROPERTY_GETTER, toq.PROPERTY_SETTER, toq.FILE, toq.TYPEALIAS})
@d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R!\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq/zy;", "", "", "Lkotlin/reflect/q;", "markerClass", "()[Ljava/lang/Class;", "annotation-experimental_release"}, m22787k = 1, mv = {1, 4, 2})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@ld6(message = "This annotation has been replaced by `@OptIn`", replaceWith = @hb(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
public @interface zy {
    Class<? extends Annotation>[] markerClass();
}
