package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ni7 {

    @InterfaceC7396q
    public static final toq jb = toq.f43499k;

    /* JADX INFO: renamed from: okhttp3.ni7$k */
    /* JADX INFO: compiled from: Interceptor.kt */
    public interface InterfaceC7521k {
        @InterfaceC7396q
        InterfaceC7519n call();

        @InterfaceC7395n
        InterfaceC7525p f7l8();

        /* JADX INFO: renamed from: g */
        int mo27066g();

        /* JADX INFO: renamed from: k */
        int mo27068k();

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        InterfaceC7521k mo27069n(int i2, @InterfaceC7396q TimeUnit timeUnit);

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        fti mo27071q(@InterfaceC7396q jk jkVar) throws IOException;

        /* JADX INFO: renamed from: s */
        int mo27072s();

        @InterfaceC7396q
        InterfaceC7521k toq(int i2, @InterfaceC7396q TimeUnit timeUnit);

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        InterfaceC7521k mo27073y(int i2, @InterfaceC7396q TimeUnit timeUnit);

        @InterfaceC7396q
        jk zy();
    }

    /* JADX INFO: compiled from: Interceptor.kt */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ toq f43499k = new toq();

        /* JADX INFO: renamed from: okhttp3.ni7$toq$k */
        /* JADX INFO: compiled from: Interceptor.kt */
        @lv5({"SMAP\nInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interceptor.kt\nokhttp3/Interceptor$Companion$invoke$1\n*L\n1#1,105:1\n*E\n"})
        public static final class C7522k implements ni7 {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cyoe.x2<InterfaceC7521k, fti> f43500k;

            /* JADX WARN: Multi-variable type inference failed */
            public C7522k(cyoe.x2<? super InterfaceC7521k, fti> x2Var) {
                this.f43500k = x2Var;
            }

            @Override // okhttp3.ni7
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final fti mo6886k(@InterfaceC7396q InterfaceC7521k it) {
                d2ok.m23075h(it, "it");
                return this.f43500k.invoke(it);
            }
        }

        private toq() {
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ni7 m27369k(@InterfaceC7396q cyoe.x2<? super InterfaceC7521k, fti> block) {
            d2ok.m23075h(block, "block");
            return new C7522k(block);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    fti mo6886k(@InterfaceC7396q InterfaceC7521k interfaceC7521k) throws IOException;
}
