package okhttp3;

import java.io.IOException;
import mub.InterfaceC7396q;
import okio.C7560j;

/* JADX INFO: renamed from: okhttp3.n */
/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7519n extends Cloneable {

    /* JADX INFO: renamed from: okhttp3.n$k */
    /* JADX INFO: compiled from: Call.kt */
    public interface k {
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        InterfaceC7519n mo27367k(@InterfaceC7396q jk jkVar);
    }

    void cancel();

    @InterfaceC7396q
    /* JADX INFO: renamed from: clone */
    InterfaceC7519n mo28303clone();

    @InterfaceC7396q
    fti f7l8() throws IOException;

    /* JADX INFO: renamed from: h */
    void mo27031h(@InterfaceC7396q InterfaceC7435g interfaceC7435g);

    boolean ld6();

    @InterfaceC7396q
    C7560j toq();

    boolean x2();

    @InterfaceC7396q
    jk zy();
}
