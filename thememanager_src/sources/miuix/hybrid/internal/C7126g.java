package miuix.hybrid.internal;

import miuix.hybrid.o1t;

/* JADX INFO: renamed from: miuix.hybrid.internal.g */
/* JADX INFO: compiled from: HybridException.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7126g extends Exception {
    private static final long serialVersionUID = 1;
    private o1t mResponse;

    public C7126g() {
        super(new o1t(200).toString());
        this.mResponse = new o1t(200);
    }

    public o1t getResponse() {
        return this.mResponse;
    }

    public C7126g(String detailMessage) {
        super(new o1t(200, detailMessage).toString());
        this.mResponse = new o1t(200, detailMessage);
    }

    public C7126g(int errorCode, String detailMessage) {
        super(new o1t(errorCode, detailMessage).toString());
        this.mResponse = new o1t(errorCode, detailMessage);
    }

    public C7126g(o1t response) {
        super(response.toString());
        this.mResponse = response;
    }
}
