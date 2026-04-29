package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.was;
import okhttp3.a9;
import okhttp3.jp0y;
import retrofit2.InterfaceC7637g;

/* JADX INFO: renamed from: retrofit2.k */
/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes4.dex */
final class C7640k extends InterfaceC7637g.k {

    /* JADX INFO: renamed from: k */
    private boolean f44174k = true;

    /* JADX INFO: renamed from: retrofit2.k$g */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class g implements InterfaceC7637g<jp0y, Void> {

        /* JADX INFO: renamed from: k */
        static final g f44175k = new g();

        g() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Void mo27951k(jp0y jp0yVar) {
            jp0yVar.close();
            return null;
        }
    }

    /* JADX INFO: renamed from: retrofit2.k$k */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class k implements InterfaceC7637g<jp0y, jp0y> {

        /* JADX INFO: renamed from: k */
        static final k f44176k = new k();

        k() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public jp0y mo27951k(jp0y jp0yVar) throws IOException {
            try {
                return C7657z.m28022k(jp0yVar);
            } finally {
                jp0yVar.close();
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.k$n */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class n implements InterfaceC7637g<jp0y, was> {

        /* JADX INFO: renamed from: k */
        static final n f44177k = new n();

        n() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public was mo27951k(jp0y jp0yVar) {
            jp0yVar.close();
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: retrofit2.k$q */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class q implements InterfaceC7637g<Object, String> {

        /* JADX INFO: renamed from: k */
        static final q f44178k = new q();

        q() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public String mo27951k(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: retrofit2.k$toq */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class toq implements InterfaceC7637g<a9, a9> {

        /* JADX INFO: renamed from: k */
        static final toq f44179k = new toq();

        toq() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public a9 mo27951k(a9 a9Var) {
            return a9Var;
        }
    }

    /* JADX INFO: renamed from: retrofit2.k$zy */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    static final class zy implements InterfaceC7637g<jp0y, jp0y> {

        /* JADX INFO: renamed from: k */
        static final zy f44180k = new zy();

        zy() {
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public jp0y mo27951k(jp0y jp0yVar) {
            return jp0yVar;
        }
    }

    C7640k() {
    }

    @Override // retrofit2.InterfaceC7637g.k
    @Nullable
    /* JADX INFO: renamed from: q */
    public InterfaceC7637g<jp0y, ?> mo27950q(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
        if (type == jp0y.class) {
            return C7657z.x2(annotationArr, f7z0.ni7.class) ? zy.f44180k : k.f44176k;
        }
        if (type == Void.class) {
            return g.f44175k;
        }
        if (!this.f44174k || type != was.class) {
            return null;
        }
        try {
            return n.f44177k;
        } catch (NoClassDefFoundError unused) {
            this.f44174k = false;
            return null;
        }
    }

    @Override // retrofit2.InterfaceC7637g.k
    @Nullable
    public InterfaceC7637g<?, a9> zy(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, fn3e fn3eVar) {
        if (a9.class.isAssignableFrom(C7657z.m28027y(type))) {
            return toq.f44179k;
        }
        return null;
    }
}
