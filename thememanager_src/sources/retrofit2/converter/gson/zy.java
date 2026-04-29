package retrofit2.converter.gson;

import com.google.gson.C4871g;
import com.google.gson.fu4;
import com.google.gson.qrj;
import com.google.gson.stream.C4924k;
import java.io.IOException;
import okhttp3.jp0y;
import retrofit2.InterfaceC7637g;

/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes4.dex */
final class zy<T> implements InterfaceC7637g<jp0y, T> {

    /* JADX INFO: renamed from: k */
    private final C4871g f44133k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fu4<T> f94679toq;

    zy(C4871g c4871g, fu4<T> fu4Var) {
        this.f44133k = c4871g;
        this.f94679toq = fu4Var;
    }

    @Override // retrofit2.InterfaceC7637g
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public T mo27951k(jp0y jp0yVar) throws IOException {
        C4924k c4924kZurt = this.f44133k.zurt(jp0yVar.m27329y());
        try {
            T tMo7087n = this.f94679toq.mo7087n(c4924kZurt);
            if (c4924kZurt.g1() == com.google.gson.stream.zy.END_DOCUMENT) {
                return tMo7087n;
            }
            throw new qrj("JSON document was not fully consumed.");
        } finally {
            jp0yVar.close();
        }
    }
}
