package kotlin.internal.jdk7;

import java.util.List;
import kotlin.collections.kja0;
import kotlin.internal.x2;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.internal.jdk7.k */
/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6236k extends x2 {

    /* JADX INFO: renamed from: kotlin.internal.jdk7.k$k */
    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    @lv5({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    private static final class k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final k f36291k = new k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public static final Integer f81788toq;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f81788toq = num;
        }

        private k() {
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m22868n(int i2) {
        Integer num = k.f81788toq;
        return num == null || num.intValue() >= i2;
    }

    @Override // kotlin.internal.x2
    /* JADX INFO: renamed from: k */
    public void mo22869k(@InterfaceC7396q Throwable cause, @InterfaceC7396q Throwable exception) {
        d2ok.m23075h(cause, "cause");
        d2ok.m23075h(exception, "exception");
        if (m22868n(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo22869k(cause, exception);
        }
    }

    @Override // kotlin.internal.x2
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public List<Throwable> mo22870q(@InterfaceC7396q Throwable exception) {
        d2ok.m23075h(exception, "exception");
        if (!m22868n(19)) {
            return super.mo22870q(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        d2ok.kja0(suppressed, "exception.suppressed");
        return kja0.m22514i(suppressed);
    }
}
