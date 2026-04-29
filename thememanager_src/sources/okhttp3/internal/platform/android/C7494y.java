package okhttp3.internal.platform.android;

import com.google.android.exoplayer2.text.ttml.C3678q;
import java.lang.reflect.Method;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.y */
/* JADX INFO: compiled from: CloseGuard.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7494y {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f43355q = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Method f43356k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final Method f93997toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final Method f93998zy;

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.y$k */
    /* JADX INFO: compiled from: CloseGuard.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7494y m27226k() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod(C3678q.f65822ikck, String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C7494y(method3, method2, method);
        }
    }

    public C7494y(@InterfaceC7395n Method method, @InterfaceC7395n Method method2, @InterfaceC7395n Method method3) {
        this.f43356k = method;
        this.f93997toq = method2;
        this.f93998zy = method3;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m27225k(@InterfaceC7396q String closer) {
        d2ok.m23075h(closer, "closer");
        Method method = this.f43356k;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f93997toq;
                d2ok.qrj(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean toq(@InterfaceC7395n Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f93998zy;
            d2ok.qrj(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
