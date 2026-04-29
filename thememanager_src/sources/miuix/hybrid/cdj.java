package miuix.hybrid;

import java.io.InputStream;

/* JADX INFO: compiled from: HybridResourceResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private String f40168k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f87687toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InputStream f87688zy;

    public cdj(String mimeType, String encoding, InputStream data) {
        this.f40168k = mimeType;
        this.f87687toq = encoding;
        this.f87688zy = data;
    }

    /* JADX INFO: renamed from: g */
    public void m25771g(String mimeType) {
        this.f40168k = mimeType;
    }

    /* JADX INFO: renamed from: k */
    public InputStream m25772k() {
        return this.f87688zy;
    }

    /* JADX INFO: renamed from: n */
    public void m25773n(String encoding) {
        this.f87687toq = encoding;
    }

    /* JADX INFO: renamed from: q */
    public void m25774q(InputStream data) {
        this.f87688zy = data;
    }

    public String toq() {
        return this.f87687toq;
    }

    public String zy() {
        return this.f40168k;
    }
}
