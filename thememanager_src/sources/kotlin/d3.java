package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import l05.InterfaceC6769y;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@InterfaceC6119n(EnumC6118k.RUNTIME)
@yz(version = "1.3")
public @interface d3 {

    /* JADX INFO: renamed from: kotlin.d3$k */
    /* JADX INFO: compiled from: Metadata.kt */
    public static final class C6221k {
        @ld6(level = qrj.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m22788k() {
        }

        @yz(version = "1.2")
        public static /* synthetic */ void toq() {
        }

        @yz(version = "1.1")
        public static /* synthetic */ void zy() {
        }
    }

    @InterfaceC6769y(name = "bv")
    int[] bv() default {1, 0, 3};

    @InterfaceC6769y(name = "d1")
    String[] d1() default {};

    @InterfaceC6769y(name = "d2")
    String[] d2() default {};

    @InterfaceC6769y(name = "k")
    /* JADX INFO: renamed from: k */
    int m22787k() default 1;

    @InterfaceC6769y(name = "mv")
    int[] mv() default {};

    @InterfaceC6769y(name = "pn")
    String pn() default "";

    @InterfaceC6769y(name = "xi")
    int xi() default 0;

    @InterfaceC6769y(name = "xs")
    String xs() default "";
}
