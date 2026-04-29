package kotlin.reflect;

import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface kja0<V> extends kotlin.reflect.zy<V> {

    /* JADX INFO: renamed from: kotlin.reflect.kja0$k */
    /* JADX INFO: compiled from: KProperty.kt */
    public interface InterfaceC6368k<V> {
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        kja0<V> m23387k();
    }

    /* JADX INFO: compiled from: KProperty.kt */
    public static final class toq {
        @yz(version = "1.1")
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m23388k() {
        }

        @yz(version = "1.1")
        public static /* synthetic */ void toq() {
        }
    }

    /* JADX INFO: compiled from: KProperty.kt */
    public interface zy<V> extends InterfaceC6368k<V>, InterfaceC6376s<V> {
    }

    @InterfaceC7396q
    zy<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
