package retrofit2.converter.gson;

import com.google.gson.C4871g;
import com.google.gson.fu4;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.a9;
import okio.x2;
import retrofit2.InterfaceC7637g;

/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes4.dex */
final class toq<T> implements InterfaceC7637g<T, a9> {

    /* JADX INFO: renamed from: k */
    private final C4871g f44132k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fu4<T> f94678toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final okhttp3.fu4 f94677zy = okhttp3.fu4.m26903y("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: q */
    private static final Charset f44131q = Charset.forName("UTF-8");

    toq(C4871g c4871g, fu4<T> fu4Var) {
        this.f44132k = c4871g;
        this.f94678toq = fu4Var;
    }

    @Override // retrofit2.InterfaceC7637g
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public a9 mo27951k(T t2) throws IOException {
        x2 x2Var = new x2();
        C4926q c4926qNi7 = this.f44132k.ni7(new OutputStreamWriter(x2Var.zwy(), f44131q));
        this.f94678toq.mo7089s(c4926qNi7, t2);
        c4926qNi7.close();
        return a9.f7l8(f94677zy, x2Var.uj2j());
    }
}
