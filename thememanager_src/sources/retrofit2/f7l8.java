package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.jk;
import okio.C7560j;
import retrofit2.zy;

/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
final class f7l8 extends zy.AbstractC7658k {

    /* JADX INFO: renamed from: k */
    @Nullable
    private final Executor f44134k;

    /* JADX INFO: renamed from: retrofit2.f7l8$k */
    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    class C7634k implements zy<Object, retrofit2.toq<?>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Type f44135k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Executor f94680toq;

        C7634k(Type type, Executor executor) {
            this.f44135k = type;
            this.f94680toq = executor;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: k */
        public Type mo27953k() {
            return this.f44135k;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public retrofit2.toq<Object> toq(retrofit2.toq<Object> toqVar) {
            Executor executor = this.f94680toq;
            return executor == null ? toqVar : new toq(executor, toqVar);
        }
    }

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    static final class toq<T> implements retrofit2.toq<T> {

        /* JADX INFO: renamed from: k */
        final Executor f44136k;

        /* JADX INFO: renamed from: q */
        final retrofit2.toq<T> f44137q;

        /* JADX INFO: renamed from: retrofit2.f7l8$toq$k */
        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        class C7635k implements InterfaceC7648q<T> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC7648q f44138k;

            C7635k(InterfaceC7648q interfaceC7648q) {
                this.f44138k = interfaceC7648q;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: q */
            public /* synthetic */ void m27956q(InterfaceC7648q interfaceC7648q, C7639i c7639i) {
                if (toq.this.f44137q.x2()) {
                    interfaceC7648q.onFailure(toq.this, new IOException("Canceled"));
                } else {
                    interfaceC7648q.onResponse(toq.this, c7639i);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void zy(InterfaceC7648q interfaceC7648q, Throwable th) {
                interfaceC7648q.onFailure(toq.this, th);
            }

            @Override // retrofit2.InterfaceC7648q
            public void onFailure(retrofit2.toq<T> toqVar, final Throwable th) {
                Executor executor = toq.this.f44136k;
                final InterfaceC7648q interfaceC7648q = this.f44138k;
                executor.execute(new Runnable() { // from class: retrofit2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44225k.zy(interfaceC7648q, th);
                    }
                });
            }

            @Override // retrofit2.InterfaceC7648q
            public void onResponse(retrofit2.toq<T> toqVar, final C7639i<T> c7639i) {
                Executor executor = toq.this.f44136k;
                final InterfaceC7648q interfaceC7648q = this.f44138k;
                executor.execute(new Runnable() { // from class: retrofit2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44246k.m27956q(interfaceC7648q, c7639i);
                    }
                });
            }
        }

        toq(Executor executor, retrofit2.toq<T> toqVar) {
            this.f44136k = executor;
            this.f44137q = toqVar;
        }

        @Override // retrofit2.toq
        public void cancel() {
            this.f44137q.cancel();
        }

        @Override // retrofit2.toq
        public C7639i<T> f7l8() throws IOException {
            return this.f44137q.f7l8();
        }

        @Override // retrofit2.toq
        public boolean ld6() {
            return this.f44137q.ld6();
        }

        @Override // retrofit2.toq
        /* JADX INFO: renamed from: p */
        public void mo27954p(InterfaceC7648q<T> interfaceC7648q) {
            Objects.requireNonNull(interfaceC7648q, "callback == null");
            this.f44137q.mo27954p(new C7635k(interfaceC7648q));
        }

        @Override // retrofit2.toq
        public C7560j toq() {
            return this.f44137q.toq();
        }

        @Override // retrofit2.toq
        public boolean x2() {
            return this.f44137q.x2();
        }

        @Override // retrofit2.toq
        public jk zy() {
            return this.f44137q.zy();
        }

        @Override // retrofit2.toq
        public retrofit2.toq<T> clone() {
            return new toq(this.f44136k, this.f44137q.clone());
        }
    }

    f7l8(@Nullable Executor executor) {
        this.f44134k = executor;
    }

    @Override // retrofit2.zy.AbstractC7658k
    @Nullable
    /* JADX INFO: renamed from: k */
    public zy<?, ?> mo27952k(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
        if (zy.AbstractC7658k.zy(type) != retrofit2.toq.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C7634k(C7657z.f7l8(0, (ParameterizedType) type), C7657z.x2(annotationArr, ni7.class) ? null : this.f44134k);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
