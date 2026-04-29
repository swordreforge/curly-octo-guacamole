package kotlin.reflect;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KParameter.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface n7h extends kotlin.reflect.toq {

    /* JADX INFO: renamed from: kotlin.reflect.n7h$k */
    /* JADX INFO: compiled from: KParameter.kt */
    public static final class C6372k {
        @yz(version = "1.1")
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m23392k() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: KParameter.kt */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ toq[] f36577k;

        /* JADX INFO: renamed from: q */
        private static final /* synthetic */ InterfaceC6225k f36578q;
        public static final toq INSTANCE = new toq("INSTANCE", 0);
        public static final toq EXTENSION_RECEIVER = new toq("EXTENSION_RECEIVER", 1);
        public static final toq VALUE = new toq("VALUE", 2);

        static {
            toq[] qVar = toq();
            f36577k = qVar;
            f36578q = kotlin.enums.toq.toq(qVar);
        }

        private toq(String str, int i2) {
        }

        @InterfaceC7396q
        public static InterfaceC6225k<toq> getEntries() {
            return f36578q;
        }

        private static final /* synthetic */ toq[] toq() {
            return new toq[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
        }

        public static toq valueOf(String str) {
            return (toq) Enum.valueOf(toq.class, str);
        }

        public static toq[] values() {
            return (toq[]) f36577k.clone();
        }
    }

    boolean fu4();

    int getIndex();

    @InterfaceC7395n
    String getName();

    @InterfaceC7396q
    toq n7h();

    boolean o1t();

    @InterfaceC7396q
    t8r toq();
}
