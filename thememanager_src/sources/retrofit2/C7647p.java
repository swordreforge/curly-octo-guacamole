package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: retrofit2.p */
/* JADX INFO: compiled from: HttpException.java */
/* JADX INFO: loaded from: classes4.dex */
public class C7647p extends RuntimeException {
    private final int code;

    /* JADX INFO: renamed from: k */
    private final transient C7639i<?> f44219k;
    private final String message;

    public C7647p(C7639i<?> c7639i) {
        super(m28006k(c7639i));
        this.code = c7639i.toq();
        this.message = c7639i.m27989y();
        this.f44219k = c7639i;
    }

    /* JADX INFO: renamed from: k */
    private static String m28006k(C7639i<?> c7639i) {
        Objects.requireNonNull(c7639i, "response == null");
        return "HTTP " + c7639i.toq() + " " + c7639i.m27989y();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public C7639i<?> response() {
        return this.f44219k;
    }
}
