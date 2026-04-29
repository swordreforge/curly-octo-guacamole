package androidx.recyclerview.widget;

import androidx.recyclerview.widget.ld6;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import zy.uv6;

/* JADX INFO: compiled from: AsyncDifferConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy<T> {

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final Executor f6125k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    private final Executor f52327toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    private final ld6.AbstractC1092g<T> f52328zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.zy$k */
    /* JADX INFO: compiled from: AsyncDifferConfig.java */
    public static final class C1118k<T> {

        /* JADX INFO: renamed from: n */
        private static Executor f6126n;

        /* JADX INFO: renamed from: q */
        private static final Object f6127q = new Object();

        /* JADX INFO: renamed from: k */
        @zy.dd
        private Executor f6128k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Executor f52329toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ld6.AbstractC1092g<T> f52330zy;

        public C1118k(@zy.lvui ld6.AbstractC1092g<T> abstractC1092g) {
            this.f52330zy = abstractC1092g;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public zy<T> m5139k() {
            if (this.f52329toq == null) {
                synchronized (f6127q) {
                    if (f6126n == null) {
                        f6126n = Executors.newFixedThreadPool(2);
                    }
                }
                this.f52329toq = f6126n;
            }
            return new zy<>(this.f6128k, this.f52329toq, this.f52330zy);
        }

        @zy.lvui
        public C1118k<T> toq(Executor executor) {
            this.f52329toq = executor;
            return this;
        }

        @zy.lvui
        @uv6({uv6.EnumC7844k.LIBRARY})
        public C1118k<T> zy(Executor executor) {
            this.f6128k = executor;
            return this;
        }
    }

    zy(@zy.dd Executor executor, @zy.lvui Executor executor2, @zy.lvui ld6.AbstractC1092g<T> abstractC1092g) {
        this.f6125k = executor;
        this.f52327toq = executor2;
        this.f52328zy = abstractC1092g;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Executor m5138k() {
        return this.f52327toq;
    }

    @zy.lvui
    public ld6.AbstractC1092g<T> toq() {
        return this.f52328zy;
    }

    @zy.dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    public Executor zy() {
        return this.f6125k;
    }
}
