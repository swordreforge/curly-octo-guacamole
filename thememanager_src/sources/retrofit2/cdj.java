package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.InterfaceC7637g;
import retrofit2.zy;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes4.dex */
class cdj {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final cdj f94675zy = m27943g();

    /* JADX INFO: renamed from: k */
    private final boolean f44128k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Nullable
    private final Constructor<MethodHandles.Lookup> f94676toq;

    /* JADX INFO: renamed from: retrofit2.cdj$k */
    /* JADX INFO: compiled from: Platform.java */
    static final class C7631k extends cdj {

        /* JADX INFO: renamed from: retrofit2.cdj$k$k */
        /* JADX INFO: compiled from: Platform.java */
        static final class k implements Executor {

            /* JADX INFO: renamed from: k */
            private final Handler f44129k = new Handler(Looper.getMainLooper());

            k() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f44129k.post(runnable);
            }
        }

        C7631k() {
            super(true);
        }

        @Override // retrofit2.cdj
        @Nullable
        /* JADX INFO: renamed from: y */
        Object mo27948y(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            return super.mo27948y(method, cls, obj, objArr);
        }

        @Override // retrofit2.cdj
        public Executor zy() {
            return new k();
        }
    }

    cdj(boolean z2) {
        this.f44128k = z2;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z2) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f94676toq = declaredConstructor;
    }

    static cdj f7l8() {
        return f94675zy;
    }

    /* JADX INFO: renamed from: g */
    private static cdj m27943g() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new C7631k() : new cdj(true);
    }

    /* JADX INFO: renamed from: k */
    List<? extends zy.AbstractC7658k> m27944k(@Nullable Executor executor) {
        f7l8 f7l8Var = new f7l8(executor);
        return this.f44128k ? Arrays.asList(C7644n.f44195k, f7l8Var) : Collections.singletonList(f7l8Var);
    }

    /* JADX INFO: renamed from: n */
    int m27945n() {
        return this.f44128k ? 1 : 0;
    }

    /* JADX INFO: renamed from: q */
    List<? extends InterfaceC7637g.k> m27946q() {
        return this.f44128k ? Collections.singletonList(kja0.f44188k) : Collections.emptyList();
    }

    @IgnoreJRERequirement
    /* JADX INFO: renamed from: s */
    boolean m27947s(Method method) {
        return this.f44128k && method.isDefault();
    }

    int toq() {
        return this.f44128k ? 2 : 1;
    }

    @Nullable
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: y */
    Object mo27948y(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f94676toq;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @Nullable
    Executor zy() {
        return null;
    }
}
