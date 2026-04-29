package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.jp0y;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.InterfaceC7637g;

/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
@IgnoreJRERequirement
final class kja0 extends InterfaceC7637g.k {

    /* JADX INFO: renamed from: k */
    static final InterfaceC7637g.k f44188k = new kja0();

    /* JADX INFO: renamed from: retrofit2.kja0$k */
    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    static final class C7642k<T> implements InterfaceC7637g<jp0y, Optional<T>> {

        /* JADX INFO: renamed from: k */
        final InterfaceC7637g<jp0y, T> f44189k;

        C7642k(InterfaceC7637g<jp0y, T> interfaceC7637g) {
            this.f44189k = interfaceC7637g;
        }

        @Override // retrofit2.InterfaceC7637g
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Optional<T> mo27951k(jp0y jp0yVar) throws IOException {
            return Optional.ofNullable(this.f44189k.mo27951k(jp0yVar));
        }
    }

    kja0() {
    }

    @Override // retrofit2.InterfaceC7637g.k
    @Nullable
    /* JADX INFO: renamed from: q */
    public InterfaceC7637g<jp0y, ?> mo27950q(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
        if (InterfaceC7637g.k.toq(type) != Optional.class) {
            return null;
        }
        return new C7642k(fn3eVar.n7h(InterfaceC7637g.k.m27973k(0, (ParameterizedType) type), annotationArr));
    }
}
