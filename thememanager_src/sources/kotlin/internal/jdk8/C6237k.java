package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.internal.jdk7.C6236k;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.random.AbstractC6332g;
import kotlin.ranges.x2;
import kotlin.text.qrj;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import wt.C7734k;

/* JADX INFO: renamed from: kotlin.internal.jdk8.k */
/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6237k extends C6236k {

    /* JADX INFO: renamed from: kotlin.internal.jdk8.k$k */
    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    @lv5({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    private static final class k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final k f36292k = new k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public static final Integer f81789toq;

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
            f81789toq = num;
        }

        private k() {
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m22871n(int i2) {
        Integer num = k.f81789toq;
        return num == null || num.intValue() >= i2;
    }

    @Override // kotlin.internal.x2
    @InterfaceC7396q
    public AbstractC6332g toq() {
        return m22871n(34) ? new C7734k() : super.toq();
    }

    @Override // kotlin.internal.x2
    @InterfaceC7395n
    public qrj zy(@InterfaceC7396q MatchResult matchResult, @InterfaceC7396q String name) {
        d2ok.m23075h(matchResult, "matchResult");
        d2ok.m23075h(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        x2 x2Var = new x2(matcher.start(name), matcher.end(name) - 1);
        if (x2Var.mo2951k().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(name);
        d2ok.kja0(strGroup, "matcher.group(name)");
        return new qrj(strGroup, x2Var);
    }
}
