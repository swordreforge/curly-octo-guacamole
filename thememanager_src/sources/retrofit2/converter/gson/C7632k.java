package retrofit2.converter.gson;

import com.google.gson.C4871g;
import com.google.gson.reflect.C4922k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.a9;
import okhttp3.jp0y;
import retrofit2.InterfaceC7637g;
import retrofit2.fn3e;

/* JADX INFO: renamed from: retrofit2.converter.gson.k */
/* JADX INFO: compiled from: GsonConverterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class C7632k extends InterfaceC7637g.k {

    /* JADX INFO: renamed from: k */
    private final C4871g f44130k;

    private C7632k(C4871g c4871g) {
        this.f44130k = c4871g;
    }

    public static C7632k f7l8(C4871g c4871g) {
        if (c4871g != null) {
            return new C7632k(c4871g);
        }
        throw new NullPointerException("gson == null");
    }

    /* JADX INFO: renamed from: g */
    public static C7632k m27949g() {
        return f7l8(new C4871g());
    }

    @Override // retrofit2.InterfaceC7637g.k
    /* JADX INFO: renamed from: q */
    public InterfaceC7637g<jp0y, ?> mo27950q(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
        return new zy(this.f44130k, this.f44130k.m17097h(C4922k.get(type)));
    }

    @Override // retrofit2.InterfaceC7637g.k
    public InterfaceC7637g<?, a9> zy(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, fn3e fn3eVar) {
        return new toq(this.f44130k, this.f44130k.m17097h(C4922k.get(type)));
    }
}
