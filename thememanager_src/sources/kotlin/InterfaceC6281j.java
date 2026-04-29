package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kiv.EnumC6118k;
import kiv.InterfaceC6117g;
import kiv.InterfaceC6119n;
import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.j */
/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC6117g(allowedTargets = {kiv.toq.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@InterfaceC6119n(EnumC6118k.BINARY)
@yz(version = "1.3")
public @interface InterfaceC6281j {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kotlin.j$k */
    /* JADX INFO: compiled from: OptIn.kt */
    public static final class k {

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ k[] f36376k;

        /* JADX INFO: renamed from: q */
        private static final /* synthetic */ InterfaceC6225k f36377q;
        public static final k WARNING = new k("WARNING", 0);
        public static final k ERROR = new k("ERROR", 1);

        static {
            k[] qVar = toq();
            f36376k = qVar;
            f36377q = kotlin.enums.toq.toq(qVar);
        }

        private k(String str, int i2) {
        }

        @InterfaceC7396q
        public static InterfaceC6225k<k> getEntries() {
            return f36377q;
        }

        private static final /* synthetic */ k[] toq() {
            return new k[]{WARNING, ERROR};
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) f36376k.clone();
        }
    }

    k level() default k.ERROR;

    String message() default "";
}
