package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.zy;

/* JADX INFO: renamed from: retrofit2.n */
/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
@IgnoreJRERequirement
final class C7644n extends zy.AbstractC7658k {

    /* JADX INFO: renamed from: k */
    static final zy.AbstractC7658k f44195k = new C7644n();

    /* JADX INFO: renamed from: retrofit2.n$k */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class k<R> implements retrofit2.zy<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: k */
        private final Type f44196k;

        /* JADX INFO: renamed from: retrofit2.n$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        private class C8135k implements InterfaceC7648q<R> {

            /* JADX INFO: renamed from: k */
            private final CompletableFuture<R> f44197k;

            public C8135k(CompletableFuture<R> completableFuture) {
                this.f44197k = completableFuture;
            }

            @Override // retrofit2.InterfaceC7648q
            public void onFailure(retrofit2.toq<R> toqVar, Throwable th) {
                this.f44197k.completeExceptionally(th);
            }

            @Override // retrofit2.InterfaceC7648q
            public void onResponse(retrofit2.toq<R> toqVar, C7639i<R> c7639i) {
                if (c7639i.f7l8()) {
                    this.f44197k.complete(c7639i.m27986k());
                } else {
                    this.f44197k.completeExceptionally(new C7647p(c7639i));
                }
            }
        }

        k(Type type) {
            this.f44196k = type;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: k */
        public Type mo27953k() {
            return this.f44196k;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> toq(retrofit2.toq<R> toqVar) {
            toq toqVar2 = new toq(toqVar);
            toqVar.mo27954p(new C8135k(toqVar2));
            return toqVar2;
        }
    }

    /* JADX INFO: renamed from: retrofit2.n$toq */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class toq<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: k */
        private final retrofit2.toq<?> f44199k;

        toq(retrofit2.toq<?> toqVar) {
            this.f44199k = toqVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            if (z2) {
                this.f44199k.cancel();
            }
            return super.cancel(z2);
        }
    }

    /* JADX INFO: renamed from: retrofit2.n$zy */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class zy<R> implements retrofit2.zy<R, CompletableFuture<C7639i<R>>> {

        /* JADX INFO: renamed from: k */
        private final Type f44200k;

        /* JADX INFO: renamed from: retrofit2.n$zy$k */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        private class k implements InterfaceC7648q<R> {

            /* JADX INFO: renamed from: k */
            private final CompletableFuture<C7639i<R>> f44201k;

            public k(CompletableFuture<C7639i<R>> completableFuture) {
                this.f44201k = completableFuture;
            }

            @Override // retrofit2.InterfaceC7648q
            public void onFailure(retrofit2.toq<R> toqVar, Throwable th) {
                this.f44201k.completeExceptionally(th);
            }

            @Override // retrofit2.InterfaceC7648q
            public void onResponse(retrofit2.toq<R> toqVar, C7639i<R> c7639i) {
                this.f44201k.complete(c7639i);
            }
        }

        zy(Type type) {
            this.f44200k = type;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: k */
        public Type mo27953k() {
            return this.f44200k;
        }

        @Override // retrofit2.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<C7639i<R>> toq(retrofit2.toq<R> toqVar) {
            toq toqVar2 = new toq(toqVar);
            toqVar.mo27954p(new k(toqVar2));
            return toqVar2;
        }
    }

    C7644n() {
    }

    @Override // retrofit2.zy.AbstractC7658k
    @Nullable
    /* JADX INFO: renamed from: k */
    public retrofit2.zy<?, ?> mo27952k(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
        if (zy.AbstractC7658k.zy(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type qVar = zy.AbstractC7658k.toq(0, (ParameterizedType) type);
        if (zy.AbstractC7658k.zy(qVar) != C7639i.class) {
            return new k(qVar);
        }
        if (qVar instanceof ParameterizedType) {
            return new zy(zy.AbstractC7658k.toq(0, (ParameterizedType) qVar));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
