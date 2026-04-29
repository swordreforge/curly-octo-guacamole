package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.s */
/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
final class C6210s {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6210s f36254k = new C6210s();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final k f81784toq = new k(null, null, null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private static k f81785zy;

    /* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.s$k */
    /* JADX INFO: compiled from: DebugMetadata.kt */
    private static final class k {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Method f36255k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Method f81786toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Method f81787zy;

        public k(@InterfaceC7395n Method method, @InterfaceC7395n Method method2, @InterfaceC7395n Method method3) {
            this.f36255k = method;
            this.f81786toq = method2;
            this.f81787zy = method3;
        }
    }

    private C6210s() {
    }

    /* JADX INFO: renamed from: k */
    private final k m22764k(AbstractC6206k abstractC6206k) {
        try {
            k kVar = new k(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC6206k.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC6206k.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f81785zy = kVar;
            return kVar;
        } catch (Exception unused) {
            k kVar2 = f81784toq;
            f81785zy = kVar2;
            return kVar2;
        }
    }

    @InterfaceC7395n
    public final String toq(@InterfaceC7396q AbstractC6206k continuation) {
        d2ok.m23075h(continuation, "continuation");
        k kVarM22764k = f81785zy;
        if (kVarM22764k == null) {
            kVarM22764k = m22764k(continuation);
        }
        if (kVarM22764k == f81784toq) {
            return null;
        }
        Method method = kVarM22764k.f36255k;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = kVarM22764k.f81786toq;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = kVarM22764k.f81787zy;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
