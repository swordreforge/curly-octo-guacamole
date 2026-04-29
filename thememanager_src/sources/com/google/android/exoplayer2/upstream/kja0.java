package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface kja0 extends x2 {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.kja0$k */
    /* JADX INFO: compiled from: DataSource.java */
    public interface InterfaceC3804k {
        /* JADX INFO: renamed from: k */
        kja0 mo7265k();
    }

    void close() throws IOException;

    @zy.dd
    Uri getUri();

    /* JADX INFO: renamed from: k */
    long mo7270k(t8r t8rVar) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo7271n(uv6 uv6Var);

    default Map<String, List<String>> toq() {
        return Collections.emptyMap();
    }
}
