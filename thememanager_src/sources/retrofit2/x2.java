package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private final Method f44245k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<?> f94746toq;

    x2(Method method, List<?> list) {
        this.f44245k = method;
        this.f94746toq = Collections.unmodifiableList(list);
    }

    public static x2 zy(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new x2(method, new ArrayList(list));
    }

    /* JADX INFO: renamed from: k */
    public List<?> m28018k() {
        return this.f94746toq;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f44245k.getDeclaringClass().getName(), this.f44245k.getName(), this.f94746toq);
    }

    public Method toq() {
        return this.f44245k;
    }
}
