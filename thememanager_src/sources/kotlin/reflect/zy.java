package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KCallable.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface zy<R> extends toq {

    /* JADX INFO: renamed from: kotlin.reflect.zy$k */
    /* JADX INFO: compiled from: KCallable.kt */
    public static final class C6382k {
        @yz(version = "1.3")
        public static /* synthetic */ void f7l8() {
        }

        @yz(version = "1.1")
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m23413g() {
        }

        @kotlin.internal.f7l8
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m23414k() {
        }

        @yz(version = "1.1")
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m23415n() {
        }

        @yz(version = "1.1")
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m23416q() {
        }

        @yz(version = "1.1")
        public static /* synthetic */ void toq() {
        }

        @yz(version = "1.1")
        public static /* synthetic */ void zy() {
        }
    }

    R call(@InterfaceC7396q Object... objArr);

    R callBy(@InterfaceC7396q Map<n7h, ? extends Object> map);

    @InterfaceC7396q
    String getName();

    @InterfaceC7396q
    List<n7h> getParameters();

    @InterfaceC7396q
    t8r getReturnType();

    @InterfaceC7396q
    List<InterfaceC6365i> getTypeParameters();

    @InterfaceC7395n
    ni7 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
