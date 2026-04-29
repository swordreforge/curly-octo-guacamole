package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ni7;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.random.AbstractC6332g;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class x2 {

    /* JADX INFO: renamed from: kotlin.internal.x2$k */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @lv5({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    private static final class C6243k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final C6243k f36294k = new C6243k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public static final Method f81790toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public static final Method f81791zy;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        static {
            /*
                kotlin.internal.x2$k r0 = new kotlin.internal.x2$k
                r0.<init>()
                kotlin.internal.x2.C6243k.f36294k = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.d2ok.kja0(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.d2ok.f7l8(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.d2ok.kja0(r7, r8)
                java.lang.Object r7 = kotlin.collections.x2.l9(r7)
                boolean r7 = kotlin.jvm.internal.d2ok.f7l8(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                kotlin.internal.x2.C6243k.f81790toq = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.d2ok.f7l8(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                kotlin.internal.x2.C6243k.f81791zy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.x2.C6243k.<clinit>():void");
        }

        private C6243k() {
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo22869k(@InterfaceC7396q Throwable cause, @InterfaceC7396q Throwable exception) {
        d2ok.m23075h(cause, "cause");
        d2ok.m23075h(exception, "exception");
        Method method = C6243k.f81790toq;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public List<Throwable> mo22870q(@InterfaceC7396q Throwable exception) {
        Object objInvoke;
        List<Throwable> listM22514i;
        d2ok.m23075h(exception, "exception");
        Method method = C6243k.f81791zy;
        return (method == null || (objInvoke = method.invoke(exception, new Object[0])) == null || (listM22514i = kotlin.collections.kja0.m22514i((Throwable[]) objInvoke)) == null) ? ni7.a9() : listM22514i;
    }

    @InterfaceC7396q
    public AbstractC6332g toq() {
        return new kotlin.random.toq();
    }

    @InterfaceC7395n
    public kotlin.text.qrj zy(@InterfaceC7396q MatchResult matchResult, @InterfaceC7396q String name) {
        d2ok.m23075h(matchResult, "matchResult");
        d2ok.m23075h(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
